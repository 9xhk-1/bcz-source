package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,408:1\n79#2,6:409\n86#2,3:424\n89#2,2:433\n93#2:438\n347#3,9:415\n356#3,3:435\n4206#4,6:427\n1247#5,6:439\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n101#1:409,6\n101#1:424,3\n101#1:433,2\n101#1:438\n101#1:415,9\n101#1:435,3\n101#1:427,6\n125#1:439,6\n*E\n"})
/* loaded from: classes.dex */
public final class RowKt {

    @m80.k
    private static final MeasurePolicy DefaultRowMeasurePolicy = new RowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Row(@l Modifier modifier, @l Arrangement.Horizontal horizontal, @l Alignment.Vertical vertical, @m80.k q<? super RowScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i12 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i12 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        MeasurePolicy rowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i11 >> 3) & 126);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        qVar.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i11 >> 6) & 112) | 6));
        composer.endNode();
    }

    public static final long createRowConstraints(boolean z11, int i11, int i12, int i13, int i14) {
        return !z11 ? ConstraintsKt.Constraints(i11, i13, i12, i14) : Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA(i11, i13, i12, i14);
    }

    @m80.k
    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    @Composable
    @v0
    @m80.k
    public static final MeasurePolicy rowMeasurePolicy(@m80.k Arrangement.Horizontal horizontal, @m80.k Alignment.Vertical vertical, @l Composer composer, int i11) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i11, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:121)");
        }
        if (g0.g(horizontal, Arrangement.INSTANCE.getStart()) && g0.g(vertical, Alignment.Companion.getTop())) {
            composer.startReplaceGroup(-848964613);
            composer.endReplaceGroup();
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceGroup(-848913742);
            boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i11 & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new RowMeasurePolicy(horizontal, vertical);
                composer.updateRememberedValue(rememberedValue);
            }
            measurePolicy = (RowMeasurePolicy) rememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @v0
    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }
}
