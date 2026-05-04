package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.v8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public final class ImmutableRangeSet<C extends Comparable> extends k<C> implements Serializable {

    @CheckForNull
    @vo.b
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.of());
    private static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.of(Range.all()));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ImmutableList<Range<C>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33055a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Range f33057c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImmutableRangeSet f33058d;

        public a(final ImmutableRangeSet this$0, final int val$length, final int val$fromIndex, final Range val$range) {
            this.f33055a = val$length;
            this.f33056b = val$fromIndex;
            this.f33057c = val$range;
            this.f33058d = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int index) {
            Preconditions.checkElementIndex(index, this.f33055a);
            return (index == 0 || index == this.f33055a + (-1)) ? ((Range) this.f33058d.ranges.get(index + this.f33056b)).intersection(this.f33057c) : (Range) this.f33058d.ranges.get(index + this.f33056b);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33055a;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends ImmutableSortedSet<C> {

        /* renamed from: a, reason: collision with root package name */
        public final t3<C> f33059a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Integer f33060b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<C> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<Range<C>> f33062c;

            /* renamed from: d, reason: collision with root package name */
            public Iterator<C> f33063d = l6.t();

            public a() {
                this.f33062c = ImmutableRangeSet.this.ranges.iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f33063d.hasNext()) {
                    if (!this.f33062c.hasNext()) {
                        return (C) b();
                    }
                    this.f33063d = ContiguousSet.create(this.f33062c.next(), b.this.f33059a).iterator();
                }
                return this.f33063d.next();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.ImmutableRangeSet$b$b, reason: collision with other inner class name */
        public class C0388b extends com.google.common.collect.c<C> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<Range<C>> f33065c;

            /* renamed from: d, reason: collision with root package name */
            public Iterator<C> f33066d = l6.t();

            public C0388b() {
                this.f33065c = ImmutableRangeSet.this.ranges.reverse().iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f33066d.hasNext()) {
                    if (!this.f33065c.hasNext()) {
                        return (C) b();
                    }
                    this.f33066d = ContiguousSet.create(this.f33065c.next(), b.this.f33059a).descendingIterator();
                }
                return this.f33066d.next();
            }
        }

        public b(t3<C> domain) {
            super(s7.z());
            this.f33059a = domain;
        }

        @go.d
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> headSetImpl(C toElement, boolean inclusive) {
            return d(Range.upTo(toElement, BoundType.forBoolean(inclusive)));
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            if (o11 == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) o11);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> createDescendingSet() {
            return new r3(this);
        }

        public ImmutableSortedSet<C> d(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.f33059a);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
            return (fromInclusive || toInclusive || Range.compareOrThrow(fromElement, toElement) != 0) ? d(Range.range(fromElement, BoundType.forBoolean(fromInclusive), toElement, BoundType.forBoolean(toInclusive))) : ImmutableSortedSet.of();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> tailSetImpl(C fromElement, boolean inclusive) {
            return d(Range.downTo(fromElement, BoundType.forBoolean(inclusive)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(@CheckForNull Object target) {
            if (!contains(target)) {
                return -1;
            }
            Objects.requireNonNull(target);
            Comparable comparable = (Comparable) target;
            aa it = ImmutableRangeSet.this.ranges.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                if (((Range) it.next()).contains(comparable)) {
                    return ro.i.A(j11 + ContiguousSet.create(r3, this.f33059a).indexOf(comparable));
                }
                j11 += ContiguousSet.create(r3, this.f33059a).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer num = this.f33060b;
            if (num == null) {
                aa it = ImmutableRangeSet.this.ranges.iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += ContiguousSet.create((Range) it.next(), this.f33059a).size();
                    if (j11 >= SieveCacheKt.NodeLinkMask) {
                        break;
                    }
                }
                num = Integer.valueOf(ro.i.A(j11));
                this.f33060b = num;
            }
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.ranges.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @go.d
        public Object writeReplace() {
            return new c(ImmutableRangeSet.this.ranges, this.f33059a);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @go.c("NavigableSet")
        public aa<C> descendingIterator() {
            return new C0388b();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public aa<C> iterator() {
            return new a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<C extends Comparable> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList<Range<C>> f33068a;

        /* renamed from: b, reason: collision with root package name */
        public final t3<C> f33069b;

        public c(ImmutableList<Range<C>> ranges, t3<C> domain) {
            this.f33068a = ranges;
            this.f33069b = domain;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.f33068a).asSet(this.f33069b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<C extends Comparable<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final List<Range<C>> f33070a = q6.q();

        @uo.a
        public d<C> a(Range<C> range) {
            Preconditions.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f33070a.add(range);
            return this;
        }

        @uo.a
        public d<C> b(z7<C> ranges) {
            return c(ranges.asRanges());
        }

        @uo.a
        public d<C> c(Iterable<Range<C>> ranges) {
            Iterator<Range<C>> it = ranges.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public ImmutableRangeSet<C> d() {
            ImmutableList.a aVar = new ImmutableList.a(this.f33070a.size());
            Collections.sort(this.f33070a, Range.rangeLexOrdering());
            u7 S = l6.S(this.f33070a.iterator());
            while (S.hasNext()) {
                Range range = (Range) S.next();
                while (S.hasNext()) {
                    Range<C> range2 = (Range) S.peek();
                    if (range.isConnected(range2)) {
                        Preconditions.checkArgument(range.intersection(range2).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", range, range2);
                        range = range.span((Range) S.next());
                    }
                }
                aVar.g(range);
            }
            ImmutableList e11 = aVar.e();
            return e11.isEmpty() ? ImmutableRangeSet.of() : (e11.size() == 1 && ((Range) k6.z(e11)).equals(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet<>(e11);
        }

        @uo.a
        public d<C> e(d<C> builder) {
            c(builder.f33070a);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends ImmutableList<Range<C>> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f33071a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f33072b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33073c;

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            boolean hasLowerBound = ((Range) ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.f33071a = hasLowerBound;
            boolean hasUpperBound = ((Range) k6.w(ImmutableRangeSet.this.ranges)).hasUpperBound();
            this.f33072b = hasUpperBound;
            int size = ImmutableRangeSet.this.ranges.size();
            size = hasLowerBound ? size : size - 1;
            this.f33073c = hasUpperBound ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int i11) {
            Preconditions.checkElementIndex(i11, this.f33073c);
            return Range.create(this.f33071a ? i11 == 0 ? o3.c() : ((Range) ImmutableRangeSet.this.ranges.get(i11 - 1)).upperBound : ((Range) ImmutableRangeSet.this.ranges.get(i11)).upperBound, (this.f33072b && i11 == this.f33073c + (-1)) ? o3.a() : ((Range) ImmutableRangeSet.this.ranges.get(i11 + (!this.f33071a ? 1 : 0))).lowerBound);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33073c;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<C extends Comparable> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList<Range<C>> f33075a;

        public f(ImmutableList<Range<C>> ranges) {
            this.f33075a = ranges;
        }

        public Object readResolve() {
            return this.f33075a.isEmpty() ? ImmutableRangeSet.of() : this.f33075a.equals(ImmutableList.of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.f33075a);
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> ranges) {
        this.ranges = ranges;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> d<C> builder() {
        return new d<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(z7<C> rangeSet) {
        Preconditions.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return of();
        }
        if (rangeSet.encloses(Range.all())) {
            return all();
        }
        if (rangeSet instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) rangeSet;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) rangeSet.asRanges()));
    }

    private ImmutableList<Range<C>> intersectRanges(final Range<C> range) {
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        int a11 = range.hasLowerBound() ? v8.a(this.ranges, new z5(), range.lowerBound, v8.c.f34066d, v8.b.f34060b) : 0;
        int a12 = (range.hasUpperBound() ? v8.a(this.ranges, new a6(), range.upperBound, v8.c.f34065c, v8.b.f34060b) : this.ranges.size()) - a11;
        return a12 == 0 ? ImmutableList.of() : new a(this, a12, a11, range);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
        return EMPTY;
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @p5
    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return v2.R();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> ranges) {
        return copyOf(TreeRangeSet.create(ranges));
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void addAll(z7<C> other) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedSet<C> asSet(t3<C> domain) {
        Preconditions.checkNotNull(domain);
        if (isEmpty()) {
            return ImmutableSortedSet.of();
        }
        Range<C> canonical = span().canonical(domain);
        if (!canonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!canonical.hasUpperBound()) {
            try {
                domain.e();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new b(domain);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return super.contains(value);
    }

    public ImmutableRangeSet<C> difference(z7<C> other) {
        TreeRangeSet create = TreeRangeSet.create(this);
        create.removeAll(other);
        return copyOf(create);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public boolean encloses(Range<C> otherRange) {
        int b11 = v8.b(this.ranges, new a6(), otherRange.lowerBound, s7.z(), v8.c.f34063a, v8.b.f34059a);
        return b11 != -1 && this.ranges.get(b11).encloses(otherRange);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean enclosesAll(z7 other) {
        return super.enclosesAll(other);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(z7<C> other) {
        TreeRangeSet create = TreeRangeSet.create(this);
        create.removeAll(other.complement());
        return copyOf(create);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public boolean intersects(Range<C> otherRange) {
        int b11 = v8.b(this.ranges, new a6(), otherRange.lowerBound, s7.z(), v8.c.f34063a, v8.b.f34060b);
        if (b11 < this.ranges.size() && this.ranges.get(b11).isConnected(otherRange) && !this.ranges.get(b11).intersection(otherRange).isEmpty()) {
            return true;
        }
        if (b11 <= 0) {
            return false;
        }
        int i11 = b11 - 1;
        return this.ranges.get(i11).isConnected(otherRange) && !this.ranges.get(i11).intersection(otherRange).isEmpty();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    public boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @CheckForNull
    public Range<C> rangeContaining(C value) {
        int b11 = v8.b(this.ranges, new a6(), o3.d(value), s7.z(), v8.c.f34063a, v8.b.f34059a);
        if (b11 != -1) {
            Range<C> range = this.ranges.get(b11);
            if (range.contains(value)) {
                return range;
            }
        }
        return null;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void removeAll(z7<C> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z7
    public Range<C> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.create(this.ranges.get(0).lowerBound, this.ranges.get(r1.size() - 1).upperBound);
    }

    public ImmutableRangeSet<C> union(z7<C> other) {
        return unionOf(k6.f(asRanges(), other.asRanges()));
    }

    @go.d
    public Object writeReplace() {
        return new f(this.ranges);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
        Preconditions.checkNotNull(range);
        return range.isEmpty() ? of() : range.equals(Range.all()) ? all() : new ImmutableRangeSet<>(ImmutableList.of(range));
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void addAll(Iterable<Range<C>> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z7
    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.of() : new i8(this.ranges.reverse(), Range.rangeLexOrdering().F());
    }

    @Override // com.google.common.collect.z7
    public ImmutableSet<Range<C>> asRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.of() : new i8(this.ranges, Range.rangeLexOrdering());
    }

    @Override // com.google.common.collect.z7
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            ImmutableRangeSet<C> all = all();
            this.complement = all;
            return all;
        }
        if (this.ranges.size() == 1 && this.ranges.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> of2 = of();
            this.complement = of2;
            return of2;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new e(), this);
        this.complement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void removeAll(Iterable<Range<C>> other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.z7
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> span = span();
            if (range.encloses(span)) {
                return this;
            }
            if (range.isConnected(span)) {
                return new ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return of();
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> ranges, ImmutableRangeSet<C> complement) {
        this.ranges = ranges;
        this.complement = complement;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> ranges) {
        return new d().c(ranges).d();
    }
}
