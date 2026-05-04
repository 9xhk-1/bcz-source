package a3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w implements Iterable<b> {

    /* renamed from: a, reason: collision with root package name */
    public int f1645a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1646b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f1647c;

    /* renamed from: d, reason: collision with root package name */
    public float f1648d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1649e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1650f;

    /* renamed from: g, reason: collision with root package name */
    public int f1651g;

    /* renamed from: h, reason: collision with root package name */
    public int f1652h;

    /* renamed from: i, reason: collision with root package name */
    public int f1653i;

    /* renamed from: j, reason: collision with root package name */
    public transient a f1654j;

    /* renamed from: k, reason: collision with root package name */
    public transient a f1655k;

    /* renamed from: l, reason: collision with root package name */
    public transient e f1656l;

    /* renamed from: m, reason: collision with root package name */
    public transient e f1657m;

    /* renamed from: n, reason: collision with root package name */
    public transient c f1658n;

    /* renamed from: o, reason: collision with root package name */
    public transient c f1659o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1661a;

        /* renamed from: b, reason: collision with root package name */
        public float f1662b;

        public String toString() {
            return this.f1661a + ContainerUtils.KEY_VALUE_DELIMITER + this.f1662b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends d {
        public c(w wVar) {
            super(wVar);
        }

        @Override // a3.w.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public int d() {
            if (!this.f1665a) {
                throw new NoSuchElementException();
            }
            if (!this.f1669e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f1667c;
            int i12 = i11 == -1 ? 0 : this.f1666b.f1646b[i11];
            this.f1668d = i11;
            a();
            return i12;
        }

        public v f() {
            v vVar = new v(true, this.f1666b.f1645a);
            while (this.f1665a) {
                vVar.a(d());
            }
            return vVar;
        }

        public v g(v vVar) {
            while (this.f1665a) {
                vVar.a(d());
            }
            return vVar;
        }

        @Override // a3.w.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: f, reason: collision with root package name */
        public static final int f1663f = -2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f1664g = -1;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1665a;

        /* renamed from: b, reason: collision with root package name */
        public final w f1666b;

        /* renamed from: c, reason: collision with root package name */
        public int f1667c;

        /* renamed from: d, reason: collision with root package name */
        public int f1668d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1669e = true;

        public d(w wVar) {
            this.f1666b = wVar;
            b();
        }

        public void a() {
            int i11;
            int[] iArr = this.f1666b.f1646b;
            int length = iArr.length;
            do {
                i11 = this.f1667c + 1;
                this.f1667c = i11;
                if (i11 >= length) {
                    this.f1665a = false;
                    return;
                }
            } while (iArr[i11] == 0);
            this.f1665a = true;
        }

        public void b() {
            this.f1668d = -2;
            this.f1667c = -1;
            if (this.f1666b.f1649e) {
                this.f1665a = true;
            } else {
                a();
            }
        }

        public void remove() {
            int i11 = this.f1668d;
            if (i11 == -1) {
                w wVar = this.f1666b;
                if (wVar.f1649e) {
                    wVar.f1649e = false;
                    this.f1668d = -2;
                    w wVar2 = this.f1666b;
                    wVar2.f1645a--;
                }
            }
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            w wVar3 = this.f1666b;
            int[] iArr = wVar3.f1646b;
            float[] fArr = wVar3.f1647c;
            int i12 = wVar3.f1653i;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                int i15 = iArr[i14];
                if (i15 == 0) {
                    break;
                }
                int q11 = this.f1666b.q(i15);
                if (((i14 - q11) & i12) > ((i11 - q11) & i12)) {
                    iArr[i11] = i15;
                    fArr[i11] = fArr[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            iArr[i11] = 0;
            if (i11 != this.f1668d) {
                this.f1667c--;
            }
            this.f1668d = -2;
            w wVar22 = this.f1666b;
            wVar22.f1645a--;
        }
    }

    public w() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = com.badlogic.gdx.utils.m.s(i11, this.f1650f);
        if (this.f1646b.length <= s11) {
            clear();
            return;
        }
        this.f1645a = 0;
        this.f1649e = false;
        w(s11);
    }

    public boolean b(int i11) {
        return i11 == 0 ? this.f1649e : o(i11) >= 0;
    }

    public void clear() {
        if (this.f1645a == 0) {
            return;
        }
        Arrays.fill(this.f1646b, 0);
        this.f1645a = 0;
        this.f1649e = false;
    }

    public boolean d(float f11) {
        if (this.f1649e && this.f1648d == f11) {
            return true;
        }
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && fArr[length] == f11) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f1645a != this.f1645a) {
            return false;
        }
        boolean z11 = wVar.f1649e;
        boolean z12 = this.f1649e;
        if (z11 != z12) {
            return false;
        }
        if (z12 && wVar.f1648d != this.f1648d) {
            return false;
        }
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                float l11 = wVar.l(i12, 0.0f);
                if ((l11 == 0.0f && !wVar.b(i12)) || l11 != fArr[i11]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean f(float f11, float f12) {
        if (this.f1649e && Math.abs(this.f1648d - f11) <= f12) {
            return true;
        }
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && Math.abs(fArr[length] - f11) <= f12) {
                return true;
            }
        }
        return false;
    }

    public void g(int i11) {
        int s11 = com.badlogic.gdx.utils.m.s(this.f1645a + i11, this.f1650f);
        if (this.f1646b.length < s11) {
            w(s11);
        }
    }

    public a h() {
        if (k.f1553a) {
            return new a(this);
        }
        if (this.f1654j == null) {
            this.f1654j = new a(this);
            this.f1655k = new a(this);
        }
        a aVar = this.f1654j;
        if (aVar.f1669e) {
            this.f1655k.b();
            a aVar2 = this.f1655k;
            aVar2.f1669e = true;
            this.f1654j.f1669e = false;
            return aVar2;
        }
        aVar.b();
        a aVar3 = this.f1654j;
        aVar3.f1669e = true;
        this.f1655k.f1669e = false;
        return aVar3;
    }

    public int hashCode() {
        int i11 = this.f1645a;
        if (this.f1649e) {
            i11 += e0.d(this.f1648d);
        }
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                i11 += (i13 * 31) + e0.d(fArr[i12]);
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f1645a == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return h();
    }

    public int j(float f11, float f12, int i11) {
        if (this.f1649e && Math.abs(this.f1648d - f11) <= f12) {
            return 0;
        }
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && Math.abs(fArr[length] - f11) <= f12) {
                return iArr[length];
            }
        }
        return i11;
    }

    public int k(float f11, int i11) {
        if (this.f1649e && this.f1648d == f11) {
            return 0;
        }
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        for (int length = fArr.length - 1; length >= 0; length--) {
            int i12 = iArr[length];
            if (i12 != 0 && fArr[length] == f11) {
                return i12;
            }
        }
        return i11;
    }

    public float l(int i11, float f11) {
        if (i11 != 0) {
            int o11 = o(i11);
            if (o11 >= 0) {
                return this.f1647c[o11];
            }
        } else if (this.f1649e) {
            return this.f1648d;
        }
        return f11;
    }

    public float m(int i11, float f11, float f12) {
        if (i11 == 0) {
            if (this.f1649e) {
                float f13 = this.f1648d;
                this.f1648d = f12 + f13;
                return f13;
            }
            this.f1649e = true;
            this.f1648d = f12 + f11;
            this.f1645a++;
            return f11;
        }
        int o11 = o(i11);
        if (o11 >= 0) {
            float[] fArr = this.f1647c;
            float f14 = fArr[o11];
            fArr[o11] = f12 + f14;
            return f14;
        }
        int i12 = -(o11 + 1);
        int[] iArr = this.f1646b;
        iArr[i12] = i11;
        this.f1647c[i12] = f12 + f11;
        int i13 = this.f1645a + 1;
        this.f1645a = i13;
        if (i13 >= this.f1651g) {
            w(iArr.length << 1);
        }
        return f11;
    }

    public c n() {
        if (k.f1553a) {
            return new c(this);
        }
        if (this.f1658n == null) {
            this.f1658n = new c(this);
            this.f1659o = new c(this);
        }
        c cVar = this.f1658n;
        if (cVar.f1669e) {
            this.f1659o.b();
            c cVar2 = this.f1659o;
            cVar2.f1669e = true;
            this.f1658n.f1669e = false;
            return cVar2;
        }
        cVar.b();
        c cVar3 = this.f1658n;
        cVar3.f1669e = true;
        this.f1659o.f1669e = false;
        return cVar3;
    }

    public final int o(int i11) {
        int[] iArr = this.f1646b;
        int q11 = q(i11);
        while (true) {
            int i12 = iArr[q11];
            if (i12 == 0) {
                return -(q11 + 1);
            }
            if (i12 == i11) {
                return q11;
            }
            q11 = (q11 + 1) & this.f1653i;
        }
    }

    public boolean p() {
        return this.f1645a > 0;
    }

    public int q(int i11) {
        return (int) ((i11 * (-7046029254386353131L)) >>> this.f1652h);
    }

    public float r(int i11, float f11, float f12) {
        if (i11 == 0) {
            float f13 = this.f1648d;
            this.f1648d = f11;
            if (this.f1649e) {
                return f13;
            }
            this.f1649e = true;
            this.f1645a++;
            return f12;
        }
        int o11 = o(i11);
        if (o11 >= 0) {
            float[] fArr = this.f1647c;
            float f14 = fArr[o11];
            fArr[o11] = f11;
            return f14;
        }
        int i12 = -(o11 + 1);
        int[] iArr = this.f1646b;
        iArr[i12] = i11;
        this.f1647c[i12] = f11;
        int i13 = this.f1645a + 1;
        this.f1645a = i13;
        if (i13 >= this.f1651g) {
            w(iArr.length << 1);
        }
        return f12;
    }

    public void s(int i11, float f11) {
        if (i11 == 0) {
            this.f1648d = f11;
            if (this.f1649e) {
                return;
            }
            this.f1649e = true;
            this.f1645a++;
            return;
        }
        int o11 = o(i11);
        if (o11 >= 0) {
            this.f1647c[o11] = f11;
            return;
        }
        int i12 = -(o11 + 1);
        int[] iArr = this.f1646b;
        iArr[i12] = i11;
        this.f1647c[i12] = f11;
        int i13 = this.f1645a + 1;
        this.f1645a = i13;
        if (i13 >= this.f1651g) {
            w(iArr.length << 1);
        }
    }

    public void t(w wVar) {
        g(wVar.f1645a);
        if (wVar.f1649e) {
            s(0, wVar.f1648d);
        }
        int[] iArr = wVar.f1646b;
        float[] fArr = wVar.f1647c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                s(i12, fArr[i11]);
            }
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
            int r0 = r7.f1645a
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.f1646b
            float[] r2 = r7.f1647c
            int r3 = r1.length
            boolean r4 = r7.f1649e
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            float r4 = r7.f1648d
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
        throw new UnsupportedOperationException("Method not decompiled: a3.w.toString():java.lang.String");
    }

    public final void u(int i11, float f11) {
        int[] iArr = this.f1646b;
        int q11 = q(i11);
        while (iArr[q11] != 0) {
            q11 = (q11 + 1) & this.f1653i;
        }
        iArr[q11] = i11;
        this.f1647c[q11] = f11;
    }

    public float v(int i11, float f11) {
        if (i11 != 0) {
            int o11 = o(i11);
            if (o11 >= 0) {
                int[] iArr = this.f1646b;
                float[] fArr = this.f1647c;
                float f12 = fArr[o11];
                int i12 = this.f1653i;
                int i13 = o11 + 1;
                while (true) {
                    int i14 = i13 & i12;
                    int i15 = iArr[i14];
                    if (i15 == 0) {
                        iArr[o11] = 0;
                        this.f1645a--;
                        return f12;
                    }
                    int q11 = q(i15);
                    if (((i14 - q11) & i12) > ((o11 - q11) & i12)) {
                        iArr[o11] = i15;
                        fArr[o11] = fArr[i14];
                        o11 = i14;
                    }
                    i13 = i14 + 1;
                }
            }
        } else if (this.f1649e) {
            this.f1649e = false;
            this.f1645a--;
            return this.f1648d;
        }
        return f11;
    }

    public final void w(int i11) {
        int length = this.f1646b.length;
        this.f1651g = (int) (i11 * this.f1650f);
        int i12 = i11 - 1;
        this.f1653i = i12;
        this.f1652h = Long.numberOfLeadingZeros(i12);
        int[] iArr = this.f1646b;
        float[] fArr = this.f1647c;
        this.f1646b = new int[i11];
        this.f1647c = new float[i11];
        if (this.f1645a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 != 0) {
                    u(i14, fArr[i13]);
                }
            }
        }
    }

    public void x(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = com.badlogic.gdx.utils.m.s(i11, this.f1650f);
        if (this.f1646b.length > s11) {
            w(s11);
        }
    }

    public e y() {
        if (k.f1553a) {
            return new e(this);
        }
        if (this.f1656l == null) {
            this.f1656l = new e(this);
            this.f1657m = new e(this);
        }
        e eVar = this.f1656l;
        if (eVar.f1669e) {
            this.f1657m.b();
            e eVar2 = this.f1657m;
            eVar2.f1669e = true;
            this.f1656l.f1669e = false;
            return eVar2;
        }
        eVar.b();
        e eVar3 = this.f1656l;
        eVar3.f1669e = true;
        this.f1657m.f1669e = false;
        return eVar3;
    }

    public w(int i11) {
        this(i11, 0.8f);
    }

    public w(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f1650f = f11;
            int s11 = com.badlogic.gdx.utils.m.s(i11, f11);
            this.f1651g = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f1653i = i12;
            this.f1652h = Long.numberOfLeadingZeros(i12);
            this.f1646b = new int[s11];
            this.f1647c = new float[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(a3.w r5) {
        /*
            r4 = this;
            int[] r0 = r5.f1646b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f1650f
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            int[] r0 = r5.f1646b
            int[] r1 = r4.f1646b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            float[] r0 = r5.f1647c
            float[] r1 = r4.f1647c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r5.f1645a
            r4.f1645a = r0
            float r0 = r5.f1648d
            r4.f1648d = r0
            boolean r5 = r5.f1649e
            r4.f1649e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.<init>(a3.w):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends d implements Iterable<b>, Iterator<b> {

        /* renamed from: h, reason: collision with root package name */
        public final b f1660h;

        public a(w wVar) {
            super(wVar);
            this.f1660h = new b();
        }

        @Override // a3.w.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b next() {
            if (!this.f1665a) {
                throw new NoSuchElementException();
            }
            if (!this.f1669e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            w wVar = this.f1666b;
            int[] iArr = wVar.f1646b;
            int i11 = this.f1667c;
            if (i11 == -1) {
                b bVar = this.f1660h;
                bVar.f1661a = 0;
                bVar.f1662b = wVar.f1648d;
            } else {
                b bVar2 = this.f1660h;
                bVar2.f1661a = iArr[i11];
                bVar2.f1662b = wVar.f1647c[i11];
            }
            this.f1668d = i11;
            a();
            return this.f1660h;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1669e) {
                return this.f1665a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // a3.w.d, java.util.Iterator
        public void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        public Iterator<b> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends d {
        public e(w wVar) {
            super(wVar);
        }

        @Override // a3.w.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public float f() {
            if (!this.f1665a) {
                throw new NoSuchElementException();
            }
            if (!this.f1669e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f1667c;
            float f11 = i11 == -1 ? this.f1666b.f1648d : this.f1666b.f1647c[i11];
            this.f1668d = i11;
            a();
            return f11;
        }

        public r g() {
            r rVar = new r(true, this.f1666b.f1645a);
            while (this.f1665a) {
                rVar.a(f());
            }
            return rVar;
        }

        public r h(r rVar) {
            while (this.f1665a) {
                rVar.a(f());
            }
            return rVar;
        }

        public boolean hasNext() {
            if (this.f1669e) {
                return this.f1665a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // a3.w.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public e d() {
            return this;
        }
    }
}
