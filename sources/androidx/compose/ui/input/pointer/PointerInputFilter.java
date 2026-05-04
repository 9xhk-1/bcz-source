package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;

    @l
    private LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @l
    public final LayoutCoordinates getLayoutCoordinates$ui_release() {
        return this.layoutCoordinates;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3754getSizeYbymL2g() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo3865getSizeYbymL2g() : IntSize.Companion.m5291getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.isAttached;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo3755onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11);

    public final void setAttached$ui_release(boolean z11) {
        this.isAttached = z11;
    }

    public final void setLayoutCoordinates$ui_release(@l LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }
}
