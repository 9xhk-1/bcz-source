package a3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n0<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    public T[] f1596a;

    /* renamed from: b, reason: collision with root package name */
    public int f1597b;

    /* renamed from: c, reason: collision with root package name */
    public int f1598c;

    /* renamed from: d, reason: collision with root package name */
    public int f1599d;

    /* renamed from: e, reason: collision with root package name */
    public transient a f1600e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final n0<T> f1601a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1602b;

        /* renamed from: c, reason: collision with root package name */
        public b f1603c;

        /* renamed from: d, reason: collision with root package name */
        public b f1604d;

        public a(n0<T> n0Var) {
            this(n0Var, true);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (k.f1553a) {
                return new b(this.f1601a, this.f1602b);
            }
            if (this.f1603c == null) {
                this.f1603c = new b(this.f1601a, this.f1602b);
                this.f1604d = new b(this.f1601a, this.f1602b);
            }
            b bVar = this.f1603c;
            if (!bVar.f1608d) {
                bVar.f1607c = 0;
                bVar.f1608d = true;
                this.f1604d.f1608d = false;
                return bVar;
            }
            b bVar2 = this.f1604d;
            bVar2.f1607c = 0;
            bVar2.f1608d = true;
            bVar.f1608d = false;
            return bVar2;
        }

        public a(n0<T> n0Var, boolean z11) {
            this.f1601a = n0Var;
            this.f1602b = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Iterator<T>, Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final n0<T> f1605a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1606b;

        /* renamed from: c, reason: collision with root package name */
        public int f1607c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1608d;

        public b(n0<T> n0Var) {
            this(n0Var, true);
        }

        public void a() {
            this.f1607c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1608d) {
                return this.f1607c < this.f1605a.f1599d;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public T next() {
            int i11 = this.f1607c;
            n0<T> n0Var = this.f1605a;
            if (i11 >= n0Var.f1599d) {
                throw new NoSuchElementException(String.valueOf(this.f1607c));
            }
            if (!this.f1608d) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            this.f1607c = i11 + 1;
            return n0Var.get(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1606b) {
                throw new GdxRuntimeException("Remove not allowed.");
            }
            int i11 = this.f1607c - 1;
            this.f1607c = i11;
            this.f1605a.g(i11);
        }

        public b(n0<T> n0Var, boolean z11) {
            this.f1608d = true;
            this.f1605a = n0Var;
            this.f1606b = z11;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }
    }

    public n0() {
        this(16);
    }

    public void a(int i11) {
        int i12 = this.f1599d + i11;
        if (this.f1596a.length < i12) {
            j(i12);
        }
    }

    public void addFirst(@d0 T t11) {
        T[] tArr = this.f1596a;
        if (this.f1599d == tArr.length) {
            j(tArr.length << 1);
            tArr = this.f1596a;
        }
        int i11 = this.f1597b - 1;
        if (i11 == -1) {
            i11 = tArr.length - 1;
        }
        tArr[i11] = t11;
        this.f1597b = i11;
        this.f1599d++;
    }

    public void addLast(@d0 T t11) {
        T[] tArr = this.f1596a;
        if (this.f1599d == tArr.length) {
            j(tArr.length << 1);
            tArr = this.f1596a;
        }
        int i11 = this.f1598c;
        int i12 = i11 + 1;
        this.f1598c = i12;
        tArr[i11] = t11;
        if (i12 == tArr.length) {
            this.f1598c = 0;
        }
        this.f1599d++;
    }

    public boolean b(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i11 = this.f1599d;
        if (n0Var.f1599d != i11) {
            return false;
        }
        T[] tArr = this.f1596a;
        int length = tArr.length;
        T[] tArr2 = n0Var.f1596a;
        int length2 = tArr2.length;
        int i12 = this.f1597b;
        int i13 = n0Var.f1597b;
        for (int i14 = 0; i14 < i11; i14++) {
            if (tArr[i12] != tArr2[i13]) {
                return false;
            }
            i12++;
            i13++;
            if (i12 == length) {
                i12 = 0;
            }
            if (i13 == length2) {
                i13 = 0;
            }
        }
        return true;
    }

    public void clear() {
        if (this.f1599d == 0) {
            return;
        }
        T[] tArr = this.f1596a;
        int i11 = this.f1597b;
        int i12 = this.f1598c;
        if (i11 < i12) {
            while (i11 < i12) {
                tArr[i11] = null;
                i11++;
            }
        } else {
            while (i11 < tArr.length) {
                tArr[i11] = null;
                i11++;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                tArr[i13] = null;
            }
        }
        this.f1597b = 0;
        this.f1598c = 0;
        this.f1599d = 0;
    }

    public int d(T t11, boolean z11) {
        int length;
        if (this.f1599d == 0) {
            return -1;
        }
        T[] tArr = this.f1596a;
        int i11 = this.f1597b;
        int i12 = this.f1598c;
        int i13 = 0;
        if (z11 || t11 == null) {
            if (i11 < i12) {
                for (int i14 = i11; i14 < i12; i14++) {
                    if (tArr[i14] == t11) {
                        return i14 - i11;
                    }
                }
            } else {
                int length2 = tArr.length;
                for (int i15 = i11; i15 < length2; i15++) {
                    if (tArr[i15] == t11) {
                        return i15 - i11;
                    }
                }
                while (i13 < i12) {
                    if (tArr[i13] == t11) {
                        length = tArr.length;
                        return (i13 + length) - i11;
                    }
                    i13++;
                }
            }
            return -1;
        }
        if (i11 < i12) {
            for (int i16 = i11; i16 < i12; i16++) {
                if (t11.equals(tArr[i16])) {
                    return i16 - i11;
                }
            }
        } else {
            int length3 = tArr.length;
            for (int i17 = i11; i17 < length3; i17++) {
                if (t11.equals(tArr[i17])) {
                    return i17 - i11;
                }
            }
            while (i13 < i12) {
                if (t11.equals(tArr[i13])) {
                    length = tArr.length;
                    return (i13 + length) - i11;
                }
                i13++;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r11 != r12) goto L4
            return r0
        L4:
            r1 = 0
            if (r12 == 0) goto L40
            boolean r2 = r12 instanceof a3.n0
            if (r2 != 0) goto Lc
            goto L40
        Lc:
            a3.n0 r12 = (a3.n0) r12
            int r2 = r11.f1599d
            int r3 = r12.f1599d
            if (r3 == r2) goto L15
            return r1
        L15:
            T[] r3 = r11.f1596a
            int r4 = r3.length
            T[] r5 = r12.f1596a
            int r6 = r5.length
            int r7 = r11.f1597b
            int r12 = r12.f1597b
            r8 = r1
        L20:
            if (r8 >= r2) goto L3f
            r9 = r3[r7]
            r10 = r5[r12]
            if (r9 != 0) goto L2b
            if (r10 != 0) goto L31
            goto L32
        L2b:
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L32
        L31:
            return r1
        L32:
            int r7 = r7 + 1
            int r12 = r12 + 1
            if (r7 != r4) goto L39
            r7 = r1
        L39:
            if (r12 != r6) goto L3c
            r12 = r1
        L3c:
            int r8 = r8 + 1
            goto L20
        L3f:
            return r0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.n0.equals(java.lang.Object):boolean");
    }

    public boolean f() {
        return this.f1599d > 0;
    }

    public T first() {
        if (this.f1599d != 0) {
            return this.f1596a[this.f1597b];
        }
        throw new NoSuchElementException("Queue is empty.");
    }

    public T g(int i11) {
        T t11;
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i11);
        }
        if (i11 >= this.f1599d) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1599d);
        }
        T[] tArr = this.f1596a;
        int i12 = this.f1597b;
        int i13 = this.f1598c;
        int i14 = i11 + i12;
        if (i12 < i13) {
            t11 = tArr[i14];
            System.arraycopy(tArr, i14 + 1, tArr, i14, i13 - i14);
            tArr[i13] = null;
            this.f1598c--;
        } else if (i14 >= tArr.length) {
            int length = i14 - tArr.length;
            t11 = tArr[length];
            System.arraycopy(tArr, length + 1, tArr, length, i13 - length);
            this.f1598c--;
        } else {
            T t12 = tArr[i14];
            System.arraycopy(tArr, i12, tArr, i12 + 1, i14 - i12);
            tArr[i12] = null;
            int i15 = this.f1597b + 1;
            this.f1597b = i15;
            if (i15 == tArr.length) {
                this.f1597b = 0;
            }
            t11 = t12;
        }
        this.f1599d--;
        return t11;
    }

    public T get(int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i11);
        }
        if (i11 < this.f1599d) {
            T[] tArr = this.f1596a;
            int i12 = this.f1597b + i11;
            if (i12 >= tArr.length) {
                i12 -= tArr.length;
            }
            return tArr[i12];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f1599d);
    }

    public boolean h(T t11, boolean z11) {
        int d11 = d(t11, z11);
        if (d11 == -1) {
            return false;
        }
        g(d11);
        return true;
    }

    public int hashCode() {
        int i11 = this.f1599d;
        T[] tArr = this.f1596a;
        int length = tArr.length;
        int i12 = this.f1597b;
        int i13 = i11 + 1;
        for (int i14 = 0; i14 < i11; i14++) {
            T t11 = tArr[i12];
            i13 *= 31;
            if (t11 != null) {
                i13 += t11.hashCode();
            }
            i12++;
            if (i12 == length) {
                i12 = 0;
            }
        }
        return i13;
    }

    public boolean isEmpty() {
        return this.f1599d == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        if (k.f1553a) {
            return new b(this, true);
        }
        if (this.f1600e == null) {
            this.f1600e = new a(this);
        }
        return this.f1600e.iterator();
    }

    public void j(int i11) {
        T[] tArr = this.f1596a;
        int i12 = this.f1597b;
        int i13 = this.f1598c;
        T[] tArr2 = (T[]) ((Object[]) g3.b.c(tArr.getClass().getComponentType(), i11));
        if (i12 < i13) {
            System.arraycopy(tArr, i12, tArr2, 0, i13 - i12);
        } else if (this.f1599d > 0) {
            int length = tArr.length - i12;
            System.arraycopy(tArr, i12, tArr2, 0, length);
            System.arraycopy(tArr, 0, tArr2, length, i13);
        }
        this.f1596a = tArr2;
        this.f1597b = 0;
        this.f1598c = this.f1599d;
    }

    public String k(String str) {
        if (this.f1599d == 0) {
            return "";
        }
        T[] tArr = this.f1596a;
        int i11 = this.f1597b;
        int i12 = this.f1598c;
        y0 y0Var = new y0(64);
        y0Var.N(tArr[i11]);
        while (true) {
            i11 = (i11 + 1) % tArr.length;
            if (i11 == i12) {
                return y0Var.toString();
            }
            y0Var.O(str).N(tArr[i11]);
        }
    }

    public T last() {
        if (this.f1599d == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T[] tArr = this.f1596a;
        int i11 = this.f1598c - 1;
        if (i11 == -1) {
            i11 = tArr.length - 1;
        }
        return tArr[i11];
    }

    public T removeFirst() {
        int i11 = this.f1599d;
        if (i11 == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T[] tArr = this.f1596a;
        int i12 = this.f1597b;
        T t11 = tArr[i12];
        tArr[i12] = null;
        int i13 = i12 + 1;
        this.f1597b = i13;
        if (i13 == tArr.length) {
            this.f1597b = 0;
        }
        this.f1599d = i11 - 1;
        return t11;
    }

    public T removeLast() {
        int i11 = this.f1599d;
        if (i11 == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        T[] tArr = this.f1596a;
        int i12 = this.f1598c - 1;
        if (i12 == -1) {
            i12 = tArr.length - 1;
        }
        T t11 = tArr[i12];
        tArr[i12] = null;
        this.f1598c = i12;
        this.f1599d = i11 - 1;
        return t11;
    }

    public String toString() {
        if (this.f1599d == 0) {
            return okhttp3.i.f77289p;
        }
        T[] tArr = this.f1596a;
        int i11 = this.f1597b;
        int i12 = this.f1598c;
        y0 y0Var = new y0(64);
        y0Var.append('[');
        y0Var.N(tArr[i11]);
        while (true) {
            i11 = (i11 + 1) % tArr.length;
            if (i11 == i12) {
                y0Var.append(l50.b.f69930l);
                return y0Var.toString();
            }
            y0Var.O(j2.O).N(tArr[i11]);
        }
    }

    public n0(int i11) {
        this.f1597b = 0;
        this.f1598c = 0;
        this.f1599d = 0;
        this.f1596a = (T[]) new Object[i11];
    }

    public n0(int i11, Class<T> cls) {
        this.f1597b = 0;
        this.f1598c = 0;
        this.f1599d = 0;
        this.f1596a = (T[]) ((Object[]) g3.b.c(cls, i11));
    }
}
