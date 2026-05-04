package fn;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.TonePolarity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public final j f52254a;

    /* renamed from: b, reason: collision with root package name */
    public final j f52255b;

    /* renamed from: c, reason: collision with root package name */
    public final double f52256c;

    /* renamed from: d, reason: collision with root package name */
    public final TonePolarity f52257d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52258e;

    public t6(@NonNull j jVar, @NonNull j jVar2, double d11, @NonNull TonePolarity tonePolarity, boolean z11) {
        this.f52254a = jVar;
        this.f52255b = jVar2;
        this.f52256c = d11;
        this.f52257d = tonePolarity;
        this.f52258e = z11;
    }

    public double a() {
        return this.f52256c;
    }

    @NonNull
    public TonePolarity b() {
        return this.f52257d;
    }

    @NonNull
    public j c() {
        return this.f52254a;
    }

    @NonNull
    public j d() {
        return this.f52255b;
    }

    public boolean e() {
        return this.f52258e;
    }
}
