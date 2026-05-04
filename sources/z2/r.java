package z2;

import com.badlogic.gdx.graphics.Texture;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r extends q {

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f100740i;

    /* renamed from: j, reason: collision with root package name */
    public float f100741j;

    /* renamed from: k, reason: collision with root package name */
    public int f100742k;

    public r() {
        this.f100740i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f100741j = 1.0f;
        this.f100742k = 12;
    }

    public static void j(w1.a aVar, w1.o oVar, float f11, float f12, float f13, float f14, float f15, int i11) {
        float f16;
        float f17;
        float f18;
        float f19;
        float f21;
        int i12;
        int i13;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f31;
        float f32;
        float f33;
        float f34;
        Texture texture;
        int i14;
        float f35;
        float f36;
        float f37;
        int i15;
        int i16;
        float f38;
        float f39;
        float f41;
        float f42;
        Texture texture2;
        float f43;
        Texture texture3;
        float f44;
        float f45;
        float f46;
        float f47;
        float f48;
        float f49;
        float c11 = oVar.c() * f15;
        float b11 = oVar.b() * f15;
        Texture f51 = oVar.f();
        float C0 = f51.C0() * f15;
        float I = f51.I() * f15;
        float g11 = oVar.g();
        float i17 = oVar.i();
        float h11 = oVar.h();
        float j11 = oVar.j();
        float f52 = f13 / c11;
        int i18 = (int) f52;
        int i19 = 1;
        if (a3.a.d(i11)) {
            f17 = f13 - (i18 * c11);
            f16 = 0.0f;
        } else if (a3.a.e(i11)) {
            f16 = f13 - (i18 * c11);
            f17 = 0.0f;
        } else {
            if (i18 != 0) {
                if (i18 % 2 != 1) {
                    i18--;
                }
                f16 = (f13 - (i18 * c11)) * 0.5f;
            } else {
                f16 = 0.0f;
            }
            f17 = f16;
        }
        float f53 = f14 / b11;
        int i21 = (int) f53;
        if (a3.a.f(i11)) {
            f18 = f14 - (i21 * b11);
            f19 = 0.0f;
        } else if (a3.a.a(i11)) {
            f19 = f14 - (i21 * b11);
            f18 = 0.0f;
        } else {
            if (i21 != 0) {
                if (i21 % 2 != 1) {
                    i21--;
                }
                f18 = (f14 - (i21 * b11)) * 0.5f;
            } else {
                f18 = 0.0f;
            }
            f19 = f18;
        }
        if (f16 > 0.0f) {
            float f54 = h11 - (f16 / C0);
            if (f18 > 0.0f) {
                aVar.c0(f51, f11, f12, f16, f18, f54, i17 + (f18 / I), h11, i17);
                f23 = f18;
                f25 = i17;
                f49 = f12 + f23;
            } else {
                f23 = f18;
                f25 = i17;
                f49 = f12;
            }
            if (i21 == 0 && a3.a.c(i11)) {
                float f55 = (j11 - f25) * 0.5f * (1.0f - f53);
                aVar.c0(f51, f11, f49, f16, f14, f54, j11 - f55, h11, f25 + f55);
                f28 = f49 + f14;
            } else {
                float f56 = f49;
                int i22 = 0;
                while (i22 < i21) {
                    float f57 = C0;
                    int i23 = i21;
                    float f58 = f25;
                    Texture texture4 = f51;
                    float f59 = f16;
                    float f61 = j11;
                    aVar.c0(texture4, f11, f56, f59, b11, f54, f61, h11, f58);
                    f51 = texture4;
                    f16 = f59;
                    f25 = f58;
                    f56 += b11;
                    i22++;
                    i21 = i23;
                    j11 = f61;
                    i19 = i19;
                    C0 = f57;
                }
                f28 = f56;
            }
            f21 = C0;
            i12 = i19;
            i13 = i21;
            float f62 = j11;
            if (f19 > 0.0f) {
                float f63 = f19;
                aVar.c0(f51, f11, f28, f16, f63, f54, f62, h11, f62 - (f19 / I));
                f26 = f63;
                f22 = f16;
                f27 = f62;
                f24 = h11;
            } else {
                f26 = f19;
                f22 = f16;
                f24 = h11;
                f27 = f62;
            }
        } else {
            f21 = C0;
            i12 = 1;
            i13 = i21;
            f22 = f16;
            f23 = f18;
            f24 = h11;
            f25 = i17;
            f26 = f19;
            f27 = j11;
            f28 = f12;
        }
        if (f23 > 0.0f) {
            float f64 = f11 + f22;
            float f65 = f25 + (f23 / I);
            if (i18 == 0 && a3.a.b(i11)) {
                float f66 = (f24 - g11) * 0.5f * (1.0f - f52);
                float f67 = f25;
                f48 = f23;
                aVar.c0(f51, f64, f12, f13, f48, g11 + f66, f65, f24 - f66, f67);
                f32 = f67;
            } else {
                f48 = f23;
                int i24 = 0;
                while (i24 < i18) {
                    float f68 = g11;
                    float f69 = f52;
                    Texture texture5 = f51;
                    float f71 = f48;
                    int i25 = i18;
                    float f72 = f64;
                    aVar.c0(texture5, f72, f12, c11, f71, f68, f65, f24, f25);
                    f64 = f72 + c11;
                    i24++;
                    g11 = f68;
                    i18 = i25;
                    f53 = f53;
                    f48 = f71;
                    f51 = texture5;
                    f52 = f69;
                }
                f32 = f25;
            }
            f29 = g11;
            f34 = f52;
            f31 = f53;
            texture = f51;
            f33 = f48;
            i14 = i18;
            f28 = f12;
        } else {
            f29 = g11;
            f31 = f53;
            f32 = f25;
            f33 = f23;
            f34 = f52;
            texture = f51;
            i14 = i18;
        }
        float f73 = f11 + f22;
        if (i14 == 0 && a3.a.b(i11)) {
            float f74 = (f24 - f29) * 0.5f * (1.0f - f34);
            float f75 = f29 + f74;
            f37 = f24 - f74;
            f35 = f13;
            f36 = f75;
            i15 = i12;
        } else {
            f35 = c11;
            f36 = f29;
            f37 = f24;
            i15 = i14;
        }
        if (i13 == 0 && a3.a.c(i11)) {
            float f76 = (f27 - f32) * 0.5f * (1.0f - f31);
            f41 = f32 + f76;
            f38 = f14;
            f39 = f27 - f76;
            i16 = i12;
        } else {
            i16 = i13;
            f38 = b11;
            f39 = f27;
            f41 = f32;
        }
        float f77 = f73;
        int i26 = 0;
        while (i26 < i15) {
            f28 = f12 + f33;
            int i27 = 0;
            while (i27 < i16) {
                int i28 = i14;
                Texture texture6 = texture;
                aVar.c0(texture6, f77, f28, f35, f38, f36, f39, f37, f41);
                f28 += f38;
                i27++;
                i14 = i28;
                texture = texture6;
            }
            f77 += f35;
            i26++;
            i14 = i14;
            texture = texture;
        }
        int i29 = i14;
        Texture texture7 = texture;
        int i31 = i29;
        if (f26 > 0.0f) {
            float f78 = f27 - (f26 / I);
            if (i31 == 0 && a3.a.b(i11)) {
                float f79 = (f24 - f29) * 0.5f * (1.0f - f34);
                float f81 = f27;
                aVar.c0(texture7, f73, f28, f13, f26, f29 + f79, f81, f24 - f79, f78);
                f77 = f73 + f13;
                f42 = f29;
                texture2 = texture7;
                f43 = f81;
            } else {
                float f82 = f27;
                float f83 = f26;
                float f84 = f73;
                int i32 = 0;
                while (i32 < i31) {
                    Texture texture8 = texture7;
                    float f85 = f83;
                    aVar.c0(texture8, f84, f28, c11, f85, f29, f82, f24, f78);
                    f84 += c11;
                    i32++;
                    texture7 = texture8;
                    i31 = i31;
                    f29 = f29;
                    f83 = f85;
                }
                f42 = f29;
                texture2 = texture7;
                f26 = f83;
                f43 = f82;
                f77 = f84;
            }
        } else {
            f42 = f29;
            texture2 = texture7;
            f43 = f27;
        }
        if (f17 > 0.0f) {
            float f86 = f42 + (f17 / f21);
            if (f23 > 0.0f) {
                texture3 = texture2;
                f44 = f17;
                float f87 = f32;
                float f88 = f33;
                aVar.c0(texture3, f77, f12, f44, f88, f42, f32 + (f33 / I), f86, f87);
                f45 = f87;
                f46 = f12 + f88;
            } else {
                texture3 = texture2;
                f44 = f17;
                f45 = f32;
                f46 = f12;
            }
            if (i13 == 0 && a3.a.c(i11)) {
                float f89 = (f43 - f45) * 0.5f * (1.0f - f31);
                aVar.c0(texture3, f77, f46, f44, f14, f42, f43 - f89, f86, f45 + f89);
                f47 = f46 + f14;
            } else {
                float f91 = f46;
                int i33 = 0;
                while (i33 < i13) {
                    float f92 = f45;
                    Texture texture9 = texture3;
                    float f93 = f43;
                    float f94 = f77;
                    aVar.c0(texture9, f94, f91, f44, b11, f42, f93, f86, f92);
                    f45 = f92;
                    texture3 = texture9;
                    f77 = f94;
                    f91 += b11;
                    i33++;
                    f43 = f93;
                }
                f47 = f91;
            }
            float f95 = f43;
            if (f26 > 0.0f) {
                aVar.c0(texture3, f77, f47, f44, f26, f42, f95, f86, f95 - (f26 / I));
            }
        }
    }

    public void A(float f11) {
        this.f100741j = f11;
    }

    @Override // z2.q
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public r i(com.badlogic.gdx.graphics.b bVar) {
        r rVar = new r(this);
        rVar.f100740i.H(bVar);
        rVar.p(z());
        rVar.q(u());
        rVar.t(w());
        rVar.r(s());
        return rVar;
    }

    @Override // z2.q, z2.s
    public void a(w1.a aVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        throw new UnsupportedOperationException();
    }

    public int k() {
        return this.f100742k;
    }

    public com.badlogic.gdx.graphics.b l() {
        return this.f100740i;
    }

    public float m() {
        return this.f100741j;
    }

    public void n(int i11) {
        this.f100742k = i11;
    }

    @Override // z2.q, z2.c, z2.k
    public void y(w1.a aVar, float f11, float f12, float f13, float f14) {
        float N0 = aVar.N0();
        aVar.h(aVar.e().r(this.f100740i));
        j(aVar, g(), f11, f12, f13, f14, this.f100741j, this.f100742k);
        aVar.G(N0);
    }

    public r(w1.o oVar) {
        super(oVar);
        this.f100740i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f100741j = 1.0f;
        this.f100742k = 12;
    }

    public r(q qVar) {
        super(qVar);
        this.f100740i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f100741j = 1.0f;
        this.f100742k = 12;
    }
}
