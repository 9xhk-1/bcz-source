package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.CheckboxKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nKeyframe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyframe.kt\ncom/baicizhan/main/home/player/KeyframeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 15 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 18 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 19 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,564:1\n1247#2,6:565\n1247#2,3:571\n1250#2,3:576\n1247#2,3:579\n1250#2,3:584\n1247#2,6:621\n1247#2,6:627\n1247#2,6:633\n1247#2,6:639\n1247#2,6:645\n1247#2,6:651\n1247#2,6:694\n1247#2,6:700\n1247#2,6:707\n1247#2,6:752\n1247#2,6:799\n1247#2,6:809\n1247#2,6:830\n1247#2,3:836\n1250#2,3:841\n1247#2,3:844\n1250#2,3:849\n1247#2,6:894\n1247#2,6:900\n1247#2,6:906\n1247#2,6:949\n1247#2,6:955\n30#3:574\n30#3:582\n30#3:839\n30#3:847\n80#4:575\n80#4:583\n85#4:589\n90#4:592\n53#4,3:594\n53#4,3:598\n53#4,3:602\n53#4,3:606\n53#4,3:610\n53#4,3:614\n53#4,3:618\n60#4:821\n70#4:824\n53#4,3:827\n80#4:840\n80#4:848\n85#4:854\n90#4:857\n53#4,3:859\n53#4,3:863\n53#4,3:867\n53#4,3:871\n53#4,3:875\n53#4,3:879\n53#4,3:883\n53#4,3:887\n53#4,3:891\n85#4:966\n90#4:968\n60#4:973\n70#4:976\n80#4:978\n60#4:981\n70#4:984\n80#4:986\n85#4:988\n90#4:990\n60#4:992\n70#4:995\n80#4:997\n61#5:587\n54#5:588\n63#5:590\n59#5:591\n61#5:852\n54#5:853\n63#5:855\n59#5:856\n54#5:965\n59#5:967\n54#5:987\n59#5:989\n30#6:593\n30#6:597\n30#6:601\n30#6:605\n30#6:609\n30#6:613\n30#6:617\n30#6:826\n30#6:858\n30#6:862\n30#6:866\n30#6:870\n30#6:874\n30#6:878\n30#6:882\n30#6:886\n30#6:890\n70#7:657\n67#7,9:658\n77#7:819\n70#7:912\n67#7,9:913\n77#7:964\n79#8,6:667\n86#8,3:682\n89#8,2:691\n79#8,6:725\n86#8,3:740\n89#8,2:749\n93#8:760\n79#8,6:772\n86#8,3:787\n89#8,2:796\n93#8:807\n93#8:818\n79#8,6:922\n86#8,3:937\n89#8,2:946\n93#8:963\n347#9,9:673\n356#9:693\n347#9,9:731\n356#9:751\n357#9,2:758\n347#9,9:778\n356#9:798\n357#9,2:805\n357#9,2:816\n347#9,9:928\n356#9:948\n357#9,2:961\n4206#10,6:685\n4206#10,6:743\n4206#10,6:790\n4206#10,6:940\n1869#11:706\n1870#11:714\n113#12:713\n113#12:815\n99#13:715\n96#13,9:716\n106#13:761\n99#13:762\n96#13,9:763\n106#13:808\n65#14:820\n69#14:823\n65#14:972\n69#14:975\n65#14:991\n69#14:994\n22#15:822\n22#15:825\n22#15:974\n22#15:982\n22#15:993\n85#16:969\n113#16,2:970\n32#17:977\n32#17:985\n32#17:996\n1#18:979\n57#19:980\n61#19:983\n*S KotlinDebug\n*F\n+ 1 Keyframe.kt\ncom/baicizhan/main/home/player/KeyframeKt\n*L\n64#1:565,6\n66#1:571,3\n66#1:576,3\n67#1:579,3\n67#1:584,3\n139#1:621,6\n141#1:627,6\n144#1:633,6\n164#1:639,6\n165#1:645,6\n171#1:651,6\n193#1:694,6\n200#1:700,6\n213#1:707,6\n220#1:752,6\n225#1:799,6\n231#1:809,6\n388#1:830,6\n390#1:836,3\n390#1:841,3\n391#1:844,3\n391#1:849,3\n505#1:894,6\n508#1:900,6\n540#1:906,6\n547#1:949,6\n555#1:955,6\n66#1:574\n67#1:582\n390#1:839\n391#1:847\n66#1:575\n67#1:583\n68#1:589\n68#1:592\n84#1:594,3\n86#1:598,3\n87#1:602,3\n91#1:606,3\n93#1:610,3\n94#1:614,3\n98#1:618,3\n262#1:821\n263#1:824\n261#1:827,3\n390#1:840\n391#1:848\n392#1:854\n392#1:857\n408#1:859,3\n410#1:863,3\n411#1:867,3\n415#1:871,3\n417#1:875,3\n418#1:879,3\n422#1:883,3\n424#1:887,3\n425#1:891,3\n73#1:966\n77#1:968\n194#1:973\n194#1:976\n194#1:978\n214#1:981\n214#1:984\n214#1:986\n397#1:988\n401#1:990\n548#1:992\n548#1:995\n548#1:997\n68#1:587\n68#1:588\n68#1:590\n68#1:591\n392#1:852\n392#1:853\n392#1:855\n392#1:856\n73#1:965\n77#1:967\n397#1:987\n401#1:989\n84#1:593\n86#1:597\n87#1:601\n91#1:605\n93#1:609\n94#1:613\n98#1:617\n261#1:826\n408#1:858\n410#1:862\n411#1:866\n415#1:870\n417#1:874\n418#1:878\n422#1:882\n424#1:886\n425#1:890\n168#1:657\n168#1:658,9\n168#1:819\n536#1:912\n536#1:913,9\n536#1:964\n168#1:667,6\n168#1:682,3\n168#1:691,2\n219#1:725,6\n219#1:740,3\n219#1:749,2\n219#1:760\n224#1:772,6\n224#1:787,3\n224#1:796,2\n224#1:807\n168#1:818\n536#1:922,6\n536#1:937,3\n536#1:946,2\n536#1:963\n168#1:673,9\n168#1:693\n219#1:731,9\n219#1:751\n219#1:758,2\n224#1:778,9\n224#1:798\n224#1:805,2\n168#1:816,2\n536#1:928,9\n536#1:948\n536#1:961,2\n168#1:685,6\n219#1:743,6\n224#1:790,6\n536#1:940,6\n210#1:706\n210#1:714\n215#1:713\n232#1:815\n219#1:715\n219#1:716,9\n219#1:761\n224#1:762\n224#1:763,9\n224#1:808\n262#1:820\n263#1:823\n194#1:972\n194#1:975\n548#1:991\n548#1:994\n262#1:822\n263#1:825\n194#1:974\n214#1:982\n548#1:993\n139#1:969\n139#1:970,2\n194#1:977\n214#1:985\n548#1:996\n214#1:980\n214#1:983\n*E\n"})
/* loaded from: classes4.dex */
public final class q6 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.KeyframeKt$BatteryAnimation$1$1", f = "Keyframe.kt", i = {}, l = {TypedValues.PositionType.TYPE_POSITION_TYPE, 511}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23925a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f23926b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f23927c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f23928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Animatable<Float, AnimationVector1D> animatable, int i11, x00.a<yz.g2> aVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f23926b = animatable;
            this.f23927c = i11;
            this.f23928d = aVar;
        }

        public static final yz.g2 j(Animatable animatable) {
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f23926b, this.f23927c, this.f23928d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (r13 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f23925a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L13
                kotlin.e.n(r13)
                r9 = r12
                goto L59
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                kotlin.e.n(r13)
                goto L33
            L1f:
                kotlin.e.n(r13)
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.f23926b
                r1 = 0
                java.lang.Float r1 = l00.a.e(r1)
                r12.f23925a = r2
                java.lang.Object r13 = r13.snapTo(r1, r12)
                if (r13 != r0) goto L33
                r9 = r12
                goto L58
            L33:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.f23926b
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = l00.a.e(r13)
                int r13 = r12.f23927c
                androidx.compose.animation.core.Easing r1 = androidx.compose.animation.core.EasingKt.getLinearEasing()
                r2 = 0
                r6 = 0
                androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r13, r6, r1, r3, r2)
                com.baicizhan.main.home.player.p6 r8 = new com.baicizhan.main.home.player.p6
                r8.<init>()
                r12.f23925a = r3
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L59
            L58:
                return r0
            L59:
                androidx.compose.animation.core.AnimationResult r13 = (androidx.compose.animation.core.AnimationResult) r13
                androidx.compose.animation.core.AnimationState r13 = r13.getEndState()
                boolean r13 = androidx.compose.animation.core.AnimationStateKt.isFinished(r13)
                if (r13 == 0) goto L6a
                x00.a<yz.g2> r13 = r9.f23928d
                r13.invoke()
            L6a:
                yz.g2 r13 = yz.g2.f100423a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.q6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.KeyframeKt$FixedLottieAnimation2$1$1", f = "Keyframe.kt", i = {}, l = {146, 147}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23929a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f23930b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f23931c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Float, AnimationVector1D> animatable, int i11, MutableState<Boolean> mutableState, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f23930b = animatable;
            this.f23931c = i11;
            this.f23932d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f23930b, this.f23931c, this.f23932d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r12, 12, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        
            if (r13.snapTo(r1, r12) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f23929a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.e.n(r13)
                goto L5c
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                kotlin.e.n(r13)
                goto L39
            L1e:
                kotlin.e.n(r13)
                androidx.compose.runtime.MutableState<java.lang.Boolean> r13 = r12.f23932d
                boolean r13 = com.baicizhan.main.home.player.q6.I(r13)
                if (r13 == 0) goto L5c
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.f23930b
                r1 = 0
                java.lang.Float r1 = l00.a.e(r1)
                r12.f23929a = r2
                java.lang.Object r13 = r13.snapTo(r1, r12)
                if (r13 != r0) goto L39
                goto L5b
            L39:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.f23930b
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = l00.a.e(r13)
                int r13 = r12.f23931c
                androidx.compose.animation.core.Easing r1 = androidx.compose.animation.core.EasingKt.getLinearEasing()
                r2 = 0
                r6 = 0
                androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r13, r6, r1, r3, r2)
                r12.f23929a = r3
                r7 = 0
                r8 = 0
                r10 = 12
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L5c
            L5b:
                return r0
            L5c:
                yz.g2 r13 = yz.g2.f100423a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.q6.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final yz.g2 A(MutableState mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 B(MutableState mutableState) {
        F(mutableState, !E(mutableState));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 C(MutableState mutableState, RowScope Button, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(Button, "$this$Button");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1782939066, i11, -1, "com.baicizhan.main.home.player.FixedLottieAnimation2.<anonymous>.<anonymous> (Keyframe.kt:233)");
            }
            TextKt.m1845Text4IGK_g(E(mutableState) ? "Pause" : "Play", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 D(int i11, Composer composer, int i12) {
        u(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final boolean E(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void F(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final float G(float f11, int i11, MutableState<IntSize> mutableState) {
        return ((f11 / 1179) * i11) - (((int) (mutableState.getValue().m5290unboximpl() >> 32)) / 2);
    }

    public static final float H(float f11, int i11, MutableState<IntSize> mutableState) {
        return ((f11 / 2556) * i11) - (((int) (mutableState.getValue().m5290unboximpl() & 4294967295L)) / 2);
    }

    public static final long J(long j11, long j12, long j13, long j14, float f11) {
        float f12 = 1 - f11;
        float f13 = 3 * f12;
        return Offset.m2273plusMKHz9U(Offset.m2273plusMKHz9U(Offset.m2273plusMKHz9U(Offset.m2275timestuRUvjQ(j11, f12 * f12 * f12), Offset.m2275timestuRUvjQ(Offset.m2273plusMKHz9U(j11, j13), f12 * f13 * f11)), Offset.m2275timestuRUvjQ(Offset.m2273plusMKHz9U(j12, j14), f13 * f11 * f11)), Offset.m2275timestuRUvjQ(j12, f11 * f11 * f11));
    }

    public static final <T> Pair<b6<T>, b6<T>> K(List<b6<T>> list, int i11) {
        if (i11 < ((b6) a00.r0.G2(list)).n()) {
            return yz.h1.a(a00.r0.G2(list), a00.r0.G2(list));
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 < size) {
            int n11 = list.get(i12).n();
            int i13 = i12 + 1;
            if (i11 <= list.get(i13).n() && n11 <= i11) {
                return yz.h1.a(list.get(i12), list.get(i13));
            }
            i12 = i13;
        }
        return yz.h1.a(a00.r0.u3(list), a00.r0.u3(list));
    }

    public static final float L(@m80.k List<b6<Float>> keyframes, int i11) {
        kotlin.jvm.internal.g0.p(keyframes, "keyframes");
        Pair K = K(keyframes, i11);
        b6 b6Var = (b6) K.component1();
        b6 b6Var2 = (b6) K.component2();
        float H = g10.u.H((i11 - b6Var.n()) / (b6Var2.n() - b6Var.n()), 0.0f, 1.0f);
        Easing k11 = b6Var.k();
        if (k11 != null) {
            H = k11.transform(H);
        }
        return MathHelpersKt.lerp(((Number) b6Var.o()).floatValue(), ((Number) b6Var2.o()).floatValue(), H);
    }

    public static final long M(List<b6<Offset>> list, int i11) {
        Pair K = K(list, i11);
        b6 b6Var = (b6) K.component1();
        b6 b6Var2 = (b6) K.component2();
        float H = g10.u.H((i11 - b6Var.n()) / (b6Var2.n() - b6Var.n()), 0.0f, 1.0f);
        Easing k11 = b6Var.k();
        if (k11 != null) {
            H = k11.transform(H);
        }
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (((Offset) b6Var.o()).m2278unboximpl() >> 32)), Float.intBitsToFloat((int) (((Offset) b6Var2.o()).m2278unboximpl() >> 32)), H);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (((Offset) b6Var.o()).m2278unboximpl() & 4294967295L)), Float.intBitsToFloat((int) (((Offset) b6Var2.o()).m2278unboximpl() & 4294967295L)), H);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(lerp2) & 4294967295L) | (Float.floatToRawIntBits(lerp) << 32));
    }

    public static final long N(@m80.k List<b6<Offset>> keyframes, int i11) {
        kotlin.jvm.internal.g0.p(keyframes, "keyframes");
        Pair K = K(keyframes, i11);
        b6 b6Var = (b6) K.component1();
        b6 b6Var2 = (b6) K.component2();
        float n11 = (i11 - b6Var.n()) / (b6Var2.n() - b6Var.n());
        Easing k11 = b6Var.k();
        if (k11 != null) {
            n11 = k11.transform(n11);
        }
        float f11 = n11;
        return (b6Var.m() == null || b6Var.l() == null) ? b6Var.m() != null ? O(((Offset) b6Var.o()).m2278unboximpl(), ((Offset) b6Var.m()).m2278unboximpl(), ((Offset) b6Var2.o()).m2278unboximpl(), f11) : b6Var2.l() != null ? O(((Offset) b6Var.o()).m2278unboximpl(), ((Offset) b6Var2.l()).m2278unboximpl(), ((Offset) b6Var2.o()).m2278unboximpl(), f11) : OffsetKt.m2291lerpWko1d7g(((Offset) b6Var.o()).m2278unboximpl(), ((Offset) b6Var2.o()).m2278unboximpl(), f11) : J(((Offset) b6Var.o()).m2278unboximpl(), ((Offset) b6Var2.o()).m2278unboximpl(), ((Offset) b6Var.m()).m2278unboximpl(), ((Offset) b6Var.l()).m2278unboximpl(), f11);
    }

    public static final long O(long j11, long j12, long j13, float f11) {
        float f12 = 1 - f11;
        return Offset.m2273plusMKHz9U(Offset.m2273plusMKHz9U(Offset.m2275timestuRUvjQ(j11, f12 * f12), Offset.m2275timestuRUvjQ(j12, 2 * f12 * f11)), Offset.m2275timestuRUvjQ(j13, f11 * f11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void n(@m80.k final BoxScope BatteryAnimation, @m80.l Modifier modifier, @DrawableRes final int i11, final long j11, @m80.k final x00.a<yz.g2> onFinish, @m80.l Composer composer, final int i12, final int i13) {
        int i14;
        Composer composer2;
        final Modifier modifier2;
        Float f11;
        j00.c cVar;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        kotlin.jvm.internal.g0.p(BatteryAnimation, "$this$BatteryAnimation");
        kotlin.jvm.internal.g0.p(onFinish, "onFinish");
        Composer startRestartGroup = composer.startRestartGroup(1184431714);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 48;
        } else if ((i12 & 48) == 0) {
            i14 = (startRestartGroup.changed(modifier) ? 32 : 16) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= startRestartGroup.changedInstance(onFinish) ? 16384 : 8192;
        }
        int i16 = i14;
        if (startRestartGroup.shouldExecute((i16 & 9361) != 9360, i16 & 1)) {
            Modifier modifier3 = i15 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184431714, i16, -1, "com.baicizhan.main.home.player.BatteryAnimation (Keyframe.kt:384)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Modifier modifier4 = modifier3;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                long j12 = 0;
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.m5281constructorimpl((j12 << 32) | (j12 & 4294967295L))), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                f11 = valueOf2;
                long j13 = 0;
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.m5281constructorimpl((j13 << 32) | (j13 & 4294967295L))), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                f11 = valueOf2;
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            long m5290unboximpl = ((IntSize) mutableState2.getValue()).m5290unboximpl();
            int i17 = (int) (m5290unboximpl >> 32);
            int i18 = (int) (m5290unboximpl & 4294967295L);
            int i19 = ((Boolean) mutableState.getValue()).booleanValue() ? 10 : 1;
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(s(599.0f, i17, mutableState3)) << 32) | (Float.floatToRawIntBits(t(1686.0f, i18, mutableState3)) & 4294967295L));
            CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.333f, 0.0f, 0.667f, 1.0f);
            float s11 = s(-9.353f, i17, mutableState3);
            long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(t(92.804f, i18, mutableState3)) & 4294967295L) | (Float.floatToRawIntBits(s11) << 32));
            float s12 = s(55.297f, i17, mutableState3);
            b6 b6Var = new b6(0, Offset.m2257boximpl(m2260constructorimpl), cubicBezierEasing, Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(t(257.72f, i18, mutableState3)) & 4294967295L) | (Float.floatToRawIntBits(s12) << 32))), Offset.m2257boximpl(m2260constructorimpl2));
            int i21 = i19 * 167;
            float s13 = s(599.0f, i17, mutableState3);
            long m2260constructorimpl3 = Offset.m2260constructorimpl((Float.floatToRawIntBits(t(1686.0f, i18, mutableState3)) & 4294967295L) | (Float.floatToRawIntBits(s13) << 32));
            b6 b6Var2 = new b6(i21, Offset.m2257boximpl(m2260constructorimpl3), new CubicBezierEasing(0.333f, 0.0f, 0.667f, 1.0f), Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(s(55.297f, i17, mutableState3)) << 32) | (Float.floatToRawIntBits(t(257.72f, i18, mutableState3)) & 4294967295L))), Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(s(-9.353f, i17, mutableState3)) << 32) | (Float.floatToRawIntBits(t(92.804f, i18, mutableState3)) & 4294967295L))));
            int i22 = i19 * 334;
            float s14 = s(855.0f, i17, mutableState3);
            Offset m2257boximpl = Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(t(1727.0f, i18, mutableState3)) & 4294967295L) | (Float.floatToRawIntBits(s14) << 32)));
            CubicBezierEasing cubicBezierEasing2 = new CubicBezierEasing(0.7f, 0.0f, 0.85f, 1.0f);
            Offset m2257boximpl2 = Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(s(-368.125f, i17, mutableState3)) << 32) | (Float.floatToRawIntBits(t(582.52f, i18, mutableState3)) & 4294967295L)));
            float s15 = s(26.885f, i17, mutableState3);
            b6 b6Var3 = new b6(i22, m2257boximpl, cubicBezierEasing2, m2257boximpl2, Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(t(609.065f, i18, mutableState3)) & 4294967295L) | (Float.floatToRawIntBits(s15) << 32))));
            int i23 = i19 * 900;
            List Q = a00.h0.Q(b6Var, b6Var2, b6Var3, new b6(i23, Offset.m2257boximpl(j11), new CubicBezierEasing(0.524f, 1.0f, 1.0f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            List Q2 = a00.h0.Q(new b6(0, Float.valueOf(7.0f), new CubicBezierEasing(0.333f, 0.0f, 0.667f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i21, Float.valueOf(7.0f), new CubicBezierEasing(0.333f, 0.0f, 0.667f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i22, Float.valueOf(-44.0f), new CubicBezierEasing(0.7f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i23, Float.valueOf(360.0f), (Easing) null, (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            Float f12 = f11;
            List Q3 = a00.h0.Q(new b6(0, valueOf, new CubicBezierEasing(0.602f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i21, Float.valueOf(2.0f), new CubicBezierEasing(0.602f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i23, f12, (Easing) null, (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            List Q4 = a00.h0.Q(new b6(0, valueOf, new CubicBezierEasing(0.602f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i21, f12, new CubicBezierEasing(0.602f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i23, f12, (Easing) null, (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                cVar = null;
                rememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                cVar = null;
            }
            Animatable animatable = (Animatable) rememberedValue4;
            boolean changedInstance = startRestartGroup.changedInstance(animatable) | startRestartGroup.changed(i23) | ((i16 & 57344) == 16384);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new a(animatable, i23, onFinish, cVar);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.LaunchedEffect(animatable, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue5, startRestartGroup, Animatable.$stable);
            int floatValue = (int) (((Number) animatable.getValue()).floatValue() * 900 * i19);
            final long N = N(Q, floatValue);
            float L = L(Q2, floatValue);
            float L2 = L(Q3, floatValue);
            float L3 = L(Q4, floatValue);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, cVar);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.l() { // from class: com.baicizhan.main.home.player.o6
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 o11;
                        o11 = q6.o(MutableState.this, (IntSize) obj);
                        return o11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            Modifier then = modifier4.then(OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default, (x00.l) rememberedValue6));
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(i11, startRestartGroup, (i16 >> 6) & 14);
            Modifier align = boxScopeInstance.align(companion2, companion3.getTopStart());
            boolean changed = startRestartGroup.changed(N);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.l() { // from class: com.baicizhan.main.home.player.d6
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        IntOffset p11;
                        p11 = q6.p(N, (Density) obj);
                        return p11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            Modifier alpha = AlphaKt.alpha(RotateKt.rotate(ScaleKt.scale(androidx.compose.foundation.layout.OffsetKt.offset(align, (x00.l) rememberedValue7), L2), L), L3);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l() { // from class: com.baicizhan.main.home.player.e6
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 q11;
                        q11 = q6.q(MutableState.this, (IntSize) obj);
                        return q11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ImageKt.Image(painterResource, (String) null, OnRemeasuredModifierKt.onSizeChanged(alpha, (x00.l) rememberedValue8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.f6
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 r11;
                    r11 = q6.r(BoxScope.this, modifier2, i11, j11, onFinish, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            });
        }
    }

    public static final yz.g2 o(MutableState mutableState, IntSize intSize) {
        mutableState.setValue(intSize);
        return yz.g2.f100423a;
    }

    public static final IntOffset p(long j11, Density offset) {
        kotlin.jvm.internal.g0.p(offset, "$this$offset");
        return IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((((int) Float.intBitsToFloat((int) (j11 >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (j11 & 4294967295L))) & 4294967295L)));
    }

    public static final yz.g2 q(MutableState mutableState, IntSize intSize) {
        mutableState.setValue(intSize);
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(BoxScope boxScope, Modifier modifier, int i11, long j11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        n(boxScope, modifier, i11, j11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    public static final float s(float f11, int i11, MutableState<IntSize> mutableState) {
        return ((f11 / 1179) * i11) - (((int) (mutableState.getValue().m5290unboximpl() >> 32)) / 2);
    }

    public static final float t(float f11, int i11, MutableState<IntSize> mutableState) {
        return ((f11 / 2556) * i11) - (((int) (mutableState.getValue().m5290unboximpl() & 4294967295L)) / 2);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 852, widthDp = 393)
    public static final void u(@m80.l Composer composer, final int i11) {
        Composer composer2;
        int i12;
        Object obj;
        Object obj2;
        final MutableState mutableState;
        Composer startRestartGroup = composer.startRestartGroup(-1577489340);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1577489340, i11, -1, "com.baicizhan.main.home.player.FixedLottieAnimation2 (Keyframe.kt:60)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                long j11 = 0;
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32))), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                long j12 = 0;
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32))), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue3;
            long m5290unboximpl = ((IntSize) mutableState3.getValue()).m5290unboximpl();
            int i13 = (int) (m5290unboximpl >> 32);
            int i14 = (int) (m5290unboximpl & 4294967295L);
            int i15 = ((Boolean) mutableState2.getValue()).booleanValue() ? 10 : 1;
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(G(599.0f, i13, mutableState4)) << 32) | (Float.floatToRawIntBits(H(1686.0f, i14, mutableState4)) & 4294967295L));
            CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.333f, 0.0f, 0.667f, 1.0f);
            float G = G(-9.353f, i13, mutableState4);
            long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(H(92.804f, i14, mutableState4)) & 4294967295L) | (Float.floatToRawIntBits(G) << 32));
            float G2 = G(55.297f, i13, mutableState4);
            b6 b6Var = new b6(0, Offset.m2257boximpl(m2260constructorimpl), cubicBezierEasing, Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(H(257.72f, i14, mutableState4)) & 4294967295L) | (Float.floatToRawIntBits(G2) << 32))), Offset.m2257boximpl(m2260constructorimpl2));
            int i16 = i15 * 167;
            float G3 = G(855.0f, i13, mutableState4);
            Offset m2257boximpl = Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(H(1727.0f, i14, mutableState4)) & 4294967295L) | (Float.floatToRawIntBits(G3) << 32)));
            CubicBezierEasing cubicBezierEasing2 = new CubicBezierEasing(0.7f, 0.0f, 0.85f, 1.0f);
            float G4 = G(-368.125f, i13, mutableState4);
            b6 b6Var2 = new b6(i16, m2257boximpl, cubicBezierEasing2, Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(H(582.52f, i14, mutableState4)) & 4294967295L) | (Float.floatToRawIntBits(G4) << 32))), Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(G(26.885f, i13, mutableState4)) << 32) | (Float.floatToRawIntBits(H(609.065f, i14, mutableState4)) & 4294967295L))));
            int i17 = i15 * 733;
            float G5 = G(256.0f, i13, mutableState4);
            List Q = a00.h0.Q(b6Var, b6Var2, new b6(i17, Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(H(258.0f, i14, mutableState4)) & 4294967295L) | (Float.floatToRawIntBits(G5) << 32))), new CubicBezierEasing(0.524f, 1.0f, 1.0f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            List Q2 = a00.h0.Q(new b6(0, Float.valueOf(7.0f), new CubicBezierEasing(0.333f, 0.0f, 0.667f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i16, Float.valueOf(-44.0f), new CubicBezierEasing(0.7f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i17, Float.valueOf(360.0f), (Easing) null, (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            List Q3 = a00.h0.Q(new b6(0, Float.valueOf(2.0f), new CubicBezierEasing(0.602f, 0.0f, 0.85f, 1.0f), (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null), new b6(i17, Float.valueOf(1.0f), (Easing) null, (Object) null, (Object) null, 24, (kotlin.jvm.internal.v) null));
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                i12 = 2;
                obj = null;
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                i12 = 2;
                obj = null;
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i12, obj);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Animatable animatable = (Animatable) rememberedValue5;
            Boolean valueOf = Boolean.valueOf(E(mutableState5));
            boolean changedInstance = startRestartGroup.changedInstance(animatable) | startRestartGroup.changed(i17);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new b(animatable, i17, mutableState5, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            EffectsKt.LaunchedEffect(valueOf, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
            int floatValue = (int) (((Number) animatable.getValue()).floatValue() * 733 * i15);
            final long N = N(Q, floatValue);
            float L = L(Q2, floatValue);
            float L2 = L(Q3, floatValue);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue7;
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
                obj2 = null;
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            } else {
                obj2 = null;
            }
            final MutableState mutableState6 = (MutableState) rememberedValue8;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj2);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = new x00.l() { // from class: com.baicizhan.main.home.player.c6
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        yz.g2 v11;
                        v11 = q6.v(MutableState.this, (IntSize) obj3);
                        return v11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default, (x00.l) rememberedValue9);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_battery_blue, startRestartGroup, 6);
            Modifier align = boxScopeInstance.align(companion2, companion3.getTopStart());
            boolean changed = startRestartGroup.changed(N);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = new x00.l() { // from class: com.baicizhan.main.home.player.g6
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        IntOffset w11;
                        w11 = q6.w(N, snapshotStateList, (Density) obj3);
                        return w11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            Modifier rotate = RotateKt.rotate(ScaleKt.scale(androidx.compose.foundation.layout.OffsetKt.offset(align, (x00.l) rememberedValue10), L2), L);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = new x00.l() { // from class: com.baicizhan.main.home.player.h6
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        yz.g2 x11;
                        x11 = q6.x(MutableState.this, (IntSize) obj3);
                        return x11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            ImageKt.Image(painterResource, (String) null, OnRemeasuredModifierKt.onSizeChanged(rotate, (x00.l) rememberedValue11), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            if (((Boolean) mutableState6.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(-328568850);
                Iterator<T> it = snapshotStateList.iterator();
                while (it.hasNext()) {
                    final long m5252unboximpl = ((IntOffset) it.next()).m5252unboximpl();
                    Modifier align2 = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopStart());
                    boolean changed2 = startRestartGroup.changed(m5252unboximpl);
                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue12 == Composer.Companion.getEmpty()) {
                        rememberedValue12 = new x00.l() { // from class: com.baicizhan.main.home.player.i6
                            @Override // x00.l
                            public final Object invoke(Object obj3) {
                                IntOffset y11;
                                y11 = q6.y(m5252unboximpl, mutableState4, (Density) obj3);
                                return y11;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    BoxKt.Box(BackgroundKt.m235backgroundbw27NRU$default(SizeKt.m773size3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(align2, (x00.l) rememberedValue12), Dp.m5115constructorimpl(2)), Color.Companion.m2543getRed0d7_KjU(), null, 2, null), startRestartGroup, 0);
                }
            } else {
                startRestartGroup.startReplaceGroup(-335832584);
            }
            startRestartGroup.endReplaceGroup();
            Alignment.Companion companion5 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion5.getCenterVertically();
            Modifier.Companion companion6 = Modifier.Companion;
            Modifier align3 = boxScopeInstance.align(companion6, companion5.getBottomStart());
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, startRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align3);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor2 = companion7.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion7.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            Composer.Companion companion8 = Composer.Companion;
            if (rememberedValue13 == companion8.getEmpty()) {
                rememberedValue13 = new x00.l() { // from class: com.baicizhan.main.home.player.j6
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        yz.g2 z11;
                        z11 = q6.z(MutableState.this, ((Boolean) obj3).booleanValue());
                        return z11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            CheckboxKt.Checkbox(booleanValue, (x00.l) rememberedValue13, null, false, null, null, startRestartGroup, 48, 60);
            TextKt.m1845Text4IGK_g("path", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 6, 0, 131070);
            startRestartGroup.endNode();
            Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
            Modifier align4 = boxScopeInstance.align(companion6, companion5.getBottomCenter());
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, startRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align4);
            x00.a<ComposeUiNode> constructor3 = companion7.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion7.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion7.getSetModifier());
            boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (rememberedValue14 == companion8.getEmpty()) {
                rememberedValue14 = new x00.l() { // from class: com.baicizhan.main.home.player.k6
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        yz.g2 A;
                        A = q6.A(MutableState.this, ((Boolean) obj3).booleanValue());
                        return A;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            CheckboxKt.Checkbox(booleanValue2, (x00.l) rememberedValue14, null, false, null, null, startRestartGroup, 48, 60);
            TextKt.m1845Text4IGK_g("times", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 6, 0, 131070);
            startRestartGroup.endNode();
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == companion8.getEmpty()) {
                mutableState = mutableState5;
                rememberedValue15 = new x00.a() { // from class: com.baicizhan.main.home.player.l6
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B;
                        B = q6.B(MutableState.this);
                        return B;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue15);
            } else {
                mutableState = mutableState5;
            }
            composer2 = startRestartGroup;
            ButtonKt.Button((x00.a) rememberedValue15, PaddingKt.m726padding3ABfNKs(boxScopeInstance.align(companion6, companion5.getBottomEnd()), Dp.m5115constructorimpl(4)), false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1782939066, true, new x00.q() { // from class: com.baicizhan.main.home.player.m6
                @Override // x00.q
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    yz.g2 C;
                    C = q6.C(MutableState.this, (RowScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                    return C;
                }
            }, startRestartGroup, 54), composer2, 805306374, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.n6
                @Override // x00.p
                public final Object invoke(Object obj3, Object obj4) {
                    yz.g2 D;
                    D = q6.D(i11, (Composer) obj3, ((Integer) obj4).intValue());
                    return D;
                }
            });
        }
    }

    public static final yz.g2 v(MutableState mutableState, IntSize intSize) {
        mutableState.setValue(intSize);
        return yz.g2.f100423a;
    }

    public static final IntOffset w(long j11, SnapshotStateList snapshotStateList, Density offset) {
        kotlin.jvm.internal.g0.p(offset, "$this$offset");
        IntOffset m5234boximpl = IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((((int) Float.intBitsToFloat((int) (j11 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j11 >> 32))) << 32)));
        snapshotStateList.add(IntOffset.m5234boximpl(m5234boximpl.m5252unboximpl()));
        return m5234boximpl;
    }

    public static final yz.g2 x(MutableState mutableState, IntSize intSize) {
        mutableState.setValue(intSize);
        return yz.g2.f100423a;
    }

    public static final IntOffset y(long j11, MutableState mutableState, Density offset) {
        kotlin.jvm.internal.g0.p(offset, "$this$offset");
        return IntOffset.m5234boximpl(IntOffset.m5247plusqkQi6aY(j11, IntOffset.m5237constructorimpl((((int) Float.intBitsToFloat((int) (r8 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (IntSizeKt.m5298toSizeozmzZPI(IntSize.m5282divYEO4UFw(((IntSize) mutableState.getValue()).m5290unboximpl(), 2)) >> 32))) << 32))));
    }

    public static final yz.g2 z(MutableState mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
        return yz.g2.f100423a;
    }
}
