package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
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
final class DynamicRangeResolver {
    private static final String TAG = "DynamicRangeResolver";
    private final CameraCharacteristicsCompat mCharacteristics;
    private final DynamicRangesCompat mDynamicRangesInfo;
    private final boolean mIs10BitSupported;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(33)
    public static final class Api33Impl {
        private Api33Impl() {
        }

        @Nullable
        public static DynamicRange getRecommended10BitDynamicRange(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
            Long l11 = (Long) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l11 != null) {
                return DynamicRangeConversions.profileToDynamicRange(l11.longValue());
            }
            return null;
        }
    }

    public DynamicRangeResolver(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCharacteristics = cameraCharacteristicsCompat;
        this.mDynamicRangesInfo = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z11 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (iArr[i11] == 18) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        this.mIs10BitSupported = z11;
    }

    private static boolean canResolve(@NonNull DynamicRange dynamicRange, @NonNull DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        if (dynamicRange.getEncoding() == 2 && dynamicRange2.getEncoding() == 1) {
            return false;
        }
        if (dynamicRange.getEncoding() == 2 || dynamicRange.getEncoding() == 0 || dynamicRange.getEncoding() == dynamicRange2.getEncoding()) {
            return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
        }
        return false;
    }

    private static boolean canResolveWithinConstraints(@NonNull DynamicRange dynamicRange, @NonNull DynamicRange dynamicRange2, @NonNull Set<DynamicRange> set) {
        if (set.contains(dynamicRange2)) {
            return canResolve(dynamicRange, dynamicRange2);
        }
        Logger.d(TAG, String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", dynamicRange, dynamicRange2));
        return false;
    }

    @Nullable
    private static DynamicRange findSupportedHdrMatch(@NonNull DynamicRange dynamicRange, @NonNull Collection<DynamicRange> collection, @NonNull Set<DynamicRange> set) {
        if (dynamicRange.getEncoding() == 1) {
            return null;
        }
        for (DynamicRange dynamicRange2 : collection) {
            Preconditions.checkNotNull(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            int encoding = dynamicRange2.getEncoding();
            Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified DynamicRange must have fully defined encoding.");
            if (encoding != 1 && canResolveWithinConstraints(dynamicRange, dynamicRange2, set)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    private static boolean isFullyUnspecified(@NonNull DynamicRange dynamicRange) {
        return Objects.equals(dynamicRange, DynamicRange.UNSPECIFIED);
    }

    private static boolean isPartiallySpecified(@NonNull DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() == 2) {
            return true;
        }
        if (dynamicRange.getEncoding() == 0 || dynamicRange.getBitDepth() != 0) {
            return dynamicRange.getEncoding() == 0 && dynamicRange.getBitDepth() != 0;
        }
        return true;
    }

    @Nullable
    private DynamicRange resolveDynamicRange(@NonNull DynamicRange dynamicRange, @NonNull Set<DynamicRange> set, @NonNull Set<DynamicRange> set2, @NonNull Set<DynamicRange> set3, @NonNull String str) {
        DynamicRange dynamicRange2;
        if (dynamicRange.isFullySpecified()) {
            if (set.contains(dynamicRange)) {
                return dynamicRange;
            }
            return null;
        }
        int encoding = dynamicRange.getEncoding();
        int bitDepth = dynamicRange.getBitDepth();
        if (encoding == 1 && bitDepth == 0) {
            DynamicRange dynamicRange3 = DynamicRange.SDR;
            if (set.contains(dynamicRange3)) {
                return dynamicRange3;
            }
            return null;
        }
        DynamicRange findSupportedHdrMatch = findSupportedHdrMatch(dynamicRange, set2, set);
        if (findSupportedHdrMatch != null) {
            Logger.d(TAG, String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, dynamicRange, findSupportedHdrMatch));
            return findSupportedHdrMatch;
        }
        DynamicRange findSupportedHdrMatch2 = findSupportedHdrMatch(dynamicRange, set3, set);
        if (findSupportedHdrMatch2 != null) {
            Logger.d(TAG, String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, dynamicRange, findSupportedHdrMatch2));
            return findSupportedHdrMatch2;
        }
        DynamicRange dynamicRange4 = DynamicRange.SDR;
        if (canResolveWithinConstraints(dynamicRange, dynamicRange4, set)) {
            Logger.d(TAG, String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, dynamicRange, dynamicRange4));
            return dynamicRange4;
        }
        if (encoding == 2 && (bitDepth == 10 || bitDepth == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                dynamicRange2 = Api33Impl.getRecommended10BitDynamicRange(this.mCharacteristics);
                if (dynamicRange2 != null) {
                    linkedHashSet.add(dynamicRange2);
                }
            } else {
                dynamicRange2 = null;
            }
            linkedHashSet.add(DynamicRange.HLG_10_BIT);
            DynamicRange findSupportedHdrMatch3 = findSupportedHdrMatch(dynamicRange, linkedHashSet, set);
            if (findSupportedHdrMatch3 != null) {
                Logger.d(TAG, String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, findSupportedHdrMatch3.equals(dynamicRange2) ? "recommended" : "required", dynamicRange, findSupportedHdrMatch3));
                return findSupportedHdrMatch3;
            }
        }
        for (DynamicRange dynamicRange5 : set) {
            Preconditions.checkState(dynamicRange5.isFullySpecified(), "Candidate dynamic range must be fully specified.");
            if (!dynamicRange5.equals(DynamicRange.SDR) && canResolve(dynamicRange, dynamicRange5)) {
                Logger.d(TAG, String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, dynamicRange, dynamicRange5));
                return dynamicRange5;
            }
        }
        return null;
    }

    private DynamicRange resolveDynamicRangeAndUpdateConstraints(@NonNull Set<DynamicRange> set, @NonNull Set<DynamicRange> set2, @NonNull Set<DynamicRange> set3, @NonNull UseCaseConfig<?> useCaseConfig, @NonNull Set<DynamicRange> set4) {
        DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
        DynamicRange resolveDynamicRange = resolveDynamicRange(dynamicRange, set4, set2, set3, useCaseConfig.getTargetName());
        if (resolveDynamicRange == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", useCaseConfig.getTargetName(), dynamicRange, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        updateConstraints(set4, resolveDynamicRange, this.mDynamicRangesInfo);
        return resolveDynamicRange;
    }

    private static void updateConstraints(@NonNull Set<DynamicRange> set, @NonNull DynamicRange dynamicRange, @NonNull DynamicRangesCompat dynamicRangesCompat) {
        Preconditions.checkState(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<DynamicRange> dynamicRangeCaptureRequestConstraints = dynamicRangesCompat.getDynamicRangeCaptureRequestConstraints(dynamicRange);
        if (dynamicRangeCaptureRequestConstraints.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(dynamicRangeCaptureRequestConstraints);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", dynamicRange, TextUtils.join("\n  ", dynamicRangeCaptureRequestConstraints), TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean is10BitDynamicRangeSupported() {
        return this.mIs10BitSupported;
    }

    public Map<UseCaseConfig<?>, DynamicRange> resolveAndValidateDynamicRanges(@NonNull List<AttachedSurfaceInfo> list, @NonNull List<UseCaseConfig<?>> list2, @NonNull List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getDynamicRange());
        }
        Set<DynamicRange> supportedDynamicRanges = this.mDynamicRangesInfo.getSupportedDynamicRanges();
        HashSet hashSet = new HashSet(supportedDynamicRanges);
        Iterator<DynamicRange> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            updateConstraints(hashSet, it2.next(), this.mDynamicRangesInfo);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            UseCaseConfig<?> useCaseConfig = list2.get(it3.next().intValue());
            DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
            if (isFullyUnspecified(dynamicRange)) {
                arrayList3.add(useCaseConfig);
            } else if (isPartiallySpecified(dynamicRange)) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<UseCaseConfig<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (UseCaseConfig<?> useCaseConfig2 : arrayList4) {
            DynamicRange resolveDynamicRangeAndUpdateConstraints = resolveDynamicRangeAndUpdateConstraints(supportedDynamicRanges, linkedHashSet, linkedHashSet2, useCaseConfig2, hashSet);
            hashMap.put(useCaseConfig2, resolveDynamicRangeAndUpdateConstraints);
            if (!linkedHashSet.contains(resolveDynamicRangeAndUpdateConstraints)) {
                linkedHashSet2.add(resolveDynamicRangeAndUpdateConstraints);
            }
        }
        return hashMap;
    }
}
