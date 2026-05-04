package yz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@kotlin.d
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1740#2,3:83\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n58#1:83,3\n*E\n"})
/* loaded from: classes8.dex */
public final class p1 implements Collection<o1>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final byte[] f100441a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<o1>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final byte[] f100442a;

        /* renamed from: b, reason: collision with root package name */
        public int f100443b;

        public a(@m80.k byte[] array) {
            kotlin.jvm.internal.g0.p(array, "array");
            this.f100442a = array;
        }

        public byte a() {
            int i11 = this.f100443b;
            byte[] bArr = this.f100442a;
            if (i11 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f100443b));
            }
            this.f100443b = i11 + 1;
            return o1.i(bArr[i11]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f100443b < this.f100442a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ o1 next() {
            return o1.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @v0
    public /* synthetic */ p1(byte[] bArr) {
        this.f100441a = bArr;
    }

    public static final /* synthetic */ p1 b(byte[] bArr) {
        return new p1(bArr);
    }

    @m80.k
    public static byte[] d(int i11) {
        return f(new byte[i11]);
    }

    @v0
    @m80.k
    public static byte[] f(@m80.k byte[] storage) {
        kotlin.jvm.internal.g0.p(storage, "storage");
        return storage;
    }

    public static boolean h(byte[] bArr, byte b11) {
        return a00.a0.v8(bArr, b11);
    }

    public static boolean j(byte[] bArr, @m80.k Collection<o1> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection<o1> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof o1) || !a00.a0.v8(bArr, ((o1) obj).k0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte[] bArr, Object obj) {
        return (obj instanceof p1) && kotlin.jvm.internal.g0.g(bArr, ((p1) obj).w());
    }

    public static final boolean l(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.g0.g(bArr, bArr2);
    }

    public static final byte m(byte[] bArr, int i11) {
        return o1.i(bArr[i11]);
    }

    public static int o(byte[] bArr) {
        return bArr.length;
    }

    public static int r(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean s(byte[] bArr) {
        return bArr.length == 0;
    }

    @m80.k
    public static Iterator<o1> t(byte[] bArr) {
        return new a(bArr);
    }

    public static final void u(byte[] bArr, int i11, byte b11) {
        bArr[i11] = b11;
    }

    public static String v(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public boolean a(byte b11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(o1 o1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends o1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o1) {
            return g(((o1) obj).k0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return j(this.f100441a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f100441a, obj);
    }

    public boolean g(byte b11) {
        return h(this.f100441a, b11);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f100441a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f100441a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<o1> iterator() {
        return t(this.f100441a);
    }

    @Override // java.util.Collection
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int size() {
        return o(this.f100441a);
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
        return v(this.f100441a);
    }

    public final /* synthetic */ byte[] w() {
        return this.f100441a;
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
