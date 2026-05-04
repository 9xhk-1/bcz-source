package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface GraphicsLayerImpl {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m80.k
        private static final x00.l<DrawScope, g2> DefaultDrawBlock = new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                DrawScope.m3054drawRectnJ9OG0$default(drawScope, Color.Companion.m2544getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        };

        private Companion() {
        }

        @m80.k
        public final x00.l<DrawScope, g2> getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }

    @m80.k
    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(@m80.k Canvas canvas);

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo3163getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo3164getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    @m80.l
    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int mo3165getCompositingStrategyke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long mo3166getPivotOffsetF1C5BW0();

    @m80.l
    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo3167getSpotShadowColor0d7_KjU();

    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(@m80.k Density density, @m80.k LayoutDirection layoutDirection, @m80.k GraphicsLayer graphicsLayer, @m80.k x00.l<? super DrawScope, g2> lVar);

    void setAlpha(float f11);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo3168setAmbientShadowColor8_81llA(long j11);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo3169setBlendModes9anfk8(int i11);

    void setCameraDistance(float f11);

    void setClip(boolean z11);

    void setColorFilter(@m80.l ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo3170setCompositingStrategyWpw9cng(int i11);

    void setInvalidated(boolean z11);

    /* renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo3171setOutlineO0kMr_c(@m80.l Outline outline, long j11);

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo3172setPivotOffsetk4lQ0M(long j11);

    /* renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo3173setPositionH0pRuoY(int i11, int i12, long j11);

    void setRenderEffect(@m80.l RenderEffect renderEffect);

    void setRotationX(float f11);

    void setRotationY(float f11);

    void setRotationZ(float f11);

    void setScaleX(float f11);

    void setScaleY(float f11);

    void setShadowElevation(float f11);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo3174setSpotShadowColor8_81llA(long j11);

    void setTranslationX(float f11);

    void setTranslationY(float f11);
}
