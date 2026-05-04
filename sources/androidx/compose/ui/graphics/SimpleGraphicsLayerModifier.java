package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,668:1\n83#2:669\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n633#1:669\n*E\n"})
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private float cameraDistance;
    private boolean clip;
    private int compositingStrategy;

    @m80.k
    private x00.l<? super GraphicsLayerScope, yz.g2> layerBlock;

    @m80.l
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;

    @m80.k
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11, kotlin.jvm.internal.v vVar) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, j12, j13, i11);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m2836getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m2837getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @m80.l
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    @m80.k
    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m2838getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m2839getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m3979requireCoordinator64DMado(this, NodeKind.m4118constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                x00.l lVar;
                Placeable placeable = Placeable.this;
                lVar = this.layerBlock;
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, lVar, 4, (Object) null);
            }
        }, 4, null);
    }

    public final void setAlpha(float f11) {
        this.alpha = f11;
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m2840setAmbientShadowColor8_81llA(long j11) {
        this.ambientShadowColor = j11;
    }

    public final void setCameraDistance(float f11) {
        this.cameraDistance = f11;
    }

    public final void setClip(boolean z11) {
        this.clip = z11;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m2841setCompositingStrategyaDBOjCE(int i11) {
        this.compositingStrategy = i11;
    }

    public final void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f11) {
        this.rotationX = f11;
    }

    public final void setRotationY(float f11) {
        this.rotationY = f11;
    }

    public final void setRotationZ(float f11) {
        this.rotationZ = f11;
    }

    public final void setScaleX(float f11) {
        this.scaleX = f11;
    }

    public final void setScaleY(float f11) {
        this.scaleY = f11;
    }

    public final void setShadowElevation(float f11) {
        this.shadowElevation = f11;
    }

    public final void setShape(@m80.k Shape shape) {
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m2842setSpotShadowColor8_81llA(long j11) {
        this.spotShadowColor = j11;
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m2843setTransformOrigin__ExYCQ(long j11) {
        this.transformOrigin = j11;
    }

    public final void setTranslationX(float f11) {
        this.translationX = f11;
    }

    public final void setTranslationY(float f11) {
        this.translationY = f11;
    }

    @m80.k
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m2898toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m2517toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m2517toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m2595toStringimpl(this.compositingStrategy)) + ')';
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, j12, j13, (i12 & 65536) != 0 ? CompositingStrategy.Companion.m2597getAutoNrFUSI() : i11, null);
    }

    private SimpleGraphicsLayerModifier(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11) {
        this.scaleX = f11;
        this.scaleY = f12;
        this.alpha = f13;
        this.translationX = f14;
        this.translationY = f15;
        this.shadowElevation = f16;
        this.rotationX = f17;
        this.rotationY = f18;
        this.rotationZ = f19;
        this.cameraDistance = f21;
        this.transformOrigin = j11;
        this.shape = shape;
        this.clip = z11;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j12;
        this.spotShadowColor = j13;
        this.compositingStrategy = i11;
        this.layerBlock = new x00.l<GraphicsLayerScope, yz.g2>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return yz.g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setScaleX(SimpleGraphicsLayerModifier.this.getScaleX());
                graphicsLayerScope.setScaleY(SimpleGraphicsLayerModifier.this.getScaleY());
                graphicsLayerScope.setAlpha(SimpleGraphicsLayerModifier.this.getAlpha());
                graphicsLayerScope.setTranslationX(SimpleGraphicsLayerModifier.this.getTranslationX());
                graphicsLayerScope.setTranslationY(SimpleGraphicsLayerModifier.this.getTranslationY());
                graphicsLayerScope.setShadowElevation(SimpleGraphicsLayerModifier.this.getShadowElevation());
                graphicsLayerScope.setRotationX(SimpleGraphicsLayerModifier.this.getRotationX());
                graphicsLayerScope.setRotationY(SimpleGraphicsLayerModifier.this.getRotationY());
                graphicsLayerScope.setRotationZ(SimpleGraphicsLayerModifier.this.getRotationZ());
                graphicsLayerScope.setCameraDistance(SimpleGraphicsLayerModifier.this.getCameraDistance());
                graphicsLayerScope.mo2701setTransformOrigin__ExYCQ(SimpleGraphicsLayerModifier.this.m2839getTransformOriginSzJe1aQ());
                graphicsLayerScope.setShape(SimpleGraphicsLayerModifier.this.getShape());
                graphicsLayerScope.setClip(SimpleGraphicsLayerModifier.this.getClip());
                graphicsLayerScope.setRenderEffect(SimpleGraphicsLayerModifier.this.getRenderEffect());
                graphicsLayerScope.mo2698setAmbientShadowColor8_81llA(SimpleGraphicsLayerModifier.this.m2836getAmbientShadowColor0d7_KjU());
                graphicsLayerScope.mo2700setSpotShadowColor8_81llA(SimpleGraphicsLayerModifier.this.m2838getSpotShadowColor0d7_KjU());
                graphicsLayerScope.mo2699setCompositingStrategyaDBOjCE(SimpleGraphicsLayerModifier.this.m2837getCompositingStrategyNrFUSI());
            }
        };
    }
}
