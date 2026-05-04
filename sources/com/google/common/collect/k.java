package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public abstract class k<C extends Comparable> implements z7<C> {
    @Override // com.google.common.collect.z7
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z7
    public void addAll(z7<C> other) {
        addAll(other.asRanges());
    }

    @Override // com.google.common.collect.z7
    public void clear() {
        remove(Range.all());
    }

    @Override // com.google.common.collect.z7
    public boolean contains(C value) {
        return rangeContaining(value) != null;
    }

    @Override // com.google.common.collect.z7
    public abstract boolean encloses(Range<C> otherRange);

    @Override // com.google.common.collect.z7
    public boolean enclosesAll(z7<C> other) {
        return enclosesAll(other.asRanges());
    }

    @Override // com.google.common.collect.z7
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z7) {
            return asRanges().equals(((z7) obj).asRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.z7
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // com.google.common.collect.z7
    public boolean intersects(Range<C> otherRange) {
        return !subRangeSet(otherRange).isEmpty();
    }

    @Override // com.google.common.collect.z7
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // com.google.common.collect.z7
    @CheckForNull
    public abstract Range<C> rangeContaining(C value);

    @Override // com.google.common.collect.z7
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z7
    public void removeAll(z7<C> other) {
        removeAll(other.asRanges());
    }

    @Override // com.google.common.collect.z7
    public final String toString() {
        return asRanges().toString();
    }

    @Override // com.google.common.collect.z7
    public void addAll(Iterable<Range<C>> ranges) {
        Iterator<Range<C>> it = ranges.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // com.google.common.collect.z7
    public boolean enclosesAll(Iterable<Range<C>> ranges) {
        Iterator<Range<C>> it = ranges.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.z7
    public void removeAll(Iterable<Range<C>> ranges) {
        Iterator<Range<C>> it = ranges.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
