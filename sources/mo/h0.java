package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class h0<N> extends j<N> {
    @Override // mo.e
    public long R() {
        return W().g().size();
    }

    public abstract x<N> W();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Iterable a(Object node) {
        return a((h0<N>) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Iterable b(Object node) {
        return b((h0<N>) node);
    }

    @Override // mo.x, mo.k0
    public boolean c() {
        return W().c();
    }

    @Override // mo.x, mo.k0
    public Set<N> d(N node) {
        return W().d(node);
    }

    @Override // mo.x, mo.k0
    public Set<N> e() {
        return W().e();
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public int f(N node) {
        return W().f(node);
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public boolean h(f0<N> endpoints) {
        return W().h(endpoints);
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public boolean i(N nodeU, N nodeV) {
        return W().i(nodeU, nodeV);
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public int j(N node) {
        return W().j(node);
    }

    @Override // mo.x, mo.k0
    public ElementOrder<N> k() {
        return W().k();
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public int l(N node) {
        return W().l(node);
    }

    @Override // mo.x, mo.k0
    public boolean m() {
        return W().m();
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public Set<f0<N>> n(N node) {
        return W().n(node);
    }

    @Override // mo.j, mo.e, mo.x, mo.k0
    public ElementOrder<N> q() {
        return W().q();
    }

    @Override // mo.x, mo.k1, mo.k0
    public Set<N> a(N node) {
        return W().a((x<N>) node);
    }

    @Override // mo.x, mo.f1, mo.k0
    public Set<N> b(N node) {
        return W().b((x<N>) node);
    }
}
