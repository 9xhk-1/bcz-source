package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.l6;
import com.google.common.collect.q8;
import com.google.common.collect.u6;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public abstract class t<N, E> implements b1<N, E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j<N> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: mo.t$a$a, reason: collision with other inner class name */
        public class C0887a extends AbstractSet<f0<N>> {
            public C0887a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof f0)) {
                    return false;
                }
                f0<?> f0Var = (f0) obj;
                return a.this.S(f0Var) && a.this.e().contains(f0Var.f()) && a.this.a((a) f0Var.f()).contains(f0Var.g());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<f0<N>> iterator() {
                return l6.b0(t.this.g().iterator(), new ho.r() { // from class: mo.s
                    @Override // ho.r
                    public final Object apply(Object obj) {
                        f0 J;
                        J = t.this.J(obj);
                        return J;
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return t.this.g().size();
            }
        }

        public a() {
        }

        @Override // mo.x, mo.k1, mo.k0
        public /* bridge */ /* synthetic */ Iterable a(Object node) {
            return a((a) node);
        }

        @Override // mo.x, mo.f1, mo.k0
        public /* bridge */ /* synthetic */ Iterable b(Object node) {
            return b((a) node);
        }

        @Override // mo.x, mo.k0
        public boolean c() {
            return t.this.c();
        }

        @Override // mo.x, mo.k0
        public Set<N> d(N node) {
            return t.this.d(node);
        }

        @Override // mo.x, mo.k0
        public Set<N> e() {
            return t.this.e();
        }

        @Override // mo.j, mo.e, mo.x
        public Set<f0<N>> g() {
            return t.this.E() ? super.g() : new C0887a();
        }

        @Override // mo.x, mo.k0
        public ElementOrder<N> k() {
            return t.this.k();
        }

        @Override // mo.x, mo.k0
        public boolean m() {
            return t.this.m();
        }

        @Override // mo.j, mo.e, mo.x, mo.k0
        public ElementOrder<N> q() {
            return ElementOrder.i();
        }

        @Override // mo.x, mo.k1, mo.k0
        public Set<N> a(N node) {
            return t.this.a((t) node);
        }

        @Override // mo.x, mo.f1, mo.k0
        public Set<N> b(N node) {
            return t.this.b((t) node);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ho.i0<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f73585a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f73586b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f73587c;

        public b(final t this$0, final Object val$nodePresent, final Object val$nodeToCheck) {
            this.f73585a = val$nodePresent;
            this.f73586b = val$nodeToCheck;
            this.f73587c = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ho.i0
        public boolean apply(E e11) {
            return this.f73587c.J(e11).a(this.f73585a).equals(this.f73586b);
        }
    }

    public static <N, E> Map<E, f0<N>> U(final b1<N, E> network) {
        return u6.j(network.g(), new ho.r() { // from class: mo.r
            @Override // ho.r
            public final Object apply(Object obj) {
                return b1.this.J(obj);
            }
        });
    }

    @Override // mo.b1
    public Set<E> C(E e11) {
        f0<N> J = J(e11);
        return (Set<E>) V(q8.f(q8.O(n(J.f()), n(J.g())), ImmutableSet.of((Object) e11)), e11);
    }

    @Override // mo.b1
    @CheckForNull
    public E H(f0<N> endpoints) {
        Z(endpoints);
        return I(endpoints.f(), endpoints.g());
    }

    @Override // mo.b1
    @CheckForNull
    public E I(N nodeU, N nodeV) {
        Set<E> u11 = u(nodeU, nodeV);
        int size = u11.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return u11.iterator().next();
        }
        throw new IllegalArgumentException(String.format(com.google.common.graph.c.f34215l, nodeU, nodeV));
    }

    public final ho.i0<E> T(final N nodePresent, final N nodeToCheck) {
        return new b(this, nodePresent, nodeToCheck);
    }

    public final <T> Set<T> V(Set<T> set, final E edge) {
        return u0.w(set, new ho.p0() { // from class: mo.p
            @Override // ho.p0
            public final Object get() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(t.this.g().contains(edge));
                return valueOf;
            }
        }, new ho.p0() { // from class: mo.q
            @Override // ho.p0
            public final Object get() {
                String format;
                format = String.format(com.google.common.graph.c.f34213j, edge);
                return format;
            }
        });
    }

    public final boolean W(f0<?> endpoints) {
        return endpoints.b() == c();
    }

    public final <T> Set<T> X(Set<T> set, final N node) {
        return u0.w(set, new ho.p0() { // from class: mo.l
            @Override // ho.p0
            public final Object get() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(t.this.e().contains(node));
                return valueOf;
            }
        }, new ho.p0() { // from class: mo.m
            @Override // ho.p0
            public final Object get() {
                String format;
                format = String.format(com.google.common.graph.c.f34211h, node);
                return format;
            }
        });
    }

    public final <T> Set<T> Y(Set<T> set, final N nodeU, final N nodeV) {
        return u0.w(set, new ho.p0() { // from class: mo.n
            @Override // ho.p0
            public final Object get() {
                Boolean valueOf;
                t tVar = t.this;
                Object obj = nodeU;
                Object obj2 = nodeV;
                valueOf = Boolean.valueOf(r1.e().contains(r2) && r1.e().contains(r3));
                return valueOf;
            }
        }, new ho.p0() { // from class: mo.o
            @Override // ho.p0
            public final Object get() {
                String format;
                format = String.format(com.google.common.graph.c.f34212i, nodeU, nodeV);
                return format;
            }
        });
    }

    public final void Z(f0<?> endpoints) {
        Preconditions.checkNotNull(endpoints);
        Preconditions.checkArgument(W(endpoints), com.google.common.graph.c.f34220q);
    }

    @Override // mo.b1
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return c() == b1Var.c() && e().equals(b1Var.e()) && U(this).equals(U(b1Var));
    }

    @Override // mo.b1
    public int f(N node) {
        return c() ? z(node).size() : j(node);
    }

    @Override // mo.b1
    public boolean h(f0<N> endpoints) {
        Preconditions.checkNotNull(endpoints);
        if (W(endpoints)) {
            return i(endpoints.f(), endpoints.g());
        }
        return false;
    }

    @Override // mo.b1
    public final int hashCode() {
        return U(this).hashCode();
    }

    @Override // mo.b1
    public boolean i(N nodeU, N nodeV) {
        Preconditions.checkNotNull(nodeU);
        Preconditions.checkNotNull(nodeV);
        return e().contains(nodeU) && a((t<N, E>) nodeU).contains(nodeV);
    }

    @Override // mo.b1
    public int j(N node) {
        return c() ? com.google.common.math.f.t(z(node).size(), B(node).size()) : com.google.common.math.f.t(n(node).size(), u(node, node).size());
    }

    @Override // mo.b1
    public int l(N node) {
        return c() ? B(node).size() : j(node);
    }

    @Override // mo.b1
    public k0<N> s() {
        return new a();
    }

    public String toString() {
        return "isDirected: " + c() + ", allowsParallelEdges: " + E() + ", allowsSelfLoops: " + m() + ", nodes: " + e() + ", edges: " + U(this);
    }

    @Override // mo.b1
    public Set<E> u(N n11, N n12) {
        Set<E> B = B(n11);
        Set<E> z11 = z(n12);
        return (Set<E>) Y(B.size() <= z11.size() ? Collections.unmodifiableSet(q8.i(B, T(n11, n12))) : Collections.unmodifiableSet(q8.i(z11, T(n12, n11))), n11, n12);
    }

    @Override // mo.b1
    public Set<E> v(f0<N> endpoints) {
        Z(endpoints);
        return u(endpoints.f(), endpoints.g());
    }
}
