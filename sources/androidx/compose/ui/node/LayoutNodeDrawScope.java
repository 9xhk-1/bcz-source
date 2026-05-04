package androidx.compose.ui.node;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n233#2:154\n305#2,15:252\n321#2,10:268\n76#3,7:155\n87#4:162\n87#4:206\n87#4:207\n87#4:208\n437#5,6:163\n447#5,2:170\n449#5,8:175\n457#5,9:186\n466#5,8:198\n437#5,6:209\n447#5,2:216\n449#5,8:221\n457#5,9:232\n466#5,8:244\n246#6:169\n246#6:215\n240#7,3:172\n243#7,3:195\n240#7,3:218\n243#7,3:241\n1101#8:183\n1083#8,2:184\n1101#8:229\n1083#8,2:230\n1#9:267\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n47#1:154\n131#1:252,15\n131#1:268,10\n49#1:155,7\n64#1:162\n71#1:206\n106#1:207\n119#1:208\n64#1:163,6\n64#1:170,2\n64#1:175,8\n64#1:186,9\n64#1:198,8\n119#1:209,6\n119#1:216,2\n119#1:221,8\n119#1:232,9\n119#1:244,8\n64#1:169\n119#1:215\n64#1:172,3\n64#1:195,3\n119#1:218,3\n119#1:241,3\n64#1:183\n64#1:184,2\n119#1:229\n119#1:230,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;

    @k
    private final CanvasDrawScope canvasDrawScope;

    @l
    private DrawModifierNode drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m4047draweZhPAX0$ui_release(@k Canvas canvas, long j11, @k NodeCoordinator nodeCoordinator, @k Modifier.Node node, @l GraphicsLayer graphicsLayer) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(4);
        DelegatingNode delegatingNode = node;
        MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof DrawModifierNode) {
                m4048drawDirecteZhPAX0$ui_release(canvas, j11, nodeCoordinator, delegatingNode, graphicsLayer);
            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                int i11 = 0;
                delegatingNode = delegatingNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        i11++;
                        if (i11 == 1) {
                            delegatingNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                mutableVector.add(delegatingNode);
                                delegatingNode = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    delegatingNode = delegatingNode;
                }
                if (i11 == 1) {
                }
            }
            delegatingNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo2957drawArcillE91I(@k Brush brush, float f11, float f12, boolean z11, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2957drawArcillE91I(brush, f11, f12, z11, j11, j12, f13, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo2958drawArcyD3GUKo(long j11, float f11, float f12, boolean z11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f13, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2958drawArcyD3GUKo(j11, f11, f12, z11, j12, j13, f13, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo2959drawCircleV9BoPsw(@k Brush brush, float f11, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2959drawCircleV9BoPsw(brush, f11, j11, f12, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo2960drawCircleVaOC9Bg(long j11, float f11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f12, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2960drawCircleVaOC9Bg(j11, f11, j12, f12, drawStyle, colorFilter, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        DelegatingNode nextDrawNode;
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new KotlinNothingValueException();
        }
        nextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (nextDrawNode == 0) {
            NodeCoordinator m3979requireCoordinator64DMado = DelegatableNodeKt.m3979requireCoordinator64DMado(drawModifierNode, NodeKind.m4118constructorimpl(4));
            if (m3979requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                m3979requireCoordinator64DMado = m3979requireCoordinator64DMado.getWrapped$ui_release();
                g0.m(m3979requireCoordinator64DMado);
            }
            m3979requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(4);
        MutableVector mutableVector = null;
        while (nextDrawNode != 0) {
            if (nextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) nextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((nextDrawNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (nextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = nextDrawNode.getDelegate$ui_release();
                int i11 = 0;
                nextDrawNode = nextDrawNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        i11++;
                        if (i11 == 1) {
                            nextDrawNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nextDrawNode != 0) {
                                mutableVector.add(nextDrawNode);
                                nextDrawNode = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    nextDrawNode = nextDrawNode;
                }
                if (i11 == 1) {
                }
            }
            nextDrawNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m4048drawDirecteZhPAX0$ui_release(@k Canvas canvas, long j11, @k NodeCoordinator nodeCoordinator, @k DrawModifierNode drawModifierNode, @l GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long mo2981getSizeNHjbRc = canvasDrawScope.getDrawContext().mo2981getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(nodeCoordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo2982setSizeuvyYCjk(j11);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            this.drawNode = drawModifierNode2;
        } catch (Throwable th2) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @n(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @w0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo2961drawImage9jGpkUE(ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2961drawImage9jGpkUE(imageBitmap, j11, j12, j13, j14, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo2962drawImageAZ2fEMs(@k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11, int i12) {
        this.canvasDrawScope.mo2962drawImageAZ2fEMs(imageBitmap, j11, j12, j13, j14, f11, drawStyle, colorFilter, i11, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo2963drawImagegbVJVH8(@k ImageBitmap imageBitmap, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2963drawImagegbVJVH8(imageBitmap, j11, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo2964drawLine1RTmtNc(@k Brush brush, long j11, long j12, float f11, int i11, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i12) {
        this.canvasDrawScope.mo2964drawLine1RTmtNc(brush, j11, j12, f11, i11, pathEffect, f12, colorFilter, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo2965drawLineNGM6Ib0(long j11, long j12, long j13, float f11, int i11, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i12) {
        this.canvasDrawScope.mo2965drawLineNGM6Ib0(j11, j12, j13, f11, i11, pathEffect, f12, colorFilter, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo2966drawOvalAsUm42w(@k Brush brush, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2966drawOvalAsUm42w(brush, j11, j12, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo2967drawOvalnJ9OG0(long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2967drawOvalnJ9OG0(j11, j12, j13, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo2968drawPathGBMwjPU(@k Path path, @k Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2968drawPathGBMwjPU(path, brush, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo2969drawPathLG529CI(@k Path path, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2969drawPathLG529CI(path, j11, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo2970drawPointsF8ZwMP8(@k List<Offset> list, int i11, long j11, float f11, int i12, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i13) {
        this.canvasDrawScope.mo2970drawPointsF8ZwMP8(list, i11, j11, f11, i12, pathEffect, f12, colorFilter, i13);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo2971drawPointsGsft0Ws(@k List<Offset> list, int i11, @k Brush brush, float f11, int i12, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i13) {
        this.canvasDrawScope.mo2971drawPointsGsft0Ws(list, i11, brush, f11, i12, pathEffect, f12, colorFilter, i13);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo2972drawRectAsUm42w(@k Brush brush, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2972drawRectAsUm42w(brush, j11, j12, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo2973drawRectnJ9OG0(long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2973drawRectnJ9OG0(j11, j12, j13, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo2974drawRoundRectZuiqVtQ(@k Brush brush, long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2974drawRoundRectZuiqVtQ(brush, j11, j12, j13, f11, drawStyle, colorFilter, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo2975drawRoundRectuAw5IA(long j11, long j12, long j13, long j14, @k DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f11, @l ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo2975drawRoundRectuAw5IA(j11, j12, j13, j14, drawStyle, f11, colorFilter, i11);
    }

    @k
    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo3059getCenterF1C5BW0() {
        return this.canvasDrawScope.mo3059getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @k
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @k
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo3060getSizeNHjbRc() {
        return this.canvasDrawScope.mo3060getSizeNHjbRc();
    }

    public final void performDraw(@k DrawModifierNode drawModifierNode, @k Canvas canvas, @l GraphicsLayer graphicsLayer) {
        NodeCoordinator m3979requireCoordinator64DMado = DelegatableNodeKt.m3979requireCoordinator64DMado(drawModifierNode, NodeKind.m4118constructorimpl(4));
        m3979requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m4048drawDirecteZhPAX0$ui_release(canvas, IntSizeKt.m5298toSizeozmzZPI(m3979requireCoordinator64DMado.mo3865getSizeYbymL2g()), m3979requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4 */
    public void mo3061recordJVtK1S4(@k GraphicsLayer graphicsLayer, long j11, @k final x00.l<? super DrawScope, g2> lVar) {
        final DrawModifierNode drawModifierNode = this.drawNode;
        graphicsLayer.m3154recordmLhObY(this, getLayoutDirection(), j11, new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                ?? r22;
                LayoutNodeDrawScope layoutNodeDrawScope;
                Density density;
                LayoutDirection layoutDirection;
                Canvas canvas;
                long mo2981getSizeNHjbRc;
                GraphicsLayer graphicsLayer2;
                x00.l<DrawScope, g2> lVar2;
                Density density2;
                LayoutDirection layoutDirection2;
                Canvas canvas2;
                long mo2981getSizeNHjbRc2;
                GraphicsLayer graphicsLayer3;
                r22 = LayoutNodeDrawScope.this.drawNode;
                LayoutNodeDrawScope.this.drawNode = drawModifierNode;
                try {
                    layoutNodeDrawScope = LayoutNodeDrawScope.this;
                    density = drawScope.getDrawContext().getDensity();
                    layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    canvas = drawScope.getDrawContext().getCanvas();
                    mo2981getSizeNHjbRc = drawScope.getDrawContext().mo2981getSizeNHjbRc();
                    graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    lVar2 = lVar;
                    density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    mo2981getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo2981getSizeNHjbRc();
                    graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                } catch (Throwable th2) {
                    th = th2;
                    LayoutNodeDrawScope.this.drawNode = r22;
                    throw th;
                }
                try {
                    r22 = layoutNodeDrawScope.getDrawContext();
                    r22.setDensity(density);
                    r22.setLayoutDirection(layoutDirection);
                    r22.setCanvas(canvas);
                    r22.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                    r22.setGraphicsLayer(graphicsLayer2);
                    canvas.save();
                    try {
                        lVar2.invoke(layoutNodeDrawScope);
                        canvas.restore();
                        DrawContext drawContext = layoutNodeDrawScope.getDrawContext();
                        drawContext.setDensity(density2);
                        drawContext.setLayoutDirection(layoutDirection2);
                        drawContext.setCanvas(canvas2);
                        drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc2);
                        drawContext.setGraphicsLayer(graphicsLayer3);
                        LayoutNodeDrawScope.this.drawNode = r22;
                    } finally {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r22 = r22;
                    LayoutNodeDrawScope.this.drawNode = r22;
                    throw th;
                }
            }
        });
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo370roundToPxR2X_6o(long j11) {
        return this.canvasDrawScope.mo370roundToPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo371roundToPx0680j_4(float f11) {
        return this.canvasDrawScope.mo371roundToPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo372toDpGaN1DYA(long j11) {
        return this.canvasDrawScope.mo372toDpGaN1DYA(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo373toDpu2uoSUM(float f11) {
        return this.canvasDrawScope.mo373toDpu2uoSUM(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo375toDpSizekrfVVM(long j11) {
        return this.canvasDrawScope.mo375toDpSizekrfVVM(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo376toPxR2X_6o(long j11) {
        return this.canvasDrawScope.mo376toPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo377toPx0680j_4(float f11) {
        return this.canvasDrawScope.mo377toPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @k
    public Rect toRect(@k DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo378toSizeXkaWNTQ(long j11) {
        return this.canvasDrawScope.mo378toSizeXkaWNTQ(j11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo379toSp0xMU5do(float f11) {
        return this.canvasDrawScope.mo379toSp0xMU5do(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo380toSpkPz2Gy4(float f11) {
        return this.canvasDrawScope.mo380toSpkPz2Gy4(f11);
    }

    public LayoutNodeDrawScope(@k CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo374toDpu2uoSUM(int i11) {
        return this.canvasDrawScope.mo374toDpu2uoSUM(i11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo381toSpkPz2Gy4(int i11) {
        return this.canvasDrawScope.mo381toSpkPz2Gy4(i11);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i11, v vVar) {
        this((i11 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
