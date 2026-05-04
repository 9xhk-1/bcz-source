package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class FontScaleConverterTable implements FontScaleConverter {

    @k
    private final float[] mFromSpValues;

    @k
    private final float[] mToDpValues;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f11, float[] fArr, float[] fArr2) {
            float f12;
            float f13;
            float f14;
            float constrainedMap;
            float abs = Math.abs(f11);
            float signum = Math.signum(f11);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                constrainedMap = fArr2[binarySearch];
            } else {
                int i11 = -(binarySearch + 1);
                int i12 = i11 - 1;
                float f15 = 0.0f;
                if (i12 >= fArr.length - 1) {
                    float f16 = fArr[fArr.length - 1];
                    float f17 = fArr2[fArr.length - 1];
                    if (f16 == 0.0f) {
                        return 0.0f;
                    }
                    return f11 * (f17 / f16);
                }
                if (i12 == -1) {
                    f12 = fArr[0];
                    f14 = fArr2[0];
                    f13 = 0.0f;
                } else {
                    f15 = fArr[i12];
                    f12 = fArr[i11];
                    f13 = fArr2[i12];
                    f14 = fArr2[i11];
                }
                constrainedMap = MathUtils.INSTANCE.constrainedMap(f13, f14, f15, f12, abs);
            }
            return signum * constrainedMap;
        }

        private Companion() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FontScaleConverterTable(@k float[] fArr, @k float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f11) {
        return Companion.lookupAndInterpolate(f11, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f11) {
        return Companion.lookupAndInterpolate(f11, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    @k
    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    @k
    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.mToDpValues);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.mFromSpValues);
        g0.o(arrays, "toString(...)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.mToDpValues);
        g0.o(arrays2, "toString(...)");
        sb2.append(arrays2);
        sb2.append(b.f69928j);
        return sb2.toString();
    }

    @VisibleForTesting
    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMToDpValues$annotations() {
    }
}
