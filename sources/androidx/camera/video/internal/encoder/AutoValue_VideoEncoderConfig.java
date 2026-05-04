package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_VideoEncoderConfig extends VideoEncoderConfig {
    private final int IFrameInterval;
    private final int bitrate;
    private final int colorFormat;
    private final VideoEncoderDataSpace dataSpace;
    private final int frameRate;
    private final Timebase inputTimebase;
    private final String mimeType;
    private final int profile;
    private final Size resolution;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder extends VideoEncoderConfig.Builder {
        private Integer IFrameInterval;
        private Integer bitrate;
        private Integer colorFormat;
        private VideoEncoderDataSpace dataSpace;
        private Integer frameRate;
        private Timebase inputTimebase;
        private String mimeType;
        private Integer profile;
        private Size resolution;

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig build() {
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
            if (this.resolution == null) {
                str = str + " resolution";
            }
            if (this.colorFormat == null) {
                str = str + " colorFormat";
            }
            if (this.dataSpace == null) {
                str = str + " dataSpace";
            }
            if (this.frameRate == null) {
                str = str + " frameRate";
            }
            if (this.IFrameInterval == null) {
                str = str + " IFrameInterval";
            }
            if (this.bitrate == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new AutoValue_VideoEncoderConfig(this.mimeType, this.profile.intValue(), this.inputTimebase, this.resolution, this.colorFormat.intValue(), this.dataSpace, this.frameRate.intValue(), this.IFrameInterval.intValue(), this.bitrate.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setBitrate(int i11) {
            this.bitrate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setColorFormat(int i11) {
            this.colorFormat = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setDataSpace(VideoEncoderDataSpace videoEncoderDataSpace) {
            if (videoEncoderDataSpace == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.dataSpace = videoEncoderDataSpace;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setFrameRate(int i11) {
            this.frameRate = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setIFrameInterval(int i11) {
            this.IFrameInterval = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.inputTimebase = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setProfile(int i11) {
            this.profile = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public VideoEncoderConfig.Builder setResolution(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.resolution = size;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoEncoderConfig) {
            VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj;
            if (this.mimeType.equals(videoEncoderConfig.getMimeType()) && this.profile == videoEncoderConfig.getProfile() && this.inputTimebase.equals(videoEncoderConfig.getInputTimebase()) && this.resolution.equals(videoEncoderConfig.getResolution()) && this.colorFormat == videoEncoderConfig.getColorFormat() && this.dataSpace.equals(videoEncoderConfig.getDataSpace()) && this.frameRate == videoEncoderConfig.getFrameRate() && this.IFrameInterval == videoEncoderConfig.getIFrameInterval() && this.bitrate == videoEncoderConfig.getBitrate()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getColorFormat() {
        return this.colorFormat;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    @NonNull
    public VideoEncoderDataSpace getDataSpace() {
        return this.dataSpace;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public int getIFrameInterval() {
        return this.IFrameInterval;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public Timebase getInputTimebase() {
        return this.inputTimebase;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    @NonNull
    public Size getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        return ((((((((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.inputTimebase.hashCode()) * 1000003) ^ this.resolution.hashCode()) * 1000003) ^ this.colorFormat) * 1000003) ^ this.dataSpace.hashCode()) * 1000003) ^ this.frameRate) * 1000003) ^ this.IFrameInterval) * 1000003) ^ this.bitrate;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.mimeType + ", profile=" + this.profile + ", inputTimebase=" + this.inputTimebase + ", resolution=" + this.resolution + ", colorFormat=" + this.colorFormat + ", dataSpace=" + this.dataSpace + ", frameRate=" + this.frameRate + ", IFrameInterval=" + this.IFrameInterval + ", bitrate=" + this.bitrate + com.alipay.sdk.m.u.i.f11099d;
    }

    private AutoValue_VideoEncoderConfig(String str, int i11, Timebase timebase, Size size, int i12, VideoEncoderDataSpace videoEncoderDataSpace, int i13, int i14, int i15) {
        this.mimeType = str;
        this.profile = i11;
        this.inputTimebase = timebase;
        this.resolution = size;
        this.colorFormat = i12;
        this.dataSpace = videoEncoderDataSpace;
        this.frameRate = i13;
        this.IFrameInterval = i14;
        this.bitrate = i15;
    }
}
