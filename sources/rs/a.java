package rs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface a extends IInterface {
    void L(Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f84545a = "com.mcs.aidl.IMcsSdkService";

        /* renamed from: b, reason: collision with root package name */
        public static final int f84546b = 1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rs.a$b$a, reason: collision with other inner class name */
        public static class C1058a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f84547b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f84548a;

            public C1058a(IBinder iBinder) {
                this.f84548a = iBinder;
            }

            @Override // rs.a
            public void L(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f84545a);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f84548a.transact(1, obtain, obtain2, 0) || b.y0() == null) {
                        obtain2.readException();
                    } else {
                        b.y0().L(bundle);
                    }
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
                return this.f84548a;
            }

            public String x0() {
                return b.f84545a;
            }
        }

        public b() {
            attachInterface(this, f84545a);
        }

        public static a x0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f84545a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C1058a(iBinder) : (a) queryLocalInterface;
        }

        public static a y0() {
            return C1058a.f84547b;
        }

        public static boolean z0(a aVar) {
            if (C1058a.f84547b != null || aVar == null) {
                return false;
            }
            C1058a.f84547b = aVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 != 1) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(f84545a);
                return true;
            }
            parcel.enforceInterface(f84545a);
            L(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rs.a$a, reason: collision with other inner class name */
    public static class C1057a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // rs.a
        public void L(Bundle bundle) throws RemoteException {
        }
    }
}
