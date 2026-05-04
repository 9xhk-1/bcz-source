package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class VideoEncoderDataSpace {
    public static final int VIDEO_COLOR_RANGE_UNSPECIFIED = 0;
    public static final int VIDEO_COLOR_STANDARD_UNSPECIFIED = 0;
    public static final int VIDEO_COLOR_TRANSFER_UNSPECIFIED = 0;
    public static final VideoEncoderDataSpace ENCODER_DATA_SPACE_UNSPECIFIED = create(0, 0, 0);
    public static final VideoEncoderDataSpace ENCODER_DATA_SPACE_BT709 = create(1, 3, 2);
    public static final VideoEncoderDataSpace ENCODER_DATA_SPACE_BT2020_HLG = create(6, 7, 1);
    public static final VideoEncoderDataSpace ENCODER_DATA_SPACE_BT2020_PQ = create(6, 6, 1);

    @NonNull
    public static VideoEncoderDataSpace create(int i11, int i12, int i13) {
        return new AutoValue_VideoEncoderDataSpace(i11, i12, i13);
    }

    public abstract int getRange();

    public abstract int getStandard();

    public abstract int getTransfer();
}
