package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.DeprecationLevel;
import m80.k;
import m80.l;
import yz.n;

/* loaded from: classes2.dex */
public final class ViewModelKt {
    @k
    public static final <VM extends ViewModel> VM get(@k ViewModelStoreOwner viewModelStoreOwner, @k h10.d<VM> dVar, @l String str, @l ViewModelProvider.Factory factory, @k CreationExtras creationExtras) {
        return (VM) ViewModelKt__ViewModelKt.get(viewModelStoreOwner, dVar, str, factory, creationExtras);
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i11, int i12) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(viewModelStoreOwner, str, factory, composer, i11, i12);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i11, int i12) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, factory, creationExtras, composer, i11, i12);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, x00.l<? super CreationExtras, ? extends VM> lVar, Composer composer, int i11, int i12) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, lVar, composer, i11, i12);
    }

    @Composable
    @k
    public static final <VM extends ViewModel> VM viewModel(@k h10.d<VM> dVar, @l ViewModelStoreOwner viewModelStoreOwner, @l String str, @l ViewModelProvider.Factory factory, @l CreationExtras creationExtras, @l Composer composer, int i11, int i12) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(dVar, viewModelStoreOwner, str, factory, creationExtras, composer, i11, i12);
    }

    @Composable
    @k
    public static final <VM extends ViewModel> VM viewModel(@k Class<VM> cls, @l ViewModelStoreOwner viewModelStoreOwner, @l String str, @l ViewModelProvider.Factory factory, @l CreationExtras creationExtras, @l Composer composer, int i11, int i12) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i11, i12);
    }
}
