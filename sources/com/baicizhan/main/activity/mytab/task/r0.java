package com.baicizhan.main.activity.mytab.task;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import coil.request.ImageRequest;
import com.baicizhan.main.activity.mytab.task.data.ActionType;
import com.baicizhan.main.activity.mytab.task.data.TaskStatus;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUiTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiTasks.kt\ncom/baicizhan/main/activity/mytab/task/UiTasksKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,439:1\n1247#2,6:440\n1247#2,6:447\n1247#2,6:492\n1247#2,6:498\n1247#2,6:636\n1247#2,6:642\n1247#2,6:815\n75#3:446\n75#3:870\n75#3:872\n99#4:453\n96#4,9:454\n106#4:507\n99#4:546\n96#4,9:547\n106#4:587\n99#4,6:690\n99#4:761\n95#4,10:762\n106#4:804\n106#4:824\n79#5,6:463\n86#5,3:478\n89#5,2:487\n93#5:506\n79#5,6:519\n86#5,3:534\n89#5,2:543\n79#5,6:556\n86#5,3:571\n89#5,2:580\n93#5:586\n93#5:590\n79#5,6:602\n86#5,3:617\n89#5,2:626\n93#5:634\n79#5,6:658\n86#5,3:673\n89#5,2:682\n93#5:687\n79#5,6:696\n86#5,3:711\n89#5,2:720\n79#5,6:734\n86#5,3:749\n89#5,2:758\n79#5,6:772\n86#5,3:787\n89#5,2:796\n93#5:803\n93#5:809\n93#5:823\n79#5,6:836\n86#5,3:851\n89#5,2:860\n93#5:868\n79#5,6:888\n86#5,3:903\n89#5,2:912\n93#5:917\n347#6,9:469\n356#6:489\n357#6,2:504\n347#6,9:525\n356#6:545\n347#6,9:562\n356#6:582\n357#6,2:584\n357#6,2:588\n347#6,9:608\n356#6:628\n357#6,2:632\n347#6,9:664\n356#6,3:684\n347#6,9:702\n356#6:722\n347#6,9:740\n356#6:760\n347#6,9:778\n356#6:798\n357#6,2:801\n357#6,2:807\n357#6,2:821\n347#6,9:842\n356#6:862\n357#6,2:866\n347#6,9:894\n356#6,3:914\n4206#7,6:481\n4206#7,6:537\n4206#7,6:574\n4206#7,6:620\n4206#7,6:676\n4206#7,6:714\n4206#7,6:752\n4206#7,6:790\n4206#7,6:854\n4206#7,6:906\n113#8:490\n113#8:491\n113#8:508\n113#8:583\n113#8:629\n113#8:630\n113#8:631\n113#8:689\n113#8:723\n113#8:799\n113#8:800\n113#8:805\n113#8:806\n113#8:811\n113#8:812\n113#8:813\n113#8:814\n113#8:825\n113#8:863\n113#8:873\n113#8:874\n113#8:875\n113#8:923\n113#8:924\n70#9:509\n67#9,9:510\n77#9:591\n70#9:648\n67#9,9:649\n77#9:688\n87#10:592\n84#10,9:593\n94#10:635\n87#10:724\n84#10,9:725\n94#10:810\n87#10:826\n84#10,9:827\n94#10:869\n87#10:877\n83#10,10:878\n94#10:918\n1869#11,2:864\n1869#11:871\n1870#11:876\n85#12:919\n113#12,2:920\n1#13:922\n*S KotlinDebug\n*F\n+ 1 UiTasks.kt\ncom/baicizhan/main/activity/mytab/task/UiTasksKt\n*L\n144#1:440,6\n147#1:447,6\n163#1:492,6\n168#1:498,6\n229#1:636,6\n225#1:642,6\n263#1:815,6\n145#1:446\n329#1:870\n332#1:872\n155#1:453\n155#1:454,9\n155#1:507\n187#1:546\n187#1:547,9\n187#1:587\n239#1:690,6\n247#1:761\n247#1:762,10\n247#1:804\n239#1:824\n155#1:463,6\n155#1:478,3\n155#1:487,2\n155#1:506\n182#1:519,6\n182#1:534,3\n182#1:543,2\n187#1:556,6\n187#1:571,3\n187#1:580,2\n187#1:586\n182#1:590\n206#1:602,6\n206#1:617,3\n206#1:626,2\n206#1:634\n223#1:658,6\n223#1:673,3\n223#1:682,2\n223#1:687\n239#1:696,6\n239#1:711,3\n239#1:720,2\n246#1:734,6\n246#1:749,3\n246#1:758,2\n247#1:772,6\n247#1:787,3\n247#1:796,2\n247#1:803\n246#1:809\n239#1:823\n298#1:836,6\n298#1:851,3\n298#1:860,2\n298#1:868\n394#1:888,6\n394#1:903,3\n394#1:912,2\n394#1:917\n155#1:469,9\n155#1:489\n155#1:504,2\n182#1:525,9\n182#1:545\n187#1:562,9\n187#1:582\n187#1:584,2\n182#1:588,2\n206#1:608,9\n206#1:628\n206#1:632,2\n223#1:664,9\n223#1:684,3\n239#1:702,9\n239#1:722\n246#1:740,9\n246#1:760\n247#1:778,9\n247#1:798\n247#1:801,2\n246#1:807,2\n239#1:821,2\n298#1:842,9\n298#1:862\n298#1:866,2\n394#1:894,9\n394#1:914,3\n155#1:481,6\n182#1:537,6\n187#1:574,6\n206#1:620,6\n223#1:676,6\n239#1:714,6\n246#1:752,6\n247#1:790,6\n298#1:854,6\n394#1:906,6\n157#1:490\n161#1:491\n184#1:508\n194#1:583\n207#1:629\n211#1:630\n212#1:631\n241#1:689\n246#1:723\n249#1:799\n253#1:800\n256#1:805\n257#1:806\n261#1:811\n262#1:812\n282#1:813\n284#1:814\n302#1:825\n314#1:863\n335#1:873\n341#1:874\n346#1:875\n164#1:923\n169#1:924\n182#1:509\n182#1:510,9\n182#1:591\n223#1:648\n223#1:649,9\n223#1:688\n206#1:592\n206#1:593,9\n206#1:635\n246#1:724\n246#1:725,9\n246#1:810\n298#1:826\n298#1:827,9\n298#1:869\n394#1:877\n394#1:878,10\n394#1:918\n318#1:864,2\n330#1:871\n330#1:876\n144#1:919\n144#1:920,2\n*E\n"})
/* loaded from: classes4.dex */
public final class r0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.mytab.task.UiTasksKt$Coin$1$1", f = "UiTasks.kt", i = {}, l = {148, 150}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18875a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<Integer, g2> f18876b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.b f18877c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f18878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.l<? super Integer, g2> lVar, le.b bVar, MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f18876b = lVar;
            this.f18877c = bVar;
            this.f18878d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f18876b, this.f18877c, this.f18878d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (c40.a1.b(1500, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (c40.a1.b(500, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f18875a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r7)
                goto L3c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.e.n(r7)
                goto L2c
            L1e:
                kotlin.e.n(r7)
                r6.f18875a = r3
                r4 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r7 = c40.a1.b(r4, r6)
                if (r7 != r0) goto L2c
                goto L3b
            L2c:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r6.f18878d
                com.baicizhan.main.activity.mytab.task.r0.O(r7, r3)
                r6.f18875a = r2
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r7 = c40.a1.b(r1, r6)
                if (r7 != r0) goto L3c
            L3b:
                return r0
            L3c:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r6.f18878d
                r0 = 0
                com.baicizhan.main.activity.mytab.task.r0.O(r7, r0)
                x00.l<java.lang.Integer, yz.g2> r7 = r6.f18876b
                le.b r0 = r6.f18877c
                int r0 = r0.h()
                java.lang.Integer r0 = l00.a.f(r0)
                r7.invoke(r0)
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.r0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18879a;

        static {
            int[] iArr = new int[TaskStatus.values().length];
            try {
                iArr[TaskStatus.DOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f18879a = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 A(le.b bVar, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2046882034, i11, -1, "com.baicizhan.main.activity.mytab.task.Coin.<anonymous>.<anonymous> (UiTasks.kt:170)");
        }
        t(null, StringResources_androidKt.stringResource(R.string.my_tab_today_increased, composer, 6) + "+" + bVar.h(), bk.b.e(), composer, 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return g2.f100423a;
    }

    public static final g2 B(Modifier modifier, le.b bVar, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        v(modifier, bVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void C(@m80.l Modifier modifier, @m80.k final le.b coinInfo, @m80.k final le.c exchange, @m80.k final x00.l<? super String, g2> click, @m80.k final x00.l<? super Integer, g2> todayNewShown, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(coinInfo, "coinInfo");
        kotlin.jvm.internal.g0.p(exchange, "exchange");
        kotlin.jvm.internal.g0.p(click, "click");
        kotlin.jvm.internal.g0.p(todayNewShown, "todayNewShown");
        Composer startRestartGroup = composer.startRestartGroup(1288891250);
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
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(coinInfo) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(exchange) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(click) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(todayNewShown) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i13 & 9363) != 9362, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1288891250, i13, -1, "com.baicizhan.main.activity.mytab.task.CoinExchangeBar (UiTasks.kt:221)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(exchange) | ((i13 & 7168) == 2048);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.mytab.task.b0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 D;
                        D = r0.D(x00.l.this, exchange);
                        return D;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(modifier4, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.Companion;
            v(boxScopeInstance.align(companion4, companion2.getCenterStart()), coinInfo, todayNewShown, startRestartGroup, (i13 & 112) | ((i13 >> 6) & 896), 0);
            H(boxScopeInstance.align(companion4, companion2.getCenterEnd()), exchange, startRestartGroup, (i13 >> 3) & 112, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.c0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 E;
                    E = r0.E(Modifier.this, coinInfo, exchange, click, todayNewShown, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            });
        }
    }

    public static final g2 D(x00.l lVar, le.c cVar) {
        lVar.invoke(cVar.f());
        return g2.f100423a;
    }

    public static final g2 E(Modifier modifier, le.b bVar, le.c cVar, x00.l lVar, x00.l lVar2, int i11, int i12, Composer composer, int i13) {
        C(modifier, bVar, cVar, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void F(@m80.l Modifier modifier, @m80.k final le.a creditTaskCenter, @m80.k final x00.l<? super com.baicizhan.main.activity.mytab.task.data.i, g2> taskClick, @m80.k final x00.l<? super String, g2> goExchange, @m80.k final x00.l<? super Integer, g2> todayNewShown, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(creditTaskCenter, "creditTaskCenter");
        kotlin.jvm.internal.g0.p(taskClick, "taskClick");
        kotlin.jvm.internal.g0.p(goExchange, "goExchange");
        kotlin.jvm.internal.g0.p(todayNewShown, "todayNewShown");
        Composer startRestartGroup = composer.startRestartGroup(-2056420267);
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
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(creditTaskCenter) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(taskClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(goExchange) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(todayNewShown) ? 16384 : 8192;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((i15 & 9363) != 9362, i15 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2056420267, i15, -1, "com.baicizhan.main.activity.mytab.task.CoinTasksMain (UiTasks.kt:295)");
            }
            boolean isEmpty = creditTaskCenter.h().isEmpty();
            float f11 = 16;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(BackgroundKt.m234backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), bk.b.A0(), MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getSmall()), Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 10, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            C(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), creditTaskCenter.f(), creditTaskCenter.g(), goExchange, todayNewShown, startRestartGroup, 64512 & i15, 0);
            if (isEmpty) {
                startRestartGroup.startReplaceGroup(323192855);
            } else {
                startRestartGroup.startReplaceGroup(335941171);
                DividerKt.m1643DivideroMI9zvI(SizeKt.fillMaxWidth$default(SizeKt.m759height3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(1)), 0.0f, 1, null), bk.b.J(), 0.0f, 0.0f, startRestartGroup, 54, 12);
                for (com.baicizhan.main.activity.mytab.task.data.i iVar : creditTaskCenter.h()) {
                    startRestartGroup.startMovableGroup(288031687, Integer.valueOf(iVar.o()));
                    L(null, iVar, taskClick, startRestartGroup, i15 & 896, 1);
                    startRestartGroup.endMovableGroup();
                }
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.j0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 G;
                    G = r0.G(Modifier.this, creditTaskCenter, taskClick, goExchange, todayNewShown, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final g2 G(Modifier modifier, le.a aVar, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, int i12, Composer composer, int i13) {
        F(modifier, aVar, lVar, lVar2, lVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void H(@m80.l Modifier modifier, @m80.k final le.c exchange, @m80.l Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        kotlin.jvm.internal.g0.p(exchange, "exchange");
        Composer startRestartGroup = composer.startRestartGroup(-1863198665);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = i11 | (startRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(exchange) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1863198665, i13, -1, "com.baicizhan.main.activity.mytab.task.Exchange (UiTasks.kt:180)");
            }
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(SizeKt.m759height3ABfNKs(modifier3, Dp.m5115constructorimpl(56)), null, false, 3, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.wrapContentWidth$default(companion3, null, false, 3, null), 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxHeight$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            J(exchange.h(), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(4)), startRestartGroup, 6);
            Modifier modifier4 = modifier3;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.my_tab_go_exchange, startRestartGroup, 6), (Modifier) null, bk.b.D(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 3456, 0, 131058);
            startRestartGroup = startRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_mytab_exchange_right, startRestartGroup, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            startRestartGroup.endNode();
            if (exchange.g()) {
                startRestartGroup.startReplaceGroup(-1954531216);
                t(boxScopeInstance.align(companion3, companion.getTopEnd()), StringResources_androidKt.stringResource(R.string.my_tab_go_exchange_new, startRestartGroup, 6), bk.b.y0(), startRestartGroup, 384, 0);
            } else {
                startRestartGroup.startReplaceGroup(-1962943407);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.l0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 I;
                    I = r0.I(Modifier.this, exchange, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return I;
                }
            });
        }
    }

    public static final g2 I(Modifier modifier, le.c cVar, int i11, int i12, Composer composer, int i13) {
        H(modifier, cVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void J(@m80.k final List<String> icon, @m80.l Composer composer, final int i11) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1804670646);
        int i12 = 4;
        int i13 = (i11 & 6) == 0 ? i11 | (startRestartGroup.changedInstance(icon) ? 4 : 2) : i11;
        int i14 = 1;
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1804670646, i13, -1, "com.baicizhan.main.activity.mytab.task.ExchangeItemList (UiTasks.kt:327)");
            }
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            for (String str : icon) {
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                s0.d[] dVarArr = new s0.d[i14];
                dVarArr[0] = new s0.c(density.mo377toPx0680j_4(Dp.m5115constructorimpl(i14)));
                ImageRequest f11 = builder.r0(dVarArr).j(str).f();
                Modifier.Companion companion = Modifier.Companion;
                Composer composer2 = startRestartGroup;
                int i15 = i12;
                coil.compose.l.b(f11, "cover", SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(24)), PainterResources_androidKt.painterResource(R.drawable.ic_mytab_exchange_placeholder, startRestartGroup, 6), null, null, null, null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer2, 432, 6, 64496);
                startRestartGroup = composer2;
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(i15)), startRestartGroup, 6);
                density = density;
                i12 = i15;
                i14 = i14;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.g0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 K;
                    K = r0.K(icon, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return K;
                }
            });
        }
    }

    public static final g2 K(List list, int i11, Composer composer, int i12) {
        J(list, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void L(@m80.l Modifier modifier, @m80.k final com.baicizhan.main.activity.mytab.task.data.i task, @m80.k final x00.l<? super com.baicizhan.main.activity.mytab.task.data.i, g2> taskClick, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        int i14;
        bk.e a11;
        kotlin.jvm.internal.g0.p(task, "task");
        kotlin.jvm.internal.g0.p(taskClick, "taskClick");
        Composer startRestartGroup = composer.startRestartGroup(-52159893);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(task) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(taskClick) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-52159893, i13, -1, "com.baicizhan.main.activity.mytab.task.TaskItem (UiTasks.kt:237)");
            }
            float f11 = 12;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(modifier4, 0.0f, Dp.m5115constructorimpl(f11), 1, null), 0.0f, 1, null);
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            float f12 = 192;
            Modifier m780widthInVpY3zN4$default = SizeKt.m780widthInVpY3zN4$default(companion3, 0.0f, Dp.m5115constructorimpl(f12), 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m780widthInVpY3zN4$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            x00.a<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion2.getSetModifier());
            Modifier m780widthInVpY3zN4$default2 = SizeKt.m780widthInVpY3zN4$default(companion3, 0.0f, Dp.m5115constructorimpl(130), 1, null);
            String p11 = task.p();
            int i16 = i13;
            long x11 = bk.b.x();
            long m11 = bk.d.m();
            FontFamily a12 = bk.a.a();
            FontWeight medium = FontWeight.Companion.getMedium();
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            Modifier modifier5 = modifier4;
            TextKt.m1845Text4IGK_g(p11, m780widthInVpY3zN4$default2, x11, m11, (FontStyle) null, medium, a12, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 1772976, 3120, 120720);
            float f13 = 6;
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(f13)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(task.q(), (Modifier) null, bk.b.e(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 3456, 3072, 122866);
            startRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(4)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(task.n(), SizeKt.m780widthInVpY3zN4$default(companion3, 0.0f, Dp.m5115constructorimpl(f12), 1, null), bk.b.B(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m5029getEllipsisgIe3tQ8(), false, 2, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 3504, 3120, 120816);
            startRestartGroup.endNode();
            Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(32)), Dp.m5115constructorimpl(80));
            String m12 = task.m();
            if (b.f18879a[task.r().ordinal()] == 1) {
                startRestartGroup.startReplaceGroup(-1013953610);
                long f02 = bk.b.f0();
                long g02 = bk.b.g0();
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i17 = MaterialTheme.$stable;
                i14 = 32;
                a11 = bk.f.a(f02, g02, bk.b.a0(materialTheme.getColors(startRestartGroup, i17)), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(startRestartGroup, i17)), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, 54, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                i14 = 32;
                startRestartGroup.startReplaceGroup(-1013593886);
                a11 = bk.f.a(0L, 0L, bk.b.I(MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable)), 0L, startRestartGroup, 0, 11);
                startRestartGroup.endReplaceGroup();
            }
            bk.e eVar = a11;
            boolean z11 = (task.r() == TaskStatus.FINISH || (task.r() == TaskStatus.DOING && task.l() == ActionType.NONE)) ? false : true;
            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(16));
            long l11 = bk.d.l();
            PaddingValues m720PaddingValuesYgX7TsA = PaddingKt.m720PaddingValuesYgX7TsA(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f13));
            boolean z12 = ((i16 & 896) == 256) | ((i16 & 112) == i14);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.mytab.task.m0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 M;
                        M = r0.M(x00.l.this, task);
                        return M;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.baicizhan.platform.base.widget.r.C(m778width3ABfNKs, (x00.a) rememberedValue, m12, l11, null, 0, z11, false, m1019RoundedCornerShape0680j_4, eVar, m720PaddingValuesYgX7TsA, composer2, 3078, 0, 176);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.n0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 N;
                    N = r0.N(Modifier.this, task, taskClick, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            });
        }
    }

    public static final g2 M(x00.l lVar, com.baicizhan.main.activity.mytab.task.data.i iVar) {
        lVar.invoke(iVar);
        return g2.f100423a;
    }

    public static final g2 N(Modifier modifier, com.baicizhan.main.activity.mytab.task.data.i iVar, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        L(modifier, iVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @Composable
    public static final void P(final int i11, final int i12, @m80.l Composer composer, final int i13) {
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1031755056);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i14 & 19) != 18, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1031755056, i14, -1, "com.baicizhan.main.activity.mytab.task.test (UiTasks.kt:410)");
            }
            qb.c.i("GAO", "testS, " + i11 + GlideException.a.f28776d + i12, new Object[0]);
            R(i11, startRestartGroup, i14 & 14);
            T(i12, startRestartGroup, (i14 >> 3) & 14);
            startRestartGroup.startMovableGroup(620839449, Integer.valueOf(i11));
            qb.c.i("GAO", "keyA", new Object[0]);
            startRestartGroup.endMovableGroup();
            startRestartGroup.startMovableGroup(620840921, Integer.valueOf(i12));
            qb.c.i("GAO", "keyB", new Object[0]);
            startRestartGroup.endMovableGroup();
            qb.c.i("GAO", "testE", new Object[0]);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.i0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 Q;
                    Q = r0.Q(i11, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    public static final g2 Q(int i11, int i12, int i13, Composer composer, int i14) {
        P(i11, i12, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return g2.f100423a;
    }

    @Composable
    public static final void R(final int i11, @m80.l Composer composer, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(1993707950);
        int i13 = i12 & 1;
        if (startRestartGroup.shouldExecute(i13 != 0, i13)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1993707950, i12, -1, "com.baicizhan.main.activity.mytab.task.testA (UiTasks.kt:424)");
            }
            qb.c.i("GAO", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Object[0]);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.y
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 S;
                    S = r0.S(i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return S;
                }
            });
        }
    }

    public static final g2 S(int i11, int i12, Composer composer, int i13) {
        R(i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return g2.f100423a;
    }

    @Composable
    public static final void T(final int i11, @m80.l Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1747394863);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1747394863, i13, -1, "com.baicizhan.main.activity.mytab.task.testB (UiTasks.kt:429)");
            }
            qb.c.i("GAO", "B " + i11, new Object[0]);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.e0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 U;
                    U = r0.U(i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return U;
                }
            });
        }
    }

    public static final g2 U(int i11, int i12, Composer composer, int i13) {
        T(i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return g2.f100423a;
    }

    @Composable
    public static final void V(final int i11, @m80.l Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1501081776);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501081776, i13, -1, "com.baicizhan.main.activity.mytab.task.testC (UiTasks.kt:436)");
            }
            qb.c.i("GAO", "B " + i11, new Object[0]);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.k0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 W;
                    W = r0.W(i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return W;
                }
            });
        }
    }

    public static final g2 W(int i11, int i12, Composer composer, int i13) {
        V(i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void X(@m80.k final com.baicizhan.main.activity.mytab.task.data.i task, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(task, "task");
        Composer startRestartGroup = composer.startRestartGroup(-1913865792);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(task) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1913865792, i12, -1, "com.baicizhan.main.activity.mytab.task.testItem (UiTasks.kt:404)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(task.m(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, 0, 0, 131070);
            qb.c.i("GAO", String.valueOf(task.o()), new Object[0]);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.h0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 Y;
                    Y = r0.Y(com.baicizhan.main.activity.mytab.task.data.i.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Y;
                }
            });
        }
    }

    public static final g2 Y(com.baicizhan.main.activity.mytab.task.data.i iVar, int i11, Composer composer, int i12) {
        X(iVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Z(@m80.k final List<com.baicizhan.main.activity.mytab.task.data.i> tasks, @m80.l Composer composer, final int i11) {
        kotlin.jvm.internal.g0.p(tasks, "tasks");
        Composer startRestartGroup = composer.startRestartGroup(551451047);
        int i12 = (i11 & 6) == 0 ? (startRestartGroup.changedInstance(tasks) ? 4 : 2) | i11 : i11;
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(551451047, i12, -1, "com.baicizhan.main.activity.mytab.task.testTask (UiTasks.kt:392)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1484912699);
            for (com.baicizhan.main.activity.mytab.task.data.i iVar : tasks) {
                qb.c.i("GAO", iVar.o() + " + " + iVar.hashCode(), new Object[0]);
                startRestartGroup.startMovableGroup(-1484909857, Integer.valueOf(iVar.o()));
                X(iVar, startRestartGroup, 0);
                startRestartGroup.endMovableGroup();
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.o0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 a02;
                    a02 = r0.a0(tasks, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return a02;
                }
            });
        }
    }

    public static final g2 a0(List list, int i11, Composer composer, int i12) {
        Z(list, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void b0(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-2049237131);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049237131, i11, -1, "com.baicizhan.main.activity.mytab.task.testTaskUi (UiTasks.kt:94)");
            }
            bk.k.e(null, null, null, k.f18843a.e(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.d0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 c02;
                    c02 = r0.c0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return c02;
                }
            });
        }
    }

    public static final g2 c0(int i11, Composer composer, int i12) {
        b0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(@m80.l androidx.compose.ui.Modifier r28, @m80.k final java.lang.String r29, long r30, @m80.l androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.task.r0.t(androidx.compose.ui.Modifier, java.lang.String, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 u(Modifier modifier, String str, long j11, int i11, int i12, Composer composer, int i13) {
        t(modifier, str, j11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void v(@m80.l Modifier modifier, @m80.k final le.b coinInfo, @m80.k final x00.l<? super Integer, g2> todayNewShown, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(coinInfo, "coinInfo");
        kotlin.jvm.internal.g0.p(todayNewShown, "todayNewShown");
        Composer startRestartGroup = composer.startRestartGroup(142523822);
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
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(coinInfo) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(todayNewShown) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(142523822, i13, -1, "com.baicizhan.main.activity.mytab.task.Coin (UiTasks.kt:142)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            final Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            if (coinInfo.g()) {
                startRestartGroup.startReplaceGroup(-1801479116);
            } else {
                startRestartGroup.startReplaceGroup(-1795242846);
                Integer valueOf = Integer.valueOf(coinInfo.h());
                boolean z11 = ((i13 & 896) == 256) | ((i13 & 112) == 32);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z11 || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new a(todayNewShown, coinInfo, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                EffectsKt.LaunchedEffect(valueOf, (x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_mytab_coin, startRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifier5 = modifier4;
            TextKt.m1845Text4IGK_g(x.g(Integer.valueOf(coinInfo.f())), PaddingKt.m728paddingVpY3zN4$default(companion3, Dp.m5115constructorimpl(6), 0.0f, 2, null), bk.b.x(), bk.d.n(), (FontStyle) null, (FontWeight) null, yj.a.a(R.font.din_black_italic), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 3504, 0, 130992);
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.my_tab_coin, startRestartGroup, 6), (Modifier) null, bk.b.x(), bk.d.m(), (FontStyle) null, FontWeight.Companion.getMedium(), bk.a.a(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 1772928, 0, 130962);
            startRestartGroup = startRestartGroup;
            Modifier m685offsetVpY3zN4 = OffsetKt.m685offsetVpY3zN4(companion3, Dp.m5115constructorimpl(-24), Dp.m5115constructorimpl(-17));
            boolean w11 = w(mutableState);
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.6f, 711.0f, null, 4, null);
            boolean changed = startRestartGroup.changed(density);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.p0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        int y11;
                        y11 = r0.y(Density.this, ((Integer) obj).intValue());
                        return Integer.valueOf(y11);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            EnterTransition plus = EnterExitTransitionKt.slideInVertically(spring$default, (x00.l) rememberedValue3).plus(EnterExitTransitionKt.fadeIn$default(null, 0.3f, 1, null));
            SpringSpec spring$default2 = AnimationSpecKt.spring$default(0.6f, 711.0f, null, 4, null);
            boolean changed2 = startRestartGroup.changed(density);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.activity.mytab.task.q0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        int z12;
                        z12 = r0.z(Density.this, ((Integer) obj).intValue());
                        return Integer.valueOf(z12);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, w11, m685offsetVpY3zN4, plus, EnterExitTransitionKt.slideOutVertically(spring$default2, (x00.l) rememberedValue4).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(2046882034, true, new x00.q() { // from class: com.baicizhan.main.activity.mytab.task.z
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 A;
                    A = r0.A(le.b.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return A;
                }
            }, startRestartGroup, 54), startRestartGroup, 1573254, 16);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.a0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 B;
                    B = r0.B(Modifier.this, coinInfo, todayNewShown, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            });
        }
    }

    public static final boolean w(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void x(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final int y(Density density, int i11) {
        return density.mo371roundToPx0680j_4(Dp.m5115constructorimpl(12));
    }

    public static final int z(Density density, int i11) {
        return density.mo371roundToPx0680j_4(Dp.m5115constructorimpl(12));
    }
}
