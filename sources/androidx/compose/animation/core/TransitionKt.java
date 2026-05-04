package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2137:1\n1828#1,7:2210\n1828#1,7:2217\n1828#1,7:2224\n1828#1,7:2231\n1828#1,7:2238\n1828#1,7:2245\n1828#1,7:2252\n1828#1,7:2259\n1247#2,6:2138\n1247#2,6:2144\n1247#2,6:2150\n1247#2,6:2156\n1247#2,6:2162\n1247#2,6:2168\n1247#2,6:2174\n1247#2,6:2180\n1247#2,6:2186\n1247#2,6:2192\n1247#2,6:2198\n1247#2,6:2204\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1921#1:2210,7\n1951#1:2217,7\n1981#1:2224,7\n2011#1:2231,7\n2045#1:2238,7\n2075#1:2245,7\n2106#1:2252,7\n2136#1:2259,7\n88#1:2138,6\n90#1:2144,6\n802#1:2150,6\n804#1:2156,6\n815#1:2162,6\n1729#1:2168,6\n1730#1:2174,6\n1758#1:2180,6\n1772#1:2186,6\n1776#1:2192,6\n1847#1:2198,6\n1861#1:2204,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;

    @k
    private static final l<SeekableTransitionState<?>, g2> SeekableTransitionStateTotalDurationChanged = new l<SeekableTransitionState<?>, g2>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(SeekableTransitionState<?> seekableTransitionState) {
            invoke2(seekableTransitionState);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SeekableTransitionState<?> seekableTransitionState) {
            seekableTransitionState.onTotalDurationChanged$animation_core_release();
        }
    };

    @k
    private static final c0 SeekableStateObserver$delegate = e0.b(LazyThreadSafetyMode.NONE, new x00.a<SnapshotStateObserver>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<x00.a<? extends g2>, g2>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends g2> aVar) {
                    invoke2((x00.a<g2>) aVar);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(x00.a<g2> aVar) {
                    aVar.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> transition, final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t11, final T t12, final FiniteAnimationSpec<T> finiteAnimationSpec, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(867041821);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(transition) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(transitionAnimationState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? startRestartGroup.changed(t11) : startRestartGroup.changedInstance(t11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? startRestartGroup.changed(t12) : startRestartGroup.changedInstance(t12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? startRestartGroup.changed(finiteAnimationSpec) : startRestartGroup.changedInstance(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, i12, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1876)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t11, t12, finiteAnimationSpec);
            } else {
                transitionAnimationState.updateTargetValue$animation_core_release(t12, finiteAnimationSpec);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.animation.core.TransitionKt$UpdateInitialAndTargetValues$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    TransitionKt.UpdateInitialAndTargetValues(transition, transitionAnimationState, t11, t12, finiteAnimationSpec, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Dp> animateDp(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, Dp> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>>() { // from class: androidx.compose.animation.core.TransitionKt$animateDp$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Dp> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-575880366);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-575880366, i13, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1946)");
                    }
                    SpringSpec<Dp> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m5113boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Dp.Companion), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Float> animateFloat(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, Float> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt$animateFloat$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-522164544);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-522164544, i13, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1916)");
                    }
                    SpringSpec<Float> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(z.f67060a), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Integer> animateInt(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, Integer> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt$animateInt$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-785273069);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-785273069, i13, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2070)");
                    }
                    SpringSpec<Integer> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.e0.f66981a), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<IntOffset> animateIntOffset(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, IntOffset> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntOffset$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-1953479610);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953479610, i13, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2039)");
                    }
                    long j11 = 1;
                    SpringSpec<IntOffset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((j11 & 4294967295L) | (j11 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntOffset.Companion), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<IntSize> animateIntSize(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, IntSize> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt$animateIntSize$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(967893300);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(967893300, i13, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2101)");
                    }
                    long j11 = 1;
                    SpringSpec<IntSize> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5278boximpl(IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32))), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(IntSize.Companion), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Offset> animateOffset(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, Offset> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt$animateOffset$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(1623385561);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1623385561, i13, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1976)");
                    }
                    SpringSpec<Offset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2257boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Offset.Companion), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Rect> animateRect(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, Rect> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt$animateRect$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(691336298);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(691336298, i13, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2131)");
                    }
                    SpringSpec<Rect> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Rect.Companion), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S> State<Size> animateSize(@k Transition<S> transition, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, Size> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt$animateSize$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-1607152761);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607152761, i13, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2006)");
                    }
                    SpringSpec<Size> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2325boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        int i13 = i11 & 14;
        int i14 = i11 << 3;
        int i15 = i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
        int i16 = (i15 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i16)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i16)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i15 >> 3) & 112)), VectorConvertersKt.getVectorConverter(Size.Companion), str2, composer, (i15 & 14) | ((i15 << 6) & 458752));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @k
    public static final <S, T, V extends AnimationVector> State<T> animateValue(@k Transition<S> transition, @k TwoWayConverter<T, V> twoWayConverter, @m80.l q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> qVar, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, ? extends T> qVar2, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt$animateValue$1
                @Override // x00.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }

                @Composable
                public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer2, int i13) {
                    composer2.startReplaceGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, i13, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1823)");
                    }
                    SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spring$default;
                }
            };
        }
        if ((i12 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i13 = (i11 >> 9) & 112;
        return createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i11 >> 3) & 112)), twoWayConverter, str, composer, (i11 & 14) | (57344 & (i11 << 9)) | ((i11 << 6) & 458752));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @k
    @ExperimentalTransitionApi
    @Composable
    public static final <S, T> Transition<T> createChildTransition(@k Transition<S> transition, @m80.l String str, @k q<? super S, ? super Composer, ? super Integer, ? extends T> qVar, @m80.l Composer composer, int i11, int i12) {
        boolean z11 = true;
        if ((i12 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i13 = i11 & 14;
        if (((i13 ^ 6) <= 4 || !composer.changed(transition)) && (i11 & 6) != 4) {
            z11 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i14 = (i11 >> 3) & 112;
        return createChildTransitionInternal(transition, qVar.invoke(rememberedValue, composer, Integer.valueOf(i14)), qVar.invoke(transition.getTargetState(), composer, Integer.valueOf(i14)), str2, composer, i13 | ((i11 << 6) & 7168));
    }

    @Composable
    @v0
    @k
    public static final <S, T> Transition<T> createChildTransitionInternal(@k final Transition<S> transition, T t11, T t12, @k String str, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i11, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1769)");
        }
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && composer.changed(transition)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition(new MutableTransitionState(t11), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(rememberedValue);
        }
        final Transition<T> transition2 = (Transition) rememberedValue;
        if ((i12 <= 4 || !composer.changed(transition)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean changed = composer.changed(transition2) | z11;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(transition2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t11, t12, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition2.updateTarget$animation_core_release(t12);
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    @Composable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @k
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@k final Transition<S> transition, @k TwoWayConverter<T, V> twoWayConverter, @m80.l String str, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i11, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1727)");
        }
        int i13 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i13 > 4 && composer.changed(transition)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        if ((i13 <= 4 || !composer.changed(transition)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean changedInstance = composer.changedInstance(deferredAnimation) | z11;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<S> transition2 = transition;
                    final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.removeAnimation$animation_core_release(deferredAnimation2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(deferredAnimation, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredAnimation;
    }

    @Composable
    @v0
    @k
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(@k final Transition<S> transition, T t11, T t12, @k FiniteAnimationSpec<T> finiteAnimationSpec, @k TwoWayConverter<T, V> twoWayConverter, @k String str, @m80.l Composer composer, int i11) {
        T t13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i11, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1844)");
        }
        int i12 = i11 & 14;
        int i13 = i12 ^ 6;
        boolean z11 = true;
        boolean z12 = (i13 > 4 && composer.changed(transition)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            t13 = t12;
            Object transitionAnimationState = transition.new TransitionAnimationState(t11, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t13), twoWayConverter, str);
            composer.updateRememberedValue(transitionAnimationState);
            rememberedValue = transitionAnimationState;
        } else {
            t13 = t12;
        }
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) rememberedValue;
        int i14 = (i11 >> 3) & 8;
        int i15 = i11 << 3;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, t11, t13, finiteAnimationSpec, composer, (i14 << 9) | (i14 << 6) | i12 | (i15 & 896) | (i15 & 7168) | (57344 & i15));
        if ((i13 <= 4 || !composer.changed(transition)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean changed = composer.changed(transitionAnimationState2) | z11;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState2);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.removeAnimation$animation_core_release(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    @k
    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    @Composable
    @k
    public static final <T> Transition<T> rememberTransition(@k TransitionState<T> transitionState, @m80.l String str, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i11, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:799)");
        }
        int i13 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i13 > 4 && composer.changed(transitionState)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        final Transition<T> transition = (Transition) rememberedValue;
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(1030660644);
            T currentState = transitionState.getCurrentState();
            T targetState = transitionState.getTargetState();
            if ((i13 <= 4 || !composer.changed(transitionState)) && (i11 & 6) != 4) {
                z11 = false;
            }
            Object rememberedValue2 = composer.rememberedValue();
            if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(currentState, targetState, (p) rememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1031122203);
            transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
            composer.endReplaceGroup();
        }
        boolean changed = composer.changed(transition);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.DisposableEffect(transition, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Composable
    @k
    public static final <T> Transition<T> updateTransition(T t11, @m80.l String str, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i11, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new Transition(t11, str);
            composer.updateRememberedValue(rememberedValue);
        }
        final Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(t11, composer, (i11 & 8) | 48 | (i11 & 14));
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            Transition.this.onDisposed$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(transition, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    @Composable
    @n(message = "Use rememberTransition() instead", replaceWith = @w0(expression = "rememberTransition(transitionState, label)", imports = {}))
    @k
    public static final <T> Transition<T> updateTransition(@k MutableTransitionState<T> mutableTransitionState, @m80.l String str, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i11, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:852)");
        }
        Transition<T> rememberTransition = rememberTransition(mutableTransitionState, str, composer, i11 & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberTransition;
    }
}
