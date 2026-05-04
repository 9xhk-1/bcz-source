package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,53:1\n1247#2,6:54\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n*L\n27#1:54,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    @Composable
    @k
    public static final LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState(@k LazyStaggeredGridState lazyStaggeredGridState, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-363070453, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyStaggeredGridBeyondBoundsState lazyStaggeredGridBeyondBoundsState = (LazyStaggeredGridBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridBeyondBoundsState;
    }
}
