package com.bun.miitmdid.provider.huawei;

import android.content.Context;
import com.bun.miitmdid.i0;
import com.bun.miitmdid.m;
import com.bun.miitmdid.provider.huawei.HWProvider;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.opendevice.OpenDevice;
import com.huawei.hms.support.api.opendevice.OdidResult;
import fr.h;
import fr.i;

/* loaded from: classes6.dex */
public class HWProvider extends m {
    public static final String TAG = "HWProvider";
    private AdvertisingIdClient.Info mAdvertisingIdInfo;
    private int mCallbackCount;
    public Context mContext;

    public HWProvider(Context context) {
        this.mContext = checkContext(context);
        i0.c(TAG, "enter into HWProvider");
    }

    public static /* synthetic */ void A0(HWProvider hWProvider, OdidResult odidResult) {
        hWProvider.getClass();
        hWProvider.VAIDCache = odidResult.getId();
        hWProvider.finishCallback();
        i0.a(TAG, "getVAID successfully, the VAID is " + hWProvider.VAIDCache);
    }

    private native void finishCallback();

    private native void initCallbackCount();

    private native boolean isClassExists(String str);

    public static /* synthetic */ void x0(HWProvider hWProvider, Exception exc) {
        hWProvider.finishCallback();
        i0.a(TAG, "getVAID failed, catch exception : " + exc);
    }

    public static /* synthetic */ void y0(HWProvider hWProvider, Exception exc) {
        hWProvider.finishCallback();
        i0.a(TAG, "getAAID failed, catch exception: " + exc);
    }

    public static /* synthetic */ void z0(HWProvider hWProvider, AAIDResult aAIDResult) {
        hWProvider.getClass();
        hWProvider.AAIDCache = aAIDResult.getId();
        hWProvider.finishCallback();
        i0.a(TAG, "getAAID successfully, aaid is " + hWProvider.AAIDCache);
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    public void getIdAAID() {
        if (!isGetOAID()) {
            this.isSupportedCache = true;
        }
        if (isClassExists("com.huawei.hms.opendevice.OpenDevice")) {
            HmsInstanceId.getInstance(this.mContext).getAAID().addOnSuccessListener(new i() { // from class: hl.a
                @Override // fr.i
                public final void onSuccess(Object obj) {
                    HWProvider.z0(HWProvider.this, (AAIDResult) obj);
                }
            }).addOnFailureListener(new h() { // from class: hl.b
                @Override // fr.h
                public final void onFailure(Exception exc) {
                    HWProvider.y0(HWProvider.this, exc);
                }
            });
            return;
        }
        i0.a(TAG, "no combined class to unsupport get AAID ");
        this.AAIDCache = "";
        finishCallback();
    }

    public native void getIdOAID();

    public void getIdVAID() {
        if (!isGetOAID()) {
            this.isSupportedCache = true;
        }
        if (isClassExists("com.huawei.hms.opendevice.OpenDevice")) {
            OpenDevice.getOpenDeviceClient(this.mContext).getOdid().addOnSuccessListener(new i() { // from class: hl.c
                @Override // fr.i
                public final void onSuccess(Object obj) {
                    HWProvider.A0(HWProvider.this, (OdidResult) obj);
                }
            }).addOnFailureListener(new h() { // from class: hl.d
                @Override // fr.h
                public final void onFailure(Exception exc) {
                    HWProvider.x0(HWProvider.this, exc);
                }
            });
            return;
        }
        i0.a(TAG, "no combined class to unsupport get VAID ");
        this.VAIDCache = "";
        finishCallback();
    }

    @Override // com.bun.miitmdid.m, com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isLimited();

    @Override // com.bun.miitmdid.m, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
