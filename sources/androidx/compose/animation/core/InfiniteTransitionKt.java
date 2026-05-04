package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,345:1\n1247#2,6:346\n1247#2,6:352\n1247#2,6:358\n1247#2,6:364\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:346,6\n247#1:352,6\n251#1:358,6\n264#1:364,6\n*E\n"})
/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    @Composable
    @k
    public static final State<Float> animateFloat(@k InfiniteTransition infiniteTransition, float f11, float f12, @k InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, @l String str, @l Composer composer, int i11, int i12) {
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i11, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i13 = i11 << 3;
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f11), Float.valueOf(f12), VectorConvertersKt.getVectorConverter(z.f67060a), infiniteRepeatableSpec, str2, composer, (i11 & 1022) | (57344 & i13) | (i13 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValue;
    }

    @Composable
    @k
    public static final <T, V extends AnimationVector> State<T> animateValue(@k InfiniteTransition infiniteTransition, T t11, T t12, @k TwoWayConverter<T, V> twoWayConverter, @k InfiniteRepeatableSpec<T> infiniteRepeatableSpec, @l String str, @l Composer composer, int i11, int i12) {
        final InfiniteTransition infiniteTransition2;
        final Object obj;
        final Object obj2;
        final InfiniteRepeatableSpec<T> infiniteRepeatableSpec2;
        if ((i12 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i11, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            infiniteTransition2 = infiniteTransition;
            obj = t11;
            obj2 = t12;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
            InfiniteTransition.TransitionAnimationState transitionAnimationState = infiniteTransition2.new TransitionAnimationState(obj, obj2, twoWayConverter, infiniteRepeatableSpec2, str2);
            composer.updateRememberedValue(transitionAnimationState);
            rememberedValue = transitionAnimationState;
        } else {
            infiniteTransition2 = infiniteTransition;
            obj = t11;
            obj2 = t12;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        }
        final InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) rememberedValue;
        boolean z11 = true;
        boolean z12 = ((((i11 & 112) ^ 48) > 32 && composer.changedInstance(obj)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changedInstance(obj2)) || (i11 & 384) == 256);
        if ((((57344 & i11) ^ 24576) <= 16384 || !composer.changedInstance(infiniteRepeatableSpec2)) && (i11 & 24576) != 16384) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object rememberedValue2 = composer.rememberedValue();
        if (z13 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new x00.a<g2>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
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
                    if (g0.g(obj, transitionAnimationState2.getInitialValue$animation_core_release()) && g0.g(obj2, transitionAnimationState2.getTargetValue$animation_core_release())) {
                        return;
                    }
                    transitionAnimationState2.updateValues$animation_core_release(obj, obj2, infiniteRepeatableSpec2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue2, composer, 0);
        boolean changedInstance = composer.changedInstance(infiniteTransition2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    InfiniteTransition.this.addAnimation$animation_core_release(transitionAnimationState2);
                    final InfiniteTransition infiniteTransition3 = InfiniteTransition.this;
                    final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            InfiniteTransition.this.removeAnimation$animation_core_release(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    @Composable
    @k
    public static final InfiniteTransition rememberInfiniteTransition(@l String str, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i11, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core_release(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infiniteTransition;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f11, float f12, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i11, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
        }
        State<Float> animateFloat = animateFloat(infiniteTransition, f11, f12, infiniteRepeatableSpec, "FloatAnimation", composer, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateFloat;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i11, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
        }
        InfiniteTransition rememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberInfiniteTransition;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i11, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
        }
        int i12 = (i11 >> 3) & 8;
        State animateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i11 & 14) | 196608 | (i12 << 3) | (i11 & 112) | (i12 << 6) | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValue;
    }
}
