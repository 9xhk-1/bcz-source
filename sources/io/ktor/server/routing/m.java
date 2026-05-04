package io.ktor.server.routing;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalPortRoutingBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalPortRoutingBuilder.kt\nio/ktor/server/routing/LocalPortRoutingBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* loaded from: classes8.dex */
public final class m {
    @m80.k
    public static final g0 a(@m80.k g0 g0Var, int i11, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(build, "build");
        if (1 <= i11 && i11 < 65536) {
            g0 d11 = g0Var.d(new l(i11));
            build.invoke(d11);
            return d11;
        }
        throw new IllegalArgumentException(("Port " + i11 + " must be a positive number between 1 and 65,535").toString());
    }
}
