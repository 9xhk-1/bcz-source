package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes.dex */
final class SurfaceVerificationHelper {

    @m80.k
    public static final SurfaceVerificationHelper INSTANCE = new SurfaceVerificationHelper();

    private SurfaceVerificationHelper() {
    }

    @m80.k
    public final Canvas lockHardwareCanvas(@m80.k Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
