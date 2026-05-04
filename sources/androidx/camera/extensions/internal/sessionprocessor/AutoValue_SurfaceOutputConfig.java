package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.u.i;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_SurfaceOutputConfig extends SurfaceOutputConfig {

    /* renamed from: id, reason: collision with root package name */
    private final int f3807id;
    private final String physicalCameraId;
    private final Surface surface;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_SurfaceOutputConfig(int i11, int i12, @Nullable String str, List<Camera2OutputConfig> list, Surface surface) {
        this.f3807id = i11;
        this.surfaceGroupId = i12;
        this.physicalCameraId = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutputConfig) {
            SurfaceOutputConfig surfaceOutputConfig = (SurfaceOutputConfig) obj;
            if (this.f3807id == surfaceOutputConfig.getId() && this.surfaceGroupId == surfaceOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(surfaceOutputConfig.getPhysicalCameraId()) : surfaceOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(surfaceOutputConfig.getSurfaceSharingOutputConfigs()) && this.surface.equals(surfaceOutputConfig.getSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f3807id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    @NonNull
    public Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getSurfaceGroupId() {
        return this.surfaceGroupId;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @NonNull
    public List<Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
        return this.surfaceSharingOutputConfigs;
    }

    public int hashCode() {
        int i11 = (((this.f3807id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return ((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.surface.hashCode();
    }

    public String toString() {
        return "SurfaceOutputConfig{id=" + this.f3807id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", surface=" + this.surface + i.f11099d;
    }
}
