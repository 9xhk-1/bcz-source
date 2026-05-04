package f1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o0;
import e1.k;
import h1.j;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends com.airbnb.lottie.model.layer.a {
    public final y0.d H;
    public final com.airbnb.lottie.model.layer.b I;

    public d(o0 o0Var, Layer layer, com.airbnb.lottie.model.layer.b bVar) {
        super(o0Var, layer);
        this.I = bVar;
        y0.d dVar = new y0.d(o0Var, this, new k("__container", layer.n(), false));
        this.H = dVar;
        List<y0.c> list = Collections.EMPTY_LIST;
        dVar.f(list, list);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void G(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        this.H.h(dVar, i11, list, dVar2);
    }

    @Override // com.airbnb.lottie.model.layer.a, y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        this.H.a(rectF, this.f10093o, z11);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(@NonNull Canvas canvas, Matrix matrix, int i11) {
        this.H.d(canvas, matrix, i11);
    }

    @Override // com.airbnb.lottie.model.layer.a
    @Nullable
    public e1.a v() {
        e1.a v11 = super.v();
        return v11 != null ? v11 : this.I.v();
    }

    @Override // com.airbnb.lottie.model.layer.a
    @Nullable
    public j x() {
        j x11 = super.x();
        return x11 != null ? x11 : this.I.x();
    }
}
