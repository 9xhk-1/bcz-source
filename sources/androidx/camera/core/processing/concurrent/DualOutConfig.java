package androidx.camera.core.processing.concurrent;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.util.OutConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class DualOutConfig {
    @NonNull
    public static DualOutConfig of(@NonNull OutConfig outConfig, @NonNull OutConfig outConfig2) {
        return new AutoValue_DualOutConfig(outConfig, outConfig2);
    }

    @NonNull
    public abstract OutConfig getPrimaryOutConfig();

    @NonNull
    public abstract OutConfig getSecondaryOutConfig();
}
