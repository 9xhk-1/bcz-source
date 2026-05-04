package com.baicizhan.main.home.player;

import android.util.Log;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathAnimation.kt\ncom/baicizhan/main/home/player/PathAnimationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 12 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 13 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 14 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 15 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 16 Composer.kt\nandroidx/compose/runtime/Updater\n+ 17 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 18 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,465:1\n75#2:466\n75#2:479\n113#3:467\n113#3:468\n113#3:481\n30#4:469\n30#4:506\n30#4:553\n30#4:564\n30#4:568\n30#4:578\n53#5,3:470\n53#5,3:507\n80#5:532\n80#5:540\n85#5:546\n90#5:549\n53#5,3:554\n53#5,3:565\n53#5,3:569\n60#5:573\n70#5:576\n53#5,3:579\n60#5:676\n85#5:679\n70#5:681\n90#5:684\n60#5:686\n70#5:689\n53#5,3:692\n1247#6,6:473\n1247#6,6:482\n1247#6,6:488\n1247#6,6:494\n1247#6,6:500\n1247#6,6:510\n1247#6,6:516\n1247#6,6:522\n1247#6,3:528\n1250#6,3:533\n1247#6,3:536\n1250#6,3:541\n1247#6,3:550\n1250#6,3:557\n1247#6,6:593\n1247#6,6:604\n1247#6,6:610\n1247#6,6:616\n1247#6,6:659\n1247#6,6:665\n1#7:480\n30#8:531\n30#8:539\n61#9:544\n54#9:545\n63#9:547\n59#9:548\n54#9:678\n59#9:683\n1573#10:560\n1604#10,3:561\n1607#10:582\n1573#10:583\n1604#10,4:584\n1573#10:588\n1604#10,4:589\n1573#10:599\n1604#10,4:600\n65#11:572\n69#11:575\n65#11:685\n69#11:688\n22#12:574\n22#12:577\n22#12:677\n22#12:682\n22#12:687\n22#12:690\n70#13:622\n67#13,9:623\n77#13:674\n79#14,6:632\n86#14,3:647\n89#14,2:656\n93#14:673\n347#15,9:638\n356#15:658\n357#15,2:671\n4206#16,6:650\n57#17:675\n61#17:680\n33#18:691\n*S KotlinDebug\n*F\n+ 1 PathAnimation.kt\ncom/baicizhan/main/home/player/PathAnimationKt\n*L\n91#1:466\n131#1:479\n93#1:467\n94#1:468\n131#1:481\n92#1:469\n155#1:506\n210#1:553\n261#1:564\n269#1:568\n282#1:578\n92#1:470,3\n155#1:507,3\n190#1:532\n191#1:540\n192#1:546\n192#1:549\n210#1:554,3\n261#1:565,3\n269#1:569,3\n283#1:573\n284#1:576\n282#1:579,3\n202#1:676\n202#1:679\n207#1:681\n207#1:684\n454#1:686\n455#1:689\n50#1:692,3\n127#1:473,6\n132#1:482,6\n133#1:488,6\n139#1:494,6\n148#1:500,6\n156#1:510,6\n166#1:516,6\n188#1:522,6\n190#1:528,3\n190#1:533,3\n191#1:536,3\n191#1:541,3\n210#1:550,3\n210#1:557,3\n365#1:593,6\n401#1:604,6\n404#1:610,6\n436#1:616,6\n450#1:659,6\n460#1:665,6\n190#1:531\n191#1:539\n192#1:544\n192#1:545\n192#1:547\n192#1:548\n202#1:678\n207#1:683\n254#1:560\n254#1:561,3\n254#1:582\n318#1:583\n318#1:584,4\n346#1:588\n346#1:589,4\n389#1:599\n389#1:600,4\n283#1:572\n284#1:575\n454#1:685\n455#1:688\n283#1:574\n284#1:577\n202#1:677\n207#1:682\n454#1:687\n455#1:690\n432#1:622\n432#1:623,9\n432#1:674\n432#1:632,6\n432#1:647,3\n432#1:656,2\n432#1:673\n432#1:638,9\n432#1:658\n432#1:671,2\n432#1:650,6\n202#1:675\n207#1:680\n50#1:691\n*E\n"})
/* loaded from: classes4.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f24340a = Size.m2328constructorimpl((Float.floatToRawIntBits(1178.0f) << 32) | (Float.floatToRawIntBits(2556.0f) & 4294967295L));

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Pair<Float, Float> f24341b = yz.h1.a(Float.valueOf(559.0f), Float.valueOf(1623.0f));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.PathAnimationKt$CoinsAnimation$4$1", f = "PathAnimation.kt", i = {0, 0}, l = {168}, m = "invokeSuspend", n = {"it", "$i$a$-repeat-PathAnimationKt$CoinsAnimation$4$1$1"}, s = {"I$2", "I$3"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24342a;

        /* renamed from: b, reason: collision with root package name */
        public int f24343b;

        /* renamed from: c, reason: collision with root package name */
        public int f24344c;

        /* renamed from: d, reason: collision with root package name */
        public int f24345d;

        /* renamed from: e, reason: collision with root package name */
        public Object f24346e;

        /* renamed from: f, reason: collision with root package name */
        public int f24347f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f24348g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Boolean> f24349h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, SnapshotStateMap<Integer, Boolean> snapshotStateMap, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f24348g = i11;
            this.f24349h = snapshotStateMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f24348g, this.f24349h, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0044 -> B:5:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f24347f
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                int r1 = r9.f24344c
                int r4 = r9.f24343b
                int r5 = r9.f24342a
                java.lang.Object r6 = r9.f24346e
                androidx.compose.runtime.snapshots.SnapshotStateMap r6 = (androidx.compose.runtime.snapshots.SnapshotStateMap) r6
                kotlin.e.n(r10)
                goto L45
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.e.n(r10)
                int r10 = r9.f24348g
                int r10 = r10 - r3
                androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.Integer, java.lang.Boolean> r1 = r9.f24349h
                r5 = r10
                r6 = r1
                r1 = r2
            L2d:
                if (r1 >= r5) goto L53
                r9.f24346e = r6
                r9.f24342a = r5
                r9.f24343b = r1
                r9.f24344c = r1
                r9.f24345d = r2
                r9.f24347f = r3
                r7 = 150(0x96, double:7.4E-322)
                java.lang.Object r10 = c40.a1.b(r7, r9)
                if (r10 != r0) goto L44
                return r0
            L44:
                r4 = r1
            L45:
                java.lang.Integer r10 = l00.a.f(r1)
                java.lang.Boolean r1 = l00.a.a(r3)
                r6.put(r10, r1)
                int r1 = r4 + 1
                goto L2d
            L53:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.y7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.PathAnimationKt$PathAnimation$4$1", f = "PathAnimation.kt", i = {}, l = {406, 407}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24350a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f24351b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f24352c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f24353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Float, AnimationVector1D> animatable, float f11, x00.a<yz.g2> aVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f24351b = animatable;
            this.f24352c = f11;
            this.f24353d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yz.g2 j(Animatable animatable) {
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f24351b, this.f24352c, this.f24353d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
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
                int r1 = r12.f24350a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L13
                kotlin.e.n(r13)
                r9 = r12
                goto L5a
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
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r13 = r12.f24351b
                r1 = 0
                java.lang.Float r1 = l00.a.e(r1)
                r12.f24350a = r2
                java.lang.Object r13 = r13.snapTo(r1, r12)
                if (r13 != r0) goto L33
                r9 = r12
                goto L59
            L33:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r12.f24351b
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = l00.a.e(r13)
                float r13 = r12.f24352c
                int r13 = (int) r13
                androidx.compose.animation.core.Easing r1 = androidx.compose.animation.core.EasingKt.getLinearEasing()
                r2 = 0
                r6 = 0
                androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r13, r6, r1, r3, r2)
                com.baicizhan.main.home.player.z7 r8 = new com.baicizhan.main.home.player.z7
                r8.<init>()
                r12.f24350a = r3
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L5a
            L59:
                return r0
            L5a:
                androidx.compose.animation.core.AnimationResult r13 = (androidx.compose.animation.core.AnimationResult) r13
                androidx.compose.animation.core.AnimationState r13 = r13.getEndState()
                boolean r13 = androidx.compose.animation.core.AnimationStateKt.isFinished(r13)
                if (r13 == 0) goto L6b
                x00.a<yz.g2> r13 = r9.f24353d
                r13.invoke()
            L6b:
                yz.g2 r13 = yz.g2.f100423a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.y7.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final float A(float f11, int i11) {
        return f11 * i11;
    }

    public static final float B(float f11, int i11, MutableState<IntSize> mutableState) {
        return ((f11 / Float.intBitsToFloat((int) (f24340a >> 32))) * i11) - (((int) (mutableState.getValue().m5290unboximpl() >> 32)) / 2);
    }

    public static final float C(float f11, int i11) {
        return f11 * i11;
    }

    public static final float D(float f11, int i11, MutableState<IntSize> mutableState) {
        return ((f11 / Float.intBitsToFloat((int) (f24340a & 4294967295L))) * i11) - (((int) (mutableState.getValue().m5290unboximpl() & 4294967295L)) / 2);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 E(int i11, BoxScope PathAnimation, Modifier it, Composer composer, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(PathAnimation, "$this$PathAnimation");
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i12 & 48) == 0) {
            i13 = (composer.changed(it) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if (composer.shouldExecute((i13 & 145) != 144, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1522185711, i13, -1, "com.baicizhan.main.home.player.PathAnimation.<anonymous> (PathAnimation.kt:75)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer, 0), (String) null, it, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, ((i13 << 3) & 896) | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(vg.d dVar, int i11, long j11, Offset offset, boolean z11, float f11, float f12, boolean z12, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        u(dVar, i11, j11, offset, z11, f11, f12, z12, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(@m80.k final vg.d r18, final long r19, long r21, boolean r23, @m80.k final x00.a<yz.g2> r24, @m80.l androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.y7.m(vg.d, long, long, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 n(vg.d dVar, long j11, long j12, boolean z11, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        m(dVar, j11, j12, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(@m80.k final vg.d r27, final int r28, final long r29, boolean r31, @m80.l x00.l<? super java.lang.Integer, yz.g2> r32, @m80.k final x00.a<yz.g2> r33, @m80.l androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.y7.o(vg.d, int, long, boolean, x00.l, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 p(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(x00.l lVar, int i11, x00.a aVar, MutableState mutableState) {
        lVar.invoke(0);
        if (i11 == 1) {
            aVar.invoke();
        }
        mutableState.setValue(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(x00.l lVar, int i11, int i12, x00.a aVar, SnapshotStateMap snapshotStateMap) {
        lVar.invoke(Integer.valueOf(i11 + 1));
        if (i11 == i12 - 2) {
            aVar.invoke();
        }
        snapshotStateMap.put(Integer.valueOf(i11), Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(vg.d dVar, int i11, long j11, boolean z11, x00.l lVar, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        o(dVar, i11, j11, z11, lVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(@m80.k final vg.d r45, final long r46, boolean r48, long r49, @m80.l androidx.compose.ui.geometry.Offset r51, float r52, float r53, boolean r54, @m80.k x00.a<yz.g2> r55, @m80.k x00.r<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r56, @m80.l androidx.compose.runtime.Composer r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 2669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.y7.t(vg.d, long, boolean, long, androidx.compose.ui.geometry.Offset, float, float, boolean, x00.a, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(@m80.k final vg.d r20, @androidx.annotation.DrawableRes final int r21, final long r22, @m80.l androidx.compose.ui.geometry.Offset r24, boolean r25, float r26, float r27, boolean r28, @m80.k final x00.a<yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.y7.u(vg.d, int, long, androidx.compose.ui.geometry.Offset, boolean, float, float, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 v(MutableState mutableState, IntSize intSize) {
        Log.d("djx", "full-size: " + intSize);
        mutableState.setValue(intSize);
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(boolean z11, float f11, float f12, long j11, float f13, float f14, GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.mo2701setTransformOrigin__ExYCQ(z11 ? TransformOriginKt.TransformOrigin(0.0f, 0.0f) : TransformOrigin.Companion.m2900getCenterSzJe1aQ());
        float f15 = f11 * f12;
        graphicsLayer.setScaleX(f15);
        graphicsLayer.setScaleY(f15);
        graphicsLayer.setTranslationX(Float.intBitsToFloat((int) (j11 >> 32)));
        graphicsLayer.setTranslationY(Float.intBitsToFloat((int) (4294967295L & j11)));
        graphicsLayer.setRotationZ(f13);
        graphicsLayer.setAlpha(f14);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x(MutableState mutableState, IntSize intSize) {
        Log.d("djx", "widget: " + intSize);
        mutableState.setValue(intSize);
        return yz.g2.f100423a;
    }

    public static final yz.g2 y(vg.d dVar, long j11, boolean z11, long j12, Offset offset, float f11, float f12, boolean z12, x00.a aVar, x00.r rVar, int i11, int i12, Composer composer, int i13) {
        t(dVar, j11, z11, j12, offset, f11, f12, z12, aVar, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(float f11) {
        Log.d("djx", "target scale: " + f11);
        return yz.g2.f100423a;
    }
}
