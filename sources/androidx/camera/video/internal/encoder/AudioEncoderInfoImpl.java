package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.utils.CodecUtil;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AudioEncoderInfoImpl extends EncoderInfoImpl implements AudioEncoderInfo {
    private final MediaCodecInfo.AudioCapabilities mAudioCapabilities;

    public AudioEncoderInfoImpl(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.mCodecCapabilities.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.mAudioCapabilities = audioCapabilities;
    }

    @NonNull
    public static AudioEncoderInfoImpl from(@NonNull AudioEncoderConfig audioEncoderConfig) throws InvalidConfigException {
        return new AudioEncoderInfoImpl(CodecUtil.findCodecAndGetCodecInfo(audioEncoderConfig), audioEncoderConfig.getMimeType());
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    @NonNull
    public Range<Integer> getBitrateRange() {
        return this.mAudioCapabilities.getBitrateRange();
    }
}
