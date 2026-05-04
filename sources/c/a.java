package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c0, reason: collision with root package name */
    public static final String f7445c0 = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t11, int i11) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            }
        }
    }

    void b(int i11, Bundle bundle) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7446a = 1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: c.a$b$a, reason: collision with other inner class name */
        public static class C0127a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f7447a;

            public C0127a(IBinder iBinder) {
                this.f7447a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7447a;
            }

            @Override // c.a
            public void b(int i11, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f7445c0);
                    obtain.writeInt(i11);
                    c.d(obtain, bundle, 0);
                    this.f7447a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String x0() {
                return a.f7445c0;
            }
        }

        public b() {
            attachInterface(this, a.f7445c0);
        }

        public static a x0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f7445c0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0127a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            String str = a.f7445c0;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            b(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static class C0126a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // c.a
        public void b(int i11, Bundle bundle) throws RemoteException {
        }
    }
}
