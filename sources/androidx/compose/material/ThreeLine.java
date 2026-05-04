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
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n99#2:446\n96#2,6:447\n102#2:481\n106#2:526\n79#3,6:453\n86#3,4:468\n90#3,2:478\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:520\n94#3:525\n368#4,9:459\n377#4:480\n368#4,9:495\n377#4:516\n378#4,2:518\n378#4,2:523\n4034#5,6:472\n4034#5,6:508\n51#6:482\n57#6:522\n71#7:483\n69#7,5:484\n74#7:517\n78#7:521\n149#8:527\n149#8:528\n149#8:529\n149#8:530\n149#8:531\n149#8:532\n149#8:533\n149#8:534\n149#8:535\n149#8:536\n149#8:537\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n*L\n317#1:446\n317#1:447,6\n317#1:481\n317#1:526\n317#1:453,6\n317#1:468,4\n317#1:478,2\n320#1:489,6\n320#1:504,4\n320#1:514,2\n320#1:520\n317#1:525\n317#1:459,9\n317#1:480\n320#1:495,9\n320#1:516\n320#1:518,2\n317#1:523,2\n317#1:472,6\n320#1:508,6\n319#1:482\n346#1:522\n320#1:483\n320#1:484,5\n320#1:517\n320#1:521\n290#1:527\n293#1:528\n294#1:529\n295#1:530\n298#1:531\n299#1:532\n300#1:533\n301#1:534\n302#1:535\n303#1:536\n306#1:537\n*E\n"})
/* loaded from: classes.dex */
final class ThreeLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconThreeLineVerticalPadding;
    private static final float ThreeLineBaselineSecondOffset;
    private static final float ThreeLineBaselineThirdOffset;
    private static final float ThreeLineTrailingTopPadding;
    private static final float TrailingRightPadding;

    @k
    public static final ThreeLine INSTANCE = new ThreeLine();
    private static final float MinHeight = Dp.m5115constructorimpl(88);
    private static final float IconMinPaddedWidth = Dp.m5115constructorimpl(40);
    private static final float ThreeLineBaselineFirstOffset = Dp.m5115constructorimpl(28);

    static {
        float f11 = 16;
        IconLeftPadding = Dp.m5115constructorimpl(f11);
        IconThreeLineVerticalPadding = Dp.m5115constructorimpl(f11);
        ContentLeftPadding = Dp.m5115constructorimpl(f11);
        ContentRightPadding = Dp.m5115constructorimpl(f11);
        float f12 = 20;
        ThreeLineBaselineSecondOffset = Dp.m5115constructorimpl(f12);
        ThreeLineBaselineThirdOffset = Dp.m5115constructorimpl(f12);
        ThreeLineTrailingTopPadding = Dp.m5115constructorimpl(f11);
        TrailingRightPadding = Dp.m5115constructorimpl(f11);
    }

    private ThreeLine() {
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void ListItem(@l Modifier modifier, @l final p<? super Composer, ? super Integer, g2> pVar, @k final p<? super Composer, ? super Integer, g2> pVar2, @k final p<? super Composer, ? super Integer, g2> pVar3, @l final p<? super Composer, ? super Integer, g2> pVar4, @l final p<? super Composer, ? super Integer, g2> pVar5, @l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        ThreeLine threeLine;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1749738797);
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
            threeLine = this;
        } else {
            threeLine = this;
            if ((i11 & 1572864) == 0) {
                i13 |= startRestartGroup.changed(threeLine) ? 1048576 : 524288;
            }
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((599187 & i15) != 599186, i15 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1749738797, i15, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:315)");
            }
            Modifier m761heightInVpY3zN4$default = SizeKt.m761heightInVpY3zN4$default(modifier3, MinHeight, 0.0f, 2, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m761heightInVpY3zN4$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar != null) {
                startRestartGroup.startReplaceGroup(1135491690);
                float f11 = IconLeftPadding;
                float m5115constructorimpl = Dp.m5115constructorimpl(f11 + IconMinPaddedWidth);
                Modifier m777sizeInqDBjuR0$default = SizeKt.m777sizeInqDBjuR0$default(Modifier.Companion, m5115constructorimpl, m5115constructorimpl, 0.0f, 0.0f, 12, null);
                float f12 = IconThreeLineVerticalPadding;
                Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(m777sizeInqDBjuR0$default, f11, f12, 0.0f, f12, 4, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
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
                pVar.invoke(startRestartGroup, Integer.valueOf((i15 >> 3) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1136020240);
                startRestartGroup.endReplaceGroup();
            }
            float f13 = ThreeLineBaselineFirstOffset;
            List Q = h0.Q(Dp.m5113boximpl(f13), Dp.m5113boximpl(ThreeLineBaselineSecondOffset), Dp.m5113boximpl(ThreeLineBaselineThirdOffset));
            Modifier.Companion companion3 = Modifier.Companion;
            ListItemKt.BaselinesOffsetColumn(Q, PaddingKt.m730paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.rememberComposableLambda(-318094245, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
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
                public final void invoke(Composer composer2, int i16) {
                    if (!composer2.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-318094245, i16, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:339)");
                    }
                    if (pVar4 != null) {
                        composer2.startReplaceGroup(-1959304577);
                        pVar4.invoke(composer2, 0);
                    } else {
                        composer2.startReplaceGroup(-608886287);
                    }
                    composer2.endReplaceGroup();
                    pVar2.invoke(composer2, 0);
                    pVar3.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 390, 0);
            startRestartGroup = startRestartGroup;
            if (pVar5 != null) {
                startRestartGroup.startReplaceGroup(1136529043);
                float f14 = ThreeLineTrailingTopPadding;
                ListItemKt.m1694OffsetToBaselineOrCenterKz89ssw(Dp.m5115constructorimpl(f13 - f14), PaddingKt.m730paddingqDBjuR0$default(companion3, 0.0f, f14, TrailingRightPadding, 0.0f, 9, null), pVar5, startRestartGroup, ((i15 >> 9) & 896) | 54, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1136802928);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final ThreeLine threeLine2 = threeLine;
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ThreeLine$ListItem$2
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

                public final void invoke(Composer composer2, int i16) {
                    ThreeLine.this.ListItem(modifier3, pVar, pVar2, pVar3, pVar4, pVar5, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }
}
