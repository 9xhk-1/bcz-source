package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final ImmutableIntArray compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i11, @Nullable int[] iArr) {
        this.majorBrand = i11;
        this.compatibleBrands = iArr != null ? ImmutableIntArray.copyOf(iArr) : ImmutableIntArray.of();
    }
}
