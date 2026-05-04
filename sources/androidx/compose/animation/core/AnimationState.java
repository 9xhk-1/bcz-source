package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 4)
@u0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,329:1\n85#2:330\n113#2,2:331\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n49#1:330\n49#1:331,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;

    @k
    private final TwoWayConverter<T, V> typeConverter;

    @k
    private final MutableState value$delegate;

    @k
    private V velocityVector;

    public AnimationState(@k TwoWayConverter<T, V> twoWayConverter, T t11, @l V v11, long j11, long j12, boolean z11) {
        V v12;
        this.typeConverter = twoWayConverter;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.velocityVector = (v11 == null || (v12 = (V) AnimationVectorsKt.copy(v11)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(twoWayConverter, t11) : v12;
        this.lastFrameTimeNanos = j11;
        this.finishedTimeNanos = j12;
        this.isRunning = z11;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    @k
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
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
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j11) {
        this.finishedTimeNanos = j11;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j11) {
        this.lastFrameTimeNanos = j11;
    }

    public final void setRunning$animation_core_release(boolean z11) {
        this.isRunning = z11;
    }

    public void setValue$animation_core_release(T t11) {
        this.value$delegate.setValue(t11);
    }

    public final void setVelocityVector$animation_core_release(@k V v11) {
        this.velocityVector = v11;
    }

    @k
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j11, long j12, boolean z11, int i11, v vVar) {
        this(twoWayConverter, obj, (i11 & 4) != 0 ? null : animationVector, (i11 & 8) != 0 ? Long.MIN_VALUE : j11, (i11 & 16) != 0 ? Long.MIN_VALUE : j12, (i11 & 32) != 0 ? false : z11);
    }
}
