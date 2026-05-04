package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void A(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void B(boolean z11) throws RemoteException;

    void G(android.support.v4.media.session.a aVar) throws RemoteException;

    boolean H() throws RemoteException;

    void K(android.support.v4.media.session.a aVar) throws RemoteException;

    ParcelableVolumeInfo O() throws RemoteException;

    void R(String str, Bundle bundle) throws RemoteException;

    void T(Uri uri, Bundle bundle) throws RemoteException;

    boolean V(KeyEvent keyEvent) throws RemoteException;

    void W(MediaDescriptionCompat mediaDescriptionCompat, int i11) throws RemoteException;

    void c0(long j11) throws RemoteException;

    boolean g() throws RemoteException;

    void g0(RatingCompat ratingCompat) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    long getFlags() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    String getPackageName() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    String getTag() throws RemoteException;

    CharSequence h() throws RemoteException;

    void h0(int i11, int i12, String str) throws RemoteException;

    void i(boolean z11) throws RemoteException;

    int j() throws RemoteException;

    void j0(String str, Bundle bundle) throws RemoteException;

    int k() throws RemoteException;

    void l(int i11) throws RemoteException;

    void m(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void n(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void next() throws RemoteException;

    void o0() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    List<MediaSessionCompat.QueueItem> q() throws RemoteException;

    void r(String str, Bundle bundle) throws RemoteException;

    void rewind() throws RemoteException;

    boolean s() throws RemoteException;

    void s0(int i11, int i12, String str) throws RemoteException;

    void seekTo(long j11) throws RemoteException;

    void setRepeatMode(int i11) throws RemoteException;

    void stop() throws RemoteException;

    void t(Uri uri, Bundle bundle) throws RemoteException;

    PendingIntent u() throws RemoteException;

    void w(String str, Bundle bundle) throws RemoteException;

    void x(String str, Bundle bundle) throws RemoteException;

    void y(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void z(int i11) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends Binder implements b {
        public static final int A = 44;
        public static final int B = 33;
        public static final int C = 34;
        public static final int D = 35;
        public static final int E = 36;
        public static final int F = 13;
        public static final int G = 14;
        public static final int H = 15;
        public static final int I = 16;
        public static final int J = 17;
        public static final int K = 18;
        public static final int L = 19;
        public static final int M = 20;
        public static final int N = 21;
        public static final int O = 22;
        public static final int P = 23;
        public static final int Q = 24;
        public static final int R = 25;
        public static final int S = 51;
        public static final int T = 46;
        public static final int U = 39;
        public static final int V = 40;
        public static final int W = 48;
        public static final int X = 26;

        /* renamed from: a, reason: collision with root package name */
        public static final String f3128a = "android.support.v4.media.session.IMediaSession";

        /* renamed from: b, reason: collision with root package name */
        public static final int f3129b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f3130c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f3131d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f3132e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f3133f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f3134g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f3135h = 7;

        /* renamed from: i, reason: collision with root package name */
        public static final int f3136i = 8;

        /* renamed from: j, reason: collision with root package name */
        public static final int f3137j = 9;

        /* renamed from: k, reason: collision with root package name */
        public static final int f3138k = 10;

        /* renamed from: l, reason: collision with root package name */
        public static final int f3139l = 11;

        /* renamed from: m, reason: collision with root package name */
        public static final int f3140m = 12;

        /* renamed from: n, reason: collision with root package name */
        public static final int f3141n = 27;

        /* renamed from: o, reason: collision with root package name */
        public static final int f3142o = 28;

        /* renamed from: p, reason: collision with root package name */
        public static final int f3143p = 29;

        /* renamed from: q, reason: collision with root package name */
        public static final int f3144q = 30;

        /* renamed from: r, reason: collision with root package name */
        public static final int f3145r = 31;

        /* renamed from: s, reason: collision with root package name */
        public static final int f3146s = 32;

        /* renamed from: t, reason: collision with root package name */
        public static final int f3147t = 45;

        /* renamed from: u, reason: collision with root package name */
        public static final int f3148u = 37;

        /* renamed from: v, reason: collision with root package name */
        public static final int f3149v = 38;

        /* renamed from: w, reason: collision with root package name */
        public static final int f3150w = 47;

        /* renamed from: x, reason: collision with root package name */
        public static final int f3151x = 41;

        /* renamed from: y, reason: collision with root package name */
        public static final int f3152y = 42;

        /* renamed from: z, reason: collision with root package name */
        public static final int f3153z = 43;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C0033a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f3154a;

            public C0033a(IBinder iBinder) {
                this.f3154a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void A(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void B(boolean z11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(z11 ? 1 : 0);
                    this.f3154a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void G(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f3154a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean H() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void K(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f3154a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo O() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void R(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void T(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean V(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    boolean z11 = obtain2.readInt() != 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return z11;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void W(MediaDescriptionCompat mediaDescriptionCompat, int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i11);
                    this.f3154a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3154a;
            }

            @Override // android.support.v4.media.session.b
            public void c0(long j11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeLong(j11);
                    this.f3154a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void g0(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public long getFlags() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int getRepeatMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String getTag() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public CharSequence h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void h0(int i11, int i12, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(i11);
                    obtain.writeInt(i12);
                    obtain.writeString(str);
                    this.f3154a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void i(boolean z11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(z11 ? 1 : 0);
                    this.f3154a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void j0(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public int k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void l(int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(i11);
                    this.f3154a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void m(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void n(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void o0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void play() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void prepare() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public List<MediaSessionCompat.QueueItem> q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void r(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void rewind() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void s0(int i11, int i12, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(i11);
                    obtain.writeInt(i12);
                    obtain.writeString(str);
                    this.f3154a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeLong(j11);
                    this.f3154a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void setRepeatMode(int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(i11);
                    this.f3154a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void t(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent u() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    this.f3154a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void w(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void x(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public String x0() {
                return a.f3128a;
            }

            @Override // android.support.v4.media.session.b
            public void y(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3154a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void z(int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3128a);
                    obtain.writeInt(i11);
                    this.f3154a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f3128a);
        }

        public static b x0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f3128a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0033a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 51) {
                parcel.enforceInterface(f3128a);
                y(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i11 == 1598968902) {
                parcel2.writeString(f3128a);
                return true;
            }
            switch (i11) {
                case 1:
                    parcel.enforceInterface(f3128a);
                    A(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(f3128a);
                    boolean V2 = V(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(V2 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(f3128a);
                    G(a.AbstractBinderC0031a.x0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(f3128a);
                    K(a.AbstractBinderC0031a.x0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(f3128a);
                    boolean H2 = H();
                    parcel2.writeNoException();
                    parcel2.writeInt(H2 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f3128a);
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface(f3128a);
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface(f3128a);
                    PendingIntent u11 = u();
                    parcel2.writeNoException();
                    if (u11 != null) {
                        parcel2.writeInt(1);
                        u11.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(f3128a);
                    long flags = getFlags();
                    parcel2.writeNoException();
                    parcel2.writeLong(flags);
                    return true;
                case 10:
                    parcel.enforceInterface(f3128a);
                    ParcelableVolumeInfo O2 = O();
                    parcel2.writeNoException();
                    if (O2 != null) {
                        parcel2.writeInt(1);
                        O2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(f3128a);
                    s0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(f3128a);
                    h0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(f3128a);
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(f3128a);
                    x(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(f3128a);
                    R(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(f3128a);
                    T(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(f3128a);
                    c0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(f3128a);
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(f3128a);
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(f3128a);
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(f3128a);
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(f3128a);
                    o0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(f3128a);
                    rewind();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(f3128a);
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(f3128a);
                    g0(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(f3128a);
                    r(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(f3128a);
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    if (metadata != null) {
                        parcel2.writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface(f3128a);
                    PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    if (playbackState != null) {
                        parcel2.writeInt(1);
                        playbackState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface(f3128a);
                    List<MediaSessionCompat.QueueItem> q11 = q();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(q11);
                    return true;
                case 30:
                    parcel.enforceInterface(f3128a);
                    CharSequence h11 = h();
                    parcel2.writeNoException();
                    if (h11 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(h11, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface(f3128a);
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface(f3128a);
                    int j11 = j();
                    parcel2.writeNoException();
                    parcel2.writeInt(j11);
                    return true;
                case 33:
                    parcel.enforceInterface(f3128a);
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface(f3128a);
                    w(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(f3128a);
                    j0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(f3128a);
                    t(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(f3128a);
                    int repeatMode = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode);
                    return true;
                case 38:
                    parcel.enforceInterface(f3128a);
                    boolean s11 = s();
                    parcel2.writeNoException();
                    parcel2.writeInt(s11 ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface(f3128a);
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(f3128a);
                    B(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(f3128a);
                    n(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(f3128a);
                    W(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(f3128a);
                    m(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(f3128a);
                    z(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface(f3128a);
                    boolean g11 = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(g11 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface(f3128a);
                    i(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface(f3128a);
                    int k11 = k();
                    parcel2.writeNoException();
                    parcel2.writeInt(k11);
                    return true;
                case 48:
                    parcel.enforceInterface(f3128a);
                    l(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
