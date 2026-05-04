package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class aa {
    private static final Map<String, String> W = new HashMap();

    /* renamed from: aq, reason: collision with root package name */
    private static aa f42159aq = null;
    public boolean D;
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean J;
    public final SharedPreferences O;
    public final SharedPreferences P;
    private final Context X;
    private String Y;
    private String Z;

    /* renamed from: aa, reason: collision with root package name */
    private String f42161aa;

    /* renamed from: aj, reason: collision with root package name */
    private String f42170aj;

    /* renamed from: c, reason: collision with root package name */
    public String f42186c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42187d;

    /* renamed from: e, reason: collision with root package name */
    public String f42188e;

    /* renamed from: k, reason: collision with root package name */
    public final String f42194k;

    /* renamed from: o, reason: collision with root package name */
    public String f42198o;

    /* renamed from: p, reason: collision with root package name */
    public int f42199p;

    /* renamed from: q, reason: collision with root package name */
    public String f42200q;

    /* renamed from: r, reason: collision with root package name */
    public String f42201r;

    /* renamed from: s, reason: collision with root package name */
    public String f42202s;

    /* renamed from: v, reason: collision with root package name */
    public List<String> f42205v;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42189f = true;

    /* renamed from: g, reason: collision with root package name */
    public final String f42190g = "com.tencent.bugly";

    /* renamed from: h, reason: collision with root package name */
    public String f42191h = "4.1.9.3";

    /* renamed from: i, reason: collision with root package name */
    public final String f42192i = "";

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public final String f42193j = "";

    /* renamed from: l, reason: collision with root package name */
    public String f42195l = "unknown";

    /* renamed from: ab, reason: collision with root package name */
    private String f42162ab = "unknown";

    /* renamed from: ac, reason: collision with root package name */
    private String f42163ac = "";

    /* renamed from: m, reason: collision with root package name */
    public long f42196m = 0;

    /* renamed from: ad, reason: collision with root package name */
    private String f42164ad = null;

    /* renamed from: ae, reason: collision with root package name */
    private long f42165ae = -1;

    /* renamed from: af, reason: collision with root package name */
    private long f42166af = -1;

    /* renamed from: ag, reason: collision with root package name */
    private long f42167ag = -1;

    /* renamed from: ah, reason: collision with root package name */
    private String f42168ah = null;

    /* renamed from: ai, reason: collision with root package name */
    private String f42169ai = null;

    /* renamed from: ak, reason: collision with root package name */
    private Map<String, PlugInBean> f42171ak = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42197n = false;

    /* renamed from: al, reason: collision with root package name */
    private String f42172al = null;

    /* renamed from: am, reason: collision with root package name */
    private Boolean f42173am = null;

    /* renamed from: an, reason: collision with root package name */
    private String f42174an = null;

    /* renamed from: t, reason: collision with root package name */
    public String f42203t = null;

    /* renamed from: u, reason: collision with root package name */
    public String f42204u = null;

    /* renamed from: ao, reason: collision with root package name */
    private Map<String, PlugInBean> f42175ao = null;

    /* renamed from: ap, reason: collision with root package name */
    private Map<String, PlugInBean> f42176ap = null;

    /* renamed from: w, reason: collision with root package name */
    public int f42206w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f42207x = -1;

    /* renamed from: ar, reason: collision with root package name */
    private final Map<String, String> f42177ar = new HashMap();

    /* renamed from: as, reason: collision with root package name */
    private final Map<String, String> f42178as = new HashMap();

    /* renamed from: at, reason: collision with root package name */
    private final Map<String, String> f42179at = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public String f42208y = "unknown";

    /* renamed from: z, reason: collision with root package name */
    public long f42209z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public boolean I = false;
    public HashMap<String, String> K = new HashMap<>();
    public List<String> L = new ArrayList();
    public boolean M = false;
    public q N = null;
    public boolean Q = true;
    public boolean R = true;
    public boolean S = false;

    /* renamed from: au, reason: collision with root package name */
    private final Object f42180au = new Object();
    public final Object T = new Object();

    /* renamed from: av, reason: collision with root package name */
    private final Object f42181av = new Object();

    /* renamed from: aw, reason: collision with root package name */
    private final Object f42182aw = new Object();
    public final Object U = new Object();
    public final Object V = new Object();

    /* renamed from: ax, reason: collision with root package name */
    private final Object f42183ax = new Object();

    /* renamed from: ay, reason: collision with root package name */
    private final List<Integer> f42184ay = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final long f42160a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final byte f42185b = 1;

    private aa(Context context) {
        this.f42170aj = null;
        this.f42198o = null;
        this.f42200q = null;
        this.f42201r = null;
        this.f42202s = null;
        this.f42205v = null;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = "";
        this.J = false;
        this.X = ap.a(context);
        PackageInfo b11 = z.b(context);
        if (b11 != null) {
            try {
                String str = b11.versionName;
                this.f42198o = str;
                this.E = str;
                this.F = Integer.toString(b11.versionCode);
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        this.f42186c = z.a(context);
        this.f42187d = z.a(Process.myPid());
        this.f42200q = z.c(context);
        this.f42194k = "Android " + ab.b() + ",level " + ab.c();
        Map<String, String> d11 = z.d(context);
        if (d11 != null) {
            try {
                this.f42205v = z.a(d11);
                String str2 = d11.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f42201r = str2;
                    b("APP_ID", str2);
                }
                String str3 = d11.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f42198o = str3;
                }
                String str4 = d11.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f42202s = str4;
                }
                String str5 = d11.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.D = str5.equalsIgnoreCase(n6.m.f74525c);
                }
                String str6 = d11.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.G = str6;
                }
                String str7 = d11.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f42199p = Integer.parseInt(str7);
                }
                String str8 = d11.get("BUGLY_AREA");
                if (str8 != null) {
                    this.H = str8;
                }
            } catch (Throwable th3) {
                if (!al.a(th3)) {
                    th3.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.J = true;
                al.c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th4) {
            if (p.f42621c) {
                th4.printStackTrace();
            }
        }
        this.O = ap.a("BUGLY_COMMON_VALUES", context);
        this.P = ap.a("BUGLY_RESERVED_VALUES", context);
        this.f42170aj = ab.a(context);
        E();
        al.c("com info create end", new Object[0]);
    }

    public static int B() {
        return ab.c();
    }

    @Deprecated
    public static boolean C() {
        al.a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    public static boolean D() {
        al.a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    private void E() {
        try {
            for (Map.Entry<String, ?> entry : this.P.getAll().entrySet()) {
                al.c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : W.entrySet()) {
                al.c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                a(entry2.getKey(), entry2.getValue(), true);
            }
            W.clear();
        } catch (Throwable th2) {
            al.b(th2);
        }
    }

    private String F() {
        if (TextUtils.isEmpty(this.f42164ad)) {
            this.f42164ad = ap.d("androidid", null);
        }
        return this.f42164ad;
    }

    private static String G() {
        String uuid = UUID.randomUUID().toString();
        return !ap.b(uuid) ? uuid.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") : uuid;
    }

    public static synchronized aa b() {
        aa aaVar;
        synchronized (aa.class) {
            aaVar = f42159aq;
        }
        return aaVar;
    }

    @Deprecated
    public static String n() {
        return "";
    }

    public final synchronized Map<String, PlugInBean> A() {
        Map<String, PlugInBean> map;
        map = this.f42175ao;
        Map<String, PlugInBean> map2 = this.f42176ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final boolean a() {
        boolean z11 = this.f42184ay.size() > 0;
        al.c("isAppForeground:%s", Boolean.valueOf(z11));
        return z11;
    }

    public final void c() {
        synchronized (this.f42180au) {
            this.Y = UUID.randomUUID().toString();
        }
    }

    public final String d() {
        String str;
        synchronized (this.f42180au) {
            try {
                if (this.Y == null) {
                    c();
                }
                str = this.Y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final String e() {
        return !ap.b(this.f42188e) ? this.f42188e : this.f42201r;
    }

    public final String f() {
        String str;
        synchronized (this.V) {
            str = this.f42195l;
        }
        return str;
    }

    public final String g() {
        String str = this.f42161aa;
        if (str != null) {
            return str;
        }
        String d11 = ap.d("deviceId", null);
        this.f42161aa = d11;
        if (d11 != null) {
            return d11;
        }
        String F = F();
        this.f42161aa = F;
        if (TextUtils.isEmpty(F)) {
            this.f42161aa = G();
        }
        String str2 = this.f42161aa;
        if (str2 == null) {
            return "";
        }
        ap.c("deviceId", str2);
        return this.f42161aa;
    }

    public final synchronized String h() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        String d11 = ap.d("deviceModel", null);
        this.Z = d11;
        if (d11 != null) {
            al.c("collect device model from sp:%s", d11);
            return this.Z;
        }
        if (!this.f42197n) {
            al.c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String a11 = ab.a();
        this.Z = a11;
        al.c("collect device model:%s", a11);
        ap.c("deviceModel", this.Z);
        return this.Z;
    }

    public final synchronized String i() {
        return this.f42163ac;
    }

    public final long j() {
        if (this.f42165ae <= 0) {
            this.f42165ae = ab.e();
        }
        return this.f42165ae;
    }

    public final long k() {
        if (this.f42166af <= 0) {
            this.f42166af = ab.i();
        }
        return this.f42166af;
    }

    public final long l() {
        if (this.f42167ag <= 0) {
            this.f42167ag = ab.k();
        }
        return this.f42167ag;
    }

    public final String m() {
        if (!TextUtils.isEmpty(this.f42169ai)) {
            al.c("get cpu type from so:%s", this.f42169ai);
            return this.f42169ai;
        }
        if (TextUtils.isEmpty(this.f42170aj)) {
            return "unknown";
        }
        al.c("get cpu type from lib dir:%s", this.f42170aj);
        return this.f42170aj;
    }

    public final String o() {
        try {
            Map<String, ?> all = this.X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.T) {
                    try {
                    } catch (Throwable th2) {
                        al.a(th2);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th3) {
            al.a(th3);
        }
        if (this.K.isEmpty()) {
            al.c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.K.entrySet()) {
            sb2.append("[");
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(entry2.getValue());
            sb2.append("] ");
        }
        al.c("SDK_INFO = %s", sb2.toString());
        b("SDK_INFO", sb2.toString());
        return sb2.toString();
    }

    public final synchronized Map<String, PlugInBean> p() {
        Map<String, PlugInBean> map = this.f42171ak;
        if (map != null && map.size() > 0) {
            HashMap hashMap = new HashMap(this.f42171ak.size());
            hashMap.putAll(this.f42171ak);
            return hashMap;
        }
        return null;
    }

    public final String q() {
        if (this.f42172al == null) {
            this.f42172al = ab.m();
        }
        return this.f42172al;
    }

    public final Boolean r() {
        if (this.f42173am == null) {
            this.f42173am = Boolean.valueOf(ab.q());
        }
        return this.f42173am;
    }

    public final String s() {
        if (this.f42174an == null) {
            String str = ab.n();
            this.f42174an = str;
            al.a("ROM ID: %s", str);
        }
        return this.f42174an;
    }

    public final Map<String, String> t() {
        synchronized (this.f42181av) {
            try {
                if (this.f42177ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f42177ar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        synchronized (this.f42181av) {
            this.f42177ar.clear();
        }
    }

    public final int v() {
        int size;
        synchronized (this.f42181av) {
            size = this.f42177ar.size();
        }
        return size;
    }

    public final Set<String> w() {
        Set<String> keySet;
        synchronized (this.f42181av) {
            keySet = this.f42177ar.keySet();
        }
        return keySet;
    }

    public final Map<String, String> x() {
        synchronized (this.f42183ax) {
            try {
                if (this.f42178as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f42178as);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> y() {
        synchronized (this.f42182aw) {
            try {
                if (this.f42179at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f42179at);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int z() {
        int i11;
        synchronized (this.U) {
            i11 = this.f42206w;
        }
        return i11;
    }

    public final void b(String str) {
        al.a("change deviceModel，old:%s new:%s", this.Z, str);
        this.Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ap.c("deviceModel", str);
    }

    public final void a(int i11, boolean z11) {
        al.c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i11), Boolean.valueOf(z11));
        if (z11) {
            this.f42184ay.add(Integer.valueOf(i11));
        } else {
            this.f42184ay.remove(Integer.valueOf(i11));
            this.f42184ay.remove((Object) 0);
        }
        q qVar = this.N;
        if (qVar != null) {
            qVar.setNativeIsAppForeground(this.f42184ay.size() > 0);
        }
    }

    public final synchronized void c(String str) {
        this.f42162ab = String.valueOf(str);
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f42169ai = str.trim();
    }

    public final String f(String str) {
        String remove;
        if (ap.b(str)) {
            al.d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f42181av) {
            remove = this.f42177ar.remove(str);
        }
        return remove;
    }

    public final void b(String str, String str2) {
        if (!ap.b(str) && !ap.b(str2)) {
            synchronized (this.f42182aw) {
                this.f42179at.put(str, str2);
            }
            return;
        }
        al.d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    public final synchronized void d(String str) {
        this.f42163ac = String.valueOf(str);
    }

    public static synchronized aa a(Context context) {
        aa aaVar;
        synchronized (aa.class) {
            try {
                if (f42159aq == null) {
                    f42159aq = new aa(context);
                }
                aaVar = f42159aq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aaVar;
    }

    public final String g(String str) {
        String str2;
        if (ap.b(str)) {
            al.d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f42181av) {
            str2 = this.f42177ar.get(str);
        }
        return str2;
    }

    public final void a(String str) {
        this.f42161aa = str;
        if (!TextUtils.isEmpty(str)) {
            ap.c("deviceId", str);
        }
        synchronized (this.f42183ax) {
            this.f42178as.put("E8", str);
        }
    }

    public final void a(String str, String str2) {
        if (!ap.b(str) && !ap.b(str2)) {
            synchronized (this.f42181av) {
                this.f42177ar.put(str, str2);
            }
            return;
        }
        al.d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    private void a(String str, String str2, boolean z11) {
        if (ap.b(str)) {
            al.d("key should not be empty %s", str);
            return;
        }
        al.c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z11));
        synchronized (this.f42183ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f42178as.remove(str);
                    this.P.edit().remove(str).apply();
                } else {
                    this.f42178as.put(str, str2);
                    if (z11) {
                        this.P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
