package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.ExtractedText;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.media3.extractor.WavUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection_androidKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,660:1\n13309#2,2:661\n1#3:663\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection_androidKt\n*L\n570#1:661,2\n*E\n"})
/* loaded from: classes.dex */
public final class StatelessInputConnection_androidKt {

    @m80.k
    private static final String DEBUG_CLASS = "StatelessInputConnection";

    @m80.k
    private static final String EXTRA_INPUT_CONTENT_INFO = "EXTRA_INPUT_CONTENT_INFO";
    public static final boolean SIC_DEBUG = false;

    @m80.k
    private static final String STATELESS_TAG = "StatelessIC";

    private static final FontFamily optionalFontFamilyFromName(String str) {
        if (str != null && str.length() != 0) {
            Typeface create = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (kotlin.jvm.internal.g0.g(create, typeface) || kotlin.jvm.internal.g0.g(create, Typeface.create(typeface, 0))) {
                create = null;
            }
            if (create != null) {
                return AndroidTypeface_androidKt.FontFamily(create);
            }
        }
        return null;
    }

    private static final AnnotatedString.Annotation toAnnotation(Object obj) {
        if (obj instanceof BackgroundColorSpan) {
            return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (kotlin.jvm.internal.v) null);
        }
        if (obj instanceof ForegroundColorSpan) {
            return new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (kotlin.jvm.internal.v) null);
        }
        if (obj instanceof StrikethroughSpan) {
            return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (kotlin.jvm.internal.v) null);
        }
        if (obj instanceof StyleSpan) {
            return toSpanStyle((StyleSpan) obj);
        }
        if (obj instanceof TypefaceSpan) {
            return toSpanStyle((TypefaceSpan) obj);
        }
        if (obj instanceof UnderlineSpan) {
            return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (kotlin.jvm.internal.v) null);
        }
        return null;
    }

    @m80.l
    @VisibleForTesting
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> toAnnotationList(@m80.k Spanned spanned) {
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            AnnotatedString.Annotation annotation = toAnnotation(obj);
            if (annotation != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new AnnotatedString.Range<>(annotation, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m4557getMinimpl(textFieldCharSequence.m1189getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m4556getMaximpl(textFieldCharSequence.m1189getSelectiond9O1mEE());
        extractedText.flags = !u30.k0.m3(textFieldCharSequence, '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }

    private static final SpanStyle toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (kotlin.jvm.internal.v) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m4667boximpl(FontStyle.Companion.m4676getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (kotlin.jvm.internal.v) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m4667boximpl(FontStyle.Companion.m4676getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (kotlin.jvm.internal.v) null);
    }

    @m80.k
    public static final TransferableContent toTransferableContent(@m80.k InputContentInfoCompat inputContentInfoCompat, @m80.l Bundle bundle) {
        ClipEntry clipEntry = AndroidClipboardManager_androidKt.toClipEntry(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())));
        int m338getKeyboardkB6V9T0 = TransferableContent.Source.Companion.m338getKeyboardkB6V9T0();
        ClipMetadata clipMetadata = AndroidClipboardManager_androidKt.toClipMetadata(inputContentInfoCompat.getDescription());
        Uri linkUri = inputContentInfoCompat.getLinkUri();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new TransferableContent(clipEntry, clipMetadata, m338getKeyboardkB6V9T0, new PlatformTransferableContent(linkUri, bundle), null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan typefaceSpan) {
        FontFamily serif;
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.Companion;
        if (kotlin.jvm.internal.g0.g(family, companion.getCursive().getName())) {
            serif = companion.getCursive();
        } else if (kotlin.jvm.internal.g0.g(family, companion.getMonospace().getName())) {
            serif = companion.getMonospace();
        } else if (kotlin.jvm.internal.g0.g(family, companion.getSansSerif().getName())) {
            serif = companion.getSansSerif();
        } else {
            serif = kotlin.jvm.internal.g0.g(family, companion.getSerif().getName()) ? companion.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, serif, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (kotlin.jvm.internal.v) null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }
}
