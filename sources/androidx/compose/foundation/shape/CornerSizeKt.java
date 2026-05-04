package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CornerSizeKt {

    @k
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    @Stable
    @k
    public static final CornerSize CornerSize(float f11) {
        return new PxCornerSize(f11);
    }

    @Stable
    @k
    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m1011CornerSize0680j_4(float f11) {
        return new DpCornerSize(f11, null);
    }

    @k
    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    @Stable
    @k
    public static final CornerSize CornerSize(@IntRange(from = 0, to = 100) int i11) {
        return new PercentCornerSize(i11);
    }

    @Stable
    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }
}
