package android.support.v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes.dex */
public class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public static void a(Object obj) {
            ((MediaController.TransportControls) obj).prepare();
        }

        public static void b(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromMediaId(str, bundle);
        }

        public static void c(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromSearch(str, bundle);
        }

        public static void d(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromUri(uri, bundle);
        }
    }
}
