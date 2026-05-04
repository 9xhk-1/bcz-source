package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DecodeFormat;
import fl.m;
import fl.o;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ok.d;
import sk.r0;
import yk.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements ComponentCallbacks2 {

    /* renamed from: l, reason: collision with root package name */
    public static final String f28638l = "image_manager_disk_cache";

    /* renamed from: m, reason: collision with root package name */
    public static final String f28639m = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";

    /* renamed from: n, reason: collision with root package name */
    public static final String f28640n = "Glide";

    /* renamed from: o, reason: collision with root package name */
    @GuardedBy("Glide.class")
    public static volatile c f28641o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f28642p;

    /* renamed from: a, reason: collision with root package name */
    public final kk.k f28643a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.e f28644b;

    /* renamed from: c, reason: collision with root package name */
    public final mk.j f28645c;

    /* renamed from: d, reason: collision with root package name */
    public final e f28646d;

    /* renamed from: e, reason: collision with root package name */
    public final lk.b f28647e;

    /* renamed from: f, reason: collision with root package name */
    public final p f28648f;

    /* renamed from: g, reason: collision with root package name */
    public final yk.c f28649g;

    /* renamed from: i, reason: collision with root package name */
    public final a f28651i;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public ok.b f28653k;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("managers")
    public final List<k> f28650h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public MemoryCategory f28652j = MemoryCategory.NORMAL;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        @NonNull
        bl.g build();
    }

    public c(@NonNull Context context, @NonNull kk.k kVar, @NonNull mk.j jVar, @NonNull lk.e eVar, @NonNull lk.b bVar, @NonNull p pVar, @NonNull yk.c cVar, int i11, @NonNull a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<bl.f<Object>> list, @NonNull List<zk.c> list2, @Nullable zk.a aVar2, @NonNull f fVar) {
        this.f28643a = kVar;
        this.f28644b = eVar;
        this.f28647e = bVar;
        this.f28645c = jVar;
        this.f28648f = pVar;
        this.f28649g = cVar;
        this.f28651i = aVar;
        this.f28646d = new e(context, bVar, i.d(this, list2, aVar2), new cl.k(), aVar, map, list, kVar, fVar, i11);
    }

    public static void A(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    @Deprecated
    public static k D(@NonNull Activity activity) {
        return F(activity.getApplicationContext());
    }

    @NonNull
    @Deprecated
    public static k E(@NonNull Fragment fragment) {
        Activity activity = fragment.getActivity();
        m.f(activity, f28639m);
        return F(activity.getApplicationContext());
    }

    @NonNull
    public static k F(@NonNull Context context) {
        return p(context).h(context);
    }

    @NonNull
    public static k G(@NonNull View view) {
        return p(view.getContext()).i(view);
    }

    @NonNull
    public static k H(@NonNull androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).j(fragment);
    }

    @NonNull
    public static k I(@NonNull FragmentActivity fragmentActivity) {
        return p(fragmentActivity).k(fragmentActivity);
    }

    @GuardedBy("Glide.class")
    @VisibleForTesting
    public static void a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (f28642p) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f28642p = true;
        try {
            s(context, generatedAppGlideModule);
        } finally {
            f28642p = false;
        }
    }

    @VisibleForTesting
    public static void d() {
        r0.c().i();
    }

    @NonNull
    public static c e(@NonNull Context context) {
        if (f28641o == null) {
            GeneratedAppGlideModule f11 = f(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f28641o == null) {
                        a(context, f11);
                    }
                } finally {
                }
            }
        }
        return f28641o;
    }

    @Nullable
    public static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e11) {
            A(e11);
            return null;
        } catch (InstantiationException e12) {
            A(e12);
            return null;
        } catch (NoSuchMethodException e13) {
            A(e13);
            return null;
        } catch (InvocationTargetException e14) {
            A(e14);
            return null;
        }
    }

    @Nullable
    public static File l(@NonNull Context context) {
        return m(context, "image_manager_disk_cache");
    }

    @Nullable
    public static File m(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable("Glide", 6)) {
                Log.e("Glide", "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @NonNull
    public static p p(@Nullable Context context) {
        m.f(context, f28639m);
        return e(context).o();
    }

    @VisibleForTesting
    public static void q(@NonNull Context context, @NonNull d dVar) {
        GeneratedAppGlideModule f11 = f(context);
        synchronized (c.class) {
            try {
                if (f28641o != null) {
                    z();
                }
                t(context, dVar, f11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    public static synchronized void r(c cVar) {
        synchronized (c.class) {
            try {
                if (f28641o != null) {
                    z();
                }
                f28641o = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("Glide.class")
    public static void s(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new d(), generatedAppGlideModule);
    }

    @GuardedBy("Glide.class")
    public static void t(@NonNull Context context, @NonNull d dVar, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<zk.c> list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            list = new zk.e(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> a11 = generatedAppGlideModule.a();
            Iterator<zk.c> it = list.iterator();
            while (it.hasNext()) {
                zk.c next = it.next();
                if (a11.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<zk.c> it2 = list.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.x(generatedAppGlideModule != null ? generatedAppGlideModule.b() : null);
        Iterator<zk.c> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().applyOptions(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, dVar);
        }
        c b11 = dVar.b(applicationContext, list, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(b11);
        f28641o = b11;
    }

    @VisibleForTesting
    public static synchronized boolean u() {
        boolean z11;
        synchronized (c.class) {
            z11 = f28641o != null;
        }
        return z11;
    }

    @VisibleForTesting
    public static void z() {
        synchronized (c.class) {
            try {
                if (f28641o != null) {
                    f28641o.j().getApplicationContext().unregisterComponentCallbacks(f28641o);
                    f28641o.f28643a.m();
                }
                f28641o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(int i11) {
        o.b();
        synchronized (this.f28650h) {
            try {
                Iterator<k> it = this.f28650h.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28645c.b(i11);
        this.f28644b.b(i11);
        this.f28647e.b(i11);
    }

    public void C(k kVar) {
        synchronized (this.f28650h) {
            try {
                if (!this.f28650h.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f28650h.remove(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        o.a();
        this.f28643a.e();
    }

    public void c() {
        o.b();
        this.f28645c.c();
        this.f28644b.c();
        this.f28647e.c();
    }

    @NonNull
    public lk.b g() {
        return this.f28647e;
    }

    @NonNull
    public lk.e h() {
        return this.f28644b;
    }

    public yk.c i() {
        return this.f28649g;
    }

    @NonNull
    public Context j() {
        return this.f28646d.getBaseContext();
    }

    @NonNull
    public e k() {
        return this.f28646d;
    }

    @NonNull
    public Registry n() {
        return this.f28646d.i();
    }

    @NonNull
    public p o() {
        return this.f28648f;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        B(i11);
    }

    public synchronized void v(@NonNull d.a... aVarArr) {
        try {
            if (this.f28653k == null) {
                this.f28653k = new ok.b(this.f28645c, this.f28644b, (DecodeFormat) this.f28651i.build().getOptions().c(com.bumptech.glide.load.resource.bitmap.a.f28817g));
            }
            this.f28653k.c(aVarArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void w(k kVar) {
        synchronized (this.f28650h) {
            try {
                if (this.f28650h.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f28650h.add(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean x(@NonNull cl.p<?> pVar) {
        synchronized (this.f28650h) {
            try {
                Iterator<k> it = this.f28650h.iterator();
                while (it.hasNext()) {
                    if (it.next().untrack(pVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public MemoryCategory y(@NonNull MemoryCategory memoryCategory) {
        o.b();
        this.f28645c.d(memoryCategory.getMultiplier());
        this.f28644b.d(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.f28652j;
        this.f28652j = memoryCategory;
        return memoryCategory2;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
