package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
    }

    public static /* synthetic */ int a(int i11, Integer num, Integer num2) {
        int abs = Math.abs(num.intValue() - i11) - Math.abs(num2.intValue() - i11);
        return (int) (abs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(abs));
    }

    @NonNull
    public static AudioEncoderConfig resolveAudioEncoderConfig(@NonNull AudioMimeInfo audioMimeInfo, @NonNull Timebase timebase, @NonNull AudioSettings audioSettings, @NonNull AudioSpec audioSpec) {
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        return (AudioEncoderConfig) (compatibleAudioProfile != null ? new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings, compatibleAudioProfile) : new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings)).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.camera.video.internal.config.AudioMimeInfo resolveAudioMimeInfo(@androidx.annotation.NonNull androidx.camera.video.MediaSpec r8, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r9) {
        /*
            int r0 = r8.getOutputFormat()
            java.lang.String r0 = androidx.camera.video.MediaSpec.outputFormatToAudioMime(r0)
            int r1 = r8.getOutputFormat()
            int r1 = androidx.camera.video.MediaSpec.outputFormatToAudioProfile(r1)
            if (r9 == 0) goto Lca
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r2 = r9.getDefaultAudioProfile()
            if (r2 == 0) goto Lca
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r9 = r9.getDefaultAudioProfile()
            java.lang.String r2 = r9.getMediaType()
            int r3 = r9.getProfile()
            java.lang.String r4 = "audio/none"
            boolean r4 = java.util.Objects.equals(r2, r4)
            java.lang.String r5 = ")]"
            java.lang.String r6 = "AudioConfigUtil"
            java.lang.String r7 = "(profile: "
            if (r4 == 0) goto L51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
            goto Lca
        L51:
            int r8 = r8.getOutputFormat()
            r4 = -1
            if (r8 != r4) goto L78
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
            r0 = r2
            r1 = r3
            goto Lcb
        L78:
            boolean r8 = java.util.Objects.equals(r0, r2)
            if (r8 == 0) goto L9f
            if (r1 != r3) goto L9f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: "
            r8.append(r0)
            r8.append(r2)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
            r0 = r2
            goto Lcb
        L9f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: "
            r8.append(r9)
            r8.append(r2)
            r8.append(r7)
            r8.append(r3)
            java.lang.String r9 = "), chosen mime type: "
            r8.append(r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
        Lca:
            r9 = 0
        Lcb:
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r8 = androidx.camera.video.internal.config.AudioMimeInfo.builder(r0)
            java.lang.Object r8 = r8.setProfile(r1)
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r8 = (androidx.camera.video.internal.config.AudioMimeInfo.Builder) r8
            if (r9 == 0) goto Lda
            r8.setCompatibleAudioProfile(r9)
        Lda:
            androidx.camera.video.internal.config.AudioMimeInfo r8 = r8.build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioMimeInfo(androidx.camera.video.MediaSpec, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy):androidx.camera.video.internal.config.AudioMimeInfo");
    }

    @NonNull
    public static AudioSettings resolveAudioSettings(@NonNull AudioMimeInfo audioMimeInfo, @NonNull AudioSpec audioSpec) {
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        return (AudioSettings) (compatibleAudioProfile != null ? new AudioSettingsAudioProfileResolver(audioSpec, compatibleAudioProfile) : new AudioSettingsDefaultResolver(audioSpec)).get();
    }

    public static int resolveAudioSource(@NonNull AudioSpec audioSpec) {
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    public static int resolveAudioSourceFormat(@NonNull AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    public static int scaleAndClampBitrate(int i11, int i12, int i13, int i14, int i15, Range<Integer> range) {
        int doubleValue = (int) (i11 * new Rational(i12, i13).doubleValue() * new Rational(i14, i15).doubleValue());
        String format = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(doubleValue)) : "";
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            doubleValue = clamp.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, clamp);
            }
        }
        Logger.d(TAG, format);
        return doubleValue;
    }

    public static int selectSampleRateOrNearestSupported(@NonNull Range<Integer> range, int i11, int i12, final int i13) {
        ArrayList arrayList = null;
        int i14 = 0;
        int i15 = i13;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(i15))) {
                Logger.d(TAG, "Sample rate " + i15 + "Hz is not in target range " + range);
            } else {
                if (AudioSource.isSettingsSupported(i15, i11, i12)) {
                    return i15;
                }
                Logger.d(TAG, "Sample rate " + i15 + "Hz is not supported by audio source with channel count " + i11 + " and source format " + i12);
            }
            if (arrayList == null) {
                Logger.d(TAG, "Trying common sample rates in proximity order to target " + i13 + "Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AudioConfigUtil.a(i13, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i14 >= arrayList.size()) {
                Logger.d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i15 = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }
}
