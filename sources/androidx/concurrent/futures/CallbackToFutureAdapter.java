package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.p1;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CallbackToFutureAdapter {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Completer<T> {
        private boolean attemptedSetting;
        private ResolvableFuture<Void> cancellationFuture = ResolvableFuture.create();
        SafeFuture<T> future;
        Object tag;

        private void setCompletedNormally() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }

        public void addCancellationListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            ResolvableFuture<Void> resolvableFuture = this.cancellationFuture;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        public void finalize() {
            ResolvableFuture<Void> resolvableFuture;
            SafeFuture<T> safeFuture = this.future;
            if (safeFuture != null && !safeFuture.isDone()) {
                safeFuture.setException(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.tag));
            }
            if (this.attemptedSetting || (resolvableFuture = this.cancellationFuture) == null) {
                return;
            }
            resolvableFuture.set(null);
        }

        public void fireCancellationListeners() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture.set(null);
        }

        public boolean set(T t11) {
            this.attemptedSetting = true;
            SafeFuture<T> safeFuture = this.future;
            boolean z11 = safeFuture != null && safeFuture.set(t11);
            if (z11) {
                setCompletedNormally();
            }
            return z11;
        }

        public boolean setCancelled() {
            this.attemptedSetting = true;
            SafeFuture<T> safeFuture = this.future;
            boolean z11 = safeFuture != null && safeFuture.cancelWithoutNotifyingCompleter(true);
            if (z11) {
                setCompletedNormally();
            }
            return z11;
        }

        public boolean setException(@NonNull Throwable th2) {
            this.attemptedSetting = true;
            SafeFuture<T> safeFuture = this.future;
            boolean z11 = safeFuture != null && safeFuture.setException(th2);
            if (z11) {
                setCompletedNormally();
            }
            return z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Resolver<T> {
        @Nullable
        Object attachCompleter(@NonNull Completer<T> completer) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SafeFuture<T> implements p1<T> {
        final WeakReference<Completer<T>> completerWeakReference;
        private final AbstractResolvableFuture<T> delegate = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                Completer<T> completer = SafeFuture.this.completerWeakReference.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.tag + "]";
            }
        };

        public SafeFuture(Completer<T> completer) {
            this.completerWeakReference = new WeakReference<>(completer);
        }

        @Override // com.google.common.util.concurrent.p1
        public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.delegate.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            Completer<T> completer = this.completerWeakReference.get();
            boolean cancel = this.delegate.cancel(z11);
            if (cancel && completer != null) {
                completer.fireCancellationListeners();
            }
            return cancel;
        }

        public boolean cancelWithoutNotifyingCompleter(boolean z11) {
            return this.delegate.cancel(z11);
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        public boolean set(T t11) {
            return this.delegate.set(t11);
        }

        public boolean setException(Throwable th2) {
            return this.delegate.setException(th2);
        }

        public String toString() {
            return this.delegate.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.delegate.get(j11, timeUnit);
        }
    }

    private CallbackToFutureAdapter() {
    }

    @NonNull
    public static <T> p1<T> getFuture(@NonNull Resolver<T> resolver) {
        Completer<T> completer = new Completer<>();
        SafeFuture<T> safeFuture = new SafeFuture<>(completer);
        completer.future = safeFuture;
        completer.tag = resolver.getClass();
        try {
            Object attachCompleter = resolver.attachCompleter(completer);
            if (attachCompleter == null) {
                return safeFuture;
            }
            completer.tag = attachCompleter;
            return safeFuture;
        } catch (Exception e11) {
            safeFuture.setException(e11);
            return safeFuture;
        }
    }
}
