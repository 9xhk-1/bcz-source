package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.MutableConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ExtendableBuilder<T> {
    @NonNull
    T build();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    MutableConfig getMutableConfig();
}
