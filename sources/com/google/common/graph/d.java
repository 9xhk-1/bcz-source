package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.k6;
import com.google.common.collect.l6;
import com.google.common.collect.u6;
import com.google.common.graph.d;
import com.google.common.graph.e;
import ho.d0;
import ho.r;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import javax.annotation.CheckForNull;
import mo.a1;
import mo.b1;
import mo.c1;
import mo.e0;
import mo.f0;
import mo.g1;
import mo.h0;
import mo.h1;
import mo.i0;
import mo.j0;
import mo.k0;
import mo.l1;
import mo.n0;
import mo.p1;
import mo.t0;
import mo.x;
import mo.y0;
import mo.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public final class d extends n0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<N> {

        /* renamed from: a, reason: collision with root package name */
        public final N f34223a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Queue<N> f34224b;

        public a(N node) {
            this.f34223a = node;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        PENDING,
        COMPLETE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<N> extends h0<N> {

        /* renamed from: a, reason: collision with root package name */
        public final k0<N> f34228a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends t0<N> {
            public a(x graph, Object node) {
                super(graph, node);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<f0<N>> iterator() {
                return l6.b0(c.this.W().n(this.f73588a).iterator(), new r() { // from class: mo.m0
                    @Override // ho.r
                    public final Object apply(Object obj) {
                        f0 h11;
                        h11 = f0.h(d.c.this.W(), r2.g(), ((f0) obj).f());
                        return h11;
                    }
                });
            }
        }

        public c(k0<N> graph) {
            this.f34228a = graph;
        }

        @Override // mo.h0
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public k0<N> W() {
            return this.f34228a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mo.h0, mo.x, mo.k1, mo.k0
        public /* bridge */ /* synthetic */ Iterable a(Object node) {
            return a((c<N>) node);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mo.h0, mo.x, mo.f1, mo.k0
        public /* bridge */ /* synthetic */ Iterable b(Object node) {
            return b((c<N>) node);
        }

        @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
        public int f(N node) {
            return W().l(node);
        }

        @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
        public boolean h(f0<N> endpoints) {
            return W().h(d.s(endpoints));
        }

        @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
        public boolean i(N nodeU, N nodeV) {
            return W().i(nodeV, nodeU);
        }

        @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
        public int l(N node) {
            return W().f(node);
        }

        @Override // mo.h0, mo.j, mo.e, mo.x, mo.k0
        public Set<f0<N>> n(N node) {
            return new a(this, node);
        }

        @Override // mo.h0, mo.x, mo.k1, mo.k0
        public Set<N> a(N node) {
            return W().b((k0<N>) node);
        }

        @Override // mo.h0, mo.x, mo.f1, mo.k0
        public Set<N> b(N node) {
            return W().a((k0<N>) node);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.graph.d$d, reason: collision with other inner class name */
    public static class C0420d<N, E> extends i0<N, E> {

        /* renamed from: a, reason: collision with root package name */
        public final b1<N, E> f34230a;

        public C0420d(b1<N, E> network) {
            this.f34230a = network;
        }

        @Override // mo.i0, mo.b1
        public Set<E> B(N node) {
            return a0().z(node);
        }

        @Override // mo.i0, mo.t, mo.b1
        @CheckForNull
        public E H(f0<N> endpoints) {
            return a0().H(d.s(endpoints));
        }

        @Override // mo.i0, mo.t, mo.b1
        @CheckForNull
        public E I(N nodeU, N nodeV) {
            return a0().I(nodeV, nodeU);
        }

        @Override // mo.i0, mo.b1
        public f0<N> J(E edge) {
            f0<N> J = a0().J(edge);
            return f0.j(this.f34230a, J.g(), J.f());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mo.i0, mo.b1, mo.k1, mo.k0
        public /* bridge */ /* synthetic */ Iterable a(Object node) {
            return a((C0420d<N, E>) node);
        }

        @Override // mo.i0
        public b1<N, E> a0() {
            return this.f34230a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mo.i0, mo.b1, mo.f1, mo.k0
        public /* bridge */ /* synthetic */ Iterable b(Object node) {
            return b((C0420d<N, E>) node);
        }

        @Override // mo.i0, mo.t, mo.b1
        public int f(N node) {
            return a0().l(node);
        }

        @Override // mo.i0, mo.t, mo.b1
        public boolean h(f0<N> endpoints) {
            return a0().h(d.s(endpoints));
        }

        @Override // mo.i0, mo.t, mo.b1
        public boolean i(N nodeU, N nodeV) {
            return a0().i(nodeV, nodeU);
        }

        @Override // mo.i0, mo.t, mo.b1
        public int l(N node) {
            return a0().f(node);
        }

        @Override // mo.i0, mo.t, mo.b1
        public Set<E> u(N nodeU, N nodeV) {
            return a0().u(nodeV, nodeU);
        }

        @Override // mo.i0, mo.t, mo.b1
        public Set<E> v(f0<N> endpoints) {
            return a0().v(d.s(endpoints));
        }

        @Override // mo.i0, mo.b1
        public Set<E> z(N node) {
            return a0().B(node);
        }

        @Override // mo.i0, mo.b1, mo.k1, mo.k0
        public Set<N> a(N node) {
            return a0().b((b1<N, E>) node);
        }

        @Override // mo.i0, mo.b1, mo.f1, mo.k0
        public Set<N> b(N node) {
            return a0().a((b1<N, E>) node);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<N, V> extends j0<N, V> {

        /* renamed from: a, reason: collision with root package name */
        public final p1<N, V> f34231a;

        public e(p1<N, V> graph) {
            this.f34231a = graph;
        }

        @Override // mo.j0, mo.p1
        @CheckForNull
        public V F(N nodeU, N nodeV, @CheckForNull V defaultValue) {
            return Y().F(nodeV, nodeU, defaultValue);
        }

        @Override // mo.j0
        public p1<N, V> Y() {
            return this.f34231a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mo.j0, mo.x, mo.k1, mo.k0
        public /* bridge */ /* synthetic */ Iterable a(Object node) {
            return a((e<N, V>) node);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mo.j0, mo.x, mo.f1, mo.k0
        public /* bridge */ /* synthetic */ Iterable b(Object node) {
            return b((e<N, V>) node);
        }

        @Override // mo.j0, mo.w, mo.e, mo.x, mo.k0
        public int f(N node) {
            return Y().l(node);
        }

        @Override // mo.j0, mo.w, mo.e, mo.x, mo.k0
        public boolean h(f0<N> endpoints) {
            return Y().h(d.s(endpoints));
        }

        @Override // mo.j0, mo.w, mo.e, mo.x, mo.k0
        public boolean i(N nodeU, N nodeV) {
            return Y().i(nodeV, nodeU);
        }

        @Override // mo.j0, mo.w, mo.e, mo.x, mo.k0
        public int l(N node) {
            return Y().f(node);
        }

        @Override // mo.j0, mo.p1
        @CheckForNull
        public V w(f0<N> endpoints, @CheckForNull V defaultValue) {
            return Y().w(d.s(endpoints), defaultValue);
        }

        @Override // mo.j0, mo.x, mo.k1, mo.k0
        public Set<N> a(N node) {
            return Y().b((p1<N, V>) node);
        }

        @Override // mo.j0, mo.x, mo.f1, mo.k0
        public Set<N> b(N node) {
            return Y().a((p1<N, V>) node);
        }
    }

    public static boolean c(k0<?> graph, Object nextNode, @CheckForNull Object previousNode) {
        return graph.c() || !d0.a(previousNode, nextNode);
    }

    @uo.a
    public static int d(int value) {
        Preconditions.checkArgument(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    @uo.a
    public static long e(long value) {
        Preconditions.checkArgument(value >= 0, "Not true that %s is non-negative.", value);
        return value;
    }

    @uo.a
    public static int f(int value) {
        Preconditions.checkArgument(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    @uo.a
    public static long g(long value) {
        Preconditions.checkArgument(value > 0, "Not true that %s is positive.", value);
        return value;
    }

    public static <N> y0<N> h(k0<N> k0Var) {
        y0<N> y0Var = (y0<N>) com.google.common.graph.b.g(k0Var).f(k0Var.e().size()).b();
        Iterator<N> it = k0Var.e().iterator();
        while (it.hasNext()) {
            y0Var.p(it.next());
        }
        for (f0<N> f0Var : k0Var.g()) {
            y0Var.K(f0Var.f(), f0Var.g());
        }
        return y0Var;
    }

    public static <N, E> z0<N, E> i(b1<N, E> b1Var) {
        z0<N, E> z0Var = (z0<N, E>) c1.i(b1Var).h(b1Var.e().size()).g(b1Var.g().size()).c();
        Iterator<N> it = b1Var.e().iterator();
        while (it.hasNext()) {
            z0Var.p(it.next());
        }
        for (E e11 : b1Var.g()) {
            f0<N> J = b1Var.J(e11);
            z0Var.M(J.f(), J.g(), e11);
        }
        return z0Var;
    }

    public static <N, V> a1<N, V> j(p1<N, V> p1Var) {
        a1<N, V> a1Var = (a1<N, V>) i.g(p1Var).f(p1Var.e().size()).b();
        Iterator<N> it = p1Var.e().iterator();
        while (it.hasNext()) {
            a1Var.p(it.next());
        }
        for (f0<N> f0Var : p1Var.g()) {
            N f11 = f0Var.f();
            N g11 = f0Var.g();
            V F = p1Var.F(f0Var.f(), f0Var.g(), null);
            Objects.requireNonNull(F);
            a1Var.A(f11, g11, F);
        }
        return a1Var;
    }

    public static <N> boolean k(k0<N> graph) {
        int size = graph.g().size();
        if (size == 0) {
            return false;
        }
        if (!graph.c() && size >= graph.e().size()) {
            return true;
        }
        HashMap a02 = u6.a0(graph.e().size());
        Iterator<N> it = graph.e().iterator();
        while (it.hasNext()) {
            if (q(graph, a02, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(b1<?, ?> network) {
        if (network.c() || !network.E() || network.g().size() <= network.s().g().size()) {
            return k(network.s());
        }
        return true;
    }

    public static <N> y0<N> m(k0<N> k0Var, Iterable<? extends N> iterable) {
        g gVar = iterable instanceof Collection ? (y0<N>) com.google.common.graph.b.g(k0Var).f(((Collection) iterable).size()).b() : (y0<N>) com.google.common.graph.b.g(k0Var).b();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            gVar.p(it.next());
        }
        for (N n11 : gVar.e()) {
            for (N n12 : k0Var.a((k0<N>) n11)) {
                if (gVar.e().contains(n12)) {
                    gVar.K(n11, n12);
                }
            }
        }
        return gVar;
    }

    public static <N, E> z0<N, E> n(b1<N, E> b1Var, Iterable<? extends N> iterable) {
        g1 g1Var = iterable instanceof Collection ? (z0<N, E>) c1.i(b1Var).h(((Collection) iterable).size()).c() : (z0<N, E>) c1.i(b1Var).c();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            g1Var.p(it.next());
        }
        for (E e11 : g1Var.e()) {
            for (E e12 : b1Var.B(e11)) {
                N a11 = b1Var.J(e12).a(e11);
                if (g1Var.e().contains(a11)) {
                    g1Var.M(e11, a11, e12);
                }
            }
        }
        return g1Var;
    }

    public static <N, V> a1<N, V> o(p1<N, V> p1Var, Iterable<? extends N> iterable) {
        h1 h1Var = iterable instanceof Collection ? (a1<N, V>) i.g(p1Var).f(((Collection) iterable).size()).b() : (a1<N, V>) i.g(p1Var).b();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            h1Var.p(it.next());
        }
        for (N n11 : h1Var.e()) {
            for (N n12 : p1Var.a((p1<N, V>) n11)) {
                if (h1Var.e().contains(n12)) {
                    V F = p1Var.F(n11, n12, null);
                    Objects.requireNonNull(F);
                    h1Var.A(n11, n12, F);
                }
            }
        }
        return h1Var;
    }

    public static <N> ImmutableSet<N> p(k0<N> graph, N node) {
        Preconditions.checkArgument(graph.e().contains(node), com.google.common.graph.c.f34209f, node);
        return ImmutableSet.copyOf(l1.g(graph).b(node));
    }

    public static <N> boolean q(k0<N> graph, Map<Object, b> visitedNodes, N startNode) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(new a(startNode));
        while (!arrayDeque.isEmpty()) {
            a aVar = (a) arrayDeque.removeLast();
            a aVar2 = (a) arrayDeque.peekLast();
            arrayDeque.addLast(aVar);
            N n11 = aVar.f34223a;
            N n12 = aVar2 == null ? null : aVar2.f34223a;
            if (aVar.f34224b == null) {
                b bVar = visitedNodes.get(n11);
                if (bVar == b.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    b bVar2 = b.PENDING;
                    if (bVar == bVar2) {
                        return true;
                    }
                    visitedNodes.put(n11, bVar2);
                    aVar.f34224b = new ArrayDeque(graph.a((k0<N>) n11));
                }
            }
            if (!aVar.f34224b.isEmpty()) {
                N remove = aVar.f34224b.remove();
                if (c(graph, remove, n12)) {
                    arrayDeque.addLast(new a(remove));
                }
            }
            arrayDeque.removeLast();
            visitedNodes.put(n11, b.COMPLETE);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> com.google.common.graph.e<N> r(k0<N> graph) {
        e.a<N1> h11 = com.google.common.graph.b.g(graph).a(true).h();
        if (graph.c()) {
            for (N n11 : graph.e()) {
                aa it = p(graph, n11).iterator();
                while (it.hasNext()) {
                    h11.c(n11, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n12 : graph.e()) {
                if (!hashSet.contains(n12)) {
                    ImmutableSet p11 = p(graph, n12);
                    hashSet.addAll(p11);
                    int i11 = 1;
                    for (Object obj : p11) {
                        int i12 = i11 + 1;
                        Iterator it2 = k6.D(p11, i11).iterator();
                        while (it2.hasNext()) {
                            h11.c(obj, it2.next());
                        }
                        i11 = i12;
                    }
                }
            }
        }
        return h11.b();
    }

    public static <N> f0<N> s(f0<N> endpoints) {
        return endpoints.b() ? f0.k(endpoints.m(), endpoints.l()) : endpoints;
    }

    public static <N> k0<N> t(k0<N> graph) {
        return !graph.c() ? graph : graph instanceof c ? ((c) graph).f34228a : new c(graph);
    }

    public static <N, E> b1<N, E> u(b1<N, E> network) {
        return !network.c() ? network : network instanceof C0420d ? ((C0420d) network).f34230a : new C0420d(network);
    }

    public static <N, V> p1<N, V> v(p1<N, V> graph) {
        return !graph.c() ? graph : graph instanceof e ? ((e) graph).f34231a : new e(graph);
    }
}
