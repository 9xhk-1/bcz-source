package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.v8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements y7<K, V>, Serializable {
    private static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.of(), ImmutableList.of());
    private static final long serialVersionUID = 0;
    private final transient ImmutableList<Range<K>> ranges;
    private final transient ImmutableList<V> values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ImmutableList<Range<K>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33046a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33047b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Range f33048c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImmutableRangeMap f33049d;

        public a(final ImmutableRangeMap this$0, final int val$len, final int val$off, final Range val$range) {
            this.f33046a = val$len;
            this.f33047b = val$off;
            this.f33048c = val$range;
            this.f33049d = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Range<K> get(int index) {
            Preconditions.checkElementIndex(index, this.f33046a);
            return (index == 0 || index == this.f33046a + (-1)) ? ((Range) this.f33049d.ranges.get(index + this.f33047b)).intersection(this.f33048c) : (Range) this.f33049d.ranges.get(index + this.f33047b);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33046a;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ImmutableRangeMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Range f33050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableRangeMap f33051b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ImmutableRangeMap f33052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final ImmutableRangeMap this$0, ImmutableList ranges, ImmutableList values, final Range val$range, final ImmutableRangeMap val$outer) {
            super(ranges, values);
            this.f33050a = val$range;
            this.f33051b = val$outer;
            this.f33052c = this$0;
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.y7
        public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
            return super.asDescendingMapOfRanges();
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.y7
        public /* bridge */ /* synthetic */ Map asMapOfRanges() {
            return super.asMapOfRanges();
        }

        @Override // com.google.common.collect.ImmutableRangeMap
        @go.d
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.y7
        public ImmutableRangeMap<K, V> subRangeMap(Range<K> subRange) {
            return this.f33050a.isConnected(subRange) ? this.f33051b.subRangeMap((Range) subRange.intersection(this.f33050a)) : ImmutableRangeMap.of();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f
    public static final class c<K extends Comparable<?>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final List<Map.Entry<Range<K>, V>> f33053a = q6.q();

        public ImmutableRangeMap<K, V> a() {
            Collections.sort(this.f33053a, Range.rangeLexOrdering().C());
            ImmutableList.a aVar = new ImmutableList.a(this.f33053a.size());
            ImmutableList.a aVar2 = new ImmutableList.a(this.f33053a.size());
            for (int i11 = 0; i11 < this.f33053a.size(); i11++) {
                Range<K> key = this.f33053a.get(i11).getKey();
                if (i11 > 0) {
                    Range<K> key2 = this.f33053a.get(i11 - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + key2 + " overlaps with entry " + key);
                    }
                }
                aVar.g(key);
                aVar2.g(this.f33053a.get(i11).getValue());
            }
            return new ImmutableRangeMap<>(aVar.e(), aVar2.e());
        }

        @uo.a
        public c<K, V> b(c<K, V> builder) {
            this.f33053a.addAll(builder.f33053a);
            return this;
        }

        @uo.a
        public c<K, V> c(Range<K> range, V value) {
            Preconditions.checkNotNull(range);
            Preconditions.checkNotNull(value);
            Preconditions.checkArgument(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f33053a.add(u6.O(range, value));
            return this;
        }

        @uo.a
        public c<K, V> d(y7<K, ? extends V> rangeMap) {
            for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<Range<K>, V> f33054a;

        public d(ImmutableMap<Range<K>, V> mapOfRanges) {
            this.f33054a = mapOfRanges;
        }

        public Object a() {
            c cVar = new c();
            aa<Map.Entry<Range<K>, V>> it = this.f33054a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                cVar.c(next.getKey(), next.getValue());
            }
            return cVar.a();
        }

        public Object readResolve() {
            return this.f33054a.isEmpty() ? ImmutableRangeMap.of() : a();
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> ranges, ImmutableList<V> values) {
        this.ranges = ranges;
        this.values = values;
    }

    public static <K extends Comparable<?>, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(y7<K, ? extends V> rangeMap) {
        if (rangeMap instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) rangeMap;
        }
        Map<Range<K>, ? extends V> asMapOfRanges = rangeMap.asMapOfRanges();
        ImmutableList.a aVar = new ImmutableList.a(asMapOfRanges.size());
        ImmutableList.a aVar2 = new ImmutableList.a(asMapOfRanges.size());
        for (Map.Entry<Range<K>, ? extends V> entry : asMapOfRanges.entrySet()) {
            aVar.g(entry.getKey());
            aVar2.g(entry.getValue());
        }
        return new ImmutableRangeMap<>(aVar.e(), aVar2.e());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of() {
        return (ImmutableRangeMap<K, V>) EMPTY;
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @p5
    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(Function<? super T, Range<K>> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.Q(keyFunction, valueFunction);
    }

    @Override // com.google.common.collect.y7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.y7
    public boolean equals(@CheckForNull Object o11) {
        if (o11 instanceof y7) {
            return asMapOfRanges().equals(((y7) o11).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.y7
    @CheckForNull
    public V get(K key) {
        int a11 = v8.a(this.ranges, new a6(), o3.d(key), v8.c.f34063a, v8.b.f34059a);
        if (a11 != -1 && this.ranges.get(a11).contains(key)) {
            return this.values.get(a11);
        }
        return null;
    }

    @Override // com.google.common.collect.y7
    @CheckForNull
    public Map.Entry<Range<K>, V> getEntry(K key) {
        int a11 = v8.a(this.ranges, new a6(), o3.d(key), v8.c.f34063a, v8.b.f34059a);
        if (a11 == -1) {
            return null;
        }
        Range<K> range = this.ranges.get(a11);
        if (range.contains(key)) {
            return u6.O(range, this.values.get(a11));
        }
        return null;
    }

    @Override // com.google.common.collect.y7
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.y7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void put(Range<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.y7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void putAll(y7<K, ? extends V> rangeMap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.y7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void putCoalescing(Range<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.y7
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.y7
    public Range<K> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.create(this.ranges.get(0).lowerBound, this.ranges.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.y7
    public String toString() {
        return asMapOfRanges().toString();
    }

    public Object writeReplace() {
        return new d(asMapOfRanges());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of(Range<K> range, V value) {
        return new ImmutableRangeMap<>(ImmutableList.of(range), ImmutableList.of(value));
    }

    @Override // com.google.common.collect.y7
    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new i8(this.ranges.reverse(), Range.rangeLexOrdering().F()), this.values.reverse());
    }

    @Override // com.google.common.collect.y7
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        return this.ranges.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new i8(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    @Override // com.google.common.collect.y7
    public ImmutableRangeMap<K, V> subRangeMap(final Range<K> range) {
        if (((Range) Preconditions.checkNotNull(range)).isEmpty()) {
            return of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.ranges;
        z5 z5Var = new z5();
        o3<K> o3Var = range.lowerBound;
        v8.c cVar = v8.c.f34066d;
        v8.b bVar = v8.b.f34060b;
        int a11 = v8.a(immutableList, z5Var, o3Var, cVar, bVar);
        int a12 = v8.a(this.ranges, new a6(), range.upperBound, v8.c.f34063a, bVar);
        return a11 >= a12 ? of() : new b(this, new a(this, a12 - a11, a11, range), this.values.subList(a11, a12), range, this);
    }
}
