package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioSpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_AudioSpec extends AudioSpec {
    private final Range<Integer> bitrate;
    private final int channelCount;
    private final Range<Integer> sampleRate;
    private final int source;
    private final int sourceFormat;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder extends AudioSpec.Builder {
        private Range<Integer> bitrate;
        private Integer channelCount;
        private Range<Integer> sampleRate;
        private Integer source;
        private Integer sourceFormat;

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec build() {
            String str = "";
            if (this.bitrate == null) {
                str = " bitrate";
            }
            if (this.sourceFormat == null) {
                str = str + " sourceFormat";
            }
            if (this.source == null) {
                str = str + " source";
            }
            if (this.sampleRate == null) {
                str = str + " sampleRate";
            }
            if (this.channelCount == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioSpec(this.bitrate, this.sourceFormat.intValue(), this.source.intValue(), this.sampleRate, this.channelCount.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setBitrate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.bitrate = range;
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setChannelCount(int i11) {
            this.channelCount = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSampleRate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.sampleRate = range;
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSource(int i11) {
            this.source = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public AudioSpec.Builder setSourceFormat(int i11) {
            this.sourceFormat = Integer.valueOf(i11);
            return this;
        }

        public Builder() {
        }

        private Builder(AudioSpec audioSpec) {
            this.bitrate = audioSpec.getBitrate();
            this.sourceFormat = Integer.valueOf(audioSpec.getSourceFormat());
            this.source = Integer.valueOf(audioSpec.getSource());
            this.sampleRate = audioSpec.getSampleRate();
            this.channelCount = Integer.valueOf(audioSpec.getChannelCount());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSpec) {
            AudioSpec audioSpec = (AudioSpec) obj;
            if (this.bitrate.equals(audioSpec.getBitrate()) && this.sourceFormat == audioSpec.getSourceFormat() && this.source == audioSpec.getSource() && this.sampleRate.equals(audioSpec.getSampleRate()) && this.channelCount == audioSpec.getChannelCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public Range<Integer> getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public Range<Integer> getSampleRate() {
        return this.sampleRate;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSource() {
        return this.source;
    }

    @Override // androidx.camera.video.AudioSpec
    public int getSourceFormat() {
        return this.sourceFormat;
    }

    public int hashCode() {
        return ((((((((this.bitrate.hashCode() ^ 1000003) * 1000003) ^ this.sourceFormat) * 1000003) ^ this.source) * 1000003) ^ this.sampleRate.hashCode()) * 1000003) ^ this.channelCount;
    }

    @Override // androidx.camera.video.AudioSpec
    public AudioSpec.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.bitrate + ", sourceFormat=" + this.sourceFormat + ", source=" + this.source + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + com.alipay.sdk.m.u.i.f11099d;
    }

    private AutoValue_AudioSpec(Range<Integer> range, int i11, int i12, Range<Integer> range2, int i13) {
        this.bitrate = range;
        this.sourceFormat = i11;
        this.source = i12;
        this.sampleRate = range2;
        this.channelCount = i13;
    }
}
