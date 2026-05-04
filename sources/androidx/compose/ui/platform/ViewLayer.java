package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,498:1\n65#2:499\n69#2:502\n60#3:500\n70#3:503\n85#3:506\n90#3:508\n22#4:501\n22#4:504\n54#5:505\n59#5:507\n41#6,5:509\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n240#1:499\n241#1:502\n240#1:500\n241#1:503\n277#1:506\n278#1:508\n240#1:501\n241#1:504\n277#1:505\n278#1:507\n315#1:509,5\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;

    @m80.l
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;

    @m80.l
    private static Method updateDisplayListIfDirtyMethod;

    @m80.k
    private final CanvasHolder canvasHolder;

    @m80.l
    private Rect clipBoundsCache;
    private boolean clipToBounds;

    @m80.k
    private final DrawChildContainer container;

    @m80.l
    private x00.p<? super Canvas, ? super GraphicsLayer, g2> drawBlock;
    private boolean drawnWithZ;

    @m80.l
    private x00.a<g2> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;

    @m80.k
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;

    @m80.k
    private final OutlineResolver outlineResolver;

    @m80.k
    private final AndroidComposeView ownerView;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final x00.p<View, Matrix, g2> getMatrix = new x00.p<View, Matrix, g2>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(View view, Matrix matrix) {
            invoke2(view, matrix);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };

    @m80.k
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            OutlineResolver outlineResolver;
            kotlin.jvm.internal.g0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            outlineResolver = ((ViewLayer) view).outlineResolver;
            Outline androidOutline = outlineResolver.getAndroidOutline();
            kotlin.jvm.internal.g0.m(androidOutline);
            outline.set(androidOutline);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        @m80.k
        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z11) {
            ViewLayer.shouldUseDispatchDraw = z11;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(@m80.k View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
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

    public ViewLayer(@m80.k AndroidComposeView androidComposeView, @m80.k DrawChildContainer drawChildContainer, @m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.g0.m(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z11) {
        if (z11 != this.isInvalidated) {
            this.isInvalidated = z11;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z11);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getAndroidOutline() != null ? OutlineProvider : null);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(@m80.k android.graphics.Canvas canvas) {
        boolean z11;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z11 = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z11 = true;
        }
        x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(androidCanvas, null);
        }
        if (z11) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@m80.k Canvas canvas, @m80.l GraphicsLayer graphicsLayer) {
        boolean z11 = getElevation() > 0.0f;
        this.drawnWithZ = z11;
        if (z11) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @m80.k
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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
        return this.matrixCache.m4270calculateMatrixGrdbGEg(this);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo4170inverseTransform58bKbWc(@m80.k float[] fArr) {
        float[] m4269calculateInverseMatrixbWbORWo = this.matrixCache.m4269calculateInverseMatrixbWbORWo(this);
        if (m4269calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m2758timesAssign58bKbWc(fArr, m4269calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo4171isInLayerk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j11));
        if (this.clipToBounds) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m4297isInOutlinek4lQ0M(j11);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@m80.k MutableRect mutableRect, boolean z11) {
        if (z11) {
            this.matrixCache.mapInverse(this, mutableRect);
        } else {
            this.matrixCache.map(this, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo4172mapOffset8S9VItk(long j11, boolean z11) {
        return z11 ? this.matrixCache.m4272mapInverseR5De75A(this, j11) : this.matrixCache.m4271mapR5De75A(this, j11);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo4173movegyyYBs(long j11) {
        int m5243getXimpl = IntOffset.m5243getXimpl(j11);
        if (m5243getXimpl != getLeft()) {
            offsetLeftAndRight(m5243getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m5244getYimpl = IntOffset.m5244getYimpl(j11);
        if (m5244getYimpl != getTop()) {
            offsetTopAndBottom(m5244getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo4174resizeozmzZPI(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (i11 == getWidth() && i12 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.m2895getPivotFractionXimpl(this.mTransformOrigin) * i11);
        setPivotY(TransformOrigin.m2896getPivotFractionYimpl(this.mTransformOrigin) * i12);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + i11, getTop() + i12);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar) {
        this.container.addView(this);
        this.matrixCache.reset();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f11) {
        setCameraDistance(f11 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo4175transform58bKbWc(@m80.k float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m2758timesAssign58bKbWc(fArr, this.matrixCache.m4270calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@m80.k ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        x00.a<g2> aVar;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((mutatedFields$ui_release & 4096) != 0) {
            long mo2697getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo2697getTransformOriginSzJe1aQ();
            this.mTransformOrigin = mo2697getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m2895getPivotFractionXimpl(mo2697getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m2896getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z11 = false;
        boolean z12 = getManualClipPath() != null;
        boolean z13 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.clipToBounds = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape();
            resetClipBounds();
            setClipToOutline(z13);
        }
        boolean m4298updateS_szKao = this.outlineResolver.m4298updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z13, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo2695getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        boolean z14 = getManualClipPath() != null;
        if (z12 != z14 || (z14 && m4298updateS_szKao)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if ((mutatedFields$ui_release & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m2563toArgb8_81llA(reusableGraphicsLayerScope.mo2693getAmbientShadowColor0d7_KjU()));
            }
            if ((mutatedFields$ui_release & 128) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m2563toArgb8_81llA(reusableGraphicsLayerScope.mo2696getSpotShadowColor0d7_KjU()));
            }
        }
        if (i11 >= 31 && (131072 & mutatedFields$ui_release) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((mutatedFields$ui_release & 32768) != 0) {
            int mo2694getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo2694getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m2593equalsimpl0(mo2694getCompositingStrategyNrFUSI, companion.m2599getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m2593equalsimpl0(mo2694getCompositingStrategyNrFUSI, companion.m2598getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z11;
            } else {
                setLayerType(0, null);
            }
            z11 = true;
            this.mHasOverlappingRendering = z11;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
