package im;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public float f60711a;

    /* renamed from: b, reason: collision with root package name */
    public float f60712b;

    public j(float f11, float f12) {
        this.f60711a = f11;
        this.f60712b = f12;
    }

    public boolean a(float f11) {
        return f11 > this.f60711a && f11 <= this.f60712b;
    }

    public boolean b(float f11) {
        return f11 > this.f60712b;
    }

    public boolean c(float f11) {
        return f11 < this.f60711a;
    }
}
