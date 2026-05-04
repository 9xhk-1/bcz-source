package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ExternalLoader {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LoadRequest {
        public final Uri uri;

        public LoadRequest(Uri uri) {
            this.uri = uri;
        }
    }

    p1<?> load(LoadRequest loadRequest);
}
