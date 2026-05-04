package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class VideoSize {
    private static final int DEFAULT_HEIGHT = 0;
    private static final float DEFAULT_PIXEL_WIDTH_HEIGHT_RATIO = 1.0f;
    private static final int DEFAULT_WIDTH = 0;

    @IntRange(from = 0)
    public final int height;

    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float pixelWidthHeightRatio;

    @IntRange(from = 0, to = 359)
    @Deprecated
    public final int unappliedRotationDegrees;

    @IntRange(from = 0)
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(3);

    @UnstableApi
    public VideoSize(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        this(i11, i12, 1.0f);
    }

    @UnstableApi
    public static VideoSize fromBundle(Bundle bundle) {
        return new VideoSize(bundle.getInt(FIELD_WIDTH, 0), bundle.getInt(FIELD_HEIGHT, 0), bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.width) * 31) + this.height) * 31) + Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i11 = this.width;
        if (i11 != 0) {
            bundle.putInt(FIELD_WIDTH, i11);
        }
        int i12 = this.height;
        if (i12 != 0) {
            bundle.putInt(FIELD_HEIGHT, i12);
        }
        float f11 = this.pixelWidthHeightRatio;
        if (f11 != 1.0f) {
            bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, f11);
        }
        return bundle;
    }

    @UnstableApi
    public VideoSize(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        this.width = i11;
        this.height = i12;
        this.unappliedRotationDegrees = 0;
        this.pixelWidthHeightRatio = f11;
    }

    @UnstableApi
    @Deprecated
    public VideoSize(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @IntRange(from = 0, to = 359) int i13, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        this(i11, i12, f11);
    }
}
