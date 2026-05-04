package androidx.compose.ui.layout;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LayoutInfo {
    @k
    LayoutCoordinates getCoordinates();

    @k
    Density getDensity();

    int getHeight();

    @k
    LayoutDirection getLayoutDirection();

    @k
    List<ModifierInfo> getModifierInfo();

    @l
    LayoutInfo getParentInfo();

    int getSemanticsId();

    @k
    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    default boolean isDeactivated() {
        return false;
    }

    boolean isPlaced();
}
