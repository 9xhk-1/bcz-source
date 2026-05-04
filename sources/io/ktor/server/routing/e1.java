package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRoutingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingNode.kt\nio/ktor/server/routing/RoutingNodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,328:1\n1863#2,2:329\n*S KotlinDebug\n*F\n+ 1 RoutingNode.kt\nio/ktor/server/routing/RoutingNodeKt\n*L\n308#1:329,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e1 {
    @m80.k
    public static final List<d1> a(@m80.k d1 d1Var) {
        kotlin.jvm.internal.g0.p(d1Var, "<this>");
        ArrayList arrayList = new ArrayList();
        b(d1Var, arrayList);
        return arrayList;
    }

    public static final void b(d1 d1Var, List<d1> list) {
        if (!d1Var.o0().isEmpty()) {
            list.add(d1Var);
        }
        Iterator<T> it = d1Var.n0().iterator();
        while (it.hasNext()) {
            b((d1) it.next(), list);
        }
    }

    @yz.n(message = "Please use route scoped plugins instead")
    public static final void c(@m80.k g0 g0Var, @m80.k io.ktor.util.pipeline.h reference, @m80.k io.ktor.util.pipeline.h phase) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(reference, "reference");
        kotlin.jvm.internal.g0.p(phase, "phase");
        ((d1) g0Var).z(reference, phase);
    }

    @yz.n(message = "Please use route scoped plugins instead")
    public static final void d(@m80.k g0 g0Var, @m80.k io.ktor.util.pipeline.h reference, @m80.k io.ktor.util.pipeline.h phase) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(reference, "reference");
        kotlin.jvm.internal.g0.p(phase, "phase");
        ((d1) g0Var).A(reference, phase);
    }

    @yz.n(message = "Please use route scoped plugins instead")
    public static final void e(@m80.k g0 g0Var, @m80.k io.ktor.util.pipeline.h phase, @m80.k x00.q<? super io.ktor.util.pipeline.d<g2, zx.k0>, ? super g2, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(phase, "phase");
        kotlin.jvm.internal.g0.p(block, "block");
        ((d1) g0Var).C(phase, block);
    }
}
