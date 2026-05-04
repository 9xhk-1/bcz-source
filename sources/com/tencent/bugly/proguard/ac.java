package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public static int f42213a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static long f42214b = 259200000;

    /* renamed from: d, reason: collision with root package name */
    private static ac f42215d;

    /* renamed from: i, reason: collision with root package name */
    private static String f42216i;

    /* renamed from: c, reason: collision with root package name */
    public final ak f42217c;

    /* renamed from: e, reason: collision with root package name */
    private final List<o> f42218e;

    /* renamed from: f, reason: collision with root package name */
    private final StrategyBean f42219f;

    /* renamed from: g, reason: collision with root package name */
    private StrategyBean f42220g = null;

    /* renamed from: h, reason: collision with root package name */
    private Context f42221h;

    private ac(Context context, List<o> list) {
        this.f42221h = context;
        if (aa.a(context) != null) {
            String str = aa.a(context).H;
            if ("oversea".equals(str)) {
                StrategyBean.f42079a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f42080b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f42079a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f42080b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f42219f = new StrategyBean();
        this.f42218e = list;
        this.f42217c = ak.a();
    }

    public static StrategyBean d() {
        byte[] bArr;
        List<y> a11 = w.a().a(2);
        if (a11 == null || a11.size() <= 0 || (bArr = a11.get(0).f42703g) == null) {
            return null;
        }
        return (StrategyBean) ap.a(bArr, StrategyBean.CREATOR);
    }

    public final StrategyBean c() {
        StrategyBean strategyBean = this.f42220g;
        if (strategyBean != null) {
            if (!ap.d(strategyBean.f42095q)) {
                this.f42220g.f42095q = StrategyBean.f42079a;
            }
            if (!ap.d(this.f42220g.f42096r)) {
                this.f42220g.f42096r = StrategyBean.f42080b;
            }
            return this.f42220g;
        }
        if (!ap.b(f42216i) && ap.d(f42216i)) {
            StrategyBean strategyBean2 = this.f42219f;
            String str = f42216i;
            strategyBean2.f42095q = str;
            strategyBean2.f42096r = str;
        }
        return this.f42219f;
    }

    public final synchronized boolean b() {
        return this.f42220g != null;
    }

    public static synchronized ac a(Context context, List<o> list) {
        ac acVar;
        synchronized (ac.class) {
            try {
                if (f42215d == null) {
                    f42215d = new ac(context, list);
                }
                acVar = f42215d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return acVar;
    }

    public static synchronized ac a() {
        ac acVar;
        synchronized (ac.class) {
            acVar = f42215d;
        }
        return acVar;
    }

    public final void a(StrategyBean strategyBean, boolean z11) {
        al.c("[Strategy] Notify %s", s.class.getName());
        s.a(strategyBean, z11);
        for (o oVar : this.f42218e) {
            try {
                al.c("[Strategy] Notify %s", oVar.getClass().getName());
                oVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public static void a(String str) {
        if (!ap.b(str) && ap.d(str)) {
            f42216i = str;
        } else {
            al.d("URL user set is invalid.", new Object[0]);
        }
    }

    public final void a(bt btVar) {
        int i11;
        if (btVar == null) {
            return;
        }
        StrategyBean strategyBean = this.f42220g;
        if (strategyBean == null || btVar.f42560h != strategyBean.f42093o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f42084f = btVar.f42553a;
            strategyBean2.f42086h = btVar.f42555c;
            strategyBean2.f42085g = btVar.f42554b;
            if (ap.b(f42216i) || !ap.d(f42216i)) {
                if (ap.d(btVar.f42556d)) {
                    al.c("[Strategy] Upload url changes to %s", btVar.f42556d);
                    strategyBean2.f42095q = btVar.f42556d;
                }
                if (ap.d(btVar.f42557e)) {
                    al.c("[Strategy] Exception upload url changes to %s", btVar.f42557e);
                    strategyBean2.f42096r = btVar.f42557e;
                }
            }
            bs bsVar = btVar.f42558f;
            if (bsVar != null && !ap.b(bsVar.f42548a)) {
                strategyBean2.f42097s = btVar.f42558f.f42548a;
            }
            long j11 = btVar.f42560h;
            if (j11 != 0) {
                strategyBean2.f42093o = j11;
            }
            Map<String, String> map = btVar.f42559g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = btVar.f42559g;
                strategyBean2.f42098t = map2;
                String str = map2.get("B11");
                strategyBean2.f42087i = str != null && str.equals("1");
                String str2 = btVar.f42559g.get("B3");
                if (str2 != null) {
                    strategyBean2.f42101w = Long.parseLong(str2);
                }
                int i12 = btVar.f42564l;
                strategyBean2.f42094p = i12;
                strategyBean2.f42100v = i12;
                String str3 = btVar.f42559g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt > 0) {
                            strategyBean2.f42099u = parseInt;
                        }
                    } catch (Exception e11) {
                        if (!al.a(e11)) {
                            e11.printStackTrace();
                        }
                    }
                }
                String str4 = btVar.f42559g.get("B25");
                strategyBean2.f42089k = str4 != null && str4.equals("1");
            }
            al.a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f42084f), Boolean.valueOf(strategyBean2.f42086h), Boolean.valueOf(strategyBean2.f42085g), Boolean.valueOf(strategyBean2.f42087i), Boolean.valueOf(strategyBean2.f42088j), Boolean.valueOf(strategyBean2.f42091m), Boolean.valueOf(strategyBean2.f42092n), Long.valueOf(strategyBean2.f42094p), Boolean.valueOf(strategyBean2.f42089k), Long.valueOf(strategyBean2.f42093o));
            this.f42220g = strategyBean2;
            if (ap.d(btVar.f42556d)) {
                i11 = 0;
            } else {
                i11 = 0;
                al.c("[Strategy] download url is null", new Object[0]);
                this.f42220g.f42095q = "";
            }
            if (!ap.d(btVar.f42557e)) {
                al.c("[Strategy] download crashurl is null", new Object[i11]);
                this.f42220g.f42096r = "";
            }
            w.a().b(2);
            y yVar = new y();
            yVar.f42698b = 2;
            yVar.f42697a = strategyBean2.f42082d;
            yVar.f42701e = strategyBean2.f42083e;
            yVar.f42703g = ap.a(strategyBean2);
            w.a().a(yVar);
            a(strategyBean2, true);
        }
    }
}
