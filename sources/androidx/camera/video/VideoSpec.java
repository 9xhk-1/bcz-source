package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AutoValue_VideoSpec;
import eo.c;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@eo.c
/* loaded from: classes.dex */
public abstract class VideoSpec {

    @NonNull
    public static final QualitySelector QUALITY_SELECTOR_AUTO;

    @NonNull
    public static final Range<Integer> FRAME_RATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);

    @NonNull
    public static final Range<Integer> BITRATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c.a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class Builder {
        @NonNull
        public abstract VideoSpec build();

        @NonNull
        public abstract Builder setAspectRatio(int i11);

        @NonNull
        public abstract Builder setBitrate(@NonNull Range<Integer> range);

        @NonNull
        public abstract Builder setFrameRate(@NonNull Range<Integer> range);

        @NonNull
        public abstract Builder setQualitySelector(@NonNull QualitySelector qualitySelector);
    }

    static {
        Quality quality = Quality.FHD;
        QUALITY_SELECTOR_AUTO = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(quality));
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_VideoSpec.Builder().setQualitySelector(QUALITY_SELECTOR_AUTO).setFrameRate(FRAME_RATE_RANGE_AUTO).setBitrate(BITRATE_RANGE_AUTO).setAspectRatio(-1);
    }

    public abstract int getAspectRatio();

    @NonNull
    public abstract Range<Integer> getBitrate();

    @NonNull
    public abstract Range<Integer> getFrameRate();

    @NonNull
    public abstract QualitySelector getQualitySelector();

    @NonNull
    public abstract Builder toBuilder();
}
