package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@u3
@uo.j(containerOf = {"C"})
/* loaded from: classes7.dex */
public final class Range<C extends Comparable> extends x7 implements ho.i0<C>, Serializable {
    private static final Range<Comparable> ALL = new Range<>(o3.c(), o3.a());
    private static final long serialVersionUID = 0;
    final o3<C> lowerBound;
    final o3<C> upperBound;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33163a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f33163a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33163a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends s7<Range<?>> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final s7<?> f33164c = new b();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.s7, java.util.Comparator
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public int compare(Range<?> left, Range<?> right) {
            return k3.n().i(left.lowerBound, right.lowerBound).i(left.upperBound, right.upperBound).m();
        }
    }

    private Range(o3<C> lowerBound, o3<C> upperBound) {
        this.lowerBound = (o3) Preconditions.checkNotNull(lowerBound);
        this.upperBound = (o3) Preconditions.checkNotNull(upperBound);
        if (lowerBound.compareTo(upperBound) > 0 || lowerBound == o3.a() || upperBound == o3.c()) {
            throw new IllegalArgumentException("Invalid range: " + toString(lowerBound, upperBound));
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) ALL;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C endpoint) {
        return create(o3.d(endpoint), o3.a());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C endpoint) {
        return create(o3.c(), o3.b(endpoint));
    }

    public static <C extends Comparable<?>> Range<C> closed(C lower, C upper) {
        return create(o3.d(lower), o3.b(upper));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C lower, C upper) {
        return create(o3.d(lower), o3.d(upper));
    }

    public static int compareOrThrow(Comparable left, Comparable right) {
        return left.compareTo(right);
    }

    public static <C extends Comparable<?>> Range<C> create(o3<C> lowerBound, o3<C> upperBound) {
        return new Range<>(lowerBound, upperBound);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C endpoint, BoundType boundType) {
        int i11 = a.f33163a[boundType.ordinal()];
        if (i11 == 1) {
            return greaterThan(endpoint);
        }
        if (i11 == 2) {
            return atLeast(endpoint);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> values) {
        Preconditions.checkNotNull(values);
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (s7.z().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = values.iterator();
        Comparable comparable = (Comparable) Preconditions.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) Preconditions.checkNotNull(it.next());
            comparable = (Comparable) s7.z().w(comparable, comparable3);
            comparable2 = (Comparable) s7.z().s(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C endpoint) {
        return create(o3.b(endpoint), o3.a());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C endpoint) {
        return create(o3.c(), o3.d(endpoint));
    }

    public static <C extends Comparable<?>> Range<C> open(C lower, C upper) {
        return create(o3.b(lower), o3.d(upper));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C lower, C upper) {
        return create(o3.b(lower), o3.b(upper));
    }

    public static <C extends Comparable<?>> Range<C> range(C lower, BoundType lowerType, C upper, BoundType upperType) {
        Preconditions.checkNotNull(lowerType);
        Preconditions.checkNotNull(upperType);
        BoundType boundType = BoundType.OPEN;
        return create(lowerType == boundType ? o3.b(lower) : o3.d(lower), upperType == boundType ? o3.d(upper) : o3.b(upper));
    }

    public static <C extends Comparable<?>> s7<Range<C>> rangeLexOrdering() {
        return (s7<Range<C>>) b.f33164c;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C value) {
        return closed(value, value);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C endpoint, BoundType boundType) {
        int i11 = a.f33163a[boundType.ordinal()];
        if (i11 == 1) {
            return lessThan(endpoint);
        }
        if (i11 == 2) {
            return atMost(endpoint);
        }
        throw new AssertionError();
    }

    public Range<C> canonical(t3<C> domain) {
        Preconditions.checkNotNull(domain);
        o3<C> e11 = this.lowerBound.e(domain);
        o3<C> e12 = this.upperBound.e(domain);
        return (e11 == this.lowerBound && e12 == this.upperBound) ? this : create(e11, e12);
    }

    public boolean contains(C value) {
        Preconditions.checkNotNull(value);
        return this.lowerBound.m(value) && !this.upperBound.m(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsAll(Iterable<? extends C> values) {
        if (k6.C(values)) {
            return true;
        }
        if (values instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) values;
            Comparator comparator = sortedSet.comparator();
            if (s7.z().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = values.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> other) {
        return this.lowerBound.compareTo(other.lowerBound) <= 0 && this.upperBound.compareTo(other.upperBound) >= 0;
    }

    @Override // ho.i0
    public boolean equals(@CheckForNull Object object) {
        if (object instanceof Range) {
            Range range = (Range) object;
            if (this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound)) {
                return true;
            }
        }
        return false;
    }

    public Range<C> gap(Range<C> otherRange) {
        if (this.lowerBound.compareTo(otherRange.upperBound) >= 0 || otherRange.lowerBound.compareTo(this.upperBound) >= 0) {
            boolean z11 = this.lowerBound.compareTo(otherRange.lowerBound) < 0;
            Range<C> range = z11 ? this : otherRange;
            if (!z11) {
                otherRange = this;
            }
            return create(range.upperBound, otherRange.lowerBound);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + org.junit.jupiter.api.j2.O + otherRange);
    }

    public boolean hasLowerBound() {
        return this.lowerBound != o3.c();
    }

    public boolean hasUpperBound() {
        return this.upperBound != o3.a();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> connectedRange) {
        int compareTo = this.lowerBound.compareTo(connectedRange.lowerBound);
        int compareTo2 = this.upperBound.compareTo(connectedRange.upperBound);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return connectedRange;
        }
        o3<C> o3Var = compareTo >= 0 ? this.lowerBound : connectedRange.lowerBound;
        o3<C> o3Var2 = compareTo2 <= 0 ? this.upperBound : connectedRange.upperBound;
        Preconditions.checkArgument(o3Var.compareTo(o3Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, connectedRange);
        return create(o3Var, o3Var2);
    }

    public boolean isConnected(Range<C> other) {
        return this.lowerBound.compareTo(other.upperBound) <= 0 && other.lowerBound.compareTo(this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public o3<C> lowerBound() {
        return this.lowerBound;
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.p();
    }

    public C lowerEndpoint() {
        return this.lowerBound.k();
    }

    public Object readResolve() {
        return equals(ALL) ? all() : this;
    }

    public Range<C> span(Range<C> other) {
        int compareTo = this.lowerBound.compareTo(other.lowerBound);
        int compareTo2 = this.upperBound.compareTo(other.upperBound);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo < 0 || compareTo2 > 0) {
            return create(compareTo <= 0 ? this.lowerBound : other.lowerBound, compareTo2 >= 0 ? this.upperBound : other.upperBound);
        }
        return other;
    }

    public String toString() {
        return toString(this.lowerBound, this.upperBound);
    }

    public o3<C> upperBound() {
        return this.upperBound;
    }

    public BoundType upperBoundType() {
        return this.upperBound.q();
    }

    public C upperEndpoint() {
        return this.upperBound.k();
    }

    private static String toString(o3<?> lowerBound, o3<?> upperBound) {
        StringBuilder sb2 = new StringBuilder(16);
        lowerBound.g(sb2);
        sb2.append(zr.m.f102856e);
        upperBound.i(sb2);
        return sb2.toString();
    }

    @Override // ho.i0
    @Deprecated
    public boolean apply(C input) {
        return contains(input);
    }
}
