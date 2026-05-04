package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CaptureBundles;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.p1;
import com.heytap.mcssdk.constant.MessageConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImagePipeline {
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();
    static final byte JPEG_QUALITY_MAX_QUALITY = 100;
    static final byte JPEG_QUALITY_MIN_LATENCY = 95;
    private static int sNextRequestId;

    @NonNull
    private final CaptureConfig mCaptureConfig;

    @NonNull
    private final CaptureNode mCaptureNode;

    @NonNull
    private final CaptureNode.In mPipelineIn;

    @NonNull
    private final ProcessingNode mProcessingNode;

    @NonNull
    private final ImageCaptureConfig mUseCaseConfig;

    @MainThread
    @VisibleForTesting
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size) {
        this(imageCaptureConfig, size, null, false, null, 35);
    }

    private CameraRequest createCameraRequest(int i11, @NonNull CaptureBundle captureBundle, @NonNull TakePictureRequest takePictureRequest, @NonNull TakePictureCallback takePictureCallback) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        for (CaptureStage captureStage : captureStages) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.getSessionConfigCameraCaptureCallbacks());
            builder.addSurface(this.mPipelineIn.getSurface());
            builder.setPostviewEnabled(shouldEnablePostview());
            if (ImageUtil.isJpegFormats(this.mPipelineIn.getInputFormat())) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(takePictureRequest.getRotationDegrees()));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(getCameraRequestJpegQuality(takePictureRequest)));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(valueOf, Integer.valueOf(captureStage.getId()));
            builder.setId(i11);
            builder.addCameraCaptureCallback(this.mPipelineIn.getCameraCaptureCallback());
            arrayList.add(builder.build());
        }
        return new CameraRequest(arrayList, takePictureCallback);
    }

    @NonNull
    private CaptureBundle createCaptureBundle() {
        CaptureBundle captureBundle = this.mUseCaseConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        Objects.requireNonNull(captureBundle);
        return captureBundle;
    }

    @NonNull
    private ProcessingRequest createProcessingRequest(int i11, @NonNull CaptureBundle captureBundle, @NonNull TakePictureRequest takePictureRequest, @NonNull TakePictureCallback takePictureCallback, @NonNull p1<Void> p1Var) {
        return new ProcessingRequest(captureBundle, takePictureRequest.getOutputFileOptions(), takePictureRequest.getCropRect(), takePictureRequest.getRotationDegrees(), takePictureRequest.getJpegQuality(), takePictureRequest.getSensorToBufferTransform(), takePictureCallback, p1Var, i11);
    }

    private int getOutputFormat() {
        Integer num = (Integer) this.mUseCaseConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.mUseCaseConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT, null);
        if (num2 == null || num2.intValue() != 4101) {
            return 256;
        }
        return MessageConstant.MessageType.MESSAGE_FIND_PHONE;
    }

    private boolean shouldEnablePostview() {
        return this.mPipelineIn.getPostviewSurface() != null;
    }

    @MainThread
    public void close() {
        Threads.checkMainThread();
        this.mCaptureNode.release();
        this.mProcessingNode.release();
    }

    @NonNull
    @MainThread
    public Pair<CameraRequest, ProcessingRequest> createRequests(@NonNull TakePictureRequest takePictureRequest, @NonNull TakePictureCallback takePictureCallback, @NonNull p1<Void> p1Var) {
        Threads.checkMainThread();
        CaptureBundle createCaptureBundle = createCaptureBundle();
        int i11 = sNextRequestId;
        sNextRequestId = i11 + 1;
        return new Pair<>(createCameraRequest(i11, createCaptureBundle, takePictureRequest, takePictureCallback), createProcessingRequest(i11, createCaptureBundle, takePictureRequest, takePictureCallback, p1Var));
    }

    @NonNull
    public SessionConfig.Builder createSessionConfigBuilder(@NonNull Size size) {
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.mUseCaseConfig, size);
        createFrom.addNonRepeatingSurface(this.mPipelineIn.getSurface());
        if (this.mPipelineIn.getPostviewSurface() != null) {
            createFrom.setPostviewSurface(this.mPipelineIn.getPostviewSurface());
        }
        return createFrom;
    }

    @VisibleForTesting
    public boolean expectsMetadata() {
        return this.mCaptureNode.getSafeCloseImageReaderProxy().getImageReaderProxy() instanceof MetadataImageReader;
    }

    public int getCameraRequestJpegQuality(@NonNull TakePictureRequest takePictureRequest) {
        return ((takePictureRequest.getOnDiskCallback() != null) && TransformUtils.hasCropping(takePictureRequest.getCropRect(), this.mPipelineIn.getSize())) ? takePictureRequest.getCaptureMode() == 0 ? 100 : 95 : takePictureRequest.getJpegQuality();
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        return this.mCaptureNode.getCapacity();
    }

    @NonNull
    @VisibleForTesting
    public CaptureNode getCaptureNode() {
        return this.mCaptureNode;
    }

    @Nullable
    @VisibleForTesting
    public Size getPostviewSize() {
        return this.mPipelineIn.getPostviewSize();
    }

    @NonNull
    @VisibleForTesting
    public ProcessingNode getProcessingNode() {
        return this.mProcessingNode;
    }

    @MainThread
    public void notifyCaptureError(@NonNull TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        this.mPipelineIn.getErrorEdge().accept(captureError);
    }

    @MainThread
    public void setOnImageCloseListener(@NonNull ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        this.mCaptureNode.setOnImageCloseListener(onImageCloseListener);
    }

    @MainThread
    public void submitProcessingRequest(@NonNull ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        this.mPipelineIn.getRequestEdge().accept(processingRequest);
    }

    @MainThread
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size, @Nullable CameraEffect cameraEffect, boolean z11) {
        this(imageCaptureConfig, size, cameraEffect, z11, null, 35);
    }

    @MainThread
    public ImagePipeline(@NonNull ImageCaptureConfig imageCaptureConfig, @NonNull Size size, @Nullable CameraEffect cameraEffect, boolean z11, @Nullable Size size2, int i11) {
        Threads.checkMainThread();
        this.mUseCaseConfig = imageCaptureConfig;
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        CaptureNode captureNode = new CaptureNode();
        this.mCaptureNode = captureNode;
        Executor ioExecutor = imageCaptureConfig.getIoExecutor(CameraXExecutors.ioExecutor());
        Objects.requireNonNull(ioExecutor);
        ProcessingNode processingNode = new ProcessingNode(ioExecutor, cameraEffect != null ? new InternalImageProcessor(cameraEffect) : null);
        this.mProcessingNode = processingNode;
        CaptureNode.In of2 = CaptureNode.In.of(size, imageCaptureConfig.getInputFormat(), getOutputFormat(), z11, imageCaptureConfig.getImageReaderProxyProvider(), size2, i11);
        this.mPipelineIn = of2;
        processingNode.transform(captureNode.transform(of2));
    }
}
