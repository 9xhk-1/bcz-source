package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;

    @k
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;

    @k
    private final LayoutNode root;

    @k
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();

    @k
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(@k LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m3752processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return pointerInputEventProcessor.m3753processBIzXfog(pointerInputEvent, positionCalculator, z11);
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }

    @k
    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m3753processBIzXfog(@k PointerInputEvent pointerInputEvent, @k PositionCalculator positionCalculator, boolean z11) {
        boolean z12;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z13 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int size = produce.getChanges().size();
            for (int i11 = 0; i11 < size; i11++) {
                PointerInputChange valueAt = produce.getChanges().valueAt(i11);
                if (!valueAt.getPressed() && !valueAt.getPreviousPressed()) {
                }
                z12 = false;
                break;
            }
            z12 = true;
            int size2 = produce.getChanges().size();
            for (int i12 = 0; i12 < size2; i12++) {
                PointerInputChange valueAt2 = produce.getChanges().valueAt(i12);
                if (z12 || PointerEventKt.changedToDownIgnoreConsumed(valueAt2)) {
                    LayoutNode.m4027hitTest6fMxITs$ui_release$default(this.root, valueAt2.m3732getPositionF1C5BW0(), this.hitResult, valueAt2.m3735getTypeT8wyACA(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m3658addHitPathQJqDSyo(valueAt2.m3730getIdJ3iCeTQ(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(valueAt2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z11);
            if (!produce.getSuppressMovementConsumption()) {
                int size3 = produce.getChanges().size();
                for (int i13 = 0; i13 < size3; i13++) {
                    PointerInputChange valueAt3 = produce.getChanges().valueAt(i13);
                    if (PointerEventKt.positionChangedIgnoreConsumed(valueAt3) && valueAt3.isConsumed()) {
                        break;
                    }
                }
            }
            z13 = false;
            int ProcessResult = PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z13);
            this.isProcessing = false;
            return ProcessResult;
        } catch (Throwable th2) {
            this.isProcessing = false;
            throw th2;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
