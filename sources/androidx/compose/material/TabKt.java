package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,430:1\n75#2:431\n75#2:432\n75#2:433\n68#3:434\n66#3,5:435\n71#3:443\n74#3:447\n1225#4,3:440\n1228#4,3:444\n1247#4,6:455\n1884#5,7:448\n79#6:461\n77#6,8:462\n86#6,4:479\n90#6,2:489\n79#6,6:499\n86#6,4:514\n90#6,2:524\n94#6:530\n79#6,6:539\n86#6,4:554\n90#6,2:564\n94#6:570\n94#6:574\n368#7,9:470\n377#7:491\n368#7,9:505\n377#7:526\n378#7,2:528\n368#7,9:545\n377#7:566\n378#7,2:568\n378#7,2:572\n4034#8,6:483\n4034#8,6:518\n4034#8,6:558\n71#9:492\n68#9,6:493\n74#9:527\n78#9:531\n71#9:532\n68#9,6:533\n74#9:567\n78#9:571\n1#10:575\n85#11:576\n149#12:577\n149#12:578\n149#12:579\n149#12:580\n149#12:581\n149#12:582\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n97#1:431\n160#1:432\n230#1:433\n273#1:434\n273#1:435,5\n273#1:443\n273#1:447\n273#1:440,3\n273#1:444,3\n309#1:455,6\n273#1:448,7\n302#1:461\n302#1:462,8\n302#1:479,4\n302#1:489,2\n304#1:499,6\n304#1:514,4\n304#1:524,2\n304#1:530\n307#1:539,6\n307#1:554,4\n307#1:564,2\n307#1:570\n302#1:574\n302#1:470,9\n302#1:491\n304#1:505,9\n304#1:526\n304#1:528,2\n307#1:545,9\n307#1:566\n307#1:568,2\n302#1:572,2\n302#1:483,6\n304#1:518,6\n307#1:558,6\n304#1:492\n304#1:493,6\n304#1:527\n304#1:531\n307#1:532\n307#1:533,6\n307#1:567\n307#1:571\n273#1:576\n409#1:577\n410#1:578\n418#1:579\n422#1:580\n425#1:581\n429#1:582\n*E\n"})
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m5115constructorimpl(48);
    private static final float LargeTabHeight = Dp.m5115constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m5115constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m5115constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m5115constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m5115constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1800LeadingIconTab0nDMI0(final boolean r28, @m80.k final x00.a<yz.g2> r29, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.ui.Modifier r32, boolean r33, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r34, long r35, long r37, @m80.l androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1800LeadingIconTab0nDMI0(boolean, x00.a, x00.p, x00.p, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1801Tab0nDMI0(final boolean r27, @m80.k final x00.a<yz.g2> r28, @m80.l androidx.compose.ui.Modifier r29, boolean r30, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r32, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1801Tab0nDMI0(boolean, x00.a, androidx.compose.ui.Modifier, boolean, x00.p, x00.p, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0082  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1802TabEVJuX4I(final boolean r29, @m80.k final x00.a<yz.g2> r30, @m80.l androidx.compose.ui.Modifier r31, boolean r32, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r38, @m80.l androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1802TabEVJuX4I(boolean, x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
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
                ComposerKt.traceEventStart(1249848471, i12, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            int i13 = i12 & 14;
            boolean z11 = (i13 == 4) | ((i12 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        Placeable placeable;
                        final Placeable placeable2;
                        if (pVar != null) {
                            int size = list.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                Measurable measurable = list.get(i14);
                                if (g0.g(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeable = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable = null;
                        if (pVar2 != null) {
                            int size2 = list.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                Measurable measurable2 = list.get(i15);
                                if (g0.g(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                    placeable2 = measurable2.mo3857measureBRTryo0(j11);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        final int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
                        final int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                        final Integer valueOf = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null;
                        final Integer valueOf2 = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null;
                        final Placeable placeable3 = placeable;
                        return MeasureScope.layout$default(measureScope, max, mo371roundToPx0680j_4, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1.1
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
                                Placeable placeable4;
                                Placeable placeable5 = Placeable.this;
                                if (placeable5 == null || (placeable4 = placeable2) == null) {
                                    if (placeable5 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable5, mo371roundToPx0680j_4);
                                        return;
                                    }
                                    Placeable placeable6 = placeable2;
                                    if (placeable6 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable6, mo371roundToPx0680j_4);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i16 = max;
                                int i17 = mo371roundToPx0680j_4;
                                Integer num = valueOf;
                                g0.m(num);
                                int intValue = num.intValue();
                                Integer num2 = valueOf2;
                                g0.m(num2);
                                TabKt.placeTextAndIcon(placementScope, measureScope2, placeable5, placeable4, i16, i17, intValue, num2.intValue());
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
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
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            if (pVar != null) {
                startRestartGroup.startReplaceGroup(-238651272);
                Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                pVar.invoke(startRestartGroup, Integer.valueOf(i13));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-238546523);
                startRestartGroup.endReplaceGroup();
            }
            if (pVar2 != null) {
                startRestartGroup.startReplaceGroup(-238517724);
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar2.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-238455259);
                startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
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

                public final void invoke(Composer composer2, int i14) {
                    TabKt.TabBaselineLayout(pVar, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1803TabTransitionKlgxPg(final long j11, final long j12, boolean z11, final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11) {
        int i12;
        final boolean z12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(j12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            z12 = z11;
            i12 |= startRestartGroup.changed(z12) ? 256 : 128;
        } else {
            z12 = z11;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405571117, i12, -1, "androidx.compose.material.TabTransition (Tab.kt:269)");
            }
            int i14 = i12 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z12), (String) null, startRestartGroup, i14 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new q<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Override // x00.q
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i15) {
                    composer2.startReplaceGroup(-2120892502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2120892502, i15, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:274)");
                    }
                    TweenSpec tween = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tween;
                }
            };
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j13 = booleanValue ? j11 : j12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m2513getColorSpaceimpl = Color.m2513getColorSpaceimpl(j13);
            boolean changed = startRestartGroup.changed(m2513getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m2513getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j14 = booleanValue2 ? j11 : j12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m2499boximpl = Color.m2499boximpl(j14);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                i13 = i14;
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            } else {
                i13 = i14;
            }
            long j15 = booleanValue3 ? j11 : j12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m2499boximpl, Color.m2499boximpl(j15), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(Color.m2508copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$2(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2511getAlphaimpl(TabTransition_Klgx_Pg$lambda$2(createTransitionAnimation))))}, pVar, startRestartGroup, ProvidedValue.$stable | (i13 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TabKt$TabTransition$1
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

                public final void invoke(Composer composer2, int i15) {
                    TabKt.m1803TabTransitionKlgxPg(j11, j12, z12, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i11, int i12, int i13, int i14) {
        int mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(i13 == i14 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon) + density.mo371roundToPx0680j_4(TabRowDefaults.INSTANCE.m1811getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo370roundToPxR2X_6o(IconDistanceFromBaseline)) - i13;
        int i15 = (i12 - i14) - mo371roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i11 - placeable.getWidth()) / 2, i15, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i11 - placeable2.getWidth()) / 2, i15 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i11) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i11 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}
