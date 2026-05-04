package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource INSTANCE = new PlaceholderDataSource();
    public static final DataSource.Factory FACTORY = new DataSource.Factory() { // from class: androidx.media3.datasource.i0
        @Override // androidx.media3.datasource.DataSource.Factory
        public final DataSource createDataSource() {
            return PlaceholderDataSource.b();
        }
    };

    private PlaceholderDataSource() {
    }

    public static /* synthetic */ PlaceholderDataSource b() {
        return new PlaceholderDataSource();
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }
}
