package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
@u0({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1073:1\n1#2:1074\n69#3:1075\n65#3:1078\n69#3:1081\n65#3:1084\n70#4:1076\n60#4:1079\n70#4:1082\n60#4:1085\n22#5:1077\n22#5:1080\n22#5:1083\n22#5:1086\n293#6,27:1087\n120#6,7:1114\n321#6,10:1121\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n*L\n278#1:1075\n295#1:1078\n312#1:1081\n330#1:1084\n278#1:1076\n295#1:1079\n312#1:1082\n330#1:1085\n278#1:1077\n295#1:1080\n312#1:1083\n330#1:1086\n348#1:1087,27\n349#1:1114,7\n348#1:1121,10\n*E\n"})
/* loaded from: classes.dex */
final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {

    @l
    private RenderNode _renderNode;

    @m80.k
    private final EdgeEffectWrapper edgeEffectWrapper;

    @m80.k
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public StretchOverscrollNode(@m80.k DelegatableNode delegatableNode, @m80.k AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, @m80.k EdgeEffectWrapper edgeEffectWrapper) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        delegate(delegatableNode);
    }

    private final boolean drawBottomStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(180.0f, edgeEffect, canvas);
    }

    private final boolean drawLeftStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(270.0f, edgeEffect, canvas);
    }

    private final boolean drawRightStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(90.0f, edgeEffect, canvas);
    }

    private final boolean drawTopStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(0.0f, edgeEffect, canvas);
    }

    private final boolean drawWithRotation(float f11, EdgeEffect edgeEffect, Canvas canvas) {
        if (f11 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f11);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final RenderNode getRenderNode() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a11 = k.a("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = a11;
        return a11;
    }

    private final boolean shouldDrawHorizontalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isLeftAnimating() || edgeEffectWrapper.isLeftNegationStretched() || edgeEffectWrapper.isRightAnimating() || edgeEffectWrapper.isRightNegationStretched();
    }

    private final boolean shouldDrawVerticalStretch() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        return edgeEffectWrapper.isTopAnimating() || edgeEffectWrapper.isTopNegationStretched() || edgeEffectWrapper.isBottomAnimating() || edgeEffectWrapper.isBottomNegationStretched();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        RecordingCanvas beginRecording;
        long j11;
        boolean z11;
        float f11;
        float f12;
        this.overscrollEffect.m216updateSizeuvyYCjk$foundation_release(contentDrawScope.mo3060getSizeNHjbRc());
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        if (Size.m2339isEmptyimpl(contentDrawScope.mo3060getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        if (!nativeCanvas.isHardwareAccelerated()) {
            this.edgeEffectWrapper.finishAll();
            contentDrawScope.drawContent();
            return;
        }
        float mo377toPx0680j_4 = contentDrawScope.mo377toPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean shouldDrawVerticalStretch = shouldDrawVerticalStretch();
        boolean shouldDrawHorizontalStretch = shouldDrawHorizontalStretch();
        if (shouldDrawVerticalStretch && shouldDrawHorizontalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (shouldDrawVerticalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth() + (c10.d.L0(mo377toPx0680j_4) * 2), nativeCanvas.getHeight());
        } else {
            if (!shouldDrawHorizontalStretch) {
                contentDrawScope.drawContent();
                return;
            }
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight() + (c10.d.L0(mo377toPx0680j_4) * 2));
        }
        beginRecording = getRenderNode().beginRecording();
        if (edgeEffectWrapper.isLeftNegationStretched()) {
            EdgeEffect orCreateLeftEffectNegation = edgeEffectWrapper.getOrCreateLeftEffectNegation();
            drawRightStretch(orCreateLeftEffectNegation, beginRecording);
            orCreateLeftEffectNegation.finish();
        }
        if (edgeEffectWrapper.isLeftAnimating()) {
            EdgeEffect orCreateLeftEffect = edgeEffectWrapper.getOrCreateLeftEffect();
            z11 = drawLeftStretch(orCreateLeftEffect, beginRecording);
            if (edgeEffectWrapper.isLeftStretched()) {
                float intBitsToFloat = Float.intBitsToFloat((int) (this.overscrollEffect.m215displacementF1C5BW0$foundation_release() & 4294967295L));
                EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
                j11 = 4294967295L;
                edgeEffectCompat.onPullDistanceCompat(edgeEffectWrapper.getOrCreateLeftEffectNegation(), edgeEffectCompat.getDistanceCompat(orCreateLeftEffect), 1 - intBitsToFloat);
            } else {
                j11 = 4294967295L;
            }
        } else {
            j11 = 4294967295L;
            z11 = false;
        }
        if (edgeEffectWrapper.isTopNegationStretched()) {
            EdgeEffect orCreateTopEffectNegation = edgeEffectWrapper.getOrCreateTopEffectNegation();
            drawBottomStretch(orCreateTopEffectNegation, beginRecording);
            orCreateTopEffectNegation.finish();
        }
        if (edgeEffectWrapper.isTopAnimating()) {
            EdgeEffect orCreateTopEffect = edgeEffectWrapper.getOrCreateTopEffect();
            z11 = drawTopStretch(orCreateTopEffect, beginRecording) || z11;
            if (edgeEffectWrapper.isTopStretched()) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.overscrollEffect.m215displacementF1C5BW0$foundation_release() >> 32));
                EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                edgeEffectCompat2.onPullDistanceCompat(edgeEffectWrapper.getOrCreateTopEffectNegation(), edgeEffectCompat2.getDistanceCompat(orCreateTopEffect), intBitsToFloat2);
            }
        }
        if (edgeEffectWrapper.isRightNegationStretched()) {
            EdgeEffect orCreateRightEffectNegation = edgeEffectWrapper.getOrCreateRightEffectNegation();
            drawLeftStretch(orCreateRightEffectNegation, beginRecording);
            orCreateRightEffectNegation.finish();
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            EdgeEffect orCreateRightEffect = edgeEffectWrapper.getOrCreateRightEffect();
            z11 = drawRightStretch(orCreateRightEffect, beginRecording) || z11;
            if (edgeEffectWrapper.isRightStretched()) {
                float intBitsToFloat3 = Float.intBitsToFloat((int) (this.overscrollEffect.m215displacementF1C5BW0$foundation_release() & j11));
                EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
                edgeEffectCompat3.onPullDistanceCompat(edgeEffectWrapper.getOrCreateRightEffectNegation(), edgeEffectCompat3.getDistanceCompat(orCreateRightEffect), intBitsToFloat3);
            }
        }
        if (edgeEffectWrapper.isBottomNegationStretched()) {
            EdgeEffect orCreateBottomEffectNegation = edgeEffectWrapper.getOrCreateBottomEffectNegation();
            drawTopStretch(orCreateBottomEffectNegation, beginRecording);
            orCreateBottomEffectNegation.finish();
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            EdgeEffect orCreateBottomEffect = edgeEffectWrapper.getOrCreateBottomEffect();
            boolean z12 = drawBottomStretch(orCreateBottomEffect, beginRecording) || z11;
            if (edgeEffectWrapper.isBottomStretched()) {
                float intBitsToFloat4 = Float.intBitsToFloat((int) (this.overscrollEffect.m215displacementF1C5BW0$foundation_release() >> 32));
                EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.INSTANCE;
                edgeEffectCompat4.onPullDistanceCompat(edgeEffectWrapper.getOrCreateBottomEffectNegation(), edgeEffectCompat4.getDistanceCompat(orCreateBottomEffect), 1 - intBitsToFloat4);
            }
            z11 = z12;
        }
        if (z11) {
            this.overscrollEffect.invalidateOverscroll$foundation_release();
        }
        float f13 = shouldDrawHorizontalStretch ? 0.0f : mo377toPx0680j_4;
        if (shouldDrawVerticalStretch) {
            mo377toPx0680j_4 = 0.0f;
        }
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(beginRecording);
        long mo3060getSizeNHjbRc = contentDrawScope.mo3060getSizeNHjbRc();
        Density density = contentDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        long mo2981getSizeNHjbRc = contentDrawScope.getDrawContext().mo2981getSizeNHjbRc();
        GraphicsLayer graphicsLayer = contentDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        drawContext.setDensity(contentDrawScope);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(Canvas);
        drawContext.mo2982setSizeuvyYCjk(mo3060getSizeNHjbRc);
        drawContext.setGraphicsLayer(null);
        Canvas.save();
        try {
            contentDrawScope.getDrawContext().getTransform().translate(f13, mo377toPx0680j_4);
            try {
                contentDrawScope.drawContent();
                Canvas.restore();
                DrawContext drawContext2 = contentDrawScope.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                getRenderNode().endRecording();
                int save = nativeCanvas.save();
                nativeCanvas.translate(f11, f12);
                nativeCanvas.drawRenderNode(getRenderNode());
                nativeCanvas.restoreToCount(save);
            } finally {
                contentDrawScope.getDrawContext().getTransform().translate(-f13, -mo377toPx0680j_4);
            }
        } catch (Throwable th2) {
            Canvas.restore();
            DrawContext drawContext3 = contentDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th2;
        }
    }
}
