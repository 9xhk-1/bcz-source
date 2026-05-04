package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import eo.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c.a
    public static abstract class Builder {
        public abstract AudioSettings autoBuild();

        @NonNull
        public final AudioSettings build() {
            AudioSettings autoBuild = autoBuild();
            String str = "";
            if (autoBuild.getAudioSource() == -1) {
                str = " audioSource";
            }
            if (autoBuild.getSampleRate() <= 0) {
                str = str + " sampleRate";
            }
            if (autoBuild.getChannelCount() <= 0) {
                str = str + " channelCount";
            }
            if (autoBuild.getAudioFormat() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return autoBuild;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        @NonNull
        public abstract Builder setAudioFormat(int i11);

        @NonNull
        public abstract Builder setAudioSource(int i11);

        @NonNull
        public abstract Builder setChannelCount(@IntRange(from = 1) int i11);

        @NonNull
        public abstract Builder setSampleRate(@IntRange(from = 1) int i11);
    }

    @NonNull
    @SuppressLint({"Range"})
    public static Builder builder() {
        return new AutoValue_AudioSettings.Builder().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    @IntRange(from = 1)
    public abstract int getChannelCount();

    @IntRange(from = 1)
    public abstract int getSampleRate();

    @NonNull
    public abstract Builder toBuilder();
}
