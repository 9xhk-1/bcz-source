package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CaptureStage {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultCaptureStage implements CaptureStage {
        private final CaptureConfig mCaptureConfig = new CaptureConfig.Builder().build();

        @Override // androidx.camera.core.impl.CaptureStage
        @NonNull
        public CaptureConfig getCaptureConfig() {
            return this.mCaptureConfig;
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public int getId() {
            return 0;
        }
    }

    @NonNull
    CaptureConfig getCaptureConfig();

    int getId();
}
