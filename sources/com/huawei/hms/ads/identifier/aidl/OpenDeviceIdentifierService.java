package com.huawei.hms.ads.identifier.aidl;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes7.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    public static abstract class Stub {
        private static final String DESCRIPTOR = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
        public static final int TRANSACTION_GETOAID = 1;
        public static final int TRANSACTION_ISOAIDTRACKLIMITED = 2;

        public static class Proxy implements OpenDeviceIdentifierService {
            private IBinder mBinderRemote;

            public Proxy(IBinder iBinder) {
                this.mBinderRemote = iBinder;
            }

            @Override // android.os.IInterface
            public native IBinder asBinder();

            public native String getInterfaceDescriptor();

            @Override // com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService
            public native String getOaid();

            @Override // com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService
            public native boolean isOaidTrackLimited();
        }

        public static native OpenDeviceIdentifierService asInterface(IBinder iBinder);
    }

    String getOaid();

    boolean isOaidTrackLimited();
}
