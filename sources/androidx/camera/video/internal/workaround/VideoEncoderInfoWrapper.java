package androidx.camera.video.internal.workaround;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.core.util.Preconditions;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class VideoEncoderInfoWrapper implements VideoEncoderInfo {
    private static final int HEIGHT_4KDCI = 2160;
    private static final String TAG = "VideoEncoderInfoWrapper";
    private static final int WIDTH_4KDCI = 4096;
    private final Set<Size> mExtraSupportedSizes;
    private final Range<Integer> mSupportedHeights;
    private final Range<Integer> mSupportedWidths;
    private final VideoEncoderInfo mVideoEncoderInfo;

    private VideoEncoderInfoWrapper(@NonNull VideoEncoderInfo videoEncoderInfo) {
        HashSet hashSet = new HashSet();
        this.mExtraSupportedSizes = hashSet;
        this.mVideoEncoderInfo = videoEncoderInfo;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        this.mSupportedWidths = Range.create(Integer.valueOf(widthAlignment), Integer.valueOf(((int) Math.ceil(4096.0d / widthAlignment)) * widthAlignment));
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        this.mSupportedHeights = Range.create(Integer.valueOf(heightAlignment), Integer.valueOf(((int) Math.ceil(2160.0d / heightAlignment)) * heightAlignment));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.getExtraSupportedSizes());
    }

    private void addExtraSupportedSize(@NonNull Size size) {
        this.mExtraSupportedSizes.add(size);
    }

    @NonNull
    public static VideoEncoderInfo from(@NonNull VideoEncoderInfo videoEncoderInfo, @Nullable Size size) {
        if (!(videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            if (DeviceQuirks.get(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                    Logger.w(TAG, String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
                }
            }
            videoEncoderInfo = new VideoEncoderInfoWrapper(videoEncoderInfo);
        }
        if (size != null && (videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            ((VideoEncoderInfoWrapper) videoEncoderInfo).addExtraSupportedSize(size);
        }
        return videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return this.mVideoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.mVideoEncoderInfo.getHeightAlignment();
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
        return this.mSupportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeightsFor(int i11) {
        Preconditions.checkArgument(this.mSupportedWidths.contains((Range<Integer>) Integer.valueOf(i11)) && i11 % this.mVideoEncoderInfo.getWidthAlignment() == 0, "Not supported width: " + i11 + " which is not in " + this.mSupportedWidths + " or can not be divided by alignment " + this.mVideoEncoderInfo.getWidthAlignment());
        return this.mSupportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidths() {
        return this.mSupportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidthsFor(int i11) {
        Preconditions.checkArgument(this.mSupportedHeights.contains((Range<Integer>) Integer.valueOf(i11)) && i11 % this.mVideoEncoderInfo.getHeightAlignment() == 0, "Not supported height: " + i11 + " which is not in " + this.mSupportedHeights + " or can not be divided by alignment " + this.mVideoEncoderInfo.getHeightAlignment());
        return this.mSupportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.mVideoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i11, int i12) {
        if (this.mVideoEncoderInfo.isSizeSupported(i11, i12)) {
            return true;
        }
        for (Size size : this.mExtraSupportedSizes) {
            if (size.getWidth() == i11 && size.getHeight() == i12) {
                return true;
            }
        }
        return this.mSupportedWidths.contains((Range<Integer>) Integer.valueOf(i11)) && this.mSupportedHeights.contains((Range<Integer>) Integer.valueOf(i12)) && i11 % this.mVideoEncoderInfo.getWidthAlignment() == 0 && i12 % this.mVideoEncoderInfo.getHeightAlignment() == 0;
    }
}
