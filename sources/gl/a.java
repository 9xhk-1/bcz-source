package gl;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53937a = "FactoryPools";

    /* renamed from: b, reason: collision with root package name */
    public static final int f53938b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final g<Object> f53939c = new C0638a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> implements d<List<T>> {
        @Override // gl.a.d
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<T> implements g<List<T>> {
        @Override // gl.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<T> {
        T create();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> implements Pools.Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final d<T> f53940a;

        /* renamed from: b, reason: collision with root package name */
        public final g<T> f53941b;

        /* renamed from: c, reason: collision with root package name */
        public final Pools.Pool<T> f53942c;

        public e(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f53942c = pool;
            this.f53940a = dVar;
            this.f53941b = gVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            T acquire = this.f53942c.acquire();
            if (acquire == null) {
                acquire = this.f53940a.create();
                if (Log.isLoggable(a.f53937a, 2)) {
                    Log.v(a.f53937a, "Created new " + acquire.getClass());
                }
            }
            if (acquire instanceof f) {
                acquire.d().b(false);
            }
            return (T) acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t11) {
            if (t11 instanceof f) {
                ((f) t11).d().b(true);
            }
            this.f53941b.a(t11);
            return this.f53942c.release(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        @NonNull
        gl.c d();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g<T> {
        void a(@NonNull T t11);
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> a(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar) {
        return b(pool, dVar, c());
    }

    @NonNull
    public static <T> Pools.Pool<T> b(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(pool, dVar, gVar);
    }

    @NonNull
    public static <T> g<T> c() {
        return (g<T>) f53939c;
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> d(int i11, @NonNull d<T> dVar) {
        return a(new Pools.SimplePool(i11), dVar);
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> e(int i11, @NonNull d<T> dVar) {
        return a(new Pools.SynchronizedPool(i11), dVar);
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> f(int i11, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return b(new Pools.SynchronizedPool(i11), dVar, gVar);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> g() {
        return h(20);
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> h(int i11) {
        return b(new Pools.SynchronizedPool(i11), new b(), new c());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gl.a$a, reason: collision with other inner class name */
    public class C0638a implements g<Object> {
        @Override // gl.a.g
        public void a(@NonNull Object obj) {
        }
    }
}
