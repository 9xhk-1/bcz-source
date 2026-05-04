package com.baicizhan.main.word_book.list;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil.request.ImageRequest;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.baicizhan.main.word_book.list.d1;
import com.jiongji.andriod.card.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCopperExchangeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopperExchangeDialog.kt\ncom/baicizhan/main/word_book/list/CopperExchangeDialogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,318:1\n113#2:319\n113#2:358\n113#2:359\n113#2:397\n113#2:398\n113#2:399\n113#2:444\n113#2:445\n113#2:446\n113#2:480\n113#2:527\n113#2:564\n113#2:603\n113#2:654\n113#2:691\n113#2:730\n113#2:743\n113#2:744\n113#2:782\n113#2:829\n87#3:320\n83#3,10:321\n87#3:400\n85#3,8:401\n94#3:439\n94#3:488\n87#3:489\n83#3,10:490\n87#3:565\n83#3,10:566\n94#3:607\n94#3:615\n87#3:616\n83#3,10:617\n87#3:692\n83#3,10:693\n94#3:734\n94#3:742\n79#4,6:331\n86#4,3:346\n89#4,2:355\n79#4,6:369\n86#4,3:384\n89#4,2:393\n79#4,6:409\n86#4,3:424\n89#4,2:433\n93#4:438\n93#4:442\n79#4,6:453\n86#4,3:468\n89#4,2:477\n93#4:483\n93#4:487\n79#4,6:500\n86#4,3:515\n89#4,2:524\n79#4,6:537\n86#4,3:552\n89#4,2:561\n79#4,6:576\n86#4,3:591\n89#4,2:600\n93#4:606\n93#4:610\n93#4:614\n79#4,6:627\n86#4,3:642\n89#4,2:651\n79#4,6:664\n86#4,3:679\n89#4,2:688\n79#4,6:703\n86#4,3:718\n89#4,2:727\n93#4:733\n93#4:737\n93#4:741\n79#4,6:751\n86#4,3:766\n89#4,2:775\n93#4:780\n79#4,6:792\n86#4,3:807\n89#4,2:816\n93#4:821\n347#5,9:337\n356#5:357\n347#5,9:375\n356#5:395\n347#5,9:415\n356#5,3:435\n357#5,2:440\n347#5,9:459\n356#5:479\n357#5,2:481\n357#5,2:485\n347#5,9:506\n356#5:526\n347#5,9:543\n356#5:563\n347#5,9:582\n356#5:602\n357#5,2:604\n357#5,2:608\n357#5,2:612\n347#5,9:633\n356#5:653\n347#5,9:670\n356#5:690\n347#5,9:709\n356#5:729\n357#5,2:731\n357#5,2:735\n357#5,2:739\n347#5,9:757\n356#5,3:777\n347#5,9:798\n356#5,3:818\n4206#6,6:349\n4206#6,6:387\n4206#6,6:427\n4206#6,6:471\n4206#6,6:518\n4206#6,6:555\n4206#6,6:594\n4206#6,6:645\n4206#6,6:682\n4206#6,6:721\n4206#6,6:769\n4206#6,6:810\n99#7:360\n97#7,8:361\n106#7:443\n99#7,6:447\n106#7:484\n99#7,6:745\n106#7:781\n75#8:396\n70#9:528\n68#9,8:529\n77#9:611\n70#9:655\n68#9,8:656\n77#9:738\n70#9:783\n68#9,8:784\n77#9:822\n1247#10,6:823\n*S KotlinDebug\n*F\n+ 1 CopperExchangeDialog.kt\ncom/baicizhan/main/word_book/list/CopperExchangeDialogKt\n*L\n67#1:319\n94#1:358\n95#1:359\n104#1:397\n112#1:398\n117#1:399\n149#1:444\n154#1:445\n156#1:446\n161#1:480\n197#1:527\n202#1:564\n207#1:603\n240#1:654\n245#1:691\n250#1:730\n286#1:743\n287#1:744\n304#1:782\n44#1:829\n92#1:320\n92#1:321,10\n115#1:400\n115#1:401,8\n115#1:439\n92#1:488\n193#1:489\n193#1:490,10\n200#1:565\n200#1:566,10\n200#1:607\n193#1:615\n236#1:616\n236#1:617,10\n243#1:692\n243#1:693,10\n243#1:734\n236#1:742\n92#1:331,6\n92#1:346,3\n92#1:355,2\n93#1:369,6\n93#1:384,3\n93#1:393,2\n115#1:409,6\n115#1:424,3\n115#1:433,2\n115#1:438\n93#1:442\n151#1:453,6\n151#1:468,3\n151#1:477,2\n151#1:483\n92#1:487\n193#1:500,6\n193#1:515,3\n193#1:524,2\n194#1:537,6\n194#1:552,3\n194#1:561,2\n200#1:576,6\n200#1:591,3\n200#1:600,2\n200#1:606\n194#1:610\n193#1:614\n236#1:627,6\n236#1:642,3\n236#1:651,2\n237#1:664,6\n237#1:679,3\n237#1:688,2\n243#1:703,6\n243#1:718,3\n243#1:727,2\n243#1:733\n237#1:737\n236#1:741\n282#1:751,6\n282#1:766,3\n282#1:775,2\n282#1:780\n302#1:792,6\n302#1:807,3\n302#1:816,2\n302#1:821\n92#1:337,9\n92#1:357\n93#1:375,9\n93#1:395\n115#1:415,9\n115#1:435,3\n93#1:440,2\n151#1:459,9\n151#1:479\n151#1:481,2\n92#1:485,2\n193#1:506,9\n193#1:526\n194#1:543,9\n194#1:563\n200#1:582,9\n200#1:602\n200#1:604,2\n194#1:608,2\n193#1:612,2\n236#1:633,9\n236#1:653\n237#1:670,9\n237#1:690\n243#1:709,9\n243#1:729\n243#1:731,2\n237#1:735,2\n236#1:739,2\n282#1:757,9\n282#1:777,3\n302#1:798,9\n302#1:818,3\n92#1:349,6\n93#1:387,6\n115#1:427,6\n151#1:471,6\n193#1:518,6\n194#1:555,6\n200#1:594,6\n236#1:645,6\n237#1:682,6\n243#1:721,6\n282#1:769,6\n302#1:810,6\n93#1:360\n93#1:361,8\n93#1:443\n151#1:447,6\n151#1:484\n282#1:745,6\n282#1:781\n99#1:396\n194#1:528\n194#1:529,8\n194#1:611\n237#1:655\n237#1:656,8\n237#1:738\n302#1:783\n302#1:784,8\n302#1:822\n80#1:823,6\n*E\n"})
/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final RoundedCornerShape f27030a = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(6));

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A(x00.a aVar, RowScope BottomButtons, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(BottomButtons, "$this$BottomButtons");
        if ((i11 & 6) == 0) {
            i12 = (composer.changed(BottomButtons) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221157980, i12, -1, "com.baicizhan.main.word_book.list.SuccessContent.<anonymous>.<anonymous> (CopperExchangeDialog.kt:218)");
            }
            x("完成", bk.b.z(), bk.b.J(), RowScope.weight$default(BottomButtons, Modifier.Companion, 1.0f, false, 2, null), false, aVar, composer, 438, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 B(x00.a aVar, int i11, Composer composer, int i12) {
        z(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void l(final x00.q<? super RowScope, ? super Composer, ? super Integer, yz.g2> qVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1873592211);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1873592211, i12, -1, "com.baicizhan.main.word_book.list.BottomButtons (CopperExchangeDialog.kt:280)");
            }
            float f11 = 16;
            float f12 = 12;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null)), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
            int i13 = ((i12 << 9) & 7168) | 432;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f12)), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m729paddingqDBjuR0);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            qVar.invoke(RowScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i13 >> 6) & 112) | 6));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.y0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 m11;
                    m11 = c1.m(x00.q.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return m11;
                }
            });
        }
    }

    public static final yz.g2 m(x00.q qVar, int i11, Composer composer, int i12) {
        l(qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void n(ij.a aVar, x00.a<yz.g2> aVar2, final x00.a<yz.g2> aVar3, Composer composer, final int i11) {
        int i12;
        final ij.a aVar4;
        final x00.a<yz.g2> aVar5;
        Arrangement arrangement;
        float f11;
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        Composer startRestartGroup = composer.startRestartGroup(-2032045076);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar3) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032045076, i12, -1, "com.baicizhan.main.word_book.list.ConfirmContent (CopperExchangeDialog.kt:90)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f12 = 16;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(f12));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.m607spacedBy0680j_4(Dp.m5115constructorimpl(f12)), companion2.getTop(), startRestartGroup, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (aVar != null) {
                startRestartGroup.startReplaceGroup(4337926);
                arrangement = arrangement2;
                i13 = 6;
                i14 = 16;
                f11 = f12;
                coil.compose.l.b(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(aVar.n()).i(true).f(), null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(56)), PainterResources_androidKt.painterResource(R.drawable.ic_copper_coin_favorite_book_exchange, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.ic_copper_coin_favorite_book_exchange, startRestartGroup, 6), null, null, null, null, null, null, 0.0f, null, 0, false, null, startRestartGroup, 432, 0, 65504);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
            } else {
                arrangement = arrangement2;
                f11 = f12;
                i13 = 6;
                i14 = 16;
                startRestartGroup.startReplaceGroup(4884239);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_copper_coin_favorite_book_exchange, startRestartGroup, 6), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                startRestartGroup.endReplaceGroup();
            }
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), companion2.getStart(), startRestartGroup, i13);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            String str4 = HttpRequest.f17578o;
            if (aVar == null || (str = aVar.p()) == null) {
                str = HttpRequest.f17578o;
            }
            long sp2 = TextUnitKt.getSp(i14);
            FontWeight.Companion companion4 = FontWeight.Companion;
            Composer composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, bk.b.x(), sp2, (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200064, 3072, 122834);
            if (aVar == null || (str2 = aVar.m()) == null) {
                str2 = HttpRequest.f17578o;
            }
            TextKt.m1845Text4IGK_g(str2, (Modifier) null, bk.b.D(), TextUnitKt.getSp(12), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200064, 0, 131026);
            if (aVar != null) {
                str4 = aVar.j() + " 铜板";
            }
            TextKt.m1845Text4IGK_g(str4, (Modifier) null, bk.b.p0(), TextUnitKt.getSp(14), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200064, 0, 131026);
            Composer composer3 = composer2;
            String k11 = aVar != null ? aVar.k() : null;
            if (k11 == null || k11.length() == 0) {
                composer3.startReplaceGroup(2100357286);
            } else {
                composer3.startReplaceGroup(2105562620);
                kotlin.jvm.internal.g0.m(aVar);
                TextKt.m1845Text4IGK_g(aVar.k(), (Modifier) null, bk.b.D(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer3, 3456, 6, 130034);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            composer3.endNode();
            Composer composer4 = composer3;
            DividerKt.m1643DivideroMI9zvI(null, bk.b.J(), Dp.m5115constructorimpl(1), 0.0f, composer4, 432, 9);
            float f13 = 12;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f13));
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f13)), companion2.getCenterVertically(), composer4, 54);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, m727paddingVpY3zN4);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor4);
            } else {
                composer4.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer4);
            Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_copper_coin_favorite_book_exchange, composer4, 6), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
            if (aVar != null) {
                str3 = "铜板余额：" + aVar.l();
            } else {
                str3 = "铜板余额：--";
            }
            TextKt.m1845Text4IGK_g(str3, (Modifier) null, bk.b.B(), TextUnitKt.getSp(i14), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer4, 200064, 0, 131026);
            startRestartGroup = composer4;
            startRestartGroup.endNode();
            aVar4 = aVar;
            aVar5 = aVar2;
            l(ComposableLambdaKt.rememberComposableLambda(811215507, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.t0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 o11;
                    o11 = c1.o(x00.a.this, aVar4, aVar3, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return o11;
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar4 = aVar;
            aVar5 = aVar2;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.u0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 p11;
                    p11 = c1.p(ij.a.this, aVar5, aVar3, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return p11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o(x00.a aVar, ij.a aVar2, x00.a aVar3, RowScope BottomButtons, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(BottomButtons, "$this$BottomButtons");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(BottomButtons) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(811215507, i12, -1, "com.baicizhan.main.word_book.list.ConfirmContent.<anonymous>.<anonymous> (CopperExchangeDialog.kt:171)");
            }
            long e02 = bk.b.e0();
            long f02 = bk.b.f0();
            Modifier.Companion companion = Modifier.Companion;
            x("取消", e02, f02, RowScope.weight$default(BottomButtons, companion, 1.0f, false, 2, null), false, aVar, composer, 438, 16);
            x("确认兑换", Color.Companion.m2546getWhite0d7_KjU(), bk.b.e0(), RowScope.weight$default(BottomButtons, companion, 1.0f, false, 2, null), aVar2 != null, aVar3, composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 p(ij.a aVar, x00.a aVar2, x00.a aVar3, int i11, Composer composer, int i12) {
        n(aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@m80.k final d1 state, @m80.k final x00.a<yz.g2> onCancel, @m80.k final x00.a<yz.g2> onConfirm, @m80.k final x00.a<yz.g2> onDone, @m80.k final x00.l<? super String, yz.g2> onGetCopper, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(state, "state");
        kotlin.jvm.internal.g0.p(onCancel, "onCancel");
        kotlin.jvm.internal.g0.p(onConfirm, "onConfirm");
        kotlin.jvm.internal.g0.p(onDone, "onDone");
        kotlin.jvm.internal.g0.p(onGetCopper, "onGetCopper");
        Composer startRestartGroup = composer.startRestartGroup(1893445556);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onCancel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(onConfirm) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(onDone) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(onGetCopper) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1893445556, i12, -1, "com.baicizhan.main.word_book.list.CopperExchangeSheetContent (CopperExchangeDialog.kt:65)");
            }
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(8)), startRestartGroup, 6);
            AnimatedContentKt.AnimatedContent(state, null, null, null, "exchange_state", null, ComposableLambdaKt.rememberComposableLambda(-1650437965, true, new x00.r() { // from class: com.baicizhan.main.word_book.list.w0
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 r11;
                    r11 = c1.r(x00.a.this, onConfirm, onDone, onGetCopper, (AnimatedContentScope) obj, (d1) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return r11;
                }
            }, startRestartGroup, 54), startRestartGroup, (i12 & 14) | 1597440, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.x0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = c1.t(d1.this, onCancel, onConfirm, onDone, onGetCopper, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r(x00.a aVar, x00.a aVar2, x00.a aVar3, final x00.l lVar, AnimatedContentScope AnimatedContent, final d1 currentState, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedContent, "$this$AnimatedContent");
        kotlin.jvm.internal.g0.p(currentState, "currentState");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650437965, i11, -1, "com.baicizhan.main.word_book.list.CopperExchangeSheetContent.<anonymous> (CopperExchangeDialog.kt:68)");
        }
        if (currentState instanceof d1.a) {
            composer.startReplaceGroup(-1227948979);
            n(((d1.a) currentState).d(), aVar, aVar2, composer, 0);
            composer.endReplaceGroup();
        } else if (currentState instanceof d1.c) {
            composer.startReplaceGroup(-1227942638);
            z(aVar3, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(currentState instanceof d1.b)) {
                composer.startReplaceGroup(-1227950768);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1227939990);
            String f11 = ((d1.b) currentState).f();
            boolean changed = composer.changed(lVar) | ((((i11 & 112) ^ 48) > 32 && composer.changedInstance(currentState)) || (i11 & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.v0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 s11;
                        s11 = c1.s(x00.l.this, currentState);
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            u(f11, aVar, (x00.a) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(x00.l lVar, d1 d1Var) {
        lVar.invoke(((d1.b) d1Var).e());
        return yz.g2.f100423a;
    }

    public static final yz.g2 t(d1 d1Var, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.l lVar, int i11, Composer composer, int i12) {
        q(d1Var, aVar, aVar2, aVar3, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void u(final String str, x00.a<yz.g2> aVar, x00.a<yz.g2> aVar2, Composer composer, final int i11) {
        int i12;
        final x00.a<yz.g2> aVar3;
        final x00.a<yz.g2> aVar4;
        Composer startRestartGroup = composer.startRestartGroup(-1638039531);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1638039531, i12, -1, "com.baicizhan.main.word_book.list.FailureContent (CopperExchangeDialog.kt:234)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(200));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m759height3ABfNKs);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), companion2.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_error_and_undone, startRestartGroup, 6), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(80)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            TextKt.m1845Text4IGK_g(str, (Modifier) null, Color.Companion.m2535getBlack0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, (i12 & 14) | 200064, 0, 131026);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            aVar4 = aVar;
            aVar3 = aVar2;
            l(ComposableLambdaKt.rememberComposableLambda(-741067570, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.z0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 v11;
                    v11 = c1.v(x00.a.this, aVar3, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return v11;
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar3 = aVar2;
            aVar4 = aVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.a1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 w11;
                    w11 = c1.w(str, aVar4, aVar3, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 v(x00.a aVar, x00.a aVar2, RowScope BottomButtons, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(BottomButtons, "$this$BottomButtons");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(BottomButtons) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741067570, i12, -1, "com.baicizhan.main.word_book.list.FailureContent.<anonymous>.<anonymous> (CopperExchangeDialog.kt:261)");
            }
            long z11 = bk.b.z();
            long J = bk.b.J();
            Modifier.Companion companion = Modifier.Companion;
            x("知道了", z11, J, RowScope.weight$default(BottomButtons, companion, 1.0f, false, 2, null), false, aVar, composer, 438, 16);
            x("获取铜板", Color.Companion.m2546getWhite0d7_KjU(), bk.b.z(), RowScope.weight$default(BottomButtons, companion, 1.0f, false, 2, null), false, aVar2, composer, 438, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(String str, x00.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        u(str, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0065  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final java.lang.String r35, final long r36, final long r38, androidx.compose.ui.Modifier r40, boolean r41, final x00.a<yz.g2> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.c1.x(java.lang.String, long, long, androidx.compose.ui.Modifier, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 y(String str, long j11, long j12, Modifier modifier, boolean z11, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        x(str, j11, j12, modifier, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void z(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-386210251);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changedInstance(aVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-386210251, i12, -1, "com.baicizhan.main.word_book.list.SuccessContent (CopperExchangeDialog.kt:191)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(200));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m759height3ABfNKs);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), companion2.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_check_and_done, startRestartGroup, 6), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(80)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            TextKt.m1845Text4IGK_g("兑换成功", (Modifier) null, Color.Companion.m2535getBlack0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 200070, 0, 131026);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            l(ComposableLambdaKt.rememberComposableLambda(1221157980, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.b1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 A;
                    A = c1.A(x00.a.this, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return A;
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.s0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = c1.B(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            });
        }
    }
}
