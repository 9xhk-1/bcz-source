package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(@Nullable Object obj, boolean z11) {
        super(obj, z11);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialError(@NonNull Throwable th2) {
        return new MutableStateObservable<>(th2, true);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialState(@Nullable T t11) {
        return new MutableStateObservable<>(t11, false);
    }

    public void setError(@NonNull Throwable th2) {
        updateStateAsError(th2);
    }

    public void setState(@Nullable T t11) {
        updateState(t11);
    }
}
