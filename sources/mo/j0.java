package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class j0<N, V> extends w<N, V> {
    @CheckForNull
    public V F(N nodeU, N nodeV, @CheckForNull V defaultValue) {
        return Y().F(nodeU, nodeV, defaultValue);
    }

    @Override // mo.e
    public long R() {
        return Y().g().size();
    }

    public abstract p1<N, V> Y();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Iterable a(Object node) {
        return a((j0<N, V>) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Iterable b(Object node) {
        return b((j0<N, V>) node);
    }

    @Override // mo.x, mo.k0
    public boolean c() {
        return Y().c();
    }

    @Override // mo.x, mo.k0
    public Set<N> d(N node) {
        return Y().d(node);
    }

    @Override // mo.x, mo.k0
    public Set<N> e() {
        return Y().e();
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public int f(N node) {
        return Y().f(node);
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public boolean h(f0<N> endpoints) {
        return Y().h(endpoints);
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public boolean i(N nodeU, N nodeV) {
        return Y().i(nodeU, nodeV);
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public int j(N node) {
        return Y().j(node);
    }

    @Override // mo.x, mo.k0
    public ElementOrder<N> k() {
        return Y().k();
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public int l(N node) {
        return Y().l(node);
    }

    @Override // mo.x, mo.k0
    public boolean m() {
        return Y().m();
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public ElementOrder<N> q() {
        return Y().q();
    }

    @CheckForNull
    public V w(f0<N> endpoints, @CheckForNull V defaultValue) {
        return Y().w(endpoints, defaultValue);
    }

    @Override // mo.x, mo.k1, mo.k0
    public Set<N> a(N node) {
        return Y().a((p1<N, V>) node);
    }

    @Override // mo.x, mo.f1, mo.k0
    public Set<N> b(N node) {
        return Y().b((p1<N, V>) node);
    }
}
