package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.CameraExtensionsControl;
import androidx.camera.extensions.CameraExtensionsInfo;
import androidx.camera.extensions.internal.ExtensionsUtils;
import androidx.camera.extensions.internal.RequestOptionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class SessionProcessorBase implements SessionProcessor, CameraExtensionsInfo, CameraExtensionsControl {
    protected static final int EXTENSION_STRENGTH_UNKNOWN = -1;
    private static final String TAG = "SessionProcessorBase";
    private String mCameraId;

    @Nullable
    private HandlerThread mImageReaderHandlerThread;

    @NonNull
    private final Set<Integer> mSupportedCameraOperations;

    @NonNull
    @GuardedBy("mLock")
    private final Map<Integer, ImageReader> mImageReaderMap = new HashMap();

    @GuardedBy("mLock")
    private final Map<Integer, Camera2OutputConfig> mOutputConfigMap = new HashMap();

    @GuardedBy("mLock")
    private final List<DeferrableSurface> mSurfacesList = new ArrayList();
    protected final Object mLock = new Object();

    @GuardedBy("mLock")
    protected int mExtensionStrength = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImageRefHolder implements ImageReference {
        private final Image mImage;
        private final Object mImageLock = new Object();
        private int mRefCount = 1;

        public ImageRefHolder(@NonNull Image image) {
            this.mImage = image;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean decrement() {
            synchronized (this.mImageLock) {
                try {
                    int i11 = this.mRefCount;
                    if (i11 <= 0) {
                        return false;
                    }
                    int i12 = i11 - 1;
                    this.mRefCount = i12;
                    if (i12 <= 0) {
                        this.mImage.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        @Nullable
        public Image get() {
            return this.mImage;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReference
        public boolean increment() {
            synchronized (this.mImageLock) {
                try {
                    int i11 = this.mRefCount;
                    if (i11 <= 0) {
                        return false;
                    }
                    this.mRefCount = i11 + 1;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public SessionProcessorBase(@NonNull List<CaptureRequest.Key> list) {
        this.mSupportedCameraOperations = getSupportedCameraOperations(list);
    }

    public static /* synthetic */ void a(ImageProcessor imageProcessor, int i11, String str, ImageReader imageReader) {
        try {
            Image acquireNextImage = imageReader.acquireNextImage();
            imageProcessor.onNextImageAvailable(i11, acquireNextImage.getTimestamp(), new ImageRefHolder(acquireNextImage), str);
        } catch (IllegalStateException e11) {
            Logger.e(TAG, "Failed to acquire next image.", e11);
        }
    }

    @NonNull
    private static SessionProcessorSurface createOutputConfigSurface(@NonNull Camera2OutputConfig camera2OutputConfig, Map<Integer, ImageReader> map) {
        if (camera2OutputConfig instanceof SurfaceOutputConfig) {
            return new SessionProcessorSurface(((SurfaceOutputConfig) camera2OutputConfig).getSurface(), camera2OutputConfig.getId());
        }
        if (camera2OutputConfig instanceof ImageReaderOutputConfig) {
            ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) camera2OutputConfig;
            final ImageReader newInstance = ImageReader.newInstance(imageReaderOutputConfig.getSize().getWidth(), imageReaderOutputConfig.getSize().getHeight(), imageReaderOutputConfig.getImageFormat(), imageReaderOutputConfig.getMaxImages());
            map.put(Integer.valueOf(camera2OutputConfig.getId()), newInstance);
            SessionProcessorSurface sessionProcessorSurface = new SessionProcessorSurface(newInstance.getSurface(), camera2OutputConfig.getId());
            sessionProcessorSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.e
                @Override // java.lang.Runnable
                public final void run() {
                    newInstance.close();
                }
            }, CameraXExecutors.directExecutor());
            return sessionProcessorSurface;
        }
        if (camera2OutputConfig instanceof MultiResolutionImageReaderOutputConfig) {
            throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
        }
        throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + camera2OutputConfig);
    }

    private Set<Integer> getSupportedCameraOperations(@NonNull List<CaptureRequest.Key> list) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        HashSet hashSet = new HashSet();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            key2 = CaptureRequest.CONTROL_ZOOM_RATIO;
            if (list.contains(key2) || list.contains(CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(Arrays.asList(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_MODE;
        if (list.containsAll(Arrays.asList(key3, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(Arrays.asList(key3, CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i11 >= 34) {
            key = CaptureRequest.EXTENSION_STRENGTH;
            if (list.contains(key)) {
                hashSet.add(8);
            }
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public final void deInitSession() {
        Logger.e(TAG, "deInitSession: cameraId=" + this.mCameraId);
        deInitSessionInternal();
        synchronized (this.mLock) {
            try {
                Iterator<DeferrableSurface> it = this.mSurfacesList.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.mSurfacesList.clear();
                this.mImageReaderMap.clear();
                this.mOutputConfigMap.clear();
                this.mExtensionStrength = -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HandlerThread handlerThread = this.mImageReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mImageReaderHandlerThread = null;
        }
    }

    public abstract void deInitSessionInternal();

    @Override // androidx.camera.core.impl.SessionProcessor
    @NonNull
    public final SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurfaceConfiguration outputSurfaceConfiguration) {
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        Camera2SessionConfig initSessionInternal = initSessionInternal(cameraInfoInternal.getCameraId(), ExtensionsUtils.getCameraCharacteristicsMap(cameraInfoInternal), outputSurfaceConfiguration);
        SessionConfig.Builder builder = new SessionConfig.Builder();
        synchronized (this.mLock) {
            try {
                for (Camera2OutputConfig camera2OutputConfig : initSessionInternal.getOutputConfigs()) {
                    SessionProcessorSurface createOutputConfigSurface = createOutputConfigSurface(camera2OutputConfig, this.mImageReaderMap);
                    this.mSurfacesList.add(createOutputConfigSurface);
                    this.mOutputConfigMap.put(Integer.valueOf(camera2OutputConfig.getId()), camera2OutputConfig);
                    SessionConfig.OutputConfig.Builder surfaceGroupId = SessionConfig.OutputConfig.builder(createOutputConfigSurface).setPhysicalCameraId(camera2OutputConfig.getPhysicalCameraId()).setSurfaceGroupId(camera2OutputConfig.getSurfaceGroupId());
                    List<Camera2OutputConfig> surfaceSharingOutputConfigs = camera2OutputConfig.getSurfaceSharingOutputConfigs();
                    if (surfaceSharingOutputConfigs != null && !surfaceSharingOutputConfigs.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Camera2OutputConfig camera2OutputConfig2 : surfaceSharingOutputConfigs) {
                            this.mOutputConfigMap.put(Integer.valueOf(camera2OutputConfig2.getId()), camera2OutputConfig2);
                            arrayList.add(createOutputConfigSurface(camera2OutputConfig2, this.mImageReaderMap));
                        }
                        surfaceGroupId.setSharedSurfaces(arrayList);
                    }
                    builder.addOutputConfig(surfaceGroupId.build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RequestOptionConfig.Builder builder2 = new RequestOptionConfig.Builder();
        for (CaptureRequest.Key<?> key : initSessionInternal.getSessionParameters().keySet()) {
            builder2.setCaptureRequestOption(key, initSessionInternal.getSessionParameters().get(key));
        }
        builder.setImplementationOptions(builder2.build());
        builder.setTemplateType(initSessionInternal.getSessionTemplateId());
        builder.setSessionType(initSessionInternal.getSessionType());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.mImageReaderHandlerThread = handlerThread;
        handlerThread.start();
        this.mCameraId = cameraInfoInternal.getCameraId();
        Logger.d(TAG, "initSession: cameraId=" + this.mCameraId);
        return builder.build();
    }

    @NonNull
    public abstract Camera2SessionConfig initSessionInternal(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull OutputSurfaceConfiguration outputSurfaceConfiguration);

    public void setImageProcessor(final int i11, @NonNull final ImageProcessor imageProcessor) {
        ImageReader imageReader;
        final String physicalCameraId;
        synchronized (this.mLock) {
            imageReader = this.mImageReaderMap.get(Integer.valueOf(i11));
            Camera2OutputConfig camera2OutputConfig = this.mOutputConfigMap.get(Integer.valueOf(i11));
            physicalCameraId = camera2OutputConfig == null ? null : camera2OutputConfig.getPhysicalCameraId();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.d
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    SessionProcessorBase.a(ImageProcessor.this, i11, physicalCameraId, imageReader2);
                }
            }, new Handler(this.mImageReaderHandlerThread.getLooper()));
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    @NonNull
    public Set<Integer> getSupportedCameraOperations() {
        return this.mSupportedCameraOperations;
    }
}
