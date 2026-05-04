package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Use NetworkBuilder to create a real instance")
@go.a
@e0
/* loaded from: classes7.dex */
public interface b1<N, E> extends k1<N>, f1<N> {
    Set<E> B(N node);

    Set<E> C(E edge);

    boolean E();

    @CheckForNull
    E H(f0<N> endpoints);

    @CheckForNull
    E I(N nodeU, N nodeV);

    f0<N> J(E edge);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.k1, mo.k0
    /* bridge */ /* synthetic */ default Iterable a(Object node) {
        return a((b1<N, E>) node);
    }

    @Override // mo.k1, mo.k0
    Set<N> a(N node);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable b(Object node) {
        return b((b1<N, E>) node);
    }

    Set<N> b(N node);

    boolean c();

    Set<N> d(N node);

    Set<N> e();

    boolean equals(@CheckForNull Object object);

    int f(N node);

    Set<E> g();

    boolean h(f0<N> endpoints);

    int hashCode();

    boolean i(N nodeU, N nodeV);

    int j(N node);

    ElementOrder<N> k();

    int l(N node);

    boolean m();

    Set<E> n(N node);

    k0<N> s();

    Set<E> u(N nodeU, N nodeV);

    Set<E> v(f0<N> endpoints);

    ElementOrder<E> y();

    Set<E> z(N node);
}
