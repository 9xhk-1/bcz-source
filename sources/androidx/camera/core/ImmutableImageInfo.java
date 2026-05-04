package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@eo.c
/* loaded from: classes.dex */
public abstract class ImmutableImageInfo implements ImageInfo {
    @NonNull
    public static ImageInfo create(@NonNull TagBundle tagBundle, long j11, int i11, @NonNull Matrix matrix) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j11, i11, matrix);
    }

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    @NonNull
    public abstract Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    @NonNull
    public abstract TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(@NonNull ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}
