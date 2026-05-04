package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c60.c;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class NestedScrollElement extends ModifierNodeElement<NestedScrollNode> {

    @k
    private final NestedScrollConnection connection;

    @l
    private final NestedScrollDispatcher dispatcher;

    public NestedScrollElement(@k NestedScrollConnection nestedScrollConnection, @l NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.dispatcher = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return g0.g(nestedScrollElement.connection, this.connection) && g0.g(nestedScrollElement.dispatcher, this.dispatcher);
    }

    @k
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    @l
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.connection.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        return hashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set(c.f8163j, this.connection);
        inspectorInfo.getProperties().set("dispatcher", this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public NestedScrollNode create() {
        return new NestedScrollNode(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k NestedScrollNode nestedScrollNode) {
        nestedScrollNode.updateNode$ui_release(this.connection, this.dispatcher);
    }
}
