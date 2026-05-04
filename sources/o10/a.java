package o10;

import a00.h0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import n10.o;
import n20.b;
import u30.e0;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n49#1,2:220\n49#1,2:222\n49#1,2:224\n49#1,2:226\n49#1,2:228\n49#1,2:230\n49#1,2:232\n49#1,2:234\n1#2:219\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n54#1:220,2\n55#1:222,2\n56#1:224,2\n57#1:226,2\n58#1:228,2\n59#1:230,2\n60#1:232,2\n61#1:234,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f75522a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f75523b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f75524c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f75525d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f75526e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final n20.b f75527f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final n20.c f75528g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final n20.b f75529h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final n20.b f75530i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final n20.b f75531j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.d, n20.b> f75532k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.d, n20.b> f75533l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.d, n20.c> f75534m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.d, n20.c> f75535n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.b, n20.b> f75536o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final HashMap<n20.b, n20.b> f75537p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final List<C0920a> f75538q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o10.a$a, reason: collision with other inner class name */
    public static final class C0920a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final n20.b f75539a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final n20.b f75540b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final n20.b f75541c;

        public C0920a(@m80.k n20.b javaClass, @m80.k n20.b kotlinReadOnly, @m80.k n20.b kotlinMutable) {
            g0.p(javaClass, "javaClass");
            g0.p(kotlinReadOnly, "kotlinReadOnly");
            g0.p(kotlinMutable, "kotlinMutable");
            this.f75539a = javaClass;
            this.f75540b = kotlinReadOnly;
            this.f75541c = kotlinMutable;
        }

        @m80.k
        public final n20.b a() {
            return this.f75539a;
        }

        @m80.k
        public final n20.b b() {
            return this.f75540b;
        }

        @m80.k
        public final n20.b c() {
            return this.f75541c;
        }

        @m80.k
        public final n20.b d() {
            return this.f75539a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0920a)) {
                return false;
            }
            C0920a c0920a = (C0920a) obj;
            return g0.g(this.f75539a, c0920a.f75539a) && g0.g(this.f75540b, c0920a.f75540b) && g0.g(this.f75541c, c0920a.f75541c);
        }

        public int hashCode() {
            return (((this.f75539a.hashCode() * 31) + this.f75540b.hashCode()) * 31) + this.f75541c.hashCode();
        }

        @m80.k
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f75539a + ", kotlinReadOnly=" + this.f75540b + ", kotlinMutable=" + this.f75541c + ')';
        }
    }

    static {
        a aVar = new a();
        f75522a = aVar;
        StringBuilder sb2 = new StringBuilder();
        e.a aVar2 = e.a.f67204e;
        sb2.append(aVar2.b());
        sb2.append('.');
        sb2.append(aVar2.a());
        f75523b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        e.b bVar = e.b.f67205e;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f75524c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        e.d dVar = e.d.f67207e;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f75525d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        e.c cVar = e.c.f67206e;
        sb5.append(cVar.b());
        sb5.append('.');
        sb5.append(cVar.a());
        f75526e = sb5.toString();
        b.a aVar3 = n20.b.f74280d;
        n20.b c11 = aVar3.c(new n20.c("kotlin.jvm.functions.FunctionN"));
        f75527f = c11;
        f75528g = c11.a();
        n20.i iVar = n20.i.f74318a;
        f75529h = iVar.k();
        f75530i = iVar.j();
        f75531j = aVar.g(Class.class);
        f75532k = new HashMap<>();
        f75533l = new HashMap<>();
        f75534m = new HashMap<>();
        f75535n = new HashMap<>();
        f75536o = new HashMap<>();
        f75537p = new HashMap<>();
        n20.b c12 = aVar3.c(o.a.W);
        C0920a c0920a = new C0920a(aVar.g(Iterable.class), c12, new n20.b(c12.f(), n20.e.g(o.a.f74038e0, c12.f()), false));
        n20.b c13 = aVar3.c(o.a.V);
        C0920a c0920a2 = new C0920a(aVar.g(Iterator.class), c13, new n20.b(c13.f(), n20.e.g(o.a.f74036d0, c13.f()), false));
        n20.b c14 = aVar3.c(o.a.X);
        C0920a c0920a3 = new C0920a(aVar.g(Collection.class), c14, new n20.b(c14.f(), n20.e.g(o.a.f74040f0, c14.f()), false));
        n20.b c15 = aVar3.c(o.a.Y);
        C0920a c0920a4 = new C0920a(aVar.g(List.class), c15, new n20.b(c15.f(), n20.e.g(o.a.f74042g0, c15.f()), false));
        n20.b c16 = aVar3.c(o.a.f74030a0);
        C0920a c0920a5 = new C0920a(aVar.g(Set.class), c16, new n20.b(c16.f(), n20.e.g(o.a.f74046i0, c16.f()), false));
        n20.b c17 = aVar3.c(o.a.Z);
        C0920a c0920a6 = new C0920a(aVar.g(ListIterator.class), c17, new n20.b(c17.f(), n20.e.g(o.a.f74044h0, c17.f()), false));
        n20.c cVar2 = o.a.f74032b0;
        n20.b c18 = aVar3.c(cVar2);
        C0920a c0920a7 = new C0920a(aVar.g(Map.class), c18, new n20.b(c18.f(), n20.e.g(o.a.f74048j0, c18.f()), false));
        n20.b c19 = aVar3.c(cVar2);
        n20.f g11 = o.a.f74034c0.g();
        g0.o(g11, "shortName(...)");
        n20.b d11 = c19.d(g11);
        List<C0920a> Q = h0.Q(c0920a, c0920a2, c0920a3, c0920a4, c0920a5, c0920a6, c0920a7, new C0920a(aVar.g(Map.Entry.class), d11, new n20.b(d11.f(), n20.e.g(o.a.f74050k0, d11.f()), false)));
        f75538q = Q;
        aVar.f(Object.class, o.a.f74031b);
        aVar.f(String.class, o.a.f74043h);
        aVar.f(CharSequence.class, o.a.f74041g);
        aVar.e(Throwable.class, o.a.f74069u);
        aVar.f(Cloneable.class, o.a.f74035d);
        aVar.f(Number.class, o.a.f74063r);
        aVar.e(Comparable.class, o.a.f74071v);
        aVar.f(Enum.class, o.a.f74065s);
        aVar.e(Annotation.class, o.a.G);
        Iterator<C0920a> it = Q.iterator();
        while (it.hasNext()) {
            f75522a.d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            a aVar4 = f75522a;
            b.a aVar5 = n20.b.f74280d;
            n20.c wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            g0.o(wrapperFqName, "getWrapperFqName(...)");
            n20.b c21 = aVar5.c(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            g0.o(primitiveType, "getPrimitiveType(...)");
            aVar4.a(c21, aVar5.c(n10.o.c(primitiveType)));
        }
        for (n20.b bVar2 : n10.d.f73966a.a()) {
            f75522a.a(n20.b.f74280d.c(new n20.c("kotlin.jvm.internal." + bVar2.h().b() + "CompanionObject")), bVar2.d(n20.h.f74303d));
        }
        for (int i11 = 0; i11 < 23; i11++) {
            a aVar6 = f75522a;
            aVar6.a(n20.b.f74280d.c(new n20.c("kotlin.jvm.functions.Function" + i11)), n10.o.a(i11));
            aVar6.c(new n20.c(f75524c + i11), f75529h);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            e.c cVar3 = e.c.f67206e;
            f75522a.c(new n20.c((cVar3.b() + '.' + cVar3.a()) + i12), f75529h);
        }
        a aVar7 = f75522a;
        n20.c l11 = o.a.f74033c.l();
        g0.o(l11, "toSafe(...)");
        aVar7.c(l11, aVar7.g(Void.class));
    }

    public final void a(n20.b bVar, n20.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    public final void b(n20.b bVar, n20.b bVar2) {
        f75532k.put(bVar.a().j(), bVar2);
    }

    public final void c(n20.c cVar, n20.b bVar) {
        f75533l.put(cVar.j(), bVar);
    }

    public final void d(C0920a c0920a) {
        n20.b a11 = c0920a.a();
        n20.b b11 = c0920a.b();
        n20.b c11 = c0920a.c();
        a(a11, b11);
        c(c11.a(), a11);
        f75536o.put(c11, b11);
        f75537p.put(b11, c11);
        n20.c a12 = b11.a();
        n20.c a13 = c11.a();
        f75534m.put(c11.a().j(), a12);
        f75535n.put(a12.j(), a13);
    }

    public final void e(Class<?> cls, n20.c cVar) {
        a(g(cls), n20.b.f74280d.c(cVar));
    }

    public final void f(Class<?> cls, n20.d dVar) {
        n20.c l11 = dVar.l();
        g0.o(l11, "toSafe(...)");
        e(cls, l11);
    }

    public final n20.b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return n20.b.f74280d.c(new n20.c(cls.getCanonicalName()));
        }
        n20.b g11 = g(declaringClass);
        n20.f f11 = n20.f.f(cls.getSimpleName());
        g0.o(f11, "identifier(...)");
        return g11.d(f11);
    }

    @m80.k
    public final n20.c h() {
        return f75528g;
    }

    @m80.k
    public final List<C0920a> i() {
        return f75538q;
    }

    public final boolean j(n20.d dVar, String str) {
        Integer p12;
        String b11 = dVar.b();
        g0.o(b11, "asString(...)");
        if (!f0.J2(b11, str, false, 2, null)) {
            return false;
        }
        String substring = b11.substring(str.length());
        g0.o(substring, "substring(...)");
        return (k0.A5(substring, '0', false, 2, null) || (p12 = e0.p1(substring)) == null || p12.intValue() < 23) ? false : true;
    }

    public final boolean k(@m80.l n20.d dVar) {
        return f75534m.containsKey(dVar);
    }

    public final boolean l(@m80.l n20.d dVar) {
        return f75535n.containsKey(dVar);
    }

    @m80.l
    public final n20.b m(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        return f75532k.get(fqName.j());
    }

    @m80.l
    public final n20.b n(@m80.k n20.d kotlinFqName) {
        g0.p(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f75523b) ? f75527f : j(kotlinFqName, f75525d) ? f75527f : j(kotlinFqName, f75524c) ? f75529h : j(kotlinFqName, f75526e) ? f75529h : f75533l.get(kotlinFqName);
    }

    @m80.l
    public final n20.c o(@m80.l n20.d dVar) {
        return f75534m.get(dVar);
    }

    @m80.l
    public final n20.c p(@m80.l n20.d dVar) {
        return f75535n.get(dVar);
    }
}
