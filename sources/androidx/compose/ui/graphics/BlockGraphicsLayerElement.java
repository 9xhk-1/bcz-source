package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {

    @m80.k
    private final x00.l<GraphicsLayerScope, yz.g2> block;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(@m80.k x00.l<? super GraphicsLayerScope, yz.g2> lVar) {
        this.block = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockGraphicsLayerElement copy$default(BlockGraphicsLayerElement blockGraphicsLayerElement, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = blockGraphicsLayerElement.block;
        }
        return blockGraphicsLayerElement.copy(lVar);
    }

    @m80.k
    public final x00.l<GraphicsLayerScope, yz.g2> component1() {
        return this.block;
    }

    @m80.k
    public final BlockGraphicsLayerElement copy(@m80.k x00.l<? super GraphicsLayerScope, yz.g2> lVar) {
        return new BlockGraphicsLayerElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && kotlin.jvm.internal.g0.g(this.block, ((BlockGraphicsLayerElement) obj).block);
    }

    @m80.k
    public final x00.l<GraphicsLayerScope, yz.g2> getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.block);
    }

    @m80.k
    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.block + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(this.block);
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
