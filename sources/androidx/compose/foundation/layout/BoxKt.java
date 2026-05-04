package androidx.compose.foundation.layout;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,334:1\n79#2,6:335\n86#2,3:350\n89#2,2:359\n93#2:364\n121#2,6:375\n128#2,4:390\n132#2:400\n134#2:403\n347#3,9:341\n356#3,3:361\n272#3,9:381\n281#3,2:401\n4206#4,6:353\n4206#4,6:394\n1247#5,6:365\n30#6:371\n30#6:373\n80#7:372\n80#7:374\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n72#1:335,6\n72#1:350,3\n72#1:359,2\n72#1:364\n234#1:375,6\n234#1:390,4\n234#1:400\n234#1:403\n72#1:341,9\n72#1:361,3\n234#1:381,9\n234#1:401,2\n72#1:353,6\n234#1:394,6\n113#1:365,6\n216#1:371\n217#1:373\n216#1:372\n217#1:374\n*E\n"})
/* loaded from: classes.dex */
public final class BoxKt {

    @m80.k
    private static final MutableScatterMap<Alignment, MeasurePolicy> Cache1 = cacheFor(true);

    @m80.k
    private static final MutableScatterMap<Alignment, MeasurePolicy> Cache2 = cacheFor(false);

    @m80.k
    private static final MeasurePolicy DefaultBoxMeasurePolicy = new BoxMeasurePolicy(Alignment.Companion.getTopStart(), false);

    @m80.k
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
            return MeasureScope.layout$default(measureScope, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }
            }, 4, null);
        }
    };

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@m80.l Modifier modifier, @m80.l Alignment alignment, boolean z11, @m80.k q<? super BoxScope, ? super Composer, ? super Integer, g2> qVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i12 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        MeasurePolicy maybeCachedBoxMeasurePolicy = maybeCachedBoxMeasurePolicy(alignment, z11);
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
        Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        qVar.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i11 >> 6) & 112) | 6));
        composer.endNode();
    }

    private static final MutableScatterMap<Alignment, MeasurePolicy> cacheFor(boolean z11) {
        MutableScatterMap<Alignment, MeasurePolicy> mutableScatterMap = new MutableScatterMap<>(9);
        Alignment.Companion companion = Alignment.Companion;
        mutableScatterMap.set(companion.getTopStart(), new BoxMeasurePolicy(companion.getTopStart(), z11));
        mutableScatterMap.set(companion.getTopCenter(), new BoxMeasurePolicy(companion.getTopCenter(), z11));
        mutableScatterMap.set(companion.getTopEnd(), new BoxMeasurePolicy(companion.getTopEnd(), z11));
        mutableScatterMap.set(companion.getCenterStart(), new BoxMeasurePolicy(companion.getCenterStart(), z11));
        mutableScatterMap.set(companion.getCenter(), new BoxMeasurePolicy(companion.getCenter(), z11));
        mutableScatterMap.set(companion.getCenterEnd(), new BoxMeasurePolicy(companion.getCenterEnd(), z11));
        mutableScatterMap.set(companion.getBottomStart(), new BoxMeasurePolicy(companion.getBottomStart(), z11));
        mutableScatterMap.set(companion.getBottomCenter(), new BoxMeasurePolicy(companion.getBottomCenter(), z11));
        mutableScatterMap.set(companion.getBottomEnd(), new BoxMeasurePolicy(companion.getBottomEnd(), z11));
        return mutableScatterMap;
    }

    private static final BoxChildDataNode getBoxChildDataNode(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildDataNode) {
            return (BoxChildDataNode) parentData;
        }
        return null;
    }

    @m80.k
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null) {
            return boxChildDataNode.getMatchParentSize();
        }
        return false;
    }

    @v0
    @m80.k
    public static final MeasurePolicy maybeCachedBoxMeasurePolicy(@m80.k Alignment alignment, boolean z11) {
        MeasurePolicy measurePolicy = (z11 ? Cache1 : Cache2).get(alignment);
        return measurePolicy == null ? new BoxMeasurePolicy(alignment, z11) : measurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i11, int i12, Alignment alignment) {
        Alignment alignment2;
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        Placeable.PlacementScope.m3921place70tqf50$default(placementScope, placeable, ((boxChildDataNode == null || (alignment2 = boxChildDataNode.getAlignment()) == null) ? alignment : alignment2).mo2085alignKFBX0sM(IntSize.m5281constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)), IntSize.m5281constructorimpl((i12 & 4294967295L) | (i11 << 32)), layoutDirection), 0.0f, 2, null);
    }

    @Composable
    @v0
    @m80.k
    public static final MeasurePolicy rememberBoxMeasurePolicy(@m80.k Alignment alignment, boolean z11, @m80.l Composer composer, int i11) {
        MeasurePolicy measurePolicy;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i11, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (!g0.g(alignment, Alignment.Companion.getTopStart()) || z11) {
            composer.startReplaceGroup(-1709737635);
            boolean z12 = ((((i11 & 14) ^ 6) > 4 && composer.changed(alignment)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(z11)) || (i11 & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BoxMeasurePolicy(alignment, z11);
                composer.updateRememberedValue(rememberedValue);
            }
            measurePolicy = (BoxMeasurePolicy) rememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1709785313);
            composer.endReplaceGroup();
            measurePolicy = DefaultBoxMeasurePolicy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(@m80.k final Modifier modifier, @m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i12, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.layout.BoxKt$Box$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    BoxKt.Box(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
