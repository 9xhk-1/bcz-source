package com.google.common.collect;

import com.google.common.collect.j7;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public interface x8<E> extends y8<E>, t8<E> {
    Comparator<? super E> comparator();

    x8<E> descendingMultiset();

    @Override // com.google.common.collect.y8, com.google.common.collect.j7
    NavigableSet<E> elementSet();

    @Override // com.google.common.collect.j7
    Set<j7.a<E>> entrySet();

    @CheckForNull
    j7.a<E> firstEntry();

    x8<E> headMultiset(@t7 E upperBound, BoundType boundType);

    @Override // com.google.common.collect.j7, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @CheckForNull
    j7.a<E> lastEntry();

    @CheckForNull
    j7.a<E> pollFirstEntry();

    @CheckForNull
    j7.a<E> pollLastEntry();

    x8<E> subMultiset(@t7 E lowerBound, BoundType lowerBoundType, @t7 E upperBound, BoundType upperBoundType);

    x8<E> tailMultiset(@t7 E lowerBound, BoundType boundType);
}
