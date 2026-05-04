package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class JvmViewModelProviders {

    @k
    public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    @k
    public final <T extends ViewModel> T createViewModel(@k Class<T> modelClass) {
        g0.p(modelClass, "modelClass");
        try {
            T newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            g0.o(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return newInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
        }
    }
}
