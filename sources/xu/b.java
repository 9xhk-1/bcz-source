package xu;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements gv.c<ru.b> {

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelStoreOwner f98338a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f98339b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile ru.b f98340c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f98341d = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f98342a;

        public a(final Context val$context) {
            this.f98342a = val$context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NonNull
        public <T extends ViewModel> T create(@NonNull Class<T> aClass, CreationExtras creationExtras) {
            l lVar = new l(creationExtras);
            return new c(((InterfaceC1329b) qu.e.d(this.f98342a, InterfaceC1329b.class)).l().a(lVar).build(), lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({fv.a.class})
    @pu.b
    /* renamed from: xu.b$b, reason: collision with other inner class name */
    public interface InterfaceC1329b {
        uu.b l();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends ViewModel {

        /* renamed from: a, reason: collision with root package name */
        public final ru.b f98344a;

        /* renamed from: b, reason: collision with root package name */
        public final l f98345b;

        public c(ru.b component, l savedStateHandleHolder) {
            this.f98344a = component;
            this.f98345b = savedStateHandleHolder;
        }

        public ru.b a() {
            return this.f98344a;
        }

        public l b() {
            return this.f98345b;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            ((dagger.hilt.android.internal.lifecycle.j) ((d) pu.c.a(this.f98344a, d.class)).b()).c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.b.class})
    @pu.b
    public interface d {
        qu.a b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.b.class})
    @nu.h
    public static abstract class e {
        @dv.a
        @nu.i
        public static qu.a a() {
            return new dagger.hilt.android.internal.lifecycle.j();
        }
    }

    public b(ComponentActivity activity) {
        this.f98338a = activity;
        this.f98339b = activity;
    }

    public final ru.b a() {
        return ((c) d(this.f98338a, this.f98339b).get(c.class)).a();
    }

    @Override // gv.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ru.b generatedComponent() {
        if (this.f98340c == null) {
            synchronized (this.f98341d) {
                try {
                    if (this.f98340c == null) {
                        this.f98340c = a();
                    }
                } finally {
                }
            }
        }
        return this.f98340c;
    }

    public l c() {
        return ((c) d(this.f98338a, this.f98339b).get(c.class)).b();
    }

    public final ViewModelProvider d(ViewModelStoreOwner owner, Context context) {
        return new ViewModelProvider(owner, new a(context));
    }
}
