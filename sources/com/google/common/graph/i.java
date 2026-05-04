package com.google.common.graph;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.f;
import mo.a1;
import mo.e0;
import mo.h1;
import mo.k;
import mo.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public final class i<N, V> extends k<N> {
    public i(boolean directed) {
        super(directed);
    }

    public static i<Object, Object> e() {
        return new i<>(true);
    }

    public static <N, V> i<N, V> g(p1<N, V> graph) {
        return new i(graph.c()).a(graph.m()).j(graph.k()).i(graph.q());
    }

    public static i<Object, Object> k() {
        return new i<>(false);
    }

    @uo.a
    public i<N, V> a(boolean allowsSelfLoops) {
        this.f73534b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N, V1 extends V> a1<N1, V1> b() {
        return new h1(this);
    }

    public i<N, V> d() {
        i<N, V> iVar = new i<>(this.f73533a);
        iVar.f73534b = this.f73534b;
        iVar.f73535c = this.f73535c;
        iVar.f73537e = this.f73537e;
        iVar.f73536d = this.f73536d;
        return iVar;
    }

    @uo.a
    public i<N, V> f(int expectedNodeCount) {
        this.f73537e = Optional.of(Integer.valueOf(d.d(expectedNodeCount)));
        return this;
    }

    public <N1 extends N, V1 extends V> f.a<N1, V1> h() {
        return new f.a<>(c());
    }

    public <N1 extends N> i<N1, V> i(ElementOrder<N1> elementOrder) {
        Preconditions.checkArgument(elementOrder.h() == ElementOrder.Type.UNORDERED || elementOrder.h() == ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        i<N1, V> iVar = (i<N1, V>) c();
        iVar.f73536d = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return iVar;
    }

    public <N1 extends N> i<N1, V> j(ElementOrder<N1> elementOrder) {
        i<N1, V> iVar = (i<N1, V>) c();
        iVar.f73535c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N1 extends N, V1 extends V> i<N1, V1> c() {
        return this;
    }
}
