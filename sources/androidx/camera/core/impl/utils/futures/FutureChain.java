package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class FutureChain<V> implements p1<V> {

    @Nullable
    CallbackToFutureAdapter.Completer<V> mCompleter;

    @NonNull
    private final p1<V> mDelegate;

    public FutureChain(@NonNull p1<V> p1Var) {
        this.mDelegate = (p1) Preconditions.checkNotNull(p1Var);
    }

    @NonNull
    public static <V> FutureChain<V> from(@NonNull p1<V> p1Var) {
        return p1Var instanceof FutureChain ? (FutureChain) p1Var : new FutureChain<>(p1Var);
    }

    public final void addCallback(@NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    @Override // com.google.common.util.concurrent.p1
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.mDelegate.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws InterruptedException, ExecutionException {
        return this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    public boolean set(@Nullable V v11) {
        CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.set(v11);
        }
        return false;
    }

    public boolean setException(@NonNull Throwable th2) {
        CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.setException(th2);
        }
        return false;
    }

    @NonNull
    public final <T> FutureChain<T> transform(@NonNull Function<? super V, T> function, @NonNull Executor executor) {
        return (FutureChain) Futures.transform(this, function, executor);
    }

    @NonNull
    public final <T> FutureChain<T> transformAsync(@NonNull AsyncFunction<? super V, T> asyncFunction, @NonNull Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mDelegate.get(j11, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<V> completer) {
                Preconditions.checkState(FutureChain.this.mCompleter == null, "The result can only set once!");
                FutureChain.this.mCompleter = completer;
                return "FutureChain[" + FutureChain.this + "]";
            }
        });
    }
}
