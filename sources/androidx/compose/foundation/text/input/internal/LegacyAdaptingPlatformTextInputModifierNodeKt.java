package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifierNodeKt {
    @m80.k
    public static final Modifier legacyTextInputAdapter(@m80.k Modifier modifier, @m80.k LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, @m80.k LegacyTextFieldState legacyTextFieldState, @m80.k TextFieldSelectionManager textFieldSelectionManager) {
        return modifier.then(new LegacyAdaptingPlatformTextInputModifier(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager));
    }
}
