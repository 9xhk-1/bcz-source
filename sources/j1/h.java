package j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public float f63119a;

    /* renamed from: b, reason: collision with root package name */
    public int f63120b;

    public void a(float f11) {
        float f12 = this.f63119a + f11;
        this.f63119a = f12;
        int i11 = this.f63120b + 1;
        this.f63120b = i11;
        if (i11 == Integer.MAX_VALUE) {
            this.f63119a = f12 / 2.0f;
            this.f63120b = i11 / 2;
        }
    }

    public float b() {
        int i11 = this.f63120b;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.f63119a / i11;
    }
}
