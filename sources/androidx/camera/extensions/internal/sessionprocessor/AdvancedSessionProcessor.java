package androidx.camera.extensions.internal.sessionprocessor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.RequestOptionConfig;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AdvancedSessionProcessor extends SessionProcessorBase {
    private static final String TAG = "AdvancedSessionProcessor";

    @NonNull
    private final Context mContext;

    @Nullable
    private final MutableLiveData<Integer> mCurrentExtensionTypeLiveData;

    @Nullable
    private final ExtensionMetadataMonitor mExtensionMetadataMonitor;

    @Nullable
    private final MutableLiveData<Integer> mExtensionStrengthLiveData;

    @NonNull
    private final SessionProcessorImpl mImpl;
    private boolean mIsPostviewConfigured;
    private final int mMode;

    @GuardedBy("mLock")
    private SessionProcessorImplCaptureCallbackAdapter mRepeatingCaptureCallbackAdapter;

    @NonNull
    private final VendorExtender mVendorExtender;
    private final boolean mWillReceiveOnCaptureCompleted;

    @GuardedBy("mLock")
    private HashMap<CaptureRequest.Key<?>, Object> mWorkingCaptureConfigMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CallbackAdapter implements RequestProcessor.Callback {
        private final RequestProcessorImpl.Callback mCallback;

        public CallbackAdapter(@NonNull RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(RequestProcessor.Request request) {
            Preconditions.checkArgument(request instanceof RequestAdapter);
            return ((RequestAdapter) request).getImplRequest();
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureBufferLost(@NonNull RequestProcessor.Request request, long j11, int i11) {
            this.mCallback.onCaptureBufferLost(getImplRequest(request), j11, i11);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureCompleted(@NonNull RequestProcessor.Request request, @Nullable CameraCaptureResult cameraCaptureResult) {
            CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
            Preconditions.checkArgument(captureResult instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(request), (TotalCaptureResult) captureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureFailed(@NonNull RequestProcessor.Request request, @Nullable CameraCaptureFailure cameraCaptureFailure) {
            Object captureFailure = cameraCaptureFailure.getCaptureFailure();
            Preconditions.checkArgument(captureFailure instanceof CaptureFailure, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(request), (CaptureFailure) captureFailure);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureProgressed(@NonNull RequestProcessor.Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
            CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
            Preconditions.checkArgument(captureResult != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(request), captureResult);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceAborted(int i11) {
            this.mCallback.onCaptureSequenceAborted(i11);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureSequenceCompleted(int i11, long j11) {
            this.mCallback.onCaptureSequenceCompleted(i11, j11);
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Callback
        public void onCaptureStarted(@NonNull RequestProcessor.Request request, long j11, long j12) {
            this.mCallback.onCaptureStarted(getImplRequest(request), j11, j12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExtensionMetadataMonitor {

        @Nullable
        private final MutableLiveData<Integer> mCurrentExtensionTypeLiveData;

        @Nullable
        private final MutableLiveData<Integer> mExtensionStrengthLiveData;

        public ExtensionMetadataMonitor(@Nullable MutableLiveData<Integer> mutableLiveData, @Nullable MutableLiveData<Integer> mutableLiveData2) {
            this.mCurrentExtensionTypeLiveData = mutableLiveData;
            this.mExtensionStrengthLiveData = mutableLiveData2;
        }

        private int convertExtensionMode(int i11) {
            if (i11 == 0) {
                return 5;
            }
            if (i11 == 1) {
                return 4;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 != 3) {
                return i11 != 4 ? 0 : 3;
            }
            return 2;
        }

        public void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            CaptureResult.Key key;
            CaptureResult.Key key2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null) {
                    key2 = CaptureResult.EXTENSION_CURRENT_TYPE;
                    Object obj = map.get(key2);
                    if (obj != null) {
                        Integer num = (Integer) obj;
                        if (!Objects.equals(this.mCurrentExtensionTypeLiveData.getValue(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                            this.mCurrentExtensionTypeLiveData.postValue(Integer.valueOf(convertExtensionMode(num.intValue())));
                        }
                    }
                }
                if (this.mExtensionStrengthLiveData != null) {
                    key = CaptureResult.EXTENSION_STRENGTH;
                    Object obj2 = map.get(key);
                    if (obj2 == null || Objects.equals(this.mExtensionStrengthLiveData.getValue(), obj2)) {
                        return;
                    }
                    this.mExtensionStrengthLiveData.postValue((Integer) obj2);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImageProcessorAdapter implements ImageProcessor {
        private final ImageProcessorImpl mImpl;

        public ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.ImageProcessor
        public void onNextImageAvailable(int i11, long j11, @NonNull ImageReference imageReference, @Nullable String str) {
            this.mImpl.onNextImageAvailable(i11, j11, new ImageReferenceImplAdapter(imageReference), str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final ImageReference mImageReference;

        public ImageReferenceImplAdapter(ImageReference imageReference) {
            this.mImageReference = imageReference;
        }

        public boolean decrement() {
            return this.mImageReference.decrement();
        }

        @Nullable
        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.increment();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        public OutputSurfaceConfigurationImplAdapter(@NonNull OutputSurfaceConfiguration outputSurfaceConfiguration) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getPreviewOutputSurface());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageCaptureOutputSurface());
            this.mAnalysisOutputSurface = outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null ? new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : null;
            this.mPostviewOutputSurface = outputSurfaceConfiguration.getPostviewOutputSurface() != null ? new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getPostviewOutputSurface()) : null;
        }

        @Nullable
        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        @NonNull
        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        @Nullable
        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        @NonNull
        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final OutputSurface mOutputSurface;

        public OutputSurfaceImplAdapter(OutputSurface outputSurface) {
            this.mOutputSurface = outputSurface;
        }

        public int getImageFormat() {
            return this.mOutputSurface.getImageFormat();
        }

        @NonNull
        public Size getSize() {
            return this.mOutputSurface.getSize();
        }

        @NonNull
        public Surface getSurface() {
            return this.mOutputSurface.getSurface();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RequestAdapter implements RequestProcessor.Request {
        private final RequestProcessorImpl.Request mImplRequest;
        private final Config mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        public RequestAdapter(@NonNull RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            RequestOptionConfig.Builder builder = new RequestOptionConfig.Builder();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                builder.setCaptureRequestOption(key, request.getParameters().get(key));
            }
            this.mParameters = builder.build();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        @Nullable
        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        @NonNull
        public Config getParameters() {
            return this.mParameters;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        @NonNull
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final RequestProcessor mRequestProcessor;

        public RequestProcessorImplAdapter(@NonNull RequestProcessor requestProcessor) {
            this.mRequestProcessor = requestProcessor;
        }

        public void abortCaptures() {
            this.mRequestProcessor.abortCaptures();
        }

        public void setImageProcessor(int i11, @NonNull ImageProcessorImpl imageProcessorImpl) {
            AdvancedSessionProcessor.this.setImageProcessor(i11, new ImageProcessorAdapter(imageProcessorImpl));
        }

        public int setRepeating(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.setRepeating(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.stopRepeating();
        }

        public int submit(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.submit(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public int submit(@NonNull List<RequestProcessorImpl.Request> list, @NonNull RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return this.mRequestProcessor.submit(arrayList, new CallbackAdapter(callback));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final SessionProcessor.CaptureCallback mCaptureCallback;

        @Nullable
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;

        @NonNull
        private final TagBundle mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        public SessionProcessorImplCaptureCallbackAdapter(@NonNull SessionProcessor.CaptureCallback captureCallback, @NonNull TagBundle tagBundle, boolean z11) {
            this(captureCallback, tagBundle, null, z11);
        }

        public void onCaptureCompleted(long j11, int i11, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.onCaptureCompleted(j11, i11, new KeyValueMapCameraCaptureResult(j11, this.mTagBundle, map));
                this.mCaptureCallback.onCaptureSequenceCompleted(i11);
            }
        }

        public void onCaptureFailed(int i11) {
            this.mCaptureCallback.onCaptureFailed(i11);
        }

        public void onCaptureProcessProgressed(int i11) {
            this.mCaptureCallback.onCaptureProcessProgressed(i11);
        }

        public void onCaptureProcessStarted(int i11) {
            this.mCaptureCallback.onCaptureProcessStarted(i11);
        }

        public void onCaptureSequenceAborted(int i11) {
            this.mCaptureCallback.onCaptureSequenceAborted(i11);
        }

        public void onCaptureSequenceCompleted(int i11) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            SessionProcessor.CaptureCallback captureCallback = this.mCaptureCallback;
            long j11 = this.mOnCaptureStartedTimestamp;
            captureCallback.onCaptureCompleted(j11, i11, new KeyValueMapCameraCaptureResult(j11, this.mTagBundle, Collections.EMPTY_MAP));
            this.mCaptureCallback.onCaptureSequenceCompleted(i11);
        }

        public void onCaptureStarted(int i11, long j11) {
            this.mOnCaptureStartedTimestamp = j11;
            this.mCaptureCallback.onCaptureStarted(i11, j11);
        }

        public SessionProcessorImplCaptureCallbackAdapter(@NonNull SessionProcessor.CaptureCallback captureCallback, @NonNull TagBundle tagBundle, @Nullable ExtensionMetadataMonitor extensionMetadataMonitor, boolean z11) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = captureCallback;
            this.mTagBundle = tagBundle;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z11;
        }
    }

    public AdvancedSessionProcessor(@NonNull SessionProcessorImpl sessionProcessorImpl, @NonNull List<CaptureRequest.Key> list, @NonNull VendorExtender vendorExtender, @NonNull Context context) {
        this(sessionProcessorImpl, list, vendorExtender, context, 0);
    }

    @NonNull
    private static HashMap<CaptureRequest.Key<?>, Object> convertConfigToMap(@NonNull Config config) {
        HashMap<CaptureRequest.Key<?>, Object> hashMap = new HashMap<>();
        RequestOptionConfig build = RequestOptionConfig.Builder.from(config).build();
        for (Config.Option<?> option : build.listOptions()) {
            hashMap.put((CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
        }
        return hashMap;
    }

    private Camera2SessionConfig convertToCamera2SessionConfig(@NonNull Camera2SessionConfigImpl camera2SessionConfigImpl) {
        Camera2SessionConfigBuilder camera2SessionConfigBuilder = new Camera2SessionConfigBuilder();
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            camera2SessionConfigBuilder.addOutputConfig(Camera2OutputConfigConverter.fromImpl((Camera2OutputConfigImpl) it.next()));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            camera2SessionConfigBuilder.addSessionParameter(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        camera2SessionConfigBuilder.setSessionTemplateId(camera2SessionConfigImpl.getSessionTemplateId());
        Version version = Version.VERSION_1_4;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                camera2SessionConfigBuilder.setSessionType(sessionType);
            } catch (NoSuchMethodError unused) {
                camera2SessionConfigBuilder.setSessionType(0);
            }
        }
        return camera2SessionConfigBuilder.build();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void abortCapture(int i11) {
        this.mImpl.abortCapture(i11);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase
    public void deInitSessionInternal() {
        synchronized (this.mLock) {
            this.mWorkingCaptureConfigMap = new HashMap<>();
            this.mRepeatingCaptureCallbackAdapter = null;
        }
        this.mImpl.deInitSession();
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    @NonNull
    public LiveData<Integer> getCurrentExtensionMode() {
        return this.mCurrentExtensionTypeLiveData;
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public LiveData<Integer> getExtensionStrength() {
        return this.mExtensionStrengthLiveData;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    @Nullable
    public Pair<Long, Long> getRealtimeCaptureLatency() {
        Version version = Version.VERSION_1_4;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImpl.getRealtimeCaptureLatency();
        }
        return null;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase, androidx.camera.core.impl.SessionProcessor
    @NonNull
    public /* bridge */ /* synthetic */ Set getSupportedCameraOperations() {
        return super.getSupportedCameraOperations();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    @NonNull
    public Map<Integer, List<Size>> getSupportedPostviewSize(@NonNull Size size) {
        return this.mVendorExtender.getSupportedPostviewResolutions(size);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SessionProcessorBase
    @NonNull
    public Camera2SessionConfig initSessionInternal(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map, @NonNull OutputSurfaceConfiguration outputSurfaceConfiguration) {
        Version version = Version.VERSION_1_4;
        Camera2SessionConfigImpl initSession = (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) ? this.mImpl.initSession(str, map, this.mContext, new OutputSurfaceConfigurationImplAdapter(outputSurfaceConfiguration)) : null;
        if (initSession == null) {
            initSession = this.mImpl.initSession(str, map, this.mContext, new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getPreviewOutputSurface()), new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageCaptureOutputSurface()), outputSurfaceConfiguration.getImageAnalysisOutputSurface() != null ? new OutputSurfaceImplAdapter(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : null);
        }
        this.mIsPostviewConfigured = outputSurfaceConfiguration.getPostviewOutputSurface() != null;
        MutableLiveData<Integer> mutableLiveData = this.mCurrentExtensionTypeLiveData;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Integer.valueOf(this.mMode));
        }
        MutableLiveData<Integer> mutableLiveData2 = this.mExtensionStrengthLiveData;
        if (mutableLiveData2 != null) {
            mutableLiveData2.postValue(100);
        }
        return convertToCamera2SessionConfig(initSession);
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public boolean isCurrentExtensionModeAvailable() {
        return this.mVendorExtender.isCurrentExtensionModeAvailable();
    }

    @Override // androidx.camera.extensions.CameraExtensionsInfo
    public boolean isExtensionStrengthAvailable() {
        return this.mVendorExtender.isExtensionStrengthAvailable();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionEnd() {
        this.mImpl.onCaptureSessionEnd();
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor) {
        this.mImpl.onCaptureSessionStart(new RequestProcessorImplAdapter(requestProcessor));
    }

    @Override // androidx.camera.extensions.CameraExtensionsControl
    public void setExtensionStrength(@IntRange(from = 0, to = 100) int i11) {
        CaptureRequest.Key<?> key;
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        HashMap hashMap;
        if (!isExtensionStrengthAvailable() || Build.VERSION.SDK_INT < 34) {
            return;
        }
        synchronized (this.mLock) {
            this.mExtensionStrength = i11;
            HashMap<CaptureRequest.Key<?>, Object> hashMap2 = this.mWorkingCaptureConfigMap;
            key = CaptureRequest.EXTENSION_STRENGTH;
            hashMap2.put(key, Integer.valueOf(this.mExtensionStrength));
            sessionProcessorImplCaptureCallbackAdapter = this.mRepeatingCaptureCallbackAdapter;
            hashMap = (HashMap) this.mWorkingCaptureConfigMap.clone();
        }
        this.mImpl.setParameters(hashMap);
        if (sessionProcessorImplCaptureCallbackAdapter != null) {
            this.mImpl.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void setParameters(@NonNull Config config) {
        HashMap<CaptureRequest.Key<?>, Object> convertConfigToMap;
        CaptureRequest.Key<?> key;
        synchronized (this.mLock) {
            try {
                convertConfigToMap = convertConfigToMap(config);
                if (this.mExtensionStrength != -1 && Build.VERSION.SDK_INT >= 34) {
                    key = CaptureRequest.EXTENSION_STRENGTH;
                    convertConfigToMap.put(key, Integer.valueOf(this.mExtensionStrength));
                }
                this.mWorkingCaptureConfigMap = convertConfigToMap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mImpl.setParameters(convertConfigToMap);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startCapture(boolean z11, @NonNull TagBundle tagBundle, @NonNull SessionProcessor.CaptureCallback captureCallback) {
        Logger.d(TAG, "startCapture postviewEnabled = " + z11 + " mWillReceiveOnCaptureCompleted = " + this.mWillReceiveOnCaptureCompleted);
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter = new SessionProcessorImplCaptureCallbackAdapter(captureCallback, tagBundle, this.mWillReceiveOnCaptureCompleted);
        Version version = Version.VERSION_1_4;
        return (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version) && this.mIsPostviewConfigured && z11 && this.mVendorExtender.isPostviewAvailable()) ? this.mImpl.startCaptureWithPostview(sessionProcessorImplCaptureCallbackAdapter) : this.mImpl.startCapture(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startRepeating(@NonNull TagBundle tagBundle, @NonNull SessionProcessor.CaptureCallback captureCallback) {
        SessionProcessorImplCaptureCallbackAdapter sessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.mLock) {
            sessionProcessorImplCaptureCallbackAdapter = new SessionProcessorImplCaptureCallbackAdapter(captureCallback, tagBundle, this.mExtensionMetadataMonitor, this.mWillReceiveOnCaptureCompleted);
            this.mRepeatingCaptureCallbackAdapter = sessionProcessorImplCaptureCallbackAdapter;
        }
        return this.mImpl.startRepeating(sessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public int startTrigger(@NonNull Config config, @NonNull TagBundle tagBundle, @NonNull SessionProcessor.CaptureCallback captureCallback) {
        HashMap<CaptureRequest.Key<?>, Object> convertConfigToMap = convertConfigToMap(config);
        Version version = Version.VERSION_1_3;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImpl.startTrigger(convertConfigToMap, new SessionProcessorImplCaptureCallbackAdapter(captureCallback, tagBundle, this.mWillReceiveOnCaptureCompleted));
        }
        return -1;
    }

    @Override // androidx.camera.core.impl.SessionProcessor
    public void stopRepeating() {
        this.mImpl.stopRepeating();
        synchronized (this.mLock) {
            this.mRepeatingCaptureCallbackAdapter = null;
        }
    }

    public AdvancedSessionProcessor(@NonNull SessionProcessorImpl sessionProcessorImpl, @NonNull List<CaptureRequest.Key> list, @NonNull VendorExtender vendorExtender, @NonNull Context context, int i11) {
        super(list);
        this.mIsPostviewConfigured = false;
        this.mWorkingCaptureConfigMap = new HashMap<>();
        this.mRepeatingCaptureCallbackAdapter = null;
        this.mImpl = sessionProcessorImpl;
        this.mVendorExtender = vendorExtender;
        this.mContext = context;
        this.mWillReceiveOnCaptureCompleted = vendorExtender.willReceiveOnCaptureCompleted();
        this.mMode = i11;
        MutableLiveData<Integer> mutableLiveData = isCurrentExtensionModeAvailable() ? new MutableLiveData<>(Integer.valueOf(i11)) : null;
        this.mCurrentExtensionTypeLiveData = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = isExtensionStrengthAvailable() ? new MutableLiveData<>(100) : null;
        this.mExtensionStrengthLiveData = mutableLiveData2;
        if (mutableLiveData == null && mutableLiveData2 == null) {
            this.mExtensionMetadataMonitor = null;
        } else {
            this.mExtensionMetadataMonitor = new ExtensionMetadataMonitor(mutableLiveData, mutableLiveData2);
        }
    }
}
