package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class RgbaImageProxy implements ImageProxy {

    @NonNull
    private final Rect mCropRect;
    private final int mHeight;

    @NonNull
    private final ImageInfo mImageInfo;
    private final Object mLock;

    @Nullable
    @GuardedBy("mLock")
    ImageProxy.PlaneProxy[] mPlaneProxy;
    private final int mWidth;

    public RgbaImageProxy(@NonNull Packet<Bitmap> packet) {
        this(packet.getData(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult().getTimestamp());
    }

    private void checkNotClosed() {
        synchronized (this.mLock) {
            Preconditions.checkState(this.mPlaneProxy != null, "The image is closed.");
        }
    }

    private static ImageInfo createImageInfo(final long j11, final int i11, @NonNull final Matrix matrix) {
        return new ImageInfo() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.2
            @Override // androidx.camera.core.ImageInfo
            public int getRotationDegrees() {
                return i11;
            }

            @Override // androidx.camera.core.ImageInfo
            @NonNull
            public Matrix getSensorToBufferTransformMatrix() {
                return new Matrix(matrix);
            }

            @Override // androidx.camera.core.ImageInfo
            @NonNull
            public TagBundle getTagBundle() {
                throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
            }

            @Override // androidx.camera.core.ImageInfo
            public long getTimestamp() {
                return j11;
            }

            @Override // androidx.camera.core.ImageInfo
            public void populateExifData(@NonNull ExifData.Builder builder) {
                throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
            }
        };
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(@NonNull final ByteBuffer byteBuffer, final int i11, final int i12) {
        return new ImageProxy.PlaneProxy() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.1
            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            @NonNull
            public ByteBuffer getBuffer() {
                return byteBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return i12;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return i11;
            }
        };
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            checkNotClosed();
            this.mPlaneProxy = null;
        }
    }

    @NonNull
    public Bitmap createBitmap() {
        Bitmap createBitmapFromPlane;
        synchronized (this.mLock) {
            checkNotClosed();
            createBitmapFromPlane = ImageUtil.createBitmapFromPlane(getPlanes(), getWidth(), getHeight());
        }
        return createBitmapFromPlane;
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public Rect getCropRect() {
        Rect rect;
        synchronized (this.mLock) {
            checkNotClosed();
            rect = this.mCropRect;
        }
        return rect;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        synchronized (this.mLock) {
            checkNotClosed();
        }
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        int i11;
        synchronized (this.mLock) {
            checkNotClosed();
            i11 = this.mHeight;
        }
        return i11;
    }

    @Override // androidx.camera.core.ImageProxy
    @Nullable
    @ExperimentalGetImage
    public Image getImage() {
        synchronized (this.mLock) {
            checkNotClosed();
        }
        return null;
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public ImageInfo getImageInfo() {
        ImageInfo imageInfo;
        synchronized (this.mLock) {
            checkNotClosed();
            imageInfo = this.mImageInfo;
        }
        return imageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    @NonNull
    public ImageProxy.PlaneProxy[] getPlanes() {
        ImageProxy.PlaneProxy[] planeProxyArr;
        synchronized (this.mLock) {
            checkNotClosed();
            ImageProxy.PlaneProxy[] planeProxyArr2 = this.mPlaneProxy;
            Objects.requireNonNull(planeProxyArr2);
            planeProxyArr = planeProxyArr2;
        }
        return planeProxyArr;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        int i11;
        synchronized (this.mLock) {
            checkNotClosed();
            i11 = this.mWidth;
        }
        return i11;
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(@Nullable Rect rect) {
        synchronized (this.mLock) {
            try {
                checkNotClosed();
                if (rect != null) {
                    this.mCropRect.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public RgbaImageProxy(@NonNull Bitmap bitmap, @NonNull Rect rect, int i11, @NonNull Matrix matrix, long j11) {
        this(ImageUtil.createDirectByteBuffer(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i11, matrix, j11);
    }

    public RgbaImageProxy(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13, @NonNull Rect rect, int i14, @NonNull Matrix matrix, long j11) {
        this.mLock = new Object();
        this.mWidth = i12;
        this.mHeight = i13;
        this.mCropRect = rect;
        this.mImageInfo = createImageInfo(j11, i14, matrix);
        byteBuffer.rewind();
        this.mPlaneProxy = new ImageProxy.PlaneProxy[]{createPlaneProxy(byteBuffer, i12 * i11, i11)};
    }
}
