package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class ComputableLiveData<T> {

    @k
    private final LiveData<T> _liveData;

    @k
    private final AtomicBoolean computing;

    @k
    private final Executor executor;

    @k
    private final AtomicBoolean invalid;

    @w00.g
    @k
    public final Runnable invalidationRunnable;

    @k
    private final LiveData<T> liveData;

    @w00.g
    @k
    public final Runnable refreshRunnable;

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData this$0) {
        g0.p(this$0, "this$0");
        boolean hasActiveObservers = this$0.getLiveData().hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && hasActiveObservers) {
            this$0.executor.execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData this$0) {
        g0.p(this$0, "this$0");
        do {
            boolean z11 = false;
            if (this$0.computing.compareAndSet(false, true)) {
                Object obj = null;
                boolean z12 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        obj = this$0.compute();
                        z12 = true;
                    } catch (Throwable th2) {
                        this$0.computing.set(false);
                        throw th2;
                    }
                }
                if (z12) {
                    this$0.getLiveData().postValue(obj);
                }
                this$0.computing.set(false);
                z11 = z12;
            }
            if (!z11) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @WorkerThread
    public abstract T compute();

    @k
    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    @k
    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    @k
    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    @k
    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    @w00.k
    public ComputableLiveData(@k Executor executor) {
        g0.p(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.a
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(ComputableLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.b
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(ComputableLiveData.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.v r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.g0.o(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.v):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }
}
