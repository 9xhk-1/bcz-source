package androidx.compose.ui.text;

import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    @k
    public static final PlatformTextStyle createPlatformTextStyle(@l PlatformSpanStyle platformSpanStyle, @l PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @k
    public static final PlatformSpanStyle lerp(@k PlatformSpanStyle platformSpanStyle, @k PlatformSpanStyle platformSpanStyle2, float f11) {
        return platformSpanStyle;
    }

    @k
    public static final PlatformParagraphStyle lerp(@k PlatformParagraphStyle platformParagraphStyle, @k PlatformParagraphStyle platformParagraphStyle2, float f11) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m4396boximpl(platformParagraphStyle.m4477getEmojiSupportMatch_3YsG6Y()), EmojiSupportMatch.m4396boximpl(platformParagraphStyle2.m4477getEmojiSupportMatch_3YsG6Y()), f11)).m4402unboximpl(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f11)).booleanValue(), (v) null);
    }
}
