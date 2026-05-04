package dm;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f48044b;

    /* renamed from: c, reason: collision with root package name */
    public float f48045c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f48046d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f48047e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f48048f = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f48043a = 0;

    public a(int i11) {
        this.f48044b = new float[i11];
    }

    public abstract void a(T t11);

    public void b(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f48047e = i11;
    }

    public void c(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f48048f = i11;
    }

    public void d() {
        this.f48043a = 0;
    }

    public void e(float f11, float f12) {
        this.f48045c = f11;
        this.f48046d = f12;
    }

    public int f() {
        return this.f48044b.length;
    }
}
