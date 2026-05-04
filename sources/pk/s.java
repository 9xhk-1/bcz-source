package pk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    public static final c f80744e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final o<Object, Object> f80745f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<b<?, ?>> f80746a;

    /* renamed from: b, reason: collision with root package name */
    public final c f80747b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b<?, ?>> f80748c;

    /* renamed from: d, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f80749d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements o<Object, Object> {
        @Override // pk.o
        @Nullable
        public o.a<Object> buildLoadData(@NonNull Object obj, int i11, int i12, @NonNull ik.e eVar) {
            return null;
        }

        @Override // pk.o
        public boolean handles(@NonNull Object obj) {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Model> f80750a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<Data> f80751b;

        /* renamed from: c, reason: collision with root package name */
        public final p<? extends Model, ? extends Data> f80752c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
            this.f80750a = cls;
            this.f80751b = cls2;
            this.f80752c = pVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f80750a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return a(cls) && this.f80751b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {
        @NonNull
        public <Model, Data> r<Model, Data> a(@NonNull List<o<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new r<>(list, pool);
        }
    }

    public s(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f80744e);
    }

    @NonNull
    public static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f80745f;
    }

    public final <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar, boolean z11) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f80746a;
        list.add(z11 ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    @NonNull
    public synchronized <Model> List<o<Model, ?>> c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f80746a) {
                if (!this.f80748c.contains(bVar) && bVar.a(cls)) {
                    this.f80748c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f80748c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> o<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (b<?, ?> bVar : this.f80746a) {
                if (this.f80748c.contains(bVar)) {
                    z11 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f80748c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f80748c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f80747b.a(arrayList, this.f80749d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z11) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f80748c.clear();
            throw th2;
        }
    }

    @NonNull
    public final <Model, Data> o<Model, Data> e(@NonNull b<?, ?> bVar) {
        return (o) fl.m.e(bVar.f80752c.build(this));
    }

    @NonNull
    public synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f80746a) {
            if (!arrayList.contains(bVar.f80751b) && bVar.a(cls)) {
                arrayList.add(bVar.f80751b);
            }
        }
        return arrayList;
    }

    @NonNull
    public final <Model, Data> p<Model, Data> h(@NonNull b<?, ?> bVar) {
        return (p<Model, Data>) bVar.f80752c;
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, false);
    }

    @NonNull
    public synchronized <Model, Data> List<p<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f80746a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> List<p<? extends Model, ? extends Data>> k(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        List<p<? extends Model, ? extends Data>> j11;
        j11 = j(cls, cls2);
        b(cls, cls2, pVar);
        return j11;
    }

    @VisibleForTesting
    public s(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull c cVar) {
        this.f80746a = new ArrayList();
        this.f80748c = new HashSet();
        this.f80749d = pool;
        this.f80747b = cVar;
    }
}
