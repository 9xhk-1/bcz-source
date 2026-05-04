package com.badlogic.gdx.utils;

import a3.d0;
import a3.e0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j<K> implements Iterable<b<K>> {

    /* renamed from: a, reason: collision with root package name */
    public int f13337a;

    /* renamed from: b, reason: collision with root package name */
    public K[] f13338b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f13339c;

    /* renamed from: d, reason: collision with root package name */
    public float f13340d;

    /* renamed from: e, reason: collision with root package name */
    public int f13341e;

    /* renamed from: f, reason: collision with root package name */
    public int f13342f;

    /* renamed from: g, reason: collision with root package name */
    public int f13343g;

    /* renamed from: h, reason: collision with root package name */
    public transient a f13344h;

    /* renamed from: i, reason: collision with root package name */
    public transient a f13345i;

    /* renamed from: j, reason: collision with root package name */
    public transient e f13346j;

    /* renamed from: k, reason: collision with root package name */
    public transient e f13347k;

    /* renamed from: l, reason: collision with root package name */
    public transient c f13348l;

    /* renamed from: m, reason: collision with root package name */
    public transient c f13349m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K> {

        /* renamed from: a, reason: collision with root package name */
        public K f13351a;

        /* renamed from: b, reason: collision with root package name */
        public float f13352b;

        public String toString() {
            return this.f13351a + ContainerUtils.KEY_VALUE_DELIMITER + this.f13352b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13353a;

        /* renamed from: b, reason: collision with root package name */
        public final j<K> f13354b;

        /* renamed from: c, reason: collision with root package name */
        public int f13355c;

        /* renamed from: d, reason: collision with root package name */
        public int f13356d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13357e = true;

        public d(j<K> jVar) {
            this.f13354b = jVar;
            b();
        }

        public void a() {
            int i11;
            K[] kArr = this.f13354b.f13338b;
            int length = kArr.length;
            do {
                i11 = this.f13355c + 1;
                this.f13355c = i11;
                if (i11 >= length) {
                    this.f13353a = false;
                    return;
                }
            } while (kArr[i11] == null);
            this.f13353a = true;
        }

        public void b() {
            this.f13356d = -1;
            this.f13355c = -1;
            a();
        }

        public void remove() {
            int i11 = this.f13356d;
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            j<K> jVar = this.f13354b;
            K[] kArr = jVar.f13338b;
            float[] fArr = jVar.f13339c;
            int i12 = jVar.f13343g;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                K k11 = kArr[i14];
                if (k11 == null) {
                    break;
                }
                int r11 = this.f13354b.r(k11);
                if (((i14 - r11) & i12) > ((i11 - r11) & i12)) {
                    kArr[i11] = k11;
                    fArr[i11] = fArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            kArr[i11] = null;
            j<K> jVar2 = this.f13354b;
            jVar2.f13337a--;
            if (i11 != this.f13356d) {
                this.f13355c--;
            }
            this.f13356d = -1;
        }
    }

    public j() {
        this(51, 0.8f);
    }

    public final String A(String str, boolean z11) {
        int i11;
        if (this.f13337a == 0) {
            return z11 ? "{}" : "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        if (z11) {
            sb2.append(l50.b.f69927i);
        }
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        int length = kArr.length;
        while (true) {
            i11 = length - 1;
            if (length > 0) {
                K k11 = kArr[i11];
                if (k11 != null) {
                    sb2.append(k11);
                    sb2.append('=');
                    sb2.append(fArr[i11]);
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
                sb2.append(fArr[i12]);
            }
            i11 = i12;
        }
        if (z11) {
            sb2.append(l50.b.f69928j);
        }
        return sb2.toString();
    }

    public e B() {
        if (a3.k.f1553a) {
            return new e(this);
        }
        if (this.f13346j == null) {
            this.f13346j = new e(this);
            this.f13347k = new e(this);
        }
        e eVar = this.f13346j;
        if (eVar.f13357e) {
            this.f13347k.b();
            e eVar2 = this.f13347k;
            eVar2.f13357e = true;
            this.f13346j.f13357e = false;
            return eVar2;
        }
        eVar.b();
        e eVar3 = this.f13346j;
        eVar3.f13357e = true;
        this.f13347k.f13357e = false;
        return eVar3;
    }

    public void a(int i11) {
        int s11 = m.s(i11, this.f13340d);
        if (this.f13338b.length <= s11) {
            clear();
        } else {
            this.f13337a = 0;
            x(s11);
        }
    }

    public boolean b(K k11) {
        return p(k11) >= 0;
    }

    public void clear() {
        if (this.f13337a == 0) {
            return;
        }
        this.f13337a = 0;
        Arrays.fill(this.f13338b, (Object) null);
    }

    public boolean d(float f11) {
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && fArr[length] == f11) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f13337a != this.f13337a) {
            return false;
        }
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                float l11 = jVar.l(k11, 0.0f);
                if ((l11 == 0.0f && !jVar.b(k11)) || l11 != fArr[i11]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean f(float f11, float f12) {
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && Math.abs(fArr[length] - f11) <= f12) {
                return true;
            }
        }
        return false;
    }

    public void g(int i11) {
        int s11 = m.s(this.f13337a + i11, this.f13340d);
        if (this.f13338b.length < s11) {
            x(s11);
        }
    }

    public a<K> h() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13344h == null) {
            this.f13344h = new a(this);
            this.f13345i = new a(this);
        }
        a aVar = this.f13344h;
        if (aVar.f13357e) {
            this.f13345i.b();
            a<K> aVar2 = this.f13345i;
            aVar2.f13357e = true;
            this.f13344h.f13357e = false;
            return aVar2;
        }
        aVar.b();
        a<K> aVar3 = this.f13344h;
        aVar3.f13357e = true;
        this.f13345i.f13357e = false;
        return aVar3;
    }

    public int hashCode() {
        int i11 = this.f13337a;
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        int length = kArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            K k11 = kArr[i12];
            if (k11 != null) {
                i11 += k11.hashCode() + e0.d(fArr[i12]);
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f13337a == 0;
    }

    @d0
    public K j(float f11) {
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            K k11 = kArr[length];
            if (k11 != null && fArr[length] == f11) {
                return k11;
            }
        }
        return null;
    }

    @d0
    public K k(float f11, float f12) {
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            K k11 = kArr[length];
            if (k11 != null && Math.abs(fArr[length] - f11) <= f12) {
                return k11;
            }
        }
        return null;
    }

    public float l(K k11, float f11) {
        int p11 = p(k11);
        return p11 < 0 ? f11 : this.f13339c[p11];
    }

    public float m(K k11, float f11, float f12) {
        int p11 = p(k11);
        if (p11 >= 0) {
            float[] fArr = this.f13339c;
            float f13 = fArr[p11];
            fArr[p11] = f12 + f13;
            return f13;
        }
        int i11 = -(p11 + 1);
        K[] kArr = this.f13338b;
        kArr[i11] = k11;
        this.f13339c[i11] = f12 + f11;
        int i12 = this.f13337a + 1;
        this.f13337a = i12;
        if (i12 >= this.f13341e) {
            x(kArr.length << 1);
        }
        return f11;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return h();
    }

    public c<K> o() {
        if (a3.k.f1553a) {
            return new c<>(this);
        }
        if (this.f13348l == null) {
            this.f13348l = new c(this);
            this.f13349m = new c(this);
        }
        c cVar = this.f13348l;
        if (cVar.f13357e) {
            this.f13349m.b();
            c<K> cVar2 = this.f13349m;
            cVar2.f13357e = true;
            this.f13348l.f13357e = false;
            return cVar2;
        }
        cVar.b();
        c<K> cVar3 = this.f13348l;
        cVar3.f13357e = true;
        this.f13349m.f13357e = false;
        return cVar3;
    }

    public int p(K k11) {
        if (k11 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f13338b;
        int r11 = r(k11);
        while (true) {
            K k12 = kArr[r11];
            if (k12 == null) {
                return -(r11 + 1);
            }
            if (k12.equals(k11)) {
                return r11;
            }
            r11 = (r11 + 1) & this.f13343g;
        }
    }

    public boolean q() {
        return this.f13337a > 0;
    }

    public int r(K k11) {
        return (int) ((k11.hashCode() * (-7046029254386353131L)) >>> this.f13342f);
    }

    public float s(K k11, float f11, float f12) {
        int p11 = p(k11);
        if (p11 >= 0) {
            float[] fArr = this.f13339c;
            float f13 = fArr[p11];
            fArr[p11] = f11;
            return f13;
        }
        int i11 = -(p11 + 1);
        K[] kArr = this.f13338b;
        kArr[i11] = k11;
        this.f13339c[i11] = f11;
        int i12 = this.f13337a + 1;
        this.f13337a = i12;
        if (i12 >= this.f13341e) {
            x(kArr.length << 1);
        }
        return f12;
    }

    public void t(K k11, float f11) {
        int p11 = p(k11);
        if (p11 >= 0) {
            this.f13339c[p11] = f11;
            return;
        }
        int i11 = -(p11 + 1);
        K[] kArr = this.f13338b;
        kArr[i11] = k11;
        this.f13339c[i11] = f11;
        int i12 = this.f13337a + 1;
        this.f13337a = i12;
        if (i12 >= this.f13341e) {
            x(kArr.length << 1);
        }
    }

    public String toString() {
        return A(j2.O, true);
    }

    public void u(j<? extends K> jVar) {
        g(jVar.f13337a);
        K[] kArr = jVar.f13338b;
        float[] fArr = jVar.f13339c;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k11 = kArr[i11];
            if (k11 != null) {
                t(k11, fArr[i11]);
            }
        }
    }

    public final void v(K k11, float f11) {
        K[] kArr = this.f13338b;
        int r11 = r(k11);
        while (kArr[r11] != null) {
            r11 = (r11 + 1) & this.f13343g;
        }
        kArr[r11] = k11;
        this.f13339c[r11] = f11;
    }

    public float w(K k11, float f11) {
        int p11 = p(k11);
        if (p11 < 0) {
            return f11;
        }
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        float f12 = fArr[p11];
        int i11 = this.f13343g;
        int i12 = p11 + 1;
        while (true) {
            int i13 = i12 & i11;
            K k12 = kArr[i13];
            if (k12 == null) {
                kArr[p11] = null;
                this.f13337a--;
                return f12;
            }
            int r11 = r(k12);
            if (((i13 - r11) & i11) > ((p11 - r11) & i11)) {
                kArr[p11] = k12;
                fArr[p11] = fArr[i13];
                p11 = i13;
            }
            i12 = i13 + 1;
        }
    }

    public final void x(int i11) {
        int length = this.f13338b.length;
        this.f13341e = (int) (i11 * this.f13340d);
        int i12 = i11 - 1;
        this.f13343g = i12;
        this.f13342f = Long.numberOfLeadingZeros(i12);
        K[] kArr = this.f13338b;
        float[] fArr = this.f13339c;
        this.f13338b = (K[]) new Object[i11];
        this.f13339c = new float[i11];
        if (this.f13337a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                K k11 = kArr[i13];
                if (k11 != null) {
                    v(k11, fArr[i13]);
                }
            }
        }
    }

    public void y(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = m.s(i11, this.f13340d);
        if (this.f13338b.length > s11) {
            x(s11);
        }
    }

    public String z(String str) {
        return A(str, false);
    }

    public j(int i11) {
        this(i11, 0.8f);
    }

    public j(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13340d = f11;
            int s11 = m.s(i11, f11);
            this.f13341e = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13343g = i12;
            this.f13342f = Long.numberOfLeadingZeros(i12);
            this.f13338b = (K[]) new Object[s11];
            this.f13339c = new float[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    public j(j<? extends K> jVar) {
        this((int) Math.floor(jVar.f13338b.length * jVar.f13340d), jVar.f13340d);
        Object[] objArr = jVar.f13338b;
        System.arraycopy(objArr, 0, this.f13338b, 0, objArr.length);
        float[] fArr = jVar.f13339c;
        System.arraycopy(fArr, 0, this.f13339c, 0, fArr.length);
        this.f13337a = jVar.f13337a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K> extends d<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* renamed from: f, reason: collision with root package name */
        public b<K> f13350f;

        public a(j<K> jVar) {
            super(jVar);
            this.f13350f = new b<>();
        }

        @Override // com.badlogic.gdx.utils.j.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b<K> next() {
            if (!this.f13353a) {
                throw new NoSuchElementException();
            }
            if (!this.f13357e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            j<K> jVar = this.f13354b;
            K[] kArr = jVar.f13338b;
            b<K> bVar = this.f13350f;
            int i11 = this.f13355c;
            bVar.f13351a = kArr[i11];
            bVar.f13352b = jVar.f13339c[i11];
            this.f13356d = i11;
            a();
            return this.f13350f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13357e) {
                return this.f13353a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.j.d, java.util.Iterator
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
        public c(j<K> jVar) {
            super(jVar);
        }

        @Override // com.badlogic.gdx.utils.j.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<K> f() {
            return g(new com.badlogic.gdx.utils.a<>(true, this.f13354b.f13337a));
        }

        public com.badlogic.gdx.utils.a<K> g(com.badlogic.gdx.utils.a<K> aVar) {
            while (this.f13353a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13357e) {
                return this.f13353a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.f13353a) {
                throw new NoSuchElementException();
            }
            if (!this.f13357e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f13354b.f13338b;
            int i11 = this.f13355c;
            K k11 = kArr[i11];
            this.f13356d = i11;
            a();
            return k11;
        }

        @Override // com.badlogic.gdx.utils.j.d, java.util.Iterator
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
        public e(j<?> jVar) {
            super(jVar);
        }

        @Override // com.badlogic.gdx.utils.j.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public float f() {
            if (!this.f13353a) {
                throw new NoSuchElementException();
            }
            if (!this.f13357e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            float[] fArr = this.f13354b.f13339c;
            int i11 = this.f13355c;
            float f11 = fArr[i11];
            this.f13356d = i11;
            a();
            return f11;
        }

        public a3.r g() {
            a3.r rVar = new a3.r(true, this.f13354b.f13337a);
            while (this.f13353a) {
                rVar.a(f());
            }
            return rVar;
        }

        public a3.r h(a3.r rVar) {
            while (this.f13353a) {
                rVar.a(f());
            }
            return rVar;
        }

        public boolean hasNext() {
            if (this.f13357e) {
                return this.f13353a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.j.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public e d() {
            return this;
        }
    }
}
