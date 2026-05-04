package pm;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a extends o {

    /* renamed from: b, reason: collision with root package name */
    public em.a f80854b;

    /* renamed from: c, reason: collision with root package name */
    public rm.i f80855c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f80856d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f80857e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f80858f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f80859g;

    public a(rm.l lVar, rm.i iVar, em.a aVar) {
        super(lVar);
        this.f80855c = iVar;
        this.f80854b = aVar;
        if (this.f80939a != null) {
            this.f80857e = new Paint(1);
            Paint paint = new Paint();
            this.f80856d = paint;
            paint.setColor(-7829368);
            this.f80856d.setStrokeWidth(1.0f);
            Paint paint2 = this.f80856d;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.f80856d.setAlpha(90);
            Paint paint3 = new Paint();
            this.f80858f = paint3;
            paint3.setColor(-16777216);
            this.f80858f.setStrokeWidth(1.0f);
            this.f80858f.setStyle(style);
            Paint paint4 = new Paint(1);
            this.f80859g = paint4;
            paint4.setStyle(style);
        }
    }

    public void a(float f11, float f12, boolean z11) {
        float f13;
        double d11;
        rm.l lVar = this.f80939a;
        if (lVar != null && lVar.k() > 10.0f && !this.f80939a.F()) {
            rm.f j11 = this.f80855c.j(this.f80939a.h(), this.f80939a.j());
            rm.f j12 = this.f80855c.j(this.f80939a.h(), this.f80939a.f());
            if (z11) {
                f13 = (float) j11.f84262d;
                d11 = j12.f84262d;
            } else {
                f13 = (float) j12.f84262d;
                d11 = j11.f84262d;
            }
            float f14 = (float) d11;
            rm.f.c(j11);
            rm.f.c(j12);
            f11 = f13;
            f12 = f14;
        }
        b(f11, f12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void b(float f11, float f12) {
        float f13 = f11;
        int C = this.f80854b.C();
        double abs = Math.abs(f12 - f13);
        if (C == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            em.a aVar = this.f80854b;
            aVar.f49885l = new float[0];
            aVar.f49886m = new float[0];
            aVar.f49887n = 0;
            return;
        }
        double L = rm.k.L(abs / C);
        if (this.f80854b.S() && L < this.f80854b.y()) {
            L = this.f80854b.y();
        }
        double L2 = rm.k.L(Math.pow(10.0d, (int) Math.log10(L)));
        if (((int) (L / L2)) > 5) {
            L = Math.floor(L2 * 10.0d);
        }
        ?? L3 = this.f80854b.L();
        if (this.f80854b.R()) {
            L = ((float) abs) / (C - 1);
            em.a aVar2 = this.f80854b;
            aVar2.f49887n = C;
            if (aVar2.f49885l.length < C) {
                aVar2.f49885l = new float[C];
            }
            for (int i11 = 0; i11 < C; i11++) {
                this.f80854b.f49885l[i11] = f13;
                f13 = (float) (f13 + L);
            }
        } else {
            double ceil = L == 0.0d ? 0.0d : Math.ceil(f13 / L) * L;
            if (this.f80854b.L()) {
                ceil -= L;
            }
            double J = L == 0.0d ? 0.0d : rm.k.J(Math.floor(f12 / L) * L);
            if (L != 0.0d) {
                double d11 = ceil;
                L3 = L3;
                while (d11 <= J) {
                    d11 += L;
                    L3++;
                }
            }
            C = L3;
            em.a aVar3 = this.f80854b;
            aVar3.f49887n = C;
            if (aVar3.f49885l.length < C) {
                aVar3.f49885l = new float[C];
            }
            for (int i12 = 0; i12 < C; i12++) {
                if (ceil == 0.0d) {
                    ceil = 0.0d;
                }
                this.f80854b.f49885l[i12] = (float) ceil;
                ceil += L;
            }
        }
        if (L < 1.0d) {
            this.f80854b.f49888o = (int) Math.ceil(-Math.log10(L));
        } else {
            this.f80854b.f49888o = 0;
        }
        if (this.f80854b.L()) {
            em.a aVar4 = this.f80854b;
            if (aVar4.f49886m.length < C) {
                aVar4.f49886m = new float[C];
            }
            float f14 = ((float) L) / 2.0f;
            for (int i13 = 0; i13 < C; i13++) {
                em.a aVar5 = this.f80854b;
                aVar5.f49886m[i13] = aVar5.f49885l[i13] + f14;
            }
        }
    }

    public Paint c() {
        return this.f80857e;
    }

    public Paint d() {
        return this.f80858f;
    }

    public Paint e() {
        return this.f80856d;
    }

    public rm.i f() {
        return this.f80855c;
    }

    public abstract void g(Canvas canvas);

    public abstract void h(Canvas canvas);

    public abstract void i(Canvas canvas);

    public abstract void j(Canvas canvas);
}
