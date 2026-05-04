package androidx.camera.extensions.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ExtensionsUtils {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static Set<String> getPhysicalCameraIds(@NonNull CameraCharacteristics cameraCharacteristics) {
            try {
                return cameraCharacteristics.getPhysicalCameraIds();
            } catch (Exception unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    private ExtensionsUtils() {
    }

    @NonNull
    public static Map<String, CameraCharacteristics> getCameraCharacteristicsMap(@NonNull CameraInfoInternal cameraInfoInternal) {
        Set<String> physicalCameraIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String cameraId = cameraInfoInternal.getCameraId();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) cameraInfoInternal.getCameraCharacteristics();
        linkedHashMap.put(cameraId, cameraCharacteristics);
        if (Build.VERSION.SDK_INT >= 28 && (physicalCameraIds = Api28Impl.getPhysicalCameraIds(cameraCharacteristics)) != null) {
            for (String str : physicalCameraIds) {
                if (!Objects.equals(str, cameraId)) {
                    linkedHashMap.put(str, (CameraCharacteristics) cameraInfoInternal.getPhysicalCameraCharacteristics(str));
                }
            }
        }
        return linkedHashMap;
    }
}
