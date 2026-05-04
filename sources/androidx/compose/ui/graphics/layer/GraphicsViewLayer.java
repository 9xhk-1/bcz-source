package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n1#2:584\n278#3:585\n54#4:586\n59#4:588\n54#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:604\n59#4:606\n85#5:587\n90#5:589\n60#5:591\n70#5:594\n85#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:605\n90#5:607\n65#6:590\n69#6:593\n22#7:592\n22#7:595\n41#8,3:608\n44#8,2:637\n41#8,5:639\n305#9,26:611\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n*L\n266#1:585\n271#1:586\n272#1:588\n377#1:596\n377#1:598\n380#1:600\n381#1:602\n437#1:604\n437#1:606\n271#1:587\n272#1:589\n276#1:591\n277#1:594\n377#1:597\n377#1:599\n380#1:601\n381#1:603\n437#1:605\n437#1:607\n276#1:590\n277#1:593\n276#1:592\n277#1:595\n439#1:608,3\n439#1:637,2\n460#1:639,5\n440#1:611,26\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;

    @m80.k
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;

    @m80.k
    private final Rect clipRect;
    private boolean clipToBounds;

    @m80.l
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;

    @m80.k
    private final DrawChildContainer layerContainer;
    private final long layerId;

    @m80.l
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;

    @m80.l
    private final Picture picture;

    @m80.l
    private final CanvasHolder pictureCanvasHolder;

    @m80.l
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;

    @m80.l
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;

    @m80.k
    private final ViewLayer viewLayer;

    /* renamed from: x, reason: collision with root package name */
    private int f4170x;

    /* renamed from: y, reason: collision with root package name */
    private int f4171y;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();

    @m80.k
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        @m80.k
        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        private Companion() {
        }
    }

    public GraphicsViewLayer(@m80.k DrawChildContainer drawChildContainer, long j11, @m80.k CanvasHolder canvasHolder, @m80.k CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j11;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z11 = mayRenderInSoftware;
        this.picture = z11 ? new Picture() : null;
        this.pictureDrawScope = z11 ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z11 ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m5291getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m2451getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m3140getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m2284getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.Companion;
        this.ambientShadowColor = companion.m2535getBlack0d7_KjU();
        this.spotShadowColor = companion.m2535getBlack0d7_KjU();
        this.supportsSoftwareRendering = z11;
    }

    /* renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m3177applyCompositingLayerWpw9cng(int i11) {
        ViewLayer viewLayer = this.viewLayer;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        boolean z11 = true;
        if (CompositingStrategy.m3136equalsimpl0(i11, companion.m3142getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (CompositingStrategy.m3136equalsimpl0(i11, companion.m3141getModulateAlphake2Ky5w())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z11 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z11);
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m3136equalsimpl0(mo3165getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m3142getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m2420equalsimpl0(mo3164getBlendMode0nO6VwU(), BlendMode.Companion.m2451getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m3177applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m3142getOffscreenke2Ky5w());
        } else {
            m3177applyCompositingLayerWpw9cng(mo3165getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @m80.k
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(@m80.k androidx.compose.ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo3163getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU */
    public int mo3164getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @m80.k
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @m80.l
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo3165getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0 */
    public long mo3166getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @m80.l
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo3167getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(@m80.k Density density, @m80.k LayoutDirection layoutDirection, @m80.k GraphicsLayer graphicsLayer, @m80.k x00.l<? super DrawScope, g2> lVar) {
        CanvasHolder canvasHolder;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, graphicsLayer, lVar);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.picture;
            if (picture != null) {
                long j11 = this.size;
                Canvas beginRecording = picture.beginRecording((int) (j11 >> 32), (int) (j11 & 4294967295L));
                try {
                    CanvasHolder canvasHolder2 = this.pictureCanvasHolder;
                    if (canvasHolder2 != null) {
                        Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                        canvasHolder2.getAndroidCanvas().setInternalCanvas(beginRecording);
                        AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.size);
                            Density density2 = canvasDrawScope.getDrawContext().getDensity();
                            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                            long mo2981getSizeNHjbRc = canvasDrawScope.getDrawContext().mo2981getSizeNHjbRc();
                            GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
                            DrawContext drawContext = canvasDrawScope.getDrawContext();
                            drawContext.setDensity(density);
                            drawContext.setLayoutDirection(layoutDirection);
                            drawContext.setCanvas(androidCanvas);
                            drawContext.mo2982setSizeuvyYCjk(m5298toSizeozmzZPI);
                            drawContext.setGraphicsLayer(graphicsLayer);
                            androidCanvas.save();
                            try {
                                lVar.invoke(canvasDrawScope);
                                androidCanvas.restore();
                                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                                drawContext2.setDensity(density2);
                                drawContext2.setLayoutDirection(layoutDirection2);
                                drawContext2.setCanvas(canvas2);
                                drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer2);
                            } catch (Throwable th2) {
                                androidCanvas.restore();
                                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                                drawContext3.setDensity(density2);
                                drawContext3.setLayoutDirection(layoutDirection2);
                                drawContext3.setCanvas(canvas2);
                                drawContext3.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer2);
                                throw th2;
                            }
                        } else {
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                        g2 g2Var = g2.f100423a;
                    }
                    picture.endRecording();
                } catch (Throwable th3) {
                    picture.endRecording();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f11) {
        this.alpha = f11;
        this.viewLayer.setAlpha(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo3168setAmbientShadowColor8_81llA(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j11;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m2563toArgb8_81llA(j11));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo3169setBlendModes9anfk8(int i11) {
        this.blendMode = i11;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m2361toPorterDuffModes9anfk8(i11)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f11) {
        this.viewLayer.setCameraDistance(f11 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z11) {
        boolean z12 = false;
        this.clipToBounds = z11 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z11 && this.outlineIsProvided) {
            z12 = true;
        }
        viewLayer.setClipToOutline(z12);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(@m80.l ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public void mo3170setCompositingStrategyWpw9cng(int i11) {
        this.compositingStrategy = i11;
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z11) {
        this.isInvalidated = z11;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public void mo3171setOutlineO0kMr_c(@m80.l Outline outline, long j11) {
        boolean layerOutline = this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo3172setPivotOffsetk4lQ0M(long j11) {
        this.pivotOffset = j11;
        if ((9223372034707292159L & j11) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j11 >> 32)));
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo3173setPositionH0pRuoY(int i11, int i12, long j11) {
        if (IntSize.m5284equalsimpl0(this.size, j11)) {
            int i13 = this.f4170x;
            if (i13 != i11) {
                this.viewLayer.offsetLeftAndRight(i11 - i13);
            }
            int i14 = this.f4171y;
            if (i14 != i12) {
                this.viewLayer.offsetTopAndBottom(i12 - i14);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i15 = (int) (j11 >> 32);
            int i16 = (int) (4294967295L & j11);
            this.viewLayer.layout(i11, i12, i11 + i15, i12 + i16);
            this.size = j11;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i15 / 2.0f);
                this.viewLayer.setPivotY(i16 / 2.0f);
            }
        }
        this.f4170x = i11;
        this.f4171y = i12;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f11) {
        this.rotationX = f11;
        this.viewLayer.setRotationX(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f11) {
        this.rotationY = f11;
        this.viewLayer.setRotationY(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f11) {
        this.rotationZ = f11;
        this.viewLayer.setRotation(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f11) {
        this.scaleX = f11;
        this.viewLayer.setScaleX(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f11) {
        this.scaleY = f11;
        this.viewLayer.setScaleY(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f11) {
        this.shadowElevation = f11;
        this.viewLayer.setElevation(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo3174setSpotShadowColor8_81llA(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j11;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m2563toArgb8_81llA(j11));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f11) {
        this.translationX = f11;
        this.viewLayer.setTranslationX(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f11) {
        this.translationY = f11;
        this.viewLayer.setTranslationY(f11);
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j11, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i11, kotlin.jvm.internal.v vVar) {
        this(drawChildContainer, j11, (i11 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i11 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
