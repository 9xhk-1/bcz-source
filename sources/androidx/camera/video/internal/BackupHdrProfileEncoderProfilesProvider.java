package androidx.camera.video.internal;

import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "BackupHdrProfileEncoderProfilesProvider";
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;
    private final Function<VideoEncoderConfig, VideoEncoderInfo> mVideoEncoderInfoFinder;

    public BackupHdrProfileEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mVideoEncoderInfoFinder = function;
    }

    @Nullable
    private EncoderProfilesProxy appendBackupVideoProfile(@Nullable EncoderProfilesProxy encoderProfilesProxy, int i11, int i12) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(encoderProfilesProxy.getVideoProfiles());
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        while (true) {
            if (!it.hasNext()) {
                videoProfileProxy = null;
                break;
            }
            videoProfileProxy = it.next();
            if (videoProfileProxy.getHdrFormat() == 0) {
                break;
            }
        }
        EncoderProfilesProxy.VideoProfileProxy validateOrAdapt = validateOrAdapt(generateBackupProfile(videoProfileProxy, i11, i12), this.mVideoEncoderInfoFinder);
        if (validateOrAdapt != null) {
            arrayList.add(validateOrAdapt);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    private static int deriveCodec(int i11) {
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i11);
    }

    @NonNull
    private static String deriveMediaType(int i11) {
        return EncoderProfilesProxy.getVideoCodecMimeType(i11);
    }

    private static int deriveProfile(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return 4096;
        }
        if (i11 == 3) {
            return 8192;
        }
        if (i11 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i11);
    }

    @Nullable
    private static EncoderProfilesProxy.VideoProfileProxy generateBackupProfile(@Nullable EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i11, int i12) {
        if (videoProfileProxy == null) {
            return null;
        }
        int codec = videoProfileProxy.getCodec();
        String mediaType = videoProfileProxy.getMediaType();
        int profile = videoProfileProxy.getProfile();
        if (i11 != videoProfileProxy.getHdrFormat()) {
            codec = deriveCodec(i11);
            mediaType = deriveMediaType(codec);
            profile = deriveProfile(i11);
        }
        return EncoderProfilesProxy.VideoProfileProxy.create(codec, mediaType, scaleBitrate(videoProfileProxy.getBitrate(), i12, videoProfileProxy.getBitDepth()), videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), profile, i12, videoProfileProxy.getChromaSubsampling(), i11);
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i11) {
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i11))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i11));
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i11)) {
            return null;
        }
        EncoderProfilesProxy appendBackupVideoProfile = appendBackupVideoProfile(this.mEncoderProfilesProvider.getAll(i11), 1, 10);
        this.mEncoderProfilesCache.put(Integer.valueOf(i11), appendBackupVideoProfile);
        return appendBackupVideoProfile;
    }

    @NonNull
    private static EncoderProfilesProxy.VideoProfileProxy modifyBitrate(@NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i11) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), i11, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    private static int scaleBitrate(int i11, int i12, int i13) {
        if (i12 == i13) {
            return i11;
        }
        int doubleValue = (int) (i11 * new Rational(i12, i13).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            Logger.d(TAG, String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(doubleValue)));
        }
        return doubleValue;
    }

    @Nullable
    @VisibleForTesting
    public static EncoderProfilesProxy.VideoProfileProxy validateOrAdapt(@Nullable EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        VideoEncoderConfig videoEncoderConfig;
        VideoEncoderInfo apply;
        if (videoProfileProxy == null || (apply = function.apply((videoEncoderConfig = VideoConfigUtil.toVideoEncoderConfig(videoProfileProxy)))) == null || !apply.isSizeSupportedAllowSwapping(videoProfileProxy.getWidth(), videoProfileProxy.getHeight())) {
            return null;
        }
        int bitrate = videoEncoderConfig.getBitrate();
        int intValue = apply.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate)).intValue();
        return intValue == bitrate ? videoProfileProxy : modifyBitrate(videoProfileProxy, intValue);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i11) {
        return getProfilesInternal(i11);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        return this.mEncoderProfilesProvider.hasProfile(i11) && getProfilesInternal(i11) != null;
    }
}
