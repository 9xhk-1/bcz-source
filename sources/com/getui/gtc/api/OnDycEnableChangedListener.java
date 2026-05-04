package com.getui.gtc.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes6.dex */
public interface OnDycEnableChangedListener extends IInterface {
    void onDycEnableChanged(Map map) throws RemoteException;

    public static abstract class Stub extends Binder implements OnDycEnableChangedListener {
        private static final String DESCRIPTOR = "com.getui.gtc.api.OnDycEnableChangedListener";
        static final int TRANSACTION_onDycEnableChanged = 1;

        public static class Proxy implements OnDycEnableChangedListener {
            public static OnDycEnableChangedListener sDefaultImpl;
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

            @Override // com.getui.gtc.api.OnDycEnableChangedListener
            public void onDycEnableChanged(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDycEnableChanged(map);
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

        public static OnDycEnableChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof OnDycEnableChangedListener)) ? new Proxy(iBinder) : (OnDycEnableChangedListener) queryLocalInterface;
        }

        public static OnDycEnableChangedListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(OnDycEnableChangedListener onDycEnableChangedListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (onDycEnableChangedListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = onDycEnableChangedListener;
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
            onDycEnableChanged(parcel.readHashMap(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class Default implements OnDycEnableChangedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.getui.gtc.api.OnDycEnableChangedListener
        public void onDycEnableChanged(Map map) throws RemoteException {
        }
    }
}
