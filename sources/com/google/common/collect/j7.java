package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public interface j7<E> extends Collection<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<E> {
        @t7
        E e();

        boolean equals(@CheckForNull Object o11);

        int getCount();

        int hashCode();

        String toString();
    }

    @uo.a
    int add(@t7 E element, int occurrences);

    @uo.a
    boolean add(@t7 E element);

    boolean contains(@CheckForNull Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> elements);

    int count(@CheckForNull @uo.c("E") Object element);

    Set<E> elementSet();

    Set<a<E>> entrySet();

    boolean equals(@CheckForNull Object object);

    int hashCode();

    Iterator<E> iterator();

    @uo.a
    int remove(@CheckForNull @uo.c("E") Object element, int occurrences);

    @uo.a
    boolean remove(@CheckForNull Object element);

    @uo.a
    boolean removeAll(Collection<?> c11);

    @uo.a
    boolean retainAll(Collection<?> c11);

    @uo.a
    int setCount(@t7 E element, int count);

    @uo.a
    boolean setCount(@t7 E element, int oldCount, int newCount);

    int size();

    String toString();
}
