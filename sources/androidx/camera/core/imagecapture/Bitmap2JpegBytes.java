package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.heytap.mcssdk.constant.MessageConstant;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class Bitmap2JpegBytes implements Operation<In, Packet<byte[]>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static boolean hasGainmap(@NonNull Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class In {
        @NonNull
        public static In of(@NonNull Packet<Bitmap> packet, int i11) {
            return new AutoValue_Bitmap2JpegBytes_In(packet, i11);
        }

        public abstract int getJpegQuality();

        public abstract Packet<Bitmap> getPacket();
    }

    private static int getOutputFormat(@NonNull Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 34 || !Api34Impl.hasGainmap(bitmap)) {
            return 256;
        }
        return MessageConstant.MessageType.MESSAGE_FIND_PHONE;
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Packet<byte[]> apply(@NonNull In in2) throws ImageCaptureException {
        Packet<Bitmap> packet = in2.getPacket();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        packet.getData().compress(Bitmap.CompressFormat.JPEG, in2.getJpegQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.of(byteArray, exif, getOutputFormat(packet.getData()), packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
