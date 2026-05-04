package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyGridSlots {
    public static final int $stable = 8;

    @k
    private final int[] positions;

    @k
    private final int[] sizes;

    public LazyGridSlots(@k int[] iArr, @k int[] iArr2) {
        this.sizes = iArr;
        this.positions = iArr2;
    }

    @k
    public final int[] getPositions() {
        return this.positions;
    }

    @k
    public final int[] getSizes() {
        return this.sizes;
    }
}
