package lk;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j implements lk.b {

    /* renamed from: h, reason: collision with root package name */
    public static final int f71453h = 4194304;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final int f71454i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f71455j = 2;

    /* renamed from: b, reason: collision with root package name */
    public final h<a, Object> f71456b;

    /* renamed from: c, reason: collision with root package name */
    public final b f71457c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f71458d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, lk.a<?>> f71459e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71460f;

    /* renamed from: g, reason: collision with root package name */
    public int f71461g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f71462a;

        /* renamed from: b, reason: collision with root package name */
        public int f71463b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f71464c;

        public a(b bVar) {
            this.f71462a = bVar;
        }

        @Override // lk.m
        public void a() {
            this.f71462a.c(this);
        }

        public void b(int i11, Class<?> cls) {
            this.f71463b = i11;
            this.f71464c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f71463b == aVar.f71463b && this.f71464c == aVar.f71464c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f71463b * 31;
            Class<?> cls = this.f71464c;
            return i11 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f71463b + "array=" + this.f71464c + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d<a> {
        @Override // lk.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i11, Class<?> cls) {
            a b11 = b();
            b11.b(i11, cls);
            return b11;
        }
    }

    @VisibleForTesting
    public j() {
        this.f71456b = new h<>();
        this.f71457c = new b();
        this.f71458d = new HashMap();
        this.f71459e = new HashMap();
        this.f71460f = 4194304;
    }

    @Override // lk.b
    public synchronized <T> T a(int i11, Class<T> cls) {
        Integer ceilingKey;
        try {
            ceilingKey = n(cls).ceilingKey(Integer.valueOf(i11));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m(q(i11, ceilingKey) ? this.f71457c.e(ceilingKey.intValue(), cls) : this.f71457c.e(i11, cls), cls);
    }

    @Override // lk.b
    public synchronized void b(int i11) {
        try {
            if (i11 >= 40) {
                c();
            } else if (i11 >= 20 || i11 == 15) {
                h(this.f71460f / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // lk.b
    public synchronized void c() {
        h(0);
    }

    @Override // lk.b
    public synchronized <T> T d(int i11, Class<T> cls) {
        return (T) m(this.f71457c.e(i11, cls), cls);
    }

    @Override // lk.b
    @Deprecated
    public <T> void e(T t11, Class<T> cls) {
        put(t11);
    }

    public final void f(int i11, Class<?> cls) {
        NavigableMap<Integer, Integer> n11 = n(cls);
        Integer num = n11.get(Integer.valueOf(i11));
        if (num != null) {
            if (num.intValue() == 1) {
                n11.remove(Integer.valueOf(i11));
                return;
            } else {
                n11.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i11 + ", this: " + this);
    }

    public final void g() {
        h(this.f71460f);
    }

    public final void h(int i11) {
        while (this.f71461g > i11) {
            Object f11 = this.f71456b.f();
            fl.m.e(f11);
            lk.a i12 = i(f11);
            this.f71461g -= i12.a(f11) * i12.b();
            f(i12.a(f11), f11.getClass());
            if (Log.isLoggable(i12.getTag(), 2)) {
                Log.v(i12.getTag(), "evicted: " + i12.a(f11));
            }
        }
    }

    public final <T> lk.a<T> i(T t11) {
        return j(t11.getClass());
    }

    public final <T> lk.a<T> j(Class<T> cls) {
        lk.a<T> gVar;
        lk.a<T> aVar = (lk.a) this.f71459e.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            gVar = new i();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            gVar = new g();
        }
        this.f71459e.put(cls, gVar);
        return gVar;
    }

    @Nullable
    public final <T> T k(a aVar) {
        return (T) this.f71456b.a(aVar);
    }

    public int l() {
        int i11 = 0;
        for (Class<?> cls : this.f71458d.keySet()) {
            for (Integer num : this.f71458d.get(cls).keySet()) {
                i11 += num.intValue() * this.f71458d.get(cls).get(num).intValue() * j(cls).b();
            }
        }
        return i11;
    }

    public final <T> T m(a aVar, Class<T> cls) {
        lk.a<T> j11 = j(cls);
        T t11 = (T) k(aVar);
        if (t11 != null) {
            this.f71461g -= j11.a(t11) * j11.b();
            f(j11.a(t11), cls);
        }
        if (t11 != null) {
            return t11;
        }
        if (Log.isLoggable(j11.getTag(), 2)) {
            Log.v(j11.getTag(), "Allocated " + aVar.f71463b + " bytes");
        }
        return j11.newArray(aVar.f71463b);
    }

    public final NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f71458d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f71458d.put(cls, treeMap);
        return treeMap;
    }

    public final boolean o() {
        int i11 = this.f71461g;
        return i11 == 0 || this.f71460f / i11 >= 2;
    }

    public final boolean p(int i11) {
        return i11 <= this.f71460f / 2;
    }

    @Override // lk.b
    public synchronized <T> void put(T t11) {
        Class<?> cls = t11.getClass();
        lk.a<T> j11 = j(cls);
        int a11 = j11.a(t11);
        int b11 = j11.b() * a11;
        if (p(b11)) {
            a e11 = this.f71457c.e(a11, cls);
            this.f71456b.d(e11, t11);
            NavigableMap<Integer, Integer> n11 = n(cls);
            Integer num = n11.get(Integer.valueOf(e11.f71463b));
            Integer valueOf = Integer.valueOf(e11.f71463b);
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            n11.put(valueOf, Integer.valueOf(i11));
            this.f71461g += b11;
            g();
        }
    }

    public final boolean q(int i11, Integer num) {
        if (num != null) {
            return o() || num.intValue() <= i11 * 8;
        }
        return false;
    }

    public j(int i11) {
        this.f71456b = new h<>();
        this.f71457c = new b();
        this.f71458d = new HashMap();
        this.f71459e = new HashMap();
        this.f71460f = i11;
    }
}
