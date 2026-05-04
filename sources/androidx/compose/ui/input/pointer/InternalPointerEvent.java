package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,38:1\n117#2,2:39\n34#2,6:41\n119#2:47\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n34#1:39,2\n34#1:41,6\n34#1:47\n*E\n"})
/* loaded from: classes.dex */
public final class InternalPointerEvent {
    public static final int $stable = 8;

    @k
    private final LongSparseArray<PointerInputChange> changes;

    @k
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public InternalPointerEvent(@k LongSparseArray<PointerInputChange> longSparseArray, @k PointerInputEvent pointerInputEvent) {
        this.changes = longSparseArray;
        this.pointerInputEvent = pointerInputEvent;
    }

    /* renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public final boolean m3660activeHoverEvent0FcD4WY(long j11) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i11);
            if (PointerId.m3714equalsimpl0(pointerInputEventData.m3746getIdJ3iCeTQ(), j11)) {
                break;
            }
            i11++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    @k
    public final LongSparseArray<PointerInputChange> getChanges() {
        return this.changes;
    }

    @k
    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    @k
    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void setSuppressMovementConsumption(boolean z11) {
        this.suppressMovementConsumption = z11;
    }
}
