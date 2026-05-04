package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@PlacementScopeMarker
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m2702getAmbientShadowColor0d7_KjU(@m80.k GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo2693getAmbientShadowColor0d7_KjU();
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m2703getCompositingStrategyNrFUSI(@m80.k GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo2694getCompositingStrategyNrFUSI();
        }

        @m80.l
        @Deprecated
        public static RenderEffect getRenderEffect(@m80.k GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2704getSizeNHjbRc(@m80.k GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo2695getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m2705getSpotShadowColor0d7_KjU(@m80.k GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo2696getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2706roundToPxR2X_6o(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            return GraphicsLayerScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2707roundToPx0680j_4(@m80.k GraphicsLayerScope graphicsLayerScope, float f11) {
            return GraphicsLayerScope.super.mo371roundToPx0680j_4(f11);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m2708setAmbientShadowColor8_81llA(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            GraphicsLayerScope.super.mo2698setAmbientShadowColor8_81llA(j11);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m2709setCompositingStrategyaDBOjCE(@m80.k GraphicsLayerScope graphicsLayerScope, int i11) {
            GraphicsLayerScope.super.mo2699setCompositingStrategyaDBOjCE(i11);
        }

        @Deprecated
        public static void setRenderEffect(@m80.k GraphicsLayerScope graphicsLayerScope, @m80.l RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m2710setSpotShadowColor8_81llA(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            GraphicsLayerScope.super.mo2700setSpotShadowColor8_81llA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2711toDpGaN1DYA(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            return GraphicsLayerScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2712toDpu2uoSUM(@m80.k GraphicsLayerScope graphicsLayerScope, float f11) {
            return GraphicsLayerScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2714toDpSizekrfVVM(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            return GraphicsLayerScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2715toPxR2X_6o(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            return GraphicsLayerScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2716toPx0680j_4(@m80.k GraphicsLayerScope graphicsLayerScope, float f11) {
            return GraphicsLayerScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @m80.k
        public static Rect toRect(@m80.k GraphicsLayerScope graphicsLayerScope, @m80.k DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2717toSizeXkaWNTQ(@m80.k GraphicsLayerScope graphicsLayerScope, long j11) {
            return GraphicsLayerScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2718toSp0xMU5do(@m80.k GraphicsLayerScope graphicsLayerScope, float f11) {
            return GraphicsLayerScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2719toSpkPz2Gy4(@m80.k GraphicsLayerScope graphicsLayerScope, float f11) {
            return GraphicsLayerScope.super.mo380toSpkPz2Gy4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2713toDpu2uoSUM(@m80.k GraphicsLayerScope graphicsLayerScope, int i11) {
            return GraphicsLayerScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2720toSpkPz2Gy4(@m80.k GraphicsLayerScope graphicsLayerScope, int i11) {
            return GraphicsLayerScope.super.mo381toSpkPz2Gy4(i11);
        }

        public static /* synthetic */ void getClip$annotations() {
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo2693getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo2694getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m2597getAutoNrFUSI();
    }

    @m80.l
    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @m80.k
    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo2695getSizeNHjbRc() {
        return Size.Companion.m2345getUnspecifiedNHjbRc();
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo2696getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo2697getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f11);

    void setCameraDistance(float f11);

    void setClip(boolean z11);

    void setRotationX(float f11);

    void setRotationY(float f11);

    void setRotationZ(float f11);

    void setScaleX(float f11);

    void setScaleY(float f11);

    void setShadowElevation(float f11);

    void setShape(@m80.k Shape shape);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo2701setTransformOrigin__ExYCQ(long j11);

    void setTranslationX(float f11);

    void setTranslationY(float f11);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo2698setAmbientShadowColor8_81llA(long j11) {
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo2699setCompositingStrategyaDBOjCE(int i11) {
    }

    default void setRenderEffect(@m80.l RenderEffect renderEffect) {
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo2700setSpotShadowColor8_81llA(long j11) {
    }
}
