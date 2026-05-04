package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {

    @Nullable
    private AsyncFunction<? super I, ? extends O> mFunction;

    @Nullable
    private p1<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);

    @Nullable
    volatile p1<? extends O> mOutputFuture;

    public ChainingListenableFuture(@NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull p1<? extends I> p1Var) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (p1) Preconditions.checkNotNull(p1Var);
    }

    private <E> void putUninterruptibly(@NonNull BlockingQueue<E> blockingQueue, @NonNull E e11) {
        boolean z11 = false;
        while (true) {
            try {
                blockingQueue.put(e11);
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
    }

    private <E> E takeUninterruptibly(@NonNull BlockingQueue<E> blockingQueue) {
        E take;
        boolean z11 = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        if (!super.cancel(z11)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z11));
        cancel(this.mInputFuture, z11);
        cancel(this.mOutputFuture, z11);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            p1<? extends I> p1Var = this.mInputFuture;
            if (p1Var != null) {
                p1Var.get();
            }
            this.mOutputCreated.await();
            p1<? extends O> p1Var2 = this.mOutputFuture;
            if (p1Var2 != null) {
                p1Var2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.p1<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.p1<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        AsyncFunction<? super I, ? extends O> asyncFunction;
        ?? r02 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            final p1<? extends O> apply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                            this.mOutputFuture = apply;
                            if (isCancelled()) {
                                apply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                                this.mOutputFuture = null;
                            } else {
                                apply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            try {
                                                try {
                                                    ChainingListenableFuture.this.set(Futures.getUninterruptibly(apply));
                                                } catch (CancellationException unused) {
                                                    ChainingListenableFuture.this.cancel(false);
                                                }
                                            } catch (ExecutionException e11) {
                                                ChainingListenableFuture.this.setException(e11.getCause());
                                            }
                                        } finally {
                                            ChainingListenableFuture.this.mOutputFuture = null;
                                        }
                                    }
                                }, CameraXExecutors.directExecutor());
                            }
                        } catch (Exception e11) {
                            setException(e11);
                            asyncFunction = r02;
                        }
                    } catch (Error e12) {
                        setException(e12);
                        asyncFunction = r02;
                    }
                } finally {
                    this.mFunction = (AsyncFunction<? super I, ? extends O>) r02;
                    this.mInputFuture = (p1<? extends I>) r02;
                    this.mOutputCreated.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e13) {
                setException(e13.getCause());
            }
        } catch (UndeclaredThrowableException e14) {
            setException(e14.getCause());
            asyncFunction = r02;
        }
    }

    private void cancel(@Nullable Future<?> future, boolean z11) {
        if (future != null) {
            future.cancel(z11);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get(long j11, @NonNull TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j11 = timeUnit2.convert(j11, timeUnit);
                timeUnit = timeUnit2;
            }
            p1<? extends I> p1Var = this.mInputFuture;
            if (p1Var != null) {
                long nanoTime = System.nanoTime();
                p1Var.get(j11, timeUnit);
                j11 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j11, timeUnit)) {
                j11 -= Math.max(0L, System.nanoTime() - nanoTime2);
                p1<? extends O> p1Var2 = this.mOutputFuture;
                if (p1Var2 != null) {
                    p1Var2.get(j11, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j11, timeUnit);
    }
}
