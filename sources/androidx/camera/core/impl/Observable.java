package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Observable<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Observer<T> {
        void onError(@NonNull Throwable th2);

        void onNewData(@Nullable T t11);
    }

    void addObserver(@NonNull Executor executor, @NonNull Observer<? super T> observer);

    @NonNull
    p1<T> fetchData();

    void removeObserver(@NonNull Observer<? super T> observer);
}
