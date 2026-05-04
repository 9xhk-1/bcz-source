package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public interface x<N> extends k1<N>, f1<N> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.k1, mo.k0
    /* bridge */ /* synthetic */ default Iterable a(Object node) {
        return a((x<N>) node);
    }

    @Override // mo.k1, mo.k0
    Set<N> a(N node);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable b(Object node) {
        return b((x<N>) node);
    }

    Set<N> b(N node);

    boolean c();

    Set<N> d(N node);

    Set<N> e();

    int f(N node);

    Set<f0<N>> g();

    boolean h(f0<N> endpoints);

    boolean i(N nodeU, N nodeV);

    int j(N node);

    ElementOrder<N> k();

    int l(N node);

    boolean m();

    Set<f0<N>> n(N node);

    ElementOrder<N> q();
}
