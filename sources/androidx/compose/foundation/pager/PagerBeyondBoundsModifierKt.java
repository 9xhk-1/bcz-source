package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPagerBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n1247#2,6:62\n*S KotlinDebug\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n*L\n27#1:62,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerBeyondBoundsModifierKt {
    @Composable
    @k
    public static final LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState(@k PagerState pagerState, int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(373558254, i12, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i11)) || (i12 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerBeyondBoundsState(pagerState, i11);
            composer.updateRememberedValue(rememberedValue);
        }
        PagerBeyondBoundsState pagerBeyondBoundsState = (PagerBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pagerBeyondBoundsState;
    }
}
