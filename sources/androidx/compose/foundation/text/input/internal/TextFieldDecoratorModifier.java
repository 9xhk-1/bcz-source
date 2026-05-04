package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @m80.l
    private final InputTransformation filter;

    @m80.k
    private final MutableInteractionSource interactionSource;
    private final boolean isPassword;

    @m80.l
    private final KeyboardActionHandler keyboardActionHandler;

    @m80.k
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;

    @m80.l
    private final kotlinx.coroutines.flow.x<g2> stylusHandwritingTrigger;

    @m80.k
    private final TextFieldSelectionState textFieldSelectionState;

    @m80.k
    private final TransformedTextFieldState textFieldState;

    @m80.k
    private final TextLayoutState textLayoutState;

    public TextFieldDecoratorModifier(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.l InputTransformation inputTransformation, boolean z11, boolean z12, @m80.k KeyboardOptions keyboardOptions, @m80.l KeyboardActionHandler keyboardActionHandler, boolean z13, @m80.k MutableInteractionSource mutableInteractionSource, boolean z14, @m80.l kotlinx.coroutines.flow.x<g2> xVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z11;
        this.readOnly = z12;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z13;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z14;
        this.stylusHandwritingTrigger = xVar;
    }

    private final TransformedTextFieldState component1() {
        return this.textFieldState;
    }

    private final MutableInteractionSource component10() {
        return this.interactionSource;
    }

    private final boolean component11() {
        return this.isPassword;
    }

    private final kotlinx.coroutines.flow.x<g2> component12() {
        return this.stylusHandwritingTrigger;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TextFieldSelectionState component3() {
        return this.textFieldSelectionState;
    }

    private final InputTransformation component4() {
        return this.filter;
    }

    private final boolean component5() {
        return this.enabled;
    }

    private final boolean component6() {
        return this.readOnly;
    }

    private final KeyboardOptions component7() {
        return this.keyboardOptions;
    }

    private final KeyboardActionHandler component8() {
        return this.keyboardActionHandler;
    }

    private final boolean component9() {
        return this.singleLine;
    }

    public static /* synthetic */ TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier textFieldDecoratorModifier, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z11, boolean z12, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z13, MutableInteractionSource mutableInteractionSource, boolean z14, kotlinx.coroutines.flow.x xVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            transformedTextFieldState = textFieldDecoratorModifier.textFieldState;
        }
        if ((i11 & 2) != 0) {
            textLayoutState = textFieldDecoratorModifier.textLayoutState;
        }
        if ((i11 & 4) != 0) {
            textFieldSelectionState = textFieldDecoratorModifier.textFieldSelectionState;
        }
        if ((i11 & 8) != 0) {
            inputTransformation = textFieldDecoratorModifier.filter;
        }
        if ((i11 & 16) != 0) {
            z11 = textFieldDecoratorModifier.enabled;
        }
        if ((i11 & 32) != 0) {
            z12 = textFieldDecoratorModifier.readOnly;
        }
        if ((i11 & 64) != 0) {
            keyboardOptions = textFieldDecoratorModifier.keyboardOptions;
        }
        if ((i11 & 128) != 0) {
            keyboardActionHandler = textFieldDecoratorModifier.keyboardActionHandler;
        }
        if ((i11 & 256) != 0) {
            z13 = textFieldDecoratorModifier.singleLine;
        }
        if ((i11 & 512) != 0) {
            mutableInteractionSource = textFieldDecoratorModifier.interactionSource;
        }
        if ((i11 & 1024) != 0) {
            z14 = textFieldDecoratorModifier.isPassword;
        }
        if ((i11 & 2048) != 0) {
            xVar = textFieldDecoratorModifier.stylusHandwritingTrigger;
        }
        boolean z15 = z14;
        kotlinx.coroutines.flow.x xVar2 = xVar;
        boolean z16 = z13;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        boolean z17 = z11;
        boolean z18 = z12;
        return textFieldDecoratorModifier.copy(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z17, z18, keyboardOptions2, keyboardActionHandler2, z16, mutableInteractionSource2, z15, xVar2);
    }

    @m80.k
    public final TextFieldDecoratorModifier copy(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.l InputTransformation inputTransformation, boolean z11, boolean z12, @m80.k KeyboardOptions keyboardOptions, @m80.l KeyboardActionHandler keyboardActionHandler, boolean z13, @m80.k MutableInteractionSource mutableInteractionSource, boolean z14, @m80.l kotlinx.coroutines.flow.x<g2> xVar) {
        return new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z11, z12, keyboardOptions, keyboardActionHandler, z13, mutableInteractionSource, z14, xVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return kotlin.jvm.internal.g0.g(this.textFieldState, textFieldDecoratorModifier.textFieldState) && kotlin.jvm.internal.g0.g(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && kotlin.jvm.internal.g0.g(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && kotlin.jvm.internal.g0.g(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && kotlin.jvm.internal.g0.g(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && kotlin.jvm.internal.g0.g(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && kotlin.jvm.internal.g0.g(this.interactionSource, textFieldDecoratorModifier.interactionSource) && this.isPassword == textFieldDecoratorModifier.isPassword && kotlin.jvm.internal.g0.g(this.stylusHandwritingTrigger, textFieldDecoratorModifier.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        InputTransformation inputTransformation = this.filter;
        int hashCode2 = (((((((hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31;
        KeyboardActionHandler keyboardActionHandler = this.keyboardActionHandler;
        int hashCode3 = (((((((hashCode2 + (keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode())) * 31) + Boolean.hashCode(this.singleLine)) * 31) + this.interactionSource.hashCode()) * 31) + Boolean.hashCode(this.isPassword)) * 31;
        kotlinx.coroutines.flow.x<g2> xVar = this.stylusHandwritingTrigger;
        return hashCode3 + (xVar != null ? xVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ", isPassword=" + this.isPassword + ", stylusHandwritingTrigger=" + this.stylusHandwritingTrigger + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
    }
}
