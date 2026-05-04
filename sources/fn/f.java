package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public s6 f52165a;

    /* renamed from: b, reason: collision with root package name */
    public s6 f52166b;

    /* renamed from: c, reason: collision with root package name */
    public s6 f52167c;

    /* renamed from: d, reason: collision with root package name */
    public s6 f52168d;

    /* renamed from: e, reason: collision with root package name */
    public s6 f52169e;

    /* renamed from: f, reason: collision with root package name */
    public s6 f52170f;

    public f(int i11, boolean z11) {
        l b11 = l.b(i11);
        double d11 = b11.d();
        double c11 = b11.c();
        if (z11) {
            this.f52165a = s6.c(d11, c11);
            this.f52166b = s6.c(d11, c11 / 3.0d);
            this.f52167c = s6.c(60.0d + d11, c11 / 2.0d);
            this.f52168d = s6.c(d11, Math.min(c11 / 12.0d, 4.0d));
            this.f52169e = s6.c(d11, Math.min(c11 / 6.0d, 8.0d));
        } else {
            this.f52165a = s6.c(d11, Math.max(48.0d, c11));
            this.f52166b = s6.c(d11, 16.0d);
            this.f52167c = s6.c(60.0d + d11, 24.0d);
            this.f52168d = s6.c(d11, 4.0d);
            this.f52169e = s6.c(d11, 8.0d);
        }
        this.f52170f = s6.c(25.0d, 84.0d);
    }

    public static f a(int i11) {
        return new f(i11, true);
    }

    public static f b(int i11) {
        return new f(i11, false);
    }
}
