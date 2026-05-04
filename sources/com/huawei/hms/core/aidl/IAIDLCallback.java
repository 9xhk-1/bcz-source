package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface IAIDLCallback extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.core.aidl.IAIDLCallback";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t11, int i11) {
            if (t11 != null) {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void call(DataBuffer dataBuffer) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Stub extends Binder implements IAIDLCallback {
        static final int TRANSACTION_call = 1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements IAIDLCallback {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f35605a;

            public a(IBinder iBinder) {
                this.f35605a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f35605a;
            }

            @Override // com.huawei.hms.core.aidl.IAIDLCallback
            public void call(DataBuffer dataBuffer) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAIDLCallback.DESCRIPTOR);
                    a.b(obtain, dataBuffer, 0);
                    this.f35605a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAIDLCallback.DESCRIPTOR);
        }

        public static IAIDLCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAIDLCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAIDLCallback)) ? new a(iBinder) : (IAIDLCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(IAIDLCallback.DESCRIPTOR);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(IAIDLCallback.DESCRIPTOR);
                return true;
            }
            if (i11 != 1) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            call((DataBuffer) a.b(parcel, DataBuffer.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
