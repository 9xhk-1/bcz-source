package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,227:1\n1247#2,6:228\n149#3:234\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n137#1:228,6\n226#1:234\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeToDismissKt {
    private static final float DISMISS_THRESHOLD = Dp.m5115constructorimpl(56);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwipeToDismiss(@m80.k final androidx.compose.material.DismissState r20, @m80.l androidx.compose.ui.Modifier r21, @m80.l java.util.Set<? extends androidx.compose.material.DismissDirection> r22, @m80.l x00.l<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> r23, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r24, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r25, @m80.l androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss(androidx.compose.material.DismissState, androidx.compose.ui.Modifier, java.util.Set, x00.l, x00.q, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }

    @Composable
    @ExperimentalMaterialApi
    @k
    public static final DismissState rememberDismissState(@l final DismissValue dismissValue, @l final x00.l<? super DismissValue, Boolean> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i12 & 2) != 0) {
            lVar = new x00.l<DismissValue, Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$1
                @Override // x00.l
                public final Boolean invoke(DismissValue dismissValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753522702, i11, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:135)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.Companion.Saver(lVar);
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(dismissValue)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final DismissState invoke() {
                    return new DismissState(DismissValue.this, lVar);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        DismissState dismissState = (DismissState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dismissState;
    }
}
