package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.q;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,119:1\n1247#2,6:120\n1247#2,6:133\n1828#3,7:126\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n69#1:120,6\n99#1:133,6\n71#1:126,7\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Color> animateColor(@k Transition<S> transition, @l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> qVar, @l String str, @k q<? super S, ? super Composer, ? super Integer, Color> qVar2, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>>() { // from class: androidx.compose.animation.TransitionKt$animateColor$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Color> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Color> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-1457805428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1457805428, i13, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
                    }
                    SpringSpec<Color> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace m2513getColorSpaceimpl = Color.m2513getColorSpaceimpl(qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf((i11 >> 6) & 112)).m2519unboximpl());
        boolean changed = composer.changed(m2513getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m2513getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), (TwoWayConverter) rememberedValue, str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @k
    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m123animateColorDTcfvLk(@k InfiniteTransition infiniteTransition, long j11, long j12, @k InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, @l String str, @l Composer composer, int i11, int i12) {
        Composer composer2;
        String str2 = (i12 & 8) != 0 ? "ColorAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i11, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2513getColorSpaceimpl(j12));
            composer2 = composer;
            composer2.updateRememberedValue(rememberedValue);
        } else {
            composer2 = composer;
        }
        int i13 = i11 << 3;
        State<Color> animateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m2499boximpl(j11), Color.m2499boximpl(j12), (TwoWayConverter) rememberedValue, infiniteRepeatableSpec, str2, composer2, InfiniteTransition.$stable | (i11 & 14) | (i11 & 112) | (i11 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i13) | (i13 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m124animateColorRIQooxk(InfiniteTransition infiniteTransition, long j11, long j12, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i11, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
        }
        State<Color> m123animateColorDTcfvLk = m123animateColorDTcfvLk(infiniteTransition, j11, j12, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i11 & 14) | (i11 & 112) | (i11 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i11 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m123animateColorDTcfvLk;
    }
}
