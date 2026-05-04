package com.vivo.vms;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.vivo.vms.IPCCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface IPCInvoke extends IInterface {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Default implements IPCInvoke {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vivo.vms.IPCInvoke
        public Bundle asyncCall(Bundle bundle, IPCCallback iPCCallback) throws RemoteException {
            return null;
        }
    }

    Bundle asyncCall(Bundle bundle, IPCCallback iPCCallback) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Stub extends Binder implements IPCInvoke {
        private static final String DESCRIPTOR = "com.vivo.vms.IPCInvoke";
        static final int TRANSACTION_asyncCall = 1;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class Proxy implements IPCInvoke {
            public static IPCInvoke sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.vivo.vms.IPCInvoke
            public Bundle asyncCall(Bundle bundle, IPCCallback iPCCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iPCCallback != null ? iPCCallback.asBinder() : null);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Bundle asyncCall = Stub.getDefaultImpl().asyncCall(bundle, iPCCallback);
                        obtain2.recycle();
                        obtain.recycle();
                        return asyncCall;
                    }
                    obtain2.readException();
                    Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPCInvoke asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPCInvoke)) ? new Proxy(iBinder) : (IPCInvoke) queryLocalInterface;
        }

        public static IPCInvoke getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPCInvoke iPCInvoke) {
            if (Proxy.sDefaultImpl != null || iPCInvoke == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPCInvoke;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 != 1) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Bundle asyncCall = asyncCall(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IPCCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            if (asyncCall != null) {
                parcel2.writeInt(1);
                asyncCall.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
