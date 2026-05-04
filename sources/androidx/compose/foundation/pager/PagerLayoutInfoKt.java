package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPagerLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLayoutInfo.kt\nandroidx/compose/foundation/pager/PagerLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,97:1\n59#2:98\n54#2:100\n90#3:99\n85#3:101\n*S KotlinDebug\n*F\n+ 1 PagerLayoutInfo.kt\nandroidx/compose/foundation/pager/PagerLayoutInfoKt\n*L\n96#1:98\n96#1:100\n96#1:99\n96#1:101\n*E\n"})
/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(@k PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.getOrientation() == Orientation.Vertical ? pagerLayoutInfo.mo974getViewportSizeYbymL2g() & 4294967295L : pagerLayoutInfo.mo974getViewportSizeYbymL2g() >> 32);
    }
}
