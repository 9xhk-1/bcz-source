package bt;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public static final p f7305k = new h();

    /* renamed from: l, reason: collision with root package name */
    public static final p f7306l = new f();

    /* renamed from: m, reason: collision with root package name */
    public static Class[] f7307m;

    /* renamed from: n, reason: collision with root package name */
    public static Class[] f7308n;

    /* renamed from: o, reason: collision with root package name */
    public static Class[] f7309o;

    /* renamed from: p, reason: collision with root package name */
    public static final HashMap<Class, HashMap<String, Method>> f7310p;

    /* renamed from: q, reason: collision with root package name */
    public static final HashMap<Class, HashMap<String, Method>> f7311q;

    /* renamed from: a, reason: collision with root package name */
    public String f7312a;

    /* renamed from: b, reason: collision with root package name */
    public ct.c f7313b;

    /* renamed from: c, reason: collision with root package name */
    public Method f7314c;

    /* renamed from: d, reason: collision with root package name */
    public Method f7315d;

    /* renamed from: e, reason: collision with root package name */
    public Class f7316e;

    /* renamed from: f, reason: collision with root package name */
    public k f7317f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantReadWriteLock f7318g;

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f7319h;

    /* renamed from: i, reason: collision with root package name */
    public p f7320i;

    /* renamed from: j, reason: collision with root package name */
    public Object f7321j;

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f7307m = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f7308n = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f7309o = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f7310p = new HashMap<>();
        f7311q = new HashMap<>();
    }

    public n(String str) {
        this.f7314c = null;
        this.f7315d = null;
        this.f7317f = null;
        this.f7318g = new ReentrantReadWriteLock();
        this.f7319h = new Object[1];
        this.f7312a = str;
    }

    public static String d(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return String.valueOf(str) + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
    }

    public static n h(ct.c<?, Float> cVar, float... fArr) {
        return new a(cVar, fArr);
    }

    public static n i(String str, float... fArr) {
        return new a(str, fArr);
    }

    public static n j(ct.c<?, Integer> cVar, int... iArr) {
        return new b(cVar, iArr);
    }

    public static n l(String str, int... iArr) {
        return new b(str, iArr);
    }

    public static n m(ct.c cVar, j... jVarArr) {
        k e11 = k.e(jVarArr);
        if (e11 instanceof i) {
            return new b(cVar, (i) e11);
        }
        if (e11 instanceof g) {
            return new a(cVar, (g) e11);
        }
        n nVar = new n(cVar);
        nVar.f7317f = e11;
        nVar.f7316e = jVarArr[0].d();
        return nVar;
    }

    public static n n(String str, j... jVarArr) {
        k e11 = k.e(jVarArr);
        if (e11 instanceof i) {
            return new b(str, (i) e11);
        }
        if (e11 instanceof g) {
            return new a(str, (g) e11);
        }
        n nVar = new n(str);
        nVar.f7317f = e11;
        nVar.f7316e = jVarArr[0].d();
        return nVar;
    }

    public static <V> n o(ct.c cVar, p<V> pVar, V... vArr) {
        n nVar = new n(cVar);
        nVar.w(vArr);
        nVar.s(pVar);
        return nVar;
    }

    public static n p(String str, p pVar, Object... objArr) {
        n nVar = new n(str);
        nVar.w(objArr);
        nVar.s(pVar);
        return nVar;
    }

    public final void A(Class cls) {
        this.f7315d = F(cls, f7311q, ct.d.f46852f, null);
    }

    public void B(Class cls) {
        this.f7314c = F(cls, f7310p, ct.d.f46854h, this.f7316e);
    }

    public void E(Object obj) {
        ct.c cVar = this.f7313b;
        if (cVar != null) {
            try {
                cVar.a(obj);
                Iterator<j> it = this.f7317f.f7289e.iterator();
                while (it.hasNext()) {
                    j next = it.next();
                    if (!next.f()) {
                        next.p(this.f7313b.a(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f7313b.b() + ") on target object " + obj + ". Trying reflection instead");
                this.f7313b = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f7314c == null) {
            B(cls);
        }
        Iterator<j> it2 = this.f7317f.f7289e.iterator();
        while (it2.hasNext()) {
            j next2 = it2.next();
            if (!next2.f()) {
                if (this.f7315d == null) {
                    A(cls);
                }
                try {
                    next2.p(this.f7315d.invoke(obj, null));
                } catch (IllegalAccessException e11) {
                    Log.e("PropertyValuesHolder", e11.toString());
                } catch (InvocationTargetException e12) {
                    Log.e("PropertyValuesHolder", e12.toString());
                }
            }
        }
    }

    public final Method F(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.f7318g.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? hashMap2.get(this.f7312a) : null;
            if (method == null) {
                method = e(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f7312a, method);
            }
            this.f7318g.writeLock().unlock();
            return method;
        } catch (Throwable th2) {
            this.f7318g.writeLock().unlock();
            throw th2;
        }
    }

    public void G(Object obj) {
        J(obj, this.f7317f.f7289e.get(0));
    }

    public final void J(Object obj, j jVar) {
        ct.c cVar = this.f7313b;
        if (cVar != null) {
            jVar.p(cVar.a(obj));
        }
        try {
            if (this.f7315d == null) {
                A(obj.getClass());
            }
            jVar.p(this.f7315d.invoke(obj, null));
        } catch (IllegalAccessException e11) {
            Log.e("PropertyValuesHolder", e11.toString());
        } catch (InvocationTargetException e12) {
            Log.e("PropertyValuesHolder", e12.toString());
        }
    }

    public void a(float f11) {
        this.f7321j = this.f7317f.b(f11);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f7312a = this.f7312a;
            nVar.f7313b = this.f7313b;
            nVar.f7317f = this.f7317f.clone();
            nVar.f7320i = this.f7320i;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Object c() {
        return this.f7321j;
    }

    public final Method e(Class cls, String str, Class cls2) {
        String d11 = d(str, this.f7312a);
        Method method = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(d11, null);
            } catch (NoSuchMethodException e11) {
                try {
                    method = cls.getDeclaredMethod(d11, null);
                    method.setAccessible(true);
                    return method;
                } catch (NoSuchMethodException unused) {
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f7312a + ": " + e11);
                    return method;
                }
            }
        }
        for (Class cls3 : this.f7316e.equals(Float.class) ? f7307m : this.f7316e.equals(Integer.class) ? f7308n : this.f7316e.equals(Double.class) ? f7309o : new Class[]{this.f7316e}) {
            Class<?>[] clsArr = {cls3};
            try {
                try {
                    Method method2 = cls.getMethod(d11, clsArr);
                    this.f7316e = cls3;
                    return method2;
                } catch (NoSuchMethodException unused2) {
                }
            } catch (NoSuchMethodException unused3) {
                method = cls.getDeclaredMethod(d11, clsArr);
                method.setAccessible(true);
                this.f7316e = cls3;
                return method;
            }
        }
        Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f7312a + " with value type " + this.f7316e);
        return method;
    }

    public String f() {
        return this.f7312a;
    }

    public void g() {
        if (this.f7320i == null) {
            Class cls = this.f7316e;
            this.f7320i = cls == Integer.class ? f7305k : cls == Float.class ? f7306l : null;
        }
        p pVar = this.f7320i;
        if (pVar != null) {
            this.f7317f.g(pVar);
        }
    }

    public void q(Object obj) {
        ct.c cVar = this.f7313b;
        if (cVar != null) {
            cVar.f(obj, c());
        }
        if (this.f7314c != null) {
            try {
                this.f7319h[0] = c();
                this.f7314c.invoke(obj, this.f7319h);
            } catch (IllegalAccessException e11) {
                Log.e("PropertyValuesHolder", e11.toString());
            } catch (InvocationTargetException e12) {
                Log.e("PropertyValuesHolder", e12.toString());
            }
        }
    }

    public void s(p pVar) {
        this.f7320i = pVar;
        this.f7317f.g(pVar);
    }

    public void t(float... fArr) {
        this.f7316e = Float.TYPE;
        this.f7317f = k.c(fArr);
    }

    public String toString() {
        return String.valueOf(this.f7312a) + ": " + this.f7317f.toString();
    }

    public void u(int... iArr) {
        this.f7316e = Integer.TYPE;
        this.f7317f = k.d(iArr);
    }

    public void v(j... jVarArr) {
        int length = jVarArr.length;
        j[] jVarArr2 = new j[Math.max(length, 2)];
        this.f7316e = jVarArr[0].d();
        for (int i11 = 0; i11 < length; i11++) {
            jVarArr2[i11] = jVarArr[i11];
        }
        this.f7317f = new k(jVarArr2);
    }

    public void w(Object... objArr) {
        this.f7316e = objArr[0].getClass();
        this.f7317f = k.f(objArr);
    }

    public void x(ct.c cVar) {
        this.f7313b = cVar;
    }

    public void y(String str) {
        this.f7312a = str;
    }

    public void z(Object obj) {
        J(obj, this.f7317f.f7289e.get(r0.size() - 1));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends n {

        /* renamed from: r, reason: collision with root package name */
        public ct.a f7322r;

        /* renamed from: s, reason: collision with root package name */
        public g f7323s;

        /* renamed from: t, reason: collision with root package name */
        public float f7324t;

        public a(String str, g gVar) {
            super(str, (n) null);
            this.f7316e = Float.TYPE;
            this.f7317f = gVar;
            this.f7323s = gVar;
        }

        @Override // bt.n
        public void B(Class cls) {
            if (this.f7313b != null) {
                return;
            }
            super.B(cls);
        }

        @Override // bt.n
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = (a) super.clone();
            aVar.f7323s = (g) aVar.f7317f;
            return aVar;
        }

        @Override // bt.n
        public void a(float f11) {
            this.f7324t = this.f7323s.i(f11);
        }

        @Override // bt.n
        public Object c() {
            return Float.valueOf(this.f7324t);
        }

        @Override // bt.n
        public void q(Object obj) {
            ct.a aVar = this.f7322r;
            if (aVar != null) {
                aVar.h(obj, this.f7324t);
                return;
            }
            ct.c cVar = this.f7313b;
            if (cVar != null) {
                cVar.f(obj, Float.valueOf(this.f7324t));
                return;
            }
            if (this.f7314c != null) {
                try {
                    this.f7319h[0] = Float.valueOf(this.f7324t);
                    this.f7314c.invoke(obj, this.f7319h);
                } catch (IllegalAccessException e11) {
                    Log.e("PropertyValuesHolder", e11.toString());
                } catch (InvocationTargetException e12) {
                    Log.e("PropertyValuesHolder", e12.toString());
                }
            }
        }

        @Override // bt.n
        public void t(float... fArr) {
            super.t(fArr);
            this.f7323s = (g) this.f7317f;
        }

        public a(ct.c cVar, g gVar) {
            super(cVar, (n) null);
            this.f7316e = Float.TYPE;
            this.f7317f = gVar;
            this.f7323s = gVar;
            if (cVar instanceof ct.a) {
                this.f7322r = (ct.a) this.f7313b;
            }
        }

        public a(String str, float... fArr) {
            super(str, (n) null);
            t(fArr);
        }

        public a(ct.c cVar, float... fArr) {
            super(cVar, (n) null);
            t(fArr);
            if (cVar instanceof ct.a) {
                this.f7322r = (ct.a) this.f7313b;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends n {

        /* renamed from: r, reason: collision with root package name */
        public ct.b f7325r;

        /* renamed from: s, reason: collision with root package name */
        public i f7326s;

        /* renamed from: t, reason: collision with root package name */
        public int f7327t;

        public b(String str, i iVar) {
            super(str, (n) null);
            this.f7316e = Integer.TYPE;
            this.f7317f = iVar;
            this.f7326s = iVar;
        }

        @Override // bt.n
        public void B(Class cls) {
            if (this.f7313b != null) {
                return;
            }
            super.B(cls);
        }

        @Override // bt.n
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = (b) super.clone();
            bVar.f7326s = (i) bVar.f7317f;
            return bVar;
        }

        @Override // bt.n
        public void a(float f11) {
            this.f7327t = this.f7326s.i(f11);
        }

        @Override // bt.n
        public Object c() {
            return Integer.valueOf(this.f7327t);
        }

        @Override // bt.n
        public void q(Object obj) {
            ct.b bVar = this.f7325r;
            if (bVar != null) {
                bVar.h(obj, this.f7327t);
                return;
            }
            ct.c cVar = this.f7313b;
            if (cVar != null) {
                cVar.f(obj, Integer.valueOf(this.f7327t));
                return;
            }
            if (this.f7314c != null) {
                try {
                    this.f7319h[0] = Integer.valueOf(this.f7327t);
                    this.f7314c.invoke(obj, this.f7319h);
                } catch (IllegalAccessException e11) {
                    Log.e("PropertyValuesHolder", e11.toString());
                } catch (InvocationTargetException e12) {
                    Log.e("PropertyValuesHolder", e12.toString());
                }
            }
        }

        @Override // bt.n
        public void u(int... iArr) {
            super.u(iArr);
            this.f7326s = (i) this.f7317f;
        }

        public b(ct.c cVar, i iVar) {
            super(cVar, (n) null);
            this.f7316e = Integer.TYPE;
            this.f7317f = iVar;
            this.f7326s = iVar;
            if (cVar instanceof ct.b) {
                this.f7325r = (ct.b) this.f7313b;
            }
        }

        public b(String str, int... iArr) {
            super(str, (n) null);
            u(iArr);
        }

        public b(ct.c cVar, int... iArr) {
            super(cVar, (n) null);
            u(iArr);
            if (cVar instanceof ct.b) {
                this.f7325r = (ct.b) this.f7313b;
            }
        }
    }

    public /* synthetic */ n(String str, n nVar) {
        this(str);
    }

    public n(ct.c cVar) {
        this.f7314c = null;
        this.f7315d = null;
        this.f7317f = null;
        this.f7318g = new ReentrantReadWriteLock();
        this.f7319h = new Object[1];
        this.f7313b = cVar;
        if (cVar != null) {
            this.f7312a = cVar.b();
        }
    }

    public /* synthetic */ n(ct.c cVar, n nVar) {
        this(cVar);
    }
}
