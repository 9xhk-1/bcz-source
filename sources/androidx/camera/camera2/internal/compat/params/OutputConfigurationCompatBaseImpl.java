package androidx.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class OutputConfigurationCompatBaseImpl implements OutputConfigurationCompat.OutputConfigurationCompatImpl {
    static final String TAG = "OutputConfigCompat";
    final Object mObject;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OutputConfigurationParamsApi21 {
        private static final String DETECT_SURFACE_TYPE_METHOD = "detectSurfaceType";
        private static final String GET_GENERATION_ID_METHOD = "getGenerationId";
        private static final String GET_SURFACE_SIZE_METHOD = "getSurfaceSize";
        private static final String LEGACY_CAMERA_DEVICE_CLASS = "android.hardware.camera2.legacy.LegacyCameraDevice";
        static final int MAX_SURFACES_COUNT = 1;
        final int mConfiguredFormat;
        final int mConfiguredGenerationId;
        final Size mConfiguredSize;

        @Nullable
        String mPhysicalCameraId;
        final List<Surface> mSurfaces;
        boolean mIsShared = false;
        long mDynamicRangeProfile = 1;

        public OutputConfigurationParamsApi21(@NonNull Surface surface) {
            Preconditions.checkNotNull(surface, "Surface must not be null");
            this.mSurfaces = Collections.singletonList(surface);
            this.mConfiguredSize = getSurfaceSize(surface);
            this.mConfiguredFormat = getSurfaceFormat(surface);
            this.mConfiguredGenerationId = getSurfaceGenerationId(surface);
        }

        @SuppressLint({"BlockedPrivateApi", "BanUncheckedReflection"})
        private static int getSurfaceFormat(@NonNull Surface surface) {
            try {
                return ((Integer) Class.forName(LEGACY_CAMERA_DEVICE_CLASS).getDeclaredMethod(DETECT_SURFACE_TYPE_METHOD, Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                Logger.e(OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface format.", e11);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi", "BlockedPrivateApi", "BanUncheckedReflection"})
        private static int getSurfaceGenerationId(@NonNull Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod(GET_GENERATION_ID_METHOD, null).invoke(surface, null)).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                Logger.e(OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface generation id.", e11);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi", "BanUncheckedReflection"})
        private static Size getSurfaceSize(@NonNull Surface surface) {
            try {
                Method declaredMethod = Class.forName(LEGACY_CAMERA_DEVICE_CLASS).getDeclaredMethod(GET_SURFACE_SIZE_METHOD, Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                Logger.e(OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface size.", e11);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi21)) {
                return false;
            }
            OutputConfigurationParamsApi21 outputConfigurationParamsApi21 = (OutputConfigurationParamsApi21) obj;
            if (!this.mConfiguredSize.equals(outputConfigurationParamsApi21.mConfiguredSize) || this.mConfiguredFormat != outputConfigurationParamsApi21.mConfiguredFormat || this.mConfiguredGenerationId != outputConfigurationParamsApi21.mConfiguredGenerationId || this.mIsShared != outputConfigurationParamsApi21.mIsShared || this.mDynamicRangeProfile != outputConfigurationParamsApi21.mDynamicRangeProfile || !Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi21.mPhysicalCameraId)) {
                return false;
            }
            int min = Math.min(this.mSurfaces.size(), outputConfigurationParamsApi21.mSurfaces.size());
            for (int i11 = 0; i11 < min; i11++) {
                if (this.mSurfaces.get(i11) != outputConfigurationParamsApi21.mSurfaces.get(i11)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.mSurfaces.hashCode() ^ 31;
            int i11 = this.mConfiguredGenerationId ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.mConfiguredSize.hashCode() ^ ((i11 << 5) - i11);
            int i12 = this.mConfiguredFormat ^ ((hashCode2 << 5) - hashCode2);
            int i13 = (this.mIsShared ? 1 : 0) ^ ((i12 << 5) - i12);
            int i14 = (i13 << 5) - i13;
            String str = this.mPhysicalCameraId;
            int hashCode3 = (str == null ? 0 : str.hashCode()) ^ i14;
            return Long.hashCode(this.mDynamicRangeProfile) ^ ((hashCode3 << 5) - hashCode3);
        }
    }

    public OutputConfigurationCompatBaseImpl(@NonNull Surface surface) {
        this.mObject = new OutputConfigurationParamsApi21(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(@NonNull Surface surface) {
        Preconditions.checkNotNull(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!isSurfaceSharingEnabled()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((OutputConfigurationParamsApi21) this.mObject).mIsShared = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompatBaseImpl) {
            return Objects.equals(this.mObject, ((OutputConfigurationCompatBaseImpl) obj).mObject);
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((OutputConfigurationParamsApi21) this.mObject).mDynamicRangeProfile;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return 1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMirrorMode() {
        return 0;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @Nullable
    public Object getOutputConfiguration() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @Nullable
    public String getPhysicalCameraId() {
        return ((OutputConfigurationParamsApi21) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getStreamUseCase() {
        return -1L;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @Nullable
    public Surface getSurface() {
        List<Surface> list = ((OutputConfigurationParamsApi21) this.mObject).mSurfaces;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
        return -1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    @NonNull
    public List<Surface> getSurfaces() {
        return ((OutputConfigurationParamsApi21) this.mObject).mSurfaces;
    }

    public int hashCode() {
        return this.mObject.hashCode();
    }

    public boolean isSurfaceSharingEnabled() {
        return ((OutputConfigurationParamsApi21) this.mObject).mIsShared;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(@NonNull Surface surface) {
        if (getSurface() != surface) {
            throw new IllegalArgumentException("Surface is not part of this output configuration");
        }
        throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j11) {
        ((OutputConfigurationParamsApi21) this.mObject).mDynamicRangeProfile = j11;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(@Nullable String str) {
        ((OutputConfigurationParamsApi21) this.mObject).mPhysicalCameraId = str;
    }

    public OutputConfigurationCompatBaseImpl(@NonNull Object obj) {
        this.mObject = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setMirrorMode(int i11) {
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setStreamUseCase(long j11) {
    }
}
