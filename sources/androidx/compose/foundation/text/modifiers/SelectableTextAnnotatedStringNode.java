package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSelectableTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableTextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,167:1\n107#2,7:168\n*S KotlinDebug\n*F\n+ 1 SelectableTextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode\n*L\n89#1:168,7\n*E\n"})
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;

    @l
    private x00.l<? super TextAnnotatedStringNode.TextSubstitutionValue, g2> onShowTranslation;

    @l
    private SelectionController selectionController;

    @k
    private final TextAnnotatedStringNode textAnnotatedStringNode;

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l lVar3, v vVar) {
        this(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, selectionController, colorProducer, textAutoSize, lVar3);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        this.textAnnotatedStringNode.drawNonExtension(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.textAnnotatedStringNode.maxIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.textAnnotatedStringNode.maxIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        return this.textAnnotatedStringNode.m1427measureNonExtension3p2s80s(measureScope, measurable, j11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.textAnnotatedStringNode.minIntrinsicHeightNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.textAnnotatedStringNode.minIntrinsicWidthNonExtension(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@k LayoutCoordinates layoutCoordinates) {
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.updateGlobalPosition(layoutCoordinates);
        }
    }

    /* renamed from: update-7NebLg4, reason: not valid java name */
    public final void m1426update7NebLg4(@k AnnotatedString annotatedString, @k TextStyle textStyle, @l List<AnnotatedString.Range<Placeholder>> list, int i11, int i12, boolean z11, @k FontFamily.Resolver resolver, int i13, @l x00.l<? super TextLayoutResult, g2> lVar, @l x00.l<? super List<Rect>, g2> lVar2, @l SelectionController selectionController, @l ColorProducer colorProducer, @l TextAutoSize textAutoSize) {
        TextAnnotatedStringNode textAnnotatedStringNode = this.textAnnotatedStringNode;
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(colorProducer, textStyle), this.textAnnotatedStringNode.updateText$foundation_release(annotatedString), this.textAnnotatedStringNode.m1428updateLayoutRelatedArgsy0kMQk(textStyle, list, i11, i12, z11, resolver, i13, textAutoSize), this.textAnnotatedStringNode.updateCallbacks(lVar, lVar2, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public /* synthetic */ SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l lVar3, int i14, v vVar) {
        this(annotatedString, textStyle, resolver, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? Integer.MAX_VALUE : i12, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : lVar2, (i14 & 1024) != 0 ? null : selectionController, (i14 & 2048) != 0 ? null : colorProducer, (i14 & 4096) != 0 ? null : textAutoSize, (i14 & 8192) != 0 ? null : lVar3, null);
    }

    private SelectableTextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l<? super TextLayoutResult, g2> lVar, int i11, boolean z11, int i12, int i13, List<AnnotatedString.Range<Placeholder>> list, x00.l<? super List<Rect>, g2> lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l<? super TextAnnotatedStringNode.TextSubstitutionValue, g2> lVar3) {
        this.selectionController = selectionController;
        this.onShowTranslation = lVar3;
        this.textAnnotatedStringNode = (TextAnnotatedStringNode) delegate(new TextAnnotatedStringNode(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, this.selectionController, colorProducer, textAutoSize, this.onShowTranslation, null));
        if (this.selectionController != null) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }
}
