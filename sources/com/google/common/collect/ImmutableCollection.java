package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@uo.f("Use ImmutableList.of or another implementation")
@u3
/* loaded from: classes7.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final int SPLITERATOR_CHARACTERISTICS = 1296;
    private static final long serialVersionUID = 912559;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<E> extends b<E> {

        /* renamed from: b, reason: collision with root package name */
        public Object[] f32991b;

        /* renamed from: c, reason: collision with root package name */
        public int f32992c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32993d;

        public a(int initialCapacity) {
            x2.b(initialCapacity, "initialCapacity");
            this.f32991b = new Object[initialCapacity];
            this.f32992c = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        public b<E> b(E... elements) {
            h(elements, elements.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        public b<E> c(Iterable<? extends E> elements) {
            if (elements instanceof Collection) {
                Collection collection = (Collection) elements;
                i(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f32992c = ((ImmutableCollection) collection).copyIntoArray(this.f32991b, this.f32992c);
                    return this;
                }
            }
            super.c(elements);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @uo.a
        public a<E> g(E element) {
            Preconditions.checkNotNull(element);
            i(1);
            Object[] objArr = this.f32991b;
            int i11 = this.f32992c;
            this.f32992c = i11 + 1;
            objArr[i11] = element;
            return this;
        }

        public final void h(Object[] elements, int n11) {
            p7.c(elements, n11);
            i(n11);
            System.arraycopy(elements, 0, this.f32991b, this.f32992c, n11);
            this.f32992c += n11;
        }

        public final void i(int newElements) {
            Object[] objArr = this.f32991b;
            int f11 = b.f(objArr.length, this.f32992c + newElements);
            if (f11 > objArr.length || this.f32993d) {
                this.f32991b = Arrays.copyOf(this.f32991b, f11);
                this.f32993d = false;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f
    public static abstract class b<E> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f32994a = 4;

        public static int f(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (minCapacity <= oldCapacity) {
                return oldCapacity;
            }
            int i11 = oldCapacity + (oldCapacity >> 1) + 1;
            if (i11 < minCapacity) {
                i11 = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }

        @uo.a
        /* renamed from: a */
        public abstract b<E> g(E element);

        @uo.a
        public b<E> b(E... elements) {
            for (E e11 : elements) {
                g(e11);
            }
            return this;
        }

        @uo.a
        public b<E> c(Iterable<? extends E> elements) {
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @uo.a
        public b<E> d(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                g(elements.next());
            }
            return this;
        }

        public abstract ImmutableCollection<E> e();
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@CheckForNull Object object);

    @uo.a
    public int copyIntoArray(Object[] dst, int offset) {
        aa<E> it = iterator();
        while (it.hasNext()) {
            dst[offset] = it.next();
            offset++;
        }
        return offset;
    }

    @CheckForNull
    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract aa<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public final boolean remove(@CheckForNull Object object) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @p5
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, SPLITERATOR_CHARACTERISTICS);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @go.d
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    @go.d
    @go.c
    public Object writeReplace() {
        return new ImmutableList.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @uo.a
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return (T[]) v7.a(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = (T[]) p7.j(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }
}
