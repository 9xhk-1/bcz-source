package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n215#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n147#1:227,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;

    @l
    private Bundle restoredState;

    @k
    private final SavedStateRegistry savedStateRegistry;

    @k
    private final c0 viewModel$delegate;

    public SavedStateHandlesProvider(@k SavedStateRegistry savedStateRegistry, @k final ViewModelStoreOwner viewModelStoreOwner) {
        g0.p(savedStateRegistry, "savedStateRegistry");
        g0.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = e0.c(new x00.a<SavedStateHandlesVM>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @k
            public final SavedStateHandlesVM invoke() {
                return SavedStateHandleSupport.getSavedStateHandlesVM(ViewModelStoreOwner.this);
            }
        });
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    @l
    public final Bundle consumeRestoredStateForKey(@k String key) {
        g0.p(key, "key");
        performRestore();
        Bundle bundle = this.restoredState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        Bundle consumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (consumeRestoredStateForKey != null) {
            bundle.putAll(consumeRestoredStateForKey);
        }
        this.restoredState = bundle;
        this.restored = true;
        getViewModel();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    @k
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle saveState = entry.getValue().savedStateProvider().saveState();
            if (!g0.g(saveState, Bundle.EMPTY)) {
                bundle.putBundle(key, saveState);
            }
        }
        this.restored = false;
        return bundle;
    }
}
