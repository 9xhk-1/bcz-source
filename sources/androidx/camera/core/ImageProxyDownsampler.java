package androidx.camera.core;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ImageProxyDownsampler {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        public ForwardingImageProxyImpl(ImageProxy imageProxy, ImageProxy.PlaneProxy[] planeProxyArr, int i11, int i12) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i11;
            this.mDownsampledHeight = i12;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.mDownsampledHeight;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        @NonNull
        public ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(int i11, int i12, byte[] bArr) {
        return new ImageProxy.PlaneProxy(bArr, i11, i12) { // from class: androidx.camera.core.ImageProxyDownsampler.1
            final ByteBuffer mBuffer;
            final /* synthetic */ byte[] val$data;
            final /* synthetic */ int val$pixelStride;
            final /* synthetic */ int val$rowStride;

            {
                this.val$data = bArr;
                this.val$rowStride = i11;
                this.val$pixelStride = i12;
                this.mBuffer = ByteBuffer.wrap(bArr);
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            @NonNull
            public ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return this.val$pixelStride;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    public static ForwardingImageProxy downsample(ImageProxy imageProxy, int i11, int i12, DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        int i13;
        byte[] bArr2;
        if (imageProxy.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        }
        if (imageProxy.getWidth() < i11 || imageProxy.getHeight() < i12) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i11, i12) + " is not <= original dimension " + new Size(imageProxy.getWidth(), imageProxy.getHeight()) + ".");
        }
        if (imageProxy.getWidth() == i11 && imageProxy.getHeight() == i12) {
            return new ForwardingImageProxyImpl(imageProxy, imageProxy.getPlanes(), i11, i12);
        }
        int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
        int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
        int i14 = i11 / 2;
        int[] iArr3 = {i11, i14, i14};
        int i15 = i12 / 2;
        int[] iArr4 = {i12, i15, i15};
        ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
        for (int i16 = 0; i16 < 3; i16++) {
            ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i16];
            ByteBuffer buffer = planeProxy.getBuffer();
            byte[] bArr3 = new byte[iArr3[i16] * iArr4[i16]];
            int ordinal = downsamplingMethod.ordinal();
            if (ordinal == 0) {
                bArr = bArr3;
                int i17 = iArr[i16];
                int pixelStride = planeProxy.getPixelStride();
                int rowStride = planeProxy.getRowStride();
                i13 = 1;
                resizeNearestNeighbor(buffer, i17, pixelStride, rowStride, iArr2[i16], bArr, iArr3[i16], iArr4[i16]);
            } else if (ordinal != 1) {
                bArr2 = bArr3;
                i13 = 1;
                planeProxyArr[i16] = createPlaneProxy(iArr3[i16], i13, bArr2);
            } else {
                bArr = bArr3;
                int i18 = iArr[i16];
                int pixelStride2 = planeProxy.getPixelStride();
                int rowStride2 = planeProxy.getRowStride();
                i13 = 1;
                resizeAveraging(buffer, i18, pixelStride2, rowStride2, iArr2[i16], bArr, iArr3[i16], iArr4[i16]);
            }
            bArr2 = bArr;
            planeProxyArr[i16] = createPlaneProxy(iArr3[i16], i13, bArr2);
        }
        return new ForwardingImageProxyImpl(imageProxy, planeProxyArr, i11, i12);
    }

    private static void resizeAveraging(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, byte[] bArr, int i15, int i16) {
        float f11 = i11 / i15;
        float f12 = i14 / i16;
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[i13];
        int[] iArr = new int[i15];
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            iArr[i18] = ((int) (i18 * f11)) * i12;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                int i19 = 0;
                while (i19 < i16) {
                    int i21 = (int) (i19 * f12);
                    int i22 = i14 - 1;
                    int min = Math.min(i21, i22) * i13;
                    int min2 = Math.min(i21 + 1, i22) * i13;
                    int i23 = i19 * i15;
                    byteBuffer.position(min);
                    byteBuffer.get(bArr2, i17, Math.min(i13, byteBuffer.remaining()));
                    byteBuffer.position(min2);
                    byteBuffer.get(bArr3, i17, Math.min(i13, byteBuffer.remaining()));
                    for (int i24 = i17; i24 < i15; i24++) {
                        int i25 = iArr[i24];
                        bArr[i23 + i24] = (byte) ((((((bArr2[i25] & 255) + (bArr2[i25 + i12] & 255)) + (bArr3[i25] & 255)) + (bArr3[i25 + i12] & 255)) / 4) & 255);
                    }
                    i19++;
                    i17 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void resizeNearestNeighbor(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, byte[] bArr, int i15, int i16) {
        float f11 = i11 / i15;
        float f12 = i14 / i16;
        byte[] bArr2 = new byte[i13];
        int[] iArr = new int[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            iArr[i17] = ((int) (i17 * f11)) * i12;
        }
        synchronized (byteBuffer) {
            try {
                byteBuffer.rewind();
                for (int i18 = 0; i18 < i16; i18++) {
                    int i19 = i18 * i15;
                    byteBuffer.position(Math.min((int) (i18 * f12), i14 - 1) * i13);
                    byteBuffer.get(bArr2, 0, Math.min(i13, byteBuffer.remaining()));
                    for (int i21 = 0; i21 < i15; i21++) {
                        bArr[i19 + i21] = bArr2[iArr[i21]];
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
