package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;

    @m80.k
    private final Brush cursorBrush;
    private final boolean isDragHovered;
    private final boolean isFocused;

    @m80.k
    private final Orientation orientation;

    @m80.k
    private final ScrollState scrollState;

    @m80.k
    private final TextFieldSelectionState textFieldSelectionState;

    @m80.k
    private final TransformedTextFieldState textFieldState;

    @m80.k
    private final TextLayoutState textLayoutState;
    private final boolean writeable;

    public TextFieldCoreModifier(boolean z11, boolean z12, @m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k Brush brush, boolean z13, @m80.k ScrollState scrollState, @m80.k Orientation orientation) {
        this.isFocused = z11;
        this.isDragHovered = z12;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z13;
        this.scrollState = scrollState;
        this.orientation = orientation;
    }

    private final boolean component1() {
        return this.isFocused;
    }

    private final boolean component2() {
        return this.isDragHovered;
    }

    private final TextLayoutState component3() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component4() {
        return this.textFieldState;
    }

    private final TextFieldSelectionState component5() {
        return this.textFieldSelectionState;
    }

    private final Brush component6() {
        return this.cursorBrush;
    }

    private final boolean component7() {
        return this.writeable;
    }

    private final ScrollState component8() {
        return this.scrollState;
    }

    private final Orientation component9() {
        return this.orientation;
    }

    public static /* synthetic */ TextFieldCoreModifier copy$default(TextFieldCoreModifier textFieldCoreModifier, boolean z11, boolean z12, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z13, ScrollState scrollState, Orientation orientation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = textFieldCoreModifier.isFocused;
        }
        if ((i11 & 2) != 0) {
            z12 = textFieldCoreModifier.isDragHovered;
        }
        if ((i11 & 4) != 0) {
            textLayoutState = textFieldCoreModifier.textLayoutState;
        }
        if ((i11 & 8) != 0) {
            transformedTextFieldState = textFieldCoreModifier.textFieldState;
        }
        if ((i11 & 16) != 0) {
            textFieldSelectionState = textFieldCoreModifier.textFieldSelectionState;
        }
        if ((i11 & 32) != 0) {
            brush = textFieldCoreModifier.cursorBrush;
        }
        if ((i11 & 64) != 0) {
            z13 = textFieldCoreModifier.writeable;
        }
        if ((i11 & 128) != 0) {
            scrollState = textFieldCoreModifier.scrollState;
        }
        if ((i11 & 256) != 0) {
            orientation = textFieldCoreModifier.orientation;
        }
        ScrollState scrollState2 = scrollState;
        Orientation orientation2 = orientation;
        Brush brush2 = brush;
        boolean z14 = z13;
        TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
        TextLayoutState textLayoutState2 = textLayoutState;
        return textFieldCoreModifier.copy(z11, z12, textLayoutState2, transformedTextFieldState, textFieldSelectionState2, brush2, z14, scrollState2, orientation2);
    }

    @m80.k
    public final TextFieldCoreModifier copy(boolean z11, boolean z12, @m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k Brush brush, boolean z13, @m80.k ScrollState scrollState, @m80.k Orientation orientation) {
        return new TextFieldCoreModifier(z11, z12, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z13, scrollState, orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && kotlin.jvm.internal.g0.g(this.textLayoutState, textFieldCoreModifier.textLayoutState) && kotlin.jvm.internal.g0.g(this.textFieldState, textFieldCoreModifier.textFieldState) && kotlin.jvm.internal.g0.g(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && kotlin.jvm.internal.g0.g(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && kotlin.jvm.internal.g0.g(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isFocused) * 31) + Boolean.hashCode(this.isDragHovered)) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + Boolean.hashCode(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    @m80.k
    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.updateNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
    }
}
