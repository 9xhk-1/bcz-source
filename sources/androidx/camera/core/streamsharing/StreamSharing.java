package androidx.camera.core.streamsharing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.j;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.concurrent.DualOutConfig;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class StreamSharing extends UseCase {
    private static final String TAG = "StreamSharing";

    @Nullable
    private SurfaceEdge mCameraEdge;

    @Nullable
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;

    @NonNull
    private final StreamSharingConfig mDefaultConfig;

    @Nullable
    private DualSurfaceProcessorNode mDualSharingNode;

    @Nullable
    private SurfaceProcessorNode mEffectNode;

    @NonNull
    private final LayoutSettings mLayoutSettings;

    @Nullable
    private SurfaceEdge mSecondaryCameraEdge;

    @NonNull
    private final LayoutSettings mSecondaryLayoutSettings;
    SessionConfig.Builder mSecondarySessionConfigBuilder;

    @Nullable
    private SurfaceEdge mSecondarySharingInputEdge;
    SessionConfig.Builder mSessionConfigBuilder;

    @Nullable
    private SurfaceEdge mSharingInputEdge;

    @Nullable
    private SurfaceProcessorNode mSharingNode;

    @NonNull
    private final VirtualCameraAdapter mVirtualCameraAdapter;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Control {
        @NonNull
        p1<Void> jpegSnapshot(@IntRange(from = 0, to = 100) int i11, @IntRange(from = 0, to = 359) int i12);
    }

    public StreamSharing(@NonNull CameraInternal cameraInternal, @Nullable CameraInternal cameraInternal2, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2, @NonNull Set<UseCase> set, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        super(getDefaultConfig(set));
        this.mDefaultConfig = getDefaultConfig(set);
        this.mLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
        this.mVirtualCameraAdapter = new VirtualCameraAdapter(cameraInternal, cameraInternal2, set, useCaseConfigFactory, new Control() { // from class: androidx.camera.core.streamsharing.c
            @Override // androidx.camera.core.streamsharing.StreamSharing.Control
            public final p1 jpegSnapshot(int i11, int i12) {
                return StreamSharing.b(StreamSharing.this, i11, i12);
            }
        });
    }

    public static /* synthetic */ void a(StreamSharing streamSharing, String str, String str2, UseCaseConfig useCaseConfig, StreamSpec streamSpec, StreamSpec streamSpec2, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (streamSharing.getCamera() == null) {
            return;
        }
        streamSharing.clearPipeline();
        streamSharing.updateSessionConfig(streamSharing.createPipelineAndUpdateChildrenSpecs(str, str2, useCaseConfig, streamSpec, streamSpec2));
        streamSharing.notifyReset();
        streamSharing.mVirtualCameraAdapter.resetChildren();
    }

    private void addCameraErrorListener(@NonNull SessionConfig.Builder builder, @NonNull final String str, @Nullable final String str2, @NonNull final UseCaseConfig<?> useCaseConfig, @NonNull final StreamSpec streamSpec, @Nullable final StreamSpec streamSpec2) {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.core.streamsharing.b
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                StreamSharing.a(StreamSharing.this, str, str2, useCaseConfig, streamSpec, streamSpec2, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builder.setErrorListener(closeableErrorListener2);
    }

    public static /* synthetic */ p1 b(StreamSharing streamSharing, int i11, int i12) {
        SurfaceProcessorNode surfaceProcessorNode = streamSharing.mSharingNode;
        return surfaceProcessorNode != null ? surfaceProcessorNode.getSurfaceProcessor().snapshot(i11, i12) : Futures.immediateFailedFuture(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void clearPipeline() {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        SurfaceEdge surfaceEdge2 = this.mSecondaryCameraEdge;
        if (surfaceEdge2 != null) {
            surfaceEdge2.close();
            this.mSecondaryCameraEdge = null;
        }
        SurfaceEdge surfaceEdge3 = this.mSharingInputEdge;
        if (surfaceEdge3 != null) {
            surfaceEdge3.close();
            this.mSharingInputEdge = null;
        }
        SurfaceEdge surfaceEdge4 = this.mSecondarySharingInputEdge;
        if (surfaceEdge4 != null) {
            surfaceEdge4.close();
            this.mSecondarySharingInputEdge = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.mSharingNode;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.mSharingNode = null;
        }
        DualSurfaceProcessorNode dualSurfaceProcessorNode = this.mDualSharingNode;
        if (dualSurfaceProcessorNode != null) {
            dualSurfaceProcessorNode.release();
            this.mDualSharingNode = null;
        }
        SurfaceProcessorNode surfaceProcessorNode2 = this.mEffectNode;
        if (surfaceProcessorNode2 != null) {
            surfaceProcessorNode2.release();
            this.mEffectNode = null;
        }
    }

    @NonNull
    @MainThread
    private List<SessionConfig> createPipelineAndUpdateChildrenSpecs(@NonNull String str, @Nullable String str2, @NonNull UseCaseConfig<?> useCaseConfig, @NonNull StreamSpec streamSpec, @Nullable StreamSpec streamSpec2) {
        List<SessionConfig> a11;
        List<SessionConfig> a12;
        Threads.checkMainThread();
        if (streamSpec2 != null) {
            createPrimaryCamera(str, str2, useCaseConfig, streamSpec, streamSpec2);
            createSecondaryCamera(str, str2, useCaseConfig, streamSpec, streamSpec2);
            this.mDualSharingNode = getDualSharingNode(getCamera(), getSecondaryCamera(), streamSpec, this.mLayoutSettings, this.mSecondaryLayoutSettings);
            Map<UseCase, DualOutConfig> childrenOutConfigs = this.mVirtualCameraAdapter.getChildrenOutConfigs(this.mSharingInputEdge, this.mSecondarySharingInputEdge, getTargetRotationInternal(), getViewPortCropRect() != null);
            DualSurfaceProcessorNode.Out transform = this.mDualSharingNode.transform(DualSurfaceProcessorNode.In.of(this.mSharingInputEdge, this.mSecondarySharingInputEdge, new ArrayList(childrenOutConfigs.values())));
            HashMap hashMap = new HashMap();
            for (Map.Entry<UseCase, DualOutConfig> entry : childrenOutConfigs.entrySet()) {
                hashMap.put(entry.getKey(), transform.get(entry.getValue()));
            }
            this.mVirtualCameraAdapter.setChildrenEdges(hashMap);
            a11 = j.a(new Object[]{this.mSessionConfigBuilder.build(), this.mSecondarySessionConfigBuilder.build()});
            return a11;
        }
        createPrimaryCamera(str, str2, useCaseConfig, streamSpec, null);
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        this.mSharingNode = getSharingNode(camera, streamSpec);
        Map<UseCase, OutConfig> childrenOutConfigs2 = this.mVirtualCameraAdapter.getChildrenOutConfigs(this.mSharingInputEdge, getTargetRotationInternal(), getViewPortCropRect() != null);
        SurfaceProcessorNode.Out transform2 = this.mSharingNode.transform(SurfaceProcessorNode.In.of(this.mSharingInputEdge, new ArrayList(childrenOutConfigs2.values())));
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<UseCase, OutConfig> entry2 : childrenOutConfigs2.entrySet()) {
            hashMap2.put(entry2.getKey(), transform2.get(entry2.getValue()));
        }
        this.mVirtualCameraAdapter.setChildrenEdges(hashMap2);
        a12 = j.a(new Object[]{this.mSessionConfigBuilder.build()});
        return a12;
    }

    private void createPrimaryCamera(@NonNull String str, @Nullable String str2, @NonNull UseCaseConfig<?> useCaseConfig, @NonNull StreamSpec streamSpec, @Nullable StreamSpec streamSpec2) {
        Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        boolean hasTransform = camera.getHasTransform();
        Rect cropRect = getCropRect(streamSpec.getResolution());
        Objects.requireNonNull(cropRect);
        CameraInternal camera2 = getCamera();
        Objects.requireNonNull(camera2);
        int relativeRotation = getRelativeRotation(camera2);
        CameraInternal camera3 = getCamera();
        Objects.requireNonNull(camera3);
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, cropRect, relativeRotation, -1, isMirroringRequired(camera3));
        this.mCameraEdge = surfaceEdge;
        CameraInternal camera4 = getCamera();
        Objects.requireNonNull(camera4);
        this.mSharingInputEdge = getSharingInputEdge(surfaceEdge, camera4);
        SessionConfig.Builder createSessionConfigBuilder = createSessionConfigBuilder(this.mCameraEdge, useCaseConfig, streamSpec);
        this.mSessionConfigBuilder = createSessionConfigBuilder;
        addCameraErrorListener(createSessionConfigBuilder, str, str2, useCaseConfig, streamSpec, streamSpec2);
    }

    private void createSecondaryCamera(@NonNull String str, @Nullable String str2, @NonNull UseCaseConfig<?> useCaseConfig, @NonNull StreamSpec streamSpec, @Nullable StreamSpec streamSpec2) {
        Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        CameraInternal secondaryCamera = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera);
        boolean hasTransform = secondaryCamera.getHasTransform();
        Rect cropRect = getCropRect(streamSpec2.getResolution());
        Objects.requireNonNull(cropRect);
        CameraInternal secondaryCamera2 = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera2);
        int relativeRotation = getRelativeRotation(secondaryCamera2);
        CameraInternal secondaryCamera3 = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera3);
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, streamSpec2, sensorToBufferTransformMatrix, hasTransform, cropRect, relativeRotation, -1, isMirroringRequired(secondaryCamera3));
        this.mSecondaryCameraEdge = surfaceEdge;
        CameraInternal secondaryCamera4 = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera4);
        this.mSecondarySharingInputEdge = getSharingInputEdge(surfaceEdge, secondaryCamera4);
        SessionConfig.Builder createSessionConfigBuilder = createSessionConfigBuilder(this.mSecondaryCameraEdge, useCaseConfig, streamSpec2);
        this.mSecondarySessionConfigBuilder = createSessionConfigBuilder;
        addCameraErrorListener(createSessionConfigBuilder, str, str2, useCaseConfig, streamSpec, streamSpec2);
    }

    @NonNull
    private SessionConfig.Builder createSessionConfigBuilder(@NonNull SurfaceEdge surfaceEdge, @NonNull UseCaseConfig<?> useCaseConfig, @NonNull StreamSpec streamSpec) {
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(useCaseConfig, streamSpec.getResolution());
        propagateChildrenTemplate(createFrom);
        propagateChildrenCamera2Interop(streamSpec.getResolution(), createFrom);
        createFrom.addSurface(surfaceEdge.getDeferrableSurface(), streamSpec.getDynamicRange(), null, -1);
        createFrom.addRepeatingCameraCaptureCallback(this.mVirtualCameraAdapter.getParentMetadataCallback());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return createFrom;
    }

    @NonNull
    public static List<UseCaseConfigFactory.CaptureType> getCaptureTypes(@NonNull UseCase useCase) {
        ArrayList arrayList = new ArrayList();
        if (!isStreamSharing(useCase)) {
            arrayList.add(useCase.getCurrentConfig().getCaptureType());
            return arrayList;
        }
        Iterator<UseCase> it = ((StreamSharing) useCase).getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCurrentConfig().getCaptureType());
        }
        return arrayList;
    }

    private static int getChildTemplate(@NonNull UseCase useCase) {
        return useCase.getCurrentConfig().getDefaultSessionConfig().getTemplateType();
    }

    @Nullable
    private Rect getCropRect(@NonNull Size size) {
        return getViewPortCropRect() != null ? getViewPortCropRect() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private Rect getCropRectAppliedByEffect(SurfaceEdge surfaceEdge) {
        return ((CameraEffect) Preconditions.checkNotNull(getEffect())).getTransformation() == 1 ? TransformUtils.sizeToRect(surfaceEdge.getStreamSpec().getResolution()) : surfaceEdge.getCropRect();
    }

    private static StreamSharingConfig getDefaultConfig(Set<UseCase> set) {
        MutableConfig mutableConfig = new StreamSharingBuilder().getMutableConfig();
        mutableConfig.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        ArrayList arrayList = new ArrayList();
        for (UseCase useCase : set) {
            if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                arrayList.add(useCase.getCurrentConfig().getCaptureType());
            } else {
                Log.e(TAG, "A child does not have capture type.");
            }
        }
        mutableConfig.insertOption(StreamSharingConfig.OPTION_CAPTURE_TYPES, arrayList);
        mutableConfig.insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, 2);
        return new StreamSharingConfig(OptionsBundle.from(mutableConfig));
    }

    @NonNull
    private DualSurfaceProcessorNode getDualSharingNode(@NonNull CameraInternal cameraInternal, @NonNull CameraInternal cameraInternal2, @NonNull StreamSpec streamSpec, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
        return new DualSurfaceProcessorNode(cameraInternal, cameraInternal2, DualSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange(), layoutSettings, layoutSettings2));
    }

    private boolean getMirroringAppliedByEffect() {
        if (((CameraEffect) Preconditions.checkNotNull(getEffect())).getTransformation() == 1) {
            CameraInternal cameraInternal = (CameraInternal) Preconditions.checkNotNull(getCamera());
            if (cameraInternal.isFrontFacing() && cameraInternal.getHasTransform()) {
                return true;
            }
        }
        return false;
    }

    private int getRotationAppliedByEffect() {
        if (((CameraEffect) Preconditions.checkNotNull(getEffect())).getTransformation() == 1) {
            return getRelativeRotation((CameraInternal) Preconditions.checkNotNull(getCamera()));
        }
        return 0;
    }

    @NonNull
    private SurfaceEdge getSharingInputEdge(@NonNull SurfaceEdge surfaceEdge, @NonNull CameraInternal cameraInternal) {
        if (getEffect() == null || getEffect().getTransformation() == 2 || getEffect().getOutputOption() == 1) {
            return surfaceEdge;
        }
        this.mEffectNode = new SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal());
        int rotationAppliedByEffect = getRotationAppliedByEffect();
        Rect cropRectAppliedByEffect = getCropRectAppliedByEffect(surfaceEdge);
        OutConfig of2 = OutConfig.of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), cropRectAppliedByEffect, TransformUtils.getRotatedSize(cropRectAppliedByEffect, rotationAppliedByEffect), rotationAppliedByEffect, getMirroringAppliedByEffect(), true);
        SurfaceEdge surfaceEdge2 = this.mEffectNode.transform(SurfaceProcessorNode.In.of(surfaceEdge, Collections.singletonList(of2))).get(of2);
        Objects.requireNonNull(surfaceEdge2);
        return surfaceEdge2;
    }

    @NonNull
    private SurfaceProcessorNode getSharingNode(@NonNull CameraInternal cameraInternal, @NonNull StreamSpec streamSpec) {
        if (getEffect() == null || getEffect().getOutputOption() != 1) {
            return new SurfaceProcessorNode(cameraInternal, DefaultSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange()));
        }
        SurfaceProcessorNode surfaceProcessorNode = new SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal());
        this.mEffectNode = surfaceProcessorNode;
        return surfaceProcessorNode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean isStreamSharing(@Nullable UseCase useCase) {
        return useCase instanceof StreamSharing;
    }

    private void propagateChildrenCamera2Interop(@NonNull Size size, @NonNull SessionConfig.Builder builder) {
        Iterator<UseCase> it = getChildren().iterator();
        while (it.hasNext()) {
            SessionConfig build = SessionConfig.Builder.createFrom(it.next().getCurrentConfig(), size).build();
            builder.addAllRepeatingCameraCaptureCallbacks(build.getRepeatingCameraCaptureCallbacks());
            builder.addAllCameraCaptureCallbacks(build.getSingleCameraCaptureCallbacks());
            builder.addAllSessionStateCallbacks(build.getSessionStateCallbacks());
            builder.addAllDeviceStateCallbacks(build.getDeviceStateCallbacks());
            builder.addImplementationOptions(build.getImplementationOptions());
        }
    }

    private void propagateChildrenTemplate(@NonNull SessionConfig.Builder builder) {
        Iterator<UseCase> it = getChildren().iterator();
        int i11 = -1;
        while (it.hasNext()) {
            i11 = SessionConfig.getHigherPriorityTemplateType(i11, getChildTemplate(it.next()));
        }
        if (i11 != -1) {
            builder.setTemplateType(i11);
        }
    }

    @Nullable
    @VisibleForTesting
    public SurfaceEdge getCameraEdge() {
        return this.mCameraEdge;
    }

    @NonNull
    public Set<UseCase> getChildren() {
        return this.mVirtualCameraAdapter.getChildren();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@NonNull Config config) {
        return new StreamSharingBuilder(MutableOptionsBundle.from(config));
    }

    @NonNull
    @VisibleForTesting
    public VirtualCameraAdapter getVirtualCameraAdapter() {
        return this.mVirtualCameraAdapter;
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        super.onBind();
        this.mVirtualCameraAdapter.bindChildren();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @NonNull
    public UseCaseConfig<?> onMergeConfig(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull UseCaseConfig.Builder<?, ?, ?> builder) {
        this.mVirtualCameraAdapter.mergeChildrenConfigs(builder.getMutableConfig());
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateAttached() {
        super.onStateAttached();
        this.mVirtualCameraAdapter.notifyStateAttached();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        super.onStateDetached();
        this.mVirtualCameraAdapter.notifyStateDetached();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@NonNull Config config) {
        List<SessionConfig> a11;
        this.mSessionConfigBuilder.addImplementationOptions(config);
        a11 = j.a(new Object[]{this.mSessionConfigBuilder.build()});
        updateSessionConfig(a11);
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    public StreamSpec onSuggestedStreamSpecUpdated(@NonNull StreamSpec streamSpec, @Nullable StreamSpec streamSpec2) {
        updateSessionConfig(createPipelineAndUpdateChildrenSpecs(getCameraId(), getSecondaryCameraId(), getCurrentConfig(), streamSpec, streamSpec2));
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        super.onUnbind();
        clearPipeline();
        this.mVirtualCameraAdapter.unbindChildren();
    }

    @Nullable
    @VisibleForTesting
    public SurfaceProcessorNode getSharingNode() {
        return this.mSharingNode;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @Nullable
    public UseCaseConfig<?> getDefaultConfig(boolean z11, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(this.mDefaultConfig.getCaptureType(), 1);
        if (z11) {
            config = Config.mergeConfigs(config, this.mDefaultConfig.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Nullable
    @VisibleForTesting
    public SurfaceEdge getSharingInputEdge() {
        return this.mSharingInputEdge;
    }
}
