package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalFoundationApi
@u0({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,147:1\n50#2,5:148\n123#3:153\n123#3:154\n363#3:155\n33#4:156\n148#4:160\n53#5,3:157\n60#5:162\n70#5:165\n57#6:161\n61#6:164\n22#7:163\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:148,5\n74#1:153\n76#1:154\n86#1:155\n87#1:156\n94#1:160\n87#1:157,3\n95#1:162\n95#1:165\n95#1:161\n95#1:164\n95#1:163\n*E\n"})
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    @k
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo900measure0kLqBqw(int i11, long j11);

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo372toDpGaN1DYA(long j11) {
        if (!TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnitType.Companion.m5342getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return Dp.m5115constructorimpl(TextUnit.m5309getValueimpl(j11) * getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo374toDpu2uoSUM(int i11) {
        return Dp.m5115constructorimpl(i11 / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo375toDpSizekrfVVM(long j11) {
        return j11 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m5137DpSizeYgX7TsA(mo373toDpu2uoSUM(Float.intBitsToFloat((int) (j11 >> 32))), mo373toDpu2uoSUM(Float.intBitsToFloat((int) (j11 & 4294967295L)))) : DpSize.Companion.m5222getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo378toSizeXkaWNTQ(long j11) {
        if (j11 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m2345getUnspecifiedNHjbRc();
        }
        float mo377toPx0680j_4 = mo377toPx0680j_4(DpSize.m5213getWidthD9Ej5fM(j11));
        float mo377toPx0680j_42 = mo377toPx0680j_4(DpSize.m5211getHeightD9Ej5fM(j11));
        return Size.m2328constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_4) << 32));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo379toSp0xMU5do(float f11) {
        return TextUnitKt.getSp(f11 / getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo380toSpkPz2Gy4(float f11) {
        return TextUnitKt.getSp(f11 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo381toSpkPz2Gy4(int i11) {
        return TextUnitKt.getSp(i11 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo373toDpu2uoSUM(float f11) {
        return Dp.m5115constructorimpl(f11 / getDensity());
    }
}
