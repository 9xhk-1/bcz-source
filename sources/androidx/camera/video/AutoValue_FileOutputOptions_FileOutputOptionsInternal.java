package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.FileOutputOptions;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_FileOutputOptions_FileOutputOptionsInternal extends FileOutputOptions.FileOutputOptionsInternal {
    private final long durationLimitMillis;
    private final File file;
    private final long fileSizeLimit;
    private final Location location;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder extends FileOutputOptions.FileOutputOptionsInternal.Builder {
        private Long durationLimitMillis;
        private File file;
        private Long fileSizeLimit;
        private Location location;

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal.Builder setFile(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.file = file;
            return this;
        }

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal build() {
            String str = "";
            if (this.fileSizeLimit == null) {
                str = " fileSizeLimit";
            }
            if (this.durationLimitMillis == null) {
                str = str + " durationLimitMillis";
            }
            if (this.file == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new AutoValue_FileOutputOptions_FileOutputOptionsInternal(this.fileSizeLimit.longValue(), this.durationLimitMillis.longValue(), this.location, this.file);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal.Builder setDurationLimitMillis(long j11) {
            this.durationLimitMillis = Long.valueOf(j11);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal.Builder setFileSizeLimit(long j11) {
            this.fileSizeLimit = Long.valueOf(j11);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal.Builder setLocation(@Nullable Location location) {
            this.location = location;
            return this;
        }
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileOutputOptions.FileOutputOptionsInternal) {
            FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal = (FileOutputOptions.FileOutputOptionsInternal) obj;
            if (this.fileSizeLimit == fileOutputOptionsInternal.getFileSizeLimit() && this.durationLimitMillis == fileOutputOptionsInternal.getDurationLimitMillis() && ((location = this.location) != null ? location.equals(fileOutputOptionsInternal.getLocation()) : fileOutputOptionsInternal.getLocation() == null) && this.file.equals(fileOutputOptionsInternal.getFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.durationLimitMillis;
    }

    @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal
    @NonNull
    public File getFile() {
        return this.file;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @Nullable
    public Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        long j11 = this.fileSizeLimit;
        long j12 = this.durationLimitMillis;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        Location location = this.location;
        return ((i11 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.file.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.fileSizeLimit + ", durationLimitMillis=" + this.durationLimitMillis + ", location=" + this.location + ", file=" + this.file + com.alipay.sdk.m.u.i.f11099d;
    }

    private AutoValue_FileOutputOptions_FileOutputOptionsInternal(long j11, long j12, @Nullable Location location, File file) {
        this.fileSizeLimit = j11;
        this.durationLimitMillis = j12;
        this.location = location;
        this.file = file;
    }
}
