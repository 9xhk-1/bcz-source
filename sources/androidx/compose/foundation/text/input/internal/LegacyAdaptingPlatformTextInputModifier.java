package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {

    @m80.k
    private final LegacyTextFieldState legacyTextFieldState;

    @m80.k
    private final LegacyPlatformTextInputServiceAdapter serviceAdapter;

    @m80.k
    private final TextFieldSelectionManager textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifier(@m80.k LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, @m80.k LegacyTextFieldState legacyTextFieldState, @m80.k TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = legacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    public static /* synthetic */ LegacyAdaptingPlatformTextInputModifier copy$default(LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            legacyPlatformTextInputServiceAdapter = legacyAdaptingPlatformTextInputModifier.serviceAdapter;
        }
        if ((i11 & 2) != 0) {
            legacyTextFieldState = legacyAdaptingPlatformTextInputModifier.legacyTextFieldState;
        }
        if ((i11 & 4) != 0) {
            textFieldSelectionManager = legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager;
        }
        return legacyAdaptingPlatformTextInputModifier.copy(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    @m80.k
    public final LegacyPlatformTextInputServiceAdapter component1() {
        return this.serviceAdapter;
    }

    @m80.k
    public final LegacyTextFieldState component2() {
        return this.legacyTextFieldState;
    }

    @m80.k
    public final TextFieldSelectionManager component3() {
        return this.textFieldSelectionManager;
    }

    @m80.k
    public final LegacyAdaptingPlatformTextInputModifier copy(@m80.k LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, @m80.k LegacyTextFieldState legacyTextFieldState, @m80.k TextFieldSelectionManager textFieldSelectionManager) {
        return new LegacyAdaptingPlatformTextInputModifier(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return kotlin.jvm.internal.g0.g(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && kotlin.jvm.internal.g0.g(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && kotlin.jvm.internal.g0.g(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    @m80.k
    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @m80.k
    public final LegacyPlatformTextInputServiceAdapter getServiceAdapter() {
        return this.serviceAdapter;
    }

    @m80.k
    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.serviceAdapter.hashCode() * 31) + this.legacyTextFieldState.hashCode()) * 31) + this.textFieldSelectionManager.hashCode();
    }

    @m80.k
    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public LegacyAdaptingPlatformTextInputModifierNode create() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        legacyAdaptingPlatformTextInputModifierNode.setServiceAdapter(this.serviceAdapter);
        legacyAdaptingPlatformTextInputModifierNode.setLegacyTextFieldState(this.legacyTextFieldState);
        legacyAdaptingPlatformTextInputModifierNode.setTextFieldSelectionManager(this.textFieldSelectionManager);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
    }
}
