package mo;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class o1<N, E> extends u<N, E> {
    public o1(Map<E, N> incidentEdgeMap) {
        super(incidentEdgeMap);
    }

    public static <N, E> o1<N, E> m() {
        return new o1<>(HashBiMap.create(2));
    }

    public static <N, E> o1<N, E> n(Map<E, N> incidentEdges) {
        return new o1<>(ImmutableBiMap.copyOf((Map) incidentEdges));
    }

    @Override // mo.d1
    public Set<N> a() {
        return Collections.unmodifiableSet(((com.google.common.collect.u) this.f73590a).values());
    }

    @Override // mo.d1
    public Set<E> l(N node) {
        return new d0(((com.google.common.collect.u) this.f73590a).inverse(), node);
    }
}
