package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,232:1\n34#2,6:233\n34#2,6:239\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n102#1:233,6\n124#1:239,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;

    @k
    private final List<PointerInputChange> changes;

    @l
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(@k List<PointerInputChange> list, @l InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m3665constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m3794constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m3671calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m3671calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                PointerInputChange pointerInputChange = list.get(i11);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m3689getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m3688getPress7fucELk();
                }
            }
            return PointerEventType.Companion.m3687getMove7fucELk();
        }
        int actionMasked = motionEvent$ui_release.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return PointerEventType.Companion.m3690getScroll7fucELk();
                        case 9:
                            return PointerEventType.Companion.m3685getEnter7fucELk();
                        case 10:
                            return PointerEventType.Companion.m3686getExit7fucELk();
                        default:
                            return PointerEventType.Companion.m3691getUnknown7fucELk();
                    }
                }
                return PointerEventType.Companion.m3687getMove7fucELk();
            }
            return PointerEventType.Companion.m3689getRelease7fucELk();
        }
        return PointerEventType.Companion.m3688getPress7fucELk();
    }

    @k
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    @k
    public final PointerEvent copy(@k List<PointerInputChange> list, @l MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (g0.g(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            PointerInputChange pointerInputChange = list.get(i11);
            longSparseArray.put(pointerInputChange.m3730getIdJ3iCeTQ(), pointerInputChange);
            long m3730getIdJ3iCeTQ = pointerInputChange.m3730getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long m3732getPositionF1C5BW0 = pointerInputChange.m3732getPositionF1C5BW0();
            long m3732getPositionF1C5BW02 = pointerInputChange.m3732getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int m3735getTypeT8wyACA = pointerInputChange.m3735getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i12 = i11;
            arrayList.add(new PointerInputEventData(m3730getIdJ3iCeTQ, uptimeMillis, m3732getPositionF1C5BW0, m3732getPositionF1C5BW02, pressed, pressure, m3735getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m3660activeHoverEvent0FcD4WY(pointerInputChange.m3730getIdJ3iCeTQ()), null, 0L, 0L, 1792, null));
            i11 = i12 + 1;
        }
        return new PointerEvent(list, new InternalPointerEvent(longSparseArray, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m3672getButtonsry648PA() {
        return this.buttons;
    }

    @k
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final int getClassification() {
        MotionEvent motionEvent$ui_release;
        int classification;
        if (Build.VERSION.SDK_INT < 29 || (motionEvent$ui_release = getMotionEvent$ui_release()) == null) {
            return 0;
        }
        classification = motionEvent$ui_release.getClassification();
        return classification;
    }

    @l
    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m3673getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    @l
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m3674getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m3675setTypeEhbLWgg$ui_release(int i11) {
        this.type = i11;
    }

    public PointerEvent(@k List<PointerInputChange> list) {
        this(list, null);
    }
}
