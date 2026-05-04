package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aa;
import java.util.Collection;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class g1<N, E> extends i1<N, E> implements z0<N, E> {
    public g1(c1<? super N, ? super E> builder) {
        super(builder);
    }

    @Override // mo.z0
    @uo.a
    public boolean L(E edge) {
        Preconditions.checkNotNull(edge, "edge");
        N f11 = this.f73525g.f(edge);
        boolean z11 = false;
        if (f11 == null) {
            return false;
        }
        d1<N, E> f12 = this.f73524f.f(f11);
        Objects.requireNonNull(f12);
        d1<N, E> d1Var = f12;
        N d11 = d1Var.d(edge);
        d1<N, E> f13 = this.f73524f.f(d11);
        Objects.requireNonNull(f13);
        d1<N, E> d1Var2 = f13;
        d1Var.f(edge);
        if (m() && f11.equals(d11)) {
            z11 = true;
        }
        d1Var2.h(edge, z11);
        this.f73525g.j(edge);
        return true;
    }

    @Override // mo.z0
    @uo.a
    public boolean M(N nodeU, N nodeV, E edge) {
        Preconditions.checkNotNull(nodeU, "nodeU");
        Preconditions.checkNotNull(nodeV, "nodeV");
        Preconditions.checkNotNull(edge, "edge");
        if (c0(edge)) {
            f0<N> J = J(edge);
            f0 j11 = f0.j(this, nodeU, nodeV);
            Preconditions.checkArgument(J.equals(j11), com.google.common.graph.c.f34214k, edge, J, j11);
            return false;
        }
        d1<N, E> f11 = this.f73524f.f(nodeU);
        if (!E()) {
            Preconditions.checkArgument(f11 == null || !f11.b().contains(nodeV), com.google.common.graph.c.f34216m, nodeU, nodeV);
        }
        boolean equals = nodeU.equals(nodeV);
        if (!m()) {
            Preconditions.checkArgument(!equals, com.google.common.graph.c.f34217n, nodeU);
        }
        if (f11 == null) {
            f11 = e0(nodeU);
        }
        f11.i(edge, nodeV);
        d1<N, E> f12 = this.f73524f.f(nodeV);
        if (f12 == null) {
            f12 = e0(nodeV);
        }
        f12.j(edge, nodeU, equals);
        this.f73525g.i(edge, nodeU);
        return true;
    }

    @uo.a
    public final d1<N, E> e0(N node) {
        d1<N, E> f02 = f0();
        Preconditions.checkState(this.f73524f.i(node, f02) == null);
        return f02;
    }

    public final d1<N, E> f0() {
        return c() ? E() ? b0.p() : c0.n() : E() ? n1.p() : o1.m();
    }

    @Override // mo.z0
    @uo.a
    public boolean o(N node) {
        Preconditions.checkNotNull(node, "node");
        d1<N, E> f11 = this.f73524f.f(node);
        if (f11 == null) {
            return false;
        }
        aa<E> it = ImmutableList.copyOf((Collection) f11.k()).iterator();
        while (it.hasNext()) {
            L(it.next());
        }
        this.f73524f.j(node);
        return true;
    }

    @Override // mo.z0
    @uo.a
    public boolean p(N node) {
        Preconditions.checkNotNull(node, "node");
        if (d0(node)) {
            return false;
        }
        e0(node);
        return true;
    }

    @Override // mo.z0
    @uo.a
    public boolean x(f0<N> endpoints, E edge) {
        Z(endpoints);
        return M(endpoints.f(), endpoints.g(), edge);
    }
}
