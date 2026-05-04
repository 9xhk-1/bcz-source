package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.support.v4.media.session.d;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.core.app.ComponentActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: d, reason: collision with root package name */
    public static final String f2880d = "MediaControllerCompat";

    /* renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2881e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";

    /* renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2882f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";

    /* renamed from: g, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2883g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";

    /* renamed from: h, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2884h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";

    /* renamed from: i, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2885i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* renamed from: j, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2886j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";

    /* renamed from: k, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f2887k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a, reason: collision with root package name */
    public final c f2888a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaSessionCompat.Token f2889b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet<a> f2890c = new HashSet<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    public static class MediaControllerImplApi21 implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2891a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f2892b = new Object();

        /* renamed from: c, reason: collision with root package name */
        @GuardedBy("mLock")
        public final List<a> f2893c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public HashMap<a, a> f2894d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        public final MediaSessionCompat.Token f2895e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a, reason: collision with root package name */
            public WeakReference<MediaControllerImplApi21> f2896a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f2896a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i11, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f2896a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f2892b) {
                    mediaControllerImplApi21.f2895e.h(b.a.x0(BundleCompat.getBinder(bundle, MediaSessionCompat.I)));
                    mediaControllerImplApi21.f2895e.i(bundle.getBundle(MediaSessionCompat.J));
                    mediaControllerImplApi21.t();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void X(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void e0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void f() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void o(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void p(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f2895e = token;
            Object d11 = android.support.v4.media.session.c.d(context, token.g());
            this.f2891a = d11;
            if (d11 == null) {
                throw new RemoteException();
            }
            if (token.d() == null) {
                u();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public final void a(a aVar) {
            android.support.v4.media.session.c.v(this.f2891a, aVar.f2897a);
            synchronized (this.f2892b) {
                if (this.f2895e.d() != null) {
                    try {
                        a remove = this.f2894d.remove(aVar);
                        if (remove != null) {
                            aVar.f2899c = null;
                            this.f2895e.d().K(remove);
                        }
                    } catch (RemoteException e11) {
                        Log.e(MediaControllerCompat.f2880d, "Dead object in unregisterCallback.", e11);
                    }
                } else {
                    this.f2893c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void b(MediaDescriptionCompat mediaDescriptionCompat, int i11) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.f2886j, mediaDescriptionCompat);
            bundle.putInt(MediaControllerCompat.f2887k, i11);
            c(MediaControllerCompat.f2883g, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.s(this.f2891a, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PendingIntent d() {
            return android.support.v4.media.session.c.o(this.f2891a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void e(int i11, int i12) {
            android.support.v4.media.session.c.u(this.f2891a, i11, i12);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean f() {
            return this.f2895e.d() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean g() {
            if (this.f2895e.d() == null) {
                return false;
            }
            try {
                return this.f2895e.d().g();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in isCaptioningEnabled.", e11);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Bundle getExtras() {
            return android.support.v4.media.session.c.e(this.f2891a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public long getFlags() {
            return android.support.v4.media.session.c.f(this.f2891a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public MediaMetadataCompat getMetadata() {
            Object h11 = android.support.v4.media.session.c.h(this.f2891a);
            if (h11 != null) {
                return MediaMetadataCompat.b(h11);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public String getPackageName() {
            return android.support.v4.media.session.c.i(this.f2891a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PlaybackStateCompat getPlaybackState() {
            if (this.f2895e.d() != null) {
                try {
                    return this.f2895e.d().getPlaybackState();
                } catch (RemoteException e11) {
                    Log.e(MediaControllerCompat.f2880d, "Dead object in getPlaybackState.", e11);
                }
            }
            Object k11 = android.support.v4.media.session.c.k(this.f2891a);
            if (k11 != null) {
                return PlaybackStateCompat.a(k11);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int getRepeatMode() {
            if (this.f2895e.d() == null) {
                return -1;
            }
            try {
                return this.f2895e.d().getRepeatMode();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getRepeatMode.", e11);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public CharSequence h() {
            return android.support.v4.media.session.c.m(this.f2891a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public g i() {
            Object j11 = android.support.v4.media.session.c.j(this.f2891a);
            if (j11 != null) {
                return new g(c.C0034c.e(j11), c.C0034c.c(j11), c.C0034c.f(j11), c.C0034c.d(j11), c.C0034c.b(j11));
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int j() {
            return android.support.v4.media.session.c.n(this.f2891a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int k() {
            if (this.f2895e.d() == null) {
                return -1;
            }
            try {
                return this.f2895e.d().k();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getShuffleMode.", e11);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public h l() {
            Object q11 = android.support.v4.media.session.c.q(this.f2891a);
            if (q11 != null) {
                return new i(q11);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void m(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.f2886j, mediaDescriptionCompat);
            c(MediaControllerCompat.f2884h, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void n(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.f2886j, mediaDescriptionCompat);
            c(MediaControllerCompat.f2882f, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void o(int i11, int i12) {
            android.support.v4.media.session.c.a(this.f2891a, i11, i12);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean p(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.c(this.f2891a, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public List<MediaSessionCompat.QueueItem> q() {
            List<Object> l11 = android.support.v4.media.session.c.l(this.f2891a);
            if (l11 != null) {
                return MediaSessionCompat.QueueItem.b(l11);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Object r() {
            return this.f2891a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public final void s(a aVar, Handler handler) {
            android.support.v4.media.session.c.r(this.f2891a, aVar.f2897a, handler);
            synchronized (this.f2892b) {
                if (this.f2895e.d() != null) {
                    a aVar2 = new a(aVar);
                    this.f2894d.put(aVar, aVar2);
                    aVar.f2899c = aVar2;
                    try {
                        this.f2895e.d().G(aVar2);
                        aVar.n(13, null, null);
                    } catch (RemoteException e11) {
                        Log.e(MediaControllerCompat.f2880d, "Dead object in registerCallback.", e11);
                    }
                } else {
                    aVar.f2899c = null;
                    this.f2893c.add(aVar);
                }
            }
        }

        @GuardedBy("mLock")
        public void t() {
            if (this.f2895e.d() == null) {
                return;
            }
            for (a aVar : this.f2893c) {
                a aVar2 = new a(aVar);
                this.f2894d.put(aVar, aVar2);
                aVar.f2899c = aVar2;
                try {
                    this.f2895e.d().G(aVar2);
                    aVar.n(13, null, null);
                } catch (RemoteException e11) {
                    Log.e(MediaControllerCompat.f2880d, "Dead object in registerCallback.", e11);
                }
            }
            this.f2893c.clear();
        }

        public final void u() {
            c(MediaControllerCompat.f2881e, null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends ComponentActivity.ExtraData {

        /* renamed from: a, reason: collision with root package name */
        public final MediaControllerCompat f2916a;

        public b(MediaControllerCompat mediaControllerCompat) {
            this.f2916a = mediaControllerCompat;
        }

        public MediaControllerCompat a() {
            return this.f2916a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(a aVar);

        void b(MediaDescriptionCompat mediaDescriptionCompat, int i11);

        void c(String str, Bundle bundle, ResultReceiver resultReceiver);

        PendingIntent d();

        void e(int i11, int i12);

        boolean f();

        boolean g();

        Bundle getExtras();

        long getFlags();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        PlaybackStateCompat getPlaybackState();

        int getRepeatMode();

        CharSequence h();

        g i();

        int j();

        int k();

        h l();

        void m(MediaDescriptionCompat mediaDescriptionCompat);

        void n(MediaDescriptionCompat mediaDescriptionCompat);

        void o(int i11, int i12);

        boolean p(KeyEvent keyEvent);

        List<MediaSessionCompat.QueueItem> q();

        Object r();

        void s(a aVar, Handler handler);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class d extends MediaControllerImplApi21 {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.c
        public h l() {
            Object q11 = android.support.v4.media.session.c.q(this.f2891a);
            if (q11 != null) {
                return new j(q11);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class e extends d {
        public e(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.d, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.c
        public h l() {
            Object q11 = android.support.v4.media.session.c.q(this.f2891a);
            if (q11 != null) {
                return new k(q11);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public android.support.v4.media.session.b f2917a;

        /* renamed from: b, reason: collision with root package name */
        public h f2918b;

        public f(MediaSessionCompat.Token token) {
            this.f2917a = b.a.x0((IBinder) token.g());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void a(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f2917a.K((android.support.v4.media.session.a) aVar.f2897a);
                this.f2917a.asBinder().unlinkToDeath(aVar, 0);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in unregisterCallback.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void b(MediaDescriptionCompat mediaDescriptionCompat, int i11) {
            try {
                if ((this.f2917a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2917a.W(mediaDescriptionCompat, i11);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in addQueueItemAt.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f2917a.A(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in sendCommand.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PendingIntent d() {
            try {
                return this.f2917a.u();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getSessionActivity.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void e(int i11, int i12) {
            try {
                this.f2917a.h0(i11, i12, null);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in setVolumeTo.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean f() {
            return true;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean g() {
            try {
                return this.f2917a.g();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in isCaptioningEnabled.", e11);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Bundle getExtras() {
            try {
                return this.f2917a.getExtras();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getExtras.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public long getFlags() {
            try {
                return this.f2917a.getFlags();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getFlags.", e11);
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public MediaMetadataCompat getMetadata() {
            try {
                return this.f2917a.getMetadata();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getMetadata.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public String getPackageName() {
            try {
                return this.f2917a.getPackageName();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getPackageName.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PlaybackStateCompat getPlaybackState() {
            try {
                return this.f2917a.getPlaybackState();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getPlaybackState.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int getRepeatMode() {
            try {
                return this.f2917a.getRepeatMode();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getRepeatMode.", e11);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public CharSequence h() {
            try {
                return this.f2917a.h();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getQueueTitle.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public g i() {
            try {
                ParcelableVolumeInfo O = this.f2917a.O();
                return new g(O.f3044a, O.f3045b, O.f3046c, O.f3047d, O.f3048e);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getPlaybackInfo.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int j() {
            try {
                return this.f2917a.j();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getRatingType.", e11);
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int k() {
            try {
                return this.f2917a.k();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getShuffleMode.", e11);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public h l() {
            if (this.f2918b == null) {
                this.f2918b = new l(this.f2917a);
            }
            return this.f2918b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void m(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f2917a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2917a.m(mediaDescriptionCompat);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in removeQueueItem.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void n(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f2917a.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2917a.n(mediaDescriptionCompat);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in addQueueItem.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void o(int i11, int i12) {
            try {
                this.f2917a.s0(i11, i12, null);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in adjustVolume.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean p(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f2917a.V(keyEvent);
                return false;
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in dispatchMediaButtonEvent.", e11);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public List<MediaSessionCompat.QueueItem> q() {
            try {
                return this.f2917a.q();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in getQueue.", e11);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Object r() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void s(a aVar, Handler handler) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f2917a.asBinder().linkToDeath(aVar, 0);
                this.f2917a.G((android.support.v4.media.session.a) aVar.f2897a);
                aVar.n(13, null, null);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in registerCallback.", e11);
                aVar.n(8, null, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final int f2919f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f2920g = 2;

        /* renamed from: a, reason: collision with root package name */
        public final int f2921a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2922b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2923c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2924d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2925e;

        public g(int i11, int i12, int i13, int i14, int i15) {
            this.f2921a = i11;
            this.f2922b = i12;
            this.f2923c = i13;
            this.f2924d = i14;
            this.f2925e = i15;
        }

        public int a() {
            return this.f2922b;
        }

        public int b() {
            return this.f2925e;
        }

        public int c() {
            return this.f2924d;
        }

        public int d() {
            return this.f2921a;
        }

        public int e() {
            return this.f2923c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public static final String f2926a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j11);

        public abstract void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void n(String str, Bundle bundle);

        public abstract void o(boolean z11);

        public abstract void p(RatingCompat ratingCompat);

        public abstract void q(RatingCompat ratingCompat, Bundle bundle);

        public abstract void r(int i11);

        public abstract void s(int i11);

        public abstract void t();

        public abstract void u();

        public abstract void v(long j11);

        public abstract void w();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends h {

        /* renamed from: b, reason: collision with root package name */
        public final Object f2927b;

        public i(Object obj) {
            this.f2927b = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void a() {
            c.d.a(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void b() {
            c.d.b(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void c() {
            c.d.c(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void d(String str, Bundle bundle) {
            c.d.d(this.f2927b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void e(String str, Bundle bundle) {
            c.d.e(this.f2927b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void f(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.B, uri);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f2942q, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void g() {
            n(MediaSessionCompat.f2943r, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f2951z, str);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f2944s, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.A, str);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f2945t, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.B, uri);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f2946u, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void k() {
            c.d.f(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void l(long j11) {
            c.d.g(this.f2927b, j11);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.F(customAction.b(), bundle);
            c.d.h(this.f2927b, customAction.b(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            c.d.h(this.f2927b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void o(boolean z11) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.E, z11);
            n(MediaSessionCompat.f2947v, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void p(RatingCompat ratingCompat) {
            c.d.i(this.f2927b, ratingCompat != null ? ratingCompat.c() : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void q(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.C, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f2950y, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void r(int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.F, i11);
            n(MediaSessionCompat.f2948w, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void s(int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.G, i11);
            n(MediaSessionCompat.f2949x, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void t() {
            c.d.j(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void u() {
            c.d.k(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void v(long j11) {
            c.d.l(this.f2927b, j11);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void w() {
            c.d.m(this.f2927b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class j extends i {
        public j(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void f(Uri uri, Bundle bundle) {
            d.a.a(this.f2927b, uri, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class k extends j {
        public k(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void g() {
            e.a.a(this.f2927b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void h(String str, Bundle bundle) {
            e.a.b(this.f2927b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void i(String str, Bundle bundle) {
            e.a.c(this.f2927b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void j(Uri uri, Bundle bundle) {
            e.a.d(this.f2927b, uri, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends h {

        /* renamed from: b, reason: collision with root package name */
        public android.support.v4.media.session.b f2928b;

        public l(android.support.v4.media.session.b bVar) {
            this.f2928b = bVar;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void a() {
            try {
                this.f2928b.o0();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in fastForward.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void b() {
            try {
                this.f2928b.pause();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in pause.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void c() {
            try {
                this.f2928b.play();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in play.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void d(String str, Bundle bundle) {
            try {
                this.f2928b.x(str, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in playFromMediaId.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void e(String str, Bundle bundle) {
            try {
                this.f2928b.R(str, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in playFromSearch.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void f(Uri uri, Bundle bundle) {
            try {
                this.f2928b.T(uri, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in playFromUri.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void g() {
            try {
                this.f2928b.prepare();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in prepare.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void h(String str, Bundle bundle) {
            try {
                this.f2928b.w(str, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in prepareFromMediaId.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void i(String str, Bundle bundle) {
            try {
                this.f2928b.j0(str, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in prepareFromSearch.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void j(Uri uri, Bundle bundle) {
            try {
                this.f2928b.t(uri, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in prepareFromUri.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void k() {
            try {
                this.f2928b.rewind();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in rewind.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void l(long j11) {
            try {
                this.f2928b.seekTo(j11);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in seekTo.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            n(customAction.b(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            try {
                this.f2928b.r(str, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in sendCustomAction.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void o(boolean z11) {
            try {
                this.f2928b.i(z11);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in setCaptioningEnabled.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void p(RatingCompat ratingCompat) {
            try {
                this.f2928b.g0(ratingCompat);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in setRating.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void q(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f2928b.y(ratingCompat, bundle);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in setRating.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void r(int i11) {
            try {
                this.f2928b.setRepeatMode(i11);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in setRepeatMode.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void s(int i11) {
            try {
                this.f2928b.l(i11);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in setShuffleMode.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void t() {
            try {
                this.f2928b.next();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in skipToNext.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void u() {
            try {
                this.f2928b.previous();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in skipToPrevious.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void v(long j11) {
            try {
                this.f2928b.c0(j11);
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in skipToQueueItem.", e11);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void w() {
            try {
                this.f2928b.stop();
            } catch (RemoteException e11) {
                Log.e(MediaControllerCompat.f2880d, "Dead object in stop.", e11);
            }
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat mediaSessionCompat) {
        e eVar;
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token i11 = mediaSessionCompat.i();
        this.f2889b = i11;
        try {
            eVar = new e(context, i11);
        } catch (RemoteException e11) {
            Log.w(f2880d, "Failed to create MediaControllerImpl.", e11);
            eVar = null;
        }
        this.f2888a = eVar;
    }

    public static void C(@NonNull Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof ComponentActivity) {
            ((ComponentActivity) activity).putExtraData(new b(mediaControllerCompat));
        }
        android.support.v4.media.session.c.t(activity, mediaControllerCompat != null ? android.support.v4.media.session.c.d(activity, mediaControllerCompat.r().g()) : null);
    }

    public static void F(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(MediaSessionCompat.f2935j) || str.equals(MediaSessionCompat.f2936k)) {
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.f2937l)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public static MediaControllerCompat g(@NonNull Activity activity) {
        if (activity instanceof ComponentActivity) {
            b bVar = (b) ((ComponentActivity) activity).getExtraData(b.class);
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }
        Object g11 = android.support.v4.media.session.c.g(activity);
        if (g11 == null) {
            return null;
        }
        try {
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.b(android.support.v4.media.session.c.p(g11)));
        } catch (RemoteException e11) {
            Log.e(f2880d, "Dead object in getMediaController.", e11);
            return null;
        }
    }

    @Deprecated
    public void A(int i11) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m11 = m();
        if (m11 == null || i11 < 0 || i11 >= m11.size() || (queueItem = m11.get(i11)) == null) {
            return;
        }
        z(queueItem.c());
    }

    public void B(@NonNull String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f2888a.c(str, bundle, resultReceiver);
    }

    public void D(int i11, int i12) {
        this.f2888a.e(i11, i12);
    }

    public void E(@NonNull a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        try {
            this.f2890c.remove(aVar);
            this.f2888a.a(aVar);
        } finally {
            aVar.o(null);
        }
    }

    public void a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f2888a.n(mediaDescriptionCompat);
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat, int i11) {
        this.f2888a.b(mediaDescriptionCompat, i11);
    }

    public void c(int i11, int i12) {
        this.f2888a.o(i11, i12);
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f2888a.p(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle e() {
        return this.f2888a.getExtras();
    }

    public long f() {
        return this.f2888a.getFlags();
    }

    public Object h() {
        return this.f2888a.r();
    }

    public MediaMetadataCompat i() {
        return this.f2888a.getMetadata();
    }

    public String j() {
        return this.f2888a.getPackageName();
    }

    public g k() {
        return this.f2888a.i();
    }

    public PlaybackStateCompat l() {
        return this.f2888a.getPlaybackState();
    }

    public List<MediaSessionCompat.QueueItem> m() {
        return this.f2888a.q();
    }

    public CharSequence n() {
        return this.f2888a.h();
    }

    public int o() {
        return this.f2888a.j();
    }

    public int p() {
        return this.f2888a.getRepeatMode();
    }

    public PendingIntent q() {
        return this.f2888a.d();
    }

    public MediaSessionCompat.Token r() {
        return this.f2889b;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle s() {
        return this.f2889b.e();
    }

    public int t() {
        return this.f2888a.k();
    }

    public h u() {
        return this.f2888a.l();
    }

    public boolean v() {
        return this.f2888a.g();
    }

    public boolean w() {
        return this.f2888a.f();
    }

    public void x(@NonNull a aVar) {
        y(aVar, null);
    }

    public void y(@NonNull a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.o(handler);
        this.f2888a.s(aVar, handler);
        this.f2890c.add(aVar);
    }

    public void z(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f2888a.m(mediaDescriptionCompat);
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f2889b = token;
            this.f2888a = new e(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2897a = android.support.v4.media.session.c.b(new b(this));

        /* renamed from: b, reason: collision with root package name */
        public HandlerC0029a f2898b;

        /* renamed from: c, reason: collision with root package name */
        public android.support.v4.media.session.a f2899c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        public class HandlerC0029a extends Handler {

            /* renamed from: c, reason: collision with root package name */
            public static final int f2900c = 1;

            /* renamed from: d, reason: collision with root package name */
            public static final int f2901d = 2;

            /* renamed from: e, reason: collision with root package name */
            public static final int f2902e = 3;

            /* renamed from: f, reason: collision with root package name */
            public static final int f2903f = 4;

            /* renamed from: g, reason: collision with root package name */
            public static final int f2904g = 5;

            /* renamed from: h, reason: collision with root package name */
            public static final int f2905h = 6;

            /* renamed from: i, reason: collision with root package name */
            public static final int f2906i = 7;

            /* renamed from: j, reason: collision with root package name */
            public static final int f2907j = 8;

            /* renamed from: k, reason: collision with root package name */
            public static final int f2908k = 9;

            /* renamed from: l, reason: collision with root package name */
            public static final int f2909l = 11;

            /* renamed from: m, reason: collision with root package name */
            public static final int f2910m = 12;

            /* renamed from: n, reason: collision with root package name */
            public static final int f2911n = 13;

            /* renamed from: a, reason: collision with root package name */
            public boolean f2912a;

            public HandlerC0029a(Looper looper) {
                super(looper);
                this.f2912a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f2912a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.b(data);
                            a.this.k((String) message.obj, data);
                            break;
                        case 2:
                            a.this.f((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            a.this.e((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            a.this.b((g) message.obj);
                            break;
                        case 5:
                            a.this.g((List) message.obj);
                            break;
                        case 6:
                            a.this.h((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.b(bundle);
                            a.this.d(bundle);
                            break;
                        case 8:
                            a.this.j();
                            break;
                        case 9:
                            a.this.i(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.c(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            a.this.m(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            a.this.l();
                            break;
                    }
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class b implements c.a {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f2914a;

            public b(a aVar) {
                this.f2914a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void a(List<?> list) {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.g(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void b(Object obj) {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.e(MediaMetadataCompat.b(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void c(String str, Bundle bundle) {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.k(str, bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void d(int i11, int i12, int i13, int i14, int i15) {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.b(new g(i11, i12, i13, i14, i15));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void e(Object obj) {
                a aVar = this.f2914a.get();
                if (aVar == null || aVar.f2899c != null) {
                    return;
                }
                aVar.f(PlaybackStateCompat.a(obj));
            }

            @Override // android.support.v4.media.session.c.a
            public void f() {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.j();
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void o(Bundle bundle) {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.d(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void p(CharSequence charSequence) {
                a aVar = this.f2914a.get();
                if (aVar != null) {
                    aVar.h(charSequence);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public android.support.v4.media.session.a a() {
            return this.f2899c;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            n(8, null, null);
        }

        public void n(int i11, Object obj, Bundle bundle) {
            HandlerC0029a handlerC0029a = this.f2898b;
            if (handlerC0029a != null) {
                Message obtainMessage = handlerC0029a.obtainMessage(i11, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void o(Handler handler) {
            if (handler != null) {
                HandlerC0029a handlerC0029a = new HandlerC0029a(handler.getLooper());
                this.f2898b = handlerC0029a;
                handlerC0029a.f2912a = true;
            } else {
                HandlerC0029a handlerC0029a2 = this.f2898b;
                if (handlerC0029a2 != null) {
                    handlerC0029a2.f2912a = false;
                    handlerC0029a2.removeCallbacksAndMessages(null);
                    this.f2898b = null;
                }
            }
        }

        public void j() {
        }

        public void l() {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class c extends a.AbstractBinderC0031a {

            /* renamed from: o, reason: collision with root package name */
            public final WeakReference<a> f2915o;

            public c(a aVar) {
                this.f2915o = new WeakReference<>(aVar);
            }

            public void X(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void Z(int i11) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(12, Integer.valueOf(i11), null);
                }
            }

            public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(5, list, null);
                }
            }

            public void e0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(4, parcelableVolumeInfo != null ? new g(parcelableVolumeInfo.f3044a, parcelableVolumeInfo.f3045b, parcelableVolumeInfo.f3046c, parcelableVolumeInfo.f3047d, parcelableVolumeInfo.f3048e) : null, null);
                }
            }

            public void f() throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(8, null, null);
                }
            }

            public void o(Bundle bundle) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void onRepeatModeChanged(int i11) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(9, Integer.valueOf(i11), null);
                }
            }

            public void p(CharSequence charSequence) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void p0(boolean z11) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(11, Boolean.valueOf(z11), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void v() throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void v0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.f2915o.get();
                if (aVar != null) {
                    aVar.n(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void q0(boolean z11) throws RemoteException {
            }
        }

        public void b(g gVar) {
        }

        public void c(boolean z11) {
        }

        public void d(Bundle bundle) {
        }

        public void e(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void f(PlaybackStateCompat playbackStateCompat) {
        }

        public void g(List<MediaSessionCompat.QueueItem> list) {
        }

        public void h(CharSequence charSequence) {
        }

        public void i(int i11) {
        }

        public void m(int i11) {
        }

        public void k(String str, Bundle bundle) {
        }
    }
}
