package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class OutputOptions {
    public static final int DURATION_UNLIMITED = 0;
    public static final int FILE_SIZE_UNLIMITED = 0;
    private final OutputOptionsInternal mOutputOptionsInternal;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Builder<T extends OutputOptions, B> {
        final OutputOptionsInternal.Builder<?> mRootInternalBuilder;

        public Builder(@NonNull OutputOptionsInternal.Builder<?> builder) {
            this.mRootInternalBuilder = builder;
            builder.setFileSizeLimit(0L);
            builder.setDurationLimitMillis(0L);
        }

        @NonNull
        public abstract T build();

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public B setDurationLimitMillis(@IntRange(from = 0) long j11) {
            Preconditions.checkArgument(j11 >= 0, "The specified duration limit can't be negative.");
            this.mRootInternalBuilder.setDurationLimitMillis(j11);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public B setFileSizeLimit(@IntRange(from = 0) long j11) {
            Preconditions.checkArgument(j11 >= 0, "The specified file size limit can't be negative.");
            this.mRootInternalBuilder.setFileSizeLimit(j11);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public B setLocation(@Nullable Location location) {
            if (location != null) {
                boolean z11 = false;
                Preconditions.checkArgument(location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d, "Latitude must be in the range [-90, 90]");
                if (location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d) {
                    z11 = true;
                }
                Preconditions.checkArgument(z11, "Longitude must be in the range [-180, 180]");
            }
            this.mRootInternalBuilder.setLocation(location);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class OutputOptionsInternal {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static abstract class Builder<B> {
            @NonNull
            public abstract OutputOptionsInternal build();

            @NonNull
            public abstract B setDurationLimitMillis(@IntRange(from = 0) long j11);

            @NonNull
            public abstract B setFileSizeLimit(@IntRange(from = 0) long j11);

            @NonNull
            public abstract B setLocation(@Nullable Location location);
        }

        @IntRange(from = 0)
        public abstract long getDurationLimitMillis();

        @IntRange(from = 0)
        public abstract long getFileSizeLimit();

        @Nullable
        public abstract Location getLocation();
    }

    public OutputOptions(@NonNull OutputOptionsInternal outputOptionsInternal) {
        this.mOutputOptionsInternal = outputOptionsInternal;
    }

    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.mOutputOptionsInternal.getDurationLimitMillis();
    }

    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.mOutputOptionsInternal.getFileSizeLimit();
    }

    @Nullable
    public Location getLocation() {
        return this.mOutputOptionsInternal.getLocation();
    }
}
