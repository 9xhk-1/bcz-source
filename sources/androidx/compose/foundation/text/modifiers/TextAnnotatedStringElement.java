package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
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
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
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
    private final x00.l<TextAnnotatedStringNode.TextSubstitutionValue, g2> onShowTranslation;

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

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l lVar3, v vVar) {
        this(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, selectionController, colorProducer, textAutoSize, lVar3);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return g0.g(this.color, textAnnotatedStringElement.color) && g0.g(this.text, textAnnotatedStringElement.text) && g0.g(this.style, textAnnotatedStringElement.style) && g0.g(this.placeholders, textAnnotatedStringElement.placeholders) && g0.g(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && TextOverflow.m5019equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && g0.g(this.selectionController, textAnnotatedStringElement.selectionController);
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
        ColorProducer colorProducer = this.color;
        int hashCode6 = (hashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        x00.l<TextAnnotatedStringNode.TextSubstitutionValue, g2> lVar3 = this.onShowTranslation;
        return hashCode6 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l lVar3, int i14, v vVar) {
        this(annotatedString, textStyle, resolver, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? Integer.MAX_VALUE : i12, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : lVar2, (i14 & 1024) != 0 ? null : selectionController, (i14 & 2048) != 0 ? null : colorProducer, (i14 & 4096) != 0 ? null : textAutoSize, (i14 & 8192) != 0 ? null : lVar3, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, this.onShowTranslation, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(this.color, this.style), textAnnotatedStringNode.updateText$foundation_release(this.text), textAnnotatedStringNode.m1428updateLayoutRelatedArgsy0kMQk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.autoSize), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l<? super TextLayoutResult, g2> lVar, int i11, boolean z11, int i12, int i13, List<AnnotatedString.Range<Placeholder>> list, x00.l<? super List<Rect>, g2> lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l<? super TextAnnotatedStringNode.TextSubstitutionValue, g2> lVar3) {
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
        this.onShowTranslation = lVar3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
    }
}
