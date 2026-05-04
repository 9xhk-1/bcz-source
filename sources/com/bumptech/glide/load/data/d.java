package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface d<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<T> {
        void b(@Nullable T t11);

        void c(@NonNull Exception exc);
    }

    void cancel();

    void cleanup();

    @NonNull
    Class<T> getDataClass();

    @NonNull
    DataSource getDataSource();

    void loadData(@NonNull Priority priority, @NonNull a<? super T> aVar);
}
