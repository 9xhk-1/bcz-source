package f1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import k1.j;
import z0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends com.airbnb.lottie.model.layer.a {
    public final RectF H;
    public final Paint I;
    public final float[] J;
    public final Path K;
    public final Layer L;

    @Nullable
    public z0.a<ColorFilter, ColorFilter> M;

    public e(o0 o0Var, Layer layer) {
        super(o0Var, layer);
        this.H = new RectF();
        x0.a aVar = new x0.a();
        this.I = aVar;
        this.J = new float[8];
        this.K = new Path();
        this.L = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.o());
    }

    @Override // com.airbnb.lottie.model.layer.a, y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        this.H.set(0.0f, 0.0f, this.L.q(), this.L.p());
        this.f10093o.mapRect(this.H);
        rectF.set(this.H);
    }

    @Override // com.airbnb.lottie.model.layer.a, c1.e
    public <T> void b(T t11, @Nullable j<T> jVar) {
        super.b(t11, jVar);
        if (t11 == t0.K) {
            if (jVar == null) {
                this.M = null;
            } else {
                this.M = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i11) {
        int alpha = Color.alpha(this.L.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i11 / 255.0f) * (((alpha / 255.0f) * (this.f10102x.h() == null ? 100 : this.f10102x.h().h().intValue())) / 100.0f) * 255.0f);
        this.I.setAlpha(intValue);
        z0.a<ColorFilter, ColorFilter> aVar = this.M;
        if (aVar != null) {
            this.I.setColorFilter(aVar.h());
        }
        if (intValue > 0) {
            float[] fArr = this.J;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.L.q();
            float[] fArr2 = this.J;
            fArr2[3] = 0.0f;
            fArr2[4] = this.L.q();
            this.J[5] = this.L.p();
            float[] fArr3 = this.J;
            fArr3[6] = 0.0f;
            fArr3[7] = this.L.p();
            matrix.mapPoints(this.J);
            this.K.reset();
            Path path = this.K;
            float[] fArr4 = this.J;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.K;
            float[] fArr5 = this.J;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.K;
            float[] fArr6 = this.J;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.K;
            float[] fArr7 = this.J;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.K;
            float[] fArr8 = this.J;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.K.close();
            canvas.drawPath(this.K, this.I);
        }
    }
}
