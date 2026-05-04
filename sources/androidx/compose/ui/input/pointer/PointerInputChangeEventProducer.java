package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,264:1\n34#2,6:265\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n178#1:265,6\n*E\n"})
/* loaded from: classes.dex */
final class PointerInputChangeEventProducer {

    @k
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j11, long j12, boolean z11, v vVar) {
            this(j11, j12, z11);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m3737getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j11, long j12, boolean z11) {
            this.uptime = j11;
            this.positionOnScreen = j12;
            this.down = z11;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    @k
    public final InternalPointerEvent produce(@k PointerInputEvent pointerInputEvent, @k PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long mo3813screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputEventData pointerInputEventData = pointers.get(i11);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m3746getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                mo3813screenToLocalMKHz9U = pointerInputEventData.m3748getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                mo3813screenToLocalMKHz9U = positionCalculator.mo3813screenToLocalMKHz9U(pointerInputData.m3737getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m3746getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m3746getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m3748getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, mo3813screenToLocalMKHz9U, down, false, pointerInputEventData.m3751getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m3750getScrollDeltaF1C5BW0(), pointerInputEventData.m3747getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(pointerInputEventData.m3746getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m3749getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                this.previousPointerInputData.remove(pointerInputEventData.m3746getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
