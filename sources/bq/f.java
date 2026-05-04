package bq;

import java.util.Formatter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7209e = 2;

    /* renamed from: a, reason: collision with root package name */
    public final a f7210a;

    /* renamed from: b, reason: collision with root package name */
    public final g[] f7211b;

    /* renamed from: c, reason: collision with root package name */
    public c f7212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7213d;

    public f(a aVar, c cVar) {
        this.f7210a = aVar;
        int a11 = aVar.a();
        this.f7213d = a11;
        this.f7212c = cVar;
        this.f7211b = new g[a11 + 2];
    }

    public static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    public static int c(int i11, int i12, d dVar) {
        if (dVar == null || dVar.g()) {
            return i12;
        }
        if (!dVar.h(i11)) {
            return i12 + 1;
        }
        dVar.i(i11);
        return 0;
    }

    public final void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f7210a);
        }
    }

    public final int d() {
        int f11 = f();
        if (f11 == 0) {
            return 0;
        }
        for (int i11 = 1; i11 < this.f7213d + 1; i11++) {
            d[] d11 = this.f7211b[i11].d();
            for (int i12 = 0; i12 < d11.length; i12++) {
                d dVar = d11[i12];
                if (dVar != null && !dVar.g()) {
                    e(i11, i12, d11);
                }
            }
        }
        return f11;
    }

    public final void e(int i11, int i12, d[] dVarArr) {
        d dVar = dVarArr[i12];
        d[] d11 = this.f7211b[i11 - 1].d();
        g gVar = this.f7211b[i11 + 1];
        d[] d12 = gVar != null ? gVar.d() : d11;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d11[i12];
        dVarArr2[3] = d12[i12];
        if (i12 > 0) {
            int i13 = i12 - 1;
            dVarArr2[0] = dVarArr[i13];
            dVarArr2[4] = d11[i13];
            dVarArr2[5] = d12[i13];
        }
        if (i12 > 1) {
            int i14 = i12 - 2;
            dVarArr2[8] = dVarArr[i14];
            dVarArr2[10] = d11[i14];
            dVarArr2[11] = d12[i14];
        }
        if (i12 < dVarArr.length - 1) {
            int i15 = i12 + 1;
            dVarArr2[1] = dVarArr[i15];
            dVarArr2[6] = d11[i15];
            dVarArr2[7] = d12[i15];
        }
        if (i12 < dVarArr.length - 2) {
            int i16 = i12 + 2;
            dVarArr2[9] = dVarArr[i16];
            dVarArr2[12] = d11[i16];
            dVarArr2[13] = d12[i16];
        }
        for (int i17 = 0; i17 < 14 && !b(dVar, dVarArr2[i17]); i17++) {
        }
    }

    public final int f() {
        g();
        return h() + i();
    }

    public final void g() {
        g[] gVarArr = this.f7211b;
        g gVar = gVarArr[0];
        if (gVar == null || gVarArr[this.f7213d + 1] == null) {
            return;
        }
        d[] d11 = gVar.d();
        d[] d12 = this.f7211b[this.f7213d + 1].d();
        for (int i11 = 0; i11 < d11.length; i11++) {
            d dVar = d11[i11];
            if (dVar != null && d12[i11] != null && dVar.c() == d12[i11].c()) {
                for (int i12 = 1; i12 <= this.f7213d; i12++) {
                    d dVar2 = this.f7211b[i12].d()[i11];
                    if (dVar2 != null) {
                        dVar2.i(d11[i11].c());
                        if (!dVar2.g()) {
                            this.f7211b[i12].d()[i11] = null;
                        }
                    }
                }
            }
        }
    }

    public final int h() {
        g gVar = this.f7211b[0];
        if (gVar == null) {
            return 0;
        }
        d[] d11 = gVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < d11.length; i12++) {
            d dVar = d11[i12];
            if (dVar != null) {
                int c11 = dVar.c();
                int i13 = 0;
                for (int i14 = 1; i14 < this.f7213d + 1 && i13 < 2; i14++) {
                    d dVar2 = this.f7211b[i14].d()[i12];
                    if (dVar2 != null) {
                        i13 = c(c11, i13, dVar2);
                        if (!dVar2.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    public final int i() {
        g[] gVarArr = this.f7211b;
        int i11 = this.f7213d;
        if (gVarArr[i11 + 1] == null) {
            return 0;
        }
        d[] d11 = gVarArr[i11 + 1].d();
        int i12 = 0;
        for (int i13 = 0; i13 < d11.length; i13++) {
            d dVar = d11[i13];
            if (dVar != null) {
                int c11 = dVar.c();
                int i14 = 0;
                for (int i15 = this.f7213d + 1; i15 > 0 && i14 < 2; i15--) {
                    d dVar2 = this.f7211b[i15].d()[i13];
                    if (dVar2 != null) {
                        i14 = c(c11, i14, dVar2);
                        if (!dVar2.g()) {
                            i12++;
                        }
                    }
                }
            }
        }
        return i12;
    }

    public int j() {
        return this.f7213d;
    }

    public int k() {
        return this.f7210a.b();
    }

    public int l() {
        return this.f7210a.c();
    }

    public c m() {
        return this.f7212c;
    }

    public g n(int i11) {
        return this.f7211b[i11];
    }

    public g[] o() {
        a(this.f7211b[0]);
        a(this.f7211b[this.f7213d + 1]);
        int i11 = 928;
        while (true) {
            int d11 = d();
            if (d11 <= 0 || d11 >= i11) {
                break;
            }
            i11 = d11;
        }
        return this.f7211b;
    }

    public void p(c cVar) {
        this.f7212c = cVar;
    }

    public void q(int i11, g gVar) {
        this.f7211b[i11] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f7211b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f7213d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i11 = 0; i11 < gVar.d().length; i11++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i11));
                for (int i12 = 0; i12 < this.f7213d + 2; i12++) {
                    g gVar2 = this.f7211b[i12];
                    if (gVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVar2.d()[i11];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
