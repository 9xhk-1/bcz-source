package dm;

import com.github.mikephil.charting.data.BarEntry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends a<km.a> {

    /* renamed from: g, reason: collision with root package name */
    public int f48049g;

    /* renamed from: h, reason: collision with root package name */
    public int f48050h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f48051i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48052j;

    /* renamed from: k, reason: collision with root package name */
    public float f48053k;

    public b(int i11, int i12, boolean z11) {
        super(i11);
        this.f48049g = 0;
        this.f48052j = false;
        this.f48053k = 1.0f;
        this.f48050h = i12;
        this.f48051i = z11;
    }

    public void g(float f11, float f12, float f13, float f14) {
        float[] fArr = this.f48044b;
        int i11 = this.f48043a;
        int i12 = i11 + 1;
        this.f48043a = i12;
        fArr[i11] = f11;
        int i13 = i11 + 2;
        this.f48043a = i13;
        fArr[i12] = f12;
        int i14 = i11 + 3;
        this.f48043a = i14;
        fArr[i13] = f13;
        this.f48043a = i11 + 4;
        fArr[i14] = f14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dm.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(km.a aVar) {
        float f11;
        float abs;
        float abs2;
        float f12;
        float l12 = aVar.l1() * this.f48045c;
        float f13 = this.f48053k / 2.0f;
        for (int i11 = 0; i11 < l12; i11++) {
            BarEntry barEntry = (BarEntry) aVar.m(i11);
            if (barEntry != null) {
                float j11 = barEntry.j();
                float c11 = barEntry.c();
                float[] v11 = barEntry.v();
                if (!this.f48051i || v11 == null) {
                    float f14 = j11 - f13;
                    float f15 = j11 + f13;
                    if (this.f48052j) {
                        f11 = c11 >= 0.0f ? c11 : 0.0f;
                        if (c11 > 0.0f) {
                            c11 = 0.0f;
                        }
                    } else {
                        float f16 = c11 >= 0.0f ? c11 : 0.0f;
                        if (c11 > 0.0f) {
                            c11 = 0.0f;
                        }
                        float f17 = c11;
                        c11 = f16;
                        f11 = f17;
                    }
                    if (c11 > 0.0f) {
                        c11 *= this.f48046d;
                    } else {
                        f11 *= this.f48046d;
                    }
                    g(f14, c11, f15, f11);
                } else {
                    float f18 = -barEntry.r();
                    float f19 = 0.0f;
                    int i12 = 0;
                    while (i12 < v11.length) {
                        float f21 = v11[i12];
                        if (f21 == 0.0f && (f19 == 0.0f || f18 == 0.0f)) {
                            abs = f21;
                            abs2 = f18;
                            f18 = abs;
                        } else if (f21 >= 0.0f) {
                            abs = f21 + f19;
                            abs2 = f18;
                            f18 = f19;
                            f19 = abs;
                        } else {
                            abs = Math.abs(f21) + f18;
                            abs2 = Math.abs(f21) + f18;
                        }
                        float f22 = j11 - f13;
                        float f23 = j11 + f13;
                        if (this.f48052j) {
                            f12 = f18 >= abs ? f18 : abs;
                            if (f18 > abs) {
                                f18 = abs;
                            }
                        } else {
                            float f24 = f18 >= abs ? f18 : abs;
                            if (f18 > abs) {
                                f18 = abs;
                            }
                            float f25 = f18;
                            f18 = f24;
                            f12 = f25;
                        }
                        float f26 = this.f48046d;
                        g(f22, f18 * f26, f23, f12 * f26);
                        i12++;
                        f18 = abs2;
                    }
                }
            }
        }
        d();
    }

    public void i(float f11) {
        this.f48053k = f11;
    }

    public void j(int i11) {
        this.f48049g = i11;
    }

    public void k(boolean z11) {
        this.f48052j = z11;
    }
}
