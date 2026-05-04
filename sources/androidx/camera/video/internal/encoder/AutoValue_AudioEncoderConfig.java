package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_AudioEncoderConfig extends AudioEncoderConfig {
    private final int bitrate;
    private final int channelCount;
    private final Timebase inputTimebase;
    private final String mimeType;
    private final int profile;
    private final int sampleRate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder extends AudioEncoderConfig.Builder {
        private Integer bitrate;
        private Integer channelCount;
        private Timebase inputTimebase;
        private String mimeType;
        private Integer profile;
        private Integer sampleRate;

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig autoBuild() {
            String str = "";
            if (this.mimeType == null) {
                str = " mimeType";
            }
            if (this.profile == null) {
                str = str + " profile";
            }
            if (this.inputTimebase == null) {
                str = str + " inputTimebase";
            }
            if (this.bitrate == null) {
                str = str + " bitrate";
            }
            if (this.sampleRate == null) {
                str = str + " sampleRate";
            }
            if (this.channelCount == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioEncoderConfig(this.mimeType, this.profile.intValue(), this.inputTimebase, this.bitrate.intValue(), this.sampleRate.intValue(), this.channelCount.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setBitrate(int i11) {
            this.bitrate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setChannelCount(int i11) {
            this.channelCount = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.inputTimebase = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setProfile(int i11) {
            this.profile = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setSampleRate(int i11) {
            this.sampleRate = Integer.valueOf(i11);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioEncoderConfig) {
            AudioEncoderConfig audioEncoderConfig = (AudioEncoderConfig) obj;
            if (this.mimeType.equals(audioEncoderConfig.getMimeType()) && this.profile == audioEncoderConfig.getProfile() && this.inputTimebase.equals(audioEncoderConfig.getInputTimebase()) && this.bitrate == audioEncoderConfig.getBitrate() && this.sampleRate == audioEncoderConfig.getSampleRate() && this.channelCount == audioEncoderConfig.getChannelCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public Timebase getInputTimebase() {
        return this.inputTimebase;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return ((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.inputTimebase.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.sampleRate) * 1000003) ^ this.channelCount;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.mimeType + ", profile=" + this.profile + ", inputTimebase=" + this.inputTimebase + ", bitrate=" + this.bitrate + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + com.alipay.sdk.m.u.i.f11099d;
    }

    private AutoValue_AudioEncoderConfig(String str, int i11, Timebase timebase, int i12, int i13, int i14) {
        this.mimeType = str;
        this.profile = i11;
        this.inputTimebase = timebase;
        this.bitrate = i12;
        this.sampleRate = i13;
        this.channelCount = i14;
    }
}
