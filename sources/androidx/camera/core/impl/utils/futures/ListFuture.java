package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ListFuture<V> implements p1<List<V>> {
    private final boolean mAllMustSucceed;

    @Nullable
    List<? extends p1<? extends V>> mFutures;

    @NonNull
    private final AtomicInteger mRemaining;

    @NonNull
    private final p1<List<V>> mResult = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<List<V>> completer) {
            Preconditions.checkState(ListFuture.this.mResultNotifier == null, "The result can only set once!");
            ListFuture.this.mResultNotifier = completer;
            return "ListFuture[" + this + "]";
        }
    });
    CallbackToFutureAdapter.Completer<List<V>> mResultNotifier;

    @Nullable
    List<V> mValues;

    public ListFuture(@NonNull List<? extends p1<? extends V>> list, boolean z11, @NonNull Executor executor) {
        this.mFutures = (List) Preconditions.checkNotNull(list);
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z11;
        this.mRemaining = new AtomicInteger(list.size());
        init(executor);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends p1<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (p1<? extends V> p1Var : list) {
            while (!p1Var.isDone()) {
                try {
                    p1Var.get();
                } catch (Error e11) {
                    throw e11;
                } catch (InterruptedException e12) {
                    throw e12;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(@NonNull Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new ArrayList(this.mValues));
            return;
        }
        for (int i11 = 0; i11 < this.mFutures.size(); i11++) {
            this.mValues.add(null);
        }
        List<? extends p1<? extends V>> list = this.mFutures;
        for (final int i12 = 0; i12 < list.size(); i12++) {
            final p1<? extends V> p1Var = list.get(i12);
            p1Var.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i12, p1Var);
                }
            }, executor);
        }
    }

    @Override // com.google.common.util.concurrent.p1
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        List<? extends p1<? extends V>> list = this.mFutures;
        if (list != null) {
            Iterator<? extends p1<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z11);
            }
        }
        return this.mResult.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    public void setOneValue(int i11, @NonNull Future<? extends V> future) {
        CallbackToFutureAdapter.Completer<List<V>> completer;
        ArrayList arrayList;
        List<V> list = this.mValues;
        if (isDone() || list == null) {
            Preconditions.checkState(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i11, Futures.getUninterruptibly(future));
                            int decrementAndGet = this.mRemaining.decrementAndGet();
                            Preconditions.checkState(decrementAndGet >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet == 0) {
                                List<V> list2 = this.mValues;
                                if (list2 != null) {
                                    this.mResultNotifier.set(new ArrayList(list2));
                                } else {
                                    Preconditions.checkState(isDone());
                                }
                            }
                        } catch (ExecutionException e11) {
                            if (this.mAllMustSucceed) {
                                this.mResultNotifier.setException(e11.getCause());
                            }
                            int decrementAndGet2 = this.mRemaining.decrementAndGet();
                            Preconditions.checkState(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (decrementAndGet2 == 0) {
                                List<V> list3 = this.mValues;
                                if (list3 != null) {
                                    completer = this.mResultNotifier;
                                    arrayList = new ArrayList(list3);
                                    completer.set(arrayList);
                                    return;
                                }
                                Preconditions.checkState(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.mAllMustSucceed) {
                            cancel(false);
                        }
                        int decrementAndGet3 = this.mRemaining.decrementAndGet();
                        Preconditions.checkState(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet3 == 0) {
                            List<V> list4 = this.mValues;
                            if (list4 != null) {
                                completer = this.mResultNotifier;
                                arrayList = new ArrayList(list4);
                                completer.set(arrayList);
                                return;
                            }
                            Preconditions.checkState(isDone());
                        }
                    }
                } catch (Error e12) {
                    this.mResultNotifier.setException(e12);
                    int decrementAndGet4 = this.mRemaining.decrementAndGet();
                    Preconditions.checkState(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet4 == 0) {
                        List<V> list5 = this.mValues;
                        if (list5 != null) {
                            completer = this.mResultNotifier;
                            arrayList = new ArrayList(list5);
                            completer.set(arrayList);
                            return;
                        }
                        Preconditions.checkState(isDone());
                    }
                }
            } catch (RuntimeException e13) {
                if (this.mAllMustSucceed) {
                    this.mResultNotifier.setException(e13);
                }
                int decrementAndGet5 = this.mRemaining.decrementAndGet();
                Preconditions.checkState(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 == 0) {
                    List<V> list6 = this.mValues;
                    if (list6 != null) {
                        completer = this.mResultNotifier;
                        arrayList = new ArrayList(list6);
                        completer.set(arrayList);
                        return;
                    }
                    Preconditions.checkState(isDone());
                }
            }
        } catch (Throwable th2) {
            int decrementAndGet6 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.set(new ArrayList(list7));
                } else {
                    Preconditions.checkState(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public List<V> get() throws InterruptedException, ExecutionException {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mResult.get(j11, timeUnit);
    }
}
