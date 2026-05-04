package com.esotericsoftware.spine;

import a3.r;
import com.badlogic.gdx.utils.a;
import com.esotericsoftware.spine.PathConstraintData;
import jl.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements j {

    /* renamed from: p, reason: collision with root package name */
    public static final int f29367p = -1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f29368q = -2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f29369r = -3;

    /* renamed from: s, reason: collision with root package name */
    public static final float f29370s = 1.0E-5f;

    /* renamed from: a, reason: collision with root package name */
    public final PathConstraintData f29371a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29372b;

    /* renamed from: c, reason: collision with root package name */
    public m f29373c;

    /* renamed from: d, reason: collision with root package name */
    public float f29374d;

    /* renamed from: e, reason: collision with root package name */
    public float f29375e;

    /* renamed from: f, reason: collision with root package name */
    public float f29376f;

    /* renamed from: g, reason: collision with root package name */
    public float f29377g;

    /* renamed from: h, reason: collision with root package name */
    public float f29378h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29379i;

    /* renamed from: j, reason: collision with root package name */
    public final r f29380j;

    /* renamed from: k, reason: collision with root package name */
    public final r f29381k;

    /* renamed from: l, reason: collision with root package name */
    public final r f29382l;

    /* renamed from: m, reason: collision with root package name */
    public final r f29383m;

    /* renamed from: n, reason: collision with root package name */
    public final r f29384n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f29385o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29386a;

        static {
            int[] iArr = new int[PathConstraintData.SpacingMode.values().length];
            f29386a = iArr;
            try {
                iArr[PathConstraintData.SpacingMode.percent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29386a[PathConstraintData.SpacingMode.proportional.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(PathConstraintData pathConstraintData, Skeleton skeleton) {
        this.f29380j = new r();
        this.f29381k = new r();
        this.f29382l = new r();
        this.f29383m = new r();
        this.f29384n = new r();
        this.f29385o = new float[10];
        if (pathConstraintData == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f29371a = pathConstraintData;
        this.f29372b = new com.badlogic.gdx.utils.a<>(pathConstraintData.f29180d.f13179b);
        a.b<BoneData> it = pathConstraintData.f29180d.iterator();
        while (it.hasNext()) {
            this.f29372b.a(skeleton.f29193b.get(it.next().f29164a));
        }
        this.f29373c = skeleton.f29194c.get(pathConstraintData.f29181e.f64415a);
        this.f29374d = pathConstraintData.f29186j;
        this.f29375e = pathConstraintData.f29187k;
        this.f29376f = pathConstraintData.f29188l;
        this.f29377g = pathConstraintData.f29189m;
        this.f29378h = pathConstraintData.f29190n;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0285  */
    @Override // com.esotericsoftware.spine.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.esotericsoftware.spine.Skeleton.Physics r31) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.d.a(com.esotericsoftware.spine.Skeleton$Physics):void");
    }

    public final void b(float f11, float[] fArr, int i11, float[] fArr2, int i12) {
        float f12 = fArr[i11 + 2];
        float f13 = fArr[i11 + 3];
        float b11 = pl.g.b(f13 - fArr[i11 + 1], f12 - fArr[i11]);
        fArr2[i12] = f12 + (pl.g.d(b11) * f11);
        fArr2[i12 + 1] = f13 + (f11 * pl.g.f(b11));
        fArr2[i12 + 2] = b11;
    }

    public final void c(float f11, float[] fArr, int i11, float[] fArr2, int i12) {
        float f12 = fArr[i11];
        float f13 = fArr[i11 + 1];
        float b11 = pl.g.b(fArr[i11 + 3] - f13, fArr[i11 + 2] - f12);
        fArr2[i12] = f12 + (pl.g.d(b11) * f11);
        fArr2[i12 + 1] = f13 + (f11 * pl.g.f(b11));
        fArr2[i12 + 2] = b11;
    }

    public final void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float[] fArr, int i11, boolean z11) {
        if (f11 < 1.0E-5f || Float.isNaN(f11)) {
            fArr[i11] = f12;
            fArr[i11 + 1] = f13;
            fArr[i11 + 2] = pl.g.b(f15 - f13, f14 - f12);
            return;
        }
        float f21 = f11 * f11;
        float f22 = f21 * f11;
        float f23 = 1.0f - f11;
        float f24 = f23 * f23;
        float f25 = f24 * f23;
        float f26 = f23 * f11;
        float f27 = 3.0f * f26;
        float f28 = f23 * f27;
        float f29 = f27 * f11;
        float f31 = (f12 * f25) + (f14 * f28) + (f16 * f29) + (f18 * f22);
        float f32 = (f25 * f13) + (f28 * f15) + (f29 * f17) + (f22 * f19);
        fArr[i11] = f31;
        fArr[i11 + 1] = f32;
        if (z11) {
            if (f11 < 0.001f) {
                fArr[i11 + 2] = pl.g.b(f15 - f13, f14 - f12);
            } else {
                fArr[i11 + 2] = pl.g.b(f32 - (((f13 * f24) + ((f15 * f26) * 2.0f)) + (f17 * f21)), f31 - (((f12 * f24) + ((f14 * f26) * 2.0f)) + (f16 * f21)));
            }
        }
    }

    public float[] e(ol.h hVar, int i11, boolean z11) {
        float[] I;
        int i12;
        float f11;
        float[] fArr;
        int i13;
        float[] fArr2;
        int i14;
        float f12;
        float[] fArr3;
        float f13;
        float f14;
        float f15;
        int i15;
        int i16;
        float f16;
        float f17;
        m mVar;
        int i17;
        float f18;
        float[] fArr4;
        m mVar2;
        int i18;
        boolean z12;
        int i19;
        int i21;
        float[] fArr5;
        d dVar;
        m mVar3;
        int i22;
        float f19;
        int i23;
        float f21;
        m mVar4;
        d dVar2 = this;
        m mVar5 = dVar2.f29373c;
        float f22 = dVar2.f29374d;
        float[] fArr6 = dVar2.f29380j.f1625a;
        char c11 = 2;
        float[] I2 = dVar2.f29381k.I((i11 * 3) + 2);
        boolean v11 = hVar.v();
        int o11 = hVar.o();
        int i24 = o11 / 6;
        boolean z13 = true;
        if (!hVar.w()) {
            float[] x11 = hVar.x();
            int i25 = i24 - (v11 ? 1 : 2);
            float f23 = x11[i25];
            PathConstraintData pathConstraintData = dVar2.f29371a;
            if (pathConstraintData.f29182f == PathConstraintData.PositionMode.percent) {
                f22 *= f23;
            }
            int i26 = a.f29386a[pathConstraintData.f29183g.ordinal()];
            float f24 = i26 != 1 ? i26 != 2 ? 1.0f : f23 / i11 : f23;
            float[] I3 = dVar2.f29382l.I(8);
            int i27 = 0;
            int i28 = 0;
            int i29 = -1;
            int i31 = 0;
            while (i27 < i11) {
                float f25 = fArr6[i27] * f24;
                float f26 = f22 + f25;
                if (v11) {
                    f18 = f26 % f23;
                    if (f18 < 0.0f) {
                        f18 += f23;
                    }
                    mVar = mVar5;
                    i17 = 0;
                } else {
                    if (f26 < 0.0f) {
                        if (i29 != -2) {
                            float[] fArr7 = I3;
                            i22 = -2;
                            m mVar6 = mVar5;
                            hVar.j(mVar6, 2, 4, fArr7, 0, 2);
                            mVar3 = mVar6;
                            I3 = fArr7;
                        } else {
                            mVar3 = mVar5;
                            i22 = i29;
                        }
                        float[] fArr8 = I3;
                        dVar2.c(f26, fArr8, 0, I2, i28);
                        fArr4 = fArr8;
                        mVar2 = mVar3;
                        i18 = i27;
                        z12 = z13 ? 1 : 0;
                        i19 = i31;
                        i29 = i22;
                    } else {
                        mVar = mVar5;
                        if (f26 > f23) {
                            int i32 = -3;
                            if (i29 != -3) {
                                hVar.j(mVar, o11 - 6, 4, I3, 0, 2);
                                mVar = mVar;
                            } else {
                                i32 = i29;
                            }
                            float[] fArr9 = I3;
                            b(f26 - f23, fArr9, 0, I2, i28);
                            fArr4 = fArr9;
                            mVar2 = mVar;
                            i29 = i32;
                            i18 = i27;
                            z12 = z13 ? 1 : 0;
                            i19 = i31;
                        } else {
                            i17 = i31;
                            f18 = f26;
                        }
                    }
                    i21 = i25;
                    fArr5 = I2;
                    dVar = this;
                    i27 = i18 + 1;
                    i28 += 3;
                    dVar2 = dVar;
                    I2 = fArr5;
                    z13 = z12;
                    i25 = i21;
                    f22 = f26;
                    mVar5 = mVar2;
                    I3 = fArr4;
                    i31 = i19;
                    c11 = 2;
                }
                while (true) {
                    f19 = x11[i17];
                    if (f18 <= f19) {
                        break;
                    }
                    i17++;
                }
                if (i17 != 0) {
                    float f27 = x11[i17 - 1];
                    f18 -= f27;
                    f19 -= f27;
                }
                float f28 = f18 / f19;
                if (i17 != i29) {
                    if (v11 && i17 == i25) {
                        mVar4 = mVar;
                        hVar.j(mVar4, o11 - 4, 4, I3, 0, 2);
                        hVar.j(mVar4, 0, 4, I3, 4, 2);
                    } else {
                        mVar4 = mVar;
                        hVar.j(mVar4, (i17 * 6) + 2, 8, I3, 0, 2);
                    }
                    mVar2 = mVar4;
                    fArr4 = I3;
                    i23 = i17;
                } else {
                    fArr4 = I3;
                    mVar2 = mVar;
                    i23 = i29;
                }
                float f29 = fArr4[0];
                float f31 = fArr4[z13 ? 1 : 0];
                float f32 = fArr4[c11];
                float f33 = fArr4[3];
                float f34 = fArr4[4];
                float f35 = fArr4[5];
                int i33 = i25;
                float f36 = fArr4[6];
                i18 = i27;
                float f37 = fArr4[7];
                if (z11 || (i18 > 0 && f25 < 1.0E-5f)) {
                    i21 = i33;
                    f21 = f28;
                    z12 = z13 ? 1 : 0;
                } else {
                    i21 = i33;
                    f21 = f28;
                    z12 = z13 ? 1 : 0;
                    z13 = false;
                }
                i19 = i17;
                d(f21, f29, f31, f32, f33, f34, f35, f36, f37, I2, i28, z13);
                fArr5 = I2;
                dVar = this;
                i29 = i23;
                i27 = i18 + 1;
                i28 += 3;
                dVar2 = dVar;
                I2 = fArr5;
                z13 = z12;
                i25 = i21;
                f22 = f26;
                mVar5 = mVar2;
                I3 = fArr4;
                i31 = i19;
                c11 = 2;
            }
            return I2;
        }
        int i34 = 1;
        float[] fArr10 = I2;
        d dVar3 = dVar2;
        if (v11) {
            int i35 = o11 + 2;
            I = dVar3.f29382l.I(i35);
            int i36 = o11 - 2;
            i12 = i35;
            hVar.j(mVar5, 2, i36, I, 0, 2);
            hVar.j(mVar5, 0, 2, I, i36, 2);
            I[o11] = I[0];
            I[o11 + 1] = I[1];
        } else {
            i24--;
            int i37 = o11 - 4;
            I = dVar3.f29382l.I(i37);
            hVar.j(mVar5, 2, i37, I, 0, 2);
            i12 = i37;
        }
        float[] fArr11 = I;
        float[] I4 = dVar3.f29383m.I(i24);
        float f38 = fArr11[0];
        float f39 = fArr11[1];
        float f41 = 0.0f;
        float f42 = 0.0f;
        float f43 = 0.0f;
        float f44 = 0.0f;
        float f45 = 0.0f;
        float f46 = 0.0f;
        float f47 = 0.0f;
        int i38 = 0;
        int i39 = 2;
        while (i38 < i24) {
            f41 = fArr11[i39];
            f42 = fArr11[i39 + 1];
            f44 = fArr11[i39 + 2];
            f45 = fArr11[i39 + 3];
            f46 = fArr11[i39 + 4];
            f47 = fArr11[i39 + 5];
            float f48 = ((f38 - (f41 * 2.0f)) + f44) * 0.1875f;
            float f49 = ((f39 - (f42 * 2.0f)) + f45) * 0.1875f;
            float f51 = ((((f41 - f44) * 3.0f) - f38) + f46) * 0.09375f;
            float f52 = ((((f42 - f45) * 3.0f) - f39) + f47) * 0.09375f;
            float f53 = (f48 * 2.0f) + f51;
            float f54 = (2.0f * f49) + f52;
            float f55 = ((f41 - f38) * 0.75f) + f48 + (f51 * 0.16666667f);
            float f56 = ((f42 - f39) * 0.75f) + f49 + (0.16666667f * f52);
            float f57 = (f55 * f55) + (f56 * f56);
            float f58 = f55 + f53;
            float f59 = f56 + f54;
            float f61 = f53 + f51;
            float f62 = f54 + f52;
            float sqrt = f43 + ((float) Math.sqrt(f57)) + ((float) Math.sqrt((f58 * f58) + (f59 * f59)));
            float sqrt2 = sqrt + ((float) Math.sqrt((r0 * r0) + (r1 * r1)));
            float f63 = f58 + f61 + f61 + f51;
            float f64 = f59 + f62 + f62 + f52;
            f43 = sqrt2 + ((float) Math.sqrt((f63 * f63) + (f64 * f64)));
            I4[i38] = f43;
            i38++;
            i39 += 6;
            f38 = f46;
            f39 = f47;
            fArr10 = fArr10;
        }
        float[] fArr12 = fArr10;
        PathConstraintData pathConstraintData2 = dVar3.f29371a;
        if (pathConstraintData2.f29182f == PathConstraintData.PositionMode.percent) {
            f22 *= f43;
        }
        int i41 = a.f29386a[pathConstraintData2.f29183g.ordinal()];
        float f65 = i41 != 1 ? i41 != 2 ? 1.0f : f43 / i11 : f43;
        float[] fArr13 = dVar3.f29385o;
        float f66 = f41;
        float f67 = f42;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = -1;
        float f68 = f38;
        float f69 = f22;
        float f71 = 0.0f;
        float f72 = f39;
        int i46 = 0;
        while (i46 < i11) {
            float f73 = fArr6[i46] * f65;
            float f74 = f69 + f73;
            if (v11) {
                float f75 = f74 % f43;
                if (f75 < 0.0f) {
                    f75 += f43;
                }
                f11 = f74;
                fArr2 = fArr11;
                f12 = f75;
                fArr = fArr12;
                i13 = i46;
                i14 = 0;
            } else {
                if (f74 < 0.0f) {
                    fArr = fArr12;
                    i13 = i46;
                    dVar3.c(f74, fArr11, 0, fArr, i42);
                    f11 = f74;
                } else {
                    f11 = f74;
                    fArr = fArr12;
                    i13 = i46;
                    if (f11 > f43) {
                        b(f11 - f43, fArr11, i12 - 4, fArr, i42);
                    } else {
                        fArr2 = fArr11;
                        i14 = i43;
                        f12 = f11;
                    }
                }
                fArr2 = fArr11;
                fArr3 = fArr13;
                f13 = f44;
                i46 = i13 + 1;
                i42 += 3;
                dVar3 = this;
                f44 = f13;
                fArr12 = fArr;
                fArr13 = fArr3;
                f69 = f11;
                fArr11 = fArr2;
                i34 = 1;
            }
            while (true) {
                f14 = I4[i14];
                if (f12 <= f14) {
                    break;
                }
                i14++;
            }
            if (i14 != 0) {
                float f76 = I4[i14 - 1];
                f12 -= f76;
                f14 -= f76;
            }
            float f77 = f12 / f14;
            if (i14 != i45) {
                int i47 = i14 * 6;
                f68 = fArr2[i47];
                f72 = fArr2[i47 + 1];
                f66 = fArr2[i47 + 2];
                f67 = fArr2[i47 + 3];
                f44 = fArr2[i47 + 4];
                f45 = fArr2[i47 + 5];
                f46 = fArr2[i47 + 6];
                f47 = fArr2[i47 + 7];
                float f78 = ((f68 - (f66 * 2.0f)) + f44) * 0.03f;
                float f79 = ((f72 - (f67 * 2.0f)) + f45) * 0.03f;
                float f81 = ((((f66 - f44) * 3.0f) - f68) + f46) * 0.006f;
                float f82 = ((((f67 - f45) * 3.0f) - f72) + f47) * 0.006f;
                float f83 = (f78 * 2.0f) + f81;
                float f84 = (f79 * 2.0f) + f82;
                float f85 = ((f66 - f68) * 0.3f) + f78 + (f81 * 0.16666667f);
                float f86 = ((f67 - f72) * 0.3f) + f79 + (f82 * 0.16666667f);
                f15 = f77;
                i15 = i14;
                float sqrt3 = (float) Math.sqrt((f85 * f85) + (f86 * f86));
                fArr13[0] = sqrt3;
                for (int i48 = i34; i48 < 8; i48++) {
                    f85 += f83;
                    f86 += f84;
                    f83 += f81;
                    f84 += f82;
                    sqrt3 += (float) Math.sqrt((f85 * f85) + (f86 * f86));
                    fArr13[i48] = sqrt3;
                }
                float sqrt4 = sqrt3 + ((float) Math.sqrt((r40 * r40) + (r2 * r2)));
                fArr13[8] = sqrt4;
                float f87 = f85 + f83 + f83 + f81;
                float f88 = f86 + f84 + f84 + f82;
                f71 = sqrt4 + ((float) Math.sqrt((f87 * f87) + (f88 * f88)));
                fArr13[9] = f71;
                i16 = i15;
                i44 = 0;
            } else {
                f15 = f77;
                i15 = i14;
                i16 = i45;
            }
            float f89 = f68;
            float f91 = f44;
            float f92 = f15 * f71;
            int i49 = i44;
            while (true) {
                f16 = fArr13[i49];
                if (f92 <= f16) {
                    break;
                }
                i49++;
            }
            if (i49 == 0) {
                f17 = f92 / f16;
            } else {
                float f93 = fArr13[i49 - 1];
                f17 = ((f92 - f93) / (f16 - f93)) + i49;
            }
            float f94 = f17 * 0.1f;
            boolean z14 = z11 || (i13 > 0 && f73 < 1.0E-5f);
            float f95 = f67;
            int i51 = i42;
            int i52 = i15;
            float[] fArr14 = fArr;
            float f96 = f72;
            fArr3 = fArr13;
            float f97 = f66;
            float f98 = f45;
            float f99 = f46;
            float f100 = f47;
            int i53 = i49;
            d(f94, f89, f96, f97, f95, f91, f98, f99, f100, fArr14, i51, z14);
            f67 = f95;
            i42 = i51;
            f47 = f100;
            f66 = f97;
            fArr = fArr14;
            f13 = f91;
            f46 = f99;
            i45 = i16;
            i43 = i52;
            i44 = i53;
            f68 = f89;
            f45 = f98;
            f72 = f96;
            i46 = i13 + 1;
            i42 += 3;
            dVar3 = this;
            f44 = f13;
            fArr12 = fArr;
            fArr13 = fArr3;
            f69 = f11;
            fArr11 = fArr2;
            i34 = 1;
        }
        return fArr12;
    }

    public com.badlogic.gdx.utils.a<b> f() {
        return this.f29372b;
    }

    public PathConstraintData g() {
        return this.f29371a;
    }

    public float h() {
        return this.f29376f;
    }

    public float i() {
        return this.f29377g;
    }

    @Override // com.esotericsoftware.spine.j
    public boolean isActive() {
        return this.f29379i;
    }

    public float j() {
        return this.f29378h;
    }

    public float k() {
        return this.f29374d;
    }

    public float l() {
        return this.f29375e;
    }

    public m m() {
        return this.f29373c;
    }

    public void n(float f11) {
        this.f29376f = f11;
    }

    public void o(float f11) {
        this.f29377g = f11;
    }

    public void p(float f11) {
        this.f29378h = f11;
    }

    public void q(float f11) {
        this.f29374d = f11;
    }

    public void r(float f11) {
        this.f29375e = f11;
    }

    public void s(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        this.f29373c = mVar;
    }

    public void t() {
        PathConstraintData pathConstraintData = this.f29371a;
        this.f29374d = pathConstraintData.f29186j;
        this.f29375e = pathConstraintData.f29187k;
        this.f29376f = pathConstraintData.f29188l;
        this.f29377g = pathConstraintData.f29189m;
        this.f29378h = pathConstraintData.f29190n;
    }

    public String toString() {
        return this.f29371a.f64303a;
    }

    public d(d dVar, Skeleton skeleton) {
        this(dVar.f29371a, skeleton);
        this.f29374d = dVar.f29374d;
        this.f29375e = dVar.f29375e;
        this.f29376f = dVar.f29376f;
        this.f29377g = dVar.f29377g;
        this.f29378h = dVar.f29378h;
    }
}
