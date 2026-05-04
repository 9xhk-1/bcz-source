package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.ijk.media.player.IjkMediaMeta;
import eo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class VideoEncoderConfig implements EncoderConfig {
    private static final int VIDEO_COLOR_FORMAT_DEFAULT = 2130708361;
    private static final int VIDEO_INTRA_FRAME_INTERVAL_DEFAULT = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c.a
    public static abstract class Builder {
        @NonNull
        public abstract VideoEncoderConfig build();

        @NonNull
        public abstract Builder setBitrate(int i11);

        @NonNull
        public abstract Builder setColorFormat(int i11);

        @NonNull
        public abstract Builder setDataSpace(@NonNull VideoEncoderDataSpace videoEncoderDataSpace);

        @NonNull
        public abstract Builder setFrameRate(int i11);

        @NonNull
        public abstract Builder setIFrameInterval(int i11);

        @NonNull
        public abstract Builder setInputTimebase(@NonNull Timebase timebase);

        @NonNull
        public abstract Builder setMimeType(@NonNull String str);

        @NonNull
        public abstract Builder setProfile(int i11);

        @NonNull
        public abstract Builder setResolution(@NonNull Size size);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_VideoEncoderConfig.Builder().setProfile(-1).setIFrameInterval(1).setColorFormat(VIDEO_COLOR_FORMAT_DEFAULT).setDataSpace(VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED);
    }

    public abstract int getBitrate();

    public abstract int getColorFormat();

    @NonNull
    public abstract VideoEncoderDataSpace getDataSpace();

    public abstract int getFrameRate();

    public abstract int getIFrameInterval();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    @NonNull
    public abstract Size getResolution();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public MediaFormat toMediaFormat() {
        Size resolution = getResolution();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(getMimeType(), resolution.getWidth(), resolution.getHeight());
        createVideoFormat.setInteger("color-format", getColorFormat());
        createVideoFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, getBitrate());
        createVideoFormat.setInteger("frame-rate", getFrameRate());
        createVideoFormat.setInteger("i-frame-interval", getIFrameInterval());
        if (getProfile() != -1) {
            createVideoFormat.setInteger(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, getProfile());
        }
        VideoEncoderDataSpace dataSpace = getDataSpace();
        if (dataSpace.getStandard() != 0) {
            createVideoFormat.setInteger("color-standard", dataSpace.getStandard());
        }
        if (dataSpace.getTransfer() != 0) {
            createVideoFormat.setInteger("color-transfer", dataSpace.getTransfer());
        }
        if (dataSpace.getRange() != 0) {
            createVideoFormat.setInteger("color-range", dataSpace.getRange());
        }
        return createVideoFormat;
    }
}
