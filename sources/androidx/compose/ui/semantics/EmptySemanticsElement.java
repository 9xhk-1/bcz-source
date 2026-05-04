package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {
    public static final int $stable = 0;

    @k
    private final EmptySemanticsModifier node;

    public EmptySemanticsElement(@k EmptySemanticsModifier emptySemanticsModifier) {
        this.node = emptySemanticsModifier;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k EmptySemanticsModifier emptySemanticsModifier) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public EmptySemanticsModifier create() {
        return this.node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
    }
}
