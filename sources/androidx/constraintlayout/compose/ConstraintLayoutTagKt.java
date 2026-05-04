package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstraintLayoutTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutTag.kt\nandroidx/constraintlayout/compose/ConstraintLayoutTagKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,86:1\n135#2:87\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutTag.kt\nandroidx/constraintlayout/compose/ConstraintLayoutTagKt\n*L\n46#1:87\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintLayoutTagKt {
    @l
    public static final Object getConstraintLayoutId(@k Measurable measurable) {
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getConstraintLayoutId();
        }
        return null;
    }

    @l
    public static final Object getConstraintLayoutTag(@k Measurable measurable) {
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getConstraintLayoutTag();
        }
        return null;
    }

    @k
    public static final Modifier layoutId(@k Modifier modifier, @k final String str, @l String str2) {
        if (str2 == null) {
            return LayoutIdKt.layoutId(modifier, str);
        }
        return modifier.then(new ConstraintLayoutTag(str2, str, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@k InspectorInfo inspectorInfo) {
                inspectorInfo.setName("constraintLayoutId");
                inspectorInfo.setValue(str);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier layoutId$default(Modifier modifier, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }
}
