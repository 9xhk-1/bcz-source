package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollNode> {
    public static final int $stable = 0;
    private final boolean isVertical;
    private final boolean reverseScrolling;

    @m80.k
    private final ScrollState scrollState;

    public ScrollingLayoutElement(@m80.k ScrollState scrollState, boolean z11, boolean z12) {
        this.scrollState = scrollState;
        this.reverseScrolling = z11;
        this.isVertical = z12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return g0.g(this.scrollState, scrollingLayoutElement.scrollState) && this.reverseScrolling == scrollingLayoutElement.reverseScrolling && this.isVertical == scrollingLayoutElement.isVertical;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @m80.k
    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.reverseScrolling)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.scrollState);
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(this.reverseScrolling));
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.isVertical));
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public ScrollNode create() {
        return new ScrollNode(this.scrollState, this.reverseScrolling, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k ScrollNode scrollNode) {
        scrollNode.setState(this.scrollState);
        scrollNode.setReverseScrolling(this.reverseScrolling);
        scrollNode.setVertical(this.isVertical);
    }
}
