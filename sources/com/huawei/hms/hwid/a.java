package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static int a() {
        return 40004000;
    }

    public static void a(Activity activity, AvailableAdapter.AvailableCallBack availableCallBack) {
        as.b("HmsAccountKitVersionCheckUtil", "====== HMSSDK version: 61200300 ======", true);
        Context applicationContext = activity.getApplicationContext();
        int a11 = a();
        as.b("HmsAccountKitVersionCheckUtil", "check minVersion:" + a11, true);
        AvailableAdapter availableAdapter = new AvailableAdapter(a11);
        int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(applicationContext);
        if (isHuaweiMobileServicesAvailable == 0) {
            availableCallBack.onComplete(isHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
            availableAdapter.startResolution(activity, availableCallBack);
        } else {
            availableCallBack.onComplete(isHuaweiMobileServicesAvailable);
        }
    }
}
