package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z11) {
        super.addToSolver(linearSystem, z11);
        if (this.mWidgetsCount > 0) {
            ConstraintWidget constraintWidget = this.mWidgets[0];
            constraintWidget.resetAllConstraints();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.connect(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.connect(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.connect(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.connect(type4, this, type4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i11, int i12, int i13, int i14) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mWidgetsCount > 0) {
            paddingLeft += this.mWidgets[0].getWidth();
            paddingTop += this.mWidgets[0].getHeight();
        }
        int max = Math.max(getMinWidth(), paddingLeft);
        int max2 = Math.max(getMinHeight(), paddingTop);
        if (i11 != 1073741824) {
            i12 = i11 == Integer.MIN_VALUE ? Math.min(max, i12) : i11 == 0 ? max : 0;
        }
        if (i13 != 1073741824) {
            i14 = i13 == Integer.MIN_VALUE ? Math.min(max2, i14) : i13 == 0 ? max2 : 0;
        }
        setMeasure(i12, i14);
        setWidth(i12);
        setHeight(i14);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
    }
}
