package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ClicksCounter {
    private int clicks;

    @l
    private PointerInputChange prevClick;

    @k
    private final ViewConfiguration viewConfiguration;

    public ClicksCounter(@k ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public final int getClicks() {
        return this.clicks;
    }

    @l
    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean positionIsTolerable(@k PointerInputChange pointerInputChange, @k PointerInputChange pointerInputChange2) {
        boolean distanceIsTolerable;
        distanceIsTolerable = SelectionGesturesKt.distanceIsTolerable(this.viewConfiguration, pointerInputChange, pointerInputChange2);
        return distanceIsTolerable;
    }

    public final void setClicks(int i11) {
        this.clicks = i11;
    }

    public final void setPrevClick(@l PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean timeIsTolerable(@k PointerInputChange pointerInputChange, @k PointerInputChange pointerInputChange2) {
        return pointerInputChange2.getUptimeMillis() - pointerInputChange.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis();
    }

    public final void update(@k PointerEvent pointerEvent) {
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
