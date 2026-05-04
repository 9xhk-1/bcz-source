package io.ktor.server.plugins.calllogging;

import io.ktor.utils.io.c0;
import ix.g1;
import ix.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import org.fusesource.jansi.Ansi;
import org.slf4j.Logger;
import org.slf4j.event.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public boolean f61527f;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public Logger f61529h;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public x00.a<Long> f61522a = new x00.a() { // from class: io.ktor.server.plugins.calllogging.a
        @Override // x00.a
        public final Object invoke() {
            long d11;
            d11 = b.d();
            return Long.valueOf(d11);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<x00.l<zx.b, Boolean>> f61523b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<j> f61524c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public x00.l<? super zx.b, String> f61525d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f61526e = true;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public Level f61528g = Level.INFO;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<zx.b, String> {
        public a(Object obj) {
            super(1, obj, b.class, "defaultFormat", "defaultFormat(Lio/ktor/server/application/ApplicationCall;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(zx.b p02) {
            g0.p(p02, "p0");
            return ((b) this.receiver).g(p02);
        }
    }

    public static final long d() {
        return io.ktor.util.date.a.d();
    }

    @m80.k
    public final String A(@m80.k py.d dVar) {
        g0.p(dVar, "<this>");
        return f(py.e.o(dVar).l(), Ansi.Color.CYAN) + " - " + py.e.w(dVar) + " in " + CallLoggingKt.q(dVar.c(), this.f61522a) + "ms";
    }

    public final void c(@m80.k x00.a<Long> clock) {
        g0.p(clock, "clock");
        this.f61522a = clock;
    }

    public final String e(g1 g1Var) {
        try {
            if (this.f61526e && !f80.f.j()) {
                f80.f.o();
            }
        } catch (Throwable unused) {
            this.f61526e = false;
        }
        g1.a aVar = g1.f62797c;
        return (g0.g(g1Var, aVar.l()) || g0.g(g1Var, aVar.C()) || g0.g(g1Var, aVar.b()) || g0.g(g1Var, aVar.h())) ? f(g1Var, Ansi.Color.GREEN) : (g0.g(g1Var, aVar.g()) || g0.g(g1Var, aVar.I()) || g0.g(g1Var, aVar.D()) || g0.g(g1Var, aVar.B()) || g0.g(g1Var, aVar.a0()) || g0.g(g1Var, aVar.Z()) || g0.g(g1Var, aVar.w())) ? f(g1Var, Ansi.Color.YELLOW) : f(g1Var, Ansi.Color.RED);
    }

    public final String f(Object obj, Ansi.Color color) {
        if (!this.f61526e) {
            return obj.toString();
        }
        String ansi = Ansi.q().j0(color).j(obj).K0().toString();
        g0.m(ansi);
        return ansi;
    }

    public final String g(zx.b bVar) {
        g1 l11 = bVar.k().l();
        if (l11 == null) {
            l11 = "Unhandled";
        }
        if (g0.g(l11, g1.f62797c.l())) {
            return e(l11) + ": " + A(bVar.f()) + " -> " + bVar.k().a().f(y0.f63006a.Z());
        }
        if (g0.g(l11, "Unhandled")) {
            return f(l11, Ansi.Color.RED) + ": " + A(bVar.f());
        }
        return e(l11) + ": " + A(bVar.f());
    }

    public final void h() {
        this.f61526e = false;
    }

    public final void i() {
        this.f61527f = true;
    }

    public final void j(@m80.k x00.l<? super zx.b, Boolean> predicate) {
        g0.p(predicate, "predicate");
        this.f61523b.add(predicate);
    }

    public final void k(@m80.k x00.l<? super zx.b, String> formatter) {
        g0.p(formatter, "formatter");
        this.f61525d = formatter;
    }

    @m80.k
    public final x00.a<Long> l() {
        return this.f61522a;
    }

    @m80.k
    public final List<x00.l<zx.b, Boolean>> m() {
        return this.f61523b;
    }

    @m80.k
    public final x00.l<zx.b, String> n() {
        return this.f61525d;
    }

    public final boolean o() {
        return this.f61527f;
    }

    @m80.k
    public final Level p() {
        return this.f61528g;
    }

    @m80.l
    public final Logger q() {
        return this.f61529h;
    }

    @m80.k
    public final List<j> r() {
        return this.f61524c;
    }

    public final boolean s() {
        return this.f61526e;
    }

    public final void t(@m80.k String name, @m80.k x00.l<? super zx.b, String> provider) {
        g0.p(name, "name");
        g0.p(provider, "provider");
        this.f61524c.add(new j(name, provider));
    }

    public final void u(@m80.k x00.a<Long> aVar) {
        g0.p(aVar, "<set-?>");
        this.f61522a = aVar;
    }

    public final void v(boolean z11) {
        this.f61526e = z11;
    }

    public final void w(@m80.k x00.l<? super zx.b, String> lVar) {
        g0.p(lVar, "<set-?>");
        this.f61525d = lVar;
    }

    public final void x(boolean z11) {
        this.f61527f = z11;
    }

    public final void y(@m80.k Level level) {
        g0.p(level, "<set-?>");
        this.f61528g = level;
    }

    public final void z(@m80.l Logger logger) {
        this.f61529h = logger;
    }
}
