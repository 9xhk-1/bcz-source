package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Futures {
    private static final Function<?, ?> IDENTITY_FUNCTION = new Function<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e11) {
                e = e11;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e12) {
                e = e12;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e13);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        @NonNull
        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static /* synthetic */ Object a(final p1 p1Var, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z11, long j11, final CallbackToFutureAdapter.Completer completer) {
        propagate(p1Var, completer);
        if (!p1Var.isDone()) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.f
                @Override // java.lang.Runnable
                public final void run() {
                    Futures.h(CallbackToFutureAdapter.Completer.this, obj, z11, p1Var);
                }
            }, j11, TimeUnit.MILLISECONDS);
            p1Var.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.g
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + p1Var + "]";
    }

    public static <V> void addCallback(@NonNull p1<V> p1Var, @NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        p1Var.addListener(new CallbackListener(p1Var, futureCallback), executor);
    }

    @NonNull
    public static <V> p1<List<V>> allAsList(@NonNull Collection<? extends p1<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    public static /* synthetic */ Object c(p1 p1Var, CallbackToFutureAdapter.Completer completer) {
        propagateTransform(false, p1Var, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + p1Var + "]";
    }

    public static /* synthetic */ Object d(final p1 p1Var, ScheduledExecutorService scheduledExecutorService, final long j11, final CallbackToFutureAdapter.Completer completer) {
        propagate(p1Var, completer);
        if (!p1Var.isDone()) {
            final ScheduledFuture schedule = scheduledExecutorService.schedule(new Callable() { // from class: androidx.camera.core.impl.utils.futures.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(CallbackToFutureAdapter.Completer.this.setException(new TimeoutException("Future[" + p1Var + "] is not done within " + j11 + " ms.")));
                    return valueOf;
                }
            }, j11, TimeUnit.MILLISECONDS);
            p1Var.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.i
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + p1Var + "]";
    }

    public static /* synthetic */ Object f(p1 p1Var, final CallbackToFutureAdapter.Completer completer) {
        p1Var.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.c
            @Override // java.lang.Runnable
            public final void run() {
                CallbackToFutureAdapter.Completer.this.set(null);
            }
        }, CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + p1Var + "]";
    }

    @Nullable
    public static <V> V getDone(@NonNull Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    @Nullable
    public static <V> V getUninterruptibly(@NonNull Future<V> future) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return v11;
    }

    public static /* synthetic */ void h(CallbackToFutureAdapter.Completer completer, Object obj, boolean z11, p1 p1Var) {
        completer.set(obj);
        if (z11) {
            p1Var.cancel(true);
        }
    }

    @NonNull
    public static <V> p1<V> immediateFailedFuture(@NonNull Throwable th2) {
        return new ImmediateFuture.ImmediateFailedFuture(th2);
    }

    @NonNull
    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(@NonNull Throwable th2) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th2);
    }

    @NonNull
    public static <V> p1<V> immediateFuture(@Nullable V v11) {
        return v11 == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v11);
    }

    @NonNull
    public static <V> p1<V> makeTimeoutFuture(final long j11, @NonNull final ScheduledExecutorService scheduledExecutorService, @NonNull final p1<V> p1Var) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.d(p1.this, scheduledExecutorService, j11, completer);
            }
        });
    }

    @NonNull
    public static <V> p1<V> nonCancellationPropagating(@NonNull final p1<V> p1Var) {
        Preconditions.checkNotNull(p1Var);
        return p1Var.isDone() ? p1Var : CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.d
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.c(p1.this, completer);
            }
        });
    }

    public static <V> void propagate(@NonNull p1<V> p1Var, @NonNull CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(p1Var, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(@NonNull p1<I> p1Var, @NonNull Function<? super I, ? extends O> function, @NonNull CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        propagateTransform(true, p1Var, function, completer, executor);
    }

    @NonNull
    public static <V> p1<List<V>> successfulAsList(@NonNull Collection<? extends p1<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    @NonNull
    public static <I, O> p1<O> transform(@NonNull p1<I> p1Var, @NonNull final Function<? super I, ? extends O> function, @NonNull Executor executor) {
        Preconditions.checkNotNull(function);
        return transformAsync(p1Var, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            @NonNull
            public p1<O> apply(I i11) {
                return Futures.immediateFuture(Function.this.apply(i11));
            }
        }, executor);
    }

    @NonNull
    public static <I, O> p1<O> transformAsync(@NonNull p1<I> p1Var, @NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, p1Var);
        p1Var.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    @NonNull
    public static <V> p1<Void> transformAsyncOnCompletion(@NonNull final p1<V> p1Var) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.f(p1.this, completer);
            }
        });
    }

    @NonNull
    public static <V> p1<V> makeTimeoutFuture(final long j11, @NonNull final ScheduledExecutorService scheduledExecutorService, @Nullable final V v11, final boolean z11, @NonNull final p1<V> p1Var) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.a(p1.this, scheduledExecutorService, v11, z11, j11, completer);
            }
        });
    }

    private static <I, O> void propagateTransform(boolean z11, @NonNull final p1<I> p1Var, @NonNull final Function<? super I, ? extends O> function, @NonNull final CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        Preconditions.checkNotNull(p1Var);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(p1Var, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                CallbackToFutureAdapter.Completer.this.setException(th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable I i11) {
                try {
                    CallbackToFutureAdapter.Completer.this.set(function.apply(i11));
                } catch (Throwable th2) {
                    CallbackToFutureAdapter.Completer.this.setException(th2);
                }
            }
        }, executor);
        if (z11) {
            completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    p1.this.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }
}
