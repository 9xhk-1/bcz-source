package xu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements gv.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f98359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98360b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98361c;

    /* renamed from: d, reason: collision with root package name */
    public final View f98362d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.a.class})
    @pu.b
    public interface b {
        uu.e f();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.c.class})
    @pu.b
    public interface c {
        uu.g d();
    }

    public p(View view, boolean hasFragmentBindings) {
        this.f98362d = view;
        this.f98361c = hasFragmentBindings;
    }

    private Object a() {
        gv.c<?> b11 = b(false);
        return this.f98361c ? ((c) pu.c.a(b11, c.class)).d().a(this.f98362d).build() : ((b) pu.c.a(b11, b.class)).f().a(this.f98362d).build();
    }

    public static Context e(Context context, Class<?> target) {
        while ((context instanceof ContextWrapper) && !target.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final gv.c<?> b(boolean allowMissing) {
        if (this.f98361c) {
            Context c11 = c(a.class, allowMissing);
            if (c11 instanceof a) {
                return (gv.c) ((a) c11).d();
            }
            if (allowMissing) {
                return null;
            }
            gv.f.d(!(r5 instanceof gv.c), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f98362d.getClass(), c(gv.c.class, allowMissing).getClass().getName());
        } else {
            Object c12 = c(gv.c.class, allowMissing);
            if (c12 instanceof gv.c) {
                return (gv.c) c12;
            }
            if (allowMissing) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.f98362d.getClass()));
    }

    public final Context c(Class<?> parentType, boolean allowMissing) {
        Context e11 = e(this.f98362d.getContext(), parentType);
        if (e11 != tu.a.a(e11.getApplicationContext())) {
            return e11;
        }
        gv.f.d(allowMissing, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f98362d.getClass());
        return null;
    }

    public gv.c<?> d() {
        return b(true);
    }

    @Override // gv.c
    public Object generatedComponent() {
        if (this.f98359a == null) {
            synchronized (this.f98360b) {
                try {
                    if (this.f98359a == null) {
                        this.f98359a = a();
                    }
                } finally {
                }
            }
        }
        return this.f98359a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f98363a;

        /* renamed from: b, reason: collision with root package name */
        public LayoutInflater f98364b;

        /* renamed from: c, reason: collision with root package name */
        public LayoutInflater f98365c;

        /* renamed from: d, reason: collision with root package name */
        public final LifecycleEventObserver f98366d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: xu.p$a$a, reason: collision with other inner class name */
        public class C1330a implements LifecycleEventObserver {
            public C1330a() {
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    a.this.f98363a = null;
                    a.this.f98364b = null;
                    a.this.f98365c = null;
                }
            }
        }

        public a(Context base, Fragment fragment) {
            super((Context) gv.f.b(base));
            C1330a c1330a = new C1330a();
            this.f98366d = c1330a;
            this.f98364b = null;
            Fragment fragment2 = (Fragment) gv.f.b(fragment);
            this.f98363a = fragment2;
            fragment2.getLifecycle().addObserver(c1330a);
        }

        public Fragment d() {
            gv.f.c(this.f98363a, "The fragment has already been destroyed.");
            return this.f98363a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String name) {
            if (!"layout_inflater".equals(name)) {
                return getBaseContext().getSystemService(name);
            }
            if (this.f98365c == null) {
                if (this.f98364b == null) {
                    this.f98364b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f98365c = this.f98364b.cloneInContext(this);
            }
            return this.f98365c;
        }

        public a(LayoutInflater baseInflater, Fragment fragment) {
            super((Context) gv.f.b(((LayoutInflater) gv.f.b(baseInflater)).getContext()));
            C1330a c1330a = new C1330a();
            this.f98366d = c1330a;
            this.f98364b = baseInflater;
            Fragment fragment2 = (Fragment) gv.f.b(fragment);
            this.f98363a = fragment2;
            fragment2.getLifecycle().addObserver(c1330a);
        }
    }
}
