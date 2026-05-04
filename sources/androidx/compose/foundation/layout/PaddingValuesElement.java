package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;

    @m80.k
    private final PaddingValues paddingValues;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(@m80.k PaddingValues paddingValues, @m80.k l<? super InspectorInfo, g2> lVar) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return g0.g(this.paddingValues, paddingValuesElement.paddingValues);
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @m80.k
    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public PaddingValuesModifier create() {
        return new PaddingValuesModifier(this.paddingValues);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k PaddingValuesModifier paddingValuesModifier) {
        paddingValuesModifier.setPaddingValues(this.paddingValues);
    }
}
