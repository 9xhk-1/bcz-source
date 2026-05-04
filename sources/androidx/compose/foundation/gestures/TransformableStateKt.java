package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,456:1\n1247#2,6:457\n96#3,5:463\n96#3,5:468\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n125#1:457,6\n139#1:463,5\n219#1:468,5\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableStateKt {

    @k
    private static final AnimationData ZeroAnimationVelocity = new AnimationData(0.0f, Offset.Companion.m2284getZeroF1C5BW0(), 0.0f, null);

    @k
    public static final TransformableState TransformableState(@k q<? super Float, ? super Offset, ? super Float, g2> qVar) {
        return new DefaultTransformableState(qVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.foundation.gestures.AnimationData] */
    @l
    /* renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final Object m531animateBySu4bsnU(@k TransformableState transformableState, float f11, long j11, float f12, @k AnimationSpec<Float> animationSpec, @k AnimationSpec<Offset> animationSpec2, @k AnimationSpec<Float> animationSpec3, @k c<? super g2> cVar) {
        if (!(f11 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new AnimationData(1.0f, Offset.Companion.m2284getZeroF1C5BW0(), 0.0f, null);
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateBy$3(objectRef, new AnimationData(f11, j11, f12, null), new DelegatingAnimationSpec(animationSpec, animationSpec2, animationSpec3), null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }

    @l
    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m533animatePanByubNVwUQ(@k TransformableState transformableState, long j11, @k AnimationSpec<Offset> animationSpec, @k c<? super g2> cVar) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = Offset.Companion.m2284getZeroF1C5BW0();
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(longRef, j11, animationSpec, null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m534animatePanByubNVwUQ$default(TransformableState transformableState, long j11, AnimationSpec animationSpec, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m533animatePanByubNVwUQ(transformableState, j11, animationSpec, cVar);
    }

    @l
    public static final Object animateRotateBy(@k TransformableState transformableState, float f11, @k AnimationSpec<Float> animationSpec, @k c<? super g2> cVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateRotateBy$2(new Ref.FloatRef(), f11, animationSpec, null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f11, AnimationSpec animationSpec, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f11, animationSpec, cVar);
    }

    @l
    public static final Object animateZoomBy(@k TransformableState transformableState, float f11, @k AnimationSpec<Float> animationSpec, @k c<? super g2> cVar) {
        if (!(f11 > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateZoomBy$3(floatRef, f11, animationSpec, null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f11, AnimationSpec animationSpec, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f11, animationSpec, cVar);
    }

    @l
    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m535panByd4ec7I(@k TransformableState transformableState, long j11, @k c<? super g2> cVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j11, null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }

    @Composable
    @k
    public static final TransformableState rememberTransformableState(@k q<? super Float, ? super Offset, ? super Float, g2> qVar, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i11, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(qVar, composer, i11 & 14);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new q<Float, Offset, Float, g2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // x00.q
                public /* bridge */ /* synthetic */ g2 invoke(Float f11, Offset offset, Float f12) {
                    m536invoked4ec7I(f11.floatValue(), offset.m2278unboximpl(), f12.floatValue());
                    return g2.f100423a;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m536invoked4ec7I(float f11, long j11, float f12) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f11), Offset.m2257boximpl(j11), Float.valueOf(f12));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState;
    }

    @l
    public static final Object rotateBy(@k TransformableState transformableState, float f11, @k c<? super g2> cVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$rotateBy$2(f11, null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }

    @l
    public static final Object stopTransformation(@k TransformableState transformableState, @k MutatePriority mutatePriority, @k c<? super g2> cVar) {
        Object transform = transformableState.transform(mutatePriority, new TransformableStateKt$stopTransformation$2(null), cVar);
        return transform == b.l() ? transform : g2.f100423a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, cVar);
    }

    @l
    public static final Object zoomBy(@k TransformableState transformableState, float f11, @k c<? super g2> cVar) {
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$zoomBy$2(f11, null), cVar, 1, null);
        return transform$default == b.l() ? transform$default : g2.f100423a;
    }
}
