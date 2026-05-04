package y0;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements e, a.b, k {

    /* renamed from: v, reason: collision with root package name */
    public static final int f98838v = 32;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f98839a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98840b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f98841c;

    /* renamed from: d, reason: collision with root package name */
    public final LongSparseArray<LinearGradient> f98842d = new LongSparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final LongSparseArray<RadialGradient> f98843e = new LongSparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    public final Path f98844f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f98845g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f98846h;

    /* renamed from: i, reason: collision with root package name */
    public final List<n> f98847i;

    /* renamed from: j, reason: collision with root package name */
    public final GradientType f98848j;

    /* renamed from: k, reason: collision with root package name */
    public final z0.a<e1.d, e1.d> f98849k;

    /* renamed from: l, reason: collision with root package name */
    public final z0.a<Integer, Integer> f98850l;

    /* renamed from: m, reason: collision with root package name */
    public final z0.a<PointF, PointF> f98851m;

    /* renamed from: n, reason: collision with root package name */
    public final z0.a<PointF, PointF> f98852n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public z0.a<ColorFilter, ColorFilter> f98853o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public z0.q f98854p;

    /* renamed from: q, reason: collision with root package name */
    public final o0 f98855q;

    /* renamed from: r, reason: collision with root package name */
    public final int f98856r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public z0.a<Float, Float> f98857s;

    /* renamed from: t, reason: collision with root package name */
    public float f98858t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public z0.c f98859u;

    public h(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.e eVar) {
        Path path = new Path();
        this.f98844f = path;
        this.f98845g = new x0.a(1);
        this.f98846h = new RectF();
        this.f98847i = new ArrayList();
        this.f98858t = 0.0f;
        this.f98841c = aVar;
        this.f98839a = eVar.f();
        this.f98840b = eVar.i();
        this.f98855q = o0Var;
        this.f98848j = eVar.e();
        path.setFillType(eVar.c());
        this.f98856r = (int) (o0Var.N().d() / 32.0f);
        z0.a<e1.d, e1.d> k11 = eVar.d().k();
        this.f98849k = k11;
        k11.a(this);
        aVar.i(k11);
        z0.a<Integer, Integer> k12 = eVar.g().k();
        this.f98850l = k12;
        k12.a(this);
        aVar.i(k12);
        z0.a<PointF, PointF> k13 = eVar.h().k();
        this.f98851m = k13;
        k13.a(this);
        aVar.i(k13);
        z0.a<PointF, PointF> k14 = eVar.b().k();
        this.f98852n = k14;
        k14.a(this);
        aVar.i(k14);
        if (aVar.v() != null) {
            z0.a<Float, Float> k15 = aVar.v().a().k();
            this.f98857s = k15;
            k15.a(this);
            aVar.i(this.f98857s);
        }
        if (aVar.x() != null) {
            this.f98859u = new z0.c(this, aVar, aVar.x());
        }
    }

    private int[] c(int[] iArr) {
        z0.q qVar = this.f98854p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.f98851m.f() * this.f98856r);
        int round2 = Math.round(this.f98852n.f() * this.f98856r);
        int round3 = Math.round(this.f98849k.f() * this.f98856r);
        int i11 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i11 = i11 * 31 * round2;
        }
        return round3 != 0 ? i11 * 31 * round3 : i11;
    }

    private LinearGradient j() {
        long i11 = i();
        LinearGradient linearGradient = this.f98842d.get(i11);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h11 = this.f98851m.h();
        PointF h12 = this.f98852n.h();
        e1.d h13 = this.f98849k.h();
        LinearGradient linearGradient2 = new LinearGradient(h11.x, h11.y, h12.x, h12.y, c(h13.a()), h13.b(), Shader.TileMode.CLAMP);
        this.f98842d.put(i11, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long i11 = i();
        RadialGradient radialGradient = this.f98843e.get(i11);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h11 = this.f98851m.h();
        PointF h12 = this.f98852n.h();
        e1.d h13 = this.f98849k.h();
        int[] c11 = c(h13.a());
        float[] b11 = h13.b();
        float f11 = h11.x;
        float f12 = h11.y;
        float hypot = (float) Math.hypot(h12.x - f11, h12.y - f12);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f11, f12, hypot, c11, b11, Shader.TileMode.CLAMP);
        this.f98843e.put(i11, radialGradient2);
        return radialGradient2;
    }

    @Override // y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f98844f.reset();
        for (int i11 = 0; i11 < this.f98847i.size(); i11++) {
            this.f98844f.addPath(this.f98847i.get(i11).getPath(), matrix);
        }
        this.f98844f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        z0.c cVar;
        z0.c cVar2;
        z0.c cVar3;
        z0.c cVar4;
        z0.c cVar5;
        if (t11 == t0.f10194d) {
            this.f98850l.n(jVar);
            return;
        }
        if (t11 == t0.K) {
            z0.a<ColorFilter, ColorFilter> aVar = this.f98853o;
            if (aVar != null) {
                this.f98841c.F(aVar);
            }
            if (jVar == null) {
                this.f98853o = null;
                return;
            }
            z0.q qVar = new z0.q(jVar);
            this.f98853o = qVar;
            qVar.a(this);
            this.f98841c.i(this.f98853o);
            return;
        }
        if (t11 == t0.L) {
            z0.q qVar2 = this.f98854p;
            if (qVar2 != null) {
                this.f98841c.F(qVar2);
            }
            if (jVar == null) {
                this.f98854p = null;
                return;
            }
            this.f98842d.clear();
            this.f98843e.clear();
            z0.q qVar3 = new z0.q(jVar);
            this.f98854p = qVar3;
            qVar3.a(this);
            this.f98841c.i(this.f98854p);
            return;
        }
        if (t11 == t0.f10200j) {
            z0.a<Float, Float> aVar2 = this.f98857s;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            z0.q qVar4 = new z0.q(jVar);
            this.f98857s = qVar4;
            qVar4.a(this);
            this.f98841c.i(this.f98857s);
            return;
        }
        if (t11 == t0.f10195e && (cVar5 = this.f98859u) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t11 == t0.G && (cVar4 = this.f98859u) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t11 == t0.H && (cVar3 = this.f98859u) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t11 == t0.I && (cVar2 = this.f98859u) != null) {
            cVar2.d(jVar);
        } else {
            if (t11 != t0.J || (cVar = this.f98859u) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f98840b) {
            return;
        }
        com.airbnb.lottie.e.a("GradientFillContent#draw");
        this.f98844f.reset();
        for (int i12 = 0; i12 < this.f98847i.size(); i12++) {
            this.f98844f.addPath(this.f98847i.get(i12).getPath(), matrix);
        }
        this.f98844f.computeBounds(this.f98846h, false);
        Shader j11 = this.f98848j == GradientType.LINEAR ? j() : k();
        j11.setLocalMatrix(matrix);
        this.f98845g.setShader(j11);
        z0.a<ColorFilter, ColorFilter> aVar = this.f98853o;
        if (aVar != null) {
            this.f98845g.setColorFilter(aVar.h());
        }
        z0.a<Float, Float> aVar2 = this.f98857s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f98845g.setMaskFilter(null);
            } else if (floatValue != this.f98858t) {
                this.f98845g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f98858t = floatValue;
        }
        z0.c cVar = this.f98859u;
        if (cVar != null) {
            cVar.a(this.f98845g);
        }
        this.f98845g.setAlpha(j1.i.d((int) ((((i11 / 255.0f) * this.f98850l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f98844f, this.f98845g);
        com.airbnb.lottie.e.b("GradientFillContent#draw");
    }

    @Override // z0.a.b
    public void e() {
        this.f98855q.invalidateSelf();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof n) {
                this.f98847i.add((n) cVar);
            }
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98839a;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }
}
