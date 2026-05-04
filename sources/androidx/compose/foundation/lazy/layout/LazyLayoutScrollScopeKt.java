package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,297:1\n42#1,4:304\n42#1,4:308\n96#2,5:298\n1#3:303\n113#4:312\n113#4:313\n113#4:314\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n*L\n169#1:304,4\n263#1:308,4\n116#1:298,5\n35#1:312\n36#1:313\n37#1:314\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutScrollScopeKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m5115constructorimpl(2500);
    private static final float BoundDistance = Dp.m5115constructorimpl(1500);
    private static final float MinimumDistance = Dp.m5115constructorimpl(50);

    /* JADX WARN: Can't wrap try/catch for region: R(18:(1:(2:30|31))|(1:(16:82|38|(1:40)(1:75)|41|(1:43)(1:74)|44|45|46|47|48|49|50|51|52|(8:54|21|22|23|24|25|26|(4:28|30|31|(0)(4:33|34|35|(1:76))))|55)(1:83))(0)|37|38|(0)(0)|41|(0)(0)|44|45|46|47|48|49|50|51|52|(0)|55) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e4, code lost:
    
        r21 = r5;
        r2 = r17;
        r14 = r18;
        r9 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea A[Catch: ItemFoundInScroll -> 0x01ed, TryCatch #5 {ItemFoundInScroll -> 0x01ed, blocks: (B:26:0x00e6, B:28:0x00ea, B:30:0x00f0, B:38:0x0121, B:41:0x015d), top: B:25:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01b6 -> B:21:0x0072). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollToItem(@m80.k androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r37, int r38, int r39, int r40, @m80.k androidx.compose.ui.unit.Density r41, @m80.k j00.c<? super yz.g2> r42) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, int, int, int, androidx.compose.ui.unit.Density, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateScrollToItem$isOvershot(boolean z11, LazyLayoutScrollScope lazyLayoutScrollScope, int i11, int i12) {
        if (z11) {
            if (lazyLayoutScrollScope.getFirstVisibleItemIndex() > i11) {
                return true;
            }
            return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i11 && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() > i12;
        }
        if (lazyLayoutScrollScope.getFirstVisibleItemIndex() < i11) {
            return true;
        }
        return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i11 && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() < i12;
    }

    public static final boolean isItemVisible(@k LazyLayoutScrollScope lazyLayoutScrollScope, int i11) {
        return i11 <= lazyLayoutScrollScope.getLastVisibleItemIndex() && lazyLayoutScrollScope.getFirstVisibleItemIndex() <= i11;
    }

    private static final void debugLog(x00.a<String> aVar) {
    }
}
