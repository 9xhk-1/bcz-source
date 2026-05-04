package fn;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class s6 {

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f52247a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public l f52248b;

    /* renamed from: c, reason: collision with root package name */
    public double f52249c;

    /* renamed from: d, reason: collision with root package name */
    public double f52250d;

    public s6(double d11, double d12, l lVar) {
        this.f52249c = d11;
        this.f52250d = d12;
        this.f52248b = lVar;
    }

    public static l a(double d11, double d12) {
        l a11 = l.a(d11, d12, 50.0d);
        double abs = Math.abs(a11.c() - d12);
        for (double d13 = 1.0d; d13 < 50.0d && Math.round(d12) != Math.round(a11.c()); d13 += 1.0d) {
            l a12 = l.a(d11, d12, 50.0d + d13);
            double abs2 = Math.abs(a12.c() - d12);
            if (abs2 < abs) {
                abs = abs2;
                a11 = a12;
            }
            l a13 = l.a(d11, d12, 50.0d - d13);
            double abs3 = Math.abs(a13.c() - d12);
            if (abs3 < abs) {
                abs = abs3;
                a11 = a13;
            }
        }
        return a11;
    }

    public static s6 b(l lVar) {
        return new s6(lVar.d(), lVar.c(), lVar);
    }

    public static s6 c(double d11, double d12) {
        return new s6(d11, d12, a(d11, d12));
    }

    public static s6 d(int i11) {
        return b(l.b(i11));
    }

    public double e() {
        return this.f52250d;
    }

    public l f(double d11) {
        return l.a(this.f52249c, this.f52250d, d11);
    }

    public double g() {
        return this.f52249c;
    }

    public l h() {
        return this.f52248b;
    }

    public int i(int i11) {
        Integer num = this.f52247a.get(Integer.valueOf(i11));
        if (num == null) {
            num = Integer.valueOf(l.a(this.f52249c, this.f52250d, i11).k());
            this.f52247a.put(Integer.valueOf(i11), num);
        }
        return num.intValue();
    }
}
