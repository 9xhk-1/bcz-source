package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class LinearFontScaleConverter implements FontScaleConverter {
    private final float fontScale;

    public LinearFontScaleConverter(float f11) {
        this.fontScale = f11;
    }

    private final float component1() {
        return this.fontScale;
    }

    public static /* synthetic */ LinearFontScaleConverter copy$default(LinearFontScaleConverter linearFontScaleConverter, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = linearFontScaleConverter.fontScale;
        }
        return linearFontScaleConverter.copy(f11);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f11) {
        return f11 / this.fontScale;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f11) {
        return f11 * this.fontScale;
    }

    @k
    public final LinearFontScaleConverter copy(float f11) {
        return new LinearFontScaleConverter(f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) obj).fontScale) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    @k
    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.fontScale + ')';
    }
}
