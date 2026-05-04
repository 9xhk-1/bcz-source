package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import c40.r0;
import e40.o;
import e40.r;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,600:1\n1247#2,6:601\n1247#2,6:607\n1247#2,6:613\n1247#2,6:619\n1247#2,6:625\n1247#2,6:631\n1247#2,6:637\n1247#2,6:643\n85#3:649\n85#3:650\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n71#1:601,6\n392#1:607,6\n398#1:613,6\n399#1:619,6\n415#1:625,6\n416#1:631,6\n417#1:637,6\n588#1:643,6\n400#1:649\n402#1:650\n*E\n"})
/* loaded from: classes.dex */
public final class AnimateAsStateKt {

    @k
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @k
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m5113boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);

    @k
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2325boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);

    @k
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2257boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);

    @k
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);

    @k
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(e0.f66981a)), 3, null);

    @k
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);

    @k
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    @Composable
    @k
    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m125animateDpAsStateAjpBEmI(float f11, @l AnimationSpec<Dp> animationSpec, @l String str, @l x00.l<? super Dp, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super Dp, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i11, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i13 = i11 << 6;
        State<Dp> animateValueAsState = animateValueAsState(Dp.m5113boximpl(f11), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m126animateDpAsStateKz89ssw(float f11, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i11, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State animateValueAsState = animateValueAsState(Dp.m5113boximpl(f11), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, null, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    public static final State<Float> animateFloatAsState(float f11, @l AnimationSpec<Float> animationSpec, float f12, @l String str, @l x00.l<? super Float, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i12 & 4) != 0) {
            f12 = 0.01f;
        }
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        x00.l<? super Float, g2> lVar2 = (i12 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i11, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (animationSpec == defaultAnimation) {
            composer.startReplaceGroup(1125558999);
            boolean z11 = (((i11 & 896) ^ 384) > 256 && composer.changed(f12)) || (i11 & 384) == 256;
            Object rememberedValue = composer.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f12), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            animationSpec = (SpringSpec) rememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1125668925);
            composer.endReplaceGroup();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        Float valueOf = Float.valueOf(f11);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(z.f67060a);
        Float valueOf2 = Float.valueOf(f12);
        int i13 = i11 << 3;
        State<Float> animateValueAsState = animateValueAsState(valueOf, vectorConverter, animationSpec2, valueOf2, str2, lVar2, composer, (i11 & 14) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    public static final State<Integer> animateIntAsState(int i11, @l AnimationSpec<Integer> animationSpec, @l String str, @l x00.l<? super Integer, g2> lVar, @l Composer composer, int i12, int i13) {
        if ((i13 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i13 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i13 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super Integer, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i12, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
        }
        int i14 = i12 << 6;
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i11), VectorConvertersKt.getVectorConverter(e0.f66981a), animationSpec2, null, str2, lVar2, composer, (i12 & 14) | ((i12 << 3) & 896) | (57344 & i14) | (i14 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m127animateIntOffsetAsState8f6pmRE(long j11, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i11, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:552)");
        }
        State animateValueAsState = animateValueAsState(IntOffset.m5234boximpl(j11), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, null, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m128animateIntOffsetAsStateHyPO7BM(long j11, @l AnimationSpec<IntOffset> animationSpec, @l String str, @l x00.l<? super IntOffset, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super IntOffset, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i11, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:309)");
        }
        int i13 = i11 << 6;
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m5234boximpl(j11), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m129animateIntSizeAsState4goxYXU(long j11, @l AnimationSpec<IntSize> animationSpec, @l String str, @l x00.l<? super IntSize, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super IntSize, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i11, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:347)");
        }
        int i13 = i11 << 6;
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m5278boximpl(j11), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m130animateIntSizeAsStatezTRF_AQ(long j11, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i11, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:570)");
        }
        State animateValueAsState = animateValueAsState(IntSize.m5278boximpl(j11), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, null, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m131animateOffsetAsState7362WCg(long j11, @l AnimationSpec<Offset> animationSpec, @l String str, @l x00.l<? super Offset, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super Offset, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i11, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:191)");
        }
        int i13 = i11 << 6;
        State<Offset> animateValueAsState = animateValueAsState(Offset.m2257boximpl(j11), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m132animateOffsetAsStateN6fFfp4(long j11, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i11, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        State animateValueAsState = animateValueAsState(Offset.m2257boximpl(j11), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, null, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    public static final State<Rect> animateRectAsState(@k Rect rect, @l AnimationSpec<Rect> animationSpec, @l String str, @l x00.l<? super Rect, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super Rect, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i11, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:232)");
        }
        int i13 = i11 << 6;
        State<Rect> animateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m133animateSizeAsStateLjSzlW0(long j11, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i11, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        State animateValueAsState = animateValueAsState(Size.m2325boximpl(j11), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, null, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m134animateSizeAsStateYLp_XPw(long j11, @l AnimationSpec<Size> animationSpec, @l String str, @l x00.l<? super Size, g2> lVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l<? super Size, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i11, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:152)");
        }
        int i13 = i11 << 6;
        State<Size> animateValueAsState = animateValueAsState(Size.m2325boximpl(j11), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @k
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t11, @k TwoWayConverter<T, V> twoWayConverter, @l AnimationSpec<T> animationSpec, @l T t12, @l String str, @l x00.l<? super T, g2> lVar, @l Composer composer, int i11, int i12) {
        AnimationSpec<T> animationSpec2;
        o oVar;
        if ((i12 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            animationSpec2 = (SpringSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        T t13 = (i12 & 8) != 0 ? null : t12;
        String str2 = (i12 & 16) != 0 ? "ValueAnimation" : str;
        x00.l<? super T, g2> lVar2 = (i12 & 32) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i11, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(t11, twoWayConverter, t13, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        Animatable animatable = (Animatable) rememberedValue3;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar2, composer, (i11 >> 15) & 14);
        if (t13 != null && (animationSpec2 instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec2;
            if (!g0.g(springSpec.getVisibilityThreshold(), t13)) {
                animationSpec2 = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t13);
            }
        }
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer, 0);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = r.d(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        final o oVar2 = (o) rememberedValue4;
        boolean changedInstance = ((((i11 & 14) ^ 6) > 4 && composer.changedInstance(t11)) || (i11 & 6) == 4) | composer.changedInstance(oVar2);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new x00.a<g2>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    oVar2.m(t11);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue5, composer, 0);
        boolean changedInstance2 = composer.changedInstance(oVar2) | composer.changedInstance(animatable) | composer.changed(rememberUpdatedState2) | composer.changed(rememberUpdatedState);
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
            oVar = oVar2;
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(oVar, animatable, rememberUpdatedState2, rememberUpdatedState, null);
            composer.updateRememberedValue(animateAsStateKt$animateValueAsState$3$1);
            rememberedValue6 = animateAsStateKt$animateValueAsState$3$1;
        } else {
            oVar = oVar2;
        }
        EffectsKt.LaunchedEffect(oVar, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue6, composer, 0);
        State<T> state = (State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> x00.l<T, g2> animateValueAsState$lambda$4(State<? extends x00.l<? super T, g2>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i11, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:516)");
        }
        State animateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, null, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateIntAsState(int i11, AnimationSpec animationSpec, x00.l lVar, Composer composer, int i12, int i13) {
        if ((i13 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i13 & 4) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i12, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:534)");
        }
        State animateValueAsState = animateValueAsState(Integer.valueOf(i11), VectorConvertersKt.getVectorConverter(e0.f66981a), animationSpec2, null, null, lVar2, composer, (i12 & 14) | ((i12 << 3) & 896) | ((i12 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloatAsState(float f11, AnimationSpec animationSpec, float f12, x00.l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            f12 = 0.01f;
        }
        float f13 = f12;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i11, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        State<Float> animateFloatAsState = animateFloatAsState(f11, animationSpec2, f13, null, lVar2, composer, (i11 & 1022) | ((i11 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateFloatAsState;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, x00.l lVar, Composer composer, int i11, int i12) {
        Composer composer2;
        if ((i12 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer2 = composer;
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = composer;
            }
            animationSpec = (SpringSpec) rememberedValue;
        } else {
            composer2 = composer;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object obj3 = (i12 & 8) != 0 ? null : obj2;
        x00.l lVar2 = (i12 & 16) != 0 ? null : lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i11, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:591)");
        }
        int i13 = i11 & 8;
        State animateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", lVar2, composer2, (i13 << 9) | i13 | 24576 | (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | ((i11 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }
}
