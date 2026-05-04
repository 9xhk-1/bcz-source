package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import h10.d;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ViewModelProviderImpl_androidKt {
    @k
    public static final <VM extends ViewModel> VM createViewModel(@k ViewModelProvider.Factory factory, @k d<VM> modelClass, @k CreationExtras extras) {
        g0.p(factory, "factory");
        g0.p(modelClass, "modelClass");
        g0.p(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(b.d(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(b.d(modelClass), extras);
        }
    }
}
