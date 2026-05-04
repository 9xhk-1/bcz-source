package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends ModifierNodeElement<LazyLayoutSemanticsModifierNode> {

    @k
    private final x00.a<LazyLayoutItemProvider> itemProviderLambda;

    @k
    private final Orientation orientation;
    private final boolean reverseScrolling;

    @k
    private final LazyLayoutSemanticState state;
    private final boolean userScrollEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsModifier(@k x00.a<? extends LazyLayoutItemProvider> aVar, @k LazyLayoutSemanticState lazyLayoutSemanticState, @k Orientation orientation, boolean z11, boolean z12) {
        this.itemProviderLambda = aVar;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z11;
        this.reverseScrolling = z12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.itemProviderLambda == lazyLayoutSemanticsModifier.itemProviderLambda && g0.g(this.state, lazyLayoutSemanticsModifier.state) && this.orientation == lazyLayoutSemanticsModifier.orientation && this.userScrollEnabled == lazyLayoutSemanticsModifier.userScrollEnabled && this.reverseScrolling == lazyLayoutSemanticsModifier.reverseScrolling;
    }

    @k
    public final x00.a<LazyLayoutItemProvider> getItemProviderLambda() {
        return this.itemProviderLambda;
    }

    @k
    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @k
    public final LazyLayoutSemanticState getState() {
        return this.state;
    }

    public final boolean getUserScrollEnabled() {
        return this.userScrollEnabled;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LazyLayoutSemanticsModifierNode create() {
        return new LazyLayoutSemanticsModifierNode(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        lazyLayoutSemanticsModifierNode.update(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
    }
}
