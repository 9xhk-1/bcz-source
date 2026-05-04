package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,165:1\n35#2:166\n77#2,2:167\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n*L\n134#1:166\n134#1:167,2\n*E\n"})
/* loaded from: classes2.dex */
final /* synthetic */ class ViewModelKt__ViewModelKt {
    @k
    public static final <VM extends ViewModel> VM get(@k ViewModelStoreOwner viewModelStoreOwner, @k h10.d<VM> modelClass, @l String str, @l ViewModelProvider.Factory factory, @k CreationExtras extras) {
        g0.p(viewModelStoreOwner, "<this>");
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        ViewModelProvider create = factory != null ? ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), factory, extras) : viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), extras) : ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner, (ViewModelProvider.Factory) null, (CreationExtras) null, 6, (Object) null);
        return str != null ? (VM) create.get(str, modelClass) : (VM) create.get(modelClass);
    }

    public static /* synthetic */ ViewModel get$default(ViewModelStoreOwner viewModelStoreOwner, h10.d dVar, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            factory = null;
        }
        if ((i11 & 8) != 0) {
            creationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
        return ViewModelKt.get(viewModelStoreOwner, dVar, str, factory, creationExtras);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1729797275);
        if ((i12 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i12 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i12 & 4) != 0 ? null : factory;
        if ((i12 & 8) != 0) {
            creationExtras = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
        g0.y(4, "VM");
        VM vm2 = (VM) ViewModelKt.viewModel(o0.d(ViewModel.class), viewModelStoreOwner2, str2, factory2, creationExtras, composer, (i11 << 3) & 65520, 0);
        composer.endReplaceableGroup();
        return vm2;
    }

    @Composable
    @k
    public static final <VM extends ViewModel> VM viewModel(@k h10.d<VM> modelClass, @l ViewModelStoreOwner viewModelStoreOwner, @l String str, @l ViewModelProvider.Factory factory, @l CreationExtras creationExtras, @l Composer composer, int i11, int i12) {
        g0.p(modelClass, "modelClass");
        composer.startReplaceableGroup(1673618944);
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
            ComposerKt.traceEventStart(1673618944, i11, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        VM vm2 = (VM) ViewModelKt.get(viewModelStoreOwner, modelClass, str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vm2;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, x00.l<? super CreationExtras, ? extends VM> initializer, Composer composer, int i11, int i12) {
        CreationExtras creationExtras;
        g0.p(initializer, "initializer");
        composer.startReplaceableGroup(419377738);
        if ((i12 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i12 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        g0.y(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(o0.d(ViewModel.class), initializer);
        g2 g2Var = g2.f100423a;
        ViewModelProvider.Factory build = initializerViewModelFactoryBuilder.build();
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        VM vm2 = (VM) ViewModelKt.viewModel(d11, viewModelStoreOwner2, str2, build, creationExtras, composer, (i11 << 3) & 1008, 0);
        composer.endReplaceableGroup();
        return vm2;
    }
}
