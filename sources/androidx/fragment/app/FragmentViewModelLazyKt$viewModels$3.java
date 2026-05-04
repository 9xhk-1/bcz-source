package androidx.fragment.app;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt$viewModels$3 extends Lambda implements x00.a<CreationExtras> {
    final /* synthetic */ c0<ViewModelStoreOwner> $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$3(c0<? extends ViewModelStoreOwner> c0Var) {
        super(0);
        this.$owner$delegate = c0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x00.a
    @m80.k
    public final CreationExtras invoke() {
        ViewModelStoreOwner m5611viewModels$lambda0;
        CreationExtras defaultViewModelCreationExtras;
        m5611viewModels$lambda0 = FragmentViewModelLazyKt.m5611viewModels$lambda0(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5611viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5611viewModels$lambda0 : null;
        return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
    }
}
