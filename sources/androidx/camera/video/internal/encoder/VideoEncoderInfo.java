package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VideoEncoderInfo extends EncoderInfo {
    boolean canSwapWidthHeight();

    int getHeightAlignment();

    @NonNull
    Range<Integer> getSupportedBitrateRange();

    @NonNull
    Range<Integer> getSupportedHeights();

    @NonNull
    Range<Integer> getSupportedHeightsFor(int i11);

    @NonNull
    Range<Integer> getSupportedWidths();

    @NonNull
    Range<Integer> getSupportedWidthsFor(int i11);

    int getWidthAlignment();

    boolean isSizeSupported(int i11, int i12);

    default boolean isSizeSupportedAllowSwapping(int i11, int i12) {
        if (isSizeSupported(i11, i12)) {
            return true;
        }
        return canSwapWidthHeight() && isSizeSupported(i12, i11);
    }
}
