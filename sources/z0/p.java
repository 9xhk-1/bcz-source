package z0;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.t0;
import java.util.Collections;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f100525a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f100526b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f100527c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f100528d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f100529e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public a<PointF, PointF> f100530f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public a<?, PointF> f100531g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public a<k1.k, k1.k> f100532h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public a<Float, Float> f100533i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public a<Integer, Integer> f100534j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public d f100535k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public d f100536l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public a<?, Float> f100537m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public a<?, Float> f100538n;

    public p(d1.l lVar) {
        this.f100530f = lVar.c() == null ? null : lVar.c().k();
        this.f100531g = lVar.f() == null ? null : lVar.f().k();
        this.f100532h = lVar.h() == null ? null : lVar.h().k();
        this.f100533i = lVar.g() == null ? null : lVar.g().k();
        d dVar = lVar.i() == null ? null : (d) lVar.i().k();
        this.f100535k = dVar;
        if (dVar != null) {
            this.f100526b = new Matrix();
            this.f100527c = new Matrix();
            this.f100528d = new Matrix();
            this.f100529e = new float[9];
        } else {
            this.f100526b = null;
            this.f100527c = null;
            this.f100528d = null;
            this.f100529e = null;
        }
        this.f100536l = lVar.j() == null ? null : (d) lVar.j().k();
        if (lVar.e() != null) {
            this.f100534j = lVar.e().k();
        }
        if (lVar.k() != null) {
            this.f100537m = lVar.k().k();
        } else {
            this.f100537m = null;
        }
        if (lVar.d() != null) {
            this.f100538n = lVar.d().k();
        } else {
            this.f100538n = null;
        }
    }

    public void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.i(this.f100534j);
        aVar.i(this.f100537m);
        aVar.i(this.f100538n);
        aVar.i(this.f100530f);
        aVar.i(this.f100531g);
        aVar.i(this.f100532h);
        aVar.i(this.f100533i);
        aVar.i(this.f100535k);
        aVar.i(this.f100536l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f100534j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f100537m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f100538n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f100530f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f100531g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<k1.k, k1.k> aVar6 = this.f100532h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f100533i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f100535k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f100536l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t11, @Nullable k1.j<T> jVar) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (t11 == t0.f10196f) {
            a<PointF, PointF> aVar = this.f100530f;
            if (aVar == null) {
                this.f100530f = new q(jVar, new PointF());
                return true;
            }
            aVar.n(jVar);
            return true;
        }
        if (t11 == t0.f10197g) {
            a<?, PointF> aVar2 = this.f100531g;
            if (aVar2 == null) {
                this.f100531g = new q(jVar, new PointF());
                return true;
            }
            aVar2.n(jVar);
            return true;
        }
        if (t11 == t0.f10198h) {
            a<?, PointF> aVar3 = this.f100531g;
            if (aVar3 instanceof n) {
                ((n) aVar3).r(jVar);
                return true;
            }
        }
        if (t11 == t0.f10199i) {
            a<?, PointF> aVar4 = this.f100531g;
            if (aVar4 instanceof n) {
                ((n) aVar4).s(jVar);
                return true;
            }
        }
        if (t11 == t0.f10205o) {
            a<k1.k, k1.k> aVar5 = this.f100532h;
            if (aVar5 == null) {
                this.f100532h = new q(jVar, new k1.k());
                return true;
            }
            aVar5.n(jVar);
            return true;
        }
        if (t11 == t0.f10206p) {
            a<Float, Float> aVar6 = this.f100533i;
            if (aVar6 == null) {
                this.f100533i = new q(jVar, valueOf2);
                return true;
            }
            aVar6.n(jVar);
            return true;
        }
        if (t11 == t0.f10193c) {
            a<Integer, Integer> aVar7 = this.f100534j;
            if (aVar7 == null) {
                this.f100534j = new q(jVar, 100);
                return true;
            }
            aVar7.n(jVar);
            return true;
        }
        if (t11 == t0.C) {
            a<?, Float> aVar8 = this.f100537m;
            if (aVar8 == null) {
                this.f100537m = new q(jVar, valueOf);
                return true;
            }
            aVar8.n(jVar);
            return true;
        }
        if (t11 == t0.D) {
            a<?, Float> aVar9 = this.f100538n;
            if (aVar9 == null) {
                this.f100538n = new q(jVar, valueOf);
                return true;
            }
            aVar9.n(jVar);
            return true;
        }
        if (t11 == t0.f10207q) {
            if (this.f100535k == null) {
                this.f100535k = new d(Collections.singletonList(new k1.a(valueOf2)));
            }
            this.f100535k.n(jVar);
            return true;
        }
        if (t11 != t0.f10208r) {
            return false;
        }
        if (this.f100536l == null) {
            this.f100536l = new d(Collections.singletonList(new k1.a(valueOf2)));
        }
        this.f100536l.n(jVar);
        return true;
    }

    public final void d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f100529e[i11] = 0.0f;
        }
    }

    @Nullable
    public a<?, Float> e() {
        return this.f100538n;
    }

    public Matrix f() {
        PointF h11;
        this.f100525a.reset();
        a<?, PointF> aVar = this.f100531g;
        if (aVar != null && (h11 = aVar.h()) != null) {
            float f11 = h11.x;
            if (f11 != 0.0f || h11.y != 0.0f) {
                this.f100525a.preTranslate(f11, h11.y);
            }
        }
        a<Float, Float> aVar2 = this.f100533i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).p();
            if (floatValue != 0.0f) {
                this.f100525a.preRotate(floatValue);
            }
        }
        if (this.f100535k != null) {
            float cos = this.f100536l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.p()) + 90.0f));
            float sin = this.f100536l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.p()));
            d();
            float[] fArr = this.f100529e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f12 = -sin;
            fArr[3] = f12;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f100526b.setValues(fArr);
            d();
            float[] fArr2 = this.f100529e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f100527c.setValues(fArr2);
            d();
            float[] fArr3 = this.f100529e;
            fArr3[0] = cos;
            fArr3[1] = f12;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f100528d.setValues(fArr3);
            this.f100527c.preConcat(this.f100526b);
            this.f100528d.preConcat(this.f100527c);
            this.f100525a.preConcat(this.f100528d);
        }
        a<k1.k, k1.k> aVar3 = this.f100532h;
        if (aVar3 != null) {
            k1.k h12 = aVar3.h();
            if (h12.b() != 1.0f || h12.c() != 1.0f) {
                this.f100525a.preScale(h12.b(), h12.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f100530f;
        if (aVar4 != null) {
            PointF h13 = aVar4.h();
            float f13 = h13.x;
            if (f13 != 0.0f || h13.y != 0.0f) {
                this.f100525a.preTranslate(-f13, -h13.y);
            }
        }
        return this.f100525a;
    }

    public Matrix g(float f11) {
        a<?, PointF> aVar = this.f100531g;
        PointF h11 = aVar == null ? null : aVar.h();
        a<k1.k, k1.k> aVar2 = this.f100532h;
        k1.k h12 = aVar2 == null ? null : aVar2.h();
        this.f100525a.reset();
        if (h11 != null) {
            this.f100525a.preTranslate(h11.x * f11, h11.y * f11);
        }
        if (h12 != null) {
            double d11 = f11;
            this.f100525a.preScale((float) Math.pow(h12.b(), d11), (float) Math.pow(h12.c(), d11));
        }
        a<Float, Float> aVar3 = this.f100533i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f100530f;
            PointF h13 = aVar4 != null ? aVar4.h() : null;
            this.f100525a.preRotate(floatValue * f11, h13 == null ? 0.0f : h13.x, h13 != null ? h13.y : 0.0f);
        }
        return this.f100525a;
    }

    @Nullable
    public a<?, Integer> h() {
        return this.f100534j;
    }

    @Nullable
    public a<?, Float> i() {
        return this.f100537m;
    }

    public void j(float f11) {
        a<Integer, Integer> aVar = this.f100534j;
        if (aVar != null) {
            aVar.m(f11);
        }
        a<?, Float> aVar2 = this.f100537m;
        if (aVar2 != null) {
            aVar2.m(f11);
        }
        a<?, Float> aVar3 = this.f100538n;
        if (aVar3 != null) {
            aVar3.m(f11);
        }
        a<PointF, PointF> aVar4 = this.f100530f;
        if (aVar4 != null) {
            aVar4.m(f11);
        }
        a<?, PointF> aVar5 = this.f100531g;
        if (aVar5 != null) {
            aVar5.m(f11);
        }
        a<k1.k, k1.k> aVar6 = this.f100532h;
        if (aVar6 != null) {
            aVar6.m(f11);
        }
        a<Float, Float> aVar7 = this.f100533i;
        if (aVar7 != null) {
            aVar7.m(f11);
        }
        d dVar = this.f100535k;
        if (dVar != null) {
            dVar.m(f11);
        }
        d dVar2 = this.f100536l;
        if (dVar2 != null) {
            dVar2.m(f11);
        }
    }
}
