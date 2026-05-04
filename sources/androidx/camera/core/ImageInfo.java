package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageInfo {
    int getRotationDegrees();

    @NonNull
    default Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    TagBundle getTagBundle();

    long getTimestamp();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    void populateExifData(@NonNull ExifData.Builder builder);
}
