package a00;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
@kotlin.jvm.internal.u0({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n360#2,7:182\n388#2,7:189\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:182,7\n29#1:189,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class d<E> extends a00.b<E> implements List<E>, y00.a {

    @m80.k
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(int i11, int i12, int i13) {
            if (i11 < 0 || i12 > i13) {
                throw new IndexOutOfBoundsException("startIndex: " + i11 + ", endIndex: " + i12 + ", size: " + i13);
            }
            if (i11 <= i12) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i11 + " > endIndex: " + i12);
        }

        public final void b(int i11, int i12) {
            if (i11 < 0 || i11 >= i12) {
                throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
            }
        }

        public final void c(int i11, int i12) {
            if (i11 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
            }
        }

        public final void d(int i11, int i12, int i13) {
            if (i11 < 0 || i12 > i13) {
                throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
            }
            if (i11 <= i12) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
        }

        public final int e(int i11, int i12) {
            int i13 = i11 + (i11 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            return i13 - 2147483639 > 0 ? i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i13;
        }

        public final boolean f(@m80.k Collection<?> c11, @m80.k Collection<?> other) {
            kotlin.jvm.internal.g0.p(c11, "c");
            kotlin.jvm.internal.g0.p(other, "other");
            if (c11.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c11.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.g0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@m80.k Collection<?> c11) {
            kotlin.jvm.internal.g0.p(c11, "c");
            Iterator<?> it = c11.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i11 = (i11 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i11;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Iterator<E>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public int f1092a;

        public b() {
        }

        public final int a() {
            return this.f1092a;
        }

        public final void b(int i11) {
            this.f1092a = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1092a < d.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            int i11 = this.f1092a;
            this.f1092a = i11 + 1;
            return dVar.get(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends d<E>.b implements ListIterator<E>, y00.a {
        public c(int i11) {
            super();
            d.Companion.c(i11, d.this.size());
            b(i11);
        }

        @Override // java.util.ListIterator
        public void add(E e11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            b(a() - 1);
            return dVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: a00.d$d, reason: collision with other inner class name */
    public static final class C0000d<E> extends d<E> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final d<E> f1095a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1096b;

        /* renamed from: c, reason: collision with root package name */
        public int f1097c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0000d(@m80.k d<? extends E> list, int i11, int i12) {
            kotlin.jvm.internal.g0.p(list, "list");
            this.f1095a = list;
            this.f1096b = i11;
            d.Companion.d(i11, i12, list.size());
            this.f1097c = i12 - i11;
        }

        @Override // a00.d, java.util.List
        public E get(int i11) {
            d.Companion.b(i11, this.f1097c);
            return this.f1095a.get(this.f1096b + i11);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return this.f1097c;
        }

        @Override // a00.d, java.util.List
        @m80.k
        public List<E> subList(int i11, int i12) {
            d.Companion.d(i11, i12, this.f1097c);
            d<E> dVar = this.f1095a;
            int i13 = this.f1096b;
            return new C0000d(dVar, i11 + i13, i13 + i12);
        }
    }

    @Override // java.util.List
    public void add(int i11, E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@m80.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i11);

    @Override // a00.b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.g0.g(it.next(), obj)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.g0.g(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @m80.k
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i11, E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @m80.k
    public List<E> subList(int i11, int i12) {
        return new C0000d(this, i11, i12);
    }

    @Override // java.util.List
    @m80.k
    public ListIterator<E> listIterator(int i11) {
        return new c(i11);
    }
}
