package androidx.camera.camera2.internal.compat.workaround;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlus {
    @SuppressLint({"NewApi"})
    public void toggleHDRPlus(int i11, @NonNull Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        if (((ImageCapturePixelHDRPlusQuirk) DeviceQuirks.get(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i11 == 0) {
            key = CaptureRequest.CONTROL_ENABLE_ZSL;
            builder.setCaptureRequestOption(key, Boolean.TRUE);
        } else {
            if (i11 != 1) {
                return;
            }
            key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
            builder.setCaptureRequestOption(key2, Boolean.FALSE);
        }
    }
}
