package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SavedStateRegistryController {

    @k
    public static final Companion Companion = new Companion(null);
    private boolean attached;

    @k
    private final SavedStateRegistryOwner owner;

    @k
    private final SavedStateRegistry savedStateRegistry;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final SavedStateRegistryController create(@k SavedStateRegistryOwner owner) {
            g0.p(owner, "owner");
            return new SavedStateRegistryController(owner, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner, v vVar) {
        this(savedStateRegistryOwner);
    }

    @o
    @k
    public static final SavedStateRegistryController create(@k SavedStateRegistryOwner savedStateRegistryOwner) {
        return Companion.create(savedStateRegistryOwner);
    }

    @k
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    public final void performAttach() {
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new Recreator(this.owner));
        this.savedStateRegistry.performAttach$savedstate_release(lifecycle);
        this.attached = true;
    }

    @MainThread
    public final void performRestore(@l Bundle bundle) {
        if (!this.attached) {
            performAttach();
        }
        Lifecycle lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.savedStateRegistry.performRestore$savedstate_release(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
    }

    @MainThread
    public final void performSave(@k Bundle outBundle) {
        g0.p(outBundle, "outBundle");
        this.savedStateRegistry.performSave(outBundle);
    }

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.owner = savedStateRegistryOwner;
        this.savedStateRegistry = new SavedStateRegistry();
    }
}
