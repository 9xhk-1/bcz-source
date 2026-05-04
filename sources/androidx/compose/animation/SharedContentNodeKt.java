package androidx.compose.animation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SharedContentNodeKt {

    @k
    private static final ProvidableModifierLocal<SharedElementInternalState> ModifierLocalSharedElementInternalState = ModifierLocalKt.modifierLocalOf(new x00.a<SharedElementInternalState>() { // from class: androidx.compose.animation.SharedContentNodeKt$ModifierLocalSharedElementInternalState$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SharedElementInternalState invoke() {
            return null;
        }
    });

    @k
    public static final ProvidableModifierLocal<SharedElementInternalState> getModifierLocalSharedElementInternalState() {
        return ModifierLocalSharedElementInternalState;
    }
}
