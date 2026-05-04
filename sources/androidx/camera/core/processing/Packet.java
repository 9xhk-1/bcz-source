package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class Packet<T> {
    @NonNull
    public static Packet<Bitmap> of(@NonNull Bitmap bitmap, @NonNull Exif exif, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bitmap, exif, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i11, matrix, cameraCaptureResult);
    }

    @NonNull
    public abstract CameraCaptureResult getCameraCaptureResult();

    @NonNull
    public abstract Rect getCropRect();

    @NonNull
    public abstract T getData();

    @Nullable
    public abstract Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Matrix getSensorToBufferTransform();

    @NonNull
    public abstract Size getSize();

    public boolean hasCropping() {
        return TransformUtils.hasCropping(getCropRect(), getSize());
    }

    @NonNull
    public static Packet<ImageProxy> of(@NonNull ImageProxy imageProxy, @Nullable Exif exif, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return of(imageProxy, exif, new Size(imageProxy.getWidth(), imageProxy.getHeight()), rect, i11, matrix, cameraCaptureResult);
    }

    @NonNull
    public static Packet<ImageProxy> of(@NonNull ImageProxy imageProxy, @Nullable Exif exif, @NonNull Size size, @NonNull Rect rect, int i11, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        if (ImageUtil.isJpegFormats(imageProxy.getFormat())) {
            Preconditions.checkNotNull(exif, "JPEG image must have Exif.");
        }
        return new AutoValue_Packet(imageProxy, exif, imageProxy.getFormat(), size, rect, i11, matrix, cameraCaptureResult);
    }

    @NonNull
    public static Packet<byte[]> of(@NonNull byte[] bArr, @NonNull Exif exif, int i11, @NonNull Size size, @NonNull Rect rect, int i12, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bArr, exif, i11, size, rect, i12, matrix, cameraCaptureResult);
    }
}
