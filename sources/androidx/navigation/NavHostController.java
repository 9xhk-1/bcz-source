package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(@k Context context) {
        super(context);
        g0.p(context, "context");
    }

    @Override // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z11) {
        super.enableOnBackPressed(z11);
    }

    @Override // androidx.navigation.NavController
    public final void setLifecycleOwner(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        super.setLifecycleOwner(owner);
    }

    @Override // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(@k OnBackPressedDispatcher dispatcher) {
        g0.p(dispatcher, "dispatcher");
        super.setOnBackPressedDispatcher(dispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void setViewModelStore(@k ViewModelStore viewModelStore) {
        g0.p(viewModelStore, "viewModelStore");
        super.setViewModelStore(viewModelStore);
    }
}
