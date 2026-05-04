package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SpannableStringBuilderKt {
    @m80.k
    public static final SpannableStringBuilder backgroundColor(@m80.k SpannableStringBuilder spannableStringBuilder, @ColorInt int i11, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i11);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder bold(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannedString buildSpannedString(@m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @m80.k
    public static final SpannableStringBuilder color(@m80.k SpannableStringBuilder spannableStringBuilder, @ColorInt int i11, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i11);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder inSpans(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k Object[] objArr, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder italic(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder scale(@m80.k SpannableStringBuilder spannableStringBuilder, float f11, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f11);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder strikeThrough(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder subscript(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder superscript(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder underline(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @m80.k
    public static final SpannableStringBuilder inSpans(@m80.k SpannableStringBuilder spannableStringBuilder, @m80.k Object obj, @m80.k x00.l<? super SpannableStringBuilder, g2> lVar) {
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
