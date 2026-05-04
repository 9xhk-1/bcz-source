package ei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface b extends IInterface {

    /* renamed from: v0, reason: collision with root package name */
    public static final String f49843v0 = "com.baicizhan.main.unity.service.IMessageListener";

    void D(String result) throws RemoteException;

    void S(String command, String param) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ei.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0599b extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f49844a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f49845b = 2;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ei.b$b$a */
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f49846a;

            public a(IBinder remote) {
                this.f49846a = remote;
            }

            @Override // ei.b
            public void D(String result) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f49843v0);
                    obtain.writeString(result);
                    this.f49846a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ei.b
            public void S(String command, String param) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f49843v0);
                    obtain.writeString(command);
                    obtain.writeString(param);
                    this.f49846a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f49846a;
            }

            public String x0() {
                return b.f49843v0;
            }
        }

        public AbstractBinderC0599b() {
            attachInterface(this, b.f49843v0);
        }

        public static b x0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(b.f49843v0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(obj) : (b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(b.f49843v0);
            }
            if (code == 1598968902) {
                reply.writeString(b.f49843v0);
                return true;
            }
            if (code == 1) {
                D(data.readString());
                reply.writeNoException();
            } else {
                if (code != 2) {
                    return super.onTransact(code, data, reply, flags);
                }
                S(data.readString(), data.readString());
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
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // ei.b
        public void D(String result) throws RemoteException {
        }

        @Override // ei.b
        public void S(String command, String param) throws RemoteException {
        }
    }
}
