package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
@u0({"SMAP\nGraphicsLayerV23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,426:1\n1#2:427\n278#3:428\n54#4:429\n59#4:431\n54#4:439\n59#4:441\n54#4:443\n59#4:445\n54#4:447\n59#4:449\n85#5:430\n90#5:432\n60#5:434\n70#5:437\n85#5:440\n90#5:442\n85#5:444\n90#5:446\n85#5:448\n90#5:450\n65#6:433\n69#6:436\n22#7:435\n22#7:438\n41#8,3:451\n44#8,2:480\n305#9,26:454\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n*L\n181#1:428\n183#1:429\n184#1:431\n295#1:439\n295#1:441\n298#1:443\n299#1:445\n325#1:447\n326#1:449\n183#1:430\n184#1:432\n187#1:434\n188#1:437\n295#1:440\n295#1:442\n298#1:444\n299#1:446\n325#1:448\n326#1:450\n187#1:433\n188#1:436\n187#1:435\n188#1:438\n329#1:451,3\n329#1:480,2\n330#1:454,26\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsLayerV23 implements GraphicsLayerImpl {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final AtomicBoolean needToValidateAccess = new AtomicBoolean(true);
    private static boolean testFailCreateRenderNode;
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
    private final long layerId;

    @m80.l
    private Paint layerPaint;

    @m80.l
    private Matrix matrix;
    private boolean outlineIsProvided;
    private long outlineSize;
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
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics_release() {
            return GraphicsLayerV23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_graphics_release(boolean z11) {
            GraphicsLayerV23.testFailCreateRenderNode = z11;
        }

        private Companion() {
        }
    }

    public GraphicsLayerV23(@m80.k View view, long j11, @m80.k CanvasHolder canvasHolder, @m80.k CanvasDrawScope canvasDrawScope) {
        this.ownerId = j11;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode create = RenderNode.create("Compose", view);
        this.renderNode = create;
        IntSize.Companion companion = IntSize.Companion;
        this.size = companion.m5291getZeroYbymL2g();
        this.outlineSize = companion.m5291getZeroYbymL2g();
        if (needToValidateAccess.getAndSet(false)) {
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
            discardDisplayListInternal$ui_graphics_release();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
        create.setClipToBounds(false);
        CompositingStrategy.Companion companion2 = CompositingStrategy.Companion;
        m3175applyCompositingStrategyWpw9cng(companion2.m3140getAutoke2Ky5w());
        this.compositingStrategy = companion2.m3140getAutoke2Ky5w();
        this.blendMode = BlendMode.Companion.m2451getSrcOver0nO6VwU();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m2283getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion3 = Color.Companion;
        this.ambientShadowColor = companion3.m2535getBlack0d7_KjU();
        this.spotShadowColor = companion3.m2535getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
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

    /* renamed from: applyCompositingStrategy-Wpw9cng, reason: not valid java name */
    private final void m3175applyCompositingStrategyWpw9cng(int i11) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m3136equalsimpl0(i11, companion.m3142getOffscreenke2Ky5w())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m3136equalsimpl0(i11, companion.m3141getModulateAlphake2Ky5w())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
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
        return (!CompositingStrategy.m3136equalsimpl0(mo3165getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m3142getOffscreenke2Ky5w()) && BlendMode.m2420equalsimpl0(mo3164getBlendMode0nO6VwU(), BlendMode.Companion.m2451getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m3175applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m3142getOffscreenke2Ky5w());
        } else {
            m3175applyCompositingStrategyWpw9cng(mo3165getCompositingStrategyke2Ky5w());
        }
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode, renderNodeVerificationHelper28.getSpotShadowColor(renderNode));
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
        discardDisplayListInternal$ui_graphics_release();
    }

    public final void discardDisplayListInternal$ui_graphics_release() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(@m80.k Canvas canvas) {
        DisplayListCanvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        kotlin.jvm.internal.g0.n(nativeCanvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        nativeCanvas.drawRenderNode(this.renderNode);
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
        return this.renderNode.isValid();
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
        android.graphics.Canvas start = this.renderNode.start(Math.max((int) (this.size >> 32), (int) (this.outlineSize >> 32)), Math.max((int) (this.size & 4294967295L), (int) (this.outlineSize & 4294967295L)));
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(start);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
            long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            Canvas canvas = canvasDrawScope.getDrawContext().getCanvas();
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
                drawContext2.setCanvas(canvas);
                drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                this.renderNode.end(start);
                setInvalidated(false);
            } catch (Throwable th2) {
                androidCanvas.restore();
                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                drawContext3.setDensity(density2);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas);
                drawContext3.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer2);
                throw th2;
            }
        } catch (Throwable th3) {
            this.renderNode.end(start);
            throw th3;
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j11;
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, ColorKt.m2563toArgb8_81llA(j11));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo3169setBlendModes9anfk8(int i11) {
        if (BlendMode.m2420equalsimpl0(this.blendMode, i11)) {
            return;
        }
        this.blendMode = i11;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m2361toPorterDuffModes9anfk8(i11)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f11) {
        this.cameraDistance = f11;
        this.renderNode.setCameraDistance(-f11);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z11) {
        this.clip = z11;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(@m80.l ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        if (colorFilter == null) {
            updateLayerProperties();
            return;
        }
        m3175applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m3142getOffscreenke2Ky5w());
        RenderNode renderNode = this.renderNode;
        Paint obtainLayerPaint = obtainLayerPaint();
        obtainLayerPaint.setColorFilter(AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
        renderNode.setLayerPaint(obtainLayerPaint);
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
        this.outlineSize = j11;
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo3172setPivotOffsetk4lQ0M(long j11) {
        this.pivotOffset = j11;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.renderNode.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j11 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo3173setPositionH0pRuoY(int i11, int i12, long j11) {
        int i13 = (int) (j11 >> 32);
        int i14 = (int) (4294967295L & j11);
        this.renderNode.setLeftTopRightBottom(i11, i12, i11 + i13, i12 + i14);
        if (IntSize.m5284equalsimpl0(this.size, j11)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(i13 / 2.0f);
            this.renderNode.setPivotY(i14 / 2.0f);
        }
        this.size = j11;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@m80.l RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
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
        this.renderNode.setRotation(f11);
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j11;
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, ColorKt.m2563toArgb8_81llA(j11));
        }
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

    public /* synthetic */ GraphicsLayerV23(View view, long j11, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i11, kotlin.jvm.internal.v vVar) {
        this(view, j11, (i11 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i11 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
