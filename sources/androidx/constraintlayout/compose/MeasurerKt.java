package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MeasurerKt {
    private static final boolean DEBUG = false;

    @k
    public static final String getAnyOrNullId(@k Measurable measurable) {
        String obj;
        Object layoutId = LayoutIdKt.getLayoutId(measurable);
        if (layoutId == null) {
            layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
        }
        return (layoutId == null || (obj = layoutId.toString()) == null) ? "null" : obj;
    }
}
