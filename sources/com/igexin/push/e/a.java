package com.igexin.push.e;

import com.igexin.c.a.c.a.d;
import com.igexin.c.a.d.f;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.d;
import com.igexin.push.core.e;
import com.igexin.push.core.j;
import com.igexin.push.core.l;
import com.igexin.push.d.c;
import com.igexin.push.d.c.c;
import com.igexin.push.d.c.i;
import com.igexin.push.g.g;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f38514a = "com.igexin.push.e.a";

    /* renamed from: b, reason: collision with root package name */
    public boolean f38515b;

    private int a(String str, c cVar) {
        return a(str, cVar, false);
    }

    public static void c() {
        e.b(c.b.f38428a.f38400e.a());
        com.igexin.push.f.b.e.g().a(e.O);
    }

    public static void d() {
        j.a().a(j.a.f38322d);
        boolean e11 = com.igexin.push.g.c.e();
        com.igexin.c.a.c.a.a(f38514a, "network changed, available = " + e11 + ", last = " + e.f38037n);
        com.igexin.c.a.c.a.a(f38514a + "|network changed, available = " + e11 + ", last = " + e.f38037n, new Object[0]);
        c.b.f38428a.a();
        if (!e11) {
            com.igexin.c.a.c.a.a(f38514a + "|network changed, available = false, do nothing", new Object[0]);
            a(false);
        } else if (!e.f38037n) {
            com.igexin.c.a.c.a.a(f38514a + "|network changed, try connect reset delay", new Object[0]);
            g();
        }
        if (e11) {
            com.igexin.push.c.c.a().c();
        }
        e.f38037n = e11;
    }

    public static boolean e() {
        return (e.f38039p && e.f38042s) ? false : true;
    }

    private boolean f() {
        return this.f38515b;
    }

    private static void g() {
        com.igexin.c.a.c.a.a(f38514a + "|call -> tryConnect and reset delay = 0", new Object[0]);
        a(true);
    }

    private static void h() {
        com.igexin.push.d.a.c.f38390b = -1;
        if (e.f38040q) {
            com.igexin.c.a.c.a.a(f38514a, "isAppidWrong = true");
            com.igexin.c.a.c.a.a(f38514a + "|isAppidWrong = true", new Object[0]);
            d.a().a("isAppidWrong = true");
            return;
        }
        if (!g.a()) {
            com.igexin.c.a.c.a.a(f38514a, "so error ++++++++");
            com.igexin.c.a.c.a.a(f38514a + "|so error ++++++++", new Object[0]);
            return;
        }
        if (e.f38024az) {
            c();
            return;
        }
        com.igexin.c.a.c.a.a(f38514a, "initSuccess = false");
        com.igexin.c.a.c.a.a(f38514a + "|initSuccess = false", new Object[0]);
    }

    private static void i() {
        com.igexin.push.c.c.a().d().c();
        com.igexin.push.c.a d11 = com.igexin.push.c.c.a().d();
        j.a().a(j.a.f38321c);
        d11.f();
        if (e()) {
            com.igexin.c.a.c.a.a(f38514a, "sdkOn = false or pushOn = false, disconnect|user");
            com.igexin.c.a.c.a.a(f38514a + "|sdkOn = false or pushOn = false, disconnect|user", new Object[0]);
        } else {
            com.igexin.c.a.c.a.a(f38514a + "|disconnect by network", new Object[0]);
        }
        com.igexin.c.a.d.e<f> eVar = com.igexin.c.a.b.e.a().f37248s;
        if (eVar != null) {
            eVar.a(com.igexin.c.a.b.a.a.f.class);
        }
        a(false);
    }

    public final void b() {
        b(false);
        if (e.f38044u) {
            e.f38044u = false;
            l.a().b();
        }
        com.igexin.c.a.c.a.a(f38514a + "|stop by user", new Object[0]);
        com.igexin.push.c.c.a().d().f();
    }

    private void b(boolean z11) {
        com.igexin.c.a.c.a.a(f38514a, "call setActive, param active = " + z11 + "; this.active = " + this.f38515b + "; reConnectDelayTime=" + e.O);
        com.igexin.c.a.c.a.a(f38514a + "|call setActive, param active = " + z11 + "; this.active = " + this.f38515b + "; reConnectDelayTime=" + e.O, new Object[0]);
        boolean z12 = this.f38515b;
        if (z12 == z11) {
            if (!z12 || e.f38044u || e.O <= 1500) {
                return;
            }
            com.igexin.c.a.c.a.a(f38514a + "|start active again, online = false, reset delay", new Object[0]);
            e.b(0L);
            c();
            return;
        }
        this.f38515b = z11;
        if (z11) {
            com.igexin.c.a.c.a.a(f38514a + "|active = true, start connect~~~~", new Object[0]);
            g();
            return;
        }
        com.igexin.c.a.c.a.a(f38514a + "|active = false, disconnect...", new Object[0]);
        a(true);
    }

    public final int a(String str, com.igexin.push.d.c.c cVar, boolean z11) {
        if (str == null || cVar == null) {
            return -1;
        }
        if (!e.f38044u && !(cVar instanceof com.igexin.push.d.c.g) && !(cVar instanceof i) && !(cVar instanceof com.igexin.push.d.c.d)) {
            com.igexin.c.a.c.a.a("networkLayer|sendData|not online|" + cVar.getClass().getName(), new Object[0]);
            return -3;
        }
        if (this.f38515b) {
            if (z11) {
                int i11 = com.igexin.push.config.d.f37586f;
                if (i11 <= 0) {
                    i11 = 10;
                }
                if (com.igexin.c.a.b.e.a().a(SDKUrlConfig.getConnectAddress(), d.a.f37956a.f37948g, cVar, i11, new com.igexin.push.d.f()) == null) {
                    return -2;
                }
            } else if (com.igexin.c.a.b.e.a().a(SDKUrlConfig.getConnectAddress(), d.a.f37956a.f37948g, cVar) == null) {
                return -2;
            }
        }
        return 0;
    }

    public final void a() {
        boolean z11 = e.f38039p;
        boolean z12 = e.f38042s;
        boolean a11 = com.igexin.push.g.c.a();
        if (z11 && z12 && a11) {
            b(true);
        }
    }

    public static void a(int i11) {
        com.igexin.c.a.b.e a11;
        Object aVar;
        if (i11 == com.igexin.c.a.b.a.a.j.f37125a) {
            a11 = com.igexin.c.a.b.e.a();
            aVar = new com.igexin.push.d.b.b();
        } else {
            if (i11 != com.igexin.c.a.b.a.a.j.f37126b) {
                return;
            }
            a11 = com.igexin.c.a.b.e.a();
            aVar = new com.igexin.push.d.b.a();
        }
        a11.a(aVar);
        com.igexin.c.a.b.e.a().b();
    }

    public static void a(com.igexin.push.d.c.c cVar) {
        if (cVar == null) {
            return;
        }
        com.igexin.push.core.a.b.d().a(cVar);
    }

    public static void a(boolean z11) {
        com.igexin.c.a.c.a.a(f38514a + "|call -> disconnect, reset delay = " + z11, new Object[0]);
        if (z11) {
            e.b(0L);
        }
        com.igexin.c.a.b.a.a.d.a().d();
    }
}
