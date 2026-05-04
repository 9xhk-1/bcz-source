package y0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u extends a {

    /* renamed from: r, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f98928r;

    /* renamed from: s, reason: collision with root package name */
    public final String f98929s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f98930t;

    /* renamed from: u, reason: collision with root package name */
    public final z0.a<Integer, Integer> f98931u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public z0.a<ColorFilter, ColorFilter> f98932v;

    public u(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, ShapeStroke shapeStroke) {
        super(o0Var, aVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.f98928r = aVar;
        this.f98929s = shapeStroke.h();
        this.f98930t = shapeStroke.k();
        z0.a<Integer, Integer> k11 = shapeStroke.c().k();
        this.f98931u = k11;
        k11.a(this);
        aVar.i(k11);
    }

    @Override // y0.a, c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        super.b(t11, jVar);
        if (t11 == t0.f10192b) {
            this.f98931u.n(jVar);
            return;
        }
        if (t11 == t0.K) {
            z0.a<ColorFilter, ColorFilter> aVar = this.f98932v;
            if (aVar != null) {
                this.f98928r.F(aVar);
            }
            if (jVar == null) {
                this.f98932v = null;
                return;
            }
            z0.q qVar = new z0.q(jVar);
            this.f98932v = qVar;
            qVar.a(this);
            this.f98928r.i(this.f98931u);
        }
    }

    @Override // y0.a, y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        if (this.f98930t) {
            return;
        }
        this.f98793i.setColor(((z0.b) this.f98931u).p());
        z0.a<ColorFilter, ColorFilter> aVar = this.f98932v;
        if (aVar != null) {
            this.f98793i.setColorFilter(aVar.h());
        }
        super.d(canvas, matrix, i11);
    }

    @Override // y0.c
    public String getName() {
        return this.f98929s;
    }
}
