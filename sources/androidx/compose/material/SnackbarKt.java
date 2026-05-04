package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import g10.u;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,383:1\n149#2:384\n149#2:385\n149#2:386\n149#2:698\n149#2:699\n149#2:700\n149#2:701\n149#2:702\n149#2:703\n149#2:704\n149#2:705\n149#2:706\n79#3:387\n77#3,8:388\n86#3,4:405\n90#3,2:415\n79#3,6:425\n86#3,4:440\n90#3,2:450\n94#3:456\n94#3:460\n79#3,6:468\n86#3,4:483\n90#3,2:493\n79#3,6:504\n86#3,4:519\n90#3,2:529\n94#3:535\n79#3,6:544\n86#3,4:559\n90#3,2:569\n94#3:575\n94#3:579\n79#3,6:587\n86#3,4:602\n90#3,2:612\n79#3,6:622\n86#3,4:637\n90#3,2:647\n94#3:653\n79#3,6:662\n86#3,4:677\n90#3,2:687\n94#3:693\n94#3:697\n368#4,9:396\n377#4:417\n368#4,9:431\n377#4:452\n378#4,2:454\n378#4,2:458\n368#4,9:474\n377#4:495\n368#4,9:510\n377#4:531\n378#4,2:533\n368#4,9:550\n377#4:571\n378#4,2:573\n378#4,2:577\n368#4,9:593\n377#4:614\n368#4,9:628\n377#4:649\n378#4,2:651\n368#4,9:668\n377#4:689\n378#4,2:691\n378#4,2:695\n4034#5,6:409\n4034#5,6:444\n4034#5,6:487\n4034#5,6:523\n4034#5,6:563\n4034#5,6:606\n4034#5,6:641\n4034#5,6:681\n71#6:418\n68#6,6:419\n74#6:453\n78#6:457\n71#6:497\n68#6,6:498\n74#6:532\n78#6:536\n71#6:537\n68#6,6:538\n74#6:572\n78#6:576\n71#6:615\n68#6,6:616\n74#6:650\n78#6:654\n71#6:655\n68#6,6:656\n74#6:690\n78#6:694\n86#7:461\n83#7,6:462\n89#7:496\n93#7:580\n1247#8,6:581\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n93#1:384\n167#1:385\n183#1:386\n374#1:698\n375#1:699\n376#1:700\n377#1:701\n378#1:702\n379#1:703\n380#1:704\n381#1:705\n382#1:706\n239#1:387\n239#1:388,8\n239#1:405,4\n239#1:415,2\n240#1:425,6\n240#1:440,4\n240#1:450,2\n240#1:456\n239#1:460\n293#1:468,6\n293#1:483,4\n293#1:493,2\n302#1:504,6\n302#1:519,4\n302#1:529,2\n302#1:535\n308#1:544,6\n308#1:559,4\n308#1:569,2\n308#1:575\n293#1:579\n316#1:587,6\n316#1:602,4\n316#1:612,2\n318#1:622,6\n318#1:637,4\n318#1:647,2\n318#1:653\n319#1:662,6\n319#1:677,4\n319#1:687,2\n319#1:693\n316#1:697\n239#1:396,9\n239#1:417\n240#1:431,9\n240#1:452\n240#1:454,2\n239#1:458,2\n293#1:474,9\n293#1:495\n302#1:510,9\n302#1:531\n302#1:533,2\n308#1:550,9\n308#1:571\n308#1:573,2\n293#1:577,2\n316#1:593,9\n316#1:614\n318#1:628,9\n318#1:649\n318#1:651,2\n319#1:668,9\n319#1:689\n319#1:691,2\n316#1:695,2\n239#1:409,6\n240#1:444,6\n293#1:487,6\n302#1:523,6\n308#1:563,6\n316#1:606,6\n318#1:641,6\n319#1:681,6\n240#1:418\n240#1:419,6\n240#1:453\n240#1:457\n302#1:497\n302#1:498,6\n302#1:532\n302#1:536\n308#1:537\n308#1:538,6\n308#1:572\n308#1:576\n318#1:615\n318#1:616,6\n318#1:650\n318#1:654\n319#1:655\n319#1:656,6\n319#1:690\n319#1:694\n293#1:461\n293#1:462,6\n293#1:496\n293#1:580\n322#1:581,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m5115constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m5115constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m5115constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m5115constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m5115constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m5115constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m5115constructorimpl(68);

    static {
        float f11 = 8;
        HorizontalSpacingButtonSide = Dp.m5115constructorimpl(f11);
        TextEndExtraSpacing = Dp.m5115constructorimpl(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NewLineButtonSnackbar(final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i12, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f11 = HorizontalSpacing;
            float f12 = HorizontalSpacingButtonSide;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(fillMaxWidth$default, f11, 0.0f, f12, SeparateButtonExtraY, 2, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m730paddingqDBjuR0$default2 = PaddingKt.m730paddingqDBjuR0$default(AlignmentLineKt.m581paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f12, 0.0f, 11, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default2);
            a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i12 & 14));
            startRestartGroup.endNode();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            pVar2.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
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

                public final void invoke(Composer composer2, int i13) {
                    SnackbarKt.NewLineButtonSnackbar(pVar, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OneRowSnackbar(final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-534813202);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i12, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:312)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            Object rememberedValue = startRestartGroup.rememberedValue();
            final String str = "text";
            final String str2 = "action";
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        float f11;
                        float f12;
                        int mo371roundToPx0680j_4;
                        float f13;
                        int max;
                        float f14;
                        MeasureScope measureScope2 = measureScope;
                        String str3 = str2;
                        int size = list.size();
                        int i13 = 0;
                        int i14 = 0;
                        while (i14 < size) {
                            Measurable measurable = list.get(i14);
                            if (g0.g(LayoutIdKt.getLayoutId(measurable), str3)) {
                                long j12 = j11;
                                final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j12);
                                int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j12) - mo3857measureBRTryo0.getWidth();
                                f11 = SnackbarKt.TextEndExtraSpacing;
                                int u11 = u.u(m5068getMaxWidthimpl - measureScope2.mo371roundToPx0680j_4(f11), Constraints.m5070getMinWidthimpl(j12));
                                String str4 = str;
                                int size2 = list.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Measurable measurable2 = list.get(i15);
                                    if (g0.g(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                        final Placeable mo3857measureBRTryo02 = measurable2.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j12, 0, u11, 0, 0, 9, null));
                                        int i16 = mo3857measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                        int i17 = mo3857measureBRTryo02.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                        boolean z11 = true;
                                        boolean z12 = (i16 == Integer.MIN_VALUE || i17 == Integer.MIN_VALUE) ? false : true;
                                        if (i16 != i17 && z12) {
                                            z11 = false;
                                        }
                                        final int m5068getMaxWidthimpl2 = Constraints.m5068getMaxWidthimpl(j11) - mo3857measureBRTryo0.getWidth();
                                        if (z11) {
                                            f14 = SnackbarKt.SnackbarMinHeightOneLine;
                                            max = Math.max(measureScope2.mo371roundToPx0680j_4(f14), mo3857measureBRTryo0.getHeight());
                                            mo371roundToPx0680j_4 = (max - mo3857measureBRTryo02.getHeight()) / 2;
                                            int i18 = mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                            if (i18 != Integer.MIN_VALUE) {
                                                i13 = (i16 + mo371roundToPx0680j_4) - i18;
                                            }
                                        } else {
                                            f12 = SnackbarKt.HeightToFirstLine;
                                            mo371roundToPx0680j_4 = measureScope2.mo371roundToPx0680j_4(f12) - i16;
                                            f13 = SnackbarKt.SnackbarMinHeightTwoLines;
                                            max = Math.max(measureScope2.mo371roundToPx0680j_4(f13), mo3857measureBRTryo02.getHeight() + mo371roundToPx0680j_4);
                                            i13 = (max - mo3857measureBRTryo0.getHeight()) / 2;
                                        }
                                        final int i19 = i13;
                                        final int i21 = mo371roundToPx0680j_4;
                                        return MeasureScope.layout$default(measureScope2, Constraints.m5068getMaxWidthimpl(j11), max, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // x00.l
                                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return g2.f100423a;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, i21, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo3857measureBRTryo0, m5068getMaxWidthimpl2, i19, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                    i15++;
                                    measureScope2 = measureScope;
                                    j12 = j11;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i14++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m728paddingVpY3zN4$default);
            a<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i12 & 14));
            startRestartGroup.endNode();
            Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            a<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion2.getSetModifier());
            pVar2.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
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

                public final void invoke(Composer composer2, int i13) {
                    SnackbarKt.OneRowSnackbar(pVar, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00de  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Snackbar-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1766Snackbar7zSek6w(@m80.l androidx.compose.ui.Modifier r27, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, boolean r29, @m80.l androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r36, @m80.l androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m1766Snackbar7zSek6w(androidx.compose.ui.Modifier, x00.p, boolean, androidx.compose.ui.graphics.Shape, long, long, float, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1767SnackbarsPrSdHI(@m80.k final androidx.compose.material.SnackbarData r27, @m80.l androidx.compose.ui.Modifier r28, boolean r29, @m80.l androidx.compose.ui.graphics.Shape r30, long r31, long r33, long r35, float r37, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m1767SnackbarsPrSdHI(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TextOnlySnackbar(final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(917397959);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917397959, i12, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:237)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                    final ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    boolean z11 = false;
                    int i13 = Integer.MIN_VALUE;
                    int i14 = Integer.MIN_VALUE;
                    int i15 = 0;
                    for (int i16 = 0; i16 < size; i16++) {
                        Placeable mo3857measureBRTryo0 = list.get(i16).mo3857measureBRTryo0(j11);
                        arrayList.add(mo3857measureBRTryo0);
                        if (mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()) != Integer.MIN_VALUE && (i13 == Integer.MIN_VALUE || mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()) < i13)) {
                            i13 = mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                        }
                        if (mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE && (i14 == Integer.MIN_VALUE || mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline()) > i14)) {
                            i14 = mo3857measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                        }
                        i15 = Math.max(i15, mo3857measureBRTryo0.getHeight());
                    }
                    if (i13 != Integer.MIN_VALUE && i14 != Integer.MIN_VALUE) {
                        z11 = true;
                    }
                    final int max = Math.max(measureScope.mo371roundToPx0680j_4((i13 == i14 || !z11) ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), i15);
                    return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), max, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            ArrayList<Placeable> arrayList2 = arrayList;
                            int i17 = max;
                            int size2 = arrayList2.size();
                            for (int i18 = 0; i18 < size2; i18++) {
                                Placeable placeable = arrayList2.get(i18);
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i17 - placeable.getHeight()) / 2, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, snackbarKt$TextOnlySnackbar$2, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
            a<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i12 & 14));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
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

                public final void invoke(Composer composer2, int i13) {
                    SnackbarKt.TextOnlySnackbar(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
