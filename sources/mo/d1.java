package mo;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public interface d1<N, E> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    N d(E edge);

    Set<E> e();

    @uo.a
    N f(E edge);

    Set<E> g();

    @CheckForNull
    @uo.a
    N h(E edge, boolean isSelfLoop);

    void i(E edge, N node);

    void j(E edge, N node, boolean isSelfLoop);

    Set<E> k();

    Set<E> l(N node);
}
