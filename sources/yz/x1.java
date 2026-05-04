package yz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@kotlin.d
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n58#1:83,3\n*E\n"})
/* loaded from: classes8.dex */
public final class x1 implements Collection<w1>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final long[] f100464a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<w1>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final long[] f100465a;

        /* renamed from: b, reason: collision with root package name */
        public int f100466b;

        public a(@m80.k long[] array) {
            kotlin.jvm.internal.g0.p(array, "array");
            this.f100465a = array;
        }

        public long a() {
            int i11 = this.f100466b;
            long[] jArr = this.f100465a;
            if (i11 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f100466b));
            }
            this.f100466b = i11 + 1;
            return w1.i(jArr[i11]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f100466b < this.f100465a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ w1 next() {
            return w1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @v0
    public /* synthetic */ x1(long[] jArr) {
        this.f100464a = jArr;
    }

    public static final /* synthetic */ x1 b(long[] jArr) {
        return new x1(jArr);
    }

    @m80.k
    public static long[] d(int i11) {
        return f(new long[i11]);
    }

    @v0
    @m80.k
    public static long[] f(@m80.k long[] storage) {
        kotlin.jvm.internal.g0.p(storage, "storage");
        return storage;
    }

    public static boolean h(long[] jArr, long j11) {
        return a00.a0.A8(jArr, j11);
    }

    public static boolean j(long[] jArr, @m80.k Collection<w1> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection<w1> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof w1) || !a00.a0.A8(jArr, ((w1) obj).m0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof x1) && kotlin.jvm.internal.g0.g(jArr, ((x1) obj).w());
    }

    public static final boolean l(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.g0.g(jArr, jArr2);
    }

    public static final long m(long[] jArr, int i11) {
        return w1.i(jArr[i11]);
    }

    public static int o(long[] jArr) {
        return jArr.length;
    }

    public static int r(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean s(long[] jArr) {
        return jArr.length == 0;
    }

    @m80.k
    public static Iterator<w1> t(long[] jArr) {
        return new a(jArr);
    }

    public static final void u(long[] jArr, int i11, long j11) {
        jArr[i11] = j11;
    }

    public static String v(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public boolean a(long j11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(w1 w1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends w1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof w1) {
            return g(((w1) obj).m0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return j(this.f100464a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f100464a, obj);
    }

    public boolean g(long j11) {
        return h(this.f100464a, j11);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f100464a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f100464a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<w1> iterator() {
        return t(this.f100464a);
    }

    @Override // java.util.Collection
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f100464a);
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
        return v(this.f100464a);
    }

    public final /* synthetic */ long[] w() {
        return this.f100464a;
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
