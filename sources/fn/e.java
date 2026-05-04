package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f52132a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52133b;

    /* renamed from: c, reason: collision with root package name */
    public final double f52134c;

    /* renamed from: d, reason: collision with root package name */
    public final double f52135d;

    public e(double d11, double d12, double d13, double d14) {
        this.f52132a = d11;
        this.f52133b = d12;
        this.f52134c = d13;
        this.f52135d = d14;
    }

    public double a(double d11) {
        return d11 <= -1.0d ? this.f52132a : d11 < 0.0d ? v5.d(this.f52132a, this.f52133b, (d11 - (-1.0d)) / 1.0d) : d11 < 0.5d ? v5.d(this.f52133b, this.f52134c, (d11 - 0.0d) / 0.5d) : d11 < 1.0d ? v5.d(this.f52134c, this.f52135d, (d11 - 0.5d) / 0.5d) : this.f52135d;
    }
}
