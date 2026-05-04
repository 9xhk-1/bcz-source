package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import h10.d;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n37#2,2:100\n1282#3,2:102\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n59#1:100,2\n85#1:102,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewModelProviders {

    @k
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();

    @k
    private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ViewModelKey implements CreationExtras.Key<String> {

        @k
        public static final ViewModelKey INSTANCE = new ViewModelKey();

        private ViewModelKey() {
        }
    }

    private ViewModelProviders() {
    }

    @k
    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(@k Collection<? extends ViewModelInitializer<?>> initializers) {
        g0.p(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    @k
    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel_release(@k d<VM> modelClass, @k CreationExtras extras, @k ViewModelInitializer<?>... initializers) {
        VM vm2;
        ViewModelInitializer<?> viewModelInitializer;
        l<CreationExtras, ?> initializer$lifecycle_viewmodel_release;
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        g0.p(initializers, "initializers");
        int length = initializers.length;
        int i11 = 0;
        while (true) {
            vm2 = null;
            if (i11 >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i11];
            if (g0.g(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                break;
            }
            i11++;
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel_release = viewModelInitializer.getInitializer$lifecycle_viewmodel_release()) != null) {
            vm2 = (VM) initializer$lifecycle_viewmodel_release.invoke(extras);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + ViewModelProviders_jvmKt.getCanonicalName(modelClass)).toString());
    }

    @k
    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(@k ViewModelStoreOwner owner) {
        g0.p(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    @k
    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel_release(@k ViewModelStoreOwner owner) {
        g0.p(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
    }

    @k
    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel_release(@k d<T> modelClass) {
        g0.p(modelClass, "modelClass");
        String canonicalName = ViewModelProviders_jvmKt.getCanonicalName(modelClass);
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
    }

    @k
    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @k
    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(@k ViewModelInitializer<?>... initializers) {
        g0.p(initializers, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(initializers, initializers.length));
    }
}
