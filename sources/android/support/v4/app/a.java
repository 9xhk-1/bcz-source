package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
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

    /* renamed from: a0, reason: collision with root package name */
    public static final String f2692a0 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

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

    void cancel(String str, int i11, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i11, String str2, Notification notification) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends Binder implements a {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: android.support.v4.app.a$b$a, reason: collision with other inner class name */
        public static class C0024a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f2693a;

            public C0024a(IBinder iBinder) {
                this.f2693a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2693a;
            }

            @Override // android.support.v4.app.a
            public void cancel(String str, int i11, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f2692a0);
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    this.f2693a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void cancelAll(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f2692a0);
                    obtain.writeString(str);
                    this.f2693a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void notify(String str, int i11, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f2692a0);
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    c.d(obtain, notification, 0);
                    this.f2693a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String x0() {
                return a.f2692a0;
            }
        }

        public b() {
            attachInterface(this, a.f2692a0);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f2692a0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0024a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            String str = a.f2692a0;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 == 1) {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) c.c(parcel, Notification.CREATOR));
            } else if (i11 == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i11 != 3) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                cancelAll(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    public static class C0023a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.a
        public void cancelAll(String str) throws RemoteException {
        }

        @Override // android.support.v4.app.a
        public void cancel(String str, int i11, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.a
        public void notify(String str, int i11, String str2, Notification notification) throws RemoteException {
        }
    }
}
