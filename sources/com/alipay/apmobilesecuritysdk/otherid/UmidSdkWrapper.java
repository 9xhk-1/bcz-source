package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import com.alipay.sdk.m.b0.d;
import com.alipay.sdk.m.z.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class UmidSdkWrapper {
    public static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    public static final String UMIDTOKEN_KEY_NAME = "umidtk";
    public static volatile String cachedUmidToken = "";
    public static volatile boolean initUmidFinished = false;

    public static String compatUmidBug(Context context, String str) {
        if (!a.a(str) && !a.a(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains("?")) {
            utdid = "";
        }
        return a.a(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        String str;
        synchronized (UmidSdkWrapper.class) {
            str = cachedUmidToken;
        }
        return str;
    }

    public static String startUmidTaskSync(Context context, int i11) {
        return "";
    }

    public static synchronized void updateLocalUmidToken(Context context, String str) {
        synchronized (UmidSdkWrapper.class) {
            if (a.b(str)) {
                d.a(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME, str);
                cachedUmidToken = str;
            }
        }
    }
}
