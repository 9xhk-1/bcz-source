package mo;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class c0<N, E> extends i<N, E> {
    public c0(Map<E, N> inEdgeMap, Map<E, N> outEdgeMap, int selfLoopCount) {
        super(inEdgeMap, outEdgeMap, selfLoopCount);
    }

    public static <N, E> c0<N, E> n() {
        return new c0<>(HashBiMap.create(2), HashBiMap.create(2), 0);
    }

    public static <N, E> c0<N, E> o(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        return new c0<>(ImmutableBiMap.copyOf((Map) inEdges), ImmutableBiMap.copyOf((Map) outEdges), selfLoopCount);
    }

    @Override // mo.d1
    public Set<N> b() {
        return Collections.unmodifiableSet(((com.google.common.collect.u) this.f73516b).values());
    }

    @Override // mo.d1
    public Set<N> c() {
        return Collections.unmodifiableSet(((com.google.common.collect.u) this.f73515a).values());
    }

    @Override // mo.d1
    public Set<E> l(N node) {
        return new d0(((com.google.common.collect.u) this.f73516b).inverse(), node);
    }
}
