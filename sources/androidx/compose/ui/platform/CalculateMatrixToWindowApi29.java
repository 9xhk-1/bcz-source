package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes2.dex */
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {

    @m80.k
    private final Matrix tmpMatrix = new Matrix();

    @m80.k
    private final int[] tmpPosition = new int[2];

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    @DoNotInline
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo4241calculateMatrixToWindowEL8BTi8(@m80.k View view, @m80.k float[] fArr) {
        this.tmpMatrix.reset();
        view.transformMatrixToGlobal(this.tmpMatrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.tmpPosition);
        int[] iArr = this.tmpPosition;
        int i11 = iArr[0];
        int i12 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tmpPosition;
        this.tmpMatrix.postTranslate(iArr2[0] - i11, iArr2[1] - i12);
        AndroidMatrixConversions_androidKt.m2380setFromtUYjHk(fArr, this.tmpMatrix);
    }
}
