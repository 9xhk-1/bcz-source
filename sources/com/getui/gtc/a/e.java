package com.getui.gtc.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.getui.gtc.BuildConfig;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.heytap.mcssdk.constant.Constants;
import com.igexin.sdk.PushManager;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private String f29751a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29752b = true;

    /* renamed from: c, reason: collision with root package name */
    private long f29753c = Constants.MILLS_OF_LAUNCH_INTERVAL;

    private static String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BuildConfig.VERSION_NAME);
        sb2.append(",");
        try {
            Method declaredMethod = PushManager.class.getDeclaredMethod("getInstance", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Method declaredMethod2 = PushManager.class.getDeclaredMethod("getVersion", Context.class);
            declaredMethod2.setAccessible(true);
            sb2.append("GT-".concat(String.valueOf((String) declaredMethod2.invoke(invoke, GtcProvider.context()))));
            sb2.append(",");
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls = Class.forName("com.getui.gis.sdk.GInsightManager");
            Method declaredMethod3 = cls.getDeclaredMethod("getInstance", null);
            declaredMethod3.setAccessible(true);
            Object invoke2 = declaredMethod3.invoke(null, null);
            Method declaredMethod4 = cls.getDeclaredMethod("version", null);
            declaredMethod4.setAccessible(true);
            sb2.append((String) declaredMethod4.invoke(invoke2, null));
            sb2.append(",");
        } catch (Throwable unused2) {
        }
        try {
            Class<?> cls2 = Class.forName("com.getui.gs.sdk.GsManager");
            Method declaredMethod5 = cls2.getDeclaredMethod("getInstance", null);
            declaredMethod5.setAccessible(true);
            Object invoke3 = declaredMethod5.invoke(null, null);
            Method declaredMethod6 = cls2.getDeclaredMethod("getVersion", null);
            declaredMethod6.setAccessible(true);
            sb2.append((String) declaredMethod6.invoke(invoke3, null));
            sb2.append(",");
        } catch (Throwable unused3) {
        }
        try {
            Class<?> cls3 = Class.forName("com.g.gysdk.GYManager");
            Method declaredMethod7 = cls3.getDeclaredMethod("getInstance", null);
            declaredMethod7.setAccessible(true);
            Object invoke4 = declaredMethod7.invoke(null, null);
            Method declaredMethod8 = cls3.getDeclaredMethod("getVersion", null);
            declaredMethod8.setAccessible(true);
            sb2.append((String) declaredMethod8.invoke(invoke4, null));
            sb2.append(",");
        } catch (Throwable unused4) {
        }
        try {
            Class<?> cls4 = Class.forName("com.getui.ctid.CTIDManager");
            Method declaredMethod9 = cls4.getDeclaredMethod("getInstance", null);
            declaredMethod9.setAccessible(true);
            Object invoke5 = declaredMethod9.invoke(null, null);
            Method declaredMethod10 = cls4.getDeclaredMethod("getVersion", null);
            declaredMethod10.setAccessible(true);
            sb2.append((String) declaredMethod10.invoke(invoke5, null));
            sb2.append(",");
        } catch (Throwable unused5) {
        }
        try {
            Method declaredMethod11 = Class.forName("com.getui.iop.IopManager").getDeclaredMethod("getVersion", null);
            declaredMethod11.setAccessible(true);
            sb2.append((String) declaredMethod11.invoke(null, null));
            sb2.append(",");
        } catch (Throwable unused6) {
        }
        try {
            Class<?> cls5 = Class.forName("com.sdk.plus.WusManager");
            Method declaredMethod12 = cls5.getDeclaredMethod("getInstance", null);
            declaredMethod12.setAccessible(true);
            Object invoke6 = declaredMethod12.invoke(null, null);
            Method declaredMethod13 = cls5.getDeclaredMethod("getVersion", null);
            declaredMethod13.setAccessible(true);
            sb2.append((String) declaredMethod13.invoke(invoke6, null));
            sb2.append(",");
        } catch (Throwable unused7) {
        }
        try {
            Class<?> cls6 = Class.forName("com.getui.oneid.OneIDManager");
            Method declaredMethod14 = cls6.getDeclaredMethod("getInstance", null);
            declaredMethod14.setAccessible(true);
            Object invoke7 = declaredMethod14.invoke(null, null);
            Method declaredMethod15 = cls6.getDeclaredMethod("getVersion", null);
            declaredMethod15.setAccessible(true);
            sb2.append((String) declaredMethod15.invoke(invoke7, null));
            sb2.append(",");
        } catch (Throwable unused8) {
        }
        String sb3 = sb2.toString();
        return sb3.endsWith(",") ? sb3.substring(0, sb3.length() - 1) : sb3;
    }

    private static String b() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Bundle bundle = CommonUtil.getAppInfoForSelf(GtcProvider.context()).metaData;
            if (bundle == null) {
                return "";
            }
            a(bundle, sb2, "GETUI_APPID");
            a(bundle, sb2, "GETUI_APP_ID");
            a(bundle, sb2, com.igexin.push.core.b.f37730b);
            a(bundle, sb2, "GI_APPID");
            a(bundle, sb2, "GI_APP_ID");
            a(bundle, sb2, "GS_APPID");
            a(bundle, sb2, "GS_APP_ID");
            a(bundle, sb2, "GY_APPID");
            a(bundle, sb2, "GY_APP_ID");
            a(bundle, sb2, "com.sdk.plus.appid");
            String sb3 = sb2.toString();
            return sb3.endsWith(",") ? sb3.substring(0, sb3.length() - 1) : sb3;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return "";
        }
    }

    private static String c() {
        try {
            if (!d()) {
                return "0,-1";
            }
            return "1," + e();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return "0,-1";
        }
    }

    private static boolean d() {
        String str;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", null).invoke(cls, null));
        } catch (ClassNotFoundException unused) {
            str = "occured ClassNotFoundException";
            com.getui.gtc.i.c.a.c(str);
            return false;
        } catch (NoSuchMethodException unused2) {
            str = "occured NoSuchMethodException";
            com.getui.gtc.i.c.a.c(str);
            return false;
        } catch (Exception unused3) {
            str = "occur other problem";
            com.getui.gtc.i.c.a.c(str);
            return false;
        }
    }

    private static String e() {
        try {
            Method method = null;
            for (Method method2 : Class.forName("android.os.SystemProperties").getMethods()) {
                if (method2.getName().equals(ct.d.f46852f)) {
                    method = method2;
                }
            }
            return method != null ? (String) method.invoke(null, com.alipay.sdk.m.c.a.f10485b, "error") : "error";
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return "error";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113 A[Catch: Exception -> 0x012b, TryCatch #0 {Exception -> 0x012b, blocks: (B:35:0x00fe, B:39:0x0113, B:41:0x0128), top: B:34:0x00fe }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.a.e.run():void");
    }

    private static void a(Bundle bundle, StringBuilder sb2, String str) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(string);
        sb2.append(",");
    }
}
