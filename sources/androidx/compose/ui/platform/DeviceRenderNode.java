package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(@m80.k Canvas canvas);

    @m80.k
    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo4252getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(@m80.k Matrix matrix);

    int getLeft();

    void getMatrix(@m80.k Matrix matrix);

    float getPivotX();

    float getPivotY();

    @m80.l
    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i11);

    void offsetTopAndBottom(int i11);

    void record(@m80.k CanvasHolder canvasHolder, @m80.l Path path, @m80.k x00.l<? super androidx.compose.ui.graphics.Canvas, g2> lVar);

    void setAlpha(float f11);

    void setAmbientShadowColor(int i11);

    void setCameraDistance(float f11);

    void setClipToBounds(boolean z11);

    void setClipToOutline(boolean z11);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo4253setCompositingStrategyaDBOjCE(int i11);

    void setElevation(float f11);

    boolean setHasOverlappingRendering(boolean z11);

    void setOutline(@m80.l Outline outline);

    void setPivotX(float f11);

    void setPivotY(float f11);

    boolean setPosition(int i11, int i12, int i13, int i14);

    void setRenderEffect(@m80.l RenderEffect renderEffect);

    void setRotationX(float f11);

    void setRotationY(float f11);

    void setRotationZ(float f11);

    void setScaleX(float f11);

    void setScaleY(float f11);

    void setSpotShadowColor(int i11);

    void setTranslationX(float f11);

    void setTranslationY(float f11);
}
