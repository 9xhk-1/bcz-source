package com.badlogic.gdx.utils;

import a3.v;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f13244a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f13245b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13246c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13247d;

    /* renamed from: e, reason: collision with root package name */
    public int f13248e;

    /* renamed from: f, reason: collision with root package name */
    public int f13249f;

    /* renamed from: g, reason: collision with root package name */
    public int f13250g;

    /* renamed from: h, reason: collision with root package name */
    public transient a f13251h;

    /* renamed from: i, reason: collision with root package name */
    public transient a f13252i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f13253f = -2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f13254g = -1;

        /* renamed from: a, reason: collision with root package name */
        public boolean f13255a;

        /* renamed from: b, reason: collision with root package name */
        public final e f13256b;

        /* renamed from: c, reason: collision with root package name */
        public int f13257c;

        /* renamed from: d, reason: collision with root package name */
        public int f13258d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13259e = true;

        public a(e eVar) {
            this.f13256b = eVar;
            d();
        }

        public void a() {
            int i11;
            int[] iArr = this.f13256b.f13245b;
            int length = iArr.length;
            do {
                i11 = this.f13257c + 1;
                this.f13257c = i11;
                if (i11 >= length) {
                    this.f13255a = false;
                    return;
                }
            } while (iArr[i11] == 0);
            this.f13255a = true;
        }

        public int b() {
            if (!this.f13255a) {
                throw new NoSuchElementException();
            }
            if (!this.f13259e) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i11 = this.f13257c;
            int i12 = i11 == -1 ? 0 : this.f13256b.f13245b[i11];
            this.f13258d = i11;
            a();
            return i12;
        }

        public void c() {
            int i11 = this.f13258d;
            if (i11 == -1) {
                e eVar = this.f13256b;
                if (eVar.f13246c) {
                    eVar.f13246c = false;
                    this.f13258d = -2;
                    e eVar2 = this.f13256b;
                    eVar2.f13244a--;
                }
            }
            if (i11 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            e eVar3 = this.f13256b;
            int[] iArr = eVar3.f13245b;
            int i12 = eVar3.f13250g;
            int i13 = i11 + 1;
            while (true) {
                int i14 = i13 & i12;
                int i15 = iArr[i14];
                if (i15 == 0) {
                    break;
                }
                int q11 = this.f13256b.q(i15);
                if (((i14 - q11) & i12) > ((i11 - q11) & i12)) {
                    iArr[i11] = i15;
                    i11 = i14;
                }
                i13 = i14 + 1;
            }
            iArr[i11] = 0;
            if (i11 != this.f13258d) {
                this.f13257c--;
            }
            this.f13258d = -2;
            e eVar22 = this.f13256b;
            eVar22.f13244a--;
        }

        public void d() {
            this.f13258d = -2;
            this.f13257c = -1;
            if (this.f13256b.f13246c) {
                this.f13255a = true;
            } else {
                a();
            }
        }

        public v e() {
            v vVar = new v(true, this.f13256b.f13244a);
            while (this.f13255a) {
                vVar.a(b());
            }
            return vVar;
        }
    }

    public e() {
        this(51, 0.8f);
    }

    public static e u(int... iArr) {
        e eVar = new e();
        eVar.e(iArr);
        return eVar;
    }

    public boolean a(int i11) {
        if (i11 == 0) {
            if (this.f13246c) {
                return false;
            }
            this.f13246c = true;
            this.f13244a++;
            return true;
        }
        int o11 = o(i11);
        if (o11 >= 0) {
            return false;
        }
        int i12 = -(o11 + 1);
        int[] iArr = this.f13245b;
        iArr[i12] = i11;
        int i13 = this.f13244a + 1;
        this.f13244a = i13;
        if (i13 >= this.f13248e) {
            s(iArr.length << 1);
        }
        return true;
    }

    public void b(v vVar) {
        f(vVar.f1639a, 0, vVar.f1640b);
    }

    public void c(v vVar, int i11, int i12) {
        if (i11 + i12 <= vVar.f1640b) {
            f(vVar.f1639a, i11, i12);
            return;
        }
        throw new IllegalArgumentException("offset + length must be <= size: " + i11 + " + " + i12 + " <= " + vVar.f1640b);
    }

    public void d(e eVar) {
        k(eVar.f13244a);
        if (eVar.f13246c) {
            a(0);
        }
        for (int i11 : eVar.f13245b) {
            if (i11 != 0) {
                a(i11);
            }
        }
    }

    public void e(int... iArr) {
        f(iArr, 0, iArr.length);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f13244a != this.f13244a || eVar.f13246c != this.f13246c) {
            return false;
        }
        for (int i11 : this.f13245b) {
            if (i11 != 0 && !eVar.j(i11)) {
                return false;
            }
        }
        return true;
    }

    public void f(int[] iArr, int i11, int i12) {
        k(i12);
        int i13 = i12 + i11;
        while (i11 < i13) {
            a(iArr[i11]);
            i11++;
        }
    }

    public final void g(int i11) {
        int[] iArr = this.f13245b;
        int q11 = q(i11);
        while (iArr[q11] != 0) {
            q11 = (q11 + 1) & this.f13250g;
        }
        iArr[q11] = i11;
    }

    public void h() {
        if (this.f13244a == 0) {
            return;
        }
        this.f13244a = 0;
        Arrays.fill(this.f13245b, 0);
        this.f13246c = false;
    }

    public int hashCode() {
        int i11 = this.f13244a;
        for (int i12 : this.f13245b) {
            if (i12 != 0) {
                i11 += i12;
            }
        }
        return i11;
    }

    public void i(int i11) {
        int s11 = m.s(i11, this.f13247d);
        if (this.f13245b.length <= s11) {
            h();
            return;
        }
        this.f13244a = 0;
        this.f13246c = false;
        s(s11);
    }

    public boolean j(int i11) {
        return i11 == 0 ? this.f13246c : o(i11) >= 0;
    }

    public void k(int i11) {
        int s11 = m.s(this.f13244a + i11, this.f13247d);
        if (this.f13245b.length < s11) {
            s(s11);
        }
    }

    public int l() {
        if (this.f13246c) {
            return 0;
        }
        for (int i11 : this.f13245b) {
            if (i11 != 0) {
                return i11;
            }
        }
        throw new IllegalStateException("IntSet is empty.");
    }

    public boolean m() {
        return this.f13244a == 0;
    }

    public a n() {
        if (a3.k.f1553a) {
            return new a(this);
        }
        if (this.f13251h == null) {
            this.f13251h = new a(this);
            this.f13252i = new a(this);
        }
        a aVar = this.f13251h;
        if (aVar.f13259e) {
            this.f13252i.d();
            a aVar2 = this.f13252i;
            aVar2.f13259e = true;
            this.f13251h.f13259e = false;
            return aVar2;
        }
        aVar.d();
        a aVar3 = this.f13251h;
        aVar3.f13259e = true;
        this.f13252i.f13259e = false;
        return aVar3;
    }

    public final int o(int i11) {
        int[] iArr = this.f13245b;
        int q11 = q(i11);
        while (true) {
            int i12 = iArr[q11];
            if (i12 == 0) {
                return -(q11 + 1);
            }
            if (i12 == i11) {
                return q11;
            }
            q11 = (q11 + 1) & this.f13250g;
        }
    }

    public boolean p() {
        return this.f13244a > 0;
    }

    public int q(int i11) {
        return (int) ((i11 * (-7046029254386353131L)) >>> this.f13249f);
    }

    public boolean r(int i11) {
        if (i11 == 0) {
            if (!this.f13246c) {
                return false;
            }
            this.f13246c = false;
            this.f13244a--;
            return true;
        }
        int o11 = o(i11);
        if (o11 < 0) {
            return false;
        }
        int[] iArr = this.f13245b;
        int i12 = this.f13250g;
        int i13 = o11 + 1;
        while (true) {
            int i14 = i13 & i12;
            int i15 = iArr[i14];
            if (i15 == 0) {
                iArr[o11] = 0;
                this.f13244a--;
                return true;
            }
            int q11 = q(i15);
            if (((i14 - q11) & i12) > ((o11 - q11) & i12)) {
                iArr[o11] = i15;
                o11 = i14;
            }
            i13 = i14 + 1;
        }
    }

    public final void s(int i11) {
        int length = this.f13245b.length;
        this.f13248e = (int) (i11 * this.f13247d);
        int i12 = i11 - 1;
        this.f13250g = i12;
        this.f13249f = Long.numberOfLeadingZeros(i12);
        int[] iArr = this.f13245b;
        this.f13245b = new int[i11];
        if (this.f13244a > 0) {
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 != 0) {
                    g(i14);
                }
            }
        }
    }

    public void t(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("maximumCapacity must be >= 0: " + i11);
        }
        int s11 = m.s(i11, this.f13247d);
        if (this.f13245b.length > s11) {
            s(s11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002d -> B:9:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.f13244a
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r5.f13245b
            int r2 = r1.length
            boolean r3 = r5.f13246c
            if (r3 == 0) goto L20
            java.lang.String r3 = "0"
            r0.append(r3)
            goto L2e
        L20:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L2d
            r2 = r1[r3]
            if (r2 != 0) goto L2a
            r2 = r3
            goto L20
        L2a:
            r0.append(r2)
        L2d:
            r2 = r3
        L2e:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L40
            r2 = r1[r3]
            if (r2 != 0) goto L37
            goto L2d
        L37:
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r2)
            goto L2d
        L40:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.e.toString():java.lang.String");
    }

    public e(int i11) {
        this(i11, 0.8f);
    }

    public e(int i11, float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f13247d = f11;
            int s11 = m.s(i11, f11);
            this.f13248e = (int) (s11 * f11);
            int i12 = s11 - 1;
            this.f13250g = i12;
            this.f13249f = Long.numberOfLeadingZeros(i12);
            this.f13245b = new int[s11];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(com.badlogic.gdx.utils.e r5) {
        /*
            r4 = this;
            int[] r0 = r5.f13245b
            int r0 = r0.length
            float r0 = (float) r0
            float r1 = r5.f13247d
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.<init>(r0, r1)
            int[] r0 = r5.f13245b
            int[] r1 = r4.f13245b
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r5.f13244a
            r4.f13244a = r0
            boolean r5 = r5.f13246c
            r4.f13246c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.e.<init>(com.badlogic.gdx.utils.e):void");
    }
}
