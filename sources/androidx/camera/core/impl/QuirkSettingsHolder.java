package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.core.util.Consumer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings DEFAULT = QuirkSettings.withDefaultBehavior();
    private static final QuirkSettingsHolder sInstance = new QuirkSettingsHolder();
    private final MutableStateObservable<QuirkSettings> mObservable = MutableStateObservable.withInitialState(DEFAULT);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ObserverToConsumerAdapter<T> implements Observable.Observer<T> {
        private static final String TAG = "ObserverToConsumerAdapter";
        private final Consumer<T> mDelegate;

        public ObserverToConsumerAdapter(@NonNull Consumer<T> consumer) {
            this.mDelegate = consumer;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(@NonNull Throwable th2) {
            Logger.e(TAG, "Unexpected error in Observable", th2);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(@Nullable T t11) {
            this.mDelegate.accept(t11);
        }
    }

    @NonNull
    public static QuirkSettingsHolder instance() {
        return sInstance;
    }

    @NonNull
    public QuirkSettings get() {
        try {
            return this.mObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e11);
        }
    }

    public void observe(@NonNull Executor executor, @NonNull Consumer<QuirkSettings> consumer) {
        this.mObservable.addObserver(executor, new ObserverToConsumerAdapter(consumer));
    }

    @VisibleForTesting
    public void reset() {
        this.mObservable.removeObservers();
        this.mObservable.setState(DEFAULT);
    }

    public void set(@NonNull QuirkSettings quirkSettings) {
        this.mObservable.setState(quirkSettings);
    }
}
