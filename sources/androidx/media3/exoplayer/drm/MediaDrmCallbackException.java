package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j11, Throwable th2) {
        super(th2);
        this.dataSpec = dataSpec;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j11;
    }
}
