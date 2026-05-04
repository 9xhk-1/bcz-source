package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
@uo.f("Use ImmutableRangeSet or TreeRangeSet")
/* loaded from: classes7.dex */
public interface z7<C extends Comparable> {
    void add(Range<C> range);

    void addAll(z7<C> other);

    void addAll(Iterable<Range<C>> ranges);

    Set<Range<C>> asDescendingSetOfRanges();

    Set<Range<C>> asRanges();

    void clear();

    z7<C> complement();

    boolean contains(C value);

    boolean encloses(Range<C> otherRange);

    boolean enclosesAll(z7<C> other);

    boolean enclosesAll(Iterable<Range<C>> other);

    boolean equals(@CheckForNull Object obj);

    int hashCode();

    boolean intersects(Range<C> otherRange);

    boolean isEmpty();

    @CheckForNull
    Range<C> rangeContaining(C value);

    void remove(Range<C> range);

    void removeAll(z7<C> other);

    void removeAll(Iterable<Range<C>> ranges);

    Range<C> span();

    z7<C> subRangeSet(Range<C> view);

    String toString();
}
