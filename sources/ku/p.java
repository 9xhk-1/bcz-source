package ku;

import com.bumptech.glide.load.engine.GlideException;
import com.typesafe.config.ConfigException;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import ku.j0;
import ku.z1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f68752a = "CONFIG_FORCE_";

    /* renamed from: b, reason: collision with root package name */
    public static final ju.m f68753b;

    /* renamed from: c, reason: collision with root package name */
    public static final ku.h f68754c;

    /* renamed from: d, reason: collision with root package name */
    public static final ku.h f68755d;

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f68756e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1 f68757f;

    /* renamed from: g, reason: collision with root package name */
    public static final w1 f68758g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Callable<ju.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f68759a;

        public a(ClassLoader classLoader) {
            this.f68759a = classLoader;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ju.a call() {
            return p.J().a((ju.k) p.P(this.f68759a)).l();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Callable<ju.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f68760a;

        public b(ClassLoader classLoader) {
            this.f68760a = classLoader;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ju.a call() {
            return r0.t("reference.conf", ju.o.b().j(this.f68760a)).w().f0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements z1.a {
        @Override // ku.z1.a
        public ju.p a(String str, ju.o oVar) {
            return r0.t(str, oVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements z1.a {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f68761a;

        public d(Class<?> cls) {
            this.f68761a = cls;
        }

        @Override // ku.z1.a
        public ju.p a(String str, ju.o oVar) {
            return r0.s(this.f68761a, str, oVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static String f68762a = "loads";

        /* renamed from: b, reason: collision with root package name */
        public static String f68763b = "substitutions";

        /* renamed from: c, reason: collision with root package name */
        public static final Map<String, Boolean> f68764c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f68765d;

        /* renamed from: e, reason: collision with root package name */
        public static final boolean f68766e;

        static {
            Map<String, Boolean> a11 = a();
            f68764c = a11;
            f68765d = a11.get(f68762a).booleanValue();
            f68766e = a11.get(f68763b).booleanValue();
        }

        public static Map<String, Boolean> a() {
            HashMap hashMap = new HashMap();
            String str = f68762a;
            Boolean bool = Boolean.FALSE;
            hashMap.put(str, bool);
            hashMap.put(f68763b, bool);
            String property = System.getProperty("config.trace");
            if (property != null) {
                for (String str2 : property.split(",")) {
                    if (str2.equals(f68762a)) {
                        hashMap.put(f68762a, Boolean.TRUE);
                    } else if (str2.equals(f68763b)) {
                        hashMap.put(f68763b, Boolean.TRUE);
                    } else {
                        System.err.println("config.trace property contains unknown trace topic '" + str2 + "'");
                    }
                }
            }
            return hashMap;
        }

        public static boolean b() {
            return f68765d;
        }

        public static boolean c() {
            return f68766e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public static final ju.d f68767a = new z1(null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static volatile ku.c f68768a = p.w();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public static volatile ku.c f68769a = p.x();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i implements z1.a {
        @Override // ku.z1.a
        public ju.p a(String str, ju.o oVar) {
            return r0.n(new File(str), oVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public ju.a f68770a = null;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference<ClassLoader> f68771b = new WeakReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public Map<String, ju.a> f68772c = new HashMap();

        public synchronized ju.a a(ClassLoader classLoader, String str, Callable<ju.a> callable) {
            ju.a aVar;
            try {
                if (classLoader != this.f68771b.get()) {
                    this.f68772c.clear();
                    this.f68771b = new WeakReference<>(classLoader);
                }
                ju.a J = p.J();
                if (J != this.f68770a) {
                    this.f68772c.clear();
                    this.f68770a = J;
                }
                aVar = this.f68772c.get(str);
                if (aVar == null) {
                    try {
                        try {
                            aVar = callable.call();
                            if (aVar == null) {
                                throw new ConfigException.BugOrBroken("null config from cache updater");
                            }
                            this.f68772c.put(str, aVar);
                        } catch (Exception e11) {
                            throw new ConfigException.Generic(e11.getMessage(), e11);
                        }
                    } catch (RuntimeException e12) {
                        throw e12;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return aVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public static final j f68773a = new j();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public static volatile ku.c f68774a = p.y();
    }

    static {
        x1 w11 = x1.w("hardcoded value");
        f68753b = w11;
        f68754c = new ku.h(w11, true);
        f68755d = new ku.h(w11, false);
        f68756e = new f0(w11);
        f68757f = new v1(w11, Collections.EMPTY_LIST);
        f68758g = w1.v1(w11);
    }

    public static ju.m A(String str) {
        return x1.t(str);
    }

    public static ju.m B(String str) {
        return str == null ? f68753b : x1.w(str);
    }

    public static ju.m C(URL url) {
        return x1.x(url);
    }

    public static ju.l D(File file, ju.o oVar) {
        return z1.g(new i(), file.getPath(), oVar);
    }

    public static ju.l E(Class<?> cls, String str, ju.o oVar) {
        return z1.g(new d(cls), str, oVar);
    }

    public static ju.l F(String str, ju.o oVar) {
        return z1.g(new c(), str, oVar);
    }

    public static void G() {
        g.f68768a = w();
    }

    public static void H() {
        h.f68769a = x();
    }

    public static void I() {
        l.f68774a = y();
    }

    public static ju.a J() {
        return K().f0();
    }

    public static ku.c K() {
        try {
            return l.f68774a;
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static void L(int i11, String str) {
        while (i11 > 0) {
            System.err.print(GlideException.a.f28776d);
            i11--;
        }
        System.err.println(str);
    }

    public static void M(String str) {
        System.err.println(str);
    }

    public static boolean N() {
        try {
            return e.b();
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static boolean O() {
        try {
            return e.c();
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static ju.a P(ClassLoader classLoader) {
        return e(classLoader, "unresolvedReference", new b(classLoader));
    }

    public static ju.m Q(String str) {
        return str == null ? f68753b : x1.w(str);
    }

    public static ju.a e(ClassLoader classLoader, String str, Callable<ju.a> callable) {
        try {
            return k.f68773a.a(classLoader, str, callable);
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static ju.d f() {
        try {
            return f.f68767a;
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static ju.a g(ClassLoader classLoader) {
        return e(classLoader, "defaultReference", new a(classLoader));
    }

    public static ju.a h(ClassLoader classLoader) {
        try {
            g(classLoader);
            return P(classLoader);
        } catch (ConfigException.UnresolvedSubstitution e11) {
            throw e11.addExtraDetail("Could not resolve substitution in reference.conf to a value: %s. All reference.conf files are required to be fully, independently resolvable, and should not require the presence of values for substitutions from further up the hierarchy.");
        }
    }

    public static ku.c i(ju.m mVar) {
        return m(mVar);
    }

    public static ju.a j(String str) {
        return l(str).f0();
    }

    public static v1 k(ju.m mVar) {
        return (mVar == null || mVar == f68753b) ? f68757f : new v1(mVar, Collections.EMPTY_LIST);
    }

    public static ku.c l(String str) {
        return m(str != null ? x1.w(str) : null);
    }

    public static ku.c m(ju.m mVar) {
        return mVar == f68753b ? f68758g : w1.v1(mVar);
    }

    public static ju.a n() {
        return o().f0();
    }

    public static ku.c o() {
        try {
            return g.f68768a;
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static ju.a p() {
        return q().f0();
    }

    public static ku.c q() {
        try {
            return h.f68769a;
        } catch (ExceptionInInitializerError e11) {
            throw q.c(e11);
        }
    }

    public static ju.t r(Object obj, String str) {
        return s(obj, Q(str), m0.KEYS_ARE_KEYS);
    }

    public static ku.d s(Object obj, ju.m mVar, m0 m0Var) {
        long millis;
        if (mVar == null) {
            throw new ConfigException.BugOrBroken("origin not supposed to be null");
        }
        if (obj == null) {
            return mVar != f68753b ? new f0(mVar) : f68756e;
        }
        if (obj instanceof ku.d) {
            return (ku.d) obj;
        }
        if (obj instanceof Boolean) {
            return mVar != f68753b ? new ku.h(mVar, ((Boolean) obj).booleanValue()) : ((Boolean) obj).booleanValue() ? f68754c : f68755d;
        }
        if (obj instanceof String) {
            return new j0.a(mVar, (String) obj);
        }
        if (obj instanceof Number) {
            return obj instanceof Double ? new m(mVar, ((Double) obj).doubleValue(), null) : obj instanceof Integer ? new s(mVar, ((Integer) obj).intValue(), null) : obj instanceof Long ? new t(mVar, ((Long) obj).longValue(), null) : g0.Y0(mVar, ((Number) obj).doubleValue(), null);
        }
        if (n.a(obj)) {
            millis = o.a(obj).toMillis();
            return new t(mVar, millis, null);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                if (obj instanceof ju.j) {
                    return new t(mVar, ((ju.j) obj).c(), null);
                }
                throw new ConfigException.BugOrBroken("bug in method caller: not valid to create ConfigValue from: " + obj);
            }
            Iterator it = ((Iterable) obj).iterator();
            if (!it.hasNext()) {
                return k(mVar);
            }
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(s(it.next(), mVar, m0Var));
            }
            return new v1(mVar, arrayList);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return m(mVar);
        }
        if (m0Var != m0.KEYS_ARE_KEYS) {
            return v0.c(mVar, map);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!(key instanceof String)) {
                throw new ConfigException.BugOrBroken("bug in method caller: not valid to create ConfigObject from map with non-String key: " + key);
            }
            hashMap.put((String) key, s(entry.getValue(), mVar, m0Var));
        }
        return new w1(mVar, hashMap);
    }

    public static ju.l t(Map<String, ? extends Object> map, String str) {
        return (ju.l) s(map, Q(str), m0.KEYS_ARE_PATHS);
    }

    public static Properties u() {
        Properties properties = System.getProperties();
        Properties properties2 = new Properties();
        synchronized (properties) {
            try {
                for (Map.Entry entry : properties.entrySet()) {
                    if (!entry.getKey().toString().startsWith("java.version.")) {
                        properties2.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return properties2;
    }

    public static ConfigException.NotResolved v(s0 s0Var, ConfigException.NotResolved notResolved) {
        String str = s0Var.k() + " has not been resolved, you need to call Config#resolve(), see API docs for Config#resolve()";
        return str.equals(notResolved.getMessage()) ? notResolved : new ConfigException.NotResolved(str, notResolved);
    }

    public static ku.c w() {
        return v0.f(z("env variables"), System.getenv());
    }

    public static ku.c x() {
        HashMap hashMap = new HashMap(System.getenv());
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            if (str.startsWith(f68752a)) {
                hashMap2.put(q.a(str, f68752a), hashMap.get(str));
            }
        }
        return v0.f(B("env variables overrides"), hashMap2);
    }

    public static ku.c y() {
        return (ku.c) r0.p(u(), ju.o.b().l("system properties")).w();
    }

    public static ju.m z(String str) {
        return x1.s(str);
    }
}
