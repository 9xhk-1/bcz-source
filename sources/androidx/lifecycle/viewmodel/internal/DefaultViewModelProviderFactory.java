package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import h10.d;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {

    @k
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <T extends ViewModel> T create(@k d<T> modelClass, @k CreationExtras extras) {
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(b.d(modelClass));
    }
}
