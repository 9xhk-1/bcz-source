package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,531:1\n247#2:532\n242#2,6:533\n247#2:539\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n465#1:532\n492#1:533,6\n507#1:539\n*E\n"})
/* loaded from: classes2.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m5306equalsimpl0(r11, r24.m4452getLineHeightXSAIIZE()) != false) goto L17;
     */
    @m80.k
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.ParagraphStyle m4457fastMergej5T8yCg(@m80.k androidx.compose.ui.text.ParagraphStyle r24, int r25, int r26, long r27, @m80.l androidx.compose.ui.text.style.TextIndent r29, @m80.l androidx.compose.ui.text.PlatformParagraphStyle r30, @m80.l androidx.compose.ui.text.style.LineHeightStyle r31, int r32, int r33, @m80.l androidx.compose.ui.text.style.TextMotion r34) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyleKt.m4457fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }

    @Stable
    @k
    public static final ParagraphStyle lerp(@k ParagraphStyle paragraphStyle, @k ParagraphStyle paragraphStyle2, float f11) {
        int m4976unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m4970boximpl(paragraphStyle.m4454getTextAligne0LSkKk()), TextAlign.m4970boximpl(paragraphStyle2.m4454getTextAligne0LSkKk()), f11)).m4976unboximpl();
        int m4990unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m4984boximpl(paragraphStyle.m4456getTextDirections_7Xco()), TextDirection.m4984boximpl(paragraphStyle2.m4456getTextDirections_7Xco()), f11)).m4990unboximpl();
        long m4506lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m4506lerpTextUnitInheritableC3pnCVY(paragraphStyle.m4452getLineHeightXSAIIZE(), paragraphStyle2.m4452getLineHeightXSAIIZE(), f11);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(m4976unboximpl, m4990unboximpl, m4506lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f11), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f11), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f11), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m4878boximpl(paragraphStyle.m4451getLineBreakrAG3T2k()), LineBreak.m4878boximpl(paragraphStyle2.m4451getLineBreakrAG3T2k()), f11)).m4890unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m4868boximpl(paragraphStyle.m4449getHyphensvmbZdU8()), Hyphens.m4868boximpl(paragraphStyle2.m4449getHyphensvmbZdU8()), f11)).m4874unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f11), (v) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f11) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f11);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    @k
    public static final ParagraphStyle resolveParagraphStyleDefaults(@k ParagraphStyle paragraphStyle, @k LayoutDirection layoutDirection) {
        int m4454getTextAligne0LSkKk = paragraphStyle.m4454getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        int m4982getStarte0LSkKk = TextAlign.m4973equalsimpl0(m4454getTextAligne0LSkKk, companion.m4983getUnspecifiede0LSkKk()) ? companion.m4982getStarte0LSkKk() : paragraphStyle.m4454getTextAligne0LSkKk();
        int m4605resolveTextDirectionIhaHGbI = TextStyleKt.m4605resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m4456getTextDirections_7Xco());
        long m4452getLineHeightXSAIIZE = TextUnit.m5307getRawTypeimpl(paragraphStyle.m4452getLineHeightXSAIIZE()) == 0 ? DefaultLineHeight : paragraphStyle.m4452getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m4451getLineBreakrAG3T2k = paragraphStyle.m4451getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        int m4897getSimplerAG3T2k = LineBreak.m4884equalsimpl0(m4451getLineBreakrAG3T2k, companion2.m4898getUnspecifiedrAG3T2k()) ? companion2.m4897getSimplerAG3T2k() : paragraphStyle.m4451getLineBreakrAG3T2k();
        int m4449getHyphensvmbZdU8 = paragraphStyle.m4449getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        int m4876getNonevmbZdU8 = Hyphens.m4871equalsimpl0(m4449getHyphensvmbZdU8, companion3.m4877getUnspecifiedvmbZdU8()) ? companion3.m4876getNonevmbZdU8() : paragraphStyle.m4449getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(m4982getStarte0LSkKk, m4605resolveTextDirectionIhaHGbI, m4452getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, m4897getSimplerAG3T2k, m4876getNonevmbZdU8, textMotion, (v) null);
    }
}
