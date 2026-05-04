package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nComposeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeUtils.kt\ncom/baicizhan/platform/base/widget/ComposeUtilsKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,112:1\n110#2:113\n110#2:114\n557#3:115\n554#3,6:116\n557#3:150\n554#3,6:151\n1247#4,3:122\n1250#4,3:126\n1247#4,6:129\n1247#4,6:135\n1247#4,6:141\n1247#4,3:157\n1250#4,3:161\n1247#4,6:164\n1247#4,6:170\n1247#4,6:177\n555#5:125\n555#5:160\n85#6:147\n113#6,2:148\n85#6:183\n113#6,2:184\n1#7:176\n65#8:186\n69#8:189\n60#9:187\n70#9:190\n22#10:188\n22#10:191\n*S KotlinDebug\n*F\n+ 1 ComposeUtils.kt\ncom/baicizhan/platform/base/widget/ComposeUtilsKt\n*L\n33#1:113\n68#1:114\n40#1:115\n40#1:116,6\n76#1:150\n76#1:151,6\n40#1:122,3\n40#1:126,3\n41#1:129,6\n55#1:135,6\n44#1:141,6\n76#1:157,3\n76#1:161,3\n77#1:164,6\n91#1:170,6\n80#1:177,6\n40#1:125\n76#1:160\n41#1:147\n41#1:148,2\n77#1:183\n77#1:184,2\n108#1:186\n109#1:189\n108#1:187\n109#1:190\n108#1:188\n109#1:191\n*E\n"})
/* loaded from: classes6.dex */
public final class ComposeUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f28171a = 500;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.ComposeUtilsKt$protectedClickable$2$2$1$1", f = "ComposeUtils.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28172a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f28173b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28174c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f28173b = j11;
            this.f28174c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f28173b, this.f28174c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28172a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f28173b;
                this.f28172a = 1;
                if (c40.a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            ComposeUtilsKt.n(this.f28174c, false);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.ComposeUtilsKt$protectedCombinedClickable$2$3$1$1", f = "ComposeUtils.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28175a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f28176b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, MutableState<Boolean> mutableState, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f28176b = j11;
            this.f28177c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f28176b, this.f28177c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28175a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f28176b;
                this.f28175a = 1;
                if (c40.a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            ComposeUtilsKt.t(this.f28177c, false);
            return yz.g2.f100423a;
        }
    }

    @m80.k
    public static final Modifier h(@m80.k Modifier modifier, @m80.l final MutableState<n2> mutableState) {
        kotlin.jvm.internal.g0.p(modifier, "<this>");
        return modifier.then(OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new x00.l() { // from class: com.baicizhan.platform.base.widget.k2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i11;
                i11 = ComposeUtilsKt.i(MutableState.this, (LayoutCoordinates) obj);
                return i11;
            }
        }));
    }

    public static final yz.g2 i(MutableState mutableState, LayoutCoordinates coordinates) {
        kotlin.jvm.internal.g0.p(coordinates, "coordinates");
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
        if (mutableState != null) {
            mutableState.setValue(new n2(Float.intBitsToFloat((int) (positionInWindow >> 32)), Float.intBitsToFloat((int) (positionInWindow & 4294967295L)), coordinates.mo3865getSizeYbymL2g(), null));
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public static final Modifier j(@m80.k Modifier modifier, final long j11, final boolean z11, @m80.k final x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(modifier, "<this>");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, yz.g2>() { // from class: com.baicizhan.platform.base.widget.ComposeUtilsKt$protectedClickable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("protectedClickable");
                inspectorInfo.getProperties().set("delayed", Long.valueOf(j11));
                inspectorInfo.getProperties().set(a90.c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new x00.q() { // from class: com.baicizhan.platform.base.widget.l2
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier l11;
                l11 = ComposeUtilsKt.l(z11, onClick, j11, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return l11;
            }
        });
    }

    public static /* synthetic */ Modifier k(Modifier modifier, long j11, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return j(modifier, j11, z11, aVar);
    }

    @Composable
    public static final Modifier l(boolean z11, final x00.a aVar, final long j11, Modifier composed, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(composed, "$this$composed");
        composer.startReplaceGroup(-707013351);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-707013351, i11, -1, "com.baicizhan.platform.base.widget.protectedClickable.<anonymous> (ComposeUtils.kt:39)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        final c40.r0 r0Var = (c40.r0) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue3);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue3;
        boolean changed = composer.changed(aVar) | composer.changedInstance(r0Var) | composer.changed(j11);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            Object obj = new x00.a() { // from class: com.baicizhan.platform.base.widget.m2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 o11;
                    o11 = ComposeUtilsKt.o(x00.a.this, r0Var, mutableState, j11);
                    return o11;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue4 = obj;
        }
        Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(companion2, mutableInteractionSource, null, z11, null, null, (x00.a) rememberedValue4, 24, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m267clickableO2vRcR0$default;
    }

    public static final boolean m(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void n(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 o(x00.a aVar, c40.r0 r0Var, MutableState mutableState, long j11) {
        if (m(mutableState)) {
            return yz.g2.f100423a;
        }
        n(mutableState, true);
        aVar.invoke();
        c40.k.f(r0Var, null, null, new a(j11, mutableState, null), 3, null);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final Modifier p(@m80.k Modifier modifier, final long j11, final boolean z11, @m80.l final x00.a<yz.g2> aVar, @m80.l final x00.a<yz.g2> aVar2, final boolean z12, @m80.k final x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(modifier, "<this>");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, yz.g2>() { // from class: com.baicizhan.platform.base.widget.ComposeUtilsKt$protectedCombinedClickable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("protectedCombinedClickable");
                inspectorInfo.getProperties().set("delayed", Long.valueOf(j11));
                inspectorInfo.getProperties().set(a90.c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("onLongClick", aVar);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new x00.q() { // from class: com.baicizhan.platform.base.widget.i2
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier r11;
                r11 = ComposeUtilsKt.r(x00.a.this, z11, aVar2, onClick, j11, z12, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return r11;
            }
        });
    }

    public static /* synthetic */ Modifier q(Modifier modifier, long j11, boolean z11, x00.a aVar, x00.a aVar2, boolean z12, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        return p(modifier, j11, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : aVar2, (i11 & 16) != 0 ? true : z12, aVar3);
    }

    @Composable
    public static final Modifier r(x00.a aVar, boolean z11, x00.a aVar2, final x00.a aVar3, final long j11, boolean z12, Modifier composed, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(composed, "$this$composed");
        composer.startReplaceGroup(818936608);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(818936608, i11, -1, "com.baicizhan.platform.base.widget.protectedCombinedClickable.<anonymous> (ComposeUtils.kt:75)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        final c40.r0 r0Var = (c40.r0) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue3);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue3;
        x00.a aVar4 = (aVar == null || !z12) ? null : aVar;
        boolean changed = composer.changed(aVar3) | composer.changedInstance(r0Var) | composer.changed(j11);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            Object obj = new x00.a() { // from class: com.baicizhan.platform.base.widget.j2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 u11;
                    u11 = ComposeUtilsKt.u(x00.a.this, r0Var, mutableState, j11);
                    return u11;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue4 = obj;
        }
        Modifier m273combinedClickableauXiCPI$default = ClickableKt.m273combinedClickableauXiCPI$default(companion2, mutableInteractionSource, null, z11, null, null, null, aVar4, aVar2, false, (x00.a) rememberedValue4, 312, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m273combinedClickableauXiCPI$default;
    }

    public static final boolean s(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void t(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 u(x00.a aVar, c40.r0 r0Var, MutableState mutableState, long j11) {
        if (s(mutableState)) {
            return yz.g2.f100423a;
        }
        t(mutableState, true);
        aVar.invoke();
        c40.k.f(r0Var, null, null, new b(j11, mutableState, null), 3, null);
        return yz.g2.f100423a;
    }
}
