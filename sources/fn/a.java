package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a {
    public static int a(int i11, int i12, double d11) {
        b b11 = b.b(i11);
        b b12 = b.b(i12);
        double n11 = b11.n();
        double i13 = b11.i();
        double j11 = b11.j();
        return b.f(n11 + ((b12.n() - n11) * d11), i13 + ((b12.i() - i13) * d11), j11 + ((b12.j() - j11) * d11)).r();
    }

    public static int b(int i11, int i12) {
        l b11 = l.b(i11);
        l b12 = l.b(i12);
        return l.a(v5.g(b11.d() + (Math.min(v5.c(b11.d(), b12.d()) * 0.5d, 15.0d) * v5.f(b11.d(), b12.d()))), b11.c(), b11.e()).k();
    }

    public static int c(int i11, int i12, double d11) {
        return l.a(b.b(a(i11, i12, d11)).l(), b.b(i11).k(), c.o(i11)).k();
    }
}
