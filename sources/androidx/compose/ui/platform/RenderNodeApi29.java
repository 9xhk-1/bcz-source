package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(29)
@kotlin.jvm.internal.u0({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,279:1\n41#2,5:280\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n210#1:280,5\n*E\n"})
/* loaded from: classes2.dex */
public final class RenderNodeApi29 implements DeviceRenderNode {
    public static final int $stable = 8;

    @m80.l
    private RenderEffect internalRenderEffect;

    @m80.k
    private final AndroidComposeView ownerView;

    @m80.k
    private final RenderNode renderNode = androidx.compose.foundation.k.a("Compose");
    private int internalCompositingStrategy = CompositingStrategy.Companion.m2597getAutoNrFUSI();

    public RenderNodeApi29(@m80.k AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@m80.k Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @m80.k
    public DeviceRenderNodeData dumpRenderNodeData() {
        long uniqueId;
        int left;
        int top;
        int right;
        int bottom;
        int width;
        int height;
        float scaleX;
        float scaleY;
        float translationX;
        float translationY;
        float elevation;
        int ambientShadowColor;
        int spotShadowColor;
        float rotationZ;
        float rotationX;
        float rotationY;
        float cameraDistance;
        float pivotX;
        float pivotY;
        boolean clipToOutline;
        boolean clipToBounds;
        float alpha;
        uniqueId = this.renderNode.getUniqueId();
        left = this.renderNode.getLeft();
        top = this.renderNode.getTop();
        right = this.renderNode.getRight();
        bottom = this.renderNode.getBottom();
        width = this.renderNode.getWidth();
        height = this.renderNode.getHeight();
        scaleX = this.renderNode.getScaleX();
        scaleY = this.renderNode.getScaleY();
        translationX = this.renderNode.getTranslationX();
        translationY = this.renderNode.getTranslationY();
        elevation = this.renderNode.getElevation();
        ambientShadowColor = this.renderNode.getAmbientShadowColor();
        spotShadowColor = this.renderNode.getSpotShadowColor();
        rotationZ = this.renderNode.getRotationZ();
        rotationX = this.renderNode.getRotationX();
        rotationY = this.renderNode.getRotationY();
        cameraDistance = this.renderNode.getCameraDistance();
        pivotX = this.renderNode.getPivotX();
        pivotY = this.renderNode.getPivotY();
        clipToOutline = this.renderNode.getClipToOutline();
        clipToBounds = this.renderNode.getClipToBounds();
        alpha = this.renderNode.getAlpha();
        return new DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, this.internalRenderEffect, this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        float alpha;
        alpha = this.renderNode.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        int ambientShadowColor;
        ambientShadowColor = this.renderNode.getAmbientShadowColor();
        return ambientShadowColor;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        int bottom;
        bottom = this.renderNode.getBottom();
        return bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        float cameraDistance;
        cameraDistance = this.renderNode.getCameraDistance();
        return cameraDistance;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        boolean clipToBounds;
        clipToBounds = this.renderNode.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        boolean clipToOutline;
        clipToOutline = this.renderNode.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo4252getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        float elevation;
        elevation = this.renderNode.getElevation();
        return elevation;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        boolean hasDisplayList;
        hasDisplayList = this.renderNode.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        int height;
        height = this.renderNode.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@m80.k Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        int left;
        left = this.renderNode.getLeft();
        return left;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(@m80.k Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @m80.k
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        float pivotX;
        pivotX = this.renderNode.getPivotX();
        return pivotX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        float pivotY;
        pivotY = this.renderNode.getPivotY();
        return pivotY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @m80.l
    public RenderEffect getRenderEffect() {
        return this.internalRenderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        int right;
        right = this.renderNode.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        float rotationX;
        rotationX = this.renderNode.getRotationX();
        return rotationX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        float rotationY;
        rotationY = this.renderNode.getRotationY();
        return rotationY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        float rotationZ;
        rotationZ = this.renderNode.getRotationZ();
        return rotationZ;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        float scaleX;
        scaleX = this.renderNode.getScaleX();
        return scaleX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        float scaleY;
        scaleY = this.renderNode.getScaleY();
        return scaleY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        int spotShadowColor;
        spotShadowColor = this.renderNode.getSpotShadowColor();
        return spotShadowColor;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        int top;
        top = this.renderNode.getTop();
        return top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        float translationX;
        translationX = this.renderNode.getTranslationX();
        return translationX;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        float translationY;
        translationY = this.renderNode.getTranslationY();
        return translationY;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        long uniqueId;
        uniqueId = this.renderNode.getUniqueId();
        return uniqueId;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        int width;
        width = this.renderNode.getWidth();
        return width;
    }

    public final boolean hasOverlappingRendering$ui_release() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.renderNode.hasOverlappingRendering();
        return hasOverlappingRendering;
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        boolean useCompositingLayer;
        useCompositingLayer = this.renderNode.getUseCompositingLayer();
        return useCompositingLayer;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i11) {
        this.renderNode.offsetLeftAndRight(i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i11) {
        this.renderNode.offsetTopAndBottom(i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@m80.k CanvasHolder canvasHolder, @m80.l Path path, @m80.k x00.l<? super androidx.compose.ui.graphics.Canvas, g2> lVar) {
        RecordingCanvas beginRecording;
        beginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            androidx.compose.ui.graphics.Canvas.m2480clipPathmtrdDE$default(androidCanvas, path, 0, 2, null);
        }
        lVar.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f11) {
        this.renderNode.setAlpha(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i11) {
        this.renderNode.setAmbientShadowColor(i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f11) {
        this.renderNode.setCameraDistance(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z11) {
        this.renderNode.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z11) {
        this.renderNode.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo4253setCompositingStrategyaDBOjCE(int i11) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m2593equalsimpl0(i11, companion.m2599getOffscreenNrFUSI())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m2593equalsimpl0(i11, companion.m2598getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i11;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f11) {
        this.renderNode.setElevation(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z11) {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.renderNode.setHasOverlappingRendering(z11);
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(@m80.l Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f11) {
        this.renderNode.setPivotX(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f11) {
        this.renderNode.setPivotY(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int i11, int i12, int i13, int i14) {
        boolean position;
        position = this.renderNode.setPosition(i11, i12, i13, i14);
        return position;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f11) {
        this.renderNode.setRotationX(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f11) {
        this.renderNode.setRotationY(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f11) {
        this.renderNode.setRotationZ(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f11) {
        this.renderNode.setScaleX(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f11) {
        this.renderNode.setScaleY(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i11) {
        this.renderNode.setSpotShadowColor(i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f11) {
        this.renderNode.setTranslationX(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f11) {
        this.renderNode.setTranslationY(f11);
    }
}
