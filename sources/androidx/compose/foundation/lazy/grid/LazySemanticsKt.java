package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,69:1\n1247#2,6:70\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:70,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazySemanticsKt {
    @Composable
    @k
    public static final LazyLayoutSemanticState rememberLazyGridSemanticState(@k final LazyGridState lazyGridState, boolean z11, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1247008005, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z12 = ((((i11 & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(z11)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getContentPadding() {
                    return LazyGridState.this.getLayoutInfo().getBeforeContentPadding() + LazyGridState.this.getLayoutInfo().getAfterContentPadding();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getMaxScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(LazyGridState.this.getFirstVisibleItemIndex(), LazyGridState.this.getFirstVisibleItemScrollOffset(), LazyGridState.this.getCanScrollForward());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(LazyGridState.this.getFirstVisibleItemIndex(), LazyGridState.this.getFirstVisibleItemScrollOffset());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getViewport() {
                    return (int) (LazyGridState.this.getLayoutInfo().getOrientation() == Orientation.Vertical ? LazyGridState.this.getLayoutInfo().mo869getViewportSizeYbymL2g() & 4294967295L : LazyGridState.this.getLayoutInfo().mo869getViewportSizeYbymL2g() >> 32);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i12, c<? super g2> cVar) {
                    Object scrollToItem$default = LazyGridState.scrollToItem$default(LazyGridState.this, i12, 0, cVar, 2, null);
                    return scrollToItem$default == b.l() ? scrollToItem$default : g2.f100423a;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
