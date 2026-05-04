package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface e<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<T> {
        @NonNull
        e<T> a(@NonNull T t11);

        @NonNull
        Class<T> getDataClass();
    }

    @NonNull
    T a() throws IOException;

    void cleanup();
}
