package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
    public static final int $stable = 0;

    @l
    private final TextAutoSize autoSize;

    @l
    private final ColorProducer color;

    @k
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;

    @l
    private final x00.l<List<Rect>, g2> onPlaceholderLayout;

    @l
    private final x00.l<TextLayoutResult, g2> onTextLayout;
    private final int overflow;

    @l
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    @l
    private final SelectionController selectionController;
    private final boolean softWrap;

    @k
    private final TextStyle style;

    @k
    private final AnnotatedString text;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, v vVar) {
        this(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, selectionController, colorProducer, textAutoSize);
    }

    private final AnnotatedString component1() {
        return this.text;
    }

    private final x00.l<List<Rect>, g2> component10() {
        return this.onPlaceholderLayout;
    }

    private final SelectionController component11() {
        return this.selectionController;
    }

    private final ColorProducer component12() {
        return this.color;
    }

    private final TextAutoSize component13() {
        return this.autoSize;
    }

    private final TextStyle component2() {
        return this.style;
    }

    private final FontFamily.Resolver component3() {
        return this.fontFamilyResolver;
    }

    private final x00.l<TextLayoutResult, g2> component4() {
        return this.onTextLayout;
    }

    /* renamed from: component5-gIe3tQ8, reason: not valid java name */
    private final int m1423component5gIe3tQ8() {
        return this.overflow;
    }

    private final boolean component6() {
        return this.softWrap;
    }

    private final int component7() {
        return this.maxLines;
    }

    private final int component8() {
        return this.minLines;
    }

    private final List<AnnotatedString.Range<Placeholder>> component9() {
        return this.placeholders;
    }

    /* renamed from: copy-RWo7tUw$default, reason: not valid java name */
    public static /* synthetic */ SelectableTextAnnotatedStringElement m1424copyRWo7tUw$default(SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement, AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            annotatedString = selectableTextAnnotatedStringElement.text;
        }
        return selectableTextAnnotatedStringElement.m1425copyRWo7tUw(annotatedString, (i14 & 2) != 0 ? selectableTextAnnotatedStringElement.style : textStyle, (i14 & 4) != 0 ? selectableTextAnnotatedStringElement.fontFamilyResolver : resolver, (i14 & 8) != 0 ? selectableTextAnnotatedStringElement.onTextLayout : lVar, (i14 & 16) != 0 ? selectableTextAnnotatedStringElement.overflow : i11, (i14 & 32) != 0 ? selectableTextAnnotatedStringElement.softWrap : z11, (i14 & 64) != 0 ? selectableTextAnnotatedStringElement.maxLines : i12, (i14 & 128) != 0 ? selectableTextAnnotatedStringElement.minLines : i13, (i14 & 256) != 0 ? selectableTextAnnotatedStringElement.placeholders : list, (i14 & 512) != 0 ? selectableTextAnnotatedStringElement.onPlaceholderLayout : lVar2, (i14 & 1024) != 0 ? selectableTextAnnotatedStringElement.selectionController : selectionController, (i14 & 2048) != 0 ? selectableTextAnnotatedStringElement.color : colorProducer, (i14 & 4096) != 0 ? selectableTextAnnotatedStringElement.autoSize : textAutoSize);
    }

    @k
    /* renamed from: copy-RWo7tUw, reason: not valid java name */
    public final SelectableTextAnnotatedStringElement m1425copyRWo7tUw(@k AnnotatedString annotatedString, @k TextStyle textStyle, @k FontFamily.Resolver resolver, @l x00.l<? super TextLayoutResult, g2> lVar, int i11, boolean z11, int i12, int i13, @l List<AnnotatedString.Range<Placeholder>> list, @l x00.l<? super List<Rect>, g2> lVar2, @l SelectionController selectionController, @l ColorProducer colorProducer, @l TextAutoSize textAutoSize) {
        return new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, selectionController, colorProducer, textAutoSize, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return g0.g(this.color, selectableTextAnnotatedStringElement.color) && g0.g(this.text, selectableTextAnnotatedStringElement.text) && g0.g(this.style, selectableTextAnnotatedStringElement.style) && g0.g(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && g0.g(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && g0.g(this.autoSize, selectableTextAnnotatedStringElement.autoSize) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && TextOverflow.m5019equalsimpl0(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && g0.g(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        x00.l<TextLayoutResult, g2> lVar = this.onTextLayout;
        int hashCode2 = (((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + TextOverflow.m5020hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        x00.l<List<Rect>, g2> lVar2 = this.onPlaceholderLayout;
        int hashCode4 = (hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int hashCode5 = (hashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        TextAutoSize textAutoSize = this.autoSize;
        int hashCode6 = (hashCode5 + (textAutoSize != null ? textAutoSize.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        return hashCode6 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @k
    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) TextOverflow.m5021toStringimpl(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ", autoSize=" + this.autoSize + ')';
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, int i14, v vVar) {
        this(annotatedString, textStyle, resolver, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? Integer.MAX_VALUE : i12, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : lVar2, (i14 & 1024) != 0 ? null : selectionController, (i14 & 2048) != 0 ? null : colorProducer, (i14 & 4096) != 0 ? null : textAutoSize, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public SelectableTextAnnotatedStringNode create() {
        return new SelectableTextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, null, 8192, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.m1426update7NebLg4(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l<? super TextLayoutResult, g2> lVar, int i11, boolean z11, int i12, int i13, List<AnnotatedString.Range<Placeholder>> list, x00.l<? super List<Rect>, g2> lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = lVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = selectionController;
        this.color = colorProducer;
        this.autoSize = textAutoSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
    }
}
