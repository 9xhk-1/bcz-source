package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.SupportedSurfaceCombination;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_SupportedSurfaceCombination_FeatureSettings extends SupportedSurfaceCombination.FeatureSettings {
    private final int cameraMode;
    private final boolean previewStabilizationOn;
    private final int requiredMaxBitDepth;
    private final boolean ultraHdrOn;

    public AutoValue_SupportedSurfaceCombination_FeatureSettings(int i11, int i12, boolean z11, boolean z12) {
        this.cameraMode = i11;
        this.requiredMaxBitDepth = i12;
        this.previewStabilizationOn = z11;
        this.ultraHdrOn = z12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SupportedSurfaceCombination.FeatureSettings) {
            SupportedSurfaceCombination.FeatureSettings featureSettings = (SupportedSurfaceCombination.FeatureSettings) obj;
            if (this.cameraMode == featureSettings.getCameraMode() && this.requiredMaxBitDepth == featureSettings.getRequiredMaxBitDepth() && this.previewStabilizationOn == featureSettings.isPreviewStabilizationOn() && this.ultraHdrOn == featureSettings.isUltraHdrOn()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getCameraMode() {
        return this.cameraMode;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public int getRequiredMaxBitDepth() {
        return this.requiredMaxBitDepth;
    }

    public int hashCode() {
        return ((((((this.cameraMode ^ 1000003) * 1000003) ^ this.requiredMaxBitDepth) * 1000003) ^ (this.previewStabilizationOn ? 1231 : 1237)) * 1000003) ^ (this.ultraHdrOn ? 1231 : 1237);
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isPreviewStabilizationOn() {
        return this.previewStabilizationOn;
    }

    @Override // androidx.camera.camera2.internal.SupportedSurfaceCombination.FeatureSettings
    public boolean isUltraHdrOn() {
        return this.ultraHdrOn;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.cameraMode + ", requiredMaxBitDepth=" + this.requiredMaxBitDepth + ", previewStabilizationOn=" + this.previewStabilizationOn + ", ultraHdrOn=" + this.ultraHdrOn + com.alipay.sdk.m.u.i.f11099d;
    }
}
