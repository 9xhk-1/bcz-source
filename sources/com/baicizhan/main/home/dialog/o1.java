package com.baicizhan.main.home.dialog;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nsetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 setting.kt\ncom/baicizhan/main/home/dialog/SettingKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 14 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 15 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,244:1\n75#2:245\n70#3:246\n67#3,9:247\n77#3:288\n70#3:308\n68#3,8:309\n77#3:389\n70#3:421\n67#3,9:422\n70#3:461\n67#3,9:462\n77#3:501\n77#3:505\n79#4,6:256\n86#4,3:271\n89#4,2:280\n93#4:287\n79#4,6:317\n86#4,3:332\n89#4,2:341\n79#4,6:351\n86#4,3:366\n89#4,2:375\n93#4:384\n93#4:388\n79#4,6:431\n86#4,3:446\n89#4,2:455\n79#4,6:471\n86#4,3:486\n89#4,2:495\n93#4:500\n93#4:504\n79#4,6:536\n86#4,3:551\n89#4,2:560\n93#4:565\n79#4,6:578\n86#4,3:593\n89#4,2:602\n93#4:608\n347#5,9:262\n356#5:282\n357#5,2:285\n347#5,9:323\n356#5:343\n347#5,9:357\n356#5:377\n357#5,2:382\n357#5,2:386\n347#5,9:437\n356#5:457\n347#5,9:477\n356#5,3:497\n357#5,2:502\n347#5,9:542\n356#5,3:562\n347#5,9:584\n356#5:604\n357#5,2:606\n4206#6,6:274\n4206#6,6:335\n4206#6,6:369\n4206#6,6:449\n4206#6,6:489\n4206#6,6:554\n4206#6,6:596\n1#7:283\n113#8:284\n113#8:301\n113#8:344\n113#8:378\n113#8:379\n113#8:380\n113#8:381\n113#8:420\n113#8:458\n113#8:459\n113#8:460\n113#8:509\n113#8:513\n113#8:521\n113#8:605\n1247#9,6:289\n1247#9,6:295\n1247#9,6:302\n1247#9,6:390\n1247#9,6:396\n1247#9,6:402\n1247#9,6:408\n1247#9,6:414\n99#10,6:345\n106#10:385\n99#10:567\n95#10,10:568\n106#10:609\n61#11:506\n61#11:510\n61#11:518\n70#12:507\n70#12:511\n53#12,3:515\n70#12:519\n53#12,3:523\n22#13:508\n22#13:512\n22#13:520\n30#14:514\n30#14:522\n87#15:526\n84#15,9:527\n94#15:566\n*S KotlinDebug\n*F\n+ 1 setting.kt\ncom/baicizhan/main/home/dialog/SettingKt\n*L\n58#1:245\n59#1:246\n59#1:247,9\n59#1:288\n104#1:308\n104#1:309,8\n104#1:389\n225#1:421\n225#1:422,9\n226#1:461\n226#1:462,9\n226#1:501\n225#1:505\n59#1:256,6\n59#1:271,3\n59#1:280,2\n59#1:287\n104#1:317,6\n104#1:332,3\n104#1:341,2\n110#1:351,6\n110#1:366,3\n110#1:375,2\n110#1:384\n104#1:388\n225#1:431,6\n225#1:446,3\n225#1:455,2\n226#1:471,6\n226#1:486,3\n226#1:495,2\n226#1:500\n225#1:504\n168#1:536,6\n168#1:551,3\n168#1:560,2\n168#1:565\n212#1:578,6\n212#1:593,3\n212#1:602,2\n212#1:608\n59#1:262,9\n59#1:282\n59#1:285,2\n104#1:323,9\n104#1:343\n110#1:357,9\n110#1:377\n110#1:382,2\n104#1:386,2\n225#1:437,9\n225#1:457\n226#1:477,9\n226#1:497,3\n225#1:502,2\n168#1:542,9\n168#1:562,3\n212#1:584,9\n212#1:604\n212#1:606,2\n59#1:274,6\n104#1:335,6\n110#1:369,6\n225#1:449,6\n226#1:489,6\n168#1:554,6\n212#1:596,6\n65#1:284\n104#1:301\n110#1:344\n112#1:378\n114#1:379\n120#1:380\n122#1:381\n225#1:420\n227#1:458\n228#1:459\n229#1:460\n105#1:509\n106#1:513\n107#1:521\n215#1:605\n100#1:289,6\n101#1:295,6\n104#1:302,6\n161#1:390,6\n162#1:396,6\n167#1:402,6\n182#1:408,6\n203#1:414,6\n110#1:345,6\n110#1:385\n212#1:567\n212#1:568,10\n212#1:609\n105#1:506\n106#1:510\n107#1:518\n105#1:507\n106#1:511\n106#1:515,3\n107#1:519\n107#1:523,3\n105#1:508\n106#1:512\n107#1:520\n106#1:514\n107#1:522\n168#1:526\n168#1:527,9\n168#1:566\n*E\n"})
/* loaded from: classes4.dex */
public final class o1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(@m80.l androidx.compose.ui.Modifier r27, boolean r28, @m80.k final x00.q<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.o1.A(androidx.compose.ui.Modifier, boolean, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 B(Modifier modifier, boolean z11, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        A(modifier, z11, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void C(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1528292576);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1528292576, i11, -1, "com.baicizhan.main.home.dialog.FrameContainerPreview (setting.kt:239)");
            }
            bk.k.h(null, null, null, w.f20982a.i(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.c1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 D;
                    D = o1.D(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D;
                }
            });
        }
    }

    public static final g2 D(int i11, Composer composer, int i12) {
        C(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(java.lang.String r47, androidx.compose.ui.Modifier r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.o1.E(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 F(String str, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        E(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4283793902L, showBackground = true)
    public static final void G(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-2028978375);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2028978375, i11, -1, "com.baicizhan.main.home.dialog.PageTitlePreview (setting.kt:85)");
            }
            bk.k.h(null, null, null, w.f20982a.k(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.i1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 H;
                    H = o1.H(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            });
        }
    }

    public static final g2 H(int i11, Composer composer, int i12) {
        G(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(@m80.k final androidx.compose.runtime.MutableState<java.lang.Boolean> r17, @m80.k final java.lang.String r18, @androidx.annotation.DrawableRes int r19, @m80.l x00.a<yz.g2> r20, @m80.l x00.a<yz.g2> r21, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r22, @m80.l androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.o1.I(androidx.compose.runtime.MutableState, java.lang.String, int, x00.a, x00.a, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 J() {
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 K(String str, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(116326822, i11, -1, "com.baicizhan.main.home.dialog.TipContentPage.<anonymous> (setting.kt:211)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            E(str, null, composer, 0, 2);
            if (aVar != null) {
                composer.startReplaceGroup(733975777);
                ImageKt.Image(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_home_tip_question_mark, composer, 54), "mark", PaddingKt.m730paddingqDBjuR0$default(ComposeUtilsKt.k(companion, 0L, false, aVar, 3, null), Dp.m5115constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            } else {
                composer.startReplaceGroup(1271043320);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 L(MutableState mutableState, String str, int i11, x00.a aVar, x00.a aVar2, x00.q qVar, int i12, int i13, Composer composer, int i14) {
        I(mutableState, str, i11, aVar, aVar2, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0060  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M(@m80.k final androidx.compose.runtime.MutableState<java.lang.Boolean> r14, @m80.k final java.lang.String r15, @androidx.annotation.DrawableRes int r16, @m80.l x00.a<yz.g2> r17, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r18, @m80.l androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.o1.M(androidx.compose.runtime.MutableState, java.lang.String, int, x00.a, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 N() {
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 O(String str, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407196029, i11, -1, "com.baicizhan.main.home.dialog.TitleContentPage.<anonymous> (setting.kt:189)");
            }
            E(str, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 P(MutableState mutableState, String str, int i11, x00.a aVar, x00.q qVar, int i12, int i13, Composer composer, int i14) {
        M(mutableState, str, i11, aVar, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Q(final androidx.compose.foundation.layout.ColumnScope r27, androidx.compose.ui.Modifier r28, @androidx.annotation.DrawableRes int r29, @androidx.annotation.DrawableRes int r30, x00.a<yz.g2> r31, x00.a<yz.g2> r32, final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.o1.Q(androidx.compose.foundation.layout.ColumnScope, androidx.compose.ui.Modifier, int, int, x00.a, x00.a, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 R() {
        return g2.f100423a;
    }

    public static final g2 S() {
        return g2.f100423a;
    }

    public static final g2 T(DrawScope drawBehind) {
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        float f11 = 6;
        DrawScope.m3053drawRectAsUm42w$default(drawBehind, Brush.Companion.m2466verticalGradient8A3gB4$default(Brush.Companion, a00.h0.Q(Color.m2499boximpl(ColorKt.Color(4283661797L)), Color.m2499boximpl(ColorKt.Color(4282412252L))), 0.0f, 0.0f, 0, 14, (Object) null), 0L, Size.m2330copyxjbvk4A$default(drawBehind.mo3060getSizeNHjbRc(), 0.0f, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11))) + 1.0f, 1, null), 0.0f, null, null, 0, 122, null);
        long Color = ColorKt.Color(4294440953L);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
        DrawScope.m3054drawRectnJ9OG0$default(drawBehind, Color, Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), Size.m2330copyxjbvk4A$default(drawBehind.mo3060getSizeNHjbRc(), 0.0f, drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(4)) + 1.0f, 1, null), 0.0f, null, null, 0, 120, null);
        long Color2 = ColorKt.Color(4291414487L);
        float f12 = 2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
        DrawScope.m3054drawRectnJ9OG0$default(drawBehind, Color2, Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), Size.m2330copyxjbvk4A$default(drawBehind.mo3060getSizeNHjbRc(), 0.0f, drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12)), 1, null), 0.0f, null, null, 0, 120, null);
        return g2.f100423a;
    }

    public static final g2 U(ColumnScope columnScope, Modifier modifier, int i11, int i12, x00.a aVar, x00.a aVar2, x00.p pVar, int i13, int i14, Composer composer, int i15) {
        Q(columnScope, modifier, i11, i12, aVar, aVar2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 2566914048L, showBackground = true)
    public static final void V(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1163550389);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163550389, i11, -1, "com.baicizhan.main.home.dialog.TopBarContentPreview (setting.kt:130)");
            }
            bk.k.h(null, null, null, w.f20982a.p(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.j1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 W;
                    W = o1.W(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return W;
                }
            });
        }
    }

    public static final g2 W(int i11, Composer composer, int i12) {
        V(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(@m80.k final androidx.compose.runtime.MutableState<java.lang.Boolean> r17, @androidx.annotation.DrawableRes int r18, @androidx.annotation.DrawableRes int r19, @m80.l x00.a<yz.g2> r20, @m80.l x00.a<yz.g2> r21, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r22, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r23, @m80.l androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.dialog.o1.u(androidx.compose.runtime.MutableState, int, int, x00.a, x00.a, x00.p, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 v() {
        return g2.f100423a;
    }

    public static final g2 w(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
        return g2.f100423a;
    }

    public static final g2 x(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 y(int i11, int i12, x00.a aVar, x00.a aVar2, x00.p pVar, x00.q qVar, Composer composer, int i13) {
        if (composer.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(706411262, i13, -1, "com.baicizhan.main.home.dialog.ContentPage.<anonymous> (setting.kt:167)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Q(columnScopeInstance, null, i11, i12, aVar, aVar2, pVar, composer, 6, 1);
            qVar.invoke(columnScopeInstance, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 z(MutableState mutableState, int i11, int i12, x00.a aVar, x00.a aVar2, x00.p pVar, x00.q qVar, int i13, int i14, Composer composer, int i15) {
        u(mutableState, i11, i12, aVar, aVar2, pVar, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return g2.f100423a;
    }
}
