package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class SpanStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final long background;

    @l
    private final BaselineShift baselineShift;

    @l
    private final DrawStyle drawStyle;

    @l
    private final FontFamily fontFamily;

    @l
    private final String fontFeatureSettings;
    private final long fontSize;

    @l
    private final FontStyle fontStyle;

    @l
    private final FontSynthesis fontSynthesis;

    @l
    private final FontWeight fontWeight;
    private final long letterSpacing;

    @l
    private final LocaleList localeList;

    @l
    private final PlatformSpanStyle platformStyle;

    @l
    private final Shadow shadow;

    @l
    private final TextDecoration textDecoration;

    @k
    private final TextForegroundStyle textForegroundStyle;

    @l
    private final TextGeometricTransform textGeometricTransform;

    public /* synthetic */ SpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m4491copyGSF8kmg$default(SpanStyle spanStyle, long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i11, Object obj) {
        long m4500getColor0d7_KjU = (i11 & 1) != 0 ? spanStyle.m4500getColor0d7_KjU() : j11;
        return spanStyle.m4495copyGSF8kmg(m4500getColor0d7_KjU, (i11 & 2) != 0 ? spanStyle.fontSize : j12, (i11 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i11 & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i11 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i11 & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i11 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i11 & 128) != 0 ? spanStyle.letterSpacing : j13, (i11 & 256) != 0 ? spanStyle.baselineShift : baselineShift, (i11 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i11 & 1024) != 0 ? spanStyle.localeList : localeList, (i11 & 2048) != 0 ? spanStyle.background : j14, (i11 & 4096) != 0 ? spanStyle.textDecoration : textDecoration, (i11 & 8192) != 0 ? spanStyle.shadow : shadow, (i11 & 16384) != 0 ? spanStyle.platformStyle : platformSpanStyle, (i11 & 32768) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m4493copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i11, Object obj) {
        DrawStyle drawStyle2;
        PlatformSpanStyle platformSpanStyle2;
        long j14;
        long j15;
        TextDecoration textDecoration2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j16;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        Shadow shadow2;
        float alpha = (i11 & 2) != 0 ? spanStyle.getAlpha() : f11;
        long j17 = (i11 & 4) != 0 ? spanStyle.fontSize : j11;
        FontWeight fontWeight3 = (i11 & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle3 = (i11 & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis3 = (i11 & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily3 = (i11 & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str3 = (i11 & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j18 = (i11 & 256) != 0 ? spanStyle.letterSpacing : j12;
        BaselineShift baselineShift3 = (i11 & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i11 & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList3 = (i11 & 2048) != 0 ? spanStyle.localeList : localeList;
        float f12 = alpha;
        long j19 = j17;
        long j21 = (i11 & 4096) != 0 ? spanStyle.background : j13;
        TextDecoration textDecoration3 = (i11 & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i11 & 16384) != 0 ? spanStyle.shadow : shadow;
        PlatformSpanStyle platformSpanStyle3 = (i11 & 32768) != 0 ? spanStyle.platformStyle : platformSpanStyle;
        if ((i11 & 65536) != 0) {
            platformSpanStyle2 = platformSpanStyle3;
            drawStyle2 = spanStyle.drawStyle;
            j15 = j21;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j16 = j18;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
            j14 = j19;
        } else {
            drawStyle2 = drawStyle;
            platformSpanStyle2 = platformSpanStyle3;
            j14 = j19;
            j15 = j21;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j16 = j18;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
        }
        return spanStyle.m4497copyNcG25M8(brush, f12, j14, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j16, baselineShift2, textGeometricTransform2, localeList2, j15, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m4494copy2BkPm_w(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        return new SpanStyle(Color.m2510equalsimpl0(j11, m4500getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (v) null);
    }

    @k
    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m4495copyGSF8kmg(long j11, long j12, @l FontWeight fontWeight, @l FontStyle fontStyle, @l FontSynthesis fontSynthesis, @l FontFamily fontFamily, @l String str, long j13, @l BaselineShift baselineShift, @l TextGeometricTransform textGeometricTransform, @l LocaleList localeList, long j14, @l TextDecoration textDecoration, @l Shadow shadow, @l PlatformSpanStyle platformSpanStyle, @l DrawStyle drawStyle) {
        return new SpanStyle(Color.m2510equalsimpl0(j11, m4500getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformSpanStyle, drawStyle, (v) null);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m4496copyIuqyXdg(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow) {
        return new SpanStyle(Color.m2510equalsimpl0(j11, m4500getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, this.platformStyle, this.drawStyle, (v) null);
    }

    @k
    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m4497copyNcG25M8(@l Brush brush, float f11, long j11, @l FontWeight fontWeight, @l FontStyle fontStyle, @l FontSynthesis fontSynthesis, @l FontFamily fontFamily, @l String str, long j12, @l BaselineShift baselineShift, @l TextGeometricTransform textGeometricTransform, @l LocaleList localeList, long j13, @l TextDecoration textDecoration, @l Shadow shadow, @l PlatformSpanStyle platformSpanStyle, @l DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f11), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, drawStyle, (v) null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes$ui_text_release(spanStyle);
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4498getBackground0d7_KjU() {
        return this.background;
    }

    @l
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m4499getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    @l
    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4500getColor0d7_KjU() {
        return this.textForegroundStyle.mo4863getColor0d7_KjU();
    }

    @l
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @l
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @l
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m4501getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @l
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m4502getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    @l
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m4503getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    @l
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m4504getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    @l
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @l
    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @l
    public final Shadow getShadow() {
        return this.shadow;
    }

    @l
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @k
    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    @l
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(@k SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.m5306equalsimpl0(this.fontSize, spanStyle.fontSize) && g0.g(this.fontWeight, spanStyle.fontWeight) && g0.g(this.fontStyle, spanStyle.fontStyle) && g0.g(this.fontSynthesis, spanStyle.fontSynthesis) && g0.g(this.fontFamily, spanStyle.fontFamily) && g0.g(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m5306equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && g0.g(this.baselineShift, spanStyle.baselineShift) && g0.g(this.textGeometricTransform, spanStyle.textGeometricTransform) && g0.g(this.localeList, spanStyle.localeList) && Color.m2510equalsimpl0(this.background, spanStyle.background) && g0.g(this.platformStyle, spanStyle.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(@k SpanStyle spanStyle) {
        return g0.g(this.textForegroundStyle, spanStyle.textForegroundStyle) && g0.g(this.textDecoration, spanStyle.textDecoration) && g0.g(this.shadow, spanStyle.shadow) && g0.g(this.drawStyle, spanStyle.drawStyle);
    }

    public int hashCode() {
        int m2516hashCodeimpl = Color.m2516hashCodeimpl(m4500getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int hashCode = (((((m2516hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(getAlpha())) * 31) + TextUnit.m5310hashCodeimpl(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int hashCode2 = (hashCode + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int m4671hashCodeimpl = (hashCode2 + (fontStyle != null ? FontStyle.m4671hashCodeimpl(fontStyle.m4673unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int m4682hashCodeimpl = (m4671hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m4682hashCodeimpl(fontSynthesis.m4686unboximpl()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int hashCode3 = (m4682hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m5310hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int m4853hashCodeimpl = (hashCode4 + (baselineShift != null ? BaselineShift.m4853hashCodeimpl(baselineShift.m4855unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode5 = (m4853hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int hashCode6 = (((hashCode5 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m2516hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int hashCode7 = (hashCode6 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int hashCode8 = (hashCode7 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int hashCode9 = (hashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return hashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int m5310hashCodeimpl = TextUnit.m5310hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int hashCode = (m5310hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int m4671hashCodeimpl = (hashCode + (fontStyle != null ? FontStyle.m4671hashCodeimpl(fontStyle.m4673unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int m4682hashCodeimpl = (m4671hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m4682hashCodeimpl(fontSynthesis.m4686unboximpl()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int hashCode2 = (m4682hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m5310hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int m4853hashCodeimpl = (hashCode3 + (baselineShift != null ? BaselineShift.m4853hashCodeimpl(baselineShift.m4855unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode4 = (m4853hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int hashCode5 = (((hashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m2516hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return hashCode5 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    @Stable
    @k
    public final SpanStyle merge(@l SpanStyle spanStyle) {
        return spanStyle == null ? this : SpanStyleKt.m4505fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo4863getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    @Stable
    @k
    public final SpanStyle plus(@k SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    @k
    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m2517toStringimpl(m4500getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m5316toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.m5316toStringimpl(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m2517toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    @n(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformSpanStyle);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, v vVar) {
        this(brush, f11, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, v vVar) {
        this(textForegroundStyle, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j11;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j12;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j13;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i11, v vVar) {
        this(textForegroundStyle, (i11 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 4) != 0 ? null : fontWeight, (i11 & 8) != 0 ? null : fontStyle, (i11 & 16) != 0 ? null : fontSynthesis, (i11 & 32) != 0 ? null : fontFamily, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j12, (i11 & 256) != 0 ? null : baselineShift, (i11 & 512) != 0 ? null : textGeometricTransform, (i11 & 1024) != 0 ? null : localeList, (i11 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j13, (i11 & 4096) != 0 ? null : textDecoration, (i11 & 8192) != 0 ? null : shadow, (i11 & 16384) != 0 ? null : platformSpanStyle, (i11 & 32768) != 0 ? null : drawStyle, (v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SpanStyle(long r20, long r22, androidx.compose.ui.text.font.FontWeight r24, androidx.compose.ui.text.font.FontStyle r25, androidx.compose.ui.text.font.FontSynthesis r26, androidx.compose.ui.text.font.FontFamily r27, java.lang.String r28, long r29, androidx.compose.ui.text.style.BaselineShift r31, androidx.compose.ui.text.style.TextGeometricTransform r32, androidx.compose.ui.text.intl.LocaleList r33, long r34, androidx.compose.ui.text.style.TextDecoration r36, androidx.compose.ui.graphics.Shadow r37, int r38, kotlin.jvm.internal.v r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto Ld
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.Companion
            long r1 = r1.m2545getUnspecified0d7_KjU()
            goto Lf
        Ld:
            r1 = r20
        Lf:
            r3 = r0 & 2
            if (r3 == 0) goto L1a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.Companion
            long r3 = r3.m5320getUnspecifiedXSAIIZE()
            goto L1c
        L1a:
            r3 = r22
        L1c:
            r5 = r0 & 4
            if (r5 == 0) goto L22
            r5 = 0
            goto L24
        L22:
            r5 = r24
        L24:
            r7 = r0 & 8
            if (r7 == 0) goto L2a
            r7 = 0
            goto L2c
        L2a:
            r7 = r25
        L2c:
            r8 = r0 & 16
            if (r8 == 0) goto L32
            r8 = 0
            goto L34
        L32:
            r8 = r26
        L34:
            r9 = r0 & 32
            if (r9 == 0) goto L3a
            r9 = 0
            goto L3c
        L3a:
            r9 = r27
        L3c:
            r10 = r0 & 64
            if (r10 == 0) goto L42
            r10 = 0
            goto L44
        L42:
            r10 = r28
        L44:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L4f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.ui.unit.TextUnit.Companion
            long r11 = r11.m5320getUnspecifiedXSAIIZE()
            goto L51
        L4f:
            r11 = r29
        L51:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L57
            r13 = 0
            goto L59
        L57:
            r13 = r31
        L59:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L5f
            r14 = 0
            goto L61
        L5f:
            r14 = r32
        L61:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L67
            r15 = 0
            goto L69
        L67:
            r15 = r33
        L69:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L74
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.ui.graphics.Color.Companion
            long r16 = r6.m2545getUnspecified0d7_KjU()
            goto L76
        L74:
            r16 = r34
        L76:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L7c
            r6 = 0
            goto L7e
        L7c:
            r6 = r36
        L7e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L84
            r0 = 0
            goto L86
        L84:
            r0 = r37
        L86:
            r18 = 0
            r20 = r19
            r38 = r0
            r21 = r1
            r23 = r3
            r25 = r5
            r37 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r39 = r18
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, int, kotlin.jvm.internal.v):void");
    }

    private SpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SpanStyle(long r21, long r23, androidx.compose.ui.text.font.FontWeight r25, androidx.compose.ui.text.font.FontStyle r26, androidx.compose.ui.text.font.FontSynthesis r27, androidx.compose.ui.text.font.FontFamily r28, java.lang.String r29, long r30, androidx.compose.ui.text.style.BaselineShift r32, androidx.compose.ui.text.style.TextGeometricTransform r33, androidx.compose.ui.text.intl.LocaleList r34, long r35, androidx.compose.ui.text.style.TextDecoration r37, androidx.compose.ui.graphics.Shadow r38, androidx.compose.ui.text.PlatformSpanStyle r39, int r40, kotlin.jvm.internal.v r41) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, int, kotlin.jvm.internal.v):void");
    }

    private SpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SpanStyle(long r22, long r24, androidx.compose.ui.text.font.FontWeight r26, androidx.compose.ui.text.font.FontStyle r27, androidx.compose.ui.text.font.FontSynthesis r28, androidx.compose.ui.text.font.FontFamily r29, java.lang.String r30, long r31, androidx.compose.ui.text.style.BaselineShift r33, androidx.compose.ui.text.style.TextGeometricTransform r34, androidx.compose.ui.text.intl.LocaleList r35, long r36, androidx.compose.ui.text.style.TextDecoration r38, androidx.compose.ui.graphics.Shadow r39, androidx.compose.ui.text.PlatformSpanStyle r40, androidx.compose.ui.graphics.drawscope.DrawStyle r41, int r42, kotlin.jvm.internal.v r43) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle, int, kotlin.jvm.internal.v):void");
    }

    private SpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m4998from8_81llA(j11), j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow, platformSpanStyle, drawStyle, (v) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i11, v vVar) {
        this(brush, (i11 & 2) != 0 ? Float.NaN : f11, (i11 & 4) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j11, (i11 & 8) != 0 ? null : fontWeight, (i11 & 16) != 0 ? null : fontStyle, (i11 & 32) != 0 ? null : fontSynthesis, (i11 & 64) != 0 ? null : fontFamily, (i11 & 128) != 0 ? null : str, (i11 & 256) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : j12, (i11 & 512) != 0 ? null : baselineShift, (i11 & 1024) != 0 ? null : textGeometricTransform, (i11 & 2048) != 0 ? null : localeList, (i11 & 4096) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j13, (i11 & 8192) != 0 ? null : textDecoration, (i11 & 16384) != 0 ? null : shadow, (32768 & i11) != 0 ? null : platformSpanStyle, (i11 & 65536) != 0 ? null : drawStyle, (v) null);
    }

    private SpanStyle(Brush brush, float f11, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f11), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, drawStyle, (v) null);
    }
}
