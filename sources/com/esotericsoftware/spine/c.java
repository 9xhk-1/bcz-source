package com.esotericsoftware.spine;

import com.badlogic.gdx.utils.a;
import com.esotericsoftware.spine.BoneData;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final jl.e f29357a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29358b;

    /* renamed from: c, reason: collision with root package name */
    public b f29359c;

    /* renamed from: d, reason: collision with root package name */
    public int f29360d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29361e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29362f;

    /* renamed from: g, reason: collision with root package name */
    public float f29363g;

    /* renamed from: h, reason: collision with root package name */
    public float f29364h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29365i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29366a;

        static {
            int[] iArr = new int[BoneData.Inherit.values().length];
            f29366a = iArr;
            try {
                iArr[BoneData.Inherit.onlyTranslation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29366a[BoneData.Inherit.noRotationOrReflection.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29366a[BoneData.Inherit.noScale.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29366a[BoneData.Inherit.noScaleOrReflection.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(jl.e eVar, Skeleton skeleton) {
        this.f29363g = 1.0f;
        if (eVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f29357a = eVar;
        this.f29358b = new com.badlogic.gdx.utils.a<>(eVar.f64320d.f13179b);
        a.b<BoneData> it = eVar.f64320d.iterator();
        while (it.hasNext()) {
            this.f29358b.a(skeleton.f29193b.get(it.next().f29164a));
        }
        this.f29359c = skeleton.f29193b.get(eVar.f64321e.f29164a);
        this.f29363g = eVar.f64326j;
        this.f29364h = eVar.f64327k;
        this.f29360d = eVar.f64322f;
        this.f29361e = eVar.f64323g;
        this.f29362f = eVar.f64324h;
    }

    public static void b(b bVar, float f11, float f12, boolean z11, boolean z12, boolean z13, float f13) {
        float signum;
        float signum2;
        if (bVar == null) {
            throw new IllegalArgumentException("bone cannot be null.");
        }
        b bVar2 = bVar.f29332c;
        float f14 = bVar2.f29348s;
        float f15 = bVar2.f29349t;
        float f16 = bVar2.f29351v;
        float f17 = bVar2.f29352w;
        float f18 = (-bVar.f29346q) - bVar.f29343n;
        int[] iArr = a.f29366a;
        int i11 = iArr[bVar.f29354y.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                float abs = Math.abs((f17 * f14) - (f15 * f16)) / Math.max(1.0E-4f, (f14 * f14) + (f16 * f16));
                Skeleton skeleton = bVar.f29331b;
                float f19 = skeleton.f29205n;
                float f21 = f14 / f19;
                float f22 = skeleton.f29206o;
                float f23 = f16 / f22;
                f17 = f22 * abs * f21;
                f18 += pl.g.c(f23, f21);
                f15 = f19 * (-f23) * abs;
            }
            float f24 = f11 - bVar2.f29350u;
            float f25 = f12 - bVar2.f29353x;
            float f26 = (f14 * f17) - (f15 * f16);
            if (Math.abs(f26) <= 1.0E-4f) {
                signum2 = 0.0f;
                signum = 0.0f;
            } else {
                signum = (((f17 * f24) - (f15 * f25)) / f26) - bVar.f29341l;
                signum2 = (((f25 * f14) - (f24 * f16)) / f26) - bVar.f29342m;
            }
        } else {
            signum = (f11 - bVar.f29350u) * Math.signum(bVar.f29331b.f29205n);
            signum2 = (f12 - bVar.f29353x) * Math.signum(bVar.f29331b.f29206o);
        }
        float c11 = f18 + pl.g.c(signum2, signum);
        float f27 = bVar.f29344o;
        if (f27 < 0.0f) {
            c11 += 180.0f;
        }
        if (c11 > 180.0f) {
            c11 -= 360.0f;
        } else if (c11 < -180.0f) {
            c11 += 360.0f;
        }
        float f28 = bVar.f29345p;
        if (z11 || z12) {
            int i12 = iArr[bVar.f29354y.ordinal()];
            if (i12 == 3 || i12 == 4) {
                signum = f11 - bVar.f29350u;
                signum2 = f12 - bVar.f29353x;
            }
            float f29 = bVar.f29330a.f29167d * f27;
            if (f29 > 1.0E-4f) {
                float f31 = (signum * signum) + (signum2 * signum2);
                if ((z11 && f31 < f29 * f29) || (z12 && f31 > f29 * f29)) {
                    float sqrt = (((((float) Math.sqrt(f31)) / f29) - 1.0f) * f13) + 1.0f;
                    f27 *= sqrt;
                    if (z13) {
                        f28 *= sqrt;
                    }
                }
            }
        }
        bVar.k0(bVar.f29341l, bVar.f29342m, bVar.f29343n + (c11 * f13), f27, f28, bVar.f29346q, bVar.f29347r);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.esotericsoftware.spine.b r31, com.esotericsoftware.spine.b r32, float r33, float r34, int r35, boolean r36, boolean r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.c.c(com.esotericsoftware.spine.b, com.esotericsoftware.spine.b, float, float, int, boolean, boolean, float, float):void");
    }

    @Override // com.esotericsoftware.spine.j
    public void a(Skeleton.Physics physics) {
        float f11 = this.f29363g;
        if (f11 == 0.0f) {
            return;
        }
        b bVar = this.f29359c;
        com.badlogic.gdx.utils.a<b> aVar = this.f29358b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        if (i11 == 1) {
            b(bVarArr[0], bVar.f29350u, bVar.f29353x, this.f29361e, this.f29362f, this.f29357a.f64325i, f11);
        } else {
            if (i11 != 2) {
                return;
            }
            c(bVarArr[0], bVarArr[1], bVar.f29350u, bVar.f29353x, this.f29360d, this.f29362f, this.f29357a.f64325i, this.f29364h, f11);
        }
    }

    public int d() {
        return this.f29360d;
    }

    public com.badlogic.gdx.utils.a<b> e() {
        return this.f29358b;
    }

    public boolean f() {
        return this.f29361e;
    }

    public jl.e g() {
        return this.f29357a;
    }

    public float h() {
        return this.f29363g;
    }

    public float i() {
        return this.f29364h;
    }

    @Override // com.esotericsoftware.spine.j
    public boolean isActive() {
        return this.f29365i;
    }

    public boolean j() {
        return this.f29362f;
    }

    public b k() {
        return this.f29359c;
    }

    public void l(int i11) {
        this.f29360d = i11;
    }

    public void m(boolean z11) {
        this.f29361e = z11;
    }

    public void n(float f11) {
        this.f29363g = f11;
    }

    public void o(float f11) {
        this.f29364h = f11;
    }

    public void p(boolean z11) {
        this.f29362f = z11;
    }

    public void q(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        this.f29359c = bVar;
    }

    public void r() {
        jl.e eVar = this.f29357a;
        this.f29363g = eVar.f64326j;
        this.f29364h = eVar.f64327k;
        this.f29360d = eVar.f64322f;
        this.f29361e = eVar.f64323g;
        this.f29362f = eVar.f64324h;
    }

    public String toString() {
        return this.f29357a.f64303a;
    }

    public c(c cVar, Skeleton skeleton) {
        this(cVar.f29357a, skeleton);
        this.f29363g = cVar.f29363g;
        this.f29364h = cVar.f29364h;
        this.f29360d = cVar.f29360d;
        this.f29361e = cVar.f29361e;
        this.f29362f = cVar.f29362f;
    }
}
