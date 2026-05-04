package com.google.common.collect;

import java.lang.Comparable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
@uo.f("Use ImmutableRangeMap or TreeRangeMap")
/* loaded from: classes7.dex */
public interface y7<K extends Comparable, V> {
    Map<Range<K>, V> asDescendingMapOfRanges();

    Map<Range<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@CheckForNull Object o11);

    @CheckForNull
    V get(K key);

    @CheckForNull
    Map.Entry<Range<K>, V> getEntry(K key);

    int hashCode();

    void put(Range<K> range, V value);

    void putAll(y7<K, ? extends V> rangeMap);

    void putCoalescing(Range<K> range, V value);

    void remove(Range<K> range);

    Range<K> span();

    y7<K, V> subRangeMap(Range<K> range);

    String toString();
}
