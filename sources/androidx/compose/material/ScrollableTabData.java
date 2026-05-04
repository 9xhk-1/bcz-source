package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import c40.r0;
import g10.u;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ScrollableTabData {

    @k
    private final r0 coroutineScope;

    @k
    private final ScrollState scrollState;

    @l
    private Integer selectedTab;

    public ScrollableTabData(@k ScrollState scrollState, @k r0 r0Var) {
        this.scrollState = scrollState;
        this.coroutineScope = r0Var;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i11, List<TabPosition> list) {
        int mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(((TabPosition) a00.r0.u3(list)).m1806getRightD9Ej5fM()) + i11;
        int maxValue = mo371roundToPx0680j_4 - this.scrollState.getMaxValue();
        return u.I(density.mo371roundToPx0680j_4(tabPosition.m1805getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo371roundToPx0680j_4(tabPosition.m1807getWidthD9Ej5fM()) / 2)), 0, u.u(mo371roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(@k Density density, int i11, @k List<TabPosition> list, int i12) {
        int calculateTabOffset;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i12) {
            return;
        }
        this.selectedTab = Integer.valueOf(i12);
        TabPosition tabPosition = (TabPosition) a00.r0.b3(list, i12);
        if (tabPosition == null || this.scrollState.getValue() == (calculateTabOffset = calculateTabOffset(tabPosition, density, i11, list))) {
            return;
        }
        c40.k.f(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3, null);
    }
}
