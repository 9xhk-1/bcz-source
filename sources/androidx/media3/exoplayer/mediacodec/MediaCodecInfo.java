package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.util.Objects;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    @VisibleForTesting
    public MediaCodecInfo(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z11;
        this.softwareOnly = z12;
        this.vendor = z13;
        this.adaptive = z14;
        this.tunneling = z15;
        this.secure = z16;
        this.detachedSurfaceSupported = z17;
        this.isVideo = MimeTypes.isVideo(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i11) {
        if (i11 > 1 || ((Util.SDK_INT >= 26 && i11 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i11;
        }
        int i12 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i11 + " to " + i12 + "]");
        return i12;
    }

    private static Point alignVideoSize(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i11, widthAlignment) * widthAlignment, Util.ceilDivide(i12, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Point alignVideoSize = alignVideoSize(videoCapabilities, i11, i12);
        int i13 = alignVideoSize.x;
        int i14 = alignVideoSize.y;
        return (d11 == -1.0d || d11 < 1.0d) ? videoCapabilities.isSizeSupported(i13, i14) : videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d11));
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i11 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i11;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @RequiresApi(23)
    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean isCodecProfileAndLevelSupported(Format format, boolean z11) {
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        String str = format.sampleMimeType;
        if (str != null && str.equals(MimeTypes.VIDEO_MV_HEVC)) {
            String normalizeMimeType = MimeTypes.normalizeMimeType(this.codecMimeType);
            if (normalizeMimeType.equals(MimeTypes.VIDEO_MV_HEVC)) {
                return true;
            }
            if (normalizeMimeType.equals(MimeTypes.VIDEO_H265)) {
                codecProfileAndLevel = MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(format);
            }
        }
        if (codecProfileAndLevel == null) {
            return true;
        }
        int intValue = ((Integer) codecProfileAndLevel.first).intValue();
        int intValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            String str2 = this.mimeType;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    intValue2 = 0;
                    intValue = 2;
                    break;
                case "video/avc":
                    intValue = 8;
                    intValue2 = 0;
                    break;
            }
        }
        if (!this.isVideo && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (Util.SDK_INT <= 23 && MimeTypes.VIDEO_VP9.equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z11) && !needsProfileExcludedWorkaround(this.mimeType, intValue))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + format.codecs + j2.O + this.codecMimeType);
        return false;
    }

    private boolean isCompressedAudioBitDepthSupported(Format format) {
        return (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_FLAC) && format.pcmEncoding == 22 && Util.SDK_INT < 34 && this.name.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean isDetachedSurfaceSupported(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !needsDetachedSurfaceUnsupportedWorkaround();
    }

    private boolean isSampleMimeTypeSupported(Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        Log.d(TAG, "AssumedSupport [" + str + "] [" + this.name + j2.O + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private void logNoSupport(String str) {
        Log.d(TAG, "NoSupport [" + str + "] [" + this.name + j2.O + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDetachedSurfaceUnsupportedWorkaround() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        if (Util.SDK_INT > 22) {
            return false;
        }
        String str2 = Build.MODEL;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i11) {
        if (!MimeTypes.VIDEO_H265.equals(str) || 2 != i11) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z11, z12, z13, (z14 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z15 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    @Nullable
    public Point alignVideoSizeV21(int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i11, i12);
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        Format format3;
        Format format4;
        int i11 = !Objects.equals(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i11 |= 1024;
            }
            if (!this.adaptive && (format.width != format2.width || format.height != format2.height)) {
                i11 |= 512;
            }
            if ((!ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !Objects.equals(format.colorInfo, format2.colorInfo)) {
                i11 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.channelCount != format4.channelCount) {
                i11 |= 4096;
            }
            if (format3.sampleRate != format4.sampleRate) {
                i11 |= 8192;
            }
            if (format3.pcmEncoding != format4.pcmEncoding) {
                i11 |= 16384;
            }
            if (i11 == 0 && MimeTypes.AUDIO_AAC.equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format3);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(format4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int intValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int intValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.initializationDataEquals(format4)) {
                i11 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format3, format4, 0, i11);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i11) {
            return true;
        }
        logNoSupport("channelCount.support, " + i11);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i11)) {
            return true;
        }
        logNoSupport("sampleRate.support, " + i11);
        return false;
    }

    public boolean isFormatFunctionallySupported(Format format) {
        return isSampleMimeTypeSupported(format) && isCodecProfileAndLevelSupported(format, false) && isCompressedAudioBitDepthSupported(format);
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i11;
        int i12;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(format, true) || !isCompressedAudioBitDepthSupported(format)) {
            return false;
        }
        if (!this.isVideo) {
            int i13 = format.sampleRate;
            return (i13 == -1 || isAudioSampleRateSupportedV21(i13)) && ((i11 = format.channelCount) == -1 || isAudioChannelCountSupportedV21(i11));
        }
        int i14 = format.width;
        if (i14 <= 0 || (i12 = format.height) <= 0) {
            return true;
        }
        return isVideoSizeAndRateSupportedV21(i14, i12, format.frameRate);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Util.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (Util.SDK_INT >= 29) {
            int areResolutionAndFrameRateCovered = MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i11, i12, d11);
            if (areResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (areResolutionAndFrameRateCovered == 1) {
                logNoSupport("sizeAndRate.cover, " + i11 + "x" + i12 + EmailAutoCompleteEditText.f17091d + d11);
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i11, i12, d11)) {
            if (i11 >= i12 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i12, i11, d11)) {
                logNoSupport("sizeAndRate.support, " + i11 + "x" + i12 + EmailAutoCompleteEditText.f17091d + d11);
                return false;
            }
            logAssumedSupport("sizeAndRate.rotated, " + i11 + "x" + i12 + EmailAutoCompleteEditText.f17091d + d11);
        }
        return true;
    }

    public String toString() {
        return this.name;
    }
}
