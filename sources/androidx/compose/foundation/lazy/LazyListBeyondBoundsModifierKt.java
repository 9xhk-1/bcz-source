package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n1247#2,6:61\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n29#1:61,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsModifierKt {
    @Composable
    @k
    public static final LazyLayoutBeyondBoundsState rememberLazyListBeyondBoundsState(@k LazyListState lazyListState, int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877443446, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
        }
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && composer.changed(i11)) || (i12 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListBeyondBoundsState(lazyListState, i11);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyListBeyondBoundsState lazyListBeyondBoundsState = (LazyListBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListBeyondBoundsState;
    }
}
