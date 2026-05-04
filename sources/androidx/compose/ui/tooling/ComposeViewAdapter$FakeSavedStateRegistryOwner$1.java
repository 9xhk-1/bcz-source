package androidx.compose.ui.tooling;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$FakeSavedStateRegistryOwner$1 implements SavedStateRegistryOwner {
    private final SavedStateRegistryController controller;
    private final LifecycleRegistry lifecycleRegistry;

    public ComposeViewAdapter$FakeSavedStateRegistryOwner$1() {
        LifecycleRegistry createUnsafe = LifecycleRegistry.Companion.createUnsafe(this);
        this.lifecycleRegistry = createUnsafe;
        SavedStateRegistryController create = SavedStateRegistryController.Companion.create(this);
        create.performRestore(new Bundle());
        this.controller = create;
        createUnsafe.setCurrentState(Lifecycle.State.RESUMED);
    }

    public final LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.controller.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public LifecycleRegistry getLifecycle() {
        return this.lifecycleRegistry;
    }
}
