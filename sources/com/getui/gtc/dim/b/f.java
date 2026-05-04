package com.getui.gtc.dim.b;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.dim.AppDataProvider;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.b.d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final List<String> f29888a = Arrays.asList("dim-2-1-21-5", "dim-2-1-21-3", "dim-2-1-21-1");

    /* renamed from: e, reason: collision with root package name */
    AppDataProvider f29892e;

    /* renamed from: f, reason: collision with root package name */
    String f29893f;

    /* renamed from: k, reason: collision with root package name */
    private volatile int f29898k;

    /* renamed from: r, reason: collision with root package name */
    private volatile String f29905r;

    /* renamed from: c, reason: collision with root package name */
    int f29890c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f29891d = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f29900m = 3;

    /* renamed from: n, reason: collision with root package name */
    private final int[] f29901n = {-1, 33};

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f29906s = true;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, Integer> f29889b = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Integer> f29894g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f29896i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f29897j = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f29895h = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final Map<String, Boolean> f29902o = new HashMap(4);

    /* renamed from: p, reason: collision with root package name */
    private final List<String> f29903p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private final List<String> f29904q = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, Boolean> f29899l = new HashMap();

    /* renamed from: com.getui.gtc.dim.b.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29907a;

        static {
            int[] iArr = new int[Caller.values().length];
            f29907a = iArr;
            try {
                iArr[Caller.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29907a[Caller.IDO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29907a[Caller.GY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29907a[Caller.WUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29907a[Caller.ONEID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean h(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "dim-2-1-21-1":
                case "dim-2-1-21-2":
                case "dim-2-1-21-3":
                case "dim-2-1-21-5":
                    return true;
            }
        }
        return false;
    }

    private static boolean i(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean j(String str) {
        try {
            if (this.f29899l.containsKey(str)) {
                return this.f29899l.get(str);
            }
            d unused = d.a.f29885a;
            h a11 = d.a(str);
            Boolean bool = a11 != null ? (Boolean) a11.f29919a : null;
            com.getui.gtc.dim.e.b.a("dim sys callable from db : " + str + " : " + bool);
            this.f29899l.put(str, bool);
            return bool;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("callable", th2);
            return null;
        }
    }

    public int a() {
        return this.f29900m;
    }

    public final int b(String str) {
        Integer num = 0;
        if (!TextUtils.isEmpty(str) && (num = this.f29894g.get(str)) == null) {
            num = this.f29894g.get("dim-2-2-0-1");
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int c() {
        return this.f29898k;
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29895h.put(str, str2);
        com.getui.gtc.dim.e.b.a("dim sys global trace order set: " + str + " : " + str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        if (r1.contains(r2) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.getui.gtc.dim.DimSource e(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            com.getui.gtc.dim.Caller[] r2 = com.getui.gtc.dim.Caller.values()     // Catch: java.lang.Throwable -> L1b
            int r3 = r2.length     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            r5 = r4
        Ld:
            if (r5 >= r3) goto L21
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r9.a(r6, r10)     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L1e
            r1.add(r6)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r1 = move-exception
            goto Lc7
        L1e:
            int r5 = r5 + 1
            goto Ld
        L21:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L28
            return r0
        L28:
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.f29895h     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L45
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.f29895h     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L46
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.f29895h     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "dim-2-2-0-1"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b
            goto L46
        L45:
            r2 = r0
        L46:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L96
            java.lang.String r3 = "#"
            java.lang.String[] r3 = r2.split(r3)     // Catch: java.lang.Throwable -> L1b
            int r5 = r3.length     // Catch: java.lang.Throwable -> L1b
            r6 = 4
            if (r5 < r6) goto L7d
            int r2 = r3.length     // Catch: java.lang.Throwable -> L1b
        L57:
            if (r4 >= r2) goto L96
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L5f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L1b
            com.getui.gtc.dim.Caller r7 = (com.getui.gtc.dim.Caller) r7     // Catch: java.lang.Throwable -> L1b
            java.lang.String r8 = b(r7)     // Catch: java.lang.Throwable -> L1b
            boolean r8 = r8.equals(r5)     // Catch: java.lang.Throwable -> L1b
            if (r8 == 0) goto L5f
            com.getui.gtc.dim.DimSource r10 = com.getui.gtc.dim.DimSource.of(r7)     // Catch: java.lang.Throwable -> L1b
            return r10
        L7a:
            int r4 = r4 + 1
            goto L57
        L7d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "dim sys trace order: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            r3.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = " not match for "
            r3.append(r2)     // Catch: java.lang.Throwable -> L1b
            r3.append(r10)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1b
            com.getui.gtc.dim.e.b.b(r2)     // Catch: java.lang.Throwable -> L1b
        L96:
            com.getui.gtc.dim.Caller r2 = com.getui.gtc.dim.Caller.IDO     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto La3
        L9e:
            com.getui.gtc.dim.DimSource r10 = com.getui.gtc.dim.DimSource.of(r2)     // Catch: java.lang.Throwable -> L1b
            return r10
        La3:
            com.getui.gtc.dim.Caller r2 = com.getui.gtc.dim.Caller.PUSH     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lac
            goto L9e
        Lac:
            com.getui.gtc.dim.Caller r2 = com.getui.gtc.dim.Caller.GY     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lb5
            goto L9e
        Lb5:
            com.getui.gtc.dim.Caller r2 = com.getui.gtc.dim.Caller.WUS     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lbe
            goto L9e
        Lbe:
            com.getui.gtc.dim.Caller r2 = com.getui.gtc.dim.Caller.ONEID     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Ld4
            goto L9e
        Lc7:
            java.lang.String r2 = "allowSource key:"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r2.concat(r10)
            com.getui.gtc.dim.e.b.a(r10, r1)
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.b.f.e(java.lang.String):com.getui.gtc.dim.DimSource");
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29896i.add(str);
        com.getui.gtc.dim.e.b.a("dim sys app provider globalAllow set: " + str + " : true");
    }

    public void g(String str, String str2) {
        String[] split = str2.split("#");
        int length = split.length;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (split[i11].equals(Build.MODEL)) {
                this.f29903p.add(str);
                z11 = true;
                break;
            }
            i11++;
        }
        com.getui.gtc.dim.e.b.a("dim sys black model set: " + str + " : " + str2 + " : " + z11);
    }

    public void a(int i11) {
        this.f29900m = i11;
        com.getui.gtc.dim.e.b.a("dim sys busi enable set: ".concat(String.valueOf(i11)));
    }

    public Boolean b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return j(str + ":" + Caller.valueOf(str2).name());
        }
        for (Caller caller : Caller.values()) {
            if (caller.containAt(this.f29898k)) {
                Boolean j11 = j(str + ":" + caller.name());
                if (j11 == null || j11.booleanValue()) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public void c(int i11) {
        this.f29891d = i11;
        com.getui.gtc.dim.e.b.a("dim sys trace hw oaid enable set: ".concat(String.valueOf(i11)));
    }

    public final boolean d(String str) {
        for (Caller caller : Caller.values()) {
            if (a(caller, str)) {
                return true;
            }
        }
        return false;
    }

    public void e(String str, String str2) {
        boolean a11 = a(false, str2);
        this.f29902o.put(str, Boolean.valueOf(a11));
        com.getui.gtc.dim.e.b.a("dim sys black version set: " + str + " : " + str2 + " : " + a11);
    }

    public void f(String str, String str2) {
        String str3;
        String str4;
        String[] split;
        StringBuilder sb2;
        boolean z11 = false;
        try {
            str4 = Build.BRAND;
            split = str2.split("&");
        } catch (Throwable th2) {
            th = th2;
        }
        if (!str4.equalsIgnoreCase(split[0])) {
            sb2 = new StringBuilder("dim sys black rom set: ");
        } else {
            if (a(true, split[1])) {
                String str5 = split[2];
                if (!str5.equals("*")) {
                    if (this.f29905r == null) {
                        this.f29905r = com.getui.gtc.dim.c.a.d();
                    }
                    if (TextUtils.isEmpty(this.f29905r)) {
                        sb2 = new StringBuilder("dim sys black rom set: ");
                    } else {
                        for (String str6 : str5.split("#")) {
                            int i11 = this.f29905r.startsWith(str6) ? 0 : i11 + 1;
                        }
                        sb2 = new StringBuilder("dim sys black rom set: ");
                    }
                }
                try {
                    this.f29904q.add(str);
                    sb2 = new StringBuilder("dim sys black rom set: ");
                    sb2.append(str);
                    sb2.append(" : ");
                    sb2.append(str2);
                    sb2.append(" : true");
                    str3 = sb2.toString();
                } catch (Throwable th3) {
                    th = th3;
                    z11 = true;
                    try {
                        com.getui.gtc.dim.e.b.b(th);
                        str3 = "dim sys black rom set: " + str + " : " + str2 + " : " + z11;
                        com.getui.gtc.dim.e.b.a(str3);
                    } catch (Throwable th4) {
                        com.getui.gtc.dim.e.b.a("dim sys black rom set: " + str + " : " + str2 + " : " + z11);
                        throw th4;
                    }
                }
                com.getui.gtc.dim.e.b.a(str3);
            }
            sb2 = new StringBuilder("dim sys black rom set: ");
        }
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        sb2.append(" : false");
        str3 = sb2.toString();
        com.getui.gtc.dim.e.b.a(str3);
    }

    public final boolean g(String str) {
        try {
            Boolean bool = this.f29902o.get(str);
            if (bool == null) {
                bool = this.f29902o.get("dim-2-2-0-1");
            }
            if (bool == null) {
                if (Build.VERSION.SDK_INT >= 34 && h(str)) {
                    com.getui.gtc.dim.e.b.a("dim sys black version use ld for: " + str + " : true");
                    return true;
                }
            } else if (bool.booleanValue()) {
                return true;
            }
            return this.f29903p.contains(str) || this.f29904q.contains(str);
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
            return true;
        }
    }

    private static String b(Caller caller) {
        if (caller == null) {
            return "";
        }
        int i11 = AnonymousClass1.f29907a[caller.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "" : "oneid" : "wus" : "gy" : "ido" : "gt";
    }

    public void a(AppDataProvider appDataProvider) {
        this.f29892e = appDataProvider;
        com.getui.gtc.dim.e.b.a("dim sys app data provider set: ".concat(String.valueOf(appDataProvider)));
    }

    public void c(String str) {
        if (str != null) {
            try {
                if (str.contains(new String(Base64.decode("Y29tLmdldHVpLmd0Yy5leHRlbnNpb24uZGlzdHJpYnV0aW9uLmdkaS5zdHViLlB1c2hFeHRlbnNpb24=", 2)))) {
                    this.f29893f = str;
                }
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.b(th2);
                return;
            }
        }
        com.getui.gtc.dim.e.b.a("dim sys gtc dyc config set: ".concat(String.valueOf(str)));
    }

    public void a(Caller caller) {
        if (caller != null) {
            synchronized (this) {
                this.f29898k |= caller.index;
            }
        }
        com.getui.gtc.dim.e.b.a("dim sys gtc init caller set: ".concat(String.valueOf(caller)));
    }

    public void b(int i11) {
        this.f29890c = i11;
        com.getui.gtc.dim.e.b.a("dim sys trace enable set: ".concat(String.valueOf(i11)));
    }

    public void c(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29894g.put(str, Integer.valueOf(i11));
        com.getui.gtc.dim.e.b.a("dim sys globalAllow policy set: " + str + " : " + i11);
    }

    public void a(String str, int i11) {
        if (str.equalsIgnoreCase(Build.BRAND)) {
            this.f29901n[0] = i11;
        } else if (str.equals("dim-2-2-0-1")) {
            this.f29901n[1] = i11;
        }
        com.getui.gtc.dim.e.b.a("dim sys pm policy set: " + str + " : " + i11);
    }

    public void b(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29889b.put(str, Integer.valueOf(i11));
        com.getui.gtc.dim.e.b.a("dim sys globalAllow set: " + str + " : " + i11);
    }

    public void c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            for (String str3 : str2.split("#")) {
                this.f29897j.add(str + ":" + str3);
            }
            com.getui.gtc.dim.e.b.a("dim sys global disallow set: " + str + " : " + str2);
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a("dim sys global disallow set: " + str + " : " + str2, th2);
        }
    }

    public final boolean a(Caller caller, String str) {
        if (caller != null && caller != Caller.UNKNOWN && caller.containAt(this.f29898k)) {
            try {
                if (!this.f29897j.isEmpty()) {
                    if (!this.f29897j.contains(str + ":" + b(caller))) {
                    }
                }
                if ((this.f29900m & 1) == 0) {
                    com.getui.gtc.dim.e.b.a("dim sys ig ca");
                    return true;
                }
                a a11 = a.a(str);
                if (a11 != null) {
                    Boolean j11 = j(a11.f29856a + ":" + caller.name());
                    com.getui.gtc.dim.e.b.a("dim sys get callable " + caller + " : " + str + " : " + j11);
                    if (j11 != null && !j11.booleanValue()) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.b(th2);
            }
        }
        return false;
    }

    public final boolean b() {
        int[] iArr = this.f29901n;
        int i11 = iArr[0];
        return i11 >= 0 ? Build.VERSION.SDK_INT >= i11 : Build.VERSION.SDK_INT >= iArr[1];
    }

    public final boolean a(String str) {
        try {
            return this.f29896i.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean b(String str, Caller caller, boolean z11) {
        if (caller != Caller.IDO || i("com.igexin.sdk.PushManager") || i("com.g.gysdk.GYManager") || !i("com.getui.gs.sdk.GsManager")) {
            com.getui.gtc.dim.e.b.a("dim sys gbdExecutable set ignored");
            return false;
        }
        this.f29906s = z11;
        com.getui.gtc.dim.e.b.a("dim sys gbdExecutable set: ".concat(String.valueOf(z11)));
        return true;
    }

    public boolean a(String str, Caller caller, boolean z11) {
        this.f29899l.put(str + ":" + caller.name(), Boolean.valueOf(z11));
        d unused = d.a.f29885a;
        d.a(str + ":" + caller.name(), Boolean.valueOf(z11));
        com.getui.gtc.dim.e.b.a("dim sys callable set: " + str + " : " + caller + " : " + z11);
        return true;
    }

    public boolean a(String str, String str2) {
        if (Caller.valueOf(str2) == Caller.IDO) {
            return this.f29906s;
        }
        com.getui.gtc.dim.e.b.a("dim sys gbdExecutable get always true");
        return true;
    }

    private static boolean a(boolean z11, String str) {
        if (z11 && "*".equals(str)) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        for (String str2 : str.split("#")) {
            if (str2.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split.length == 2 && i11 >= Integer.parseInt(split[0]) && i11 <= Integer.parseInt(split[1])) {
                    return true;
                }
            } else if (String.valueOf(i11).equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
