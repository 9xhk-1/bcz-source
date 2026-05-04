package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SwappedVideoEncoderInfo implements VideoEncoderInfo {
    private final VideoEncoderInfo mVideoEncoderInfo;

    public SwappedVideoEncoderInfo(@NonNull VideoEncoderInfo videoEncoderInfo) {
        Preconditions.checkArgument(videoEncoderInfo.canSwapWidthHeight());
        this.mVideoEncoderInfo = videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return this.mVideoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.mVideoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @NonNull
    public String getName() {
        return this.mVideoEncoderInfo.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedBitrateRange() {
        return this.mVideoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeights() {
        return this.mVideoEncoderInfo.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeightsFor(int i11) {
        return this.mVideoEncoderInfo.getSupportedWidthsFor(i11);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidths() {
        return this.mVideoEncoderInfo.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidthsFor(int i11) {
        return this.mVideoEncoderInfo.getSupportedHeightsFor(i11);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.mVideoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i11, int i12) {
        return this.mVideoEncoderInfo.isSizeSupported(i12, i11);
    }
}
