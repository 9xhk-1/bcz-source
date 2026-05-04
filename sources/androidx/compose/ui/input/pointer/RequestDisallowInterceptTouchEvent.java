package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RequestDisallowInterceptTouchEvent implements l<Boolean, g2> {
    public static final int $stable = 8;

    @m80.l
    private PointerInteropFilter pointerInteropFilter;

    @m80.l
    public final PointerInteropFilter getPointerInteropFilter$ui_release() {
        return this.pointerInteropFilter;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return g2.f100423a;
    }

    public final void setPointerInteropFilter$ui_release(@m80.l PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    public void invoke(boolean z11) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.setDisallowIntercept$ui_release(z11);
    }
}
