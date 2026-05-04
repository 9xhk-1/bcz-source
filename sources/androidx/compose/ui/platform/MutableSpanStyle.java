package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MutableSpanStyle {
    private long background;

    @m80.l
    private BaselineShift baselineShift;
    private long color;

    @m80.l
    private FontFamily fontFamily;

    @m80.l
    private String fontFeatureSettings;
    private long fontSize;

    @m80.l
    private FontStyle fontStyle;

    @m80.l
    private FontSynthesis fontSynthesis;

    @m80.l
    private FontWeight fontWeight;
    private long letterSpacing;

    @m80.l
    private LocaleList localeList;

    @m80.l
    private Shadow shadow;

    @m80.l
    private TextDecoration textDecoration;

    @m80.l
    private TextGeometricTransform textGeometricTransform;

    public /* synthetic */ MutableSpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow, kotlin.jvm.internal.v vVar) {
        this(j11, j12, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j13, baselineShift, textGeometricTransform, localeList, j14, textDecoration, shadow);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4276getBackground0d7_KjU() {
        return this.background;
    }

    @m80.l
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m4277getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4278getColor0d7_KjU() {
        return this.color;
    }

    @m80.l
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @m80.l
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m4279getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @m80.l
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m4280getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    @m80.l
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m4281getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    @m80.l
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m4282getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    @m80.l
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @m80.l
    public final Shadow getShadow() {
        return this.shadow;
    }

    @m80.l
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @m80.l
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    /* renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m4283setBackground8_81llA(long j11) {
        this.background = j11;
    }

    /* renamed from: setBaselineShift-_isdbwI, reason: not valid java name */
    public final void m4284setBaselineShift_isdbwI(@m80.l BaselineShift baselineShift) {
        this.baselineShift = baselineShift;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m4285setColor8_81llA(long j11) {
        this.color = j11;
    }

    public final void setFontFamily(@m80.l FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }

    public final void setFontFeatureSettings(@m80.l String str) {
        this.fontFeatureSettings = str;
    }

    /* renamed from: setFontSize--R2X_6o, reason: not valid java name */
    public final void m4286setFontSizeR2X_6o(long j11) {
        this.fontSize = j11;
    }

    /* renamed from: setFontStyle-mLjRB2g, reason: not valid java name */
    public final void m4287setFontStylemLjRB2g(@m80.l FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    /* renamed from: setFontSynthesis-tDdu0R4, reason: not valid java name */
    public final void m4288setFontSynthesistDdu0R4(@m80.l FontSynthesis fontSynthesis) {
        this.fontSynthesis = fontSynthesis;
    }

    public final void setFontWeight(@m80.l FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    /* renamed from: setLetterSpacing--R2X_6o, reason: not valid java name */
    public final void m4289setLetterSpacingR2X_6o(long j11) {
        this.letterSpacing = j11;
    }

    public final void setLocaleList(@m80.l LocaleList localeList) {
        this.localeList = localeList;
    }

    public final void setShadow(@m80.l Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(@m80.l TextDecoration textDecoration) {
        this.textDecoration = textDecoration;
    }

    public final void setTextGeometricTransform(@m80.l TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    @m80.k
    public final SpanStyle toSpanStyle() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (kotlin.jvm.internal.v) null);
    }

    private MutableSpanStyle(long j11, long j12, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j13, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, TextDecoration textDecoration, Shadow shadow) {
        this.color = j11;
        this.fontSize = j12;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j13;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j14;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MutableSpanStyle(long r20, long r22, androidx.compose.ui.text.font.FontWeight r24, androidx.compose.ui.text.font.FontStyle r25, androidx.compose.ui.text.font.FontSynthesis r26, androidx.compose.ui.text.font.FontFamily r27, java.lang.String r28, long r29, androidx.compose.ui.text.style.BaselineShift r31, androidx.compose.ui.text.style.TextGeometricTransform r32, androidx.compose.ui.text.intl.LocaleList r33, long r34, androidx.compose.ui.text.style.TextDecoration r36, androidx.compose.ui.graphics.Shadow r37, int r38, kotlin.jvm.internal.v r39) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.MutableSpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, int, kotlin.jvm.internal.v):void");
    }
}
