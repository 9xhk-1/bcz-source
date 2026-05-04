package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.i;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3161a = "MediaSessionCompatApi24";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a extends i.a {
        void c();

        void f(String str, Bundle bundle);

        void m(String str, Bundle bundle);

        void q(Uri uri, Bundle bundle);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T extends a> extends i.b<T> {
        public b(T t11) {
            super(t11);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            ((a) this.f3160a).c();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f3160a).m(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f3160a).f(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f3160a).q(uri, bundle);
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static String b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            Log.e(f3161a, "Cannot execute MediaSession.getCallingPackage()", e11);
            return null;
        }
    }
}
