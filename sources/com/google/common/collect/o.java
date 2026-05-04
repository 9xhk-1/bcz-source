package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import com.google.common.collect.z8;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class o<E> extends i<E> implements x8<E> {

    @m5
    final Comparator<? super E> comparator;

    @CheckForNull
    @vo.b
    private transient x8<E> descendingMultiset;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends s3<E> {
        public a() {
        }

        @Override // com.google.common.collect.s3
        public Iterator<j7.a<E>> F() {
            return o.this.descendingEntryIterator();
        }

        @Override // com.google.common.collect.s3
        public x8<E> G() {
            return o.this;
        }

        @Override // com.google.common.collect.s3, com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return o.this.descendingIterator();
        }
    }

    public o() {
        this(s7.z());
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public x8<E> createDescendingMultiset() {
        return new a();
    }

    public abstract Iterator<j7.a<E>> descendingEntryIterator();

    public Iterator<E> descendingIterator() {
        return k7.n(descendingMultiset());
    }

    public x8<E> descendingMultiset() {
        x8<E> x8Var = this.descendingMultiset;
        if (x8Var != null) {
            return x8Var;
        }
        x8<E> createDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = createDescendingMultiset;
        return createDescendingMultiset;
    }

    @CheckForNull
    public j7.a<E> firstEntry() {
        Iterator<j7.a<E>> entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            return entryIterator.next();
        }
        return null;
    }

    @CheckForNull
    public j7.a<E> lastEntry() {
        Iterator<j7.a<E>> descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            return descendingEntryIterator.next();
        }
        return null;
    }

    @CheckForNull
    public j7.a<E> pollFirstEntry() {
        Iterator<j7.a<E>> entryIterator = entryIterator();
        if (!entryIterator.hasNext()) {
            return null;
        }
        j7.a<E> next = entryIterator.next();
        j7.a<E> k11 = k7.k(next.e(), next.getCount());
        entryIterator.remove();
        return k11;
    }

    @CheckForNull
    public j7.a<E> pollLastEntry() {
        Iterator<j7.a<E>> descendingEntryIterator = descendingEntryIterator();
        if (!descendingEntryIterator.hasNext()) {
            return null;
        }
        j7.a<E> next = descendingEntryIterator.next();
        j7.a<E> k11 = k7.k(next.e(), next.getCount());
        descendingEntryIterator.remove();
        return k11;
    }

    public x8<E> subMultiset(@t7 E fromElement, BoundType fromBoundType, @t7 E toElement, BoundType toBoundType) {
        Preconditions.checkNotNull(fromBoundType);
        Preconditions.checkNotNull(toBoundType);
        return tailMultiset(fromElement, fromBoundType).headMultiset(toElement, toBoundType);
    }

    public o(Comparator<? super E> comparator) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.i
    public NavigableSet<E> createElementSet() {
        return new z8.b(this);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
