package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @l
    private Bundle defaultArgs;

    @l
    private Lifecycle lifecycle;

    @l
    private SavedStateRegistry savedStateRegistry;

    public AbstractSavedStateViewModelFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <T extends ViewModel> T create(@k Class<T> modelClass, @k CreationExtras extras) {
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) create(str, modelClass) : (T) create(str, modelClass, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @k
    public abstract <T extends ViewModel> T create(@k String str, @k Class<T> cls, @k SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@k ViewModel viewModel) {
        g0.p(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            g0.m(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            g0.m(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(@k SavedStateRegistryOwner owner, @l Bundle bundle) {
        g0.p(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        g0.m(savedStateRegistry);
        Lifecycle lifecycle = this.lifecycle;
        g0.m(lifecycle);
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.defaultArgs);
        T t11 = (T) create(str, cls, create.getHandle());
        t11.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, create);
        return t11;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <T extends ViewModel> T create(@k Class<T> modelClass) {
        g0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
