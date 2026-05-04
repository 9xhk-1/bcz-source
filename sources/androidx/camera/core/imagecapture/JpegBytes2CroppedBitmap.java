package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class JpegBytes2CroppedBitmap implements Operation<Packet<byte[]>, Packet<Bitmap>> {
    @NonNull
    private Bitmap createCroppedBitmap(@NonNull byte[] bArr, @NonNull Rect rect) throws ImageCaptureException {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e11);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Packet<Bitmap> apply(@NonNull Packet<byte[]> packet) throws ImageCaptureException {
        Rect cropRect = packet.getCropRect();
        Bitmap createCroppedBitmap = createCroppedBitmap(packet.getData(), cropRect);
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.of(createCroppedBitmap, exif, new Rect(0, 0, createCroppedBitmap.getWidth(), createCroppedBitmap.getHeight()), packet.getRotationDegrees(), TransformUtils.updateSensorToBufferTransform(packet.getSensorToBufferTransform(), cropRect), packet.getCameraCaptureResult());
    }
}
