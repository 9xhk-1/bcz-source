package androidx.hilt.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import av.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHiltViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,104:1\n86#2,6:105\n91#2:111\n76#3:112\n*S KotlinDebug\n*F\n+ 1 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n*L\n52#1:105,6\n76#1:111\n96#1:112\n*E\n"})
/* loaded from: classes2.dex */
public final class HiltViewModelKt {
    @l
    @Composable
    @v0
    public static final ViewModelProvider.Factory createHiltViewModelFactory(@k ViewModelStoreOwner viewModelStoreOwner, @l Composer composer, int i11) {
        composer.startReplaceableGroup(1770922558);
        ViewModelProvider.Factory create = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? HiltViewModelFactory.create((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory()) : null;
        composer.endReplaceableGroup();
        return create;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM hiltViewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1890788296);
        if ((i12 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i12 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        ViewModelProvider.Factory createHiltViewModelFactory = createHiltViewModelFactory(viewModelStoreOwner2, composer, i11 & 14);
        int i13 = i11 & 126;
        composer.startReplaceableGroup(1729797275);
        CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        g0.y(4, "VM");
        VM vm2 = (VM) ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner2, str2, createHiltViewModelFactory, defaultViewModelCreationExtras, composer, ((i13 << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return vm2;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel, VMF> VM hiltViewModel(ViewModelStoreOwner viewModelStoreOwner, String str, x00.l<? super VMF, ? extends VM> lVar, Composer composer, int i11, int i12) {
        CreationExtras b11;
        composer.startReplaceableGroup(-83599083);
        if ((i12 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i12 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        ViewModelProvider.Factory createHiltViewModelFactory = createHiltViewModelFactory(viewModelStoreOwner2, composer, i11 & 14);
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            b11 = c.b(((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras(), lVar);
        } else {
            b11 = c.b(CreationExtras.Empty.INSTANCE, lVar);
        }
        CreationExtras creationExtras = b11;
        composer.startReplaceableGroup(1729797275);
        g0.y(4, "VM");
        VM vm2 = (VM) ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner2, str2, createHiltViewModelFactory, creationExtras, composer, (((i11 & 126) << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return vm2;
    }
}
