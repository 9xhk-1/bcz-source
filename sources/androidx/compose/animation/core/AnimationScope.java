package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,329:1\n85#2:330\n113#2,2:331\n85#2:333\n113#2,2:334\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n129#1:330\n129#1:331,2\n161#1:333\n161#1:334,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private long finishedTimeNanos = Long.MIN_VALUE;

    @k
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;

    @k
    private final x00.a<g2> onCancel;
    private final long startTimeNanos;
    private final T targetValue;

    @k
    private final TwoWayConverter<T, V> typeConverter;

    @k
    private final MutableState value$delegate;

    @k
    private V velocityVector;

    public AnimationScope(T t11, @k TwoWayConverter<T, V> twoWayConverter, @k V v11, long j11, T t12, long j12, boolean z11, @k x00.a<g2> aVar) {
        this.typeConverter = twoWayConverter;
        this.targetValue = t12;
        this.startTimeNanos = j12;
        this.onCancel = aVar;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.velocityVector = (V) AnimationVectorsKt.copy(v11);
        this.lastFrameTimeNanos = j11;
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    @k
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    @k
    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j11) {
        this.finishedTimeNanos = j11;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j11) {
        this.lastFrameTimeNanos = j11;
    }

    public final void setRunning$animation_core_release(boolean z11) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setValue$animation_core_release(T t11) {
        this.value$delegate.setValue(t11);
    }

    public final void setVelocityVector$animation_core_release(@k V v11) {
        this.velocityVector = v11;
    }

    @k
    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
