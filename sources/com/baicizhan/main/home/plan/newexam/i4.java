package com.baicizhan.main.home.plan.newexam;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.extractor.WavUtil;
import com.baicizhan.main.home.plan.newexam.c;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLearnCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCard.kt\ncom/baicizhan/main/home/plan/newexam/LearnCardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,446:1\n1247#2,6:447\n1247#2,6:453\n1247#2,6:459\n1247#2,6:466\n1247#2,6:472\n113#3:465\n113#3:478\n113#3:479\n113#3:517\n113#3:593\n113#3:640\n113#3:678\n113#3:721\n113#3:796\n113#3:801\n113#3:839\n113#3:890\n113#3:978\n113#3:979\n113#3:1022\n113#3:1023\n113#3:1108\n99#4:480\n96#4,9:481\n106#4:521\n99#4,6:522\n106#4:601\n99#4,6:641\n106#4:677\n99#4:722\n96#4,9:723\n106#4:847\n79#5,6:490\n86#5,3:505\n89#5,2:514\n93#5:520\n79#5,6:528\n86#5,3:543\n89#5,2:552\n79#5,6:566\n86#5,3:581\n89#5,2:590\n93#5:596\n93#5:600\n79#5,6:613\n86#5,3:628\n89#5,2:637\n79#5,6:647\n86#5,3:662\n89#5,2:671\n93#5:676\n93#5:681\n79#5,6:694\n86#5,3:709\n89#5,2:718\n79#5,6:732\n86#5,3:747\n89#5,2:756\n79#5,6:769\n86#5,3:784\n89#5,2:793\n93#5:799\n79#5,6:812\n86#5,3:827\n89#5,2:836\n93#5:842\n93#5:846\n93#5:850\n79#5,6:863\n86#5,3:878\n89#5,2:887\n93#5:893\n79#5,6:906\n86#5,3:921\n89#5,2:930\n93#5:935\n79#5,6:949\n86#5,3:964\n89#5,2:973\n93#5:982\n79#5,6:995\n86#5,3:1010\n89#5,2:1019\n93#5:1026\n79#5,6:1039\n86#5,3:1054\n89#5,2:1063\n93#5:1068\n79#5,6:1081\n86#5,3:1096\n89#5,2:1105\n93#5:1111\n347#6,9:496\n356#6:516\n357#6,2:518\n347#6,9:534\n356#6:554\n347#6,9:572\n356#6:592\n357#6,2:594\n357#6,2:598\n347#6,9:619\n356#6:639\n347#6,9:653\n356#6,3:673\n357#6,2:679\n347#6,9:700\n356#6:720\n347#6,9:738\n356#6:758\n347#6,9:775\n356#6:795\n357#6,2:797\n347#6,9:818\n356#6:838\n357#6,2:840\n357#6,2:844\n357#6,2:848\n347#6,9:869\n356#6:889\n357#6,2:891\n347#6,9:912\n356#6,3:932\n347#6,9:955\n356#6:975\n357#6,2:980\n347#6,9:1001\n356#6:1021\n357#6,2:1024\n347#6,9:1045\n356#6,3:1065\n347#6,9:1087\n356#6:1107\n357#6,2:1109\n4206#7,6:508\n4206#7,6:546\n4206#7,6:584\n4206#7,6:631\n4206#7,6:665\n4206#7,6:712\n4206#7,6:750\n4206#7,6:787\n4206#7,6:830\n4206#7,6:881\n4206#7,6:924\n4206#7,6:967\n4206#7,6:1013\n4206#7,6:1057\n4206#7,6:1099\n87#8:555\n83#8,10:556\n94#8:597\n87#8:602\n83#8,10:603\n94#8:682\n87#8:683\n83#8,10:684\n87#8:759\n84#8,9:760\n94#8:800\n87#8:802\n84#8,9:803\n94#8:843\n94#8:851\n87#8:852\n83#8,10:853\n94#8:894\n87#8:895\n83#8,10:896\n94#8:936\n87#8:938\n83#8,10:939\n94#8:983\n87#8:984\n83#8,10:985\n94#8:1027\n87#8:1028\n83#8,10:1029\n94#8:1069\n87#8:1070\n83#8,10:1071\n94#8:1112\n1#9:937\n32#10:976\n80#11:977\n*S KotlinDebug\n*F\n+ 1 LearnCard.kt\ncom/baicizhan/main/home/plan/newexam/LearnCardKt\n*L\n104#1:447,6\n107#1:453,6\n110#1:459,6\n149#1:466,6\n152#1:472,6\n113#1:465\n155#1:478\n208#1:479\n214#1:517\n239#1:593\n263#1:640\n279#1:678\n301#1:721\n310#1:796\n318#1:801\n324#1:839\n87#1:890\n124#1:978\n126#1:979\n158#1:1022\n160#1:1023\n194#1:1108\n208#1:480\n208#1:481,9\n208#1:521\n225#1:522,6\n225#1:601\n264#1:641,6\n264#1:677\n302#1:722\n302#1:723,9\n302#1:847\n208#1:490,6\n208#1:505,3\n208#1:514,2\n208#1:520\n225#1:528,6\n225#1:543,3\n225#1:552,2\n230#1:566,6\n230#1:581,3\n230#1:590,2\n230#1:596\n225#1:600\n261#1:613,6\n261#1:628,3\n261#1:637,2\n264#1:647,6\n264#1:662,3\n264#1:671,2\n264#1:676\n261#1:681\n299#1:694,6\n299#1:709,3\n299#1:718,2\n302#1:732,6\n302#1:747,3\n302#1:756,2\n305#1:769,6\n305#1:784,3\n305#1:793,2\n305#1:799\n319#1:812,6\n319#1:827,3\n319#1:836,2\n319#1:842\n302#1:846\n299#1:850\n74#1:863,6\n74#1:878,3\n74#1:887,2\n74#1:893\n76#1:906,6\n76#1:921,3\n76#1:930,2\n76#1:935\n114#1:949,6\n114#1:964,3\n114#1:973,2\n114#1:982\n156#1:995,6\n156#1:1010,3\n156#1:1019,2\n156#1:1026\n185#1:1039,6\n185#1:1054,3\n185#1:1063,2\n185#1:1068\n187#1:1081,6\n187#1:1096,3\n187#1:1105,2\n187#1:1111\n208#1:496,9\n208#1:516\n208#1:518,2\n225#1:534,9\n225#1:554\n230#1:572,9\n230#1:592\n230#1:594,2\n225#1:598,2\n261#1:619,9\n261#1:639\n264#1:653,9\n264#1:673,3\n261#1:679,2\n299#1:700,9\n299#1:720\n302#1:738,9\n302#1:758\n305#1:775,9\n305#1:795\n305#1:797,2\n319#1:818,9\n319#1:838\n319#1:840,2\n302#1:844,2\n299#1:848,2\n74#1:869,9\n74#1:889\n74#1:891,2\n76#1:912,9\n76#1:932,3\n114#1:955,9\n114#1:975\n114#1:980,2\n156#1:1001,9\n156#1:1021\n156#1:1024,2\n185#1:1045,9\n185#1:1065,3\n187#1:1087,9\n187#1:1107\n187#1:1109,2\n208#1:508,6\n225#1:546,6\n230#1:584,6\n261#1:631,6\n264#1:665,6\n299#1:712,6\n302#1:750,6\n305#1:787,6\n319#1:830,6\n74#1:881,6\n76#1:924,6\n114#1:967,6\n156#1:1013,6\n185#1:1057,6\n187#1:1099,6\n230#1:555\n230#1:556,10\n230#1:597\n261#1:602\n261#1:603,10\n261#1:682\n299#1:683\n299#1:684,10\n305#1:759\n305#1:760,9\n305#1:800\n319#1:802\n319#1:803,9\n319#1:843\n299#1:851\n74#1:852\n74#1:853,10\n74#1:894\n76#1:895\n76#1:896,10\n76#1:936\n114#1:938\n114#1:939,10\n114#1:983\n156#1:984\n156#1:985,10\n156#1:1027\n185#1:1028\n185#1:1029,10\n185#1:1069\n187#1:1070\n187#1:1071,10\n187#1:1112\n117#1:976\n117#1:977\n*E\n"})
/* loaded from: classes4.dex */
public final class i4 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A(x00.a aVar, final c.a aVar2, final x00.a aVar3, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1667157765, i11, -1, "com.baicizhan.main.home.plan.newexam.BookAllKillNextUi.<anonymous> (LearnCard.kt:73)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3.T(null, ComposableLambdaKt.rememberComposableLambda(-2038543741, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.h4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = i4.B(c.a.this, aVar3, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            }, composer, 54), composer, 48, 1);
            float f11 = 16;
            i3.e0(SizeKt.fillMaxWidth$default(PaddingKt.m729paddingqDBjuR0(companion, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(9), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11)), 0.0f, 1, null), aVar, StringResources_androidKt.stringResource(R.string.word_plan_buttons_start_new_plan, composer, 6), LearnButtonType.Primary, composer, 3072);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 B(c.a aVar, x00.a aVar2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2038543741, i11, -1, "com.baicizhan.main.home.plan.newexam.BookAllKillNextUi.<anonymous>.<anonymous>.<anonymous> (LearnCard.kt:75)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3.V(aVar.f(), aVar.e(), StringResources_androidKt.stringResource(R.string.word_plan_card_done_summary_all_killed, composer, 6), aVar2, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 C(c.a aVar, x00.a aVar2, x00.a aVar3, int i11, Composer composer, int i12) {
        z(aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D(@m80.k final c.b bookDone, @m80.k final x00.a<yz.g2> goPlan, @m80.k final x00.a<yz.g2> goDaka, @m80.k final x00.a<yz.g2> goShowOff, @m80.k final x00.a<yz.g2> goWordList, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(bookDone, "bookDone");
        kotlin.jvm.internal.g0.p(goPlan, "goPlan");
        kotlin.jvm.internal.g0.p(goDaka, "goDaka");
        kotlin.jvm.internal.g0.p(goShowOff, "goShowOff");
        kotlin.jvm.internal.g0.p(goWordList, "goWordList");
        Composer startRestartGroup = composer.startRestartGroup(-1559643463);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(bookDone) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goPlan) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goDaka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(goShowOff) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(goWordList) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1559643463, i12, -1, "com.baicizhan.main.home.plan.newexam.BookAllKillTodayUi (LearnCard.kt:56)");
            }
            int i13 = i12 << 9;
            J(bookDone.f(), bookDone.e(), StringResources_androidKt.stringResource(R.string.word_plan_card_done_summary_all_killed, startRestartGroup, 6), null, goPlan, goDaka, goShowOff, goWordList, startRestartGroup, (57344 & i13) | 3072 | (458752 & i13) | (3670016 & i13) | (i13 & 29360128));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.j3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = i4.E(c.b.this, goPlan, goDaka, goShowOff, goWordList, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            });
        }
    }

    public static final yz.g2 E(c.b bVar, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, Composer composer, int i12) {
        D(bVar, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void F(@m80.k final c.C0313c bookDone, @m80.k final x00.a<yz.g2> goPlan, @m80.k final x00.a<yz.g2> goDaka, @m80.k final x00.a<yz.g2> goShowOff, @m80.k final x00.a<yz.g2> goWordList, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(bookDone, "bookDone");
        kotlin.jvm.internal.g0.p(goPlan, "goPlan");
        kotlin.jvm.internal.g0.p(goDaka, "goDaka");
        kotlin.jvm.internal.g0.p(goShowOff, "goShowOff");
        kotlin.jvm.internal.g0.p(goWordList, "goWordList");
        Composer startRestartGroup = composer.startRestartGroup(710107842);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(bookDone) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goPlan) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goDaka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(goShowOff) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(goWordList) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710107842, i12, -1, "com.baicizhan.main.home.plan.newexam.BookDoneUi (LearnCard.kt:26)");
            }
            J(bookDone.g(), bookDone.f(), StringResources_androidKt.stringResource(R.string.word_plan_card_done_summary_all_learnt, new Object[]{Integer.valueOf(bookDone.h())}, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.word_plan_card_done_tip_into_review, startRestartGroup, 6), goPlan, goDaka, goShowOff, goWordList, startRestartGroup, (i12 << 9) & 33546240);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.o3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 G;
                    G = i4.G(c.C0313c.this, goPlan, goDaka, goShowOff, goWordList, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final yz.g2 G(c.C0313c c0313c, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, Composer composer, int i12) {
        F(c0313c, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void H(@m80.k final c.f bookDone, @m80.k final x00.a<yz.g2> goPlan, @m80.k final x00.a<yz.g2> goDaka, @m80.k final x00.a<yz.g2> goShowOff, @m80.k final x00.a<yz.g2> goWordList, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(bookDone, "bookDone");
        kotlin.jvm.internal.g0.p(goPlan, "goPlan");
        kotlin.jvm.internal.g0.p(goDaka, "goDaka");
        kotlin.jvm.internal.g0.p(goShowOff, "goShowOff");
        kotlin.jvm.internal.g0.p(goWordList, "goWordList");
        Composer startRestartGroup = composer.startRestartGroup(1640966850);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(bookDone) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goPlan) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goDaka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(goShowOff) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(goWordList) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1640966850, i12, -1, "com.baicizhan.main.home.plan.newexam.BookReviewDoneUi (LearnCard.kt:41)");
            }
            J(bookDone.g(), bookDone.f(), StringResources_androidKt.stringResource(R.string.word_plan_card_done_summary_review_round, new Object[]{Integer.valueOf(bookDone.h())}, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.word_plan_card_done_tip_review_more, startRestartGroup, 6), goPlan, goDaka, goShowOff, goWordList, startRestartGroup, (i12 << 9) & 33546240);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.f4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 I;
                    I = i4.I(c.f.this, goPlan, goDaka, goShowOff, goWordList, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return I;
                }
            });
        }
    }

    public static final yz.g2 I(c.f fVar, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, Composer composer, int i12) {
        H(fVar, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void J(final String str, final String str2, final String str3, final String str4, final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2, final x00.a<yz.g2> aVar3, final x00.a<yz.g2> aVar4, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1942548348);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar4) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i12) != 4793490, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1942548348, i12, -1, "com.baicizhan.main.home.plan.newexam.CommonFinishCard (LearnCard.kt:182)");
            }
            i3.g0(null, ComposableLambdaKt.rememberComposableLambda(90275668, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.y3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 K;
                    K = i4.K(x00.a.this, aVar3, str, str2, str3, aVar4, aVar, str4, (Composer) obj, ((Integer) obj2).intValue());
                    return K;
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.z3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 M;
                    M = i4.M(str, str2, str3, str4, aVar, aVar2, aVar3, aVar4, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return M;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 K(x00.a aVar, x00.a aVar2, final String str, final String str2, final String str3, final x00.a aVar3, final x00.a aVar4, final String str4, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90275668, i11, -1, "com.baicizhan.main.home.plan.newexam.CommonFinishCard.<anonymous> (LearnCard.kt:184)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3.T(null, ComposableLambdaKt.rememberComposableLambda(1830150934, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.l3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 L;
                    L = i4.L(str, str2, str3, aVar3, aVar4, str4, (Composer) obj, ((Integer) obj2).intValue());
                    return L;
                }
            }, composer, 54), composer, 48, 1);
            N(aVar, aVar2, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 L(String str, String str2, String str3, x00.a aVar, x00.a aVar2, String str4, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830150934, i11, -1, "com.baicizhan.main.home.plan.newexam.CommonFinishCard.<anonymous>.<anonymous>.<anonymous> (LearnCard.kt:186)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3.V(str, str2, str3, aVar, composer, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), composer, 6);
            i3.R(aVar2, StringResources_androidKt.stringResource(R.string.word_plan_buttons_start_new_plan, composer, 6), str4, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 M(String str, String str2, String str3, String str4, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, Composer composer, int i12) {
        J(str, str2, str3, str4, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void N(x00.a<yz.g2> aVar, x00.a<yz.g2> aVar2, Composer composer, final int i11) {
        int i12;
        final x00.a<yz.g2> aVar3;
        final x00.a<yz.g2> aVar4;
        Composer startRestartGroup = composer.startRestartGroup(915512804);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915512804, i13, -1, "com.baicizhan.main.home.plan.newexam.DakaAndShowOff (LearnCard.kt:206)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 16;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(companion, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(9), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m729paddingqDBjuR0);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            String stringResource = StringResources_androidKt.stringResource(R.string.word_plan_buttons_punch_card, startRestartGroup, 6);
            LearnButtonType learnButtonType = LearnButtonType.Secondary;
            i3.e0(weight$default, aVar, stringResource, learnButtonType, startRestartGroup, ((i13 << 3) & 112) | 3072);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
            aVar4 = aVar2;
            aVar3 = aVar;
            i3.e0(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), aVar4, StringResources_androidKt.stringResource(R.string.word_plan_buttons_show_off, startRestartGroup, 6), learnButtonType, startRestartGroup, (i13 & 112) | 3072);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.k3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = i4.O(x00.a.this, aVar4, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    public static final yz.g2 O(x00.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        N(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void P(final boolean z11, final boolean z12, final String str, final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2, final List<y4> list, final List<b> list2, final x00.a<yz.g2> aVar3, final x00.a<yz.g2> aVar4, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-302927893);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(list2) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar4) ? 67108864 : 33554432;
        }
        if (startRestartGroup.shouldExecute((38347923 & i12) != 38347922, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-302927893, i12, -1, "com.baicizhan.main.home.plan.newexam.LearningPlanCardArea (LearnCard.kt:297)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            int i13 = i12;
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
            Y(z11, z12, str, aVar, aVar2, startRestartGroup, i13 & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            startRestartGroup = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(28)), startRestartGroup, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 48);
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
            i3.k0(list.get(0).h(), list.get(0).f(), list.get(0).g(), startRestartGroup, 0);
            float f11 = 32;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            i3.e0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), aVar3, list2.get(0).i(), list2.get(0).j(), startRestartGroup, ((i13 >> 18) & 112) | 6);
            startRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 48);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            i3.k0(list.get(1).h(), list.get(1).f(), list.get(1).g(), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            i3.e0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), aVar4, list2.get(1).i(), list2.get(1).j(), startRestartGroup, ((i13 >> 21) & 112) | 6);
            startRestartGroup.endNode();
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.x3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = i4.Q(z11, z12, str, aVar, aVar2, list, list2, aVar3, aVar4, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    public static final yz.g2 Q(boolean z11, boolean z12, String str, x00.a aVar, x00.a aVar2, List list, List list2, x00.a aVar3, x00.a aVar4, int i11, Composer composer, int i12) {
        P(z11, z12, str, aVar, aVar2, list, list2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void R(@m80.k final c.d learning, @m80.k final x00.a<yz.g2> goPlan, @m80.k final x00.a<yz.g2> goDaka, @m80.k final x00.a<yz.g2> goWordList, @m80.k final x00.a<yz.g2> upgrade, @m80.k final x00.l<? super th.a, yz.g2> adClick, @m80.k final x00.l<? super b, yz.g2> studyClick, @m80.k final x00.l<? super b, yz.g2> reviewClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(learning, "learning");
        kotlin.jvm.internal.g0.p(goPlan, "goPlan");
        kotlin.jvm.internal.g0.p(goDaka, "goDaka");
        kotlin.jvm.internal.g0.p(goWordList, "goWordList");
        kotlin.jvm.internal.g0.p(upgrade, "upgrade");
        kotlin.jvm.internal.g0.p(adClick, "adClick");
        kotlin.jvm.internal.g0.p(studyClick, "studyClick");
        kotlin.jvm.internal.g0.p(reviewClick, "reviewClick");
        Composer startRestartGroup = composer.startRestartGroup(1283349321);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(learning) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goPlan) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goDaka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(goWordList) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(upgrade) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(adClick) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(studyClick) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(reviewClick) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i12) != 4793490, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1283349321, i12, -1, "com.baicizhan.main.home.plan.newexam.LearningUi (LearnCard.kt:102)");
            }
            boolean changed = startRestartGroup.changed(learning.j()) | ((458752 & i12) == 131072);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.a4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 S;
                        S = i4.S(c.d.this, adClick);
                        return S;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final x00.a aVar = (x00.a) rememberedValue;
            boolean changed2 = startRestartGroup.changed(learning.l()) | ((3670016 & i12) == 1048576);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.b4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 T;
                        T = i4.T(x00.l.this, learning);
                        return T;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final x00.a aVar2 = (x00.a) rememberedValue2;
            boolean changed3 = startRestartGroup.changed(learning.l()) | ((i12 & 29360128) == 8388608);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.c4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U;
                        U = i4.U(x00.l.this, learning);
                        return U;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final x00.a aVar3 = (x00.a) rememberedValue3;
            float f11 = 16;
            i3.g0(PaddingKt.m722PaddingValuesa9UjIt4(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11)), ComposableLambdaKt.rememberComposableLambda(1870525041, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.d4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 V;
                    V = i4.V(c.d.this, goDaka, aVar, aVar2, aVar3, goWordList, goPlan, upgrade, (Composer) obj, ((Integer) obj2).intValue());
                    return V;
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.e4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 X;
                    X = i4.X(c.d.this, goPlan, goDaka, goWordList, upgrade, adClick, studyClick, reviewClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return X;
                }
            });
        }
    }

    public static final yz.g2 S(c.d dVar, x00.l lVar) {
        th.a j11 = dVar.j();
        if (j11 != null) {
            lVar.invoke(j11);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x00.l lVar, c.d dVar) {
        lVar.invoke(dVar.l().get(0));
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(x00.l lVar, c.d dVar) {
        lVar.invoke(dVar.l().get(1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 V(final c.d dVar, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, final x00.a aVar5, final x00.a aVar6, final x00.a aVar7, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1870525041, i11, -1, "com.baicizhan.main.home.plan.newexam.LearningUi.<anonymous> (LearnCard.kt:113)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            j.i(companion, dVar.o(), IntOffset.m5237constructorimpl((70 << 32) | (90 & 4294967295L)), ComposableLambdaKt.rememberComposableLambda(2138548842, true, new x00.q() { // from class: com.baicizhan.main.home.plan.newexam.t3
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 W;
                    W = i4.W(c.d.this, aVar5, aVar6, aVar7, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return W;
                }
            }, composer, 54), c2.f22622a.T(), composer, 28038, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(16)), composer, 6);
            DividerKt.m1643DivideroMI9zvI(null, bk.b.J(), 0.0f, 0.0f, composer, 48, 13);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), composer, 6);
            boolean n11 = dVar.n();
            boolean m11 = dVar.m();
            th.a j11 = dVar.j();
            P(n11, m11, j11 != null ? j11.m() : null, aVar, aVar2, dVar.p(), dVar.l(), aVar3, aVar4, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 W(c.d dVar, x00.a aVar, x00.a aVar2, x00.a aVar3, Modifier it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2138548842, i11, -1, "com.baicizhan.main.home.plan.newexam.LearningUi.<anonymous>.<anonymous>.<anonymous> (LearnCard.kt:119)");
            }
            i3.y(null, dVar.k(), aVar, aVar2, aVar3, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 X(c.d dVar, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Composer composer, int i12) {
        R(dVar, aVar, aVar2, aVar3, aVar4, lVar, lVar2, lVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Y(final boolean z11, final boolean z12, final String str, final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1798039127);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1798039127, i12, -1, "com.baicizhan.main.home.plan.newexam.PlanTitleArea (LearnCard.kt:223)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getTop(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z12) {
                startRestartGroup.startReplaceGroup(1436589009);
                i3.q0(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1436646421);
                i3.s0(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (z11) {
                startRestartGroup.startReplaceGroup(1436722991);
                SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
                i3.Z(aVar, startRestartGroup, (i12 >> 9) & 14);
            } else {
                startRestartGroup.startReplaceGroup(1427914341);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (str != null) {
                startRestartGroup.startReplaceGroup(1638183087);
                i3.o0(str, aVar2, startRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 9) & 112));
            } else {
                startRestartGroup.startReplaceGroup(1629220367);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.u3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Z;
                    Z = i4.Z(z11, z12, str, aVar, aVar2, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Z;
                }
            });
        }
    }

    public static final yz.g2 Z(boolean z11, boolean z12, String str, x00.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        Y(z11, z12, str, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a0(final boolean z11, final boolean z12, final String str, final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2, final y4 y4Var, final b bVar, final Integer num, final x00.a<yz.g2> aVar3, Composer composer, final int i11) {
        int i12;
        x00.a<yz.g2> aVar4;
        x00.a<yz.g2> aVar5;
        y4 y4Var2;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1299972651);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            aVar4 = aVar;
            i12 |= startRestartGroup.changedInstance(aVar4) ? 2048 : 1024;
        } else {
            aVar4 = aVar;
        }
        if ((i11 & 24576) == 0) {
            aVar5 = aVar2;
            i12 |= startRestartGroup.changedInstance(aVar5) ? 16384 : 8192;
        } else {
            aVar5 = aVar2;
        }
        if ((196608 & i11) == 0) {
            y4Var2 = y4Var;
            i12 |= startRestartGroup.changed(y4Var2) ? 131072 : 65536;
        } else {
            y4Var2 = y4Var;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changed(bVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changed(num) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar3) ? 67108864 : 33554432;
        }
        int i14 = i12;
        if (startRestartGroup.shouldExecute((38347923 & i14) != 38347922, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299972651, i14, -1, "com.baicizhan.main.home.plan.newexam.ReviewPlanCardArea (LearnCard.kt:259)");
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
            Y(z11, z12, str, aVar4, aVar5, startRestartGroup, 65534 & i14);
            startRestartGroup = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(28)), startRestartGroup, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getBottom(), startRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            i3.k0(y4Var2.h(), y4Var2.f(), y4Var2.g(), startRestartGroup, 0);
            if (num != null) {
                startRestartGroup.startReplaceGroup(-542100206);
                i13 = i14;
                TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_card_label_review_remain, new Object[]{num}, startRestartGroup, 6), (Modifier) null, bk.b.D(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4978getEnde0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 3456, 0, 130546);
            } else {
                i13 = i14;
                startRestartGroup.startReplaceGroup(-551951417);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            i3.e0(SizeKt.fillMaxWidth$default(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(32), 0.0f, 0.0f, 13, null), 0.0f, 1, null), aVar3, bVar.i(), bVar.j(), startRestartGroup, ((i13 >> 21) & 112) | 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.g4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b02;
                    b02 = i4.b0(z11, z12, str, aVar, aVar2, y4Var, bVar, num, aVar3, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return b02;
                }
            });
        }
    }

    public static final yz.g2 b0(boolean z11, boolean z12, String str, x00.a aVar, x00.a aVar2, y4 y4Var, b bVar, Integer num, x00.a aVar3, int i11, Composer composer, int i12) {
        a0(z11, z12, str, aVar, aVar2, y4Var, bVar, num, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c0(@m80.k final c.g reviewState, @m80.k final x00.a<yz.g2> goPlan, @m80.k final x00.a<yz.g2> goDaka, @m80.k final x00.a<yz.g2> goWordList, @m80.k final x00.a<yz.g2> upgrade, @m80.k final x00.l<? super th.a, yz.g2> adClick, @m80.k final x00.l<? super b, yz.g2> reviewClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(reviewState, "reviewState");
        kotlin.jvm.internal.g0.p(goPlan, "goPlan");
        kotlin.jvm.internal.g0.p(goDaka, "goDaka");
        kotlin.jvm.internal.g0.p(goWordList, "goWordList");
        kotlin.jvm.internal.g0.p(upgrade, "upgrade");
        kotlin.jvm.internal.g0.p(adClick, "adClick");
        kotlin.jvm.internal.g0.p(reviewClick, "reviewClick");
        Composer startRestartGroup = composer.startRestartGroup(-1363837592);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(reviewState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goPlan) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goDaka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(goWordList) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(upgrade) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(adClick) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(reviewClick) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((599187 & i12) != 599186, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1363837592, i12, -1, "com.baicizhan.main.home.plan.newexam.ReviewingUi (LearnCard.kt:147)");
            }
            boolean changed = startRestartGroup.changed(reviewState.j()) | ((458752 & i12) == 131072);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.p3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 d02;
                        d02 = i4.d0(c.g.this, adClick);
                        return d02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final x00.a aVar = (x00.a) rememberedValue;
            boolean changed2 = startRestartGroup.changed(reviewState.l()) | ((i12 & 3670016) == 1048576);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.q3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e02;
                        e02 = i4.e0(x00.l.this, reviewState);
                        return e02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final x00.a aVar2 = (x00.a) rememberedValue2;
            float f11 = 16;
            i3.g0(PaddingKt.m722PaddingValuesa9UjIt4(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11)), ComposableLambdaKt.rememberComposableLambda(481475728, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.r3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f02;
                    f02 = i4.f0(c.g.this, goWordList, goPlan, upgrade, goDaka, aVar, aVar2, (Composer) obj, ((Integer) obj2).intValue());
                    return f02;
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.s3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 g02;
                    g02 = i4.g0(c.g.this, goPlan, goDaka, goWordList, upgrade, adClick, reviewClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return g02;
                }
            });
        }
    }

    public static final yz.g2 d0(c.g gVar, x00.l lVar) {
        th.a j11 = gVar.j();
        if (j11 != null) {
            lVar.invoke(j11);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(x00.l lVar, c.g gVar) {
        lVar.invoke(gVar.l());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f0(c.g gVar, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, x00.a aVar5, x00.a aVar6, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(481475728, i11, -1, "com.baicizhan.main.home.plan.newexam.ReviewingUi.<anonymous> (LearnCard.kt:155)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3.y(null, gVar.k(), aVar, aVar2, aVar3, composer, 0, 1);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(16)), composer, 6);
            DividerKt.m1643DivideroMI9zvI(null, bk.b.J(), 0.0f, 0.0f, composer, 48, 13);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), composer, 6);
            boolean o11 = gVar.o();
            boolean m11 = gVar.m();
            Integer n11 = gVar.n();
            th.a j11 = gVar.j();
            a0(o11, m11, j11 != null ? j11.m() : null, aVar4, aVar5, gVar.p(), gVar.l(), n11, aVar6, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 g0(c.g gVar, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, x00.l lVar, x00.l lVar2, int i11, Composer composer, int i12) {
        c0(gVar, aVar, aVar2, aVar3, aVar4, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 2000)
    public static final void h0(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1342423178);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1342423178, i11, -1, "com.baicizhan.main.home.plan.newexam.previewCard (LearnCard.kt:337)");
            }
            bk.k.e(null, null, null, c2.f22622a.R(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.n3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 i02;
                    i02 = i4.i0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return i02;
                }
            });
        }
    }

    public static final yz.g2 i0(int i11, Composer composer, int i12) {
        h0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 2000)
    public static final void j0(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1103466028);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1103466028, i11, -1, "com.baicizhan.main.home.plan.newexam.previewCard2 (LearnCard.kt:361)");
            }
            bk.k.e(null, null, null, c2.f22622a.S(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.m3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 k02;
                    k02 = i4.k0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return k02;
                }
            });
        }
    }

    public static final yz.g2 k0(int i11, Composer composer, int i12) {
        j0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void z(@m80.k final c.a bookDone, @m80.k final x00.a<yz.g2> goPlan, @m80.k final x00.a<yz.g2> goWordList, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(bookDone, "bookDone");
        kotlin.jvm.internal.g0.p(goPlan, "goPlan");
        kotlin.jvm.internal.g0.p(goWordList, "goWordList");
        Composer startRestartGroup = composer.startRestartGroup(-1076170787);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(bookDone) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goPlan) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goWordList) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076170787, i12, -1, "com.baicizhan.main.home.plan.newexam.BookAllKillNextUi (LearnCard.kt:71)");
            }
            i3.g0(null, ComposableLambdaKt.rememberComposableLambda(1667157765, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.v3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 A;
                    A = i4.A(x00.a.this, bookDone, goWordList, (Composer) obj, ((Integer) obj2).intValue());
                    return A;
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.w3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 C;
                    C = i4.C(c.a.this, goPlan, goWordList, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }
}
