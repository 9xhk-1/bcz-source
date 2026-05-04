package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,415:1\n30#2:416\n30#2:452\n80#3:417\n85#3:419\n90#3:421\n53#3,3:423\n60#3:427\n70#3:430\n85#3:433\n90#3:435\n53#3,3:437\n80#3:453\n60#3:461\n70#3:465\n54#4:418\n59#4:420\n54#4:432\n59#4:434\n30#5:422\n30#5:436\n278#5:458\n65#6:426\n69#6:429\n71#6:459\n65#6:460\n73#6:463\n69#6:464\n22#7:428\n22#7:431\n22#7:462\n22#7:466\n76#8,7:440\n102#8,5:447\n1#9:454\n49#10:455\n52#10,2:456\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n*L\n62#1:416\n336#1:452\n62#1:417\n147#1:419\n148#1:421\n146#1:423,3\n211#1:427\n212#1:430\n250#1:433\n251#1:435\n249#1:437,3\n336#1:453\n390#1:461\n389#1:465\n147#1:418\n148#1:420\n250#1:432\n251#1:434\n146#1:422\n249#1:436\n390#1:458\n211#1:426\n212#1:429\n390#1:459\n390#1:460\n389#1:463\n389#1:464\n211#1:428\n212#1:431\n390#1:462\n389#1:466\n313#1:440,7\n316#1:447,5\n369#1:455\n381#1:456,2\n*E\n"})
/* loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;

    @m80.l
    private final GraphicsContext context;

    @m80.l
    private x00.p<? super Canvas, ? super GraphicsLayer, g2> drawBlock;
    private boolean drawnWithEnabledZ;

    @m80.k
    private GraphicsLayer graphicsLayer;

    @m80.l
    private x00.a<g2> invalidateParentLayer;

    @m80.l
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;

    @m80.l
    private Outline outline;

    @m80.k
    private final AndroidComposeView ownerView;
    private long size;

    @m80.l
    private Paint softwareLayerPaint;

    @m80.k
    private final float[] matrixCache = Matrix.m2739constructorimpl$default(null, 1, null);

    @m80.k
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @m80.k
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @m80.k
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
    private boolean isIdentity = true;

    @m80.k
    private final x00.l<DrawScope, g2> recordLambda = new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            x00.p pVar;
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = GraphicsLayerOwnerLayer.this;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            pVar = graphicsLayerOwnerLayer.drawBlock;
            if (pVar != null) {
                pVar.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(@m80.k GraphicsLayer graphicsLayer, @m80.l GraphicsContext graphicsContext, @m80.k AndroidComposeView androidComposeView, @m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        long j11 = Integer.MAX_VALUE;
        this.size = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m4265getInverseMatrix3i98HWw() {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = Matrix.m2739constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
            return fArr;
        }
        this.isInverseMatrixDirty = false;
        float[] m4266getMatrixsQKQjiQ = m4266getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return m4266getMatrixsQKQjiQ;
        }
        if (InvertMatrixKt.m4267invertToJiSxe2E(m4266getMatrixsQKQjiQ, fArr)) {
            return fArr;
        }
        fArr[0] = Float.NaN;
        return null;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m4266getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
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

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long m2347getCenteruvyYCjk = (graphicsLayer.m3150getPivotOffsetF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m2347getCenteruvyYCjk(IntSizeKt.m5298toSizeozmzZPI(this.size)) : graphicsLayer.m3150getPivotOffsetF1C5BW0();
            Matrix.m2749resetToPivotedTransformimpl(this.matrixCache, Float.intBitsToFloat((int) (m2347getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (m2347getCenteruvyYCjk & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 1.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m2764isIdentity58bKbWc(this.matrixCache);
        }
    }

    private final void updateOutline() {
        x00.a<g2> aVar;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (aVar = this.invalidateParentLayer) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@m80.k Canvas canvas, @m80.l GraphicsLayer graphicsLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(graphicsLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    @m80.k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo4169getUnderlyingMatrixsQKQjiQ() {
        return m4266getMatrixsQKQjiQ();
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
        float[] m4265getInverseMatrix3i98HWw = m4265getInverseMatrix3i98HWw();
        if (m4265getInverseMatrix3i98HWw != null) {
            Matrix.m2758timesAssign58bKbWc(fArr, m4265getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo4171isInLayerk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), intBitsToFloat, intBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@m80.k MutableRect mutableRect, boolean z11) {
        float[] m4265getInverseMatrix3i98HWw = z11 ? m4265getInverseMatrix3i98HWw() : m4266getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (m4265getInverseMatrix3i98HWw == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m2747mapimpl(m4265getInverseMatrix3i98HWw, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo4172mapOffset8S9VItk(long j11, boolean z11) {
        float[] m4266getMatrixsQKQjiQ;
        if (z11) {
            m4266getMatrixsQKQjiQ = m4265getInverseMatrix3i98HWw();
            if (m4266getMatrixsQKQjiQ == null) {
                return Offset.Companion.m2282getInfiniteF1C5BW0();
            }
        } else {
            m4266getMatrixsQKQjiQ = m4266getMatrixsQKQjiQ();
        }
        return this.isIdentity ? j11 : Matrix.m2745mapMKHz9U(m4266getMatrixsQKQjiQ, j11);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo4173movegyyYBs(long j11) {
        this.graphicsLayer.m3162setTopLeftgyyYBs(j11);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo4174resizeozmzZPI(long j11) {
        if (IntSize.m5284equalsimpl0(j11, this.size)) {
            return;
        }
        this.size = j11;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@m80.k x00.p<? super Canvas, ? super GraphicsLayer, g2> pVar, @m80.k x00.a<g2> aVar) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.graphicsLayer.isReleased()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m2748resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m2748resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        long j11 = Integer.MAX_VALUE;
        this.size = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo4175transform58bKbWc(@m80.k float[] fArr) {
        Matrix.m2758timesAssign58bKbWc(fArr, m4266getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m2894equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m2900getCenterSzJe1aQ()) && !IntSize.m5284equalsimpl0(this.graphicsLayer.m3151getSizeYbymL2g(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float m2895getPivotFractionXimpl = TransformOrigin.m2895getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float m2896getPivotFractionYimpl = TransformOrigin.m2896getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.m3158setPivotOffsetk4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(m2896getPivotFractionYimpl) & 4294967295L) | (Float.floatToRawIntBits(m2895getPivotFractionXimpl) << 32)));
            }
            this.graphicsLayer.m3154recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@m80.k ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int m3141getModulateAlphake2Ky5w;
        x00.a<g2> aVar;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui_release();
        this.density = reusableGraphicsLayerScope.getGraphicsDensity$ui_release();
        int i11 = mutatedFields$ui_release & 4096;
        if (i11 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo2697getTransformOriginSzJe1aQ();
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            this.graphicsLayer.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.graphicsLayer.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.graphicsLayer.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.graphicsLayer.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.graphicsLayer.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.graphicsLayer.setShadowElevation(reusableGraphicsLayerScope.getShadowElevation());
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (aVar = this.invalidateParentLayer) != null) {
                aVar.invoke();
            }
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.graphicsLayer.m3155setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo2693getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.graphicsLayer.m3161setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo2696getSpotShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.graphicsLayer.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.graphicsLayer.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.graphicsLayer.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i11 != 0) {
            if (TransformOrigin.m2894equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m2900getCenterSzJe1aQ())) {
                this.graphicsLayer.m3158setPivotOffsetk4lQ0M(Offset.Companion.m2283getUnspecifiedF1C5BW0());
            } else {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float m2895getPivotFractionXimpl = TransformOrigin.m2895getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m3158setPivotOffsetk4lQ0M(Offset.m2260constructorimpl((Float.floatToRawIntBits(TransformOrigin.m2896getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(m2895getPivotFractionXimpl) << 32)));
            }
        }
        if ((mutatedFields$ui_release & 16384) != 0) {
            this.graphicsLayer.setClip(reusableGraphicsLayerScope.getClip());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int mo2694getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo2694getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m2593equalsimpl0(mo2694getCompositingStrategyNrFUSI, companion.m2597getAutoNrFUSI())) {
                m3141getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m3140getAutoke2Ky5w();
            } else if (CompositingStrategy.m2593equalsimpl0(mo2694getCompositingStrategyNrFUSI, companion.m2599getOffscreenNrFUSI())) {
                m3141getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m3142getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m2593equalsimpl0(mo2694getCompositingStrategyNrFUSI, companion.m2598getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                m3141getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m3141getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m3157setCompositingStrategyWpw9cng(m3141getModulateAlphake2Ky5w);
        }
        boolean z11 = true;
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (kotlin.jvm.internal.g0.g(this.outline, reusableGraphicsLayerScope.getOutline$ui_release())) {
            z11 = false;
        } else {
            this.outline = reusableGraphicsLayerScope.getOutline$ui_release();
            updateOutline();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
        if (mutatedFields$ui_release != 0 || z11) {
            triggerRepaint();
        }
    }
}
