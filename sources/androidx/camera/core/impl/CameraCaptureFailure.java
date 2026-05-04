package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class CameraCaptureFailure {
    private final Reason mReason;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(@NonNull Reason reason) {
        this.mReason = reason;
    }

    @Nullable
    public Object getCaptureFailure() {
        return null;
    }

    @NonNull
    public Reason getReason() {
        return this.mReason;
    }
}
