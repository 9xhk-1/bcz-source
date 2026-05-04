package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.unit.Dp;
import c10.d;
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
@u0({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n75#2:451\n71#3:452\n69#3,5:453\n74#3:486\n78#3:490\n71#3:528\n68#3,6:529\n74#3:563\n78#3:567\n71#3:568\n68#3,6:569\n74#3:603\n78#3:607\n79#4,6:458\n86#4,4:473\n90#4,2:483\n94#4:489\n79#4:497\n77#4,8:498\n86#4,4:515\n90#4,2:525\n79#4,6:535\n86#4,4:550\n90#4,2:560\n94#4:566\n79#4,6:575\n86#4,4:590\n90#4,2:600\n94#4:606\n94#4:610\n368#5,9:464\n377#5:485\n378#5,2:487\n368#5,9:506\n377#5:527\n368#5,9:541\n377#5:562\n378#5,2:564\n368#5,9:581\n377#5:602\n378#5,2:604\n378#5,2:608\n4034#6,6:477\n4034#6,6:519\n4034#6,6:554\n4034#6,6:594\n1247#7,6:491\n85#8:611\n149#9:612\n149#9:613\n149#9:614\n149#9:615\n149#9:616\n149#9:617\n149#9:618\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n214#1:451\n231#1:452\n231#1:453,5\n231#1:486\n231#1:490\n323#1:528\n323#1:529,6\n323#1:563\n323#1:567\n325#1:568\n325#1:569,6\n325#1:603\n325#1:607\n231#1:458,6\n231#1:473,4\n231#1:483,2\n231#1:489\n322#1:497\n322#1:498,8\n322#1:515,4\n322#1:525,2\n323#1:535,6\n323#1:550,4\n323#1:560,2\n323#1:566\n325#1:575,6\n325#1:590,4\n325#1:600,2\n325#1:606\n322#1:610\n231#1:464,9\n231#1:485\n231#1:487,2\n322#1:506,9\n322#1:527\n323#1:541,9\n323#1:562\n323#1:564,2\n325#1:581,9\n325#1:602\n325#1:604,2\n322#1:608,2\n231#1:477,6\n322#1:519,6\n323#1:554,6\n325#1:594,6\n327#1:491,6\n291#1:611\n427#1:612\n430#1:613\n433#1:614\n439#1:615\n442#1:616\n447#1:617\n449#1:618\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;

    @k
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m5115constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m5115constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m5115constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m5115constructorimpl(14);

    @k
    private static final WindowInsets ZeroInsets = WindowInsetsKt.m798WindowInsetsa9UjIt4$default(Dp.m5115constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);

    static {
        float f11 = 8;
        NavigationRailPadding = Dp.m5115constructorimpl(f11);
        HeaderPadding = Dp.m5115constructorimpl(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1708NavigationRailHsRjFd4(@m80.l androidx.compose.ui.Modifier r22, long r23, long r25, float r27, @m80.l x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1708NavigationRailHsRjFd4(androidx.compose.ui.Modifier, long, long, float, x00.q, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1709NavigationRailafqeVBk(@m80.k final androidx.compose.foundation.layout.WindowInsets r23, @m80.l androidx.compose.ui.Modifier r24, long r25, long r27, float r29, @m80.l x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, @m80.l androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1709NavigationRailafqeVBk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, x00.q, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1710NavigationRailItem0S3VyRs(final boolean r26, @m80.k final x00.a<yz.g2> r27, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.ui.Modifier r29, boolean r30, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r31, boolean r32, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1710NavigationRailItem0S3VyRs(boolean, x00.a, x00.p, androidx.compose.ui.Modifier, boolean, x00.p, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemBaselineLayout(final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, @FloatRange(from = 0.0d, to = 1.0d) final float f11, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1903861684);
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
                ComposerKt.traceEventStart(-1903861684, i12, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:320)");
            }
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        Placeable placeable;
                        MeasureResult m1716placeLabelAndIconDIyivk0;
                        MeasureResult m1715placeIcon3p2s80s;
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
                                    m1715placeIcon3p2s80s = NavigationRailKt.m1715placeIcon3p2s80s(measureScope, mo3857measureBRTryo0, j11);
                                    return m1715placeIcon3p2s80s;
                                }
                                g0.m(placeable2);
                                m1716placeLabelAndIconDIyivk0 = NavigationRailKt.m1716placeLabelAndIconDIyivk0(measureScope, placeable2, mo3857measureBRTryo0, j11, f11);
                                return m1716placeLabelAndIconDIyivk0;
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
                startRestartGroup.startReplaceGroup(531629965);
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f11);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, alpha);
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
                startRestartGroup.startReplaceGroup(531729909);
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$3
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
                    NavigationRailKt.NavigationRailItemBaselineLayout(pVar, pVar2, f11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1711NavigationRailTransitionKlgxPg(final long j11, final long j12, final boolean z11, final q<? super Float, ? super Composer, ? super Integer, g2> qVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-207161906);
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
                ComposerKt.traceEventStart(-207161906, i12, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:288)");
            }
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z11 ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m2560lerpjxsXWHM = ColorKt.m2560lerpjxsXWHM(j12, j11, NavigationRailTransition_Klgx_Pg$lambda$2(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(Color.m2508copywmQWz5c$default(m2560lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2511getAlphaimpl(m2560lerpjxsXWHM)))}, ComposableLambdaKt.rememberComposableLambda(-1688205042, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
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
                    float NavigationRailTransition_Klgx_Pg$lambda$2;
                    if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1688205042, i13, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:301)");
                    }
                    q<Float, Composer, Integer, g2> qVar2 = qVar;
                    NavigationRailTransition_Klgx_Pg$lambda$2 = NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$2(animateFloatAsState);
                    qVar2.invoke(Float.valueOf(NavigationRailTransition_Klgx_Pg$lambda$2), composer2, 0);
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
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
                    NavigationRailKt.m1711NavigationRailTransitionKlgxPg(j11, j12, z11, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1715placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j11) {
        final int max = Math.max(0, (Constraints.m5068getMaxWidthimpl(j11) - placeable.getWidth()) / 2);
        final int max2 = Math.max(0, (Constraints.m5067getMaxHeightimpl(j11) - placeable.getHeight()) / 2);
        return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, max, max2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1716placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j11, @FloatRange(from = 0.0d, to = 1.0d) final float f11) {
        final int m5067getMaxHeightimpl = (Constraints.m5067getMaxHeightimpl(j11) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo371roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int m5068getMaxWidthimpl = (Constraints.m5068getMaxWidthimpl(j11) - placeable.getWidth()) / 2;
        final int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4(ItemIconTopOffset);
        int m5067getMaxHeightimpl2 = (Constraints.m5067getMaxHeightimpl(j11) - placeable2.getHeight()) / 2;
        final int m5068getMaxWidthimpl2 = (Constraints.m5068getMaxWidthimpl(j11) - placeable2.getWidth()) / 2;
        final int L0 = d.L0((m5067getMaxHeightimpl2 - mo371roundToPx0680j_4) * (1 - f11));
        return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
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
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, m5068getMaxWidthimpl, m5067getMaxHeightimpl + L0, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, m5068getMaxWidthimpl2, mo371roundToPx0680j_4 + L0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
