package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes.dex */
final class ZslControlImpl implements ZslControl {

    @VisibleForTesting
    static final int MAX_IMAGES = 9;

    @VisibleForTesting
    static final int RING_BUFFER_CAPACITY = 3;
    private static final String TAG = "ZslControlImpl";

    @NonNull
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;

    @NonNull
    @VisibleForTesting
    final ZslRingBuffer mImageRingBuffer;
    private boolean mIsPrivateReprocessingSupported;
    private CameraCaptureCallback mMetadataMatchingCaptureCallback;
    private DeferrableSurface mReprocessingImageDeferrableSurface;
    SafeCloseImageReaderProxy mReprocessingImageReader;

    @Nullable
    ImageWriter mReprocessingImageWriter;
    private boolean mShouldZslDisabledByQuirks;
    private boolean mIsZslDisabledByUseCaseConfig = false;
    private boolean mIsZslDisabledByFlashMode = false;

    public ZslControlImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mIsPrivateReprocessingSupported = false;
        this.mShouldZslDisabledByQuirks = false;
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mIsPrivateReprocessingSupported = ZslUtil.isCapabilitySupported(cameraCharacteristicsCompat, 4);
        this.mShouldZslDisabledByQuirks = DeviceQuirks.get(ZslDisablerQuirk.class) != null;
        this.mImageRingBuffer = new ZslRingBuffer(3, new RingBuffer.OnRemoveCallback() { // from class: androidx.camera.camera2.internal.c4
            @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
            public final void onRemove(Object obj) {
                ((ImageProxy) obj).close();
            }
        });
    }

    public static /* synthetic */ void a(ZslControlImpl zslControlImpl, ImageReaderProxy imageReaderProxy) {
        zslControlImpl.getClass();
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                zslControlImpl.mImageRingBuffer.enqueue(acquireLatestImage);
            }
        } catch (IllegalStateException e11) {
            Logger.e(TAG, "Failed to acquire latest image IllegalStateException = " + e11.getMessage());
        }
    }

    private void cleanup() {
        ZslRingBuffer zslRingBuffer = this.mImageRingBuffer;
        while (!zslRingBuffer.isEmpty()) {
            zslRingBuffer.dequeue().close();
        }
        DeferrableSurface deferrableSurface = this.mReprocessingImageDeferrableSurface;
        if (deferrableSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mReprocessingImageReader;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new b4(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
                this.mReprocessingImageReader = null;
            }
            deferrableSurface.close();
            this.mReprocessingImageDeferrableSurface = null;
        }
        ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter != null) {
            imageWriter.close();
            this.mReprocessingImageWriter = null;
        }
    }

    @NonNull
    private Map<Integer, Size> createReprocessingInputSizeMap(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e11) {
            Logger.e(TAG, "Failed to retrieve StreamConfigurationMap, error = " + e11.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i11 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i11);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new CompareSizesByArea(true));
                hashMap.put(Integer.valueOf(i11), inputSizes[0]);
            }
        }
        return hashMap;
    }

    private boolean isJpegValidOutputForInputFormat(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i11)) == null) {
            return false;
        }
        for (int i12 : validOutputFormatsForInput) {
            if (i12 == 256) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        cleanup();
        if (this.mIsZslDisabledByUseCaseConfig) {
            builder.setTemplateType(1);
            return;
        }
        if (this.mShouldZslDisabledByQuirks) {
            builder.setTemplateType(1);
            return;
        }
        Map<Integer, Size> createReprocessingInputSizeMap = createReprocessingInputSizeMap(this.mCameraCharacteristicsCompat);
        if (!this.mIsPrivateReprocessingSupported || createReprocessingInputSizeMap.isEmpty() || !createReprocessingInputSizeMap.containsKey(34) || !isJpegValidOutputForInputFormat(this.mCameraCharacteristicsCompat, 34)) {
            builder.setTemplateType(1);
            return;
        }
        Size size = createReprocessingInputSizeMap.get(34);
        MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 34, 9);
        this.mMetadataMatchingCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        this.mReprocessingImageReader = new SafeCloseImageReaderProxy(metadataImageReader);
        metadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.camera2.internal.d4
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ZslControlImpl.a(ZslControlImpl.this, imageReaderProxy);
            }
        }, CameraXExecutors.ioExecutor());
        ImmediateSurface immediateSurface = new ImmediateSurface(this.mReprocessingImageReader.getSurface(), new Size(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight()), 34);
        this.mReprocessingImageDeferrableSurface = immediateSurface;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mReprocessingImageReader;
        com.google.common.util.concurrent.p1<Void> terminationFuture = immediateSurface.getTerminationFuture();
        Objects.requireNonNull(safeCloseImageReaderProxy);
        terminationFuture.addListener(new b4(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
        builder.addSurface(this.mReprocessingImageDeferrableSurface);
        builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
        builder.addSessionStateCallback(new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.ZslControlImpl.1
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ZslControlImpl.this.mReprocessingImageWriter = ImageWriterCompat.newInstance(inputSurface, 1);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            }
        });
        builder.setInputConfiguration(new InputConfiguration(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight(), this.mReprocessingImageReader.getImageFormat()));
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    @Nullable
    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.mImageRingBuffer.dequeue();
        } catch (NoSuchElementException unused) {
            Logger.e(TAG, "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean enqueueImageToImageWriter(@NonNull ImageProxy imageProxy) {
        Image image = imageProxy.getImage();
        ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter != null && image != null) {
            try {
                ImageWriterCompat.queueInputImage(imageWriter, image);
                return true;
            } catch (IllegalStateException e11) {
                Logger.e(TAG, "enqueueImageToImageWriter throws IllegalStateException = " + e11.getMessage());
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByFlashMode() {
        return this.mIsZslDisabledByFlashMode;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public boolean isZslDisabledByUserCaseConfig() {
        return this.mIsZslDisabledByUseCaseConfig;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByFlashMode(boolean z11) {
        this.mIsZslDisabledByFlashMode = z11;
    }

    @Override // androidx.camera.camera2.internal.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean z11) {
        this.mIsZslDisabledByUseCaseConfig = z11;
    }
}
