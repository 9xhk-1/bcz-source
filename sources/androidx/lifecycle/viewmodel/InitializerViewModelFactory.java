package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import h10.d;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    @k
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(@k ViewModelInitializer<?>... initializers) {
        g0.p(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <VM extends ViewModel> VM create(@k Class<VM> modelClass, @k CreationExtras extras) {
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        d<VM> i11 = b.i(modelClass);
        ViewModelInitializer<?>[] viewModelInitializerArr = this.initializers;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel_release(i11, extras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
