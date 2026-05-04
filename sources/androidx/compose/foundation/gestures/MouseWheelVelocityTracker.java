package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelVelocityTracker\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,363:1\n65#2:364\n69#2:367\n60#3:365\n70#3:368\n22#4:366\n22#4:369\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelVelocityTracker\n*L\n342#1:364\n343#1:367\n342#1:365\n343#1:368\n342#1:366\n343#1:369\n*E\n"})
/* loaded from: classes.dex */
final class MouseWheelVelocityTracker {

    @k
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(true);

    @k
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(true);

    /* renamed from: addDelta-Uv8p0NA, reason: not valid java name */
    public final void m467addDeltaUv8p0NA(long j11, long j12) {
        this.xVelocityTracker.addDataPoint(j11, Float.intBitsToFloat((int) (j12 >> 32)));
        this.yVelocityTracker.addDataPoint(j11, Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m468calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Float.MAX_VALUE), this.yVelocityTracker.calculateVelocity(Float.MAX_VALUE));
    }
}
