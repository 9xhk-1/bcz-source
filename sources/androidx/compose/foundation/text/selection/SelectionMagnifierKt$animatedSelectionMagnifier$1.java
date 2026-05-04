package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,106:1\n1247#2,6:107\n85#3:113\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n66#1:107,6\n65#1:113\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ x00.a<Offset> $magnifierCenter;
    final /* synthetic */ l<x00.a<Offset>, Modifier> $platformMagnifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(x00.a<Offset> aVar, l<? super x00.a<Offset>, ? extends Modifier> lVar) {
        super(3);
        this.$magnifierCenter = aVar;
        this.$platformMagnifier = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$0(State<Offset> state) {
        return state.getValue().m2278unboximpl();
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i11) {
        final State rememberAnimatedMagnifierPosition;
        composer.startReplaceGroup(759876635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(759876635, i11, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        }
        rememberAnimatedMagnifierPosition = SelectionMagnifierKt.rememberAnimatedMagnifierPosition(this.$magnifierCenter, composer, 0);
        l<x00.a<Offset>, Modifier> lVar = this.$platformMagnifier;
        boolean changed = composer.changed(rememberAnimatedMagnifierPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m2257boximpl(m1455invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m1455invokeF1C5BW0() {
                    long invoke$lambda$0;
                    invoke$lambda$0 = SelectionMagnifierKt$animatedSelectionMagnifier$1.invoke$lambda$0(rememberAnimatedMagnifierPosition);
                    return invoke$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier invoke = lVar.invoke((x00.a) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return invoke;
    }
}
