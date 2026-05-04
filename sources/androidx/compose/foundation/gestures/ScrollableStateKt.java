package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,221:1\n1247#2,6:222\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n162#1:222,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableStateKt {
    @k
    public static final ScrollableState ScrollableState(@k l<? super Float, Float> lVar) {
        return new DefaultScrollableState(lVar);
    }

    @Composable
    @k
    public static final ScrollableState rememberScrollableState(@k l<? super Float, Float> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i11, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i11 & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final Float invoke(float f11) {
                    return rememberUpdatedState.getValue().invoke(Float.valueOf(f11));
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                    return invoke(f11.floatValue());
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        ScrollableState scrollableState = (ScrollableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollableState;
    }
}
