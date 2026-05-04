package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.u6;
import ho.r;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import mo.a1;
import mo.e0;
import mo.f0;
import mo.j1;
import mo.l0;
import mo.p1;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
@j(containerOf = {"N", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
/* loaded from: classes7.dex */
public final class f<N, V> extends j1<N, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<N, V> {

        /* renamed from: a, reason: collision with root package name */
        public final a1<N, V> f34234a;

        public a(i<N, V> graphBuilder) {
            this.f34234a = graphBuilder.d().i(ElementOrder.g()).b();
        }

        @uo.a
        public a<N, V> a(N node) {
            this.f34234a.p(node);
            return this;
        }

        public f<N, V> b() {
            return f.g0(this.f34234a);
        }

        @uo.a
        public a<N, V> c(N nodeU, N nodeV, V value) {
            this.f34234a.A(nodeU, nodeV, value);
            return this;
        }

        @uo.a
        public a<N, V> d(f0<N> endpoints, V value) {
            this.f34234a.D(endpoints, value);
            return this;
        }
    }

    public f(p1<N, V> graph) {
        super(i.g(graph), h0(graph), graph.g().size());
    }

    public static /* synthetic */ Object c0(p1 p1Var, Object obj, Object obj2) {
        Object F = p1Var.F(obj, obj2, null);
        Objects.requireNonNull(F);
        return F;
    }

    public static <N, V> l0<N, V> e0(final p1<N, V> graph, final N node) {
        r rVar = new r() { // from class: mo.s0
            @Override // ho.r
            public final Object apply(Object obj) {
                return com.google.common.graph.f.c0(p1.this, node, obj);
            }
        };
        return graph.c() ? com.google.common.graph.a.v(node, graph.n(node), rVar) : h.l(u6.j(graph.d(node), rVar));
    }

    @Deprecated
    public static <N, V> f<N, V> f0(f<N, V> graph) {
        return (f) Preconditions.checkNotNull(graph);
    }

    public static <N, V> f<N, V> g0(p1<N, V> graph) {
        return graph instanceof f ? (f) graph : new f<>(graph);
    }

    public static <N, V> ImmutableMap<N, l0<N, V>> h0(p1<N, V> graph) {
        ImmutableMap.b builder = ImmutableMap.builder();
        for (N n11 : graph.e()) {
            builder.i(n11, e0(graph, n11));
        }
        return builder.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.p1
    @CheckForNull
    public /* bridge */ /* synthetic */ Object F(Object nodeU, Object nodeV, @CheckForNull Object defaultValue) {
        return super.F(nodeU, nodeV, defaultValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.x, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Set a(Object node) {
        return super.a((f<N, V>) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.x, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Set b(Object node) {
        return super.b((f<N, V>) node);
    }

    @Override // mo.j1, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set d(Object node) {
        return super.d(node);
    }

    @Override // mo.w, mo.p1
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public e<N> s() {
        return new e<>(this);
    }

    @Override // mo.j1, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    @Override // mo.j1, mo.w, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean h(f0 endpoints) {
        return super.h(endpoints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.w, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean i(Object nodeU, Object nodeV) {
        return super.i(nodeU, nodeV);
    }

    @Override // mo.j1, mo.x, mo.k0
    public /* bridge */ /* synthetic */ ElementOrder k() {
        return super.k();
    }

    @Override // mo.j1, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.w, mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public ElementOrder<N> q() {
        return ElementOrder.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.j1, mo.p1
    @CheckForNull
    public /* bridge */ /* synthetic */ Object w(f0 endpoints, @CheckForNull Object defaultValue) {
        return super.w(endpoints, defaultValue);
    }
}
