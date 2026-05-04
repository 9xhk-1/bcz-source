package zx;

import io.ktor.server.routing.RoutingRoot;
import io.ktor.server.routing.d1;
import io.ktor.server.routing.y1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u0 {
    @m80.l
    public static final <F> F a(@m80.k d1 d1Var, @m80.k m0<?, ?, F> plugin) {
        kotlin.jvm.internal.g0.p(d1Var, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        d1 d1Var2 = d1Var;
        while (true) {
            F f11 = (F) q.s(d1Var2, plugin);
            if (f11 != null) {
                return f11;
            }
            if (d1Var2.getParent() == null) {
                if (d1Var2 instanceof RoutingRoot) {
                    return (F) q.s(y1.a(d1Var), plugin);
                }
                return null;
            }
            d1Var2 = d1Var2.getParent();
            kotlin.jvm.internal.g0.m(d1Var2);
        }
    }
}
