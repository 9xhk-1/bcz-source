package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class i5<E> extends e5<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    @CheckForNull
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    @t7
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@t7 E toElement) {
        return delegate().headSet(toElement);
    }

    @Override // java.util.SortedSet
    @t7
    public E last() {
        return delegate().last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.l4
    public boolean standardContains(@CheckForNull Object object) {
        return g5.y(comparator(), tailSet(object).first(), object) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.l4
    public boolean standardRemove(@CheckForNull Object object) {
        try {
            Iterator<E> it = tailSet(object).iterator();
            if (it.hasNext()) {
                if (g5.y(comparator(), it.next(), object) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@t7 E fromElement, @t7 E toElement) {
        return delegate().subSet(fromElement, toElement);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@t7 E fromElement) {
        return delegate().tailSet(fromElement);
    }

    @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
    /* renamed from: w */
    public abstract SortedSet<E> delegate();

    public SortedSet<E> x(@t7 E fromElement, @t7 E toElement) {
        return tailSet(fromElement).headSet(toElement);
    }
}
