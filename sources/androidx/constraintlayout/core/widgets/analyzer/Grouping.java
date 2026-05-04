package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;
    private static final boolean FORCE_USE = true;

    public static WidgetGroup findDependents(ConstraintWidget constraintWidget, int i11, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        int findGroupInDependents;
        int i12 = i11 == 0 ? constraintWidget.horizontalGroup : constraintWidget.verticalGroup;
        if (i12 != -1 && (widgetGroup == null || i12 != widgetGroup.getId())) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i13);
                if (widgetGroup2.getId() == i12) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i11, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i13++;
                }
            }
        } else if (i12 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (findGroupInDependents = ((HelperWidget) constraintWidget).findGroupInDependents(i11)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = arrayList.get(i14);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i14++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i11);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                guideline.getAnchor().findDependents(guideline.getOrientation() == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i11 == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
                constraintWidget.mLeft.findDependents(i11, arrayList, widgetGroup);
                constraintWidget.mRight.findDependents(i11, arrayList, widgetGroup);
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
                constraintWidget.mTop.findDependents(i11, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i11, arrayList, widgetGroup);
                constraintWidget.mBottom.findDependents(i11, arrayList, widgetGroup);
            }
            constraintWidget.mCenter.findDependents(i11, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    private static WidgetGroup findGroup(ArrayList<WidgetGroup> arrayList, int i11) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            WidgetGroup widgetGroup = arrayList.get(i12);
            if (i11 == widgetGroup.getId()) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r17, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r18) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer):boolean");
    }

    public static boolean validInGroup(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
