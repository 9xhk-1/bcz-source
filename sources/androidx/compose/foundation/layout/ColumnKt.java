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
@u0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,385:1\n79#2,6:386\n86#2,3:401\n89#2,2:410\n93#2:415\n347#3,9:392\n356#3,3:412\n4206#4,6:404\n1247#5,6:416\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n89#1:386,6\n89#1:401,3\n89#1:410,2\n89#1:415\n89#1:392,9\n89#1:412,3\n89#1:404,6\n112#1:416,6\n*E\n"})
/* loaded from: classes.dex */
public final class ColumnKt {

    @m80.k
    private static final MeasurePolicy DefaultColumnMeasurePolicy = new ColumnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Column(@l Modifier modifier, @l Arrangement.Vertical vertical, @l Alignment.Horizontal horizontal, @m80.k q<? super ColumnScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i12 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i12 & 4) != 0) {
            horizontal = Alignment.Companion.getStart();
        }
        MeasurePolicy columnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i11 >> 3) & 126);
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
        Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        qVar.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i11 >> 6) & 112) | 6));
        composer.endNode();
    }

    @Composable
    @v0
    @m80.k
    public static final MeasurePolicy columnMeasurePolicy(@m80.k Arrangement.Vertical vertical, @m80.k Alignment.Horizontal horizontal, @l Composer composer, int i11) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i11, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (g0.g(vertical, Arrangement.INSTANCE.getTop()) && g0.g(horizontal, Alignment.Companion.getStart())) {
            composer.startReplaceGroup(346089448);
            composer.endReplaceGroup();
            measurePolicy = DefaultColumnMeasurePolicy;
        } else {
            composer.startReplaceGroup(346143295);
            boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i11 & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ColumnMeasurePolicy(vertical, horizontal);
                composer.updateRememberedValue(rememberedValue);
            }
            measurePolicy = (ColumnMeasurePolicy) rememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final long createColumnConstraints(boolean z11, int i11, int i12, int i13, int i14) {
        return !z11 ? ConstraintsKt.Constraints(i12, i14, i11, i13) : Constraints.Companion.m5076fitPrioritizingHeightZbe2FdA(i12, i14, i11, i13);
    }

    @m80.k
    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return DefaultColumnMeasurePolicy;
    }

    @v0
    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}
