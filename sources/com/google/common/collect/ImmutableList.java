package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final ba<Object> EMPTY_ITR = new b(d8.f33328c, 0);
    private static final long serialVersionUID = -889275714;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.a
        @uo.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<E> g(E element) {
            super.g(element);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.a, com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            super.c(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableList<E> e() {
            this.f32993d = true;
            return ImmutableList.asImmutableList(this.f32991b, this.f32992c);
        }

        public ImmutableList<E> o(Comparator<? super E> comparator) {
            this.f32993d = true;
            Arrays.sort(this.f32991b, 0, this.f32992c, comparator);
            return ImmutableList.asImmutableList(this.f32991b, this.f32992c);
        }

        @uo.a
        public a<E> p(a<E> other) {
            h(other.f32991b, other.f32992c);
            return this;
        }

        public a(int capacity) {
            super(capacity);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<E> extends com.google.common.collect.b<E> {

        /* renamed from: c, reason: collision with root package name */
        public final ImmutableList<E> f32995c;

        public b(ImmutableList<E> list, int index) {
            super(list.size(), index);
            this.f32995c = list;
        }

        @Override // com.google.common.collect.b
        public E a(int index) {
            return this.f32995c.get(index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<E> extends ImmutableList<E> {

        /* renamed from: a, reason: collision with root package name */
        public final transient ImmutableList<E> f32996a;

        public c(ImmutableList<E> backingList) {
            this.f32996a = backingList;
        }

        public final int a(int index) {
            return (size() - 1) - index;
        }

        public final int b(int index) {
            return size() - index;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object object) {
            return this.f32996a.contains(object);
        }

        @Override // java.util.List
        public E get(int index) {
            Preconditions.checkElementIndex(index, size());
            return this.f32996a.get(a(index));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object object) {
            int lastIndexOf = this.f32996a.lastIndexOf(object);
            if (lastIndexOf >= 0) {
                return a(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f32996a.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object object) {
            int indexOf = this.f32996a.indexOf(object);
            if (indexOf >= 0) {
                return a(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.f32996a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32996a.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return this.f32996a.subList(b(toIndex), b(fromIndex)).reverse();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f32997a;

        public d(Object[] elements) {
            this.f32997a = elements;
        }

        public Object readResolve() {
            return ImmutableList.copyOf(this.f32997a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends ImmutableList<E> {

        /* renamed from: a, reason: collision with root package name */
        public final transient int f32998a;

        /* renamed from: b, reason: collision with root package name */
        public final transient int f32999b;

        public e(int offset, int length) {
            this.f32998a = offset;
            this.f32999b = length;
        }

        @Override // java.util.List
        public E get(int index) {
            Preconditions.checkElementIndex(index, this.f32999b);
            return ImmutableList.this.get(index + this.f32998a);
        }

        @Override // com.google.common.collect.ImmutableCollection
        @CheckForNull
        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.f32998a + this.f32999b;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.f32998a;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32999b;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, this.f32999b);
            ImmutableList immutableList = ImmutableList.this;
            int i11 = this.f32998a;
            return immutableList.subList(fromIndex + i11, toIndex + i11);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] elements) {
        return asImmutableList(elements, elements.length);
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int expectedSize) {
        x2.b(expectedSize, "expectedSize");
        return new a<>(expectedSize);
    }

    private static <E> ImmutableList<E> construct(Object... elements) {
        return asImmutableList(p7.b(elements));
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> elements) {
        Preconditions.checkNotNull(elements);
        return elements instanceof Collection ? copyOf((Collection) elements) : copyOf(elements.iterator());
    }

    public static <E> ImmutableList<E> of() {
        return (ImmutableList<E>) d8.f33328c;
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> elements) {
        Comparable[] comparableArr = (Comparable[]) k6.R(elements, new Comparable[0]);
        p7.b(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @p5
    public static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return v2.L();
    }

    @Override // java.util.List
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return indexOf(object) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] dst, int offset) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            dst[offset + i11] = get(i11);
        }
        return offset + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return q6.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~((i11 * 31) + get(i12).hashCode()));
        }
        return i11;
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return q6.l(this, object);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return q6.n(this, object);
    }

    @Override // java.util.List
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> subListUnchecked(int fromIndex, int toIndex) {
        return new e(fromIndex, toIndex - fromIndex);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @go.d
    @go.c
    public Object writeReplace() {
        return new d(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] elements, int length) {
        return length == 0 ? of() : new d8(elements, length);
    }

    public static <E> ImmutableList<E> of(E e12) {
        return construct(e12);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int fromIndex, int toIndex) {
        Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
        int i11 = toIndex - fromIndex;
        return i11 == size() ? this : i11 == 0 ? of() : subListUnchecked(fromIndex, toIndex);
    }

    public static <E> ImmutableList<E> of(E e12, E e22) {
        return construct(e12, e22);
    }

    @Override // java.util.List
    public ba<E> listIterator() {
        return listIterator(0);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32) {
        return construct(e12, e22, e32);
    }

    @Override // java.util.List
    public ba<E> listIterator(int i11) {
        Preconditions.checkPositionIndex(i11, size());
        if (isEmpty()) {
            return (ba<E>) EMPTY_ITR;
        }
        return new b(this, i11);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> elements) {
        if (elements instanceof ImmutableCollection) {
            ImmutableList<E> asList = ((ImmutableCollection) elements).asList();
            return asList.isPartialView() ? asImmutableList(asList.toArray()) : asList;
        }
        return construct(elements.toArray());
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42) {
        return construct(e12, e22, e32, e42);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        Preconditions.checkNotNull(comparator);
        Object[] P = k6.P(elements);
        p7.b(P);
        Arrays.sort(P, comparator);
        return asImmutableList(P);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52) {
        return construct(e12, e22, e32, e42, e52);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62) {
        return construct(e12, e22, e32, e42, e52, e62);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E e72) {
        return construct(e12, e22, e32, e42, e52, e62, e72);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        E next = elements.next();
        if (!elements.hasNext()) {
            return of((Object) next);
        }
        return new a().g(next).d(elements).e();
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E e72, E e82) {
        return construct(e12, e22, e32, e42, e52, e62, e72, e82);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E e72, E e82, E e92) {
        return construct(e12, e22, e32, e42, e52, e62, e72, e82, e92);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E e72, E e82, E e92, E e102) {
        return construct(e12, e22, e32, e42, e52, e62, e72, e82, e92, e102);
    }

    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E e72, E e82, E e92, E e102, E e11) {
        return construct(e12, e22, e32, e42, e52, e62, e72, e82, e92, e102, e11);
    }

    @SafeVarargs
    public static <E> ImmutableList<E> of(E e12, E e22, E e32, E e42, E e52, E e62, E e72, E e82, E e92, E e102, E e11, E e122, E... others) {
        Preconditions.checkArgument(others.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[others.length + 12];
        objArr[0] = e12;
        objArr[1] = e22;
        objArr[2] = e32;
        objArr[3] = e42;
        objArr[4] = e52;
        objArr[5] = e62;
        objArr[6] = e72;
        objArr[7] = e82;
        objArr[8] = e92;
        objArr[9] = e102;
        objArr[10] = e11;
        objArr[11] = e122;
        System.arraycopy(others, 0, objArr, 12, others.length);
        return construct(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] elements) {
        if (elements.length == 0) {
            return of();
        }
        return construct((Object[]) elements.clone());
    }

    @Override // com.google.common.collect.ImmutableCollection
    @uo.l(replacement = "this")
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }
}
