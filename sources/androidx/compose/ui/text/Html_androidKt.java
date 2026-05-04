package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.text.HtmlCompat;
import androidx.media3.extractor.WavUtil;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,378:1\n1#2:379\n13309#3,2:380\n168#4,2:382\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/Html_androidKt\n*L\n115#1:380,2\n145#1:382,2\n*E\n"})
/* loaded from: classes2.dex */
public final class Html_androidKt {

    @k
    private static final String AnnotationTag = "annotation";

    @k
    private static final String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";

    @k
    private static final String Li = "li";

    @k
    private static final Html_androidKt$TagHandler$1 TagHandler = new Html.TagHandler() { // from class: androidx.compose.ui.text.Html_androidKt$TagHandler$1
        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z11, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z11 || !g0.g(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
        }
    };

    @k
    private static final String Ul = "ul";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void addSpan(AnnotatedString.Builder builder, Object obj, int i11, int i12, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            builder.addStyle(toParagraphStyle((AlignmentSpan) obj), i11, i12);
            return;
        }
        if (obj instanceof AnnotationSpan) {
            AnnotationSpan annotationSpan = (AnnotationSpan) obj;
            builder.addStringAnnotation(annotationSpan.getKey(), annotationSpan.getValue(), i11, i12);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (v) null), i11, i12);
            return;
        }
        if (obj instanceof BulletSpanWithLevel) {
            long defaultBulletIndentation = BulletKt.getDefaultBulletIndentation();
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
            int indentationLevel = bulletSpanWithLevel.getIndentationLevel();
            TextUnitKt.m5322checkArithmeticR2X_6o(defaultBulletIndentation);
            builder.m4390addBulletr9BaKPg$ui_text_release(bulletSpanWithLevel.getBullet(), TextUnitKt.pack(TextUnit.m5307getRawTypeimpl(defaultBulletIndentation), TextUnit.m5309getValueimpl(defaultBulletIndentation) * indentationLevel), i11, i12);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (v) null), i11, i12);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            builder.addStyle(new SpanStyle(0L, TextUnitKt.getEm(((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65533, (v) null), i11, i12);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (v) null), i11, i12);
            return;
        }
        if (obj instanceof StyleSpan) {
            SpanStyle spanStyle = toSpanStyle((StyleSpan) obj);
            if (spanStyle != null) {
                builder.addStyle(spanStyle, i11, i12);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m4849boximpl(BaselineShift.Companion.m4860getSubscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (v) null), i11, i12);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m4849boximpl(BaselineShift.Companion.m4861getSuperscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (v) null), i11, i12);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            builder.addStyle(toSpanStyle((TypefaceSpan) obj), i11, i12);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (v) null), i11, i12);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            builder.addLink(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i11, i12);
        }
    }

    private static final void addSpans(AnnotatedString.Builder builder, Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        for (Object obj : spanned.getSpans(0, builder.getLength(), Object.class)) {
            long TextRange = TextRangeKt.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            addSpan(builder, obj, TextRange.m4559getStartimpl(TextRange), TextRange.m4554getEndimpl(TextRange), textLinkStyles, linkInteractionListener);
        }
    }

    @k
    public static final AnnotatedString fromHtml(@k AnnotatedString.Companion companion, @k String str, @l TextLinkStyles textLinkStyles, @l LinkInteractionListener linkInteractionListener) {
        return toAnnotatedString(HtmlCompat.fromHtml("<ContentHandlerReplacementTag />" + str, 63, null, TagHandler), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString fromHtml$default(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            textLinkStyles = null;
        }
        if ((i11 & 4) != 0) {
            linkInteractionListener = null;
        }
        return fromHtml(companion, str, textLinkStyles, linkInteractionListener);
    }

    private static final FontFamily optionalFontFamilyFromName(String str) {
        if (str != null && str.length() != 0) {
            Typeface create = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (g0.g(create, typeface) || g0.g(create, Typeface.create(typeface, 0))) {
                create = null;
            }
            if (create != null) {
                return AndroidTypeface_androidKt.FontFamily(create);
            }
        }
        return null;
    }

    @VisibleForTesting
    @k
    public static final AnnotatedString toAnnotatedString(@k Spanned spanned, @l TextLinkStyles textLinkStyles, @l LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder append = new AnnotatedString.Builder(spanned.length()).append((CharSequence) spanned);
        addSpans(append, spanned, textLinkStyles, linkInteractionListener);
        return append.toAnnotatedString();
    }

    public static /* synthetic */ AnnotatedString toAnnotatedString$default(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textLinkStyles = null;
        }
        if ((i11 & 2) != 0) {
            linkInteractionListener = null;
        }
        return toAnnotatedString(spanned, textLinkStyles, linkInteractionListener);
    }

    private static final ParagraphStyle toParagraphStyle(AlignmentSpan alignmentSpan) {
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        return new ParagraphStyle(i11 != 1 ? i11 != 2 ? i11 != 3 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : TextAlign.Companion.m4978getEnde0LSkKk() : TextAlign.Companion.m4977getCentere0LSkKk() : TextAlign.Companion.m4982getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_POSITION_TYPE, (v) null);
    }

    private static final SpanStyle toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (v) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m4667boximpl(FontStyle.Companion.m4676getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (v) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m4667boximpl(FontStyle.Companion.m4676getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (v) null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan typefaceSpan) {
        FontFamily serif;
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.Companion;
        if (g0.g(family, companion.getCursive().getName())) {
            serif = companion.getCursive();
        } else if (g0.g(family, companion.getMonospace().getName())) {
            serif = companion.getMonospace();
        } else if (g0.g(family, companion.getSansSerif().getName())) {
            serif = companion.getSansSerif();
        } else {
            serif = g0.g(family, companion.getSerif().getName()) ? companion.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, serif, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (v) null);
    }
}
