package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@k FocusProperties focusProperties) {
        boolean z11;
        View embeddedView;
        if (getNode().isAttached()) {
            embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
            if (embeddedView.hasFocusable()) {
                z11 = true;
                focusProperties.setCanFocus(z11);
            }
        }
        z11 = false;
        focusProperties.setCanFocus(z11);
    }
}
