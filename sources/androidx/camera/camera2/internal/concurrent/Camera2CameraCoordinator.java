package androidx.camera.camera2.internal.concurrent;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.camera.camera2.internal.CameraIdUtil;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class Camera2CameraCoordinator implements CameraCoordinator {
    private static final String TAG = "Camera2CameraCoordinator";

    @NonNull
    private final CameraManagerCompat mCameraManager;
    private int mCameraOperatingMode = 0;

    @NonNull
    private final Map<String, List<String>> mConcurrentCameraIdMap = new HashMap();

    @NonNull
    private Set<Set<String>> mConcurrentCameraIds = new HashSet();

    @NonNull
    private final List<CameraCoordinator.ConcurrentCameraModeListener> mConcurrentCameraModeListeners = new ArrayList();

    @NonNull
    private List<CameraInfo> mActiveConcurrentCameraInfos = new ArrayList();

    public Camera2CameraCoordinator(@NonNull CameraManagerCompat cameraManagerCompat) {
        this.mCameraManager = cameraManagerCompat;
        retrieveConcurrentCameraIds();
    }

    public static /* synthetic */ List a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            if (str.equals(Camera2CameraInfo.from(cameraInfo).getCameraId())) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalArgumentException("No camera can be find for id: " + str);
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    private static CameraSelector createCameraSelectorById(@NonNull CameraManagerCompat cameraManagerCompat, @NonNull final String str) {
        CameraSelector.Builder addCameraFilter = new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: f.a
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return Camera2CameraCoordinator.a(str, list);
            }
        });
        try {
            addCameraFilter.requireLensFacing(((Integer) cameraManagerCompat.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.LENS_FACING)).intValue());
            return addCameraFilter.build();
        } catch (CameraAccessExceptionCompat e11) {
            throw new RuntimeException(e11);
        }
    }

    private void retrieveConcurrentCameraIds() {
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = this.mCameraManager.getConcurrentCameraIds();
        } catch (CameraAccessExceptionCompat unused) {
            Logger.e(TAG, "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (CameraIdUtil.isBackwardCompatible(this.mCameraManager, str) && CameraIdUtil.isBackwardCompatible(this.mCameraManager, str2)) {
                        this.mConcurrentCameraIds.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.mConcurrentCameraIdMap.containsKey(str)) {
                            this.mConcurrentCameraIdMap.put(str, new ArrayList());
                        }
                        if (!this.mConcurrentCameraIdMap.containsKey(str2)) {
                            this.mConcurrentCameraIdMap.put(str2, new ArrayList());
                        }
                        this.mConcurrentCameraIdMap.get(str).add((String) arrayList.get(1));
                        this.mConcurrentCameraIdMap.get(str2).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    Logger.d(TAG, "Concurrent camera id pair: (" + str + j2.O + str2 + ") is not backward compatible");
                }
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addListener(@NonNull CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.mConcurrentCameraModeListeners.add(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @NonNull
    public List<CameraInfo> getActiveConcurrentCameraInfos() {
        return this.mActiveConcurrentCameraInfos;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
        return this.mCameraOperatingMode;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @NonNull
    public List<List<CameraSelector>> getConcurrentCameraSelectors() {
        ArrayList arrayList = new ArrayList();
        for (Set<String> set : this.mConcurrentCameraIds) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(createCameraSelectorById(this.mCameraManager, it.next()));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    @Nullable
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public String getPairedConcurrentCameraId(@NonNull String str) {
        if (!this.mConcurrentCameraIdMap.containsKey(str)) {
            return null;
        }
        for (String str2 : this.mConcurrentCameraIdMap.get(str)) {
            Iterator<CameraInfo> it = this.mActiveConcurrentCameraInfos.iterator();
            while (it.hasNext()) {
                if (str2.equals(Camera2CameraInfo.from(it.next()).getCameraId())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removeListener(@NonNull CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.mConcurrentCameraModeListeners.remove(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setActiveConcurrentCameraInfos(@NonNull List<CameraInfo> list) {
        this.mActiveConcurrentCameraInfos = new ArrayList(list);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int i11) {
        if (i11 != this.mCameraOperatingMode) {
            Iterator<CameraCoordinator.ConcurrentCameraModeListener> it = this.mConcurrentCameraModeListeners.iterator();
            while (it.hasNext()) {
                it.next().onCameraOperatingModeUpdated(this.mCameraOperatingMode, i11);
            }
        }
        if (this.mCameraOperatingMode == 2 && i11 != 2) {
            this.mActiveConcurrentCameraInfos.clear();
        }
        this.mCameraOperatingMode = i11;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void shutdown() {
        this.mConcurrentCameraModeListeners.clear();
        this.mConcurrentCameraIdMap.clear();
        this.mActiveConcurrentCameraInfos.clear();
        this.mConcurrentCameraIds.clear();
        this.mCameraOperatingMode = 0;
    }
}
