package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SessionResetPolicy {
    private final boolean mNeedAbortCapture;

    public SessionResetPolicy(@NonNull Quirks quirks) {
        this.mNeedAbortCapture = quirks.contains(Preview3AThreadCrashQuirk.class);
    }

    public boolean needAbortCapture() {
        return this.mNeedAbortCapture;
    }
}
