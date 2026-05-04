package androidx.compose.ui.tooling.animation.clock;

import a00.g0;
import a00.m0;
import a00.r0;
import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,260:1\n1360#2:261\n1446#2,5:262\n30#3:267\n30#3:269\n80#4:268\n80#4:270\n80#4:272\n80#4:274\n53#4,3:276\n53#4,3:280\n53#4,3:284\n53#4,3:288\n32#5:271\n32#5:273\n33#6:275\n33#6:279\n30#7:283\n30#7:287\n123#8:291\n118#8:292\n113#8:293\n*S KotlinDebug\n*F\n+ 1 Utils.android.kt\nandroidx/compose/ui/tooling/animation/clock/Utils_androidKt\n*L\n56#1:261\n56#1:262,5\n189#1:267\n190#1:269\n189#1:268\n190#1:270\n194#1:272\n195#1:274\n199#1:276,3\n200#1:280,3\n204#1:284,3\n205#1:288,3\n194#1:271\n195#1:273\n199#1:275\n200#1:279\n204#1:283\n205#1:287\n161#1:291\n161#1:292\n161#1:293\n*E\n"})
/* loaded from: classes2.dex */
public final class Utils_androidKt {

    @k
    private static final List<String> IGNORE_TRANSITIONS = g0.l("TransformOriginInterruptionHandling");

    @k
    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(@k Transition<?> transition) {
        List<Transition<?>> transitions = transition.getTransitions();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = transitions.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, allAnimations((Transition) it.next()));
        }
        return r0.I4(transition.getAnimations(), arrayList);
    }

    @k
    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(@k Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, long j11) {
        return createTransitionInfo(transitionAnimationState.getAnimation(), transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec(), j11);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState transitionAnimationState, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1;
        }
        return createTransitionInfo(transitionAnimationState, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createTransitionInfo$lambda$1(c0<Long> c0Var) {
        return c0Var.getValue().longValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$2(c0<? extends Map<Long, T>> c0Var) {
        return c0Var.getValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(c0<? extends Map<Long, T>> c0Var) {
        return c0Var.getValue();
    }

    @k
    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long millisToNanos(long j11) {
        return j11 * 1000000;
    }

    public static final long nanosToMillis(long j11) {
        return (j11 + 999999) / 1000000;
    }

    @l
    public static final <T> TargetState<T> parseParametersToValue(T t11, @k Object obj, @l Object obj2) {
        TargetState<T> targetState;
        if (t11 == null) {
            return null;
        }
        TargetState<T> targetState2 = (TargetState<T>) parseParametersToValue$parseDp(t11, obj, obj2);
        if (targetState2 != null) {
            return targetState2;
        }
        if (!parseParametersToValue$parametersAreValid(obj, obj2)) {
            return null;
        }
        kotlin.jvm.internal.g0.m(obj2);
        if (parseParametersToValue$parametersHasTheSameType(t11, obj, obj2)) {
            return new TargetState<>(obj, obj2);
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            try {
                if (t11 instanceof IntSize) {
                    Object obj3 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.g0.n(((List) obj).get(1), "null cannot be cast to non-null type kotlin.Int");
                    IntSize m5278boximpl = IntSize.m5278boximpl(IntSize.m5281constructorimpl((intValue << 32) | (((Integer) r1).intValue() & 4294967295L)));
                    Object obj4 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int intValue2 = ((Integer) obj4).intValue();
                    kotlin.jvm.internal.g0.n(((List) obj2).get(1), "null cannot be cast to non-null type kotlin.Int");
                    targetState = new TargetState<>(m5278boximpl, IntSize.m5278boximpl(IntSize.m5281constructorimpl((((Integer) r2).intValue() & 4294967295L) | (intValue2 << 32))));
                } else if (t11 instanceof IntOffset) {
                    Object obj5 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.n(obj5, "null cannot be cast to non-null type kotlin.Int");
                    int intValue3 = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.g0.n(((List) obj).get(1), "null cannot be cast to non-null type kotlin.Int");
                    IntOffset m5234boximpl = IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((intValue3 << 32) | (((Integer) r1).intValue() & 4294967295L)));
                    Object obj6 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.n(obj6, "null cannot be cast to non-null type kotlin.Int");
                    int intValue4 = ((Integer) obj6).intValue();
                    kotlin.jvm.internal.g0.n(((List) obj2).get(1), "null cannot be cast to non-null type kotlin.Int");
                    targetState = new TargetState<>(m5234boximpl, IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((((Integer) r2).intValue() & 4294967295L) | (intValue4 << 32))));
                } else if (t11 instanceof Size) {
                    Object obj7 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.n(obj7, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) obj7).floatValue();
                    Object obj8 = ((List) obj).get(1);
                    kotlin.jvm.internal.g0.n(obj8, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue2 = ((Float) obj8).floatValue();
                    Size m2325boximpl = Size.m2325boximpl(Size.m2328constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L)));
                    Object obj9 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.n(obj9, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue3 = ((Float) obj9).floatValue();
                    Object obj10 = ((List) obj2).get(1);
                    kotlin.jvm.internal.g0.n(obj10, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue4 = ((Float) obj10).floatValue();
                    targetState = new TargetState<>(m2325boximpl, Size.m2325boximpl(Size.m2328constructorimpl((Float.floatToRawIntBits(floatValue4) & 4294967295L) | (Float.floatToRawIntBits(floatValue3) << 32))));
                } else if (t11 instanceof Offset) {
                    Object obj11 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.n(obj11, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue5 = ((Float) obj11).floatValue();
                    Object obj12 = ((List) obj).get(1);
                    kotlin.jvm.internal.g0.n(obj12, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue6 = ((Float) obj12).floatValue();
                    Offset m2257boximpl = Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(floatValue5) << 32) | (Float.floatToRawIntBits(floatValue6) & 4294967295L)));
                    Object obj13 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.n(obj13, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue7 = ((Float) obj13).floatValue();
                    Object obj14 = ((List) obj2).get(1);
                    kotlin.jvm.internal.g0.n(obj14, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue8 = ((Float) obj14).floatValue();
                    targetState = new TargetState<>(m2257boximpl, Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(floatValue8) & 4294967295L) | (Float.floatToRawIntBits(floatValue7) << 32))));
                } else if (t11 instanceof Rect) {
                    Object obj15 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.n(obj15, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue9 = ((Float) obj15).floatValue();
                    Object obj16 = ((List) obj).get(1);
                    kotlin.jvm.internal.g0.n(obj16, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue10 = ((Float) obj16).floatValue();
                    Object obj17 = ((List) obj).get(2);
                    kotlin.jvm.internal.g0.n(obj17, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue11 = ((Float) obj17).floatValue();
                    Object obj18 = ((List) obj).get(3);
                    kotlin.jvm.internal.g0.n(obj18, "null cannot be cast to non-null type kotlin.Float");
                    Rect rect = new Rect(floatValue9, floatValue10, floatValue11, ((Float) obj18).floatValue());
                    Object obj19 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.n(obj19, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue12 = ((Float) obj19).floatValue();
                    Object obj20 = ((List) obj2).get(1);
                    kotlin.jvm.internal.g0.n(obj20, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue13 = ((Float) obj20).floatValue();
                    Object obj21 = ((List) obj2).get(2);
                    kotlin.jvm.internal.g0.n(obj21, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue14 = ((Float) obj21).floatValue();
                    Object obj22 = ((List) obj2).get(3);
                    kotlin.jvm.internal.g0.n(obj22, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(rect, new Rect(floatValue12, floatValue13, floatValue14, ((Float) obj22).floatValue()));
                } else if (t11 instanceof Color) {
                    Object obj23 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.n(obj23, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue15 = ((Float) obj23).floatValue();
                    Object obj24 = ((List) obj).get(1);
                    kotlin.jvm.internal.g0.n(obj24, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue16 = ((Float) obj24).floatValue();
                    Object obj25 = ((List) obj).get(2);
                    kotlin.jvm.internal.g0.n(obj25, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue17 = ((Float) obj25).floatValue();
                    Object obj26 = ((List) obj).get(3);
                    kotlin.jvm.internal.g0.n(obj26, "null cannot be cast to non-null type kotlin.Float");
                    Color m2499boximpl = Color.m2499boximpl(ColorKt.Color$default(floatValue15, floatValue16, floatValue17, ((Float) obj26).floatValue(), null, 16, null));
                    Object obj27 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.n(obj27, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue18 = ((Float) obj27).floatValue();
                    Object obj28 = ((List) obj2).get(1);
                    kotlin.jvm.internal.g0.n(obj28, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue19 = ((Float) obj28).floatValue();
                    Object obj29 = ((List) obj2).get(2);
                    kotlin.jvm.internal.g0.n(obj29, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue20 = ((Float) obj29).floatValue();
                    Object obj30 = ((List) obj2).get(3);
                    kotlin.jvm.internal.g0.n(obj30, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m2499boximpl, Color.m2499boximpl(ColorKt.Color$default(floatValue18, floatValue19, floatValue20, ((Float) obj30).floatValue(), null, 16, null)));
                } else if (t11 instanceof Dp) {
                    Object obj31 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.m(obj31);
                    Object obj32 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.m(obj32);
                    targetState = (TargetState<T>) parseParametersToValue$parseDp(t11, obj31, obj32);
                } else if (parseParametersToValue$parametersAreValid(((List) obj).get(0), ((List) obj2).get(0))) {
                    Object obj33 = ((List) obj).get(0);
                    kotlin.jvm.internal.g0.m(obj33);
                    Object obj34 = ((List) obj2).get(0);
                    kotlin.jvm.internal.g0.m(obj34);
                    if (parseParametersToValue$parametersHasTheSameType(t11, obj33, obj34)) {
                        targetState = new TargetState<>(((List) obj).get(0), ((List) obj2).get(0));
                    }
                }
                kotlin.jvm.internal.g0.n(targetState, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                return targetState;
            } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            }
        }
        return null;
    }

    private static final Dp parseParametersToValue$getDp(Object obj) {
        Dp dp2 = obj instanceof Dp ? (Dp) obj : null;
        if (dp2 == null) {
            Float f11 = obj instanceof Float ? (Float) obj : null;
            dp2 = f11 != null ? Dp.m5113boximpl(Dp.m5115constructorimpl(f11.floatValue())) : null;
            if (dp2 == null) {
                Double d11 = obj instanceof Double ? (Double) obj : null;
                dp2 = d11 != null ? Dp.m5113boximpl(Dp.m5115constructorimpl((float) d11.doubleValue())) : null;
                if (dp2 == null) {
                    if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                        return Dp.m5113boximpl(Dp.m5115constructorimpl(r4.intValue()));
                    }
                    return null;
                }
            }
        }
        return dp2;
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object obj, Object obj2) {
        return (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) ? false : true;
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object obj, Object obj2, Object obj3) {
        return obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass();
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T t11, Object obj, Object obj2) {
        if ((t11 instanceof Dp) && obj2 != null) {
            if ((obj instanceof Dp) && (obj2 instanceof Dp)) {
                return new TargetState<>(obj, obj2);
            }
            Dp parseParametersToValue$getDp = parseParametersToValue$getDp(obj);
            Dp parseParametersToValue$getDp2 = parseParametersToValue$getDp(obj2);
            if (parseParametersToValue$getDp != null && parseParametersToValue$getDp2 != null) {
                return new TargetState<>(parseParametersToValue$getDp, parseParametersToValue$getDp2);
            }
        }
        return null;
    }

    @k
    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(@k final Animation<T, V> animation, @k String str, @k final AnimationSpec<T> animationSpec, final long j11) {
        final long nanosToMillis = nanosToMillis(animation.getDurationNanos());
        final c0 c11 = e0.c(new a<Long>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$startTimeMs$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Long invoke() {
                Number number = 0L;
                Object obj = animationSpec;
                if (obj instanceof TweenSpec) {
                    number = Integer.valueOf(((TweenSpec) obj).getDelay());
                } else if (obj instanceof SnapSpec) {
                    number = Integer.valueOf(((SnapSpec) obj).getDelay());
                } else if (obj instanceof KeyframesSpec) {
                    number = Integer.valueOf(((KeyframesSpec) obj).getConfig().getDelayMillis());
                } else if (obj instanceof RepeatableSpec) {
                    if (StartOffsetType.m179equalsimpl0(StartOffset.m172getOffsetTypeEo1U57Q(((RepeatableSpec) obj).m163getInitialStartOffsetRmkjzm4()), StartOffsetType.Companion.m183getDelayEo1U57Q())) {
                        number = Integer.valueOf(StartOffset.m171getOffsetMillisimpl(((RepeatableSpec) animationSpec).m163getInitialStartOffsetRmkjzm4()));
                    }
                } else if (obj instanceof InfiniteRepeatableSpec) {
                    if (StartOffsetType.m179equalsimpl0(StartOffset.m172getOffsetTypeEo1U57Q(((InfiniteRepeatableSpec) obj).m150getInitialStartOffsetRmkjzm4()), StartOffsetType.Companion.m183getDelayEo1U57Q())) {
                        number = Integer.valueOf(StartOffset.m171getOffsetMillisimpl(((InfiniteRepeatableSpec) animationSpec).m150getInitialStartOffsetRmkjzm4()));
                    }
                } else if (obj instanceof VectorizedDurationBasedAnimationSpec) {
                    number = Integer.valueOf(((VectorizedDurationBasedAnimationSpec) obj).getDelayMillis());
                }
                return Long.valueOf(number.longValue());
            }
        });
        return new TransitionInfo(str, animationSpec.getClass().getName(), createTransitionInfo$lambda$1(c11), nanosToMillis, createTransitionInfo$lambda$2(e0.c(new a<Map<Long, T>>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$values$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public final Map<Long, T> invoke() {
                long createTransitionInfo$lambda$1;
                long createTransitionInfo$lambda$12;
                long createTransitionInfo$lambda$13;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                createTransitionInfo$lambda$1 = Utils_androidKt.createTransitionInfo$lambda$1(c11);
                Long valueOf = Long.valueOf(createTransitionInfo$lambda$1);
                Animation<T, V> animation2 = animation;
                createTransitionInfo$lambda$12 = Utils_androidKt.createTransitionInfo$lambda$1(c11);
                linkedHashMap.put(valueOf, animation2.getValueFromNanos(Utils_androidKt.millisToNanos(createTransitionInfo$lambda$12)));
                linkedHashMap.put(Long.valueOf(nanosToMillis), animation.getValueFromNanos(Utils_androidKt.millisToNanos(nanosToMillis)));
                createTransitionInfo$lambda$13 = Utils_androidKt.createTransitionInfo$lambda$1(c11);
                while (createTransitionInfo$lambda$13 <= nanosToMillis) {
                    linkedHashMap.put(Long.valueOf(createTransitionInfo$lambda$13), animation.getValueFromNanos(Utils_androidKt.millisToNanos(createTransitionInfo$lambda$13)));
                    createTransitionInfo$lambda$13 += j11;
                }
                return linkedHashMap;
            }
        })));
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation animation, String str, AnimationSpec animationSpec, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = 1;
        }
        return createTransitionInfo(animation, str, animationSpec, j11);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState transitionAnimationState, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1;
        }
        return createTransitionInfo(transitionAnimationState, j11, j12);
    }

    @k
    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(@k final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, final long j11, final long j12) {
        final long j13 = 0;
        return new TransitionInfo(transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec().getClass().getName(), 0L, j12, createTransitionInfo$lambda$3(e0.c(new a<Map<Long, T>>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$values$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public final Map<Long, T> invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Long.valueOf(j13), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(j13)));
                linkedHashMap.put(Long.valueOf(j12), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(j12)));
                long j14 = j13;
                while (j14 <= j12) {
                    linkedHashMap.put(Long.valueOf(j14), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(j14)));
                    j14 += j11;
                }
                return linkedHashMap;
            }
        })));
    }
}
