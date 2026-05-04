package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n79#2:155\n112#2,2:156\n1#3:158\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n*L\n94#1:155\n94#1:156,2\n*E\n"})
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;

    @k
    private p<? super LayoutDirection, ? super Density, ? extends Path> clipInOverlay;

    @l
    private LayerWithRenderer layerWithRenderer;

    @k
    private x00.a<Boolean> renderInOverlay;

    @k
    private SharedTransitionScopeImpl sharedScope;

    @k
    private final MutableFloatState zIndexInOverlay$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,154:1\n71#2:155\n65#2:156\n73#2:159\n69#2:160\n60#3:157\n70#3:161\n22#4:158\n22#4:162\n221#5,5:163\n249#5,9:168\n120#5,7:177\n259#5,4:184\n120#5,7:188\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n*L\n110#1:155\n110#1:156\n109#1:159\n109#1:160\n110#1:157\n109#1:161\n110#1:158\n109#1:162\n116#1:163,5\n116#1:168,9\n116#1:177,7\n116#1:184,4\n118#1:188,7\n*E\n"})
    public final class LayerWithRenderer implements LayerRenderer {

        @k
        private final GraphicsLayer layer;

        public LayerWithRenderer(@k GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public void drawInOverlay(@k DrawScope drawScope) {
            if (RenderInTransitionOverlayNode.this.getRenderInOverlay().invoke().booleanValue()) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
                long mo3866localPositionOfR5De75A = renderInTransitionOverlayNode.getSharedScope().getRoot$animation().mo3866localPositionOfR5De75A(DelegatableNodeKt.requireLayoutCoordinates(renderInTransitionOverlayNode), Offset.Companion.m2284getZeroF1C5BW0());
                float intBitsToFloat = Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A & 4294967295L));
                Path invoke = renderInTransitionOverlayNode.getClipInOverlay().invoke(drawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(renderInTransitionOverlayNode));
                if (invoke == null) {
                    drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, this.layer);
                        return;
                    } finally {
                    }
                }
                int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo2983clipPathmtrdDE(invoke, m2498getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, this.layer);
                    } finally {
                    }
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                }
            }
        }

        @k
        public final GraphicsLayer getLayer() {
            return this.layer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        @l
        public SharedElementInternalState getParentState() {
            return RenderInTransitionOverlayNode.this.getParentState();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public float getZIndex() {
            return RenderInTransitionOverlayNode.this.getZIndexInOverlay();
        }
    }

    public RenderInTransitionOverlayNode(@k SharedTransitionScopeImpl sharedTransitionScopeImpl, @k x00.a<Boolean> aVar, float f11, @k p<? super LayoutDirection, ? super Density, ? extends Path> pVar) {
        this.sharedScope = sharedTransitionScopeImpl;
        this.renderInOverlay = aVar;
        this.clipInOverlay = pVar;
        this.zIndexInOverlay$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k final ContentDrawScope contentDrawScope) {
        GraphicsLayer layer = getLayer();
        if (layer == null) {
            throw new IllegalArgumentException("Error: layer never initialized");
        }
        DrawScope.m3058recordJVtK1S4$default(contentDrawScope, layer, 0L, new x00.l<DrawScope, g2>() { // from class: androidx.compose.animation.RenderInTransitionOverlayNode$draw$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                ContentDrawScope.this.drawContent();
            }
        }, 1, null);
        if (this.renderInOverlay.invoke().booleanValue()) {
            return;
        }
        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
    }

    @k
    public final p<LayoutDirection, Density, Path> getClipInOverlay() {
        return this.clipInOverlay;
    }

    @l
    public final GraphicsLayer getLayer() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            return layerWithRenderer.getLayer();
        }
        return null;
    }

    @l
    public final SharedElementInternalState getParentState() {
        return (SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState());
    }

    @k
    public final x00.a<Boolean> getRenderInOverlay() {
        return this.renderInOverlay;
    }

    @k
    public final SharedTransitionScopeImpl getSharedScope() {
        return this.sharedScope;
    }

    public final float getZIndexInOverlay() {
        return this.zIndexInOverlay$delegate.getFloatValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.sharedScope.onLayerRendererCreated$animation(layerWithRenderer);
        this.layerWithRenderer = layerWithRenderer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            this.sharedScope.onLayerRendererRemoved$animation(layerWithRenderer);
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(layerWithRenderer.getLayer());
        }
    }

    public final void setClipInOverlay(@k p<? super LayoutDirection, ? super Density, ? extends Path> pVar) {
        this.clipInOverlay = pVar;
    }

    public final void setRenderInOverlay(@k x00.a<Boolean> aVar) {
        this.renderInOverlay = aVar;
    }

    public final void setSharedScope(@k SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedScope = sharedTransitionScopeImpl;
    }

    public final void setZIndexInOverlay(float f11) {
        this.zIndexInOverlay$delegate.setFloatValue(f11);
    }
}
