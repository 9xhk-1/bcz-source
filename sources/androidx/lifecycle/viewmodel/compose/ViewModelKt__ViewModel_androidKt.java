package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(298765658);
        if ((i12 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i12 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i12 & 4) != 0 ? null : factory;
        g0.y(4, "VM");
        VM vm2 = (VM) ViewModelKt.viewModel(o0.d(ViewModel.class), viewModelStoreOwner2, str2, factory2, (CreationExtras) null, composer, (i11 << 3) & 8176, 16);
        composer.endReplaceableGroup();
        return vm2;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ ViewModel viewModel(Class modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i11, int i12) {
        g0.p(modelClass, "modelClass");
        composer.startReplaceableGroup(-1252471378);
        if ((i12 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        ViewModelProvider.Factory factory2 = (i12 & 8) != 0 ? null : factory;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1252471378, i11, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:85)");
        }
        ViewModel viewModel = ViewModelKt__ViewModelKt.get$default(viewModelStoreOwner, w00.b.i(modelClass), str, factory2, null, 8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewModel;
    }

    @Composable
    @k
    public static final <VM extends ViewModel> VM viewModel(@k Class<VM> modelClass, @l ViewModelStoreOwner viewModelStoreOwner, @l String str, @l ViewModelProvider.Factory factory, @l CreationExtras creationExtras, @l Composer composer, int i11, int i12) {
        g0.p(modelClass, "modelClass");
        composer.startReplaceableGroup(-1566358618);
        if ((i12 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        if ((i12 & 8) != 0) {
            factory = null;
        }
        if ((i12 & 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1566358618, i11, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:123)");
        }
        VM vm2 = (VM) ViewModelKt.get(viewModelStoreOwner, w00.b.i(modelClass), str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vm2;
    }
}
