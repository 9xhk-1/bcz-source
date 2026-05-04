package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class Identifier {
    @NonNull
    public static Identifier create(@NonNull Object obj) {
        return new AutoValue_Identifier(obj);
    }

    @NonNull
    public abstract Object getValue();
}
