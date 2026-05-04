package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.j7;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements x8<E> {
    private static final long serialVersionUID = 912559;

    @CheckForNull
    @vo.b
    transient ImmutableSortedMultiset<E> descendingMultiset;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<E> extends ImmutableMultiset.b<E> {

        /* renamed from: e, reason: collision with root package name */
        public final Comparator<? super E> f33087e;

        /* renamed from: f, reason: collision with root package name */
        @go.e
        public E[] f33088f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f33089g;

        /* renamed from: h, reason: collision with root package name */
        public int f33090h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f33091i;

        public a(Comparator<? super E> comparator) {
            super(true);
            this.f33087e = (Comparator) Preconditions.checkNotNull(comparator);
            this.f33088f = (E[]) new Object[4];
            this.f33089g = new int[4];
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @uo.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a<E> g(E element) {
            return k(element, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @uo.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            for (E e11 : elements) {
                a(e11);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @uo.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            if (elements instanceof j7) {
                for (j7.a<E> aVar : ((j7) elements).entrySet()) {
                    k(aVar.e(), aVar.getCount());
                }
            } else {
                Iterator<? extends E> it = elements.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @uo.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                a(elements.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @uo.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a<E> k(E element, int occurrences) {
            Preconditions.checkNotNull(element);
            x2.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return this;
            }
            w();
            E[] eArr = this.f33088f;
            int i11 = this.f33090h;
            eArr[i11] = element;
            this.f33089g[i11] = occurrences;
            this.f33090h = i11 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMultiset<E> e() {
            v();
            int i11 = this.f33090h;
            if (i11 == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.f33087e);
            }
            i8 i8Var = (i8) ImmutableSortedSet.construct(this.f33087e, i11, this.f33088f);
            long[] jArr = new long[this.f33090h + 1];
            int i12 = 0;
            while (i12 < this.f33090h) {
                int i13 = i12 + 1;
                jArr[i13] = jArr[i12] + this.f33089g[i12];
                i12 = i13;
            }
            this.f33091i = true;
            return new h8(i8Var, jArr, 0, this.f33090h);
        }

        public final void u(boolean z11) {
            int i11 = this.f33090h;
            if (i11 == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f33088f, i11);
            Arrays.sort(objArr, this.f33087e);
            int i12 = 1;
            for (int i13 = 1; i13 < objArr.length; i13++) {
                if (this.f33087e.compare((Object) objArr[i12 - 1], (Object) objArr[i13]) < 0) {
                    objArr[i12] = objArr[i13];
                    i12++;
                }
            }
            Arrays.fill(objArr, i12, this.f33090h, (Object) null);
            if (z11) {
                int i14 = i12 * 4;
                int i15 = this.f33090h;
                if (i14 > i15 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, com.google.common.math.f.t(i15, (i15 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i16 = 0; i16 < this.f33090h; i16++) {
                int binarySearch = Arrays.binarySearch(objArr, 0, i12, this.f33088f[i16], this.f33087e);
                int i17 = this.f33089g[i16];
                if (i17 >= 0) {
                    iArr[binarySearch] = iArr[binarySearch] + i17;
                } else {
                    iArr[binarySearch] = ~i17;
                }
            }
            this.f33088f = (E[]) objArr;
            this.f33089g = iArr;
            this.f33090h = i12;
        }

        public final void v() {
            u(false);
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f33090h;
                if (i11 >= i13) {
                    Arrays.fill(this.f33088f, i12, i13, (Object) null);
                    Arrays.fill(this.f33089g, i12, this.f33090h, 0);
                    this.f33090h = i12;
                    return;
                }
                int[] iArr = this.f33089g;
                int i14 = iArr[i11];
                if (i14 > 0) {
                    E[] eArr = this.f33088f;
                    eArr[i12] = eArr[i11];
                    iArr[i12] = i14;
                    i12++;
                }
                i11++;
            }
        }

        public final void w() {
            int i11 = this.f33090h;
            E[] eArr = this.f33088f;
            if (i11 == eArr.length) {
                u(true);
            } else if (this.f33091i) {
                this.f33088f = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f33091i = false;
        }

        @Override // com.google.common.collect.ImmutableMultiset.b
        @uo.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a<E> m(E element, int count) {
            Preconditions.checkNotNull(element);
            x2.b(count, "count");
            w();
            E[] eArr = this.f33088f;
            int i11 = this.f33090h;
            eArr[i11] = element;
            this.f33089g[i11] = ~count;
            this.f33090h = i11 + 1;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static final class b<E> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<? super E> f33092a;

        /* renamed from: b, reason: collision with root package name */
        public final E[] f33093b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f33094c;

        public b(x8<E> x8Var) {
            this.f33092a = x8Var.comparator();
            int size = x8Var.entrySet().size();
            this.f33093b = (E[]) new Object[size];
            this.f33094c = new int[size];
            int i11 = 0;
            for (j7.a<E> aVar : x8Var.entrySet()) {
                this.f33093b[i11] = aVar.e();
                this.f33094c[i11] = aVar.getCount();
                i11++;
            }
        }

        public Object readResolve() {
            int length = this.f33093b.length;
            a aVar = new a(this.f33092a);
            for (int i11 = 0; i11 < length; i11++) {
                aVar.k(this.f33093b[i11], this.f33094c[i11]);
            }
            return aVar.e();
        }
    }

    @Deprecated
    @uo.e("Use naturalOrder.")
    public static <E> a<E> builder() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] elements) {
        return copyOf(s7.z(), Arrays.asList(elements));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(x8<E> sortedMultiset) {
        return copyOfSortedEntries(sortedMultiset.comparator(), q6.r(sortedMultiset.entrySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, Collection<j7.a<E>> entries) {
        if (entries.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.a aVar = new ImmutableList.a(entries.size());
        long[] jArr = new long[entries.size() + 1];
        Iterator<j7.a<E>> it = entries.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            aVar.g(it.next().e());
            int i12 = i11 + 1;
            jArr[i12] = jArr[i11] + r5.getCount();
            i11 = i12;
        }
        return new h8(new i8(aVar.e(), comparator), jArr, 0, entries.size());
    }

    public static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return s7.z().equals(comparator) ? (ImmutableSortedMultiset<E>) h8.f33536f : new h8(comparator);
    }

    public static /* synthetic */ int f(Object obj) {
        return 1;
    }

    public static /* synthetic */ j7 h(j7 j7Var, j7 j7Var2) {
        j7Var.addAll(j7Var2);
        return j7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @p5
    public static <T, E> void mapAndAdd(T t11, j7<E> multiset, Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
        multiset.add(Preconditions.checkNotNull(elementFunction.apply(t11)), countFunction.applyAsInt(t11));
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(s7.z());
    }

    public static <E> ImmutableSortedMultiset<E> of() {
        return (ImmutableSortedMultiset<E>) h8.f33536f;
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(s7.z().F());
    }

    @p5
    @Deprecated
    @uo.e("Use toImmutableSortedMultiset.")
    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        throw new UnsupportedOperationException();
    }

    @p5
    public static <E> Collector<E, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(Comparator<? super E> comparator) {
        return toImmutableSortedMultiset(comparator, Function.identity(), new ToIntFunction() { // from class: com.google.common.collect.g6
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableSortedMultiset.f(obj);
            }
        });
    }

    @Override // com.google.common.collect.x8, com.google.common.collect.t8
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.j7
    public abstract ImmutableSortedSet<E> elementSet();

    @Override // com.google.common.collect.x8
    public abstract ImmutableSortedMultiset<E> headMultiset(E upperBound, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 headMultiset(Object upperBound, BoundType boundType) {
        return headMultiset((ImmutableSortedMultiset<E>) upperBound, boundType);
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final j7.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.x8
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final j7.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 subMultiset(Object lowerBound, BoundType lowerBoundType, Object upperBound, BoundType upperBoundType) {
        return subMultiset((BoundType) lowerBound, lowerBoundType, (BoundType) upperBound, upperBoundType);
    }

    @Override // com.google.common.collect.x8
    public abstract ImmutableSortedMultiset<E> tailMultiset(E lowerBound, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.x8
    public /* bridge */ /* synthetic */ x8 tailMultiset(Object lowerBound, BoundType boundType) {
        return tailMultiset((ImmutableSortedMultiset<E>) lowerBound, boundType);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @go.d
    public Object writeReplace() {
        return new b(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> elements) {
        return copyOf(s7.z(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable e12) {
        return new h8((i8) ImmutableSortedSet.of(e12), new long[]{0, 1}, 0, 1);
    }

    @Deprecated
    @uo.e("Use toImmutableSortedMultiset.")
    @p5
    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> elementFunction, ToIntFunction<? super T> countFunction) {
        throw new UnsupportedOperationException();
    }

    @p5
    public static <T, E> Collector<T, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(final Comparator<? super E> comparator, final Function<? super T, ? extends E> elementFunction, final ToIntFunction<? super T> countFunction) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(elementFunction);
        Preconditions.checkNotNull(countFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.c6
            @Override // java.util.function.Supplier
            public final Object get() {
                j7 create;
                create = TreeMultiset.create(comparator);
                return create;
            }
        }, new BiConsumer() { // from class: com.google.common.collect.d6
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ImmutableSortedMultiset.mapAndAdd(obj2, (j7) obj, elementFunction, countFunction);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.e6
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ImmutableSortedMultiset.h((j7) obj, (j7) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.f6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ImmutableSortedMultiset copyOfSortedEntries;
                copyOfSortedEntries = ImmutableSortedMultiset.copyOfSortedEntries(comparator, ((j7) obj).entrySet());
                return copyOfSortedEntries;
            }
        }, new Collector.Characteristics[0]);
    }

    @Override // com.google.common.collect.x8
    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.descendingMultiset;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? emptyMultiset(s7.i(comparator()).F()) : new q3<>(this);
            this.descendingMultiset = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.x8
    public ImmutableSortedMultiset<E> subMultiset(E lowerBound, BoundType lowerBoundType, E upperBound, BoundType upperBoundType) {
        Preconditions.checkArgument(comparator().compare(lowerBound, upperBound) <= 0, "Expected lowerBound <= upperBound but %s > %s", lowerBound, upperBound);
        return tailMultiset((ImmutableSortedMultiset<E>) lowerBound, lowerBoundType).headMultiset((ImmutableSortedMultiset<E>) upperBound, upperBoundType);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> elements) {
        return copyOf(s7.z(), elements);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable e12, Comparable e22) {
        return copyOf(s7.z(), Arrays.asList(e12, e22));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> elements) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator).d(elements).e();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable e12, Comparable e22, Comparable e32) {
        return copyOf(s7.z(), Arrays.asList(e12, e22, e32));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable e12, Comparable e22, Comparable e32, Comparable e42) {
        return copyOf(s7.z(), Arrays.asList(e12, e22, e32, e42));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        if (elements instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) elements;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new a(comparator).c(elements).e();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable e12, Comparable e22, Comparable e32, Comparable e42, Comparable e52) {
        return copyOf(s7.z(), Arrays.asList(e12, e22, e32, e42, e52));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable e12, Comparable e22, Comparable e32, Comparable e42, Comparable e52, Comparable e62, Comparable... remaining) {
        ArrayList u11 = q6.u(remaining.length + 6);
        Collections.addAll(u11, e12, e22, e32, e42, e52, e62);
        Collections.addAll(u11, remaining);
        return copyOf(s7.z(), u11);
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <Z> ImmutableSortedMultiset<Z> copyOf(Z[] elements) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <E> ImmutableSortedMultiset<E> of(E e12) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <E> ImmutableSortedMultiset<E> of(E e12, E e22) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <E> ImmutableSortedMultiset<E> of(E e12, E e22, E e32) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <E> ImmutableSortedMultiset<E> of(E e12, E e22, E e32, E e42) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <E> ImmutableSortedMultiset<E> of(E e12, E e22, E e32, E e42, E e52) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @uo.e("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    public static <E> ImmutableSortedMultiset<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E... remaining) {
        throw new UnsupportedOperationException();
    }
}
