package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.MediaStoreOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.CameraController;
import androidx.camera.view.RotationProvider;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.video.AudioConfig;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.p1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class CameraController {
    private static final float AE_SIZE = 0.25f;
    private static final float AF_SIZE = 0.16666667f;
    private static final String CAMERA_NOT_ATTACHED = "Use cases not attached to camera.";
    private static final String CAMERA_NOT_INITIALIZED = "Camera not initialized.";

    @Deprecated
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int IMAGE_ANALYSIS = 2;
    public static final int IMAGE_CAPTURE = 1;
    private static final String IMAGE_CAPTURE_DISABLED = "ImageCapture disabled.";
    private static final ImageCapture.ScreenFlash NO_OP_SCREEN_FLASH = new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.CameraController.1
        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void apply(long j11, @NonNull ImageCapture.ScreenFlashListener screenFlashListener) {
            screenFlashListener.onCompleted();
        }

        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void clear() {
        }
    };
    private static final String PREVIEW_VIEW_NOT_ATTACHED = "PreviewView not attached to CameraController.";
    private static final String TAG = "CameraController";
    public static final int TAP_TO_FOCUS_FAILED = 4;
    public static final int TAP_TO_FOCUS_FOCUSED = 2;
    public static final int TAP_TO_FOCUS_NOT_FOCUSED = 3;
    public static final int TAP_TO_FOCUS_NOT_STARTED = 0;
    public static final int TAP_TO_FOCUS_STARTED = 1;
    public static final int VIDEO_CAPTURE = 4;
    private static final String VIDEO_CAPTURE_DISABLED = "VideoCapture disabled.";
    private static final String VIDEO_RECORDING_UNFINISHED = "Recording video. Only one recording can be active at a time.";

    @Nullable
    Recording mActiveRecording;

    @Nullable
    private ImageAnalysis.Analyzer mAnalysisAnalyzer;

    @Nullable
    private Executor mAnalysisBackgroundExecutor;

    @Nullable
    private Executor mAnalysisExecutor;
    private final Context mAppContext;

    @Nullable
    Camera mCamera;

    @Nullable
    ProcessCameraProviderWrapper mCameraProvider;
    CameraSelector mCameraSelector;

    @NonNull
    @VisibleForTesting
    final RotationProvider.Listener mDeviceRotationListener;

    @NonNull
    private final Set<CameraEffect> mEffects;
    private int mEnabledUseCases;

    @NonNull
    ImageAnalysis mImageAnalysis;

    @Nullable
    ResolutionSelector mImageAnalysisResolutionSelector;

    @Nullable
    OutputSize mImageAnalysisTargetSize;

    @NonNull
    ImageCapture mImageCapture;

    @Nullable
    Executor mImageCaptureIoExecutor;

    @Nullable
    ResolutionSelector mImageCaptureResolutionSelector;

    @Nullable
    OutputSize mImageCaptureTargetSize;

    @NonNull
    private final p1<Void> mInitializationFuture;

    @NonNull
    private final PendingValue<Boolean> mPendingEnableTorch;

    @NonNull
    private final PendingValue<Float> mPendingLinearZoom;

    @NonNull
    private final PendingValue<Float> mPendingZoomRatio;
    private boolean mPinchToZoomEnabled;

    @NonNull
    Preview mPreview;

    @NonNull
    private DynamicRange mPreviewDynamicRange;

    @Nullable
    ResolutionSelector mPreviewResolutionSelector;

    @Nullable
    OutputSize mPreviewTargetSize;

    @NonNull
    Map<Consumer<VideoRecordEvent>, Recording> mRecordingMap;
    private final RotationProvider mRotationProvider;
    private final Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> mScreenFlashUiInfoMap;

    @Nullable
    Preview.SurfaceProvider mSurfaceProvider;
    private boolean mTapToFocusEnabled;
    final MutableLiveData<Integer> mTapToFocusState;
    private final ForwardingLiveData<Integer> mTorchState;

    @NonNull
    VideoCapture<Recorder> mVideoCapture;

    @NonNull
    private DynamicRange mVideoCaptureDynamicRange;
    private int mVideoCaptureMirrorMode;

    @NonNull
    QualitySelector mVideoCaptureQualitySelector;

    @NonNull
    private Range<Integer> mVideoCaptureTargetFrameRate;

    @Nullable
    ViewPort mViewPort;
    private final ForwardingLiveData<ZoomState> mZoomState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.camera.view.CameraController$2, reason: invalid class name */
    public class AnonymousClass2 implements Consumer<VideoRecordEvent> {
        final /* synthetic */ Consumer val$listener;
        final /* synthetic */ Executor val$mainExecutor;

        public AnonymousClass2(Executor executor, Consumer consumer) {
            this.val$mainExecutor = executor;
            this.val$listener = consumer;
        }

        @Override // androidx.core.util.Consumer
        public void accept(VideoRecordEvent videoRecordEvent) {
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                if (Threads.isMainThread()) {
                    CameraController.this.deactivateRecordingByListener(this);
                } else {
                    this.val$mainExecutor.execute(new Runnable() { // from class: androidx.camera.view.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraController.this.deactivateRecordingByListener(CameraController.AnonymousClass2.this);
                        }
                    });
                }
            }
            this.val$listener.accept(videoRecordEvent);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface UseCases {
    }

    public CameraController(@NonNull Context context) {
        this(context, Futures.transform(ProcessCameraProvider.getInstance(context), new Function() { // from class: androidx.camera.view.f
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new ProcessCameraProviderWrapperImpl((ProcessCameraProvider) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }

    public static /* synthetic */ Void a(CameraController cameraController, ProcessCameraProviderWrapper processCameraProviderWrapper) {
        cameraController.mCameraProvider = processCameraProviderWrapper;
        cameraController.unbindAllAndRecreate();
        cameraController.startCameraAndTrackStates();
        return null;
    }

    public static /* synthetic */ void b(CameraController cameraController, int i11) {
        cameraController.mImageAnalysis.setTargetRotation(i11);
        cameraController.mImageCapture.setTargetRotation(i11);
        cameraController.mVideoCapture.setTargetRotation(i11);
    }

    private void checkAudioPermissionGranted() {
        if (PermissionChecker.checkSelfPermission(this.mAppContext, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
        }
    }

    private void configureResolution(@NonNull ImageOutputConfig.Builder<?> builder, @Nullable ResolutionSelector resolutionSelector, @Nullable OutputSize outputSize) {
        AspectRatioStrategy viewportAspectRatioStrategy;
        if (resolutionSelector != null) {
            builder.setResolutionSelector(resolutionSelector);
            return;
        }
        if (outputSize != null) {
            setTargetOutputSize(builder, outputSize);
            return;
        }
        ViewPort viewPort = this.mViewPort;
        if (viewPort == null || (viewportAspectRatioStrategy = getViewportAspectRatioStrategy(viewPort)) == null) {
            return;
        }
        builder.setResolutionSelector(new ResolutionSelector.Builder().setAspectRatioStrategy(viewportAspectRatioStrategy).build());
    }

    private ImageAnalysis createImageAnalysis(Integer num, Integer num2, Integer num3) {
        ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
        if (num != null) {
            builder.setBackpressureStrategy(num.intValue());
        }
        if (num2 != null) {
            builder.setImageQueueDepth(num2.intValue());
        }
        if (num3 != null) {
            builder.setOutputImageFormat(num3.intValue());
        }
        configureResolution(builder, this.mImageAnalysisResolutionSelector, this.mImageAnalysisTargetSize);
        Executor executor = this.mAnalysisBackgroundExecutor;
        if (executor != null) {
            builder.setBackgroundExecutor(executor);
        }
        return builder.build();
    }

    private ImageCapture createImageCapture(Integer num) {
        ImageCapture.Builder builder = new ImageCapture.Builder();
        if (num != null) {
            builder.setCaptureMode(num.intValue());
        }
        configureResolution(builder, this.mImageCaptureResolutionSelector, this.mImageCaptureTargetSize);
        Executor executor = this.mImageCaptureIoExecutor;
        if (executor != null) {
            builder.setIoExecutor(executor);
        }
        return builder.build();
    }

    private Preview createPreview() {
        Preview.Builder builder = new Preview.Builder();
        configureResolution(builder, this.mPreviewResolutionSelector, this.mPreviewTargetSize);
        builder.setDynamicRange(this.mPreviewDynamicRange);
        return builder.build();
    }

    private VideoCapture<Recorder> createVideoCapture() {
        int viewportAspectRatioInt;
        Recorder.Builder qualitySelector = new Recorder.Builder().setQualitySelector(this.mVideoCaptureQualitySelector);
        ViewPort viewPort = this.mViewPort;
        if (viewPort != null && this.mVideoCaptureQualitySelector == Recorder.DEFAULT_QUALITY_SELECTOR && (viewportAspectRatioInt = getViewportAspectRatioInt(viewPort)) != -1) {
            qualitySelector.setAspectRatio(viewportAspectRatioInt);
        }
        return new VideoCapture.Builder(qualitySelector.build()).setTargetFrameRate(this.mVideoCaptureTargetFrameRate).setMirrorMode(this.mVideoCaptureMirrorMode).setDynamicRange(this.mVideoCaptureDynamicRange).build();
    }

    @MainThread
    private void deactivateRecording(@NonNull Recording recording) {
        if (this.mActiveRecording == recording) {
            this.mActiveRecording = null;
        }
    }

    private int getViewportAspectRatioInt(@NonNull ViewPort viewPort) {
        int surfaceRotationToDegrees = viewPort == null ? 0 : CameraOrientationUtil.surfaceRotationToDegrees(viewPort.getRotation());
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        int sensorRotationDegrees = processCameraProviderWrapper == null ? 0 : processCameraProviderWrapper.getCameraInfo(this.mCameraSelector).getSensorRotationDegrees();
        ProcessCameraProviderWrapper processCameraProviderWrapper2 = this.mCameraProvider;
        int relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, sensorRotationDegrees, processCameraProviderWrapper2 == null || processCameraProviderWrapper2.getCameraInfo(this.mCameraSelector).getLensFacing() == 1);
        Rational aspectRatio = viewPort.getAspectRatio();
        if (relativeImageRotation == 90 || relativeImageRotation == 270) {
            aspectRatio = new Rational(aspectRatio.getDenominator(), aspectRatio.getNumerator());
        }
        if (aspectRatio.equals(new Rational(4, 3))) {
            return 0;
        }
        return aspectRatio.equals(new Rational(16, 9)) ? 1 : -1;
    }

    @Nullable
    private AspectRatioStrategy getViewportAspectRatioStrategy(@NonNull ViewPort viewPort) {
        int viewportAspectRatioInt = getViewportAspectRatioInt(viewPort);
        if (viewportAspectRatioInt != -1) {
            return new AspectRatioStrategy(viewportAspectRatioInt, 1);
        }
        return null;
    }

    private boolean isCameraAttached() {
        return this.mCamera != null;
    }

    private boolean isCameraInitialized() {
        return this.mCameraProvider != null;
    }

    private boolean isOutputSizeEqual(@Nullable OutputSize outputSize, @Nullable OutputSize outputSize2) {
        if (outputSize == outputSize2) {
            return true;
        }
        return outputSize != null && outputSize.equals(outputSize2);
    }

    private boolean isPreviewViewAttached() {
        return (this.mSurfaceProvider == null || this.mViewPort == null) ? false : true;
    }

    private boolean isUseCaseEnabled(int i11) {
        return (i11 & this.mEnabledUseCases) != 0;
    }

    @MainThread
    private PendingRecording prepareRecording(@NonNull OutputOptions outputOptions) {
        Recorder output = this.mVideoCapture.getOutput();
        if (outputOptions instanceof FileOutputOptions) {
            return output.prepareRecording(this.mAppContext, (FileOutputOptions) outputOptions);
        }
        if (outputOptions instanceof FileDescriptorOutputOptions) {
            if (Build.VERSION.SDK_INT >= 26) {
                return output.prepareRecording(this.mAppContext, (FileDescriptorOutputOptions) outputOptions);
            }
            throw new UnsupportedOperationException("File descriptors are not supported on pre-Android O (API 26) devices.");
        }
        if (outputOptions instanceof MediaStoreOutputOptions) {
            return output.prepareRecording(this.mAppContext, (MediaStoreOutputOptions) outputOptions);
        }
        throw new IllegalArgumentException("Unsupported OutputOptions type.");
    }

    private void restartCameraIfAnalyzerResolutionChanged(@Nullable ImageAnalysis.Analyzer analyzer, @Nullable ImageAnalysis.Analyzer analyzer2) {
        if (Objects.equals(analyzer == null ? null : analyzer.getDefaultTargetResolution(), analyzer2 != null ? analyzer2.getDefaultTargetResolution() : null)) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    private void setActiveRecording(@NonNull Recording recording, @NonNull Consumer<VideoRecordEvent> consumer) {
        this.mRecordingMap.put(consumer, recording);
        this.mActiveRecording = recording;
    }

    private void setTargetOutputSize(@NonNull ImageOutputConfig.Builder<?> builder, @Nullable OutputSize outputSize) {
        if (outputSize == null) {
            return;
        }
        if (outputSize.getResolution() != null) {
            builder.setTargetResolution(outputSize.getResolution());
            return;
        }
        if (outputSize.getAspectRatio() != -1) {
            builder.setTargetAspectRatio(outputSize.getAspectRatio());
            return;
        }
        Logger.e(TAG, "Invalid target surface size. " + outputSize);
    }

    private float speedUpZoomBy2X(float f11) {
        return f11 > 1.0f ? ((f11 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f11) * 2.0f);
    }

    private void startListeningToRotationEvents() {
        this.mRotationProvider.addListener(CameraXExecutors.mainThreadExecutor(), this.mDeviceRotationListener);
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    @MainThread
    private Recording startRecordingInternal(@NonNull OutputOptions outputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isVideoCaptureEnabled(), VIDEO_CAPTURE_DISABLED);
        Preconditions.checkState(!isRecording(), VIDEO_RECORDING_UNFINISHED);
        Consumer<VideoRecordEvent> wrapListenerToDeactivateRecordingOnFinalized = wrapListenerToDeactivateRecordingOnFinalized(consumer);
        PendingRecording prepareRecording = prepareRecording(outputOptions);
        if (audioConfig.getAudioEnabled()) {
            checkAudioPermissionGranted();
            prepareRecording.withAudioEnabled();
        }
        Recording start = prepareRecording.start(executor, wrapListenerToDeactivateRecordingOnFinalized);
        setActiveRecording(start, wrapListenerToDeactivateRecordingOnFinalized);
        return start;
    }

    private void stopListeningToRotationEvents() {
        this.mRotationProvider.removeListener(this.mDeviceRotationListener);
    }

    @MainThread
    private void stopRecording() {
        Threads.checkMainThread();
        Recording recording = this.mActiveRecording;
        if (recording != null) {
            recording.stop();
            deactivateRecording(this.mActiveRecording);
        }
    }

    private void throwExceptionForInvalidScreenFlashCapture() {
        if (getImageCaptureFlashMode() == 3) {
            if (getScreenFlashUiInfoByPriority() == null || getScreenFlashUiInfoByPriority().getScreenFlash() == null) {
                throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
            }
        }
    }

    @MainThread
    private void unbindAllAndRecreate() {
        unbindPreviewAndRecreate();
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        unbindVideoAndRecreate();
    }

    @MainThread
    private void unbindImageAnalysisAndRecreate(Integer num, Integer num2, Integer num3) {
        ImageAnalysis.Analyzer analyzer;
        Threads.checkMainThread();
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mImageAnalysis);
        }
        ImageAnalysis createImageAnalysis = createImageAnalysis(num, num2, num3);
        this.mImageAnalysis = createImageAnalysis;
        Executor executor = this.mAnalysisExecutor;
        if (executor == null || (analyzer = this.mAnalysisAnalyzer) == null) {
            return;
        }
        createImageAnalysis.setAnalyzer(executor, analyzer);
    }

    @MainThread
    private void unbindImageCaptureAndRecreate(Integer num) {
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mImageCapture);
        }
        int flashMode = this.mImageCapture.getFlashMode();
        this.mImageCapture = createImageCapture(num);
        setImageCaptureFlashMode(flashMode);
    }

    @MainThread
    private void unbindPreviewAndRecreate() {
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mPreview);
        }
        Preview createPreview = createPreview();
        this.mPreview = createPreview;
        Preview.SurfaceProvider surfaceProvider = this.mSurfaceProvider;
        if (surfaceProvider != null) {
            createPreview.setSurfaceProvider(surfaceProvider);
        }
    }

    @MainThread
    private void unbindVideoAndRecreate() {
        if (isCameraInitialized()) {
            this.mCameraProvider.unbind(this.mVideoCapture);
        }
        this.mVideoCapture = createVideoCapture();
    }

    private Consumer<VideoRecordEvent> wrapListenerToDeactivateRecordingOnFinalized(@NonNull Consumer<VideoRecordEvent> consumer) {
        return new AnonymousClass2(ContextCompat.getMainExecutor(this.mAppContext), consumer);
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    @MainThread
    public void attachPreviewSurface(@NonNull Preview.SurfaceProvider surfaceProvider, @NonNull ViewPort viewPort) {
        Threads.checkMainThread();
        if (this.mSurfaceProvider != surfaceProvider) {
            this.mSurfaceProvider = surfaceProvider;
            this.mPreview.setSurfaceProvider(surfaceProvider);
        }
        boolean z11 = this.mViewPort == null || getViewportAspectRatioStrategy(viewPort) != getViewportAspectRatioStrategy(this.mViewPort);
        this.mViewPort = viewPort;
        startListeningToRotationEvents();
        if (z11) {
            unbindAllAndRecreate();
        }
        startCameraAndTrackStates();
    }

    @MainThread
    public void clearEffects() {
        Threads.checkMainThread();
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbindAll();
        }
        this.mEffects.clear();
        startCameraAndTrackStates();
    }

    @MainThread
    public void clearImageAnalysisAnalyzer() {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.mAnalysisAnalyzer;
        this.mAnalysisExecutor = null;
        this.mAnalysisAnalyzer = null;
        this.mImageAnalysis.clearAnalyzer();
        restartCameraIfAnalyzerResolutionChanged(analyzer, null);
    }

    @MainThread
    public void clearPreviewSurface() {
        Threads.checkMainThread();
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbind(this.mPreview, this.mImageCapture, this.mImageAnalysis, this.mVideoCapture);
        }
        this.mPreview.setSurfaceProvider(null);
        this.mCamera = null;
        this.mSurfaceProvider = null;
        this.mViewPort = null;
        stopListeningToRotationEvents();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseGroup createUseCaseGroup() {
        if (!isCameraInitialized()) {
            Logger.d(TAG, CAMERA_NOT_INITIALIZED);
            return null;
        }
        if (!isPreviewViewAttached()) {
            Logger.d(TAG, PREVIEW_VIEW_NOT_ATTACHED);
            return null;
        }
        UseCaseGroup.Builder addUseCase = new UseCaseGroup.Builder().addUseCase(this.mPreview);
        if (isImageCaptureEnabled()) {
            addUseCase.addUseCase(this.mImageCapture);
        } else {
            this.mCameraProvider.unbind(this.mImageCapture);
        }
        if (isImageAnalysisEnabled()) {
            addUseCase.addUseCase(this.mImageAnalysis);
        } else {
            this.mCameraProvider.unbind(this.mImageAnalysis);
        }
        if (isVideoCaptureEnabled()) {
            addUseCase.addUseCase(this.mVideoCapture);
        } else {
            this.mCameraProvider.unbind(this.mVideoCapture);
        }
        addUseCase.setViewPort(this.mViewPort);
        Iterator<CameraEffect> it = this.mEffects.iterator();
        while (it.hasNext()) {
            addUseCase.addEffect(it.next());
        }
        return addUseCase.build();
    }

    @MainThread
    public void deactivateRecordingByListener(@NonNull Consumer<VideoRecordEvent> consumer) {
        Recording remove = this.mRecordingMap.remove(consumer);
        if (remove != null) {
            deactivateRecording(remove);
        }
    }

    @NonNull
    @MainThread
    public p1<Void> enableTorch(boolean z11) {
        Threads.checkMainThread();
        return !isCameraAttached() ? this.mPendingEnableTorch.setValue(Boolean.valueOf(z11)) : this.mCamera.getCameraControl().enableTorch(z11);
    }

    @Nullable
    @MainThread
    public CameraControl getCameraControl() {
        Threads.checkMainThread();
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getCameraControl();
    }

    @Nullable
    @MainThread
    public CameraInfo getCameraInfo() {
        Threads.checkMainThread();
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getCameraInfo();
    }

    @NonNull
    @MainThread
    public CameraSelector getCameraSelector() {
        Threads.checkMainThread();
        return this.mCameraSelector;
    }

    @Nullable
    @MainThread
    public Executor getImageAnalysisBackgroundExecutor() {
        Threads.checkMainThread();
        return this.mAnalysisBackgroundExecutor;
    }

    @MainThread
    public int getImageAnalysisBackpressureStrategy() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getBackpressureStrategy();
    }

    @MainThread
    public int getImageAnalysisImageQueueDepth() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getImageQueueDepth();
    }

    @MainThread
    public int getImageAnalysisOutputImageFormat() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getOutputImageFormat();
    }

    @Nullable
    @MainThread
    public ResolutionSelector getImageAnalysisResolutionSelector() {
        Threads.checkMainThread();
        return this.mImageAnalysisResolutionSelector;
    }

    @Nullable
    @MainThread
    @Deprecated
    public OutputSize getImageAnalysisTargetSize() {
        Threads.checkMainThread();
        return this.mImageAnalysisTargetSize;
    }

    @MainThread
    public int getImageCaptureFlashMode() {
        Threads.checkMainThread();
        return this.mImageCapture.getFlashMode();
    }

    @Nullable
    @MainThread
    public Executor getImageCaptureIoExecutor() {
        Threads.checkMainThread();
        return this.mImageCaptureIoExecutor;
    }

    @MainThread
    public int getImageCaptureMode() {
        Threads.checkMainThread();
        return this.mImageCapture.getCaptureMode();
    }

    @Nullable
    @MainThread
    public ResolutionSelector getImageCaptureResolutionSelector() {
        Threads.checkMainThread();
        return this.mImageCaptureResolutionSelector;
    }

    @Nullable
    @MainThread
    @Deprecated
    public OutputSize getImageCaptureTargetSize() {
        Threads.checkMainThread();
        return this.mImageCaptureTargetSize;
    }

    @NonNull
    public p1<Void> getInitializationFuture() {
        return this.mInitializationFuture;
    }

    @NonNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DynamicRange getPreviewDynamicRange() {
        Threads.checkMainThread();
        return this.mPreviewDynamicRange;
    }

    @Nullable
    @MainThread
    public ResolutionSelector getPreviewResolutionSelector() {
        Threads.checkMainThread();
        return this.mPreviewResolutionSelector;
    }

    @Nullable
    @MainThread
    @Deprecated
    public OutputSize getPreviewTargetSize() {
        Threads.checkMainThread();
        return this.mPreviewTargetSize;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ScreenFlashUiInfo getScreenFlashUiInfoByPriority() {
        Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> map = this.mScreenFlashUiInfoMap;
        ScreenFlashUiInfo.ProviderType providerType = ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW;
        if (map.get(providerType) != null) {
            return this.mScreenFlashUiInfoMap.get(providerType);
        }
        Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> map2 = this.mScreenFlashUiInfoMap;
        ScreenFlashUiInfo.ProviderType providerType2 = ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW;
        if (map2.get(providerType2) != null) {
            return this.mScreenFlashUiInfoMap.get(providerType2);
        }
        return null;
    }

    @NonNull
    @MainThread
    public LiveData<Integer> getTapToFocusState() {
        Threads.checkMainThread();
        return this.mTapToFocusState;
    }

    @NonNull
    @MainThread
    public LiveData<Integer> getTorchState() {
        Threads.checkMainThread();
        return this.mTorchState;
    }

    @NonNull
    @MainThread
    public DynamicRange getVideoCaptureDynamicRange() {
        Threads.checkMainThread();
        return this.mVideoCaptureDynamicRange;
    }

    @MainThread
    public int getVideoCaptureMirrorMode() {
        Threads.checkMainThread();
        return this.mVideoCaptureMirrorMode;
    }

    @NonNull
    @MainThread
    public QualitySelector getVideoCaptureQualitySelector() {
        Threads.checkMainThread();
        return this.mVideoCaptureQualitySelector;
    }

    @NonNull
    @MainThread
    public Range<Integer> getVideoCaptureTargetFrameRate() {
        Threads.checkMainThread();
        return this.mVideoCaptureTargetFrameRate;
    }

    @NonNull
    @MainThread
    public LiveData<ZoomState> getZoomState() {
        Threads.checkMainThread();
        return this.mZoomState;
    }

    @MainThread
    public boolean hasCamera(@NonNull CameraSelector cameraSelector) {
        Threads.checkMainThread();
        Preconditions.checkNotNull(cameraSelector);
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper == null) {
            throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        }
        try {
            return processCameraProviderWrapper.hasCamera(cameraSelector);
        } catch (CameraInfoUnavailableException e11) {
            Logger.w(TAG, "Failed to check camera availability", e11);
            return false;
        }
    }

    @MainThread
    public boolean isImageAnalysisEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(2);
    }

    @MainThread
    public boolean isImageCaptureEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(1);
    }

    @MainThread
    public boolean isPinchToZoomEnabled() {
        Threads.checkMainThread();
        return this.mPinchToZoomEnabled;
    }

    @MainThread
    public boolean isRecording() {
        Threads.checkMainThread();
        Recording recording = this.mActiveRecording;
        return (recording == null || recording.isClosed()) ? false : true;
    }

    @MainThread
    public boolean isTapToFocusEnabled() {
        Threads.checkMainThread();
        return this.mTapToFocusEnabled;
    }

    @MainThread
    public boolean isVideoCaptureEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(4);
    }

    public void onPinchToZoom(float f11) {
        if (!isCameraAttached()) {
            Logger.w(TAG, CAMERA_NOT_ATTACHED);
            return;
        }
        if (!this.mPinchToZoomEnabled) {
            Logger.d(TAG, "Pinch to zoom disabled.");
            return;
        }
        Logger.d(TAG, "Pinch to zoom with scale: " + f11);
        ZoomState value = getZoomState().getValue();
        if (value == null) {
            return;
        }
        setZoomRatio(Math.min(Math.max(value.getZoomRatio() * speedUpZoomBy2X(f11), value.getMinZoomRatio()), value.getMaxZoomRatio()));
    }

    public void onTapToFocus(MeteringPointFactory meteringPointFactory, float f11, float f12) {
        if (!isCameraAttached()) {
            Logger.w(TAG, CAMERA_NOT_ATTACHED);
            return;
        }
        if (!this.mTapToFocusEnabled) {
            Logger.d(TAG, "Tap to focus disabled. ");
            return;
        }
        Logger.d(TAG, "Tap to focus started: " + f11 + j2.O + f12);
        this.mTapToFocusState.postValue(1);
        Futures.addCallback(this.mCamera.getCameraControl().startFocusAndMetering(new FocusMeteringAction.Builder(meteringPointFactory.createPoint(f11, f12, 0.16666667f), 1).addPoint(meteringPointFactory.createPoint(f11, f12, 0.25f), 2).build()), new FutureCallback<FocusMeteringResult>() { // from class: androidx.camera.view.CameraController.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof CameraControl.OperationCanceledException) {
                    Logger.d(CameraController.TAG, "Tap-to-focus is canceled by new action.");
                } else {
                    Logger.d(CameraController.TAG, "Tap to focus failed.", th2);
                    CameraController.this.mTapToFocusState.postValue(4);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable FocusMeteringResult focusMeteringResult) {
                if (focusMeteringResult == null) {
                    return;
                }
                Logger.d(CameraController.TAG, "Tap to focus onSuccess: " + focusMeteringResult.isFocusSuccessful());
                CameraController.this.mTapToFocusState.postValue(Integer.valueOf(focusMeteringResult.isFocusSuccessful() ? 2 : 3));
            }
        }, CameraXExecutors.directExecutor());
    }

    @MainThread
    public void setCameraSelector(@NonNull CameraSelector cameraSelector) {
        Threads.checkMainThread();
        if (this.mCameraSelector == cameraSelector) {
            return;
        }
        Integer lensFacing = cameraSelector.getLensFacing();
        if (this.mImageCapture.getFlashMode() == 3 && lensFacing != null && lensFacing.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        final CameraSelector cameraSelector2 = this.mCameraSelector;
        this.mCameraSelector = cameraSelector;
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper == null) {
            return;
        }
        processCameraProviderWrapper.unbind(this.mPreview, this.mImageCapture, this.mImageAnalysis, this.mVideoCapture);
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.h
            @Override // java.lang.Runnable
            public final void run() {
                CameraController.this.mCameraSelector = cameraSelector2;
            }
        });
    }

    @MainThread
    public void setEffects(@NonNull Set<CameraEffect> set) {
        Threads.checkMainThread();
        if (Objects.equals(this.mEffects, set)) {
            return;
        }
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbindAll();
        }
        this.mEffects.clear();
        this.mEffects.addAll(set);
        startCameraAndTrackStates();
    }

    @MainThread
    public void setEnabledUseCases(int i11) {
        Threads.checkMainThread();
        final int i12 = this.mEnabledUseCases;
        if (i11 == i12) {
            return;
        }
        this.mEnabledUseCases = i11;
        if (!isVideoCaptureEnabled() && isRecording()) {
            stopRecording();
        }
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.g
            @Override // java.lang.Runnable
            public final void run() {
                CameraController.this.mEnabledUseCases = i12;
            }
        });
    }

    @MainThread
    public void setImageAnalysisAnalyzer(@NonNull Executor executor, @NonNull ImageAnalysis.Analyzer analyzer) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer2 = this.mAnalysisAnalyzer;
        if (analyzer2 == analyzer && this.mAnalysisExecutor == executor) {
            return;
        }
        this.mAnalysisExecutor = executor;
        this.mAnalysisAnalyzer = analyzer;
        this.mImageAnalysis.setAnalyzer(executor, analyzer);
        restartCameraIfAnalyzerResolutionChanged(analyzer2, analyzer);
    }

    @MainThread
    public void setImageAnalysisBackgroundExecutor(@Nullable Executor executor) {
        Threads.checkMainThread();
        if (this.mAnalysisBackgroundExecutor == executor) {
            return;
        }
        this.mAnalysisBackgroundExecutor = executor;
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageAnalysisBackpressureStrategy(int i11) {
        Threads.checkMainThread();
        if (this.mImageAnalysis.getBackpressureStrategy() == i11) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(i11), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageAnalysisImageQueueDepth(int i11) {
        Threads.checkMainThread();
        if (this.mImageAnalysis.getImageQueueDepth() == i11) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(i11), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageAnalysisOutputImageFormat(int i11) {
        Threads.checkMainThread();
        if (i11 == this.mImageAnalysis.getOutputImageFormat()) {
            return;
        }
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(i11));
    }

    @MainThread
    public void setImageAnalysisResolutionSelector(@Nullable ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        if (this.mImageAnalysisResolutionSelector == resolutionSelector) {
            return;
        }
        this.mImageAnalysisResolutionSelector = resolutionSelector;
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    @Deprecated
    public void setImageAnalysisTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (isOutputSizeEqual(this.mImageAnalysisTargetSize, outputSize)) {
            return;
        }
        this.mImageAnalysisTargetSize = outputSize;
        unbindImageAnalysisAndRecreate(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageCaptureFlashMode(int i11) {
        Threads.checkMainThread();
        if (i11 == 3) {
            Integer lensFacing = this.mCameraSelector.getLensFacing();
            if (lensFacing != null && lensFacing.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            updateScreenFlashToImageCapture();
        }
        this.mImageCapture.setFlashMode(i11);
    }

    @MainThread
    public void setImageCaptureIoExecutor(@Nullable Executor executor) {
        Threads.checkMainThread();
        if (this.mImageCaptureIoExecutor == executor) {
            return;
        }
        this.mImageCaptureIoExecutor = executor;
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageCaptureMode(int i11) {
        Threads.checkMainThread();
        if (this.mImageCapture.getCaptureMode() == i11) {
            return;
        }
        unbindImageCaptureAndRecreate(Integer.valueOf(i11));
        startCameraAndTrackStates();
    }

    @MainThread
    public void setImageCaptureResolutionSelector(@Nullable ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        if (this.mImageCaptureResolutionSelector == resolutionSelector) {
            return;
        }
        this.mImageCaptureResolutionSelector = resolutionSelector;
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        startCameraAndTrackStates();
    }

    @MainThread
    @Deprecated
    public void setImageCaptureTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (isOutputSizeEqual(this.mImageCaptureTargetSize, outputSize)) {
            return;
        }
        this.mImageCaptureTargetSize = outputSize;
        unbindImageCaptureAndRecreate(Integer.valueOf(getImageCaptureMode()));
        startCameraAndTrackStates();
    }

    @NonNull
    @MainThread
    public p1<Void> setLinearZoom(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        Threads.checkMainThread();
        return !isCameraAttached() ? this.mPendingLinearZoom.setValue(Float.valueOf(f11)) : this.mCamera.getCameraControl().setLinearZoom(f11);
    }

    @MainThread
    public void setPinchToZoomEnabled(boolean z11) {
        Threads.checkMainThread();
        this.mPinchToZoomEnabled = z11;
    }

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPreviewDynamicRange(@NonNull DynamicRange dynamicRange) {
        Threads.checkMainThread();
        this.mPreviewDynamicRange = dynamicRange;
        unbindPreviewAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setPreviewResolutionSelector(@Nullable ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        if (this.mPreviewResolutionSelector == resolutionSelector) {
            return;
        }
        this.mPreviewResolutionSelector = resolutionSelector;
        unbindPreviewAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    @Deprecated
    public void setPreviewTargetSize(@Nullable OutputSize outputSize) {
        Threads.checkMainThread();
        if (isOutputSizeEqual(this.mPreviewTargetSize, outputSize)) {
            return;
        }
        this.mPreviewTargetSize = outputSize;
        unbindPreviewAndRecreate();
        startCameraAndTrackStates();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setScreenFlashUiInfo(@NonNull ScreenFlashUiInfo screenFlashUiInfo) {
        ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        this.mScreenFlashUiInfoMap.put(screenFlashUiInfo.getProviderType(), screenFlashUiInfo);
        ScreenFlashUiInfo screenFlashUiInfoByPriority2 = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority2 == null || screenFlashUiInfoByPriority2.equals(screenFlashUiInfoByPriority)) {
            return;
        }
        updateScreenFlashToImageCapture();
    }

    @MainThread
    public void setTapToFocusEnabled(boolean z11) {
        Threads.checkMainThread();
        this.mTapToFocusEnabled = z11;
    }

    @MainThread
    public void setVideoCaptureDynamicRange(@NonNull DynamicRange dynamicRange) {
        Threads.checkMainThread();
        this.mVideoCaptureDynamicRange = dynamicRange;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setVideoCaptureMirrorMode(int i11) {
        Threads.checkMainThread();
        this.mVideoCaptureMirrorMode = i11;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setVideoCaptureQualitySelector(@NonNull QualitySelector qualitySelector) {
        Threads.checkMainThread();
        this.mVideoCaptureQualitySelector = qualitySelector;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @MainThread
    public void setVideoCaptureTargetFrameRate(@NonNull Range<Integer> range) {
        Threads.checkMainThread();
        this.mVideoCaptureTargetFrameRate = range;
        unbindVideoAndRecreate();
        startCameraAndTrackStates();
    }

    @NonNull
    @MainThread
    public p1<Void> setZoomRatio(float f11) {
        Threads.checkMainThread();
        return !isCameraAttached() ? this.mPendingZoomRatio.setValue(Float.valueOf(f11)) : this.mCamera.getCameraControl().setZoomRatio(f11);
    }

    @Nullable
    public abstract Camera startCamera();

    public void startCameraAndTrackStates() {
        startCameraAndTrackStates(null);
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(@NonNull FileOutputOptions fileOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(fileOutputOptions, audioConfig, executor, consumer);
    }

    @MainThread
    public void takePicture(@NonNull ImageCapture.OutputFileOptions outputFileOptions, @NonNull Executor executor, @NonNull ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isImageCaptureEnabled(), IMAGE_CAPTURE_DISABLED);
        throwExceptionForInvalidScreenFlashCapture();
        updateMirroringFlagInOutputFileOptions(outputFileOptions);
        this.mImageCapture.takePicture(outputFileOptions, executor, onImageSavedCallback);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void updateMirroringFlagInOutputFileOptions(@NonNull ImageCapture.OutputFileOptions outputFileOptions) {
        if (this.mCameraSelector.getLensFacing() == null || outputFileOptions.getMetadata().isReversedHorizontalSet()) {
            return;
        }
        outputFileOptions.getMetadata().setReversedHorizontal(this.mCameraSelector.getLensFacing().intValue() == 0);
    }

    @OptIn(markerClass = {TransformExperimental.class})
    @MainThread
    public void updatePreviewViewTransform(@Nullable Matrix matrix) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.mAnalysisAnalyzer;
        if (analyzer != null && analyzer.getTargetCoordinateSystem() == 1) {
            this.mAnalysisAnalyzer.updateTransform(matrix);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void updateScreenFlashToImageCapture() {
        ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority == null) {
            Logger.d(TAG, "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.mImageCapture.setScreenFlash(NO_OP_SCREEN_FLASH);
            return;
        }
        this.mImageCapture.setScreenFlash(screenFlashUiInfoByPriority.getScreenFlash());
        Logger.d(TAG, "Set ScreenFlash instance to ImageCapture, provided by " + screenFlashUiInfoByPriority.getProviderType().name());
    }

    public void startCameraAndTrackStates(@Nullable Runnable runnable) {
        try {
            this.mCamera = startCamera();
            if (!isCameraAttached()) {
                Logger.d(TAG, CAMERA_NOT_ATTACHED);
                return;
            }
            this.mZoomState.setSource(this.mCamera.getCameraInfo().getZoomState());
            this.mTorchState.setSource(this.mCamera.getCameraInfo().getTorchState());
            this.mPendingEnableTorch.propagateIfHasValue(new Function() { // from class: androidx.camera.view.a
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.enableTorch(((Boolean) obj).booleanValue());
                }
            });
            this.mPendingLinearZoom.propagateIfHasValue(new Function() { // from class: androidx.camera.view.b
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.setLinearZoom(((Float) obj).floatValue());
                }
            });
            this.mPendingZoomRatio.propagateIfHasValue(new Function() { // from class: androidx.camera.view.c
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return CameraController.this.setZoomRatio(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e11) {
            if (runnable != null) {
                runnable.run();
            }
            throw e11;
        }
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @RequiresApi(26)
    @MainThread
    public Recording startRecording(@NonNull FileDescriptorOutputOptions fileDescriptorOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(fileDescriptorOutputOptions, audioConfig, executor, consumer);
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    @MainThread
    public Recording startRecording(@NonNull MediaStoreOutputOptions mediaStoreOutputOptions, @NonNull AudioConfig audioConfig, @NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(mediaStoreOutputOptions, audioConfig, executor, consumer);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public static final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;
        private final int mAspectRatio;

        @Nullable
        private final Size mResolution;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface OutputAspectRatio {
        }

        public OutputSize(int i11) {
            Preconditions.checkArgument(i11 != -1);
            this.mAspectRatio = i11;
            this.mResolution = null;
        }

        public int getAspectRatio() {
            return this.mAspectRatio;
        }

        @Nullable
        public Size getResolution() {
            return this.mResolution;
        }

        @NonNull
        public String toString() {
            return "aspect ratio: " + this.mAspectRatio + " resolution: " + this.mResolution;
        }

        public OutputSize(@NonNull Size size) {
            Preconditions.checkNotNull(size);
            this.mAspectRatio = -1;
            this.mResolution = size;
        }
    }

    public CameraController(@NonNull Context context, @NonNull p1<ProcessCameraProviderWrapper> p1Var) {
        this.mCameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        this.mEnabledUseCases = 3;
        this.mActiveRecording = null;
        this.mRecordingMap = new HashMap();
        this.mVideoCaptureQualitySelector = Recorder.DEFAULT_QUALITY_SELECTOR;
        this.mVideoCaptureMirrorMode = 0;
        DynamicRange dynamicRange = DynamicRange.UNSPECIFIED;
        this.mVideoCaptureDynamicRange = dynamicRange;
        this.mPreviewDynamicRange = dynamicRange;
        this.mVideoCaptureTargetFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        this.mPinchToZoomEnabled = true;
        this.mTapToFocusEnabled = true;
        this.mZoomState = new ForwardingLiveData<>();
        this.mTorchState = new ForwardingLiveData<>();
        this.mTapToFocusState = new MutableLiveData<>(0);
        this.mPendingEnableTorch = new PendingValue<>();
        this.mPendingLinearZoom = new PendingValue<>();
        this.mPendingZoomRatio = new PendingValue<>();
        this.mEffects = new HashSet();
        this.mScreenFlashUiInfoMap = new HashMap();
        Context applicationContext = ContextUtil.getApplicationContext(context);
        this.mAppContext = applicationContext;
        this.mPreview = createPreview();
        this.mImageCapture = createImageCapture(null);
        this.mImageAnalysis = createImageAnalysis(null, null, null);
        this.mVideoCapture = createVideoCapture();
        this.mInitializationFuture = Futures.transform(p1Var, new Function() { // from class: androidx.camera.view.d
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return CameraController.a(CameraController.this, (ProcessCameraProviderWrapper) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
        this.mRotationProvider = new RotationProvider(applicationContext);
        this.mDeviceRotationListener = new RotationProvider.Listener() { // from class: androidx.camera.view.e
            @Override // androidx.camera.view.RotationProvider.Listener
            public final void onRotationChanged(int i11) {
                CameraController.b(CameraController.this, i11);
            }
        };
    }

    @MainThread
    public void takePicture(@NonNull Executor executor, @NonNull ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isImageCaptureEnabled(), IMAGE_CAPTURE_DISABLED);
        throwExceptionForInvalidScreenFlashCapture();
        this.mImageCapture.takePicture(executor, onImageCapturedCallback);
    }
}
