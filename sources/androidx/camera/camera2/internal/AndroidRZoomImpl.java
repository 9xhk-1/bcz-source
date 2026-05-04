package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.CaptureRequestParameterCompat;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes.dex */
final class AndroidRZoomImpl implements ZoomControl.ZoomImpl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio = 1.0f;
    private float mPendingZoomRatio = 1.0f;
    private CallbackToFutureAdapter.Completer<Void> mPendingZoomRatioCompleter;
    private boolean mShouldOverrideZoom;
    private final Range<Float> mZoomRatioRange;

    public AndroidRZoomImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        this.mShouldOverrideZoom = false;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.mZoomRatioRange = (Range) cameraCharacteristicsCompat.get(key);
        this.mShouldOverrideZoom = cameraCharacteristicsCompat.isZoomOverrideAvailable();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void addRequestOption(@NonNull Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.mCurrentZoomRatio);
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, valueOf, optionPriority);
        if (this.mShouldOverrideZoom) {
            CaptureRequestParameterCompat.setSettingsOverrideZoom(builder, optionPriority);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    @NonNull
    public Rect getCropSensorRegion() {
        return (Rect) Preconditions.checkNotNull((Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        return this.mZoomRatioRange.getUpper().floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return this.mZoomRatioRange.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f11;
        if (this.mPendingZoomRatioCompleter != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f11 = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f11 = (Float) request.get(key);
            }
            if (f11 == null) {
                return;
            }
            if (this.mPendingZoomRatio == f11.floatValue()) {
                this.mPendingZoomRatioCompleter.set(null);
                this.mPendingZoomRatioCompleter = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mCurrentZoomRatio = 1.0f;
        CallbackToFutureAdapter.Completer<Void> completer = this.mPendingZoomRatioCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float f11, @NonNull CallbackToFutureAdapter.Completer<Void> completer) {
        this.mCurrentZoomRatio = f11;
        CallbackToFutureAdapter.Completer<Void> completer2 = this.mPendingZoomRatioCompleter;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomRatio = this.mCurrentZoomRatio;
        this.mPendingZoomRatioCompleter = completer;
    }
}
