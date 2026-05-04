package com.esotericsoftware.spine;

import com.esotericsoftware.spine.BoneData;
import com.esotericsoftware.spine.attachments.Sequence;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Animation {

    /* renamed from: a, reason: collision with root package name */
    public final String f29038a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<m0> f29039b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.m<String> f29040c;

    /* renamed from: d, reason: collision with root package name */
    public float f29041d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MixBlend {
        setup,
        first,
        replace,
        add
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MixDirection {
        in,
        out
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29043a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29044b;

        static {
            int[] iArr = new int[Sequence.SequenceMode.values().length];
            f29044b = iArr;
            try {
                iArr[Sequence.SequenceMode.once.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29044b[Sequence.SequenceMode.loop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29044b[Sequence.SequenceMode.pingpong.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29044b[Sequence.SequenceMode.onceReverse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29044b[Sequence.SequenceMode.loopReverse.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29044b[Sequence.SequenceMode.pingpongReverse.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[MixBlend.values().length];
            f29043a = iArr2;
            try {
                iArr2[MixBlend.setup.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29043a[MixBlend.first.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29043a[MixBlend.replace.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29043a[MixBlend.add.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a0 extends g implements l0 {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29045i = 8;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29046j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29047k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29048l = 3;

        /* renamed from: m, reason: collision with root package name */
        public static final int f29049m = 4;

        /* renamed from: n, reason: collision with root package name */
        public static final int f29050n = 5;

        /* renamed from: o, reason: collision with root package name */
        public static final int f29051o = 6;

        /* renamed from: p, reason: collision with root package name */
        public static final int f29052p = 7;

        /* renamed from: h, reason: collision with root package name */
        public final int f29053h;

        public a0(int i11, int i12, int i13) {
            super(i11, i12, y.rgb.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.alpha.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.rgb2.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29053h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29053h;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f21;
            jl.m mVar = skeleton.f29194c.get(this.f29053h);
            if (mVar.f64408b.A) {
                float[] fArr = this.f29113b;
                com.badlogic.gdx.graphics.b bVar = mVar.f64409c;
                com.badlogic.gdx.graphics.b bVar2 = mVar.f64410d;
                if (f12 < fArr[0]) {
                    jl.n nVar = mVar.f64407a;
                    com.badlogic.gdx.graphics.b bVar3 = nVar.f64418d;
                    com.badlogic.gdx.graphics.b bVar4 = nVar.f64419e;
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        bVar.H(bVar3);
                        bVar2.f11544a = bVar4.f11544a;
                        bVar2.f11545b = bVar4.f11545b;
                        bVar2.f11546c = bVar4.f11546c;
                        return;
                    }
                    if (i11 != 2) {
                        return;
                    }
                    bVar.c((bVar3.f11544a - bVar.f11544a) * f13, (bVar3.f11545b - bVar.f11545b) * f13, (bVar3.f11546c - bVar.f11546c) * f13, (bVar3.f11547d - bVar.f11547d) * f13);
                    float f22 = bVar2.f11544a;
                    bVar2.f11544a = f22 + ((bVar4.f11544a - f22) * f13);
                    float f23 = bVar2.f11545b;
                    bVar2.f11545b = f23 + ((bVar4.f11545b - f23) * f13);
                    float f24 = bVar2.f11546c;
                    bVar2.f11546c = f24 + ((bVar4.f11546c - f24) * f13);
                    return;
                }
                int j11 = m0.j(fArr, f12, 8);
                int i12 = (int) this.f29080c[j11 >> 3];
                if (i12 == 0) {
                    float f25 = fArr[j11];
                    float f26 = fArr[j11 + 1];
                    float f27 = fArr[j11 + 2];
                    float f28 = fArr[j11 + 3];
                    float f29 = fArr[j11 + 4];
                    float f31 = fArr[j11 + 5];
                    float f32 = fArr[j11 + 6];
                    float f33 = fArr[j11 + 7];
                    float f34 = (f12 - f25) / (fArr[j11 + 8] - f25);
                    float f35 = ((fArr[j11 + 9] - f26) * f34) + f26;
                    float f36 = ((fArr[j11 + 10] - f27) * f34) + f27;
                    float f37 = ((fArr[j11 + 11] - f28) * f34) + f28;
                    f14 = f29 + ((fArr[j11 + 12] - f29) * f34);
                    f15 = f31 + ((fArr[j11 + 13] - f31) * f34);
                    f16 = f32 + ((fArr[j11 + 14] - f32) * f34);
                    f17 = f33 + ((fArr[j11 + 15] - f33) * f34);
                    f18 = f35;
                    f19 = f36;
                    f21 = f37;
                } else if (i12 != 1) {
                    f18 = k(f12, j11, 1, i12 - 2);
                    f19 = k(f12, j11, 2, i12 + 16);
                    f21 = k(f12, j11, 3, i12 + 34);
                    f14 = k(f12, j11, 4, i12 + 52);
                    f15 = k(f12, j11, 5, i12 + 70);
                    f16 = k(f12, j11, 6, i12 + 88);
                    f17 = k(f12, j11, 7, i12 + 106);
                } else {
                    float f38 = fArr[j11 + 1];
                    f19 = fArr[j11 + 2];
                    f21 = fArr[j11 + 3];
                    f14 = fArr[j11 + 4];
                    f15 = fArr[j11 + 5];
                    f16 = fArr[j11 + 6];
                    float f39 = fArr[j11 + 7];
                    f18 = f38;
                    f17 = f39;
                }
                if (f13 == 1.0f) {
                    bVar.F(f18, f19, f21, f14);
                    bVar2.f11544a = f15;
                    bVar2.f11545b = f16;
                    bVar2.f11546c = f17;
                    return;
                }
                if (mixBlend == MixBlend.setup) {
                    bVar.H(mVar.f64407a.f64418d);
                    com.badlogic.gdx.graphics.b bVar5 = mVar.f64407a.f64419e;
                    bVar2.f11544a = bVar5.f11544a;
                    bVar2.f11545b = bVar5.f11545b;
                    bVar2.f11546c = bVar5.f11546c;
                }
                bVar.c((f18 - bVar.f11544a) * f13, (f19 - bVar.f11545b) * f13, (f21 - bVar.f11546c) * f13, (f14 - bVar.f11547d) * f13);
                float f41 = bVar2.f11544a;
                bVar2.f11544a = f41 + ((f15 - f41) * f13);
                float f42 = bVar2.f11545b;
                bVar2.f11545b = f42 + ((f16 - f42) * f13);
                float f43 = bVar2.f11546c;
                bVar2.f11546c = f43 + ((f17 - f43) * f13);
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 8;
        }

        public void q(int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            int i12 = i11 << 3;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
            fArr[i12 + 4] = f15;
            fArr[i12 + 5] = f16;
            fArr[i12 + 6] = f17;
            fArr[i12 + 7] = f18;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends e implements l0 {

        /* renamed from: j, reason: collision with root package name */
        public final int f29054j;

        public b(int i11, int i12, int i13) {
            super(i11, i12, y.alpha.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29054j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29054j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            jl.m mVar = skeleton.f29194c.get(this.f29054j);
            if (mVar.f64408b.A) {
                float[] fArr = this.f29113b;
                com.badlogic.gdx.graphics.b bVar = mVar.f64409c;
                if (f12 >= fArr[0]) {
                    float s11 = s(f12);
                    if (f13 == 1.0f) {
                        bVar.f11547d = s11;
                        return;
                    }
                    if (mixBlend == MixBlend.setup) {
                        bVar.f11547d = mVar.f64407a.f64418d.f11547d;
                    }
                    float f14 = bVar.f11547d;
                    bVar.f11547d = f14 + ((s11 - f14) * f13);
                    return;
                }
                com.badlogic.gdx.graphics.b bVar2 = mVar.f64407a.f64418d;
                int i11 = a.f29043a[mixBlend.ordinal()];
                if (i11 == 1) {
                    bVar.f11547d = bVar2.f11547d;
                } else {
                    if (i11 != 2) {
                        return;
                    }
                    float f15 = bVar.f11547d;
                    bVar.f11547d = f15 + ((bVar2.f11547d - f15) * f13);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0 extends g implements l0 {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29055i = 5;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29056j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29057k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29058l = 3;

        /* renamed from: m, reason: collision with root package name */
        public static final int f29059m = 4;

        /* renamed from: h, reason: collision with root package name */
        public final int f29060h;

        public b0(int i11, int i12, int i13) {
            super(i11, i12, y.rgb.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.alpha.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29060h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29060h;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            float f16;
            float f17;
            jl.m mVar = skeleton.f29194c.get(this.f29060h);
            if (mVar.f64408b.A) {
                float[] fArr = this.f29113b;
                com.badlogic.gdx.graphics.b bVar = mVar.f64409c;
                if (f12 < fArr[0]) {
                    com.badlogic.gdx.graphics.b bVar2 = mVar.f64407a.f64418d;
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        bVar.H(bVar2);
                        return;
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        bVar.c((bVar2.f11544a - bVar.f11544a) * f13, (bVar2.f11545b - bVar.f11545b) * f13, (bVar2.f11546c - bVar.f11546c) * f13, (bVar2.f11547d - bVar.f11547d) * f13);
                        return;
                    }
                }
                int j11 = m0.j(fArr, f12, 5);
                int i12 = (int) this.f29080c[j11 / 5];
                if (i12 == 0) {
                    float f18 = fArr[j11];
                    float f19 = fArr[j11 + 1];
                    float f21 = fArr[j11 + 2];
                    float f22 = fArr[j11 + 3];
                    float f23 = fArr[j11 + 4];
                    float f24 = (f12 - f18) / (fArr[j11 + 5] - f18);
                    float f25 = ((fArr[j11 + 6] - f19) * f24) + f19;
                    float f26 = ((fArr[j11 + 7] - f21) * f24) + f21;
                    float f27 = ((fArr[j11 + 8] - f22) * f24) + f22;
                    f14 = f23 + ((fArr[j11 + 9] - f23) * f24);
                    f15 = f25;
                    f16 = f26;
                    f17 = f27;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f16 = k(f12, j11, 2, i12 + 16);
                    f17 = k(f12, j11, 3, i12 + 34);
                    f14 = k(f12, j11, 4, i12 + 52);
                } else {
                    float f28 = fArr[j11 + 1];
                    f16 = fArr[j11 + 2];
                    f17 = fArr[j11 + 3];
                    f14 = fArr[j11 + 4];
                    f15 = f28;
                }
                if (f13 == 1.0f) {
                    bVar.F(f15, f16, f17, f14);
                    return;
                }
                if (mixBlend == MixBlend.setup) {
                    bVar.H(mVar.f64407a.f64418d);
                }
                bVar.c((f15 - bVar.f11544a) * f13, (f16 - bVar.f11545b) * f13, (f17 - bVar.f11546c) * f13, (f14 - bVar.f11547d) * f13);
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 5;
        }

        public void q(int i11, float f11, float f12, float f13, float f14, float f15) {
            int i12 = i11 * 5;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
            fArr[i12 + 4] = f15;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends m0 implements l0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f29061c;

        /* renamed from: d, reason: collision with root package name */
        public final String[] f29062d;

        public c(int i11, int i12) {
            super(i11, y.attachment.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i12);
            this.f29061c = i12;
            this.f29062d = new String[i11];
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29061c;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            jl.m mVar = skeleton.f29194c.get(this.f29061c);
            if (mVar.f64408b.A) {
                if (mixDirection == MixDirection.out) {
                    if (mixBlend == MixBlend.setup) {
                        l(skeleton, mVar, mVar.f64407a.f64420f);
                        return;
                    }
                    return;
                }
                float[] fArr = this.f29113b;
                if (f12 >= fArr[0]) {
                    l(skeleton, mVar, this.f29062d[m0.i(fArr, f12)]);
                } else if (mixBlend == MixBlend.setup || mixBlend == MixBlend.first) {
                    l(skeleton, mVar, mVar.f64407a.f64420f);
                }
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int e() {
            return this.f29113b.length;
        }

        public String[] k() {
            return this.f29062d;
        }

        public final void l(Skeleton skeleton, jl.m mVar, String str) {
            mVar.i(str == null ? null : skeleton.g(this.f29061c, str));
        }

        public void m(int i11, float f11, String str) {
            this.f29113b[i11] = f11;
            this.f29062d[i11] = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c0 extends g implements l0 {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29063i = 4;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29064j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29065k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29066l = 3;

        /* renamed from: h, reason: collision with root package name */
        public final int f29067h;

        public c0(int i11, int i12, int i13) {
            super(i11, i12, y.rgb.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29067h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29067h;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            float f16;
            jl.m mVar = skeleton.f29194c.get(this.f29067h);
            if (mVar.f64408b.A) {
                float[] fArr = this.f29113b;
                com.badlogic.gdx.graphics.b bVar = mVar.f64409c;
                if (f12 < fArr[0]) {
                    com.badlogic.gdx.graphics.b bVar2 = mVar.f64407a.f64418d;
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        bVar.f11544a = bVar2.f11544a;
                        bVar.f11545b = bVar2.f11545b;
                        bVar.f11546c = bVar2.f11546c;
                        return;
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        float f17 = bVar.f11544a;
                        bVar.f11544a = f17 + ((bVar2.f11544a - f17) * f13);
                        float f18 = bVar.f11545b;
                        bVar.f11545b = f18 + ((bVar2.f11545b - f18) * f13);
                        float f19 = bVar.f11546c;
                        bVar.f11546c = f19 + ((bVar2.f11546c - f19) * f13);
                        return;
                    }
                }
                int j11 = m0.j(fArr, f12, 4);
                int i12 = (int) this.f29080c[j11 >> 2];
                if (i12 == 0) {
                    float f21 = fArr[j11];
                    float f22 = fArr[j11 + 1];
                    float f23 = fArr[j11 + 2];
                    float f24 = fArr[j11 + 3];
                    float f25 = (f12 - f21) / (fArr[j11 + 4] - f21);
                    float f26 = ((fArr[j11 + 5] - f22) * f25) + f22;
                    float f27 = ((fArr[j11 + 6] - f23) * f25) + f23;
                    f14 = f24 + ((fArr[j11 + 7] - f24) * f25);
                    f15 = f26;
                    f16 = f27;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f16 = k(f12, j11, 2, i12 + 16);
                    f14 = k(f12, j11, 3, i12 + 34);
                } else {
                    float f28 = fArr[j11 + 1];
                    f16 = fArr[j11 + 2];
                    f14 = fArr[j11 + 3];
                    f15 = f28;
                }
                if (f13 == 1.0f) {
                    bVar.f11544a = f15;
                    bVar.f11545b = f16;
                    bVar.f11546c = f14;
                    return;
                }
                if (mixBlend == MixBlend.setup) {
                    com.badlogic.gdx.graphics.b bVar3 = mVar.f64407a.f64418d;
                    bVar.f11544a = bVar3.f11544a;
                    bVar.f11545b = bVar3.f11545b;
                    bVar.f11546c = bVar3.f11546c;
                }
                float f29 = bVar.f11544a;
                bVar.f11544a = f29 + ((f15 - f29) * f13);
                float f31 = bVar.f11545b;
                bVar.f11545b = f31 + ((f16 - f31) * f13);
                float f32 = bVar.f11546c;
                bVar.f11546c = f32 + ((f14 - f32) * f13);
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 4;
        }

        public void q(int i11, float f11, float f12, float f13, float f14) {
            int i12 = i11 << 2;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        int b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29068j;

        public d0(int i11, int i12, int i13) {
            super(i11, i12, y.rotate.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29068j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29068j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29068j);
            if (bVar.A) {
                bVar.f29336g = t(f12, f13, mixBlend, bVar.f29336g, bVar.f29330a.f29170g);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e extends g {

        /* renamed from: h, reason: collision with root package name */
        public static final int f29069h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f29070i = 1;

        public e(int i11, int i12, String str) {
            super(i11, i12, str);
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 2;
        }

        public float q(float f11, float f12, MixBlend mixBlend, float f13, float f14) {
            if (f11 < this.f29113b[0]) {
                int i11 = a.f29043a[mixBlend.ordinal()];
                return i11 != 1 ? i11 != 2 ? f13 : f13 + ((f14 - f13) * f12) : f14;
            }
            float s11 = s(f11);
            return mixBlend == MixBlend.setup ? f14 + ((s11 - f14) * f12) : f13 + ((s11 - f13) * f12);
        }

        public float r(float f11, float f12, MixBlend mixBlend, float f13, float f14, float f15) {
            if (f11 >= this.f29113b[0]) {
                return mixBlend == MixBlend.setup ? f14 + ((f15 - f14) * f12) : f13 + ((f15 - f13) * f12);
            }
            int i11 = a.f29043a[mixBlend.ordinal()];
            return i11 != 1 ? i11 != 2 ? f13 : f13 + ((f14 - f13) * f12) : f14;
        }

        public float s(float f11) {
            float[] fArr = this.f29113b;
            int length = fArr.length - 2;
            int i11 = 2;
            while (true) {
                if (i11 > length) {
                    break;
                }
                if (fArr[i11] > f11) {
                    length = i11 - 2;
                    break;
                }
                i11 += 2;
            }
            int i12 = (int) this.f29080c[length >> 1];
            if (i12 != 0) {
                return i12 != 1 ? k(f11, length, 1, i12 - 2) : fArr[length + 1];
            }
            float f12 = fArr[length];
            float f13 = fArr[length + 1];
            return f13 + (((f11 - f12) / (fArr[length + 2] - f12)) * (fArr[length + 3] - f13));
        }

        public float t(float f11, float f12, MixBlend mixBlend, float f13, float f14) {
            if (f11 < this.f29113b[0]) {
                int i11 = a.f29043a[mixBlend.ordinal()];
                return i11 != 1 ? i11 != 2 ? f13 : f13 + ((f14 - f13) * f12) : f14;
            }
            float s11 = s(f11);
            int i12 = a.f29043a[mixBlend.ordinal()];
            if (i12 == 1) {
                return f14 + (s11 * f12);
            }
            if (i12 == 2 || i12 == 3) {
                s11 += f14 - f13;
            }
            return f13 + (s11 * f12);
        }

        public float u(float f11, float f12, MixBlend mixBlend, MixDirection mixDirection, float f13, float f14) {
            float abs;
            float signum;
            if (f11 < this.f29113b[0]) {
                int i11 = a.f29043a[mixBlend.ordinal()];
                return i11 != 1 ? i11 != 2 ? f13 : f13 + ((f14 - f13) * f12) : f14;
            }
            float s11 = s(f11) * f14;
            if (f12 == 1.0f) {
                return mixBlend == MixBlend.add ? (f13 + s11) - f14 : s11;
            }
            if (mixDirection != MixDirection.out) {
                int i12 = a.f29043a[mixBlend.ordinal()];
                if (i12 == 1) {
                    abs = Math.abs(f14);
                    signum = Math.signum(s11);
                } else if (i12 == 2 || i12 == 3) {
                    abs = Math.abs(f13);
                    signum = Math.signum(s11);
                }
                float f15 = abs * signum;
                return f15 + ((s11 - f15) * f12);
            }
            int i13 = a.f29043a[mixBlend.ordinal()];
            if (i13 == 1) {
                return f14 + (((Math.abs(s11) * Math.signum(f14)) - f14) * f12);
            }
            if (i13 == 2 || i13 == 3) {
                return f13 + (((Math.abs(s11) * Math.signum(f13)) - f13) * f12);
            }
            return f13 + ((s11 - f14) * f12);
        }

        public void v(int i11, float f11, float f12) {
            int i12 = i11 << 1;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e0 extends f implements d {

        /* renamed from: k, reason: collision with root package name */
        public final int f29071k;

        public e0(int i11, int i12, int i13) {
            super(i11, i12, y.scaleX.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.scaleY.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29071k = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29071k;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29071k);
            if (bVar.A) {
                float[] fArr = this.f29113b;
                if (f12 < fArr[0]) {
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        BoneData boneData = bVar.f29330a;
                        bVar.f29337h = boneData.f29171h;
                        bVar.f29338i = boneData.f29172i;
                        return;
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        float f16 = bVar.f29337h;
                        BoneData boneData2 = bVar.f29330a;
                        bVar.f29337h = f16 + ((boneData2.f29171h - f16) * f13);
                        float f17 = bVar.f29338i;
                        bVar.f29338i = f17 + ((boneData2.f29172i - f17) * f13);
                        return;
                    }
                }
                int j11 = m0.j(fArr, f12, 3);
                int i12 = (int) this.f29080c[j11 / 3];
                if (i12 == 0) {
                    float f18 = fArr[j11];
                    float f19 = fArr[j11 + 1];
                    float f21 = fArr[j11 + 2];
                    float f22 = (f12 - f18) / (fArr[j11 + 3] - f18);
                    float f23 = ((fArr[j11 + 4] - f19) * f22) + f19;
                    f14 = f21 + ((fArr[j11 + 5] - f21) * f22);
                    f15 = f23;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f14 = k(f12, j11, 2, i12 + 16);
                } else {
                    float f24 = fArr[j11 + 1];
                    f14 = fArr[j11 + 2];
                    f15 = f24;
                }
                BoneData boneData3 = bVar.f29330a;
                float f25 = boneData3.f29171h;
                float f26 = f15 * f25;
                float f27 = boneData3.f29172i;
                float f28 = f14 * f27;
                if (f13 == 1.0f) {
                    if (mixBlend == MixBlend.add) {
                        bVar.f29337h += f26 - f25;
                        bVar.f29338i += f28 - f27;
                        return;
                    } else {
                        bVar.f29337h = f26;
                        bVar.f29338i = f28;
                        return;
                    }
                }
                if (mixDirection != MixDirection.out) {
                    int i13 = a.f29043a[mixBlend.ordinal()];
                    if (i13 == 1) {
                        float abs = Math.abs(bVar.f29330a.f29171h) * Math.signum(f26);
                        float abs2 = Math.abs(bVar.f29330a.f29172i) * Math.signum(f28);
                        bVar.f29337h = abs + ((f26 - abs) * f13);
                        bVar.f29338i = abs2 + ((f28 - abs2) * f13);
                        return;
                    }
                    if (i13 == 2 || i13 == 3) {
                        float abs3 = Math.abs(bVar.f29337h) * Math.signum(f26);
                        float abs4 = Math.abs(bVar.f29338i) * Math.signum(f28);
                        bVar.f29337h = abs3 + ((f26 - abs3) * f13);
                        bVar.f29338i = abs4 + ((f28 - abs4) * f13);
                        return;
                    }
                    if (i13 != 4) {
                        return;
                    }
                    float f29 = bVar.f29337h;
                    BoneData boneData4 = bVar.f29330a;
                    bVar.f29337h = f29 + ((f26 - boneData4.f29171h) * f13);
                    bVar.f29338i += (f28 - boneData4.f29172i) * f13;
                    return;
                }
                int i14 = a.f29043a[mixBlend.ordinal()];
                if (i14 == 1) {
                    BoneData boneData5 = bVar.f29330a;
                    float f31 = boneData5.f29171h;
                    float f32 = boneData5.f29172i;
                    bVar.f29337h = f31 + (((Math.abs(f26) * Math.signum(f31)) - f31) * f13);
                    bVar.f29338i = f32 + (((Math.abs(f28) * Math.signum(f32)) - f32) * f13);
                    return;
                }
                if (i14 == 2 || i14 == 3) {
                    float f33 = bVar.f29337h;
                    float f34 = bVar.f29338i;
                    bVar.f29337h = f33 + (((Math.abs(f26) * Math.signum(f33)) - f33) * f13);
                    bVar.f29338i = f34 + (((Math.abs(f28) * Math.signum(f34)) - f34) * f13);
                    return;
                }
                if (i14 != 4) {
                    return;
                }
                float f35 = bVar.f29337h;
                BoneData boneData6 = bVar.f29330a;
                bVar.f29337h = f35 + ((f26 - boneData6.f29171h) * f13);
                bVar.f29338i += (f28 - boneData6.f29172i) * f13;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f extends g {

        /* renamed from: h, reason: collision with root package name */
        public static final int f29072h = 3;

        /* renamed from: i, reason: collision with root package name */
        public static final int f29073i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29074j = 2;

        public f(int i11, int i12, String str, String str2) {
            super(i11, i12, str, str2);
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 3;
        }

        public void q(int i11, float f11, float f12, float f13) {
            int i12 = i11 * 3;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29075j;

        public f0(int i11, int i12, int i13) {
            super(i11, i12, y.scaleX.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29075j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29075j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29075j);
            if (bVar.A) {
                bVar.f29337h = u(f12, f13, mixBlend, mixDirection, bVar.f29337h, bVar.f29330a.f29171h);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g extends m0 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f29076d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f29077e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f29078f = 2;

        /* renamed from: g, reason: collision with root package name */
        public static final int f29079g = 18;

        /* renamed from: c, reason: collision with root package name */
        public float[] f29080c;

        public g(int i11, int i12, String... strArr) {
            super(i11, strArr);
            float[] fArr = new float[(i12 * 18) + i11];
            this.f29080c = fArr;
            fArr[i11 - 1] = 1.0f;
        }

        public float k(float f11, int i11, int i12, int i13) {
            float[] fArr = this.f29080c;
            float f12 = fArr[i13];
            if (f12 > f11) {
                float[] fArr2 = this.f29113b;
                float f13 = fArr2[i11];
                float f14 = fArr2[i11 + i12];
                return f14 + (((f11 - f13) / (f12 - f13)) * (fArr[i13 + 1] - f14));
            }
            int i14 = i13 + 18;
            for (int i15 = i13 + 2; i15 < i14; i15 += 2) {
                float f15 = fArr[i15];
                if (f15 >= f11) {
                    float f16 = fArr[i15 - 2];
                    float f17 = fArr[i15 - 1];
                    return f17 + (((f11 - f16) / (f15 - f16)) * (fArr[i15 + 1] - f17));
                }
            }
            int f18 = i11 + f();
            float f19 = fArr[i13 + 16];
            float f21 = fArr[i13 + 17];
            float[] fArr3 = this.f29113b;
            return f21 + (((f11 - f19) / (fArr3[f18] - f19)) * (fArr3[f18 + i12] - f21));
        }

        public int l(int i11) {
            return (int) this.f29080c[i11];
        }

        public void m(int i11, int i12, int i13, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            float[] fArr = this.f29080c;
            int e11 = e() + (i11 * 18);
            if (i13 == 0) {
                fArr[i12] = e11 + 2;
            }
            float f19 = ((f11 - (f13 * 2.0f)) + f15) * 0.03f;
            float f21 = ((f12 - (f14 * 2.0f)) + f16) * 0.03f;
            float f22 = ((((f13 - f15) * 3.0f) - f11) + f17) * 0.006f;
            float f23 = ((((f14 - f16) * 3.0f) - f12) + f18) * 0.006f;
            float f24 = (f19 * 2.0f) + f22;
            float f25 = (2.0f * f21) + f23;
            float f26 = ((f13 - f11) * 0.3f) + f19 + (f22 * 0.16666667f);
            float f27 = ((f14 - f12) * 0.3f) + f21 + (0.16666667f * f23);
            float f28 = f11 + f26;
            float f29 = f12 + f27;
            int i14 = e11 + 18;
            while (e11 < i14) {
                fArr[e11] = f28;
                fArr[e11 + 1] = f29;
                f26 += f24;
                f27 += f25;
                f24 += f22;
                f25 += f23;
                f28 += f26;
                f29 += f27;
                e11 += 2;
            }
        }

        public void n(int i11) {
            this.f29080c[i11] = 0.0f;
        }

        public void o(int i11) {
            this.f29080c[i11] = 1.0f;
        }

        public void p(int i11) {
            int e11 = e() + (i11 * 18);
            float[] fArr = this.f29080c;
            if (fArr.length > e11) {
                float[] fArr2 = new float[e11];
                pl.g.a(fArr, 0, fArr2, 0, e11);
                this.f29080c = fArr2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29081j;

        public g0(int i11, int i12, int i13) {
            super(i11, i12, y.scaleY.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29081j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29081j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29081j);
            if (bVar.A) {
                bVar.f29338i = u(f12, f13, mixBlend, mixDirection, bVar.f29338i, bVar.f29330a.f29172i);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends g implements l0 {

        /* renamed from: h, reason: collision with root package name */
        public final int f29082h;

        /* renamed from: i, reason: collision with root package name */
        public final ol.l f29083i;

        /* renamed from: j, reason: collision with root package name */
        public final float[][] f29084j;

        public h(int i11, int i12, int i13, ol.l lVar) {
            super(i11, i12, y.deform.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + lVar.l());
            this.f29082h = i13;
            this.f29083i = lVar;
            this.f29084j = new float[i11][];
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29082h;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            jl.m mVar = skeleton.f29194c.get(this.f29082h);
            if (mVar.f64408b.A) {
                ol.b bVar = mVar.f64411e;
                if (bVar instanceof ol.l) {
                    ol.l lVar = (ol.l) bVar;
                    if (lVar.m() != this.f29083i) {
                        return;
                    }
                    a3.r rVar = mVar.f64413g;
                    if (rVar.f1626b == 0) {
                        mixBlend = MixBlend.setup;
                    }
                    float[][] fArr = this.f29084j;
                    int i11 = 0;
                    int length = fArr[0].length;
                    float[] fArr2 = this.f29113b;
                    if (f12 < fArr2[0]) {
                        int i12 = a.f29043a[mixBlend.ordinal()];
                        if (i12 == 1) {
                            rVar.i();
                            return;
                        }
                        if (i12 != 2) {
                            return;
                        }
                        if (f13 == 1.0f) {
                            rVar.i();
                            return;
                        }
                        float[] I = rVar.I(length);
                        if (lVar.k() != null) {
                            float f14 = 1.0f - f13;
                            while (i11 < length) {
                                I[i11] = I[i11] * f14;
                                i11++;
                            }
                            return;
                        }
                        float[] n11 = lVar.n();
                        while (i11 < length) {
                            float f15 = I[i11];
                            I[i11] = f15 + ((n11[i11] - f15) * f13);
                            i11++;
                        }
                        return;
                    }
                    float[] I2 = rVar.I(length);
                    if (f12 >= fArr2[fArr2.length - 1]) {
                        float[] fArr3 = fArr[fArr2.length - 1];
                        if (f13 == 1.0f) {
                            if (mixBlend != MixBlend.add) {
                                pl.g.a(fArr3, 0, I2, 0, length);
                                return;
                            }
                            if (lVar.k() != null) {
                                while (i11 < length) {
                                    I2[i11] = I2[i11] + fArr3[i11];
                                    i11++;
                                }
                                return;
                            } else {
                                float[] n12 = lVar.n();
                                while (i11 < length) {
                                    I2[i11] = I2[i11] + (fArr3[i11] - n12[i11]);
                                    i11++;
                                }
                                return;
                            }
                        }
                        int i13 = a.f29043a[mixBlend.ordinal()];
                        if (i13 == 1) {
                            if (lVar.k() != null) {
                                while (i11 < length) {
                                    I2[i11] = fArr3[i11] * f13;
                                    i11++;
                                }
                                return;
                            } else {
                                float[] n13 = lVar.n();
                                while (i11 < length) {
                                    float f16 = n13[i11];
                                    I2[i11] = f16 + ((fArr3[i11] - f16) * f13);
                                    i11++;
                                }
                                return;
                            }
                        }
                        if (i13 == 2 || i13 == 3) {
                            while (i11 < length) {
                                float f17 = I2[i11];
                                I2[i11] = f17 + ((fArr3[i11] - f17) * f13);
                                i11++;
                            }
                            return;
                        }
                        if (i13 != 4) {
                            return;
                        }
                        if (lVar.k() != null) {
                            while (i11 < length) {
                                I2[i11] = I2[i11] + (fArr3[i11] * f13);
                                i11++;
                            }
                            return;
                        } else {
                            float[] n14 = lVar.n();
                            while (i11 < length) {
                                I2[i11] = I2[i11] + ((fArr3[i11] - n14[i11]) * f13);
                                i11++;
                            }
                            return;
                        }
                    }
                    int i14 = m0.i(fArr2, f12);
                    float r11 = r(f12, i14);
                    float[] fArr4 = fArr[i14];
                    float[] fArr5 = fArr[i14 + 1];
                    if (f13 == 1.0f) {
                        if (mixBlend != MixBlend.add) {
                            while (i11 < length) {
                                float f18 = fArr4[i11];
                                I2[i11] = f18 + ((fArr5[i11] - f18) * r11);
                                i11++;
                            }
                            return;
                        }
                        if (lVar.k() != null) {
                            while (i11 < length) {
                                float f19 = fArr4[i11];
                                I2[i11] = I2[i11] + f19 + ((fArr5[i11] - f19) * r11);
                                i11++;
                            }
                            return;
                        }
                        float[] n15 = lVar.n();
                        while (i11 < length) {
                            float f21 = fArr4[i11];
                            I2[i11] = I2[i11] + ((f21 + ((fArr5[i11] - f21) * r11)) - n15[i11]);
                            i11++;
                        }
                        return;
                    }
                    int i15 = a.f29043a[mixBlend.ordinal()];
                    if (i15 == 1) {
                        if (lVar.k() != null) {
                            while (i11 < length) {
                                float f22 = fArr4[i11];
                                I2[i11] = (f22 + ((fArr5[i11] - f22) * r11)) * f13;
                                i11++;
                            }
                            return;
                        }
                        float[] n16 = lVar.n();
                        while (i11 < length) {
                            float f23 = fArr4[i11];
                            float f24 = n16[i11];
                            I2[i11] = f24 + (((f23 + ((fArr5[i11] - f23) * r11)) - f24) * f13);
                            i11++;
                        }
                        return;
                    }
                    if (i15 == 2 || i15 == 3) {
                        while (i11 < length) {
                            float f25 = fArr4[i11];
                            float f26 = I2[i11];
                            I2[i11] = f26 + (((f25 + ((fArr5[i11] - f25) * r11)) - f26) * f13);
                            i11++;
                        }
                        return;
                    }
                    if (i15 != 4) {
                        return;
                    }
                    if (lVar.k() != null) {
                        while (i11 < length) {
                            float f27 = fArr4[i11];
                            I2[i11] = I2[i11] + ((f27 + ((fArr5[i11] - f27) * r11)) * f13);
                            i11++;
                        }
                        return;
                    }
                    float[] n17 = lVar.n();
                    while (i11 < length) {
                        float f28 = fArr4[i11];
                        I2[i11] = I2[i11] + (((f28 + ((fArr5[i11] - f28) * r11)) - n17[i11]) * f13);
                        i11++;
                    }
                }
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int e() {
            return this.f29113b.length;
        }

        @Override // com.esotericsoftware.spine.Animation.g
        public void m(int i11, int i12, int i13, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
            float[] fArr = this.f29080c;
            int e11 = e() + (i11 * 18);
            if (i13 == 0) {
                fArr[i12] = e11 + 2;
            }
            float f19 = ((f11 - (f13 * 2.0f)) + f15) * 0.03f;
            float f21 = (0.03f * f16) - (0.06f * f14);
            float f22 = ((((f13 - f15) * 3.0f) - f11) + f17) * 0.006f;
            float f23 = ((f14 - f16) + 0.33333334f) * 0.018f;
            float f24 = (f19 * 2.0f) + f22;
            float f25 = (2.0f * f21) + f23;
            float f26 = ((f13 - f11) * 0.3f) + f19 + (f22 * 0.16666667f);
            float f27 = (f14 * 0.3f) + f21 + (0.16666667f * f23);
            float f28 = f11 + f26;
            int i14 = e11 + 18;
            float f29 = f27;
            while (e11 < i14) {
                fArr[e11] = f28;
                fArr[e11 + 1] = f27;
                f26 += f24;
                f29 += f25;
                f24 += f22;
                f25 += f23;
                f28 += f26;
                f27 += f29;
                e11 += 2;
            }
        }

        public ol.l q() {
            return this.f29083i;
        }

        public final float r(float f11, int i11) {
            float[] fArr = this.f29080c;
            int i12 = (int) fArr[i11];
            if (i12 == 0) {
                float[] fArr2 = this.f29113b;
                float f12 = fArr2[i11];
                return (f11 - f12) / (fArr2[i11 + f()] - f12);
            }
            if (i12 == 1) {
                return 0.0f;
            }
            float f13 = fArr[i12 - 2];
            if (f13 > f11) {
                float f14 = this.f29113b[i11];
                return (fArr[i12 - 1] * (f11 - f14)) / (f13 - f14);
            }
            int i13 = i12 + 16;
            for (int i14 = i12; i14 < i13; i14 += 2) {
                float f15 = fArr[i14];
                if (f15 >= f11) {
                    float f16 = fArr[i14 - 2];
                    float f17 = fArr[i14 - 1];
                    return f17 + (((f11 - f16) / (f15 - f16)) * (fArr[i14 + 1] - f17));
                }
            }
            float f18 = fArr[i12 + 14];
            float f19 = fArr[i12 + 15];
            return f19 + (((1.0f - f19) * (f11 - f18)) / (this.f29113b[i11 + f()] - f18));
        }

        public float[][] s() {
            return this.f29084j;
        }

        public void t(int i11, float f11, float[] fArr) {
            this.f29113b[i11] = f11;
            this.f29084j[i11] = fArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h0 extends m0 implements l0 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f29085e = 3;

        /* renamed from: f, reason: collision with root package name */
        public static final int f29086f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f29087g = 2;

        /* renamed from: c, reason: collision with root package name */
        public final int f29088c;

        /* renamed from: d, reason: collision with root package name */
        public final ol.f f29089d;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h0(int r3, int r4, ol.b r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.esotericsoftware.spine.Animation$y r1 = com.esotericsoftware.spine.Animation.y.sequence
                int r1 = r1.ordinal()
                r0.append(r1)
                java.lang.String r1 = "|"
                r0.append(r1)
                r0.append(r4)
                r0.append(r1)
                ol.f r5 = (ol.f) r5
                com.esotericsoftware.spine.attachments.Sequence r1 = r5.d()
                int r1 = r1.c()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String[] r0 = new java.lang.String[]{r0}
                r2.<init>(r3, r0)
                r2.f29088c = r4
                r2.f29089d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.Animation.h0.<init>(int, int, ol.b):void");
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29088c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
        
            if (r7 >= r4) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        
            r8 = r5 - r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        
            r8 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        
            if (r7 >= r4) goto L35;
         */
        @Override // com.esotericsoftware.spine.Animation.m0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(com.esotericsoftware.spine.Skeleton r3, float r4, float r5, @a3.d0 com.badlogic.gdx.utils.a<jl.c> r6, float r7, com.esotericsoftware.spine.Animation.MixBlend r8, com.esotericsoftware.spine.Animation.MixDirection r9) {
            /*
                r2 = this;
                com.badlogic.gdx.utils.a<jl.m> r3 = r3.f29194c
                int r4 = r2.f29088c
                java.lang.Object r3 = r3.get(r4)
                jl.m r3 = (jl.m) r3
                com.esotericsoftware.spine.b r4 = r3.f64408b
                boolean r4 = r4.A
                if (r4 != 0) goto L11
                goto L42
            L11:
                ol.b r4 = r3.f64411e
                ol.f r6 = r2.f29089d
                if (r4 == r6) goto L27
                boolean r6 = r4 instanceof ol.l
                if (r6 == 0) goto L42
                r6 = r4
                ol.l r6 = (ol.l) r6
                ol.b r6 = r6.m()
                ol.f r7 = r2.f29089d
                if (r6 == r7) goto L27
                goto L42
            L27:
                ol.f r4 = (ol.f) r4
                com.esotericsoftware.spine.attachments.Sequence r4 = r4.d()
                if (r4 != 0) goto L30
                goto L42
            L30:
                float[] r6 = r2.f29113b
                r7 = 0
                r9 = r6[r7]
                int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r9 >= 0) goto L48
                com.esotericsoftware.spine.Animation$MixBlend r4 = com.esotericsoftware.spine.Animation.MixBlend.setup
                if (r8 == r4) goto L43
                com.esotericsoftware.spine.Animation$MixBlend r4 = com.esotericsoftware.spine.Animation.MixBlend.first
                if (r8 != r4) goto L42
                goto L43
            L42:
                return
            L43:
                r4 = -1
                r3.l(r4)
                return
            L48:
                r8 = 3
                int r8 = com.esotericsoftware.spine.Animation.m0.j(r6, r5, r8)
                r9 = r6[r8]
                int r0 = r8 + 1
                r0 = r6[r0]
                int r0 = (int) r0
                int r8 = r8 + 2
                r6 = r6[r8]
                int r8 = r0 >> 4
                w1.o[] r4 = r4.e()
                int r4 = r4.length
                com.esotericsoftware.spine.attachments.Sequence$SequenceMode[] r1 = com.esotericsoftware.spine.attachments.Sequence.SequenceMode.values
                r0 = r0 & 15
                r0 = r1[r0]
                com.esotericsoftware.spine.attachments.Sequence$SequenceMode r1 = com.esotericsoftware.spine.attachments.Sequence.SequenceMode.hold
                if (r0 == r1) goto Lb3
                float r8 = (float) r8
                float r5 = r5 - r9
                float r5 = r5 / r6
                r6 = 953267991(0x38d1b717, float:1.0E-4)
                float r5 = r5 + r6
                float r8 = r8 + r5
                int r8 = (int) r8
                int[] r5 = com.esotericsoftware.spine.Animation.a.f29044b
                int r6 = r0.ordinal()
                r5 = r5[r6]
                switch(r5) {
                    case 1: goto Lad;
                    case 2: goto Lab;
                    case 3: goto L9f;
                    case 4: goto L97;
                    case 5: goto L91;
                    case 6: goto L7e;
                    default: goto L7d;
                }
            L7d:
                goto Lb3
            L7e:
                int r5 = r4 << 1
                int r5 = r5 + (-2)
                if (r5 != 0) goto L85
                goto L8a
            L85:
                int r8 = r8 + r4
                int r8 = r8 + (-1)
                int r7 = r8 % r5
            L8a:
                if (r7 < r4) goto L8f
            L8c:
                int r8 = r5 - r7
                goto Lb3
            L8f:
                r8 = r7
                goto Lb3
            L91:
                int r5 = r4 + (-1)
                int r8 = r8 % r4
                int r8 = r5 - r8
                goto Lb3
            L97:
                int r4 = r4 + (-1)
                int r4 = r4 - r8
                int r8 = java.lang.Math.max(r4, r7)
                goto Lb3
            L9f:
                int r5 = r4 << 1
                int r5 = r5 + (-2)
                if (r5 != 0) goto La6
                goto La8
            La6:
                int r7 = r8 % r5
            La8:
                if (r7 < r4) goto L8f
                goto L8c
            Lab:
                int r8 = r8 % r4
                goto Lb3
            Lad:
                int r4 = r4 + (-1)
                int r8 = java.lang.Math.min(r4, r8)
            Lb3:
                r3.l(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.Animation.h0.c(com.esotericsoftware.spine.Skeleton, float, float, com.badlogic.gdx.utils.a, float, com.esotericsoftware.spine.Animation$MixBlend, com.esotericsoftware.spine.Animation$MixDirection):void");
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 3;
        }

        public ol.b k() {
            return (ol.b) this.f29089d;
        }

        public void l(int i11, float f11, Sequence.SequenceMode sequenceMode, int i12, float f12) {
            int i13 = i11 * 3;
            float[] fArr = this.f29113b;
            fArr[i13] = f11;
            fArr[i13 + 1] = sequenceMode.ordinal() | (i12 << 4);
            this.f29113b[i13 + 2] = f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends m0 {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f29090d = {Integer.toString(y.drawOrder.ordinal())};

        /* renamed from: c, reason: collision with root package name */
        public final int[][] f29091c;

        public i(int i11) {
            super(i11, f29090d);
            this.f29091c = new int[i11][];
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            if (mixDirection == MixDirection.out) {
                if (mixBlend == MixBlend.setup) {
                    com.badlogic.gdx.utils.a<jl.m> aVar2 = skeleton.f29194c;
                    pl.g.a(aVar2.f13178a, 0, skeleton.f29195d.f13178a, 0, aVar2.f13179b);
                    return;
                }
                return;
            }
            float[] fArr = this.f29113b;
            if (f12 < fArr[0]) {
                if (mixBlend == MixBlend.setup || mixBlend == MixBlend.first) {
                    com.badlogic.gdx.utils.a<jl.m> aVar3 = skeleton.f29194c;
                    pl.g.a(aVar3.f13178a, 0, skeleton.f29195d.f13178a, 0, aVar3.f13179b);
                    return;
                }
                return;
            }
            int[] iArr = this.f29091c[m0.i(fArr, f12)];
            if (iArr == null) {
                com.badlogic.gdx.utils.a<jl.m> aVar4 = skeleton.f29194c;
                pl.g.a(aVar4.f13178a, 0, skeleton.f29195d.f13178a, 0, aVar4.f13179b);
                return;
            }
            jl.m[] mVarArr = skeleton.f29194c.f13178a;
            jl.m[] mVarArr2 = skeleton.f29195d.f13178a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                mVarArr2[i11] = mVarArr[iArr[i11]];
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int e() {
            return this.f29113b.length;
        }

        public int[][] k() {
            return this.f29091c;
        }

        public void l(int i11, float f11, @a3.d0 int[] iArr) {
            this.f29113b[i11] = f11;
            this.f29091c[i11] = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i0 extends f implements d {

        /* renamed from: k, reason: collision with root package name */
        public final int f29092k;

        public i0(int i11, int i12, int i13) {
            super(i11, i12, y.shearX.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.shearY.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29092k = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29092k;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29092k);
            if (bVar.A) {
                float[] fArr = this.f29113b;
                if (f12 < fArr[0]) {
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        BoneData boneData = bVar.f29330a;
                        bVar.f29339j = boneData.f29173j;
                        bVar.f29340k = boneData.f29174k;
                        return;
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        float f16 = bVar.f29339j;
                        BoneData boneData2 = bVar.f29330a;
                        bVar.f29339j = f16 + ((boneData2.f29173j - f16) * f13);
                        float f17 = bVar.f29340k;
                        bVar.f29340k = f17 + ((boneData2.f29174k - f17) * f13);
                        return;
                    }
                }
                int j11 = m0.j(fArr, f12, 3);
                int i12 = (int) this.f29080c[j11 / 3];
                if (i12 == 0) {
                    float f18 = fArr[j11];
                    float f19 = fArr[j11 + 1];
                    float f21 = fArr[j11 + 2];
                    float f22 = (f12 - f18) / (fArr[j11 + 3] - f18);
                    float f23 = ((fArr[j11 + 4] - f19) * f22) + f19;
                    f14 = f21 + ((fArr[j11 + 5] - f21) * f22);
                    f15 = f23;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f14 = k(f12, j11, 2, i12 + 16);
                } else {
                    float f24 = fArr[j11 + 1];
                    f14 = fArr[j11 + 2];
                    f15 = f24;
                }
                int i13 = a.f29043a[mixBlend.ordinal()];
                if (i13 == 1) {
                    BoneData boneData3 = bVar.f29330a;
                    bVar.f29339j = boneData3.f29173j + (f15 * f13);
                    bVar.f29340k = boneData3.f29174k + (f14 * f13);
                } else {
                    if (i13 != 2 && i13 != 3) {
                        if (i13 != 4) {
                            return;
                        }
                        bVar.f29339j += f15 * f13;
                        bVar.f29340k += f14 * f13;
                        return;
                    }
                    float f25 = bVar.f29339j;
                    BoneData boneData4 = bVar.f29330a;
                    bVar.f29339j = f25 + (((boneData4.f29173j + f15) - f25) * f13);
                    float f26 = bVar.f29340k;
                    bVar.f29340k = f26 + (((boneData4.f29174k + f14) - f26) * f13);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j extends m0 {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f29093d = {Integer.toString(y.event.ordinal())};

        /* renamed from: c, reason: collision with root package name */
        public final jl.c[] f29094c;

        public j(int i11) {
            super(i11, f29093d);
            this.f29094c = new jl.c[i11];
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            if (aVar == null) {
                return;
            }
            float[] fArr = this.f29113b;
            int length = fArr.length;
            if (f11 > f12) {
                c(skeleton, f11, 2.14748365E9f, aVar, f13, mixBlend, mixDirection);
                f14 = -1.0f;
            } else if (f11 >= fArr[length - 1]) {
                return;
            } else {
                f14 = f11;
            }
            int i11 = 0;
            float f15 = fArr[0];
            if (f12 < f15) {
                return;
            }
            if (f14 >= f15) {
                int i12 = m0.i(fArr, f14) + 1;
                float f16 = fArr[i12];
                while (i12 > 0 && fArr[i12 - 1] == f16) {
                    i12--;
                }
                i11 = i12;
            }
            while (i11 < length && f12 >= fArr[i11]) {
                aVar.a(this.f29094c[i11]);
                i11++;
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int e() {
            return this.f29113b.length;
        }

        public jl.c[] k() {
            return this.f29094c;
        }

        public void l(int i11, jl.c cVar) {
            this.f29113b[i11] = cVar.f64312g;
            this.f29094c[i11] = cVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29095j;

        public j0(int i11, int i12, int i13) {
            super(i11, i12, y.shearX.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29095j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29095j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29095j);
            if (bVar.A) {
                bVar.f29339j = t(f12, f13, mixBlend, bVar.f29339j, bVar.f29330a.f29173j);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends g {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29096i = 6;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29097j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29098k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29099l = 3;

        /* renamed from: m, reason: collision with root package name */
        public static final int f29100m = 4;

        /* renamed from: n, reason: collision with root package name */
        public static final int f29101n = 5;

        /* renamed from: h, reason: collision with root package name */
        public final int f29102h;

        public k(int i11, int i12, int i13) {
            super(i11, i12, y.ikConstraint.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29102h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            com.esotericsoftware.spine.c cVar = skeleton.f29196e.get(this.f29102h);
            if (cVar.f29365i) {
                float[] fArr = this.f29113b;
                if (f12 < fArr[0]) {
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        jl.e eVar = cVar.f29357a;
                        cVar.f29363g = eVar.f64326j;
                        cVar.f29364h = eVar.f64327k;
                        cVar.f29360d = eVar.f64322f;
                        cVar.f29361e = eVar.f64323g;
                        cVar.f29362f = eVar.f64324h;
                        return;
                    }
                    if (i11 != 2) {
                        return;
                    }
                    float f16 = cVar.f29363g;
                    jl.e eVar2 = cVar.f29357a;
                    cVar.f29363g = f16 + ((eVar2.f64326j - f16) * f13);
                    float f17 = cVar.f29364h;
                    cVar.f29364h = f17 + ((eVar2.f64327k - f17) * f13);
                    cVar.f29360d = eVar2.f64322f;
                    cVar.f29361e = eVar2.f64323g;
                    cVar.f29362f = eVar2.f64324h;
                    return;
                }
                int j11 = m0.j(fArr, f12, 6);
                int i12 = (int) this.f29080c[j11 / 6];
                if (i12 == 0) {
                    float f18 = fArr[j11];
                    float f19 = fArr[j11 + 1];
                    float f21 = fArr[j11 + 2];
                    float f22 = (f12 - f18) / (fArr[j11 + 6] - f18);
                    float f23 = ((fArr[j11 + 7] - f19) * f22) + f19;
                    f14 = f21 + ((fArr[j11 + 8] - f21) * f22);
                    f15 = f23;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f14 = k(f12, j11, 2, i12 + 16);
                } else {
                    f15 = fArr[j11 + 1];
                    f14 = fArr[j11 + 2];
                }
                if (mixBlend != MixBlend.setup) {
                    float f24 = cVar.f29363g;
                    cVar.f29363g = f24 + ((f15 - f24) * f13);
                    float f25 = cVar.f29364h;
                    cVar.f29364h = f25 + ((f14 - f25) * f13);
                    if (mixDirection == MixDirection.in) {
                        cVar.f29360d = (int) fArr[j11 + 3];
                        cVar.f29361e = fArr[j11 + 4] != 0.0f;
                        cVar.f29362f = fArr[j11 + 5] != 0.0f;
                        return;
                    }
                    return;
                }
                jl.e eVar3 = cVar.f29357a;
                float f26 = eVar3.f64326j;
                cVar.f29363g = f26 + ((f15 - f26) * f13);
                float f27 = eVar3.f64327k;
                cVar.f29364h = f27 + ((f14 - f27) * f13);
                if (mixDirection == MixDirection.out) {
                    cVar.f29360d = eVar3.f64322f;
                    cVar.f29361e = eVar3.f64323g;
                    cVar.f29362f = eVar3.f64324h;
                } else {
                    cVar.f29360d = (int) fArr[j11 + 3];
                    cVar.f29361e = fArr[j11 + 4] != 0.0f;
                    cVar.f29362f = fArr[j11 + 5] != 0.0f;
                }
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 6;
        }

        public int q() {
            return this.f29102h;
        }

        public void r(int i11, float f11, float f12, float f13, int i12, boolean z11, boolean z12) {
            int i13 = i11 * 6;
            float[] fArr = this.f29113b;
            fArr[i13] = f11;
            fArr[i13 + 1] = f12;
            fArr[i13 + 2] = f13;
            fArr[i13 + 3] = i12;
            fArr[i13 + 4] = z11 ? 1.0f : 0.0f;
            fArr[i13 + 5] = z12 ? 1.0f : 0.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29103j;

        public k0(int i11, int i12, int i13) {
            super(i11, i12, y.shearY.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29103j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29103j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29103j);
            if (bVar.A) {
                bVar.f29340k = t(f12, f13, mixBlend, bVar.f29340k, bVar.f29330a.f29174k);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends m0 implements d {

        /* renamed from: d, reason: collision with root package name */
        public static final int f29104d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f29105e = 1;

        /* renamed from: c, reason: collision with root package name */
        public final int f29106c;

        public l(int i11, int i12) {
            super(i11, y.inherit.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i12);
            this.f29106c = i12;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29106c;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29106c);
            if (bVar.A) {
                if (mixDirection == MixDirection.out) {
                    if (mixBlend == MixBlend.setup) {
                        bVar.f29354y = bVar.f29330a.f29175l;
                        return;
                    }
                    return;
                }
                float[] fArr = this.f29113b;
                if (f12 >= fArr[0]) {
                    bVar.f29354y = BoneData.Inherit.values[(int) fArr[m0.j(fArr, f12, 2) + 1]];
                } else if (mixBlend == MixBlend.setup || mixBlend == MixBlend.first) {
                    bVar.f29354y = bVar.f29330a.f29175l;
                }
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 2;
        }

        public void k(int i11, float f11, BoneData.Inherit inherit) {
            int i12 = i11 * 2;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = inherit.ordinal();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface l0 {
        int a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m extends g {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29107i = 4;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29108j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29109k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29110l = 3;

        /* renamed from: h, reason: collision with root package name */
        public final int f29111h;

        public m(int i11, int i12, int i13) {
            super(i11, i12, y.pathConstraintMix.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29111h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            float f16;
            com.esotericsoftware.spine.d dVar = skeleton.f29198g.get(this.f29111h);
            if (dVar.f29379i) {
                float[] fArr = this.f29113b;
                if (f12 < fArr[0]) {
                    PathConstraintData pathConstraintData = dVar.f29371a;
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        dVar.f29376f = pathConstraintData.f29188l;
                        dVar.f29377g = pathConstraintData.f29189m;
                        dVar.f29378h = pathConstraintData.f29190n;
                        return;
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        float f17 = dVar.f29376f;
                        dVar.f29376f = f17 + ((pathConstraintData.f29188l - f17) * f13);
                        float f18 = dVar.f29377g;
                        dVar.f29377g = f18 + ((pathConstraintData.f29189m - f18) * f13);
                        float f19 = dVar.f29378h;
                        dVar.f29378h = f19 + ((pathConstraintData.f29190n - f19) * f13);
                        return;
                    }
                }
                int j11 = m0.j(fArr, f12, 4);
                int i12 = (int) this.f29080c[j11 >> 2];
                if (i12 == 0) {
                    float f21 = fArr[j11];
                    float f22 = fArr[j11 + 1];
                    float f23 = fArr[j11 + 2];
                    float f24 = fArr[j11 + 3];
                    float f25 = (f12 - f21) / (fArr[j11 + 4] - f21);
                    float f26 = ((fArr[j11 + 5] - f22) * f25) + f22;
                    float f27 = ((fArr[j11 + 6] - f23) * f25) + f23;
                    f14 = f24 + ((fArr[j11 + 7] - f24) * f25);
                    f15 = f26;
                    f16 = f27;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f16 = k(f12, j11, 2, i12 + 16);
                    f14 = k(f12, j11, 3, i12 + 34);
                } else {
                    float f28 = fArr[j11 + 1];
                    f16 = fArr[j11 + 2];
                    f14 = fArr[j11 + 3];
                    f15 = f28;
                }
                if (mixBlend != MixBlend.setup) {
                    float f29 = dVar.f29376f;
                    dVar.f29376f = f29 + ((f15 - f29) * f13);
                    float f31 = dVar.f29377g;
                    dVar.f29377g = f31 + ((f16 - f31) * f13);
                    float f32 = dVar.f29378h;
                    dVar.f29378h = f32 + ((f14 - f32) * f13);
                    return;
                }
                PathConstraintData pathConstraintData2 = dVar.f29371a;
                float f33 = pathConstraintData2.f29188l;
                dVar.f29376f = f33 + ((f15 - f33) * f13);
                float f34 = pathConstraintData2.f29189m;
                dVar.f29377g = f34 + ((f16 - f34) * f13);
                float f35 = pathConstraintData2.f29190n;
                dVar.f29378h = f35 + ((f14 - f35) * f13);
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 4;
        }

        public int q() {
            return this.f29111h;
        }

        public void r(int i11, float f11, float f12, float f13, float f14) {
            int i12 = i11 << 2;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class m0 {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f29112a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f29113b;

        public m0(int i11, String... strArr) {
            if (strArr == null) {
                throw new IllegalArgumentException("propertyIds cannot be null.");
            }
            this.f29112a = strArr;
            this.f29113b = new float[i11 * f()];
        }

        public static int i(float[] fArr, float f11) {
            int length = fArr.length;
            for (int i11 = 1; i11 < length; i11++) {
                if (fArr[i11] > f11) {
                    return i11 - 1;
                }
            }
            return length - 1;
        }

        public static int j(float[] fArr, float f11, int i11) {
            int length = fArr.length;
            int i12 = i11;
            while (i12 < length) {
                if (fArr[i12] > f11) {
                    return i12 - i11;
                }
                i12 += i11;
            }
            return length - i11;
        }

        public abstract void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection);

        public float d() {
            float[] fArr = this.f29113b;
            return fArr[fArr.length - f()];
        }

        public int e() {
            return this.f29113b.length / f();
        }

        public int f() {
            return 1;
        }

        public float[] g() {
            return this.f29113b;
        }

        public String[] h() {
            return this.f29112a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n extends e {

        /* renamed from: j, reason: collision with root package name */
        public final int f29114j;

        public n(int i11, int i12, int i13) {
            super(i11, i12, y.pathConstraintPosition.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29114j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.d dVar = skeleton.f29198g.get(this.f29114j);
            if (dVar.f29379i) {
                dVar.f29374d = q(f12, f13, mixBlend, dVar.f29374d, dVar.f29371a.f29186j);
            }
        }

        public int w() {
            return this.f29114j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n0 extends g {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29115i = 7;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29116j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29117k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29118l = 3;

        /* renamed from: m, reason: collision with root package name */
        public static final int f29119m = 4;

        /* renamed from: n, reason: collision with root package name */
        public static final int f29120n = 5;

        /* renamed from: o, reason: collision with root package name */
        public static final int f29121o = 6;

        /* renamed from: h, reason: collision with root package name */
        public final int f29122h;

        public n0(int i11, int i12, int i13) {
            super(i11, i12, y.transformConstraint.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29122h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            com.esotericsoftware.spine.i iVar = skeleton.f29197f.get(this.f29122h);
            if (iVar.f29475j) {
                float[] fArr = this.f29113b;
                if (f12 < fArr[0]) {
                    jl.o oVar = iVar.f29466a;
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        iVar.f29469d = oVar.f64425f;
                        iVar.f29470e = oVar.f64426g;
                        iVar.f29471f = oVar.f64427h;
                        iVar.f29472g = oVar.f64428i;
                        iVar.f29473h = oVar.f64429j;
                        iVar.f29474i = oVar.f64430k;
                        return;
                    }
                    if (i11 != 2) {
                        return;
                    }
                    float f21 = iVar.f29469d;
                    iVar.f29469d = f21 + ((oVar.f64425f - f21) * f13);
                    float f22 = iVar.f29470e;
                    iVar.f29470e = f22 + ((oVar.f64426g - f22) * f13);
                    float f23 = iVar.f29471f;
                    iVar.f29471f = f23 + ((oVar.f64427h - f23) * f13);
                    float f24 = iVar.f29472g;
                    iVar.f29472g = f24 + ((oVar.f64428i - f24) * f13);
                    float f25 = iVar.f29473h;
                    iVar.f29473h = f25 + ((oVar.f64429j - f25) * f13);
                    float f26 = iVar.f29474i;
                    iVar.f29474i = f26 + ((oVar.f64430k - f26) * f13);
                    return;
                }
                int j11 = m0.j(fArr, f12, 7);
                int i12 = (int) this.f29080c[j11 / 7];
                if (i12 == 0) {
                    float f27 = fArr[j11];
                    float f28 = fArr[j11 + 1];
                    float f29 = fArr[j11 + 2];
                    float f31 = fArr[j11 + 3];
                    float f32 = fArr[j11 + 4];
                    float f33 = fArr[j11 + 5];
                    float f34 = fArr[j11 + 6];
                    float f35 = (f12 - f27) / (fArr[j11 + 7] - f27);
                    float f36 = ((fArr[j11 + 8] - f28) * f35) + f28;
                    float f37 = ((fArr[j11 + 9] - f29) * f35) + f29;
                    float f38 = ((fArr[j11 + 10] - f31) * f35) + f31;
                    f14 = f32 + ((fArr[j11 + 11] - f32) * f35);
                    f15 = f33 + ((fArr[j11 + 12] - f33) * f35);
                    f16 = f34 + ((fArr[j11 + 13] - f34) * f35);
                    f17 = f36;
                    f18 = f37;
                    f19 = f38;
                } else if (i12 != 1) {
                    f17 = k(f12, j11, 1, i12 - 2);
                    f18 = k(f12, j11, 2, i12 + 16);
                    f19 = k(f12, j11, 3, i12 + 34);
                    f14 = k(f12, j11, 4, i12 + 52);
                    f15 = k(f12, j11, 5, i12 + 70);
                    f16 = k(f12, j11, 6, i12 + 88);
                } else {
                    float f39 = fArr[j11 + 1];
                    f18 = fArr[j11 + 2];
                    f19 = fArr[j11 + 3];
                    f14 = fArr[j11 + 4];
                    f15 = fArr[j11 + 5];
                    f16 = fArr[j11 + 6];
                    f17 = f39;
                }
                if (mixBlend != MixBlend.setup) {
                    float f41 = iVar.f29469d;
                    iVar.f29469d = f41 + ((f17 - f41) * f13);
                    float f42 = iVar.f29470e;
                    iVar.f29470e = f42 + ((f18 - f42) * f13);
                    float f43 = iVar.f29471f;
                    iVar.f29471f = f43 + ((f19 - f43) * f13);
                    float f44 = iVar.f29472g;
                    iVar.f29472g = f44 + ((f14 - f44) * f13);
                    float f45 = iVar.f29473h;
                    iVar.f29473h = f45 + ((f15 - f45) * f13);
                    float f46 = iVar.f29474i;
                    iVar.f29474i = f46 + ((f16 - f46) * f13);
                    return;
                }
                jl.o oVar2 = iVar.f29466a;
                float f47 = oVar2.f64425f;
                iVar.f29469d = f47 + ((f17 - f47) * f13);
                float f48 = oVar2.f64426g;
                iVar.f29470e = f48 + ((f18 - f48) * f13);
                float f49 = oVar2.f64427h;
                iVar.f29471f = f49 + ((f19 - f49) * f13);
                float f51 = oVar2.f64428i;
                iVar.f29472g = f51 + ((f14 - f51) * f13);
                float f52 = oVar2.f64429j;
                iVar.f29473h = f52 + ((f15 - f52) * f13);
                float f53 = oVar2.f64430k;
                iVar.f29474i = f53 + ((f16 - f53) * f13);
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 7;
        }

        public int q() {
            return this.f29122h;
        }

        public void r(int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            int i12 = i11 * 7;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
            fArr[i12 + 4] = f15;
            fArr[i12 + 5] = f16;
            fArr[i12 + 6] = f17;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o extends e {

        /* renamed from: j, reason: collision with root package name */
        public final int f29123j;

        public o(int i11, int i12, int i13) {
            super(i11, i12, y.pathConstraintSpacing.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29123j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.d dVar = skeleton.f29198g.get(this.f29123j);
            if (dVar.f29379i) {
                dVar.f29375e = q(f12, f13, mixBlend, dVar.f29375e, dVar.f29371a.f29187k);
            }
        }

        public int w() {
            return this.f29123j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o0 extends f implements d {

        /* renamed from: k, reason: collision with root package name */
        public final int f29124k;

        public o0(int i11, int i12, int i13) {
            super(i11, i12, y.x.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.y.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29124k = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29124k;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29124k);
            if (bVar.A) {
                float[] fArr = this.f29113b;
                if (f12 < fArr[0]) {
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        BoneData boneData = bVar.f29330a;
                        bVar.f29334e = boneData.f29168e;
                        bVar.f29335f = boneData.f29169f;
                        return;
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        float f16 = bVar.f29334e;
                        BoneData boneData2 = bVar.f29330a;
                        bVar.f29334e = f16 + ((boneData2.f29168e - f16) * f13);
                        float f17 = bVar.f29335f;
                        bVar.f29335f = f17 + ((boneData2.f29169f - f17) * f13);
                        return;
                    }
                }
                int j11 = m0.j(fArr, f12, 3);
                int i12 = (int) this.f29080c[j11 / 3];
                if (i12 == 0) {
                    float f18 = fArr[j11];
                    float f19 = fArr[j11 + 1];
                    float f21 = fArr[j11 + 2];
                    float f22 = (f12 - f18) / (fArr[j11 + 3] - f18);
                    float f23 = ((fArr[j11 + 4] - f19) * f22) + f19;
                    f14 = f21 + ((fArr[j11 + 5] - f21) * f22);
                    f15 = f23;
                } else if (i12 != 1) {
                    f15 = k(f12, j11, 1, i12 - 2);
                    f14 = k(f12, j11, 2, i12 + 16);
                } else {
                    float f24 = fArr[j11 + 1];
                    f14 = fArr[j11 + 2];
                    f15 = f24;
                }
                int i13 = a.f29043a[mixBlend.ordinal()];
                if (i13 == 1) {
                    BoneData boneData3 = bVar.f29330a;
                    bVar.f29334e = boneData3.f29168e + (f15 * f13);
                    bVar.f29335f = boneData3.f29169f + (f14 * f13);
                } else {
                    if (i13 != 2 && i13 != 3) {
                        if (i13 != 4) {
                            return;
                        }
                        bVar.f29334e += f15 * f13;
                        bVar.f29335f += f14 * f13;
                        return;
                    }
                    float f25 = bVar.f29334e;
                    BoneData boneData4 = bVar.f29330a;
                    bVar.f29334e = f25 + (((boneData4.f29168e + f15) - f25) * f13);
                    float f26 = bVar.f29335f;
                    bVar.f29335f = f26 + (((boneData4.f29169f + f14) - f26) * f13);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p extends w {
        public p(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintDamping);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return eVar.f29387a.f64338n;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return eVar.f29391e;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64345u;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29391e = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29125j;

        public p0(int i11, int i12, int i13) {
            super(i11, i12, y.x.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29125j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29125j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29125j);
            if (bVar.A) {
                bVar.f29334e = t(f12, f13, mixBlend, bVar.f29334e, bVar.f29330a.f29168e);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q extends w {
        public q(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintGravity);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return eVar.f29387a.f64341q;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return eVar.f29394h;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64348x;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29394h = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q0 extends e implements d {

        /* renamed from: j, reason: collision with root package name */
        public final int f29126j;

        public q0(int i11, int i12, int i13) {
            super(i11, i12, y.y.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29126j = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.d
        public int b() {
            return this.f29126j;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.b bVar = skeleton.f29193b.get(this.f29126j);
            if (bVar.A) {
                bVar.f29335f = t(f12, f13, mixBlend, bVar.f29335f, bVar.f29330a.f29169f);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r extends w {
        public r(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintInertia);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return eVar.f29387a.f64336l;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return eVar.f29389c;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64343s;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29389c = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s extends w {
        public s(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintMass);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return 1.0f / eVar.f29387a.f64339o;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return 1.0f / eVar.f29392f;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64346v;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29392f = 1.0f / f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class t extends w {
        public t(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintMix);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return eVar.f29387a.f64342r;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return eVar.f29395i;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64349y;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29395i = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class u extends m0 {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f29127d = {Integer.toString(y.physicsConstraintReset.ordinal())};

        /* renamed from: c, reason: collision with root package name */
        public final int f29128c;

        public u(int i11, int i12) {
            super(i11, f29127d);
            this.f29128c = i12;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            com.esotericsoftware.spine.e eVar;
            int i11 = this.f29128c;
            if (i11 != -1) {
                eVar = skeleton.f29199h.get(i11);
                if (!eVar.f29411y) {
                    return;
                }
            } else {
                eVar = null;
            }
            float[] fArr = this.f29113b;
            if (f11 > f12) {
                c(skeleton, f11, 2.14748365E9f, null, f13, mixBlend, mixDirection);
                f11 = -1.0f;
            } else if (f11 >= fArr[fArr.length - 1]) {
                return;
            }
            float f14 = fArr[0];
            if (f12 < f14) {
                return;
            }
            if (f11 < f14 || f12 >= fArr[m0.i(fArr, f11) + 1]) {
                if (eVar != null) {
                    eVar.k();
                    return;
                }
                com.badlogic.gdx.utils.a<com.esotericsoftware.spine.e> aVar2 = skeleton.f29199h;
                com.esotericsoftware.spine.e[] eVarArr = aVar2.f13178a;
                int i12 = aVar2.f13179b;
                for (int i13 = 0; i13 < i12; i13++) {
                    com.esotericsoftware.spine.e eVar2 = eVarArr[i13];
                    if (eVar2.f29411y) {
                        eVar2.k();
                    }
                }
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int e() {
            return this.f29113b.length;
        }

        public int k() {
            return this.f29128c;
        }

        public void l(int i11, float f11) {
            this.f29113b[i11] = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v extends w {
        public v(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintStrength);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return eVar.f29387a.f64337m;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return eVar.f29390d;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64344t;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29390d = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class w extends e {

        /* renamed from: j, reason: collision with root package name */
        public final int f29129j;

        public w(int i11, int i12, int i13, y yVar) {
            super(i11, i12, yVar.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29129j = i13;
        }

        public abstract float A(com.esotericsoftware.spine.e eVar);

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            MixBlend mixBlend2;
            int i11 = this.f29129j;
            if (i11 != -1) {
                com.esotericsoftware.spine.e eVar = skeleton.f29199h.get(i11);
                if (eVar.f29411y) {
                    z(eVar, q(f12, f13, mixBlend, w(eVar), A(eVar)));
                    return;
                }
                return;
            }
            int i12 = 0;
            float s11 = f12 >= this.f29113b[0] ? s(f12) : 0.0f;
            com.badlogic.gdx.utils.a<com.esotericsoftware.spine.e> aVar2 = skeleton.f29199h;
            com.esotericsoftware.spine.e[] eVarArr = aVar2.f13178a;
            int i13 = aVar2.f13179b;
            while (i12 < i13) {
                com.esotericsoftware.spine.e eVar2 = eVarArr[i12];
                if (eVar2.f29411y && y(eVar2.f29387a)) {
                    f14 = f12;
                    f15 = f13;
                    mixBlend2 = mixBlend;
                    z(eVar2, r(f14, f15, mixBlend2, w(eVar2), A(eVar2), s11));
                } else {
                    f14 = f12;
                    f15 = f13;
                    mixBlend2 = mixBlend;
                }
                i12++;
                f12 = f14;
                f13 = f15;
                mixBlend = mixBlend2;
            }
        }

        public abstract float w(com.esotericsoftware.spine.e eVar);

        public int x() {
            return this.f29129j;
        }

        public abstract boolean y(jl.f fVar);

        public abstract void z(com.esotericsoftware.spine.e eVar, float f11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x extends w {
        public x(int i11, int i12, int i13) {
            super(i11, i12, i13, y.physicsConstraintWind);
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float A(com.esotericsoftware.spine.e eVar) {
            return eVar.f29387a.f64340p;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public float w(com.esotericsoftware.spine.e eVar) {
            return eVar.f29393g;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public boolean y(jl.f fVar) {
            return fVar.f64347w;
        }

        @Override // com.esotericsoftware.spine.Animation.w
        public void z(com.esotericsoftware.spine.e eVar, float f11) {
            eVar.f29393g = f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum y {
        rotate,
        x,
        y,
        scaleX,
        scaleY,
        shearX,
        shearY,
        inherit,
        rgb,
        alpha,
        rgb2,
        attachment,
        deform,
        event,
        drawOrder,
        ikConstraint,
        transformConstraint,
        pathConstraintPosition,
        pathConstraintSpacing,
        pathConstraintMix,
        physicsConstraintInertia,
        physicsConstraintStrength,
        physicsConstraintDamping,
        physicsConstraintMass,
        physicsConstraintWind,
        physicsConstraintGravity,
        physicsConstraintMix,
        physicsConstraintReset,
        sequence
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class z extends g implements l0 {

        /* renamed from: i, reason: collision with root package name */
        public static final int f29156i = 7;

        /* renamed from: j, reason: collision with root package name */
        public static final int f29157j = 1;

        /* renamed from: k, reason: collision with root package name */
        public static final int f29158k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f29159l = 3;

        /* renamed from: m, reason: collision with root package name */
        public static final int f29160m = 4;

        /* renamed from: n, reason: collision with root package name */
        public static final int f29161n = 5;

        /* renamed from: o, reason: collision with root package name */
        public static final int f29162o = 6;

        /* renamed from: h, reason: collision with root package name */
        public final int f29163h;

        public z(int i11, int i12, int i13) {
            super(i11, i12, y.rgb.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13, y.rgb2.ordinal() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i13);
            this.f29163h = i13;
        }

        @Override // com.esotericsoftware.spine.Animation.l0
        public int a() {
            return this.f29163h;
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public void c(Skeleton skeleton, float f11, float f12, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            jl.m mVar = skeleton.f29194c.get(this.f29163h);
            if (mVar.f64408b.A) {
                float[] fArr = this.f29113b;
                com.badlogic.gdx.graphics.b bVar = mVar.f64409c;
                com.badlogic.gdx.graphics.b bVar2 = mVar.f64410d;
                if (f12 < fArr[0]) {
                    jl.n nVar = mVar.f64407a;
                    com.badlogic.gdx.graphics.b bVar3 = nVar.f64418d;
                    com.badlogic.gdx.graphics.b bVar4 = nVar.f64419e;
                    int i11 = a.f29043a[mixBlend.ordinal()];
                    if (i11 == 1) {
                        bVar.f11544a = bVar3.f11544a;
                        bVar.f11545b = bVar3.f11545b;
                        bVar.f11546c = bVar3.f11546c;
                        bVar2.f11544a = bVar4.f11544a;
                        bVar2.f11545b = bVar4.f11545b;
                        bVar2.f11546c = bVar4.f11546c;
                        return;
                    }
                    if (i11 != 2) {
                        return;
                    }
                    float f21 = bVar.f11544a;
                    bVar.f11544a = f21 + ((bVar3.f11544a - f21) * f13);
                    float f22 = bVar.f11545b;
                    bVar.f11545b = f22 + ((bVar3.f11545b - f22) * f13);
                    float f23 = bVar.f11546c;
                    bVar.f11546c = f23 + ((bVar3.f11546c - f23) * f13);
                    float f24 = bVar2.f11544a;
                    bVar2.f11544a = f24 + ((bVar4.f11544a - f24) * f13);
                    float f25 = bVar2.f11545b;
                    bVar2.f11545b = f25 + ((bVar4.f11545b - f25) * f13);
                    float f26 = bVar2.f11546c;
                    bVar2.f11546c = f26 + ((bVar4.f11546c - f26) * f13);
                    return;
                }
                int j11 = m0.j(fArr, f12, 7);
                int i12 = (int) this.f29080c[j11 / 7];
                if (i12 == 0) {
                    float f27 = fArr[j11];
                    float f28 = fArr[j11 + 1];
                    float f29 = fArr[j11 + 2];
                    float f31 = fArr[j11 + 3];
                    float f32 = fArr[j11 + 4];
                    float f33 = fArr[j11 + 5];
                    float f34 = fArr[j11 + 6];
                    float f35 = (f12 - f27) / (fArr[j11 + 7] - f27);
                    float f36 = ((fArr[j11 + 8] - f28) * f35) + f28;
                    float f37 = ((fArr[j11 + 9] - f29) * f35) + f29;
                    float f38 = ((fArr[j11 + 10] - f31) * f35) + f31;
                    f14 = f32 + ((fArr[j11 + 11] - f32) * f35);
                    f15 = f33 + ((fArr[j11 + 12] - f33) * f35);
                    f16 = f34 + ((fArr[j11 + 13] - f34) * f35);
                    f17 = f36;
                    f18 = f37;
                    f19 = f38;
                } else if (i12 != 1) {
                    f17 = k(f12, j11, 1, i12 - 2);
                    f18 = k(f12, j11, 2, i12 + 16);
                    f19 = k(f12, j11, 3, i12 + 34);
                    f14 = k(f12, j11, 4, i12 + 52);
                    f15 = k(f12, j11, 5, i12 + 70);
                    f16 = k(f12, j11, 6, i12 + 88);
                } else {
                    float f39 = fArr[j11 + 1];
                    f18 = fArr[j11 + 2];
                    f19 = fArr[j11 + 3];
                    f14 = fArr[j11 + 4];
                    f15 = fArr[j11 + 5];
                    float f41 = fArr[j11 + 6];
                    f17 = f39;
                    f16 = f41;
                }
                if (f13 == 1.0f) {
                    bVar.f11544a = f17;
                    bVar.f11545b = f18;
                    bVar.f11546c = f19;
                    bVar2.f11544a = f14;
                    bVar2.f11545b = f15;
                    bVar2.f11546c = f16;
                    return;
                }
                if (mixBlend == MixBlend.setup) {
                    jl.n nVar2 = mVar.f64407a;
                    com.badlogic.gdx.graphics.b bVar5 = nVar2.f64418d;
                    com.badlogic.gdx.graphics.b bVar6 = nVar2.f64419e;
                    bVar.f11544a = bVar5.f11544a;
                    bVar.f11545b = bVar5.f11545b;
                    bVar.f11546c = bVar5.f11546c;
                    bVar2.f11544a = bVar6.f11544a;
                    bVar2.f11545b = bVar6.f11545b;
                    bVar2.f11546c = bVar6.f11546c;
                }
                float f42 = bVar.f11544a;
                bVar.f11544a = f42 + ((f17 - f42) * f13);
                float f43 = bVar.f11545b;
                bVar.f11545b = f43 + ((f18 - f43) * f13);
                float f44 = bVar.f11546c;
                bVar.f11546c = f44 + ((f19 - f44) * f13);
                float f45 = bVar2.f11544a;
                bVar2.f11544a = f45 + ((f14 - f45) * f13);
                float f46 = bVar2.f11545b;
                bVar2.f11545b = f46 + ((f15 - f46) * f13);
                float f47 = bVar2.f11546c;
                bVar2.f11546c = f47 + ((f16 - f47) * f13);
            }
        }

        @Override // com.esotericsoftware.spine.Animation.m0
        public int f() {
            return 7;
        }

        public void q(int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            int i12 = i11 * 7;
            float[] fArr = this.f29113b;
            fArr[i12] = f11;
            fArr[i12 + 1] = f12;
            fArr[i12 + 2] = f13;
            fArr[i12 + 3] = f14;
            fArr[i12 + 4] = f15;
            fArr[i12 + 5] = f16;
            fArr[i12 + 6] = f17;
        }
    }

    public Animation(String str, com.badlogic.gdx.utils.a<m0> aVar, float f11) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f29038a = str;
        this.f29041d = f11;
        this.f29040c = new com.badlogic.gdx.utils.m<>(aVar.f13179b);
        g(aVar);
    }

    public void a(Skeleton skeleton, float f11, float f12, boolean z11, @a3.d0 com.badlogic.gdx.utils.a<jl.c> aVar, float f13, MixBlend mixBlend, MixDirection mixDirection) {
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        if (z11) {
            float f14 = this.f29041d;
            if (f14 != 0.0f) {
                f12 %= f14;
                if (f11 > 0.0f) {
                    f11 %= f14;
                }
            }
        }
        float f15 = f11;
        float f16 = f12;
        com.badlogic.gdx.utils.a<m0> aVar2 = this.f29039b;
        m0[] m0VarArr = aVar2.f13178a;
        int i11 = aVar2.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            m0VarArr[i12].c(skeleton, f15, f16, aVar, f13, mixBlend, mixDirection);
        }
    }

    public float b() {
        return this.f29041d;
    }

    public String c() {
        return this.f29038a;
    }

    public com.badlogic.gdx.utils.a<m0> d() {
        return this.f29039b;
    }

    public boolean e(String[] strArr) {
        for (String str : strArr) {
            if (this.f29040c.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void f(float f11) {
        this.f29041d = f11;
    }

    public void g(com.badlogic.gdx.utils.a<m0> aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("timelines cannot be null.");
        }
        this.f29039b = aVar;
        int i11 = aVar.f13179b;
        this.f29040c.j(i11);
        m0[] m0VarArr = aVar.f13178a;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f29040c.f(m0VarArr[i12].h());
        }
    }

    public String toString() {
        return this.f29038a;
    }
}
