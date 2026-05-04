package com.igexin.assist.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.heytap.msp.push.HeytapPushManager;
import com.igexin.assist.control.AbstractPushManager;
import com.igexin.assist.util.AssistUtils;
import com.igexin.c.a.c.a.d;
import com.igexin.push.core.e;
import com.igexin.push.core.e.f;
import com.igexin.push.g.n;
import com.meizu.cloud.pushsdk.PushManager;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37021a = "AssistMangerFactory";

    /* renamed from: c, reason: collision with root package name */
    private static final String f37022c = "com.igexin.assist.control.fcm.ManufacturePushManager";

    /* renamed from: d, reason: collision with root package name */
    private static a f37023d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f37024e = {"com.igexin.assist.control.xiaomi.MiuiPushManager", "com.igexin.assist.control.meizu.FlymePushManager", "com.igexin.assist.control.huawei.HmsPushManager", "com.igexin.assist.control.oppo.OppoPushManager", "com.igexin.assist.control.vivo.VivoPushManager", "com.igexin.assist.control.st.SmartisanPushManager", "com.igexin.assist.control.fcm.FcmPushManager"};

    /* renamed from: b, reason: collision with root package name */
    public AbstractPushManager f37025b;

    private void b(Context context) {
        String str;
        AbstractPushManager abstractPushManager = this.f37025b;
        if (abstractPushManager != null && abstractPushManager.isSupport()) {
            if (this.f37025b.getBrandCode().equals("3")) {
                try {
                    Class.forName("com.xiaomi.mipush.sdk.MiPushClient").getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                    com.igexin.c.a.c.a.a("AssistMangerFactory | cancelAllAssistNotification() err " + th2.toString(), new Object[0]);
                }
                str = " cancelAllAssistNotification() XM ";
            } else {
                if (!this.f37025b.getBrandCode().equals("4")) {
                    return;
                }
                try {
                    PushManager.class.getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
                } catch (Throwable th3) {
                    com.igexin.c.a.c.a.a(th3);
                    com.igexin.c.a.c.a.a("AssistMangerFactory | cancelAllAssistNotification() err " + th3.toString(), new Object[0]);
                }
                str = " cancelAllAssistNotification() MZ ";
            }
            com.igexin.c.a.c.a.b(f37021a, str);
        }
    }

    private static void c(Context context) {
        try {
            Class.forName("com.xiaomi.mipush.sdk.MiPushClient").getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a("AssistMangerFactory | cancelAllAssistNotification() err " + th2.toString(), new Object[0]);
        }
        com.igexin.c.a.c.a.b(f37021a, " cancelAllAssistNotification() XM ");
    }

    private static void d() {
        for (String str : f37024e) {
            try {
                Class.forName(str);
                d.a().a("UnSupport plugin [" + str + "]. Please change plugin to 3.0.");
                return;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    private String e() {
        AbstractPushManager abstractPushManager = this.f37025b;
        return abstractPushManager == null ? "" : abstractPushManager.getBrandCode();
    }

    private String f() {
        Object invoke;
        AbstractPushManager abstractPushManager = this.f37025b;
        String str = "";
        if (abstractPushManager == null) {
            return "";
        }
        String name = abstractPushManager.getClass().getName();
        try {
            if (!name.contains("fcm")) {
                if (name.contains("xiaomi")) {
                    Field declaredField = this.f37025b.getClass().getDeclaredField("XIAOMI_VERSION");
                    boolean isAccessible = declaredField.isAccessible();
                    declaredField.setAccessible(true);
                    String str2 = (String) declaredField.get(this.f37025b.getClass());
                    try {
                        declaredField.setAccessible(isAccessible);
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        str = str2;
                        com.igexin.c.a.c.a.a(th);
                        return str;
                    }
                }
                if (name.contains("huawei")) {
                    return ((String) n.b(e.f38035l).metaData.get("com.huawei.hms.client.service.name:push")).split(":")[1];
                }
                if (name.contains("oppo")) {
                    invoke = HeytapPushManager.class.getDeclaredMethod("getSDKVersionName", null).invoke(HeytapPushManager.class, null);
                } else if (name.contains(AssistUtils.BRAND_STP)) {
                    Class<?> cls = Class.forName("com.gtups.sdk.PushManager");
                    invoke = cls.getDeclaredMethod("getVersion", Context.class).invoke(cls.getDeclaredMethod("getInstance", null).invoke(cls, null), e.f38035l);
                } else {
                    if (name.contains("vivo")) {
                        ApplicationInfo b11 = n.b(e.f38035l);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b11.metaData.getInt("sdk_version_vivo"));
                        return sb2.toString();
                    }
                    if (name.contains("meizu")) {
                        for (Field field : PushManager.class.getDeclaredFields()) {
                            if (Modifier.isFinal(field.getModifiers()) && "TAG".equals(field.getName())) {
                                str = (String) field.get(null);
                            }
                        }
                    }
                }
                return (String) invoke;
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final AbstractPushManager a(Context context) {
        String lowerCase = AssistUtils.getDeviceBrand().toLowerCase();
        if (com.igexin.push.config.d.M.contains(lowerCase)) {
            com.igexin.c.a.c.a.a("AssistMangerFactory|getPushManager = null, setToken = false", new Object[0]);
            f.a().b("false");
            return null;
        }
        try {
            this.f37025b = (AbstractPushManager) Class.forName("com.igexin.assist.control." + lowerCase + ".ManufacturePushManager").getConstructor(Context.class).newInstance(context);
        } catch (Throwable th2) {
            d.a().a(lowerCase + " PushManager = null " + th2.toString());
        }
        if (this.f37025b == null) {
            try {
                com.igexin.c.a.c.a.a("AssistMangerFactory|try init fcm push", new Object[0]);
                AbstractPushManager abstractPushManager = (AbstractPushManager) Class.forName(f37022c).getConstructor(Context.class).newInstance(context);
                this.f37025b = abstractPushManager;
                if (!abstractPushManager.isSupport()) {
                    this.f37025b = null;
                }
            } catch (Throwable th3) {
                d.a().a(lowerCase + " Fcm PushManager = null");
                StringBuilder sb2 = new StringBuilder("|Fcm ManufacturePushManager = null ");
                sb2.append(th3.toString());
                com.igexin.c.a.c.a.b(f37021a, sb2.toString());
                if (!e.b().booleanValue()) {
                    f.a().b("false");
                }
                if (th3 instanceof ClassNotFoundException) {
                    d();
                }
            }
        }
        if (this.f37025b == null && !e.b().booleanValue()) {
            f.a().b("false");
        }
        StringBuilder sb3 = new StringBuilder("AssistMangerFactory|ManufacturePushManager is null = ");
        sb3.append(this.f37025b == null);
        com.igexin.c.a.c.a.a(sb3.toString(), new Object[0]);
        return this.f37025b;
    }

    public static a a() {
        if (f37023d == null) {
            synchronized (AbstractPushManager.class) {
                try {
                    if (f37023d == null) {
                        f37023d = new a();
                    }
                } finally {
                }
            }
        }
        return f37023d;
    }

    private static void d(Context context) {
        try {
            PushManager.class.getDeclaredMethod("clearNotification", Context.class).invoke(null, context);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a("AssistMangerFactory | cancelAllAssistNotification() err " + th2.toString(), new Object[0]);
        }
        com.igexin.c.a.c.a.b(f37021a, " cancelAllAssistNotification() MZ ");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|7|(2:9|10)|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        com.igexin.c.a.c.a.a(com.igexin.assist.sdk.a.f37021a, r0.getMessage());
        r0 = f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] b() {
        /*
            r4 = this;
            com.igexin.assist.control.AbstractPushManager r0 = r4.f37025b
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            java.lang.String[] r0 = new java.lang.String[]{r1, r1}
            return r0
        Lb:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "PLUGIN_VERSION"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L30
            boolean r2 = r0.isAccessible()     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L30
            com.igexin.assist.control.AbstractPushManager r3 = r4.f37025b     // Catch: java.lang.Throwable -> L30
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L2d
            goto L35
        L2d:
            r0 = move-exception
            r1 = r3
            goto L31
        L30:
            r0 = move-exception
        L31:
            com.igexin.c.a.c.a.a(r0)
            r3 = r1
        L35:
            com.igexin.assist.control.AbstractPushManager r0 = r4.f37025b     // Catch: java.lang.Throwable -> L4b
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = "getBrandSdkVersion"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L4b
            com.igexin.assist.control.AbstractPushManager r1 = r4.f37025b     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4b
            goto L59
        L4b:
            r0 = move-exception
            java.lang.String r1 = "AssistMangerFactory"
            java.lang.String r0 = r0.getMessage()
            com.igexin.c.a.c.a.a(r1, r0)
            java.lang.String r0 = r4.f()
        L59:
            java.lang.String[] r0 = new java.lang.String[]{r3, r0}
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.assist.sdk.a.b():java.lang.String[]");
    }

    public final boolean c() {
        AbstractPushManager abstractPushManager;
        if (com.igexin.push.config.d.M.contains(AssistUtils.getDeviceBrand().toLowerCase()) || (abstractPushManager = this.f37025b) == null) {
            return false;
        }
        return abstractPushManager.isSupport();
    }
}
