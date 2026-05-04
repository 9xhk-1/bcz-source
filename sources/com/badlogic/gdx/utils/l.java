package com.badlogic.gdx.utils;

import a3.d0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l<K, V> implements Iterable<b<K, V>> {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f13379n = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int f13380a;

    /* renamed from: b, reason: collision with root package name */
    public K[] f13381b;

    /* renamed from: c, reason: collision with root package name */
    public V[] f13382c;

    /* renamed from: d, reason: collision with root package name */
    public float f13383d;

    /* renamed from: e, reason: collision with root package name */
    public int f13384e;

    /* renamed from: f, reason: collision with root package name */
    public int f13385f;

    /* renamed from: g, reason: collision with root package name */
    public int f13386g;

    /* renamed from: h, reason: collision with root package name */
    public transient a f13387h;

    /* renamed from: i, reason: collision with root package name */
    public transient a f13388i;

    /* renamed from: j, reason: collision with root package name */
    public transient e f13389j;

    /* renamed from: k, reason: collision with root package name */
    public transient e f13390k;

    /* renamed from: l, reason: collision with root package name */
    public transient c f13391l;

    /* renamed from: m, reason: collision with root package name */
    public transient c f13392m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public K f13394a;

        /* renamed from: b, reason: collision with root package name */
        @d0
        public V f13395b;

        public String toString() {
            return this.f13394a + ContainerUtils.KEY_VALUE_DELIMITER + this.f13395b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<K, V, I> implements Iterable<I>, Iterator<I> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13396a;

        /* renamed from: b, reason: collision with root package name */
        public final l<K, V> f13397b;

        /* renamed from: c, reason: collision with root package name */
        public int f13398c;

        /* renamed from: d, reason: collision with root package name */
        public int f13399d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13400e = true;

        public d(l<K, V> lVar) {
            this.f13397b = lVar;
            b();
        }

        public void a() {
            int i11;
            K[] kArr = this.f13397b.f13381b;
            int length = kArr.length;
            do {
                i11 = this.f13398c + 1;
                this.f13398c = i11;
                if (i11 >= length) {
                    this.f13396a = false;
                    return;
                }
            } while (kArr[i11] == null);
            this.f13396a = true;
        }

        public void b() {
            this.f13399d = -1;
            this.f13398c = -1;
            a();
        }

        public void remove() {
            int i11 = this.f13399d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            l<K, V> lVar = this.f13397b;
            K[] kArr = lVar.f13381b;
            V[] vArr = lVar.f13382c;
            int i12 = lVar.f13386g;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                K k11 = kArr[i14];
                if (k11 == null) {
                    break;
                }
                int q11 = this.f13397b.q(k11);
                if (((i14 - q11) & i12) > ((i11 - q11) & i12)) {
                    kArr[i11] = k11;
                    vArr[i11] = vArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            kArr[i11] = null;
            vArr[i11] = null;
            l<K, V> lVar2 = this.f13397b;
            lVar2.f13380a--;
            if (i11 != this.f13399d) {
                this.f13398c--;
            }
            this.f13399d = -1;
        }
    }

    public l() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = m.s(i11, this.f13383d);
        if (this.f13381b.length <= s11) {
            clear();
        } else {
            this.f13380a = 0;
            v(s11);
        }
    }

    public boolean b(K k11) {
        return o(k11) >= 0;
    }

    public void clear() {
        if (this.f13380a == 0) {
            return;
        }
        this.f13380a = 0;
        Arrays.fill(this.f13381b, (Object) null);
        Arrays.fill(this.f13382c, (Object) null);
    }

    public boolean d(@d0 Object obj, boolean z11) {
        V[] vArr = this.f13382c;
        if (obj == null) {
            K[] kArr = this.f13381b;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (kArr[length] != null && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z11) {
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f13380a != this.f13380a) {
            return false;
        }
        K[] kArr = this.f13381b;
        V[] vArr = this.f13382c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                V v11 = vArr[i11];
                if (v11 == null) {
                    if (lVar.l(k11, f13379n) != null) {
                        return false;
                    }
                } else if (!v11.equals(lVar.k(k11))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void f(int i11) {
        int s11 = m.s(this.f13380a + i11, this.f13383d);
        if (this.f13381b.length < s11) {
            v(s11);
        }
    }

    public a<K, V> g() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13387h == null) {
            this.f13387h = new a(this);
            this.f13388i = new a(this);
        }
        a aVar = this.f13387h;
        if (aVar.f13400e) {
            this.f13388i.b();
            a<K, V> aVar2 = this.f13388i;
            aVar2.f13400e = true;
            this.f13387h.f13400e = false;
            return aVar2;
        }
        aVar.b();
        a<K, V> aVar3 = this.f13387h;
        aVar3.f13400e = true;
        this.f13388i.f13400e = false;
        return aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(@d0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f13380a != this.f13380a) {
            return false;
        }
        K[] kArr = this.f13381b;
        V[] vArr = this.f13382c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null && vArr[i11] != lVar.l(k11, f13379n)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i11 = this.f13380a;
        K[] kArr = this.f13381b;
        V[] vArr = this.f13382c;
        int length = kArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            K k11 = kArr[i12];
            if (k11 != null) {
                i11 += k11.hashCode();
                V v11 = vArr[i12];
                if (v11 != null) {
                    i11 += v11.hashCode();
                }
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f13380a == 0;
    }

    @d0
    public K j(@d0 Object obj, boolean z11) {
        V[] vArr = this.f13382c;
        if (obj == null) {
            K[] kArr = this.f13381b;
            for (int length = vArr.length - 1; length >= 0; length--) {
                K k11 = kArr[length];
                if (k11 != null && vArr[length] == null) {
                    return k11;
                }
            }
            return null;
        }
        if (z11) {
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.f13381b[length2];
                }
            }
            return null;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
                return this.f13381b[length3];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d0
    public <T extends K> V k(T t11) {
        int o11 = o(t11);
        if (o11 < 0) {
            return null;
        }
        return this.f13382c[o11];
    }

    public V l(K k11, @d0 V v11) {
        int o11 = o(k11);
        return o11 < 0 ? v11 : this.f13382c[o11];
    }

    @Override // java.lang.Iterable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a<K, V> iterator() {
        return g();
    }

    public c<K> n() {
        if (a3.k.f1553a) {
            return new c<>(this);
        }
        if (this.f13391l == null) {
            this.f13391l = new c(this);
            this.f13392m = new c(this);
        }
        c cVar = this.f13391l;
        if (cVar.f13400e) {
            this.f13392m.b();
            c<K> cVar2 = this.f13392m;
            cVar2.f13400e = true;
            this.f13391l.f13400e = false;
            return cVar2;
        }
        cVar.b();
        c<K> cVar3 = this.f13391l;
        cVar3.f13400e = true;
        this.f13392m.f13400e = false;
        return cVar3;
    }

    public int o(K k11) {
        if (k11 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f13381b;
        int q11 = q(k11);
        while (true) {
            K k12 = kArr[q11];
            if (k12 == null) {
                return -(q11 + 1);
            }
            if (k12.equals(k11)) {
                return q11;
            }
            q11 = (q11 + 1) & this.f13386g;
        }
    }

    public boolean p() {
        return this.f13380a > 0;
    }

    public int q(K k11) {
        return (int) ((k11.hashCode() * (-7046029254386353131L)) >>> this.f13385f);
    }

    @d0
    public V r(K k11, @d0 V v11) {
        int o11 = o(k11);
        if (o11 >= 0) {
            V[] vArr = this.f13382c;
            V v12 = vArr[o11];
            vArr[o11] = v11;
            return v12;
        }
        int i11 = -(o11 + 1);
        K[] kArr = this.f13381b;
        kArr[i11] = k11;
        this.f13382c[i11] = v11;
        int i12 = this.f13380a + 1;
        this.f13380a = i12;
        if (i12 < this.f13384e) {
            return null;
        }
        v(kArr.length << 1);
        return null;
    }

    public void s(l<? extends K, ? extends V> lVar) {
        f(lVar.f13380a);
        K[] kArr = lVar.f13381b;
        V[] vArr = lVar.f13382c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                r(k11, vArr[i11]);
            }
        }
    }

    public final void t(K k11, @d0 V v11) {
        K[] kArr = this.f13381b;
        int q11 = q(k11);
        while (kArr[q11] != null) {
            q11 = (q11 + 1) & this.f13386g;
        }
        kArr[q11] = k11;
        this.f13382c[q11] = v11;
    }

    public String toString() {
        return y(j2.O, true);
    }

    @d0
    public V u(K k11) {
        int o11 = o(k11);
        if (o11 < 0) {
            return null;
        }
        K[] kArr = this.f13381b;
        V[] vArr = this.f13382c;
        V v11 = vArr[o11];
        int i11 = this.f13386g;
        int i12 = o11 + 1;
        while (true) {
            int i13 = i12 & i11;
            K k12 = kArr[i13];
            if (k12 == null) {
                kArr[o11] = null;
                vArr[o11] = null;
                this.f13380a--;
                return v11;
            }
            int q11 = q(k12);
            if (((i13 - q11) & i11) > ((o11 - q11) & i11)) {
                kArr[o11] = k12;
                vArr[o11] = vArr[i13];
                o11 = i13;
            }
            i12 = i13 + 1;
        }
    }

    public final void v(int i11) {
        int length = this.f13381b.length;
        this.f13384e = (int) (i11 * this.f13383d);
        int i12 = i11 - 1;
        this.f13386g = i12;
        this.f13385f = Long.numberOfLeadingZeros(i12);
        K[] kArr = this.f13381b;
        V[] vArr = this.f13382c;
        this.f13381b = (K[]) new Object[i11];
        this.f13382c = (V[]) new Object[i11];
        if (this.f13380a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                K k11 = kArr[i13];
                if (k11 != null) {
                    t(k11, vArr[i13]);
                }
            }
        }
    }

    public void w(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = m.s(i11, this.f13383d);
        if (this.f13381b.length > s11) {
            v(s11);
        }
    }

    public String x(String str) {
        return y(str, false);
    }

    public String y(String str, boolean z11) {
        int i11;
        if (this.f13380a == 0) {
            return z11 ? "{}" : "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        if (z11) {
            sb2.append(l50.b.f69927i);
        }
        Object[] objArr = this.f13381b;
        Object[] objArr2 = this.f13382c;
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
                sb2.append('=');
                Object obj2 = objArr2[i11];
                if (obj2 == this) {
                    obj2 = "(this)";
                }
                sb2.append(obj2);
            }
        }
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            Object obj3 = objArr[i12];
            if (obj3 != null) {
                sb2.append(str);
                if (obj3 == this) {
                    obj3 = "(this)";
                }
                sb2.append(obj3);
                sb2.append('=');
                Object obj4 = objArr2[i12];
                if (obj4 == this) {
                    obj4 = "(this)";
                }
                sb2.append(obj4);
            }
            i11 = i12;
        }
        if (z11) {
            sb2.append(l50.b.f69928j);
        }
        return sb2.toString();
    }

    public e<V> z() {
        if (a3.k.f1553a) {
            return new e<>(this);
        }
        if (this.f13389j == null) {
            this.f13389j = new e(this);
            this.f13390k = new e(this);
        }
        e eVar = this.f13389j;
        if (eVar.f13400e) {
            this.f13390k.b();
            e<V> eVar2 = this.f13390k;
            eVar2.f13400e = true;
            this.f13389j.f13400e = false;
            return eVar2;
        }
        eVar.b();
        e<V> eVar3 = this.f13389j;
        eVar3.f13400e = true;
        this.f13390k.f13400e = false;
        return eVar3;
    }

    public l(int i11) {
        this(i11, 0.8f);
    }

    public l(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13383d = f11;
            int s11 = m.s(i11, f11);
            this.f13384e = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13386g = i12;
            this.f13385f = Long.numberOfLeadingZeros(i12);
            this.f13381b = (K[]) new Object[s11];
            this.f13382c = (V[]) new Object[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(com.badlogic.gdx.utils.l<? extends K, ? extends V> r5) {
        /*
            r4 = this;
            K[] r0 = r5.f13381b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f13383d
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            K[] r0 = r5.f13381b
            K[] r1 = r4.f13381b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            V[] r0 = r5.f13382c
            V[] r1 = r4.f13382c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r5 = r5.f13380a
            r4.f13380a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.l.<init>(com.badlogic.gdx.utils.l):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K, V> extends d<K, V, b<K, V>> {

        /* renamed from: f, reason: collision with root package name */
        public b<K, V> f13393f;

        public a(l<K, V> lVar) {
            super(lVar);
            this.f13393f = new b<>();
        }

        @Override // com.badlogic.gdx.utils.l.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b<K, V> next() {
            if (!this.f13396a) {
                throw new NoSuchElementException();
            }
            if (!this.f13400e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            l<K, V> lVar = this.f13397b;
            K[] kArr = lVar.f13381b;
            b<K, V> bVar = this.f13393f;
            int i11 = this.f13398c;
            bVar.f13394a = kArr[i11];
            bVar.f13395b = lVar.f13382c[i11];
            this.f13399d = i11;
            a();
            return this.f13393f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13400e) {
                return this.f13396a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.l.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a<K, V> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K> extends d<K, Object, K> {
        public c(l<K, ?> lVar) {
            super(lVar);
        }

        @Override // com.badlogic.gdx.utils.l.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13397b.f13380a));
        }

        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            while (this.f13396a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13400e) {
                return this.f13396a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f13396a) {
                throw new NoSuchElementException();
            }
            if (!this.f13400e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f13397b.f13381b;
            int i11 = this.f13398c;
            K k11 = kArr[i11];
            this.f13399d = i11;
            a();
            return k11;
        }

        @Override // com.badlogic.gdx.utils.l.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<K> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<V> extends d<Object, V, V> {
        public e(l<?, V> lVar) {
            super(lVar);
        }

        @Override // com.badlogic.gdx.utils.l.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<V> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13397b.f13380a));
        }

        public com.badlogic.gdx.utils.a<V> g(com.badlogic.gdx.utils.a<V> aVar) {
            while (this.f13396a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13400e) {
                return this.f13396a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        @d0
        public V next() {
            if (!this.f13396a) {
                throw new NoSuchElementException();
            }
            if (!this.f13400e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V[] vArr = this.f13397b.f13382c;
            int i11 = this.f13398c;
            V v11 = vArr[i11];
            this.f13399d = i11;
            a();
            return v11;
        }

        @Override // com.badlogic.gdx.utils.l.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public e<V> iterator() {
            return this;
        }
    }
}
