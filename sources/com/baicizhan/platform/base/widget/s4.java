package com.baicizhan.platform.base.widget;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.platform.base.widget.v4;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\ncom/baicizhan/platform/base/widget/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 14 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,438:1\n1247#2,6:439\n1247#2,6:445\n1247#2,6:451\n1247#2,6:457\n1247#2,6:463\n1247#2,6:469\n1247#2,6:476\n1247#2,6:482\n1247#2,6:488\n1247#2,3:531\n1250#2,3:535\n1247#2,6:580\n1247#2,6:586\n1247#2,6:631\n1247#2,3:654\n1250#2,3:658\n1247#2,6:778\n1247#2,6:784\n1247#2,6:791\n1247#2,6:797\n1#3:475\n99#4:494\n96#4,9:495\n106#4:644\n99#4:663\n95#4,10:664\n99#4:739\n95#4,10:740\n106#4:806\n99#4:819\n96#4,9:820\n106#4:860\n106#4:868\n79#5,6:504\n86#5,3:519\n89#5,2:528\n79#5,6:549\n86#5,3:564\n89#5,2:573\n93#5:578\n79#5,6:602\n86#5,3:617\n89#5,2:626\n93#5:639\n93#5:643\n79#5,6:674\n86#5,3:689\n89#5,2:698\n79#5,6:712\n86#5,3:727\n89#5,2:736\n79#5,6:750\n86#5,3:765\n89#5,2:774\n93#5:805\n79#5,6:829\n86#5,3:844\n89#5,2:853\n93#5:859\n93#5:863\n93#5:867\n79#5,6:891\n86#5,3:906\n89#5,2:915\n79#5,6:928\n86#5,3:943\n89#5,2:952\n93#5:957\n93#5:961\n347#6,9:510\n356#6:530\n347#6,9:555\n356#6,3:575\n347#6,9:608\n356#6:628\n357#6,2:637\n357#6,2:641\n347#6,9:680\n356#6:700\n347#6,9:718\n356#6:738\n347#6,9:756\n356#6:776\n357#6,2:803\n347#6,9:835\n356#6:855\n357#6,2:857\n357#6,2:861\n357#6,2:865\n347#6,9:897\n356#6:917\n347#6,9:934\n356#6,3:954\n357#6,2:959\n4206#7,6:522\n4206#7,6:567\n4206#7,6:620\n4206#7,6:692\n4206#7,6:730\n4206#7,6:768\n4206#7,6:847\n4206#7,6:909\n4206#7,6:946\n113#8:534\n113#8:538\n113#8:629\n123#8:647\n113#8:649\n113#8:657\n113#8:661\n113#8:662\n113#8:777\n113#8:790\n113#8:817\n113#8:856\n123#8:871\n123#8:876\n113#8:963\n113#8:964\n70#9:539\n67#9,9:540\n77#9:579\n70#9:592\n67#9,9:593\n77#9:640\n70#9:701\n66#9,10:702\n77#9:864\n70#9:880\n66#9,10:881\n77#9:962\n68#10:630\n52#10:648\n49#10:650\n52#10,9:807\n49#10:816\n49#10:818\n68#10:872\n49#10:873\n68#10:877\n49#10:878\n54#11:645\n54#11:869\n54#11:874\n85#12:646\n85#12:870\n85#12:875\n85#13:651\n113#13,2:652\n85#13:879\n87#14:918\n84#14,9:919\n94#14:958\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\ncom/baicizhan/platform/base/widget/ScaffoldKt\n*L\n48#1:439,6\n139#1:445,6\n165#1:451,6\n168#1:457,6\n188#1:463,6\n194#1:469,6\n199#1:476,6\n202#1:482,6\n309#1:488,6\n75#1:531,3\n75#1:535,3\n101#1:580,6\n103#1:586,6\n112#1:631,6\n212#1:654,3\n212#1:658,3\n224#1:778,6\n241#1:784,6\n250#1:791,6\n268#1:797,6\n59#1:494\n59#1:495,9\n59#1:644\n215#1:663\n215#1:664,10\n218#1:739\n218#1:740,10\n218#1:806\n277#1:819\n277#1:820,9\n277#1:860\n215#1:868\n59#1:504,6\n59#1:519,3\n59#1:528,2\n85#1:549,6\n85#1:564,3\n85#1:573,2\n85#1:578\n99#1:602,6\n99#1:617,3\n99#1:626,2\n99#1:639\n59#1:643\n215#1:674,6\n215#1:689,3\n215#1:698,2\n217#1:712,6\n217#1:727,3\n217#1:736,2\n218#1:750,6\n218#1:765,3\n218#1:774,2\n218#1:805\n277#1:829,6\n277#1:844,3\n277#1:853,2\n277#1:859\n217#1:863\n215#1:867\n357#1:891,6\n357#1:906,3\n357#1:915,2\n358#1:928,6\n358#1:943,3\n358#1:952,2\n358#1:957\n357#1:961\n59#1:510,9\n59#1:530\n85#1:555,9\n85#1:575,3\n99#1:608,9\n99#1:628\n99#1:637,2\n59#1:641,2\n215#1:680,9\n215#1:700\n217#1:718,9\n217#1:738\n218#1:756,9\n218#1:776\n218#1:803,2\n277#1:835,9\n277#1:855\n277#1:857,2\n217#1:861,2\n215#1:865,2\n357#1:897,9\n357#1:917\n358#1:934,9\n358#1:954,3\n357#1:959,2\n59#1:522,6\n85#1:567,6\n99#1:620,6\n215#1:692,6\n217#1:730,6\n218#1:768,6\n277#1:847,6\n357#1:909,6\n358#1:946,6\n76#1:534\n87#1:538\n111#1:629\n113#1:647\n113#1:649\n212#1:657\n213#1:661\n214#1:662\n223#1:777\n249#1:790\n276#1:817\n288#1:856\n242#1:871\n269#1:876\n32#1:963\n33#1:964\n85#1:539\n85#1:540,9\n85#1:579\n99#1:592\n99#1:593,9\n99#1:640\n217#1:701\n217#1:702,10\n217#1:864\n357#1:880\n357#1:881,10\n357#1:962\n112#1:630\n113#1:648\n113#1:650\n274#1:807,9\n274#1:816\n280#1:818\n242#1:872\n242#1:873\n269#1:877\n269#1:878\n113#1:645\n242#1:869\n269#1:874\n113#1:646\n242#1:870\n269#1:875\n202#1:651\n202#1:652,2\n275#1:879\n358#1:918\n358#1:919,9\n358#1:958\n*E\n"})
/* loaded from: classes6.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final PaddingValues f28518a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f28519b = Dp.m5115constructorimpl(44);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.ScaffoldKt$SwitchedTopBar$6$1", f = "Scaffold.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28520a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f28521b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f28521b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28520a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f28520a = 1;
                if (c40.a1.b(500L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            s4.X(this.f28521b, true);
            return yz.g2.f100423a;
        }
    }

    static {
        float f11 = 8;
        f28518a = PaddingKt.m723PaddingValuesa9UjIt4$default(Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(@m80.l androidx.compose.ui.Modifier r35, @m80.l androidx.compose.material.ScaffoldState r36, @m80.l com.baicizhan.platform.base.widget.q3 r37, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r38, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r39, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, int r41, boolean r42, @m80.l x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, boolean r44, @m80.l androidx.compose.ui.graphics.Shape r45, float r46, long r47, long r49, long r51, long r53, long r55, @m80.k final x00.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r57, @m80.l androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.s4.B(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, com.baicizhan.platform.base.widget.q3, x00.p, x00.p, x00.p, int, boolean, x00.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 C(ScaffoldState scaffoldState, SnackbarHostState it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59408434, i11, -1, "com.baicizhan.platform.base.widget.AppScaffold.<anonymous> (Scaffold.kt:342)");
            }
            scaffoldState.getSnackbarHostState();
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
    public static final yz.g2 D(x00.q qVar, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1016587949, i11, -1, "com.baicizhan.platform.base.widget.AppScaffold.<anonymous> (Scaffold.kt:356)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxHeight$default);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            qVar.invoke(PaddingKt.m721PaddingValuesYgX7TsA$default(bk.d.c(), 0.0f, 2, null), composer, 6);
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

    public static final yz.g2 E(Modifier modifier, ScaffoldState scaffoldState, q3 q3Var, x00.p pVar, x00.p pVar2, x00.p pVar3, int i11, boolean z11, x00.q qVar, boolean z12, Shape shape, float f11, long j11, long j12, long j13, long j14, long j15, x00.q qVar2, int i12, int i13, int i14, Composer composer, int i15) {
        B(modifier, scaffoldState, q3Var, pVar, pVar2, pVar3, i11, z11, qVar, z12, shape, f11, j11, j12, j13, j14, j15, qVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), i14);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(@androidx.annotation.DrawableRes int r22, @m80.l androidx.compose.ui.graphics.Color r23, @m80.l x00.a<yz.g2> r24, @m80.l java.lang.String r25, @m80.l com.baicizhan.platform.base.widget.v4<? extends java.lang.Object> r26, @m80.l x00.a<yz.g2> r27, @m80.l androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.s4.F(int, androidx.compose.ui.graphics.Color, x00.a, java.lang.String, com.baicizhan.platform.base.widget.v4, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 G() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 H() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(int i11, Color color, x00.a aVar, String str, v4 v4Var, x00.a aVar2, int i12, int i13, Composer composer, int i14) {
        F(i11, color, aVar, str, v4Var, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void J(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1005162345);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1005162345, i11, -1, "com.baicizhan.platform.base.widget.PreviewTopBar1 (Scaffold.kt:378)");
            }
            bk.k.e(null, null, null, c2.f28217a.u(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.t3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 K;
                    K = s4.K(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return K;
                }
            });
        }
    }

    public static final yz.g2 K(int i11, Composer composer, int i12) {
        J(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void L(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1213860648);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1213860648, i11, -1, "com.baicizhan.platform.base.widget.PreviewTopBar2 (Scaffold.kt:390)");
            }
            bk.k.e(null, null, null, c2.f28217a.w(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.x3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 M;
                    M = s4.M(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return M;
                }
            });
        }
    }

    public static final yz.g2 M(int i11, Composer composer, int i12) {
        L(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void N(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1422558951);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422558951, i11, -1, "com.baicizhan.platform.base.widget.PreviewTopBar3 (Scaffold.kt:402)");
            }
            bk.k.e(null, null, null, c2.f28217a.o(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.d4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = s4.O(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    public static final yz.g2 O(int i11, Composer composer, int i12) {
        N(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void P(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1631257254);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1631257254, i11, -1, "com.baicizhan.platform.base.widget.PreviewTopBar4 (Scaffold.kt:414)");
            }
            bk.k.e(null, null, null, c2.f28217a.p(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.h4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = s4.Q(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    public static final yz.g2 Q(int i11, Composer composer, int i12) {
        P(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void R(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1839955557);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1839955557, i11, -1, "com.baicizhan.platform.base.widget.PreviewTopBar5 (Scaffold.kt:426)");
            }
            bk.k.e(null, null, null, c2.f28217a.r(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.y3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S;
                    S = s4.S(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return S;
                }
            });
        }
    }

    public static final yz.g2 S(int i11, Composer composer, int i12) {
        R(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T(@androidx.annotation.DrawableRes int r27, @m80.l androidx.compose.ui.graphics.Color r28, @m80.l x00.a<yz.g2> r29, @m80.l com.baicizhan.platform.base.widget.u4[] r30, @m80.l kotlin.Pair<androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color> r31, @m80.l androidx.compose.runtime.MutableState<java.lang.Integer> r32, @m80.l com.baicizhan.platform.base.widget.v4<? extends java.lang.Object> r33, @m80.l x00.a<yz.g2> r34, @m80.l androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.s4.T(int, androidx.compose.ui.graphics.Color, x00.a, com.baicizhan.platform.base.widget.u4[], kotlin.Pair, androidx.compose.runtime.MutableState, com.baicizhan.platform.base.widget.v4, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 U() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 V() {
        return yz.g2.f100423a;
    }

    public static final boolean W(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void X(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 Y(final MutableState mutableState, final u4[] u4VarArr, Pair pair, final MutableState mutableState2, Composer composer, int i11) {
        Color color;
        BoxScopeInstance boxScopeInstance;
        String str;
        long m2519unboximpl;
        final RowScopeInstance rowScopeInstance;
        Color color2;
        int i12;
        long m2519unboximpl2;
        final MutableState mutableState3;
        float f11;
        int i13;
        float m5115constructorimpl;
        Modifier.Companion companion;
        int i14;
        RowScopeInstance rowScopeInstance2;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160816709, i11, -1, "com.baicizhan.platform.base.widget.SwitchedTopBar.<anonymous> (Scaffold.kt:211)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                float f12 = 0;
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Dp.m5113boximpl(Dp.m5115constructorimpl(f12)), Dp.m5113boximpl(Dp.m5115constructorimpl(f12))), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue;
            float m5115constructorimpl2 = Dp.m5115constructorimpl(32);
            final float m5115constructorimpl3 = Dp.m5115constructorimpl(16);
            Modifier.Companion companion3 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion4.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion5.getSetModifier());
            final RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance3, companion3, 1.0f, false, 2, null), composer, 0);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion3);
            x00.a<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion3);
            x00.a<ComposeUiNode> constructor3 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion5.getSetModifier());
            String i15 = u4VarArr[0].i();
            float f13 = 12;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion3, m5115constructorimpl3, Dp.m5115constructorimpl(f13));
            MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            boolean changedInstance = composer.changedInstance(u4VarArr) | composer.changed(mutableState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.platform.base.widget.m4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Z;
                        Z = s4.Z(u4VarArr, rowScopeInstance3, mutableState2, mutableState);
                        return Z;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m727paddingVpY3zN4, MutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            TextOverflow.Companion companion6 = TextOverflow.Companion;
            int m5029getEllipsisgIe3tQ8 = companion6.m5029getEllipsisgIe3tQ8();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i16 = MaterialTheme.$stable;
            TextStyle h62 = materialTheme.getTypography(composer, i16).getH6();
            FontWeight.Companion companion7 = FontWeight.Companion;
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(h62, 0L, 0L, companion7.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            if (pair != null) {
                color = Color.m2499boximpl(((Color) (((Number) mutableState.getValue()).intValue() == 0 ? pair.getFirst() : pair.getSecond())).m2519unboximpl());
            } else {
                color = null;
            }
            if (color == null) {
                composer.startReplaceGroup(1998973703);
                boxScopeInstance = boxScopeInstance2;
                str = i15;
                m2519unboximpl = ColorsKt.m1618contentColorForek8zF_U(materialTheme.getColors(composer, i16).m1593getBackground0d7_KjU(), composer, 0);
                composer.endReplaceGroup();
            } else {
                boxScopeInstance = boxScopeInstance2;
                str = i15;
                composer.startReplaceGroup(1998971130);
                composer.endReplaceGroup();
                m2519unboximpl = color.m2519unboximpl();
            }
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.platform.base.widget.n4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 a02;
                        a02 = s4.a0(MutableState.this, m5115constructorimpl3, (TextLayoutResult) obj);
                        return a02;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            TextKt.m1845Text4IGK_g(str, m267clickableO2vRcR0$default, m2519unboximpl, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) rememberedValue3, m4572copyp1EtxEg$default, composer, 0, 199728, 22520);
            String i17 = u4VarArr[1].i();
            Modifier m727paddingVpY3zN42 = PaddingKt.m727paddingVpY3zN4(companion3, m5115constructorimpl3, Dp.m5115constructorimpl(f13));
            MutableInteractionSource MutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
            boolean changedInstance2 = composer.changedInstance(u4VarArr) | composer.changed(mutableState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion2.getEmpty()) {
                rowScopeInstance = rowScopeInstance3;
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.platform.base.widget.o4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 b02;
                        b02 = s4.b0(u4VarArr, rowScopeInstance, mutableState2, mutableState);
                        return b02;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            } else {
                rowScopeInstance = rowScopeInstance3;
            }
            RowScopeInstance rowScopeInstance4 = rowScopeInstance;
            Modifier m267clickableO2vRcR0$default2 = ClickableKt.m267clickableO2vRcR0$default(m727paddingVpY3zN42, MutableInteractionSource2, null, false, null, null, (x00.a) rememberedValue4, 28, null);
            int m5029getEllipsisgIe3tQ82 = companion6.m5029getEllipsisgIe3tQ8();
            TextStyle m4572copyp1EtxEg$default2 = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i16).getH6(), 0L, 0L, companion7.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            if (pair != null) {
                color2 = Color.m2499boximpl(((Color) (((Number) mutableState.getValue()).intValue() == 1 ? pair.getFirst() : pair.getSecond())).m2519unboximpl());
            } else {
                color2 = null;
            }
            if (color2 == null) {
                composer.startReplaceGroup(1999027079);
                i12 = 0;
                m2519unboximpl2 = ColorsKt.m1618contentColorForek8zF_U(materialTheme.getColors(composer, i16).m1593getBackground0d7_KjU(), composer, 0);
                composer.endReplaceGroup();
            } else {
                i12 = 0;
                composer.startReplaceGroup(1999024506);
                composer.endReplaceGroup();
                m2519unboximpl2 = color2.m2519unboximpl();
            }
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion2.getEmpty()) {
                mutableState3 = mutableState4;
                rememberedValue5 = new x00.l() { // from class: com.baicizhan.platform.base.widget.p4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 c02;
                        c02 = s4.c0(MutableState.this, m5115constructorimpl3, (TextLayoutResult) obj);
                        return c02;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            } else {
                mutableState3 = mutableState4;
            }
            MutableState mutableState5 = mutableState3;
            TextKt.m1845Text4IGK_g(i17, m267clickableO2vRcR0$default2, m2519unboximpl2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5029getEllipsisgIe3tQ82, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) rememberedValue5, m4572copyp1EtxEg$default2, composer, 0, 199728, 22520);
            composer.endNode();
            if (((Number) mutableState.getValue()).intValue() == 0) {
                f11 = m5115constructorimpl2;
                i13 = 2;
                m5115constructorimpl = Dp.m5115constructorimpl(Dp.m5115constructorimpl(((Dp) ((Pair) mutableState5.getValue()).getFirst()).m5129unboximpl() - f11) / 2);
            } else {
                f11 = m5115constructorimpl2;
                i13 = 2;
                m5115constructorimpl = Dp.m5115constructorimpl(Dp.m5115constructorimpl(Dp.m5115constructorimpl(((Dp) ((Pair) mutableState5.getValue()).getSecond()).m5129unboximpl() - f11) / 2) + ((Dp) ((Pair) mutableState5.getValue()).getFirst()).m5129unboximpl());
            }
            State<Dp> m125animateDpAsStateAjpBEmI = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl, AnimationSpecKt.tween$default(300, i12, EasingKt.getFastOutSlowInEasing(), i13, null), null, null, composer, 0, 12);
            float f14 = i12;
            if (Dp.m5120equalsimpl0(((Dp) ((Pair) mutableState5.getValue()).getFirst()).m5129unboximpl(), Dp.m5115constructorimpl(f14)) || Dp.m5120equalsimpl0(((Dp) ((Pair) mutableState5.getValue()).getSecond()).m5129unboximpl(), Dp.m5115constructorimpl(f14))) {
                companion = companion3;
                i14 = i12;
                rowScopeInstance2 = rowScopeInstance4;
                composer.startReplaceGroup(351306599);
            } else {
                composer.startReplaceGroup(362686296);
                Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(boxScopeInstance3.align(companion3, companion4.getBottomCenter()), Dp.m5115constructorimpl(((Dp) ((Pair) mutableState5.getValue()).getFirst()).m5129unboximpl() + ((Dp) ((Pair) mutableState5.getValue()).getSecond()).m5129unboximpl()));
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer, i12);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, i12);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m778width3ABfNKs);
                x00.a<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy3, companion5.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion5.getSetModifier());
                if (W(mutableState2)) {
                    m5115constructorimpl = d0(m125animateDpAsStateAjpBEmI);
                }
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, m5115constructorimpl), composer, i12);
                companion = companion3;
                i14 = i12;
                DividerKt.m1643DivideroMI9zvI(SizeKt.m778width3ABfNKs(companion3, f11), materialTheme.getColors(composer, i16).m1600getPrimary0d7_KjU(), Dp.m5115constructorimpl(4), 0.0f, composer, 390, 8);
                rowScopeInstance2 = rowScopeInstance4;
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer, i14);
                composer.endNode();
            }
            composer.endReplaceGroup();
            composer.endNode();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer, i14);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(u4[] u4VarArr, RowScope rowScope, MutableState mutableState, MutableState mutableState2) {
        if (W(mutableState)) {
            X(mutableState, true);
        }
        x00.l<MutableState<Integer>, Boolean> k11 = u4VarArr[0].k();
        if (k11 == null) {
            mutableState2.setValue(0);
            u4VarArr[0].j().invoke();
        } else if (k11.invoke(mutableState2).booleanValue()) {
            mutableState2.setValue(0);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 a0(MutableState mutableState, float f11, TextLayoutResult result) {
        kotlin.jvm.internal.g0.p(result, "result");
        mutableState.setValue(new Pair(Dp.m5113boximpl(Dp.m5115constructorimpl(Dp.m5115constructorimpl(((int) (result.m4530getSizeYbymL2g() >> 32)) / result.getLayoutInput().getDensity().getDensity()) + Dp.m5115constructorimpl(f11 * 2))), ((Pair) mutableState.getValue()).getSecond()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 b0(u4[] u4VarArr, RowScope rowScope, MutableState mutableState, MutableState mutableState2) {
        if (W(mutableState)) {
            X(mutableState, true);
        }
        x00.l<MutableState<Integer>, Boolean> k11 = u4VarArr[1].k();
        if (k11 == null) {
            mutableState2.setValue(1);
            u4VarArr[1].j().invoke();
        } else if (k11.invoke(mutableState2).booleanValue()) {
            mutableState2.setValue(1);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 c0(MutableState mutableState, float f11, TextLayoutResult result) {
        kotlin.jvm.internal.g0.p(result, "result");
        mutableState.setValue(new Pair(((Pair) mutableState.getValue()).getFirst(), Dp.m5113boximpl(Dp.m5115constructorimpl(Dp.m5115constructorimpl(((int) (result.m4530getSizeYbymL2g() >> 32)) / result.getLayoutInput().getDensity().getDensity()) + Dp.m5115constructorimpl(f11 * 2)))));
        return yz.g2.f100423a;
    }

    public static final float d0(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    public static final yz.g2 e0(int i11, Color color, x00.a aVar, u4[] u4VarArr, Pair pair, MutableState mutableState, v4 v4Var, x00.a aVar2, int i12, int i13, Composer composer, int i14) {
        T(i11, color, aVar, u4VarArr, pair, mutableState, v4Var, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0250  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f0(@m80.l androidx.compose.ui.Modifier r25, long r26, long r28, @androidx.annotation.DrawableRes int r30, @m80.k final x00.a<yz.g2> r31, @m80.l com.baicizhan.platform.base.widget.v4<? extends java.lang.Object> r32, @m80.l x00.a<yz.g2> r33, boolean r34, boolean r35, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r36, @m80.l androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.s4.f0(androidx.compose.ui.Modifier, long, long, int, x00.a, com.baicizhan.platform.base.widget.v4, x00.a, boolean, boolean, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g0(@m80.l androidx.compose.ui.Modifier r21, long r22, long r24, @androidx.annotation.DrawableRes int r26, @m80.k final x00.a<yz.g2> r27, @m80.l java.lang.String r28, @m80.l com.baicizhan.platform.base.widget.v4<? extends java.lang.Object> r29, @m80.l x00.a<yz.g2> r30, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.s4.g0(androidx.compose.ui.Modifier, long, long, int, x00.a, java.lang.String, com.baicizhan.platform.base.widget.v4, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 h0() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i0(int i11, x00.a aVar, v4 v4Var, boolean z11, x00.p pVar, final x00.a aVar2, long j11, boolean z12, Composer composer, int i12) {
        boolean z13;
        float f11;
        Modifier.Companion companion;
        long j12;
        yz.g2 g2Var;
        Composer composer2 = composer;
        if (composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2041343522, i12, -1, "com.baicizhan.platform.base.widget.TopBar.<anonymous> (Scaffold.kt:58)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f28518a);
            float f12 = f28519b;
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(padding, f12);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m759height3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (i11 != 0) {
                composer2.startReplaceGroup(751119574);
                z13 = 6;
                f11 = f12;
                r.w(null, aVar, i11, null, false, null, null, composer, 0, 121);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                z13 = 6;
                f11 = f12;
                composer2.startReplaceGroup(751205165);
                SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion2, r.N()), composer2, 6);
                composer2.endReplaceGroup();
            }
            Object rememberedValue = composer2.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (rememberedValue == companion5.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5113boximpl(Dp.m5115constructorimpl(0)), null, 2, null);
                composer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            float m5129unboximpl = ((Dp) mutableState.component1()).m5129unboximpl();
            final x00.l component2 = mutableState.component2();
            if (v4Var instanceof v4.b) {
                composer2.startReplaceGroup(751496224);
                SpacerKt.Spacer(SizeKt.m775sizeVpY3zN4(companion2, m5129unboximpl, f11), composer2, 0);
            } else {
                composer2.startReplaceGroup(748813732);
            }
            composer2.endReplaceGroup();
            float f13 = 8;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(PaddingKt.m730paddingqDBjuR0$default(companion2, Dp.m5115constructorimpl(f13), 0.0f, Dp.m5115constructorimpl(f13), 0.0f, 10, null), null, z11, 1, null), 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
            x00.a<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer2, 0);
            composer2.endNode();
            if (v4Var == null) {
                composer2.startReplaceGroup(752014481);
                composer2.endReplaceGroup();
                companion = companion2;
                g2Var = null;
            } else {
                composer2.startReplaceGroup(752014482);
                if (v4Var instanceof v4.a) {
                    composer2.startReplaceGroup(1140145536);
                    r.w(null, aVar2, ((v4.a) v4Var).a().intValue(), null, false, null, null, composer2, 0, 121);
                    composer2.endReplaceGroup();
                    companion = companion2;
                } else {
                    if (v4Var instanceof v4.b) {
                        composer2.startReplaceGroup(1140305992);
                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
                        v4.b bVar = (v4.b) v4Var;
                        boolean z14 = bVar.c() == null || bVar.b();
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (rememberedValue2 == companion5.getEmpty()) {
                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                        boolean changed = composer2.changed(aVar2);
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changed || rememberedValue3 == companion5.getEmpty()) {
                            rememberedValue3 = new x00.a() { // from class: com.baicizhan.platform.base.widget.i4
                                @Override // x00.a
                                public final Object invoke() {
                                    yz.g2 j02;
                                    j02 = s4.j0(x00.a.this);
                                    return j02;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(fillMaxHeight$default, mutableInteractionSource, null, z14, null, null, (x00.a) rememberedValue3, 24, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m267clickableO2vRcR0$default);
                        x00.a<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion4.getSetModifier());
                        if (bVar.c() != null) {
                            j12 = (bVar.b() ? bVar.c().getSecond() : bVar.c().getFirst()).m2519unboximpl();
                        } else {
                            j12 = j11;
                        }
                        String a11 = bVar.a();
                        TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton(), j12, 0L, FontWeight.Companion.getW400(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
                        Modifier m777sizeInqDBjuR0$default = SizeKt.m777sizeInqDBjuR0$default(PaddingKt.m730paddingqDBjuR0$default(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, 0.0f, Dp.m5115constructorimpl(f13), 0.0f, 11, null), r.N(), 0.0f, Dp.m5115constructorimpl(r.N() * 2), 0.0f, 10, null);
                        TextAlign m4970boximpl = TextAlign.m4970boximpl(TextAlign.Companion.m4978getEnde0LSkKk());
                        boolean changed2 = composer2.changed(component2);
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed2 || rememberedValue4 == companion5.getEmpty()) {
                            rememberedValue4 = new x00.l() { // from class: com.baicizhan.platform.base.widget.j4
                                @Override // x00.l
                                public final Object invoke(Object obj) {
                                    yz.g2 k02;
                                    k02 = s4.k0(x00.l.this, (TextLayoutResult) obj);
                                    return k02;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        companion = companion2;
                        TextKt.m1845Text4IGK_g(a11, m777sizeInqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, m4970boximpl, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) rememberedValue4, m4572copyp1EtxEg$default, composer, 0, 3072, 24060);
                        composer2 = composer;
                        composer2.endNode();
                    } else {
                        companion = companion2;
                        composer2.startReplaceGroup(1136935579);
                    }
                    composer2.endReplaceGroup();
                }
                g2Var = yz.g2.f100423a;
                composer2.endReplaceGroup();
            }
            if (g2Var == null) {
                composer2.startReplaceGroup(753395067);
                if (z12) {
                    composer2.startReplaceGroup(162224497);
                    SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, r.N()), composer2, 6);
                } else {
                    composer2.startReplaceGroup(729357396);
                }
                composer2.endReplaceGroup();
                yz.g2 g2Var2 = yz.g2.f100423a;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(439900516);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 j0(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 k0(x00.l lVar, TextLayoutResult result) {
        kotlin.jvm.internal.g0.p(result, "result");
        lVar.invoke(Dp.m5113boximpl(Dp.m5115constructorimpl(Dp.m5115constructorimpl(Dp.m5115constructorimpl(((int) (result.m4530getSizeYbymL2g() >> 32)) / result.getLayoutInput().getDensity().getDensity()) - r.N()) + Dp.m5115constructorimpl(8))));
        return yz.g2.f100423a;
    }

    public static final yz.g2 l0(Modifier modifier, long j11, long j12, int i11, x00.a aVar, v4 v4Var, x00.a aVar2, boolean z11, boolean z12, x00.p pVar, int i12, int i13, Composer composer, int i14) {
        f0(modifier, j11, j12, i11, aVar, v4Var, aVar2, z11, z12, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    public static final yz.g2 m0() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 n0(String str, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(612204646, i11, -1, "com.baicizhan.platform.base.widget.TopBar.<anonymous> (Scaffold.kt:149)");
            }
            TextKt.m1845Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6(), 0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 3120, 54780);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 o0(Modifier modifier, long j11, long j12, int i11, x00.a aVar, String str, v4 v4Var, x00.a aVar2, int i12, int i13, Composer composer, int i14) {
        g0(modifier, j11, j12, i11, aVar, str, v4Var, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @Composable
    @m80.k
    public static final MutableState<Integer> q0(int i11, @m80.l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2054250517, i12, -1, "com.baicizhan.platform.base.widget.rememberSwitchStates (Scaffold.kt:187)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i11), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState<Integer> mutableState = (MutableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
