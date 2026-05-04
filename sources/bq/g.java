package bq;

import java.util.Formatter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7214c = 5;

    /* renamed from: a, reason: collision with root package name */
    public final c f7215a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f7216b;

    public g(c cVar) {
        this.f7215a = new c(cVar);
        this.f7216b = new d[(cVar.e() - cVar.g()) + 1];
    }

    public final c a() {
        return this.f7215a;
    }

    public final d b(int i11) {
        return this.f7216b[e(i11)];
    }

    public final d c(int i11) {
        d dVar;
        d dVar2;
        d b11 = b(i11);
        if (b11 != null) {
            return b11;
        }
        for (int i12 = 1; i12 < 5; i12++) {
            int e11 = e(i11) - i12;
            if (e11 >= 0 && (dVar2 = this.f7216b[e11]) != null) {
                return dVar2;
            }
            int e12 = e(i11) + i12;
            d[] dVarArr = this.f7216b;
            if (e12 < dVarArr.length && (dVar = dVarArr[e12]) != null) {
                return dVar;
            }
        }
        return null;
    }

    public final d[] d() {
        return this.f7216b;
    }

    public final int e(int i11) {
        return i11 - this.f7215a.g();
    }

    public final void f(int i11, d dVar) {
        this.f7216b[e(i11)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i11 = 0;
            for (d dVar : this.f7216b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i11));
                    i11++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i11), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                    i11++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
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
}
