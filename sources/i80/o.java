package i80;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int f60329d = 64;

    /* renamed from: e, reason: collision with root package name */
    public static final int f60330e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public static final int f60331f = 5192;

    /* renamed from: h, reason: collision with root package name */
    public static final int f60333h = 4;

    /* renamed from: a, reason: collision with root package name */
    public List<j80.d> f60335a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f60336b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60337c;

    /* renamed from: g, reason: collision with root package name */
    public static final Map<Class<?>, List<n>> f60332g = new ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final a[] f60334i = new a[4];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<n> f60338a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Map<Class, Object> f60339b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, Class> f60340c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f60341d = new StringBuilder(128);

        /* renamed from: e, reason: collision with root package name */
        public Class<?> f60342e;

        /* renamed from: f, reason: collision with root package name */
        public Class<?> f60343f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f60344g;

        /* renamed from: h, reason: collision with root package name */
        public j80.c f60345h;

        public boolean a(Method method, Class<?> cls) {
            Object put = this.f60339b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (!b((Method) put, cls)) {
                    throw new IllegalStateException();
                }
                this.f60339b.put(cls, this);
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.f60341d.setLength(0);
            this.f60341d.append(method.getName());
            StringBuilder sb2 = this.f60341d;
            sb2.append(u0.f91710f);
            sb2.append(cls.getName());
            String sb3 = this.f60341d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f60340c.put(sb3, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f60340c.put(sb3, put);
            return false;
        }

        public void c(Class<?> cls) {
            this.f60343f = cls;
            this.f60342e = cls;
            this.f60344g = false;
            this.f60345h = null;
        }

        public void d() {
            if (this.f60344g) {
                this.f60343f = null;
                return;
            }
            Class<? super Object> superclass = this.f60343f.getSuperclass();
            this.f60343f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f60343f = null;
            }
        }

        public void e() {
            this.f60338a.clear();
            this.f60339b.clear();
            this.f60340c.clear();
            this.f60341d.setLength(0);
            this.f60342e = null;
            this.f60343f = null;
            this.f60344g = false;
            this.f60345h = null;
        }
    }

    public o(List<j80.d> list, boolean z11, boolean z12) {
        this.f60335a = list;
        this.f60336b = z11;
        this.f60337c = z12;
    }

    public static void a() {
        f60332g.clear();
    }

    public List<n> b(Class<?> cls) {
        Map<Class<?>, List<n>> map = f60332g;
        List<n> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<n> d11 = this.f60337c ? d(cls) : c(cls);
        if (!d11.isEmpty()) {
            map.put(cls, d11);
            return d11;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<n> c(Class<?> cls) {
        a h11 = h();
        h11.c(cls);
        while (h11.f60343f != null) {
            j80.c g11 = g(h11);
            h11.f60345h = g11;
            if (g11 != null) {
                for (n nVar : g11.a()) {
                    if (h11.a(nVar.f60323a, nVar.f60325c)) {
                        h11.f60338a.add(nVar);
                    }
                }
            } else {
                e(h11);
            }
            h11.d();
        }
        return f(h11);
    }

    public final List<n> d(Class<?> cls) {
        a h11 = h();
        h11.c(cls);
        while (h11.f60343f != null) {
            e(h11);
            h11.d();
        }
        return f(h11);
    }

    public final void e(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f60343f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f60343f.getMethods();
            aVar.f60344g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & f60331f) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    l lVar = (l) method.getAnnotation(l.class);
                    if (lVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f60338a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                } else if (this.f60336b && method.isAnnotationPresent(l.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f60336b && method.isAnnotationPresent(l.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    public final List<n> f(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f60338a);
        aVar.e();
        synchronized (f60334i) {
            int i11 = 0;
            while (true) {
                if (i11 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f60334i;
                    if (aVarArr[i11] == null) {
                        aVarArr[i11] = aVar;
                        break;
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public final j80.c g(a aVar) {
        j80.c cVar = aVar.f60345h;
        if (cVar != null && cVar.d() != null) {
            j80.c d11 = aVar.f60345h.d();
            if (aVar.f60343f == d11.b()) {
                return d11;
            }
        }
        List<j80.d> list = this.f60335a;
        if (list == null) {
            return null;
        }
        Iterator<j80.d> it = list.iterator();
        while (it.hasNext()) {
            j80.c a11 = it.next().a(aVar.f60343f);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }

    public final a h() {
        synchronized (f60334i) {
            for (int i11 = 0; i11 < 4; i11++) {
                try {
                    a[] aVarArr = f60334i;
                    a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVarArr[i11] = null;
                        return aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new a();
        }
    }
}
