package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class at {
    private static at D = null;

    /* renamed from: a, reason: collision with root package name */
    public static int f42346a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f42347b = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f42348d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f42349e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f42350f = 20480;

    /* renamed from: g, reason: collision with root package name */
    public static int f42351g = 3000;

    /* renamed from: h, reason: collision with root package name */
    public static int f42352h = 20480;

    /* renamed from: i, reason: collision with root package name */
    public static long f42353i = 209715200;

    /* renamed from: j, reason: collision with root package name */
    public static long f42354j = 604800000;

    /* renamed from: k, reason: collision with root package name */
    public static String f42355k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f42356l = false;

    /* renamed from: m, reason: collision with root package name */
    public static String f42357m = null;

    /* renamed from: n, reason: collision with root package name */
    public static int f42358n = 5000;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f42359o = true;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f42360p = false;

    /* renamed from: q, reason: collision with root package name */
    public static String f42361q;

    /* renamed from: r, reason: collision with root package name */
    public static String f42362r;
    public Boolean A;
    public int B = 31;
    public boolean C = false;

    /* renamed from: c, reason: collision with root package name */
    public final Context f42363c;

    /* renamed from: s, reason: collision with root package name */
    public final as f42364s;

    /* renamed from: t, reason: collision with root package name */
    public final av f42365t;

    /* renamed from: u, reason: collision with root package name */
    public final NativeCrashHandler f42366u;

    /* renamed from: v, reason: collision with root package name */
    public final ac f42367v;

    /* renamed from: w, reason: collision with root package name */
    public final ak f42368w;

    /* renamed from: x, reason: collision with root package name */
    public final ay f42369x;

    /* renamed from: y, reason: collision with root package name */
    public BuglyStrategy.a f42370y;

    /* renamed from: z, reason: collision with root package name */
    public aw f42371z;

    private at(Context context, ak akVar, boolean z11, BuglyStrategy.a aVar) {
        f42346a = 1004;
        Context a11 = ap.a(context);
        this.f42363c = a11;
        ac a12 = ac.a();
        this.f42367v = a12;
        this.f42368w = akVar;
        this.f42370y = aVar;
        this.f42371z = null;
        as asVar = new as(a11, ai.a(), w.a(), a12, aVar);
        this.f42364s = asVar;
        aa a13 = aa.a(a11);
        this.f42365t = new av(a11, asVar, a12, a13);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(a11, a13, asVar, a12, akVar, z11, null);
        this.f42366u = nativeCrashHandler;
        a13.N = nativeCrashHandler;
        if (ay.f42412f == null) {
            ay.f42412f = new ay(a11, a12, a13, akVar, asVar);
        }
        this.f42369x = ay.f42412f;
    }

    public final synchronized void c() {
        this.f42365t.b();
        d();
        g();
    }

    public final void d() {
        this.f42366u.setUserOpened(false);
    }

    public final void e() {
        this.f42366u.setUserOpened(true);
    }

    public final void f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.1
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(true);
            }
        });
        this.f42369x.b(true);
    }

    public final void g() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.2
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(false);
            }
        });
        this.f42369x.b(false);
    }

    public final synchronized void h() {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i11 < 30) {
                try {
                    al.a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i12));
                    ap.b(5000L);
                    i11 = i12;
                } catch (Throwable th2) {
                    if (al.a(th2)) {
                        return;
                    }
                    th2.printStackTrace();
                    return;
                }
            }
        }
    }

    public final boolean i() {
        return this.f42369x.f42413a.get();
    }

    public final boolean j() {
        return (this.B & 16) > 0;
    }

    public final boolean k() {
        return (this.B & 8) > 0;
    }

    public static synchronized at a(Context context, boolean z11, BuglyStrategy.a aVar) {
        at atVar;
        synchronized (at.class) {
            try {
                if (D == null) {
                    D = new at(context, ak.a(), z11, aVar);
                }
                atVar = D;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return atVar;
    }

    public final synchronized void b() {
        this.f42365t.a();
        e();
        f();
    }

    public static synchronized at a() {
        at atVar;
        synchronized (at.class) {
            atVar = D;
        }
        return atVar;
    }

    public final synchronized void a(boolean z11, boolean z12, boolean z13) {
        this.f42366u.testNativeCrash(z11, z12, z13);
    }

    public final void a(CrashDetailBean crashDetailBean) {
        this.f42364s.b(crashDetailBean);
    }

    public final void a(long j11) {
        ak.a().a(new Thread() { // from class: com.tencent.bugly.proguard.at.4
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                ag agVar;
                List<CrashDetailBean> list;
                if (!ap.a(at.this.f42363c, "local_crash_lock")) {
                    al.c("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                agVar = ag.a.f42230a;
                List<ag.b> a11 = ag.a();
                if (a11 == null || a11.isEmpty()) {
                    al.c("sla local data is null", new Object[0]);
                } else {
                    al.c("sla load local data list size:%s", Integer.valueOf(a11.size()));
                    Iterator<ag.b> it = a11.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        ag.b next = it.next();
                        if (next.f42232b < ap.b() - 604800000) {
                            al.c("sla local data is expired:%s", next.f42233c);
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    ag.d(arrayList);
                    agVar.b(a11);
                }
                List<CrashDetailBean> a12 = as.a();
                if (a12 == null || a12.size() <= 0) {
                    al.c("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    al.c("Size of crash list: %s", Integer.valueOf(a12.size()));
                    int size = a12.size();
                    if (size > 20) {
                        ArrayList arrayList2 = new ArrayList();
                        Collections.sort(a12);
                        for (int i11 = 0; i11 < 20; i11++) {
                            arrayList2.add(a12.get((size - 1) - i11));
                        }
                        list = arrayList2;
                    } else {
                        list = a12;
                    }
                    at.this.f42364s.a(list, 0L, false, false, false);
                }
                ap.b(at.this.f42363c, "local_crash_lock");
            }
        }, j11);
    }
}
