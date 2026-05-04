package com.esotericsoftware.spine;

import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e implements j {
    public float A;
    public float B;

    /* renamed from: a, reason: collision with root package name */
    public final jl.f f29387a;

    /* renamed from: b, reason: collision with root package name */
    public b f29388b;

    /* renamed from: c, reason: collision with root package name */
    public float f29389c;

    /* renamed from: d, reason: collision with root package name */
    public float f29390d;

    /* renamed from: e, reason: collision with root package name */
    public float f29391e;

    /* renamed from: f, reason: collision with root package name */
    public float f29392f;

    /* renamed from: g, reason: collision with root package name */
    public float f29393g;

    /* renamed from: h, reason: collision with root package name */
    public float f29394h;

    /* renamed from: i, reason: collision with root package name */
    public float f29395i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29396j;

    /* renamed from: k, reason: collision with root package name */
    public float f29397k;

    /* renamed from: l, reason: collision with root package name */
    public float f29398l;

    /* renamed from: m, reason: collision with root package name */
    public float f29399m;

    /* renamed from: n, reason: collision with root package name */
    public float f29400n;

    /* renamed from: o, reason: collision with root package name */
    public float f29401o;

    /* renamed from: p, reason: collision with root package name */
    public float f29402p;

    /* renamed from: q, reason: collision with root package name */
    public float f29403q;

    /* renamed from: r, reason: collision with root package name */
    public float f29404r;

    /* renamed from: s, reason: collision with root package name */
    public float f29405s;

    /* renamed from: t, reason: collision with root package name */
    public float f29406t;

    /* renamed from: u, reason: collision with root package name */
    public float f29407u;

    /* renamed from: v, reason: collision with root package name */
    public float f29408v;

    /* renamed from: w, reason: collision with root package name */
    public float f29409w;

    /* renamed from: x, reason: collision with root package name */
    public float f29410x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29411y;

    /* renamed from: z, reason: collision with root package name */
    public final Skeleton f29412z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29413a;

        static {
            int[] iArr = new int[Skeleton.Physics.values().length];
            f29413a = iArr;
            try {
                iArr[Skeleton.Physics.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29413a[Skeleton.Physics.reset.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29413a[Skeleton.Physics.update.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29413a[Skeleton.Physics.pose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public e(jl.f fVar, Skeleton skeleton) {
        this.f29396j = true;
        if (fVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f29387a = fVar;
        this.f29412z = skeleton;
        this.f29388b = skeleton.f29193b.get(fVar.f64328d.f29164a);
        this.f29389c = fVar.f64336l;
        this.f29390d = fVar.f64337m;
        this.f29391e = fVar.f64338n;
        this.f29392f = fVar.f64339o;
        this.f29393g = fVar.f64340p;
        this.f29394h = fVar.f64341q;
        this.f29395i = fVar.f64342r;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x034e  */
    @Override // com.esotericsoftware.spine.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.esotericsoftware.spine.Skeleton.Physics r26) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.e.a(com.esotericsoftware.spine.Skeleton$Physics):void");
    }

    public b b() {
        return this.f29388b;
    }

    public float c() {
        return this.f29391e;
    }

    public jl.f d() {
        return this.f29387a;
    }

    public float e() {
        return this.f29394h;
    }

    public float f() {
        return this.f29389c;
    }

    public float g() {
        return this.f29392f;
    }

    public float h() {
        return this.f29395i;
    }

    public float i() {
        return this.f29390d;
    }

    @Override // com.esotericsoftware.spine.j
    public boolean isActive() {
        return this.f29411y;
    }

    public float j() {
        return this.f29393g;
    }

    public void k() {
        this.A = 0.0f;
        this.B = this.f29412z.f29207p;
        this.f29396j = true;
        this.f29403q = 0.0f;
        this.f29404r = 0.0f;
        this.f29405s = 0.0f;
        this.f29406t = 0.0f;
        this.f29407u = 0.0f;
        this.f29408v = 0.0f;
        this.f29409w = 0.0f;
        this.f29410x = 0.0f;
    }

    public void l(float f11, float f12, float f13) {
        float f14 = f13 * 0.017453292f;
        float d11 = pl.g.d(f14);
        float f15 = pl.g.f(f14);
        float f16 = this.f29399m - f11;
        float f17 = this.f29400n - f12;
        v(((f16 * d11) - (f17 * f15)) - f16, ((f16 * f15) + (d11 * f17)) - f17);
    }

    public void m(b bVar) {
        this.f29388b = bVar;
    }

    public void n(float f11) {
        this.f29391e = f11;
    }

    public void o(float f11) {
        this.f29394h = f11;
    }

    public void p(float f11) {
        this.f29389c = f11;
    }

    public void q(float f11) {
        this.f29392f = f11;
    }

    public void r(float f11) {
        this.f29395i = f11;
    }

    public void s(float f11) {
        this.f29390d = f11;
    }

    public void t() {
        jl.f fVar = this.f29387a;
        this.f29389c = fVar.f64336l;
        this.f29390d = fVar.f64337m;
        this.f29391e = fVar.f64338n;
        this.f29392f = fVar.f64339o;
        this.f29393g = fVar.f64340p;
        this.f29394h = fVar.f64341q;
        this.f29395i = fVar.f64342r;
    }

    public String toString() {
        return this.f29387a.f64303a;
    }

    public void u(float f11) {
        this.f29393g = f11;
    }

    public void v(float f11, float f12) {
        this.f29397k -= f11;
        this.f29398l -= f12;
        this.f29399m -= f11;
        this.f29400n -= f12;
    }

    public e(e eVar, Skeleton skeleton) {
        this(eVar.f29387a, skeleton);
        this.f29389c = eVar.f29389c;
        this.f29390d = eVar.f29390d;
        this.f29391e = eVar.f29391e;
        this.f29392f = eVar.f29392f;
        this.f29393g = eVar.f29393g;
        this.f29394h = eVar.f29394h;
        this.f29395i = eVar.f29395i;
    }
}
