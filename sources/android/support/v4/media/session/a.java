package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void X(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void Z(int i11) throws RemoteException;

    void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void e0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void f() throws RemoteException;

    void o(Bundle bundle) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;

    void onRepeatModeChanged(int i11) throws RemoteException;

    void p(CharSequence charSequence) throws RemoteException;

    void p0(boolean z11) throws RemoteException;

    void q0(boolean z11) throws RemoteException;

    void v() throws RemoteException;

    void v0(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0031a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3113a = "android.support.v4.media.session.IMediaControllerCallback";

        /* renamed from: b, reason: collision with root package name */
        public static final int f3114b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f3115c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f3116d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f3117e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f3118f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f3119g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f3120h = 7;

        /* renamed from: i, reason: collision with root package name */
        public static final int f3121i = 8;

        /* renamed from: j, reason: collision with root package name */
        public static final int f3122j = 9;

        /* renamed from: k, reason: collision with root package name */
        public static final int f3123k = 10;

        /* renamed from: l, reason: collision with root package name */
        public static final int f3124l = 11;

        /* renamed from: m, reason: collision with root package name */
        public static final int f3125m = 12;

        /* renamed from: n, reason: collision with root package name */
        public static final int f3126n = 13;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C0032a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f3127a;

            public C0032a(IBinder iBinder) {
                this.f3127a = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public void X(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3127a.transact(4, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void Z(int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    obtain.writeInt(i11);
                    this.f3127a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    obtain.writeTypedList(list);
                    this.f3127a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3127a;
            }

            @Override // android.support.v4.media.session.a
            public void e0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3127a.transact(8, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    this.f3127a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void o(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3127a.transact(7, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3127a.transact(1, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void onRepeatModeChanged(int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    obtain.writeInt(i11);
                    this.f3127a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void p(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3127a.transact(6, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void p0(boolean z11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    obtain.writeInt(z11 ? 1 : 0);
                    this.f3127a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void q0(boolean z11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    obtain.writeInt(z11 ? 1 : 0);
                    this.f3127a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void v() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    this.f3127a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void v0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0031a.f3113a);
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3127a.transact(3, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
            }

            public String x0() {
                return AbstractBinderC0031a.f3113a;
            }
        }

        public AbstractBinderC0031a() {
            attachInterface(this, f3113a);
        }

        public static a x0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f3113a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0032a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1598968902) {
                parcel2.writeString(f3113a);
                return true;
            }
            switch (i11) {
                case 1:
                    parcel.enforceInterface(f3113a);
                    onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface(f3113a);
                    f();
                    return true;
                case 3:
                    parcel.enforceInterface(f3113a);
                    v0(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface(f3113a);
                    X(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface(f3113a);
                    a(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface(f3113a);
                    p(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface(f3113a);
                    o(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface(f3113a);
                    e0(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface(f3113a);
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface(f3113a);
                    q0(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface(f3113a);
                    p0(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface(f3113a);
                    Z(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface(f3113a);
                    v();
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
