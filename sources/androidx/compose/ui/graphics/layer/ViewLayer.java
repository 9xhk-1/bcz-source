package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n41#2,3:584\n44#2,2:617\n33#3:587\n53#4,3:588\n305#5,26:591\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n*L\n122#1:584,3\n122#1:617,2\n127#1:587\n127#1:588,3\n123#1:591,26\n*E\n"})
/* loaded from: classes.dex */
public final class ViewLayer extends View {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final ViewOutlineProvider LayerOutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
        
            r2 = ((androidx.compose.ui.graphics.layer.ViewLayer) r2).layerOutline;
         */
        @Override // android.view.ViewOutlineProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getOutline(android.view.View r2, android.graphics.Outline r3) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof androidx.compose.ui.graphics.layer.ViewLayer
                if (r0 == 0) goto Lf
                androidx.compose.ui.graphics.layer.ViewLayer r2 = (androidx.compose.ui.graphics.layer.ViewLayer) r2
                android.graphics.Outline r2 = androidx.compose.ui.graphics.layer.ViewLayer.access$getLayerOutline$p(r2)
                if (r2 == 0) goto Lf
                r3.set(r2)
            Lf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1.getOutline(android.view.View, android.graphics.Outline):void");
        }
    };
    private boolean canUseCompositingLayer;

    @m80.k
    private final CanvasDrawScope canvasDrawScope;

    @m80.k
    private final CanvasHolder canvasHolder;

    @m80.k
    private Density density;

    @m80.k
    private x00.l<? super DrawScope, g2> drawBlock;
    private boolean isInvalidated;

    @m80.l
    private Outline layerOutline;

    @m80.k
    private LayoutDirection layoutDirection;

    @m80.k
    private final View ownerView;

    @m80.l
    private GraphicsLayer parentLayer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final ViewOutlineProvider getLayerOutlineProvider$ui_graphics_release() {
            return ViewLayer.LayerOutlineProvider;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i11, kotlin.jvm.internal.v vVar) {
        this(view, (i11 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i11 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    @Override // android.view.View
    public void dispatchDraw(@m80.k Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Density density = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        float width = getWidth();
        float height = getHeight();
        long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        GraphicsLayer graphicsLayer = this.parentLayer;
        x00.l<? super DrawScope, g2> lVar = this.drawBlock;
        Density density2 = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long mo2981getSizeNHjbRc = canvasDrawScope.getDrawContext().mo2981getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(androidCanvas);
        drawContext.mo2982setSizeuvyYCjk(m2328constructorimpl);
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
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.isInvalidated = false;
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
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.canUseCompositingLayer;
    }

    @m80.k
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @m80.k
    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z11) {
        if (this.canUseCompositingLayer != z11) {
            this.canUseCompositingLayer = z11;
            invalidate();
        }
    }

    public final void setDrawParams(@m80.k Density density, @m80.k LayoutDirection layoutDirection, @m80.l GraphicsLayer graphicsLayer, @m80.k x00.l<? super DrawScope, g2> lVar) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = lVar;
        this.parentLayer = graphicsLayer;
    }

    public final void setInvalidated(boolean z11) {
        this.isInvalidated = z11;
    }

    public final boolean setLayerOutline(@m80.l Outline outline) {
        this.layerOutline = outline;
        return OutlineUtils.INSTANCE.rebuildOutline(this);
    }

    public ViewLayer(@m80.k View view, @m80.k CanvasHolder canvasHolder, @m80.k CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.density = DrawContextKt.getDefaultDensity();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.Companion.getDefaultDrawBlock();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
