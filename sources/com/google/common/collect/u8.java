package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class u8 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? s7.z() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> elements) {
        Comparator comparator2;
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(elements);
        if (elements instanceof SortedSet) {
            comparator2 = a((SortedSet) elements);
        } else {
            if (!(elements instanceof t8)) {
                return false;
            }
            comparator2 = ((t8) elements).comparator();
        }
        return comparator.equals(comparator2);
    }
}
