package com.baicizhan.main.home.player;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTraining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Training.kt\ncom/baicizhan/main/home/player/TrainingKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,268:1\n87#2:269\n84#2,9:270\n87#2:344\n84#2,9:345\n94#2:385\n94#2:396\n87#2:398\n85#2,8:399\n94#2:475\n87#2:521\n85#2,8:522\n94#2:670\n87#2:672\n83#2,10:673\n94#2:716\n87#2:915\n85#2,8:916\n94#2:1038\n79#3,6:279\n86#3,3:294\n89#3,2:303\n79#3,6:316\n86#3,3:331\n89#3,2:340\n79#3,6:354\n86#3,3:369\n89#3,2:378\n93#3:384\n93#3:388\n93#3:395\n79#3,6:407\n86#3,3:422\n89#3,2:431\n79#3,6:441\n86#3,3:456\n89#3,2:465\n93#3:470\n93#3:474\n79#3,6:488\n86#3,3:503\n89#3,2:512\n93#3:518\n79#3,6:530\n86#3,3:545\n89#3,2:554\n79#3,6:569\n86#3,3:584\n89#3,2:593\n93#3:610\n79#3,6:624\n86#3,3:639\n89#3,2:648\n93#3:665\n93#3:669\n79#3,6:683\n86#3,3:698\n89#3,2:707\n93#3:715\n79#3,6:734\n86#3,3:749\n89#3,2:758\n93#3:770\n79#3,6:782\n86#3,3:797\n89#3,2:806\n93#3:820\n79#3,6:832\n86#3,3:847\n89#3,2:856\n93#3:870\n79#3,6:883\n86#3,3:898\n89#3,2:907\n93#3:912\n79#3,6:924\n86#3,3:939\n89#3,2:948\n79#3,6:958\n86#3,3:973\n89#3,2:982\n79#3,6:997\n86#3,3:1012\n89#3,2:1021\n93#3:1028\n93#3:1032\n93#3:1037\n347#4,9:285\n356#4:305\n347#4,9:322\n356#4:342\n347#4,9:360\n356#4:380\n357#4,2:382\n357#4,2:386\n357#4,2:393\n347#4,9:413\n356#4:433\n347#4,9:447\n356#4,3:467\n357#4,2:472\n347#4,9:494\n356#4:514\n357#4,2:516\n347#4,9:536\n356#4:556\n347#4,9:575\n356#4:595\n357#4,2:608\n347#4,9:630\n356#4:650\n357#4,2:663\n357#4,2:667\n347#4,9:689\n356#4:709\n357#4,2:713\n347#4,9:740\n356#4:760\n357#4,2:768\n347#4,9:788\n356#4:808\n357#4,2:818\n347#4,9:838\n356#4:858\n357#4,2:868\n347#4,9:889\n356#4,3:909\n347#4,9:930\n356#4:950\n347#4,9:964\n356#4:984\n347#4,9:1003\n356#4:1023\n357#4,2:1026\n357#4,2:1030\n357#4,2:1035\n4206#5,6:297\n4206#5,6:334\n4206#5,6:372\n4206#5,6:425\n4206#5,6:459\n4206#5,6:506\n4206#5,6:548\n4206#5,6:587\n4206#5,6:642\n4206#5,6:701\n4206#5,6:752\n4206#5,6:800\n4206#5,6:850\n4206#5,6:901\n4206#5,6:942\n4206#5,6:976\n4206#5,6:1015\n99#6:306\n96#6,9:307\n106#6:389\n99#6,6:435\n106#6:471\n99#6:558\n95#6,10:559\n106#6:611\n99#6:613\n95#6,10:614\n106#6:666\n99#6:725\n97#6,8:726\n106#6:771\n99#6:773\n97#6,8:774\n106#6:821\n99#6:823\n97#6,8:824\n106#6:871\n99#6:873\n96#6,9:874\n106#6:913\n99#6,6:952\n99#6:986\n95#6,10:987\n106#6:1029\n106#6:1033\n113#7:343\n113#7:381\n113#7:390\n113#7:391\n113#7:392\n113#7:397\n113#7:434\n113#7:476\n113#7:477\n113#7:478\n113#7:515\n113#7:520\n113#7:557\n113#7:612\n113#7:671\n113#7:710\n113#7:711\n113#7:712\n113#7:724\n113#7:761\n113#7:772\n113#7:810\n113#7:822\n113#7:860\n113#7:872\n113#7:914\n113#7:951\n113#7:985\n113#7:1024\n113#7:1025\n113#7:1034\n70#8:479\n68#8,8:480\n77#8:519\n1247#9,6:596\n1247#9,6:602\n1247#9,6:651\n1247#9,6:657\n1247#9,3:717\n1250#9,3:721\n1247#9,6:762\n1247#9,6:811\n1247#9,6:861\n1#10:720\n1869#11:809\n1870#11:817\n1869#11:859\n1870#11:867\n*S KotlinDebug\n*F\n+ 1 Training.kt\ncom/baicizhan/main/home/player/TrainingKt\n*L\n90#1:269\n90#1:270,9\n94#1:344\n94#1:345,9\n94#1:385\n90#1:396\n202#1:398\n202#1:399,8\n202#1:475\n112#1:521\n112#1:522,8\n112#1:670\n133#1:672\n133#1:673,10\n133#1:716\n237#1:915\n237#1:916,8\n237#1:1038\n90#1:279,6\n90#1:294,3\n90#1:303,2\n93#1:316,6\n93#1:331,3\n93#1:340,2\n94#1:354,6\n94#1:369,3\n94#1:378,2\n94#1:384\n93#1:388\n90#1:395\n202#1:407,6\n202#1:422,3\n202#1:431,2\n203#1:441,6\n203#1:456,3\n203#1:465,2\n203#1:470\n202#1:474\n256#1:488,6\n256#1:503,3\n256#1:512,2\n256#1:518\n112#1:530,6\n112#1:545,3\n112#1:554,2\n113#1:569,6\n113#1:584,3\n113#1:593,2\n113#1:610\n121#1:624,6\n121#1:639,3\n121#1:648,2\n121#1:665\n112#1:669\n133#1:683,6\n133#1:698,3\n133#1:707,2\n133#1:715\n152#1:734,6\n152#1:749,3\n152#1:758,2\n152#1:770\n167#1:782,6\n167#1:797,3\n167#1:806,2\n167#1:820\n178#1:832,6\n178#1:847,3\n178#1:856,2\n178#1:870\n220#1:883,6\n220#1:898,3\n220#1:907,2\n220#1:912\n237#1:924,6\n237#1:939,3\n237#1:948,2\n238#1:958,6\n238#1:973,3\n238#1:982,2\n239#1:997,6\n239#1:1012,3\n239#1:1021,2\n239#1:1028\n238#1:1032\n237#1:1037\n90#1:285,9\n90#1:305\n93#1:322,9\n93#1:342\n94#1:360,9\n94#1:380\n94#1:382,2\n93#1:386,2\n90#1:393,2\n202#1:413,9\n202#1:433\n203#1:447,9\n203#1:467,3\n202#1:472,2\n256#1:494,9\n256#1:514\n256#1:516,2\n112#1:536,9\n112#1:556\n113#1:575,9\n113#1:595\n113#1:608,2\n121#1:630,9\n121#1:650\n121#1:663,2\n112#1:667,2\n133#1:689,9\n133#1:709\n133#1:713,2\n152#1:740,9\n152#1:760\n152#1:768,2\n167#1:788,9\n167#1:808\n167#1:818,2\n178#1:838,9\n178#1:858\n178#1:868,2\n220#1:889,9\n220#1:909,3\n237#1:930,9\n237#1:950\n238#1:964,9\n238#1:984\n239#1:1003,9\n239#1:1023\n239#1:1026,2\n238#1:1030,2\n237#1:1035,2\n90#1:297,6\n93#1:334,6\n94#1:372,6\n202#1:425,6\n203#1:459,6\n256#1:506,6\n112#1:548,6\n113#1:587,6\n121#1:642,6\n133#1:701,6\n152#1:752,6\n167#1:800,6\n178#1:850,6\n220#1:901,6\n237#1:942,6\n238#1:976,6\n239#1:1015,6\n93#1:306\n93#1:307,9\n93#1:389\n203#1:435,6\n203#1:471\n113#1:558\n113#1:559,10\n113#1:611\n121#1:613\n121#1:614,10\n121#1:666\n152#1:725\n152#1:726,8\n152#1:771\n167#1:773\n167#1:774,8\n167#1:821\n178#1:823\n178#1:824,8\n178#1:871\n220#1:873\n220#1:874,9\n220#1:913\n238#1:952,6\n239#1:986\n239#1:987,10\n239#1:1029\n238#1:1033\n94#1:343\n96#1:381\n102#1:390\n132#1:391\n189#1:392\n202#1:397\n203#1:434\n219#1:476\n236#1:477\n259#1:478\n264#1:515\n112#1:520\n113#1:557\n121#1:612\n133#1:671\n134#1:710\n166#1:711\n177#1:712\n152#1:724\n157#1:761\n167#1:772\n169#1:810\n178#1:822\n180#1:860\n220#1:872\n237#1:914\n238#1:951\n239#1:985\n241#1:1024\n242#1:1025\n247#1:1034\n256#1:479\n256#1:480,8\n256#1:519\n114#1:596,6\n117#1:602,6\n122#1:651,6\n125#1:657,6\n142#1:717,3\n142#1:721,3\n157#1:762,6\n169#1:811,6\n180#1:861,6\n168#1:809\n168#1:817\n179#1:859\n179#1:867\n*E\n"})
/* loaded from: classes4.dex */
public final class x9 {
    public static final yz.g2 A(x00.l lVar) {
        lVar.invoke(x1.a(x1.b("https://game.baicizhan.com/challenge7d/?webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%7D")));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 B(final List list, final x00.l lVar, final List list2, final List list3, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-490016468, i11, -1, "com.baicizhan.main.home.player.Training.<anonymous>.<anonymous> (Training.kt:132)");
            }
            float f11 = 12;
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11));
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
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
            J(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), "专项训练", d1.f23539a.h(), ComposableLambdaKt.rememberComposableLambda(-565862300, true, new x00.q() { // from class: com.baicizhan.main.home.player.g9
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 C;
                    C = x9.C(list, lVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return C;
                }
            }, composer, 54), composer, 3510, 0);
            J(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), "快速训练", null, ComposableLambdaKt.rememberComposableLambda(-95748901, true, new x00.q() { // from class: com.baicizhan.main.home.player.h9
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 E;
                    E = x9.E(list2, lVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return E;
                }
            }, composer, 54), composer, 3126, 4);
            J(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), "单词拓展", null, ComposableLambdaKt.rememberComposableLambda(-1552161956, true, new x00.q() { // from class: com.baicizhan.main.home.player.i9
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 G;
                    G = x9.G(list3, lVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return G;
                }
            }, composer, 54), composer, 3126, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L23;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 C(java.util.List r22, final x00.l r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.x9.C(java.util.List, x00.l, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):yz.g2");
    }

    public static final yz.g2 D(x00.l lVar, List list, int i11) {
        lVar.invoke(list.get(i11));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 E(List list, final x00.l lVar, Modifier it, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i12 = (composer.changed(it) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-95748901, i12, -1, "com.baicizhan.main.home.player.Training.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Training.kt:166)");
            }
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), Alignment.Companion.getTop(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, it);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-80387288);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final FastsTrainingType fastsTrainingType = (FastsTrainingType) it2.next();
                String title = fastsTrainingType.getTitle();
                float m5115constructorimpl = Dp.m5115constructorimpl(64);
                boolean changed = composer.changed(lVar) | composer.changed(fastsTrainingType.ordinal());
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.v9
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 F;
                            F = x9.F(x00.l.this, fastsTrainingType);
                            return F;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                t(rowScopeInstance, title, m5115constructorimpl, false, (x00.a) rememberedValue, composer, 390, 4);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(x00.l lVar, FastsTrainingType fastsTrainingType) {
        lVar.invoke(fastsTrainingType);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 G(List list, final x00.l lVar, Modifier it, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i12 = (composer.changed(it) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552161956, i12, -1, "com.baicizhan.main.home.player.Training.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Training.kt:177)");
            }
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), Alignment.Companion.getTop(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, it);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(466005385);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final ExtraTrainingType extraTrainingType = (ExtraTrainingType) it2.next();
                String title = extraTrainingType.getTitle();
                float m5115constructorimpl = Dp.m5115constructorimpl(64);
                boolean changed = composer.changed(lVar) | composer.changed(extraTrainingType.ordinal());
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.u9
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 H;
                            H = x9.H(x00.l.this, extraTrainingType);
                            return H;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                t(rowScopeInstance, title, m5115constructorimpl, false, (x00.a) rememberedValue, composer, 390, 4);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 H(x00.l lVar, ExtraTrainingType extraTrainingType) {
        lVar.invoke(extraTrainingType);
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(Modifier modifier, List list, List list2, List list3, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        v(modifier, list, list2, list3, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(@m80.l androidx.compose.ui.Modifier r18, @m80.k final java.lang.String r19, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r20, @m80.k final x00.q<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r21, @m80.l androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.x9.J(androidx.compose.ui.Modifier, java.lang.String, x00.p, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 K(x00.q qVar, x00.p pVar, String str, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1478352491, i11, -1, "com.baicizhan.main.home.player.TrainingClassicContainer.<anonymous> (Training.kt:236)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 12;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(f11), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, companion2.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f12 = 2;
            Modifier m728paddingVpY3zN4$default2 = PaddingKt.m728paddingVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(f12), 1, null);
            float f13 = 8;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f13)), companion2.getBottom(), composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default2);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f13)), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            BoxKt.Box(SizeKt.m775sizeVpY3zN4(BackgroundKt.m234backgroundbw27NRU(companion, ColorKt.Color(4280639473L), RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(0.0f, Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), 0.0f, 9, null)), Dp.m5115constructorimpl(4), Dp.m5115constructorimpl(16)), composer, 0);
            TextKt.m1845Text4IGK_g(str, (Modifier) null, ColorKt.Color(4279703321L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 0, 65530);
            composer.endNode();
            if (pVar == null) {
                composer.startReplaceGroup(1675141502);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(469678819);
                pVar.invoke(composer, 0);
                composer.endReplaceGroup();
                yz.g2 g2Var = yz.g2.f100423a;
            }
            composer.endNode();
            qVar.invoke(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 L(Modifier modifier, String str, x00.p pVar, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        J(modifier, str, pVar, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M(@m80.l androidx.compose.ui.Modifier r45, @m80.k final java.lang.String r46, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r47, @m80.k x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r48, @m80.l androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.x9.M(androidx.compose.ui.Modifier, java.lang.String, x00.p, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 N(Modifier modifier, String str, x00.p pVar, x00.p pVar2, int i11, int i12, Composer composer, int i13) {
        M(modifier, str, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void O(@m80.l Modifier modifier, @m80.k final String title, final int i11, @m80.k final x00.a<yz.g2> onClick, @m80.l Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(582991315);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            modifier2 = modifier;
        } else if ((i12 & 6) == 0) {
            modifier2 = modifier;
            i14 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i12;
        } else {
            modifier2 = modifier;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i14 & 1171) != 1170, i14 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582991315, i14, -1, "com.baicizhan.main.home.player.TrainingGameItem (Training.kt:217)");
            }
            modifier3 = modifier4;
            SurfaceKt.m1784SurfaceFjzlyU(modifier4.then(ComposeUtilsKt.k(Modifier.Companion, 0L, false, onClick, 3, null)), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(8)), 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(451606287, true, new x00.p() { // from class: com.baicizhan.main.home.player.e9
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 P;
                    P = x9.P(title, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return P;
                }
            }, startRestartGroup, 54), startRestartGroup, 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.o9
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = x9.Q(Modifier.this, title, i11, onClick, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P(String str, int i11, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(451606287, i12, -1, "com.baicizhan.main.home.player.TrainingGameItem.<anonymous> (Training.kt:219)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(12), 0.0f, Dp.m5115constructorimpl(8), 0.0f, 10, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m730paddingqDBjuR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280887853L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 0, 65530);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer, 0), "icon", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q(Modifier modifier, String str, int i11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        O(modifier, str, i11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007b  */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final androidx.compose.foundation.layout.RowScope r65, final java.lang.String r66, final float r67, boolean r68, final x00.a<yz.g2> r69, androidx.compose.runtime.Composer r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.x9.t(androidx.compose.foundation.layout.RowScope, java.lang.String, float, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 u(RowScope rowScope, String str, float f11, boolean z11, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        t(rowScope, str, f11, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0054  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(@m80.l androidx.compose.ui.Modifier r71, @m80.l java.util.List<? extends com.baicizhan.main.home.player.TrainingType> r72, @m80.l java.util.List<? extends com.baicizhan.main.home.player.FastsTrainingType> r73, @m80.l java.util.List<? extends com.baicizhan.main.home.player.ExtraTrainingType> r74, @m80.k final x00.l<? super com.baicizhan.main.home.player.d9, yz.g2> r75, @m80.l androidx.compose.runtime.Composer r76, final int r77, final int r78) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.x9.v(androidx.compose.ui.Modifier, java.util.List, java.util.List, java.util.List, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 w(final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261385397, i11, -1, "com.baicizhan.main.home.player.Training.<anonymous>.<anonymous> (Training.kt:111)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(12), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            float f11 = 8;
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, companion2.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
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
            boolean changed = composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.q9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 x11;
                        x11 = x9.x(x00.l.this);
                        return x11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            O(weight$default, "抢词", R.drawable.ic_home_training_games_grabbing_words, (x00.a) rememberedValue, composer, 432, 0);
            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            boolean changed2 = composer.changed(lVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.r9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 y11;
                        y11 = x9.y(x00.l.this);
                        return y11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            O(weight$default2, "单词对战", R.drawable.ic_home_training_games_pk, (x00.a) rememberedValue2, composer, 432, 0);
            composer.endNode();
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            Modifier weight$default3 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            boolean changed3 = composer.changed(lVar);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.player.s9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 z11;
                        z11 = x9.z(x00.l.this);
                        return z11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            O(weight$default3, "消消练", R.drawable.ic_home_training_games_lining_down, (x00.a) rememberedValue3, composer, 432, 0);
            Modifier weight$default4 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            boolean changed4 = composer.changed(lVar);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.player.t9
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A;
                        A = x9.A(x00.l.this);
                        return A;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            O(weight$default4, "一站到底", R.drawable.ic_home_training_games_who_to_end, (x00.a) rememberedValue4, composer, 432, 0);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 x(x00.l lVar) {
        lVar.invoke(x1.a(x1.b("https://reading.baicizhan.com/h5/fe-incentive-system/index/snatch-word/landing?webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%2C%22autoSafeArea%22%3Afalse%7D")));
        return yz.g2.f100423a;
    }

    public static final yz.g2 y(x00.l lVar) {
        lVar.invoke(x1.a(x1.b("https://pk.baicizhan.com/pages/challenge/index.html?trace=training_ground")));
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(x00.l lVar) {
        lVar.invoke(x1.a(x1.b("https://reading.baicizhan.com/h5/fe-incentive-system/index/word-elimination-practice/?webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%7D")));
        return yz.g2.f100423a;
    }
}
