package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n34#2,6:199\n34#2,6:205\n34#2,6:211\n34#2,6:217\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n59#1:199,6\n66#1:205,6\n76#1:211,6\n85#1:217,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i11, int i12, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m4838setColorRPmYEkk(spannableString, spanStyle.m4500getColor0d7_KjU(), i11, i12);
        SpannableExtensions_androidKt.m4839setFontSizeKmRG4DE(spannableString, spanStyle.m4501getFontSizeXSAIIZE(), density, i11, i12);
        if (spanStyle.getFontWeight() != null || spanStyle.m4502getFontStyle4Lr2A7w() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m4502getFontStyle4Lr2A7w = spanStyle.m4502getFontStyle4Lr2A7w();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m4622getAndroidTypefaceStyleFO1MlWM(fontWeight, m4502getFontStyle4Lr2A7w != null ? m4502getFontStyle4Lr2A7w.m4673unboximpl() : FontStyle.Companion.m4677getNormal_LCdwA())), i11, i12, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i11, i12, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m4503getFontSynthesisZQGJjVo = spanStyle.m4503getFontSynthesisZQGJjVo();
                Object value = FontFamily.Resolver.m4642resolveDPcqOEQ$default(resolver, fontFamily, null, 0, m4503getFontSynthesisZQGJjVo != null ? m4503getFontSynthesisZQGJjVo.m4686unboximpl() : FontSynthesis.Companion.m4687getAllGVVA2EU(), 6, null).getValue();
                g0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i11, i12, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i11, i12, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i11, i12, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i11, i12, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i11, i12);
        SpannableExtensions_androidKt.m4836setBackgroundRPmYEkk(spannableString, spanStyle.m4498getBackground0d7_KjU(), i11, i12);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @k
    public static final SpannableString toAccessibilitySpannableString(@k AnnotatedString annotatedString, @k Density density, @k FontFamily.Resolver resolver, @k URLSpanCache uRLSpanCache) {
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i11);
                setSpanStyle(spannableString, SpanStyle.m4491copyGSF8kmg$default(range.component1(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.component2(), range.component3(), density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i12);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i13 = 0; i13 < size3; i13++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i13);
            spannableString.setSpan(uRLSpanCache.toURLSpan(range3.component1()), range3.component2(), range3.component3(), 33);
        }
        List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
        int size4 = linkAnnotations.size();
        for (int i14 = 0; i14 < size4; i14++) {
            AnnotatedString.Range<LinkAnnotation> range4 = linkAnnotations.get(i14);
            if (range4.getStart() != range4.getEnd()) {
                LinkAnnotation item = range4.getItem();
                if ((item instanceof LinkAnnotation.Url) && item.getLinkInteractionListener() == null) {
                    spannableString.setSpan(uRLSpanCache.toURLSpan(toUrlLink(range4)), range4.getStart(), range4.getEnd(), 33);
                } else {
                    spannableString.setSpan(uRLSpanCache.toClickableSpan(range4), range4.getStart(), range4.getEnd(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final AnnotatedString.Range<LinkAnnotation.Url> toUrlLink(AnnotatedString.Range<LinkAnnotation> range) {
        LinkAnnotation item = range.getItem();
        g0.n(item, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new AnnotatedString.Range<>((LinkAnnotation.Url) item, range.getStart(), range.getEnd());
    }
}
