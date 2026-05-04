package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextStyle {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (v) null);

    @k
    private final ParagraphStyle paragraphStyle;

    @l
    private final PlatformTextStyle platformStyle;

    @k
    private final SpanStyle spanStyle;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, drawStyle, i11, i12, j15, textIndent, platformTextStyle, lineHeightStyle, i13, i14, textMotion);
    }

    /* renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4567copyCXVQc50$default(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i11, Object obj) {
        Hyphens hyphens2;
        LineBreak lineBreak2;
        long m4500getColor0d7_KjU = (i11 & 1) != 0 ? textStyle.spanStyle.m4500getColor0d7_KjU() : j11;
        long m4501getFontSizeXSAIIZE = (i11 & 2) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j12;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = (i11 & 8) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4503getFontSynthesisZQGJjVo = (i11 & 16) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i11 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4504getLetterSpacingXSAIIZE = (i11 & 128) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j13;
        BaselineShift m4499getBaselineShift5SSeXJ0 = (i11 & 256) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j16 = m4500getColor0d7_KjU;
        long m4498getBackground0d7_KjU = (i11 & 2048) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j14;
        TextDecoration textDecoration2 = (i11 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i11 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign m4970boximpl = (i11 & 16384) != 0 ? TextAlign.m4970boximpl(textStyle.paragraphStyle.m4454getTextAligne0LSkKk()) : textAlign;
        TextDirection m4984boximpl = (i11 & 32768) != 0 ? TextDirection.m4984boximpl(textStyle.paragraphStyle.m4456getTextDirections_7Xco()) : textDirection;
        long m4452getLineHeightXSAIIZE = (i11 & 65536) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j15;
        TextIndent textIndent2 = (i11 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i11 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i11 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m4878boximpl = (i11 & 1048576) != 0 ? LineBreak.m4878boximpl(textStyle.paragraphStyle.m4451getLineBreakrAG3T2k()) : lineBreak;
        if ((i11 & 2097152) != 0) {
            lineBreak2 = m4878boximpl;
            hyphens2 = Hyphens.m4868boximpl(textStyle.paragraphStyle.m4449getHyphensvmbZdU8());
        } else {
            hyphens2 = hyphens;
            lineBreak2 = m4878boximpl;
        }
        return textStyle.m4580copyCXVQc50(j16, m4501getFontSizeXSAIIZE, fontWeight2, m4502getFontStyle4Lr2A7w, m4503getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m4504getLetterSpacingXSAIIZE, m4499getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m4498getBackground0d7_KjU, textDecoration3, shadow2, m4970boximpl, m4984boximpl, m4452getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4568copyHL5avdY$default(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, int i11, Object obj) {
        long m4500getColor0d7_KjU = (i11 & 1) != 0 ? textStyle.spanStyle.m4500getColor0d7_KjU() : j11;
        return textStyle.m4581copyHL5avdY(m4500getColor0d7_KjU, (i11 & 2) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j12, (i11 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i11 & 8) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle, (i11 & 16) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis, (i11 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i11 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i11 & 128) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j13, (i11 & 256) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift, (i11 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i11 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i11 & 2048) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j14, (i11 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration, (i11 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i11 & 16384) != 0 ? TextAlign.m4970boximpl(textStyle.paragraphStyle.m4454getTextAligne0LSkKk()) : textAlign, (i11 & 32768) != 0 ? TextDirection.m4984boximpl(textStyle.paragraphStyle.m4456getTextDirections_7Xco()) : textDirection, (i11 & 65536) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j15, (i11 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4569copyNOaFTUo$default(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i11, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long m4500getColor0d7_KjU = (i11 & 1) != 0 ? textStyle.spanStyle.m4500getColor0d7_KjU() : j11;
        long m4501getFontSizeXSAIIZE = (i11 & 2) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j12;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = (i11 & 8) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4503getFontSynthesisZQGJjVo = (i11 & 16) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i11 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4504getLetterSpacingXSAIIZE = (i11 & 128) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j13;
        BaselineShift m4499getBaselineShift5SSeXJ0 = (i11 & 256) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j16 = m4500getColor0d7_KjU;
        long m4498getBackground0d7_KjU = (i11 & 2048) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j14;
        TextDecoration textDecoration2 = (i11 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i11 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign m4970boximpl = (i11 & 16384) != 0 ? TextAlign.m4970boximpl(textStyle.paragraphStyle.m4454getTextAligne0LSkKk()) : textAlign;
        TextDirection m4984boximpl = (i11 & 32768) != 0 ? TextDirection.m4984boximpl(textStyle.paragraphStyle.m4456getTextDirections_7Xco()) : textDirection;
        long m4452getLineHeightXSAIIZE = (i11 & 65536) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j15;
        TextIndent textIndent2 = (i11 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i11 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i11 & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m4582copyNOaFTUo(j16, m4501getFontSizeXSAIIZE, fontWeight2, m4502getFontStyle4Lr2A7w, m4503getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m4504getLetterSpacingXSAIIZE, m4499getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m4498getBackground0d7_KjU, textDecoration3, shadow2, m4970boximpl, m4984boximpl, m4452getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4570copyNs73l9s$default(TextStyle textStyle, Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, int i15, Object obj) {
        TextMotion textMotion2;
        int i16;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i17;
        int i18;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j15;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j16;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j17;
        long j18;
        Brush brush2;
        float f12;
        int i19;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i15 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f11;
        long m4501getFontSizeXSAIIZE = (i15 & 4) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j11;
        FontWeight fontWeight3 = (i15 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = (i15 & 16) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4503getFontSynthesisZQGJjVo = (i15 & 32) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i15 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i15 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4504getLetterSpacingXSAIIZE = (i15 & 256) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j12;
        BaselineShift m4499getBaselineShift5SSeXJ0 = (i15 & 512) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i15 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i15 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m4498getBackground0d7_KjU = (i15 & 4096) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j13;
        float f13 = alpha;
        TextDecoration textDecoration3 = (i15 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i15 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i15 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int m4454getTextAligne0LSkKk = (i15 & 65536) != 0 ? textStyle.paragraphStyle.m4454getTextAligne0LSkKk() : i11;
        int m4456getTextDirections_7Xco = (i15 & 131072) != 0 ? textStyle.paragraphStyle.m4456getTextDirections_7Xco() : i12;
        long m4452getLineHeightXSAIIZE = (i15 & 262144) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j14;
        TextIndent textIndent3 = (i15 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i15 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i15 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int m4451getLineBreakrAG3T2k = (i15 & 4194304) != 0 ? textStyle.paragraphStyle.m4451getLineBreakrAG3T2k() : i13;
        int m4449getHyphensvmbZdU8 = (i15 & 8388608) != 0 ? textStyle.paragraphStyle.m4449getHyphensvmbZdU8() : i14;
        if ((i15 & 16777216) != 0) {
            i16 = m4449getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i17 = m4454getTextAligne0LSkKk;
            i18 = m4456getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i19 = m4451getLineBreakrAG3T2k;
            shadow2 = shadow3;
            j15 = m4501getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m4502getFontStyle4Lr2A7w;
            fontSynthesis2 = m4503getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j16 = m4504getLetterSpacingXSAIIZE;
            baselineShift2 = m4499getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j17 = m4498getBackground0d7_KjU;
            j18 = m4452getLineHeightXSAIIZE;
            brush2 = brush;
            f12 = f13;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i16 = m4449getHyphensvmbZdU8;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i17 = m4454getTextAligne0LSkKk;
            i18 = m4456getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j15 = m4501getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m4502getFontStyle4Lr2A7w;
            fontSynthesis2 = m4503getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j16 = m4504getLetterSpacingXSAIIZE;
            baselineShift2 = m4499getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j17 = m4498getBackground0d7_KjU;
            j18 = m4452getLineHeightXSAIIZE;
            brush2 = brush;
            f12 = f13;
            i19 = m4451getLineBreakrAG3T2k;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m4583copyNs73l9s(brush2, f12, j15, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j16, baselineShift2, textGeometricTransform2, localeList2, j17, textDecoration2, shadow2, drawStyle2, i17, i18, j18, textIndent2, platformTextStyle2, lineHeightStyle2, i19, i16, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4571copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i11, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j15;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j16;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j17;
        long j18;
        Brush brush2;
        float f12;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i11 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f11;
        long m4501getFontSizeXSAIIZE = (i11 & 4) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j11;
        FontWeight fontWeight3 = (i11 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = (i11 & 16) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4503getFontSynthesisZQGJjVo = (i11 & 32) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i11 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4504getLetterSpacingXSAIIZE = (i11 & 256) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j12;
        BaselineShift m4499getBaselineShift5SSeXJ0 = (i11 & 512) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i11 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i11 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m4498getBackground0d7_KjU = (i11 & 4096) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j13;
        float f13 = alpha;
        TextDecoration textDecoration3 = (i11 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i11 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i11 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign m4970boximpl = (i11 & 65536) != 0 ? TextAlign.m4970boximpl(textStyle.paragraphStyle.m4454getTextAligne0LSkKk()) : textAlign;
        TextDirection m4984boximpl = (i11 & 131072) != 0 ? TextDirection.m4984boximpl(textStyle.paragraphStyle.m4456getTextDirections_7Xco()) : textDirection;
        long m4452getLineHeightXSAIIZE = (i11 & 262144) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j14;
        TextIndent textIndent3 = (i11 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i11 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i11 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m4878boximpl = (i11 & 4194304) != 0 ? LineBreak.m4878boximpl(textStyle.paragraphStyle.m4451getLineBreakrAG3T2k()) : lineBreak;
        Hyphens m4868boximpl = (i11 & 8388608) != 0 ? Hyphens.m4868boximpl(textStyle.paragraphStyle.m4449getHyphensvmbZdU8()) : hyphens;
        if ((i11 & 16777216) != 0) {
            hyphens2 = m4868boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = m4970boximpl;
            textDirection2 = m4984boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = m4878boximpl;
            shadow2 = shadow3;
            j15 = m4501getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m4502getFontStyle4Lr2A7w;
            fontSynthesis2 = m4503getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j16 = m4504getLetterSpacingXSAIIZE;
            baselineShift2 = m4499getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j17 = m4498getBackground0d7_KjU;
            j18 = m4452getLineHeightXSAIIZE;
            brush2 = brush;
            f12 = f13;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = m4868boximpl;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = m4970boximpl;
            textDirection2 = m4984boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j15 = m4501getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m4502getFontStyle4Lr2A7w;
            fontSynthesis2 = m4503getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j16 = m4504getLetterSpacingXSAIIZE;
            baselineShift2 = m4499getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j17 = m4498getBackground0d7_KjU;
            j18 = m4452getLineHeightXSAIIZE;
            brush2 = brush;
            f12 = f13;
            lineBreak2 = m4878boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m4584copyaIRg9q4(brush2, f12, j15, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j16, baselineShift2, textGeometricTransform2, localeList2, j17, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j18, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4572copyp1EtxEg$default(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, int i15, Object obj) {
        TextMotion textMotion2;
        int i16;
        long m4500getColor0d7_KjU = (i15 & 1) != 0 ? textStyle.spanStyle.m4500getColor0d7_KjU() : j11;
        long m4501getFontSizeXSAIIZE = (i15 & 2) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j12;
        FontWeight fontWeight2 = (i15 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = (i15 & 8) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4503getFontSynthesisZQGJjVo = (i15 & 16) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i15 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i15 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4504getLetterSpacingXSAIIZE = (i15 & 128) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j13;
        BaselineShift m4499getBaselineShift5SSeXJ0 = (i15 & 256) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i15 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i15 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j16 = m4500getColor0d7_KjU;
        long m4498getBackground0d7_KjU = (i15 & 2048) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j14;
        TextDecoration textDecoration2 = (i15 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i15 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i15 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int m4454getTextAligne0LSkKk = (i15 & 32768) != 0 ? textStyle.paragraphStyle.m4454getTextAligne0LSkKk() : i11;
        int m4456getTextDirections_7Xco = (i15 & 65536) != 0 ? textStyle.paragraphStyle.m4456getTextDirections_7Xco() : i12;
        long m4452getLineHeightXSAIIZE = (i15 & 131072) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j15;
        TextIndent textIndent2 = (i15 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i15 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i15 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int m4451getLineBreakrAG3T2k = (i15 & 2097152) != 0 ? textStyle.paragraphStyle.m4451getLineBreakrAG3T2k() : i13;
        int m4449getHyphensvmbZdU8 = (i15 & 4194304) != 0 ? textStyle.paragraphStyle.m4449getHyphensvmbZdU8() : i14;
        if ((i15 & 8388608) != 0) {
            i16 = m4449getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i16 = m4449getHyphensvmbZdU8;
        }
        return textStyle.m4585copyp1EtxEg(j16, m4501getFontSizeXSAIIZE, fontWeight2, m4502getFontStyle4Lr2A7w, m4503getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m4504getLetterSpacingXSAIIZE, m4499getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m4498getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, m4454getTextAligne0LSkKk, m4456getTextDirections_7Xco, m4452getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, m4451getLineBreakrAG3T2k, i16, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4573copyv2rsoow$default(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i11, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long m4500getColor0d7_KjU = (i11 & 1) != 0 ? textStyle.spanStyle.m4500getColor0d7_KjU() : j11;
        long m4501getFontSizeXSAIIZE = (i11 & 2) != 0 ? textStyle.spanStyle.m4501getFontSizeXSAIIZE() : j12;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4502getFontStyle4Lr2A7w = (i11 & 8) != 0 ? textStyle.spanStyle.m4502getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4503getFontSynthesisZQGJjVo = (i11 & 16) != 0 ? textStyle.spanStyle.m4503getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i11 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4504getLetterSpacingXSAIIZE = (i11 & 128) != 0 ? textStyle.spanStyle.m4504getLetterSpacingXSAIIZE() : j13;
        BaselineShift m4499getBaselineShift5SSeXJ0 = (i11 & 256) != 0 ? textStyle.spanStyle.m4499getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j16 = m4500getColor0d7_KjU;
        long m4498getBackground0d7_KjU = (i11 & 2048) != 0 ? textStyle.spanStyle.m4498getBackground0d7_KjU() : j14;
        TextDecoration textDecoration2 = (i11 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i11 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i11 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign m4970boximpl = (i11 & 32768) != 0 ? TextAlign.m4970boximpl(textStyle.paragraphStyle.m4454getTextAligne0LSkKk()) : textAlign;
        TextDirection m4984boximpl = (i11 & 65536) != 0 ? TextDirection.m4984boximpl(textStyle.paragraphStyle.m4456getTextDirections_7Xco()) : textDirection;
        long m4452getLineHeightXSAIIZE = (i11 & 131072) != 0 ? textStyle.paragraphStyle.m4452getLineHeightXSAIIZE() : j15;
        TextIndent textIndent2 = (i11 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i11 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i11 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m4878boximpl = (i11 & 2097152) != 0 ? LineBreak.m4878boximpl(textStyle.paragraphStyle.m4451getLineBreakrAG3T2k()) : lineBreak;
        Hyphens m4868boximpl = (i11 & 4194304) != 0 ? Hyphens.m4868boximpl(textStyle.paragraphStyle.m4449getHyphensvmbZdU8()) : hyphens;
        if ((i11 & 8388608) != 0) {
            hyphens2 = m4868boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = m4868boximpl;
        }
        return textStyle.m4586copyv2rsoow(j16, m4501getFontSizeXSAIIZE, fontWeight2, m4502getFontStyle4Lr2A7w, m4503getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m4504getLetterSpacingXSAIIZE, m4499getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m4498getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, m4970boximpl, m4984boximpl, m4452getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, m4878boximpl, hyphens2, textMotion2);
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m4580copyCXVQc50(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m2510equalsimpl0(j11, this.spanStyle.m4500getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), getTextMotion(), (v) null), platformTextStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m4581copyHL5avdY(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m2510equalsimpl0(j11, this.spanStyle.m4500getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m4597getLineBreakrAG3T2k(), m4594getHyphensvmbZdU8(), getTextMotion(), (v) null), this.platformStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m4582copyNOaFTUo(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m2510equalsimpl0(j11, this.spanStyle.m4500getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m4597getLineBreakrAG3T2k(), m4594getHyphensvmbZdU8(), getTextMotion(), (v) null), platformTextStyle);
    }

    @k
    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m4583copyNs73l9s(@l Brush brush, float f11, long j11, @l FontWeight fontWeight, @l FontStyle fontStyle, @l FontSynthesis fontSynthesis, @l FontFamily fontFamily, @l String str, long j12, @l BaselineShift baselineShift, @l TextGeometricTransform textGeometricTransform, @l LocaleList localeList, long j13, @l TextDecoration textDecoration, @l Shadow shadow, @l DrawStyle drawStyle, int i11, int i12, long j14, @l TextIndent textIndent, @l PlatformTextStyle platformTextStyle, @l LineHeightStyle lineHeightStyle, int i13, int i14, @l TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(i11, i12, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i13, i14, textMotion, (v) null), platformTextStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m4584copyaIRg9q4(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion, (v) null), platformTextStyle);
    }

    @k
    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m4585copyp1EtxEg(long j11, long j12, @l FontWeight fontWeight, @l FontStyle fontStyle, @l FontSynthesis fontSynthesis, @l FontFamily fontFamily, @l String str, long j13, @l BaselineShift baselineShift, @l TextGeometricTransform textGeometricTransform, @l LocaleList localeList, long j14, @l TextDecoration textDecoration, @l Shadow shadow, @l DrawStyle drawStyle, int i11, int i12, long j15, @l TextIndent textIndent, @l PlatformTextStyle platformTextStyle, @l LineHeightStyle lineHeightStyle, int i13, int i14, @l TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m2510equalsimpl0(j11, this.spanStyle.m4500getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(i11, i12, j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i13, i14, textMotion, (v) null), platformTextStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m4586copyv2rsoow(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m2510equalsimpl0(j11, this.spanStyle.m4500getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion, (v) null), platformTextStyle);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return g0.g(this.spanStyle, textStyle.spanStyle) && g0.g(this.paragraphStyle, textStyle.paragraphStyle) && g0.g(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4587getBackground0d7_KjU() {
        return this.spanStyle.m4498getBackground0d7_KjU();
    }

    @l
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m4588getBaselineShift5SSeXJ0() {
        return this.spanStyle.m4499getBaselineShift5SSeXJ0();
    }

    @l
    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4589getColor0d7_KjU() {
        return this.spanStyle.m4500getColor0d7_KjU();
    }

    @l
    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    @l
    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    @l
    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m4590getFontSizeXSAIIZE() {
        return this.spanStyle.m4501getFontSizeXSAIIZE();
    }

    @l
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m4591getFontStyle4Lr2A7w() {
        return this.spanStyle.m4502getFontStyle4Lr2A7w();
    }

    @l
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m4592getFontSynthesisZQGJjVo() {
        return this.spanStyle.m4503getFontSynthesisZQGJjVo();
    }

    @l
    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    @l
    @j(name = "getHyphens-EaSxIns")
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m4593getHyphensEaSxIns() {
        return Hyphens.m4868boximpl(m4594getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m4594getHyphensvmbZdU8() {
        return this.paragraphStyle.m4449getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m4595getLetterSpacingXSAIIZE() {
        return this.spanStyle.m4504getLetterSpacingXSAIIZE();
    }

    @l
    @j(name = "getLineBreak-LgCVezo")
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m4596getLineBreakLgCVezo() {
        return LineBreak.m4878boximpl(m4597getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m4597getLineBreakrAG3T2k() {
        return this.paragraphStyle.m4451getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m4598getLineHeightXSAIIZE() {
        return this.paragraphStyle.m4452getLineHeightXSAIIZE();
    }

    @l
    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @l
    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    @k
    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    @l
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @l
    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    @k
    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    @l
    @j(name = "getTextAlign-buA522U")
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m4599getTextAlignbuA522U() {
        return TextAlign.m4970boximpl(m4600getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m4600getTextAligne0LSkKk() {
        return this.paragraphStyle.m4454getTextAligne0LSkKk();
    }

    @l
    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    @l
    @j(name = "getTextDirection-mmuk1to")
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m4601getTextDirectionmmuk1to() {
        return TextDirection.m4984boximpl(m4602getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m4602getTextDirections_7Xco() {
        return this.paragraphStyle.m4456getTextDirections_7Xco();
    }

    @l
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @l
    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    @l
    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(@k TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(@k TextStyle textStyle) {
        if (this != textStyle) {
            return g0.g(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int hashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCodeLayoutAffectingAttributes$ui_text_release + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @Stable
    @k
    public final TextStyle merge(@l TextStyle textStyle) {
        return (textStyle == null || g0.g(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    @n(level = DeprecationLevel.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m4603mergeZ1GrekI(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle m4505fastMergedSHsh3o = SpanStyleKt.m4505fastMergedSHsh3o(this.spanStyle, j11, null, Float.NaN, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m4457fastMergej5T8yCg = ParagraphStyleKt.m4457fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == m4505fastMergedSHsh3o && this.paragraphStyle == m4457fastMergej5T8yCg) ? this : new TextStyle(m4505fastMergedSHsh3o, m4457fastMergej5T8yCg);
    }

    @Stable
    @k
    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m4604mergedA7vx0o(long j11, long j12, @l FontWeight fontWeight, @l FontStyle fontStyle, @l FontSynthesis fontSynthesis, @l FontFamily fontFamily, @l String str, long j13, @l BaselineShift baselineShift, @l TextGeometricTransform textGeometricTransform, @l LocaleList localeList, long j14, @l TextDecoration textDecoration, @l Shadow shadow, @l DrawStyle drawStyle, int i11, int i12, long j15, @l TextIndent textIndent, @l LineHeightStyle lineHeightStyle, int i13, int i14, @l PlatformTextStyle platformTextStyle, @l TextMotion textMotion) {
        SpanStyle m4505fastMergedSHsh3o = SpanStyleKt.m4505fastMergedSHsh3o(this.spanStyle, j11, null, Float.NaN, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m4457fastMergej5T8yCg = ParagraphStyleKt.m4457fastMergej5T8yCg(this.paragraphStyle, i11, i12, j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i13, i14, textMotion);
        return (this.spanStyle == m4505fastMergedSHsh3o && this.paragraphStyle == m4457fastMergej5T8yCg) ? this : new TextStyle(m4505fastMergedSHsh3o, m4457fastMergej5T8yCg);
    }

    @Stable
    @k
    public final TextStyle plus(@k TextStyle textStyle) {
        return merge(textStyle);
    }

    @Stable
    @k
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    @k
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    @k
    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m2517toStringimpl(m4589getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m5316toStringimpl(m4590getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m4591getFontStyle4Lr2A7w() + ", fontSynthesis=" + m4592getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m5316toStringimpl(m4595getLetterSpacingXSAIIZE())) + ", baselineShift=" + m4588getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m2517toStringimpl(m4587getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m4975toStringimpl(m4600getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m4989toStringimpl(m4602getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m5316toStringimpl(m4598getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m4889toStringimpl(m4597getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m4873toStringimpl(m4594getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, drawStyle, textAlign, textDirection, j15, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Stable
    @k
    public final TextStyle plus(@k ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, textAlign, textDirection, j15, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    @k
    public final TextStyle plus(@k SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, textAlign, textDirection, j15, textIndent, platformTextStyle, lineHeightStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, textAlign, textDirection, j15, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, v vVar) {
        this(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, i11, i12, j14, textIndent, platformTextStyle, lineHeightStyle, i13, i14, textMotion);
    }

    @Stable
    @k
    public final TextStyle merge(@k SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    @n(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, v vVar) {
        this(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(@k SpanStyle spanStyle, @k ParagraphStyle paragraphStyle, @l PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    @k
    public final TextStyle merge(@k ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i11, v vVar) {
        this(spanStyle, paragraphStyle, (i11 & 4) != 0 ? null : platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStyle(@m80.k androidx.compose.ui.text.SpanStyle r3, @m80.k androidx.compose.ui.text.ParagraphStyle r4) {
        /*
            r2 = this;
            androidx.compose.ui.text.PlatformSpanStyle r0 = r3.getPlatformStyle()
            androidx.compose.ui.text.PlatformParagraphStyle r1 = r4.getPlatformStyle()
            androidx.compose.ui.text.PlatformTextStyle r0 = androidx.compose.ui.text.TextStyleKt.access$createPlatformTextStyleInternal(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.ParagraphStyle):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r25, long r27, androidx.compose.ui.text.font.FontWeight r29, androidx.compose.ui.text.font.FontStyle r30, androidx.compose.ui.text.font.FontSynthesis r31, androidx.compose.ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.ui.text.style.BaselineShift r36, androidx.compose.ui.text.style.TextGeometricTransform r37, androidx.compose.ui.text.intl.LocaleList r38, long r39, androidx.compose.ui.text.style.TextDecoration r41, androidx.compose.ui.graphics.Shadow r42, androidx.compose.ui.text.style.TextAlign r43, androidx.compose.ui.text.style.TextDirection r44, long r45, androidx.compose.ui.text.style.TextIndent r47, int r48, kotlin.jvm.internal.v r49) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, int, kotlin.jvm.internal.v):void");
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m4574getHyphensEaSxIns$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m4575getLineBreakLgCVezo$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m4576getTextAlignbuA522U$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m4577getTextDirectionmmuk1to$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextStyle(long r23, long r25, androidx.compose.ui.text.font.FontWeight r27, androidx.compose.ui.text.font.FontStyle r28, androidx.compose.ui.text.font.FontSynthesis r29, androidx.compose.ui.text.font.FontFamily r30, java.lang.String r31, long r32, androidx.compose.ui.text.style.BaselineShift r34, androidx.compose.ui.text.style.TextGeometricTransform r35, androidx.compose.ui.text.intl.LocaleList r36, long r37, androidx.compose.ui.text.style.TextDecoration r39, androidx.compose.ui.graphics.Shadow r40, androidx.compose.ui.text.style.TextAlign r41, androidx.compose.ui.text.style.TextDirection r42, long r43, androidx.compose.ui.text.style.TextIndent r45) {
        /*
            r22 = this;
            androidx.compose.ui.text.SpanStyle r0 = new androidx.compose.ui.text.SpanStyle
            r20 = 0
            r21 = 0
            r19 = 0
            r1 = r23
            r3 = r25
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r39
            r18 = r40
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r41 == 0) goto L30
            int r2 = r41.m4976unboximpl()
            goto L36
        L30:
            androidx.compose.ui.text.style.TextAlign$Companion r2 = androidx.compose.ui.text.style.TextAlign.Companion
            int r2 = r2.m4983getUnspecifiede0LSkKk()
        L36:
            if (r42 == 0) goto L3d
            int r3 = r42.m4990unboximpl()
            goto L43
        L3d:
            androidx.compose.ui.text.style.TextDirection$Companion r3 = androidx.compose.ui.text.style.TextDirection.Companion
            int r3 = r3.m4996getUnspecifieds_7Xco()
        L43:
            androidx.compose.ui.text.style.LineBreak$Companion r4 = androidx.compose.ui.text.style.LineBreak.Companion
            int r4 = r4.m4898getUnspecifiedrAG3T2k()
            androidx.compose.ui.text.style.Hyphens$Companion r5 = androidx.compose.ui.text.style.Hyphens.Companion
            int r5 = r5.m4877getUnspecifiedvmbZdU8()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r26 = r43
            r28 = r45
            r23 = r1
            r24 = r2
            r25 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r29 = r8
            r30 = r9
            r23.<init>(r24, r25, r26, r28, r29, r30, r31, r32, r33, r34)
            r2 = 0
            r3 = r22
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r27, long r29, androidx.compose.ui.text.font.FontWeight r31, androidx.compose.ui.text.font.FontStyle r32, androidx.compose.ui.text.font.FontSynthesis r33, androidx.compose.ui.text.font.FontFamily r34, java.lang.String r35, long r36, androidx.compose.ui.text.style.BaselineShift r38, androidx.compose.ui.text.style.TextGeometricTransform r39, androidx.compose.ui.text.intl.LocaleList r40, long r41, androidx.compose.ui.text.style.TextDecoration r43, androidx.compose.ui.graphics.Shadow r44, androidx.compose.ui.text.style.TextAlign r45, androidx.compose.ui.text.style.TextDirection r46, long r47, androidx.compose.ui.text.style.TextIndent r49, androidx.compose.ui.text.PlatformTextStyle r50, androidx.compose.ui.text.style.LineHeightStyle r51, int r52, kotlin.jvm.internal.v r53) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, kotlin.jvm.internal.v):void");
    }

    private TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), (TextMotion) null, (v) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r29, long r31, androidx.compose.ui.text.font.FontWeight r33, androidx.compose.ui.text.font.FontStyle r34, androidx.compose.ui.text.font.FontSynthesis r35, androidx.compose.ui.text.font.FontFamily r36, java.lang.String r37, long r38, androidx.compose.ui.text.style.BaselineShift r40, androidx.compose.ui.text.style.TextGeometricTransform r41, androidx.compose.ui.text.intl.LocaleList r42, long r43, androidx.compose.ui.text.style.TextDecoration r45, androidx.compose.ui.graphics.Shadow r46, androidx.compose.ui.text.style.TextAlign r47, androidx.compose.ui.text.style.TextDirection r48, long r49, androidx.compose.ui.text.style.TextIndent r51, androidx.compose.ui.text.PlatformTextStyle r52, androidx.compose.ui.text.style.LineHeightStyle r53, androidx.compose.ui.text.style.LineBreak r54, androidx.compose.ui.text.style.Hyphens r55, int r56, kotlin.jvm.internal.v r57) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, int, kotlin.jvm.internal.v):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextStyle(long r26, long r28, androidx.compose.ui.text.font.FontWeight r30, androidx.compose.ui.text.font.FontStyle r31, androidx.compose.ui.text.font.FontSynthesis r32, androidx.compose.ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.BaselineShift r37, androidx.compose.ui.text.style.TextGeometricTransform r38, androidx.compose.ui.text.intl.LocaleList r39, long r40, androidx.compose.ui.text.style.TextDecoration r42, androidx.compose.ui.graphics.Shadow r43, androidx.compose.ui.text.style.TextAlign r44, androidx.compose.ui.text.style.TextDirection r45, long r46, androidx.compose.ui.text.style.TextIndent r48, androidx.compose.ui.text.PlatformTextStyle r49, androidx.compose.ui.text.style.LineHeightStyle r50, androidx.compose.ui.text.style.LineBreak r51, androidx.compose.ui.text.style.Hyphens r52) {
        /*
            r25 = this;
            r0 = r49
            androidx.compose.ui.text.SpanStyle r1 = new androidx.compose.ui.text.SpanStyle
            r24 = 0
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.PlatformSpanStyle r2 = r0.getSpanStyle()
            r20 = r2
            goto L11
        Lf:
            r20 = r24
        L11:
            r22 = 32768(0x8000, float:4.5918E-41)
            r23 = 0
            r21 = 0
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.text.ParagraphStyle r2 = new androidx.compose.ui.text.ParagraphStyle
            if (r44 == 0) goto L40
            int r3 = r44.m4976unboximpl()
            goto L46
        L40:
            androidx.compose.ui.text.style.TextAlign$Companion r3 = androidx.compose.ui.text.style.TextAlign.Companion
            int r3 = r3.m4983getUnspecifiede0LSkKk()
        L46:
            if (r45 == 0) goto L4d
            int r4 = r45.m4990unboximpl()
            goto L53
        L4d:
            androidx.compose.ui.text.style.TextDirection$Companion r4 = androidx.compose.ui.text.style.TextDirection.Companion
            int r4 = r4.m4996getUnspecifieds_7Xco()
        L53:
            if (r0 == 0) goto L59
            androidx.compose.ui.text.PlatformParagraphStyle r24 = r0.getParagraphStyle()
        L59:
            if (r51 == 0) goto L60
            int r5 = r51.m4890unboximpl()
            goto L66
        L60:
            androidx.compose.ui.text.style.LineBreak$Companion r5 = androidx.compose.ui.text.style.LineBreak.Companion
            int r5 = r5.m4898getUnspecifiedrAG3T2k()
        L66:
            if (r52 == 0) goto L6d
            int r6 = r52.m4874unboximpl()
            goto L73
        L6d:
            androidx.compose.ui.text.style.Hyphens$Companion r6 = androidx.compose.ui.text.style.Hyphens.Companion
            int r6 = r6.m4877getUnspecifiedvmbZdU8()
        L73:
            r7 = 256(0x100, float:3.59E-43)
            r8 = 0
            r9 = 0
            r29 = r46
            r31 = r48
            r33 = r50
            r26 = r2
            r27 = r3
            r28 = r4
            r34 = r5
            r35 = r6
            r37 = r7
            r38 = r8
            r36 = r9
            r32 = r24
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38)
            r2 = r25
            r3 = r26
            r2.<init>(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r31, long r33, androidx.compose.ui.text.font.FontWeight r35, androidx.compose.ui.text.font.FontStyle r36, androidx.compose.ui.text.font.FontSynthesis r37, androidx.compose.ui.text.font.FontFamily r38, java.lang.String r39, long r40, androidx.compose.ui.text.style.BaselineShift r42, androidx.compose.ui.text.style.TextGeometricTransform r43, androidx.compose.ui.text.intl.LocaleList r44, long r45, androidx.compose.ui.text.style.TextDecoration r47, androidx.compose.ui.graphics.Shadow r48, androidx.compose.ui.graphics.drawscope.DrawStyle r49, androidx.compose.ui.text.style.TextAlign r50, androidx.compose.ui.text.style.TextDirection r51, long r52, androidx.compose.ui.text.style.TextIndent r54, androidx.compose.ui.text.PlatformTextStyle r55, androidx.compose.ui.text.style.LineHeightStyle r56, androidx.compose.ui.text.style.LineBreak r57, androidx.compose.ui.text.style.Hyphens r58, androidx.compose.ui.text.style.TextMotion r59, int r60, kotlin.jvm.internal.v r61) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.v):void");
    }

    private TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion, (v) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r31, long r33, androidx.compose.ui.text.font.FontWeight r35, androidx.compose.ui.text.font.FontStyle r36, androidx.compose.ui.text.font.FontSynthesis r37, androidx.compose.ui.text.font.FontFamily r38, java.lang.String r39, long r40, androidx.compose.ui.text.style.BaselineShift r42, androidx.compose.ui.text.style.TextGeometricTransform r43, androidx.compose.ui.text.intl.LocaleList r44, long r45, androidx.compose.ui.text.style.TextDecoration r47, androidx.compose.ui.graphics.Shadow r48, androidx.compose.ui.graphics.drawscope.DrawStyle r49, int r50, int r51, long r52, androidx.compose.ui.text.style.TextIndent r54, androidx.compose.ui.text.PlatformTextStyle r55, androidx.compose.ui.text.style.LineHeightStyle r56, int r57, int r58, androidx.compose.ui.text.style.TextMotion r59, int r60, kotlin.jvm.internal.v r61) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.v):void");
    }

    private TextStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion) {
        this(new SpanStyle(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(i11, i12, j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i13, i14, textMotion, (v) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion, int i15, v vVar) {
        this(brush, (i15 & 2) != 0 ? Float.NaN : f11, (i15 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i15 & 8) != 0 ? null : fontWeight, (i15 & 16) != 0 ? null : fontStyle, (i15 & 32) != 0 ? null : fontSynthesis, (i15 & 64) != 0 ? null : fontFamily, (i15 & 128) != 0 ? null : str, (i15 & 256) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j12, (i15 & 512) != 0 ? null : baselineShift, (i15 & 1024) != 0 ? null : textGeometricTransform, (i15 & 2048) != 0 ? null : localeList, (i15 & 4096) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j13, (i15 & 8192) != 0 ? null : textDecoration, (i15 & 16384) != 0 ? null : shadow, (32768 & i15) != 0 ? null : drawStyle, (65536 & i15) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : i11, (131072 & i15) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : i12, (262144 & i15) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j14, (524288 & i15) != 0 ? null : textIndent, (1048576 & i15) != 0 ? null : platformTextStyle, (2097152 & i15) != 0 ? null : lineHeightStyle, (4194304 & i15) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : i13, (8388608 & i15) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : i14, (i15 & 16777216) != 0 ? null : textMotion, (v) null);
    }

    private TextStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i11, int i12, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, TextMotion textMotion) {
        this(new SpanStyle(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(i11, i12, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i13, i14, textMotion, (v) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i11, v vVar) {
        this(brush, (i11 & 2) != 0 ? Float.NaN : f11, (i11 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 8) != 0 ? null : fontWeight, (i11 & 16) != 0 ? null : fontStyle, (i11 & 32) != 0 ? null : fontSynthesis, (i11 & 64) != 0 ? null : fontFamily, (i11 & 128) != 0 ? null : str, (i11 & 256) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j12, (i11 & 512) != 0 ? null : baselineShift, (i11 & 1024) != 0 ? null : textGeometricTransform, (i11 & 2048) != 0 ? null : localeList, (i11 & 4096) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j13, (i11 & 8192) != 0 ? null : textDecoration, (i11 & 16384) != 0 ? null : shadow, (32768 & i11) != 0 ? null : drawStyle, (65536 & i11) != 0 ? null : textAlign, (131072 & i11) != 0 ? null : textDirection, (262144 & i11) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j14, (524288 & i11) != 0 ? null : textIndent, (1048576 & i11) != 0 ? null : platformTextStyle, (2097152 & i11) != 0 ? null : lineHeightStyle, (4194304 & i11) != 0 ? null : lineBreak, (8388608 & i11) != 0 ? null : hyphens, (i11 & 16777216) != 0 ? null : textMotion, (v) null);
    }

    private TextStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (v) null), new ParagraphStyle(textAlign != null ? textAlign.m4976unboximpl() : TextAlign.Companion.m4983getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m4990unboximpl() : TextDirection.Companion.m4996getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4890unboximpl() : LineBreak.Companion.m4898getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4874unboximpl() : Hyphens.Companion.m4877getUnspecifiedvmbZdU8(), textMotion, (v) null), platformTextStyle);
    }
}
