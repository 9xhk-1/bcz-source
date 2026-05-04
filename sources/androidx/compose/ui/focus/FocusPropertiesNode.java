package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {

    @k
    private FocusPropertiesScope focusPropertiesScope;

    public FocusPropertiesNode(@k FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@k FocusProperties focusProperties) {
        this.focusPropertiesScope.apply(focusProperties);
    }

    @k
    public final FocusPropertiesScope getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    public final void setFocusPropertiesScope(@k FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }
}
