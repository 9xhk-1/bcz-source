package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n97#1:435\n254#1:440\n363#1:447\n423#1:457\n428#1:459\n139#2:436\n53#3,3:437\n53#3,3:441\n53#3,3:444\n53#3,3:449\n53#3,3:452\n58#4:448\n52#4:455\n52#4:456\n52#4:458\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n108#1:435\n265#1:440\n374#1:447\n433#1:457\n433#1:459\n166#1:436\n188#1:437,3\n280#1:441,3\n287#1:444,3\n379#1:449,3\n397#1:452,3\n379#1:448\n423#1:455\n428#1:456\n433#1:458\n*E\n"})
/* loaded from: classes2.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m5136DpOffsetYgX7TsA(float f11, float f12) {
        return DpOffset.m5171constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m5137DpSizeYgX7TsA(float f11, float f12) {
        return DpSize.m5204constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m5138coerceAtLeastYgX7TsA(float f11, float f12) {
        return Dp.m5115constructorimpl(u.t(f11, f12));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m5139coerceAtMostYgX7TsA(float f11, float f12) {
        return Dp.m5115constructorimpl(u.A(f11, f12));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m5140coerceIn2z7ARbQ(float f11, float f12, float f13) {
        return Dp.m5115constructorimpl(u.H(f11, f12, f13));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m5141getCenterEaSLcWc(long j11) {
        float m5115constructorimpl = Dp.m5115constructorimpl(DpSize.m5213getWidthD9Ej5fM(j11) / 2.0f);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(DpSize.m5211getHeightD9Ej5fM(j11) / 2.0f);
        return DpOffset.m5171constructorimpl((Float.floatToRawIntBits(m5115constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(m5115constructorimpl) << 32));
    }

    public static final float getDp(int i11) {
        return Dp.m5115constructorimpl(i11);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d11) {
    }

    public static final float getHeight(@k DpRect dpRect) {
        return Dp.m5115constructorimpl(dpRect.m5197getBottomD9Ej5fM() - dpRect.m5200getTopD9Ej5fM());
    }

    public static final long getSize(@k DpRect dpRect) {
        return m5137DpSizeYgX7TsA(Dp.m5115constructorimpl(dpRect.m5199getRightD9Ej5fM() - dpRect.m5198getLeftD9Ej5fM()), Dp.m5115constructorimpl(dpRect.m5197getBottomD9Ej5fM() - dpRect.m5200getTopD9Ej5fM()));
    }

    public static final float getWidth(@k DpRect dpRect) {
        return Dp.m5115constructorimpl(dpRect.m5199getRightD9Ej5fM() - dpRect.m5198getLeftD9Ej5fM());
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m5143isFinite0680j_4(float f11) {
        return (Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m5145isSpecified0680j_4(float f11) {
        return !Float.isNaN(f11);
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5147isSpecifiedEaSLcWc(long j11) {
        return j11 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5149isSpecifiedjoFl9I(long j11) {
        return j11 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m5151isUnspecified0680j_4(float f11) {
        return Float.isNaN(f11);
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5153isUnspecifiedEaSLcWc(long j11) {
        return j11 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5155isUnspecifiedjoFl9I(long j11) {
        return j11 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m5157lerpIDex15A(long j11, long j12, float f11) {
        float m5158lerpMdfbLM = m5158lerpMdfbLM(DpSize.m5213getWidthD9Ej5fM(j11), DpSize.m5213getWidthD9Ej5fM(j12), f11);
        float m5158lerpMdfbLM2 = m5158lerpMdfbLM(DpSize.m5211getHeightD9Ej5fM(j11), DpSize.m5211getHeightD9Ej5fM(j12), f11);
        return DpSize.m5204constructorimpl((Float.floatToRawIntBits(m5158lerpMdfbLM) << 32) | (Float.floatToRawIntBits(m5158lerpMdfbLM2) & 4294967295L));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m5158lerpMdfbLM(float f11, float f12, float f13) {
        return Dp.m5115constructorimpl(MathHelpersKt.lerp(f11, f12, f13));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m5159lerpxhh869w(long j11, long j12, float f11) {
        float lerp = MathHelpersKt.lerp(DpOffset.m5176getXD9Ej5fM(j11), DpOffset.m5176getXD9Ej5fM(j12), f11);
        float lerp2 = MathHelpersKt.lerp(DpOffset.m5178getYD9Ej5fM(j11), DpOffset.m5178getYD9Ej5fM(j12), f11);
        return DpOffset.m5171constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m5160maxYgX7TsA(float f11, float f12) {
        return Dp.m5115constructorimpl(Math.max(f11, f12));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m5161minYgX7TsA(float f11, float f12) {
        return Dp.m5115constructorimpl(Math.min(f11, f12));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m5162takeOrElseD5KLDUw(float f11, @k a<Dp> aVar) {
        return !Float.isNaN(f11) ? f11 : aVar.invoke().m5129unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m5163takeOrElsegVKV90s(long j11, @k a<DpOffset> aVar) {
        return j11 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j11 : aVar.invoke().m5184unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m5164takeOrElseitqla9I(long j11, @k a<DpSize> aVar) {
        return j11 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j11 : aVar.invoke().m5221unboximpl();
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5166times3ABfNKs(float f11, float f12) {
        return Dp.m5115constructorimpl(f11 * f12);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5169times6HolHcs(int i11, long j11) {
        return DpSize.m5219timesGh9hcWk(j11, i11);
    }

    public static final float getDp(double d11) {
        return Dp.m5115constructorimpl((float) d11);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f11) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5165times3ABfNKs(double d11, float f11) {
        return Dp.m5115constructorimpl(((float) d11) * f11);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5168times6HolHcs(float f11, long j11) {
        return DpSize.m5218timesGh9hcWk(j11, f11);
    }

    public static final float getDp(float f11) {
        return Dp.m5115constructorimpl(f11);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i11) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5167times3ABfNKs(int i11, float f11) {
        return Dp.m5115constructorimpl(i11 * f11);
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5142getCenterEaSLcWc$annotations(long j11) {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5144isFinite0680j_4$annotations(float f11) {
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5146isSpecified0680j_4$annotations(float f11) {
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5148isSpecifiedEaSLcWc$annotations(long j11) {
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5150isSpecifiedjoFl9I$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5152isUnspecified0680j_4$annotations(float f11) {
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5154isUnspecifiedEaSLcWc$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5156isUnspecifiedjoFl9I$annotations(long j11) {
    }
}
