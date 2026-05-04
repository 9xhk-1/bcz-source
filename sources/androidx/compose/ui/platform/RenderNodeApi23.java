package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
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
@kotlin.jvm.internal.u0({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,411:1\n41#2,5:412\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:412,5\n*E\n"})
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {
    private static boolean testFailCreateRenderNode;
    private int bottom;
    private boolean clipToBounds;
    private int internalCompositingStrategy;
    private int left;

    @m80.k
    private final AndroidComposeView ownerView;

    @m80.l
    private RenderEffect renderEffect;

    @m80.k
    private final RenderNode renderNode;
    private int right;
    private int top;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static boolean needToValidateAccess = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z11) {
            RenderNodeApi23.testFailCreateRenderNode = z11;
        }

        private Companion() {
        }
    }

    public RenderNodeApi23(@m80.k AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.renderNode = create;
        this.internalCompositingStrategy = CompositingStrategy.Companion.m2597getAutoNrFUSI();
        if (needToValidateAccess) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            verifyShadowColorProperties(create);
            discardDisplayListInternal();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            needToValidateAccess = false;
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
    }

    private final void discardDisplayListInternal() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode, renderNodeVerificationHelper28.getSpotShadowColor(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@m80.k Canvas canvas) {
        kotlin.jvm.internal.g0.n(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @m80.k
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), getClipToBounds(), this.renderNode.getAlpha(), getRenderEffect(), this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(this.renderNode);
        }
        return -16777216;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo4252getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@m80.k Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        return CompositingStrategy.m2593equalsimpl0(this.internalCompositingStrategy, CompositingStrategy.Companion.m2599getOffscreenNrFUSI()) ? 2 : 0;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
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
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    @m80.l
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(this.renderNode);
        }
        return -16777216;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i11) {
        setLeft(getLeft() + i11);
        setRight(getRight() + i11);
        this.renderNode.offsetLeftAndRight(i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i11) {
        setTop(getTop() + i11);
        setBottom(getBottom() + i11);
        this.renderNode.offsetTopAndBottom(i11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@m80.k CanvasHolder canvasHolder, @m80.l Path path, @m80.k x00.l<? super androidx.compose.ui.graphics.Canvas, g2> lVar) {
        DisplayListCanvas start = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) start);
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
        this.renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f11) {
        this.renderNode.setAlpha(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, i11);
        }
    }

    public void setBottom(int i11) {
        this.bottom = i11;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f11) {
        this.renderNode.setCameraDistance(-f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z11) {
        this.clipToBounds = z11;
        this.renderNode.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z11) {
        this.renderNode.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo4253setCompositingStrategyaDBOjCE(int i11) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m2593equalsimpl0(i11, companion.m2599getOffscreenNrFUSI())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m2593equalsimpl0(i11, companion.m2598getModulateAlphaNrFUSI())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i11;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f11) {
        this.renderNode.setElevation(f11);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z11) {
        return this.renderNode.setHasOverlappingRendering(z11);
    }

    public void setLeft(int i11) {
        this.left = i11;
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
        setLeft(i11);
        setTop(i12);
        setRight(i13);
        setBottom(i14);
        return this.renderNode.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public void setRight(int i11) {
        this.right = i11;
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
        this.renderNode.setRotation(f11);
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
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, i11);
        }
    }

    public void setTop(int i11) {
        this.top = i11;
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
