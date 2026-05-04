package ri;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f84083c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f84084a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84085b;

    public c(float f11, boolean z11) {
        this.f84084a = f11;
        this.f84085b = z11;
    }

    public static /* synthetic */ c d(c cVar, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = cVar.f84084a;
        }
        if ((i11 & 2) != 0) {
            z11 = cVar.f84085b;
        }
        return cVar.c(f11, z11);
    }

    public final float a() {
        return this.f84084a;
    }

    public final boolean b() {
        return this.f84085b;
    }

    @m80.k
    public final c c(float f11, boolean z11) {
        return new c(f11, z11);
    }

    public final float e() {
        return this.f84084a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f84084a, cVar.f84084a) == 0 && this.f84085b == cVar.f84085b;
    }

    public final boolean f() {
        return this.f84085b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f84084a) * 31) + Boolean.hashCode(this.f84085b);
    }

    @m80.k
    public String toString() {
        return "ImageState(aspectRatio=" + this.f84084a + ", isExpanded=" + this.f84085b + pn.j.f81007d;
    }
}
