package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @m80.k
    private final FocusRequester focusRequester;

    @m80.k
    private final ImeOptions imeOptions;
    private final boolean isPassword;

    @m80.k
    private final TextFieldSelectionManager manager;

    @m80.k
    private final OffsetMapping offsetMapping;
    private final boolean readOnly;

    @m80.k
    private final LegacyTextFieldState state;

    @m80.k
    private final TransformedText transformedText;

    @m80.k
    private final TextFieldValue value;

    public CoreTextFieldSemanticsModifier(@m80.k TransformedText transformedText, @m80.k TextFieldValue textFieldValue, @m80.k LegacyTextFieldState legacyTextFieldState, boolean z11, boolean z12, boolean z13, @m80.k OffsetMapping offsetMapping, @m80.k TextFieldSelectionManager textFieldSelectionManager, @m80.k ImeOptions imeOptions, @m80.k FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z11;
        this.enabled = z12;
        this.isPassword = z13;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ CoreTextFieldSemanticsModifier copy$default(CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier, TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z11, boolean z12, boolean z13, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            transformedText = coreTextFieldSemanticsModifier.transformedText;
        }
        if ((i11 & 2) != 0) {
            textFieldValue = coreTextFieldSemanticsModifier.value;
        }
        if ((i11 & 4) != 0) {
            legacyTextFieldState = coreTextFieldSemanticsModifier.state;
        }
        if ((i11 & 8) != 0) {
            z11 = coreTextFieldSemanticsModifier.readOnly;
        }
        if ((i11 & 16) != 0) {
            z12 = coreTextFieldSemanticsModifier.enabled;
        }
        if ((i11 & 32) != 0) {
            z13 = coreTextFieldSemanticsModifier.isPassword;
        }
        if ((i11 & 64) != 0) {
            offsetMapping = coreTextFieldSemanticsModifier.offsetMapping;
        }
        if ((i11 & 128) != 0) {
            textFieldSelectionManager = coreTextFieldSemanticsModifier.manager;
        }
        if ((i11 & 256) != 0) {
            imeOptions = coreTextFieldSemanticsModifier.imeOptions;
        }
        if ((i11 & 512) != 0) {
            focusRequester = coreTextFieldSemanticsModifier.focusRequester;
        }
        ImeOptions imeOptions2 = imeOptions;
        FocusRequester focusRequester2 = focusRequester;
        OffsetMapping offsetMapping2 = offsetMapping;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        boolean z14 = z12;
        boolean z15 = z13;
        return coreTextFieldSemanticsModifier.copy(transformedText, textFieldValue, legacyTextFieldState, z11, z14, z15, offsetMapping2, textFieldSelectionManager2, imeOptions2, focusRequester2);
    }

    @m80.k
    public final TransformedText component1() {
        return this.transformedText;
    }

    @m80.k
    public final FocusRequester component10() {
        return this.focusRequester;
    }

    @m80.k
    public final TextFieldValue component2() {
        return this.value;
    }

    @m80.k
    public final LegacyTextFieldState component3() {
        return this.state;
    }

    public final boolean component4() {
        return this.readOnly;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final boolean component6() {
        return this.isPassword;
    }

    @m80.k
    public final OffsetMapping component7() {
        return this.offsetMapping;
    }

    @m80.k
    public final TextFieldSelectionManager component8() {
        return this.manager;
    }

    @m80.k
    public final ImeOptions component9() {
        return this.imeOptions;
    }

    @m80.k
    public final CoreTextFieldSemanticsModifier copy(@m80.k TransformedText transformedText, @m80.k TextFieldValue textFieldValue, @m80.k LegacyTextFieldState legacyTextFieldState, boolean z11, boolean z12, boolean z13, @m80.k OffsetMapping offsetMapping, @m80.k TextFieldSelectionManager textFieldSelectionManager, @m80.k ImeOptions imeOptions, @m80.k FocusRequester focusRequester) {
        return new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState, z11, z12, z13, offsetMapping, textFieldSelectionManager, imeOptions, focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return kotlin.jvm.internal.g0.g(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && kotlin.jvm.internal.g0.g(this.value, coreTextFieldSemanticsModifier.value) && kotlin.jvm.internal.g0.g(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && kotlin.jvm.internal.g0.g(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && kotlin.jvm.internal.g0.g(this.manager, coreTextFieldSemanticsModifier.manager) && kotlin.jvm.internal.g0.g(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && kotlin.jvm.internal.g0.g(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m80.k
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @m80.k
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    @m80.k
    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    @m80.k
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @m80.k
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    @m80.k
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    @m80.k
    public final TextFieldValue getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    @m80.k
    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public CoreTextFieldSemanticsModifierNode create() {
        return new CoreTextFieldSemanticsModifierNode(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.updateNodeSemantics(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
    }
}
