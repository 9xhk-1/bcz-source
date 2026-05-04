package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import java.io.Closeable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandleController implements LifecycleEventObserver, Closeable {

    @k
    private final SavedStateHandle handle;
    private boolean isAttached;

    @k
    private final String key;

    public SavedStateHandleController(@k String key, @k SavedStateHandle handle) {
        g0.p(key, "key");
        g0.p(handle, "handle");
        this.key = key;
        this.handle = handle;
    }

    public final void attachToLifecycle(@k SavedStateRegistry registry, @k Lifecycle lifecycle) {
        g0.p(registry, "registry");
        g0.p(lifecycle, "lifecycle");
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.addObserver(this);
        registry.registerSavedStateProvider(this.key, this.handle.savedStateProvider());
    }

    @k
    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@k LifecycleOwner source, @k Lifecycle.Event event) {
        g0.p(source, "source");
        g0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycle().removeObserver(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
