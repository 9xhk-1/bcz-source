package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.u6;
import java.util.Comparator;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class g5<K, V> extends w4<K, V> implements SortedMap<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends u6.g0<K, V> {
        public a() {
            super(g5.this);
        }
    }

    public static int y(@CheckForNull Comparator<?> comparator, @CheckForNull Object o12, @CheckForNull Object o22) {
        return comparator == null ? ((Comparable) o12).compareTo(o22) : comparator.compare(o12, o22);
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    @t7
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@t7 K toKey) {
        return delegate().headMap(toKey);
    }

    @Override // java.util.SortedMap
    @t7
    public K lastKey() {
        return delegate().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.w4
    public boolean standardContainsKey(@CheckForNull Object key) {
        return y(comparator(), tailMap(key).firstKey(), key) == 0;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@t7 K fromKey, @t7 K toKey) {
        return delegate().subMap(fromKey, toKey);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@t7 K fromKey) {
        return delegate().tailMap(fromKey);
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    /* renamed from: w */
    public abstract SortedMap<K, V> delegate();

    public SortedMap<K, V> x(K fromKey, K toKey) {
        Preconditions.checkArgument(y(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
        return tailMap(fromKey).headMap(toKey);
    }
}
