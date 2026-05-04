package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class LongPressResult {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Canceled extends LongPressResult {
        public static final int $stable = 0;

        @k
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Released extends LongPressResult {
        public static final int $stable = 0;

        @k
        private final PointerInputChange finalUpChange;

        public Released(@k PointerInputChange pointerInputChange) {
            super(null);
            this.finalUpChange = pointerInputChange;
        }

        @k
        public final PointerInputChange getFinalUpChange() {
            return this.finalUpChange;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Success extends LongPressResult {
        public static final int $stable = 0;

        @k
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ LongPressResult(v vVar) {
        this();
    }

    private LongPressResult() {
    }
}
