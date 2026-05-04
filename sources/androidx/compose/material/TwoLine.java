package androidx.compose.material;

import a00.h0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n99#2:446\n96#2,6:447\n102#2:481\n106#2:525\n79#3,6:453\n86#3,4:468\n90#3,2:478\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:520\n94#3:524\n368#4,9:459\n377#4:480\n368#4,9:495\n377#4:516\n378#4,2:518\n378#4,2:522\n4034#5,6:472\n4034#5,6:508\n51#6:482\n71#7:483\n69#7,5:484\n74#7:517\n78#7:521\n149#8:526\n149#8:527\n149#8:528\n149#8:529\n149#8:530\n149#8:531\n149#8:532\n149#8:533\n149#8:534\n149#8:535\n149#8:536\n149#8:537\n149#8:538\n149#8:539\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n*L\n218#1:446\n218#1:447,6\n218#1:481\n218#1:525\n218#1:453,6\n218#1:468,4\n218#1:478,2\n223#1:489,6\n223#1:504,4\n223#1:514,2\n223#1:520\n218#1:524\n218#1:459,9\n218#1:480\n223#1:495,9\n223#1:516\n223#1:518,2\n218#1:522,2\n218#1:472,6\n223#1:508,6\n225#1:482\n223#1:483\n223#1:484,5\n223#1:517\n223#1:521\n187#1:526\n188#1:527\n191#1:528\n192#1:529\n193#1:530\n196#1:531\n197#1:532\n198#1:533\n199#1:534\n200#1:535\n201#1:536\n202#1:537\n203#1:538\n206#1:539\n*E\n"})
/* loaded from: classes.dex */
final class TwoLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconVerticalPadding;
    private static final float OverlineToPrimaryBaselineOffset;
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon;
    private static final float TrailingRightPadding;

    @k
    public static final TwoLine INSTANCE = new TwoLine();
    private static final float MinHeight = Dp.m5115constructorimpl(64);
    private static final float MinHeightWithIcon = Dp.m5115constructorimpl(72);
    private static final float IconMinPaddedWidth = Dp.m5115constructorimpl(40);
    private static final float OverlineBaselineOffset = Dp.m5115constructorimpl(24);
    private static final float PrimaryBaselineOffsetNoIcon = Dp.m5115constructorimpl(28);
    private static final float PrimaryBaselineOffsetWithIcon = Dp.m5115constructorimpl(32);

    static {
        float f11 = 16;
        IconLeftPadding = Dp.m5115constructorimpl(f11);
        IconVerticalPadding = Dp.m5115constructorimpl(f11);
        ContentLeftPadding = Dp.m5115constructorimpl(f11);
        ContentRightPadding = Dp.m5115constructorimpl(f11);
        float f12 = 20;
        OverlineToPrimaryBaselineOffset = Dp.m5115constructorimpl(f12);
        PrimaryToSecondaryBaselineOffsetNoIcon = Dp.m5115constructorimpl(f12);
        PrimaryToSecondaryBaselineOffsetWithIcon = Dp.m5115constructorimpl(f12);
        TrailingRightPadding = Dp.m5115constructorimpl(f11);
    }

    private TwoLine() {
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void ListItem(@l Modifier modifier, @l final p<? super Composer, ? super Integer, g2> pVar, @k final p<? super Composer, ? super Integer, g2> pVar2, @l final p<? super Composer, ? super Integer, g2> pVar3, @l final p<? super Composer, ? super Integer, g2> pVar4, @l final p<? super Composer, ? super Integer, g2> pVar5, @l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        TwoLine twoLine;
        final Modifier modifier3;
        Modifier modifier4;
        final float f11;
        boolean z11;
        Composer startRestartGroup = composer.startRestartGroup(-1340612993);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar2) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar3) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar4) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar5) ? 131072 : 65536;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
            twoLine = this;
        } else {
            twoLine = this;
            if ((i11 & 1572864) == 0) {
                i13 |= startRestartGroup.changed(twoLine) ? 1048576 : 524288;
            }
        }
        if (startRestartGroup.shouldExecute((599187 & i13) != 599186, i13 & 1)) {
            Modifier modifier5 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340612993, i13, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:215)");
            }
            float f12 = pVar == null ? MinHeight : MinHeightWithIcon;
            Modifier m761heightInVpY3zN4$default = SizeKt.m761heightInVpY3zN4$default(modifier5, f12, 0.0f, 2, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m761heightInVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            float f13 = f12;
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
            Modifier modifier6 = modifier5;
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
            if (pVar != null) {
                startRestartGroup.startReplaceGroup(-1767030913);
                float f14 = IconLeftPadding;
                Modifier m777sizeInqDBjuR0$default = SizeKt.m777sizeInqDBjuR0$default(companion3, Dp.m5115constructorimpl(f14 + IconMinPaddedWidth), f13, 0.0f, 0.0f, 12, null);
                f11 = f13;
                float f15 = IconVerticalPadding;
                Modifier m730paddingqDBjuR0$default2 = PaddingKt.m730paddingqDBjuR0$default(m777sizeInqDBjuR0$default, f14, f15, 0.0f, f15, 4, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default2);
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
                modifier4 = m730paddingqDBjuR0$default;
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 3) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                modifier4 = m730paddingqDBjuR0$default;
                f11 = f13;
                startRestartGroup.startReplaceGroup(-1766478338);
                startRestartGroup.endReplaceGroup();
            }
            if (pVar4 != null) {
                startRestartGroup.startReplaceGroup(-1766430164);
                z11 = true;
                ListItemKt.BaselinesOffsetColumn(h0.Q(Dp.m5113boximpl(OverlineBaselineOffset), Dp.m5113boximpl(OverlineToPrimaryBaselineOffset)), modifier4, ComposableLambdaKt.rememberComposableLambda(-1675021441, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TwoLine$ListItem$1$2
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
                    public final void invoke(Composer composer2, int i15) {
                        if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1675021441, i15, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:243)");
                        }
                        pVar4.invoke(composer2, 0);
                        pVar2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 390, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                Modifier modifier7 = modifier4;
                z11 = true;
                startRestartGroup.startReplaceGroup(-1766139198);
                ListItemKt.BaselinesOffsetColumn(h0.Q(Dp.m5113boximpl(pVar != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon), Dp.m5113boximpl(pVar != null ? PrimaryToSecondaryBaselineOffsetWithIcon : PrimaryToSecondaryBaselineOffsetNoIcon)), modifier7, ComposableLambdaKt.rememberComposableLambda(993836488, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TwoLine$ListItem$1$3
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
                    public final void invoke(Composer composer2, int i15) {
                        if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(993836488, i15, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:262)");
                        }
                        pVar2.invoke(composer2, 0);
                        p<Composer, Integer, g2> pVar6 = pVar3;
                        g0.m(pVar6);
                        pVar6.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 384, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (pVar5 != null) {
                startRestartGroup.startReplaceGroup(-1765411690);
                ListItemKt.m1694OffsetToBaselineOrCenterKz89ssw(pVar != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon, null, ComposableLambdaKt.rememberComposableLambda(-1696992176, z11, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TwoLine$ListItem$1$4
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
                    public final void invoke(Composer composer2, int i15) {
                        float f16;
                        if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1696992176, i15, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:274)");
                        }
                        Modifier m761heightInVpY3zN4$default2 = SizeKt.m761heightInVpY3zN4$default(Modifier.Companion, f11, 0.0f, 2, null);
                        f16 = TwoLine.TrailingRightPadding;
                        Modifier m730paddingqDBjuR0$default3 = PaddingKt.m730paddingqDBjuR0$default(m761heightInVpY3zN4$default2, 0.0f, 0.0f, f16, 0.0f, 11, null);
                        Alignment center = Alignment.Companion.getCenter();
                        p<Composer, Integer, g2> pVar6 = pVar5;
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m730paddingqDBjuR0$default3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                        a<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer2);
                        Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (m1951constructorimpl3.getInserting() || !g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        pVar6.invoke(composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 384, 2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1764788962);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final TwoLine twoLine2 = twoLine;
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TwoLine$ListItem$2
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
                    TwoLine.this.ListItem(modifier3, pVar, pVar2, pVar3, pVar4, pVar5, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }
}
