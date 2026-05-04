package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private static au f42383a;

    /* renamed from: b, reason: collision with root package name */
    private ac f42384b;

    /* renamed from: c, reason: collision with root package name */
    private aa f42385c;

    /* renamed from: d, reason: collision with root package name */
    private as f42386d;

    /* renamed from: e, reason: collision with root package name */
    private Context f42387e;

    private au(Context context) {
        at a11 = at.a();
        if (a11 == null) {
            return;
        }
        this.f42384b = ac.a();
        this.f42385c = aa.a(context);
        this.f42386d = a11.f42364s;
        this.f42387e = context;
        ak.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.au.1
            @Override // java.lang.Runnable
            public final void run() {
                au.a(au.this);
            }
        });
    }

    public static au a(Context context) {
        if (f42383a == null) {
            f42383a = new au(context);
        }
        return f42383a;
    }

    public static void a(final Thread thread, final int i11, final String str, final String str2, final String str3, final Map<String, String> map) {
        ak.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.au.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (au.f42383a == null) {
                        al.e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        au.a(au.f42383a, thread, i11, str, str2, str3, map);
                    }
                } catch (Throwable th2) {
                    if (!al.b(th2)) {
                        th2.printStackTrace();
                    }
                    al.e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }

    public static /* synthetic */ void a(au auVar) {
        al.c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            auVar.f42385c.getClass();
            ap.a(cls, "sdkPackageName", "com.tencent.bugly");
            al.c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            al.a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    public static /* synthetic */ void a(au auVar, Thread thread, int i11, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread currentThread = thread == null ? Thread.currentThread() : thread;
        if (i11 == 4) {
            str4 = "Unity";
        } else if (i11 == 5 || i11 == 6) {
            str4 = "Cocos";
        } else {
            if (i11 != 8) {
                al.d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i11));
                return;
            }
            str4 = "H5";
        }
        al.e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!auVar.f42384b.b()) {
                al.d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean c11 = auVar.f42384b.c();
            if (!c11.f42084f && auVar.f42384b.b()) {
                al.e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                as.a(str4, ap.a(), auVar.f42385c.f42187d, currentThread.getName(), str + "\n" + str2 + "\n" + str3, null);
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i11 != 5 && i11 != 6) {
                if (i11 == 8 && !c11.f42090l) {
                    al.e("[ExtraCrashManager] %s report is disabled.", str4);
                    al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!c11.f42089k) {
                al.e("[ExtraCrashManager] %s report is disabled.", str4);
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i12 = i11 != 8 ? i11 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.C = ab.j();
            crashDetailBean.D = ab.f();
            crashDetailBean.E = ab.l();
            crashDetailBean.F = auVar.f42385c.k();
            crashDetailBean.G = auVar.f42385c.j();
            crashDetailBean.H = auVar.f42385c.l();
            crashDetailBean.I = ab.b(auVar.f42387e);
            crashDetailBean.J = ab.g();
            crashDetailBean.K = ab.h();
            crashDetailBean.f42104b = i12;
            crashDetailBean.f42107e = auVar.f42385c.g();
            aa aaVar = auVar.f42385c;
            crashDetailBean.f42108f = aaVar.f42198o;
            crashDetailBean.f42109g = aaVar.q();
            crashDetailBean.f42115m = auVar.f42385c.f();
            crashDetailBean.f42116n = String.valueOf(str);
            crashDetailBean.f42117o = String.valueOf(str2);
            String str6 = "";
            if (str3 == null) {
                str5 = "";
            } else {
                String[] split = str3.split("\n");
                if (split.length > 0) {
                    str6 = split[0];
                }
                str5 = str3;
            }
            crashDetailBean.f42118p = str6;
            crashDetailBean.f42119q = str5;
            crashDetailBean.f42120r = System.currentTimeMillis();
            crashDetailBean.f42123u = ap.c(crashDetailBean.f42119q.getBytes());
            crashDetailBean.f42128z = ap.a(auVar.f42385c.Q, at.f42352h);
            crashDetailBean.A = auVar.f42385c.f42187d;
            crashDetailBean.B = currentThread.getName() + pn.j.f81006c + currentThread.getId() + pn.j.f81007d;
            crashDetailBean.L = auVar.f42385c.s();
            crashDetailBean.f42110h = auVar.f42385c.p();
            aa aaVar2 = auVar.f42385c;
            crashDetailBean.Q = aaVar2.f42160a;
            crashDetailBean.R = aaVar2.a();
            crashDetailBean.U = auVar.f42385c.z();
            aa aaVar3 = auVar.f42385c;
            crashDetailBean.V = aaVar3.f42207x;
            crashDetailBean.W = aaVar3.t();
            crashDetailBean.X = auVar.f42385c.y();
            crashDetailBean.f42127y = ao.a();
            if (crashDetailBean.S == null) {
                crashDetailBean.S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.S.putAll(map);
            }
            as.a(str4, ap.a(), auVar.f42385c.f42187d, currentThread.getName(), str + "\n" + str2 + "\n" + str3, crashDetailBean);
            if (!auVar.f42386d.a(crashDetailBean, !at.a().C)) {
                auVar.f42386d.b(crashDetailBean, false);
            }
            al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th2) {
            try {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th3) {
                al.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th3;
            }
        }
    }
}
