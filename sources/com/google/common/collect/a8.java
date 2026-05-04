package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class a8<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Range<C> f33256a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends l<C> {

        /* renamed from: b, reason: collision with root package name */
        public final C f33257b;

        public a(Comparable comparable) {
            super(comparable);
            this.f33257b = (C) a8.this.last();
        }

        @Override // com.google.common.collect.l
        @CheckForNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C previous) {
            if (a8.b(previous, this.f33257b)) {
                return null;
            }
            return a8.this.domain.g(previous);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends l<C> {

        /* renamed from: b, reason: collision with root package name */
        public final C f33259b;

        public b(Comparable comparable) {
            super(comparable);
            this.f33259b = (C) a8.this.first();
        }

        @Override // com.google.common.collect.l
        @CheckForNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C previous) {
            if (a8.b(previous, this.f33259b)) {
                return null;
            }
            return a8.this.domain.i(previous);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends q5<C> {
        public c() {
        }

        @Override // com.google.common.collect.q5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> a() {
            return a8.this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            a8 a8Var = a8.this;
            return (C) a8Var.domain.h(a8Var.first(), i11);
        }

        @Override // com.google.common.collect.q5, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static final class d<C extends Comparable> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Range<C> f33262a;

        /* renamed from: b, reason: collision with root package name */
        public final t3<C> f33263b;

        public /* synthetic */ d(Range range, t3 t3Var, a aVar) {
            this(range, t3Var);
        }

        private Object readResolve() {
            return new a8(this.f33262a, this.f33263b);
        }

        public d(Range<C> range, t3<C> domain) {
            this.f33262a = range;
            this.f33263b = domain;
        }
    }

    public a8(Range<C> range, t3<C> domain) {
        super(domain);
        this.f33256a = range;
    }

    public static boolean b(Comparable<?> left, @CheckForNull Comparable<?> right) {
        return right != null && Range.compareOrThrow(left, right) == 0;
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f33256a.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> targets) {
        return y2.b(this, targets);
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> createAsList() {
        return this.domain.f33863a ? new c() : super.createAsList();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C first() {
        C o11 = this.f33256a.lowerBound.o(this.domain);
        Objects.requireNonNull(o11);
        return o11;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a8) {
            a8 a8Var = (a8) object;
            if (this.domain.equals(a8Var.domain)) {
                return first().equals(a8Var.first()) && last().equals(a8Var.last());
            }
        }
        return super.equals(object);
    }

    public final ContiguousSet<C> f(Range<C> other) {
        return this.f33256a.isConnected(other) ? ContiguousSet.create(this.f33256a.intersection(other), this.domain) : new v3(this.domain);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C last() {
        C l11 = this.f33256a.upperBound.l(this.domain);
        Objects.requireNonNull(l11);
        return l11;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return q8.k(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet
    @go.c
    public int indexOf(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        Objects.requireNonNull(obj);
        return (int) this.domain.b(first(), (Comparable) obj);
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> other) {
        Preconditions.checkNotNull(other);
        Preconditions.checkArgument(this.domain.equals(other.domain));
        if (other.isEmpty()) {
            return other;
        }
        Comparable comparable = (Comparable) s7.z().s(first(), (Comparable) other.first());
        Comparable comparable2 = (Comparable) s7.z().w(last(), (Comparable) other.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.domain) : new v3(this.domain);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long b11 = this.domain.b(first(), last());
        if (b11 >= SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return ((int) b11) + 1;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new d(this.f33256a, this.domain, null);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @go.c
    public aa<C> descendingIterator() {
        return new b(last());
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> headSetImpl(C toElement, boolean inclusive) {
        return f(Range.upTo(toElement, BoundType.forBoolean(inclusive)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<C> iterator() {
        return new a(first());
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType lowerBoundType, BoundType upperBoundType) {
        return Range.create(this.f33256a.lowerBound.r(lowerBoundType, this.domain), this.f33256a.upperBound.s(upperBoundType, this.domain));
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return (fromElement.compareTo(toElement) != 0 || fromInclusive || toInclusive) ? f(Range.range(fromElement, BoundType.forBoolean(fromInclusive), toElement, BoundType.forBoolean(toInclusive))) : new v3(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> tailSetImpl(C fromElement, boolean inclusive) {
        return f(Range.downTo(fromElement, BoundType.forBoolean(inclusive)));
    }
}
