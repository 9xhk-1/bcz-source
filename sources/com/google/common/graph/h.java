package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.l6;
import com.google.common.graph.ElementOrder;
import ho.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import mo.e0;
import mo.f0;
import mo.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class h<N, V> implements l0<N, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<N, V> f34236a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34237a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f34237a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34237a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(Map<N, V> adjacentNodeValues) {
        this.f34236a = (Map) Preconditions.checkNotNull(adjacentNodeValues);
    }

    public static <N, V> h<N, V> k(ElementOrder<N> incidentEdgeOrder) {
        int i11 = a.f34237a[incidentEdgeOrder.h().ordinal()];
        if (i11 == 1) {
            return new h<>(new HashMap(2, 1.0f));
        }
        if (i11 == 2) {
            return new h<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(incidentEdgeOrder.h());
    }

    public static <N, V> h<N, V> l(Map<N, V> adjacentNodeValues) {
        return new h<>(ImmutableMap.copyOf((Map) adjacentNodeValues));
    }

    @Override // mo.l0
    public Set<N> a() {
        return Collections.unmodifiableSet(this.f34236a.keySet());
    }

    @Override // mo.l0
    public Set<N> b() {
        return a();
    }

    @Override // mo.l0
    public Set<N> c() {
        return a();
    }

    @Override // mo.l0
    public void d(N node, V value) {
        i(node, value);
    }

    @Override // mo.l0
    @CheckForNull
    public V e(N node) {
        return this.f34236a.get(node);
    }

    @Override // mo.l0
    @CheckForNull
    public V f(N node) {
        return this.f34236a.remove(node);
    }

    @Override // mo.l0
    public void g(N node) {
        f(node);
    }

    @Override // mo.l0
    public Iterator<f0<N>> h(final N thisNode) {
        return l6.b0(this.f34236a.keySet().iterator(), new r() { // from class: mo.m1
            @Override // ho.r
            public final Object apply(Object obj) {
                f0 n11;
                n11 = f0.n(thisNode, obj);
                return n11;
            }
        });
    }

    @Override // mo.l0
    @CheckForNull
    public V i(N node, V value) {
        return this.f34236a.put(node, value);
    }
}
