package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c40.l2;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,623:1\n1#2:624\n646#3:625\n635#3:626\n233#4:627\n56#5:628\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n*L\n483#1:625\n483#1:626\n497#1:627\n518#1:628\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @m80.l
    private l2 changeObserverJob;

    @m80.l
    private CursorAnimationState cursorAnimation;

    @m80.k
    private Brush cursorBrush;
    private boolean isDragHovered;
    private boolean isFocused;

    @m80.k
    private Orientation orientation;

    @m80.k
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);

    @m80.l
    private TextRange previousSelection;
    private int previousTextLayoutSize;

    @m80.k
    private ScrollState scrollState;

    @m80.k
    private final TextFieldMagnifierNode textFieldMagnifierNode;

    @m80.k
    private TextFieldSelectionState textFieldSelectionState;

    @m80.k
    private TransformedTextFieldState textFieldState;

    @m80.k
    private TextLayoutState textLayoutState;
    private boolean writeable;

    public TextFieldCoreModifierNode(boolean z11, boolean z12, @m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k Brush brush, boolean z13, @m80.k ScrollState scrollState, @m80.k Orientation orientation) {
        this.isFocused = z11;
        this.isDragHovered = z12;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z13;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused || this.isDragHovered));
    }

    /* renamed from: calculateOffsetToFollow-72CqOWE, reason: not valid java name */
    private final int m1278calculateOffsetToFollow72CqOWE(long j11, int i11) {
        TextRange textRange = this.previousSelection;
        if (textRange == null || TextRange.m4554getEndimpl(j11) != TextRange.m4554getEndimpl(textRange.m4563unboximpl())) {
            return TextRange.m4554getEndimpl(j11);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m4559getStartimpl(j11) != TextRange.m4559getStartimpl(textRange2.m4563unboximpl())) {
            return TextRange.m4559getStartimpl(j11);
        }
        if (i11 != this.previousTextLayoutSize) {
            return TextRange.m4559getStartimpl(j11);
        }
        return -1;
    }

    private final void drawCursor(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.cursorAnimation;
        float cursorAlpha = cursorAnimationState != null ? cursorAnimationState.getCursorAlpha() : 0.0f;
        if (cursorAlpha != 0.0f && getShowCursor()) {
            Rect cursorRect = this.textFieldSelectionState.getCursorRect();
            DrawScope.m3045drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m2302getTopCenterF1C5BW0(), cursorRect.m2295getBottomCenterF1C5BW0(), cursorRect.getRight() - cursorRect.getLeft(), 0, null, cursorAlpha, null, 0, 432, null);
        }
    }

    private final void drawHighlight(DrawScope drawScope, Pair<TextHighlightType, TextRange> pair, TextLayoutResult textLayoutResult) {
        int m1201unboximpl = pair.component1().m1201unboximpl();
        long m4563unboximpl = pair.component2().m4563unboximpl();
        if (TextRange.m4553getCollapsedimpl(m4563unboximpl)) {
            return;
        }
        Path pathForRange = textLayoutResult.getPathForRange(TextRange.m4557getMinimpl(m4563unboximpl), TextRange.m4556getMaximpl(m4563unboximpl));
        if (!TextHighlightType.m1198equalsimpl0(m1201unboximpl, TextHighlightType.Companion.m1202getHandwritingDeletePreviewsxJuwY())) {
            DrawScope.m3050drawPathLG529CI$default(drawScope, pathForRange, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1514getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            return;
        }
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            DrawScope.m3049drawPathGBMwjPU$default(drawScope, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long m4589getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m4589getColor0d7_KjU();
        if (m4589getColor0d7_KjU == 16) {
            m4589getColor0d7_KjU = Color.Companion.m2535getBlack0d7_KjU();
        }
        long j11 = m4589getColor0d7_KjU;
        DrawScope.m3050drawPathLG529CI$default(drawScope, pathForRange, Color.m2508copywmQWz5c$default(j11, Color.m2511getAlphaimpl(j11) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m1279drawSelectionSbBc2M(DrawScope drawScope, long j11, TextLayoutResult textLayoutResult) {
        int m4557getMinimpl = TextRange.m4557getMinimpl(j11);
        int m4556getMaximpl = TextRange.m4556getMaximpl(j11);
        if (m4557getMinimpl != m4556getMaximpl) {
            DrawScope.m3050drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(m4557getMinimpl, m4556getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1514getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawText(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }

    private final boolean getShowCursor() {
        boolean isSpecified;
        if (!this.writeable) {
            return false;
        }
        if (!this.isFocused && !this.isDragHovered) {
            return false;
        }
        isSpecified = TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
        return isSpecified;
    }

    /* renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1280measureHorizontalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int min = Math.min(mo3857measureBRTryo0.getWidth(), Constraints.m5068getMaxWidthimpl(j11));
        return MeasureScope.layout$default(measureScope, min, mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                TransformedTextFieldState transformedTextFieldState;
                ScrollState scrollState;
                TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                MeasureScope measureScope2 = measureScope;
                int i11 = min;
                int width = mo3857measureBRTryo0.getWidth();
                transformedTextFieldState = TextFieldCoreModifierNode.this.textFieldState;
                textFieldCoreModifierNode.m1282updateScrollStatetIlFzwE(measureScope2, i11, width, transformedTextFieldState.getVisualText().m1189getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable placeable = mo3857measureBRTryo0;
                scrollState = TextFieldCoreModifierNode.this.scrollState;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, -scrollState.getValue(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1281measureVerticalScroll3p2s80s(final MeasureScope measureScope, Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = Math.min(mo3857measureBRTryo0.getHeight(), Constraints.m5067getMaxHeightimpl(j11));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), min, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                TransformedTextFieldState transformedTextFieldState;
                ScrollState scrollState;
                TextFieldCoreModifierNode textFieldCoreModifierNode = TextFieldCoreModifierNode.this;
                MeasureScope measureScope2 = measureScope;
                int i11 = min;
                int height = mo3857measureBRTryo0.getHeight();
                transformedTextFieldState = TextFieldCoreModifierNode.this.textFieldState;
                textFieldCoreModifierNode.m1282updateScrollStatetIlFzwE(measureScope2, i11, height, transformedTextFieldState.getVisualText().m1189getSelectiond9O1mEE(), measureScope.getLayoutDirection());
                Placeable placeable = mo3857measureBRTryo0;
                scrollState = TextFieldCoreModifierNode.this.scrollState;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, -scrollState.getValue(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    private final void startCursorJob() {
        l2 f11;
        if (this.cursorAnimation == null) {
            this.cursorAnimation = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            DrawModifierNodeKt.invalidateDraw(this);
        }
        f11 = c40.k.f(getCoroutineScope(), null, null, new TextFieldCoreModifierNode$startCursorJob$1(this, null), 3, null);
        this.changeObserverJob = f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    public final void m1282updateScrollStatetIlFzwE(Density density, int i11, int i12, long j11, LayoutDirection layoutDirection) {
        TextLayoutResult layoutResult;
        Rect cursorRectInScroller;
        float f11;
        this.scrollState.setMaxValue$foundation_release(i12 - i11);
        int m1278calculateOffsetToFollow72CqOWE = m1278calculateOffsetToFollow72CqOWE(j11, i12);
        if (m1278calculateOffsetToFollow72CqOWE < 0 || !getShowCursor() || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
            return;
        }
        Rect cursorRect = layoutResult.getCursorRect(g10.u.J(m1278calculateOffsetToFollow72CqOWE, new g10.l(0, layoutResult.getLayoutInput().getText().length())));
        cursorRectInScroller = TextFieldCoreModifierKt.getCursorRectInScroller(density, cursorRect, layoutDirection == LayoutDirection.Rtl, i12);
        if (cursorRectInScroller.getLeft() == this.previousCursorRect.getLeft() && cursorRectInScroller.getTop() == this.previousCursorRect.getTop() && i12 == this.previousTextLayoutSize) {
            return;
        }
        boolean z11 = this.orientation == Orientation.Vertical;
        float top = z11 ? cursorRectInScroller.getTop() : cursorRectInScroller.getLeft();
        float bottom = z11 ? cursorRectInScroller.getBottom() : cursorRectInScroller.getRight();
        int value = this.scrollState.getValue();
        float f12 = value + i11;
        if (bottom <= f12) {
            float f13 = value;
            if (top >= f13 || bottom - top <= i11) {
                f11 = (top >= f13 || bottom - top > ((float) i11)) ? 0.0f : top - f13;
                this.previousSelection = TextRange.m4547boximpl(j11);
                this.previousCursorRect = cursorRectInScroller;
                this.previousTextLayoutSize = i12;
                c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f11, cursorRect, null), 1, null);
            }
        }
        f11 = bottom - f12;
        this.previousSelection = TextRange.m4547boximpl(j11);
        this.previousCursorRect = cursorRectInScroller;
        this.previousTextLayoutSize = i12;
        c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f11, cursorRect, null), 1, null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        Pair<TextHighlightType, TextRange> highlight = visualText.getHighlight();
        if (highlight != null) {
            drawHighlight(contentDrawScope, highlight, layoutResult);
        }
        if (TextRange.m4553getCollapsedimpl(visualText.m1189getSelectiond9O1mEE())) {
            drawText(contentDrawScope, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(contentDrawScope);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m1279drawSelectionSbBc2M(contentDrawScope, visualText.m1189getSelectiond9O1mEE(), layoutResult);
            }
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        return this.orientation == Orientation.Vertical ? m1281measureVerticalScroll3p2s80s(measureScope, measurable, j11) : m1280measureHorizontalScroll3p2s80s(measureScope, measurable, j11);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (this.isFocused && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setCoreNodeCoordinates(layoutCoordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    public final void updateNode(boolean z11, boolean z12, @m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k Brush brush, boolean z13, @m80.k ScrollState scrollState, @m80.k Orientation orientation) {
        boolean showCursor = getShowCursor();
        boolean z14 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = z11;
        this.isDragHovered = z12;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z13;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.update(transformedTextFieldState, textFieldSelectionState, textLayoutState, z11 || z12);
        if (!getShowCursor()) {
            l2 l2Var = this.changeObserverJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            this.changeObserverJob = null;
            CursorAnimationState cursorAnimationState = this.cursorAnimation;
            if (cursorAnimationState != null) {
                cursorAnimationState.cancelAndHide();
            }
        } else if (!z14 || !kotlin.jvm.internal.g0.g(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            startCursorJob();
        }
        if (kotlin.jvm.internal.g0.g(transformedTextFieldState2, transformedTextFieldState) && kotlin.jvm.internal.g0.g(textLayoutState2, textLayoutState) && kotlin.jvm.internal.g0.g(textFieldSelectionState2, textFieldSelectionState) && kotlin.jvm.internal.g0.g(scrollState2, scrollState)) {
            return;
        }
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }
}
