package ei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ei.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: u0, reason: collision with root package name */
    public static final String f49837u0 = "com.baicizhan.main.unity.service.IMessageChannel";

    void C(ei.b listener) throws RemoteException;

    void F(ei.b listener) throws RemoteException;

    void c(int intent) throws RemoteException;

    void i0(String message) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f49838a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f49839b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f49840c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f49841d = 4;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ei.a$b$a, reason: collision with other inner class name */
        public static class C0598a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f49842a;

            public C0598a(IBinder remote) {
                this.f49842a = remote;
            }

            @Override // ei.a
            public void C(ei.b listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f49837u0);
                    obtain.writeStrongInterface(listener);
                    this.f49842a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ei.a
            public void F(ei.b listener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f49837u0);
                    obtain.writeStrongInterface(listener);
                    this.f49842a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f49842a;
            }

            @Override // ei.a
            public void c(int intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f49837u0);
                    obtain.writeInt(intent);
                    this.f49842a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ei.a
            public void i0(String message) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f49837u0);
                    obtain.writeString(message);
                    this.f49842a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x0() {
                return a.f49837u0;
            }
        }

        public b() {
            attachInterface(this, a.f49837u0);
        }

        public static a x0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(a.f49837u0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0598a(obj) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(a.f49837u0);
            }
            if (code == 1598968902) {
                reply.writeString(a.f49837u0);
                return true;
            }
            if (code == 1) {
                C(b.AbstractBinderC0599b.x0(data.readStrongBinder()));
                reply.writeNoException();
            } else if (code == 2) {
                F(b.AbstractBinderC0599b.x0(data.readStrongBinder()));
                reply.writeNoException();
            } else if (code == 3) {
                i0(data.readString());
                reply.writeNoException();
            } else {
                if (code != 4) {
                    return super.onTransact(code, data, reply, flags);
                }
                c(data.readInt());
                reply.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ei.a$a, reason: collision with other inner class name */
    public static class C0597a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ei.a
        public void C(ei.b listener) throws RemoteException {
        }

        @Override // ei.a
        public void F(ei.b listener) throws RemoteException {
        }

        @Override // ei.a
        public void c(int intent) throws RemoteException {
        }

        @Override // ei.a
        public void i0(String message) throws RemoteException {
        }
    }
}
