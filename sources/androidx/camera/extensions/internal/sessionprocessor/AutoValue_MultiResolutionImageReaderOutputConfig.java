package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.u.i;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_MultiResolutionImageReaderOutputConfig extends MultiResolutionImageReaderOutputConfig {

    /* renamed from: id, reason: collision with root package name */
    private final int f3806id;
    private final int imageFormat;
    private final int maxImages;
    private final String physicalCameraId;
    private final int surfaceGroupId;
    private final List<Camera2OutputConfig> surfaceSharingOutputConfigs;

    public AutoValue_MultiResolutionImageReaderOutputConfig(int i11, int i12, @Nullable String str, List<Camera2OutputConfig> list, int i13, int i14) {
        this.f3806id = i11;
        this.surfaceGroupId = i12;
        this.physicalCameraId = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.surfaceSharingOutputConfigs = list;
        this.imageFormat = i13;
        this.maxImages = i14;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiResolutionImageReaderOutputConfig) {
            MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (MultiResolutionImageReaderOutputConfig) obj;
            if (this.f3806id == multiResolutionImageReaderOutputConfig.getId() && this.surfaceGroupId == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.physicalCameraId) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.surfaceSharingOutputConfigs.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.imageFormat == multiResolutionImageReaderOutputConfig.getImageFormat() && this.maxImages == multiResolutionImageReaderOutputConfig.getMaxImages()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    public int getId() {
        return this.f3806id;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
    @Nullable
    public String getPhysicalCameraId() {
        return this.physicalCameraId;
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
        int i11 = (((this.f3806id ^ 1000003) * 1000003) ^ this.surfaceGroupId) * 1000003;
        String str = this.physicalCameraId;
        return ((((((i11 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.surfaceSharingOutputConfigs.hashCode()) * 1000003) ^ this.imageFormat) * 1000003) ^ this.maxImages;
    }

    public String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f3806id + ", surfaceGroupId=" + this.surfaceGroupId + ", physicalCameraId=" + this.physicalCameraId + ", surfaceSharingOutputConfigs=" + this.surfaceSharingOutputConfigs + ", imageFormat=" + this.imageFormat + ", maxImages=" + this.maxImages + i.f11099d;
    }
}
