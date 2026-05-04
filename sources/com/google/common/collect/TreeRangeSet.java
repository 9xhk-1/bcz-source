package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public class TreeRangeSet<C extends Comparable<?>> extends k<C> implements Serializable {

    @CheckForNull
    @vo.b
    private transient Set<Range<C>> asDescendingSetOfRanges;

    @CheckForNull
    @vo.b
    private transient Set<Range<C>> asRanges;

    @CheckForNull
    @vo.b
    private transient z7<C> complement;

    @go.e
    final NavigableMap<o3<C>, Range<C>> rangesByLowerBound;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends l4<Range<C>> implements Set<Range<C>> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<Range<C>> f33196a;

        public b(Collection<Range<C>> delegate) {
            this.f33196a = delegate;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object o11) {
            return q8.g(this, o11);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return q8.k(this);
        }

        @Override // com.google.common.collect.l4, com.google.common.collect.c5
        public Collection<Range<C>> delegate() {
            return this.f33196a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends TreeRangeSet<C> {
        public c() {
            super(new d(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public void add(Range<C> rangeToAdd) {
            TreeRangeSet.this.remove(rangeToAdd);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.z7
        public z7<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public boolean contains(C value) {
            return !TreeRangeSet.this.contains(value);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public void remove(Range<C> rangeToRemove) {
            TreeRangeSet.this.add(rangeToRemove);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<C extends Comparable<?>> extends j<o3<C>, Range<C>> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableMap<o3<C>, Range<C>> f33199a;

        /* renamed from: b, reason: collision with root package name */
        public final NavigableMap<o3<C>, Range<C>> f33200b;

        /* renamed from: c, reason: collision with root package name */
        public final Range<o3<C>> f33201c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<Map.Entry<o3<C>, Range<C>>> {

            /* renamed from: c, reason: collision with root package name */
            public o3<C> f33202c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o3 f33203d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u7 f33204e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d f33205f;

            public a(final d this$0, final o3 val$firstComplementRangeLowerBound, final u7 val$positiveItr) {
                this.f33203d = val$firstComplementRangeLowerBound;
                this.f33204e = val$positiveItr;
                this.f33205f = this$0;
                this.f33202c = val$firstComplementRangeLowerBound;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<o3<C>, Range<C>> a() {
                Range create;
                if (this.f33205f.f33201c.upperBound.m(this.f33202c) || this.f33202c == o3.a()) {
                    return (Map.Entry) b();
                }
                if (this.f33204e.hasNext()) {
                    Range range = (Range) this.f33204e.next();
                    create = Range.create(this.f33202c, range.lowerBound);
                    this.f33202c = range.upperBound;
                } else {
                    create = Range.create(this.f33202c, o3.a());
                    this.f33202c = o3.a();
                }
                return u6.O(create.lowerBound, create);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.c<Map.Entry<o3<C>, Range<C>>> {

            /* renamed from: c, reason: collision with root package name */
            public o3<C> f33206c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o3 f33207d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ u7 f33208e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d f33209f;

            public b(final d this$0, final o3 val$firstComplementRangeUpperBound, final u7 val$positiveItr) {
                this.f33207d = val$firstComplementRangeUpperBound;
                this.f33208e = val$positiveItr;
                this.f33209f = this$0;
                this.f33206c = val$firstComplementRangeUpperBound;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<o3<C>, Range<C>> a() {
                if (this.f33206c == o3.c()) {
                    return (Map.Entry) b();
                }
                if (this.f33208e.hasNext()) {
                    Range range = (Range) this.f33208e.next();
                    Range create = Range.create(range.upperBound, this.f33206c);
                    this.f33206c = range.lowerBound;
                    if (this.f33209f.f33201c.lowerBound.m(create.lowerBound)) {
                        return u6.O(create.lowerBound, create);
                    }
                } else if (this.f33209f.f33201c.lowerBound.m(o3.c())) {
                    Range create2 = Range.create(o3.c(), this.f33206c);
                    this.f33206c = o3.c();
                    return u6.O(o3.c(), create2);
                }
                return (Map.Entry) b();
            }
        }

        public d(NavigableMap<o3<C>, Range<C>> positiveRangesByLowerBound) {
            this(positiveRangesByLowerBound, Range.all());
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<o3<C>, Range<C>>> b() {
            Collection<Range<C>> values;
            o3 o3Var;
            if (this.f33201c.hasLowerBound()) {
                values = this.f33200b.tailMap(this.f33201c.lowerEndpoint(), this.f33201c.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                values = this.f33200b.values();
            }
            u7 S = l6.S(values.iterator());
            if (this.f33201c.contains(o3.c()) && (!S.hasNext() || ((Range) S.peek()).lowerBound != o3.c())) {
                o3Var = o3.c();
            } else {
                if (!S.hasNext()) {
                    return l6.t();
                }
                o3Var = ((Range) S.next()).upperBound;
            }
            return new a(this, o3Var, S);
        }

        @Override // java.util.SortedMap
        public Comparator<? super o3<C>> comparator() {
            return s7.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.j
        public Iterator<Map.Entry<o3<C>, Range<C>>> d() {
            o3<C> higherKey;
            u7 S = l6.S(this.f33200b.headMap(this.f33201c.hasUpperBound() ? this.f33201c.upperEndpoint() : o3.a(), this.f33201c.hasUpperBound() && this.f33201c.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (S.hasNext()) {
                higherKey = ((Range) S.peek()).upperBound == o3.a() ? ((Range) S.next()).lowerBound : this.f33199a.higherKey(((Range) S.peek()).upperBound);
            } else {
                if (!this.f33201c.contains(o3.c()) || this.f33199a.containsKey(o3.c())) {
                    return l6.t();
                }
                higherKey = this.f33199a.higherKey(o3.c());
            }
            return new b(this, (o3) ho.b0.a(higherKey, o3.a()), S);
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@CheckForNull Object key) {
            if (key instanceof o3) {
                try {
                    o3<C> o3Var = (o3) key;
                    Map.Entry<o3<C>, Range<C>> firstEntry = tailMap(o3Var, true).firstEntry();
                    if (firstEntry != null && firstEntry.getKey().equals(o3Var)) {
                        return firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> headMap(o3<C> toKey, boolean inclusive) {
            return k(Range.upTo(toKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> subMap(o3<C> fromKey, boolean fromInclusive, o3<C> toKey, boolean toInclusive) {
            return k(Range.range(fromKey, BoundType.forBoolean(fromInclusive), toKey, BoundType.forBoolean(toInclusive)));
        }

        public final NavigableMap<o3<C>, Range<C>> k(Range<o3<C>> subWindow) {
            if (!this.f33201c.isConnected(subWindow)) {
                return ImmutableSortedMap.of();
            }
            return new d(this.f33199a, subWindow.intersection(this.f33201c));
        }

        @Override // java.util.NavigableMap
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> tailMap(o3<C> fromKey, boolean inclusive) {
            return k(Range.downTo(fromKey, BoundType.forBoolean(inclusive)));
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return l6.Y(b());
        }

        public d(NavigableMap<o3<C>, Range<C>> positiveRangesByLowerBound, Range<o3<C>> window) {
            this.f33199a = positiveRangesByLowerBound;
            this.f33200b = new e(positiveRangesByLowerBound);
            this.f33201c = window;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends TreeRangeSet<C> {

        /* renamed from: a, reason: collision with root package name */
        public final Range<C> f33216a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(com.google.common.collect.Range<C> r5) {
            /*
                r3 = this;
                com.google.common.collect.TreeRangeSet.this = r4
                com.google.common.collect.TreeRangeSet$g r0 = new com.google.common.collect.TreeRangeSet$g
                com.google.common.collect.Range r1 = com.google.common.collect.Range.all()
                java.util.NavigableMap<com.google.common.collect.o3<C extends java.lang.Comparable<?>>, com.google.common.collect.Range<C extends java.lang.Comparable<?>>> r4 = r4.rangesByLowerBound
                r2 = 0
                r0.<init>(r1, r5, r4)
                r3.<init>(r0)
                r3.f33216a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeRangeSet.f.<init>(com.google.common.collect.TreeRangeSet, com.google.common.collect.Range):void");
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public void add(Range<C> rangeToAdd) {
            Preconditions.checkArgument(this.f33216a.encloses(rangeToAdd), "Cannot add range %s to subRangeSet(%s)", rangeToAdd, this.f33216a);
            TreeRangeSet.this.add(rangeToAdd);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public void clear() {
            TreeRangeSet.this.remove(this.f33216a);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public boolean contains(C value) {
            return this.f33216a.contains(value) && TreeRangeSet.this.contains(value);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public boolean encloses(Range<C> range) {
            Range rangeEnclosing;
            return (this.f33216a.isEmpty() || !this.f33216a.encloses(range) || (rangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeEnclosing.intersection(this.f33216a).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        @CheckForNull
        public Range<C> rangeContaining(C value) {
            Range<C> rangeContaining;
            if (this.f33216a.contains(value) && (rangeContaining = TreeRangeSet.this.rangeContaining(value)) != null) {
                return rangeContaining.intersection(this.f33216a);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.k, com.google.common.collect.z7
        public void remove(Range<C> rangeToRemove) {
            if (rangeToRemove.isConnected(this.f33216a)) {
                TreeRangeSet.this.remove(rangeToRemove.intersection(this.f33216a));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.z7
        public z7<C> subRangeSet(Range<C> view) {
            return view.encloses(this.f33216a) ? this : view.isConnected(this.f33216a) ? new f(this, this.f33216a.intersection(view)) : ImmutableRangeSet.of();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<C extends Comparable<?>> extends j<o3<C>, Range<C>> {

        /* renamed from: a, reason: collision with root package name */
        public final Range<o3<C>> f33218a;

        /* renamed from: b, reason: collision with root package name */
        public final Range<C> f33219b;

        /* renamed from: c, reason: collision with root package name */
        public final NavigableMap<o3<C>, Range<C>> f33220c;

        /* renamed from: d, reason: collision with root package name */
        public final NavigableMap<o3<C>, Range<C>> f33221d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<Map.Entry<o3<C>, Range<C>>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33222c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o3 f33223d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f33224e;

            public a(final g this$0, final Iterator val$completeRangeItr, final o3 val$upperBoundOnLowerBounds) {
                this.f33222c = val$completeRangeItr;
                this.f33223d = val$upperBoundOnLowerBounds;
                this.f33224e = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<o3<C>, Range<C>> a() {
                if (!this.f33222c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f33222c.next();
                if (this.f33223d.m(range.lowerBound)) {
                    return (Map.Entry) b();
                }
                Range intersection = range.intersection(this.f33224e.f33219b);
                return u6.O(intersection.lowerBound, intersection);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.c<Map.Entry<o3<C>, Range<C>>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33225c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f33226d;

            public b(final g this$0, final Iterator val$completeRangeItr) {
                this.f33225c = val$completeRangeItr;
                this.f33226d = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<o3<C>, Range<C>> a() {
                if (!this.f33225c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f33225c.next();
                if (this.f33226d.f33219b.lowerBound.compareTo(range.upperBound) >= 0) {
                    return (Map.Entry) b();
                }
                Range intersection = range.intersection(this.f33226d.f33219b);
                return this.f33226d.f33218a.contains(intersection.lowerBound) ? u6.O(intersection.lowerBound, intersection) : (Map.Entry) b();
            }
        }

        private NavigableMap<o3<C>, Range<C>> l(Range<o3<C>> window) {
            return !window.isConnected(this.f33218a) ? ImmutableSortedMap.of() : new g(this.f33218a.intersection(window), this.f33219b, this.f33220c);
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<o3<C>, Range<C>>> b() {
            Iterator<Range<C>> it;
            if (this.f33219b.isEmpty()) {
                return l6.t();
            }
            if (this.f33218a.upperBound.m(this.f33219b.lowerBound)) {
                return l6.t();
            }
            if (this.f33218a.lowerBound.m(this.f33219b.lowerBound)) {
                it = this.f33221d.tailMap(this.f33219b.lowerBound, false).values().iterator();
            } else {
                it = this.f33220c.tailMap(this.f33218a.lowerBound.k(), this.f33218a.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            return new a(this, it, (o3) s7.z().w(this.f33218a.upperBound, o3.d(this.f33219b.upperBound)));
        }

        @Override // java.util.SortedMap
        public Comparator<? super o3<C>> comparator() {
            return s7.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.j
        public Iterator<Map.Entry<o3<C>, Range<C>>> d() {
            if (this.f33219b.isEmpty()) {
                return l6.t();
            }
            o3 o3Var = (o3) s7.z().w(this.f33218a.upperBound, o3.d(this.f33219b.upperBound));
            return new b(this, this.f33220c.headMap((o3) o3Var.k(), o3Var.q() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@CheckForNull Object key) {
            if (key instanceof o3) {
                try {
                    o3<C> o3Var = (o3) key;
                    if (this.f33218a.contains(o3Var) && o3Var.compareTo(this.f33219b.lowerBound) >= 0 && o3Var.compareTo(this.f33219b.upperBound) < 0) {
                        if (o3Var.equals(this.f33219b.lowerBound)) {
                            Range range = (Range) u6.S0(this.f33220c.floorEntry(o3Var));
                            if (range != null && range.upperBound.compareTo(this.f33219b.lowerBound) > 0) {
                                return range.intersection(this.f33219b);
                            }
                        } else {
                            Range<C> range2 = this.f33220c.get(o3Var);
                            if (range2 != null) {
                                return range2.intersection(this.f33219b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> headMap(o3<C> toKey, boolean inclusive) {
            return l(Range.upTo(toKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> subMap(o3<C> fromKey, boolean fromInclusive, o3<C> toKey, boolean toInclusive) {
            return l(Range.range(fromKey, BoundType.forBoolean(fromInclusive), toKey, BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> tailMap(o3<C> fromKey, boolean inclusive) {
            return l(Range.downTo(fromKey, BoundType.forBoolean(inclusive)));
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return l6.Y(b());
        }

        public g(Range<o3<C>> lowerBoundWindow, Range<C> restriction, NavigableMap<o3<C>, Range<C>> rangesByLowerBound) {
            this.f33218a = (Range) Preconditions.checkNotNull(lowerBoundWindow);
            this.f33219b = (Range) Preconditions.checkNotNull(restriction);
            this.f33220c = (NavigableMap) Preconditions.checkNotNull(rangesByLowerBound);
            this.f33221d = new e(rangesByLowerBound);
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public Range<C> rangeEnclosing(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<o3<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry == null || !floorEntry.getValue().encloses(range)) {
            return null;
        }
        return floorEntry.getValue();
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public void add(Range<C> rangeToAdd) {
        Preconditions.checkNotNull(rangeToAdd);
        if (rangeToAdd.isEmpty()) {
            return;
        }
        o3<C> o3Var = rangeToAdd.lowerBound;
        o3<C> o3Var2 = rangeToAdd.upperBound;
        Map.Entry<o3<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(o3Var);
        if (lowerEntry != null) {
            Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(o3Var) >= 0) {
                if (value.upperBound.compareTo(o3Var2) >= 0) {
                    o3Var2 = value.upperBound;
                }
                o3Var = value.lowerBound;
            }
        }
        Map.Entry<o3<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(o3Var2);
        if (floorEntry != null) {
            Range<C> value2 = floorEntry.getValue();
            if (value2.upperBound.compareTo(o3Var2) >= 0) {
                o3Var2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(o3Var, o3Var2).clear();
        replaceRangeWithSameLowerBound(Range.create(o3Var, o3Var2));
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ void addAll(z7 other) {
        super.addAll(other);
    }

    @Override // com.google.common.collect.z7
    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.z7
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.rangesByLowerBound.values());
        this.asRanges = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.z7
    public z7<C> complement() {
        z7<C> z7Var = this.complement;
        if (z7Var != null) {
            return z7Var;
        }
        c cVar = new c();
        this.complement = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return super.contains(value);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public boolean encloses(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<o3<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return floorEntry != null && floorEntry.getValue().encloses(range);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean enclosesAll(z7 other) {
        return super.enclosesAll(other);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public boolean intersects(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<o3<C>, Range<C>> ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ceilingEntry.getValue().isConnected(range) && !ceilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<o3<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (lowerEntry == null || !lowerEntry.getValue().isConnected(range) || lowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    @CheckForNull
    public Range<C> rangeContaining(C value) {
        Preconditions.checkNotNull(value);
        Map.Entry<o3<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(o3.d(value));
        if (floorEntry == null || !floorEntry.getValue().contains(value)) {
            return null;
        }
        return floorEntry.getValue();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public void remove(Range<C> rangeToRemove) {
        Preconditions.checkNotNull(rangeToRemove);
        if (rangeToRemove.isEmpty()) {
            return;
        }
        Map.Entry<o3<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(rangeToRemove.lowerBound);
        if (lowerEntry != null) {
            Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(rangeToRemove.lowerBound) >= 0) {
                if (rangeToRemove.hasUpperBound() && value.upperBound.compareTo(rangeToRemove.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(rangeToRemove.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, rangeToRemove.lowerBound));
            }
        }
        Map.Entry<o3<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(rangeToRemove.upperBound);
        if (floorEntry != null) {
            Range<C> value2 = floorEntry.getValue();
            if (rangeToRemove.hasUpperBound() && value2.upperBound.compareTo(rangeToRemove.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(rangeToRemove.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(rangeToRemove.lowerBound, rangeToRemove.upperBound).clear();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ void removeAll(z7 other) {
        super.removeAll(other);
    }

    @Override // com.google.common.collect.z7
    public Range<C> span() {
        Map.Entry<o3<C>, Range<C>> firstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<o3<C>, Range<C>> lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(firstEntry.getValue().lowerBound, lastEntry.getValue().upperBound);
    }

    @Override // com.google.common.collect.z7
    public z7<C> subRangeSet(Range<C> view) {
        return view.equals(Range.all()) ? this : new f(this, view);
    }

    private TreeRangeSet(NavigableMap<o3<C>, Range<C>> rangesByLowerCut) {
        this.rangesByLowerBound = rangesByLowerCut;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(z7<C> rangeSet) {
        TreeRangeSet<C> create = create();
        create.addAll(rangeSet);
        return create;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ void addAll(Iterable ranges) {
        super.addAll(ranges);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.z7
    public /* bridge */ /* synthetic */ void removeAll(Iterable ranges) {
        super.removeAll(ranges);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class e<C extends Comparable<?>> extends j<o3<C>, Range<C>> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableMap<o3<C>, Range<C>> f33210a;

        /* renamed from: b, reason: collision with root package name */
        public final Range<o3<C>> f33211b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<Map.Entry<o3<C>, Range<C>>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33212c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f33213d;

            public a(final e this$0, final Iterator val$backingItr) {
                this.f33212c = val$backingItr;
                this.f33213d = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<o3<C>, Range<C>> a() {
                if (!this.f33212c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f33212c.next();
                return this.f33213d.f33211b.upperBound.m(range.upperBound) ? (Map.Entry) b() : u6.O(range.upperBound, range);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.c<Map.Entry<o3<C>, Range<C>>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u7 f33214c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f33215d;

            public b(final e this$0, final u7 val$backingItr) {
                this.f33214c = val$backingItr;
                this.f33215d = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<o3<C>, Range<C>> a() {
                if (!this.f33214c.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f33214c.next();
                return this.f33215d.f33211b.lowerBound.m(range.upperBound) ? u6.O(range.upperBound, range) : (Map.Entry) b();
            }
        }

        public e(NavigableMap<o3<C>, Range<C>> rangesByLowerBound) {
            this.f33210a = rangesByLowerBound;
            this.f33211b = Range.all();
        }

        private NavigableMap<o3<C>, Range<C>> k(Range<o3<C>> window) {
            return window.isConnected(this.f33211b) ? new e(this.f33210a, window.intersection(this.f33211b)) : ImmutableSortedMap.of();
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<o3<C>, Range<C>>> b() {
            Iterator<Range<C>> it;
            if (this.f33211b.hasLowerBound()) {
                Map.Entry<o3<C>, Range<C>> lowerEntry = this.f33210a.lowerEntry(this.f33211b.lowerEndpoint());
                it = lowerEntry == null ? this.f33210a.values().iterator() : this.f33211b.lowerBound.m(lowerEntry.getValue().upperBound) ? this.f33210a.tailMap(lowerEntry.getKey(), true).values().iterator() : this.f33210a.tailMap(this.f33211b.lowerEndpoint(), true).values().iterator();
            } else {
                it = this.f33210a.values().iterator();
            }
            return new a(this, it);
        }

        @Override // java.util.SortedMap
        public Comparator<? super o3<C>> comparator() {
            return s7.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.j
        public Iterator<Map.Entry<o3<C>, Range<C>>> d() {
            u7 S = l6.S((this.f33211b.hasUpperBound() ? this.f33210a.headMap(this.f33211b.upperEndpoint(), false).descendingMap().values() : this.f33210a.descendingMap().values()).iterator());
            if (S.hasNext() && this.f33211b.upperBound.m(((Range) S.peek()).upperBound)) {
                S.next();
            }
            return new b(this, S);
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@CheckForNull Object key) {
            Map.Entry<o3<C>, Range<C>> lowerEntry;
            if (key instanceof o3) {
                try {
                    o3<C> o3Var = (o3) key;
                    if (this.f33211b.contains(o3Var) && (lowerEntry = this.f33210a.lowerEntry(o3Var)) != null && lowerEntry.getValue().upperBound.equals(o3Var)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> headMap(o3<C> toKey, boolean inclusive) {
            return k(Range.upTo(toKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f33211b.equals(Range.all()) ? this.f33210a.isEmpty() : !b().hasNext();
        }

        @Override // java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> subMap(o3<C> fromKey, boolean fromInclusive, o3<C> toKey, boolean toInclusive) {
            return k(Range.range(fromKey, BoundType.forBoolean(fromInclusive), toKey, BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<o3<C>, Range<C>> tailMap(o3<C> fromKey, boolean inclusive) {
            return k(Range.downTo(fromKey, BoundType.forBoolean(inclusive)));
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33211b.equals(Range.all()) ? this.f33210a.size() : l6.Y(b());
        }

        public e(NavigableMap<o3<C>, Range<C>> rangesByLowerBound, Range<o3<C>> upperBoundWindow) {
            this.f33210a = rangesByLowerBound;
            this.f33211b = upperBoundWindow;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> ranges) {
        TreeRangeSet<C> create = create();
        create.addAll(ranges);
        return create;
    }
}
