package com.badlogic.gdx.utils;

import a3.d0;
import a3.s0;
import a3.v0;
import a3.y0;
import com.badlogic.gdx.utils.p;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    public T[] f13178a;

    /* renamed from: b, reason: collision with root package name */
    public int f13179b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13180c;

    /* renamed from: d, reason: collision with root package name */
    public transient C0196a<T> f13181d;

    /* renamed from: e, reason: collision with root package name */
    public transient p.a<T> f13182e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.badlogic.gdx.utils.a$a, reason: collision with other inner class name */
    public static class C0196a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final a<T> f13183a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13184b;

        /* renamed from: c, reason: collision with root package name */
        public transient b<T> f13185c;

        /* renamed from: d, reason: collision with root package name */
        public transient b<T> f13186d;

        public C0196a(a<T> aVar) {
            this(aVar, true);
        }

        @Override // java.lang.Iterable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<T> iterator() {
            if (a3.k.f1553a) {
                return new b<>(this.f13183a, this.f13184b);
            }
            if (this.f13185c == null) {
                this.f13185c = new b<>(this.f13183a, this.f13184b);
                this.f13186d = new b<>(this.f13183a, this.f13184b);
            }
            b<T> bVar = this.f13185c;
            if (!bVar.f13190d) {
                bVar.f13189c = 0;
                bVar.f13190d = true;
                this.f13186d.f13190d = false;
                return bVar;
            }
            b<T> bVar2 = this.f13186d;
            bVar2.f13189c = 0;
            bVar2.f13190d = true;
            bVar.f13190d = false;
            return bVar2;
        }

        public C0196a(a<T> aVar, boolean z11) {
            this.f13183a = aVar;
            this.f13184b = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Iterator<T>, Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final a<T> f13187a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13188b;

        /* renamed from: c, reason: collision with root package name */
        public int f13189c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13190d;

        public b(a<T> aVar) {
            this(aVar, true);
        }

        public void b() {
            this.f13189c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13190d) {
                return this.f13189c < this.f13187a.f13179b;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public T next() {
            int i11 = this.f13189c;
            a<T> aVar = this.f13187a;
            if (i11 >= aVar.f13179b) {
                throw new NoSuchElementException(String.valueOf(this.f13189c));
            }
            if (!this.f13190d) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            T[] tArr = aVar.f13178a;
            this.f13189c = i11 + 1;
            return tArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f13188b) {
                throw new GdxRuntimeException("Remove not allowed.");
            }
            int i11 = this.f13189c - 1;
            this.f13189c = i11;
            this.f13187a.A(i11);
        }

        public b(a<T> aVar, boolean z11) {
            this.f13190d = true;
            this.f13187a = aVar;
            this.f13188b = z11;
        }

        @Override // java.lang.Iterable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<T> iterator() {
            return this;
        }
    }

    public a() {
        this(true, 16);
    }

    public static <T> a<T> T(T... tArr) {
        return new a<>(tArr);
    }

    public static <T> a<T> w(Class<T> cls) {
        return new a<>(cls);
    }

    public static <T> a<T> x(boolean z11, int i11, Class<T> cls) {
        return new a<>(z11, i11, cls);
    }

    public T A(int i11) {
        int i12 = this.f13179b;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f13179b);
        }
        T[] tArr = this.f13178a;
        T t11 = tArr[i11];
        int i13 = i12 - 1;
        this.f13179b = i13;
        if (this.f13180c) {
            System.arraycopy(tArr, i11 + 1, tArr, i11, i13 - i11);
        } else {
            tArr[i11] = tArr[i13];
        }
        tArr[this.f13179b] = null;
        return t11;
    }

    public void B(int i11, int i12) {
        int i13 = this.f13179b;
        if (i12 >= i13) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i12 + " >= " + this.f13179b);
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i11 + " > " + i12);
        }
        T[] tArr = this.f13178a;
        int i14 = (i12 - i11) + 1;
        int i15 = i13 - i14;
        if (this.f13180c) {
            int i16 = i14 + i11;
            System.arraycopy(tArr, i16, tArr, i11, i13 - i16);
        } else {
            int max = Math.max(i15, i12 + 1);
            System.arraycopy(tArr, max, tArr, i11, i13 - max);
        }
        for (int i17 = i15; i17 < i13; i17++) {
            tArr[i17] = null;
        }
        this.f13179b = i15;
    }

    public boolean C(@d0 T t11, boolean z11) {
        T[] tArr = this.f13178a;
        if (z11 || t11 == null) {
            int i11 = this.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (tArr[i12] == t11) {
                    A(i12);
                    return true;
                }
            }
        } else {
            int i13 = this.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (t11.equals(tArr[i14])) {
                    A(i14);
                    return true;
                }
            }
        }
        return false;
    }

    public int D(@d0 T t11, boolean z11, @d0 T t12) {
        T[] tArr = this.f13178a;
        int i11 = 0;
        if (z11 || t11 == null) {
            int i12 = this.f13179b;
            int i13 = 0;
            while (i11 < i12) {
                if (tArr[i11] == t11) {
                    tArr[i11] = t12;
                    i13++;
                }
                i11++;
            }
            return i13;
        }
        int i14 = this.f13179b;
        int i15 = 0;
        while (i11 < i14) {
            if (t11.equals(tArr[i11])) {
                tArr[i11] = t12;
                i15++;
            }
            i11++;
        }
        return i15;
    }

    public boolean E(@d0 T t11, boolean z11, T t12) {
        T[] tArr = this.f13178a;
        if (z11 || t11 == null) {
            int i11 = this.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (tArr[i12] == t11) {
                    tArr[i12] = t12;
                    return true;
                }
            }
        } else {
            int i13 = this.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (t11.equals(tArr[i14])) {
                    tArr[i14] = t12;
                    return true;
                }
            }
        }
        return false;
    }

    public T[] F(int i11) {
        T[] tArr = this.f13178a;
        T[] tArr2 = (T[]) ((Object[]) g3.b.c(tArr.getClass().getComponentType(), i11));
        System.arraycopy(tArr, 0, tArr2, 0, Math.min(this.f13179b, tArr2.length));
        this.f13178a = tArr2;
        return tArr2;
    }

    public void G() {
        T[] tArr = this.f13178a;
        int i11 = this.f13179b;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            T t11 = tArr[i14];
            tArr[i14] = tArr[i15];
            tArr[i15] = t11;
        }
    }

    public Iterable<T> H(p<T> pVar) {
        if (a3.k.f1553a) {
            return new p.a(this, pVar);
        }
        p.a<T> aVar = this.f13182e;
        if (aVar == null) {
            this.f13182e = new p.a<>(this, pVar);
        } else {
            aVar.a(this, pVar);
        }
        return this.f13182e;
    }

    public T I(Comparator<T> comparator, int i11) {
        if (i11 >= 1) {
            return (T) s0.c().d(this.f13178a, comparator, i11, this.f13179b);
        }
        throw new GdxRuntimeException("nth_lowest must be greater than 0, 1 = first, 2 = second...");
    }

    public int J(Comparator<T> comparator, int i11) {
        if (i11 >= 1) {
            return s0.c().e(this.f13178a, comparator, i11, this.f13179b);
        }
        throw new GdxRuntimeException("nth_lowest must be greater than 0, 1 = first, 2 = second...");
    }

    public void K(int i11, T t11) {
        if (i11 < this.f13179b) {
            this.f13178a[i11] = t11;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f13179b);
    }

    public T[] L(int i11) {
        S(i11);
        if (i11 > this.f13178a.length) {
            F(Math.max(8, i11));
        }
        this.f13179b = i11;
        return this.f13178a;
    }

    public T[] M() {
        int length = this.f13178a.length;
        int i11 = this.f13179b;
        if (length != i11) {
            F(i11);
        }
        return this.f13178a;
    }

    public void N() {
        T[] tArr = this.f13178a;
        for (int i11 = this.f13179b - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            T t11 = tArr[i11];
            tArr[i11] = tArr[M];
            tArr[M] = t11;
        }
    }

    public void O() {
        v0.a().e(this.f13178a, 0, this.f13179b);
    }

    public void P(int i11, int i12) {
        int i13 = this.f13179b;
        if (i11 >= i13) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i11 + " >= " + this.f13179b);
        }
        if (i12 < i13) {
            T[] tArr = this.f13178a;
            T t11 = tArr[i11];
            tArr[i11] = tArr[i12];
            tArr[i12] = t11;
            return;
        }
        throw new IndexOutOfBoundsException("second can't be >= size: " + i12 + " >= " + this.f13179b);
    }

    public <V> V[] Q(Class<V> cls) {
        V[] vArr = (V[]) ((Object[]) g3.b.c(cls, this.f13179b));
        System.arraycopy(this.f13178a, 0, vArr, 0, this.f13179b);
        return vArr;
    }

    public String R(String str) {
        if (this.f13179b == 0) {
            return "";
        }
        T[] tArr = this.f13178a;
        y0 y0Var = new y0(32);
        y0Var.N(tArr[0]);
        for (int i11 = 1; i11 < this.f13179b; i11++) {
            y0Var.O(str);
            y0Var.N(tArr[i11]);
        }
        return y0Var.toString();
    }

    public void S(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("newSize must be >= 0: " + i11);
        }
        if (this.f13179b <= i11) {
            return;
        }
        for (int i12 = i11; i12 < this.f13179b; i12++) {
            this.f13178a[i12] = null;
        }
        this.f13179b = i11;
    }

    public void a(T t11) {
        T[] tArr = this.f13178a;
        int i11 = this.f13179b;
        if (i11 == tArr.length) {
            tArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f13179b;
        this.f13179b = i12 + 1;
        tArr[i12] = t11;
    }

    public void b(T t11, T t12) {
        T[] tArr = this.f13178a;
        int i11 = this.f13179b;
        if (i11 + 1 >= tArr.length) {
            tArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f13179b;
        tArr[i12] = t11;
        tArr[i12 + 1] = t12;
        this.f13179b = i12 + 2;
    }

    public void clear() {
        Arrays.fill(this.f13178a, 0, this.f13179b, (Object) null);
        this.f13179b = 0;
    }

    public void d(T t11, T t12, T t13) {
        T[] tArr = this.f13178a;
        int i11 = this.f13179b;
        if (i11 + 2 >= tArr.length) {
            tArr = F(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.f13179b;
        tArr[i12] = t11;
        tArr[i12 + 1] = t12;
        tArr[i12 + 2] = t13;
        this.f13179b = i12 + 3;
    }

    public boolean equals(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f13180c || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.f13180c || (i11 = this.f13179b) != aVar.f13179b) {
            return false;
        }
        T[] tArr = this.f13178a;
        T[] tArr2 = aVar.f13178a;
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = tArr[i12];
            T t12 = tArr2[i12];
            if (t11 == null) {
                if (t12 != null) {
                    return false;
                }
            } else {
                if (!t11.equals(t12)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void f(T t11, T t12, T t13, T t14) {
        T[] tArr = this.f13178a;
        int i11 = this.f13179b;
        if (i11 + 3 >= tArr.length) {
            tArr = F(Math.max(8, (int) (i11 * 1.8f)));
        }
        int i12 = this.f13179b;
        tArr[i12] = t11;
        tArr[i12 + 1] = t12;
        tArr[i12 + 2] = t13;
        tArr[i12 + 3] = t14;
        this.f13179b = i12 + 4;
    }

    public T first() {
        if (this.f13179b != 0) {
            return this.f13178a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public void g(a<? extends T> aVar) {
        k(aVar.f13178a, 0, aVar.f13179b);
    }

    public T get(int i11) {
        if (i11 < this.f13179b) {
            return this.f13178a[i11];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i11 + " >= " + this.f13179b);
    }

    public void h(a<? extends T> aVar, int i11, int i12) {
        if (i11 + i12 <= aVar.f13179b) {
            k(aVar.f13178a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("start + count must be <= size: " + i11 + " + " + i12 + " <= " + aVar.f13179b);
    }

    public int hashCode() {
        if (!this.f13180c) {
            return super.hashCode();
        }
        T[] tArr = this.f13178a;
        int i11 = this.f13179b;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 *= 31;
            T t11 = tArr[i13];
            if (t11 != null) {
                i12 += t11.hashCode();
            }
        }
        return i12;
    }

    public boolean isEmpty() {
        return this.f13179b == 0;
    }

    public void j(T... tArr) {
        k(tArr, 0, tArr.length);
    }

    public void k(T[] tArr, int i11, int i12) {
        T[] tArr2 = this.f13178a;
        int i13 = this.f13179b + i12;
        if (i13 > tArr2.length) {
            tArr2 = F(Math.max(Math.max(8, i13), (int) (this.f13179b * 1.75f)));
        }
        System.arraycopy(tArr, i11, tArr2, this.f13179b, i12);
        this.f13179b = i13;
    }

    public boolean l(@d0 T t11, boolean z11) {
        T[] tArr = this.f13178a;
        int i11 = this.f13179b - 1;
        if (z11 || t11 == null) {
            while (i11 >= 0) {
                int i12 = i11 - 1;
                if (tArr[i11] == t11) {
                    return true;
                }
                i11 = i12;
            }
            return false;
        }
        while (i11 >= 0) {
            int i13 = i11 - 1;
            if (t11.equals(tArr[i11])) {
                return true;
            }
            i11 = i13;
        }
        return false;
    }

    public boolean m(a<? extends T> aVar, boolean z11) {
        T[] tArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!l(tArr[i12], z11)) {
                return false;
            }
        }
        return true;
    }

    public boolean n(a<? extends T> aVar, boolean z11) {
        T[] tArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (l(tArr[i12], z11)) {
                return true;
            }
        }
        return false;
    }

    public T[] o(int i11) {
        if (i11 >= 0) {
            int i12 = this.f13179b + i11;
            if (i12 > this.f13178a.length) {
                F(Math.max(Math.max(8, i12), (int) (this.f13179b * 1.75f)));
            }
            return this.f13178a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
    }

    public boolean p(Object obj) {
        int i11;
        if (obj == this) {
            return true;
        }
        if (!this.f13180c || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.f13180c || (i11 = this.f13179b) != aVar.f13179b) {
            return false;
        }
        T[] tArr = this.f13178a;
        T[] tArr2 = aVar.f13178a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (tArr[i12] != tArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public T peek() {
        int i11 = this.f13179b;
        if (i11 != 0) {
            return this.f13178a[i11 - 1];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public T pop() {
        int i11 = this.f13179b;
        if (i11 == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        int i12 = i11 - 1;
        this.f13179b = i12;
        T[] tArr = this.f13178a;
        T t11 = tArr[i12];
        tArr[i12] = null;
        return t11;
    }

    public int q(@d0 T t11, boolean z11) {
        T[] tArr = this.f13178a;
        int i11 = 0;
        if (z11 || t11 == null) {
            int i12 = this.f13179b;
            while (i11 < i12) {
                if (tArr[i11] == t11) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int i13 = this.f13179b;
        while (i11 < i13) {
            if (t11.equals(tArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public void r(int i11, T t11) {
        int i12 = this.f13179b;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f13179b);
        }
        T[] tArr = this.f13178a;
        if (i12 == tArr.length) {
            tArr = F(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f13180c) {
            System.arraycopy(tArr, i11, tArr, i11 + 1, this.f13179b - i11);
        } else {
            tArr[this.f13179b] = tArr[i11];
        }
        this.f13179b++;
        tArr[i11] = t11;
    }

    public void s(int i11, int i12) {
        int i13 = this.f13179b;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i11 + " > " + this.f13179b);
        }
        int i14 = i13 + i12;
        if (i14 > this.f13178a.length) {
            this.f13178a = F(Math.max(Math.max(8, i14), (int) (this.f13179b * 1.75f)));
        }
        T[] tArr = this.f13178a;
        System.arraycopy(tArr, i11, tArr, i12 + i11, this.f13179b - i11);
        this.f13179b = i14;
    }

    public void sort(Comparator<? super T> comparator) {
        v0.a().g(this.f13178a, comparator, 0, this.f13179b);
    }

    @Override // java.lang.Iterable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b<T> iterator() {
        if (a3.k.f1553a) {
            return new b<>(this, true);
        }
        if (this.f13181d == null) {
            this.f13181d = new C0196a<>(this);
        }
        return this.f13181d.iterator();
    }

    public T[] toArray() {
        return (T[]) Q(this.f13178a.getClass().getComponentType());
    }

    public String toString() {
        if (this.f13179b == 0) {
            return okhttp3.i.f77289p;
        }
        T[] tArr = this.f13178a;
        y0 y0Var = new y0(32);
        y0Var.append('[');
        y0Var.N(tArr[0]);
        for (int i11 = 1; i11 < this.f13179b; i11++) {
            y0Var.O(j2.O);
            y0Var.N(tArr[i11]);
        }
        y0Var.append(l50.b.f69930l);
        return y0Var.toString();
    }

    public int u(@d0 T t11, boolean z11) {
        T[] tArr = this.f13178a;
        if (z11 || t11 == null) {
            for (int i11 = this.f13179b - 1; i11 >= 0; i11--) {
                if (tArr[i11] == t11) {
                    return i11;
                }
            }
            return -1;
        }
        for (int i12 = this.f13179b - 1; i12 >= 0; i12--) {
            if (t11.equals(tArr[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public boolean v() {
        return this.f13179b > 0;
    }

    @d0
    public T y() {
        int i11 = this.f13179b;
        if (i11 == 0) {
            return null;
        }
        return this.f13178a[com.badlogic.gdx.math.n.N(0, i11 - 1)];
    }

    public boolean z(a<? extends T> aVar, boolean z11) {
        int i11;
        int i12 = this.f13179b;
        T[] tArr = this.f13178a;
        if (z11) {
            int i13 = aVar.f13179b;
            i11 = i12;
            for (int i14 = 0; i14 < i13; i14++) {
                T t11 = aVar.get(i14);
                int i15 = 0;
                while (true) {
                    if (i15 >= i11) {
                        break;
                    }
                    if (t11 == tArr[i15]) {
                        A(i15);
                        i11--;
                        break;
                    }
                    i15++;
                }
            }
        } else {
            int i16 = aVar.f13179b;
            i11 = i12;
            for (int i17 = 0; i17 < i16; i17++) {
                T t12 = aVar.get(i17);
                int i18 = 0;
                while (true) {
                    if (i18 >= i11) {
                        break;
                    }
                    if (t12.equals(tArr[i18])) {
                        A(i18);
                        i11--;
                        break;
                    }
                    i18++;
                }
            }
        }
        return i11 != i12;
    }

    public a(int i11) {
        this(true, i11);
    }

    public a(boolean z11, int i11) {
        this.f13180c = z11;
        this.f13178a = (T[]) new Object[i11];
    }

    public a(boolean z11, int i11, Class cls) {
        this.f13180c = z11;
        this.f13178a = (T[]) ((Object[]) g3.b.c(cls, i11));
    }

    public a(Class cls) {
        this(true, 16, cls);
    }

    public a(a<? extends T> aVar) {
        this(aVar.f13180c, aVar.f13179b, aVar.f13178a.getClass().getComponentType());
        int i11 = aVar.f13179b;
        this.f13179b = i11;
        System.arraycopy(aVar.f13178a, 0, this.f13178a, 0, i11);
    }

    public a(T[] tArr) {
        this(true, tArr, 0, tArr.length);
    }

    public a(boolean z11, T[] tArr, int i11, int i12) {
        this(z11, i12, tArr.getClass().getComponentType());
        this.f13179b = i12;
        System.arraycopy(tArr, i11, this.f13178a, 0, i12);
    }
}
