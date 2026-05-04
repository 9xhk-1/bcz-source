package p50;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a extends RuntimeException {
    public a(@NonNull Class<?> cls) {
        super("Do you have registered {className}.class to the binder in the adapter/pool?".replace("{className}", cls.getSimpleName()));
    }
}
