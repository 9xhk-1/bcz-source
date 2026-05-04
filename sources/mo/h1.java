package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aa;
import com.google.common.graph.ElementOrder;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class h1<N, V> extends j1<N, V> implements a1<N, V> {

    /* renamed from: f, reason: collision with root package name */
    public final ElementOrder<N> f73514f;

    public h1(k<? super N> kVar) {
        super(kVar);
        this.f73514f = (ElementOrder<N>) kVar.f73536d.a();
    }

    @Override // mo.a1
    @CheckForNull
    @uo.a
    public V A(N nodeU, N nodeV, V value) {
        Preconditions.checkNotNull(nodeU, "nodeU");
        Preconditions.checkNotNull(nodeV, "nodeV");
        Preconditions.checkNotNull(value, "value");
        if (!m()) {
            Preconditions.checkArgument(!nodeU.equals(nodeV), com.google.common.graph.c.f34217n, nodeU);
        }
        l0<N, V> f11 = this.f73529d.f(nodeU);
        if (f11 == null) {
            f11 = c0(nodeU);
        }
        V i11 = f11.i(nodeV, value);
        l0<N, V> f12 = this.f73529d.f(nodeV);
        if (f12 == null) {
            f12 = c0(nodeV);
        }
        f12.d(nodeU, value);
        if (i11 == null) {
            long j11 = this.f73530e + 1;
            this.f73530e = j11;
            com.google.common.graph.d.g(j11);
        }
        return i11;
    }

    @Override // mo.a1
    @CheckForNull
    @uo.a
    public V D(f0<N> endpoints, V value) {
        V(endpoints);
        return A(endpoints.f(), endpoints.g(), value);
    }

    @uo.a
    public final l0<N, V> c0(N node) {
        l0<N, V> d02 = d0();
        Preconditions.checkState(this.f73529d.i(node, d02) == null);
        return d02;
    }

    public final l0<N, V> d0() {
        return c() ? com.google.common.graph.a.u(this.f73514f) : com.google.common.graph.h.k(this.f73514f);
    }

    @Override // mo.a1
    @uo.a
    public boolean o(N n11) {
        Preconditions.checkNotNull(n11, "node");
        l0 l0Var = (l0<N, V>) this.f73529d.f(n11);
        if (l0Var == null) {
            return false;
        }
        if (m() && l0Var.f(n11) != null) {
            l0Var.g(n11);
            this.f73530e--;
        }
        aa it = ImmutableList.copyOf((Collection) l0Var.b()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            l0<N, V> h11 = this.f73529d.h(next);
            Objects.requireNonNull(h11);
            h11.g(n11);
            Objects.requireNonNull(l0Var.f(next));
            this.f73530e--;
        }
        if (c()) {
            aa it2 = ImmutableList.copyOf((Collection) l0Var.c()).iterator();
            while (it2.hasNext()) {
                E next2 = it2.next();
                l0<N, V> h12 = this.f73529d.h(next2);
                Objects.requireNonNull(h12);
                Preconditions.checkState(h12.f(n11) != null);
                l0Var.g(next2);
                this.f73530e--;
            }
        }
        this.f73529d.j(n11);
        com.google.common.graph.d.e(this.f73530e);
        return true;
    }

    @Override // mo.a1
    @uo.a
    public boolean p(N node) {
        Preconditions.checkNotNull(node, "node");
        if (Z(node)) {
            return false;
        }
        c0(node);
        return true;
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public ElementOrder<N> q() {
        return this.f73514f;
    }

    @Override // mo.a1
    @CheckForNull
    @uo.a
    public V r(N nodeU, N nodeV) {
        Preconditions.checkNotNull(nodeU, "nodeU");
        Preconditions.checkNotNull(nodeV, "nodeV");
        l0<N, V> f11 = this.f73529d.f(nodeU);
        l0<N, V> f12 = this.f73529d.f(nodeV);
        if (f11 == null || f12 == null) {
            return null;
        }
        V f13 = f11.f(nodeV);
        if (f13 != null) {
            f12.g(nodeU);
            long j11 = this.f73530e - 1;
            this.f73530e = j11;
            com.google.common.graph.d.e(j11);
        }
        return f13;
    }

    @Override // mo.a1
    @CheckForNull
    @uo.a
    public V t(f0<N> endpoints) {
        V(endpoints);
        return r(endpoints.f(), endpoints.g());
    }
}
