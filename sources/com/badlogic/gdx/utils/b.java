package com.badlogic.gdx.utils;

import a3.d0;
import a3.y0;
import com.badlogic.gdx.utils.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b<K, V> implements Iterable<l.b<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public K[] f13191a;

    /* renamed from: b, reason: collision with root package name */
    public V[] f13192b;

    /* renamed from: c, reason: collision with root package name */
    public int f13193c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13194d;

    /* renamed from: e, reason: collision with root package name */
    public transient a f13195e;

    /* renamed from: f, reason: collision with root package name */
    public transient a f13196f;

    /* renamed from: g, reason: collision with root package name */
    public transient c f13197g;

    /* renamed from: h, reason: collision with root package name */
    public transient c f13198h;

    /* renamed from: i, reason: collision with root package name */
    public transient C0197b f13199i;

    /* renamed from: j, reason: collision with root package name */
    public transient C0197b f13200j;

    public b() {
        this(true, 16);
    }

    public void A(b<? extends K, ? extends V> bVar, int i11, int i12) {
        if (i11 + i12 <= bVar.f13193c) {
            int i13 = (this.f13193c + i12) - i11;
            if (i13 >= this.f13191a.length) {
                E(Math.max(8, (int) (i13 * 1.75f)));
            }
            System.arraycopy(bVar.f13191a, i11, this.f13191a, this.f13193c, i12);
            System.arraycopy(bVar.f13192b, i11, this.f13192b, this.f13193c, i12);
            this.f13193c += i12;
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + bVar.f13193c);
    }

    public void B(int i11) {
        int i12 = this.f13193c;
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException(String.valueOf(i11));
        }
        K[] kArr = this.f13191a;
        int i13 = i12 - 1;
        this.f13193c = i13;
        if (this.f13194d) {
            int i14 = i11 + 1;
            System.arraycopy(kArr, i14, kArr, i11, i13 - i11);
            V[] vArr = this.f13192b;
            System.arraycopy(vArr, i14, vArr, i11, this.f13193c - i11);
        } else {
            kArr[i11] = kArr[i13];
            V[] vArr2 = this.f13192b;
            vArr2[i11] = vArr2[i13];
        }
        int i15 = this.f13193c;
        kArr[i15] = null;
        this.f13192b[i15] = null;
    }

    @d0
    public V C(K k11) {
        K[] kArr = this.f13191a;
        int i11 = 0;
        if (k11 == null) {
            int i12 = this.f13193c;
            while (i11 < i12) {
                if (kArr[i11] == k11) {
                    V v11 = this.f13192b[i11];
                    B(i11);
                    return v11;
                }
                i11++;
            }
            return null;
        }
        int i13 = this.f13193c;
        while (i11 < i13) {
            if (k11.equals(kArr[i11])) {
                V v12 = this.f13192b[i11];
                B(i11);
                return v12;
            }
            i11++;
        }
        return null;
    }

    public boolean D(V v11, boolean z11) {
        V[] vArr = this.f13192b;
        if (z11 || v11 == null) {
            int i11 = this.f13193c;
            for (int i12 = 0; i12 < i11; i12++) {
                if (vArr[i12] == v11) {
                    B(i12);
                    return true;
                }
            }
        } else {
            int i13 = this.f13193c;
            for (int i14 = 0; i14 < i13; i14++) {
                if (v11.equals(vArr[i14])) {
                    B(i14);
                    return true;
                }
            }
        }
        return false;
    }

    public void E(int i11) {
        K[] kArr = (K[]) ((Object[]) g3.b.c(this.f13191a.getClass().getComponentType(), i11));
        System.arraycopy(this.f13191a, 0, kArr, 0, Math.min(this.f13193c, kArr.length));
        this.f13191a = kArr;
        V[] vArr = (V[]) ((Object[]) g3.b.c(this.f13192b.getClass().getComponentType(), i11));
        System.arraycopy(this.f13192b, 0, vArr, 0, Math.min(this.f13193c, vArr.length));
        this.f13192b = vArr;
    }

    public void F() {
        int i11 = this.f13193c;
        int i12 = i11 - 1;
        int i13 = i11 / 2;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i12 - i14;
            K[] kArr = this.f13191a;
            K k11 = kArr[i14];
            kArr[i14] = kArr[i15];
            kArr[i15] = k11;
            V[] vArr = this.f13192b;
            V v11 = vArr[i14];
            vArr[i14] = vArr[i15];
            vArr[i15] = v11;
        }
    }

    public void G(int i11, K k11) {
        if (i11 >= this.f13193c) {
            throw new IndexOutOfBoundsException(String.valueOf(i11));
        }
        this.f13191a[i11] = k11;
    }

    public void H(int i11, V v11) {
        if (i11 >= this.f13193c) {
            throw new IndexOutOfBoundsException(String.valueOf(i11));
        }
        this.f13192b[i11] = v11;
    }

    public void I() {
        int length = this.f13191a.length;
        int i11 = this.f13193c;
        if (length == i11) {
            return;
        }
        E(i11);
    }

    public void J() {
        for (int i11 = this.f13193c - 1; i11 >= 0; i11--) {
            int M = com.badlogic.gdx.math.n.M(i11);
            K[] kArr = this.f13191a;
            K k11 = kArr[i11];
            kArr[i11] = kArr[M];
            kArr[M] = k11;
            V[] vArr = this.f13192b;
            V v11 = vArr[i11];
            vArr[i11] = vArr[M];
            vArr[M] = v11;
        }
    }

    public void K(int i11) {
        if (this.f13193c <= i11) {
            return;
        }
        for (int i12 = i11; i12 < this.f13193c; i12++) {
            this.f13191a[i12] = null;
            this.f13192b[i12] = null;
        }
        this.f13193c = i11;
    }

    public c<V> L() {
        if (a3.k.f1553a) {
            return new c<>(this);
        }
        if (this.f13197g == null) {
            this.f13197g = new c(this);
            this.f13198h = new c(this);
        }
        c<V> cVar = this.f13197g;
        if (!cVar.f13210c) {
            cVar.f13209b = 0;
            cVar.f13210c = true;
            this.f13198h.f13210c = false;
            return cVar;
        }
        c<V> cVar2 = this.f13198h;
        cVar2.f13209b = 0;
        cVar2.f13210c = true;
        cVar.f13210c = false;
        return cVar2;
    }

    public void a(int i11) {
        if (this.f13191a.length <= i11) {
            clear();
        } else {
            this.f13193c = 0;
            E(i11);
        }
    }

    public boolean b(K k11) {
        K[] kArr = this.f13191a;
        int i11 = this.f13193c - 1;
        if (k11 == null) {
            while (i11 >= 0) {
                int i12 = i11 - 1;
                if (kArr[i11] == k11) {
                    return true;
                }
                i11 = i12;
            }
            return false;
        }
        while (i11 >= 0) {
            int i13 = i11 - 1;
            if (k11.equals(kArr[i11])) {
                return true;
            }
            i11 = i13;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(this.f13191a, 0, this.f13193c, (Object) null);
        Arrays.fill(this.f13192b, 0, this.f13193c, (Object) null);
        this.f13193c = 0;
    }

    public boolean d(V v11, boolean z11) {
        V[] vArr = this.f13192b;
        int i11 = this.f13193c - 1;
        if (z11 || v11 == null) {
            while (i11 >= 0) {
                int i12 = i11 - 1;
                if (vArr[i11] == v11) {
                    return true;
                }
                i11 = i12;
            }
            return false;
        }
        while (i11 >= 0) {
            int i13 = i11 - 1;
            if (v11.equals(vArr[i11])) {
                return true;
            }
            i11 = i13;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i11 = bVar.f13193c;
        int i12 = this.f13193c;
        if (i11 != i12) {
            return false;
        }
        K[] kArr = this.f13191a;
        V[] vArr = this.f13192b;
        for (int i13 = 0; i13 < i12; i13++) {
            K k11 = kArr[i13];
            V v11 = vArr[i13];
            if (v11 == null) {
                if (bVar.m(k11, l.f13379n) != null) {
                    return false;
                }
            } else if (!v11.equals(bVar.l(k11))) {
                return false;
            }
        }
        return true;
    }

    public void f(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i11);
        }
        int i12 = this.f13193c + i11;
        if (i12 > this.f13191a.length) {
            E(Math.max(Math.max(8, i12), (int) (this.f13193c * 1.75f)));
        }
    }

    public a<K, V> g() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13195e == null) {
            this.f13195e = new a(this);
            this.f13196f = new a(this);
        }
        a<K, V> aVar = this.f13195e;
        if (!aVar.f13204d) {
            aVar.f13203c = 0;
            aVar.f13204d = true;
            this.f13196f.f13204d = false;
            return aVar;
        }
        a<K, V> aVar2 = this.f13196f;
        aVar2.f13203c = 0;
        aVar2.f13204d = true;
        aVar.f13204d = false;
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i11 = bVar.f13193c;
        int i12 = this.f13193c;
        if (i11 != i12) {
            return false;
        }
        K[] kArr = this.f13191a;
        V[] vArr = this.f13192b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (vArr[i13] != bVar.m(kArr[i13], l.f13379n)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        K[] kArr = this.f13191a;
        V[] vArr = this.f13192b;
        int i11 = this.f13193c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            K k11 = kArr[i13];
            V v11 = vArr[i13];
            if (k11 != null) {
                i12 += k11.hashCode() * 31;
            }
            if (v11 != null) {
                i12 += v11.hashCode();
            }
        }
        return i12;
    }

    public boolean isEmpty() {
        return this.f13193c == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<l.b<K, V>> iterator() {
        return g();
    }

    public K j() {
        if (this.f13193c != 0) {
            return this.f13191a[0];
        }
        throw new IllegalStateException("Map is empty.");
    }

    public V k() {
        if (this.f13193c != 0) {
            return this.f13192b[0];
        }
        throw new IllegalStateException("Map is empty.");
    }

    @d0
    public V l(K k11) {
        return m(k11, null);
    }

    @d0
    public V m(K k11, @d0 V v11) {
        K[] kArr = this.f13191a;
        int i11 = this.f13193c - 1;
        if (k11 == null) {
            while (i11 >= 0) {
                if (kArr[i11] == k11) {
                    return this.f13192b[i11];
                }
                i11--;
            }
        } else {
            while (i11 >= 0) {
                if (k11.equals(kArr[i11])) {
                    return this.f13192b[i11];
                }
                i11--;
            }
        }
        return v11;
    }

    @d0
    public K n(V v11, boolean z11) {
        V[] vArr = this.f13192b;
        int i11 = this.f13193c - 1;
        if (z11 || v11 == null) {
            while (i11 >= 0) {
                if (vArr[i11] == v11) {
                    return this.f13191a[i11];
                }
                i11--;
            }
            return null;
        }
        while (i11 >= 0) {
            if (v11.equals(vArr[i11])) {
                return this.f13191a[i11];
            }
            i11--;
        }
        return null;
    }

    public K o(int i11) {
        if (i11 < this.f13193c) {
            return this.f13191a[i11];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i11));
    }

    public V p(int i11) {
        if (i11 < this.f13193c) {
            return this.f13192b[i11];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i11));
    }

    public int q(K k11) {
        K[] kArr = this.f13191a;
        int i11 = 0;
        if (k11 == null) {
            int i12 = this.f13193c;
            while (i11 < i12) {
                if (kArr[i11] == k11) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int i13 = this.f13193c;
        while (i11 < i13) {
            if (k11.equals(kArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int r(V v11, boolean z11) {
        V[] vArr = this.f13192b;
        int i11 = 0;
        if (z11 || v11 == null) {
            int i12 = this.f13193c;
            while (i11 < i12) {
                if (vArr[i11] == v11) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int i13 = this.f13193c;
        while (i11 < i13) {
            if (v11.equals(vArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public void s(int i11, K k11, V v11) {
        int i12 = this.f13193c;
        if (i11 > i12) {
            throw new IndexOutOfBoundsException(String.valueOf(i11));
        }
        if (i12 == this.f13191a.length) {
            E(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.f13194d) {
            K[] kArr = this.f13191a;
            int i13 = i11 + 1;
            System.arraycopy(kArr, i11, kArr, i13, this.f13193c - i11);
            V[] vArr = this.f13192b;
            System.arraycopy(vArr, i11, vArr, i13, this.f13193c - i11);
        } else {
            K[] kArr2 = this.f13191a;
            int i14 = this.f13193c;
            kArr2[i14] = kArr2[i11];
            V[] vArr2 = this.f13192b;
            vArr2[i14] = vArr2[i11];
        }
        this.f13193c++;
        this.f13191a[i11] = k11;
        this.f13192b[i11] = v11;
    }

    public C0197b<K> t() {
        if (a3.k.f1553a) {
            return new C0197b<>(this);
        }
        if (this.f13199i == null) {
            this.f13199i = new C0197b(this);
            this.f13200j = new C0197b(this);
        }
        C0197b<K> c0197b = this.f13199i;
        if (!c0197b.f13207c) {
            c0197b.f13206b = 0;
            c0197b.f13207c = true;
            this.f13200j.f13207c = false;
            return c0197b;
        }
        C0197b<K> c0197b2 = this.f13200j;
        c0197b2.f13206b = 0;
        c0197b2.f13207c = true;
        c0197b.f13207c = false;
        return c0197b2;
    }

    public String toString() {
        if (this.f13193c == 0) {
            return "{}";
        }
        K[] kArr = this.f13191a;
        V[] vArr = this.f13192b;
        y0 y0Var = new y0(32);
        y0Var.append(l50.b.f69927i);
        y0Var.N(kArr[0]);
        y0Var.append('=');
        y0Var.N(vArr[0]);
        for (int i11 = 1; i11 < this.f13193c; i11++) {
            y0Var.O(j2.O);
            y0Var.N(kArr[i11]);
            y0Var.append('=');
            y0Var.N(vArr[i11]);
        }
        y0Var.append(l50.b.f69928j);
        return y0Var.toString();
    }

    public boolean u() {
        return this.f13193c > 0;
    }

    public K v() {
        return this.f13191a[this.f13193c - 1];
    }

    public V w() {
        return this.f13192b[this.f13193c - 1];
    }

    public int x(K k11, V v11) {
        int q11 = q(k11);
        if (q11 == -1) {
            int i11 = this.f13193c;
            if (i11 == this.f13191a.length) {
                E(Math.max(8, (int) (i11 * 1.75f)));
            }
            q11 = this.f13193c;
            this.f13193c = q11 + 1;
        }
        this.f13191a[q11] = k11;
        this.f13192b[q11] = v11;
        return q11;
    }

    public int y(K k11, V v11, int i11) {
        int q11 = q(k11);
        if (q11 != -1) {
            B(q11);
        } else {
            int i12 = this.f13193c;
            if (i12 == this.f13191a.length) {
                E(Math.max(8, (int) (i12 * 1.75f)));
            }
        }
        K[] kArr = this.f13191a;
        int i13 = i11 + 1;
        System.arraycopy(kArr, i11, kArr, i13, this.f13193c - i11);
        V[] vArr = this.f13192b;
        System.arraycopy(vArr, i11, vArr, i13, this.f13193c - i11);
        this.f13191a[i11] = k11;
        this.f13192b[i11] = v11;
        this.f13193c++;
        return i11;
    }

    public void z(b<? extends K, ? extends V> bVar) {
        A(bVar, 0, bVar.f13193c);
    }

    public b(int i11) {
        this(true, i11);
    }

    public b(boolean z11, int i11) {
        this.f13194d = z11;
        this.f13191a = (K[]) new Object[i11];
        this.f13192b = (V[]) new Object[i11];
    }

    public b(boolean z11, int i11, Class cls, Class cls2) {
        this.f13194d = z11;
        this.f13191a = (K[]) ((Object[]) g3.b.c(cls, i11));
        this.f13192b = (V[]) ((Object[]) g3.b.c(cls2, i11));
    }

    public b(Class cls, Class cls2) {
        this(false, 16, cls, cls2);
    }

    public b(b bVar) {
        this(bVar.f13194d, bVar.f13193c, bVar.f13191a.getClass().getComponentType(), bVar.f13192b.getClass().getComponentType());
        int i11 = bVar.f13193c;
        this.f13193c = i11;
        System.arraycopy(bVar.f13191a, 0, this.f13191a, 0, i11);
        System.arraycopy(bVar.f13192b, 0, this.f13192b, 0, this.f13193c);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K, V> implements Iterable<l.b<K, V>>, Iterator<l.b<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final b<K, V> f13201a;

        /* renamed from: c, reason: collision with root package name */
        public int f13203c;

        /* renamed from: b, reason: collision with root package name */
        public l.b<K, V> f13202b = new l.b<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f13204d = true;

        public a(b<K, V> bVar) {
            this.f13201a = bVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l.b<K, V> next() {
            int i11 = this.f13203c;
            b<K, V> bVar = this.f13201a;
            if (i11 >= bVar.f13193c) {
                throw new NoSuchElementException(String.valueOf(this.f13203c));
            }
            if (!this.f13204d) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            l.b<K, V> bVar2 = this.f13202b;
            bVar2.f13394a = bVar.f13191a[i11];
            V[] vArr = bVar.f13192b;
            this.f13203c = i11 + 1;
            bVar2.f13395b = vArr[i11];
            return bVar2;
        }

        public void b() {
            this.f13203c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13204d) {
                return this.f13203c < this.f13201a.f13193c;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.f13203c - 1;
            this.f13203c = i11;
            this.f13201a.B(i11);
        }

        @Override // java.lang.Iterable
        public Iterator<l.b<K, V>> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.badlogic.gdx.utils.b$b, reason: collision with other inner class name */
    public static class C0197b<K> implements Iterable<K>, Iterator<K> {

        /* renamed from: a, reason: collision with root package name */
        public final b<K, Object> f13205a;

        /* renamed from: b, reason: collision with root package name */
        public int f13206b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13207c = true;

        public C0197b(b<K, Object> bVar) {
            this.f13205a = bVar;
        }

        public void a() {
            this.f13206b = 0;
        }

        public com.badlogic.gdx.utils.a<K> b() {
            b<K, Object> bVar = this.f13205a;
            K[] kArr = bVar.f13191a;
            int i11 = this.f13206b;
            return new com.badlogic.gdx.utils.a<>(true, kArr, i11, bVar.f13193c - i11);
        }

        public com.badlogic.gdx.utils.a<K> d(com.badlogic.gdx.utils.a aVar) {
            b<K, Object> bVar = this.f13205a;
            K[] kArr = bVar.f13191a;
            int i11 = this.f13206b;
            aVar.k(kArr, i11, bVar.f13193c - i11);
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13207c) {
                return this.f13206b < this.f13205a.f13193c;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            int i11 = this.f13206b;
            b<K, Object> bVar = this.f13205a;
            if (i11 >= bVar.f13193c) {
                throw new NoSuchElementException(String.valueOf(this.f13206b));
            }
            if (!this.f13207c) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = bVar.f13191a;
            this.f13206b = i11 + 1;
            return kArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.f13206b - 1;
            this.f13206b = i11;
            this.f13205a.B(i11);
        }

        @Override // java.lang.Iterable
        public Iterator<K> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<V> implements Iterable<V>, Iterator<V> {

        /* renamed from: a, reason: collision with root package name */
        public final b<Object, V> f13208a;

        /* renamed from: b, reason: collision with root package name */
        public int f13209b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13210c = true;

        public c(b<Object, V> bVar) {
            this.f13208a = bVar;
        }

        public void a() {
            this.f13209b = 0;
        }

        public com.badlogic.gdx.utils.a<V> b() {
            b<Object, V> bVar = this.f13208a;
            V[] vArr = bVar.f13192b;
            int i11 = this.f13209b;
            return new com.badlogic.gdx.utils.a<>(true, vArr, i11, bVar.f13193c - i11);
        }

        public com.badlogic.gdx.utils.a<V> d(com.badlogic.gdx.utils.a aVar) {
            b<Object, V> bVar = this.f13208a;
            V[] vArr = bVar.f13192b;
            int i11 = this.f13209b;
            aVar.k(vArr, i11, bVar.f13193c - i11);
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13210c) {
                return this.f13209b < this.f13208a.f13193c;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public V next() {
            int i11 = this.f13209b;
            b<Object, V> bVar = this.f13208a;
            if (i11 >= bVar.f13193c) {
                throw new NoSuchElementException(String.valueOf(this.f13209b));
            }
            if (!this.f13210c) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V[] vArr = bVar.f13192b;
            this.f13209b = i11 + 1;
            return vArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.f13209b - 1;
            this.f13209b = i11;
            this.f13208a.B(i11);
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }
}
