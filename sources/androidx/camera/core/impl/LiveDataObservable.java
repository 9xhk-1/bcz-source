package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.p1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LiveDataObservable<T> implements Observable<T> {
    final MutableLiveData<Result<T>> mLiveData = new MutableLiveData<>();

    @GuardedBy("mObservers")
    private final Map<Observable.Observer<? super T>, LiveDataObserverAdapter<T>> mObservers = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LiveDataObserverAdapter<T> implements Observer<Result<T>> {
        final AtomicBoolean mActive = new AtomicBoolean(true);
        final Executor mExecutor;
        final Observable.Observer<? super T> mObserver;

        public LiveDataObserverAdapter(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        public static /* synthetic */ void a(LiveDataObserverAdapter liveDataObserverAdapter, Result result) {
            if (liveDataObserverAdapter.mActive.get()) {
                if (result.completedSuccessfully()) {
                    liveDataObserverAdapter.mObserver.onNewData((Object) result.getValue());
                } else {
                    Preconditions.checkNotNull(result.getError());
                    liveDataObserverAdapter.mObserver.onError(result.getError());
                }
            }
        }

        public void disable() {
            this.mActive.set(false);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@NonNull final Result<T> result) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.s
                @Override // java.lang.Runnable
                public final void run() {
                    LiveDataObservable.LiveDataObserverAdapter.a(LiveDataObservable.LiveDataObserverAdapter.this, result);
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Result<T> {

        @Nullable
        private final Throwable mError;

        @Nullable
        private final T mValue;

        private Result(@Nullable T t11, @Nullable Throwable th2) {
            this.mValue = t11;
            this.mError = th2;
        }

        public static <T> Result<T> fromError(@NonNull Throwable th2) {
            return new Result<>(null, (Throwable) Preconditions.checkNotNull(th2));
        }

        public static <T> Result<T> fromValue(@Nullable T t11) {
            return new Result<>(t11, null);
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        @Nullable
        public Throwable getError() {
            return this.mError;
        }

        @Nullable
        public T getValue() {
            if (completedSuccessfully()) {
                return this.mValue;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.mValue;
            } else {
                str = "Error: " + this.mError;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public static /* synthetic */ Object a(final LiveDataObservable liveDataObservable, final CallbackToFutureAdapter.Completer completer) {
        liveDataObservable.getClass();
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.q
            @Override // java.lang.Runnable
            public final void run() {
                LiveDataObservable.c(LiveDataObservable.this, completer);
            }
        });
        return liveDataObservable + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void c(LiveDataObservable liveDataObservable, CallbackToFutureAdapter.Completer completer) {
        Result<T> value = liveDataObservable.mLiveData.getValue();
        if (value == null) {
            completer.setException(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.completedSuccessfully()) {
            completer.set(value.getValue());
        } else {
            Preconditions.checkNotNull(value.getError());
            completer.setException(value.getError());
        }
    }

    public static /* synthetic */ void d(LiveDataObservable liveDataObservable, LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObserverAdapter liveDataObserverAdapter2) {
        if (liveDataObserverAdapter != null) {
            liveDataObservable.mLiveData.removeObserver(liveDataObserverAdapter);
        }
        liveDataObservable.mLiveData.observeForever(liveDataObserverAdapter2);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            try {
                final LiveDataObserverAdapter<T> liveDataObserverAdapter = this.mObservers.get(observer);
                if (liveDataObserverAdapter != null) {
                    liveDataObserverAdapter.disable();
                }
                final LiveDataObserverAdapter<T> liveDataObserverAdapter2 = new LiveDataObserverAdapter<>(executor, observer);
                this.mObservers.put(observer, liveDataObserverAdapter2);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveDataObservable.d(LiveDataObservable.this, liveDataObserverAdapter, liveDataObserverAdapter2);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public p1<T> fetchData() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.r
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return LiveDataObservable.a(LiveDataObservable.this, completer);
            }
        });
    }

    @NonNull
    public LiveData<Result<T>> getLiveData() {
        return this.mLiveData;
    }

    public void postError(@NonNull Throwable th2) {
        this.mLiveData.postValue(Result.fromError(th2));
    }

    public void postValue(@Nullable T t11) {
        this.mLiveData.postValue(Result.fromValue(t11));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            try {
                final LiveDataObserverAdapter<T> remove = this.mObservers.remove(observer);
                if (remove != null) {
                    remove.disable();
                    CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            LiveDataObservable.this.mLiveData.removeObserver(remove);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
