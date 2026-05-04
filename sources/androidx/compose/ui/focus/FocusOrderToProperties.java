package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;

    @k
    private final l<FocusOrder, g2> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOrderToProperties(@k l<? super FocusOrder, g2> lVar) {
        this.focusOrderReceiver = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(@k FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    @k
    public final l<FocusOrder, g2> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
