package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface DataSource extends DataReader {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {
        @UnstableApi
        DataSource createDataSource();
    }

    @UnstableApi
    void addTransferListener(TransferListener transferListener);

    @UnstableApi
    void close() throws IOException;

    @UnstableApi
    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Nullable
    @UnstableApi
    Uri getUri();

    @UnstableApi
    long open(DataSpec dataSpec) throws IOException;
}
