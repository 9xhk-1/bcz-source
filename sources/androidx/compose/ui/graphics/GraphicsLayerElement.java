package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;

    @m80.l
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;

    @m80.k
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerElement(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11, kotlin.jvm.internal.v vVar) {
        this(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, j12, j13, i11);
    }

    /* renamed from: copy-JVvOYNQ$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerElement m2656copyJVvOYNQ$default(GraphicsLayerElement graphicsLayerElement, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11, int i12, Object obj) {
        int i13;
        long j14;
        float f22 = (i12 & 1) != 0 ? graphicsLayerElement.scaleX : f11;
        float f23 = (i12 & 2) != 0 ? graphicsLayerElement.scaleY : f12;
        float f24 = (i12 & 4) != 0 ? graphicsLayerElement.alpha : f13;
        float f25 = (i12 & 8) != 0 ? graphicsLayerElement.translationX : f14;
        float f26 = (i12 & 16) != 0 ? graphicsLayerElement.translationY : f15;
        float f27 = (i12 & 32) != 0 ? graphicsLayerElement.shadowElevation : f16;
        float f28 = (i12 & 64) != 0 ? graphicsLayerElement.rotationX : f17;
        float f29 = (i12 & 128) != 0 ? graphicsLayerElement.rotationY : f18;
        float f31 = (i12 & 256) != 0 ? graphicsLayerElement.rotationZ : f19;
        float f32 = (i12 & 512) != 0 ? graphicsLayerElement.cameraDistance : f21;
        long j15 = (i12 & 1024) != 0 ? graphicsLayerElement.transformOrigin : j11;
        Shape shape2 = (i12 & 2048) != 0 ? graphicsLayerElement.shape : shape;
        boolean z12 = (i12 & 4096) != 0 ? graphicsLayerElement.clip : z11;
        float f33 = f22;
        RenderEffect renderEffect2 = (i12 & 8192) != 0 ? graphicsLayerElement.renderEffect : renderEffect;
        long j16 = (i12 & 16384) != 0 ? graphicsLayerElement.ambientShadowColor : j12;
        long j17 = (i12 & 32768) != 0 ? graphicsLayerElement.spotShadowColor : j13;
        if ((i12 & 65536) != 0) {
            j14 = j17;
            i13 = graphicsLayerElement.compositingStrategy;
        } else {
            i13 = i11;
            j14 = j17;
        }
        return graphicsLayerElement.m2661copyJVvOYNQ(f33, f23, f24, f25, f26, f27, f28, f29, f31, f32, j15, shape2, z12, renderEffect2, j16, j14, i13);
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m2657component11SzJe1aQ() {
        return this.transformOrigin;
    }

    @m80.k
    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    @m80.l
    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m2658component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m2659component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m2660component17NrFUSI() {
        return this.compositingStrategy;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    @m80.k
    /* renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerElement m2661copyJVvOYNQ(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, @m80.k Shape shape, boolean z11, @m80.l RenderEffect renderEffect, long j12, long j13, int i11) {
        return new GraphicsLayerElement(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, j12, j13, i11, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m2894equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && kotlin.jvm.internal.g0.g(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && kotlin.jvm.internal.g0.g(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m2510equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m2510equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m2593equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m2662getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m2663getCompositingStrategyNrFUSI() {
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

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m2664getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m2665getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m2897hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((((((hashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + Color.m2516hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m2516hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m2594hashCodeimpl(this.compositingStrategy);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m2887boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m2499boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m2499boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m2590boximpl(this.compositingStrategy));
    }

    @m80.k
    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m2898toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m2517toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m2517toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m2595toStringimpl(this.compositingStrategy)) + ')';
    }

    private GraphicsLayerElement(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11) {
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
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.setScaleX(this.scaleX);
        simpleGraphicsLayerModifier.setScaleY(this.scaleY);
        simpleGraphicsLayerModifier.setAlpha(this.alpha);
        simpleGraphicsLayerModifier.setTranslationX(this.translationX);
        simpleGraphicsLayerModifier.setTranslationY(this.translationY);
        simpleGraphicsLayerModifier.setShadowElevation(this.shadowElevation);
        simpleGraphicsLayerModifier.setRotationX(this.rotationX);
        simpleGraphicsLayerModifier.setRotationY(this.rotationY);
        simpleGraphicsLayerModifier.setRotationZ(this.rotationZ);
        simpleGraphicsLayerModifier.setCameraDistance(this.cameraDistance);
        simpleGraphicsLayerModifier.m2843setTransformOrigin__ExYCQ(this.transformOrigin);
        simpleGraphicsLayerModifier.setShape(this.shape);
        simpleGraphicsLayerModifier.setClip(this.clip);
        simpleGraphicsLayerModifier.setRenderEffect(this.renderEffect);
        simpleGraphicsLayerModifier.m2840setAmbientShadowColor8_81llA(this.ambientShadowColor);
        simpleGraphicsLayerModifier.m2842setSpotShadowColor8_81llA(this.spotShadowColor);
        simpleGraphicsLayerModifier.m2841setCompositingStrategyaDBOjCE(this.compositingStrategy);
        simpleGraphicsLayerModifier.invalidateLayerBlock();
    }
}
