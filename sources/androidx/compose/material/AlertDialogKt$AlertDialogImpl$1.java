package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogImpl$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,452:1\n149#2:453\n149#2:490\n71#3:454\n68#3,6:455\n74#3:489\n78#3:494\n79#4,6:461\n86#4,4:476\n90#4,2:486\n94#4:493\n368#5,9:467\n377#5:488\n378#5,2:491\n4034#6,6:480\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogImpl$1\n*L\n154#1:453\n155#1:490\n154#1:454\n154#1:455,6\n154#1:489\n154#1:494\n154#1:461,6\n154#1:476,4\n154#1:486,2\n154#1:493\n154#1:467,9\n154#1:488\n154#1:491,2\n154#1:480,6\n*E\n"})
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogImpl$1 extends Lambda implements p<Composer, Integer, g2> {
    final /* synthetic */ p<Composer, Integer, g2> $confirmButton;
    final /* synthetic */ p<Composer, Integer, g2> $dismissButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogImpl$1(p<? super Composer, ? super Integer, g2> pVar, p<? super Composer, ? super Integer, g2> pVar2) {
        super(2);
        this.$dismissButton = pVar;
        this.$confirmButton = pVar2;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167440211, i11, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:153)");
        }
        float f11 = 8;
        Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(2));
        final p<Composer, Integer, g2> pVar = this.$dismissButton;
        final p<Composer, Integer, g2> pVar2 = this.$confirmButton;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
        Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        AlertDialogKt.m1517AlertDialogFlowRowixp7dh8(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(12), ComposableLambdaKt.rememberComposableLambda(-563890224, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return g2.f100423a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer2, int i12) {
                if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563890224, i12, -1, "androidx.compose.material.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:155)");
                }
                p<Composer, Integer, g2> pVar3 = pVar;
                if (pVar3 == null) {
                    composer2.startReplaceGroup(-1324738946);
                } else {
                    composer2.startReplaceGroup(1481287139);
                    pVar3.invoke(composer2, 0);
                }
                composer2.endReplaceGroup();
                pVar2.invoke(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 438);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
