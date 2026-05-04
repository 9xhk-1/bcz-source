package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DensityKt {
    @Stable
    @k
    public static final Density Density(float f11, float f12) {
        return new DensityImpl(f11, f12);
    }

    public static /* synthetic */ Density Density$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        return Density(f11, f12);
    }
}
