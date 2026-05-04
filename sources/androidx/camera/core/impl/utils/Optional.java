package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    @NonNull
    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    @NonNull
    public static <T> Optional<T> fromNullable(@Nullable T t11) {
        return t11 == null ? absent() : new Present(t11);
    }

    @NonNull
    public static <T> Optional<T> of(@NonNull T t11) {
        return new Present(Preconditions.checkNotNull(t11));
    }

    public abstract boolean equals(@Nullable Object obj);

    @NonNull
    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    @NonNull
    public abstract Optional<T> or(@NonNull Optional<? extends T> optional);

    @NonNull
    public abstract T or(@NonNull Supplier<? extends T> supplier);

    @NonNull
    public abstract T or(@NonNull T t11);

    @Nullable
    public abstract T orNull();

    @NonNull
    public abstract String toString();
}
