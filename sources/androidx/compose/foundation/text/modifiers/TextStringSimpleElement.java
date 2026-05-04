package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public static final int $stable = 0;

    @l
    private final ColorProducer color;

    @k
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;

    @k
    private final TextStyle style;

    @k
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, ColorProducer colorProducer, v vVar) {
        this(str, textStyle, resolver, i11, z11, i12, i13, colorProducer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return g0.g(this.color, textStringSimpleElement.color) && g0.g(this.text, textStringSimpleElement.text) && g0.g(this.style, textStringSimpleElement.style) && g0.g(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && TextOverflow.m5019equalsimpl0(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + TextOverflow.m5020hashCodeimpl(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        ColorProducer colorProducer = this.color;
        return hashCode + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, ColorProducer colorProducer, int i14, v vVar) {
        this(str, textStyle, resolver, (i14 & 8) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 16) != 0 ? true : z11, (i14 & 32) != 0 ? Integer.MAX_VALUE : i12, (i14 & 64) != 0 ? 1 : i13, (i14 & 128) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.doInvalidations(textStringSimpleNode.updateDraw(this.color, this.style), textStringSimpleNode.updateText(this.text), textStringSimpleNode.m1429updateLayoutRelatedArgsHuAbxIM(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.color = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
    }
}
