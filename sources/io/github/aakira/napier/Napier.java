package io.github.aakira.napier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kw.a;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Napier {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Napier f60730b = new Napier();

    /* renamed from: a, reason: collision with root package name */
    public static final List<a> f60729a = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        ASSERT
    }

    public static /* synthetic */ void B(Napier napier, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        napier.z(str, th2, str2);
    }

    public static /* synthetic */ void C(Napier napier, x00.a aVar, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        napier.A(aVar, th2, str);
    }

    public static /* synthetic */ void F(Napier napier, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        napier.D(str, th2, str2);
    }

    public static /* synthetic */ void G(Napier napier, x00.a aVar, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        napier.E(aVar, th2, str);
    }

    public static /* synthetic */ void d(Napier napier, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        napier.b(str, th2, str2);
    }

    public static /* synthetic */ void e(Napier napier, x00.a aVar, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        napier.c(aVar, th2, str);
    }

    public static /* synthetic */ void h(Napier napier, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        napier.f(str, th2, str2);
    }

    public static /* synthetic */ void i(Napier napier, x00.a aVar, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        napier.g(aVar, th2, str);
    }

    public static /* synthetic */ void l(Napier napier, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        napier.j(str, th2, str2);
    }

    public static /* synthetic */ void m(Napier napier, x00.a aVar, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        napier.k(aVar, th2, str);
    }

    public static /* synthetic */ void q(Napier napier, Level level, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        napier.o(level, str, th2, str2);
    }

    public static /* synthetic */ void r(Napier napier, Level level, String str, Throwable th2, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        napier.p(level, str, th2, aVar);
    }

    public static /* synthetic */ void x(Napier napier, String str, Throwable th2, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        napier.v(str, th2, str2);
    }

    public static /* synthetic */ void y(Napier napier, x00.a aVar, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        napier.w(aVar, th2, str);
    }

    public final void A(@k x00.a<String> message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        p(Level.WARNING, str, th2, message);
    }

    public final void D(@k String message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        o(Level.ASSERT, str, th2, message);
    }

    public final void E(@k x00.a<String> message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        p(Level.ASSERT, str, th2, message);
    }

    public final void a(@k a antilog) {
        g0.p(antilog, "antilog");
        f60729a.add(antilog);
    }

    public final void b(@k String message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        o(Level.DEBUG, str, th2, message);
    }

    public final void c(@k x00.a<String> message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        p(Level.DEBUG, str, th2, message);
    }

    public final void f(@k String message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        o(Level.ERROR, str, th2, message);
    }

    public final void g(@k x00.a<String> message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        p(Level.ERROR, str, th2, message);
    }

    public final void j(@k String message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        o(Level.INFO, str, th2, message);
    }

    public final void k(@k x00.a<String> message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        p(Level.INFO, str, th2, message);
    }

    public final boolean n(@k Level priority, @l String str) {
        g0.p(priority, "priority");
        List<a> list = f60729a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).a(priority, str)) {
                return true;
            }
        }
        return false;
    }

    public final void o(@k Level priority, @l String str, @l Throwable th2, @k String message) {
        g0.p(priority, "priority");
        g0.p(message, "message");
        if (n(priority, str)) {
            s(priority, str, th2, message);
        }
    }

    public final void p(@k Level priority, @l String str, @l Throwable th2, @k x00.a<String> message) {
        g0.p(priority, "priority");
        g0.p(message, "message");
        if (n(priority, str)) {
            s(priority, str, th2, message.invoke());
        }
    }

    @v0
    public final void s(@k Level priority, @l String str, @l Throwable th2, @l String str2) {
        g0.p(priority, "priority");
        Iterator<T> it = f60729a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).d(priority, str, th2, str2);
        }
    }

    public final void t() {
        f60729a.clear();
    }

    public final void u(@k a antilog) {
        g0.p(antilog, "antilog");
        f60729a.remove(antilog);
    }

    public final void v(@k String message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        o(Level.VERBOSE, str, th2, message);
    }

    public final void w(@k x00.a<String> message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        p(Level.VERBOSE, str, th2, message);
    }

    public final void z(@k String message, @l Throwable th2, @l String str) {
        g0.p(message, "message");
        o(Level.WARNING, str, th2, message);
    }
}
