package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;

    @Nullable
    private byte[] data;
    private boolean opened;
    private int readPosition;

    @Nullable
    private Uri uri;
    private final UriResolver uriResolver;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface UriResolver {
        byte[] resolve(Uri uri) throws IOException;
    }

    public ByteArrayDataSource(final byte[] bArr) {
        this(new UriResolver() { // from class: androidx.media3.datasource.a
            @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
            public final byte[] resolve(Uri uri) {
                return ByteArrayDataSource.b(bArr, uri);
            }
        });
        Assertions.checkArgument(bArr.length > 0);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        Uri uri = dataSpec.uri;
        this.uri = uri;
        byte[] resolve = this.uriResolver.resolve(uri);
        this.data = resolve;
        long j11 = dataSpec.position;
        if (j11 > resolve.length) {
            throw new DataSourceException(2008);
        }
        this.readPosition = (int) j11;
        int length = resolve.length - ((int) j11);
        this.bytesRemaining = length;
        long j12 = dataSpec.length;
        if (j12 != -1) {
            this.bytesRemaining = (int) Math.min(length, j12);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j13 = dataSpec.length;
        return j13 != -1 ? j13 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.bytesRemaining;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        System.arraycopy(Assertions.checkStateNotNull(this.data), this.readPosition, bArr, i11, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    public ByteArrayDataSource(UriResolver uriResolver) {
        super(false);
        this.uriResolver = (UriResolver) Assertions.checkNotNull(uriResolver);
    }

    public static /* synthetic */ byte[] b(byte[] bArr, Uri uri) {
        return bArr;
    }
}
