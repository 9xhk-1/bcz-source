package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextPaintExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPaintExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/TextPaintExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    @l
    public static final SpanStyle applySpanStyle(@k AndroidTextPaint androidTextPaint, @k SpanStyle spanStyle, @k r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar, @k Density density, boolean z11) {
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(spanStyle.m4501getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo376toPxR2X_6o(spanStyle.m4501getFontSizeXSAIIZE()));
        } else if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m5309getValueimpl(spanStyle.m4501getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m4502getFontStyle4Lr2A7w = spanStyle.m4502getFontStyle4Lr2A7w();
            FontStyle m4667boximpl = FontStyle.m4667boximpl(m4502getFontStyle4Lr2A7w != null ? m4502getFontStyle4Lr2A7w.m4673unboximpl() : FontStyle.Companion.m4677getNormal_LCdwA());
            FontSynthesis m4503getFontSynthesisZQGJjVo = spanStyle.m4503getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface(rVar.invoke(fontFamily, fontWeight, m4667boximpl, FontSynthesis.m4678boximpl(m4503getFontSynthesisZQGJjVo != null ? m4503getFontSynthesisZQGJjVo.m4686unboximpl() : FontSynthesis.Companion.m4687getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !g0.g(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !g0.g(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !g0.g(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m4827setColor8_81llA(spanStyle.m4500getColor0d7_KjU());
        androidTextPaint.m4825setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m2345getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(spanStyle.m4504getLetterSpacingXSAIIZE()), companion.m5342getSpUIouoOA()) && TextUnit.m5309getValueimpl(spanStyle.m4504getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo376toPxR2X_6o = density.mo376toPxR2X_6o(spanStyle.m4504getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo376toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(spanStyle.m4504getLetterSpacingXSAIIZE()), companion.m5341getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m5309getValueimpl(spanStyle.m4504getLetterSpacingXSAIIZE()));
        }
        return m4842generateFallbackSpanStyle62GTOB8(spanStyle.m4504getLetterSpacingXSAIIZE(), z11, spanStyle.m4498getBackground0d7_KjU(), spanStyle.m4499getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, r rVar, Density density, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, rVar, density, z11);
    }

    public static final float correctBlurRadius(float f11) {
        if (f11 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f11;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m4842generateFallbackSpanStyle62GTOB8(long j11, boolean z11, long j12, BaselineShift baselineShift) {
        long j13 = j12;
        boolean z12 = false;
        boolean z13 = z11 && TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnitType.Companion.m5342getSpUIouoOA()) && TextUnit.m5309getValueimpl(j11) != 0.0f;
        Color.Companion companion = Color.Companion;
        boolean z14 = (Color.m2510equalsimpl0(j13, companion.m2545getUnspecified0d7_KjU()) || Color.m2510equalsimpl0(j13, companion.m2544getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m4852equalsimpl0(baselineShift.m4855unboximpl(), BaselineShift.Companion.m4859getNoney9eOQZs())) {
                z12 = true;
            }
        }
        if (!z13 && !z14 && !z12) {
            return null;
        }
        long m5320getUnspecifiedXSAIIZE = z13 ? j11 : TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        if (!z14) {
            j13 = companion.m2545getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m5320getUnspecifiedXSAIIZE, z12 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, j13, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (v) null);
    }

    public static final boolean hasFontAttributes(@k SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m4502getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@k AndroidTextPaint androidTextPaint, @l TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning$ui_text_release() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int m5005getLinearity4e0Vf04$ui_text_release = textMotion.m5005getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m5009equalsimpl0(m5005getLinearity4e0Vf04$ui_text_release, companion.m5014getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5009equalsimpl0(m5005getLinearity4e0Vf04$ui_text_release, companion.m5013getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m5009equalsimpl0(m5005getLinearity4e0Vf04$ui_text_release, companion.m5015getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
