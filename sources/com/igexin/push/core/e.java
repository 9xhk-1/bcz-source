package com.igexin.push.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.Constants;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.extension.mod.PushTaskBean;
import com.igexin.push.g.o;
import com.igexin.sdk.main.SdkInitSwitch;
import com.igexin.sdk.main.SdkPushSwitch;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class e {
    public static String A = null;
    public static String B = null;
    public static String C = null;
    public static String D = null;
    public static String E = null;
    public static String F = null;
    public static String G = null;
    public static String H = null;
    public static String I = null;
    public static String K = null;
    public static String L = null;
    public static String M = null;
    public static String Z = null;

    /* renamed from: a, reason: collision with root package name */
    public static String f37998a = "";
    public static int aA = 0;
    public static byte[] aB = null;
    public static long aH = 0;
    private static final String aN = "CoreRuntimeInfo";
    private static Map<String, Integer> aO = null;

    /* renamed from: ac, reason: collision with root package name */
    public static String f38001ac = null;

    /* renamed from: ad, reason: collision with root package name */
    public static byte[] f38002ad = null;

    /* renamed from: ae, reason: collision with root package name */
    public static boolean f38003ae = false;

    /* renamed from: af, reason: collision with root package name */
    public static boolean f38004af = false;

    /* renamed from: ag, reason: collision with root package name */
    public static boolean f38005ag = false;

    /* renamed from: ah, reason: collision with root package name */
    public static Map<String, PushTaskBean> f38006ah = null;

    /* renamed from: ai, reason: collision with root package name */
    public static Map<String, Integer> f38007ai = null;

    /* renamed from: aj, reason: collision with root package name */
    public static Map<String, HashSet<String>> f38008aj = null;

    /* renamed from: ak, reason: collision with root package name */
    public static Map<String, Integer> f38009ak = null;

    /* renamed from: al, reason: collision with root package name */
    public static HashMap<String, Long> f38010al = null;

    /* renamed from: an, reason: collision with root package name */
    public static String f38012an = null;

    /* renamed from: ao, reason: collision with root package name */
    public static long f38013ao = 0;

    /* renamed from: ap, reason: collision with root package name */
    public static String f38014ap = null;

    /* renamed from: aq, reason: collision with root package name */
    public static String f38015aq = null;

    /* renamed from: ar, reason: collision with root package name */
    public static String f38016ar = null;

    /* renamed from: as, reason: collision with root package name */
    public static String f38017as = null;

    /* renamed from: at, reason: collision with root package name */
    public static String f38018at = null;

    /* renamed from: au, reason: collision with root package name */
    public static String f38019au = null;

    /* renamed from: av, reason: collision with root package name */
    public static long f38020av = 0;

    /* renamed from: aw, reason: collision with root package name */
    public static long f38021aw = 0;

    /* renamed from: ax, reason: collision with root package name */
    public static volatile long f38022ax = 0;

    /* renamed from: ay, reason: collision with root package name */
    public static long f38023ay = 0;

    /* renamed from: az, reason: collision with root package name */
    public static boolean f38024az = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f38025b = "";

    /* renamed from: c, reason: collision with root package name */
    public static long f38026c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static String f38027d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f38028e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f38029f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f38030g = "";

    /* renamed from: h, reason: collision with root package name */
    public static String f38031h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f38032i = "";

    /* renamed from: j, reason: collision with root package name */
    public static int f38033j;

    /* renamed from: k, reason: collision with root package name */
    public static int f38034k;

    /* renamed from: l, reason: collision with root package name */
    public static Context f38035l;

    /* renamed from: s, reason: collision with root package name */
    public static volatile boolean f38042s;

    /* renamed from: u, reason: collision with root package name */
    public static volatile boolean f38044u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f38045v;

    /* renamed from: m, reason: collision with root package name */
    public static AtomicBoolean f38036m = new AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public static boolean f38037n = true;

    /* renamed from: o, reason: collision with root package name */
    public static HashMap<String, ClassLoader> f38038o = new HashMap<>();

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f38039p = true;

    /* renamed from: q, reason: collision with root package name */
    public static volatile boolean f38040q = false;

    /* renamed from: r, reason: collision with root package name */
    public static int f38041r = 0;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f38043t = true;

    /* renamed from: w, reason: collision with root package name */
    public static AtomicBoolean f38046w = new AtomicBoolean(true);

    /* renamed from: x, reason: collision with root package name */
    public static int f38047x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static int f38048y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static long f38049z = 0;
    public static int J = -1;
    public static String N = "";
    public static long O = -1;
    public static long P = -1;
    public static long Q = 0;
    public static long R = 0;
    public static long S = 0;
    public static long T = 0;
    public static long U = 0;
    public static String V = null;
    public static boolean W = false;
    public static long X = 0;
    public static long Y = 0;

    /* renamed from: aa, reason: collision with root package name */
    public static long f37999aa = 0;

    /* renamed from: ab, reason: collision with root package name */
    public static int f38000ab = 0;

    /* renamed from: am, reason: collision with root package name */
    public static int f38011am = 0;
    public static String aC = null;
    public static int aD = 3600;
    public static boolean aE = false;
    public static long aF = Constants.MILLS_OF_WATCH_DOG;
    public static long aG = Constants.MILLS_OF_WATCH_DOG;
    public static String aI = "oppo r9";
    public static int aJ = 200;
    public static String aK = "";
    public static String aL = "";
    private static String aP = "";
    public static boolean aM = false;

    public static int a(String str) {
        int intValue;
        synchronized (e.class) {
            try {
                if (aO.get(str) == null) {
                    aO.put(str, 0);
                }
                intValue = aO.get(str).intValue() - 1;
                aO.put(str, Integer.valueOf(intValue));
                if (intValue == 0) {
                    aO.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return intValue;
    }

    public static Boolean b() {
        return Boolean.valueOf(aP.equals("*"));
    }

    private static void c() {
        if (new SdkInitSwitch(f38035l).isSwitchOn()) {
            com.igexin.push.core.d.d.a().a("i", Boolean.TRUE);
            new SdkInitSwitch(f38035l).delete();
        }
        if (new SdkPushSwitch(f38035l).isSwitchOn()) {
            f38042s = true;
            com.igexin.push.core.d.d.a().a("p", Boolean.TRUE);
            new SdkPushSwitch(f38035l).delete();
        }
    }

    private static String d() {
        return SDKUrlConfig.getConfigServiceUrl();
    }

    private static boolean e() {
        try {
            ApplicationInfo b11 = com.igexin.push.g.n.b(f38035l);
            if (b11 == null || b11.metaData == null) {
                return false;
            }
            String a11 = com.igexin.push.g.d.a(b11);
            if (TextUtils.isEmpty(a11)) {
                a11 = b11.metaData.getString(b.f37730b);
            }
            if (TextUtils.isEmpty(a11)) {
                a11 = b11.metaData.getString("GETUI_APPID");
            }
            if (a11 != null) {
                a11 = a11.trim();
            }
            f38025b = b11.metaData.getString(b.f37732d);
            String string = b11.metaData.getString(b.f37733e);
            if (string != null) {
                aP = string;
            }
            if (TextUtils.isEmpty(a11)) {
                com.igexin.c.a.c.a.a(aN, "getui sdk init error, missing parm ######");
                com.igexin.c.a.c.a.a("CoreRuntimeInfo|getui sdk init error, missing parm #####", new Object[0]);
                return false;
            }
            f37998a = a11;
            f38029f = SDKUrlConfig.getLocation();
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    private static void f() {
        if (Build.VERSION.SDK_INT < 29) {
            System.currentTimeMillis();
            D = com.igexin.push.g.n.g();
            System.currentTimeMillis();
            E = com.igexin.push.g.n.f();
            System.currentTimeMillis();
        }
        F = com.igexin.push.g.n.e();
        G = com.igexin.push.g.n.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (com.igexin.sdk.PushService.class.isAssignableFrom(r2) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            com.igexin.push.core.ServiceManager.getInstance()
            android.content.Context r0 = com.igexin.push.core.e.f38035l
            java.lang.String r0 = com.igexin.push.core.ServiceManager.d(r0)
            com.igexin.push.core.ServiceManager.getInstance()
            android.content.Context r1 = com.igexin.push.core.e.f38035l
            java.lang.String r1 = com.igexin.push.core.ServiceManager.e(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2e
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Class<com.igexin.sdk.PushService> r3 = com.igexin.sdk.PushService.class
            if (r2 == r3) goto L29
            boolean r2 = r3.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2e
            goto L29
        L27:
            r2 = move-exception
            goto L2b
        L29:
            r1 = 0
            goto L2e
        L2b:
            com.igexin.c.a.c.a.a(r2)
        L2e:
            java.lang.Class<com.igexin.sdk.GService> r2 = com.igexin.sdk.GService.class
            java.lang.String r2 = r2.getName()
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            int r1 = com.igexin.push.config.e.b()
            r2 = 0
        L3d:
            r3 = 3
            if (r2 >= r3) goto L6a
            r3 = r0[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L67
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L63
            android.content.Context r5 = com.igexin.push.core.e.f38035l     // Catch: java.lang.Throwable -> L63
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L63
            android.content.Context r3 = com.igexin.push.core.e.f38035l     // Catch: java.lang.Throwable -> L63
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L63
            r5 = -1
            r6 = 1
            if (r1 == r5) goto L5e
            if (r1 != r6) goto L5c
            goto L5e
        L5c:
            r5 = 2
            goto L5f
        L5e:
            r5 = r6
        L5f:
            r3.setComponentEnabledSetting(r4, r5, r6)     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r3 = move-exception
            com.igexin.c.a.c.a.a(r3)
        L67:
            int r2 = r2 + 1
            goto L3d
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.e.a():void");
    }

    public static ClassLoader b(String str) {
        String str2 = str.split("_")[0];
        if (f38038o.containsKey(str2)) {
            return f38038o.get(str2);
        }
        return null;
    }

    public static void a(long j11) {
        f38049z = j11;
        A = com.igexin.c.b.a.b(String.valueOf(j11));
    }

    public static void b(long j11) {
        O = j11;
    }

    public static boolean a(Context context) {
        f38035l = context;
        f38030g = context.getPackageName();
        f38032i = o.b(context, o.f38736e, "").toString();
        f38001ac = "getui.permission.GetuiService." + f38030g;
        if (!e()) {
            com.igexin.c.a.c.a.a(aN, "parseManifests failed");
            com.igexin.c.a.c.a.a("CoreRuntimeInfo|parseManifests failed", new Object[0]);
            throw new IllegalArgumentException("parseManifests failed");
        }
        f38002ad = com.igexin.c.b.a.b(f37998a + context.getPackageName()).getBytes();
        com.igexin.push.g.j.a();
        com.igexin.push.config.e.a();
        a();
        if (Build.VERSION.SDK_INT < 29) {
            System.currentTimeMillis();
            D = com.igexin.push.g.n.g();
            System.currentTimeMillis();
            E = com.igexin.push.g.n.f();
            System.currentTimeMillis();
        }
        F = com.igexin.push.g.n.e();
        G = com.igexin.push.g.n.d();
        f38037n = com.igexin.push.g.c.e();
        f38006ah = new ConcurrentHashMap();
        f38007ai = new ConcurrentHashMap();
        f38008aj = new HashMap();
        f38009ak = new HashMap();
        f38010al = new HashMap<>();
        f38042s = com.igexin.push.core.d.d.a().b("p");
        aO = new HashMap();
        f38024az = true;
        com.igexin.c.a.c.a.a("CoreRuntimeInfo|getui sdk init success ##########", new Object[0]);
        if (new SdkInitSwitch(f38035l).isSwitchOn()) {
            com.igexin.push.core.d.d.a().a("i", Boolean.TRUE);
            new SdkInitSwitch(f38035l).delete();
        }
        if (new SdkPushSwitch(f38035l).isSwitchOn()) {
            f38042s = true;
            com.igexin.push.core.d.d.a().a("p", Boolean.TRUE);
            new SdkPushSwitch(f38035l).delete();
        }
        return true;
    }

    public static boolean a(String str, Integer num) {
        synchronized (e.class) {
            try {
                int intValue = num.intValue();
                if (aO.get(str) == null || (intValue = aO.get(str).intValue() + num.intValue()) != 0) {
                    aO.put(str, Integer.valueOf(intValue));
                    return true;
                }
                aO.remove(str);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
