package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"RestrictedApi"})
@u0({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateRegistry {

    @k
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @k
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;

    @k
    private final SafeIterableMap<String, SavedStateProvider> components = new SafeIterableMap<>();
    private boolean isAllowingSavingState = true;
    private boolean isRestored;

    @l
    private Recreator.SavedStateProvider recreatorProvider;

    @l
    private Bundle restoredState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AutoRecreated {
        void onRecreated(@k SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SavedStateProvider {
        @k
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$4(SavedStateRegistry this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        g0.p(this$0, "this$0");
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    @l
    @MainThread
    public final Bundle consumeRestoredStateForKey(@k String key) {
        g0.p(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.restoredState = null;
        return bundle2;
    }

    @l
    public final SavedStateProvider getSavedStateProvider(@k String key) {
        g0.p(key, "key");
        Iterator<Map.Entry<String, SavedStateProvider>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, SavedStateProvider> components = it.next();
            g0.o(components, "components");
            String key2 = components.getKey();
            SavedStateProvider value = components.getValue();
            if (g0.g(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.isAllowingSavingState;
    }

    @MainThread
    public final boolean isRestored() {
        return this.isRestored;
    }

    @MainThread
    public final void performAttach$savedstate_release(@k Lifecycle lifecycle) {
        g0.p(lifecycle, "lifecycle");
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistry.performAttach$lambda$4(SavedStateRegistry.this, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    @MainThread
    public final void performRestore$savedstate_release(@l Bundle bundle) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.restoredState = bundle != null ? bundle.getBundle(SAVED_COMPONENTS_KEY) : null;
        this.isRestored = true;
    }

    @MainThread
    public final void performSave(@k Bundle outBundle) {
        g0.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        SafeIterableMap<String, SavedStateProvider>.IteratorWithAdditions iteratorWithAdditions = this.components.iteratorWithAdditions();
        g0.o(iteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry next = iteratorWithAdditions.next();
            bundle.putBundle((String) next.getKey(), ((SavedStateProvider) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(SAVED_COMPONENTS_KEY, bundle);
    }

    @MainThread
    public final void registerSavedStateProvider(@k String key, @k SavedStateProvider provider) {
        g0.p(key, "key");
        g0.p(provider, "provider");
        if (this.components.putIfAbsent(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @MainThread
    public final void runOnNextRecreation(@k Class<? extends AutoRecreated> clazz) {
        g0.p(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                String name = clazz.getName();
                g0.o(name, "clazz.name");
                savedStateProvider2.add(name);
            }
        } catch (NoSuchMethodException e11) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z11) {
        this.isAllowingSavingState = z11;
    }

    @MainThread
    public final void unregisterSavedStateProvider(@k String key) {
        g0.p(key, "key");
        this.components.remove(key);
    }
}
