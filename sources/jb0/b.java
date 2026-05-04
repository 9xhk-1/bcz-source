package jb0;

import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.koin.core.logger.Level;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f64012a = new b();

    public static final g2 e(Level level, List list, na0.b startKoin) {
        g0.p(startKoin, "$this$startKoin");
        startKoin.f(c.f64013a.c(level));
        startKoin.g(list);
        return g2.f100423a;
    }

    @k
    public final na0.a b() {
        return c.f64013a.a().get();
    }

    @l
    public final na0.a c() {
        return c.f64013a.a().c();
    }

    public final void d(@k final List<va0.c> modules, @k final Level level) {
        g0.p(modules, "modules");
        g0.p(level, "level");
        qa0.a.e(new x00.l() { // from class: jb0.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = b.e(Level.this, modules, (na0.b) obj);
                return e11;
            }
        });
    }

    public final void f() {
        qa0.a.f();
    }
}
