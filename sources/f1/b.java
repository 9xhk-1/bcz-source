package f1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.p0;
import com.airbnb.lottie.t0;
import j1.j;
import z0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends com.airbnb.lottie.model.layer.a {
    public final Paint H;
    public final Rect I;
    public final Rect J;

    @Nullable
    public final p0 K;

    @Nullable
    public z0.a<ColorFilter, ColorFilter> L;

    @Nullable
    public z0.a<Bitmap, Bitmap> M;

    public b(o0 o0Var, Layer layer) {
        super(o0Var, layer);
        this.H = new x0.a(3);
        this.I = new Rect();
        this.J = new Rect();
        this.K = o0Var.U(layer.m());
    }

    @Nullable
    public final Bitmap N() {
        Bitmap h11;
        z0.a<Bitmap, Bitmap> aVar = this.M;
        if (aVar != null && (h11 = aVar.h()) != null) {
            return h11;
        }
        Bitmap L = this.f10094p.L(this.f10095q.m());
        if (L != null) {
            return L;
        }
        p0 p0Var = this.K;
        if (p0Var != null) {
            return p0Var.a();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.a, y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        if (this.K != null) {
            float e11 = j.e();
            rectF.set(0.0f, 0.0f, this.K.f() * e11, this.K.d() * e11);
            this.f10093o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        super.b(t11, jVar);
        if (t11 == t0.K) {
            if (jVar == null) {
                this.L = null;
                return;
            } else {
                this.L = new q(jVar);
                return;
            }
        }
        if (t11 == t0.N) {
            if (jVar == null) {
                this.M = null;
            } else {
                this.M = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(@NonNull Canvas canvas, Matrix matrix, int i11) {
        Bitmap N = N();
        if (N == null || N.isRecycled() || this.K == null) {
            return;
        }
        float e11 = j.e();
        this.H.setAlpha(i11);
        z0.a<ColorFilter, ColorFilter> aVar = this.L;
        if (aVar != null) {
            this.H.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.I.set(0, 0, N.getWidth(), N.getHeight());
        if (this.f10094p.V()) {
            this.J.set(0, 0, (int) (this.K.f() * e11), (int) (this.K.d() * e11));
        } else {
            this.J.set(0, 0, (int) (N.getWidth() * e11), (int) (N.getHeight() * e11));
        }
        canvas.drawBitmap(N, this.I, this.J, this.H);
        canvas.restore();
    }
}
