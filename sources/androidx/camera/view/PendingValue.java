package androidx.camera.view;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.p1;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class PendingValue<T> {

    @Nullable
    private Pair<CallbackToFutureAdapter.Completer<Void>, T> mCompleterAndValue;

    public static /* synthetic */ Object a(PendingValue pendingValue, Object obj, CallbackToFutureAdapter.Completer completer) {
        Pair<CallbackToFutureAdapter.Completer<Void>, T> pair = pendingValue.mCompleterAndValue;
        if (pair != null) {
            CallbackToFutureAdapter.Completer<Void> completer2 = pair.first;
            Objects.requireNonNull(completer2);
            completer2.setCancelled();
        }
        pendingValue.mCompleterAndValue = new Pair<>(completer, obj);
        return "PendingValue " + obj;
    }

    @MainThread
    public void propagateIfHasValue(Function<T, p1<Void>> function) {
        Threads.checkMainThread();
        Pair<CallbackToFutureAdapter.Completer<Void>, T> pair = this.mCompleterAndValue;
        if (pair != null) {
            p1<Void> apply = function.apply(pair.second);
            CallbackToFutureAdapter.Completer<Void> completer = this.mCompleterAndValue.first;
            Objects.requireNonNull(completer);
            Futures.propagate(apply, completer);
            this.mCompleterAndValue = null;
        }
    }

    @MainThread
    public p1<Void> setValue(@NonNull final T t11) {
        Threads.checkMainThread();
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.k
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return PendingValue.a(PendingValue.this, t11, completer);
            }
        });
    }
}
