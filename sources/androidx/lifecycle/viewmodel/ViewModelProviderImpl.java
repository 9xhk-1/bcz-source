package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import h10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewModelProviderImpl {

    @k
    private final CreationExtras extras;

    @k
    private final ViewModelProvider.Factory factory;

    @k
    private final ViewModelStore store;

    public ViewModelProviderImpl(@k ViewModelStore store, @k ViewModelProvider.Factory factory, @k CreationExtras extras) {
        g0.p(store, "store");
        g0.p(factory, "factory");
        g0.p(extras, "extras");
        this.store = store;
        this.factory = factory;
        this.extras = extras;
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, d dVar, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(dVar);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(dVar, str);
    }

    @k
    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(@k d<T> modelClass, @k String key) {
        g0.p(modelClass, "modelClass");
        g0.p(key, "key");
        T t11 = (T) this.store.get(key);
        if (!modelClass.B(t11)) {
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.extras);
            mutableCreationExtras.set(ViewModelProviders.ViewModelKey.INSTANCE, key);
            T t12 = (T) ViewModelProviderImpl_androidKt.createViewModel(this.factory, modelClass, mutableCreationExtras);
            this.store.put(key, t12);
            return t12;
        }
        Object obj = this.factory;
        if (obj instanceof ViewModelProvider.OnRequeryFactory) {
            g0.m(t11);
            ((ViewModelProvider.OnRequeryFactory) obj).onRequery(t11);
        }
        g0.n(t11, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return t11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProviderImpl(@k ViewModelStoreOwner owner, @k ViewModelProvider.Factory factory, @k CreationExtras extras) {
        this(owner.getViewModelStore(), factory, extras);
        g0.p(owner, "owner");
        g0.p(factory, "factory");
        g0.p(extras, "extras");
    }
}
