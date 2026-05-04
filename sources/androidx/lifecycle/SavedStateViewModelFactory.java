package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @l
    private Application application;

    @l
    private Bundle defaultArgs;

    @k
    private final ViewModelProvider.Factory factory;

    @l
    private Lifecycle lifecycle;

    @l
    private SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <T extends ViewModel> T create(@k Class<T> modelClass, @k CreationExtras extras) {
        List list;
        Constructor findMatchingConstructor;
        List list2;
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null || extras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.lifecycle != null) {
                return (T) create(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list);
        } else {
            list2 = SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE;
            findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list2);
        }
        return findMatchingConstructor == null ? (T) this.factory.create(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(extras)) : (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(extras));
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@k ViewModel viewModel) {
        g0.p(viewModel, "viewModel");
        if (this.lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            g0.m(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            g0.m(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(@l Application application, @k SavedStateRegistryOwner owner) {
        this(application, owner, null);
        g0.p(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@l Application application, @k SavedStateRegistryOwner owner, @l Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        g0.p(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @k
    public final <T extends ViewModel> T create(@k String key, @k Class<T> modelClass) {
        List list;
        Constructor findMatchingConstructor;
        T t11;
        Application application;
        List list2;
        g0.p(key, "key");
        g0.p(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            if (!isAssignableFrom || this.application == null) {
                list = SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE;
                findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list);
            } else {
                list2 = SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE;
                findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, list2);
            }
            if (findMatchingConstructor == null) {
                return this.application != null ? (T) this.factory.create(modelClass) : (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(modelClass);
            }
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            g0.m(savedStateRegistry);
            SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, key, this.defaultArgs);
            if (isAssignableFrom && (application = this.application) != null) {
                g0.m(application);
                t11 = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, application, create.getHandle());
            } else {
                t11 = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, findMatchingConstructor, create.getHandle());
            }
            t11.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, create);
            return t11;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <T extends ViewModel> T create(@k Class<T> modelClass) {
        g0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
