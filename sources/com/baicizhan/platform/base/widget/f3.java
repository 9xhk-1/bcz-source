package com.baicizhan.platform.base.widget;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import com.baicizhan.platform.base.widget.f3;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMagicSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagicSwitch.kt\ncom/baicizhan/platform/base/widget/MagicSwitchKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 13 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 14 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,191:1\n75#2:192\n1#3:193\n52#4:194\n1247#5,6:195\n1247#5,3:208\n1250#5,3:212\n1247#5,6:215\n1247#5,6:258\n1247#5,6:268\n1247#5,6:274\n1247#5,6:284\n557#6:201\n554#6,6:202\n555#7:211\n99#8:221\n96#8,9:222\n106#8:267\n79#9,6:231\n86#9,3:246\n89#9,2:255\n93#9:266\n347#10,9:237\n356#10:257\n357#10,2:264\n4206#11,6:249\n113#12:280\n113#12:281\n113#12:282\n113#12:283\n32#13:290\n80#14:291\n*S KotlinDebug\n*F\n+ 1 MagicSwitch.kt\ncom/baicizhan/platform/base/widget/MagicSwitchKt\n*L\n65#1:192\n66#1:194\n68#1:195,6\n74#1:208,3\n74#1:212,3\n77#1:215,6\n105#1:258,6\n126#1:268,6\n146#1:274,6\n162#1:284,6\n74#1:201\n74#1:202,6\n74#1:211\n75#1:221\n75#1:222,9\n75#1:267\n75#1:231,6\n75#1:246,3\n75#1:255,2\n75#1:266\n75#1:237,9\n75#1:257\n75#1:264,2\n75#1:249,6\n150#1:280\n151#1:281\n153#1:282\n154#1:283\n106#1:290\n106#1:291\n*E\n"})
/* loaded from: classes6.dex */
public final class f3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.MagicSwitchKt$MagicSwitch$1$1$1", f = "MagicSwitch.kt", i = {}, l = {80, 82}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28270a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Integer> f28271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28272c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28273d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AnchoredDraggableState<Integer> anchoredDraggableState, int i11, int i12, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f28271b = anchoredDraggableState;
            this.f28272c = i11;
            this.f28273d = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f28271b, this.f28272c, this.f28273d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo$default(r4, r5, null, r10, 2, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo$default(r1, r11, null, r10, 2, null) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f28270a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r11)
                goto L5d
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.e.n(r11)
                r4 = r10
                goto L5d
            L1f:
                kotlin.e.n(r11)
                androidx.compose.foundation.gestures.AnchoredDraggableState<java.lang.Integer> r11 = r10.f28271b
                java.lang.Object r11 = r11.getCurrentValue()
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                int r1 = r10.f28272c
                if (r11 != r1) goto L48
                androidx.compose.foundation.gestures.AnchoredDraggableState<java.lang.Integer> r4 = r10.f28271b
                int r11 = r10.f28273d
                java.lang.Integer r5 = l00.a.f(r11)
                r10.f28270a = r3
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo$default(r4, r5, r6, r7, r8, r9)
                r4 = r7
                if (r11 != r0) goto L5d
                goto L5c
            L48:
                r4 = r10
                r11 = r1
                androidx.compose.foundation.gestures.AnchoredDraggableState<java.lang.Integer> r1 = r4.f28271b
                java.lang.Integer r11 = l00.a.f(r11)
                r4.f28270a = r2
                r3 = 0
                r5 = 2
                r6 = 0
                r2 = r11
                java.lang.Object r11 = androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo$default(r1, r2, r3, r4, r5, r6)
                if (r11 != r0) goto L5d
            L5c:
                return r0
            L5d:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.f3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.MagicSwitchKt$MagicSwitch$3$1", f = "MagicSwitch.kt", i = {0}, l = {130}, m = "invokeSuspend", n = {"consuming"}, s = {"L$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f28274a;

        /* renamed from: b, reason: collision with root package name */
        public int f28275b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<Integer> f28276c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<Boolean, yz.g2> f28277d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f28278a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x00.l<Boolean, yz.g2> f28279b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref.BooleanRef booleanRef, x00.l<? super Boolean, yz.g2> lVar) {
                this.f28278a = booleanRef;
                this.f28279b = lVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<Integer, Boolean> pair, j00.c<? super yz.g2> cVar) {
                int intValue = pair.component1().intValue();
                boolean booleanValue = pair.component2().booleanValue();
                Ref.BooleanRef booleanRef = this.f28278a;
                if (booleanRef.element) {
                    booleanRef.element = false;
                } else if (!booleanValue) {
                    this.f28279b.invoke(l00.a.a(intValue == 1));
                    Log.d("MagicSwitch", "changed to " + intValue);
                }
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AnchoredDraggableState<Integer> anchoredDraggableState, x00.l<? super Boolean, yz.g2> lVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f28276c = anchoredDraggableState;
            this.f28277d = lVar;
        }

        public static final Pair j(AnchoredDraggableState anchoredDraggableState) {
            return yz.h1.a(anchoredDraggableState.getCurrentValue(), Boolean.valueOf(anchoredDraggableState.isAnimationRunning()));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f28276c, this.f28277d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28275b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                final AnchoredDraggableState<Integer> anchoredDraggableState = this.f28276c;
                kotlinx.coroutines.flow.i i02 = kotlinx.coroutines.flow.k.i0(SnapshotStateKt.snapshotFlow(new x00.a() { // from class: com.baicizhan.platform.base.widget.g3
                    @Override // x00.a
                    public final Object invoke() {
                        Pair j11;
                        j11 = f3.b.j(AnchoredDraggableState.this);
                        return j11;
                    }
                }));
                a aVar = new a(booleanRef, this.f28277d);
                this.f28274a = l00.k.a(booleanRef);
                this.f28275b = 1;
                if (i02.collect(aVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0057  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(boolean r23, boolean r24, @m80.l androidx.compose.runtime.MutableState<java.lang.Boolean> r25, @m80.k final x00.l<? super java.lang.Boolean, yz.g2> r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.f3.h(boolean, boolean, androidx.compose.runtime.MutableState, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 i(MutableState mutableState, x00.l lVar, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
        lVar.invoke(Boolean.valueOf(z11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 j(boolean z11, boolean z12, MutableState mutableState, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        h(z11, z12, mutableState, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void k(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1011658926);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1011658926, i11, -1, "com.baicizhan.platform.base.widget.HomeSwitchPreview (MagicSwitch.kt:171)");
            }
            bk.k.h(null, null, null, n1.f28440a.f(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.e3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 l11;
                    l11 = f3.l(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return l11;
                }
            });
        }
    }

    public static final yz.g2 l(int i11, Composer composer, int i12) {
        k(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m(boolean z11, final float f11, final float f12, @m80.k final PaddingValues outerSpace, final float f13, @m80.k final Painter outerBackgroundOn, @m80.k final Painter outerBackgroundOff, @m80.k final Painter circleBackgroundOn, @m80.k final Painter circleBackgroundOff, final int i11, final int i12, final int i13, @m80.k x00.l<? super Boolean, yz.g2> onCheckChanged, @m80.l Composer composer, final int i14, final int i15, final int i16) {
        int i17;
        int i18;
        int i19;
        int i21;
        x00.l<? super Boolean, yz.g2> lVar;
        Composer composer2;
        final boolean z12;
        int i22;
        Modifier modifier;
        Modifier.Companion companion;
        Modifier paint$default;
        kotlin.jvm.internal.g0.p(outerSpace, "outerSpace");
        kotlin.jvm.internal.g0.p(outerBackgroundOn, "outerBackgroundOn");
        kotlin.jvm.internal.g0.p(outerBackgroundOff, "outerBackgroundOff");
        kotlin.jvm.internal.g0.p(circleBackgroundOn, "circleBackgroundOn");
        kotlin.jvm.internal.g0.p(circleBackgroundOff, "circleBackgroundOff");
        kotlin.jvm.internal.g0.p(onCheckChanged, "onCheckChanged");
        Composer startRestartGroup = composer.startRestartGroup(-275160575);
        int i23 = i16 & 1;
        if (i23 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (startRestartGroup.changed(z11) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= startRestartGroup.changed(f11) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= startRestartGroup.changed(f12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= startRestartGroup.changed(outerSpace) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= startRestartGroup.changed(f13) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= startRestartGroup.changedInstance(outerBackgroundOn) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i17 |= startRestartGroup.changedInstance(outerBackgroundOff) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i17 |= startRestartGroup.changedInstance(circleBackgroundOn) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i17 |= startRestartGroup.changedInstance(circleBackgroundOff) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i17 |= startRestartGroup.changed(i11) ? 536870912 : 268435456;
        }
        int i24 = i17;
        if ((i15 & 6) == 0) {
            i18 = i15 | (startRestartGroup.changed(i12) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i19 = i23;
            i21 = i13;
            i18 |= startRestartGroup.changed(i21) ? 32 : 16;
        } else {
            i19 = i23;
            i21 = i13;
        }
        if ((i15 & 384) == 0) {
            i18 |= startRestartGroup.changedInstance(onCheckChanged) ? 256 : 128;
        }
        int i25 = i18;
        if (startRestartGroup.shouldExecute(((i24 & 306783379) == 306783378 && (i25 & 147) == 146) ? false : true, i24 & 1)) {
            boolean z13 = i19 != 0 ? true : z11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-275160575, i24, i25, "com.baicizhan.platform.base.widget.MagicSwitch (MagicSwitch.kt:63)");
            }
            final float mo377toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo377toPx0680j_4(Dp.m5115constructorimpl(f12 - f11));
            boolean z14 = (i25 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnchoredDraggableState(Integer.valueOf(i21), (DraggableAnchors<Integer>) AnchoredDraggableKt.DraggableAnchors(new x00.l() { // from class: com.baicizhan.platform.base.widget.a3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 n11;
                        n11 = f3.n(mo377toPx0680j_4, (DraggableAnchorsConfig) obj);
                        return n11;
                    }
                }));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue2;
            Modifier.Companion companion3 = Modifier.Companion;
            boolean changedInstance = startRestartGroup.changedInstance(r0Var) | startRestartGroup.changed(anchoredDraggableState) | ((i25 & 14) == 4) | ((1879048192 & i24) == 536870912);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.platform.base.widget.b3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 o11;
                        o11 = f3.o(c40.r0.this, anchoredDraggableState, i12, i11);
                        return o11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(ClipKt.clip(SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(PaddingKt.padding(ComposeUtilsKt.k(companion3, 0L, z13, (x00.a) rememberedValue3, 1, null), outerSpace), f11), f12), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(f11)), Color.Companion.m2544getTransparent0d7_KjU(), null, 2, null);
            if (((Number) anchoredDraggableState.getCurrentValue()).intValue() == i12) {
                composer2 = startRestartGroup;
                i22 = 256;
                paint$default = PainterModifierKt.paint$default(companion3, outerBackgroundOff, false, null, ContentScale.Companion.getFillBounds(), 0.0f, null, 54, null);
                modifier = m235backgroundbw27NRU$default;
                companion = companion3;
            } else {
                composer2 = startRestartGroup;
                i22 = 256;
                modifier = m235backgroundbw27NRU$default;
                companion = companion3;
                paint$default = PainterModifierKt.paint$default(companion, outerBackgroundOn, false, null, ContentScale.Companion.getFillBounds(), 0.0f, null, 54, null);
            }
            Modifier then = modifier.then(paint$default);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
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
            boolean changed = composer2.changed(anchoredDraggableState);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed || rememberedValue4 == companion2.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.platform.base.widget.c3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        IntOffset p11;
                        p11 = f3.p(AnchoredDraggableState.this, (Density) obj);
                        return p11;
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            BoxKt.Box(ClipKt.clip(PaddingKt.m726padding3ABfNKs(SizeKt.m773size3ABfNKs(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(companion, (x00.l) rememberedValue4), anchoredDraggableState, Orientation.Horizontal, false, null, null, null, 60, null), f11), f13), RoundedCornerShapeKt.RoundedCornerShape(50)).then(((Number) anchoredDraggableState.getCurrentValue()).intValue() == i12 ? PainterModifierKt.paint$default(companion, circleBackgroundOff, false, null, ContentScale.Companion.getFillBounds(), 0.0f, null, 54, null) : PainterModifierKt.paint$default(companion, circleBackgroundOn, false, null, ContentScale.Companion.getFillBounds(), 0.0f, null, 54, null)), composer2, 0);
            composer2.endNode();
            boolean changed2 = composer2.changed(anchoredDraggableState) | ((i25 & 896) == i22);
            Object rememberedValue5 = composer2.rememberedValue();
            if (changed2 || rememberedValue5 == companion2.getEmpty()) {
                lVar = onCheckChanged;
                rememberedValue5 = new b(anchoredDraggableState, lVar, null);
                composer2.updateRememberedValue(rememberedValue5);
            } else {
                lVar = onCheckChanged;
            }
            EffectsKt.LaunchedEffect(anchoredDraggableState, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue5, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z13;
        } else {
            lVar = onCheckChanged;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            z12 = z11;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final x00.l<? super Boolean, yz.g2> lVar2 = lVar;
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.d3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 q11;
                    q11 = f3.q(z12, f11, f12, outerSpace, f13, outerBackgroundOn, outerBackgroundOff, circleBackgroundOn, circleBackgroundOff, i11, i12, i13, lVar2, i14, i15, i16, (Composer) obj, ((Integer) obj2).intValue());
                    return q11;
                }
            });
        }
    }

    public static final yz.g2 n(float f11, DraggableAnchorsConfig DraggableAnchors) {
        kotlin.jvm.internal.g0.p(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.at(0, 0.0f);
        DraggableAnchors.at(1, f11);
        return yz.g2.f100423a;
    }

    public static final yz.g2 o(c40.r0 r0Var, AnchoredDraggableState anchoredDraggableState, int i11, int i12) {
        c40.k.f(r0Var, null, null, new a(anchoredDraggableState, i11, i12, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final IntOffset p(AnchoredDraggableState anchoredDraggableState, Density offset) {
        kotlin.jvm.internal.g0.p(offset, "$this$offset");
        return IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((c10.d.L0(anchoredDraggableState.requireOffset()) << 32) | (0 & 4294967295L)));
    }

    public static final yz.g2 q(boolean z11, float f11, float f12, PaddingValues paddingValues, float f13, Painter painter, Painter painter2, Painter painter3, Painter painter4, int i11, int i12, int i13, x00.l lVar, int i14, int i15, int i16, Composer composer, int i17) {
        m(z11, f11, f12, paddingValues, f13, painter, painter2, painter3, painter4, i11, i12, i13, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i14 | 1), RecomposeScopeImplKt.updateChangedFlags(i15), i16);
        return yz.g2.f100423a;
    }
}
