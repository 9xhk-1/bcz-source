package androidx.compose.ui.graphics;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private int mutatedFields;

    @m80.l
    private Outline outline;

    @m80.l
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();

    @m80.k
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.Companion.m2597getAutoNrFUSI();
    private long size = Size.Companion.m2345getUnspecifiedNHjbRc();

    @m80.k
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @m80.k
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo2693getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo2694getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @m80.k
    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    @m80.k
    public final LayoutDirection getLayoutDirection$ui_release() {
        return this.layoutDirection;
    }

    public final int getMutatedFields$ui_release() {
        return this.mutatedFields;
    }

    @m80.l
    public final Outline getOutline$ui_release() {
        return this.outline;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    @m80.l
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    @m80.k
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc */
    public long mo2695getSizeNHjbRc() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo2696getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo2697getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo2698setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo2700setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo2701setTransformOrigin__ExYCQ(TransformOrigin.Companion.m2900getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo2699setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m2597getAutoNrFUSI());
        m2821setSizeuvyYCjk(Size.Companion.m2345getUnspecifiedNHjbRc());
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f11) {
        if (this.alpha == f11) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo2698setAmbientShadowColor8_81llA(long j11) {
        if (Color.m2510equalsimpl0(this.ambientShadowColor, j11)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f11) {
        if (this.cameraDistance == f11) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z11) {
        if (this.clip != z11) {
            this.mutatedFields |= 16384;
            this.clip = z11;
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo2699setCompositingStrategyaDBOjCE(int i11) {
        if (CompositingStrategy.m2593equalsimpl0(this.compositingStrategy, i11)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i11;
    }

    public final void setGraphicsDensity$ui_release(@m80.k Density density) {
        this.graphicsDensity = density;
    }

    public final void setLayoutDirection$ui_release(@m80.k LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setMutatedFields$ui_release(int i11) {
        this.mutatedFields = i11;
    }

    @VisibleForTesting
    public final void setOutline$ui_release(@m80.l Outline outline) {
        this.outline = outline;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(@m80.l RenderEffect renderEffect) {
        if (kotlin.jvm.internal.g0.g(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields |= 131072;
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f11) {
        if (this.rotationX == f11) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f11) {
        if (this.rotationY == f11) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f11) {
        if (this.rotationZ == f11) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f11) {
        if (this.scaleX == f11) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f11) {
        if (this.scaleY == f11) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f11) {
        if (this.shadowElevation == f11) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(@m80.k Shape shape) {
        if (kotlin.jvm.internal.g0.g(this.shape, shape)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = shape;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m2821setSizeuvyYCjk(long j11) {
        this.size = j11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo2700setSpotShadowColor8_81llA(long j11) {
        if (Color.m2510equalsimpl0(this.spotShadowColor, j11)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo2701setTransformOrigin__ExYCQ(long j11) {
        if (TransformOrigin.m2894equalsimpl0(this.transformOrigin, j11)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f11) {
        if (this.translationX == f11) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f11;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f11) {
        if (this.translationY == f11) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f11;
    }

    public final void updateOutline$ui_release() {
        this.outline = getShape().mo291createOutlinePq9zytI(mo2695getSizeNHjbRc(), this.layoutDirection, this.graphicsDensity);
    }
}
