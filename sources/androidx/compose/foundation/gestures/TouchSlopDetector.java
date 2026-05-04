package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1045:1\n65#2:1046\n69#2:1049\n69#2:1051\n65#2:1054\n60#3:1047\n70#3:1050\n70#3:1052\n60#3:1055\n53#3,3:1057\n53#3,3:1061\n22#4:1048\n22#4:1053\n30#5:1056\n30#5:1060\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n*L\n881#1:1046\n881#1:1049\n883#1:1051\n883#1:1054\n881#1:1047\n881#1:1050\n883#1:1052\n883#1:1055\n931#1:1057,3\n933#1:1061,3\n881#1:1048\n883#1:1053\n931#1:1056\n933#1:1060\n*E\n"})
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;

    @l
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j11, v vVar) {
        this(orientation, j11);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m521calculatePostSlopOffsettuRUvjQ(float f11) {
        if (this.orientation == null) {
            long j11 = this.totalPositionChange;
            return Offset.m2272minusMKHz9U(this.totalPositionChange, Offset.m2275timestuRUvjQ(Offset.m2263divtuRUvjQ(j11, Offset.m2266getDistanceimpl(j11)), f11));
        }
        float m524mainAxisk4lQ0M = m524mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m524mainAxisk4lQ0M(this.totalPositionChange)) * f11);
        float m523crossAxisk4lQ0M = m523crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m2260constructorimpl((Float.floatToRawIntBits(m524mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m523crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(m523crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m524mainAxisk4lQ0M) & 4294967295L));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m522addPointerInputChangedBAh8RU(@k PointerInputChange pointerInputChange, float f11) {
        long m2273plusMKHz9U = Offset.m2273plusMKHz9U(this.totalPositionChange, Offset.m2272minusMKHz9U(pointerInputChange.m3732getPositionF1C5BW0(), pointerInputChange.m3733getPreviousPositionF1C5BW0()));
        this.totalPositionChange = m2273plusMKHz9U;
        return (this.orientation == null ? Offset.m2266getDistanceimpl(m2273plusMKHz9U) : Math.abs(m524mainAxisk4lQ0M(m2273plusMKHz9U))) >= f11 ? m521calculatePostSlopOffsettuRUvjQ(f11) : Offset.Companion.m2283getUnspecifiedF1C5BW0();
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m523crossAxisk4lQ0M(long j11) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j11 & 4294967295L : j11 >> 32));
    }

    @l
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m524mainAxisk4lQ0M(long j11) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j11 >> 32 : j11 & 4294967295L));
    }

    public final void reset() {
        this.totalPositionChange = Offset.Companion.m2284getZeroF1C5BW0();
    }

    private TouchSlopDetector(Orientation orientation, long j11) {
        this.orientation = orientation;
        this.totalPositionChange = j11;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j11, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : orientation, (i11 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j11, null);
    }
}
