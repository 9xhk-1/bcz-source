package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;

        @k
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;

        public /* synthetic */ DragDelta(long j11, v vVar) {
            this(j11);
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m414getDeltaF1C5BW0() {
            return this.delta;
        }

        private DragDelta(long j11) {
            super(null);
            this.delta = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        public /* synthetic */ DragStarted(long j11, v vVar) {
            this(j11);
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m415getStartPointF1C5BW0() {
            return this.startPoint;
        }

        private DragStarted(long j11) {
            super(null);
            this.startPoint = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final long velocity;

        public /* synthetic */ DragStopped(long j11, v vVar) {
            this(j11);
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m416getVelocity9UxMQ8M() {
            return this.velocity;
        }

        private DragStopped(long j11) {
            super(null);
            this.velocity = j11;
        }
    }

    public /* synthetic */ DragEvent(v vVar) {
        this();
    }

    private DragEvent() {
    }
}
