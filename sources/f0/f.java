package f0;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Drawable f50285a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50286b;

    public f(@m80.k Drawable drawable, boolean z11) {
        this.f50285a = drawable;
        this.f50286b = z11;
    }

    public static /* synthetic */ f b(f fVar, Drawable drawable, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = fVar.f50285a;
        }
        if ((i11 & 2) != 0) {
            z11 = fVar.f50286b;
        }
        return fVar.a(drawable, z11);
    }

    @m80.k
    public final f a(@m80.k Drawable drawable, boolean z11) {
        return new f(drawable, z11);
    }

    @m80.k
    public final Drawable c() {
        return this.f50285a;
    }

    public final boolean d() {
        return this.f50286b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.g0.g(this.f50285a, fVar.f50285a) && this.f50286b == fVar.f50286b;
    }

    public int hashCode() {
        return (this.f50285a.hashCode() * 31) + Boolean.hashCode(this.f50286b);
    }
}
