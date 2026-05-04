package androidx.lifecycle;

import a00.a0;
import a00.g0;
import a00.h0;
import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class SavedStateViewModelFactoryKt {

    @k
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = h0.Q(Application.class, SavedStateHandle.class);

    @k
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = g0.l(SavedStateHandle.class);

    @l
    public static final <T> Constructor<T> findMatchingConstructor(@k Class<T> modelClass, @k List<? extends Class<?>> signature) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        kotlin.jvm.internal.g0.p(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.g0.o(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.g0.o(parameterTypes, "constructor.parameterTypes");
            List dz2 = a0.dz(parameterTypes);
            if (kotlin.jvm.internal.g0.g(signature, dz2)) {
                kotlin.jvm.internal.g0.n(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == dz2.size() && dz2.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(@k Class<T> modelClass, @k Constructor<T> constructor, @k Object... params) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Failed to access " + modelClass, e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e13.getCause());
        }
    }
}
