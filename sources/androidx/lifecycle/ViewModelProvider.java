package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ViewModelProvider {

    @k
    public static final Companion Companion = new Companion(null);

    @w00.g
    @k
    public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProviders.ViewModelKey.INSTANCE;

    @k
    private final ViewModelProviderImpl impl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                factory = ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            if ((i11 & 4) != 0) {
                creationExtras = ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        @o
        @k
        public final ViewModelProvider create(@k ViewModelStoreOwner owner, @k Factory factory, @k CreationExtras extras) {
            g0.p(owner, "owner");
            g0.p(factory, "factory");
            g0.p(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }

        private Companion() {
        }

        @o
        @k
        public final ViewModelProvider create(@k ViewModelStore store, @k Factory factory, @k CreationExtras extras) {
            g0.p(store, "store");
            g0.p(factory, "factory");
            g0.p(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                factory = DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((i11 & 4) != 0) {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {

        @k
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @o
            @k
            public final Factory from(@k ViewModelInitializer<?>... initializers) {
                g0.p(initializers, "initializers");
                return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release((ViewModelInitializer<?>[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @o
        @k
        static Factory from(@k ViewModelInitializer<?>... viewModelInitializerArr) {
            return Companion.from(viewModelInitializerArr);
        }

        @k
        default <T extends ViewModel> T create(@k Class<T> modelClass) {
            g0.p(modelClass, "modelClass");
            return (T) ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
        }

        @k
        default <T extends ViewModel> T create(@k Class<T> modelClass, @k CreationExtras extras) {
            g0.p(modelClass, "modelClass");
            g0.p(extras, "extras");
            return (T) create(modelClass);
        }

        @k
        default <T extends ViewModel> T create(@k h10.d<T> modelClass, @k CreationExtras extras) {
            g0.p(modelClass, "modelClass");
            g0.p(extras, "extras");
            return (T) create(w00.b.d(modelClass), extras);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NewInstanceFactory implements Factory {

        @k
        public static final Companion Companion = new Companion(null);

        @w00.g
        @k
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProviders.ViewModelKey.INSTANCE;

        @l
        private static NewInstanceFactory _instance;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            @k
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory._instance == null) {
                    NewInstanceFactory._instance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory._instance;
                g0.m(newInstanceFactory);
                return newInstanceFactory;
            }

            private Companion() {
            }

            @o
            public static /* synthetic */ void getInstance$annotations() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @k
        public <T extends ViewModel> T create(@k Class<T> modelClass) {
            g0.p(modelClass, "modelClass");
            return (T) JvmViewModelProviders.INSTANCE.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @k
        public <T extends ViewModel> T create(@k Class<T> modelClass, @k CreationExtras extras) {
            g0.p(modelClass, "modelClass");
            g0.p(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @k
        public <T extends ViewModel> T create(@k h10.d<T> modelClass, @k CreationExtras extras) {
            g0.p(modelClass, "modelClass");
            g0.p(extras, "extras");
            return (T) create(w00.b.d(modelClass), extras);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OnRequeryFactory {
        public void onRequery(@k ViewModel viewModel) {
            g0.p(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ViewModelProvider(@k ViewModelStore store, @k Factory factory) {
        this(store, factory, null, 4, null);
        g0.p(store, "store");
        g0.p(factory, "factory");
    }

    @o
    @k
    public static final ViewModelProvider create(@k ViewModelStore viewModelStore, @k Factory factory, @k CreationExtras creationExtras) {
        return Companion.create(viewModelStore, factory, creationExtras);
    }

    @MainThread
    @k
    public final <T extends ViewModel> T get(@k h10.d<T> modelClass) {
        g0.p(modelClass, "modelClass");
        return (T) ViewModelProviderImpl.getViewModel$lifecycle_viewmodel_release$default(this.impl, modelClass, null, 2, null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        @l
        private static AndroidViewModelFactory _instance;

        @l
        private final Application application;

        @k
        public static final Companion Companion = new Companion(null);

        @w00.g
        @k
        public static final CreationExtras.Key<Application> APPLICATION_KEY = new CreationExtras.Key<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1
        };

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @o
            @k
            public final AndroidViewModelFactory getInstance(@k Application application) {
                g0.p(application, "application");
                if (AndroidViewModelFactory._instance == null) {
                    AndroidViewModelFactory._instance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory._instance;
                g0.m(androidViewModelFactory);
                return androidViewModelFactory;
            }

            private Companion() {
            }
        }

        private AndroidViewModelFactory(Application application, int i11) {
            this.application = application;
        }

        @o
        @k
        public static final AndroidViewModelFactory getInstance(@k Application application) {
            return Companion.getInstance(application);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @k
        public <T extends ViewModel> T create(@k Class<T> modelClass, @k CreationExtras extras) {
            g0.p(modelClass, "modelClass");
            g0.p(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(@k Application application) {
            this(application, 0);
            g0.p(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @k
        public <T extends ViewModel> T create(@k Class<T> modelClass) {
            g0.p(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    g0.o(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (NoSuchMethodException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                } catch (InvocationTargetException e14) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e14);
                }
            }
            return (T) super.create(cls);
        }
    }

    private ViewModelProvider(ViewModelProviderImpl viewModelProviderImpl) {
        this.impl = viewModelProviderImpl;
    }

    @o
    @k
    public static final ViewModelProvider create(@k ViewModelStoreOwner viewModelStoreOwner, @k Factory factory, @k CreationExtras creationExtras) {
        return Companion.create(viewModelStoreOwner, factory, creationExtras);
    }

    @MainThread
    @k
    public <T extends ViewModel> T get(@k Class<T> modelClass) {
        g0.p(modelClass, "modelClass");
        return (T) get(w00.b.i(modelClass));
    }

    @MainThread
    @k
    public final <T extends ViewModel> T get(@k String key, @k h10.d<T> modelClass) {
        g0.p(key, "key");
        g0.p(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(modelClass, key);
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i11, v vVar) {
        this(viewModelStore, factory, (i11 & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    @MainThread
    @k
    public <T extends ViewModel> T get(@k String key, @k Class<T> modelClass) {
        g0.p(key, "key");
        g0.p(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(w00.b.i(modelClass), key);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ViewModelProvider(@k ViewModelStore store, @k Factory factory, @k CreationExtras defaultCreationExtras) {
        this(new ViewModelProviderImpl(store, factory, defaultCreationExtras));
        g0.p(store, "store");
        g0.p(factory, "factory");
        g0.p(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewModelProvider(@m80.k androidx.lifecycle.ViewModelStoreOwner r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r4.getViewModelStore()
            androidx.lifecycle.viewmodel.internal.ViewModelProviders r1 = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE
            androidx.lifecycle.ViewModelProvider$Factory r2 = r1.getDefaultFactory$lifecycle_viewmodel_release(r4)
            androidx.lifecycle.viewmodel.CreationExtras r4 = r1.getDefaultCreationExtras$lifecycle_viewmodel_release(r4)
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(@k ViewModelStoreOwner owner, @k Factory factory) {
        this(owner.getViewModelStore(), factory, ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        g0.p(owner, "owner");
        g0.p(factory, "factory");
    }
}
