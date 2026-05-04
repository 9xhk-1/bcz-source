package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import dagger.hilt.android.internal.lifecycle.f;
import java.io.Closeable;
import java.util.Map;
import javax.inject.Provider;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements ViewModelProvider.Factory {

    /* renamed from: d, reason: collision with root package name */
    public static final CreationExtras.Key<l<Object, ViewModel>> f47608d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f47609a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.Factory f47610b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewModelProvider.Factory f47611c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements CreationExtras.Key<l<Object, ViewModel>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uu.f f47612a;

        public b(final uu.f val$viewModelComponentBuilder) {
            this.f47612a = val$viewModelComponentBuilder;
        }

        public final <T extends ViewModel> T a(@NonNull ru.f component, @NonNull Class<T> modelClass, @NonNull CreationExtras extras) {
            Provider<ViewModel> provider = ((InterfaceC0554d) pu.c.a(component, InterfaceC0554d.class)).a().get(modelClass);
            l lVar = (l) extras.get(d.f47608d);
            Object obj = ((InterfaceC0554d) pu.c.a(component, InterfaceC0554d.class)).b().get(modelClass);
            if (obj == null) {
                if (lVar != null) {
                    throw new IllegalStateException("Found creation callback but class " + modelClass.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (provider != null) {
                    return (T) provider.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + modelClass.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (provider != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + modelClass.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (lVar != null) {
                return (T) lVar.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + modelClass.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public <T extends ViewModel> T create(@NonNull Class<T> cls, @NonNull CreationExtras creationExtras) {
            final j jVar = new j();
            T t11 = (T) a(this.f47612a.b(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).a(jVar).build(), cls, creationExtras);
            t11.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.e
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    j.this.c();
                }
            });
            return t11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.a.class})
    @pu.b
    public interface c {
        @f.a
        Map<Class<?>, Boolean> l();

        uu.f t();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.f.class})
    @pu.b
    /* renamed from: dagger.hilt.android.internal.lifecycle.d$d, reason: collision with other inner class name */
    public interface InterfaceC0554d {
        @f
        Map<Class<?>, Provider<ViewModel>> a();

        @dagger.hilt.android.internal.lifecycle.c
        Map<Class<?>, Object> b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.f.class})
    @nu.h
    public interface e {
        @f
        @vv.h
        Map<Class<?>, ViewModel> a();

        @dagger.hilt.android.internal.lifecycle.c
        @vv.h
        Map<Class<?>, Object> b();
    }

    public d(@NonNull Map<Class<?>, Boolean> hiltViewModelKeys, @NonNull ViewModelProvider.Factory delegateFactory, @NonNull uu.f viewModelComponentBuilder) {
        this.f47609a = hiltViewModelKeys;
        this.f47610b = delegateFactory;
        this.f47611c = new b(viewModelComponentBuilder);
    }

    public static ViewModelProvider.Factory a(@NonNull Activity activity, @NonNull ViewModelProvider.Factory delegateFactory) {
        c cVar = (c) pu.c.a(activity, c.class);
        return new d(cVar.l(), delegateFactory, cVar.t());
    }

    public static ViewModelProvider.Factory b(@NonNull Activity activity, @NonNull SavedStateRegistryOwner owner, @Nullable Bundle defaultArgs, @NonNull ViewModelProvider.Factory delegateFactory) {
        return a(activity, delegateFactory);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls, @NonNull CreationExtras creationExtras) {
        return this.f47609a.containsKey(cls) ? (T) this.f47611c.create(cls, creationExtras) : (T) this.f47610b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        if (this.f47609a.containsKey(cls)) {
            return (T) this.f47611c.create(cls);
        }
        return (T) this.f47610b.create(cls);
    }
}
