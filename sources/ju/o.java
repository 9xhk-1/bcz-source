package ju;

import com.typesafe.config.ConfigSyntax;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ConfigSyntax f64669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64670b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64671c;

    /* renamed from: d, reason: collision with root package name */
    public final d f64672d;

    /* renamed from: e, reason: collision with root package name */
    public final ClassLoader f64673e;

    public o(ConfigSyntax configSyntax, String str, boolean z11, d dVar, ClassLoader classLoader) {
        this.f64669a = configSyntax;
        this.f64670b = str;
        this.f64671c = z11;
        this.f64672d = dVar;
        this.f64673e = classLoader;
    }

    public static o b() {
        return new o(null, null, true, null, null);
    }

    public o a(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("null includer passed to appendIncluder");
        }
        d dVar2 = this.f64672d;
        return dVar2 == dVar ? this : dVar2 != null ? k(dVar2.d(dVar)) : k(dVar);
    }

    public boolean c() {
        return this.f64671c;
    }

    public ClassLoader d() {
        ClassLoader classLoader = this.f64673e;
        return classLoader == null ? Thread.currentThread().getContextClassLoader() : classLoader;
    }

    public d e() {
        return this.f64672d;
    }

    public String f() {
        return this.f64670b;
    }

    public ConfigSyntax g() {
        return this.f64669a;
    }

    public o h(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("null includer passed to prependIncluder");
        }
        d dVar2 = this.f64672d;
        return dVar2 == dVar ? this : dVar2 != null ? k(dVar.d(dVar2)) : k(dVar);
    }

    public o i(boolean z11) {
        return this.f64671c == z11 ? this : new o(this.f64669a, this.f64670b, z11, this.f64672d, this.f64673e);
    }

    public o j(ClassLoader classLoader) {
        return this.f64673e == classLoader ? this : new o(this.f64669a, this.f64670b, this.f64671c, this.f64672d, classLoader);
    }

    public o k(d dVar) {
        return this.f64672d == dVar ? this : new o(this.f64669a, this.f64670b, this.f64671c, dVar, this.f64673e);
    }

    public o l(String str) {
        String str2 = this.f64670b;
        return (str2 != str && (str2 == null || str == null || !str2.equals(str))) ? new o(this.f64669a, str, this.f64671c, this.f64672d, this.f64673e) : this;
    }

    public o m(ConfigSyntax configSyntax) {
        return this.f64669a == configSyntax ? this : new o(configSyntax, this.f64670b, this.f64671c, this.f64672d, this.f64673e);
    }

    public o n(String str) {
        return m(ku.q.l(str));
    }

    public o o(String str) {
        return this.f64670b == null ? l(str) : this;
    }
}
