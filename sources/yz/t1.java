package yz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@kotlin.d
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n58#1:83,3\n*E\n"})
/* loaded from: classes8.dex */
public final class t1 implements Collection<s1>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final int[] f100450a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<s1>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final int[] f100451a;

        /* renamed from: b, reason: collision with root package name */
        public int f100452b;

        public a(@m80.k int[] array) {
            kotlin.jvm.internal.g0.p(array, "array");
            this.f100451a = array;
        }

        public int a() {
            int i11 = this.f100452b;
            int[] iArr = this.f100451a;
            if (i11 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f100452b));
            }
            this.f100452b = i11 + 1;
            return s1.i(iArr[i11]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f100452b < this.f100451a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ s1 next() {
            return s1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @v0
    public /* synthetic */ t1(int[] iArr) {
        this.f100450a = iArr;
    }

    public static final /* synthetic */ t1 b(int[] iArr) {
        return new t1(iArr);
    }

    @m80.k
    public static int[] d(int i11) {
        return f(new int[i11]);
    }

    @v0
    @m80.k
    public static int[] f(@m80.k int[] storage) {
        kotlin.jvm.internal.g0.p(storage, "storage");
        return storage;
    }

    public static boolean h(int[] iArr, int i11) {
        return a00.a0.z8(iArr, i11);
    }

    public static boolean j(int[] iArr, @m80.k Collection<s1> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection<s1> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof s1) || !a00.a0.z8(iArr, ((s1) obj).m0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr, Object obj) {
        return (obj instanceof t1) && kotlin.jvm.internal.g0.g(iArr, ((t1) obj).w());
    }

    public static final boolean l(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.g0.g(iArr, iArr2);
    }

    public static final int m(int[] iArr, int i11) {
        return s1.i(iArr[i11]);
    }

    public static int o(int[] iArr) {
        return iArr.length;
    }

    public static int r(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean s(int[] iArr) {
        return iArr.length == 0;
    }

    @m80.k
    public static Iterator<s1> t(int[] iArr) {
        return new a(iArr);
    }

    public static final void u(int[] iArr, int i11, int i12) {
        iArr[i11] = i12;
    }

    public static String v(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public boolean a(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(s1 s1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends s1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof s1) {
            return g(((s1) obj).m0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return j(this.f100450a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f100450a, obj);
    }

    public boolean g(int i11) {
        return h(this.f100450a, i11);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f100450a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f100450a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<s1> iterator() {
        return t(this.f100450a);
    }

    @Override // java.util.Collection
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f100450a);
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
        return v(this.f100450a);
    }

    public final /* synthetic */ int[] w() {
        return this.f100450a;
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
