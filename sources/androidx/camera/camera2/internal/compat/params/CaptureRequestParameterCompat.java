package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CaptureRequestParameterCompat {

    @k
    public static final CaptureRequestParameterCompat INSTANCE = new CaptureRequestParameterCompat();

    private CaptureRequestParameterCompat() {
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    @o
    public static final void setSettingsOverrideZoom(@k Camera2ImplConfig.Builder options, @k Config.OptionPriority priority) {
        CaptureRequest.Key key;
        g0.p(options, "options");
        g0.p(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            key = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            options.setCaptureRequestOptionWithPriority(key, 1, priority);
        }
    }
}
