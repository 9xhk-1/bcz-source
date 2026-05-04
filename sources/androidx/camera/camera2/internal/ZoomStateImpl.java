package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f11, float f12) {
        this.mMaxZoomRatio = f11;
        this.mMinZoomRatio = f12;
    }

    private float getPercentageByRatio(float f11) {
        float f12 = this.mMaxZoomRatio;
        float f13 = this.mMinZoomRatio;
        if (f12 == f13) {
            return 0.0f;
        }
        if (f11 == f12) {
            return 1.0f;
        }
        if (f11 == f13) {
            return 0.0f;
        }
        float f14 = 1.0f / f13;
        return ((1.0f / f11) - f14) / ((1.0f / f12) - f14);
    }

    private float getRatioByPercentage(float f11) {
        if (f11 == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f11 == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f12 = this.mMaxZoomRatio;
        float f13 = this.mMinZoomRatio;
        double d11 = 1.0f / f13;
        return (float) MathUtils.clamp(1.0d / (d11 + (((1.0f / f12) - d11) * f11)), f13, f12);
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f11) throws IllegalArgumentException {
        if (f11 <= 1.0f && f11 >= 0.0f) {
            this.mLinearZoom = f11;
            this.mZoomRatio = getRatioByPercentage(f11);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f11 + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f11) throws IllegalArgumentException {
        if (f11 <= this.mMaxZoomRatio && f11 >= this.mMinZoomRatio) {
            this.mZoomRatio = f11;
            this.mLinearZoom = getPercentageByRatio(f11);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f11 + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
    }
}
