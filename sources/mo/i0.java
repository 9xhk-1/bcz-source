package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class i0<N, E> extends t<N, E> {
    @Override // mo.b1
    public Set<E> B(N node) {
        return a0().B(node);
    }

    @Override // mo.t, mo.b1
    public Set<E> C(E edge) {
        return a0().C(edge);
    }

    @Override // mo.b1
    public boolean E() {
        return a0().E();
    }

    @Override // mo.t, mo.b1
    @CheckForNull
    public E H(f0<N> endpoints) {
        return a0().H(endpoints);
    }

    @Override // mo.t, mo.b1
    @CheckForNull
    public E I(N nodeU, N nodeV) {
        return a0().I(nodeU, nodeV);
    }

    @Override // mo.b1
    public f0<N> J(E edge) {
        return a0().J(edge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.b1, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Iterable a(Object node) {
        return a((i0<N, E>) node);
    }

    public abstract b1<N, E> a0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.b1, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Iterable b(Object node) {
        return b((i0<N, E>) node);
    }

    @Override // mo.b1
    public boolean c() {
        return a0().c();
    }

    @Override // mo.b1
    public Set<N> d(N node) {
        return a0().d(node);
    }

    @Override // mo.b1
    public Set<N> e() {
        return a0().e();
    }

    @Override // mo.t, mo.b1
    public int f(N node) {
        return a0().f(node);
    }

    @Override // mo.b1
    public Set<E> g() {
        return a0().g();
    }

    @Override // mo.t, mo.b1
    public boolean h(f0<N> endpoints) {
        return a0().h(endpoints);
    }

    @Override // mo.t, mo.b1
    public boolean i(N nodeU, N nodeV) {
        return a0().i(nodeU, nodeV);
    }

    @Override // mo.t, mo.b1
    public int j(N node) {
        return a0().j(node);
    }

    @Override // mo.b1
    public ElementOrder<N> k() {
        return a0().k();
    }

    @Override // mo.t, mo.b1
    public int l(N node) {
        return a0().l(node);
    }

    @Override // mo.b1
    public boolean m() {
        return a0().m();
    }

    @Override // mo.b1
    public Set<E> n(N node) {
        return a0().n(node);
    }

    @Override // mo.t, mo.b1
    public Set<E> u(N nodeU, N nodeV) {
        return a0().u(nodeU, nodeV);
    }

    @Override // mo.t, mo.b1
    public Set<E> v(f0<N> endpoints) {
        return a0().v(endpoints);
    }

    @Override // mo.b1
    public ElementOrder<E> y() {
        return a0().y();
    }

    @Override // mo.b1
    public Set<E> z(N node) {
        return a0().z(node);
    }

    @Override // mo.b1, mo.k1, mo.k0
    public Set<N> a(N node) {
        return a0().a((b1<N, E>) node);
    }

    @Override // mo.b1, mo.f1, mo.k0
    public Set<N> b(N node) {
        return a0().b((b1<N, E>) node);
    }
}
