package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidParagraphHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphHelper.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,145:1\n247#2:146\n*S KotlinDebug\n*F\n+ 1 AndroidParagraphHelper.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt\n*L\n79#1:146\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidParagraphHelper_androidKt {

    @k
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.EmojiCompat] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.text.Spannable] */
    @k
    public static final CharSequence createCharSequence(@k String str, float f11, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k List<AnnotatedString.Range<Placeholder>> list2, @k Density density, @k r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar, boolean z11) {
        String str2;
        CharSequence charSequence;
        float f12;
        Density density2;
        PlatformParagraphStyle paragraphStyle;
        if (z11 && EmojiCompat.isConfigured()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch m4396boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m4396boximpl(paragraphStyle.m4477getEmojiSupportMatch_3YsG6Y());
            str2 = str;
            charSequence = EmojiCompat.get().process(str2, 0, str.length(), Integer.MAX_VALUE, m4396boximpl == null ? 0 : EmojiSupportMatch.m4399equalsimpl0(m4396boximpl.m4402unboximpl(), EmojiSupportMatch.Companion.m4403getAll_3YsG6Y()));
            g0.m(charSequence);
        } else {
            str2 = str;
            charSequence = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && g0.g(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnit.m5307getRawTypeimpl(textStyle.m4598getLineHeightXSAIIZE()) == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (g0.g(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str2.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m4841setLineHeightr9BaKPg(spannableString, textStyle.m4598getLineHeightXSAIIZE(), f11, density);
            f12 = f11;
            density2 = density;
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            f12 = f11;
            density2 = density;
            SpannableExtensions_androidKt.m4840setLineHeightKmRG4DE(spannableString, textStyle.m4598getLineHeightXSAIIZE(), f12, density2, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f12, density2);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density2, rVar);
        SpannableExtensions_androidKt.setBulletSpans(spannableString, list, f12, density2, textStyle.getTextIndent());
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density2);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(@k TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
