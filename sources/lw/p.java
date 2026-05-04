package lw;

import c40.l2;
import io.ktor.utils.io.c0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {
    @c0
    @m80.k
    public static final c c(@m80.k ow.a engine, @m80.k x00.l<? super j<?>, g2> block) {
        g0.p(engine, "engine");
        g0.p(block, "block");
        j jVar = new j();
        block.invoke(jVar);
        return new c(engine, jVar, false);
    }

    @c0
    @m80.k
    public static final <T extends ow.j> c d(@m80.k ow.l<? extends T> engineFactory, @m80.k x00.l<? super j<T>, g2> block) {
        g0.p(engineFactory, "engineFactory");
        g0.p(block, "block");
        j jVar = new j();
        block.invoke(jVar);
        final ow.a a11 = engineFactory.a(jVar.m());
        c cVar = new c(a11, jVar, true);
        d.b bVar = cVar.getCoroutineContext().get(l2.f7886e0);
        g0.m(bVar);
        ((l2) bVar).z0(new x00.l() { // from class: lw.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = p.g(ow.a.this, (Throwable) obj);
                return g11;
            }
        });
        return cVar;
    }

    public static /* synthetic */ c e(ow.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = new x00.l() { // from class: lw.n
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 f11;
                    f11 = p.f((j) obj2);
                    return f11;
                }
            };
        }
        return d(lVar, lVar2);
    }

    public static final g2 f(j jVar) {
        g0.p(jVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 g(ow.a aVar, Throwable th2) {
        aVar.close();
        return g2.f100423a;
    }
}
