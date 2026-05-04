package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,32:1\n1247#2,6:33\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:33,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListSemanticsKt {
    @Composable
    @k
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(@k LazyListState lazyListState, boolean z11, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(596174919, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z12 = ((((i11 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(z11)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(lazyListState, z11);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyLayoutSemanticState;
    }
}
