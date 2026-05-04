package com.igexin.assist.util;

import android.content.Context;
import com.igexin.sdk.PushManager;

/* loaded from: classes7.dex */
public class AssistUtils {
    public static final String BRAND_HON = "honor";
    public static final String BRAND_HW = "huawei";
    public static final String BRAND_MZ = "meizu";
    public static final String BRAND_OPPO = "oppo";
    public static final String BRAND_STP = "stp";
    public static final String BRAND_VIVO = "vivo";
    public static final String BRAND_XIAOMI = "xiaomi";

    /* renamed from: a, reason: collision with root package name */
    static String f37026a = "";

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (com.igexin.push.g.b.a(r0, com.igexin.assist.util.AssistUtils.BRAND_HON) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDeviceBrand() {
        /*
            java.lang.String r0 = com.igexin.assist.util.AssistUtils.f37026a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.igexin.assist.util.AssistUtils.f37026a
            return r0
        Lb:
            boolean r0 = com.igexin.push.config.d.U
            if (r0 == 0) goto L20
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "honor"
            boolean r0 = com.igexin.push.g.b.a(r0, r1)
            if (r0 == 0) goto L20
        L1d:
            com.igexin.assist.util.AssistUtils.f37026a = r1
            goto L7b
        L20:
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "huawei"
            boolean r0 = com.igexin.push.g.b.a(r0, r1)
            if (r0 == 0) goto L2f
            goto L1d
        L2f:
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "xiaomi"
            boolean r0 = com.igexin.push.g.b.a(r0, r1)
            if (r0 == 0) goto L3e
            goto L1d
        L3e:
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "oppo"
            boolean r0 = com.igexin.push.g.b.a(r0, r1)
            if (r0 == 0) goto L4d
            goto L1d
        L4d:
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "meizu"
            boolean r0 = com.igexin.push.g.b.a(r0, r1)
            if (r0 == 0) goto L5c
            goto L1d
        L5c:
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "vivo"
            boolean r0 = com.igexin.push.g.b.a(r0, r1)
            if (r0 == 0) goto L6b
            goto L1d
        L6b:
            android.content.Context r0 = com.igexin.push.core.ServiceManager.f37612b
            boolean r0 = com.igexin.push.g.b.a(r0)
            if (r0 == 0) goto L78
            java.lang.String r0 = "stp"
        L75:
            com.igexin.assist.util.AssistUtils.f37026a = r0
            goto L7b
        L78:
            java.lang.String r0 = android.os.Build.BRAND
            goto L75
        L7b:
            java.lang.String r0 = com.igexin.assist.util.AssistUtils.f37026a
            java.lang.String r0 = r0.toLowerCase()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.assist.util.AssistUtils.getDeviceBrand():java.lang.String");
    }

    public static void startGetuiService(Context context) {
        if (context != null) {
            try {
                PushManager.getInstance().initialize(context);
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }
}
