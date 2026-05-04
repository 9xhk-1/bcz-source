package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TapGestureDetector_androidKt {
    public static final boolean firstDownRefersToPrimaryMouseButtonOnly() {
        return false;
    }

    public static final boolean isDeepPress(@k PointerEvent pointerEvent) {
        return pointerEvent.getClassification() == 2;
    }
}
