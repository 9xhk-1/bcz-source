package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.g;
import android.support.v4.media.session.i;
import android.support.v4.media.session.j;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.MediaSessionManager;
import androidx.media.VolumeProviderCompat;
import androidx.media.session.MediaButtonReceiver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class MediaSessionCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_URI";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_RATING";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String H = "android.support.v4.media.session.TOKEN";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String I = "android.support.v4.media.session.EXTRA_BINDER";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String J = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
    public static final int K = 320;
    public static final String L = "data_calling_pkg";
    public static final String M = "data_calling_pid";
    public static final String N = "data_calling_uid";
    public static final String O = "data_extras";
    public static int P = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final String f2929d = "MediaSessionCompat";

    /* renamed from: e, reason: collision with root package name */
    public static final int f2930e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2931f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2932g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final String f2933h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: i, reason: collision with root package name */
    public static final String f2934i = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: j, reason: collision with root package name */
    public static final String f2935j = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: k, reason: collision with root package name */
    public static final String f2936k = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: l, reason: collision with root package name */
    public static final String f2937l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: m, reason: collision with root package name */
    public static final String f2938m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: n, reason: collision with root package name */
    public static final int f2939n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f2940o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f2941p = 2;

    /* renamed from: q, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2942q = "android.support.v4.media.session.action.PLAY_FROM_URI";

    /* renamed from: r, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2943r = "android.support.v4.media.session.action.PREPARE";

    /* renamed from: s, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2944s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    /* renamed from: t, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2945t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    /* renamed from: u, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2946u = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    /* renamed from: v, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2947v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";

    /* renamed from: w, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2948w = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    /* renamed from: x, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2949x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";

    /* renamed from: y, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2950y = "android.support.v4.media.session.action.SET_RATING";

    /* renamed from: z, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2951z = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    /* renamed from: a, reason: collision with root package name */
    public final e f2952a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaControllerCompat f2953b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<k> f2954c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f2955d = -1;

        /* renamed from: a, reason: collision with root package name */
        public final MediaDescriptionCompat f2956a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2957b;

        /* renamed from: c, reason: collision with root package name */
        public Object f2958c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i11) {
                return new QueueItem[i11];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j11) {
            this(null, mediaDescriptionCompat, j11);
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.a(g.c.b(obj)), g.c.c(obj));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f2956a;
        }

        public long d() {
            return this.f2957b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            Object obj = this.f2958c;
            if (obj != null) {
                return obj;
            }
            Object a11 = g.c.a(this.f2956a.g(), this.f2957b);
            this.f2958c = a11;
            return a11;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f2956a + ", Id=" + this.f2957b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            this.f2956a.writeToParcel(parcel, i11);
            parcel.writeLong(this.f2957b);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j11) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j11 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f2956a = mediaDescriptionCompat;
            this.f2957b = j11;
            this.f2958c = obj;
        }

        public QueueItem(Parcel parcel) {
            this.f2956a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f2957b = parcel.readLong();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Object f2960a;

        /* renamed from: b, reason: collision with root package name */
        public android.support.v4.media.session.b f2961b;

        /* renamed from: c, reason: collision with root package name */
        public Bundle f2962c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i11) {
                return new Token[i11];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            android.support.v4.media.session.b x02 = b.a.x0(BundleCompat.getBinder(bundle, MediaSessionCompat.I));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.J);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.H);
            if (token == null) {
                return null;
            }
            return new Token(token.f2960a, x02, bundle2);
        }

        public static Token b(Object obj) {
            return c(obj, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token c(Object obj, android.support.v4.media.session.b bVar) {
            if (obj != null) {
                return new Token(android.support.v4.media.session.g.u(obj), bVar);
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public android.support.v4.media.session.b d() {
            return this.f2961b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bundle e() {
            return this.f2962c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f2960a;
            if (obj2 == null) {
                return token.f2960a == null;
            }
            Object obj3 = token.f2960a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Object g() {
            return this.f2960a;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void h(android.support.v4.media.session.b bVar) {
            this.f2961b = bVar;
        }

        public int hashCode() {
            Object obj = this.f2960a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public void i(Bundle bundle) {
            this.f2962c = bundle;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.H, this);
            android.support.v4.media.session.b bVar = this.f2961b;
            if (bVar != null) {
                BundleCompat.putBinder(bundle, MediaSessionCompat.I, bVar.asBinder());
            }
            Bundle bundle2 = this.f2962c;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.J, bundle2);
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeParcelable((Parcelable) this.f2960a, i11);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, Bundle bundle) {
            this.f2960a = obj;
            this.f2961b = bVar;
            this.f2962c = bundle;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d {
        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends d {
        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends d {
        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        Token a();

        void b(String str, Bundle bundle);

        void c(d dVar, Handler handler);

        void d(int i11);

        void e(PlaybackStateCompat playbackStateCompat);

        String f();

        void g(int i11);

        PlaybackStateCompat getPlaybackState();

        void h(PendingIntent pendingIntent);

        void i(boolean z11);

        boolean isActive();

        Object j();

        void k(boolean z11);

        void l(int i11);

        void m(MediaSessionManager.RemoteUserInfo remoteUserInfo);

        void n(VolumeProviderCompat volumeProviderCompat);

        void o(CharSequence charSequence);

        void p(MediaMetadataCompat mediaMetadataCompat);

        void q(List<QueueItem> list);

        void r(PendingIntent pendingIntent);

        void release();

        Object s();

        void setExtras(Bundle bundle);

        void setFlags(int i11);

        void setRepeatMode(int i11);

        MediaSessionManager.RemoteUserInfo t();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(18)
    public static class f extends j {
        public static boolean I = true;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j11) {
                f.this.y(18, -1, -1, Long.valueOf(j11), null);
            }
        }

        public f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void L(PlaybackStateCompat playbackStateCompat) {
            long n11 = playbackStateCompat.n();
            float l11 = playbackStateCompat.l();
            long k11 = playbackStateCompat.k();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.o() == 3) {
                long j11 = 0;
                if (n11 > 0) {
                    if (k11 > 0) {
                        j11 = elapsedRealtime - k11;
                        if (l11 > 0.0f && l11 != 1.0f) {
                            j11 = (long) (j11 * l11);
                        }
                    }
                    n11 += j11;
                }
            }
            this.f2996i.setPlaybackState(w(playbackStateCompat.o()), n11, l11);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void N(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                this.f2995h.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.N(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.e
        public void c(d dVar, Handler handler) {
            super.c(dVar, handler);
            if (dVar == null) {
                this.f2996i.setPlaybackPositionUpdateListener(null);
            } else {
                this.f2996i.setPlaybackPositionUpdateListener(new a());
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public int x(long j11) {
            int x11 = super.x(j11);
            return (j11 & 256) != 0 ? x11 | 256 : x11;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void z(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                try {
                    this.f2995h.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w(MediaSessionCompat.f2929d, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    I = false;
                }
            }
            if (I) {
                return;
            }
            super.z(pendingIntent, componentName);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(19)
    public static class g extends f {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements RemoteControlClient.OnMetadataUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i11, Object obj) {
                if (i11 == 268435457 && (obj instanceof Rating)) {
                    g.this.y(19, -1, -1, RatingCompat.a(obj), null);
                }
            }
        }

        public g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.e
        public void c(d dVar, Handler handler) {
            super.c(dVar, handler);
            if (dVar == null) {
                this.f2996i.setMetadataUpdateListener(null);
            } else {
                this.f2996i.setMetadataUpdateListener(new a());
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public RemoteControlClient.MetadataEditor v(Bundle bundle) {
            RemoteControlClient.MetadataEditor v11 = super.v(bundle);
            PlaybackStateCompat playbackStateCompat = this.f3008u;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.b()) & 128) != 0) {
                v11.addEditableKey(268435457);
            }
            if (bundle != null) {
                if (bundle.containsKey(MediaMetadataCompat.f2846n)) {
                    v11.putLong(8, bundle.getLong(MediaMetadataCompat.f2846n));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2857y)) {
                    v11.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.f2857y));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2856x)) {
                    v11.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.f2856x));
                }
            }
            return v11;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.j
        public int x(long j11) {
            int x11 = super.x(j11);
            return (j11 & 128) != 0 ? x11 | 512 : x11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class i extends h {
        public i(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.h, android.support.v4.media.session.MediaSessionCompat.e
        @NonNull
        public final MediaSessionManager.RemoteUserInfo t() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = ((MediaSession) this.f2977a).getCurrentControllerInfo();
            return new MediaSessionManager.RemoteUserInfo(currentControllerInfo);
        }

        public i(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.h, android.support.v4.media.session.MediaSessionCompat.e
        public void m(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface l {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void b(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, new h(obj));
    }

    public static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j11 = -1;
        if (playbackStateCompat.n() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.o() != 3 && playbackStateCompat.o() != 4 && playbackStateCompat.o() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.k() <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long l11 = ((long) (playbackStateCompat.l() * (elapsedRealtime - r0))) + playbackStateCompat.n();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a(MediaMetadataCompat.f2839g)) {
            j11 = mediaMetadataCompat.g(MediaMetadataCompat.f2839g);
        }
        return new PlaybackStateCompat.c(playbackStateCompat).k(playbackStateCompat.o(), (j11 < 0 || l11 <= j11) ? l11 < 0 ? 0L : l11 : j11, playbackStateCompat.l(), elapsedRealtime).c();
    }

    public void A(CharSequence charSequence) {
        this.f2952a.o(charSequence);
    }

    public void B(int i11) {
        this.f2952a.d(i11);
    }

    public void C(int i11) {
        this.f2952a.setRepeatMode(i11);
    }

    public void D(PendingIntent pendingIntent) {
        this.f2952a.r(pendingIntent);
    }

    public void E(int i11) {
        this.f2952a.l(i11);
    }

    public void a(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f2954c.add(kVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String d() {
        return this.f2952a.f();
    }

    public MediaControllerCompat e() {
        return this.f2953b;
    }

    @NonNull
    public final MediaSessionManager.RemoteUserInfo f() {
        return this.f2952a.t();
    }

    public Object g() {
        return this.f2952a.s();
    }

    public Object h() {
        return this.f2952a.j();
    }

    public Token i() {
        return this.f2952a.a();
    }

    public boolean k() {
        return this.f2952a.isActive();
    }

    public void l() {
        this.f2952a.release();
    }

    public void m(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f2954c.remove(kVar);
    }

    public void n(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f2952a.b(str, bundle);
    }

    public void o(boolean z11) {
        this.f2952a.k(z11);
        Iterator<k> it = this.f2954c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(d dVar) {
        q(dVar, null);
    }

    public void q(d dVar, Handler handler) {
        if (dVar == null) {
            this.f2952a.c(null, null);
            return;
        }
        e eVar = this.f2952a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.c(dVar, handler);
    }

    public void r(boolean z11) {
        this.f2952a.i(z11);
    }

    public void s(Bundle bundle) {
        this.f2952a.setExtras(bundle);
    }

    public void t(int i11) {
        this.f2952a.setFlags(i11);
    }

    public void u(PendingIntent pendingIntent) {
        this.f2952a.h(pendingIntent);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat) {
        this.f2952a.p(mediaMetadataCompat);
    }

    public void w(PlaybackStateCompat playbackStateCompat) {
        this.f2952a.e(playbackStateCompat);
    }

    public void x(int i11) {
        this.f2952a.g(i11);
    }

    public void y(VolumeProviderCompat volumeProviderCompat) {
        if (volumeProviderCompat == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f2952a.n(volumeProviderCompat);
    }

    public void z(List<QueueItem> list) {
        this.f2952a.q(list);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public ResultReceiver f2959a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i11) {
                return new ResultReceiverWrapper[i11];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f2959a = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            this.f2959a.writeToParcel(parcel, i11);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f2959a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f2954c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = MediaButtonReceiver.getMediaButtonReceiverComponent(context)) == null) {
                    Log.w(f2929d, "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    i iVar = new i(context, str, bundle);
                    this.f2952a = iVar;
                    p(new a());
                    iVar.h(pendingIntent);
                } else {
                    h hVar = new h(context, str, bundle);
                    this.f2952a = hVar;
                    p(new b());
                    hVar.h(pendingIntent);
                }
                this.f2953b = new MediaControllerCompat(context, this);
                if (P == 0) {
                    P = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class h implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2977a;

        /* renamed from: b, reason: collision with root package name */
        public final Token f2978b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2979c = false;

        /* renamed from: d, reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.a> f2980d = new RemoteCallbackList<>();

        /* renamed from: e, reason: collision with root package name */
        public PlaybackStateCompat f2981e;

        /* renamed from: f, reason: collision with root package name */
        public List<QueueItem> f2982f;

        /* renamed from: g, reason: collision with root package name */
        public MediaMetadataCompat f2983g;

        /* renamed from: h, reason: collision with root package name */
        public int f2984h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2985i;

        /* renamed from: j, reason: collision with root package name */
        public int f2986j;

        /* renamed from: k, reason: collision with root package name */
        public int f2987k;

        public h(Context context, String str, Bundle bundle) {
            Object b11 = android.support.v4.media.session.g.b(context, str);
            this.f2977a = b11;
            this.f2978b = new Token(android.support.v4.media.session.g.c(b11), new a(), bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Token a() {
            return this.f2978b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void b(String str, Bundle bundle) {
            android.support.v4.media.session.g.g(this.f2977a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void c(d dVar, Handler handler) {
            android.support.v4.media.session.g.i(this.f2977a, dVar == null ? null : dVar.f2966a, handler);
            if (dVar != null) {
                dVar.D(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void d(int i11) {
            android.support.v4.media.session.h.a(this.f2977a, i11);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void e(PlaybackStateCompat playbackStateCompat) {
            this.f2981e = playbackStateCompat;
            for (int beginBroadcast = this.f2980d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2980d.getBroadcastItem(beginBroadcast).v0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f2980d.finishBroadcast();
            android.support.v4.media.session.g.n(this.f2977a, playbackStateCompat == null ? null : playbackStateCompat.m());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public String f() {
            return android.support.v4.media.session.j.b(this.f2977a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void g(int i11) {
            android.support.v4.media.session.g.o(this.f2977a, i11);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public PlaybackStateCompat getPlaybackState() {
            return this.f2981e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void h(PendingIntent pendingIntent) {
            android.support.v4.media.session.g.l(this.f2977a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void i(boolean z11) {
            if (this.f2985i != z11) {
                this.f2985i = z11;
                for (int beginBroadcast = this.f2980d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f2980d.getBroadcastItem(beginBroadcast).p0(z11);
                    } catch (RemoteException unused) {
                    }
                }
                this.f2980d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public boolean isActive() {
            return android.support.v4.media.session.g.e(this.f2977a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object j() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void k(boolean z11) {
            android.support.v4.media.session.g.h(this.f2977a, z11);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void l(int i11) {
            if (this.f2987k != i11) {
                this.f2987k = i11;
                for (int beginBroadcast = this.f2980d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f2980d.getBroadcastItem(beginBroadcast).Z(i11);
                    } catch (RemoteException unused) {
                    }
                }
                this.f2980d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void n(VolumeProviderCompat volumeProviderCompat) {
            android.support.v4.media.session.g.p(this.f2977a, volumeProviderCompat.getVolumeProvider());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void o(CharSequence charSequence) {
            android.support.v4.media.session.g.r(this.f2977a, charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void p(MediaMetadataCompat mediaMetadataCompat) {
            this.f2983g = mediaMetadataCompat;
            android.support.v4.media.session.g.m(this.f2977a, mediaMetadataCompat == null ? null : mediaMetadataCompat.h());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void q(List<QueueItem> list) {
            ArrayList arrayList;
            this.f2982f = list;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<QueueItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().e());
                }
            } else {
                arrayList = null;
            }
            android.support.v4.media.session.g.q(this.f2977a, arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void r(PendingIntent pendingIntent) {
            android.support.v4.media.session.g.s(this.f2977a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void release() {
            this.f2979c = true;
            android.support.v4.media.session.g.f(this.f2977a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object s() {
            return this.f2977a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setExtras(Bundle bundle) {
            android.support.v4.media.session.g.j(this.f2977a, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setFlags(int i11) {
            android.support.v4.media.session.g.k(this.f2977a, i11);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setRepeatMode(int i11) {
            if (this.f2986j != i11) {
                this.f2986j = i11;
                for (int beginBroadcast = this.f2980d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f2980d.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i11);
                    } catch (RemoteException unused) {
                    }
                }
                this.f2980d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public MediaSessionManager.RemoteUserInfo t() {
            return null;
        }

        public h(Object obj) {
            Object t11 = android.support.v4.media.session.g.t(obj);
            this.f2977a = t11;
            this.f2978b = new Token(android.support.v4.media.session.g.c(t11), new a());
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends b.a {
            public a() {
            }

            @Override // android.support.v4.media.session.b
            public void A(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G(android.support.v4.media.session.a aVar) {
                h hVar = h.this;
                if (hVar.f2979c) {
                    return;
                }
                String f11 = hVar.f();
                if (f11 == null) {
                    f11 = MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER;
                }
                h.this.f2980d.register(aVar, new MediaSessionManager.RemoteUserInfo(f11, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.b
            public boolean H() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void K(android.support.v4.media.session.a aVar) {
                h.this.f2980d.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo O() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void R(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void T(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean V(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void W(MediaDescriptionCompat mediaDescriptionCompat, int i11) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c0(long j11) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean g() {
                return h.this.f2985i;
            }

            @Override // android.support.v4.media.session.b
            public void g0(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() {
                h hVar = h.this;
                return MediaSessionCompat.j(hVar.f2981e, hVar.f2983g);
            }

            @Override // android.support.v4.media.session.b
            public int getRepeatMode() {
                return h.this.f2986j;
            }

            @Override // android.support.v4.media.session.b
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence h() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h0(int i11, int i12, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i(boolean z11) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int j() {
                return h.this.f2984h;
            }

            @Override // android.support.v4.media.session.b
            public void j0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int k() {
                return h.this.f2987k;
            }

            @Override // android.support.v4.media.session.b
            public void l(int i11) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void n(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void o0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> q() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void r(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void rewind() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean s() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void s0(int i11, int i12, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j11) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void setRepeatMode(int i11) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void t(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent u() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void w(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void x(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void y(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z(int i11) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B(boolean z11) throws RemoteException {
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void m(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<e> f2967b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2969d;

        /* renamed from: c, reason: collision with root package name */
        public a f2968c = null;

        /* renamed from: a, reason: collision with root package name */
        public final Object f2966a = android.support.v4.media.session.j.a(new C0030d());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends Handler {

            /* renamed from: b, reason: collision with root package name */
            public static final int f2970b = 1;

            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    d.this.a((MediaSessionManager.RemoteUserInfo) message.obj);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(23)
        public class c extends b implements i.a {
            public c() {
                super();
            }

            @Override // android.support.v4.media.session.i.a
            public void g(Uri uri, Bundle bundle) {
                d.this.l(uri, bundle);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d, reason: collision with other inner class name */
        public class C0030d extends c implements j.a {
            public C0030d() {
                super();
            }

            @Override // android.support.v4.media.session.j.a
            public void c() {
                d.this.m();
            }

            @Override // android.support.v4.media.session.j.a
            public void f(String str, Bundle bundle) {
                d.this.o(str, bundle);
            }

            @Override // android.support.v4.media.session.j.a
            public void m(String str, Bundle bundle) {
                d.this.n(str, bundle);
            }

            @Override // android.support.v4.media.session.j.a
            public void q(Uri uri, Bundle bundle) {
                d.this.p(uri, bundle);
            }
        }

        public void D(e eVar, Handler handler) {
            this.f2967b = new WeakReference<>(eVar);
            a aVar = this.f2968c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f2968c = new a(handler.getLooper());
        }

        public void a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            if (this.f2969d) {
                this.f2969d = false;
                this.f2968c.removeMessages(1);
                e eVar = this.f2967b.get();
                if (eVar == null) {
                    return;
                }
                PlaybackStateCompat playbackState = eVar.getPlaybackState();
                long b11 = playbackState == null ? 0L : playbackState.b();
                boolean z11 = playbackState != null && playbackState.o() == 3;
                boolean z12 = (516 & b11) != 0;
                boolean z13 = (b11 & 514) != 0;
                eVar.m(remoteUserInfo);
                if (z11 && z13) {
                    h();
                } else if (!z11 && z12) {
                    i();
                }
                eVar.m(null);
            }
        }

        public boolean g(Intent intent) {
            e eVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (eVar = this.f2967b.get()) == null || this.f2968c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            MediaSessionManager.RemoteUserInfo t11 = eVar.t();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(t11);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                a(t11);
            } else if (this.f2969d) {
                this.f2968c.removeMessages(1);
                this.f2969d = false;
                PlaybackStateCompat playbackState = eVar.getPlaybackState();
                if (((playbackState == null ? 0L : playbackState.b()) & 32) != 0) {
                    z();
                }
            } else {
                this.f2969d = true;
                a aVar = this.f2968c;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, t11), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void A() {
        }

        public void C() {
        }

        public void f() {
        }

        public void h() {
        }

        public void i() {
        }

        public void m() {
        }

        public void s() {
        }

        public void z() {
        }

        public void B(long j11) {
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void r(int i11) {
        }

        public void t(long j11) {
        }

        public void u(boolean z11) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void x(int i11) {
        }

        public void y(int i11) {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @RequiresApi(21)
        public class b implements g.a {
            public b() {
            }

            @Override // android.support.v4.media.session.g.a
            public void a() {
                d.this.i();
            }

            @Override // android.support.v4.media.session.g.a
            public boolean b(Intent intent) {
                return d.this.g(intent);
            }

            @Override // android.support.v4.media.session.g.a
            public void e(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.D);
                MediaSessionCompat.b(bundle2);
                if (str.equals(MediaSessionCompat.f2942q)) {
                    d.this.l((Uri) bundle.getParcelable(MediaSessionCompat.B), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f2943r)) {
                    d.this.m();
                    return;
                }
                if (str.equals(MediaSessionCompat.f2944s)) {
                    d.this.n(bundle.getString(MediaSessionCompat.f2951z), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f2945t)) {
                    d.this.o(bundle.getString(MediaSessionCompat.A), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f2946u)) {
                    d.this.p((Uri) bundle.getParcelable(MediaSessionCompat.B), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.f2947v)) {
                    d.this.u(bundle.getBoolean(MediaSessionCompat.E));
                    return;
                }
                if (str.equals(MediaSessionCompat.f2948w)) {
                    d.this.x(bundle.getInt(MediaSessionCompat.F));
                } else if (str.equals(MediaSessionCompat.f2949x)) {
                    d.this.y(bundle.getInt(MediaSessionCompat.G));
                } else if (!str.equals(MediaSessionCompat.f2950y)) {
                    d.this.e(str, bundle);
                } else {
                    d.this.w((RatingCompat) bundle.getParcelable(MediaSessionCompat.C), bundle2);
                }
            }

            @Override // android.support.v4.media.session.g.a
            public void h() {
                d.this.s();
            }

            @Override // android.support.v4.media.session.g.a
            public void i(Object obj) {
                d.this.v(RatingCompat.a(obj));
            }

            @Override // android.support.v4.media.session.g.a
            public void j() {
                d.this.f();
            }

            @Override // android.support.v4.media.session.g.a
            public void k() {
                d.this.z();
            }

            @Override // android.support.v4.media.session.g.a
            public void l(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.f2881e)) {
                        h hVar = (h) d.this.f2967b.get();
                        if (hVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token a11 = hVar.a();
                            android.support.v4.media.session.b d11 = a11.d();
                            if (d11 != null) {
                                asBinder = d11.asBinder();
                            }
                            BundleCompat.putBinder(bundle2, MediaSessionCompat.I, asBinder);
                            bundle2.putBundle(MediaSessionCompat.J, a11.e());
                            resultReceiver.send(0, bundle2);
                            return;
                        }
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f2882f)) {
                        d.this.b((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f2886j));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f2883g)) {
                        d.this.c((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f2886j), bundle.getInt(MediaControllerCompat.f2887k));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.f2884h)) {
                        d.this.q((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f2886j));
                        return;
                    }
                    if (!str.equals(MediaControllerCompat.f2885i)) {
                        d.this.d(str, bundle, resultReceiver);
                        return;
                    }
                    h hVar2 = (h) d.this.f2967b.get();
                    if (hVar2 == null || hVar2.f2982f == null) {
                        return;
                    }
                    int i11 = bundle.getInt(MediaControllerCompat.f2887k, -1);
                    if (i11 >= 0 && i11 < hVar2.f2982f.size()) {
                        queueItem = hVar2.f2982f.get(i11);
                    }
                    if (queueItem != null) {
                        d.this.q(queueItem.c());
                    }
                } catch (BadParcelableException unused) {
                    Log.e(MediaSessionCompat.f2929d, "Could not unparcel the extra data.");
                }
            }

            @Override // android.support.v4.media.session.g.a
            public void n() {
                d.this.A();
            }

            @Override // android.support.v4.media.session.g.a
            public void o(String str, Bundle bundle) {
                d.this.k(str, bundle);
            }

            @Override // android.support.v4.media.session.g.a
            public void onPause() {
                d.this.h();
            }

            @Override // android.support.v4.media.session.g.a
            public void onStop() {
                d.this.C();
            }

            @Override // android.support.v4.media.session.g.a
            public void p(long j11) {
                d.this.B(j11);
            }

            @Override // android.support.v4.media.session.g.a
            public void r(String str, Bundle bundle) {
                d.this.j(str, bundle);
            }

            @Override // android.support.v4.media.session.g.a
            public void s(long j11) {
                d.this.t(j11);
            }

            @Override // android.support.v4.media.session.g.a
            public void d(Object obj, Bundle bundle) {
            }
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i11) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j implements e {
        public static final int H = 0;
        public int A;
        public int B;
        public Bundle C;
        public int D;
        public int E;
        public VolumeProviderCompat F;

        /* renamed from: a, reason: collision with root package name */
        public final Context f2988a;

        /* renamed from: b, reason: collision with root package name */
        public final ComponentName f2989b;

        /* renamed from: c, reason: collision with root package name */
        public final PendingIntent f2990c;

        /* renamed from: d, reason: collision with root package name */
        public final c f2991d;

        /* renamed from: e, reason: collision with root package name */
        public final Token f2992e;

        /* renamed from: f, reason: collision with root package name */
        public final String f2993f;

        /* renamed from: g, reason: collision with root package name */
        public final String f2994g;

        /* renamed from: h, reason: collision with root package name */
        public final AudioManager f2995h;

        /* renamed from: i, reason: collision with root package name */
        public final RemoteControlClient f2996i;

        /* renamed from: l, reason: collision with root package name */
        public d f2999l;

        /* renamed from: q, reason: collision with root package name */
        public volatile d f3004q;

        /* renamed from: r, reason: collision with root package name */
        public MediaSessionManager.RemoteUserInfo f3005r;

        /* renamed from: s, reason: collision with root package name */
        public int f3006s;

        /* renamed from: t, reason: collision with root package name */
        public MediaMetadataCompat f3007t;

        /* renamed from: u, reason: collision with root package name */
        public PlaybackStateCompat f3008u;

        /* renamed from: v, reason: collision with root package name */
        public PendingIntent f3009v;

        /* renamed from: w, reason: collision with root package name */
        public List<QueueItem> f3010w;

        /* renamed from: x, reason: collision with root package name */
        public CharSequence f3011x;

        /* renamed from: y, reason: collision with root package name */
        public int f3012y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f3013z;

        /* renamed from: j, reason: collision with root package name */
        public final Object f2997j = new Object();

        /* renamed from: k, reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.a> f2998k = new RemoteCallbackList<>();

        /* renamed from: m, reason: collision with root package name */
        public boolean f3000m = false;

        /* renamed from: n, reason: collision with root package name */
        public boolean f3001n = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f3002o = false;

        /* renamed from: p, reason: collision with root package name */
        public boolean f3003p = false;
        public VolumeProviderCompat.Callback G = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends VolumeProviderCompat.Callback {
            public a() {
            }

            @Override // androidx.media.VolumeProviderCompat.Callback
            public void onVolumeChanged(VolumeProviderCompat volumeProviderCompat) {
                if (j.this.F != volumeProviderCompat) {
                    return;
                }
                j jVar = j.this;
                j.this.K(new ParcelableVolumeInfo(jVar.D, jVar.E, volumeProviderCompat.getVolumeControl(), volumeProviderCompat.getMaxVolume(), volumeProviderCompat.getCurrentVolume()));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f3015a;

            /* renamed from: b, reason: collision with root package name */
            public final Bundle f3016b;

            /* renamed from: c, reason: collision with root package name */
            public final ResultReceiver f3017c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3015a = str;
                this.f3016b = bundle;
                this.f3017c = resultReceiver;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends Handler {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 127;
            public static final int G = 126;

            /* renamed from: b, reason: collision with root package name */
            public static final int f3018b = 1;

            /* renamed from: c, reason: collision with root package name */
            public static final int f3019c = 2;

            /* renamed from: d, reason: collision with root package name */
            public static final int f3020d = 3;

            /* renamed from: e, reason: collision with root package name */
            public static final int f3021e = 4;

            /* renamed from: f, reason: collision with root package name */
            public static final int f3022f = 5;

            /* renamed from: g, reason: collision with root package name */
            public static final int f3023g = 6;

            /* renamed from: h, reason: collision with root package name */
            public static final int f3024h = 7;

            /* renamed from: i, reason: collision with root package name */
            public static final int f3025i = 8;

            /* renamed from: j, reason: collision with root package name */
            public static final int f3026j = 9;

            /* renamed from: k, reason: collision with root package name */
            public static final int f3027k = 10;

            /* renamed from: l, reason: collision with root package name */
            public static final int f3028l = 11;

            /* renamed from: m, reason: collision with root package name */
            public static final int f3029m = 12;

            /* renamed from: n, reason: collision with root package name */
            public static final int f3030n = 13;

            /* renamed from: o, reason: collision with root package name */
            public static final int f3031o = 14;

            /* renamed from: p, reason: collision with root package name */
            public static final int f3032p = 15;

            /* renamed from: q, reason: collision with root package name */
            public static final int f3033q = 16;

            /* renamed from: r, reason: collision with root package name */
            public static final int f3034r = 17;

            /* renamed from: s, reason: collision with root package name */
            public static final int f3035s = 18;

            /* renamed from: t, reason: collision with root package name */
            public static final int f3036t = 19;

            /* renamed from: u, reason: collision with root package name */
            public static final int f3037u = 31;

            /* renamed from: v, reason: collision with root package name */
            public static final int f3038v = 20;

            /* renamed from: w, reason: collision with root package name */
            public static final int f3039w = 21;

            /* renamed from: x, reason: collision with root package name */
            public static final int f3040x = 22;

            /* renamed from: y, reason: collision with root package name */
            public static final int f3041y = 23;

            /* renamed from: z, reason: collision with root package name */
            public static final int f3042z = 25;

            public d(Looper looper) {
                super(looper);
            }

            public final void a(KeyEvent keyEvent, d dVar) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = j.this.f3008u;
                long b11 = playbackStateCompat == null ? 0L : playbackStateCompat.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((b11 & 4) != 0) {
                            dVar.i();
                            return;
                        }
                        return;
                    }
                    if (keyCode == 127) {
                        if ((b11 & 2) != 0) {
                            dVar.h();
                            return;
                        }
                        return;
                    }
                    switch (keyCode) {
                        case 86:
                            if ((b11 & 1) != 0) {
                                dVar.C();
                                break;
                            }
                            break;
                        case 87:
                            if ((b11 & 32) != 0) {
                                dVar.z();
                                break;
                            }
                            break;
                        case 88:
                            if ((b11 & 16) != 0) {
                                dVar.A();
                                break;
                            }
                            break;
                        case 89:
                            if ((b11 & 8) != 0) {
                                dVar.s();
                                break;
                            }
                            break;
                        case 90:
                            if ((b11 & 64) != 0) {
                                dVar.f();
                                break;
                            }
                            break;
                    }
                    return;
                }
                Log.w(MediaSessionCompat.f2929d, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                d dVar = j.this.f3004q;
                if (dVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j.this.m(new MediaSessionManager.RemoteUserInfo(data.getString(MediaSessionCompat.L), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle(MediaSessionCompat.O);
                MediaSessionCompat.b(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            b bVar = (b) message.obj;
                            dVar.d(bVar.f3015a, bVar.f3016b, bVar.f3017c);
                            break;
                        case 2:
                            j.this.u(message.arg1, 0);
                            break;
                        case 3:
                            dVar.m();
                            break;
                        case 4:
                            dVar.n((String) message.obj, bundle);
                            break;
                        case 5:
                            dVar.o((String) message.obj, bundle);
                            break;
                        case 6:
                            dVar.p((Uri) message.obj, bundle);
                            break;
                        case 7:
                            dVar.i();
                            break;
                        case 8:
                            dVar.j((String) message.obj, bundle);
                            break;
                        case 9:
                            dVar.k((String) message.obj, bundle);
                            break;
                        case 10:
                            dVar.l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            dVar.B(((Long) message.obj).longValue());
                            break;
                        case 12:
                            dVar.h();
                            break;
                        case 13:
                            dVar.C();
                            break;
                        case 14:
                            dVar.z();
                            break;
                        case 15:
                            dVar.A();
                            break;
                        case 16:
                            dVar.f();
                            break;
                        case 17:
                            dVar.s();
                            break;
                        case 18:
                            dVar.t(((Long) message.obj).longValue());
                            break;
                        case 19:
                            dVar.v((RatingCompat) message.obj);
                            break;
                        case 20:
                            dVar.e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!dVar.g(intent)) {
                                a(keyEvent, dVar);
                                break;
                            }
                            break;
                        case 22:
                            j.this.M(message.arg1, 0);
                            break;
                        case 23:
                            dVar.x(message.arg1);
                            break;
                        case 25:
                            dVar.b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            dVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            dVar.q((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = j.this.f3010w;
                            if (list != null) {
                                int i11 = message.arg1;
                                QueueItem queueItem = (i11 < 0 || i11 >= list.size()) ? null : j.this.f3010w.get(message.arg1);
                                if (queueItem != null) {
                                    dVar.q(queueItem.c());
                                    break;
                                }
                            }
                            break;
                        case 29:
                            dVar.u(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            dVar.y(message.arg1);
                            break;
                        case 31:
                            dVar.w((RatingCompat) message.obj, bundle);
                            break;
                    }
                } finally {
                    j.this.m(null);
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
            }
            this.f2988a = context;
            this.f2993f = context.getPackageName();
            this.f2995h = (AudioManager) context.getSystemService("audio");
            this.f2994g = str;
            this.f2989b = componentName;
            this.f2990c = pendingIntent;
            c cVar = new c();
            this.f2991d = cVar;
            this.f2992e = new Token(cVar);
            this.f3012y = 0;
            this.D = 1;
            this.E = 3;
            this.f2996i = new RemoteControlClient(pendingIntent);
        }

        public final void A(boolean z11) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).p0(z11);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void B(String str, Bundle bundle) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).onEvent(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void C(Bundle bundle) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).o(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void D(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).X(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void E(List<QueueItem> list) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).a(list);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void F(CharSequence charSequence) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).p(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void G(int i11) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i11);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void H() {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).f();
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
            this.f2998k.kill();
        }

        public final void I(int i11) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).Z(i11);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public final void J(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).v0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public void K(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f2998k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2998k.getBroadcastItem(beginBroadcast).e0(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f2998k.finishBroadcast();
        }

        public void L(PlaybackStateCompat playbackStateCompat) {
            this.f2996i.setPlaybackState(w(playbackStateCompat.o()));
        }

        public void M(int i11, int i12) {
            if (this.D != 2) {
                this.f2995h.setStreamVolume(this.E, i11, i12);
                return;
            }
            VolumeProviderCompat volumeProviderCompat = this.F;
            if (volumeProviderCompat != null) {
                volumeProviderCompat.onSetVolumeTo(i11);
            }
        }

        public void N(PendingIntent pendingIntent, ComponentName componentName) {
            this.f2995h.unregisterMediaButtonEventReceiver(componentName);
        }

        public boolean O() {
            if (this.f3001n) {
                boolean z11 = this.f3002o;
                if (!z11 && (this.f3006s & 1) != 0) {
                    z(this.f2990c, this.f2989b);
                    this.f3002o = true;
                } else if (z11 && (this.f3006s & 1) == 0) {
                    N(this.f2990c, this.f2989b);
                    this.f3002o = false;
                }
                boolean z12 = this.f3003p;
                if (!z12 && (this.f3006s & 2) != 0) {
                    this.f2995h.registerRemoteControlClient(this.f2996i);
                    this.f3003p = true;
                    return true;
                }
                if (z12 && (this.f3006s & 2) == 0) {
                    this.f2996i.setPlaybackState(0);
                    this.f2995h.unregisterRemoteControlClient(this.f2996i);
                    this.f3003p = false;
                    return false;
                }
            } else {
                if (this.f3002o) {
                    N(this.f2990c, this.f2989b);
                    this.f3002o = false;
                }
                if (this.f3003p) {
                    this.f2996i.setPlaybackState(0);
                    this.f2995h.unregisterRemoteControlClient(this.f2996i);
                    this.f3003p = false;
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Token a() {
            return this.f2992e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void b(String str, Bundle bundle) {
            B(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void c(d dVar, Handler handler) {
            this.f3004q = dVar;
            if (dVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f2997j) {
                    try {
                        d dVar2 = this.f2999l;
                        if (dVar2 != null) {
                            dVar2.removeCallbacksAndMessages(null);
                        }
                        this.f2999l = new d(handler.getLooper());
                        this.f3004q.D(this, handler);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void d(int i11) {
            this.f3012y = i11;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void e(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f2997j) {
                this.f3008u = playbackStateCompat;
            }
            J(playbackStateCompat);
            if (this.f3001n) {
                if (playbackStateCompat == null) {
                    this.f2996i.setPlaybackState(0);
                    this.f2996i.setTransportControlFlags(0);
                } else {
                    L(playbackStateCompat);
                    this.f2996i.setTransportControlFlags(x(playbackStateCompat.b()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public String f() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void g(int i11) {
            VolumeProviderCompat volumeProviderCompat = this.F;
            if (volumeProviderCompat != null) {
                volumeProviderCompat.setCallback(null);
            }
            this.E = i11;
            this.D = 1;
            int i12 = this.D;
            int i13 = this.E;
            K(new ParcelableVolumeInfo(i12, i13, 2, this.f2995h.getStreamMaxVolume(i13), this.f2995h.getStreamVolume(this.E)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f2997j) {
                playbackStateCompat = this.f3008u;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void i(boolean z11) {
            if (this.f3013z != z11) {
                this.f3013z = z11;
                A(z11);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public boolean isActive() {
            return this.f3001n;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object j() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void k(boolean z11) {
            if (z11 == this.f3001n) {
                return;
            }
            this.f3001n = z11;
            if (O()) {
                p(this.f3007t);
                e(this.f3008u);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void l(int i11) {
            if (this.B != i11) {
                this.B = i11;
                I(i11);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void m(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.f2997j) {
                this.f3005r = remoteUserInfo;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void n(VolumeProviderCompat volumeProviderCompat) {
            if (volumeProviderCompat == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            VolumeProviderCompat volumeProviderCompat2 = this.F;
            if (volumeProviderCompat2 != null) {
                volumeProviderCompat2.setCallback(null);
            }
            this.D = 2;
            this.F = volumeProviderCompat;
            K(new ParcelableVolumeInfo(this.D, this.E, this.F.getVolumeControl(), this.F.getMaxVolume(), this.F.getCurrentVolume()));
            volumeProviderCompat.setCallback(this.G);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void o(CharSequence charSequence) {
            this.f3011x = charSequence;
            F(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void p(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.c(mediaMetadataCompat, MediaSessionCompat.P).a();
            }
            synchronized (this.f2997j) {
                this.f3007t = mediaMetadataCompat;
            }
            D(mediaMetadataCompat);
            if (this.f3001n) {
                v(mediaMetadataCompat == null ? null : mediaMetadataCompat.d()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void q(List<QueueItem> list) {
            this.f3010w = list;
            E(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void r(PendingIntent pendingIntent) {
            synchronized (this.f2997j) {
                this.f3009v = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void release() {
            this.f3001n = false;
            this.f3000m = true;
            O();
            H();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object s() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setExtras(Bundle bundle) {
            this.C = bundle;
            C(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setFlags(int i11) {
            synchronized (this.f2997j) {
                this.f3006s = i11;
            }
            O();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setRepeatMode(int i11) {
            if (this.A != i11) {
                this.A = i11;
                G(i11);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public MediaSessionManager.RemoteUserInfo t() {
            MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.f2997j) {
                remoteUserInfo = this.f3005r;
            }
            return remoteUserInfo;
        }

        public void u(int i11, int i12) {
            if (this.D != 2) {
                this.f2995h.adjustStreamVolume(this.E, i11, i12);
                return;
            }
            VolumeProviderCompat volumeProviderCompat = this.F;
            if (volumeProviderCompat != null) {
                volumeProviderCompat.onAdjustVolume(i11);
            }
        }

        public RemoteControlClient.MetadataEditor v(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f2996i.editMetadata(true);
            if (bundle != null) {
                if (bundle.containsKey(MediaMetadataCompat.f2852t)) {
                    Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.f2852t);
                    if (bitmap != null) {
                        bitmap = bitmap.copy(bitmap.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap);
                } else if (bundle.containsKey(MediaMetadataCompat.f2854v)) {
                    Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.f2854v);
                    if (bitmap2 != null) {
                        bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap2);
                }
                if (bundle.containsKey(MediaMetadataCompat.f2840h)) {
                    editMetadata.putString(1, bundle.getString(MediaMetadataCompat.f2840h));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2851s)) {
                    editMetadata.putString(13, bundle.getString(MediaMetadataCompat.f2851s));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2838f)) {
                    editMetadata.putString(2, bundle.getString(MediaMetadataCompat.f2838f));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2841i)) {
                    editMetadata.putString(3, bundle.getString(MediaMetadataCompat.f2841i));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2844l)) {
                    editMetadata.putString(15, bundle.getString(MediaMetadataCompat.f2844l));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2843k)) {
                    editMetadata.putString(4, bundle.getString(MediaMetadataCompat.f2843k));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2845m)) {
                    editMetadata.putString(5, bundle.getString(MediaMetadataCompat.f2845m));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2850r)) {
                    editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.f2850r));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2839g)) {
                    editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.f2839g));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2847o)) {
                    editMetadata.putString(6, bundle.getString(MediaMetadataCompat.f2847o));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2837e)) {
                    editMetadata.putString(7, bundle.getString(MediaMetadataCompat.f2837e));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2848p)) {
                    editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.f2848p));
                }
                if (bundle.containsKey(MediaMetadataCompat.f2842j)) {
                    editMetadata.putString(11, bundle.getString(MediaMetadataCompat.f2842j));
                }
            }
            return editMetadata;
        }

        public int w(int i11) {
            switch (i11) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int x(long j11) {
            int i11 = (1 & j11) != 0 ? 32 : 0;
            if ((2 & j11) != 0) {
                i11 |= 16;
            }
            if ((4 & j11) != 0) {
                i11 |= 4;
            }
            if ((8 & j11) != 0) {
                i11 |= 2;
            }
            if ((16 & j11) != 0) {
                i11 |= 1;
            }
            if ((32 & j11) != 0) {
                i11 |= 128;
            }
            if ((64 & j11) != 0) {
                i11 |= 64;
            }
            return (j11 & 512) != 0 ? i11 | 8 : i11;
        }

        public void y(int i11, int i12, int i13, Object obj, Bundle bundle) {
            synchronized (this.f2997j) {
                try {
                    d dVar = this.f2999l;
                    if (dVar != null) {
                        Message obtainMessage = dVar.obtainMessage(i11, i12, i13, obj);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(MediaSessionCompat.L, MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER);
                        bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                        bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                        if (bundle != null) {
                            bundle2.putBundle(MediaSessionCompat.O, bundle);
                        }
                        obtainMessage.setData(bundle2);
                        obtainMessage.sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void z(PendingIntent pendingIntent, ComponentName componentName) {
            this.f2995h.registerMediaButtonEventReceiver(componentName);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends b.a {
            public c() {
            }

            @Override // android.support.v4.media.session.b
            public void A(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                A0(1, new b(str, bundle, resultReceiverWrapper.f2959a));
            }

            public void A0(int i11, Object obj) {
                j.this.y(i11, 0, 0, obj, null);
            }

            public void B0(int i11, Object obj, int i12) {
                j.this.y(i11, i12, 0, obj, null);
            }

            public void C0(int i11, Object obj, Bundle bundle) {
                j.this.y(i11, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void G(android.support.v4.media.session.a aVar) {
                if (j.this.f3000m) {
                    try {
                        aVar.f();
                    } catch (Exception unused) {
                    }
                } else {
                    j.this.f2998k.register(aVar, new MediaSessionManager.RemoteUserInfo(MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean H() {
                return (j.this.f3006s & 2) != 0;
            }

            @Override // android.support.v4.media.session.b
            public void K(android.support.v4.media.session.a aVar) {
                j.this.f2998k.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo O() {
                int i11;
                int i12;
                int i13;
                int streamMaxVolume;
                int streamVolume;
                int i14;
                int i15;
                synchronized (j.this.f2997j) {
                    try {
                        j jVar = j.this;
                        i11 = jVar.D;
                        i12 = jVar.E;
                        VolumeProviderCompat volumeProviderCompat = jVar.F;
                        i13 = 2;
                        if (i11 == 2) {
                            i13 = volumeProviderCompat.getVolumeControl();
                            streamMaxVolume = volumeProviderCompat.getMaxVolume();
                            streamVolume = volumeProviderCompat.getCurrentVolume();
                        } else {
                            streamMaxVolume = jVar.f2995h.getStreamMaxVolume(i12);
                            streamVolume = j.this.f2995h.getStreamVolume(i12);
                        }
                        i14 = streamMaxVolume;
                        i15 = streamVolume;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new ParcelableVolumeInfo(i11, i12, i13, i14, i15);
            }

            @Override // android.support.v4.media.session.b
            public void R(String str, Bundle bundle) throws RemoteException {
                C0(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void T(Uri uri, Bundle bundle) throws RemoteException {
                C0(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public boolean V(KeyEvent keyEvent) {
                boolean z11 = (j.this.f3006s & 1) != 0;
                if (z11) {
                    A0(21, keyEvent);
                }
                return z11;
            }

            @Override // android.support.v4.media.session.b
            public void W(MediaDescriptionCompat mediaDescriptionCompat, int i11) {
                B0(26, mediaDescriptionCompat, i11);
            }

            @Override // android.support.v4.media.session.b
            public void c0(long j11) {
                A0(11, Long.valueOf(j11));
            }

            @Override // android.support.v4.media.session.b
            public boolean g() {
                return j.this.f3013z;
            }

            @Override // android.support.v4.media.session.b
            public void g0(RatingCompat ratingCompat) throws RemoteException {
                A0(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (j.this.f2997j) {
                    bundle = j.this.C;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public long getFlags() {
                long j11;
                synchronized (j.this.f2997j) {
                    j11 = j.this.f3006s;
                }
                return j11;
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                return j.this.f3007t;
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                return j.this.f2993f;
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f2997j) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.f3008u;
                    mediaMetadataCompat = jVar.f3007t;
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public int getRepeatMode() {
                return j.this.A;
            }

            @Override // android.support.v4.media.session.b
            public String getTag() {
                return j.this.f2994g;
            }

            @Override // android.support.v4.media.session.b
            public CharSequence h() {
                return j.this.f3011x;
            }

            @Override // android.support.v4.media.session.b
            public void h0(int i11, int i12, String str) {
                j.this.M(i11, i12);
            }

            @Override // android.support.v4.media.session.b
            public void i(boolean z11) throws RemoteException {
                A0(29, Boolean.valueOf(z11));
            }

            @Override // android.support.v4.media.session.b
            public int j() {
                return j.this.f3012y;
            }

            @Override // android.support.v4.media.session.b
            public void j0(String str, Bundle bundle) throws RemoteException {
                C0(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public int k() {
                return j.this.B;
            }

            @Override // android.support.v4.media.session.b
            public void l(int i11) throws RemoteException {
                z0(30, i11);
            }

            @Override // android.support.v4.media.session.b
            public void m(MediaDescriptionCompat mediaDescriptionCompat) {
                A0(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void n(MediaDescriptionCompat mediaDescriptionCompat) {
                A0(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                y0(14);
            }

            @Override // android.support.v4.media.session.b
            public void o0() throws RemoteException {
                y0(16);
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                y0(12);
            }

            @Override // android.support.v4.media.session.b
            public void play() throws RemoteException {
                y0(7);
            }

            @Override // android.support.v4.media.session.b
            public void prepare() throws RemoteException {
                y0(3);
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                y0(15);
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> q() {
                List<QueueItem> list;
                synchronized (j.this.f2997j) {
                    list = j.this.f3010w;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void r(String str, Bundle bundle) throws RemoteException {
                C0(20, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void rewind() throws RemoteException {
                y0(17);
            }

            @Override // android.support.v4.media.session.b
            public boolean s() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void s0(int i11, int i12, String str) {
                j.this.u(i11, i12);
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j11) throws RemoteException {
                A0(18, Long.valueOf(j11));
            }

            @Override // android.support.v4.media.session.b
            public void setRepeatMode(int i11) throws RemoteException {
                z0(23, i11);
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                y0(13);
            }

            @Override // android.support.v4.media.session.b
            public void t(Uri uri, Bundle bundle) throws RemoteException {
                C0(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent u() {
                PendingIntent pendingIntent;
                synchronized (j.this.f2997j) {
                    pendingIntent = j.this.f3009v;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public void w(String str, Bundle bundle) throws RemoteException {
                C0(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void x(String str, Bundle bundle) throws RemoteException {
                C0(8, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void y(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                C0(31, ratingCompat, bundle);
            }

            public void y0(int i11) {
                j.this.y(i11, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void z(int i11) {
                z0(28, i11);
            }

            public void z0(int i11, int i12) {
                j.this.y(i11, i12, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void B(boolean z11) throws RemoteException {
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void h(PendingIntent pendingIntent) {
        }
    }

    public MediaSessionCompat(Context context, e eVar) {
        this.f2954c = new ArrayList<>();
        this.f2952a = eVar;
        if (!android.support.v4.media.session.g.d(eVar.s())) {
            p(new c());
        }
        this.f2953b = new MediaControllerCompat(context, this);
    }
}
