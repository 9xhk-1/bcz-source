package yz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@kotlin.d
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n58#1:83,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d2 implements Collection<c2>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final short[] f100416a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<c2>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final short[] f100417a;

        /* renamed from: b, reason: collision with root package name */
        public int f100418b;

        public a(@m80.k short[] array) {
            kotlin.jvm.internal.g0.p(array, "array");
            this.f100417a = array;
        }

        public short a() {
            int i11 = this.f100418b;
            short[] sArr = this.f100417a;
            if (i11 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f100418b));
            }
            this.f100418b = i11 + 1;
            return c2.i(sArr[i11]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f100418b < this.f100417a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ c2 next() {
            return c2.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @v0
    public /* synthetic */ d2(short[] sArr) {
        this.f100416a = sArr;
    }

    public static final /* synthetic */ d2 b(short[] sArr) {
        return new d2(sArr);
    }

    @m80.k
    public static short[] d(int i11) {
        return f(new short[i11]);
    }

    @v0
    @m80.k
    public static short[] f(@m80.k short[] storage) {
        kotlin.jvm.internal.g0.p(storage, "storage");
        return storage;
    }

    public static boolean h(short[] sArr, short s11) {
        return a00.a0.C8(sArr, s11);
    }

    public static boolean j(short[] sArr, @m80.k Collection<c2> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection<c2> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof c2) || !a00.a0.C8(sArr, ((c2) obj).k0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof d2) && kotlin.jvm.internal.g0.g(sArr, ((d2) obj).w());
    }

    public static final boolean l(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.g0.g(sArr, sArr2);
    }

    public static final short m(short[] sArr, int i11) {
        return c2.i(sArr[i11]);
    }

    public static int o(short[] sArr) {
        return sArr.length;
    }

    public static int r(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean s(short[] sArr) {
        return sArr.length == 0;
    }

    @m80.k
    public static Iterator<c2> t(short[] sArr) {
        return new a(sArr);
    }

    public static final void u(short[] sArr, int i11, short s11) {
        sArr[i11] = s11;
    }

    public static String v(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public boolean a(short s11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(c2 c2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends c2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof c2) {
            return g(((c2) obj).k0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return j(this.f100416a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f100416a, obj);
    }

    public boolean g(short s11) {
        return h(this.f100416a, s11);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f100416a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f100416a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<c2> iterator() {
        return t(this.f100416a);
    }

    @Override // java.util.Collection
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f100416a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.u.a(this);
    }

    public String toString() {
        return v(this.f100416a);
    }

    public final /* synthetic */ short[] w() {
        return this.f100416a;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }

    @v0
    public static /* synthetic */ void p() {
    }
}
