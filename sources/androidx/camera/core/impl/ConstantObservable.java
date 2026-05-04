package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final p1<T> mValueFuture;

    private ConstantObservable(@Nullable T t11) {
        this.mValueFuture = Futures.immediateFuture(t11);
    }

    public static /* synthetic */ void a(ConstantObservable constantObservable, Observable.Observer observer) {
        constantObservable.getClass();
        try {
            observer.onNewData(constantObservable.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e11) {
            observer.onError(e11);
        }
    }

    @NonNull
    public static <U> Observable<U> withValue(@Nullable U u11) {
        return u11 == null ? NULL_OBSERVABLE : new ConstantObservable(u11);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull final Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.i
            @Override // java.lang.Runnable
            public final void run() {
                ConstantObservable.a(ConstantObservable.this, observer);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public p1<T> fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
    }
}
