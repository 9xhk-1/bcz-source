package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.FloatRange;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExperimentalZeroShutterLag;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
/* loaded from: classes.dex */
public final class Camera2CameraInfoImpl implements CameraInfoInternal {
    private static final String TAG = "Camera2CameraInfo";

    @Nullable
    @GuardedBy("mLock")
    private Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraInfo mCamera2CameraInfo;

    @NonNull
    private final EncoderProfilesProvider mCamera2EncoderProfilesProvider;
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final String mCameraId;

    @NonNull
    private final CameraManagerCompat mCameraManager;

    @NonNull
    private final Quirks mCameraQuirks;

    @NonNull
    private final RedirectableLiveData<CameraState> mCameraStateLiveData;

    @Nullable
    private Set<CameraInfo> mPhysicalCameraInfos;
    private final Object mLock = new Object();

    @Nullable
    @GuardedBy("mLock")
    private RedirectableLiveData<Integer> mRedirectTorchStateLiveData = null;

    @Nullable
    @GuardedBy("mLock")
    private RedirectableLiveData<ZoomState> mRedirectZoomStateLiveData = null;

    @Nullable
    @GuardedBy("mLock")
    private List<Pair<CameraCaptureCallback, Executor>> mCameraCaptureCallbacks = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RedirectableLiveData<T> extends MediatorLiveData<T> {
        private final T mInitialValue;
        private LiveData<T> mLiveDataSource;

        public RedirectableLiveData(T t11) {
            this.mInitialValue = t11;
        }

        @Override // androidx.lifecycle.MediatorLiveData
        public <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<? super S> observer) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.mLiveDataSource;
            return liveData == null ? this.mInitialValue : liveData.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void redirectTo(@NonNull LiveData<T> liveData) {
            LiveData<T> liveData2 = this.mLiveDataSource;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.mLiveDataSource = liveData;
            super.addSource(liveData, new Observer() { // from class: androidx.camera.camera2.internal.s0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Camera2CameraInfoImpl.RedirectableLiveData.this.setValue(obj);
                }
            });
        }
    }

    public Camera2CameraInfoImpl(@NonNull String str, @NonNull CameraManagerCompat cameraManagerCompat) throws CameraAccessExceptionCompat {
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCameraManager = cameraManagerCompat;
        CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mCamera2CameraInfo = new Camera2CameraInfo(this);
        Quirks quirks = CameraQuirks.get(str, cameraCharacteristicsCompat);
        this.mCameraQuirks = quirks;
        this.mCamera2EncoderProfilesProvider = new Camera2EncoderProfilesProvider(str, quirks);
        this.mCameraStateLiveData = new RedirectableLiveData<>(CameraState.create(CameraState.Type.CLOSED));
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (supportedHardwareLevel == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (supportedHardwareLevel == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (supportedHardwareLevel == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (supportedHardwareLevel != 4) {
            str = "Unknown value: " + supportedHardwareLevel;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        Logger.i(TAG, "Device Level: " + str);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl != null) {
                    camera2CameraControlImpl.addSessionCameraCaptureCallback(executor, cameraCaptureCallback);
                    return;
                }
                if (this.mCameraCaptureCallbacks == null) {
                    this.mCameraCaptureCallbacks = new ArrayList();
                }
                this.mCameraCaptureCallbacks.add(new Pair<>(cameraCaptureCallback, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Camera2CameraInfo getCamera2CameraInfo() {
        return this.mCamera2CameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Object getCameraCharacteristics() {
        return this.mCameraCharacteristicsCompat.toCameraCharacteristics();
    }

    @NonNull
    public CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    @NonNull
    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.mCameraId, this.mCameraCharacteristicsCompat.toCameraCharacteristics());
        for (String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
            if (!Objects.equals(str, this.mCameraId)) {
                try {
                    linkedHashMap.put(str, this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics());
                } catch (CameraAccessExceptionCompat e11) {
                    Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e11);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public String getCameraId() {
        return this.mCameraId;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Quirks getCameraQuirks() {
        return this.mCameraQuirks;
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<CameraState> getCameraState() {
        return this.mCameraStateLiveData;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.mCamera2EncoderProfilesProvider;
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public ExposureState getExposureState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    return ExposureControl.getDefaultExposureState(this.mCameraCharacteristicsCompat);
                }
                return camera2CameraControlImpl.getExposureControl().getExposureState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public String getImplementationType() {
        return getSupportedHardwareLevel() == 2 ? CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY : CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // androidx.camera.core.CameraInfo
    @FloatRange(from = 0.0d, fromInclusive = false)
    public float getIntrinsicZoomRatio() {
        if (((Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)) == null) {
            return 1.0f;
        }
        try {
            return FovUtil.getDeviceDefaultViewAngleDegrees(this.mCameraManager, r0.intValue()) / FovUtil.focalLengthToViewAngleDegrees(FovUtil.getDefaultFocalLength(this.mCameraCharacteristicsCompat), FovUtil.getSensorHorizontalLength(this.mCameraCharacteristicsCompat));
        } catch (Exception e11) {
            Logger.e(TAG, "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e11);
            return 1.0f;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING);
        Preconditions.checkArgument(num != null, "Unable to get the lens facing of the camera.");
        return LensFacingUtil.getCameraSelectorLensFacing(num.intValue());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @Nullable
    public Object getPhysicalCameraCharacteristics(@NonNull String str) {
        try {
            if (this.mCameraCharacteristicsCompat.getPhysicalCameraIds().contains(str)) {
                return this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics();
            }
            return null;
        } catch (CameraAccessExceptionCompat e11) {
            Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e11);
            return null;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public Set<CameraInfo> getPhysicalCameraInfos() {
        if (this.mPhysicalCameraInfos == null) {
            this.mPhysicalCameraInfos = new HashSet();
            for (String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
                try {
                    this.mPhysicalCameraInfos.add(new Camera2PhysicalCameraInfoImpl(str, this.mCameraManager));
                } catch (CameraAccessExceptionCompat e11) {
                    Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e11);
                    return Collections.EMPTY_SET;
                }
            }
        }
        return this.mPhysicalCameraInfos;
    }

    public int getSensorOrientation() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i11) {
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i11), getSensorOrientation(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return DynamicRangesCompat.fromCameraCharacteristics(this.mCameraCharacteristicsCompat).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public Set<Range<Integer>> getSupportedFrameRateRanges() {
        Range[] rangeArr = (Range[]) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.EMPTY_SET;
    }

    public int getSupportedHardwareLevel() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Preconditions.checkNotNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public List<Size> getSupportedHighResolutions(int i11) {
        Size[] highResolutionOutputSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighResolutionOutputSizes(i11);
        return highResolutionOutputSizes != null ? Arrays.asList(highResolutionOutputSizes) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Set<Integer> getSupportedOutputFormats() {
        int[] outputFormats = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i11 : outputFormats) {
            hashSet.add(Integer.valueOf(i11));
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public List<Size> getSupportedResolutions(int i11) {
        Size[] outputSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(i11);
        return outputSizes != null ? Arrays.asList(outputSizes) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public Timebase getTimebase() {
        Integer num = (Integer) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        Preconditions.checkNotNull(num);
        return num.intValue() != 1 ? Timebase.UPTIME : Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<Integer> getTorchState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    if (this.mRedirectTorchStateLiveData == null) {
                        this.mRedirectTorchStateLiveData = new RedirectableLiveData<>(0);
                    }
                    return this.mRedirectTorchStateLiveData;
                }
                RedirectableLiveData<Integer> redirectableLiveData = this.mRedirectTorchStateLiveData;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.getTorchControl().getTorchState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<ZoomState> getZoomState() {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    if (this.mRedirectZoomStateLiveData == null) {
                        this.mRedirectZoomStateLiveData = new RedirectableLiveData<>(ZoomControl.getDefaultZoomState(this.mCameraCharacteristicsCompat));
                    }
                    return this.mRedirectZoomStateLiveData;
                }
                RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
                if (redirectableLiveData != null) {
                    return redirectableLiveData;
                }
                return camera2CameraControlImpl.getZoomControl().getZoomState();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        CameraCharacteristicsCompat cameraCharacteristicsCompat = this.mCameraCharacteristicsCompat;
        Objects.requireNonNull(cameraCharacteristicsCompat);
        return FlashAvailabilityChecker.isFlashAvailable(new r0(cameraCharacteristicsCompat));
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@NonNull FocusMeteringAction focusMeteringAction) {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl == null) {
                    return false;
                }
                return camera2CameraControlImpl.getFocusMeteringControl().isFocusMeteringSupported(focusMeteringAction);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 11);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        int[] iArr = (int[]) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 4);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        int[] iArr = (int[]) this.mCameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    @SuppressLint({"NullAnnotationGroup"})
    public boolean isZslSupported() {
        return isPrivateReprocessingSupported() && DeviceQuirks.get(ZslDisablerQuirk.class) == null;
    }

    public void linkWithCameraControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.mLock) {
            try {
                this.mCamera2CameraControlImpl = camera2CameraControlImpl;
                RedirectableLiveData<ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
                if (redirectableLiveData != null) {
                    redirectableLiveData.redirectTo(camera2CameraControlImpl.getZoomControl().getZoomState());
                }
                RedirectableLiveData<Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
                if (redirectableLiveData2 != null) {
                    redirectableLiveData2.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchState());
                }
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list != null) {
                    for (Pair<CameraCaptureCallback, Executor> pair : list) {
                        this.mCamera2CameraControlImpl.addSessionCameraCaptureCallback((Executor) pair.second, (CameraCaptureCallback) pair.first);
                    }
                    this.mCameraCaptureCallbacks = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logDeviceInfo();
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public Set<DynamicRange> querySupportedDynamicRanges(@NonNull Set<DynamicRange> set) {
        return DynamicRanges.findAllPossibleMatches(set, getSupportedDynamicRanges());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            try {
                Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
                if (camera2CameraControlImpl != null) {
                    camera2CameraControlImpl.removeSessionCameraCaptureCallback(cameraCaptureCallback);
                    return;
                }
                List<Pair<CameraCaptureCallback, Executor>> list = this.mCameraCaptureCallbacks;
                if (list == null) {
                    return;
                }
                Iterator<Pair<CameraCaptureCallback, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == cameraCaptureCallback) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCameraStateSource(@NonNull LiveData<CameraState> liveData) {
        this.mCameraStateLiveData.redirectTo(liveData);
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
