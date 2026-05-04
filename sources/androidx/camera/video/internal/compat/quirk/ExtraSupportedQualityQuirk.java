package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.utils.EncoderProfilesUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements Quirk {
    private static final String MOTO_C_FRONT_CAM_ID = "1";

    @Nullable
    private Map<Integer, EncoderProfilesProxy> getExtraEncoderProfilesForMotoC(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        EncoderProfilesProxy all;
        EncoderProfilesProxy.VideoProfileProxy firstVideoProfile;
        if (!"1".equals(cameraInfoInternal.getCameraId()) || encoderProfilesProvider.hasProfile(4) || (firstVideoProfile = EncoderProfilesUtil.getFirstVideoProfile((all = encoderProfilesProvider.getAll(1)))) == null) {
            return null;
        }
        Range<Integer> supportedBitrateRange = getSupportedBitrateRange(firstVideoProfile, function);
        Size size = SizeUtil.RESOLUTION_480P;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy create = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), Collections.singletonList(EncoderProfilesUtil.deriveVideoProfile(firstVideoProfile, size, supportedBitrateRange)));
        HashMap hashMap = new HashMap();
        hashMap.put(4, create);
        if (SizeUtil.getArea(size) > SizeUtil.getArea(new Size(firstVideoProfile.getWidth(), firstVideoProfile.getHeight()))) {
            hashMap.put(1, create);
        }
        return hashMap;
    }

    @NonNull
    private static Range<Integer> getSupportedBitrateRange(@NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        VideoEncoderInfo apply = function.apply(VideoConfigUtil.toVideoEncoderConfig(videoProfileProxy));
        return apply != null ? apply.getSupportedBitrateRange() : VideoSpec.BITRATE_RANGE_AUTO;
    }

    private static boolean isMotoC() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoC();
    }

    @Nullable
    public Map<Integer, EncoderProfilesProxy> getExtraEncoderProfiles(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        return isMotoC() ? getExtraEncoderProfilesForMotoC(cameraInfoInternal, encoderProfilesProvider, function) : Collections.EMPTY_MAP;
    }
}
