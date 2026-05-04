package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3159a = "MediaSessionCompatApi21";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();

        boolean b(Intent intent);

        void d(Object obj, Bundle bundle);

        void e(String str, Bundle bundle);

        void h();

        void i(Object obj);

        void j();

        void k();

        void l(String str, Bundle bundle, ResultReceiver resultReceiver);

        void n();

        void o(String str, Bundle bundle);

        void onPause();

        void onStop();

        void p(long j11);

        void r(String str, Bundle bundle);

        void s(long j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T extends a> extends MediaSession.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final T f3160a;

        public b(T t11) {
            this.f3160a = t11;
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.b(bundle);
            this.f3160a.l(str, bundle, resultReceiver);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f3160a.e(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onFastForward() {
            this.f3160a.j();
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            return this.f3160a.b(intent) || super.onMediaButtonEvent(intent);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            this.f3160a.onPause();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            this.f3160a.a();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f3160a.r(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f3160a.o(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onRewind() {
            this.f3160a.h();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j11) {
            this.f3160a.s(j11);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetRating(Rating rating) {
            this.f3160a.i(rating);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            this.f3160a.k();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            this.f3160a.n();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j11) {
            this.f3160a.p(j11);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            this.f3160a.onStop();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {
        public static Object a(Object obj, long j11) {
            return new MediaSession.QueueItem((MediaDescription) obj, j11);
        }

        public static Object b(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long c(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static Object b(Context context, String str) {
        return new MediaSession(context, str);
    }

    public static Parcelable c(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    public static boolean d(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField.get(obj) != null;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.w(f3159a, "Failed to get mCallback object.");
        }
        return false;
    }

    public static boolean e(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    public static void f(Object obj) {
        ((MediaSession) obj).release();
    }

    public static void g(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    public static void h(Object obj, boolean z11) {
        ((MediaSession) obj).setActive(z11);
    }

    public static void i(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    public static void j(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    public static void k(Object obj, int i11) {
        ((MediaSession) obj).setFlags(i11);
    }

    public static void l(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    public static void m(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    public static void n(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    public static void o(Object obj, int i11) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i11);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    public static void p(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    public static void q(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    public static void r(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    public static void s(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    public static Object t(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    public static Object u(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
