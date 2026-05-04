package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i11 = this.mWidgetsCount + 1;
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        if (i11 > constraintWidgetArr.length) {
            this.mWidgets = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i12 = this.mWidgetsCount;
        constraintWidgetArr2[i12] = constraintWidget;
        this.mWidgetsCount = i12 + 1;
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i11, WidgetGroup widgetGroup) {
        for (int i12 = 0; i12 < this.mWidgetsCount; i12++) {
            widgetGroup.add(this.mWidgets[i12]);
        }
        for (int i13 = 0; i13 < this.mWidgetsCount; i13++) {
            Grouping.findDependents(this.mWidgets[i13], i11, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i11 = helperWidget.mWidgetsCount;
        for (int i12 = 0; i12 < i11; i12++) {
            add(hashMap.get(helperWidget.mWidgets[i12]));
        }
    }

    public int findGroupInDependents(int i11) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < this.mWidgetsCount; i14++) {
            ConstraintWidget constraintWidget = this.mWidgets[i14];
            if (i11 == 0 && (i13 = constraintWidget.horizontalGroup) != -1) {
                return i13;
            }
            if (i11 == 1 && (i12 = constraintWidget.verticalGroup) != -1) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
