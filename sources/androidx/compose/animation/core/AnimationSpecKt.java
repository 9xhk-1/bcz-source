package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import androidx.compose.runtime.Stable;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t11) {
        if (t11 == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t11);
    }

    @Stable
    @k
    public static final <T> AnimationSpec<T> delayed(@k AnimationSpec<T> animationSpec, long j11) {
        return new StartDelayAnimationSpec(animationSpec, j11);
    }

    @Stable
    @n(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m168constructorimpl$default(0, 0, 2, null), (v) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    @k
    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m135infiniteRepeatable9IiC70o(@k DurationBasedAnimationSpec<T> durationBasedAnimationSpec, @k RepeatMode repeatMode, long j11) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j11, (v) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m136infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i11 & 4) != 0) {
            j11 = StartOffset.m168constructorimpl$default(0, 0, 2, null);
        }
        return m135infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j11);
    }

    @Stable
    @k
    public static final <T> KeyframesSpec<T> keyframes(@k l<? super KeyframesSpec.KeyframesSpecConfig<T>, g2> lVar) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        lVar.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @k
    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(@k l<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, g2> lVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        lVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }

    @Stable
    @n(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ RepeatableSpec repeatable(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new RepeatableSpec(i11, durationBasedAnimationSpec, repeatMode, StartOffset.m168constructorimpl$default(0, 0, 2, null), (v) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i11, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    @k
    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m137repeatable91I0pcU(int i11, @k DurationBasedAnimationSpec<T> durationBasedAnimationSpec, @k RepeatMode repeatMode, long j11) {
        return new RepeatableSpec<>(i11, durationBasedAnimationSpec, repeatMode, j11, (v) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m138repeatable91I0pcU$default(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i12 & 8) != 0) {
            j11 = StartOffset.m168constructorimpl$default(0, 0, 2, null);
        }
        return m137repeatable91I0pcU(i11, durationBasedAnimationSpec, repeatMode, j11);
    }

    @Stable
    @k
    public static final <T> SnapSpec<T> snap(int i11) {
        return new SnapSpec<>(i11);
    }

    public static /* synthetic */ SnapSpec snap$default(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return snap(i11);
    }

    @Stable
    @k
    public static final <T> SpringSpec<T> spring(float f11, float f12, @m80.l T t11) {
        return new SpringSpec<>(f11, f12, t11);
    }

    public static /* synthetic */ SpringSpec spring$default(float f11, float f12, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1500.0f;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return spring(f11, f12, obj);
    }

    @Stable
    @k
    public static final <T> TweenSpec<T> tween(int i11, int i12, @k Easing easing) {
        return new TweenSpec<>(i11, i12, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i11, int i12, Easing easing, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 300;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i11, i12, easing);
    }

    @k
    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(@FloatRange(from = 0.0d, to = 1.0d) float f11, @k l<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, g2> lVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        lVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig, f11);
    }
}
