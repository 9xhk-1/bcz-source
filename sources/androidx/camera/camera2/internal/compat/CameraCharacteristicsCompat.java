package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class CameraCharacteristicsCompat {

    @NonNull
    private final CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;

    @NonNull
    private final String mCameraId;

    @NonNull
    @GuardedBy("this")
    private final Map<CameraCharacteristics.Key<?>, Object> mValuesCache = new HashMap();

    @Nullable
    private StreamConfigurationMapCompat mStreamConfigurationMapCompat = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface CameraCharacteristicsCompatImpl {
        @Nullable
        <T> T get(@NonNull CameraCharacteristics.Key<T> key);

        @NonNull
        Set<String> getPhysicalCameraIds();

        @NonNull
        CameraCharacteristics unwrap();
    }

    private CameraCharacteristicsCompat(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
        this.mCameraId = str;
    }

    private boolean isKeyNonCacheable(@NonNull CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    @NonNull
    @VisibleForTesting
    public static CameraCharacteristicsCompat toCameraCharacteristicsCompat(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        return new CameraCharacteristicsCompat(cameraCharacteristics, str);
    }

    @Nullable
    public <T> T get(@NonNull CameraCharacteristics.Key<T> key) {
        if (isKeyNonCacheable(key)) {
            return (T) this.mCameraCharacteristicsImpl.get(key);
        }
        synchronized (this) {
            try {
                T t11 = (T) this.mValuesCache.get(key);
                if (t11 != null) {
                    return t11;
                }
                T t12 = (T) this.mCameraCharacteristicsImpl.get(key);
                if (t12 != null) {
                    this.mValuesCache.put(key, t12);
                }
                return t12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristicsImpl.getPhysicalCameraIds();
    }

    @NonNull
    public StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        if (this.mStreamConfigurationMapCompat == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.mStreamConfigurationMapCompat = StreamConfigurationMapCompat.toStreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.mCameraId));
            } catch (AssertionError | NullPointerException e11) {
                throw new IllegalArgumentException(e11.getMessage());
            }
        }
        return this.mStreamConfigurationMapCompat;
    }

    public boolean isZoomOverrideAvailable() {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 34) {
            CameraCharacteristicsCompatImpl cameraCharacteristicsCompatImpl = this.mCameraCharacteristicsImpl;
            key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) cameraCharacteristicsCompatImpl.get(key);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NonNull
    public CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristicsImpl.unwrap();
    }
}
