package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class TransformEvent {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        public /* synthetic */ TransformDelta(float f11, long j11, float f12, v vVar) {
            this(f11, j11, f12);
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name */
        public final long m525getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        private TransformDelta(float f11, long j11, float f12) {
            super(null);
            this.zoomChange = f11;
            this.panChange = j11;
            this.rotationChange = f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;

        @k
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;

        @k
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    public /* synthetic */ TransformEvent(v vVar) {
        this();
    }

    private TransformEvent() {
    }
}
