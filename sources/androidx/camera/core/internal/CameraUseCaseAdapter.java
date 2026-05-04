package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalImageCaptureOutputFormat;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements Camera {
    private static final String TAG = "CameraUseCaseAdapter";

    @NonNull
    private final RestrictedCameraControl mAdapterCameraControl;

    @NonNull
    private final RestrictedCameraInfo mAdapterCameraInfo;

    @Nullable
    private final RestrictedCameraInfo mAdapterSecondaryCameraInfo;

    @GuardedBy("mLock")
    private final List<UseCase> mAppUseCases;

    @GuardedBy("mLock")
    private boolean mAttached;

    @NonNull
    @GuardedBy("mLock")
    private final CameraConfig mCameraConfig;

    @GuardedBy("mLock")
    private final CameraCoordinator mCameraCoordinator;
    private final CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;

    @NonNull
    private final CameraInternal mCameraInternal;

    @GuardedBy("mLock")
    private final List<UseCase> mCameraUseCases;

    @NonNull
    @GuardedBy("mLock")
    private List<CameraEffect> mEffects;
    private final CameraId mId;

    @GuardedBy("mLock")
    private Config mInteropConfig;

    @NonNull
    private final LayoutSettings mLayoutSettings;
    private final Object mLock;

    @Nullable
    @GuardedBy("mLock")
    private UseCase mPlaceholderForExtensions;

    @Nullable
    private final CameraInternal mSecondaryCameraInternal;

    @NonNull
    private final LayoutSettings mSecondaryLayoutSettings;

    @Nullable
    @GuardedBy("mLock")
    private StreamSharing mStreamSharing;
    private final UseCaseConfigFactory mUseCaseConfigFactory;

    @Nullable
    @GuardedBy("mLock")
    private ViewPort mViewPort;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(@NonNull String str) {
            super(str);
        }

        public CameraException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class CameraId {
        @NonNull
        public static CameraId create(@NonNull String str, @NonNull Identifier identifier) {
            return new AutoValue_CameraUseCaseAdapter_CameraId(str, identifier);
        }

        @NonNull
        public abstract Identifier getCameraConfigId();

        @NonNull
        public abstract String getCameraIdString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ConfigPair {
        UseCaseConfig<?> mCameraConfig;
        UseCaseConfig<?> mExtendedConfig;

        public ConfigPair(UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
            this.mExtendedConfig = useCaseConfig;
            this.mCameraConfig = useCaseConfig2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CameraUseCaseAdapter(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal r11, @androidx.annotation.NonNull androidx.camera.core.concurrent.CameraCoordinator r12, @androidx.annotation.NonNull androidx.camera.core.impl.CameraDeviceSurfaceManager r13, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfigFactory r14) {
        /*
            r10 = this;
            androidx.camera.core.impl.RestrictedCameraInfo r3 = new androidx.camera.core.impl.RestrictedCameraInfo
            androidx.camera.core.impl.CameraInfoInternal r0 = r11.getCameraInfoInternal()
            androidx.camera.core.impl.CameraConfig r1 = androidx.camera.core.impl.CameraConfigs.defaultConfig()
            r3.<init>(r0, r1)
            r4 = 0
            androidx.camera.core.LayoutSettings r5 = androidx.camera.core.LayoutSettings.DEFAULT
            r2 = 0
            r6 = r5
            r0 = r10
            r1 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.<init>(androidx.camera.core.impl.CameraInternal, androidx.camera.core.concurrent.CameraCoordinator, androidx.camera.core.impl.CameraDeviceSurfaceManager, androidx.camera.core.impl.UseCaseConfigFactory):void");
    }

    public static /* synthetic */ void a(SurfaceRequest surfaceRequest) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.core.internal.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CameraUseCaseAdapter.b(surface, surfaceTexture, (SurfaceRequest.Result) obj);
            }
        });
    }

    public static /* synthetic */ void b(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    private void cacheInteropConfig() {
        synchronized (this.mLock) {
            CameraControlInternal cameraControlInternal = this.mCameraInternal.getCameraControlInternal();
            this.mInteropConfig = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    public static Collection<UseCase> calculateCameraUseCases(@NonNull Collection<UseCase> collection, @Nullable UseCase useCase, @Nullable StreamSharing streamSharing) {
        ArrayList arrayList = new ArrayList(collection);
        if (useCase != null) {
            arrayList.add(useCase);
        }
        if (streamSharing != null) {
            arrayList.add(streamSharing);
            arrayList.removeAll(streamSharing.getChildren());
        }
        return arrayList;
    }

    @Nullable
    private UseCase calculatePlaceholderForExtensions(@NonNull Collection<UseCase> collection, @Nullable StreamSharing streamSharing) {
        UseCase useCase;
        synchronized (this.mLock) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (streamSharing != null) {
                    arrayList.add(streamSharing);
                    arrayList.removeAll(streamSharing.getChildren());
                }
                if (isCoexistingPreviewImageCaptureRequired()) {
                    if (isExtraPreviewRequired(arrayList)) {
                        useCase = isPreview(this.mPlaceholderForExtensions) ? this.mPlaceholderForExtensions : createExtraPreview();
                    } else if (isExtraImageCaptureRequired(arrayList)) {
                        useCase = isImageCapture(this.mPlaceholderForExtensions) ? this.mPlaceholderForExtensions : createExtraImageCapture();
                    }
                }
                useCase = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return useCase;
    }

    @NonNull
    private static Matrix calculateSensorToBufferTransformMatrix(@NonNull Rect rect, @NonNull Size size) {
        Preconditions.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map<UseCase, StreamSpec> calculateSuggestedStreamSpecs(int i11, @NonNull CameraInfoInternal cameraInfoInternal, @NonNull Collection<UseCase> collection, @NonNull Collection<UseCase> collection2, @NonNull Map<UseCase, ConfigPair> map) {
        Rect rect;
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<UseCase> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UseCase next = it.next();
            AttachedSurfaceInfo create = AttachedSurfaceInfo.create(this.mCameraDeviceSurfaceManager.transformSurfaceConfig(i11, cameraId, next.getImageFormat(), next.getAttachedSurfaceResolution()), next.getImageFormat(), next.getAttachedSurfaceResolution(), ((StreamSpec) Preconditions.checkNotNull(next.getAttachedStreamSpec())).getDynamicRange(), StreamSharing.getCaptureTypes(next), next.getAttachedStreamSpec().getImplementationOptions(), next.getCurrentConfig().getTargetFrameRate(null));
            arrayList.add(create);
            hashMap2.put(create, next);
            hashMap.put(next, next.getAttachedStreamSpec());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.mCameraInternal.getCameraControlInternal().getSensorRect();
            } catch (NullPointerException unused) {
                rect = null;
            }
            SupportedOutputSizesSorter supportedOutputSizesSorter = new SupportedOutputSizesSorter(cameraInfoInternal, rect != null ? TransformUtils.rectToSize(rect) : null);
            boolean z11 = false;
            for (UseCase useCase : collection) {
                ConfigPair configPair = map.get(useCase);
                UseCaseConfig<?> mergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                hashMap3.put(mergeConfigs, useCase);
                hashMap4.put(mergeConfigs, supportedOutputSizesSorter.getSortedSupportedOutputSizes(mergeConfigs));
                if (useCase.getCurrentConfig() instanceof PreviewConfig) {
                    z11 = ((PreviewConfig) useCase.getCurrentConfig()).getPreviewStabilizationMode() == 2;
                }
            }
            Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> suggestedStreamSpecs = this.mCameraDeviceSurfaceManager.getSuggestedStreamSpecs(i11, cameraId, arrayList, hashMap4, z11, hasVideoCapture(collection));
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((UseCase) entry.getValue(), (StreamSpec) ((Map) suggestedStreamSpecs.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) suggestedStreamSpecs.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((UseCase) hashMap2.get(entry2.getKey()), (StreamSpec) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    private void checkUnsupportedFeatureCombinationAndThrow(@NonNull Collection<UseCase> collection) throws IllegalArgumentException {
        if (hasExtension()) {
            if (hasNonSdrConfig(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (hasUltraHdrImageCapture(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.mLock) {
            try {
                if (!this.mEffects.isEmpty() && hasUltraHdrImageCapture(collection)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    private ImageCapture createExtraImageCapture() {
        return new ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
    }

    private Preview createExtraPreview() {
        Preview build = new Preview.Builder().setTargetName("Preview-Extra").build();
        build.setSurfaceProvider(new Preview.SurfaceProvider() { // from class: androidx.camera.core.internal.b
            @Override // androidx.camera.core.Preview.SurfaceProvider
            public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                CameraUseCaseAdapter.a(surfaceRequest);
            }
        });
        return build;
    }

    @Nullable
    private StreamSharing createOrReuseStreamSharing(@NonNull Collection<UseCase> collection, boolean z11) {
        synchronized (this.mLock) {
            try {
                Set<UseCase> streamSharingChildren = getStreamSharingChildren(collection, z11);
                if (streamSharingChildren.size() >= 2 || (hasExtension() && hasVideoCapture(streamSharingChildren))) {
                    StreamSharing streamSharing = this.mStreamSharing;
                    if (streamSharing != null && streamSharing.getChildren().equals(streamSharingChildren)) {
                        StreamSharing streamSharing2 = this.mStreamSharing;
                        Objects.requireNonNull(streamSharing2);
                        return streamSharing2;
                    }
                    if (!isStreamSharingChildrenCombinationValid(streamSharingChildren)) {
                        return null;
                    }
                    return new StreamSharing(this.mCameraInternal, this.mSecondaryCameraInternal, this.mLayoutSettings, this.mSecondaryLayoutSettings, streamSharingChildren, this.mUseCaseConfigFactory);
                }
                return null;
            } finally {
            }
        }
    }

    @NonNull
    public static CameraId generateCameraId(@NonNull RestrictedCameraInfo restrictedCameraInfo, @Nullable RestrictedCameraInfo restrictedCameraInfo2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(restrictedCameraInfo.getCameraId());
        sb2.append(restrictedCameraInfo2 == null ? "" : restrictedCameraInfo2.getCameraId());
        return CameraId.create(sb2.toString(), restrictedCameraInfo.getCameraConfig().getCompatibilityId());
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    private static UseCaseConfig<?> generateExtendedStreamSharingConfigFromPreview(@NonNull UseCaseConfigFactory useCaseConfigFactory, @NonNull StreamSharing streamSharing) {
        UseCaseConfig<?> defaultConfig = new Preview.Builder().build().getDefaultConfig(false, useCaseConfigFactory);
        if (defaultConfig == null) {
            return null;
        }
        MutableOptionsBundle from = MutableOptionsBundle.from((Config) defaultConfig);
        from.removeOption(TargetConfig.OPTION_TARGET_CLASS);
        return streamSharing.getUseCaseConfigBuilder(from).getUseCaseConfig();
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            try {
                return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Map<UseCase, ConfigPair> getConfigs(@NonNull Collection<UseCase> collection, @NonNull UseCaseConfigFactory useCaseConfigFactory, @NonNull UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap hashMap = new HashMap();
        for (UseCase useCase : collection) {
            hashMap.put(useCase, new ConfigPair(StreamSharing.isStreamSharing(useCase) ? generateExtendedStreamSharingConfigFromPreview(useCaseConfigFactory, (StreamSharing) useCase) : useCase.getDefaultConfig(false, useCaseConfigFactory), useCase.getDefaultConfig(true, useCaseConfigFactory2)));
        }
        return hashMap;
    }

    private int getSharingTargets(boolean z11) {
        int i11;
        synchronized (this.mLock) {
            try {
                Iterator<CameraEffect> it = this.mEffects.iterator();
                CameraEffect cameraEffect = null;
                while (true) {
                    i11 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    CameraEffect next = it.next();
                    if (TargetUtils.getNumberOfTargets(next.getTargets()) > 1) {
                        Preconditions.checkState(cameraEffect == null, "Can only have one sharing effect.");
                        cameraEffect = next;
                    }
                }
                if (cameraEffect != null) {
                    i11 = cameraEffect.getTargets();
                }
                if (z11) {
                    i11 |= 3;
                }
            } finally {
            }
        }
        return i11;
    }

    @NonNull
    private Set<UseCase> getStreamSharingChildren(@NonNull Collection<UseCase> collection, boolean z11) {
        HashSet hashSet = new HashSet();
        int sharingTargets = getSharingTargets(z11);
        for (UseCase useCase : collection) {
            Preconditions.checkArgument(!StreamSharing.isStreamSharing(useCase), "Only support one level of sharing for now.");
            if (useCase.isEffectTargetsSupported(sharingTargets)) {
                hashSet.add(useCase);
            }
        }
        return hashSet;
    }

    private boolean hasExtension() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mCameraConfig.getSessionProcessor(null) != null;
        }
        return z11;
    }

    private static boolean hasImplementationOptionChanged(StreamSpec streamSpec, SessionConfig sessionConfig) {
        Config implementationOptions = streamSpec.getImplementationOptions();
        Config implementationOptions2 = sessionConfig.getImplementationOptions();
        if (implementationOptions.listOptions().size() != sessionConfig.getImplementationOptions().listOptions().size()) {
            return true;
        }
        for (Config.Option<?> option : implementationOptions.listOptions()) {
            if (!implementationOptions2.containsOption(option) || !Objects.equals(implementationOptions2.retrieveOption(option), implementationOptions.retrieveOption(option))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNonSdrConfig(@NonNull Collection<UseCase> collection) {
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            if (isNotSdr(it.next().getCurrentConfig().getDynamicRange())) {
                return true;
            }
        }
        return false;
    }

    @OptIn(markerClass = {ExperimentalImageCaptureOutputFormat.class})
    private static boolean hasUltraHdrImageCapture(@NonNull Collection<UseCase> collection) {
        for (UseCase useCase : collection) {
            if (isImageCapture(useCase)) {
                UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
                Config.Option<?> option = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                if (currentConfig.containsOption(option) && ((Integer) Preconditions.checkNotNull((Integer) currentConfig.retrieveOption(option))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasVideoCapture(@NonNull Collection<UseCase> collection) {
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            if (isVideoCapture(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean isCoexistingPreviewImageCaptureRequired() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = true;
            if (this.mCameraConfig.getUseCaseCombinationRequiredRule() != 1) {
                z11 = false;
            }
        }
        return z11;
    }

    private static boolean isExtraImageCaptureRequired(@NonNull Collection<UseCase> collection) {
        boolean z11 = false;
        boolean z12 = false;
        for (UseCase useCase : collection) {
            if (isPreview(useCase) || StreamSharing.isStreamSharing(useCase)) {
                z11 = true;
            } else if (isImageCapture(useCase)) {
                z12 = true;
            }
        }
        return z11 && !z12;
    }

    private static boolean isExtraPreviewRequired(@NonNull Collection<UseCase> collection) {
        boolean z11 = false;
        boolean z12 = false;
        for (UseCase useCase : collection) {
            if (isPreview(useCase) || StreamSharing.isStreamSharing(useCase)) {
                z12 = true;
            } else if (isImageCapture(useCase)) {
                z11 = true;
            }
        }
        return z11 && !z12;
    }

    private static boolean isImageCapture(@Nullable UseCase useCase) {
        return useCase instanceof ImageCapture;
    }

    private static boolean isNotSdr(@NonNull DynamicRange dynamicRange) {
        return (dynamicRange.getBitDepth() == 10) || (dynamicRange.getEncoding() != 1 && dynamicRange.getEncoding() != 0);
    }

    private static boolean isPreview(@Nullable UseCase useCase) {
        return useCase instanceof Preview;
    }

    public static boolean isStreamSharingChildrenCombinationValid(@NonNull Collection<UseCase> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (UseCase useCase : collection) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (useCase.isEffectTargetsSupported(i12)) {
                    if (hashSet.contains(Integer.valueOf(i12))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i12));
                }
            }
        }
        return true;
    }

    private static boolean isVideoCapture(@Nullable UseCase useCase) {
        if (useCase != null) {
            if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                return useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            }
            Log.e(TAG, useCase + " UseCase does not have capture type.");
        }
        return false;
    }

    private void restoreInteropConfig() {
        synchronized (this.mLock) {
            try {
                if (this.mInteropConfig != null) {
                    this.mCameraInternal.getCameraControlInternal().addInteropConfig(this.mInteropConfig);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private static List<CameraEffect> setEffectsOnUseCases(@NonNull List<CameraEffect> list, @NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (UseCase useCase : collection) {
            useCase.setEffect(null);
            for (CameraEffect cameraEffect : list) {
                if (useCase.isEffectTargetsSupported(cameraEffect.getTargets())) {
                    Preconditions.checkState(useCase.getEffect() == null, useCase + " already has effect" + useCase.getEffect());
                    useCase.setEffect(cameraEffect);
                    arrayList.remove(cameraEffect);
                }
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    public static void updateEffects(@NonNull List<CameraEffect> list, @NonNull Collection<UseCase> collection, @NonNull Collection<UseCase> collection2) {
        List<CameraEffect> effectsOnUseCases = setEffectsOnUseCases(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<CameraEffect> effectsOnUseCases2 = setEffectsOnUseCases(effectsOnUseCases, arrayList);
        if (effectsOnUseCases2.size() > 0) {
            Logger.w(TAG, "Unused effects: " + effectsOnUseCases2);
        }
    }

    private void updateViewPortAndSensorToBufferMatrix(@NonNull Map<UseCase, StreamSpec> map, @NonNull Collection<UseCase> collection) {
        Map<UseCase, StreamSpec> map2;
        synchronized (this.mLock) {
            try {
                if (this.mViewPort == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<UseCase, Rect> calculateViewPortRects = ViewPorts.calculateViewPortRects(this.mCameraInternal.getCameraControlInternal().getSensorRect(), this.mCameraInternal.getCameraInfoInternal().getLensFacing() == 0, this.mViewPort.getAspectRatio(), this.mCameraInternal.getCameraInfoInternal().getSensorRotationDegrees(this.mViewPort.getRotation()), this.mViewPort.getScaleType(), this.mViewPort.getLayoutDirection(), map2);
                    for (UseCase useCase : collection) {
                        useCase.setViewPortCropRect((Rect) Preconditions.checkNotNull(calculateViewPortRects.get(useCase)));
                    }
                }
                for (UseCase useCase2 : collection) {
                    useCase2.setSensorToBufferTransformMatrix(calculateSensorToBufferTransformMatrix(this.mCameraInternal.getCameraControlInternal().getSensorRect(), ((StreamSpec) Preconditions.checkNotNull(map2.get(useCase2))).getResolution()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addUseCases(@NonNull Collection<UseCase> collection) throws CameraException {
        synchronized (this.mLock) {
            try {
                this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
                CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                if (cameraInternal != null) {
                    cameraInternal.setExtendedConfig(this.mCameraConfig);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.mAppUseCases);
                linkedHashSet.addAll(collection);
                try {
                    CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                    updateUseCases(linkedHashSet, cameraInternal2 != null, cameraInternal2 != null);
                } catch (IllegalArgumentException e11) {
                    throw new CameraException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void attachUseCases() {
        synchronized (this.mLock) {
            try {
                if (!this.mAttached) {
                    if (!this.mCameraUseCases.isEmpty()) {
                        this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
                        CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                        if (cameraInternal != null) {
                            cameraInternal.setExtendedConfig(this.mCameraConfig);
                        }
                    }
                    this.mCameraInternal.attachUseCases(this.mCameraUseCases);
                    CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                    if (cameraInternal2 != null) {
                        cameraInternal2.attachUseCases(this.mCameraUseCases);
                    }
                    restoreInteropConfig();
                    Iterator<UseCase> it = this.mCameraUseCases.iterator();
                    while (it.hasNext()) {
                        it.next().notifyState();
                    }
                    this.mAttached = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void detachUseCases() {
        synchronized (this.mLock) {
            try {
                if (this.mAttached) {
                    this.mCameraInternal.detachUseCases(new ArrayList(this.mCameraUseCases));
                    CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                    if (cameraInternal != null) {
                        cameraInternal.detachUseCases(new ArrayList(this.mCameraUseCases));
                    }
                    cacheInteropConfig();
                    this.mAttached = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public CameraControl getCameraControl() {
        return this.mAdapterCameraControl;
    }

    @NonNull
    public CameraId getCameraId() {
        return this.mId;
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public CameraInfo getCameraInfo() {
        return this.mAdapterCameraInfo;
    }

    @NonNull
    @VisibleForTesting
    public Collection<UseCase> getCameraUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mCameraUseCases);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public CameraConfig getExtendedConfig() {
        CameraConfig cameraConfig;
        synchronized (this.mLock) {
            cameraConfig = this.mCameraConfig;
        }
        return cameraConfig;
    }

    @Nullable
    public CameraInfo getSecondaryCameraInfo() {
        return this.mAdapterSecondaryCameraInfo;
    }

    @NonNull
    public List<UseCase> getUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mAppUseCases);
        }
        return arrayList;
    }

    public boolean isEquivalent(@NonNull CameraUseCaseAdapter cameraUseCaseAdapter) {
        return getCameraId().equals(cameraUseCaseAdapter.getCameraId());
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z11, @NonNull UseCase... useCaseArr) {
        Collection<UseCase> asList = Arrays.asList(useCaseArr);
        if (z11) {
            asList = calculateCameraUseCases(asList, null, createOrReuseStreamSharing(asList, true));
        }
        Collection<UseCase> collection = asList;
        synchronized (this.mLock) {
            try {
                try {
                    calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.getCameraInfoInternal(), collection, Collections.EMPTY_LIST, getConfigs(collection, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public void removeUseCases(@NonNull Collection<UseCase> collection) {
        synchronized (this.mLock) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.mAppUseCases);
            linkedHashSet.removeAll(collection);
            CameraInternal cameraInternal = this.mSecondaryCameraInternal;
            updateUseCases(linkedHashSet, cameraInternal != null, cameraInternal != null);
        }
    }

    public void setActiveResumingMode(boolean z11) {
        this.mCameraInternal.setActiveResumingMode(z11);
    }

    public void setEffects(@Nullable List<CameraEffect> list) {
        synchronized (this.mLock) {
            this.mEffects = list;
        }
    }

    public void setViewPort(@Nullable ViewPort viewPort) {
        synchronized (this.mLock) {
            this.mViewPort = viewPort;
        }
    }

    public void updateUseCases(@NonNull Collection<UseCase> collection) {
        updateUseCases(collection, false, false);
    }

    public void updateUseCases(@NonNull Collection<UseCase> collection, boolean z11, boolean z12) {
        StreamSpec streamSpec;
        Config implementationOptions;
        synchronized (this.mLock) {
            try {
                checkUnsupportedFeatureCombinationAndThrow(collection);
                if (!z11 && hasExtension() && hasVideoCapture(collection)) {
                    updateUseCases(collection, true, z12);
                    return;
                }
                StreamSharing createOrReuseStreamSharing = createOrReuseStreamSharing(collection, z11);
                UseCase calculatePlaceholderForExtensions = calculatePlaceholderForExtensions(collection, createOrReuseStreamSharing);
                Collection<UseCase> calculateCameraUseCases = calculateCameraUseCases(collection, calculatePlaceholderForExtensions, createOrReuseStreamSharing);
                ArrayList<UseCase> arrayList = new ArrayList(calculateCameraUseCases);
                arrayList.removeAll(this.mCameraUseCases);
                ArrayList<UseCase> arrayList2 = new ArrayList(calculateCameraUseCases);
                arrayList2.retainAll(this.mCameraUseCases);
                ArrayList<UseCase> arrayList3 = new ArrayList(this.mCameraUseCases);
                arrayList3.removeAll(calculateCameraUseCases);
                Map<UseCase, ConfigPair> configs = getConfigs(arrayList, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
                Map<UseCase, StreamSpec> map = Collections.EMPTY_MAP;
                try {
                    Map<UseCase, StreamSpec> calculateSuggestedStreamSpecs = calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.getCameraInfoInternal(), arrayList, arrayList2, configs);
                    if (this.mSecondaryCameraInternal != null) {
                        int cameraMode = getCameraMode();
                        CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                        Objects.requireNonNull(cameraInternal);
                        map = calculateSuggestedStreamSpecs(cameraMode, cameraInternal.getCameraInfoInternal(), arrayList, arrayList2, configs);
                    }
                    updateViewPortAndSensorToBufferMatrix(calculateSuggestedStreamSpecs, calculateCameraUseCases);
                    updateEffects(this.mEffects, calculateCameraUseCases, collection);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((UseCase) it.next()).unbindFromCamera(this.mCameraInternal);
                    }
                    this.mCameraInternal.detachUseCases(arrayList3);
                    if (this.mSecondaryCameraInternal != null) {
                        for (UseCase useCase : arrayList3) {
                            CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                            Objects.requireNonNull(cameraInternal2);
                            useCase.unbindFromCamera(cameraInternal2);
                        }
                        CameraInternal cameraInternal3 = this.mSecondaryCameraInternal;
                        Objects.requireNonNull(cameraInternal3);
                        cameraInternal3.detachUseCases(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        for (UseCase useCase2 : arrayList2) {
                            if (calculateSuggestedStreamSpecs.containsKey(useCase2) && (implementationOptions = (streamSpec = calculateSuggestedStreamSpecs.get(useCase2)).getImplementationOptions()) != null && hasImplementationOptionChanged(streamSpec, useCase2.getSessionConfig())) {
                                useCase2.updateSuggestedStreamSpecImplementationOptions(implementationOptions);
                                if (this.mAttached) {
                                    this.mCameraInternal.onUseCaseUpdated(useCase2);
                                    CameraInternal cameraInternal4 = this.mSecondaryCameraInternal;
                                    if (cameraInternal4 != null) {
                                        Objects.requireNonNull(cameraInternal4);
                                        cameraInternal4.onUseCaseUpdated(useCase2);
                                    }
                                }
                            }
                        }
                    }
                    for (UseCase useCase3 : arrayList) {
                        ConfigPair configPair = configs.get(useCase3);
                        Objects.requireNonNull(configPair);
                        CameraInternal cameraInternal5 = this.mSecondaryCameraInternal;
                        if (cameraInternal5 != null) {
                            CameraInternal cameraInternal6 = this.mCameraInternal;
                            Objects.requireNonNull(cameraInternal5);
                            useCase3.bindToCamera(cameraInternal6, cameraInternal5, configPair.mExtendedConfig, configPair.mCameraConfig);
                            useCase3.updateSuggestedStreamSpec((StreamSpec) Preconditions.checkNotNull(calculateSuggestedStreamSpecs.get(useCase3)), map.get(useCase3));
                        } else {
                            useCase3.bindToCamera(this.mCameraInternal, null, configPair.mExtendedConfig, configPair.mCameraConfig);
                            useCase3.updateSuggestedStreamSpec((StreamSpec) Preconditions.checkNotNull(calculateSuggestedStreamSpecs.get(useCase3)), null);
                        }
                    }
                    if (this.mAttached) {
                        this.mCameraInternal.attachUseCases(arrayList);
                        CameraInternal cameraInternal7 = this.mSecondaryCameraInternal;
                        if (cameraInternal7 != null) {
                            Objects.requireNonNull(cameraInternal7);
                            cameraInternal7.attachUseCases(arrayList);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((UseCase) it2.next()).notifyState();
                    }
                    this.mAppUseCases.clear();
                    this.mAppUseCases.addAll(collection);
                    this.mCameraUseCases.clear();
                    this.mCameraUseCases.addAll(calculateCameraUseCases);
                    this.mPlaceholderForExtensions = calculatePlaceholderForExtensions;
                    this.mStreamSharing = createOrReuseStreamSharing;
                } catch (IllegalArgumentException e11) {
                    if (z11 || hasExtension() || this.mCameraCoordinator.getCameraOperatingMode() == 2) {
                        throw e11;
                    }
                    updateUseCases(collection, true, z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public CameraUseCaseAdapter(@NonNull CameraInternal cameraInternal, @Nullable CameraInternal cameraInternal2, @NonNull RestrictedCameraInfo restrictedCameraInfo, @Nullable RestrictedCameraInfo restrictedCameraInfo2, @NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2, @NonNull CameraCoordinator cameraCoordinator, @NonNull CameraDeviceSurfaceManager cameraDeviceSurfaceManager, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        this.mAppUseCases = new ArrayList();
        this.mCameraUseCases = new ArrayList();
        this.mEffects = Collections.EMPTY_LIST;
        this.mLock = new Object();
        this.mAttached = true;
        this.mInteropConfig = null;
        this.mCameraInternal = cameraInternal;
        this.mSecondaryCameraInternal = cameraInternal2;
        this.mLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        CameraConfig cameraConfig = restrictedCameraInfo.getCameraConfig();
        this.mCameraConfig = cameraConfig;
        this.mAdapterCameraControl = new RestrictedCameraControl(cameraInternal.getCameraControlInternal(), cameraConfig.getSessionProcessor(null));
        this.mAdapterCameraInfo = restrictedCameraInfo;
        this.mAdapterSecondaryCameraInfo = restrictedCameraInfo2;
        this.mId = generateCameraId(restrictedCameraInfo, restrictedCameraInfo2);
    }
}
