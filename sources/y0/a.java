package y0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    public final o0 f98789e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f98790f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f98792h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f98793i;

    /* renamed from: j, reason: collision with root package name */
    public final z0.a<?, Float> f98794j;

    /* renamed from: k, reason: collision with root package name */
    public final z0.a<?, Integer> f98795k;

    /* renamed from: l, reason: collision with root package name */
    public final List<z0.a<?, Float>> f98796l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final z0.a<?, Float> f98797m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public z0.a<ColorFilter, ColorFilter> f98798n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public z0.a<Float, Float> f98799o;

    /* renamed from: p, reason: collision with root package name */
    public float f98800p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public z0.c f98801q;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f98785a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f98786b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f98787c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f98788d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final List<b> f98791g = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<n> f98802a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final v f98803b;

        public b(@Nullable v vVar) {
            this.f98802a = new ArrayList();
            this.f98803b = vVar;
        }
    }

    public a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f11, d1.d dVar, d1.b bVar, List<d1.b> list, d1.b bVar2) {
        x0.a aVar2 = new x0.a(1);
        this.f98793i = aVar2;
        this.f98800p = 0.0f;
        this.f98789e = o0Var;
        this.f98790f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f11);
        this.f98795k = dVar.k();
        this.f98794j = bVar.k();
        if (bVar2 == null) {
            this.f98797m = null;
        } else {
            this.f98797m = bVar2.k();
        }
        this.f98796l = new ArrayList(list.size());
        this.f98792h = new float[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f98796l.add(list.get(i11).k());
        }
        aVar.i(this.f98795k);
        aVar.i(this.f98794j);
        for (int i12 = 0; i12 < this.f98796l.size(); i12++) {
            aVar.i(this.f98796l.get(i12));
        }
        z0.a<?, Float> aVar3 = this.f98797m;
        if (aVar3 != null) {
            aVar.i(aVar3);
        }
        this.f98795k.a(this);
        this.f98794j.a(this);
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f98796l.get(i13).a(this);
        }
        z0.a<?, Float> aVar4 = this.f98797m;
        if (aVar4 != null) {
            aVar4.a(this);
        }
        if (aVar.v() != null) {
            z0.a<Float, Float> k11 = aVar.v().a().k();
            this.f98799o = k11;
            k11.a(this);
            aVar.i(this.f98799o);
        }
        if (aVar.x() != null) {
            this.f98801q = new z0.c(this, aVar, aVar.x());
        }
    }

    @Override // y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        com.airbnb.lottie.e.a("StrokeContent#getBounds");
        this.f98786b.reset();
        for (int i11 = 0; i11 < this.f98791g.size(); i11++) {
            b bVar = this.f98791g.get(i11);
            for (int i12 = 0; i12 < bVar.f98802a.size(); i12++) {
                this.f98786b.addPath(((n) bVar.f98802a.get(i12)).getPath(), matrix);
            }
        }
        this.f98786b.computeBounds(this.f98788d, false);
        float p11 = ((z0.d) this.f98794j).p();
        RectF rectF2 = this.f98788d;
        float f11 = p11 / 2.0f;
        rectF2.set(rectF2.left - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
        rectF.set(this.f98788d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.e.b("StrokeContent#getBounds");
    }

    @Override // c1.e
    @CallSuper
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        z0.c cVar;
        z0.c cVar2;
        z0.c cVar3;
        z0.c cVar4;
        z0.c cVar5;
        if (t11 == t0.f10194d) {
            this.f98795k.n(jVar);
            return;
        }
        if (t11 == t0.f10209s) {
            this.f98794j.n(jVar);
            return;
        }
        if (t11 == t0.K) {
            z0.a<ColorFilter, ColorFilter> aVar = this.f98798n;
            if (aVar != null) {
                this.f98790f.F(aVar);
            }
            if (jVar == null) {
                this.f98798n = null;
                return;
            }
            z0.q qVar = new z0.q(jVar);
            this.f98798n = qVar;
            qVar.a(this);
            this.f98790f.i(this.f98798n);
            return;
        }
        if (t11 == t0.f10200j) {
            z0.a<Float, Float> aVar2 = this.f98799o;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            z0.q qVar2 = new z0.q(jVar);
            this.f98799o = qVar2;
            qVar2.a(this);
            this.f98790f.i(this.f98799o);
            return;
        }
        if (t11 == t0.f10195e && (cVar5 = this.f98801q) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t11 == t0.G && (cVar4 = this.f98801q) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t11 == t0.H && (cVar3 = this.f98801q) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t11 == t0.I && (cVar2 = this.f98801q) != null) {
            cVar2.d(jVar);
        } else {
            if (t11 != t0.J || (cVar = this.f98801q) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    public final void c(Matrix matrix) {
        com.airbnb.lottie.e.a("StrokeContent#applyDashPattern");
        if (this.f98796l.isEmpty()) {
            com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
            return;
        }
        float g11 = j1.j.g(matrix);
        for (int i11 = 0; i11 < this.f98796l.size(); i11++) {
            this.f98792h[i11] = this.f98796l.get(i11).h().floatValue();
            if (i11 % 2 == 0) {
                float[] fArr = this.f98792h;
                if (fArr[i11] < 1.0f) {
                    fArr[i11] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f98792h;
                if (fArr2[i11] < 0.1f) {
                    fArr2[i11] = 0.1f;
                }
            }
            float[] fArr3 = this.f98792h;
            fArr3[i11] = fArr3[i11] * g11;
        }
        z0.a<?, Float> aVar = this.f98797m;
        this.f98793i.setPathEffect(new DashPathEffect(this.f98792h, aVar == null ? 0.0f : g11 * aVar.h().floatValue()));
        com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
    }

    @Override // y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        com.airbnb.lottie.e.a("StrokeContent#draw");
        if (j1.j.h(matrix)) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        this.f98793i.setAlpha(j1.i.d((int) ((((i11 / 255.0f) * ((z0.f) this.f98795k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f98793i.setStrokeWidth(((z0.d) this.f98794j).p() * j1.j.g(matrix));
        if (this.f98793i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        c(matrix);
        z0.a<ColorFilter, ColorFilter> aVar = this.f98798n;
        if (aVar != null) {
            this.f98793i.setColorFilter(aVar.h());
        }
        z0.a<Float, Float> aVar2 = this.f98799o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f98793i.setMaskFilter(null);
            } else if (floatValue != this.f98800p) {
                this.f98793i.setMaskFilter(this.f98790f.w(floatValue));
            }
            this.f98800p = floatValue;
        }
        z0.c cVar = this.f98801q;
        if (cVar != null) {
            cVar.a(this.f98793i);
        }
        for (int i12 = 0; i12 < this.f98791g.size(); i12++) {
            b bVar = this.f98791g.get(i12);
            if (bVar.f98803b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.e.a("StrokeContent#buildPath");
                this.f98786b.reset();
                for (int size = bVar.f98802a.size() - 1; size >= 0; size--) {
                    this.f98786b.addPath(((n) bVar.f98802a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.e.b("StrokeContent#buildPath");
                com.airbnb.lottie.e.a("StrokeContent#drawPath");
                canvas.drawPath(this.f98786b, this.f98793i);
                com.airbnb.lottie.e.b("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.e.b("StrokeContent#draw");
    }

    @Override // z0.a.b
    public void e() {
        this.f98789e.invalidateSelf();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        v vVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                if (vVar2.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    vVar = vVar2;
                }
            }
        }
        if (vVar != null) {
            vVar.b(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof v) {
                v vVar3 = (v) cVar2;
                if (vVar3.j() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f98791g.add(bVar);
                    }
                    bVar = new b(vVar3);
                    vVar3.b(this);
                }
            }
            if (cVar2 instanceof n) {
                if (bVar == null) {
                    bVar = new b(vVar);
                }
                bVar.f98802a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f98791g.add(bVar);
        }
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }

    public final void i(Canvas canvas, b bVar, Matrix matrix) {
        com.airbnb.lottie.e.a("StrokeContent#applyTrimPath");
        if (bVar.f98803b == null) {
            com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f98786b.reset();
        for (int size = bVar.f98802a.size() - 1; size >= 0; size--) {
            this.f98786b.addPath(((n) bVar.f98802a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.f98803b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f98803b.c().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f98803b.h().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f98786b, this.f98793i);
            com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f98785a.setPath(this.f98786b, false);
        float length = this.f98785a.getLength();
        while (this.f98785a.nextContour()) {
            length += this.f98785a.getLength();
        }
        float f11 = floatValue3 * length;
        float f12 = (floatValue * length) + f11;
        float min = Math.min((floatValue2 * length) + f11, (f12 + length) - 1.0f);
        float f13 = 0.0f;
        for (int size2 = bVar.f98802a.size() - 1; size2 >= 0; size2--) {
            this.f98787c.set(((n) bVar.f98802a.get(size2)).getPath());
            this.f98787c.transform(matrix);
            this.f98785a.setPath(this.f98787c, false);
            float length2 = this.f98785a.getLength();
            if (min > length) {
                float f14 = min - length;
                if (f14 < f13 + length2 && f13 < f14) {
                    j1.j.a(this.f98787c, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f98787c, this.f98793i);
                    f13 += length2;
                }
            }
            float f15 = f13 + length2;
            if (f15 >= f12 && f13 <= min) {
                if (f15 > min || f12 >= f13) {
                    j1.j.a(this.f98787c, f12 < f13 ? 0.0f : (f12 - f13) / length2, min > f15 ? 1.0f : (min - f13) / length2, 0.0f);
                    canvas.drawPath(this.f98787c, this.f98793i);
                } else {
                    canvas.drawPath(this.f98787c, this.f98793i);
                }
            }
            f13 += length2;
        }
        com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
    }
}
