package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedSet;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final t3<C> domain;

    public ContiguousSet(t3<C> domain) {
        super(s7.z());
        this.domain = domain;
    }

    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public static <E> ImmutableSortedSet.a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Integer> closed(int lower, int upper) {
        return create(Range.closed(Integer.valueOf(lower), Integer.valueOf(upper)), t3.c());
    }

    public static ContiguousSet<Integer> closedOpen(int lower, int upper) {
        return create(Range.closedOpen(Integer.valueOf(lower), Integer.valueOf(upper)), t3.c());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, t3<C> domain) {
        Preconditions.checkNotNull(range);
        Preconditions.checkNotNull(domain);
        try {
            Range<C> intersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(domain.f())) : range;
            if (!range.hasUpperBound()) {
                intersection = intersection.intersection(Range.atMost(domain.e()));
            }
            if (!intersection.isEmpty()) {
                C o11 = range.lowerBound.o(domain);
                Objects.requireNonNull(o11);
                C l11 = range.upperBound.l(domain);
                Objects.requireNonNull(l11);
                if (Range.compareOrThrow(o11, l11) <= 0) {
                    return new a8(intersection, domain);
                }
            }
            return new v3(domain);
        } catch (NoSuchElementException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @go.c
    public ImmutableSortedSet<C> createDescendingSet() {
        return new r3(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C toElement, boolean inclusive);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> other);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType lowerBoundType, BoundType upperBoundType);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C fromElement, boolean inclusive);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }

    public static ContiguousSet<Long> closed(long lower, long upper) {
        return create(Range.closed(Long.valueOf(lower), Long.valueOf(upper)), t3.d());
    }

    public static ContiguousSet<Long> closedOpen(long lower, long upper) {
        return create(Range.closedOpen(Long.valueOf(lower), Long.valueOf(upper)), t3.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C toElement) {
        return headSetImpl((ContiguousSet<C>) Preconditions.checkNotNull(toElement), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C fromElement, C toElement) {
        Preconditions.checkNotNull(fromElement);
        Preconditions.checkNotNull(toElement);
        Preconditions.checkArgument(comparator().compare(fromElement, toElement) <= 0);
        return subSetImpl((boolean) fromElement, true, (boolean) toElement, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C fromElement) {
        return tailSetImpl((ContiguousSet<C>) Preconditions.checkNotNull(fromElement), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c
    public ContiguousSet<C> headSet(C toElement, boolean inclusive) {
        return headSetImpl((ContiguousSet<C>) Preconditions.checkNotNull(toElement), inclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c
    public ContiguousSet<C> tailSet(C fromElement, boolean inclusive) {
        return tailSetImpl((ContiguousSet<C>) Preconditions.checkNotNull(fromElement), inclusive);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c
    public ContiguousSet<C> subSet(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        Preconditions.checkNotNull(fromElement);
        Preconditions.checkNotNull(toElement);
        Preconditions.checkArgument(comparator().compare(fromElement, toElement) <= 0);
        return subSetImpl((boolean) fromElement, fromInclusive, (boolean) toElement, toInclusive);
    }
}
