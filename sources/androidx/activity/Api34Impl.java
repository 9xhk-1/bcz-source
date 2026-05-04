package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes.dex */
public final class Api34Impl {

    @m80.k
    public static final Api34Impl INSTANCE = new Api34Impl();

    private Api34Impl() {
    }

    @m80.k
    public final BackEvent createOnBackEvent(float f11, float f12, float f13, int i11) {
        return new BackEvent(f11, f12, f13, i11);
    }

    public final float progress(@m80.k BackEvent backEvent) {
        g0.p(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int swipeEdge(@m80.k BackEvent backEvent) {
        g0.p(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float touchX(@m80.k BackEvent backEvent) {
        g0.p(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float touchY(@m80.k BackEvent backEvent) {
        g0.p(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
