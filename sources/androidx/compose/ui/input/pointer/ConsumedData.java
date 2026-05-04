package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
/* loaded from: classes.dex */
public final class ConsumedData {
    public static final int $stable = 8;

    @l
    private PointerInputChange change;
    private boolean downChange;
    private boolean positionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConsumedData() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.ConsumedData.<init>():void");
    }

    public final boolean getDownChange() {
        PointerInputChange consumedDelegate$ui_release;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui_release = pointerInputChange.getConsumedDelegate$ui_release()) != null) {
            return consumedDelegate$ui_release.getDownChange$ui_release();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getDownChange$ui_release() : this.downChange;
    }

    public final boolean getPositionChange() {
        PointerInputChange consumedDelegate$ui_release;
        PointerInputChange pointerInputChange = this.change;
        if (pointerInputChange != null && (consumedDelegate$ui_release = pointerInputChange.getConsumedDelegate$ui_release()) != null) {
            return consumedDelegate$ui_release.getPositionChange$ui_release();
        }
        PointerInputChange pointerInputChange2 = this.change;
        return pointerInputChange2 != null ? pointerInputChange2.getPositionChange$ui_release() : this.positionChange;
    }

    public final void setDownChange(boolean z11) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate$ui_release = pointerInputChange != null ? pointerInputChange.getConsumedDelegate$ui_release() : null;
        if (consumedDelegate$ui_release != null) {
            consumedDelegate$ui_release.setDownChange$ui_release(z11);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui_release(z11);
        }
        this.downChange = z11;
    }

    public final void setPositionChange(boolean z11) {
        PointerInputChange pointerInputChange = this.change;
        PointerInputChange consumedDelegate$ui_release = pointerInputChange != null ? pointerInputChange.getConsumedDelegate$ui_release() : null;
        if (consumedDelegate$ui_release != null) {
            consumedDelegate$ui_release.setPositionChange$ui_release(z11);
        }
        PointerInputChange pointerInputChange2 = this.change;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui_release(z11);
        }
        this.positionChange = z11;
    }

    public ConsumedData(boolean z11, boolean z12) {
        this.positionChange = z11;
        this.downChange = z12;
    }

    public /* synthetic */ ConsumedData(boolean z11, boolean z12, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }

    public ConsumedData(@k PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange$ui_release(), pointerInputChange.getDownChange$ui_release());
        this.change = pointerInputChange;
    }

    @n(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @n(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }
}
