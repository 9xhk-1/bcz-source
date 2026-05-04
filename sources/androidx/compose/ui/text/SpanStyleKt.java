package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,901:1\n247#2:902\n247#2:903\n247#2:904\n242#2,6:907\n242#2,6:914\n247#2:921\n247#2:922\n646#3:905\n635#3:906\n635#3:913\n635#3:920\n646#3:923\n635#3:924\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n713#1:902\n786#1:903\n793#1:904\n837#1:907,6\n843#1:914,6\n874#1:921\n880#1:922\n801#1:905\n801#1:906\n838#1:913\n854#1:920\n888#1:923\n888#1:924\n*E\n"})
/* loaded from: classes2.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;

    @k
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m2544getTransparent0d7_KjU();
        long m2535getBlack0d7_KjU = companion.m2535getBlack0d7_KjU();
        DefaultColor = m2535getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m4998from8_81llA(m2535getBlack0d7_KjU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x010f, code lost:
    
        if (androidx.compose.ui.graphics.Color.m2510equalsimpl0(r7, r23.m4498getBackground0d7_KjU()) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m5306equalsimpl0(r35, r23.m4504getLetterSpacingXSAIIZE()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m5306equalsimpl0(r11, r23.m4501getFontSizeXSAIIZE()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00eb, code lost:
    
        if (kotlin.jvm.internal.g0.g(r14, r23.getTextGeometricTransform()) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fc, code lost:
    
        if (kotlin.jvm.internal.g0.g(r39, r23.getLocaleList()) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    @m80.k
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle m4505fastMergedSHsh3o(@m80.k androidx.compose.ui.text.SpanStyle r23, long r24, @m80.l androidx.compose.ui.graphics.Brush r26, float r27, long r28, @m80.l androidx.compose.ui.text.font.FontWeight r30, @m80.l androidx.compose.ui.text.font.FontStyle r31, @m80.l androidx.compose.ui.text.font.FontSynthesis r32, @m80.l androidx.compose.ui.text.font.FontFamily r33, @m80.l java.lang.String r34, long r35, @m80.l androidx.compose.ui.text.style.BaselineShift r37, @m80.l androidx.compose.ui.text.style.TextGeometricTransform r38, @m80.l androidx.compose.ui.text.intl.LocaleList r39, long r40, @m80.l androidx.compose.ui.text.style.TextDecoration r42, @m80.l androidx.compose.ui.graphics.Shadow r43, @m80.l androidx.compose.ui.text.PlatformSpanStyle r44, @m80.l androidx.compose.ui.graphics.drawscope.DrawStyle r45) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m4505fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    @k
    public static final SpanStyle lerp(@k SpanStyle spanStyle, @k SpanStyle spanStyle2, float f11) {
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f11);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f11);
        long m4506lerpTextUnitInheritableC3pnCVY = m4506lerpTextUnitInheritableC3pnCVY(spanStyle.m4501getFontSizeXSAIIZE(), spanStyle2.m4501getFontSizeXSAIIZE(), f11);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f11);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m4502getFontStyle4Lr2A7w(), spanStyle2.m4502getFontStyle4Lr2A7w(), f11);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m4503getFontSynthesisZQGJjVo(), spanStyle2.m4503getFontSynthesisZQGJjVo(), f11);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f11);
        long m4506lerpTextUnitInheritableC3pnCVY2 = m4506lerpTextUnitInheritableC3pnCVY(spanStyle.m4504getLetterSpacingXSAIIZE(), spanStyle2.m4504getLetterSpacingXSAIIZE(), f11);
        BaselineShift m4499getBaselineShift5SSeXJ0 = spanStyle.m4499getBaselineShift5SSeXJ0();
        float m4855unboximpl = m4499getBaselineShift5SSeXJ0 != null ? m4499getBaselineShift5SSeXJ0.m4855unboximpl() : BaselineShift.m4850constructorimpl(0.0f);
        BaselineShift m4499getBaselineShift5SSeXJ02 = spanStyle2.m4499getBaselineShift5SSeXJ0();
        float m4862lerpjWV1Mfo = BaselineShiftKt.m4862lerpjWV1Mfo(m4855unboximpl, m4499getBaselineShift5SSeXJ02 != null ? m4499getBaselineShift5SSeXJ02.m4855unboximpl() : BaselineShift.m4850constructorimpl(0.0f), f11);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f11);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f11);
        long m2560lerpjxsXWHM = ColorKt.m2560lerpjxsXWHM(spanStyle.m4498getBackground0d7_KjU(), spanStyle2.m4498getBackground0d7_KjU(), f11);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f11);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m4506lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m4506lerpTextUnitInheritableC3pnCVY2, BaselineShift.m4849boximpl(m4862lerpjWV1Mfo), lerp3, localeList, m2560lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f11), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f11), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f11), (v) null);
    }

    public static final <T> T lerpDiscrete(T t11, T t12, float f11) {
        return ((double) f11) < 0.5d ? t11 : t12;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f11) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f11);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m4506lerpTextUnitInheritableC3pnCVY(long j11, long j12, float f11) {
        return (TextUnit.m5307getRawTypeimpl(j11) == 0 || TextUnit.m5307getRawTypeimpl(j12) == 0) ? ((TextUnit) lerpDiscrete(TextUnit.m5299boximpl(j11), TextUnit.m5299boximpl(j12), f11)).m5318unboximpl() : TextUnitKt.m5329lerpC3pnCVY(j11, j12, f11);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        return spanStyle.getPlatformStyle() == null ? platformSpanStyle : platformSpanStyle == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    @k
    public static final SpanStyle resolveSpanStyleDefaults(@k SpanStyle spanStyle) {
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(new x00.a<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt$resolveSpanStyleDefaults$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final TextForegroundStyle invoke() {
                TextForegroundStyle textForegroundStyle;
                textForegroundStyle = SpanStyleKt.DefaultColorForegroundStyle;
                return textForegroundStyle;
            }
        });
        long m4501getFontSizeXSAIIZE = TextUnit.m5307getRawTypeimpl(spanStyle.m4501getFontSizeXSAIIZE()) == 0 ? DefaultFontSize : spanStyle.m4501getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = spanStyle.m4502getFontStyle4Lr2A7w();
        FontStyle m4667boximpl = FontStyle.m4667boximpl(m4502getFontStyle4Lr2A7w != null ? m4502getFontStyle4Lr2A7w.m4673unboximpl() : FontStyle.Companion.m4677getNormal_LCdwA());
        FontSynthesis m4503getFontSynthesisZQGJjVo = spanStyle.m4503getFontSynthesisZQGJjVo();
        FontSynthesis m4678boximpl = FontSynthesis.m4678boximpl(m4503getFontSynthesisZQGJjVo != null ? m4503getFontSynthesisZQGJjVo.m4686unboximpl() : FontSynthesis.Companion.m4687getAllGVVA2EU());
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long m4504getLetterSpacingXSAIIZE = TextUnit.m5307getRawTypeimpl(spanStyle.m4504getLetterSpacingXSAIIZE()) == 0 ? DefaultLetterSpacing : spanStyle.m4504getLetterSpacingXSAIIZE();
        BaselineShift m4499getBaselineShift5SSeXJ0 = spanStyle.m4499getBaselineShift5SSeXJ0();
        BaselineShift m4849boximpl = BaselineShift.m4849boximpl(m4499getBaselineShift5SSeXJ0 != null ? m4499getBaselineShift5SSeXJ0.m4855unboximpl() : BaselineShift.Companion.m4859getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m4498getBackground0d7_KjU = spanStyle.m4498getBackground0d7_KjU();
        if (m4498getBackground0d7_KjU == 16) {
            m4498getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j11 = m4498getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, m4501getFontSizeXSAIIZE, fontWeight2, m4667boximpl, m4678boximpl, fontFamily2, str, m4504getLetterSpacingXSAIIZE, m4849boximpl, textGeometricTransform2, localeList2, j11, textDecoration2, shadow2, platformStyle, drawStyle, (v) null);
    }
}
