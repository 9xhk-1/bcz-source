package com.igexin.push.c;

import com.igexin.push.c.a;
import com.igexin.push.c.b;
import com.igexin.push.config.SDKUrlConfig;
import java.util.List;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37456a = b.f37444a + c.class.getName();

    /* renamed from: b, reason: collision with root package name */
    private static c f37457b;

    /* renamed from: c, reason: collision with root package name */
    private static int f37458c;

    private c() {
        f37458c = com.igexin.push.g.c.b() ? b.EnumC0463b.f37453a : b.EnumC0463b.f37454b;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f37457b == null) {
                    f37457b = new c();
                }
                cVar = f37457b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static void b() {
        if (SDKUrlConfig.hasMultipleXfr()) {
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) f.g(), false, true);
            return;
        }
        com.igexin.c.a.c.a.a(f37456a + "|xfr len = 1, detect = false", new Object[0]);
    }

    public final void c() {
        if (SDKUrlConfig.hasMultipleXfr()) {
            try {
                f().e();
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    public final a d() {
        return f().f37485d;
    }

    public final void e() {
        if (SDKUrlConfig.hasMultipleXfr()) {
            try {
                j.a();
                h.k();
                j.a().g();
                g.a().g();
                h f11 = f();
                if (f11 != null) {
                    f11.i();
                    return;
                }
                return;
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                return;
            }
        }
        j.a().f();
        g.a().f();
        f.g().i();
        try {
            g.a().f37485d.a((List<a.b>) null);
            j.a().f37485d.a((List<a.b>) null);
            j.a().h();
            g.a().h();
            j.a();
            h.k();
        } catch (Throwable th3) {
            com.igexin.c.a.c.a.a(th3);
        }
    }

    public final synchronized h f() {
        h a11;
        h a12;
        try {
            a11 = com.igexin.push.g.c.b() ? j.a() : g.a();
            int c11 = a11.c();
            if (c11 != f37458c) {
                if (c11 == b.EnumC0463b.f37453a) {
                    a12 = g.a();
                } else if (c11 == b.EnumC0463b.f37454b) {
                    a12 = j.a();
                }
                a12.f();
            }
            f37458c = c11;
        } catch (Throwable th2) {
            throw th2;
        }
        return a11;
    }
}
