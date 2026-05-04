package ip;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f62665b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final g f62666a;

    public g(g gVar) {
        this.f62666a = gVar;
    }

    public final g a(int i11, int i12) {
        return new e(this, i11, i12);
    }

    public final g b(int i11, int i12) {
        return new b(this, i11, i12);
    }

    public abstract void c(kp.a aVar, byte[] bArr);

    public final g d() {
        return this.f62666a;
    }
}
