package androidx.media3.common.util;

import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BackgroundThreadStateHandler<T> {
    private final HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface StateChangeListener<T> {
        void onStateChanged(T t11, T t12);
    }

    public BackgroundThreadStateHandler(T t11, Looper looper, Looper looper2, Clock clock, StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t11;
        this.backgroundState = t11;
        this.onStateChanged = stateChangeListener;
    }

    public static /* synthetic */ void a(final BackgroundThreadStateHandler backgroundThreadStateHandler, ho.r rVar) {
        final T t11 = (T) rVar.apply(backgroundThreadStateHandler.backgroundState);
        backgroundThreadStateHandler.backgroundState = t11;
        backgroundThreadStateHandler.foregroundHandler.post(new Runnable() { // from class: androidx.media3.common.util.c
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.c(BackgroundThreadStateHandler.this, t11);
            }
        });
    }

    public static /* synthetic */ void b(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj) {
        if (backgroundThreadStateHandler.pendingOperations == 0) {
            backgroundThreadStateHandler.updateStateInForeground(obj);
        }
    }

    public static /* synthetic */ void c(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj) {
        int i11 = backgroundThreadStateHandler.pendingOperations - 1;
        backgroundThreadStateHandler.pendingOperations = i11;
        if (i11 == 0) {
            backgroundThreadStateHandler.updateStateInForeground(obj);
        }
    }

    private void updateStateInForeground(T t11) {
        T t12 = this.foregroundState;
        this.foregroundState = t11;
        if (t12.equals(t11)) {
            return;
        }
        this.onStateChanged.onStateChanged(t12, t11);
    }

    public T get() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        Assertions.checkState(myLooper == this.backgroundHandler.getLooper());
        return this.backgroundState;
    }

    public void runInBackground(Runnable runnable) {
        this.backgroundHandler.post(runnable);
    }

    public void setStateInBackground(final T t11) {
        this.backgroundState = t11;
        this.foregroundHandler.post(new Runnable() { // from class: androidx.media3.common.util.b
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.b(BackgroundThreadStateHandler.this, t11);
            }
        });
    }

    public void updateStateAsync(ho.r<T, T> rVar, final ho.r<T, T> rVar2) {
        Assertions.checkState(Looper.myLooper() == this.foregroundHandler.getLooper());
        this.pendingOperations++;
        this.backgroundHandler.post(new Runnable() { // from class: androidx.media3.common.util.a
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.a(BackgroundThreadStateHandler.this, rVar2);
            }
        });
        updateStateInForeground(rVar.apply(this.foregroundState));
    }
}
