package com.google.common.graph;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.e;
import mo.e0;
import mo.k;
import mo.k0;
import mo.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f
@go.a
@e0
/* loaded from: classes7.dex */
public final class b<N> extends k<N> {
    public b(boolean directed) {
        super(directed);
    }

    public static b<Object> e() {
        return new b<>(true);
    }

    public static <N> b<N> g(k0<N> graph) {
        return new b(graph.c()).a(graph.m()).j(graph.k()).i(graph.q());
    }

    public static b<Object> k() {
        return new b<>(false);
    }

    @uo.a
    public b<N> a(boolean allowsSelfLoops) {
        this.f73534b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N> y0<N1> b() {
        return new g(this);
    }

    public b<N> d() {
        b<N> bVar = new b<>(this.f73533a);
        bVar.f73534b = this.f73534b;
        bVar.f73535c = this.f73535c;
        bVar.f73537e = this.f73537e;
        bVar.f73536d = this.f73536d;
        return bVar;
    }

    @uo.a
    public b<N> f(int expectedNodeCount) {
        this.f73537e = Optional.of(Integer.valueOf(d.d(expectedNodeCount)));
        return this;
    }

    public <N1 extends N> e.a<N1> h() {
        return new e.a<>(c());
    }

    public <N1 extends N> b<N1> i(ElementOrder<N1> incidentEdgeOrder) {
        Preconditions.checkArgument(incidentEdgeOrder.h() == ElementOrder.Type.UNORDERED || incidentEdgeOrder.h() == ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", incidentEdgeOrder);
        b<N1> c11 = c();
        c11.f73536d = (ElementOrder) Preconditions.checkNotNull(incidentEdgeOrder);
        return c11;
    }

    public <N1 extends N> b<N1> j(ElementOrder<N1> nodeOrder) {
        b<N1> c11 = c();
        c11.f73535c = (ElementOrder) Preconditions.checkNotNull(nodeOrder);
        return c11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N1 extends N> b<N1> c() {
        return this;
    }
}
