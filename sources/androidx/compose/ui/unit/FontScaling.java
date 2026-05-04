package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nFontScaling.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,64:1\n52#2,5:65\n*S KotlinDebug\n*F\n+ 1 FontScaling.android.kt\nandroidx/compose/ui/unit/FontScaling\n*L\n55#1:65,5\n*E\n"})
/* loaded from: classes2.dex */
public interface FontScaling {
    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo372toDpGaN1DYA(long j11) {
        if (!TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnitType.Companion.m5342getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return Dp.m5115constructorimpl(TextUnit.m5309getValueimpl(j11) * getFontScale());
        }
        FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
        float m5309getValueimpl = TextUnit.m5309getValueimpl(j11);
        return forScale == null ? Dp.m5115constructorimpl(m5309getValueimpl * getFontScale()) : Dp.m5115constructorimpl(forScale.convertSpToDp(m5309getValueimpl));
    }

    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo379toSp0xMU5do(float f11) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return TextUnitKt.getSp(f11 / getFontScale());
        }
        FontScaleConverter forScale = fontScaleConverterFactory.forScale(getFontScale());
        return TextUnitKt.getSp(forScale != null ? forScale.convertDpToSp(f11) : f11 / getFontScale());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5226toDpGaN1DYA(@k FontScaling fontScaling, long j11) {
            return FontScaling.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5227toSp0xMU5do(@k FontScaling fontScaling, float f11) {
            return FontScaling.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }
    }
}
