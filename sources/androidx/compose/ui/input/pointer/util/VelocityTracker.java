package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,706:1\n65#2:707\n69#2:710\n60#3:708\n70#3:711\n22#4:709\n22#4:712\n56#5,5:713\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n*L\n75#1:707\n76#1:710\n75#1:708\n76#1:711\n75#1:709\n76#1:712\n103#1:713,5\n*E\n"})
/* loaded from: classes.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;

    @k
    private final VelocityTracker1D.Strategy strategy;

    @k
    private final VelocityTracker1D xVelocityTracker;

    @k
    private final VelocityTracker1D yVelocityTracker;

    public VelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTrackerKt.getVelocityTrackerStrategyUseImpulse() ? VelocityTracker1D.Strategy.Impulse : VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        this.xVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.yVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.currentPointerPositionAccumulator = Offset.Companion.m2284getZeroF1C5BW0();
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m3828addPositionUv8p0NA(long j11, long j12) {
        this.xVelocityTracker.addDataPoint(j11, Float.intBitsToFloat((int) (j12 >> 32)));
        this.yVelocityTracker.addDataPoint(j11, Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m3829calculateVelocity9UxMQ8M() {
        return m3830calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m3830calculateVelocityAH228Gc(long j11) {
        if (!(Velocity.m5353getXimpl(j11) > 0.0f && Velocity.m5354getYimpl(j11) > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m5360toStringimpl(j11)));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m5353getXimpl(j11)), this.yVelocityTracker.calculateVelocity(Velocity.m5354getYimpl(j11)));
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m3831getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m3832setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j11) {
        this.currentPointerPositionAccumulator = j11;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j11) {
        this.lastMoveEventTimeStamp = j11;
    }
}
