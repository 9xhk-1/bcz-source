package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f78167a;

    /* renamed from: b, reason: collision with root package name */
    public final x f78168b;

    /* renamed from: c, reason: collision with root package name */
    public final e f78169c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78170d;

    /* renamed from: e, reason: collision with root package name */
    public p90.d f78171e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f78172f;

    public m(int i11) {
        this(null, i11);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public String[] a() {
        if (this.f78172f == null) {
            x xVar = this.f78168b;
            if (xVar == null) {
                this.f78172f = d.f78085a;
            }
            this.f78172f = xVar.f();
        }
        return this.f78172f;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public boolean c() {
        x xVar = this.f78168b;
        if (xVar == null) {
            return false;
        }
        return xVar.k();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int e(String str) {
        return this.f78169c.b(str);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public String[] f() {
        if (this.f78172f == null) {
            a();
        }
        int[] g11 = g();
        if (g11 == null) {
            return a();
        }
        String[] strArr = new String[g11.length];
        String[] a11 = a();
        for (int i11 = 0; i11 < g11.length; i11++) {
            strArr[i11] = a11[g11[i11]];
        }
        return strArr;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.y
    public int[] g() {
        x xVar = this.f78168b;
        if (xVar == null) {
            return null;
        }
        return xVar.h();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int h(Enum<?> r22) {
        return this.f78169c.a(r22);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public boolean isStopped() {
        return this.f78167a;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public p90.c k(String[] strArr) {
        if (this.f78171e == null) {
            this.f78171e = new p90.d(this);
        }
        return this.f78171e.c(strArr);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int l() {
        return this.f78170d;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int m() {
        x xVar = this.f78168b;
        if (xVar == null) {
            return -1;
        }
        return xVar.c();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public long p() {
        x xVar = this.f78168b;
        if (xVar == null) {
            return -1L;
        }
        return xVar.d();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public p90.f s() {
        if (this.f78171e == null) {
            this.f78171e = new p90.d(this);
        }
        return this.f78171e.b();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public void stop() {
        this.f78167a = true;
    }

    public void u() {
        x xVar = this.f78168b;
        if (xVar != null) {
            xVar.l();
        }
        this.f78171e = null;
        this.f78169c.c();
    }

    public m(x xVar, int i11) {
        this.f78167a = false;
        this.f78168b = xVar;
        this.f78170d = i11;
        this.f78169c = new e(this, xVar);
    }
}
