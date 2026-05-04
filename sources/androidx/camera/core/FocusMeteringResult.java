package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    private FocusMeteringResult(boolean z11) {
        this.mIsFocusSuccessful = z11;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static FocusMeteringResult create(boolean z11) {
        return new FocusMeteringResult(z11);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static FocusMeteringResult emptyInstance() {
        return new FocusMeteringResult(false);
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }
}
