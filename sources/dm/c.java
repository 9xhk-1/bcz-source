package dm;

import com.github.mikephil.charting.data.BarEntry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends b {
    public c(int i11, int i12, boolean z11) {
        super(i11, i12, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dm.b, dm.a
    /* renamed from: h */
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
                    g(f11, f15, c11, f14);
                } else {
                    float f18 = -barEntry.r();
                    float f19 = 0.0f;
                    int i12 = 0;
                    while (i12 < v11.length) {
                        float f21 = v11[i12];
                        if (f21 >= 0.0f) {
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
                        g(f12 * f26, f23, f18 * f26, f22);
                        i12++;
                        f18 = abs2;
                    }
                }
            }
        }
        d();
    }
}
