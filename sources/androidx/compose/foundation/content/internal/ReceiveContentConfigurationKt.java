package androidx.compose.foundation.content.internal;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ReceiveContentConfigurationKt {

    @k
    private static final ProvidableModifierLocal<ReceiveContentConfiguration> ModifierLocalReceiveContent = ModifierLocalKt.modifierLocalOf(new a<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt$ModifierLocalReceiveContent$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ReceiveContentConfiguration invoke() {
            return null;
        }
    });

    @k
    public static final ProvidableModifierLocal<ReceiveContentConfiguration> getModifierLocalReceiveContent() {
        return ModifierLocalReceiveContent;
    }

    @l
    public static final ReceiveContentConfiguration getReceiveContentConfiguration(@k ModifierLocalModifierNode modifierLocalModifierNode) {
        if (modifierLocalModifierNode.getNode().isAttached()) {
            return (ReceiveContentConfiguration) modifierLocalModifierNode.getCurrent(ModifierLocalReceiveContent);
        }
        return null;
    }
}
