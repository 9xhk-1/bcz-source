package y0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends a {
    public static final int C = 32;
    public final z0.a<PointF, PointF> A;

    @Nullable
    public z0.q B;

    /* renamed from: r, reason: collision with root package name */
    public final String f98860r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f98861s;

    /* renamed from: t, reason: collision with root package name */
    public final LongSparseArray<LinearGradient> f98862t;

    /* renamed from: u, reason: collision with root package name */
    public final LongSparseArray<RadialGradient> f98863u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f98864v;

    /* renamed from: w, reason: collision with root package name */
    public final GradientType f98865w;

    /* renamed from: x, reason: collision with root package name */
    public final int f98866x;

    /* renamed from: y, reason: collision with root package name */
    public final z0.a<e1.d, e1.d> f98867y;

    /* renamed from: z, reason: collision with root package name */
    public final z0.a<PointF, PointF> f98868z;

    public i(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(o0Var, aVar, aVar2.b().toPaintCap(), aVar2.g().toPaintJoin(), aVar2.i(), aVar2.k(), aVar2.m(), aVar2.h(), aVar2.c());
        this.f98862t = new LongSparseArray<>();
        this.f98863u = new LongSparseArray<>();
        this.f98864v = new RectF();
        this.f98860r = aVar2.j();
        this.f98865w = aVar2.f();
        this.f98861s = aVar2.n();
        this.f98866x = (int) (o0Var.N().d() / 32.0f);
        z0.a<e1.d, e1.d> k11 = aVar2.e().k();
        this.f98867y = k11;
        k11.a(this);
        aVar.i(k11);
        z0.a<PointF, PointF> k12 = aVar2.l().k();
        this.f98868z = k12;
        k12.a(this);
        aVar.i(k12);
        z0.a<PointF, PointF> k13 = aVar2.d().k();
        this.A = k13;
        k13.a(this);
        aVar.i(k13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y0.a, c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        super.b(t11, jVar);
        if (t11 == t0.L) {
            z0.q qVar = this.B;
            if (qVar != null) {
                this.f98790f.F(qVar);
            }
            if (jVar == null) {
                this.B = null;
                return;
            }
            z0.q qVar2 = new z0.q(jVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f98790f.i(this.B);
        }
    }

    @Override // y0.a, y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f98861s) {
            return;
        }
        a(this.f98864v, matrix, false);
        Shader l11 = this.f98865w == GradientType.LINEAR ? l() : m();
        l11.setLocalMatrix(matrix);
        this.f98793i.setShader(l11);
        super.d(canvas, matrix, i11);
    }

    @Override // y0.c
    public String getName() {
        return this.f98860r;
    }

    public final int[] j(int[] iArr) {
        z0.q qVar = this.B;
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

    public final int k() {
        int round = Math.round(this.f98868z.f() * this.f98866x);
        int round2 = Math.round(this.A.f() * this.f98866x);
        int round3 = Math.round(this.f98867y.f() * this.f98866x);
        int i11 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i11 = i11 * 31 * round2;
        }
        return round3 != 0 ? i11 * 31 * round3 : i11;
    }

    public final LinearGradient l() {
        long k11 = k();
        LinearGradient linearGradient = this.f98862t.get(k11);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h11 = this.f98868z.h();
        PointF h12 = this.A.h();
        e1.d h13 = this.f98867y.h();
        LinearGradient linearGradient2 = new LinearGradient(h11.x, h11.y, h12.x, h12.y, j(h13.a()), h13.b(), Shader.TileMode.CLAMP);
        this.f98862t.put(k11, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient m() {
        long k11 = k();
        RadialGradient radialGradient = this.f98863u.get(k11);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h11 = this.f98868z.h();
        PointF h12 = this.A.h();
        e1.d h13 = this.f98867y.h();
        int[] j11 = j(h13.a());
        float[] b11 = h13.b();
        RadialGradient radialGradient2 = new RadialGradient(h11.x, h11.y, (float) Math.hypot(h12.x - r7, h12.y - r8), j11, b11, Shader.TileMode.CLAMP);
        this.f98863u.put(k11, radialGradient2);
        return radialGradient2;
    }
}
