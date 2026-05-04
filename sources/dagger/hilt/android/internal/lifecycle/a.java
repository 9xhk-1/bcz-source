package dagger.hilt.android.internal.lifecycle;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.f;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.a.class})
    @pu.b
    /* renamed from: dagger.hilt.android.internal.lifecycle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0553a {
        d a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.a.class})
    @nu.h
    public interface b {
        @f.a
        @vv.h
        Map<Class<?>, Boolean> a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.c.class})
    @pu.b
    public interface c {
        d a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, Boolean> f47604a;

        /* renamed from: b, reason: collision with root package name */
        public final uu.f f47605b;

        @Inject
        public d(@f.a Map<Class<?>, Boolean> keySet, uu.f viewModelComponentBuilder) {
            this.f47604a = keySet;
            this.f47605b = viewModelComponentBuilder;
        }

        public ViewModelProvider.Factory a(ComponentActivity activity, ViewModelProvider.Factory delegateFactory) {
            return c(delegateFactory);
        }

        public ViewModelProvider.Factory b(Fragment fragment, ViewModelProvider.Factory delegateFactory) {
            return c(delegateFactory);
        }

        public final ViewModelProvider.Factory c(ViewModelProvider.Factory delegate) {
            return new dagger.hilt.android.internal.lifecycle.d(this.f47604a, (ViewModelProvider.Factory) gv.f.b(delegate), this.f47605b);
        }
    }

    public static ViewModelProvider.Factory a(ComponentActivity activity, ViewModelProvider.Factory delegateFactory) {
        return ((InterfaceC0553a) pu.c.a(activity, InterfaceC0553a.class)).a().a(activity, delegateFactory);
    }

    public static ViewModelProvider.Factory b(Fragment fragment, ViewModelProvider.Factory delegateFactory) {
        return ((c) pu.c.a(fragment, c.class)).a().b(fragment, delegateFactory);
    }
}
