package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
@u0({"SMAP\nGraphicsLayerV29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,298:1\n1#2:299\n278#3:300\n65#4:301\n69#4:304\n60#5:302\n70#5:305\n85#5:308\n90#5:310\n22#6:303\n22#6:306\n54#7:307\n59#7:309\n41#8,5:311\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n*L\n86#1:300\n89#1:301\n90#1:304\n89#1:302\n90#1:305\n222#1:308\n222#1:310\n89#1:303\n90#1:306\n222#1:307\n222#1:309\n243#1:311,5\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;

    @m80.k
    private final CanvasDrawScope canvasDrawScope;

    @m80.k
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;

    @m80.l
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;

    @m80.l
    private Paint layerPaint;

    @m80.l
    private Matrix matrix;
    private boolean outlineIsProvided;
    private final long ownerId;
    private long pivotOffset;

    @m80.l
    private RenderEffect renderEffect;

    @m80.k
    private final RenderNode renderNode;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    public GraphicsLayerV29(long j11, @m80.k CanvasHolder canvasHolder, @m80.k CanvasDrawScope canvasDrawScope) {
        this.ownerId = j11;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode a11 = androidx.compose.foundation.k.a("graphicsLayer");
        this.renderNode = a11;
        this.size = Size.Companion.m2346getZeroNHjbRc();
        a11.setClipToBounds(false);
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        m3176applyCompositingStrategyZ1X6vPc(a11, companion.m3140getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.Companion.m2451getSrcOver0nO6VwU();
        this.pivotOffset = Offset.Companion.m2283getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion2 = Color.Companion;
        this.ambientShadowColor = companion2.m2535getBlack0d7_KjU();
        this.spotShadowColor = companion2.m2535getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.m3140getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    private final void applyClip() {
        boolean z11 = false;
        boolean z12 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z11 = true;
        }
        if (z12 != this.clipToBounds) {
            this.clipToBounds = z12;
            this.renderNode.setClipToBounds(z12);
        }
        if (z11 != this.clipToOutline) {
            this.clipToOutline = z11;
            this.renderNode.setClipToOutline(z11);
        }
    }

    /* renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    private final void m3176applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i11) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m3136equalsimpl0(i11, companion.m3142getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m3136equalsimpl0(i11, companion.m3141getModulateAlphake2Ky5w())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
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

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m3136equalsimpl0(mo3165getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m3142getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m2420equalsimpl0(mo3164getBlendMode0nO6VwU(), BlendMode.Companion.m2451getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m3176applyCompositingStrategyZ1X6vPc(this.renderNode, CompositingStrategy.Companion.m3142getOffscreenke2Ky5w());
        } else {
            m3176applyCompositingStrategyZ1X6vPc(this.renderNode, mo3165getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @m80.k
    public Matrix calculateMatrix() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(@m80.k Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
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
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
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
    public boolean getHasDisplayList() {
        boolean hasDisplayList;
        hasDisplayList = this.renderNode.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        long uniqueId;
        uniqueId = this.renderNode.getUniqueId();
        return uniqueId;
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
        RecordingCanvas beginRecording;
        beginRecording = this.renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(graphicsLayer);
            drawContext.mo2982setSizeuvyYCjk(this.size);
            drawContext.setCanvas(androidCanvas);
            lVar.invoke(this.canvasDrawScope);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.renderNode.endRecording();
            setInvalidated(false);
        } catch (Throwable th2) {
            this.renderNode.endRecording();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f11) {
        this.alpha = f11;
        this.renderNode.setAlpha(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo3168setAmbientShadowColor8_81llA(long j11) {
        this.ambientShadowColor = j11;
        this.renderNode.setAmbientShadowColor(ColorKt.m2563toArgb8_81llA(j11));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo3169setBlendModes9anfk8(int i11) {
        this.blendMode = i11;
        obtainLayerPaint().setBlendMode(AndroidBlendMode_androidKt.m2360toAndroidBlendModes9anfk8(i11));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f11) {
        this.cameraDistance = f11;
        this.renderNode.setCameraDistance(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z11) {
        this.clip = z11;
        applyClip();
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
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo3172setPivotOffsetk4lQ0M(long j11) {
        this.pivotOffset = j11;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j11 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo3173setPositionH0pRuoY(int i11, int i12, long j11) {
        this.renderNode.setPosition(i11, i12, ((int) (j11 >> 32)) + i11, ((int) (4294967295L & j11)) + i12);
        this.size = IntSizeKt.m5298toSizeozmzZPI(j11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f11) {
        this.rotationX = f11;
        this.renderNode.setRotationX(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f11) {
        this.rotationY = f11;
        this.renderNode.setRotationY(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f11) {
        this.rotationZ = f11;
        this.renderNode.setRotationZ(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f11) {
        this.scaleX = f11;
        this.renderNode.setScaleX(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f11) {
        this.scaleY = f11;
        this.renderNode.setScaleY(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f11) {
        this.shadowElevation = f11;
        this.renderNode.setElevation(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo3174setSpotShadowColor8_81llA(long j11) {
        this.spotShadowColor = j11;
        this.renderNode.setSpotShadowColor(ColorKt.m2563toArgb8_81llA(j11));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f11) {
        this.translationX = f11;
        this.renderNode.setTranslationX(f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f11) {
        this.translationY = f11;
        this.renderNode.setTranslationY(f11);
    }

    public /* synthetic */ GraphicsLayerV29(long j11, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i11, kotlin.jvm.internal.v vVar) {
        this(j11, (i11 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i11 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
