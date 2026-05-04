package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LayoutIdKt {
    @l
    public static final Object getLayoutId(@k Measurable measurable) {
        Object parentData = measurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    @Stable
    @k
    public static final Modifier layoutId(@k Modifier modifier, @k Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }
}
