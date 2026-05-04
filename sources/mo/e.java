package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.l6;
import com.google.common.collect.q8;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.Set;
import javax.annotation.CheckForNull;
import mo.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class e<N> implements x<N> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AbstractSet<f0<N>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<f0<N>> iterator() {
            return g0.e(e.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof f0)) {
                return false;
            }
            f0<?> f0Var = (f0) obj;
            return e.this.S(f0Var) && e.this.e().contains(f0Var.f()) && e.this.a((e) f0Var.f()).contains(f0Var.g());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ro.i.A(e.this.R());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends t0<N> {
        public b(x graph, Object node) {
            super(graph, node);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public aa<f0<N>> iterator() {
            return this.f73589b.c() ? l6.e0(l6.i(l6.b0(this.f73589b.b((x<N>) this.f73588a).iterator(), new ho.r() { // from class: mo.f
                @Override // ho.r
                public final Object apply(Object obj) {
                    f0 k11;
                    k11 = f0.k(obj, e.b.this.f73588a);
                    return k11;
                }
            }), l6.b0(q8.f(this.f73589b.a((x<N>) this.f73588a), ImmutableSet.of(this.f73588a)).iterator(), new ho.r() { // from class: mo.g
                @Override // ho.r
                public final Object apply(Object obj) {
                    f0 k11;
                    k11 = f0.k(e.b.this.f73588a, obj);
                    return k11;
                }
            }))) : l6.e0(l6.b0(this.f73589b.d(this.f73588a).iterator(), new ho.r() { // from class: mo.h
                @Override // ho.r
                public final Object apply(Object obj) {
                    f0 n11;
                    n11 = f0.n(e.b.this.f73588a, obj);
                    return n11;
                }
            }));
        }
    }

    public long R() {
        long j11 = 0;
        while (e().iterator().hasNext()) {
            j11 += j(r0.next());
        }
        Preconditions.checkState((1 & j11) == 0);
        return j11 >>> 1;
    }

    public final boolean S(f0<?> endpoints) {
        return endpoints.b() == c();
    }

    public final <T> Set<T> T(Set<T> set, final N node) {
        return u0.w(set, new ho.p0() { // from class: mo.c
            @Override // ho.p0
            public final Object get() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(e.this.e().contains(node));
                return valueOf;
            }
        }, new ho.p0() { // from class: mo.d
            @Override // ho.p0
            public final Object get() {
                String format;
                format = String.format(com.google.common.graph.c.f34211h, node);
                return format;
            }
        });
    }

    public final <T> Set<T> U(Set<T> set, final N nodeU, final N nodeV) {
        return u0.w(set, new ho.p0() { // from class: mo.a
            @Override // ho.p0
            public final Object get() {
                Boolean valueOf;
                e eVar = e.this;
                Object obj = nodeU;
                Object obj2 = nodeV;
                valueOf = Boolean.valueOf(r1.e().contains(r2) && r1.e().contains(r3));
                return valueOf;
            }
        }, new ho.p0() { // from class: mo.b
            @Override // ho.p0
            public final Object get() {
                String format;
                format = String.format(com.google.common.graph.c.f34212i, nodeU, nodeV);
                return format;
            }
        });
    }

    public final void V(f0<?> endpoints) {
        Preconditions.checkNotNull(endpoints);
        Preconditions.checkArgument(S(endpoints), com.google.common.graph.c.f34220q);
    }

    @Override // mo.x, mo.k0
    public int f(N node) {
        return c() ? b((e<N>) node).size() : j(node);
    }

    @Override // mo.x
    public Set<f0<N>> g() {
        return new a();
    }

    @Override // mo.x, mo.k0
    public boolean h(f0<N> endpoints) {
        Preconditions.checkNotNull(endpoints);
        if (!S(endpoints)) {
            return false;
        }
        N f11 = endpoints.f();
        return e().contains(f11) && a((e<N>) f11).contains(endpoints.g());
    }

    @Override // mo.x, mo.k0
    public boolean i(N nodeU, N nodeV) {
        Preconditions.checkNotNull(nodeU);
        Preconditions.checkNotNull(nodeV);
        return e().contains(nodeU) && a((e<N>) nodeU).contains(nodeV);
    }

    @Override // mo.x, mo.k0
    public int j(N node) {
        if (c()) {
            return com.google.common.math.f.t(b((e<N>) node).size(), a((e<N>) node).size());
        }
        Set<N> d11 = d(node);
        return com.google.common.math.f.t(d11.size(), (m() && d11.contains(node)) ? 1 : 0);
    }

    @Override // mo.x, mo.k0
    public int l(N node) {
        return c() ? a((e<N>) node).size() : j(node);
    }

    @Override // mo.x, mo.k0
    public Set<f0<N>> n(N n11) {
        Preconditions.checkNotNull(n11);
        Preconditions.checkArgument(e().contains(n11), com.google.common.graph.c.f34209f, n11);
        return (Set<f0<N>>) T(new b(this, n11), n11);
    }

    @Override // mo.x, mo.k0
    public ElementOrder<N> q() {
        return ElementOrder.i();
    }
}
