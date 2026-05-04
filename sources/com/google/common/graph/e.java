package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.u6;
import com.google.common.graph.c;
import ho.r;
import ho.t;
import java.util.Set;
import mo.e0;
import mo.f0;
import mo.h0;
import mo.j1;
import mo.k0;
import mo.l0;
import mo.x;
import mo.y0;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
@j(containerOf = {"N"})
/* loaded from: classes7.dex */
public class e<N> extends h0<N> {

    /* renamed from: a, reason: collision with root package name */
    public final x<N> f34232a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<N> {

        /* renamed from: a, reason: collision with root package name */
        public final y0<N> f34233a;

        public a(b<N> graphBuilder) {
            this.f34233a = graphBuilder.d().i(ElementOrder.g()).b();
        }

        @uo.a
        public a<N> a(N node) {
            this.f34233a.p(node);
            return this;
        }

        public e<N> b() {
            return e.Z(this.f34233a);
        }

        @uo.a
        public a<N> c(N nodeU, N nodeV) {
            this.f34233a.K(nodeU, nodeV);
            return this;
        }

        @uo.a
        public a<N> d(f0<N> endpoints) {
            this.f34233a.G(endpoints);
            return this;
        }
    }

    public e(x<N> backingGraph) {
        this.f34232a = backingGraph;
    }

    public static <N> l0<N, c.a> X(k0<N> graph, N node) {
        r b11 = t.b(c.a.EDGE_EXISTS);
        return graph.c() ? com.google.common.graph.a.v(node, graph.n(node), b11) : h.l(u6.j(graph.d(node), b11));
    }

    @Deprecated
    public static <N> e<N> Y(e<N> graph) {
        return (e) Preconditions.checkNotNull(graph);
    }

    public static <N> e<N> Z(k0<N> graph) {
        return graph instanceof e ? (e) graph : new e<>(new j1(b.g(graph), a0(graph), graph.g().size()));
    }

    public static <N> ImmutableMap<N, l0<N, c.a>> a0(k0<N> graph) {
        ImmutableMap.b builder = ImmutableMap.builder();
        for (N n11 : graph.e()) {
            builder.i(n11, X(graph, n11));
        }
        return builder.d();
    }

    @Override // mo.h0
    public x<N> W() {
        return this.f34232a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.x, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Set a(Object node) {
        return super.a((e<N>) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.x, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Set b(Object node) {
        return super.b((e<N>) node);
    }

    @Override // mo.h0, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set d(Object node) {
        return super.d(node);
    }

    @Override // mo.h0, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ int f(Object node) {
        return super.f(node);
    }

    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean h(f0 endpoints) {
        return super.h(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean i(Object nodeU, Object nodeV) {
        return super.i(nodeU, nodeV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ int j(Object node) {
        return super.j(node);
    }

    @Override // mo.h0, mo.x, mo.k0
    public /* bridge */ /* synthetic */ ElementOrder k() {
        return super.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ int l(Object node) {
        return super.l(node);
    }

    @Override // mo.h0, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
    public ElementOrder<N> q() {
        return ElementOrder.g();
    }
}
