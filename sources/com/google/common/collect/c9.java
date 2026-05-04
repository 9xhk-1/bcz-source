package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.u6;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public class c9<R, C, V> extends d9<R, C, V> implements n8<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends d9<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        public b() {
            super();
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super R> comparator() {
            return c9.this.e().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) c9.this.e().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R toKey) {
            Preconditions.checkNotNull(toKey);
            return new c9(c9.this.e().headMap(toKey), c9.this.factory).rowMap();
        }

        @Override // com.google.common.collect.u6.r0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> k() {
            return new u6.g0(this);
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> l() {
            return (SortedSet) super.l();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) c9.this.e().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R fromKey, R toKey) {
            Preconditions.checkNotNull(fromKey);
            Preconditions.checkNotNull(toKey);
            return new c9(c9.this.e().subMap(fromKey, toKey), c9.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R fromKey) {
            Preconditions.checkNotNull(fromKey);
            return new c9(c9.this.e().tailMap(fromKey), c9.this.factory).rowMap();
        }
    }

    public c9(SortedMap<R, Map<C, V>> backingMap, ho.p0<? extends Map<C, V>> factory) {
        super(backingMap, factory);
    }

    public final SortedMap<R, Map<C, V>> e() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.d9
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new b();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
