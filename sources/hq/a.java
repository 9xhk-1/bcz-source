package hq;

import com.google.zxing.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a extends l {

    /* renamed from: c, reason: collision with root package name */
    public final float f59737c;

    public a(float f11, float f12, float f13) {
        super(f11, f12);
        this.f59737c = f13;
    }

    public boolean f(float f11, float f12, float f13) {
        if (Math.abs(f12 - d()) > f11 || Math.abs(f13 - c()) > f11) {
            return false;
        }
        float abs = Math.abs(f11 - this.f59737c);
        return abs <= 1.0f || abs <= this.f59737c;
    }

    public a g(float f11, float f12, float f13) {
        return new a((c() + f12) / 2.0f, (d() + f11) / 2.0f, (this.f59737c + f13) / 2.0f);
    }
}
