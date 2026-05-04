package kotlin.collections.builders;

import a00.d;
import a00.h;
import a00.q;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import y00.e;
import y00.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: classes8.dex */
public final class ListBuilder<E> extends h<E> implements List<E>, RandomAccess, Serializable, e {

    @k
    private static final a Companion = new a(null);

    @k
    private static final ListBuilder Empty;

    @k
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BuilderSubList<E> extends h<E> implements List<E>, RandomAccess, Serializable, e {

        @k
        private E[] backing;
        private int length;
        private final int offset;

        @l
        private final BuilderSubList<E> parent;

        @k
        private final ListBuilder<E> root;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
        public static final class a<E> implements ListIterator<E>, f {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final BuilderSubList<E> f66911a;

            /* renamed from: b, reason: collision with root package name */
            public int f66912b;

            /* renamed from: c, reason: collision with root package name */
            public int f66913c;

            /* renamed from: d, reason: collision with root package name */
            public int f66914d;

            public a(@k BuilderSubList<E> list, int i11) {
                g0.p(list, "list");
                this.f66911a = list;
                this.f66912b = i11;
                this.f66913c = -1;
                this.f66914d = ((AbstractList) list).modCount;
            }

            public final void a() {
                if (((AbstractList) ((BuilderSubList) this.f66911a).root).modCount != this.f66914d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e11) {
                a();
                BuilderSubList<E> builderSubList = this.f66911a;
                int i11 = this.f66912b;
                this.f66912b = i11 + 1;
                builderSubList.add(i11, e11);
                this.f66913c = -1;
                this.f66914d = ((AbstractList) this.f66911a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f66912b < ((BuilderSubList) this.f66911a).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f66912b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                if (this.f66912b >= ((BuilderSubList) this.f66911a).length) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f66912b;
                this.f66912b = i11 + 1;
                this.f66913c = i11;
                return (E) ((BuilderSubList) this.f66911a).backing[((BuilderSubList) this.f66911a).offset + this.f66913c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f66912b;
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i11 = this.f66912b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f66912b = i12;
                this.f66913c = i12;
                return (E) ((BuilderSubList) this.f66911a).backing[((BuilderSubList) this.f66911a).offset + this.f66913c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f66912b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i11 = this.f66913c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f66911a.removeAt(i11);
                this.f66912b = this.f66913c;
                this.f66913c = -1;
                this.f66914d = ((AbstractList) this.f66911a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e11) {
                a();
                int i11 = this.f66913c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f66911a.set(i11, e11);
            }
        }

        public BuilderSubList(@k E[] backing, int i11, int i12, @l BuilderSubList<E> builderSubList, @k ListBuilder<E> root) {
            g0.p(backing, "backing");
            g0.p(root, "root");
            this.backing = backing;
            this.offset = i11;
            this.length = i12;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void addAllInternal(int i11, Collection<? extends E> collection, int i12) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(i11, collection, i12);
            } else {
                this.root.addAllInternal(i11, collection, i12);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i12;
        }

        private final void addAtInternal(int i11, E e11) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(i11, e11);
            } else {
                this.root.addAtInternal(i11, e11);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean contentEquals(List<?> list) {
            boolean h11;
            h11 = b00.b.h(this.backing, this.offset, this.length, list);
            return h11;
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final E removeAtInternal(int i11) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.removeAtInternal(i11) : (E) this.root.removeAtInternal(i11);
        }

        private final void removeRangeInternal(int i11, int i12) {
            if (i12 > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(i11, i12);
            } else {
                this.root.removeRangeInternal(i11, i12);
            }
            this.length -= i12;
        }

        private final int retainOrRemoveAllInternal(int i11, int i12, Collection<? extends E> collection, boolean z11) {
            BuilderSubList<E> builderSubList = this.parent;
            int retainOrRemoveAllInternal = builderSubList != null ? builderSubList.retainOrRemoveAllInternal(i11, i12, collection, z11) : this.root.retainOrRemoveAllInternal(i11, i12, collection, z11);
            if (retainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }

        private final Object writeReplace() {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e11) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, e11);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@k Collection<? extends E> elements) {
            g0.p(elements, "elements");
            checkIsMutable();
            checkForComodification();
            int size = elements.size();
            addAllInternal(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@l Object obj) {
            checkForComodification();
            if (obj != this) {
                return (obj instanceof List) && contentEquals((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i11) {
            checkForComodification();
            d.Companion.b(i11, this.length);
            return this.backing[this.offset + i11];
        }

        @Override // a00.h
        public int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11;
            checkForComodification();
            i11 = b00.b.i(this.backing, this.offset, this.length);
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            checkForComodification();
            for (int i11 = 0; i11 < this.length; i11++) {
                if (g0.g(this.backing[this.offset + i11], obj)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @k
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            checkForComodification();
            for (int i11 = this.length - 1; i11 >= 0; i11--) {
                if (g0.g(this.backing[this.offset + i11], obj)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @k
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            checkIsMutable();
            checkForComodification();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                removeAt(indexOf);
            }
            return indexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@k Collection<?> elements) {
            g0.p(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
        }

        @Override // a00.h
        public E removeAt(int i11) {
            checkIsMutable();
            checkForComodification();
            d.Companion.b(i11, this.length);
            return removeAtInternal(this.offset + i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@k Collection<?> elements) {
            g0.p(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
        }

        @Override // a00.h, java.util.AbstractList, java.util.List
        public E set(int i11, E e11) {
            checkIsMutable();
            checkForComodification();
            d.Companion.b(i11, this.length);
            E[] eArr = this.backing;
            int i12 = this.offset;
            E e12 = eArr[i12 + i11];
            eArr[i12 + i11] = e11;
            return e12;
        }

        @Override // java.util.AbstractList, java.util.List
        @k
        public List<E> subList(int i11, int i12) {
            d.Companion.d(i11, i12, this.length);
            return new BuilderSubList(this.backing, this.offset + i11, i12 - i11, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @k
        public <T> T[] toArray(@k T[] array) {
            g0.p(array, "array");
            checkForComodification();
            int length = array.length;
            int i11 = this.length;
            if (length >= i11) {
                E[] eArr = this.backing;
                int i12 = this.offset;
                q.B0(eArr, array, 0, i12, i11 + i12);
                return (T[]) a00.g0.o(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i13 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i13, i11 + i13, array.getClass());
            g0.o(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        @k
        public String toString() {
            String j11;
            checkForComodification();
            j11 = b00.b.j(this.backing, this.offset, this.length, this);
            return j11;
        }

        @Override // java.util.AbstractList, java.util.List
        @k
        public ListIterator<E> listIterator(int i11) {
            checkForComodification();
            d.Companion.c(i11, this.length);
            return new a(this, i11);
        }

        @Override // a00.h, java.util.AbstractList, java.util.List
        public void add(int i11, E e11) {
            checkIsMutable();
            checkForComodification();
            d.Companion.c(i11, this.length);
            addAtInternal(this.offset + i11, e11);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i11, @k Collection<? extends E> elements) {
            g0.p(elements, "elements");
            checkIsMutable();
            checkForComodification();
            d.Companion.c(i11, this.length);
            int size = elements.size();
            addAllInternal(this.offset + i11, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @k
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i11 = this.offset;
            return q.l1(eArr, i11, this.length + i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
    public static final class b<E> implements ListIterator<E>, f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ListBuilder<E> f66915a;

        /* renamed from: b, reason: collision with root package name */
        public int f66916b;

        /* renamed from: c, reason: collision with root package name */
        public int f66917c;

        /* renamed from: d, reason: collision with root package name */
        public int f66918d;

        public b(@k ListBuilder<E> list, int i11) {
            g0.p(list, "list");
            this.f66915a = list;
            this.f66916b = i11;
            this.f66917c = -1;
            this.f66918d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f66915a).modCount != this.f66918d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e11) {
            a();
            ListBuilder<E> listBuilder = this.f66915a;
            int i11 = this.f66916b;
            this.f66916b = i11 + 1;
            listBuilder.add(i11, e11);
            this.f66917c = -1;
            this.f66918d = ((AbstractList) this.f66915a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f66916b < ((ListBuilder) this.f66915a).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f66916b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.f66916b >= ((ListBuilder) this.f66915a).length) {
                throw new NoSuchElementException();
            }
            int i11 = this.f66916b;
            this.f66916b = i11 + 1;
            this.f66917c = i11;
            return (E) ((ListBuilder) this.f66915a).backing[this.f66917c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f66916b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i11 = this.f66916b;
            if (i11 <= 0) {
                throw new NoSuchElementException();
            }
            int i12 = i11 - 1;
            this.f66916b = i12;
            this.f66917c = i12;
            return (E) ((ListBuilder) this.f66915a).backing[this.f66917c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f66916b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i11 = this.f66917c;
            if (i11 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f66915a.removeAt(i11);
            this.f66916b = this.f66917c;
            this.f66917c = -1;
            this.f66918d = ((AbstractList) this.f66915a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e11) {
            a();
            int i11 = this.f66917c;
            if (i11 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f66915a.set(i11, e11);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i11, Collection<? extends E> collection, int i12) {
        registerModification();
        insertAtInternal(i11, i12);
        Iterator<? extends E> it = collection.iterator();
        for (int i13 = 0; i13 < i12; i13++) {
            this.backing[i11 + i13] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i11, E e11) {
        registerModification();
        insertAtInternal(i11, 1);
        this.backing[i11] = e11;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        boolean h11;
        h11 = b00.b.h(this.backing, 0, this.length, list);
        return h11;
    }

    private final void ensureCapacityInternal(int i11) {
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i11 > eArr.length) {
            this.backing = (E[]) b00.b.e(this.backing, d.Companion.e(eArr.length, i11));
        }
    }

    private final void ensureExtraCapacity(int i11) {
        ensureCapacityInternal(this.length + i11);
    }

    private final void insertAtInternal(int i11, int i12) {
        ensureExtraCapacity(i12);
        E[] eArr = this.backing;
        q.B0(eArr, eArr, i11 + i12, i11, this.length);
        this.length += i12;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i11) {
        registerModification();
        E[] eArr = this.backing;
        E e11 = eArr[i11];
        q.B0(eArr, eArr, i11, i11 + 1, this.length);
        b00.b.f(this.backing, this.length - 1);
        this.length--;
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int i11, int i12) {
        if (i12 > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        q.B0(eArr, eArr, i11, i11 + i12, this.length);
        E[] eArr2 = this.backing;
        int i13 = this.length;
        b00.b.g(eArr2, i13 - i12, i13);
        this.length -= i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int i11, int i12, Collection<? extends E> collection, boolean z11) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i11 + i13;
            if (collection.contains(this.backing[i15]) == z11) {
                E[] eArr = this.backing;
                i13++;
                eArr[i14 + i11] = eArr[i15];
                i14++;
            } else {
                i13++;
            }
        }
        int i16 = i12 - i14;
        E[] eArr2 = this.backing;
        q.B0(eArr2, eArr2, i11 + i14, i12 + i11, this.length);
        E[] eArr3 = this.backing;
        int i17 = this.length;
        b00.b.g(eArr3, i17 - i16, i17);
        if (i16 > 0) {
            registerModification();
        }
        this.length -= i16;
        return i16;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        checkIsMutable();
        addAtInternal(this.length, e11);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.length, elements, size);
        return size > 0;
    }

    @k
    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@l Object obj) {
        if (obj != this) {
            return (obj instanceof List) && contentEquals((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        d.Companion.b(i11, this.length);
        return this.backing[i11];
    }

    @Override // a00.h
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11;
        i11 = b00.b.i(this.backing, 0, this.length);
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (g0.g(this.backing[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @k
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i11 = this.length - 1; i11 >= 0; i11--) {
            if (g0.g(this.backing[i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
    }

    @Override // a00.h
    public E removeAt(int i11) {
        checkIsMutable();
        d.Companion.b(i11, this.length);
        return removeAtInternal(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        checkIsMutable();
        d.Companion.b(i11, this.length);
        E[] eArr = this.backing;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public List<E> subList(int i11, int i12) {
        d.Companion.d(i11, i12, this.length);
        return new BuilderSubList(this.backing, i11, i12 - i11, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @k
    public <T> T[] toArray(@k T[] array) {
        g0.p(array, "array");
        int length = array.length;
        int i11 = this.length;
        if (length >= i11) {
            q.B0(this.backing, array, 0, 0, i11);
            return (T[]) a00.g0.o(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i11, array.getClass());
        g0.o(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @k
    public String toString() {
        String j11;
        j11 = b00.b.j(this.backing, 0, this.length, this);
        return j11;
    }

    public ListBuilder(int i11) {
        this.backing = (E[]) b00.b.d(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public ListIterator<E> listIterator(int i11) {
        d.Companion.c(i11, this.length);
        return new b(this, i11);
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        checkIsMutable();
        d.Companion.c(i11, this.length);
        addAtInternal(i11, e11);
    }

    public /* synthetic */ ListBuilder(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 10 : i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, @k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        checkIsMutable();
        d.Companion.c(i11, this.length);
        int size = elements.size();
        addAllInternal(i11, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @k
    public Object[] toArray() {
        return q.l1(this.backing, 0, this.length);
    }
}
