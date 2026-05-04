package pk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final s f80731a;

    /* renamed from: b, reason: collision with root package name */
    public final a f80732b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, C0991a<?>> f80733a = new HashMap();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: pk.q$a$a, reason: collision with other inner class name */
        public static class C0991a<Model> {

            /* renamed from: a, reason: collision with root package name */
            public final List<o<Model, ?>> f80734a;

            public C0991a(List<o<Model, ?>> list) {
                this.f80734a = list;
            }
        }

        public void a() {
            this.f80733a.clear();
        }

        @Nullable
        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0991a<?> c0991a = this.f80733a.get(cls);
            if (c0991a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0991a.f80734a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f80733a.put(cls, new C0991a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new s(pool));
    }

    @NonNull
    public static <A> Class<A> c(@NonNull A a11) {
        return (Class<A>) a11.getClass();
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        this.f80731a.b(cls, cls2, pVar);
        this.f80732b.a();
    }

    public synchronized <Model, Data> o<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.f80731a.d(cls, cls2);
    }

    @NonNull
    public synchronized List<Class<?>> d(@NonNull Class<?> cls) {
        return this.f80731a.g(cls);
    }

    @NonNull
    public <A> List<o<A, ?>> e(@NonNull A a11) {
        List<o<A, ?>> f11 = f(c(a11));
        if (f11.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a11);
        }
        int size = f11.size();
        List<o<A, ?>> list = Collections.EMPTY_LIST;
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            o<A, ?> oVar = f11.get(i11);
            if (oVar.handles(a11)) {
                if (z11) {
                    list = new ArrayList<>(size - i11);
                    z11 = false;
                }
                list.add(oVar);
            }
        }
        if (list.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a11, f11);
        }
        return list;
    }

    @NonNull
    public final synchronized <A> List<o<A, ?>> f(@NonNull Class<A> cls) {
        List<o<A, ?>> b11;
        b11 = this.f80732b.b(cls);
        if (b11 == null) {
            b11 = Collections.unmodifiableList(this.f80731a.c(cls));
            this.f80732b.c(cls, b11);
        }
        return b11;
    }

    public synchronized <Model, Data> void g(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        this.f80731a.i(cls, cls2, pVar);
        this.f80732b.a();
    }

    public synchronized <Model, Data> void h(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        j(this.f80731a.j(cls, cls2));
        this.f80732b.a();
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        j(this.f80731a.k(cls, cls2, pVar));
        this.f80732b.a();
    }

    public final <Model, Data> void j(@NonNull List<p<? extends Model, ? extends Data>> list) {
        Iterator<p<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().teardown();
        }
    }

    public q(@NonNull s sVar) {
        this.f80732b = new a();
        this.f80731a = sVar;
    }
}
