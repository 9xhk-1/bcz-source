package rm;

import java.util.List;
import rm.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f extends h.a {

    /* renamed from: e, reason: collision with root package name */
    public static h<f> f84260e;

    /* renamed from: c, reason: collision with root package name */
    public double f84261c;

    /* renamed from: d, reason: collision with root package name */
    public double f84262d;

    static {
        h<f> a11 = h.a(64, new f(0.0d, 0.0d));
        f84260e = a11;
        a11.l(0.5f);
    }

    public f(double d11, double d12) {
        this.f84261c = d11;
        this.f84262d = d12;
    }

    public static f b(double d11, double d12) {
        f b11 = f84260e.b();
        b11.f84261c = d11;
        b11.f84262d = d12;
        return b11;
    }

    public static void c(f fVar) {
        f84260e.h(fVar);
    }

    public static void d(List<f> list) {
        f84260e.g(list);
    }

    @Override // rm.h.a
    public h.a a() {
        return new f(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f84261c + ", y: " + this.f84262d;
    }
}
