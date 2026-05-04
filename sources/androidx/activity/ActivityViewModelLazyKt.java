package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> c0<VM> viewModels(ComponentActivity componentActivity, x00.a<? extends ViewModelProvider.Factory> aVar) {
        g0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        g0.y(4, "VM");
        return new ViewModelLazy(o0.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ c0 viewModels$default(ComponentActivity componentActivity, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        g0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        g0.y(4, "VM");
        return new ViewModelLazy(o0.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> c0<VM> viewModels(ComponentActivity componentActivity, x00.a<? extends CreationExtras> aVar, x00.a<? extends ViewModelProvider.Factory> aVar2) {
        g0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        g0.y(4, "VM");
        return new ViewModelLazy(o0.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }

    public static /* synthetic */ c0 viewModels$default(ComponentActivity componentActivity, x00.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        g0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        g0.y(4, "VM");
        return new ViewModelLazy(o0.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }
}
