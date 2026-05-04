package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMotionEventAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventAdapter\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,349:1\n30#2:350\n30#2:354\n30#2:359\n30#2:363\n53#3,3:351\n53#3,3:355\n53#3,3:360\n53#3,3:364\n139#4:358\n*S KotlinDebug\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventAdapter\n*L\n256#1:350\n260#1:354\n284#1:359\n316#1:363\n256#1:351,3\n260#1:355,3\n284#1:360,3\n316#1:364,3\n283#1:358\n*E\n"})
/* loaded from: classes.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private long nextId;

    @k
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    @k
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    @k
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j11 = this.nextId;
                this.nextId = 1 + j11;
                sparseLongArray.put(pointerId, j11);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j12 = this.nextId;
            this.nextId = 1 + j12;
            sparseLongArray2.put(pointerId2, j12);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int i11, boolean z11) {
        long j11;
        long j12;
        int i12;
        long m3662getComposePointerId_I2yYro = m3662getComposePointerId_I2yYro(motionEvent.getPointerId(i11));
        float pressure = motionEvent.getPressure(i11);
        char c11 = ' ';
        long j13 = 4294967295L;
        long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(motionEvent.getY(i11)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i11)) << 32));
        long m2262copydBAh8RU$default = Offset.m2262copydBAh8RU$default(m2260constructorimpl, 0.0f, 0.0f, 3, null);
        if (i11 == 0) {
            j12 = Offset.m2260constructorimpl((Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32));
            j11 = positionCalculator.mo3813screenToLocalMKHz9U(j12);
        } else if (Build.VERSION.SDK_INT >= 29) {
            j12 = MotionEventHelper.INSTANCE.m3663toRawOffsetdBAh8RU(motionEvent, i11);
            j11 = positionCalculator.mo3813screenToLocalMKHz9U(j12);
        } else {
            long mo3812localToScreenMKHz9U = positionCalculator.mo3812localToScreenMKHz9U(m2260constructorimpl);
            j11 = m2260constructorimpl;
            j12 = mo3812localToScreenMKHz9U;
        }
        int toolType = motionEvent.getToolType(i11);
        int m3811getUnknownT8wyACA = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? PointerType.Companion.m3811getUnknownT8wyACA() : PointerType.Companion.m3807getEraserT8wyACA() : PointerType.Companion.m3808getMouseT8wyACA() : PointerType.Companion.m3809getStylusT8wyACA() : PointerType.Companion.m3810getTouchT8wyACA() : PointerType.Companion.m3811getUnknownT8wyACA();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i13 = 0;
        while (i13 < historySize) {
            float historicalX = motionEvent.getHistoricalX(i11, i13);
            float historicalY = motionEvent.getHistoricalY(i11, i13);
            char c12 = c11;
            long j14 = j13;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i12 = i13;
            } else {
                long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(historicalX) << c12) | (Float.floatToRawIntBits(historicalY) & j14));
                i12 = i13;
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i12), m2260constructorimpl2, m2260constructorimpl2, null));
            }
            i13 = i12 + 1;
            c11 = c12;
            j13 = j14;
        }
        return new PointerInputEventData(m3662getComposePointerId_I2yYro, motionEvent.getEventTime(), j12, j11, z11, pressure, m3811getUnknownT8wyACA, this.activeHoverIds.get(motionEvent.getPointerId(i11), false), arrayList, motionEvent.getActionMasked() == 8 ? Offset.m2260constructorimpl((Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j13) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c11)) : Offset.Companion.m2284getZeroF1C5BW0(), m2262copydBAh8RU$default, null);
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m3662getComposePointerId_I2yYro(int i11) {
        long j11;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i11);
        if (indexOfKey >= 0) {
            j11 = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            j11 = this.nextId;
            this.nextId = 1 + j11;
            this.motionEventToComposePointerIdMap.put(i11, j11);
        }
        return PointerId.m3712constructorimpl(j11);
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i11) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (motionEvent.getPointerId(i12) == i11) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(keyAt);
                }
            }
        }
    }

    @l
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@k MotionEvent motionEvent, @k PositionCalculator positionCalculator) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z11 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z12 = actionMasked == 8;
        if (z11) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i11 = 0;
        while (i11 < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i11, (z11 || i11 == actionIndex || (z12 && motionEvent.getButtonState() == 0)) ? false : true));
            i11++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i11) {
        this.activeHoverIds.delete(i11);
        this.motionEventToComposePointerIdMap.delete(i11);
    }

    @k
    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }
}
