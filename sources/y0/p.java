package y0;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p implements a.b, k, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f98896c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f98897d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f98898e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.a<?, PointF> f98899f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.a<?, PointF> f98900g;

    /* renamed from: h, reason: collision with root package name */
    public final z0.a<?, Float> f98901h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f98904k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f98894a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f98895b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final b f98902i = new b();

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public z0.a<Float, Float> f98903j = null;

    public p(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.f fVar) {
        this.f98896c = fVar.c();
        this.f98897d = fVar.f();
        this.f98898e = o0Var;
        z0.a<PointF, PointF> k11 = fVar.d().k();
        this.f98899f = k11;
        z0.a<PointF, PointF> k12 = fVar.e().k();
        this.f98900g = k12;
        z0.a<Float, Float> k13 = fVar.b().k();
        this.f98901h = k13;
        aVar.i(k11);
        aVar.i(k12);
        aVar.i(k13);
        k11.a(this);
        k12.a(this);
        k13.a(this);
    }

    private void c() {
        this.f98904k = false;
        this.f98898e.invalidateSelf();
    }

    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        if (t11 == t0.f10202l) {
            this.f98900g.n(jVar);
        } else if (t11 == t0.f10204n) {
            this.f98899f.n(jVar);
        } else if (t11 == t0.f10203m) {
            this.f98901h.n(jVar);
        }
    }

    @Override // z0.a.b
    public void e() {
        c();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f98902i.a(vVar);
                    vVar.b(this);
                }
            }
            if (cVar instanceof r) {
                this.f98903j = ((r) cVar).h();
            }
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98896c;
    }

    @Override // y0.n
    public Path getPath() {
        z0.a<Float, Float> aVar;
        if (this.f98904k) {
            return this.f98894a;
        }
        this.f98894a.reset();
        if (this.f98897d) {
            this.f98904k = true;
            return this.f98894a;
        }
        PointF h11 = this.f98900g.h();
        float f11 = h11.x / 2.0f;
        float f12 = h11.y / 2.0f;
        z0.a<?, Float> aVar2 = this.f98901h;
        float p11 = aVar2 == null ? 0.0f : ((z0.d) aVar2).p();
        if (p11 == 0.0f && (aVar = this.f98903j) != null) {
            p11 = Math.min(aVar.h().floatValue(), Math.min(f11, f12));
        }
        float min = Math.min(f11, f12);
        if (p11 > min) {
            p11 = min;
        }
        PointF h12 = this.f98899f.h();
        this.f98894a.moveTo(h12.x + f11, (h12.y - f12) + p11);
        this.f98894a.lineTo(h12.x + f11, (h12.y + f12) - p11);
        if (p11 > 0.0f) {
            RectF rectF = this.f98895b;
            float f13 = h12.x;
            float f14 = p11 * 2.0f;
            float f15 = h12.y;
            rectF.set((f13 + f11) - f14, (f15 + f12) - f14, f13 + f11, f15 + f12);
            this.f98894a.arcTo(this.f98895b, 0.0f, 90.0f, false);
        }
        this.f98894a.lineTo((h12.x - f11) + p11, h12.y + f12);
        if (p11 > 0.0f) {
            RectF rectF2 = this.f98895b;
            float f16 = h12.x;
            float f17 = h12.y;
            float f18 = p11 * 2.0f;
            rectF2.set(f16 - f11, (f17 + f12) - f18, (f16 - f11) + f18, f17 + f12);
            this.f98894a.arcTo(this.f98895b, 90.0f, 90.0f, false);
        }
        this.f98894a.lineTo(h12.x - f11, (h12.y - f12) + p11);
        if (p11 > 0.0f) {
            RectF rectF3 = this.f98895b;
            float f19 = h12.x;
            float f21 = h12.y;
            float f22 = p11 * 2.0f;
            rectF3.set(f19 - f11, f21 - f12, (f19 - f11) + f22, (f21 - f12) + f22);
            this.f98894a.arcTo(this.f98895b, 180.0f, 90.0f, false);
        }
        this.f98894a.lineTo((h12.x + f11) - p11, h12.y - f12);
        if (p11 > 0.0f) {
            RectF rectF4 = this.f98895b;
            float f23 = h12.x;
            float f24 = p11 * 2.0f;
            float f25 = h12.y;
            rectF4.set((f23 + f11) - f24, f25 - f12, f23 + f11, (f25 - f12) + f24);
            this.f98894a.arcTo(this.f98895b, 270.0f, 90.0f, false);
        }
        this.f98894a.close();
        this.f98902i.b(this.f98894a);
        this.f98904k = true;
        return this.f98894a;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }
}
