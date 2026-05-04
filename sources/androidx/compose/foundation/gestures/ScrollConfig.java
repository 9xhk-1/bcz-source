package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.unit.Density;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ScrollConfig {
    /* renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo399calculateMouseWheelScroll8xgXZGE(@k Density density, @k PointerEvent pointerEvent, long j11);

    default boolean isPreciseWheelScroll(@k PointerEvent pointerEvent) {
        return false;
    }

    default boolean isSmoothScrollingEnabled() {
        return true;
    }
}
