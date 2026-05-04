package y10;

import n20.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d0 f99024a = new d0();

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final n20.c f99025b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final n20.b f99026c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final n20.b f99027d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final n20.b f99028e;

    static {
        n20.c cVar = new n20.c("kotlin.jvm.JvmField");
        f99025b = cVar;
        b.a aVar = n20.b.f74280d;
        f99026c = aVar.c(cVar);
        f99027d = aVar.c(new n20.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f99028e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    @w00.o
    @m80.k
    public static final String b(@m80.k String propertyName) {
        kotlin.jvm.internal.g0.p(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return ct.d.f46852f + m30.a.a(propertyName);
    }

    @w00.o
    public static final boolean c(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return u30.f0.J2(name, ct.d.f46852f, false, 2, null) || u30.f0.J2(name, "is", false, 2, null);
    }

    @w00.o
    public static final boolean d(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return u30.f0.J2(name, ct.d.f46854h, false, 2, null);
    }

    @w00.o
    @m80.k
    public static final String e(@m80.k String propertyName) {
        String a11;
        kotlin.jvm.internal.g0.p(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ct.d.f46854h);
        if (f(propertyName)) {
            a11 = propertyName.substring(2);
            kotlin.jvm.internal.g0.o(a11, "substring(...)");
        } else {
            a11 = m30.a.a(propertyName);
        }
        sb2.append(a11);
        return sb2.toString();
    }

    @w00.o
    public static final boolean f(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (!u30.f0.J2(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        return kotlin.jvm.internal.g0.t(97, charAt) > 0 || kotlin.jvm.internal.g0.t(charAt, 122) > 0;
    }

    @m80.k
    public final n20.b a() {
        return f99028e;
    }
}
