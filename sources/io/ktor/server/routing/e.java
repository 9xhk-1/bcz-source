package io.ktor.server.routing;

import java.util.List;
import kotlin.text.Regex;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHostsRoutingBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostsRoutingBuilder.kt\nio/ktor/server/routing/HostsRoutingBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final g0 a(@m80.k g0 g0Var, @m80.k String host, int i11, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(host, "host");
        kotlin.jvm.internal.g0.p(build, "build");
        return b(g0Var, a00.g0.l(host), a00.h0.J(), i11 > 0 ? a00.g0.l(Integer.valueOf(i11)) : a00.h0.J(), build);
    }

    @m80.k
    public static final g0 b(@m80.k g0 g0Var, @m80.k List<String> hosts, @m80.k List<Regex> hostPatterns, @m80.k List<Integer> ports, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(hosts, "hosts");
        kotlin.jvm.internal.g0.p(hostPatterns, "hostPatterns");
        kotlin.jvm.internal.g0.p(ports, "ports");
        kotlin.jvm.internal.g0.p(build, "build");
        g0 d11 = g0Var.d(new d(hosts, hostPatterns, ports));
        build.invoke(d11);
        return d11;
    }

    @m80.k
    public static final g0 c(@m80.k g0 g0Var, @m80.k List<String> hosts, @m80.k List<Integer> ports, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(hosts, "hosts");
        kotlin.jvm.internal.g0.p(ports, "ports");
        kotlin.jvm.internal.g0.p(build, "build");
        return b(g0Var, hosts, a00.h0.J(), ports, build);
    }

    @m80.k
    public static final g0 d(@m80.k g0 g0Var, @m80.k Regex hostPattern, int i11, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(hostPattern, "hostPattern");
        kotlin.jvm.internal.g0.p(build, "build");
        return b(g0Var, a00.h0.J(), a00.g0.l(hostPattern), i11 > 0 ? a00.g0.l(Integer.valueOf(i11)) : a00.h0.J(), build);
    }

    public static /* synthetic */ g0 e(g0 g0Var, String str, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(g0Var, str, i11, lVar);
    }

    public static /* synthetic */ g0 f(g0 g0Var, List list, List list2, List list3, x00.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list3 = a00.h0.J();
        }
        return b(g0Var, list, list2, list3, lVar);
    }

    public static /* synthetic */ g0 g(g0 g0Var, List list, List list2, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = a00.h0.J();
        }
        return c(g0Var, list, list2, lVar);
    }

    public static /* synthetic */ g0 h(g0 g0Var, Regex regex, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return d(g0Var, regex, i11, lVar);
    }

    @m80.k
    public static final g0 i(@m80.k g0 g0Var, @m80.k int[] ports, @m80.k x00.l<? super g0, g2> build) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(ports, "ports");
        kotlin.jvm.internal.g0.p(build, "build");
        if (ports.length == 0) {
            throw new IllegalArgumentException("At least one port need to be specified");
        }
        g0 d11 = g0Var.d(new d(a00.h0.J(), a00.h0.J(), a00.a0.bz(ports)));
        build.invoke(d11);
        return d11;
    }
}
