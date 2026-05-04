package hr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface b extends IInterface {
    void J(String str) throws RemoteException;

    int Y(boolean z11) throws RemoteException;

    int a0(String str, int i11) throws RemoteException;

    int m0() throws RemoteException;

    boolean n0() throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f59769a = "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature";

        /* renamed from: b, reason: collision with root package name */
        public static final int f59770b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f59771c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f59772d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f59773e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f59774f = 5;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: hr.b$a$a, reason: collision with other inner class name */
        public static class C0683a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f59775a;

            public C0683a(IBinder iBinder) {
                this.f59775a = iBinder;
            }

            @Override // hr.b
            public void J(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f59769a);
                    obtain.writeString(str);
                    this.f59775a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // hr.b
            public int Y(boolean z11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f59769a);
                    obtain.writeInt(z11 ? 1 : 0);
                    this.f59775a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // hr.b
            public int a0(String str, int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f59769a);
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    this.f59775a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59775a;
            }

            @Override // hr.b
            public int m0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f59769a);
                    this.f59775a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // hr.b
            public boolean n0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f59769a);
                    this.f59775a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x0() {
                return a.f59769a;
            }
        }

        public a() {
            attachInterface(this, f59769a);
        }

        public static b x0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f59769a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0683a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(f59769a);
                boolean n02 = n0();
                parcel2.writeNoException();
                parcel2.writeInt(n02 ? 1 : 0);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(f59769a);
                int Y = Y(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(Y);
                return true;
            }
            if (i11 == 3) {
                parcel.enforceInterface(f59769a);
                int m02 = m0();
                parcel2.writeNoException();
                parcel2.writeInt(m02);
                return true;
            }
            if (i11 == 4) {
                parcel.enforceInterface(f59769a);
                int a02 = a0(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a02);
                return true;
            }
            if (i11 != 5) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(f59769a);
                return true;
            }
            parcel.enforceInterface(f59769a);
            J(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
