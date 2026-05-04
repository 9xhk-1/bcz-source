package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.core.util.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AudioSettingsDefaultResolver implements Supplier<AudioSettings> {
    private static final String TAG = "DefAudioResolver";
    private final AudioSpec mAudioSpec;

    public AudioSettingsDefaultResolver(@NonNull AudioSpec audioSpec) {
        this.mAudioSpec = audioSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public AudioSettings get() {
        int selectSampleRateOrNearestSupported;
        int resolveAudioSource = AudioConfigUtil.resolveAudioSource(this.mAudioSpec);
        int resolveAudioSourceFormat = AudioConfigUtil.resolveAudioSourceFormat(this.mAudioSpec);
        int channelCount = this.mAudioSpec.getChannelCount();
        if (channelCount == -1) {
            Logger.d(TAG, "Using fallback AUDIO channel count: 1");
            channelCount = 1;
        } else {
            Logger.d(TAG, "Using supplied AUDIO channel count: " + channelCount);
        }
        Range<Integer> sampleRate = this.mAudioSpec.getSampleRate();
        if (AudioSpec.SAMPLE_RATE_RANGE_AUTO.equals(sampleRate)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Using fallback AUDIO sample rate: ");
            selectSampleRateOrNearestSupported = 44100;
            sb2.append(44100);
            sb2.append("Hz");
            Logger.d(TAG, sb2.toString());
        } else {
            selectSampleRateOrNearestSupported = AudioConfigUtil.selectSampleRateOrNearestSupported(sampleRate, channelCount, resolveAudioSourceFormat, sampleRate.getUpper().intValue());
            Logger.d(TAG, "Using AUDIO sample rate resolved from AudioSpec: " + selectSampleRateOrNearestSupported + "Hz");
        }
        return AudioSettings.builder().setAudioSource(resolveAudioSource).setAudioFormat(resolveAudioSourceFormat).setChannelCount(channelCount).setSampleRate(selectSampleRateOrNearestSupported).build();
    }
}
