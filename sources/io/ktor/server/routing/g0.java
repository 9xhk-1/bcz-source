package io.ktor.server.routing;

import io.ktor.server.routing.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ Object b(g0 g0Var, zx.m0 m0Var, x00.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: install");
            }
            if ((i11 & 2) != 0) {
                lVar = new x00.l() { // from class: io.ktor.server.routing.f0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 c11;
                        c11 = g0.a.c(obj2);
                        return c11;
                    }
                };
            }
            return g0Var.b(m0Var, lVar);
        }

        public static g2 c(Object obj) {
            kotlin.jvm.internal.g0.p(obj, "<this>");
            return g2.f100423a;
        }
    }

    @m80.k
    zx.f a();

    @m80.k
    <B, F> F b(@m80.k zx.m0<? super zx.c, ? extends B, F> m0Var, @m80.k x00.l<? super B, g2> lVar);

    @m80.k
    g0 d(@m80.k h0 h0Var);

    void e(@m80.k x00.p<? super c1, ? super j00.c<? super g2>, ? extends Object> pVar);

    @m80.k
    xy.b getAttributes();

    @m80.l
    g0 getParent();

    @m80.k
    <F> F h(@m80.k zx.m0<?, ?, F> m0Var);
}
