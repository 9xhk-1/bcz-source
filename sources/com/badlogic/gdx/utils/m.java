package com.badlogic.gdx.utils;

import a3.d0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f13401a;

    /* renamed from: b, reason: collision with root package name */
    public T[] f13402b;

    /* renamed from: c, reason: collision with root package name */
    public float f13403c;

    /* renamed from: d, reason: collision with root package name */
    public int f13404d;

    /* renamed from: e, reason: collision with root package name */
    public int f13405e;

    /* renamed from: f, reason: collision with root package name */
    public int f13406f;

    /* renamed from: g, reason: collision with root package name */
    public transient a f13407g;

    /* renamed from: h, reason: collision with root package name */
    public transient a f13408h;

    public m() {
        this(51, 0.8f);
    }

    public static int s(int i11, float f11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("capacity must be >= 0: " + i11);
        }
        int H = com.badlogic.gdx.math.n.H(Math.max(2, (int) Math.ceil(i11 / f11)));
        if (H <= 1073741824) {
            return H;
        }
        throw new IllegalArgumentException("The required capacity is too large: " + i11);
    }

    public static <T> m<T> u(T... tArr) {
        m<T> mVar = new m<>();
        mVar.f(tArr);
        return mVar;
    }

    public void a(com.badlogic.gdx.utils.a<? extends T> aVar) {
        g(aVar.f13178a, 0, aVar.f13179b);
    }

    public boolean add(T t11) {
        int n11 = n(t11);
        if (n11 >= 0) {
            return false;
        }
        T[] tArr = this.f13402b;
        tArr[-(n11 + 1)] = t11;
        int i11 = this.f13401a + 1;
        this.f13401a = i11;
        if (i11 >= this.f13404d) {
            q(tArr.length << 1);
        }
        return true;
    }

    public void b(com.badlogic.gdx.utils.a<? extends T> aVar, int i11, int i12) {
        if (i11 + i12 <= aVar.f13179b) {
            g(aVar.f13178a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + aVar.f13179b);
    }

    public void clear() {
        if (this.f13401a == 0) {
            return;
        }
        this.f13401a = 0;
        Arrays.fill(this.f13402b, (Object) null);
    }

    public boolean contains(T t11) {
        return n(t11) >= 0;
    }

    public void d(m<T> mVar) {
        k(mVar.f13401a);
        for (T t11 : mVar.f13402b) {
            if (t11 != null) {
                add(t11);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (mVar.f13401a != this.f13401a) {
            return false;
        }
        for (T t11 : this.f13402b) {
            if (t11 != null && !mVar.contains(t11)) {
                return false;
            }
        }
        return true;
    }

    public boolean f(T... tArr) {
        return g(tArr, 0, tArr.length);
    }

    public T first() {
        for (T t11 : this.f13402b) {
            if (t11 != null) {
                return t11;
            }
        }
        throw new IllegalStateException("ObjectSet is empty.");
    }

    public boolean g(T[] tArr, int i11, int i12) {
        k(i12);
        int i13 = this.f13401a;
        int i14 = i12 + i11;
        while (i11 < i14) {
            add(tArr[i11]);
            i11++;
        }
        return i13 != this.f13401a;
    }

    public final void h(T t11) {
        T[] tArr = this.f13402b;
        int p11 = p(t11);
        while (tArr[p11] != null) {
            p11 = (p11 + 1) & this.f13406f;
        }
        tArr[p11] = t11;
    }

    public int hashCode() {
        int i11 = this.f13401a;
        for (T t11 : this.f13402b) {
            if (t11 != null) {
                i11 += t11.hashCode();
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f13401a == 0;
    }

    public void j(int i11) {
        int s11 = s(i11, this.f13403c);
        if (this.f13402b.length <= s11) {
            clear();
        } else {
            this.f13401a = 0;
            q(s11);
        }
    }

    public void k(int i11) {
        int s11 = s(this.f13401a + i11, this.f13403c);
        if (this.f13402b.length < s11) {
            q(s11);
        }
    }

    @d0
    public T l(T t11) {
        int n11 = n(t11);
        if (n11 < 0) {
            return null;
        }
        return this.f13402b[n11];
    }

    @Override // java.lang.Iterable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a<T> iterator() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13407g == null) {
            this.f13407g = new a(this);
            this.f13408h = new a(this);
        }
        a aVar = this.f13407g;
        if (aVar.f13413e) {
            this.f13408h.d();
            a<T> aVar2 = this.f13408h;
            aVar2.f13413e = true;
            this.f13407g.f13413e = false;
            return aVar2;
        }
        aVar.d();
        a<T> aVar3 = this.f13407g;
        aVar3.f13413e = true;
        this.f13408h.f13413e = false;
        return aVar3;
    }

    public int n(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        T[] tArr = this.f13402b;
        int p11 = p(t11);
        while (true) {
            T t12 = tArr[p11];
            if (t12 == null) {
                return -(p11 + 1);
            }
            if (t12.equals(t11)) {
                return p11;
            }
            p11 = (p11 + 1) & this.f13406f;
        }
    }

    public boolean o() {
        return this.f13401a > 0;
    }

    public int p(T t11) {
        return (int) ((t11.hashCode() * (-7046029254386353131L)) >>> this.f13405e);
    }

    public final void q(int i11) {
        int length = this.f13402b.length;
        this.f13404d = (int) (i11 * this.f13403c);
        int i12 = i11 - 1;
        this.f13406f = i12;
        this.f13405e = Long.numberOfLeadingZeros(i12);
        T[] tArr = this.f13402b;
        this.f13402b = (T[]) new Object[i11];
        if (this.f13401a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                T t11 = tArr[i13];
                if (t11 != null) {
                    h(t11);
                }
            }
        }
    }

    public void r(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = s(i11, this.f13403c);
        if (this.f13402b.length > s11) {
            q(s11);
        }
    }

    public boolean remove(T t11) {
        int n11 = n(t11);
        if (n11 < 0) {
            return false;
        }
        T[] tArr = this.f13402b;
        int i11 = this.f13406f;
        int i12 = n11 + 1;
        while (true) {
            int i13 = i12 & i11;
            T t12 = tArr[i13];
            if (t12 == null) {
                tArr[n11] = null;
                this.f13401a--;
                return true;
            }
            int p11 = p(t12);
            if (((i13 - p11) & i11) > ((n11 - p11) & i11)) {
                tArr[n11] = t12;
                n11 = i13;
            }
            i12 = i13 + 1;
        }
    }

    public String t(String str) {
        int i11;
        if (this.f13401a == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        Object[] objArr = this.f13402b;
        int length = objArr.length;
        while (true) {
            i11 = length - 1;
            if (length <= 0) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                length = i11;
            } else {
                if (obj == this) {
                    obj = "(this)";
                }
                sb2.append(obj);
            }
        }
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return sb2.toString();
            }
            Object obj2 = objArr[i12];
            if (obj2 != null) {
                sb2.append(str);
                if (obj2 == this) {
                    obj2 = "(this)";
                }
                sb2.append(obj2);
            }
            i11 = i12;
        }
    }

    public String toString() {
        return l50.b.f69927i + t(j2.O) + l50.b.f69928j;
    }

    public m(int i11) {
        this(i11, 0.8f);
    }

    public m(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13403c = f11;
            int s11 = s(i11, f11);
            this.f13404d = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13406f = i12;
            this.f13405e = Long.numberOfLeadingZeros(i12);
            this.f13402b = (T[]) new Object[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.badlogic.gdx.utils.m<? extends T> r5) {
        /*
            r4 = this;
            T[] r0 = r5.f13402b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f13403c
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            T[] r0 = r5.f13402b
            T[] r1 = r4.f13402b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r5 = r5.f13401a
            r4.f13401a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.m.<init>(com.badlogic.gdx.utils.m):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K> implements Iterable<K>, Iterator<K> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13409a;

        /* renamed from: b, reason: collision with root package name */
        public final m<K> f13410b;

        /* renamed from: c, reason: collision with root package name */
        public int f13411c;

        /* renamed from: d, reason: collision with root package name */
        public int f13412d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13413e = true;

        public a(m<K> mVar) {
            this.f13410b = mVar;
            d();
        }

        public final void a() {
            int i11;
            K[] kArr = this.f13410b.f13402b;
            int length = kArr.length;
            do {
                i11 = this.f13411c + 1;
                this.f13411c = i11;
                if (i11 >= length) {
                    this.f13409a = false;
                    return;
                }
            } while (kArr[i11] == null);
            this.f13409a = true;
        }

        public void d() {
            this.f13412d = -1;
            this.f13411c = -1;
            a();
        }

        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13410b.f13401a));
        }

        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            while (this.f13409a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13413e) {
                return this.f13409a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f13409a) {
                throw new NoSuchElementException();
            }
            if (!this.f13413e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f13410b.f13402b;
            int i11 = this.f13411c;
            K k11 = kArr[i11];
            this.f13412d = i11;
            a();
            return k11;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.f13412d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            m<K> mVar = this.f13410b;
            K[] kArr = mVar.f13402b;
            int i12 = mVar.f13406f;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                K k11 = kArr[i14];
                if (k11 == null) {
                    break;
                }
                int p11 = this.f13410b.p(k11);
                if (((i14 - p11) & i12) > ((i11 - p11) & i12)) {
                    kArr[i11] = k11;
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            kArr[i11] = null;
            m<K> mVar2 = this.f13410b;
            mVar2.f13401a--;
            if (i11 != this.f13412d) {
                this.f13411c--;
            }
            this.f13412d = -1;
        }

        @Override // java.lang.Iterable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
            return this;
        }
    }
}
