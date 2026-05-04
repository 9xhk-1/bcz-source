package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;

    @k
    private final TextStyle body1;

    @k
    private final TextStyle body2;

    @k
    private final TextStyle button;

    @k
    private final TextStyle caption;

    /* renamed from: h1, reason: collision with root package name */
    @k
    private final TextStyle f4127h1;

    /* renamed from: h2, reason: collision with root package name */
    @k
    private final TextStyle f4128h2;

    /* renamed from: h3, reason: collision with root package name */
    @k
    private final TextStyle f4129h3;

    /* renamed from: h4, reason: collision with root package name */
    @k
    private final TextStyle f4130h4;

    /* renamed from: h5, reason: collision with root package name */
    @k
    private final TextStyle f4131h5;

    /* renamed from: h6, reason: collision with root package name */
    @k
    private final TextStyle f4132h6;

    @k
    private final TextStyle overline;

    @k
    private final TextStyle subtitle1;

    @k
    private final TextStyle subtitle2;

    public Typography(@k TextStyle textStyle, @k TextStyle textStyle2, @k TextStyle textStyle3, @k TextStyle textStyle4, @k TextStyle textStyle5, @k TextStyle textStyle6, @k TextStyle textStyle7, @k TextStyle textStyle8, @k TextStyle textStyle9, @k TextStyle textStyle10, @k TextStyle textStyle11, @k TextStyle textStyle12, @k TextStyle textStyle13) {
        this.f4127h1 = textStyle;
        this.f4128h2 = textStyle2;
        this.f4129h3 = textStyle3;
        this.f4130h4 = textStyle4;
        this.f4131h5 = textStyle5;
        this.f4132h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textStyle = typography.f4127h1;
        }
        return typography.copy(textStyle, (i11 & 2) != 0 ? typography.f4128h2 : textStyle2, (i11 & 4) != 0 ? typography.f4129h3 : textStyle3, (i11 & 8) != 0 ? typography.f4130h4 : textStyle4, (i11 & 16) != 0 ? typography.f4131h5 : textStyle5, (i11 & 32) != 0 ? typography.f4132h6 : textStyle6, (i11 & 64) != 0 ? typography.subtitle1 : textStyle7, (i11 & 128) != 0 ? typography.subtitle2 : textStyle8, (i11 & 256) != 0 ? typography.body1 : textStyle9, (i11 & 512) != 0 ? typography.body2 : textStyle10, (i11 & 1024) != 0 ? typography.button : textStyle11, (i11 & 2048) != 0 ? typography.caption : textStyle12, (i11 & 4096) != 0 ? typography.overline : textStyle13);
    }

    @k
    public final Typography copy(@k TextStyle textStyle, @k TextStyle textStyle2, @k TextStyle textStyle3, @k TextStyle textStyle4, @k TextStyle textStyle5, @k TextStyle textStyle6, @k TextStyle textStyle7, @k TextStyle textStyle8, @k TextStyle textStyle9, @k TextStyle textStyle10, @k TextStyle textStyle11, @k TextStyle textStyle12, @k TextStyle textStyle13) {
        return new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return g0.g(this.f4127h1, typography.f4127h1) && g0.g(this.f4128h2, typography.f4128h2) && g0.g(this.f4129h3, typography.f4129h3) && g0.g(this.f4130h4, typography.f4130h4) && g0.g(this.f4131h5, typography.f4131h5) && g0.g(this.f4132h6, typography.f4132h6) && g0.g(this.subtitle1, typography.subtitle1) && g0.g(this.subtitle2, typography.subtitle2) && g0.g(this.body1, typography.body1) && g0.g(this.body2, typography.body2) && g0.g(this.button, typography.button) && g0.g(this.caption, typography.caption) && g0.g(this.overline, typography.overline);
    }

    @k
    public final TextStyle getBody1() {
        return this.body1;
    }

    @k
    public final TextStyle getBody2() {
        return this.body2;
    }

    @k
    public final TextStyle getButton() {
        return this.button;
    }

    @k
    public final TextStyle getCaption() {
        return this.caption;
    }

    @k
    public final TextStyle getH1() {
        return this.f4127h1;
    }

    @k
    public final TextStyle getH2() {
        return this.f4128h2;
    }

    @k
    public final TextStyle getH3() {
        return this.f4129h3;
    }

    @k
    public final TextStyle getH4() {
        return this.f4130h4;
    }

    @k
    public final TextStyle getH5() {
        return this.f4131h5;
    }

    @k
    public final TextStyle getH6() {
        return this.f4132h6;
    }

    @k
    public final TextStyle getOverline() {
        return this.overline;
    }

    @k
    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    @k
    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f4127h1.hashCode() * 31) + this.f4128h2.hashCode()) * 31) + this.f4129h3.hashCode()) * 31) + this.f4130h4.hashCode()) * 31) + this.f4131h5.hashCode()) * 31) + this.f4132h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    @k
    public String toString() {
        return "Typography(h1=" + this.f4127h1 + ", h2=" + this.f4128h2 + ", h3=" + this.f4129h3 + ", h4=" + this.f4130h4 + ", h5=" + this.f4131h5 + ", h6=" + this.f4132h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Typography(androidx.compose.ui.text.font.FontFamily r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.TextStyle r51, androidx.compose.ui.text.TextStyle r52, androidx.compose.ui.text.TextStyle r53, androidx.compose.ui.text.TextStyle r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.text.TextStyle r57, androidx.compose.ui.text.TextStyle r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.ui.text.TextStyle r60, androidx.compose.ui.text.TextStyle r61, androidx.compose.ui.text.TextStyle r62, int r63, kotlin.jvm.internal.v r64) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.v):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Typography(@m80.k androidx.compose.ui.text.font.FontFamily r1, @m80.k androidx.compose.ui.text.TextStyle r2, @m80.k androidx.compose.ui.text.TextStyle r3, @m80.k androidx.compose.ui.text.TextStyle r4, @m80.k androidx.compose.ui.text.TextStyle r5, @m80.k androidx.compose.ui.text.TextStyle r6, @m80.k androidx.compose.ui.text.TextStyle r7, @m80.k androidx.compose.ui.text.TextStyle r8, @m80.k androidx.compose.ui.text.TextStyle r9, @m80.k androidx.compose.ui.text.TextStyle r10, @m80.k androidx.compose.ui.text.TextStyle r11, @m80.k androidx.compose.ui.text.TextStyle r12, @m80.k androidx.compose.ui.text.TextStyle r13, @m80.k androidx.compose.ui.text.TextStyle r14) {
        /*
            r0 = this;
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r2, r1)
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r3, r1)
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r4, r1)
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r5, r1)
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r6, r1)
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r7, r1)
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r8, r1)
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r9, r1)
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r10, r1)
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r11, r1)
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r12, r1)
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r13, r1)
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r14, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle):void");
    }
}
