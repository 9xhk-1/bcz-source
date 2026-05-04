package mo;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public interface l0<N, V> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    void d(N node, V value);

    @CheckForNull
    V e(N node);

    @CheckForNull
    @uo.a
    V f(N node);

    void g(N node);

    Iterator<f0<N>> h(N thisNode);

    @CheckForNull
    @uo.a
    V i(N node, V value);
}
