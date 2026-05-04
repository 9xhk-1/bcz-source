package com.badlogic.gdx.utils;

import a3.d0;
import a3.v;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d<V> implements Iterable<b<V>> {

    /* renamed from: a, reason: collision with root package name */
    public int f13219a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f13220b;

    /* renamed from: c, reason: collision with root package name */
    public V[] f13221c;

    /* renamed from: d, reason: collision with root package name */
    public V f13222d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13223e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13224f;

    /* renamed from: g, reason: collision with root package name */
    public int f13225g;

    /* renamed from: h, reason: collision with root package name */
    public int f13226h;

    /* renamed from: i, reason: collision with root package name */
    public int f13227i;

    /* renamed from: j, reason: collision with root package name */
    public transient a f13228j;

    /* renamed from: k, reason: collision with root package name */
    public transient a f13229k;

    /* renamed from: l, reason: collision with root package name */
    public transient e f13230l;

    /* renamed from: m, reason: collision with root package name */
    public transient e f13231m;

    /* renamed from: n, reason: collision with root package name */
    public transient c f13232n;

    /* renamed from: o, reason: collision with root package name */
    public transient c f13233o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<V> {

        /* renamed from: a, reason: collision with root package name */
        public int f13235a;

        /* renamed from: b, reason: collision with root package name */
        @d0
        public V f13236b;

        public String toString() {
            return this.f13235a + ContainerUtils.KEY_VALUE_DELIMITER + this.f13236b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends C0198d {
        public c(d dVar) {
            super(dVar);
        }

        @Override // com.badlogic.gdx.utils.d.C0198d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public int d() {
            if (!this.f13239a) {
                throw new NoSuchElementException();
            }
            if (!this.f13243e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f13241c;
            int i12 = i11 == -1 ? 0 : this.f13240b.f13220b[i11];
            this.f13242d = i11;
            a();
            return i12;
        }

        public v f() {
            v vVar = new v(true, this.f13240b.f13219a);
            while (this.f13239a) {
                vVar.a(d());
            }
            return vVar;
        }

        public v g(v vVar) {
            while (this.f13239a) {
                vVar.a(d());
            }
            return vVar;
        }

        @Override // com.badlogic.gdx.utils.d.C0198d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.badlogic.gdx.utils.d$d, reason: collision with other inner class name */
    public static class C0198d<V> {

        /* renamed from: f, reason: collision with root package name */
        public static final int f13237f = -2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f13238g = -1;

        /* renamed from: a, reason: collision with root package name */
        public boolean f13239a;

        /* renamed from: b, reason: collision with root package name */
        public final d<V> f13240b;

        /* renamed from: c, reason: collision with root package name */
        public int f13241c;

        /* renamed from: d, reason: collision with root package name */
        public int f13242d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13243e = true;

        public C0198d(d<V> dVar) {
            this.f13240b = dVar;
            b();
        }

        public void a() {
            int i11;
            int[] iArr = this.f13240b.f13220b;
            int length = iArr.length;
            do {
                i11 = this.f13241c + 1;
                this.f13241c = i11;
                if (i11 >= length) {
                    this.f13239a = false;
                    return;
                }
            } while (iArr[i11] == 0);
            this.f13239a = true;
        }

        public void b() {
            this.f13242d = -2;
            this.f13241c = -1;
            if (this.f13240b.f13223e) {
                this.f13239a = true;
            } else {
                a();
            }
        }

        public void remove() {
            int i11 = this.f13242d;
            if (i11 == -1) {
                d<V> dVar = this.f13240b;
                if (dVar.f13223e) {
                    dVar.f13223e = false;
                    dVar.f13222d = null;
                    this.f13242d = -2;
                    d<V> dVar2 = this.f13240b;
                    dVar2.f13219a--;
                }
            }
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            d<V> dVar3 = this.f13240b;
            int[] iArr = dVar3.f13220b;
            V[] vArr = dVar3.f13221c;
            int i12 = dVar3.f13227i;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                int i15 = iArr[i14];
                if (i15 == 0) {
                    break;
                }
                int o11 = this.f13240b.o(i15);
                if (((i14 - o11) & i12) > ((i11 - o11) & i12)) {
                    iArr[i11] = i15;
                    vArr[i11] = vArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            iArr[i11] = 0;
            vArr[i11] = null;
            if (i11 != this.f13242d) {
                this.f13241c--;
            }
            this.f13242d = -2;
            d<V> dVar22 = this.f13240b;
            dVar22.f13219a--;
        }
    }

    public d() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = m.s(i11, this.f13224f);
        if (this.f13220b.length <= s11) {
            clear();
            return;
        }
        this.f13219a = 0;
        this.f13223e = false;
        this.f13222d = null;
        s(s11);
    }

    public boolean b(int i11) {
        return i11 == 0 ? this.f13223e : m(i11) >= 0;
    }

    public void clear() {
        if (this.f13219a == 0) {
            return;
        }
        this.f13219a = 0;
        Arrays.fill(this.f13220b, 0);
        Arrays.fill(this.f13221c, (Object) null);
        this.f13222d = null;
        this.f13223e = false;
    }

    public boolean d(@d0 Object obj, boolean z11) {
        V[] vArr = this.f13221c;
        if (obj == null) {
            if (this.f13223e && this.f13222d == null) {
                return true;
            }
            int[] iArr = this.f13220b;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (iArr[length] != 0 && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z11) {
            if (obj == this.f13222d) {
                return true;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        if (this.f13223e && obj.equals(this.f13222d)) {
            return true;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f13219a != this.f13219a) {
            return false;
        }
        boolean z11 = dVar.f13223e;
        boolean z12 = this.f13223e;
        if (z11 != z12) {
            return false;
        }
        if (z12) {
            V v11 = dVar.f13222d;
            if (v11 == null) {
                if (this.f13222d != null) {
                    return false;
                }
            } else if (!v11.equals(this.f13222d)) {
                return false;
            }
        }
        int[] iArr = this.f13220b;
        V[] vArr = this.f13221c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                V v12 = vArr[i11];
                if (v12 == null) {
                    if (dVar.k(i12, l.f13379n) != null) {
                        return false;
                    }
                } else if (!v12.equals(dVar.get(i12))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void f(int i11) {
        int s11 = m.s(this.f13219a + i11, this.f13224f);
        if (this.f13220b.length < s11) {
            s(s11);
        }
    }

    public a<V> g() {
        if (a3.k.f1553a) {
            return new a<>(this);
        }
        if (this.f13228j == null) {
            this.f13228j = new a(this);
            this.f13229k = new a(this);
        }
        a aVar = this.f13228j;
        if (aVar.f13243e) {
            this.f13229k.b();
            a<V> aVar2 = this.f13229k;
            aVar2.f13243e = true;
            this.f13228j.f13243e = false;
            return aVar2;
        }
        aVar.b();
        a<V> aVar3 = this.f13228j;
        aVar3.f13243e = true;
        this.f13229k.f13243e = false;
        return aVar3;
    }

    public V get(int i11) {
        if (i11 == 0) {
            if (this.f13223e) {
                return this.f13222d;
            }
            return null;
        }
        int m11 = m(i11);
        if (m11 >= 0) {
            return this.f13221c[m11];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(@d0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f13219a != this.f13219a) {
            return false;
        }
        boolean z11 = dVar.f13223e;
        boolean z12 = this.f13223e;
        if (z11 != z12) {
            return false;
        }
        if (z12 && this.f13222d != dVar.f13222d) {
            return false;
        }
        int[] iArr = this.f13220b;
        V[] vArr = this.f13221c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0 && vArr[i11] != dVar.k(i12, l.f13379n)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        V v11;
        int i11 = this.f13219a;
        if (this.f13223e && (v11 = this.f13222d) != null) {
            i11 += v11.hashCode();
        }
        int[] iArr = this.f13220b;
        V[] vArr = this.f13221c;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                i11 += i13 * 31;
                V v12 = vArr[i12];
                if (v12 != null) {
                    i11 += v12.hashCode();
                }
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f13219a == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<b<V>> iterator() {
        return g();
    }

    public int j(@d0 Object obj, boolean z11, int i11) {
        V[] vArr = this.f13221c;
        if (obj == null) {
            if (this.f13223e && this.f13222d == null) {
                return 0;
            }
            int[] iArr = this.f13220b;
            for (int length = vArr.length - 1; length >= 0; length--) {
                int i12 = iArr[length];
                if (i12 != 0 && vArr[length] == null) {
                    return i12;
                }
            }
        } else if (z11) {
            if (obj == this.f13222d) {
                return 0;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.f13220b[length2];
                }
            }
        } else {
            if (this.f13223e && obj.equals(this.f13222d)) {
                return 0;
            }
            for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
                if (obj.equals(vArr[length3])) {
                    return this.f13220b[length3];
                }
            }
        }
        return i11;
    }

    public V k(int i11, @d0 V v11) {
        if (i11 != 0) {
            int m11 = m(i11);
            if (m11 >= 0) {
                return this.f13221c[m11];
            }
        } else if (this.f13223e) {
            return this.f13222d;
        }
        return v11;
    }

    public c l() {
        if (a3.k.f1553a) {
            return new c(this);
        }
        if (this.f13232n == null) {
            this.f13232n = new c(this);
            this.f13233o = new c(this);
        }
        c cVar = this.f13232n;
        if (cVar.f13243e) {
            this.f13233o.b();
            c cVar2 = this.f13233o;
            cVar2.f13243e = true;
            this.f13232n.f13243e = false;
            return cVar2;
        }
        cVar.b();
        c cVar3 = this.f13232n;
        cVar3.f13243e = true;
        this.f13233o.f13243e = false;
        return cVar3;
    }

    public final int m(int i11) {
        int[] iArr = this.f13220b;
        int o11 = o(i11);
        while (true) {
            int i12 = iArr[o11];
            if (i12 == 0) {
                return -(o11 + 1);
            }
            if (i12 == i11) {
                return o11;
            }
            o11 = (o11 + 1) & this.f13227i;
        }
    }

    public boolean n() {
        return this.f13219a > 0;
    }

    public int o(int i11) {
        return (int) ((i11 * (-7046029254386353131L)) >>> this.f13226h);
    }

    @d0
    public V p(int i11, @d0 V v11) {
        if (i11 == 0) {
            V v12 = this.f13222d;
            this.f13222d = v11;
            if (!this.f13223e) {
                this.f13223e = true;
                this.f13219a++;
            }
            return v12;
        }
        int m11 = m(i11);
        if (m11 >= 0) {
            V[] vArr = this.f13221c;
            V v13 = vArr[m11];
            vArr[m11] = v11;
            return v13;
        }
        int i12 = -(m11 + 1);
        int[] iArr = this.f13220b;
        iArr[i12] = i11;
        this.f13221c[i12] = v11;
        int i13 = this.f13219a + 1;
        this.f13219a = i13;
        if (i13 < this.f13225g) {
            return null;
        }
        s(iArr.length << 1);
        return null;
    }

    public void q(d<? extends V> dVar) {
        f(dVar.f13219a);
        if (dVar.f13223e) {
            p(0, dVar.f13222d);
        }
        int[] iArr = dVar.f13220b;
        V[] vArr = dVar.f13221c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                p(i12, vArr[i11]);
            }
        }
    }

    public final void r(int i11, @d0 V v11) {
        int[] iArr = this.f13220b;
        int o11 = o(i11);
        while (iArr[o11] != 0) {
            o11 = (o11 + 1) & this.f13227i;
        }
        iArr[o11] = i11;
        this.f13221c[o11] = v11;
    }

    @d0
    public V remove(int i11) {
        if (i11 == 0) {
            if (!this.f13223e) {
                return null;
            }
            this.f13223e = false;
            V v11 = this.f13222d;
            this.f13222d = null;
            this.f13219a--;
            return v11;
        }
        int m11 = m(i11);
        if (m11 < 0) {
            return null;
        }
        int[] iArr = this.f13220b;
        V[] vArr = this.f13221c;
        V v12 = vArr[m11];
        int i12 = this.f13227i;
        int i13 = m11 + 1;
        while (true) {
            int i14 = i13 & i12;
            int i15 = iArr[i14];
            if (i15 == 0) {
                iArr[m11] = 0;
                vArr[m11] = null;
                this.f13219a--;
                return v12;
            }
            int o11 = o(i15);
            if (((i14 - o11) & i12) > ((m11 - o11) & i12)) {
                iArr[m11] = i15;
                vArr[m11] = vArr[i14];
                m11 = i14;
            }
            i13 = i14 + 1;
        }
    }

    public final void s(int i11) {
        int length = this.f13220b.length;
        this.f13225g = (int) (i11 * this.f13224f);
        int i12 = i11 - 1;
        this.f13227i = i12;
        this.f13226h = Long.numberOfLeadingZeros(i12);
        int[] iArr = this.f13220b;
        V[] vArr = this.f13221c;
        this.f13220b = new int[i11];
        this.f13221c = (V[]) new Object[i11];
        if (this.f13219a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 != 0) {
                    r(i14, vArr[i13]);
                }
            }
        }
    }

    public void t(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = m.s(i11, this.f13224f);
        if (this.f13220b.length > s11) {
            s(s11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003e -> B:9:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f13219a
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.f13220b
            V[] r2 = r7.f13221c
            int r3 = r1.length
            boolean r4 = r7.f13223e
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r7.f13222d
            r0.append(r4)
            goto L3f
        L29:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r4]
            if (r3 != 0) goto L33
            r3 = r4
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L3e:
            r3 = r4
        L3f:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r4]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r6 = ", "
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L3e
        L59:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.d.toString():java.lang.String");
    }

    public e<V> u() {
        if (a3.k.f1553a) {
            return new e<>(this);
        }
        if (this.f13230l == null) {
            this.f13230l = new e(this);
            this.f13231m = new e(this);
        }
        e eVar = this.f13230l;
        if (eVar.f13243e) {
            this.f13231m.b();
            e<V> eVar2 = this.f13231m;
            eVar2.f13243e = true;
            this.f13230l.f13243e = false;
            return eVar2;
        }
        eVar.b();
        e<V> eVar3 = this.f13230l;
        eVar3.f13243e = true;
        this.f13231m.f13243e = false;
        return eVar3;
    }

    public d(int i11) {
        this(i11, 0.8f);
    }

    public d(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13224f = f11;
            int s11 = m.s(i11, f11);
            this.f13225g = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13227i = i12;
            this.f13226h = Long.numberOfLeadingZeros(i12);
            this.f13220b = new int[s11];
            this.f13221c = (V[]) new Object[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.badlogic.gdx.utils.d<? extends V> r5) {
        /*
            r4 = this;
            int[] r0 = r5.f13220b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f13224f
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            int[] r0 = r5.f13220b
            int[] r1 = r4.f13220b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            V[] r0 = r5.f13221c
            V[] r1 = r4.f13221c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r5.f13219a
            r4.f13219a = r0
            V r0 = r5.f13222d
            r4.f13222d = r0
            boolean r5 = r5.f13223e
            r4.f13223e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.d.<init>(com.badlogic.gdx.utils.d):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<V> extends C0198d<V> implements Iterable<b<V>>, Iterator<b<V>> {

        /* renamed from: h, reason: collision with root package name */
        public final b<V> f13234h;

        public a(d dVar) {
            super(dVar);
            this.f13234h = new b<>();
        }

        @Override // com.badlogic.gdx.utils.d.C0198d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<V> next() {
            if (!this.f13239a) {
                throw new NoSuchElementException();
            }
            if (!this.f13243e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            d<V> dVar = this.f13240b;
            int[] iArr = dVar.f13220b;
            int i11 = this.f13241c;
            if (i11 == -1) {
                b<V> bVar = this.f13234h;
                bVar.f13235a = 0;
                bVar.f13236b = dVar.f13222d;
            } else {
                b<V> bVar2 = this.f13234h;
                bVar2.f13235a = iArr[i11];
                bVar2.f13236b = dVar.f13221c[i11];
            }
            this.f13242d = i11;
            a();
            return this.f13234h;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13243e) {
                return this.f13239a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.d.C0198d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        public Iterator<b<V>> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<V> extends C0198d<V> implements Iterable<V>, Iterator<V> {
        public e(d<V> dVar) {
            super(dVar);
        }

        @Override // com.badlogic.gdx.utils.d.C0198d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public com.badlogic.gdx.utils.a<V> d() {
            com.badlogic.gdx.utils.a<V> aVar = new com.badlogic.gdx.utils.a<>(true, this.f13240b.f13219a);
            while (this.f13239a) {
                aVar.a(next());
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13243e) {
                return this.f13239a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        @d0
        public V next() {
            if (!this.f13239a) {
                throw new NoSuchElementException();
            }
            if (!this.f13243e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f13241c;
            V v11 = i11 == -1 ? this.f13240b.f13222d : this.f13240b.f13221c[i11];
            this.f13242d = i11;
            a();
            return v11;
        }

        @Override // com.badlogic.gdx.utils.d.C0198d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }
}
