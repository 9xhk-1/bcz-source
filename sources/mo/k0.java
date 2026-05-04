package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Use GraphBuilder to create a real instance")
@go.a
@e0
/* loaded from: classes7.dex */
public interface k0<N> extends x<N> {
    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable a(Object node) {
        return a((k0<N>) node);
    }

    @Override // mo.x, mo.k1, mo.k0
    Set<N> a(N node);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable b(Object node) {
        return b((k0<N>) node);
    }

    @Override // mo.x, mo.f1, mo.k0
    Set<N> b(N node);

    boolean c();

    Set<N> d(N node);

    Set<N> e();

    boolean equals(@CheckForNull Object object);

    int f(N node);

    @Override // mo.x
    Set<f0<N>> g();

    boolean h(f0<N> endpoints);

    int hashCode();

    boolean i(N nodeU, N nodeV);

    int j(N node);

    ElementOrder<N> k();

    int l(N node);

    boolean m();

    Set<f0<N>> n(N node);

    ElementOrder<N> q();
}
