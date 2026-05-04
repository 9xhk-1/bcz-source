package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MotionDragState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);
    private final long dragAmount;
    private final boolean isDragging;
    private final long velocity;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
        public final MotionDragState m5528onDragk4lQ0M(long j11) {
            return new MotionDragState(true, j11, Velocity.Companion.m5364getZero9UxMQ8M(), null);
        }

        @k
        /* renamed from: onDragEnd-TH1AsA0, reason: not valid java name */
        public final MotionDragState m5529onDragEndTH1AsA0(long j11) {
            return new MotionDragState(false, Offset.Companion.m2283getUnspecifiedF1C5BW0(), j11, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ MotionDragState(boolean z11, long j11, long j12, v vVar) {
        this(z11, j11, j12);
    }

    /* renamed from: copy-dhPbTwU$default, reason: not valid java name */
    public static /* synthetic */ MotionDragState m5522copydhPbTwU$default(MotionDragState motionDragState, boolean z11, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = motionDragState.isDragging;
        }
        if ((i11 & 2) != 0) {
            j11 = motionDragState.dragAmount;
        }
        if ((i11 & 4) != 0) {
            j12 = motionDragState.velocity;
        }
        return motionDragState.m5525copydhPbTwU(z11, j11, j12);
    }

    public final boolean component1() {
        return this.isDragging;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m5523component2F1C5BW0() {
        return this.dragAmount;
    }

    /* renamed from: component3-9UxMQ8M, reason: not valid java name */
    public final long m5524component39UxMQ8M() {
        return this.velocity;
    }

    @k
    /* renamed from: copy-dhPbTwU, reason: not valid java name */
    public final MotionDragState m5525copydhPbTwU(boolean z11, long j11, long j12) {
        return new MotionDragState(z11, j11, j12, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionDragState)) {
            return false;
        }
        MotionDragState motionDragState = (MotionDragState) obj;
        return this.isDragging == motionDragState.isDragging && Offset.m2265equalsimpl0(this.dragAmount, motionDragState.dragAmount) && Velocity.m5352equalsimpl0(this.velocity, motionDragState.velocity);
    }

    /* renamed from: getDragAmount-F1C5BW0, reason: not valid java name */
    public final long m5526getDragAmountF1C5BW0() {
        return this.dragAmount;
    }

    /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
    public final long m5527getVelocity9UxMQ8M() {
        return this.velocity;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isDragging) * 31) + Offset.m2270hashCodeimpl(this.dragAmount)) * 31) + Velocity.m5355hashCodeimpl(this.velocity);
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    @k
    public String toString() {
        return "MotionDragState(isDragging=" + this.isDragging + ", dragAmount=" + ((Object) Offset.m2276toStringimpl(this.dragAmount)) + ", velocity=" + ((Object) Velocity.m5360toStringimpl(this.velocity)) + ')';
    }

    private MotionDragState(boolean z11, long j11, long j12) {
        this.isDragging = z11;
        this.dragAmount = j11;
        this.velocity = j12;
    }
}
