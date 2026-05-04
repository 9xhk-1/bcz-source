package com.igexin.push;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes7.dex */
public interface GtPushInterface extends IInterface {

    public static class Default implements GtPushInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.igexin.push.GtPushInterface
        public String getVersion() throws RemoteException {
            return null;
        }

        @Override // com.igexin.push.GtPushInterface
        public boolean loadSdk(Bundle bundle) throws RemoteException {
            return false;
        }
    }

    String getVersion() throws RemoteException;

    boolean loadSdk(Bundle bundle) throws RemoteException;

    public static abstract class Stub extends Binder implements GtPushInterface {
        private static final String DESCRIPTOR = "com.igexin.push.GtPushInterface";
        static final int TRANSACTION_getVersion = 1;
        static final int TRANSACTION_loadSdk = 2;

        public static class Proxy implements GtPushInterface {
            public static GtPushInterface sDefaultImpl;
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

            @Override // com.igexin.push.GtPushInterface
            public String getVersion() throws RemoteException {
                String readString;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        readString = obtain2.readString();
                    } else {
                        readString = Stub.getDefaultImpl().getVersion();
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.igexin.push.GtPushInterface
            public boolean loadSdk(Bundle bundle) throws RemoteException {
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
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        boolean loadSdk = Stub.getDefaultImpl().loadSdk(bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return loadSdk;
                    }
                    obtain2.readException();
                    boolean z11 = obtain2.readInt() != 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return z11;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static GtPushInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof GtPushInterface)) ? new Proxy(iBinder) : (GtPushInterface) queryLocalInterface;
        }

        public static GtPushInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(GtPushInterface gtPushInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (gtPushInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = gtPushInterface;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String version = getVersion();
                parcel2.writeNoException();
                parcel2.writeString(version);
                return true;
            }
            if (i11 != 2) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            boolean loadSdk = loadSdk(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            parcel2.writeInt(loadSdk ? 1 : 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
