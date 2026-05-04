package yk;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.Collection;
import java.util.Map;
import sk.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class p implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    public static final String f100184f = "com.bumptech.glide.manager";

    /* renamed from: g, reason: collision with root package name */
    public static final b f100185g = new a();

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.k f100186a;

    /* renamed from: b, reason: collision with root package name */
    public final b f100187b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayMap<View, Fragment> f100188c = new ArrayMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final i f100189d;

    /* renamed from: e, reason: collision with root package name */
    public final m f100190e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b {
        @Override // yk.p.b
        @NonNull
        public com.bumptech.glide.k a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull q qVar, @NonNull Context context) {
            return new com.bumptech.glide.k(cVar, jVar, qVar, context);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        @NonNull
        com.bumptech.glide.k a(@NonNull com.bumptech.glide.c cVar, @NonNull j jVar, @NonNull q qVar, @NonNull Context context);
    }

    public p(@Nullable b bVar) {
        bVar = bVar == null ? f100185g : bVar;
        this.f100187b = bVar;
        this.f100190e = new m(bVar);
        this.f100189d = b();
    }

    @TargetApi(17)
    public static void a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static i b() {
        return (r0.f88784g && r0.f88783f) ? new h() : new f();
    }

    @Nullable
    public static Activity c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void d(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    public static boolean m(Context context) {
        Activity c11 = c(context);
        return c11 == null || !c11.isFinishing();
    }

    @Nullable
    public final Fragment e(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.f100188c.clear();
        d(fragmentActivity.getSupportFragmentManager().getFragments(), this.f100188c);
        View findViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f100188c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f100188c.clear();
        return fragment;
    }

    @NonNull
    @Deprecated
    public com.bumptech.glide.k f(@NonNull Activity activity) {
        return h(activity.getApplicationContext());
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.k g(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return h(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @NonNull
    public com.bumptech.glide.k h(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (fl.o.v() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return k((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return h(contextWrapper.getBaseContext());
                }
            }
        }
        return l(context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public com.bumptech.glide.k i(@NonNull View view) {
        if (fl.o.u()) {
            return h(view.getContext().getApplicationContext());
        }
        fl.m.e(view);
        fl.m.f(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c11 = c(view.getContext());
        if (c11 == null) {
            return h(view.getContext().getApplicationContext());
        }
        if (!(c11 instanceof FragmentActivity)) {
            return h(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) c11;
        Fragment e11 = e(view, fragmentActivity);
        return e11 != null ? j(e11) : k(fragmentActivity);
    }

    @NonNull
    public com.bumptech.glide.k j(@NonNull Fragment fragment) {
        fl.m.f(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (fl.o.u()) {
            return h(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f100189d.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f100190e.b(context, com.bumptech.glide.c.e(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @NonNull
    public com.bumptech.glide.k k(@NonNull FragmentActivity fragmentActivity) {
        if (fl.o.u()) {
            return h(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f100189d.a(fragmentActivity);
        boolean m11 = m(fragmentActivity);
        return this.f100190e.b(fragmentActivity, com.bumptech.glide.c.e(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), m11);
    }

    @NonNull
    public final com.bumptech.glide.k l(@NonNull Context context) {
        if (this.f100186a == null) {
            synchronized (this) {
                try {
                    if (this.f100186a == null) {
                        this.f100186a = this.f100187b.a(com.bumptech.glide.c.e(context.getApplicationContext()), new yk.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f100186a;
    }
}
