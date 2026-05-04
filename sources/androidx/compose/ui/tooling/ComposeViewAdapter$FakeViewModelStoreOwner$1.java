package androidx.compose.ui.tooling;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$FakeViewModelStoreOwner$1 implements ViewModelStoreOwner {
    private final ViewModelStore viewModelStore;
    private final ViewModelStore vmStore;

    public ComposeViewAdapter$FakeViewModelStoreOwner$1() {
        ViewModelStore viewModelStore = new ViewModelStore();
        this.vmStore = viewModelStore;
        this.viewModelStore = viewModelStore;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.viewModelStore;
    }
}
