package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidDensity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDensity.android.kt\nandroidx/compose/ui/unit/DensityWithConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes2.dex */
final class DensityWithConverter implements Density {

    @k
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    public DensityWithConverter(float f11, float f12, @k FontScaleConverter fontScaleConverter) {
        this.density = f11;
        this.fontScale = f12;
        this.converter = fontScaleConverter;
    }

    private final FontScaleConverter component3() {
        return this.converter;
    }

    public static /* synthetic */ DensityWithConverter copy$default(DensityWithConverter densityWithConverter, float f11, float f12, FontScaleConverter fontScaleConverter, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = densityWithConverter.density;
        }
        if ((i11 & 2) != 0) {
            f12 = densityWithConverter.fontScale;
        }
        if ((i11 & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f11, f12, fontScaleConverter);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    @k
    public final DensityWithConverter copy(float f11, float f12, @k FontScaleConverter fontScaleConverter) {
        return new DensityWithConverter(f11, f12, fontScaleConverter);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && g0.g(this.converter, densityWithConverter.converter);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (((Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo372toDpGaN1DYA(long j11) {
        if (TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(j11), TextUnitType.Companion.m5342getSpUIouoOA())) {
            return Dp.m5115constructorimpl(this.converter.convertSpToDp(TextUnit.m5309getValueimpl(j11)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo379toSp0xMU5do(float f11) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f11));
    }

    @k
    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }
}
