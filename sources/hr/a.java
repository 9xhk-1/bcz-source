package hr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface a extends IInterface {
    void U(String str, String str2) throws RemoteException;

    List l0() throws RemoteException;

    boolean w0(int i11) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: hr.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0681a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f59764a = "com.huawei.multimedia.audioengine.IHwAudioEngine";

        /* renamed from: b, reason: collision with root package name */
        public static final int f59765b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f59766c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f59767d = 3;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: hr.a$a$a, reason: collision with other inner class name */
        public static class C0682a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f59768a;

            public C0682a(IBinder iBinder) {
                this.f59768a = iBinder;
            }

            @Override // hr.a
            public void U(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0681a.f59764a);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f59768a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59768a;
            }

            @Override // hr.a
            public List l0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0681a.f59764a);
                    this.f59768a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // hr.a
            public boolean w0(int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0681a.f59764a);
                    obtain.writeInt(i11);
                    this.f59768a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x0() {
                return AbstractBinderC0681a.f59764a;
            }
        }

        public AbstractBinderC0681a() {
            attachInterface(this, f59764a);
        }

        public static a x0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f59764a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0682a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(f59764a);
                List l02 = l0();
                parcel2.writeNoException();
                parcel2.writeList(l02);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(f59764a);
                boolean w02 = w0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(w02 ? 1 : 0);
                return true;
            }
            if (i11 != 3) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(f59764a);
                return true;
            }
            parcel.enforceInterface(f59764a);
            U(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
