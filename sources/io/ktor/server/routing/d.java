package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import ix.p1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHostsRoutingBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostsRoutingBuilder.kt\nio/ktor/server/routing/HostRouteSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,153:1\n1755#2,3:154\n24#3:157\n*S KotlinDebug\n*F\n+ 1 HostsRoutingBuilder.kt\nio/ktor/server/routing/HostRouteSelector\n*L\n120#1:154,3\n131#1:157\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends h0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f61595d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f61596e = "$RequestHost";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f61597f = "$RequestPort";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f61598a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Regex> f61599b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Integer> f61600c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public d(@m80.k List<String> hostList, @m80.k List<Regex> hostPatterns, @m80.k List<Integer> portsList) {
        kotlin.jvm.internal.g0.p(hostList, "hostList");
        kotlin.jvm.internal.g0.p(hostPatterns, "hostPatterns");
        kotlin.jvm.internal.g0.p(portsList, "portsList");
        this.f61598a = hostList;
        this.f61599b = hostPatterns;
        this.f61600c = portsList;
        if (hostList.isEmpty() && hostPatterns.isEmpty() && portsList.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d f(d dVar, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = dVar.f61598a;
        }
        if ((i11 & 2) != 0) {
            list2 = dVar.f61599b;
        }
        if ((i11 & 4) != 0) {
            list3 = dVar.f61600c;
        }
        return dVar.e(list, list2, list3);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        boolean z11;
        String A = jy.s.f(p1Var.c().f()).A();
        int C = jy.s.f(p1Var.c().f()).C();
        if (!this.f61598a.isEmpty() || !this.f61599b.isEmpty()) {
            boolean contains = this.f61598a.contains(A);
            if (!contains) {
                List<Regex> list = this.f61599b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Regex) it.next()).matches(A)) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            z11 = false;
            if (!contains && !z11) {
                return i0.f61619b.c();
            }
        }
        if (!this.f61600c.isEmpty() && !this.f61600c.contains(l00.a.f(C))) {
            return i0.f61619b.c();
        }
        p1.a aVar = ix.p1.f62972b;
        ix.q1 b11 = ix.t1.b(0, 1, null);
        b11.k(f61596e, A);
        b11.k(f61597f, String.valueOf(C));
        return new i0.c(1.0d, b11.build(), 0, 4, null);
    }

    @m80.k
    public final List<String> b() {
        return this.f61598a;
    }

    @m80.k
    public final List<Regex> c() {
        return this.f61599b;
    }

    @m80.k
    public final List<Integer> d() {
        return this.f61600c;
    }

    @m80.k
    public final d e(@m80.k List<String> hostList, @m80.k List<Regex> hostPatterns, @m80.k List<Integer> portsList) {
        kotlin.jvm.internal.g0.p(hostList, "hostList");
        kotlin.jvm.internal.g0.p(hostPatterns, "hostPatterns");
        kotlin.jvm.internal.g0.p(portsList, "portsList");
        return new d(hostList, hostPatterns, portsList);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.g0.g(this.f61598a, dVar.f61598a) && kotlin.jvm.internal.g0.g(this.f61599b, dVar.f61599b) && kotlin.jvm.internal.g0.g(this.f61600c, dVar.f61600c);
    }

    @m80.k
    public final List<String> g() {
        return this.f61598a;
    }

    @m80.k
    public final List<Regex> h() {
        return this.f61599b;
    }

    public int hashCode() {
        return (((this.f61598a.hashCode() * 31) + this.f61599b.hashCode()) * 31) + this.f61600c.hashCode();
    }

    @m80.k
    public final List<Integer> i() {
        return this.f61600c;
    }

    @m80.k
    public String toString() {
        return '(' + this.f61598a + j2.O + this.f61599b + j2.O + this.f61600c + ')';
    }
}
