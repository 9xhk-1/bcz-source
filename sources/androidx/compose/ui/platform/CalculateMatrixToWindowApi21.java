package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    @m80.k
    private final int[] tmpLocation;

    @m80.k
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, kotlin.jvm.internal.v vVar) {
        this(fArr);
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m4242preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m2380setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m4239preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m4243preTranslate3XD1CNM(float[] fArr, float f11, float f12) {
        AndroidComposeView_androidKt.m4240preTranslatecG2Xzmc(fArr, f11, f12, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m4244transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m4244transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m4243preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m4243preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m4243preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m4243preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m4242preConcattUYjHk(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo4241calculateMatrixToWindowEL8BTi8(@m80.k View view, @m80.k float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m2748resetimpl(fArr);
        m4244transformMatrixToWindowEL8BTi8(view, fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
