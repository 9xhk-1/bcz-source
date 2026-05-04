package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
/* loaded from: classes7.dex */
public class a3<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    @go.e
    public static final double f33239f = 0.001d;

    /* renamed from: g, reason: collision with root package name */
    public static final int f33240g = 9;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public transient Object f33241a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public transient int[] f33242b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @go.e
    public transient Object[] f33243c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f33244d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f33245e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f33246a;

        /* renamed from: b, reason: collision with root package name */
        public int f33247b;

        /* renamed from: c, reason: collision with root package name */
        public int f33248c = -1;

        public a() {
            this.f33246a = a3.this.f33244d;
            this.f33247b = a3.this.q();
        }

        public final void a() {
            if (a3.this.f33244d != this.f33246a) {
                throw new ConcurrentModificationException();
            }
        }

        public void b() {
            this.f33246a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33247b >= 0;
        }

        @Override // java.util.Iterator
        @t7
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f33247b;
            this.f33248c = i11;
            E e11 = (E) a3.this.o(i11);
            this.f33247b = a3.this.r(this.f33247b);
            return e11;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            x2.e(this.f33248c >= 0);
            b();
            a3 a3Var = a3.this;
            a3Var.remove(a3Var.o(this.f33248c));
            this.f33247b = a3.this.d(this.f33247b, this.f33248c);
            this.f33248c = -1;
        }
    }

    public a3() {
        u(3);
    }

    public static <E> a3<E> h() {
        return new a3<>();
    }

    public static <E> a3<E> j(Collection<? extends E> collection) {
        a3<E> m11 = m(collection.size());
        m11.addAll(collection);
        return m11;
    }

    @SafeVarargs
    public static <E> a3<E> k(E... elements) {
        a3<E> m11 = m(elements.length);
        Collections.addAll(m11, elements);
        return m11;
    }

    public static <E> a3<E> m(int expectedSize) {
        return new a3<>(expectedSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.d
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        u(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            add(stream.readObject());
        }
    }

    @go.d
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    public final int[] A() {
        int[] iArr = this.f33242b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object B() {
        Object obj = this.f33241a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void C(int newCapacity) {
        this.f33242b = Arrays.copyOf(A(), newCapacity);
        this.f33243c = Arrays.copyOf(z(), newCapacity);
    }

    public final void D(int newSize) {
        int min;
        int length = A().length;
        if (newSize <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        C(min);
    }

    @uo.a
    public final int F(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object a11 = b3.a(newCapacity);
        int i11 = newCapacity - 1;
        if (targetEntryIndex != 0) {
            b3.i(a11, targetHash & i11, targetEntryIndex + 1);
        }
        Object B = B();
        int[] A = A();
        for (int i12 = 0; i12 <= oldMask; i12++) {
            int h11 = b3.h(B, i12);
            while (h11 != 0) {
                int i13 = h11 - 1;
                int i14 = A[i13];
                int b11 = b3.b(i14, oldMask) | i12;
                int i15 = b11 & i11;
                int h12 = b3.h(a11, i15);
                b3.i(a11, i15, h11);
                A[i13] = b3.d(b11, h12, i11);
                h11 = b3.c(i14, oldMask);
            }
        }
        this.f33241a = a11;
        I(i11);
        return i11;
    }

    public final void G(int i11, E value) {
        z()[i11] = value;
    }

    public final void H(int i11, int value) {
        A()[i11] = value;
    }

    public final void I(int mask) {
        this.f33244d = b3.d(this.f33244d, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    public void J() {
        if (y()) {
            return;
        }
        Set<E> n11 = n();
        if (n11 != null) {
            Set<E> l11 = l(size());
            l11.addAll(n11);
            this.f33241a = l11;
            return;
        }
        int i11 = this.f33245e;
        if (i11 < A().length) {
            C(i11);
        }
        int j11 = b3.j(i11);
        int s11 = s();
        if (j11 < s11) {
            F(s11, j11, 0, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @uo.a
    public boolean add(@t7 E object) {
        if (y()) {
            f();
        }
        Set<E> n11 = n();
        if (n11 != null) {
            return n11.add(object);
        }
        int[] A = A();
        Object[] z11 = z();
        int i11 = this.f33245e;
        int i12 = i11 + 1;
        int d11 = o5.d(object);
        int s11 = s();
        int i13 = d11 & s11;
        int h11 = b3.h(B(), i13);
        if (h11 != 0) {
            int b11 = b3.b(d11, s11);
            int i14 = 0;
            while (true) {
                int i15 = h11 - 1;
                int i16 = A[i15];
                if (b3.b(i16, s11) == b11 && ho.d0.a(object, z11[i15])) {
                    return false;
                }
                int c11 = b3.c(i16, s11);
                i14++;
                if (c11 != 0) {
                    h11 = c11;
                } else {
                    if (i14 >= 9) {
                        return g().add(object);
                    }
                    if (i12 > s11) {
                        s11 = F(s11, b3.e(s11), d11, i11);
                    } else {
                        A[i15] = b3.d(i16, i12, s11);
                    }
                }
            }
        } else if (i12 > s11) {
            s11 = F(s11, b3.e(s11), d11, i11);
        } else {
            b3.i(B(), i13, i12);
        }
        D(i12);
        v(i11, object, d11, s11);
        this.f33245e = i12;
        t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (y()) {
            return;
        }
        t();
        Set<E> n11 = n();
        if (n11 != null) {
            this.f33244d = ro.i.h(size(), 3, 1073741823);
            n11.clear();
            this.f33241a = null;
            this.f33245e = 0;
            return;
        }
        Arrays.fill(z(), 0, this.f33245e, (Object) null);
        b3.g(B());
        Arrays.fill(A(), 0, this.f33245e, 0);
        this.f33245e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        if (y()) {
            return false;
        }
        Set<E> n11 = n();
        if (n11 != null) {
            return n11.contains(object);
        }
        int d11 = o5.d(object);
        int s11 = s();
        int h11 = b3.h(B(), d11 & s11);
        if (h11 == 0) {
            return false;
        }
        int b11 = b3.b(d11, s11);
        do {
            int i11 = h11 - 1;
            int p11 = p(i11);
            if (b3.b(p11, s11) == b11 && ho.d0.a(object, o(i11))) {
                return true;
            }
            h11 = b3.c(p11, s11);
        } while (h11 != 0);
        return false;
    }

    public int d(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    @uo.a
    public int f() {
        Preconditions.checkState(y(), "Arrays already allocated");
        int i11 = this.f33244d;
        int j11 = b3.j(i11);
        this.f33241a = b3.a(j11);
        I(j11 - 1);
        this.f33242b = new int[i11];
        this.f33243c = new Object[i11];
        return i11;
    }

    @uo.a
    public Set<E> g() {
        Set<E> l11 = l(s() + 1);
        int q11 = q();
        while (q11 >= 0) {
            l11.add(o(q11));
            q11 = r(q11);
        }
        this.f33241a = l11;
        this.f33242b = null;
        this.f33243c = null;
        t();
        return l11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> n11 = n();
        return n11 != null ? n11.iterator() : new a();
    }

    public final Set<E> l(int tableSize) {
        return new LinkedHashSet(tableSize, 1.0f);
    }

    @CheckForNull
    @go.e
    public Set<E> n() {
        Object obj = this.f33241a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final E o(int i11) {
        return (E) z()[i11];
    }

    public final int p(int i11) {
        return A()[i11];
    }

    public int q() {
        return isEmpty() ? -1 : 0;
    }

    public int r(int entryIndex) {
        int i11 = entryIndex + 1;
        if (i11 < this.f33245e) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @uo.a
    public boolean remove(@CheckForNull Object object) {
        if (y()) {
            return false;
        }
        Set<E> n11 = n();
        if (n11 != null) {
            return n11.remove(object);
        }
        int s11 = s();
        int f11 = b3.f(object, null, s11, B(), A(), z(), null);
        if (f11 == -1) {
            return false;
        }
        x(f11, s11);
        this.f33245e--;
        t();
        return true;
    }

    public final int s() {
        return (1 << (this.f33244d & 31)) - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> n11 = n();
        return n11 != null ? n11.size() : this.f33245e;
    }

    public void t() {
        this.f33244d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (y()) {
            return new Object[0];
        }
        Set<E> n11 = n();
        return n11 != null ? n11.toArray() : Arrays.copyOf(z(), this.f33245e);
    }

    public void u(int expectedSize) {
        Preconditions.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.f33244d = ro.i.h(expectedSize, 1, 1073741823);
    }

    public void v(int entryIndex, @t7 E object, int hash, int mask) {
        H(entryIndex, b3.d(hash, 0, mask));
        G(entryIndex, object);
    }

    @go.e
    public boolean w() {
        return n() != null;
    }

    public void x(int dstIndex, int mask) {
        Object B = B();
        int[] A = A();
        Object[] z11 = z();
        int size = size();
        int i11 = size - 1;
        if (dstIndex >= i11) {
            z11[dstIndex] = null;
            A[dstIndex] = 0;
            return;
        }
        Object obj = z11[i11];
        z11[dstIndex] = obj;
        z11[i11] = null;
        A[dstIndex] = A[i11];
        A[i11] = 0;
        int d11 = o5.d(obj) & mask;
        int h11 = b3.h(B, d11);
        if (h11 == size) {
            b3.i(B, d11, dstIndex + 1);
            return;
        }
        while (true) {
            int i12 = h11 - 1;
            int i13 = A[i12];
            int c11 = b3.c(i13, mask);
            if (c11 == size) {
                A[i12] = b3.d(i13, dstIndex + 1, mask);
                return;
            }
            h11 = c11;
        }
    }

    public boolean y() {
        return this.f33241a == null;
    }

    public final Object[] z() {
        Object[] objArr = this.f33243c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public a3(int expectedSize) {
        u(expectedSize);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @uo.a
    public <T> T[] toArray(T[] tArr) {
        if (y()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> n11 = n();
        if (n11 != null) {
            return (T[]) n11.toArray(tArr);
        }
        return (T[]) p7.n(z(), 0, this.f33245e, tArr);
    }
}
