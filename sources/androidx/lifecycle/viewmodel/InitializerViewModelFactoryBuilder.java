package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders_jvmKt;
import h10.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ViewModelFactoryDsl
/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryBuilder {

    @k
    private final Map<d<?>, ViewModelInitializer<?>> initializers = new LinkedHashMap();

    public final <T extends ViewModel> void addInitializer(@k d<T> clazz, @k l<? super CreationExtras, ? extends T> initializer) {
        g0.p(clazz, "clazz");
        g0.p(initializer, "initializer");
        if (!this.initializers.containsKey(clazz)) {
            this.initializers.put(clazz, new ViewModelInitializer<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + ViewModelProviders_jvmKt.getCanonicalName(clazz) + '.').toString());
    }

    @k
    public final ViewModelProvider.Factory build() {
        return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release(this.initializers.values());
    }
}
