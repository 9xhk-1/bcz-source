package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerInputEvent {
    public static final int $stable = 8;

    @k
    private final MotionEvent motionEvent;

    @k
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public PointerInputEvent(long j11, @k List<PointerInputEventData> list, @k MotionEvent motionEvent) {
        this.uptime = j11;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    @k
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    @k
    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }
}
