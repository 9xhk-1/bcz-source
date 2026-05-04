package com.typesafe.config;

import com.typesafe.config.ConfigException;
import java.io.File;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.Callable;
import ju.i;
import ju.k;
import ju.o;
import ju.w;
import ku.p;
import ku.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f44718a = "config.strategy";

    /* renamed from: b, reason: collision with root package name */
    public static final String f44719b = "config.override_with_env_vars";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.typesafe.config.a$a, reason: collision with other inner class name */
    public static class CallableC0529a implements Callable<ju.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f44720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f44721b;

        public CallableC0529a(ClassLoader classLoader, o oVar) {
            this.f44720a = classLoader;
            this.f44721b = oVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ju.a call() {
            return a.v(this.f44720a, a.d(this.f44721b));
        }
    }

    public static ju.a A(String str, o oVar, b bVar) {
        o m11 = m(oVar, "load");
        return w(m11.d(), d0(str, m11), bVar);
    }

    public static ju.a B(ju.a aVar) {
        return v(a("load"), aVar);
    }

    public static ju.a C(ju.a aVar, b bVar) {
        return w(a("load"), aVar, bVar);
    }

    public static ju.a D(o oVar) {
        return E(oVar, b.b());
    }

    public static ju.a E(o oVar, b bVar) {
        return C(d(m(oVar, "load")), bVar);
    }

    public static Optional<ju.a> F() {
        return H(o.b());
    }

    public static Optional<ju.a> G(ClassLoader classLoader) {
        return H(o.b().j(classLoader));
    }

    public static Optional<ju.a> H(o oVar) {
        ClassLoader d11 = m(oVar, "parseApplicationReplacement").d();
        String property = System.getProperty("config.resource");
        int i11 = property != null ? 1 : 0;
        String property2 = System.getProperty("config.file");
        if (property2 != null) {
            i11++;
        }
        String property3 = System.getProperty("config.url");
        if (property3 != null) {
            i11++;
        }
        if (i11 == 0) {
            return Optional.empty();
        }
        if (i11 > 1) {
            throw new ConfigException.Generic("You set more than one of config.file='" + property2 + "', config.url='" + property3 + "', config.resource='" + property + "'; don't know which one to use!");
        }
        o i12 = oVar.i(false);
        if (property != null) {
            if (property.startsWith("/")) {
                property = property.substring(1);
            }
            return Optional.of(V(d11, property, i12));
        }
        if (property2 != null) {
            return Optional.of(J(new File(property2), i12));
        }
        try {
            return Optional.of(h0(new URL(property3), i12));
        } catch (MalformedURLException e11) {
            throw new ConfigException.Generic("Bad URL in config.url system property: '" + property3 + "': " + e11.getMessage(), e11);
        }
    }

    public static ju.a I(File file) {
        return J(file, o.b());
    }

    public static ju.a J(File file, o oVar) {
        return r0.n(file, oVar).w().f0();
    }

    public static ju.a K(File file) {
        return L(file, o.b());
    }

    public static ju.a L(File file, o oVar) {
        return p.D(file, oVar).f0();
    }

    public static ju.a M(Map<String, ? extends Object> map) {
        return N(map, null);
    }

    public static ju.a N(Map<String, ? extends Object> map, String str) {
        return p.t(map, str).f0();
    }

    public static ju.a O(Properties properties) {
        return P(properties, o.b());
    }

    public static ju.a P(Properties properties, o oVar) {
        return r0.p(properties, oVar).w().f0();
    }

    public static ju.a Q(Reader reader) {
        return R(reader, o.b());
    }

    public static ju.a R(Reader reader, o oVar) {
        return r0.q(reader, oVar).w().f0();
    }

    public static ju.a S(Class<?> cls, String str) {
        return T(cls, str, o.b());
    }

    public static ju.a T(Class<?> cls, String str, o oVar) {
        return r0.s(cls, str, oVar).w().f0();
    }

    public static ju.a U(ClassLoader classLoader, String str) {
        return V(classLoader, str, o.b());
    }

    public static ju.a V(ClassLoader classLoader, String str, o oVar) {
        return X(str, oVar.j(classLoader));
    }

    public static ju.a W(String str) {
        return X(str, o.b());
    }

    public static ju.a X(String str, o oVar) {
        return r0.t(str, m(oVar, "parseResources")).w().f0();
    }

    public static ju.a Y(Class<?> cls, String str) {
        return Z(cls, str, o.b());
    }

    public static ju.a Z(Class<?> cls, String str, o oVar) {
        return p.E(cls, str, oVar).f0();
    }

    public static ClassLoader a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        throw new ConfigException.BugOrBroken("Context class loader is not set for the current thread; if Thread.currentThread().getContextClassLoader() returns null, you must pass a ClassLoader explicitly to ConfigFactory." + str);
    }

    public static ju.a a0(ClassLoader classLoader, String str) {
        return b0(classLoader, str, o.b());
    }

    public static ju.a b() {
        return d(o.b());
    }

    public static ju.a b0(ClassLoader classLoader, String str, o oVar) {
        return p.F(str, oVar.j(classLoader)).f0();
    }

    public static ju.a c(ClassLoader classLoader) {
        return d(o.b().j(classLoader));
    }

    public static ju.a c0(String str) {
        return d0(str, o.b());
    }

    public static ju.a d(o oVar) {
        return n().a(m(oVar, "defaultApplication"));
    }

    public static ju.a d0(String str, o oVar) {
        return p.F(str, oVar).f0();
    }

    public static ju.a e() {
        return o().booleanValue() ? j0().a((k) k0()) : k0();
    }

    public static ju.a e0(String str) {
        return f0(str, o.b());
    }

    public static ju.a f(ClassLoader classLoader) {
        return e();
    }

    public static ju.a f0(String str, o oVar) {
        return r0.u(str, oVar).w().f0();
    }

    public static ju.a g() {
        return h(a("defaultReference"));
    }

    public static ju.a g0(URL url) {
        return h0(url, o.b());
    }

    public static ju.a h(ClassLoader classLoader) {
        return p.g(classLoader);
    }

    public static ju.a h0(URL url, o oVar) {
        return r0.v(url, oVar).w().f0();
    }

    public static ju.a i() {
        return j(a("defaultReferenceUnresolved"));
    }

    public static ju.a i0() {
        return p.n();
    }

    public static ju.a j(ClassLoader classLoader) {
        return p.h(classLoader);
    }

    public static ju.a j0() {
        return p.p();
    }

    public static ju.a k() {
        return l(null);
    }

    public static ju.a k0() {
        return p.J();
    }

    public static ju.a l(String str) {
        return p.j(str);
    }

    public static o m(o oVar, String str) {
        return oVar.d() == null ? oVar.j(a(str)) : oVar;
    }

    public static i n() {
        String property = System.getProperties().getProperty(f44718a);
        if (property == null) {
            return new w();
        }
        try {
            return (i) Class.forName(property).asSubclass(i.class).getDeclaredConstructor(null).newInstance(null);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                throw new ConfigException.BugOrBroken("Failed to load strategy: " + property, e11);
            }
            throw new ConfigException.BugOrBroken("Failed to load strategy: " + property, cause);
        } catch (Throwable th2) {
            throw new ConfigException.BugOrBroken("Failed to load strategy: " + property, th2);
        }
    }

    public static Boolean o() {
        return Boolean.valueOf(Boolean.parseBoolean(System.getProperties().getProperty(f44719b)));
    }

    public static void p() {
        p.I();
        p.G();
        p.H();
    }

    public static ju.a q() {
        return r(a("load"));
    }

    public static ju.a r(ClassLoader classLoader) {
        return p.e(classLoader, "load", new CallableC0529a(classLoader, o.b().j(classLoader)));
    }

    public static ju.a s(ClassLoader classLoader, b bVar) {
        return y(classLoader, o.b(), bVar);
    }

    public static ju.a t(ClassLoader classLoader, String str) {
        return A(str, o.b().j(classLoader), b.b());
    }

    public static ju.a u(ClassLoader classLoader, String str, o oVar, b bVar) {
        return A(str, oVar.j(classLoader), bVar);
    }

    public static ju.a v(ClassLoader classLoader, ju.a aVar) {
        return w(classLoader, aVar, b.b());
    }

    public static ju.a w(ClassLoader classLoader, ju.a aVar, b bVar) {
        return f(classLoader).a((k) aVar).a((k) p.h(classLoader)).X(bVar);
    }

    public static ju.a x(ClassLoader classLoader, o oVar) {
        return D(oVar.j(classLoader));
    }

    public static ju.a y(ClassLoader classLoader, o oVar, b bVar) {
        return w(classLoader, d(m(oVar, "load")), bVar);
    }

    public static ju.a z(String str) {
        return A(str, o.b(), b.b());
    }
}
