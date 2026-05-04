package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class TextAnnotatorScope {

    @k
    private final AnnotatedString initialText;

    @k
    private AnnotatedString styledText;

    public TextAnnotatorScope(@k AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.styledText = annotatedString;
    }

    @k
    public final AnnotatedString getStyledText() {
        return this.styledText;
    }

    public final void replaceStyle(@k final AnnotatedString.Range<LinkAnnotation> range, @l final SpanStyle spanStyle) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.styledText = this.initialText.mapAnnotations(new x00.l<AnnotatedString.Range<? extends AnnotatedString.Annotation>, AnnotatedString.Range<? extends AnnotatedString.Annotation>>() { // from class: androidx.compose.foundation.text.TextAnnotatorScope$replaceStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final AnnotatedString.Range<? extends AnnotatedString.Annotation> invoke(AnnotatedString.Range<? extends AnnotatedString.Annotation> range2) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range3;
                if (Ref.BooleanRef.this.element && (range2.getItem() instanceof SpanStyle) && range2.getStart() == range.getStart() && range2.getEnd() == range.getEnd()) {
                    SpanStyle spanStyle2 = spanStyle;
                    if (spanStyle2 == null) {
                        spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (v) null);
                    }
                    range3 = new AnnotatedString.Range<>(spanStyle2, range2.getStart(), range2.getEnd());
                } else {
                    range3 = range2;
                }
                Ref.BooleanRef.this.element = g0.g(range, range2);
                return range3;
            }
        });
    }

    public final void setStyledText(@k AnnotatedString annotatedString) {
        this.styledText = annotatedString;
    }
}
