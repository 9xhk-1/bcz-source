package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n65#2:403\n69#2:406\n60#3:404\n70#3:407\n85#3:410\n90#3:412\n22#4:405\n22#4:408\n54#5:409\n59#5:411\n1#6:413\n*S KotlinDebug\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n*L\n196#1:403\n197#1:406\n196#1:404\n197#1:407\n210#1:410\n211#1:412\n196#1:405\n197#1:408\n210#1:409\n211#1:411\n*E\n"})
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    @m80.l
    private x00.p<? super Canvas, ? super GraphicsLayer, g2> drawBlock;
    private boolean drawnWithZ;

    @m80.l
    private x00.a<g2> invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;

    @m80.k
    private final AndroidComposeView ownerView;

    @m80.k
    private final DeviceRenderNode renderNode;

    @m80.l
    private Paint softwareLayerPaint;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final x00.p<DeviceRenderNode, Matrix, g2> getMatrix = new x00.p<DeviceRenderNode, Matrix, g2>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            invoke2(deviceRenderNode, matrix);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };

    @m80.k
    private final OutlineResolver outlineResolver = new OutlineResolver();

    @m80.k
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);

    @m80.k
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class UniqueDrawingIdApi29 {

        @m80.k
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @w00.o
        public static final long getUniqueDrawingId(@m80.k View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public RenderNodeLayer(@m80.k AndroidComposeView androidComposeView, @m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar) {
        this.ownerView = androidComposeView;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView) : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.setHasOverlappingRendering(true);
        renderNodeApi29.setClipToBounds(false);
        this.renderNode = renderNodeApi29;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    private final void setDirty(boolean z11) {
        if (z11 != this.isDirty) {
            this.isDirty = z11;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z11);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@m80.k Canvas canvas, @m80.l GraphicsLayer graphicsLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z11 = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z11;
            if (z11) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo2364concat58bKbWc(this.matrixCache.m4270calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @m80.k
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    @m80.k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo4169getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m4270calculateMatrixGrdbGEg(this.renderNode);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo4170inverseTransform58bKbWc(@m80.k float[] fArr) {
        float[] m4269calculateInverseMatrixbWbORWo = this.matrixCache.m4269calculateInverseMatrixbWbORWo(this.renderNode);
        if (m4269calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2758timesAssign58bKbWc(fArr, m4269calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo4171isInLayerk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j11));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m4297isInOutlinek4lQ0M(j11);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@m80.k MutableRect mutableRect, boolean z11) {
        if (z11) {
            this.matrixCache.mapInverse(this.renderNode, mutableRect);
        } else {
            this.matrixCache.map(this.renderNode, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo4172mapOffset8S9VItk(long j11, boolean z11) {
        return z11 ? this.matrixCache.m4272mapInverseR5De75A(this.renderNode, j11) : this.matrixCache.m4271mapR5De75A(this.renderNode, j11);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo4173movegyyYBs(long j11) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m5243getXimpl = IntOffset.m5243getXimpl(j11);
        int m5244getYimpl = IntOffset.m5244getYimpl(j11);
        if (left == m5243getXimpl && top == m5244getYimpl) {
            return;
        }
        if (left != m5243getXimpl) {
            this.renderNode.offsetLeftAndRight(m5243getXimpl - left);
        }
        if (top != m5244getYimpl) {
            this.renderNode.offsetTopAndBottom(m5244getYimpl - top);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo4174resizeozmzZPI(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.renderNode.setPivotX(TransformOrigin.m2895getPivotFractionXimpl(this.transformOrigin) * i11);
        this.renderNode.setPivotY(TransformOrigin.m2896getPivotFractionYimpl(this.transformOrigin) * i12);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i11, this.renderNode.getTop() + i12)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo4175transform58bKbWc(@m80.k float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m2758timesAssign58bKbWc(fArr, this.matrixCache.m4270calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            final x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar = this.drawBlock;
            if (pVar != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new x00.l<Canvas, g2>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Canvas canvas) {
                        invoke2(canvas);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Canvas canvas) {
                        pVar.invoke(canvas, null);
                    }
                });
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@m80.k ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        x00.a<g2> aVar;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        int i11 = mutatedFields$ui_release & 4096;
        if (i11 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo2697getTransformOriginSzJe1aQ();
        }
        boolean z11 = false;
        boolean z12 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((mutatedFields$ui_release & 1) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m2563toArgb8_81llA(reusableGraphicsLayerScope.mo2693getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m2563toArgb8_81llA(reusableGraphicsLayerScope.mo2696getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i11 != 0) {
            this.renderNode.setPivotX(TransformOrigin.m2895getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m2896getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z13 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.renderNode.setClipToOutline(z13);
            this.renderNode.setClipToBounds(reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.renderNode.mo4253setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo2694getCompositingStrategyNrFUSI());
        }
        boolean m4298updateS_szKao = this.outlineResolver.m4298updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z13, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo2695getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z13 && !this.outlineResolver.getOutlineClipSupported()) {
            z11 = true;
        }
        if (z12 != z11 || (z11 && m4298updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
