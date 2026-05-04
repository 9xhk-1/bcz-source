package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import en.r;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ContentDataSource extends BaseDataSource {

    @Nullable
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;

    @Nullable
    private FileInputStream inputStream;
    private boolean opened;
    private final ContentResolver resolver;

    @Nullable
    private Uri uri;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(@Nullable IOException iOException, int i11) {
            super(iOException, i11);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.resolver = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws ContentDataSourceException {
        this.uri = null;
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new ContentDataSourceException(e11, 2000);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (IOException e12) {
                throw new ContentDataSourceException(e12, 2000);
            }
        } catch (Throwable th2) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e13) {
                    throw new ContentDataSourceException(e13, 2000);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws ContentDataSourceException {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = dataSpec.uri.normalizeScheme();
            this.uri = normalizeScheme;
            transferInitializing(dataSpec);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.resolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.resolver.openAssetFileDescriptor(normalizeScheme, r.f50027a);
            }
            this.assetFileDescriptor = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.inputStream = fileInputStream;
            if (length != -1 && dataSpec.position > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (skip != dataSpec.position) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long position = size - channel.position();
                    this.bytesRemaining = position;
                    if (position < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j11 = length - skip;
                this.bytesRemaining = j11;
                if (j11 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j12 = dataSpec.length;
            if (j12 != -1) {
                long j13 = this.bytesRemaining;
                if (j13 != -1) {
                    j12 = Math.min(j13, j12);
                }
                this.bytesRemaining = j12;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j14 = dataSpec.length;
            return j14 != -1 ? j14 : this.bytesRemaining;
        } catch (ContentDataSourceException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new ContentDataSourceException(e12, e12 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws ContentDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesRemaining;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11, 2000);
            }
        }
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
    }
}
