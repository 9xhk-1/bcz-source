package a3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class x implements Iterable<b> {

    /* renamed from: a, reason: collision with root package name */
    public int f1681a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1682b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1683c;

    /* renamed from: d, reason: collision with root package name */
    public int f1684d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1685e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1686f;

    /* renamed from: g, reason: collision with root package name */
    public int f1687g;

    /* renamed from: h, reason: collision with root package name */
    public int f1688h;

    /* renamed from: i, reason: collision with root package name */
    public int f1689i;

    /* renamed from: j, reason: collision with root package name */
    public transient a f1690j;

    /* renamed from: k, reason: collision with root package name */
    public transient a f1691k;

    /* renamed from: l, reason: collision with root package name */
    public transient e f1692l;

    /* renamed from: m, reason: collision with root package name */
    public transient e f1693m;

    /* renamed from: n, reason: collision with root package name */
    public transient c f1694n;

    /* renamed from: o, reason: collision with root package name */
    public transient c f1695o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1697a;

        /* renamed from: b, reason: collision with root package name */
        public int f1698b;

        public String toString() {
            return this.f1697a + ContainerUtils.KEY_VALUE_DELIMITER + this.f1698b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends d {
        public c(x xVar) {
            super(xVar);
        }

        @Override // a3.x.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public int d() {
            if (!this.f1701a) {
                throw new NoSuchElementException();
            }
            if (!this.f1705e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f1703c;
            int i12 = i11 == -1 ? 0 : this.f1702b.f1682b[i11];
            this.f1704d = i11;
            a();
            return i12;
        }

        public v f() {
            v vVar = new v(true, this.f1702b.f1681a);
            while (this.f1701a) {
                vVar.a(d());
            }
            return vVar;
        }

        public v g(v vVar) {
            while (this.f1701a) {
                vVar.a(d());
            }
            return vVar;
        }

        @Override // a3.x.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: f, reason: collision with root package name */
        public static final int f1699f = -2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f1700g = -1;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1701a;

        /* renamed from: b, reason: collision with root package name */
        public final x f1702b;

        /* renamed from: c, reason: collision with root package name */
        public int f1703c;

        /* renamed from: d, reason: collision with root package name */
        public int f1704d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1705e = true;

        public d(x xVar) {
            this.f1702b = xVar;
            b();
        }

        public void a() {
            int i11;
            int[] iArr = this.f1702b.f1682b;
            int length = iArr.length;
            do {
                i11 = this.f1703c + 1;
                this.f1703c = i11;
                if (i11 >= length) {
                    this.f1701a = false;
                    return;
                }
            } while (iArr[i11] == 0);
            this.f1701a = true;
        }

        public void b() {
            this.f1704d = -2;
            this.f1703c = -1;
            if (this.f1702b.f1685e) {
                this.f1701a = true;
            } else {
                a();
            }
        }

        public void remove() {
            int i11 = this.f1704d;
            if (i11 == -1) {
                x xVar = this.f1702b;
                if (xVar.f1685e) {
                    xVar.f1685e = false;
                    this.f1704d = -2;
                    x xVar2 = this.f1702b;
                    xVar2.f1681a--;
                }
            }
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            x xVar3 = this.f1702b;
            int[] iArr = xVar3.f1682b;
            int[] iArr2 = xVar3.f1683c;
            int i12 = xVar3.f1689i;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                int i15 = iArr[i14];
                if (i15 == 0) {
                    break;
                }
                int o11 = this.f1702b.o(i15);
                if (((i14 - o11) & i12) > ((i11 - o11) & i12)) {
                    iArr[i11] = i15;
                    iArr2[i11] = iArr2[i14];
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            iArr[i11] = 0;
            if (i11 != this.f1704d) {
                this.f1703c--;
            }
            this.f1704d = -2;
            x xVar22 = this.f1702b;
            xVar22.f1681a--;
        }
    }

    public x() {
        this(51, 0.8f);
    }

    public void a(int i11) {
        int s11 = com.badlogic.gdx.utils.m.s(i11, this.f1686f);
        if (this.f1682b.length <= s11) {
            clear();
            return;
        }
        this.f1681a = 0;
        this.f1685e = false;
        u(s11);
    }

    public boolean b(int i11) {
        return i11 == 0 ? this.f1685e : m(i11) >= 0;
    }

    public void clear() {
        if (this.f1681a == 0) {
            return;
        }
        Arrays.fill(this.f1682b, 0);
        this.f1681a = 0;
        this.f1685e = false;
    }

    public boolean d(int i11) {
        if (this.f1685e && this.f1684d == i11) {
            return true;
        }
        int[] iArr = this.f1682b;
        int[] iArr2 = this.f1683c;
        for (int length = iArr2.length - 1; length >= 0; length--) {
            if (iArr[length] != 0 && iArr2[length] == i11) {
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
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f1681a != this.f1681a) {
            return false;
        }
        boolean z11 = xVar.f1685e;
        boolean z12 = this.f1685e;
        if (z11 != z12) {
            return false;
        }
        if (z12 && xVar.f1684d != this.f1684d) {
            return false;
        }
        int[] iArr = this.f1682b;
        int[] iArr2 = this.f1683c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0 && (((j11 = xVar.j(i12, 0)) == 0 && !xVar.b(i12)) || j11 != iArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public void f(int i11) {
        int s11 = com.badlogic.gdx.utils.m.s(this.f1681a + i11, this.f1686f);
        if (this.f1682b.length < s11) {
            u(s11);
        }
    }

    public a g() {
        if (k.f1553a) {
            return new a(this);
        }
        if (this.f1690j == null) {
            this.f1690j = new a(this);
            this.f1691k = new a(this);
        }
        a aVar = this.f1690j;
        if (aVar.f1705e) {
            this.f1691k.b();
            a aVar2 = this.f1691k;
            aVar2.f1705e = true;
            this.f1690j.f1705e = false;
            return aVar2;
        }
        aVar.b();
        a aVar3 = this.f1690j;
        aVar3.f1705e = true;
        this.f1691k.f1705e = false;
        return aVar3;
    }

    public int h(int i11, int i12) {
        if (this.f1685e && this.f1684d == i11) {
            return 0;
        }
        int[] iArr = this.f1682b;
        int[] iArr2 = this.f1683c;
        for (int length = iArr2.length - 1; length >= 0; length--) {
            int i13 = iArr[length];
            if (i13 != 0 && iArr2[length] == i11) {
                return i13;
            }
        }
        return i12;
    }

    public int hashCode() {
        int i11 = this.f1681a;
        if (this.f1685e) {
            i11 += this.f1684d;
        }
        int[] iArr = this.f1682b;
        int[] iArr2 = this.f1683c;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                i11 += (i13 * 31) + iArr2[i12];
            }
        }
        return i11;
    }

    public boolean isEmpty() {
        return this.f1681a == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return g();
    }

    public int j(int i11, int i12) {
        if (i11 != 0) {
            int m11 = m(i11);
            if (m11 >= 0) {
                return this.f1683c[m11];
            }
        } else if (this.f1685e) {
            return this.f1684d;
        }
        return i12;
    }

    public int k(int i11, int i12, int i13) {
        if (i11 == 0) {
            if (this.f1685e) {
                int i14 = this.f1684d;
                this.f1684d = i13 + i14;
                return i14;
            }
            this.f1685e = true;
            this.f1684d = i13 + i12;
            this.f1681a++;
            return i12;
        }
        int m11 = m(i11);
        if (m11 >= 0) {
            int[] iArr = this.f1683c;
            int i15 = iArr[m11];
            iArr[m11] = i13 + i15;
            return i15;
        }
        int i16 = -(m11 + 1);
        int[] iArr2 = this.f1682b;
        iArr2[i16] = i11;
        this.f1683c[i16] = i13 + i12;
        int i17 = this.f1681a + 1;
        this.f1681a = i17;
        if (i17 >= this.f1687g) {
            u(iArr2.length << 1);
        }
        return i12;
    }

    public c l() {
        if (k.f1553a) {
            return new c(this);
        }
        if (this.f1694n == null) {
            this.f1694n = new c(this);
            this.f1695o = new c(this);
        }
        c cVar = this.f1694n;
        if (cVar.f1705e) {
            this.f1695o.b();
            c cVar2 = this.f1695o;
            cVar2.f1705e = true;
            this.f1694n.f1705e = false;
            return cVar2;
        }
        cVar.b();
        c cVar3 = this.f1694n;
        cVar3.f1705e = true;
        this.f1695o.f1705e = false;
        return cVar3;
    }

    public final int m(int i11) {
        int[] iArr = this.f1682b;
        int o11 = o(i11);
        while (true) {
            int i12 = iArr[o11];
            if (i12 == 0) {
                return -(o11 + 1);
            }
            if (i12 == i11) {
                return o11;
            }
            o11 = (o11 + 1) & this.f1689i;
        }
    }

    public boolean n() {
        return this.f1681a > 0;
    }

    public int o(int i11) {
        return (int) ((i11 * (-7046029254386353131L)) >>> this.f1688h);
    }

    public int p(int i11, int i12, int i13) {
        if (i11 == 0) {
            int i14 = this.f1684d;
            this.f1684d = i12;
            if (this.f1685e) {
                return i14;
            }
            this.f1685e = true;
            this.f1681a++;
            return i13;
        }
        int m11 = m(i11);
        if (m11 >= 0) {
            int[] iArr = this.f1683c;
            int i15 = iArr[m11];
            iArr[m11] = i12;
            return i15;
        }
        int i16 = -(m11 + 1);
        int[] iArr2 = this.f1682b;
        iArr2[i16] = i11;
        this.f1683c[i16] = i12;
        int i17 = this.f1681a + 1;
        this.f1681a = i17;
        if (i17 >= this.f1687g) {
            u(iArr2.length << 1);
        }
        return i13;
    }

    public void q(int i11, int i12) {
        if (i11 == 0) {
            this.f1684d = i12;
            if (this.f1685e) {
                return;
            }
            this.f1685e = true;
            this.f1681a++;
            return;
        }
        int m11 = m(i11);
        if (m11 >= 0) {
            this.f1683c[m11] = i12;
            return;
        }
        int i13 = -(m11 + 1);
        int[] iArr = this.f1682b;
        iArr[i13] = i11;
        this.f1683c[i13] = i12;
        int i14 = this.f1681a + 1;
        this.f1681a = i14;
        if (i14 >= this.f1687g) {
            u(iArr.length << 1);
        }
    }

    public void r(x xVar) {
        f(xVar.f1681a);
        if (xVar.f1685e) {
            q(0, xVar.f1684d);
        }
        int[] iArr = xVar.f1682b;
        int[] iArr2 = xVar.f1683c;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                q(i12, iArr2[i11]);
            }
        }
    }

    public final void s(int i11, int i12) {
        int[] iArr = this.f1682b;
        int o11 = o(i11);
        while (iArr[o11] != 0) {
            o11 = (o11 + 1) & this.f1689i;
        }
        iArr[o11] = i11;
        this.f1683c[o11] = i12;
    }

    public int t(int i11, int i12) {
        if (i11 != 0) {
            int m11 = m(i11);
            if (m11 >= 0) {
                int[] iArr = this.f1682b;
                int[] iArr2 = this.f1683c;
                int i13 = iArr2[m11];
                int i14 = this.f1689i;
                int i15 = m11 + 1;
                while (true) {
                    int i16 = i15 & i14;
                    int i17 = iArr[i16];
                    if (i17 == 0) {
                        iArr[m11] = 0;
                        this.f1681a--;
                        return i13;
                    }
                    int o11 = o(i17);
                    if (((i16 - o11) & i14) > ((m11 - o11) & i14)) {
                        iArr[m11] = i17;
                        iArr2[m11] = iArr2[i16];
                        m11 = i16;
                    }
                    i15 = i16 + 1;
                }
            }
        } else if (this.f1685e) {
            this.f1685e = false;
            this.f1681a--;
            return this.f1684d;
        }
        return i12;
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
            int r0 = r7.f1681a
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.f1682b
            int[] r2 = r7.f1683c
            int r3 = r1.length
            boolean r4 = r7.f1685e
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            int r4 = r7.f1684d
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
        throw new UnsupportedOperationException("Method not decompiled: a3.x.toString():java.lang.String");
    }

    public final void u(int i11) {
        int length = this.f1682b.length;
        this.f1687g = (int) (i11 * this.f1686f);
        int i12 = i11 - 1;
        this.f1689i = i12;
        this.f1688h = Long.numberOfLeadingZeros(i12);
        int[] iArr = this.f1682b;
        int[] iArr2 = this.f1683c;
        this.f1682b = new int[i11];
        this.f1683c = new int[i11];
        if (this.f1681a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 != 0) {
                    s(i14, iArr2[i13]);
                }
            }
        }
    }

    public void v(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = com.badlogic.gdx.utils.m.s(i11, this.f1686f);
        if (this.f1682b.length > s11) {
            u(s11);
        }
    }

    public e w() {
        if (k.f1553a) {
            return new e(this);
        }
        if (this.f1692l == null) {
            this.f1692l = new e(this);
            this.f1693m = new e(this);
        }
        e eVar = this.f1692l;
        if (eVar.f1705e) {
            this.f1693m.b();
            e eVar2 = this.f1693m;
            eVar2.f1705e = true;
            this.f1692l.f1705e = false;
            return eVar2;
        }
        eVar.b();
        e eVar3 = this.f1692l;
        eVar3.f1705e = true;
        this.f1693m.f1705e = false;
        return eVar3;
    }

    public x(int i11) {
        this(i11, 0.8f);
    }

    public x(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f1686f = f11;
            int s11 = com.badlogic.gdx.utils.m.s(i11, f11);
            this.f1687g = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f1689i = i12;
            this.f1688h = Long.numberOfLeadingZeros(i12);
            this.f1682b = new int[s11];
            this.f1683c = new int[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(a3.x r5) {
        /*
            r4 = this;
            int[] r0 = r5.f1682b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f1686f
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            int[] r0 = r5.f1682b
            int[] r1 = r4.f1682b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int[] r0 = r5.f1683c
            int[] r1 = r4.f1683c
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r5.f1681a
            r4.f1681a = r0
            int r0 = r5.f1684d
            r4.f1684d = r0
            boolean r5 = r5.f1685e
            r4.f1685e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x.<init>(a3.x):void");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends d implements Iterable<b>, Iterator<b> {

        /* renamed from: h, reason: collision with root package name */
        public final b f1696h;

        public a(x xVar) {
            super(xVar);
            this.f1696h = new b();
        }

        @Override // a3.x.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b next() {
            if (!this.f1701a) {
                throw new NoSuchElementException();
            }
            if (!this.f1705e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            x xVar = this.f1702b;
            int[] iArr = xVar.f1682b;
            int i11 = this.f1703c;
            if (i11 == -1) {
                b bVar = this.f1696h;
                bVar.f1697a = 0;
                bVar.f1698b = xVar.f1684d;
            } else {
                b bVar2 = this.f1696h;
                bVar2.f1697a = iArr[i11];
                bVar2.f1698b = xVar.f1683c[i11];
            }
            this.f1704d = i11;
            a();
            return this.f1696h;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1705e) {
                return this.f1701a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // a3.x.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // java.lang.Iterable
        public Iterator<b> iterator() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends d {
        public e(x xVar) {
            super(xVar);
        }

        @Override // a3.x.d
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        public int f() {
            if (!this.f1701a) {
                throw new NoSuchElementException();
            }
            if (!this.f1705e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f1703c;
            int i12 = i11 == -1 ? this.f1702b.f1684d : this.f1702b.f1683c[i11];
            this.f1704d = i11;
            a();
            return i12;
        }

        public v g() {
            v vVar = new v(true, this.f1702b.f1681a);
            while (this.f1701a) {
                vVar.a(f());
            }
            return vVar;
        }

        public v h(v vVar) {
            while (this.f1701a) {
                vVar.a(f());
            }
            return vVar;
        }

        public boolean hasNext() {
            if (this.f1705e) {
                return this.f1701a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // a3.x.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public e d() {
            return this;
        }
    }
}
