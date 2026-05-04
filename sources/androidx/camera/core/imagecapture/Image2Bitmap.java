package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class Image2Bitmap implements Operation<Packet<ImageProxy>, Bitmap> {
    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Bitmap apply(@NonNull Packet<ImageProxy> packet) throws ImageCaptureException {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        Bitmap rotateBitmap;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = null;
        try {
            try {
                if (packet.getFormat() == 35) {
                    ImageProxy data = packet.getData();
                    boolean z11 = packet.getRotationDegrees() % 180 != 0;
                    safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(z11 ? data.getHeight() : data.getWidth(), z11 ? data.getWidth() : data.getHeight(), 1, 2));
                    try {
                        ImageProxy convertYUVToRGB = ImageProcessingUtil.convertYUVToRGB(data, safeCloseImageReaderProxy, ByteBuffer.allocateDirect(data.getWidth() * data.getHeight() * 4), packet.getRotationDegrees(), false);
                        data.close();
                        if (convertYUVToRGB == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        rotateBitmap = ImageUtil.createBitmapFromImageProxy(convertYUVToRGB);
                        convertYUVToRGB.close();
                    } catch (UnsupportedOperationException e11) {
                        e = e11;
                        throw new ImageCaptureException(0, "Can't convert " + (packet.getFormat() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCloseImageReaderProxy2 = safeCloseImageReaderProxy;
                        if (safeCloseImageReaderProxy2 != null) {
                            safeCloseImageReaderProxy2.close();
                        }
                        throw th;
                    }
                } else {
                    if (packet.getFormat() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + packet.getFormat());
                    }
                    ImageProxy data2 = packet.getData();
                    Bitmap createBitmapFromImageProxy = ImageUtil.createBitmapFromImageProxy(data2);
                    data2.close();
                    safeCloseImageReaderProxy = null;
                    rotateBitmap = ImageUtil.rotateBitmap(createBitmapFromImageProxy, packet.getRotationDegrees());
                }
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.close();
                }
                return rotateBitmap;
            } catch (UnsupportedOperationException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
