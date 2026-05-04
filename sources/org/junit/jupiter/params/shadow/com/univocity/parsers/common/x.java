package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f78197a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f78198b;

    /* renamed from: c, reason: collision with root package name */
    public final k90.a[] f78199c;

    /* renamed from: d, reason: collision with root package name */
    public final f<?> f78200d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78201e;

    /* renamed from: f, reason: collision with root package name */
    public final String f78202f;

    /* renamed from: g, reason: collision with root package name */
    public k90.a f78203g;

    /* renamed from: h, reason: collision with root package name */
    public final k90.a f78204h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f78205i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f78206j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f78207k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f78208l;

    /* renamed from: m, reason: collision with root package name */
    public NormalizedString[] f78209m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f78210n;

    /* renamed from: o, reason: collision with root package name */
    public long f78211o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f78212p;

    /* renamed from: q, reason: collision with root package name */
    public final Deque<String[]> f78213q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f78214r;

    /* renamed from: s, reason: collision with root package name */
    public final b<?> f78215s;

    public x(f<?> fVar) {
        this(null, fVar);
    }

    public final void a() {
        this.f78197a = 0;
        this.f78203g = this.f78199c[0];
    }

    public void b() {
        String[] strArr = this.f78198b;
        int i11 = this.f78197a;
        int i12 = i11 + 1;
        this.f78197a = i12;
        strArr[i11] = this.f78202f;
        this.f78203g = this.f78199c[i12];
    }

    public int c() {
        return this.f78197a;
    }

    public long d() {
        return this.f78211o;
    }

    public j90.m e() {
        return this.f78200d.m();
    }

    public String[] f() {
        if (this.f78208l == null) {
            this.f78208l = NormalizedString.toArray(g());
        }
        return this.f78208l;
    }

    public NormalizedString[] g() {
        b<?> bVar = this.f78215s;
        if (bVar != null) {
            bVar.k();
        }
        if (this.f78209m == null) {
            this.f78209m = NormalizedString.toIdentifierGroupArray(this.f78200d.p());
        }
        return this.f78209m;
    }

    public int[] h() {
        return this.f78210n;
    }

    public final void i(NormalizedString[] normalizedStringArr) {
        j90.m m11 = this.f78200d.m();
        if (m11 != null) {
            int[] V = m11.V(normalizedStringArr);
            this.f78210n = V;
            if (V != null) {
                Arrays.fill(this.f78199c, k90.j.h());
                int i11 = 0;
                while (true) {
                    int[] iArr = this.f78210n;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    int i12 = iArr[i11];
                    if (i12 != -1) {
                        this.f78199c[i12] = this.f78203g;
                    }
                    i11++;
                }
                boolean u02 = this.f78200d.u0();
                this.f78206j = u02;
                int length = normalizedStringArr == null ? this.f78210n.length : normalizedStringArr.length;
                if (!u02) {
                    k90.a[] aVarArr = this.f78199c;
                    if (length < aVarArr.length && !(m11 instanceof j90.k)) {
                        Arrays.fill(aVarArr, length, aVarArr.length, this.f78203g);
                    }
                }
                this.f78203g = this.f78199c[0];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r5 = this;
            r0 = 0
            r5.f78206j = r0
            r1 = 0
            r5.f78210n = r1
            k90.a r1 = r5.f78204h
            r5.f78203g = r1
            k90.a[] r2 = r5.f78199c
            java.util.Arrays.fill(r2, r1)
            int r1 = r5.f78197a
            if (r1 <= 0) goto L1c
            java.lang.String[] r2 = new java.lang.String[r1]
            r5.f78214r = r2
            java.lang.String[] r3 = r5.f78198b
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
        L1c:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?> r1 = r5.f78200d
            java.lang.String[] r1 = r1.p()
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r1 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.toIdentifierGroupArray(r1)
            r5.f78209m = r1
            r2 = 1
            if (r1 == 0) goto L34
            java.lang.Object r1 = r1.clone()
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r1 = (org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[]) r1
            r5.f78209m = r1
            goto L48
        L34:
            int r1 = r5.f78197a
            if (r1 <= 0) goto L48
            java.lang.String[] r1 = r5.f78214r
            java.lang.Object r1 = r1.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r1 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.toIdentifierGroupArray(r1)
            r5.f78209m = r1
            r1 = r2
            goto L49
        L48:
            r1 = r0
        L49:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<?> r3 = r5.f78215s
            if (r3 == 0) goto L66
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?> r4 = r5.f78200d
            boolean r4 = r4.s()
            r3.f78031s = r4
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<?> r3 = r5.f78215s
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?> r4 = r5.f78200d
            boolean r4 = r4.q()
            r3.f78032t = r4
            if (r1 == 0) goto L66
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<?> r3 = r5.f78215s
            r3.v()
        L66:
            if (r1 == 0) goto Lcb
            r1 = r0
        L69:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r3 = r5.f78209m
            int r4 = r3.length
            if (r1 >= r4) goto Lcb
            r3 = r3[r1]
            if (r3 == 0) goto Lc8
            boolean r3 = r3.isLiteral()
            if (r3 != 0) goto Lc8
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?> r3 = r5.f78200d
            boolean r3 = r3.q()
            if (r3 == 0) goto Lae
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?> r3 = r5.f78200d
            boolean r3 = r3.s()
            if (r3 == 0) goto L9b
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r3 = r5.f78209m
            r4 = r3[r1]
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString r4 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.valueOf(r4)
            r3[r1] = r4
            goto Lc8
        L9b:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r3 = r5.f78209m
            r4 = r3[r1]
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.G(r4, r2, r0)
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString r4 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.valueOf(r4)
            r3[r1] = r4
            goto Lc8
        Lae:
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.f<?> r3 = r5.f78200d
            boolean r3 = r3.s()
            if (r3 == 0) goto Lc8
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r3 = r5.f78209m
            r4 = r3[r1]
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.G(r4, r0, r2)
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString r4 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString.valueOf(r4)
            r3[r1] = r4
        Lc8:
            int r1 = r1 + 1
            goto L69
        Lcb:
            r5.f78205i = r2
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString[] r0 = r5.f78209m
            r5.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.jupiter.params.shadow.com.univocity.parsers.common.x.j():void");
    }

    public boolean k() {
        return this.f78206j;
    }

    public final void l() {
        this.f78205i = false;
        this.f78211o = 0L;
        this.f78197a = 0;
        this.f78209m = null;
        this.f78208l = null;
    }

    public String[] m() {
        int i11;
        if (!this.f78213q.isEmpty()) {
            return this.f78213q.poll();
        }
        if (this.f78197a <= 0) {
            if (this.f78201e) {
                return null;
            }
            if (!this.f78205i) {
                j();
            }
            this.f78211o++;
            if (!this.f78206j) {
                return new String[]{this.f78202f};
            }
            int[] iArr = this.f78210n;
            if (iArr.length == 0) {
                return d.f78085a;
            }
            String[] strArr = new String[iArr.length];
            Arrays.fill(strArr, this.f78202f);
            return strArr;
        }
        if (!this.f78205i) {
            j();
            if (this.f78200d.z0()) {
                Arrays.fill(this.f78198b, (Object) null);
                this.f78197a = 0;
                this.f78203g = this.f78199c[0];
                return null;
            }
            if (!this.f78206j && this.f78210n != null) {
                String[] strArr2 = new String[this.f78197a];
                int i12 = 0;
                while (true) {
                    int[] iArr2 = this.f78210n;
                    if (i12 >= iArr2.length) {
                        this.f78197a = 0;
                        return strArr2;
                    }
                    int i13 = iArr2[i12];
                    if (i13 < this.f78197a) {
                        strArr2[i13] = this.f78198b[i13];
                    }
                    i12++;
                }
            }
        }
        this.f78211o++;
        if (!this.f78206j) {
            if (this.f78207k) {
                i11 = this.f78197a;
            } else {
                i11 = this.f78197a;
                NormalizedString[] normalizedStringArr = this.f78209m;
                if (i11 < normalizedStringArr.length) {
                    i11 = normalizedStringArr.length;
                }
            }
            String[] strArr3 = new String[i11];
            System.arraycopy(this.f78198b, 0, strArr3, 0, this.f78197a);
            this.f78197a = 0;
            this.f78203g = this.f78199c[0];
            return strArr3;
        }
        int[] iArr3 = this.f78210n;
        if (iArr3.length == 0) {
            this.f78197a = 0;
            return d.f78085a;
        }
        String[] strArr4 = new String[iArr3.length];
        int i14 = 0;
        while (true) {
            int[] iArr4 = this.f78210n;
            if (i14 >= iArr4.length) {
                this.f78197a = 0;
                this.f78203g = this.f78199c[0];
                return strArr4;
            }
            int i15 = iArr4[i14];
            if (i15 >= this.f78197a || i15 == -1) {
                strArr4[i14] = this.f78202f;
            } else {
                strArr4[i14] = this.f78198b[i15];
            }
            i14++;
        }
    }

    public void n() {
        if (this.f78212p) {
            this.f78203g.o();
        }
        String[] strArr = this.f78198b;
        int i11 = this.f78197a;
        this.f78197a = i11 + 1;
        strArr[i11] = this.f78203g.A();
        this.f78203g = this.f78199c[this.f78197a];
    }

    public void o(String str) {
        String[] strArr = this.f78198b;
        int i11 = this.f78197a;
        int i12 = i11 + 1;
        this.f78197a = i12;
        strArr[i11] = str;
        this.f78203g = this.f78199c[i12];
    }

    public x(b<?> bVar, f<?> fVar) {
        this.f78197a = 0;
        this.f78212p = false;
        this.f78213q = new LinkedList();
        this.f78215s = bVar;
        k90.a B0 = fVar.B0();
        this.f78204h = B0;
        this.f78203g = B0;
        this.f78198b = new String[fVar.u()];
        k90.a[] aVarArr = new k90.a[fVar.u() + 1];
        this.f78199c = aVarArr;
        Arrays.fill(aVarArr, this.f78203g);
        this.f78200d = fVar;
        this.f78201e = fVar.z();
        this.f78202f = fVar.v();
        this.f78205i = false;
        this.f78211o = 0L;
        if (fVar.z0() && bVar != null) {
            bVar.f78031s = false;
            bVar.f78032t = false;
        }
        if (fVar.p() != null) {
            j();
        }
        this.f78207k = fVar.u0();
    }
}
