package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class Camera2CameraCaptureResult implements CameraCaptureResult {
    private static final String TAG = "C2CameraCaptureResult";
    private final CaptureResult mCaptureResult;
    private final TagBundle mTagBundle;

    public Camera2CameraCaptureResult(@NonNull TagBundle tagBundle, @NonNull CaptureResult captureResult) {
        this.mTagBundle = tagBundle;
        this.mCaptureResult = captureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeMode getAeMode() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return CameraCaptureMetaData.AeMode.UNKNOWN;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? CameraCaptureMetaData.AeMode.UNKNOWN : CameraCaptureMetaData.AeMode.ON_EXTERNAL_FLASH : CameraCaptureMetaData.AeMode.ON_AUTO_FLASH_REDEYE : CameraCaptureMetaData.AeMode.ON_ALWAYS_FLASH : CameraCaptureMetaData.AeMode.ON_AUTO_FLASH : CameraCaptureMetaData.AeMode.ON : CameraCaptureMetaData.AeMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AeState getAeState() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData.AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData.AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData.AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData.AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                Logger.e(TAG, "Undefined ae state: " + num);
                return CameraCaptureMetaData.AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData.AeState.SEARCHING;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfMode getAfMode() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                Logger.e(TAG, "Undefined af mode: " + num);
                return CameraCaptureMetaData.AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData.AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AfState getAfState() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                Logger.e(TAG, "Undefined af state: " + num);
                break;
        }
        return CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbMode getAwbMode() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return CameraCaptureMetaData.AwbMode.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.AwbState getAwbState() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return CameraCaptureMetaData.AwbState.METERING;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return CameraCaptureMetaData.AwbState.LOCKED;
        }
        Logger.e(TAG, "Undefined awb state: " + num);
        return CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CaptureResult getCaptureResult() {
        return this.mCaptureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public CameraCaptureMetaData.FlashState getFlashState() {
        Integer num = (Integer) this.mCaptureResult.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData.FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData.FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData.FlashState.FIRED;
        }
        Logger.e(TAG, "Undefined flash state: " + num);
        return CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NonNull
    public TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        Long l11 = (Long) this.mCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 == null) {
            return -1L;
        }
        return l11.longValue();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(@NonNull ExifData.Builder builder) {
        super.populateExifData(builder);
        try {
            Integer num = (Integer) this.mCaptureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            Logger.w(TAG, "Failed to get JPEG orientation.");
        }
        Long l11 = (Long) this.mCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            builder.setExposureTimeNanos(l11.longValue());
        }
        Float f11 = (Float) this.mCaptureResult.get(CaptureResult.LENS_APERTURE);
        if (f11 != null) {
            builder.setLensFNumber(f11.floatValue());
        }
        Integer num2 = (Integer) this.mCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) this.mCaptureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            builder.setIso(num2.intValue());
        }
        Float f12 = (Float) this.mCaptureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f12 != null) {
            builder.setFocalLength(f12.floatValue());
        }
        Integer num3 = (Integer) this.mCaptureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            builder.setWhiteBalanceMode(whiteBalanceMode);
        }
    }

    public Camera2CameraCaptureResult(@NonNull CaptureResult captureResult) {
        this(TagBundle.emptyBundle(), captureResult);
    }
}
