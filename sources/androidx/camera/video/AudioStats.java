package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class AudioStats {
    public static final double AUDIO_AMPLITUDE_NONE = 0.0d;
    public static final int AUDIO_STATE_ACTIVE = 0;
    public static final int AUDIO_STATE_DISABLED = 1;
    public static final int AUDIO_STATE_ENCODER_ERROR = 3;
    public static final int AUDIO_STATE_MUTED = 5;
    public static final int AUDIO_STATE_SOURCE_ERROR = 4;
    public static final int AUDIO_STATE_SOURCE_SILENCED = 2;
    private static final Set<Integer> ERROR_STATES = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface AudioState {
    }

    @NonNull
    public static AudioStats of(int i11, @Nullable Throwable th2, double d11) {
        return new AutoValue_AudioStats(i11, d11, th2);
    }

    @OptIn(markerClass = {ExperimentalAudioApi.class})
    public double getAudioAmplitude() {
        if (getAudioState() == 1) {
            return 0.0d;
        }
        return getAudioAmplitudeInternal();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract double getAudioAmplitudeInternal();

    public abstract int getAudioState();

    @Nullable
    public abstract Throwable getErrorCause();

    public boolean hasAudio() {
        return getAudioState() == 0;
    }

    public boolean hasError() {
        return ERROR_STATES.contains(Integer.valueOf(getAudioState()));
    }
}
