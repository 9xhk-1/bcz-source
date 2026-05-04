package com.baicizhan.client.business.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.WorkerThread;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.baicizhan.client.business.util.DeviceHelper;
import com.baicizhan.online.ad_property.AdDeviceInfo;
import com.huawei.hms.utils.HMSPackageManager;
import kotlin.Result;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AdCommonHelper {

    @m80.k
    public static final AdCommonHelper INSTANCE = new AdCommonHelper();

    @m80.k
    private static String mSystemUAStr = "";
    public static final int $stable = 8;

    private AdCommonHelper() {
    }

    @m80.l
    public final Object buildAdDeviceInfo(@m80.k j00.c<? super AdDeviceInfo> cVar) {
        return c40.i.h(h1.c(), new AdCommonHelper$buildAdDeviceInfo$2(null), cVar);
    }

    @WorkerThread
    @m80.k
    public final AdDeviceInfo buildAdDeviceInfoSync() {
        String str;
        Application a11 = pb.a.a();
        AdDeviceInfo adDeviceInfo = new AdDeviceInfo();
        try {
            x9.b bVar = x9.b.f97909a;
            Application a12 = pb.a.a();
            g0.o(a12, "getApp(...)");
            str = bVar.b(a12);
        } catch (Throwable th2) {
            qb.c.c(KotlinExtKt.TAG, "", th2);
            str = "FAILED";
        }
        adDeviceInfo.oaid = str;
        adDeviceInfo.aid = xb.o.a(a11);
        String str2 = Build.MANUFACTURER;
        adDeviceInfo.device_make = str2;
        adDeviceInfo.model = str2 + " " + Build.MODEL;
        adDeviceInfo.f28135ua = mSystemUAStr;
        adDeviceInfo.setCarrier(SimUtils.INSTANCE.getCurrentOperator());
        int i11 = 1;
        adDeviceInfo.setConnection_type(rb.d.b(a11) + 1);
        adDeviceInfo.setSw(xb.f.i(a11));
        adDeviceInfo.setSh(xb.f.f(a11));
        DeviceHelper.Companion companion = DeviceHelper.Companion;
        g0.m(a11);
        adDeviceInfo.setPpi((int) companion.getScreenPPI(a11));
        adDeviceInfo.setDpi(a11.getResources().getDisplayMetrics().densityDpi);
        adDeviceInfo.setDensity((int) a11.getResources().getDisplayMetrics().density);
        int i12 = a11.getResources().getConfiguration().orientation;
        if (i12 != 1) {
            i11 = 2;
            if (i12 != 2) {
                i11 = 0;
            }
        }
        adDeviceInfo.setOri(i11);
        adDeviceInfo.setApps(AdCommonHelperKt.getAdAppInstalledList());
        if (DeviceUtil.isHuawei()) {
            adDeviceInfo.setVer_code_hms(String.valueOf(HMSPackageManager.getInstance(a11).getHmsVersionCode()));
            try {
                Result.a aVar = Result.Companion;
                PackageInfo packageInfo = a11.getPackageManager().getPackageInfo("com.huawei.appmarket", 0);
                String str3 = packageInfo.versionName;
                Result.m6308constructorimpl(adDeviceInfo.setVer_code_ag(String.valueOf(packageInfo.versionCode)));
            } catch (Throwable th3) {
                Result.a aVar2 = Result.Companion;
                Result.m6308constructorimpl(kotlin.e.a(th3));
            }
        }
        return adDeviceInfo;
    }

    @m80.k
    public final String getMSystemUAStr() {
        return mSystemUAStr;
    }

    public final void initDefaultUAString(@m80.k Context context) {
        g0.p(context, "context");
        String userAgentString = new WebView(context).getSettings().getUserAgentString();
        g0.o(userAgentString, "getUserAgentString(...)");
        mSystemUAStr = userAgentString;
    }

    public final void setMSystemUAStr(@m80.k String str) {
        g0.p(str, "<set-?>");
        mSystemUAStr = str;
    }
}
