package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2875a = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: android.support.v4.media.a$a, reason: collision with other inner class name */
    public interface InterfaceC0027a {
        void b();

        void c();

        void onConnected();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T extends InterfaceC0027a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final T f2876a;

        public b(T t11) {
            this.f2876a = t11;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f2876a.onConnected();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f2876a.c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f2876a.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {
        public static Object a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        public static int b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(@NonNull String str, List<?> list);

        void onError(@NonNull String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<T extends d> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final T f2877a;

        public e(T t11) {
            this.f2877a = t11;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
            this.f2877a.a(str, list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(@NonNull String str) {
            this.f2877a.onError(str);
        }
    }

    public static void a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static Object b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object c(InterfaceC0027a interfaceC0027a) {
        return new b(interfaceC0027a);
    }

    public static Object d(d dVar) {
        return new e(dVar);
    }

    public static void e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static String g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    public static ComponentName h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    public static Object i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static boolean j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    public static void k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
