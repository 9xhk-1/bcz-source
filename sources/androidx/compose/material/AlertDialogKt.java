package androidx.compose.material;

import a00.h0;
import a00.r0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,452:1\n79#2,6:453\n86#2,4:468\n90#2,2:478\n79#2,6:488\n86#2,4:503\n90#2,2:513\n94#2:519\n79#2,6:528\n86#2,4:543\n90#2,2:553\n94#2:559\n94#2:563\n79#2:570\n77#2,8:571\n86#2,4:588\n90#2,2:598\n94#2:603\n368#3,9:459\n377#3:480\n368#3,9:494\n377#3:515\n378#3,2:517\n368#3,9:534\n377#3:555\n378#3,2:557\n378#3,2:561\n368#3,9:579\n377#3,3:600\n4034#4,6:472\n4034#4,6:507\n4034#4,6:547\n4034#4,6:592\n71#5:481\n68#5,6:482\n74#5:516\n78#5:520\n71#5:521\n68#5,6:522\n74#5:556\n78#5:560\n1247#6,6:564\n149#7:604\n149#7:605\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n251#1:453,6\n251#1:468,4\n251#1:478,2\n254#1:488,6\n254#1:503,4\n254#1:513,2\n254#1:519\n257#1:528,6\n257#1:543,4\n257#1:553,2\n257#1:559\n251#1:563\n353#1:570\n353#1:571,8\n353#1:588,4\n353#1:598,2\n353#1:603\n251#1:459,9\n251#1:480\n254#1:494,9\n254#1:515\n254#1:517,2\n257#1:534,9\n257#1:555\n257#1:557,2\n251#1:561,2\n353#1:579,9\n353#1:600,3\n251#1:472,6\n254#1:507,6\n257#1:547,6\n353#1:592,6\n254#1:481\n254#1:482,6\n254#1:516\n254#1:520\n257#1:521\n257#1:522,6\n257#1:556\n257#1:560\n353#1:564,6\n443#1:604\n444#1:605\n*E\n"})
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle;
    private static final long TextBaselineDistanceFromTop;

    @k
    private static final Modifier TextPadding;
    private static final long TitleBaselineDistanceFromTop;

    @k
    private static final Modifier TitlePadding;

    static {
        Modifier.Companion companion = Modifier.Companion;
        float f11 = 24;
        TitlePadding = PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 10, null);
        TextPadding = PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogBaselineLayout(@k final ColumnScope columnScope, @l final p<? super Composer, ? super Integer, g2> pVar, @l final p<? super Composer, ? super Integer, g2> pVar2, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555573207, i12, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:249)");
            }
            Modifier weight = columnScope.weight(Modifier.Companion, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final androidx.compose.ui.layout.MeasureResult mo33measure3p2s80s(androidx.compose.ui.layout.MeasureScope r20, java.util.List<? extends androidx.compose.ui.layout.Measurable> r21, long r22) {
                    /*
                        Method dump skipped, instructions count: 318
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.mo33measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                }
            };
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, weight);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, alertDialogKt$AlertDialogBaselineLayout$2, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            if (pVar == null) {
                startRestartGroup.startReplaceGroup(1317321954);
            } else {
                startRestartGroup.startReplaceGroup(1317321955);
                Modifier layoutId = LayoutIdKt.layoutId(TitlePadding, "title");
                Alignment.Companion companion2 = Alignment.Companion;
                Modifier align = columnScope.align(layoutId, companion2.getStart());
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
                a<ComposeUiNode> constructor2 = companion.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
            }
            startRestartGroup.endReplaceGroup();
            if (pVar2 == null) {
                startRestartGroup.startReplaceGroup(1317454758);
            } else {
                startRestartGroup.startReplaceGroup(1317454759);
                Modifier layoutId2 = LayoutIdKt.layoutId(TextPadding, "text");
                Alignment.Companion companion3 = Alignment.Companion;
                Modifier align2 = columnScope.align(layoutId2, companion3.getStart());
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align2);
                a<ComposeUiNode> constructor3 = companion.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar2.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
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
                    AlertDialogKt.AlertDialogBaselineLayout(ColumnScope.this, pVar, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if ((r34 & 64) != 0) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00aa  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1516AlertDialogContentWMdw5o4(@m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r23, @m80.l androidx.compose.ui.Modifier r24, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r25, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.l androidx.compose.ui.graphics.Shape r27, long r28, long r30, @m80.l androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m1516AlertDialogContentWMdw5o4(x00.p, androidx.compose.ui.Modifier, x00.p, x00.p, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1517AlertDialogFlowRowixp7dh8(final float f11, final float f12, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(f11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(f12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73434452, i12, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:351)");
            }
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1
                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f13, long j11, Placeable placeable) {
                        return list.isEmpty() || (intRef.element + measureScope.mo371roundToPx0680j_4(f13)) + placeable.getWidth() <= Constraints.m5068getMaxWidthimpl(j11);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f13, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!list.isEmpty()) {
                            intRef.element += measureScope.mo371roundToPx0680j_4(f13);
                        }
                        list.add(0, r0.a6(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j11) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        int i13 = 0;
                        long Constraints$default = ConstraintsKt.Constraints$default(0, Constraints.m5068getMaxWidthimpl(j11), 0, 0, 13, null);
                        float f13 = f11;
                        float f14 = f12;
                        int size = list.size();
                        while (i13 < size) {
                            ArrayList arrayList5 = arrayList;
                            Placeable mo3857measureBRTryo0 = list.get(i13).mo3857measureBRTryo0(Constraints$default);
                            long j12 = Constraints$default;
                            float f15 = f14;
                            int i14 = size;
                            int i15 = i13;
                            Ref.IntRef intRef5 = intRef3;
                            intRef3 = intRef5;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList4, intRef5, measureScope, f13, j11, mo3857measureBRTryo0)) {
                                arrayList = arrayList5;
                            } else {
                                arrayList = arrayList5;
                                measure_3p2s80s$startNewSequence(arrayList, intRef2, measureScope, f15, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                intRef3.element += measureScope.mo371roundToPx0680j_4(f13);
                            }
                            arrayList4.add(mo3857measureBRTryo0);
                            intRef3.element += mo3857measureBRTryo0.getWidth();
                            intRef4.element = Math.max(intRef4.element, mo3857measureBRTryo0.getHeight());
                            i13 = i15 + 1;
                            f14 = f15;
                            Constraints$default = j12;
                            size = i14;
                        }
                        if (!arrayList4.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList, intRef2, measureScope, f12, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                        }
                        final int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11) != Integer.MAX_VALUE ? Constraints.m5068getMaxWidthimpl(j11) : Math.max(intRef.element, Constraints.m5070getMinWidthimpl(j11));
                        int max = Math.max(intRef2.element, Constraints.m5069getMinHeightimpl(j11));
                        final float f16 = f11;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.layout$default(measureScope, m5068getMaxWidthimpl, max, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.2
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
                                List<List<Placeable>> list2 = arrayList6;
                                MeasureScope measureScope2 = measureScope;
                                float f17 = f16;
                                int i16 = m5068getMaxWidthimpl;
                                List<Integer> list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i17 = 0; i17 < size2; i17++) {
                                    List<Placeable> list4 = list2.get(i17);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i18 = 0;
                                    while (i18 < size3) {
                                        iArr[i18] = list4.get(i18).getWidth() + (i18 < h0.L(list4) ? measureScope2.mo371roundToPx0680j_4(f17) : 0);
                                        i18++;
                                    }
                                    int[] iArr2 = new int[size3];
                                    Arrangement.INSTANCE.getBottom().arrange(measureScope2, i16, iArr, iArr2);
                                    int size4 = list4.size();
                                    for (int i19 = 0; i19 < size4; i19++) {
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i19), iArr2[i19], list3.get(i17).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int i13 = (i12 >> 6) & 14;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            int i14 = ((i13 << 6) & 896) | 6;
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
            pVar.invoke(startRestartGroup, Integer.valueOf((i14 >> 6) & 14));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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
                    AlertDialogKt.m1517AlertDialogFlowRowixp7dh8(f11, f12, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogImpl-0nD-MI0, reason: not valid java name */
    public static final void m1518AlertDialogImpl0nDMI0(@k a<g2> aVar, @k p<? super Composer, ? super Integer, g2> pVar, @k Modifier modifier, @l p<? super Composer, ? super Integer, g2> pVar2, @l p<? super Composer, ? super Integer, g2> pVar3, @l p<? super Composer, ? super Integer, g2> pVar4, @k Shape shape, long j11, long j12, @k DialogProperties dialogProperties, @l Composer composer, int i11) {
        int i12 = i11 >> 3;
        AndroidAlertDialog_androidKt.m1521AlertDialogwqdebIU(aVar, ComposableLambdaKt.rememberComposableLambda(1167440211, true, new AlertDialogKt$AlertDialogImpl$1(pVar2, pVar), composer, 54), modifier, pVar3, pVar4, shape, j11, j12, dialogProperties, composer, (i11 & 14) | 48 | (i11 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 0);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogImpl-SxpAMN0, reason: not valid java name */
    public static final void m1519AlertDialogImplSxpAMN0(@k a<g2> aVar, @k p<? super Composer, ? super Integer, g2> pVar, @k Modifier modifier, @l p<? super Composer, ? super Integer, g2> pVar2, @l p<? super Composer, ? super Integer, g2> pVar3, @k Shape shape, long j11, long j12, @k DialogProperties dialogProperties, @l Composer composer, int i11) {
        AndroidDialog_androidKt.Dialog(aVar, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-66632952, true, new AlertDialogKt$AlertDialogImpl$2(pVar, modifier, pVar2, pVar3, shape, j11, j12), composer, 54), composer, (i11 & 14) | 384 | ((i11 >> 21) & 112), 0);
    }
}
