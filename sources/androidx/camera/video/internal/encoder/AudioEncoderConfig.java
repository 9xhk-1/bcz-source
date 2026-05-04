package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import androidx.media3.common.MimeTypes;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.ijk.media.player.IjkMediaMeta;
import eo.c;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class AudioEncoderConfig implements EncoderConfig {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c.a
    public static abstract class Builder {
        @NonNull
        public abstract AudioEncoderConfig autoBuild();

        @NonNull
        public AudioEncoderConfig build() {
            AudioEncoderConfig autoBuild = autoBuild();
            if (Objects.equals(autoBuild.getMimeType(), MimeTypes.AUDIO_AAC) && autoBuild.getProfile() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return autoBuild;
        }

        @NonNull
        public abstract Builder setBitrate(int i11);

        @NonNull
        public abstract Builder setChannelCount(int i11);

        @NonNull
        public abstract Builder setInputTimebase(@NonNull Timebase timebase);

        @NonNull
        public abstract Builder setMimeType(@NonNull String str);

        @NonNull
        public abstract Builder setProfile(int i11);

        @NonNull
        public abstract Builder setSampleRate(int i11);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AudioEncoderConfig.Builder().setProfile(-1);
    }

    public abstract int getBitrate();

    public abstract int getChannelCount();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract int getSampleRate();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public MediaFormat toMediaFormat() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(getMimeType(), getSampleRate(), getChannelCount());
        createAudioFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, getBitrate());
        if (getProfile() != -1) {
            if (getMimeType().equals(MimeTypes.AUDIO_AAC)) {
                createAudioFormat.setInteger("aac-profile", getProfile());
                return createAudioFormat;
            }
            createAudioFormat.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, getProfile());
        }
        return createAudioFormat;
    }
}
