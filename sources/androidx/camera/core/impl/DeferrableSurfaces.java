package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static /* synthetic */ Object a(final p1 p1Var, Executor executor, final boolean z11, Collection collection, final CallbackToFutureAdapter.Completer completer) {
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.m
            @Override // java.lang.Runnable
            public final void run() {
                p1.this.cancel(true);
            }
        }, executor);
        Futures.addCallback(p1Var, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof TimeoutException) {
                    completer.setException(th2);
                } else {
                    completer.set(Collections.EMPTY_LIST);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable List<Surface> list) {
                Preconditions.checkNotNull(list);
                ArrayList arrayList = new ArrayList(list);
                if (z11) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                completer.set(arrayList);
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    public static void decrementAll(@NonNull List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i11 = 0;
        do {
            try {
                list.get(i11).incrementUseCount();
                i11++;
            } catch (DeferrableSurface.SurfaceClosedException e11) {
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    list.get(i12).decrementUseCount();
                }
                throw e11;
            }
        } while (i11 < list.size());
    }

    @NonNull
    public static p1<List<Surface>> surfaceListWithTimeout(@NonNull final Collection<DeferrableSurface> collection, final boolean z11, long j11, @NonNull final Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final p1 makeTimeoutFuture = Futures.makeTimeoutFuture(j11, scheduledExecutorService, Futures.successfulAsList(arrayList));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.n
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.a(p1.this, executor, z11, collection, completer);
            }
        });
    }

    public static boolean tryIncrementAll(@NonNull List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
