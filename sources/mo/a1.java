package mo;

import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public interface a1<N, V> extends p1<N, V> {
    @CheckForNull
    @uo.a
    V A(N nodeU, N nodeV, V value);

    @CheckForNull
    @uo.a
    V D(f0<N> endpoints, V value);

    @uo.a
    boolean o(N node);

    @uo.a
    boolean p(N node);

    @CheckForNull
    @uo.a
    V r(N nodeU, N nodeV);

    @CheckForNull
    @uo.a
    V t(f0<N> endpoints);
}
