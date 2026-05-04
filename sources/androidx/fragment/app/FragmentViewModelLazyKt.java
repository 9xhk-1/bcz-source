package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt {
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> c0<VM> activityViewModels(Fragment fragment, x00.a<? extends ViewModelProvider.Factory> aVar) {
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    public static /* synthetic */ c0 activityViewModels$default(Fragment fragment, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ c0 createViewModelLazy(final Fragment fragment, h10.d dVar, x00.a aVar, x00.a aVar2) {
        return createViewModelLazy(fragment, dVar, aVar, new x00.a<CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final CreationExtras invoke() {
                return Fragment.this.getDefaultViewModelCreationExtras();
            }
        }, aVar2);
    }

    public static /* synthetic */ c0 createViewModelLazy$default(Fragment fragment, h10.d dVar, x00.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(fragment, dVar, aVar, aVar2);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> c0<VM> viewModels(Fragment fragment, x00.a<? extends ViewModelStoreOwner> aVar, x00.a<? extends ViewModelProvider.Factory> aVar2) {
        c0 b11 = e0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(b11);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(b11);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$4(fragment, b11);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar2);
    }

    public static /* synthetic */ c0 viewModels$default(final Fragment fragment, x00.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new x00.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                @m80.k
                public final Fragment invoke() {
                    return Fragment.this;
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        c0 b11 = e0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(b11);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(b11);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$4(fragment, b11);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m5611viewModels$lambda0(c0<? extends ViewModelStoreOwner> c0Var) {
        return c0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m5612viewModels$lambda1(c0<? extends ViewModelStoreOwner> c0Var) {
        return c0Var.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> c0<VM> activityViewModels(Fragment fragment, x00.a<? extends CreationExtras> aVar, x00.a<? extends ViewModelProvider.Factory> aVar2) {
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    public static /* synthetic */ c0 activityViewModels$default(Fragment fragment, x00.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    @MainThread
    @m80.k
    public static final <VM extends ViewModel> c0<VM> createViewModelLazy(@m80.k final Fragment fragment, @m80.k h10.d<VM> dVar, @m80.k x00.a<? extends ViewModelStore> aVar, @m80.k x00.a<? extends CreationExtras> aVar2, @m80.l x00.a<? extends ViewModelProvider.Factory> aVar3) {
        if (aVar3 == null) {
            aVar3 = new x00.a<ViewModelProvider.Factory>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                @m80.k
                public final ViewModelProvider.Factory invoke() {
                    return Fragment.this.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new ViewModelLazy(dVar, aVar, aVar3, aVar2);
    }

    public static /* synthetic */ c0 createViewModelLazy$default(final Fragment fragment, h10.d dVar, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar2 = new x00.a<CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                @m80.k
                public final CreationExtras invoke() {
                    return Fragment.this.getDefaultViewModelCreationExtras();
                }
            };
        }
        if ((i11 & 8) != 0) {
            aVar3 = null;
        }
        return createViewModelLazy(fragment, dVar, aVar, aVar2, aVar3);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> c0<VM> viewModels(Fragment fragment, x00.a<? extends ViewModelStoreOwner> aVar, x00.a<? extends CreationExtras> aVar2, x00.a<? extends ViewModelProvider.Factory> aVar3) {
        c0 b11 = e0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(aVar));
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(b11);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar2, b11);
        if (aVar3 == null) {
            aVar3 = new FragmentViewModelLazyKt$viewModels$8(fragment, b11);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar3);
    }

    public static /* synthetic */ c0 viewModels$default(final Fragment fragment, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new x00.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$5
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                @m80.k
                public final Fragment invoke() {
                    return Fragment.this;
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        if ((i11 & 4) != 0) {
            aVar3 = null;
        }
        c0 b11 = e0.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(aVar));
        g0.y(4, "VM");
        h10.d d11 = o0.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(b11);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar2, b11);
        if (aVar3 == null) {
            aVar3 = new FragmentViewModelLazyKt$viewModels$8(fragment, b11);
        }
        return createViewModelLazy(fragment, d11, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar3);
    }
}
