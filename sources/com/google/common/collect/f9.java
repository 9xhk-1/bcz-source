package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@uo.f("Use ImmutableTable, HashBasedTable, or another implementation")
@u3
/* loaded from: classes7.dex */
public interface f9<R, C, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<R, C, V> {
        @t7
        C a();

        @t7
        R b();

        boolean equals(@CheckForNull Object obj);

        @t7
        V getValue();

        int hashCode();
    }

    Set<a<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@t7 C columnKey);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@CheckForNull @uo.c("R") Object rowKey, @CheckForNull @uo.c("C") Object columnKey);

    boolean containsColumn(@CheckForNull @uo.c("C") Object columnKey);

    boolean containsRow(@CheckForNull @uo.c("R") Object rowKey);

    boolean containsValue(@CheckForNull @uo.c("V") Object value);

    boolean equals(@CheckForNull Object obj);

    @CheckForNull
    V get(@CheckForNull @uo.c("R") Object rowKey, @CheckForNull @uo.c("C") Object columnKey);

    int hashCode();

    boolean isEmpty();

    @CheckForNull
    @uo.a
    V put(@t7 R rowKey, @t7 C columnKey, @t7 V value);

    void putAll(f9<? extends R, ? extends C, ? extends V> table);

    @CheckForNull
    @uo.a
    V remove(@CheckForNull @uo.c("R") Object rowKey, @CheckForNull @uo.c("C") Object columnKey);

    Map<C, V> row(@t7 R rowKey);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
