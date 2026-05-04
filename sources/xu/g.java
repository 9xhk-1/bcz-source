package xu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import xu.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g implements gv.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f98350a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f98351b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f98352c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @pu.e({ru.a.class})
    @pu.b
    public interface a {
        uu.c j();
    }

    public g(Fragment fragment) {
        this.f98352c = fragment;
    }

    private Object a() {
        gv.f.c(this.f98352c.getHost(), "Hilt Fragments must be attached before creating the component.");
        gv.f.d(this.f98352c.getHost() instanceof gv.c, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f98352c.getHost().getClass());
        f(this.f98352c);
        return ((a) pu.c.a(this.f98352c.getHost(), a.class)).j().a(this.f98352c).build();
    }

    public static ContextWrapper b(Context base, Fragment fragment) {
        return new p.a(base, fragment);
    }

    public static ContextWrapper c(LayoutInflater baseInflater, Fragment fragment) {
        return new p.a(baseInflater, fragment);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void e(Fragment fragment) {
        gv.f.b(fragment);
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
    }

    @Override // gv.c
    public Object generatedComponent() {
        if (this.f98350a == null) {
            synchronized (this.f98351b) {
                try {
                    if (this.f98350a == null) {
                        this.f98350a = a();
                    }
                } finally {
                }
            }
        }
        return this.f98350a;
    }

    public void f(Fragment fragment) {
    }
}
