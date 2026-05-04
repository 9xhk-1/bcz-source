package hq;

import com.google.zxing.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends l {

    /* renamed from: c, reason: collision with root package name */
    public final float f59749c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59750d;

    public d(float f11, float f12, float f13) {
        this(f11, f12, f13, 1);
    }

    public boolean f(float f11, float f12, float f13) {
        if (Math.abs(f12 - d()) > f11 || Math.abs(f13 - c()) > f11) {
            return false;
        }
        float abs = Math.abs(f11 - this.f59749c);
        return abs <= 1.0f || abs <= this.f59749c;
    }

    public d g(float f11, float f12, float f13) {
        int i11 = this.f59750d;
        int i12 = i11 + 1;
        float c11 = (i11 * c()) + f12;
        float f14 = i12;
        return new d(c11 / f14, ((this.f59750d * d()) + f11) / f14, ((this.f59750d * this.f59749c) + f13) / f14, i12);
    }

    public int h() {
        return this.f59750d;
    }

    public float i() {
        return this.f59749c;
    }

    public d(float f11, float f12, float f13, int i11) {
        super(f11, f12);
        this.f59749c = f13;
        this.f59750d = i11;
    }
}
