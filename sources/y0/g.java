package y0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f98825a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f98826b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f98827c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98828d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98829e;

    /* renamed from: f, reason: collision with root package name */
    public final List<n> f98830f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.a<Integer, Integer> f98831g;

    /* renamed from: h, reason: collision with root package name */
    public final z0.a<Integer, Integer> f98832h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public z0.a<ColorFilter, ColorFilter> f98833i;

    /* renamed from: j, reason: collision with root package name */
    public final o0 f98834j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public z0.a<Float, Float> f98835k;

    /* renamed from: l, reason: collision with root package name */
    public float f98836l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public z0.c f98837m;

    public g(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.j jVar) {
        Path path = new Path();
        this.f98825a = path;
        this.f98826b = new x0.a(1);
        this.f98830f = new ArrayList();
        this.f98827c = aVar;
        this.f98828d = jVar.d();
        this.f98829e = jVar.f();
        this.f98834j = o0Var;
        if (aVar.v() != null) {
            z0.a<Float, Float> k11 = aVar.v().a().k();
            this.f98835k = k11;
            k11.a(this);
            aVar.i(this.f98835k);
        }
        if (aVar.x() != null) {
            this.f98837m = new z0.c(this, aVar, aVar.x());
        }
        if (jVar.b() == null || jVar.e() == null) {
            this.f98831g = null;
            this.f98832h = null;
            return;
        }
        path.setFillType(jVar.c());
        z0.a<Integer, Integer> k12 = jVar.b().k();
        this.f98831g = k12;
        k12.a(this);
        aVar.i(k12);
        z0.a<Integer, Integer> k13 = jVar.e().k();
        this.f98832h = k13;
        k13.a(this);
        aVar.i(k13);
    }

    @Override // y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f98825a.reset();
        for (int i11 = 0; i11 < this.f98830f.size(); i11++) {
            this.f98825a.addPath(this.f98830f.get(i11).getPath(), matrix);
        }
        this.f98825a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        z0.c cVar;
        z0.c cVar2;
        z0.c cVar3;
        z0.c cVar4;
        z0.c cVar5;
        if (t11 == t0.f10191a) {
            this.f98831g.n(jVar);
            return;
        }
        if (t11 == t0.f10194d) {
            this.f98832h.n(jVar);
            return;
        }
        if (t11 == t0.K) {
            z0.a<ColorFilter, ColorFilter> aVar = this.f98833i;
            if (aVar != null) {
                this.f98827c.F(aVar);
            }
            if (jVar == null) {
                this.f98833i = null;
                return;
            }
            z0.q qVar = new z0.q(jVar);
            this.f98833i = qVar;
            qVar.a(this);
            this.f98827c.i(this.f98833i);
            return;
        }
        if (t11 == t0.f10200j) {
            z0.a<Float, Float> aVar2 = this.f98835k;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            z0.q qVar2 = new z0.q(jVar);
            this.f98835k = qVar2;
            qVar2.a(this);
            this.f98827c.i(this.f98835k);
            return;
        }
        if (t11 == t0.f10195e && (cVar5 = this.f98837m) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t11 == t0.G && (cVar4 = this.f98837m) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t11 == t0.H && (cVar3 = this.f98837m) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t11 == t0.I && (cVar2 = this.f98837m) != null) {
            cVar2.d(jVar);
        } else {
            if (t11 != t0.J || (cVar = this.f98837m) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f98829e) {
            return;
        }
        com.airbnb.lottie.e.a("FillContent#draw");
        this.f98826b.setColor((j1.i.d((int) ((((i11 / 255.0f) * this.f98832h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((z0.b) this.f98831g).p() & 16777215));
        z0.a<ColorFilter, ColorFilter> aVar = this.f98833i;
        if (aVar != null) {
            this.f98826b.setColorFilter(aVar.h());
        }
        z0.a<Float, Float> aVar2 = this.f98835k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f98826b.setMaskFilter(null);
            } else if (floatValue != this.f98836l) {
                this.f98826b.setMaskFilter(this.f98827c.w(floatValue));
            }
            this.f98836l = floatValue;
        }
        z0.c cVar = this.f98837m;
        if (cVar != null) {
            cVar.a(this.f98826b);
        }
        this.f98825a.reset();
        for (int i12 = 0; i12 < this.f98830f.size(); i12++) {
            this.f98825a.addPath(this.f98830f.get(i12).getPath(), matrix);
        }
        canvas.drawPath(this.f98825a, this.f98826b);
        com.airbnb.lottie.e.b("FillContent#draw");
    }

    @Override // z0.a.b
    public void e() {
        this.f98834j.invalidateSelf();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof n) {
                this.f98830f.add((n) cVar);
            }
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98828d;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }
}
