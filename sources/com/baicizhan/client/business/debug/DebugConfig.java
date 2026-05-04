package com.baicizhan.client.business.debug;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.baicizhan.client.business.util.NoProguard;
import l50.b;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DebugConfig implements NoProguard {
    private static volatile DebugConfig sInstance = new DebugConfig();
    public boolean enable = false;
    public boolean fixOptionPosition = false;
    public boolean webWhiteListEnable = true;
    public boolean residentPromotionAd = false;
    public int wantMoreCount = 25;
    public boolean minuteAsSecond = false;
    public boolean secondAsMinute = false;
    public boolean vldEntry = false;
    public boolean vldCameraAdding = false;

    public static DebugConfig getsIntance() {
        return sInstance;
    }

    public static void setInstance(DebugConfig debugConfig) {
        sInstance = debugConfig;
    }

    public void init(Context context) {
        this.enable = false;
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                return;
            }
            this.enable = true;
        } catch (Throwable th2) {
            c.c("DebugConfig", "", th2);
        }
    }

    public String toString() {
        return "DebugConfig{enable=" + this.enable + ", fixOptionPosition=" + this.fixOptionPosition + ", residentPromotionAd=" + this.residentPromotionAd + ", wantMoreCount=" + this.wantMoreCount + b.f69928j;
    }
}
