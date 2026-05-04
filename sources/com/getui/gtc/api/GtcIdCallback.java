package com.getui.gtc.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public interface GtcIdCallback extends IInterface {
    void onFailure(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements GtcIdCallback {
        private static final String DESCRIPTOR = "com.getui.gtc.api.GtcIdCallback";
        static final int TRANSACTION_onFailure = 1;
        static final int TRANSACTION_onSuccess = 2;

        public static class Proxy implements GtcIdCallback {
            public static GtcIdCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.getui.gtc.api.GtcIdCallback
            public void onFailure(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFailure(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.getui.gtc.api.GtcIdCallback
            public void onSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSuccess(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static GtcIdCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof GtcIdCallback)) ? new Proxy(iBinder) : (GtcIdCallback) queryLocalInterface;
        }

        public static GtcIdCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(GtcIdCallback gtcIdCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (gtcIdCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = gtcIdCallback;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailure(parcel.readString());
            } else {
                if (i11 != 2) {
                    if (i11 != 1598968902) {
                        return super.onTransact(i11, parcel, parcel2, i12);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements GtcIdCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.getui.gtc.api.GtcIdCallback
        public void onFailure(String str) throws RemoteException {
        }

        @Override // com.getui.gtc.api.GtcIdCallback
        public void onSuccess(String str) throws RemoteException {
        }
    }
}
