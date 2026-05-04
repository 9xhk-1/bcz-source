package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f1547c = 1.0E-9f;

    /* renamed from: a, reason: collision with root package name */
    public long f1548a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<h0> f1549b = new com.badlogic.gdx.utils.a<>();

    public h0 a(String str) {
        h0 h0Var = new h0(str);
        this.f1549b.a(h0Var);
        return h0Var;
    }

    public h0 b(String str, int i11) {
        h0 h0Var = new h0(str, i11);
        this.f1549b.a(h0Var);
        return h0Var;
    }

    public void c() {
        long c11 = b1.c();
        if (this.f1548a > 0) {
            d((c11 - r2) * 1.0E-9f);
        }
        this.f1548a = c11;
    }

    public void d(float f11) {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<h0> aVar = this.f1549b;
            if (i11 >= aVar.f13179b) {
                return;
            }
            aVar.get(i11).e(f11);
            i11++;
        }
    }

    public y0 e(y0 y0Var) {
        y0Var.Y0(0);
        for (int i11 = 0; i11 < this.f1549b.f13179b; i11++) {
            if (i11 != 0) {
                y0Var.O("; ");
            }
            this.f1549b.get(i11).f(y0Var);
        }
        return y0Var;
    }
}
