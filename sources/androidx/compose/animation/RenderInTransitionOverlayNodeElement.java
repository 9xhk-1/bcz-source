package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNodeElement extends ModifierNodeElement<RenderInTransitionOverlayNode> {
    public static final int $stable = 0;

    @k
    private final p<LayoutDirection, Density, Path> clipInOverlay;

    @k
    private x00.a<Boolean> renderInOverlay;

    @k
    private SharedTransitionScopeImpl sharedTransitionScope;
    private final float zIndexInOverlay;

    /* JADX WARN: Multi-variable type inference failed */
    public RenderInTransitionOverlayNodeElement(@k SharedTransitionScopeImpl sharedTransitionScopeImpl, @k x00.a<Boolean> aVar, float f11, @k p<? super LayoutDirection, ? super Density, ? extends Path> pVar) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
        this.renderInOverlay = aVar;
        this.zIndexInOverlay = f11;
        this.clipInOverlay = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderInTransitionOverlayNodeElement copy$default(RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement, SharedTransitionScopeImpl sharedTransitionScopeImpl, x00.a aVar, float f11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sharedTransitionScopeImpl = renderInTransitionOverlayNodeElement.sharedTransitionScope;
        }
        if ((i11 & 2) != 0) {
            aVar = renderInTransitionOverlayNodeElement.renderInOverlay;
        }
        if ((i11 & 4) != 0) {
            f11 = renderInTransitionOverlayNodeElement.zIndexInOverlay;
        }
        if ((i11 & 8) != 0) {
            pVar = renderInTransitionOverlayNodeElement.clipInOverlay;
        }
        return renderInTransitionOverlayNodeElement.copy(sharedTransitionScopeImpl, aVar, f11, pVar);
    }

    @k
    public final SharedTransitionScopeImpl component1() {
        return this.sharedTransitionScope;
    }

    @k
    public final x00.a<Boolean> component2() {
        return this.renderInOverlay;
    }

    public final float component3() {
        return this.zIndexInOverlay;
    }

    @k
    public final p<LayoutDirection, Density, Path> component4() {
        return this.clipInOverlay;
    }

    @k
    public final RenderInTransitionOverlayNodeElement copy(@k SharedTransitionScopeImpl sharedTransitionScopeImpl, @k x00.a<Boolean> aVar, float f11, @k p<? super LayoutDirection, ? super Density, ? extends Path> pVar) {
        return new RenderInTransitionOverlayNodeElement(sharedTransitionScopeImpl, aVar, f11, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (obj instanceof RenderInTransitionOverlayNodeElement) {
            RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
            if (g0.g(this.sharedTransitionScope, renderInTransitionOverlayNodeElement.sharedTransitionScope) && this.renderInOverlay == renderInTransitionOverlayNodeElement.renderInOverlay && this.zIndexInOverlay == renderInTransitionOverlayNodeElement.zIndexInOverlay && this.clipInOverlay == renderInTransitionOverlayNodeElement.clipInOverlay) {
                return true;
            }
        }
        return false;
    }

    @k
    public final p<LayoutDirection, Density, Path> getClipInOverlay() {
        return this.clipInOverlay;
    }

    @k
    public final x00.a<Boolean> getRenderInOverlay() {
        return this.renderInOverlay;
    }

    @k
    public final SharedTransitionScopeImpl getSharedTransitionScope() {
        return this.sharedTransitionScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.sharedTransitionScope.hashCode() * 31) + this.renderInOverlay.hashCode()) * 31) + Float.hashCode(this.zIndexInOverlay)) * 31) + this.clipInOverlay.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("renderInSharedTransitionOverlay");
        inspectorInfo.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
        inspectorInfo.getProperties().set("renderInOverlay", this.renderInOverlay);
        inspectorInfo.getProperties().set("zIndexInOverlay", Float.valueOf(this.zIndexInOverlay));
        inspectorInfo.getProperties().set("clipInOverlayDuringTransition", this.clipInOverlay);
    }

    public final void setRenderInOverlay(@k x00.a<Boolean> aVar) {
        this.renderInOverlay = aVar;
    }

    public final void setSharedTransitionScope(@k SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedTransitionScope = sharedTransitionScopeImpl;
    }

    @k
    public String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.sharedTransitionScope + ", renderInOverlay=" + this.renderInOverlay + ", zIndexInOverlay=" + this.zIndexInOverlay + ", clipInOverlay=" + this.clipInOverlay + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public RenderInTransitionOverlayNode create() {
        return new RenderInTransitionOverlayNode(this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay, this.clipInOverlay);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k RenderInTransitionOverlayNode renderInTransitionOverlayNode) {
        renderInTransitionOverlayNode.setSharedScope(this.sharedTransitionScope);
        renderInTransitionOverlayNode.setRenderInOverlay(this.renderInOverlay);
        renderInTransitionOverlayNode.setZIndexInOverlay(this.zIndexInOverlay);
        renderInTransitionOverlayNode.setClipInOverlay(this.clipInOverlay);
    }
}
