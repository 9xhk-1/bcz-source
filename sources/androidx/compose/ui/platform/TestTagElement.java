package androidx.compose.ui.platform;

import androidx.compose.ui.node.ModifierNodeElement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TestTagElement extends ModifierNodeElement<TestTagNode> {

    @m80.k
    private final String tag;

    public TestTagElement(@m80.k String str) {
        this.tag = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return kotlin.jvm.internal.g0.g(this.tag, ((TestTagElement) obj).tag);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("testTag");
        inspectorInfo.getProperties().set("tag", this.tag);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public TestTagNode create() {
        return new TestTagNode(this.tag);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k TestTagNode testTagNode) {
        testTagNode.setTag(this.tag);
    }
}
