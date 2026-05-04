package androidx.compose.foundation.text.input.internal.selection;

import android.annotation.SuppressLint;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidTextFieldMagnifier_androidKt {
    @SuppressLint({"ModifierFactoryExtensionFunction", "ModifierFactoryReturnType"})
    @k
    public static final TextFieldMagnifierNode textFieldMagnifierNode(@k TransformedTextFieldState transformedTextFieldState, @k TextFieldSelectionState textFieldSelectionState, @k TextLayoutState textLayoutState, boolean z11) {
        return Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? new TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z11) : new TextFieldMagnifierNode() { // from class: androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt$textFieldMagnifierNode$1
            @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
            public void update(TransformedTextFieldState transformedTextFieldState2, TextFieldSelectionState textFieldSelectionState2, TextLayoutState textLayoutState2, boolean z12) {
            }
        };
    }
}
