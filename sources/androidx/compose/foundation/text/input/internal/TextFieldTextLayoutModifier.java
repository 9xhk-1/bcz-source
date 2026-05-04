package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;

    @m80.k
    private final KeyboardOptions keyboardOptions;

    @m80.l
    private final x00.p<Density, x00.a<TextLayoutResult>, g2> onTextLayout;
    private final boolean singleLine;

    @m80.k
    private final TransformedTextFieldState textFieldState;

    @m80.k
    private final TextLayoutState textLayoutState;

    @m80.k
    private final TextStyle textStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(@m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, @m80.l x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> pVar, @m80.k KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z11;
        this.onTextLayout = pVar;
        this.keyboardOptions = keyboardOptions;
    }

    private final TextLayoutState component1() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component2() {
        return this.textFieldState;
    }

    private final TextStyle component3() {
        return this.textStyle;
    }

    private final boolean component4() {
        return this.singleLine;
    }

    private final x00.p<Density, x00.a<TextLayoutResult>, g2> component5() {
        return this.onTextLayout;
    }

    private final KeyboardOptions component6() {
        return this.keyboardOptions;
    }

    public static /* synthetic */ TextFieldTextLayoutModifier copy$default(TextFieldTextLayoutModifier textFieldTextLayoutModifier, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z11, x00.p pVar, KeyboardOptions keyboardOptions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textLayoutState = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i11 & 2) != 0) {
            transformedTextFieldState = textFieldTextLayoutModifier.textFieldState;
        }
        if ((i11 & 4) != 0) {
            textStyle = textFieldTextLayoutModifier.textStyle;
        }
        if ((i11 & 8) != 0) {
            z11 = textFieldTextLayoutModifier.singleLine;
        }
        if ((i11 & 16) != 0) {
            pVar = textFieldTextLayoutModifier.onTextLayout;
        }
        if ((i11 & 32) != 0) {
            keyboardOptions = textFieldTextLayoutModifier.keyboardOptions;
        }
        x00.p pVar2 = pVar;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        return textFieldTextLayoutModifier.copy(textLayoutState, transformedTextFieldState, textStyle, z11, pVar2, keyboardOptions2);
    }

    @m80.k
    public final TextFieldTextLayoutModifier copy(@m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, @m80.l x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> pVar, @m80.k KeyboardOptions keyboardOptions) {
        return new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z11, pVar, keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return kotlin.jvm.internal.g0.g(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && kotlin.jvm.internal.g0.g(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && kotlin.jvm.internal.g0.g(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && kotlin.jvm.internal.g0.g(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout) && kotlin.jvm.internal.g0.g(this.keyboardOptions, textFieldTextLayoutModifier.keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((this.textLayoutState.hashCode() * 31) + this.textFieldState.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
        x00.p<Density, x00.a<TextLayoutResult>, g2> pVar = this.onTextLayout;
        return ((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + this.keyboardOptions.hashCode();
    }

    @m80.k
    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ", keyboardOptions=" + this.keyboardOptions + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public TextFieldTextLayoutModifierNode create() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode) {
        textFieldTextLayoutModifierNode.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
    }
}
