package androidx.fragment.app;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt$viewModels$4 extends Lambda implements x00.a<ViewModelProvider.Factory> {
    final /* synthetic */ c0<ViewModelStoreOwner> $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$4(Fragment fragment, c0<? extends ViewModelStoreOwner> c0Var) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = c0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x00.a
    @m80.k
    public final ViewModelProvider.Factory invoke() {
        ViewModelStoreOwner m5611viewModels$lambda0;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        m5611viewModels$lambda0 = FragmentViewModelLazyKt.m5611viewModels$lambda0(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5611viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5611viewModels$lambda0 : null;
        return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }
}
