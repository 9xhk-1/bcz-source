package androidx.compose.ui.text.platform.extensions;

import a00.a0;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import c10.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.r0;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,603:1\n247#2:604\n34#3,6:605\n247#3,6:612\n34#3,6:618\n253#3:624\n70#3,6:625\n34#3,6:631\n1#4:611\n65#5:637\n69#5:640\n60#6:638\n70#6:641\n22#7:639\n22#7:642\n635#8:643\n635#8:644\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n92#1:604\n139#1:605,6\n346#1:612,6\n346#1:618,6\n346#1:624\n415#1:625,6\n435#1:631,6\n482#1:637\n483#1:640\n482#1:638\n483#1:641\n482#1:639\n483#1:642\n498#1:643\n566#1:644\n*E\n"})
/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m4833createLetterSpacingSpaneAf_CNQ(long j11, Density density) {
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo376toPxR2X_6o(j11));
        }
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m5309getValueimpl(j11));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@l SpanStyle spanStyle, @k List<AnnotatedString.Range<SpanStyle>> list, @k q<? super SpanStyle, ? super Integer, ? super Integer, g2> qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            qVar.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i11 = size * 2;
        int[] iArr = new int[i11];
        List<AnnotatedString.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i12);
            iArr[i12] = range.getStart();
            iArr[i12 + size] = range.getEnd();
        }
        a00.q.O3(iArr);
        int fc2 = a0.fc(iArr);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13];
            if (i14 != fc2) {
                int size3 = list2.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i15 = 0; i15 < size3; i15++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i15);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(fc2, i14, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    qVar.invoke(spanStyle2, Integer.valueOf(fc2), Integer.valueOf(i14));
                }
                fc2 = i14;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(spanStyle.m4504getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA()) || TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(spanStyle.m4504getLetterSpacingXSAIIZE()), companion.m5341getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m4592getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m4834resolveBulletTextUnitToPxo2QH7mI(long j11, float f11, Density density) {
        if (TextUnit.m5306equalsimpl0(j11, TextUnit.Companion.m5320getUnspecifiedXSAIIZE())) {
            return f11;
        }
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            return density.mo376toPxR2X_6o(j11);
        }
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
            return TextUnit.m5309getValueimpl(j11) * f11;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m4835resolveLineHeightInPxo2QH7mI(long j11, float f11, Density density) {
        float m5309getValueimpl;
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo376toPxR2X_6o(j11);
            }
            m5309getValueimpl = TextUnit.m5309getValueimpl(j11) / TextUnit.m5309getValueimpl(density.mo380toSpkPz2Gy4(f11));
        } else {
            if (!TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
                return Float.NaN;
            }
            m5309getValueimpl = TextUnit.m5309getValueimpl(j11);
        }
        return m5309getValueimpl * f11;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m4836setBackgroundRPmYEkk(@k Spannable spannable, long j11, int i11, int i12) {
        if (j11 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m2563toArgb8_81llA(j11)), i11, i12);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m4837setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i11, int i12) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m4855unboximpl()), i11, i12);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f11, int i11, int i12) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m4838setColorRPmYEkk(spannable, ((SolidColor) brush).m2844getValue0d7_KjU(), i11, i12);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f11), i11, i12);
            }
        }
    }

    public static final void setBulletSpans(@k Spannable spannable, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f11, @k Density density, @l TextIndent textIndent) {
        Density density2 = density;
        float f12 = 0.0f;
        if (textIndent != null) {
            long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(textIndent.m5001getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
                f12 = density2.mo376toPxR2X_6o(textIndent.m5001getFirstLineXSAIIZE());
            } else if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
                f12 = TextUnit.m5309getValueimpl(textIndent.m5001getFirstLineXSAIIZE()) * f11;
            }
        }
        float f13 = f12;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i11);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float m4834resolveBulletTextUnitToPxo2QH7mI = m4834resolveBulletTextUnitToPxo2QH7mI(bullet.m4395getSizeXSAIIZE(), f11, density2);
                float m4834resolveBulletTextUnitToPxo2QH7mI2 = m4834resolveBulletTextUnitToPxo2QH7mI(bullet.m4394getPaddingXSAIIZE(), f11, density2);
                if (!Float.isNaN(m4834resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(m4834resolveBulletTextUnitToPxo2QH7mI2)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), m4834resolveBulletTextUnitToPxo2QH7mI, m4834resolveBulletTextUnitToPxo2QH7mI, m4834resolveBulletTextUnitToPxo2QH7mI2, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f13), range.getStart(), range.getEnd());
                }
            }
            i11++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m4838setColorRPmYEkk(@k Spannable spannable, long j11, int i11, int i12) {
        if (j11 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m2563toArgb8_81llA(j11)), i11, i12);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i11, int i12) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i11, i12);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i11);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m4503getFontSynthesisZQGJjVo() != null)) {
                g0.n(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m4591getFontStyle4Lr2A7w(), textStyle.m4592getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (v) null) : null, arrayList, new q<SpanStyle, Integer, Integer, g2>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return g2.f100423a;
            }

            public final void invoke(SpanStyle spanStyle, int i12, int i13) {
                Spannable spannable2 = spannable;
                r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> rVar2 = rVar;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                FontStyle m4502getFontStyle4Lr2A7w = spanStyle.m4502getFontStyle4Lr2A7w();
                FontStyle m4667boximpl = FontStyle.m4667boximpl(m4502getFontStyle4Lr2A7w != null ? m4502getFontStyle4Lr2A7w.m4673unboximpl() : FontStyle.Companion.m4677getNormal_LCdwA());
                FontSynthesis m4503getFontSynthesisZQGJjVo = spanStyle.m4503getFontSynthesisZQGJjVo();
                spannable2.setSpan(new TypefaceSpan(rVar2.invoke(fontFamily, fontWeight, m4667boximpl, FontSynthesis.m4678boximpl(m4503getFontSynthesisZQGJjVo != null ? m4503getFontSynthesisZQGJjVo.m4686unboximpl() : FontSynthesis.Companion.m4687getAllGVVA2EU()))), i12, i13, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i11, int i12) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i11, i12);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m4839setFontSizeKmRG4DE(@k Spannable spannable, long j11, @k Density density, int i11, int i12) {
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(d.L0(density.mo376toPxR2X_6o(j11)), false), i11, i12);
        } else if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m5309getValueimpl(j11)), i11, i12);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i11, int i12) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i11, i12);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i11, i12);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m4840setLineHeightKmRG4DE(@k Spannable spannable, long j11, float f11, @k Density density, @k LineHeightStyle lineHeightStyle) {
        float m4835resolveLineHeightInPxo2QH7mI = m4835resolveLineHeightInPxo2QH7mI(j11, f11, density);
        if (Float.isNaN(m4835resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(m4835resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || r0.W7(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m4962isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m4936getTrimEVpEnUU()), LineHeightStyle.Trim.m4963isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m4936getTrimEVpEnUU()), lineHeightStyle.m4934getAlignmentPIaL0Z0(), LineHeightStyle.Mode.m4951equalsimpl0(lineHeightStyle.m4935getModelzQqcRY(), LineHeightStyle.Mode.Companion.m4956getMinimumlzQqcRY())), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m4841setLineHeightr9BaKPg(@k Spannable spannable, long j11, float f11, @k Density density) {
        float m4835resolveLineHeightInPxo2QH7mI = m4835resolveLineHeightInPxo2QH7mI(j11, f11, density);
        if (Float.isNaN(m4835resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(m4835resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(@k Spannable spannable, @l LocaleList localeList, int i11, int i12) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i11, i12);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i11, int i12) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m2563toArgb8_81llA(shadow.m2834getColor0d7_KjU()), Float.intBitsToFloat((int) (shadow.m2835getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (shadow.m2835getOffsetF1C5BW0() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i11, i12);
        }
    }

    public static final void setSpan(@k Spannable spannable, @k Object obj, int i11, int i12) {
        spannable.setSpan(obj, i11, i12, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i11, int i12, Density density) {
        m4837setBaselineShift0ocSgnM(spannable, spanStyle.m4499getBaselineShift5SSeXJ0(), i11, i12);
        m4838setColorRPmYEkk(spannable, spanStyle.m4500getColor0d7_KjU(), i11, i12);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i11, i12);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i11, i12);
        m4839setFontSizeKmRG4DE(spannable, spanStyle.m4501getFontSizeXSAIIZE(), density, i11, i12);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i11, i12);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i11, i12);
        setLocaleList(spannable, spanStyle.getLocaleList(), i11, i12);
        m4836setBackgroundRPmYEkk(spannable, spanStyle.m4498getBackground0d7_KjU(), i11, i12);
        setShadow(spannable, spanStyle.getShadow(), i11, i12);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i11, i12);
    }

    public static final void setSpanStyles(@k Spannable spannable, @k TextStyle textStyle, @k List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, @k Density density, @k r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        MetricAffectingSpan m4833createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, rVar);
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        int size = list2.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i11);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z11 = true;
                    }
                }
            }
        }
        if (z11) {
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i12);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m4833createLetterSpacingSpaneAf_CNQ = m4833createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).m4504getLetterSpacingXSAIIZE(), density)) != null) {
                        setSpan(spannable, m4833createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(@k Spannable spannable, @l TextDecoration textDecoration, int i11, int i12) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i11, i12);
        }
    }

    public static final void setTextIndent(@k Spannable spannable, @l TextIndent textIndent, float f11, @k Density density) {
        if (textIndent != null) {
            if ((TextUnit.m5306equalsimpl0(textIndent.m5001getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m5306equalsimpl0(textIndent.m5002getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnit.m5307getRawTypeimpl(textIndent.m5001getFirstLineXSAIIZE()) == 0 || TextUnit.m5307getRawTypeimpl(textIndent.m5002getRestLineXSAIIZE()) == 0) {
                return;
            }
            long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(textIndent.m5001getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float f12 = 0.0f;
            float mo376toPxR2X_6o = TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA()) ? density.mo376toPxR2X_6o(textIndent.m5001getFirstLineXSAIIZE()) : TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA()) ? TextUnit.m5309getValueimpl(textIndent.m5001getFirstLineXSAIIZE()) * f11 : 0.0f;
            long m5308getTypeUIouoOA2 = TextUnit.m5308getTypeUIouoOA(textIndent.m5002getRestLineXSAIIZE());
            if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA2, companion.m5342getSpUIouoOA())) {
                f12 = density.mo376toPxR2X_6o(textIndent.m5002getRestLineXSAIIZE());
            } else if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA2, companion.m5341getEmUIouoOA())) {
                f12 = TextUnit.m5309getValueimpl(textIndent.m5002getRestLineXSAIIZE()) * f11;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(mo376toPxR2X_6o), (int) Math.ceil(f12)), 0, spannable.length());
        }
    }
}
