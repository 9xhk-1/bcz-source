package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.q8;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = q8.p();
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;

    @Nullable
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;

    @Nullable
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j11, long j12) {
        super(false);
        this.fileDescriptor = (FileDescriptor) Assertions.checkNotNull(fileDescriptor);
        this.offset = j11;
        this.length = j12;
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j11) throws DataSourceException {
        try {
            Os.lseek(fileDescriptor, j11, OsConstants.SEEK_SET);
        } catch (ErrnoException e11) {
            throw new DataSourceException(e11, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws DataSourceException {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e11) {
                throw new DataSourceException(e11, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j11 = this.length;
            if (j11 != -1 && dataSpec.position > j11) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j12 = this.length;
            if (j12 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long position = size - channel.position();
                    this.bytesRemaining = position;
                    if (position < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                long j13 = j12 - dataSpec.position;
                this.bytesRemaining = j13;
                if (j13 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long j14 = dataSpec.length;
            if (j14 != -1) {
                long j15 = this.bytesRemaining;
                if (j15 != -1) {
                    j14 = Math.min(j15, j14);
                }
                this.bytesRemaining = j14;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j16 = dataSpec.length;
            return j16 != -1 ? j16 : this.bytesRemaining;
        } catch (DataSourceException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new DataSourceException(e12, e12 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws DataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesRemaining;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            i12 = (int) Math.min(j11, i12);
        }
        try {
            int read = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i11, i12);
            if (read == -1) {
                return -1;
            }
            long j12 = this.bytesRemaining;
            if (j12 != -1) {
                this.bytesRemaining = j12 - read;
            }
            bytesTransferred(read);
            return read;
        } catch (IOException e11) {
            throw new DataSourceException(e11, 2000);
        }
    }
}
