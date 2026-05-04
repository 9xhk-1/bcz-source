package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
/* loaded from: classes.dex */
final class SupportedSurfaceCombination {
    private static final String TAG = "SupportedSurfaceCombination";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final String mCameraId;
    private final CameraCharacteristicsCompat mCharacteristics;

    @NonNull
    private final DisplayInfoManager mDisplayInfoManager;
    private final DynamicRangeResolver mDynamicRangeResolver;
    private final ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final int mHardwareLevel;
    private boolean mIsBurstCaptureSupported;
    private boolean mIsConcurrentCameraModeSupported;
    private boolean mIsPreviewStabilizationSupported;
    private boolean mIsRawSupported;
    private boolean mIsStreamUseCaseSupported;
    private boolean mIsUltraHighResolutionSensorSupported;

    @VisibleForTesting
    SurfaceSizeDefinition mSurfaceSizeDefinition;
    private final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mUltraHighSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mConcurrentSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mPreviewStabilizationSurfaceCombinations = new ArrayList();
    private final Map<FeatureSettings, List<SurfaceCombination>> mFeatureSettingsToSupportedCombinationsMap = new HashMap();
    private final List<SurfaceCombination> mSurfaceCombinations10Bit = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsUltraHdr = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsStreamUseCase = new ArrayList();
    List<Integer> mSurfaceSizeDefinitionFormats = new ArrayList();
    private final TargetAspectRatio mTargetAspectRatio = new TargetAspectRatio();
    private final ResolutionCorrector mResolutionCorrector = new ResolutionCorrector();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i11) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class FeatureSettings {
        @NonNull
        public static FeatureSettings of(int i11, int i12, boolean z11, boolean z12) {
            return new AutoValue_SupportedSurfaceCombination_FeatureSettings(i11, i12, z11, z12);
        }

        public abstract int getCameraMode();

        public abstract int getRequiredMaxBitDepth();

        public abstract boolean isPreviewStabilizationOn();

        public abstract boolean isUltraHdrOn();
    }

    public SupportedSurfaceCombination(@NonNull Context context, @NonNull String str, @NonNull CameraManagerCompat cameraManagerCompat, @NonNull CamcorderProfileHelper camcorderProfileHelper) throws CameraUnavailableException {
        this.mIsRawSupported = false;
        this.mIsBurstCaptureSupported = false;
        this.mIsConcurrentCameraModeSupported = false;
        this.mIsStreamUseCaseSupported = false;
        this.mIsUltraHighResolutionSensorSupported = false;
        this.mIsPreviewStabilizationSupported = false;
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCamcorderProfileHelper = (CamcorderProfileHelper) Preconditions.checkNotNull(camcorderProfileHelper);
        this.mExtraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer();
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
            this.mCharacteristics = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.mHardwareLevel = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 3) {
                        this.mIsRawSupported = true;
                    } else if (i11 == 6) {
                        this.mIsBurstCaptureSupported = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i11 == 16) {
                        this.mIsUltraHighResolutionSensorSupported = true;
                    }
                }
            }
            DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(this.mCharacteristics);
            this.mDynamicRangeResolver = dynamicRangeResolver;
            generateSupportedCombinationList();
            if (this.mIsUltraHighResolutionSensorSupported) {
                generateUltraHighSupportedCombinationList();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.mIsConcurrentCameraModeSupported = hasSystemFeature;
            if (hasSystemFeature) {
                generateConcurrentSupportedCombinationList();
            }
            if (dynamicRangeResolver.is10BitDynamicRangeSupported()) {
                generate10BitSupportedCombinationList();
            }
            if (isUltraHdrSupported()) {
                generateUltraHdrSupportedCombinationList();
            }
            boolean isStreamUseCaseSupported = StreamUseCaseUtil.isStreamUseCaseSupported(this.mCharacteristics);
            this.mIsStreamUseCaseSupported = isStreamUseCaseSupported;
            if (isStreamUseCaseSupported) {
                generateStreamUseCaseSupportedCombinationList();
            }
            boolean isPreviewStabilizationSupported = VideoStabilizationUtil.isPreviewStabilizationSupported(this.mCharacteristics);
            this.mIsPreviewStabilizationSupported = isPreviewStabilizationSupported;
            if (isPreviewStabilizationSupported) {
                generatePreviewStabilizationSupportedCombinationList();
            }
            generateSurfaceSizeDefinition();
            checkCustomization();
        } catch (CameraAccessExceptionCompat e11) {
            throw CameraUnavailableExceptionHelper.createFrom(e11);
        }
    }

    private static Range<Integer> compareIntersectingRanges(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double rangeLength = getRangeLength(range2.intersect(range));
        double rangeLength2 = getRangeLength(range3.intersect(range));
        double rangeLength3 = rangeLength2 / getRangeLength(range3);
        double rangeLength4 = rangeLength / getRangeLength(range2);
        return (rangeLength2 <= rangeLength ? rangeLength2 != rangeLength ? rangeLength4 >= 0.5d || rangeLength3 <= rangeLength4 : rangeLength3 <= rangeLength4 && (rangeLength3 != rangeLength4 || range3.getLower().intValue() <= range2.getLower().intValue()) : rangeLength3 < 0.5d && rangeLength3 < rangeLength4) ? range2 : range3;
    }

    @NonNull
    private FeatureSettings createFeatureSettings(int i11, @NonNull Map<UseCaseConfig<?>, DynamicRange> map, boolean z11, boolean z12) {
        int requiredMaxBitDepth = getRequiredMaxBitDepth(map);
        if (i11 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i11)));
        }
        if (i11 == 0 || requiredMaxBitDepth != 10) {
            return FeatureSettings.of(i11, requiredMaxBitDepth, z11, z12);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.mCameraId, CameraMode.toLabelString(i11)));
    }

    @NonNull
    private Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes(@NonNull Map<UseCaseConfig<?>, List<Size>> map, @NonNull FeatureSettings featureSettings, @Nullable Range<Integer> range) {
        HashMap hashMap = new HashMap();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : map.get(useCaseConfig)) {
                int inputFormat = useCaseConfig.getInputFormat();
                SurfaceConfig.ConfigSize configSize = SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)).getConfigSize();
                int maxFrameRate = range != null ? getMaxFrameRate(this.mCharacteristics, inputFormat, size) : Integer.MAX_VALUE;
                Set set = (Set) hashMap2.get(configSize);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(configSize, set);
                }
                if (!set.contains(Integer.valueOf(maxFrameRate))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(maxFrameRate));
                }
            }
            hashMap.put(useCaseConfig, arrayList);
        }
        return hashMap;
    }

    private void generate10BitSupportedCombinationList() {
        this.mSurfaceCombinations10Bit.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private void generateConcurrentSupportedCombinationList() {
        this.mConcurrentSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private void generatePreviewStabilizationSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mPreviewStabilizationSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
        }
    }

    private void generateStreamUseCaseSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mSurfaceCombinationsStreamUseCase.addAll(GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList());
        }
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.mHardwareLevel, this.mIsRawSupported, this.mIsBurstCaptureSupported));
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get(this.mCameraId));
    }

    private void generateSurfaceSizeDefinition() {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), this.mDisplayInfoManager.getPreviewSize(), new HashMap(), getRecordSize(), new HashMap(), new HashMap());
    }

    private void generateUltraHdrSupportedCombinationList() {
        this.mSurfaceCombinationsUltraHdr.addAll(GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private void generateUltraHighSupportedCombinationList() {
        this.mUltraHighSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            i11 *= it.next().size();
        }
        if (i11 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new ArrayList());
        }
        int size = i11 / list.get(0).size();
        int i13 = i11;
        for (int i14 = 0; i14 < list.size(); i14++) {
            List<Size> list2 = list.get(i14);
            for (int i15 = 0; i15 < i11; i15++) {
                ((List) arrayList.get(i15)).add(list2.get((i15 % i13) / size));
            }
            if (i14 < list.size() - 1) {
                i13 = size;
                size /= list.get(i14 + 1).size();
            }
        }
        return arrayList;
    }

    @NonNull
    private Range<Integer> getClosestSupportedDeviceFrameRate(@Nullable Range<Integer> range, int i11) {
        if (range != null) {
            Range<Integer> range2 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (!range.equals(range2)) {
                Range<Integer>[] rangeArr = (Range[]) this.mCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                Range<Integer> range3 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i11)), Integer.valueOf(Math.min(range.getUpper().intValue(), i11)));
                int i12 = 0;
                for (Range<Integer> range4 : rangeArr) {
                    if (i11 >= range4.getLower().intValue()) {
                        if (range2.equals(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int rangeLength = getRangeLength(range4.intersect(range3));
                            if (i12 == 0) {
                                i12 = rangeLength;
                            } else {
                                if (rangeLength >= i12) {
                                    range2 = compareIntersectingRanges(range3, range2, range4);
                                    i12 = getRangeLength(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (i12 == 0) {
                                if (getRangeDistance(range4, range3) >= getRangeDistance(range2, range3)) {
                                    if (getRangeDistance(range4, range3) == getRangeDistance(range2, range3)) {
                                        if (range4.getLower().intValue() <= range2.getUpper().intValue() && getRangeLength(range4) >= getRangeLength(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    }

    public static int getMaxFrameRate(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i11, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size getMaxOutputSizeByFormat(StreamConfigurationMap streamConfigurationMap, int i11, boolean z11) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i11 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i11);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.RESOLUTION_ZERO;
        if (z11 && (highResolutionOutputSizes = Api23Impl.getHighResolutionOutputSizes(streamConfigurationMap, i11)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), compareSizesByArea);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
    }

    private int getMaxSupportedFpsFromAttachedSurfaces(@NonNull List<AttachedSurfaceInfo> list) {
        int i11 = Integer.MAX_VALUE;
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            i11 = getUpdatedMaximumFps(i11, attachedSurfaceInfo.getImageFormat(), attachedSurfaceInfo.getSize());
        }
        return i11;
    }

    private static int getRangeDistance(Range<Integer> range, Range<Integer> range2) {
        Preconditions.checkState((range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    private static int getRangeLength(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    @NonNull
    private Size getRecordSize() {
        try {
            int parseInt = Integer.parseInt(this.mCameraId);
            CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(parseInt, 1) ? this.mCamcorderProfileHelper.get(parseInt, 1) : null;
            return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : getRecordSizeByHasProfile(parseInt);
        } catch (NumberFormatException unused) {
            return getRecordSizeFromStreamConfigurationMap();
        }
    }

    @NonNull
    private Size getRecordSizeByHasProfile(int i11) {
        Size size = SizeUtil.RESOLUTION_480P;
        CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i11, 10) ? this.mCamcorderProfileHelper.get(i11, 10) : this.mCamcorderProfileHelper.hasProfile(i11, 8) ? this.mCamcorderProfileHelper.get(i11, 8) : this.mCamcorderProfileHelper.hasProfile(i11, 12) ? this.mCamcorderProfileHelper.get(i11, 12) : this.mCamcorderProfileHelper.hasProfile(i11, 6) ? this.mCamcorderProfileHelper.get(i11, 6) : this.mCamcorderProfileHelper.hasProfile(i11, 5) ? this.mCamcorderProfileHelper.get(i11, 5) : this.mCamcorderProfileHelper.hasProfile(i11, 4) ? this.mCamcorderProfileHelper.get(i11, 4) : null;
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    @NonNull
    private Size getRecordSizeFromStreamConfigurationMap() {
        Size[] outputSizes = this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return SizeUtil.RESOLUTION_480P;
        }
        Arrays.sort(outputSizes, new CompareSizesByArea(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = SizeUtil.RESOLUTION_1080P;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return SizeUtil.RESOLUTION_480P;
    }

    private static int getRequiredMaxBitDepth(@NonNull Map<UseCaseConfig<?>, DynamicRange> map) {
        Iterator<DynamicRange> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private List<SurfaceCombination> getSurfaceCombinationsByFeatureSettings(@NonNull FeatureSettings featureSettings) {
        if (this.mFeatureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            return this.mFeatureSettingsToSupportedCombinationsMap.get(featureSettings);
        }
        List<SurfaceCombination> arrayList = new ArrayList<>();
        if (featureSettings.isUltraHdrOn()) {
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.mSurfaceCombinationsUltraHdr);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                arrayList = this.mConcurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.isPreviewStabilizationOn() ? this.mPreviewStabilizationSurfaceCombinations : this.mSurfaceCombinations);
            } else {
                arrayList.addAll(this.mUltraHighSurfaceCombinations);
                arrayList.addAll(this.mSurfaceCombinations);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
            arrayList.addAll(this.mSurfaceCombinations10Bit);
        }
        this.mFeatureSettingsToSupportedCombinationsMap.put(featureSettings, arrayList);
        return arrayList;
    }

    private Pair<List<SurfaceConfig>, Integer> getSurfaceConfigListAndFpsCeiling(int i11, List<AttachedSurfaceInfo> list, List<Size> list2, List<UseCaseConfig<?>> list3, List<Integer> list4, int i12, @Nullable Map<Integer, AttachedSurfaceInfo> map, @Nullable Map<Integer, UseCaseConfig<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            arrayList.add(attachedSurfaceInfo.getSurfaceConfig());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i13 = 0; i13 < list2.size(); i13++) {
            Size size = list2.get(i13);
            UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i13).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(i11, inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i12 = getUpdatedMaximumFps(i12, useCaseConfig.getInputFormat(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i12));
    }

    @Nullable
    private Range<Integer> getTargetFpsRange(@NonNull List<AttachedSurfaceInfo> list, @NonNull List<UseCaseConfig<?>> list2, @NonNull List<Integer> list3) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        Range<Integer> range = null;
        while (it.hasNext()) {
            range = getUpdatedTargetFramerate(it.next().getTargetFrameRate(), range);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            range = getUpdatedTargetFramerate(list2.get(it2.next().intValue()).getTargetFrameRate(null), range);
        }
        return range;
    }

    private int getUpdatedMaximumFps(int i11, int i12, Size size) {
        return Math.min(i11, getMaxFrameRate(this.mCharacteristics, i12, size));
    }

    private Range<Integer> getUpdatedTargetFramerate(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> getUseCasesPriorityOrder(List<UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<UseCaseConfig<?>> it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = it.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int intValue = ((Integer) it2.next()).intValue();
            for (UseCaseConfig<?> useCaseConfig : list) {
                if (intValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private static boolean isUltraHdrOn(@NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageFormat() == 4101) {
                return true;
            }
        }
        Iterator<UseCaseConfig<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean isUltraHdrSupported() {
        int[] outputFormats = this.mCharacteristics.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return false;
        }
        for (int i11 : outputFormats) {
            if (i11 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean isUseCasesCombinationSupported(@NonNull FeatureSettings featureSettings, @NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurfaceConfig());
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            List<Size> list2 = map.get(useCaseConfig);
            Preconditions.checkArgument((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + useCaseConfig + ".");
            Size size = (Size) Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
        }
        return checkSupported(featureSettings, arrayList);
    }

    private void refreshPreviewSize() {
        this.mDisplayInfoManager.refresh();
        if (this.mSurfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
        } else {
            this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(this.mSurfaceSizeDefinition.getAnalysisSize(), this.mSurfaceSizeDefinition.getS720pSizeMap(), this.mDisplayInfoManager.getPreviewSize(), this.mSurfaceSizeDefinition.getS1440pSizeMap(), this.mSurfaceSizeDefinition.getRecordSize(), this.mSurfaceSizeDefinition.getMaximumSizeMap(), this.mSurfaceSizeDefinition.getUltraMaximumSizeMap());
        }
    }

    private void updateMaximumSizeByFormat(@NonNull Map<Integer, Size> map, int i11) {
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i11, true);
        if (maxOutputSizeByFormat != null) {
            map.put(Integer.valueOf(i11), maxOutputSizeByFormat);
        }
    }

    private void updateS720pOrS1440pSizeByFormat(@NonNull Map<Integer, Size> map, @NonNull Size size, int i11) {
        if (this.mIsConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i11, false);
            Integer valueOf = Integer.valueOf(i11);
            if (maxOutputSizeByFormat != null) {
                size = (Size) Collections.min(Arrays.asList(size, maxOutputSizeByFormat), new CompareSizesByArea());
            }
            map.put(valueOf, size);
        }
    }

    private void updateUltraMaximumSizeByFormat(@NonNull Map<Integer, Size> map, int i11) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 31 || !this.mIsUltraHighResolutionSensorSupported) {
            return;
        }
        CameraCharacteristicsCompat cameraCharacteristicsCompat = this.mCharacteristics;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(key);
        if (streamConfigurationMap == null) {
            return;
        }
        map.put(Integer.valueOf(i11), getMaxOutputSizeByFormat(streamConfigurationMap, i11, true));
    }

    @NonNull
    @VisibleForTesting
    public List<Size> applyResolutionSelectionOrderRelatedWorkarounds(@NonNull List<Size> list, int i11) {
        Rational rational;
        int i12 = this.mTargetAspectRatio.get(this.mCameraId, this.mCharacteristics);
        if (i12 == 0) {
            rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i12 == 1) {
            rational = AspectRatioUtil.ASPECT_RATIO_16_9;
        } else if (i12 != 2) {
            rational = null;
        } else {
            Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
            rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.mResolutionCorrector.insertOrPrioritize(SurfaceConfig.getConfigType(i11), list);
    }

    public boolean checkSupported(@NonNull FeatureSettings featureSettings, List<SurfaceConfig> list) {
        Iterator<SurfaceCombination> it = getSurfaceCombinationsByFeatureSettings(featureSettings).iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 = it.next().getOrderedSupportedSurfaceConfigList(list) != null;
            if (z11) {
                break;
            }
        }
        return z11;
    }

    public String getCameraId() {
        return this.mCameraId;
    }

    @Nullable
    public List<SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(@NonNull FeatureSettings featureSettings, List<SurfaceConfig> list) {
        if (!StreamUseCaseUtil.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        Iterator<SurfaceCombination> it = this.mSurfaceCombinationsStreamUseCase.iterator();
        while (it.hasNext()) {
            List<SurfaceConfig> orderedSupportedSurfaceConfigList = it.next().getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                return orderedSupportedSurfaceConfigList;
            }
        }
        return null;
    }

    @NonNull
    public Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecifications(int i11, @NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map, boolean z11, boolean z12) {
        int i12;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        List<SurfaceConfig> list2;
        HashMap hashMap4;
        List<SurfaceConfig> list3;
        String str;
        String str2;
        int i13;
        HashMap hashMap5;
        List<Size> list4;
        List<Size> list5;
        HashMap hashMap6;
        boolean z13;
        refreshPreviewSize();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(arrayList);
        Map<UseCaseConfig<?>, DynamicRange> resolveAndValidateDynamicRanges = this.mDynamicRangeResolver.resolveAndValidateDynamicRanges(list, arrayList, useCasesPriorityOrder);
        FeatureSettings createFeatureSettings = createFeatureSettings(i11, resolveAndValidateDynamicRanges, z11, isUltraHdrOn(list, map));
        boolean isUseCasesCombinationSupported = isUseCasesCombinationSupported(createFeatureSettings, list, map);
        String str3 = " New configs: ";
        String str4 = "No supported surface combination is found for camera device - Id : ";
        if (!isUseCasesCombinationSupported) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> targetFpsRange = getTargetFpsRange(list, arrayList, useCasesPriorityOrder);
        Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes = filterSupportedSizes(map, createFeatureSettings, targetFpsRange);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = useCasesPriorityOrder.iterator();
        while (it.hasNext()) {
            UseCaseConfig<?> useCaseConfig = arrayList.get(it.next().intValue());
            arrayList2.add(applyResolutionSelectionOrderRelatedWorkarounds(filterSupportedSizes.get(useCaseConfig), useCaseConfig.getInputFormat()));
            filterSupportedSizes = filterSupportedSizes;
        }
        List<List<Size>> allPossibleSizeArrangements = getAllPossibleSizeArrangements(arrayList2);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        HashMap hashMap9 = new HashMap();
        HashMap hashMap10 = new HashMap();
        boolean containsZslUseCase = StreamUseCaseUtil.containsZslUseCase(list, arrayList);
        int maxSupportedFpsFromAttachedSurfaces = getMaxSupportedFpsFromAttachedSurfaces(list);
        if (!this.mIsStreamUseCaseSupported || containsZslUseCase) {
            i12 = maxSupportedFpsFromAttachedSurfaces;
            hashMap = hashMap9;
            hashMap2 = hashMap10;
            hashMap3 = hashMap8;
            list2 = null;
        } else {
            Iterator<List<Size>> it2 = allPossibleSizeArrangements.iterator();
            List<SurfaceConfig> list6 = null;
            while (true) {
                if (!it2.hasNext()) {
                    HashMap hashMap11 = hashMap10;
                    i12 = maxSupportedFpsFromAttachedSurfaces;
                    hashMap = hashMap9;
                    hashMap2 = hashMap11;
                    z13 = isUseCasesCombinationSupported;
                    hashMap3 = hashMap8;
                    break;
                }
                z13 = isUseCasesCombinationSupported;
                hashMap3 = hashMap8;
                Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling = getSurfaceConfigListAndFpsCeiling(i11, list, it2.next(), arrayList, useCasesPriorityOrder, maxSupportedFpsFromAttachedSurfaces, hashMap9, hashMap10);
                HashMap hashMap12 = hashMap10;
                i12 = maxSupportedFpsFromAttachedSurfaces;
                hashMap = hashMap9;
                hashMap2 = hashMap12;
                list6 = getOrderedSupportedStreamUseCaseSurfaceConfigList(createFeatureSettings, (List) surfaceConfigListAndFpsCeiling.first);
                if (list6 != null && !StreamUseCaseUtil.areCaptureTypesEligible(hashMap, hashMap2, list6)) {
                    list6 = null;
                }
                if (list6 != null) {
                    if (StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(this.mCharacteristics, list6)) {
                        break;
                    }
                    list6 = null;
                }
                hashMap.clear();
                hashMap2.clear();
                hashMap9 = hashMap;
                maxSupportedFpsFromAttachedSurfaces = i12;
                hashMap10 = hashMap2;
                hashMap8 = hashMap3;
                isUseCasesCombinationSupported = z13;
            }
            if (list6 == null && !z13) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
            list2 = list6;
        }
        Iterator<List<Size>> it3 = allPossibleSizeArrangements.iterator();
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MAX_VALUE;
        boolean z14 = false;
        boolean z15 = false;
        List<Size> list7 = null;
        List<Size> list8 = null;
        while (true) {
            if (!it3.hasNext()) {
                hashMap4 = hashMap2;
                list3 = list2;
                str = str3;
                str2 = str4;
                i13 = i16;
                hashMap5 = hashMap;
                list4 = list7;
                break;
            }
            List<Size> next = it3.next();
            HashMap hashMap13 = hashMap;
            int i17 = i12;
            str = str3;
            hashMap4 = hashMap2;
            int i18 = i15;
            list3 = list2;
            int i19 = i14;
            str2 = str4;
            hashMap5 = hashMap13;
            Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling2 = getSurfaceConfigListAndFpsCeiling(i11, list, next, arrayList, useCasesPriorityOrder, i17, null, null);
            List<SurfaceConfig> list9 = (List) surfaceConfigListAndFpsCeiling2.first;
            int intValue = ((Integer) surfaceConfigListAndFpsCeiling2.second).intValue();
            boolean z16 = targetFpsRange == null || i17 <= intValue || intValue >= targetFpsRange.getLower().intValue();
            if (!z14 && checkSupported(createFeatureSettings, list9)) {
                if (i18 == i19 || i18 < intValue) {
                    list7 = next;
                    i18 = intValue;
                }
                if (z16) {
                    if (z15) {
                        list4 = next;
                        i15 = intValue;
                        i13 = i16;
                        break;
                    }
                    list7 = next;
                    i18 = intValue;
                    z14 = true;
                }
            }
            if (list3 == null || z15 || getOrderedSupportedStreamUseCaseSurfaceConfigList(createFeatureSettings, list9) == null) {
                i16 = i16;
            } else {
                int i21 = i16;
                if (i21 != i19 && i21 >= intValue) {
                    i16 = i21;
                } else {
                    list8 = next;
                    i16 = intValue;
                }
                if (!z16) {
                    continue;
                } else {
                    if (z14) {
                        i13 = intValue;
                        list4 = list7;
                        list5 = next;
                        i15 = i18;
                        break;
                    }
                    list8 = next;
                    i16 = intValue;
                    z15 = true;
                }
            }
            i12 = i17;
            i14 = i19;
            i15 = i18;
            hashMap = hashMap5;
            str4 = str2;
            list2 = list3;
            hashMap2 = hashMap4;
            str3 = str;
        }
        list5 = list8;
        if (list4 == null) {
            throw new IllegalArgumentException(str2 + this.mCameraId + " and Hardware level: " + this.mHardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList);
        }
        Range<Integer> closestSupportedDeviceFrameRate = targetFpsRange != null ? getClosestSupportedDeviceFrameRate(targetFpsRange, i15) : null;
        for (UseCaseConfig<?> useCaseConfig2 : arrayList) {
            StreamSpec.Builder zslDisabled = StreamSpec.builder(list4.get(useCasesPriorityOrder.indexOf(Integer.valueOf(arrayList.indexOf(useCaseConfig2))))).setDynamicRange((DynamicRange) Preconditions.checkNotNull(resolveAndValidateDynamicRanges.get(useCaseConfig2))).setImplementationOptions(StreamUseCaseUtil.getStreamSpecImplementationOptions(useCaseConfig2)).setZslDisabled(z12);
            if (closestSupportedDeviceFrameRate != null) {
                zslDisabled.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
            }
            hashMap3.put(useCaseConfig2, zslDisabled.build());
        }
        if (list3 != null && i15 == i13 && list4.size() == list5.size()) {
            for (int i22 = 0; i22 < list4.size(); i22++) {
                if (list4.get(i22).equals(list5.get(i22))) {
                }
            }
            hashMap6 = hashMap7;
            if (!StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.mCharacteristics, list, hashMap3, hashMap6)) {
                StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(hashMap3, hashMap6, hashMap5, hashMap4, list3);
            }
            return new Pair<>(hashMap3, hashMap6);
        }
        hashMap6 = hashMap7;
        return new Pair<>(hashMap3, hashMap6);
    }

    @NonNull
    @VisibleForTesting
    public SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i11) {
        if (!this.mSurfaceSizeDefinitionFormats.contains(Integer.valueOf(i11))) {
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS720pSizeMap(), SizeUtil.RESOLUTION_720P, i11);
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS1440pSizeMap(), SizeUtil.RESOLUTION_1440P, i11);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximumSizeMap(), i11);
            updateUltraMaximumSizeByFormat(this.mSurfaceSizeDefinition.getUltraMaximumSizeMap(), i11);
            this.mSurfaceSizeDefinitionFormats.add(Integer.valueOf(i11));
        }
        return this.mSurfaceSizeDefinition;
    }

    public boolean isBurstCaptureSupported() {
        return this.mIsBurstCaptureSupported;
    }

    public boolean isRawSupported() {
        return this.mIsRawSupported;
    }

    public SurfaceConfig transformSurfaceConfig(int i11, int i12, Size size) {
        return SurfaceConfig.transformSurfaceConfig(i11, i12, size, getUpdatedSurfaceSizeDefinitionByFormat(i12));
    }

    private void checkCustomization() {
    }
}
