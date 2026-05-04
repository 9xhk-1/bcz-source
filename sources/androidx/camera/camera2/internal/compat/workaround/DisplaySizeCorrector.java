package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DisplaySizeCorrector {

    @Nullable
    private final SmallDisplaySizeQuirk mSmallDisplaySizeQuirk = (SmallDisplaySizeQuirk) DeviceQuirks.get(SmallDisplaySizeQuirk.class);

    @Nullable
    public Size getDisplaySize() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.mSmallDisplaySizeQuirk;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.getDisplaySize();
        }
        return null;
    }
}
