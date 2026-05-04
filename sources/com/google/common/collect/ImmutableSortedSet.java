package com.google.common.collect;

import a00.a0;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, t8<E> {
    private static final long serialVersionUID = 912559;
    final transient Comparator<? super E> comparator;

    @go.c
    @CheckForNull
    @vo.b
    transient ImmutableSortedSet<E> descendingSet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<? super E> f33096a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f33097b;

        public b(Comparator<? super E> comparator, Object[] elements) {
            this.f33096a = comparator;
            this.f33097b = elements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new a(this.f33096a).b(this.f33097b).e();
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Deprecated
    @uo.e("Use naturalOrder")
    public static <E> a<E> builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Use naturalOrder (which does not accept an expected size)")
    public static <E> a<E> builderWithExpectedSize(int expectedSize) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator, int i11, E... eArr) {
        if (i11 == 0) {
            return emptySet(comparator);
        }
        p7.c(eArr, i11);
        Arrays.sort(eArr, 0, i11, comparator);
        int i12 = 1;
        for (int i13 = 1; i13 < i11; i13++) {
            a0.e eVar = (Object) eArr[i13];
            if (comparator.compare(eVar, (Object) eArr[i12 - 1]) != 0) {
                eArr[i12] = eVar;
                i12++;
            }
        }
        Arrays.fill(eArr, i12, i11, (Object) null);
        if (i12 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i12);
        }
        return new i8(ImmutableList.asImmutableList(eArr, i12), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet copyOf(Comparable[] elements) {
        return construct(s7.z(), elements.length, (Comparable[]) elements.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator a11 = u8.a(sortedSet);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) sortedSet);
        return copyOf.isEmpty() ? emptySet(a11) : new i8(copyOf, a11);
    }

    public static <E> i8<E> emptySet(Comparator<? super E> comparator) {
        return s7.z().equals(comparator) ? (i8<E>) i8.f33548b : new i8<>(ImmutableList.of(), comparator);
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(s7.z());
    }

    public static <E> ImmutableSortedSet<E> of() {
        return i8.f33548b;
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    @go.d
    private void readObject(ObjectInputStream unused) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(Collections.reverseOrder());
    }

    @p5
    @Deprecated
    @uo.e("Use toImmutableSortedSet")
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        throw new UnsupportedOperationException();
    }

    @p5
    public static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(Comparator<? super E> comparator) {
        return v2.W(comparator);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e11) {
        return (E) k6.v(tailSet((ImmutableSortedSet<E>) e11, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.t8
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    @go.c
    public abstract ImmutableSortedSet<E> createDescendingSet();

    @Override // java.util.NavigableSet
    @go.c
    public abstract aa<E> descendingIterator();

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E floor(E e11) {
        return (E) l6.I(headSet((ImmutableSortedSet<E>) e11, true).descendingIterator(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ NavigableSet headSet(Object toElement, boolean inclusive) {
        return headSet((ImmutableSortedSet<E>) toElement, inclusive);
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E toElement, boolean inclusive);

    @Override // java.util.NavigableSet
    @go.c
    @CheckForNull
    public E higher(E e11) {
        return (E) k6.v(tailSet((ImmutableSortedSet<E>) e11, false), null);
    }

    public abstract int indexOf(@CheckForNull Object target);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract aa<E> iterator();

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @go.c
    @CheckForNull
    public E lower(E e11) {
        return (E) l6.I(headSet((ImmutableSortedSet<E>) e11, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @go.c
    @uo.a
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @go.c
    @uo.a
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.c
    public /* bridge */ /* synthetic */ NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        return subSet((boolean) fromElement, fromInclusive, (boolean) toElement, toInclusive);
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ NavigableSet tailSet(Object fromElement, boolean inclusive) {
        return tailSet((ImmutableSortedSet<E>) fromElement, inclusive);
    }

    public abstract ImmutableSortedSet<E> tailSetImpl(E fromElement, boolean inclusive);

    public int unsafeCompare(Object a11, @CheckForNull Object b11) {
        return unsafeCompare(this.comparator, a11, b11);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return new b(this.comparator, toArray());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<E> extends ImmutableSet.a<E> {

        /* renamed from: g, reason: collision with root package name */
        public final Comparator<? super E> f33095g;

        public a(Comparator<? super E> comparator) {
            this.f33095g = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @uo.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a<E> a(E element) {
            super.a(element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @uo.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @uo.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            super.c(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @uo.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<E> e() {
            ImmutableSortedSet<E> construct = ImmutableSortedSet.construct(this.f33095g, this.f32992c, this.f32991b);
            this.f32992c = construct.size();
            this.f32993d = true;
            return construct;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        @uo.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public a<E> p(ImmutableSet.a<E> builder) {
            super.p(builder);
            return this;
        }

        public a(Comparator<? super E> comparator, int expectedKeys) {
            super(expectedKeys, false);
            this.f33095g = (Comparator) Preconditions.checkNotNull(comparator);
        }
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> elements) {
        return copyOf(s7.z(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable e12) {
        return new i8(ImmutableList.of(e12), s7.z());
    }

    public static int unsafeCompare(Comparator<?> comparator, Object a11, @CheckForNull Object b11) {
        return comparator.compare(a11, b11);
    }

    @Override // java.util.NavigableSet
    @go.c
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ SortedSet headSet(Object toElement) {
        return headSet((ImmutableSortedSet<E>) toElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ SortedSet tailSet(Object fromElement) {
        return tailSet((ImmutableSortedSet<E>) fromElement);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable e12, Comparable e22) {
        return construct(s7.z(), 2, e12, e22);
    }

    public ImmutableSortedSet<E> headSet(E toElement) {
        return headSet((ImmutableSortedSet<E>) toElement, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> subSet(E fromElement, E toElement) {
        return subSet((boolean) fromElement, true, (boolean) toElement, false);
    }

    public ImmutableSortedSet<E> tailSet(E fromElement) {
        return tailSet((ImmutableSortedSet<E>) fromElement, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> elements) {
        return copyOf((Comparator) s7.z(), (Collection) elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable e12, Comparable e22, Comparable e32) {
        return construct(s7.z(), 3, e12, e22, e32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableSortedSet<E> headSet(E toElement, boolean inclusive) {
        return headSetImpl(Preconditions.checkNotNull(toElement), inclusive);
    }

    @go.c
    public ImmutableSortedSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        Preconditions.checkNotNull(fromElement);
        Preconditions.checkNotNull(toElement);
        Preconditions.checkArgument(this.comparator.compare(fromElement, toElement) <= 0);
        return subSetImpl(fromElement, fromInclusive, toElement, toInclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableSortedSet<E> tailSet(E fromElement, boolean inclusive) {
        return tailSetImpl(Preconditions.checkNotNull(fromElement), inclusive);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable e12, Comparable e22, Comparable e32, Comparable e42) {
        return construct(s7.z(), 4, e12, e22, e32, e42);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> elements) {
        return copyOf(s7.z(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable e12, Comparable e22, Comparable e32, Comparable e42, Comparable e52) {
        return construct(s7.z(), 5, e12, e22, e32, e42, e52);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable e12, Comparable e22, Comparable e32, Comparable e42, Comparable e52, Comparable e62, Comparable... remaining) {
        int length = remaining.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e12;
        comparableArr[1] = e22;
        comparableArr[2] = e32;
        comparableArr[3] = e42;
        comparableArr[4] = e52;
        comparableArr[5] = e62;
        System.arraycopy(remaining, 0, comparableArr, 6, remaining.length);
        return construct(s7.z(), length, comparableArr);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> elements) {
        return new a(comparator).d(elements).e();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        Preconditions.checkNotNull(comparator);
        if (u8.b(comparator, elements) && (elements instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) elements;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] P = k6.P(elements);
        return construct(comparator, P.length, P);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> elements) {
        return copyOf((Comparator) comparator, (Iterable) elements);
    }

    @Deprecated
    @uo.e("Pass a parameter of type Comparable")
    public static <E> ImmutableSortedSet<E> of(E e12) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass parameters of type Comparable")
    public static <Z> ImmutableSortedSet<Z> copyOf(Z[] elements) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass parameters of type Comparable")
    public static <E> ImmutableSortedSet<E> of(E e12, E e22) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass parameters of type Comparable")
    public static <E> ImmutableSortedSet<E> of(E e12, E e22, E e32) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass parameters of type Comparable")
    public static <E> ImmutableSortedSet<E> of(E e12, E e22, E e32, E e42) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass parameters of type Comparable")
    public static <E> ImmutableSortedSet<E> of(E e12, E e22, E e32, E e42, E e52) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Pass parameters of type Comparable")
    public static <E> ImmutableSortedSet<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E... remaining) {
        throw new UnsupportedOperationException();
    }
}
