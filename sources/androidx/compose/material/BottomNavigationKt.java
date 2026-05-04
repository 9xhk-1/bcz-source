package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import c10.d;
import g10.u;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,448:1\n75#2:449\n71#3:450\n69#3,5:451\n74#3:484\n78#3:488\n71#3:526\n68#3,6:527\n74#3:561\n78#3:565\n71#3:566\n68#3,6:567\n74#3:601\n78#3:605\n79#4,6:456\n86#4,4:471\n90#4,2:481\n94#4:487\n79#4:495\n77#4,8:496\n86#4,4:513\n90#4,2:523\n79#4,6:533\n86#4,4:548\n90#4,2:558\n94#4:564\n79#4,6:573\n86#4,4:588\n90#4,2:598\n94#4:604\n94#4:608\n368#5,9:462\n377#5:483\n378#5,2:485\n368#5,9:504\n377#5:525\n368#5,9:539\n377#5:560\n378#5,2:562\n368#5,9:579\n377#5:600\n378#5,2:602\n378#5,2:606\n4034#6,6:475\n4034#6,6:517\n4034#6,6:552\n4034#6,6:592\n1247#7,6:489\n85#8:609\n149#9:610\n149#9:611\n149#9:612\n149#9:613\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n210#1:449\n225#1:450\n225#1:451,5\n225#1:484\n225#1:488\n317#1:526\n317#1:527,6\n317#1:561\n317#1:565\n319#1:566\n319#1:567,6\n319#1:601\n319#1:605\n225#1:456,6\n225#1:471,4\n225#1:481,2\n225#1:487\n316#1:495\n316#1:496,8\n316#1:513,4\n316#1:523,2\n317#1:533,6\n317#1:548,4\n317#1:558,2\n317#1:564\n319#1:573,6\n319#1:588,4\n319#1:598,2\n319#1:604\n316#1:608\n225#1:462,9\n225#1:483\n225#1:485,2\n316#1:504,9\n316#1:525\n317#1:539,9\n317#1:560\n317#1:562,2\n319#1:579,9\n319#1:600\n319#1:602,2\n316#1:606,2\n225#1:475,6\n316#1:517,6\n317#1:552,6\n319#1:592,6\n327#1:489,6\n285#1:609\n436#1:610\n439#1:611\n445#1:612\n447#1:613\n*E\n"})
/* loaded from: classes.dex */
public final class BottomNavigationKt {

    @k
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m5115constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    @k
    private static final WindowInsets ZeroInsets;

    static {
        float f11 = 12;
        BottomNavigationItemHorizontalPadding = Dp.m5115constructorimpl(f11);
        CombinedItemTextBaseline = Dp.m5115constructorimpl(f11);
        float f12 = 0;
        ZeroInsets = WindowInsetsKt.m797WindowInsetsa9UjIt4(Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0081  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1549BottomNavigationPEIptTM(@m80.l androidx.compose.ui.Modifier r22, long r23, long r25, float r27, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1549BottomNavigationPEIptTM(androidx.compose.ui.Modifier, long, long, float, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigation-_UMDTes, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1550BottomNavigation_UMDTes(@m80.k final androidx.compose.foundation.layout.WindowInsets r22, @m80.l androidx.compose.ui.Modifier r23, long r24, long r26, float r28, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1550BottomNavigation_UMDTes(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1551BottomNavigationItemjY6E1Zs(@m80.k final androidx.compose.foundation.layout.RowScope r25, final boolean r26, @m80.k final x00.a<yz.g2> r27, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.ui.Modifier r29, boolean r30, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, boolean r32, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1551BottomNavigationItemjY6E1Zs(androidx.compose.foundation.layout.RowScope, boolean, x00.a, x00.p, androidx.compose.ui.Modifier, boolean, x00.p, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomNavigationItemBaselineLayout(final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, @FloatRange(from = 0.0d, to = 1.0d) final float f11, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162995092, i12, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:314)");
            }
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        Placeable placeable;
                        MeasureResult m1557placeLabelAndIconDIyivk0;
                        MeasureResult m1556placeIcon3p2s80s;
                        int size = list.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            Measurable measurable = list.get(i13);
                            if (g0.g(LayoutIdKt.getLayoutId(measurable), "icon")) {
                                Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                                if (pVar2 != null) {
                                    int size2 = list.size();
                                    for (int i14 = 0; i14 < size2; i14++) {
                                        Measurable measurable2 = list.get(i14);
                                        if (g0.g(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                            placeable = measurable2.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, 0, 11, null));
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                placeable = null;
                                Placeable placeable2 = placeable;
                                if (pVar2 == null) {
                                    m1556placeIcon3p2s80s = BottomNavigationKt.m1556placeIcon3p2s80s(measureScope, mo3857measureBRTryo0, j11);
                                    return m1556placeIcon3p2s80s;
                                }
                                g0.m(placeable2);
                                m1557placeLabelAndIconDIyivk0 = BottomNavigationKt.m1557placeLabelAndIconDIyivk0(measureScope, placeable2, mo3857measureBRTryo0, j11, f11);
                                return m1557placeLabelAndIconDIyivk0;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            if (pVar2 != null) {
                startRestartGroup.startReplaceGroup(-1180018220);
                Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f11), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m728paddingVpY3zN4$default);
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
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1179764516);
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$3
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
                    BottomNavigationKt.BottomNavigationItemBaselineLayout(pVar, pVar2, f11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1552BottomNavigationTransitionKlgxPg(final long j11, final long j12, final boolean z11, final q<? super Float, ? super Composer, ? super Integer, g2> qVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(j12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985175058, i12, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:282)");
            }
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z11 ? 1.0f : 0.0f, BottomNavigationAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m2560lerpjxsXWHM = ColorKt.m2560lerpjxsXWHM(j12, j11, BottomNavigationTransition_Klgx_Pg$lambda$2(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(Color.m2508copywmQWz5c$default(m2560lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2511getAlphaimpl(m2560lerpjxsXWHM)))}, ComposableLambdaKt.rememberComposableLambda(-138092754, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
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

                @Composable
                public final void invoke(Composer composer2, int i13) {
                    float BottomNavigationTransition_Klgx_Pg$lambda$2;
                    if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-138092754, i13, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:295)");
                    }
                    q<Float, Composer, Integer, g2> qVar2 = qVar;
                    BottomNavigationTransition_Klgx_Pg$lambda$2 = BottomNavigationKt.BottomNavigationTransition_Klgx_Pg$lambda$2(animateFloatAsState);
                    qVar2.invoke(Float.valueOf(BottomNavigationTransition_Klgx_Pg$lambda$2), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$2
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
                    BottomNavigationKt.m1552BottomNavigationTransitionKlgxPg(j11, j12, z11, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomNavigationTransition_Klgx_Pg$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1556placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j11) {
        int m5084constrainHeightK40F9xA = ConstraintsKt.m5084constrainHeightK40F9xA(j11, measureScope.mo371roundToPx0680j_4(BottomNavigationHeight));
        final int height = (m5084constrainHeightK40F9xA - placeable.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, placeable.getWidth(), m5084constrainHeightK40F9xA, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.BottomNavigationKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, height, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1557placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j11, @FloatRange(from = 0.0d, to = 1.0d) final float f11) {
        int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4(CombinedItemTextBaseline) - placeable.get(AlignmentLineKt.getFirstBaseline());
        int height = placeable2.getHeight() + placeable.getHeight() + mo371roundToPx0680j_4;
        int m5084constrainHeightK40F9xA = ConstraintsKt.m5084constrainHeightK40F9xA(j11, Math.max(height, measureScope.mo371roundToPx0680j_4(BottomNavigationHeight)));
        final int u11 = u.u((m5084constrainHeightK40F9xA - height) / 2, 0);
        int height2 = (m5084constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        final int height3 = placeable2.getHeight() + u11 + mo371roundToPx0680j_4;
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        final int width = (max - placeable.getWidth()) / 2;
        final int width2 = (max - placeable2.getWidth()) / 2;
        final int L0 = d.L0((height2 - u11) * (1 - f11));
        return MeasureScope.layout$default(measureScope, max, m5084constrainHeightK40F9xA, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.BottomNavigationKt$placeLabelAndIcon$1
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
                if (f11 != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, height3 + L0, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, u11 + L0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
