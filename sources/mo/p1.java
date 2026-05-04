package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public interface p1<N, V> extends x<N> {
    @CheckForNull
    V F(N nodeU, N nodeV, @CheckForNull V defaultValue);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.k1, mo.k0
    /* bridge */ /* synthetic */ default Iterable a(Object node) {
        return a((p1<N, V>) node);
    }

    @Override // mo.x, mo.k1, mo.k0
    Set<N> a(N node);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.f1, mo.k0
    /* bridge */ /* synthetic */ default Iterable b(Object node) {
        return b((p1<N, V>) node);
    }

    @Override // mo.x, mo.f1, mo.k0
    Set<N> b(N node);

    @Override // mo.x, mo.k0
    boolean c();

    @Override // mo.x, mo.k0
    Set<N> d(N node);

    @Override // mo.x, mo.k0
    Set<N> e();

    boolean equals(@CheckForNull Object object);

    @Override // mo.x, mo.k0
    int f(N node);

    @Override // mo.x
    Set<f0<N>> g();

    @Override // mo.x, mo.k0
    boolean h(f0<N> endpoints);

    int hashCode();

    @Override // mo.x, mo.k0
    boolean i(N nodeU, N nodeV);

    @Override // mo.x, mo.k0
    int j(N node);

    @Override // mo.x, mo.k0
    ElementOrder<N> k();

    @Override // mo.x, mo.k0
    int l(N node);

    @Override // mo.x, mo.k0
    boolean m();

    @Override // mo.x, mo.k0
    Set<f0<N>> n(N node);

    @Override // mo.x, mo.k0
    ElementOrder<N> q();

    k0<N> s();

    @CheckForNull
    V w(f0<N> endpoints, @CheckForNull V defaultValue);
}
