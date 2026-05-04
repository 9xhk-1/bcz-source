package com.badlogic.gdx.utils;

import a3.d0;
import a3.v;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k<K> implements Iterable<b<K>> {

    /* renamed from: a, reason: collision with root package name */
    public int f13358a;

    /* renamed from: b, reason: collision with root package name */
    public K[] f13359b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f13360c;

    /* renamed from: d, reason: collision with root package name */
    public float f13361d;

    /* renamed from: e, reason: collision with root package name */
    public int f13362e;

    /* renamed from: f, reason: collision with root package name */
    public int f13363f;

    /* renamed from: g, reason: collision with root package name */
    public int f13364g;

    /* renamed from: h, reason: collision with root package name */
    public transient a f13365h;

    /* renamed from: i, reason: collision with root package name */
    public transient a f13366i;

    /* renamed from: j, reason: collision with root package name */
    public transient e f13367j;

    /* renamed from: k, reason: collision with root package name */
    public transient e f13368k;

    /* renamed from: l, reason: collision with root package name */
    public transient c f13369l;

    /* renamed from: m, reason: collision with root package name */
    public transient c f13370m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K> {

        /* renamed from: a, reason: collision with root package name */
        public K f13372a;

        /* renamed from: b, reason: collision with root package name */
        public int f13373b;

        public String toString() {
            return this.f13372a + ContainerUtils.KEY_VALUE_DELIMITER + this.f13373b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13374a;

        /* renamed from: b, reason: collision with root package name */
        public final k<K> f13375b;

        /* renamed from: c, reason: collision with root package name */
        public int f13376c;

        /* renamed from: d, reason: collision with root package name */
        public int f13377d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13378e = true;

        public d(k<K> kVar) {
            this.f13375b = kVar;
            b();
        }

        public void a() {
            int i11;
            K[] kArr = this.f13375b.f13359b;
            int length = kArr.length;
            do {
                i11 = this.f13376c + 1;
                this.f13376c = i11;
                if (i11 >= length) {
                    this.f13374a = false;
                    return;
                }
            } while (kArr[i11] == null);
            this.f13374a = true;
        }

        public void b() {
            this.f13377d = -1;
            this.f13376c = -1;
            a();
        }

        public void remove() {
            int i11 = this.f13377d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            k<K> kVar = this.f13375b;
            K[] kArr = kVar.f13359b;
            int[] iArr = kVar.f13360c;
            int i12 = kVar.f13364g;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                K k11 = kArr[i14];
                if (k11 == null) {
                    break;
                }
                int p11 = this.f13375b.p(k11);
                if (((i14 - p11) & i12) > ((i11 - p11) & i12)) {
                    kArr[i11] = k11;
                    iArr[i11] = iArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            kArr[i11] = null;
            k<K> kVar2 = this.f13375b;
            kVar2.f13358a--;
            if (i11 != this.f13377d) {
                this.f13376c--;
            }
            this.f13377d = -1;
        }
    }

    public k() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = m.s(i11, this.f13361d);
        if (this.f13359b.length <= s11) {
            clear();
        } else {
            this.f13358a = 0;
            u(s11);
        }
    }

    public boolean b(K k11) {
        return n(k11) >= 0;
    }

    public void clear() {
        if (this.f13358a == 0) {
            return;
        }
        this.f13358a = 0;
        Arrays.fill(this.f13359b, (Object) null);
    }

    public boolean d(int i11) {
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && iArr[length] == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        int j11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f13358a != this.f13358a) {
            return false;
        }
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null && (((j11 = kVar.j(k11, 0)) == 0 && !kVar.b(k11)) || j11 != iArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public void f(int i11) {
        int s11 = m.s(this.f13358a + i11, this.f13361d);
        if (this.f13359b.length < s11) {
            u(s11);
        }
    }

    public a<K> g() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13365h == null) {
            this.f13365h = new a(this);
            this.f13366i = new a(this);
        }
        a aVar = this.f13365h;
        if (aVar.f13378e) {
            this.f13366i.b();
            a<K> aVar2 = this.f13366i;
            aVar2.f13378e = true;
            this.f13365h.f13378e = false;
            return aVar2;
        }
        aVar.b();
        a<K> aVar3 = this.f13365h;
        aVar3.f13378e = true;
        this.f13366i.f13378e = false;
        return aVar3;
    }

    @d0
    public K h(int i11) {
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        for (int length = iArr.length - 1; length >= 0; length--) {
            K k11 = kArr[length];
            if (k11 != null && iArr[length] == i11) {
                return k11;
            }
        }
        return null;
    }

    public int hashCode() {
        int i11 = this.f13358a;
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        int length = kArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            K k11 = kArr[i12];
            if (k11 != null) {
                i11 += k11.hashCode() + iArr[i12];
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f13358a == 0;
    }

    public int j(K k11, int i11) {
        int n11 = n(k11);
        return n11 < 0 ? i11 : this.f13360c[n11];
    }

    public int k(K k11, int i11, int i12) {
        int n11 = n(k11);
        if (n11 >= 0) {
            int[] iArr = this.f13360c;
            int i13 = iArr[n11];
            iArr[n11] = i12 + i13;
            return i13;
        }
        int i14 = -(n11 + 1);
        K[] kArr = this.f13359b;
        kArr[i14] = k11;
        this.f13360c[i14] = i12 + i11;
        int i15 = this.f13358a + 1;
        this.f13358a = i15;
        if (i15 >= this.f13362e) {
            u(kArr.length << 1);
        }
        return i11;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return g();
    }

    public c<K> m() {
        if (a3.k.f1553a) {
            return new c<>(this);
        }
        if (this.f13369l == null) {
            this.f13369l = new c(this);
            this.f13370m = new c(this);
        }
        c cVar = this.f13369l;
        if (cVar.f13378e) {
            this.f13370m.b();
            c<K> cVar2 = this.f13370m;
            cVar2.f13378e = true;
            this.f13369l.f13378e = false;
            return cVar2;
        }
        cVar.b();
        c<K> cVar3 = this.f13369l;
        cVar3.f13378e = true;
        this.f13370m.f13378e = false;
        return cVar3;
    }

    public int n(K k11) {
        if (k11 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f13359b;
        int p11 = p(k11);
        while (true) {
            K k12 = kArr[p11];
            if (k12 == null) {
                return -(p11 + 1);
            }
            if (k12.equals(k11)) {
                return p11;
            }
            p11 = (p11 + 1) & this.f13364g;
        }
    }

    public boolean o() {
        return this.f13358a > 0;
    }

    public int p(K k11) {
        return (int) ((k11.hashCode() * (-7046029254386353131L)) >>> this.f13363f);
    }

    public int q(K k11, int i11, int i12) {
        int n11 = n(k11);
        if (n11 >= 0) {
            int[] iArr = this.f13360c;
            int i13 = iArr[n11];
            iArr[n11] = i11;
            return i13;
        }
        int i14 = -(n11 + 1);
        K[] kArr = this.f13359b;
        kArr[i14] = k11;
        this.f13360c[i14] = i11;
        int i15 = this.f13358a + 1;
        this.f13358a = i15;
        if (i15 >= this.f13362e) {
            u(kArr.length << 1);
        }
        return i12;
    }

    public void r(K k11, int i11) {
        int n11 = n(k11);
        if (n11 >= 0) {
            this.f13360c[n11] = i11;
            return;
        }
        int i12 = -(n11 + 1);
        K[] kArr = this.f13359b;
        kArr[i12] = k11;
        this.f13360c[i12] = i11;
        int i13 = this.f13358a + 1;
        this.f13358a = i13;
        if (i13 >= this.f13362e) {
            u(kArr.length << 1);
        }
    }

    public int remove(K k11, int i11) {
        int n11 = n(k11);
        if (n11 < 0) {
            return i11;
        }
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        int i12 = iArr[n11];
        int i13 = this.f13364g;
        int i14 = n11 + 1;
        while (true) {
            int i15 = i14 & i13;
            K k12 = kArr[i15];
            if (k12 == null) {
                kArr[n11] = null;
                this.f13358a--;
                return i12;
            }
            int p11 = p(k12);
            if (((i15 - p11) & i13) > ((n11 - p11) & i13)) {
                kArr[n11] = k12;
                iArr[n11] = iArr[i15];
                n11 = i15;
            }
            i14 = i15 + 1;
        }
    }

    public void s(k<? extends K> kVar) {
        f(kVar.f13358a);
        K[] kArr = kVar.f13359b;
        int[] iArr = kVar.f13360c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                r(k11, iArr[i11]);
            }
        }
    }

    public final void t(K k11, int i11) {
        K[] kArr = this.f13359b;
        int p11 = p(k11);
        while (kArr[p11] != null) {
            p11 = (p11 + 1) & this.f13364g;
        }
        kArr[p11] = k11;
        this.f13360c[p11] = i11;
    }

    public String toString() {
        return x(j2.O, true);
    }

    public final void u(int i11) {
        int length = this.f13359b.length;
        this.f13362e = (int) (i11 * this.f13361d);
        int i12 = i11 - 1;
        this.f13364g = i12;
        this.f13363f = Long.numberOfLeadingZeros(i12);
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        this.f13359b = (K[]) new Object[i11];
        this.f13360c = new int[i11];
        if (this.f13358a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                K k11 = kArr[i13];
                if (k11 != null) {
                    t(k11, iArr[i13]);
                }
            }
        }
    }

    public void v(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = m.s(i11, this.f13361d);
        if (this.f13359b.length > s11) {
            u(s11);
        }
    }

    public String w(String str) {
        return x(str, false);
    }

    public final String x(String str, boolean z11) {
        int i11;
        if (this.f13358a == 0) {
            return z11 ? "{}" : "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        if (z11) {
            sb2.append(l50.b.f69927i);
        }
        K[] kArr = this.f13359b;
        int[] iArr = this.f13360c;
        int length = kArr.length;
        while (true) {
            i11 = length - 1;
            if (length > 0) {
                K k11 = kArr[i11];
                if (k11 != null) {
                    sb2.append(k11);
                    sb2.append('=');
                    sb2.append(iArr[i11]);
                    break;
                }
                length = i11;
            } else {
                break;
            }
        }
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            K k12 = kArr[i12];
            if (k12 != null) {
                sb2.append(str);
                sb2.append(k12);
                sb2.append('=');
                sb2.append(iArr[i12]);
            }
            i11 = i12;
        }
        if (z11) {
            sb2.append(l50.b.f69928j);
        }
        return sb2.toString();
    }

    public e y() {
        if (a3.k.f1553a) {
            return new e(this);
        }
        if (this.f13367j == null) {
            this.f13367j = new e(this);
            this.f13368k = new e(this);
        }
        e eVar = this.f13367j;
        if (eVar.f13378e) {
            this.f13368k.b();
            e eVar2 = this.f13368k;
            eVar2.f13378e = true;
            this.f13367j.f13378e = false;
            return eVar2;
        }
        eVar.b();
        e eVar3 = this.f13367j;
        eVar3.f13378e = true;
        this.f13368k.f13378e = false;
        return eVar3;
    }

    public k(int i11) {
        this(i11, 0.8f);
    }

    public k(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13361d = f11;
            int s11 = m.s(i11, f11);
            this.f13362e = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13364g = i12;
            this.f13363f = Long.numberOfLeadingZeros(i12);
            this.f13359b = (K[]) new Object[s11];
            this.f13360c = new int[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(com.badlogic.gdx.utils.k<? extends K> r5) {
        /*
            r4 = this;
            K[] r0 = r5.f13359b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f13361d
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            K[] r0 = r5.f13359b
            K[] r1 = r4.f13359b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int[] r0 = r5.f13360c
            int[] r1 = r4.f13360c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r5 = r5.f13358a
            r4.f13358a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.k.<init>(com.badlogic.gdx.utils.k):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K> extends d<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* renamed from: f, reason: collision with root package name */
        public b<K> f13371f;

        public a(k<K> kVar) {
            super(kVar);
            this.f13371f = new b<>();
        }

        @Override // com.badlogic.gdx.utils.k.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b<K> next() {
            if (!this.f13374a) {
                throw new NoSuchElementException();
            }
            if (!this.f13378e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            k<K> kVar = this.f13375b;
            K[] kArr = kVar.f13359b;
            b<K> bVar = this.f13371f;
            int i11 = this.f13376c;
            bVar.f13372a = kArr[i11];
            bVar.f13373b = kVar.f13360c[i11];
            this.f13377d = i11;
            a();
            return this.f13371f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13378e) {
                return this.f13374a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.k.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K> extends d<K> implements Iterable<K>, Iterator<K> {
        public c(k<K> kVar) {
            super(kVar);
        }

        @Override // com.badlogic.gdx.utils.k.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13375b.f13358a));
        }

        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            while (this.f13374a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13378e) {
                return this.f13374a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f13374a) {
                throw new NoSuchElementException();
            }
            if (!this.f13378e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f13375b.f13359b;
            int i11 = this.f13376c;
            K k11 = kArr[i11];
            this.f13377d = i11;
            a();
            return k11;
        }

        @Override // com.badlogic.gdx.utils.k.d, java.util.Iterator
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
    public static class e extends d<Object> {
        public e(k<?> kVar) {
            super(kVar);
        }

        @Override // com.badlogic.gdx.utils.k.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public int f() {
            if (!this.f13374a) {
                throw new NoSuchElementException();
            }
            if (!this.f13378e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int[] iArr = this.f13375b.f13360c;
            int i11 = this.f13376c;
            int i12 = iArr[i11];
            this.f13377d = i11;
            a();
            return i12;
        }

        public v g() {
            v vVar = new v(true, this.f13375b.f13358a);
            while (this.f13374a) {
                vVar.a(f());
            }
            return vVar;
        }

        public v h(v vVar) {
            while (this.f13374a) {
                vVar.a(f());
            }
            return vVar;
        }

        public boolean hasNext() {
            if (this.f13378e) {
                return this.f13374a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.k.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public e d() {
            return this;
        }
    }
}
