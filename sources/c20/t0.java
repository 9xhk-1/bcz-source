package c20;

import a00.k1;
import a00.l1;
import e30.h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p10.c1;
import p10.j1;
import x20.c;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,408:1\n1485#2:409\n1510#2,3:410\n1513#2,3:420\n1557#2:423\n1628#2,3:424\n1557#2:427\n1628#2,3:428\n381#3,7:413\n*S KotlinDebug\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n*L\n129#1:409\n129#1:410,3\n129#1:420,3\n165#1:423\n165#1:424,3\n212#1:427\n212#1:428,3\n129#1:413,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class t0 extends x20.l {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f7617m = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(t0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(t0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(t0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b20.k f7618b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final t0 f7619c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.i<Collection<p10.h>> f7620d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.i<c> f7621e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final d30.g<n20.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.g>> f7622f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d30.h<n20.f, p10.q0> f7623g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final d30.g<n20.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.g>> f7624h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final d30.i f7625i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final d30.i f7626j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final d30.i f7627k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final d30.g<n20.f, List<p10.q0>> f7628l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final e30.r0 f7629a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final e30.r0 f7630b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<j1> f7631c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final List<c1> f7632d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7633e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final List<String> f7634f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k e30.r0 returnType, @m80.l e30.r0 r0Var, @m80.k List<? extends j1> valueParameters, @m80.k List<? extends c1> typeParameters, boolean z11, @m80.k List<String> errors) {
            kotlin.jvm.internal.g0.p(returnType, "returnType");
            kotlin.jvm.internal.g0.p(valueParameters, "valueParameters");
            kotlin.jvm.internal.g0.p(typeParameters, "typeParameters");
            kotlin.jvm.internal.g0.p(errors, "errors");
            this.f7629a = returnType;
            this.f7630b = r0Var;
            this.f7631c = valueParameters;
            this.f7632d = typeParameters;
            this.f7633e = z11;
            this.f7634f = errors;
        }

        @m80.k
        public final List<String> a() {
            return this.f7634f;
        }

        public final boolean b() {
            return this.f7633e;
        }

        @m80.l
        public final e30.r0 c() {
            return this.f7630b;
        }

        @m80.k
        public final e30.r0 d() {
            return this.f7629a;
        }

        @m80.k
        public final List<c1> e() {
            return this.f7632d;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f7629a, aVar.f7629a) && kotlin.jvm.internal.g0.g(this.f7630b, aVar.f7630b) && kotlin.jvm.internal.g0.g(this.f7631c, aVar.f7631c) && kotlin.jvm.internal.g0.g(this.f7632d, aVar.f7632d) && this.f7633e == aVar.f7633e && kotlin.jvm.internal.g0.g(this.f7634f, aVar.f7634f);
        }

        @m80.k
        public final List<j1> f() {
            return this.f7631c;
        }

        public int hashCode() {
            int hashCode = this.f7629a.hashCode() * 31;
            e30.r0 r0Var = this.f7630b;
            return ((((((((hashCode + (r0Var == null ? 0 : r0Var.hashCode())) * 31) + this.f7631c.hashCode()) * 31) + this.f7632d.hashCode()) * 31) + Boolean.hashCode(this.f7633e)) * 31) + this.f7634f.hashCode();
        }

        @m80.k
        public String toString() {
            return "MethodSignatureData(returnType=" + this.f7629a + ", receiverType=" + this.f7630b + ", valueParameters=" + this.f7631c + ", typeParameters=" + this.f7632d + ", hasStableParameterNames=" + this.f7633e + ", errors=" + this.f7634f + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<j1> f7635a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7636b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k List<? extends j1> descriptors, boolean z11) {
            kotlin.jvm.internal.g0.p(descriptors, "descriptors");
            this.f7635a = descriptors;
            this.f7636b = z11;
        }

        @m80.k
        public final List<j1> a() {
            return this.f7635a;
        }

        public final boolean b() {
            return this.f7636b;
        }
    }

    public /* synthetic */ t0(b20.k kVar, t0 t0Var, int i11, kotlin.jvm.internal.v vVar) {
        this(kVar, (i11 & 2) != 0 ? null : t0Var);
    }

    public static final p10.q0 G(t0 t0Var, n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        t0 t0Var2 = t0Var.f7619c;
        if (t0Var2 != null) {
            return t0Var2.f7623g.invoke(name);
        }
        f20.n d11 = t0Var.f7621e.invoke().d(name);
        if (d11 == null || d11.K()) {
            return null;
        }
        return t0Var.b0(d11);
    }

    public static final Collection H(t0 t0Var, n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        t0 t0Var2 = t0Var.f7619c;
        if (t0Var2 != null) {
            return t0Var2.f7622f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (f20.r rVar : t0Var.f7621e.invoke().f(name)) {
            a20.e a02 = t0Var.a0(rVar);
            if (t0Var.W(a02)) {
                t0Var.f7618b.a().h().a(rVar, a02);
                arrayList.add(a02);
            }
        }
        t0Var.z(arrayList, name);
        return arrayList;
    }

    public static final c I(t0 t0Var) {
        return t0Var.A();
    }

    public static final Set J(t0 t0Var) {
        return t0Var.y(x20.d.f97097v, null);
    }

    public static final Collection K(t0 t0Var, n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0Var.f7622f.invoke(name));
        t0Var.f0(linkedHashSet);
        t0Var.C(linkedHashSet, name);
        return a00.r0.a6(t0Var.f7618b.a().r().p(t0Var.f7618b, linkedHashSet));
    }

    public static final List X(t0 t0Var, n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        ArrayList arrayList = new ArrayList();
        o30.a.a(arrayList, t0Var.f7623g.invoke(name));
        t0Var.D(name, arrayList);
        return q20.h.t(t0Var.S()) ? a00.r0.a6(arrayList) : a00.r0.a6(t0Var.f7618b.a().r().p(t0Var.f7618b, arrayList));
    }

    public static final Set Y(t0 t0Var) {
        return t0Var.E(x20.d.f97098w, null);
    }

    public static final d30.j c0(t0 t0Var, f20.n nVar, Ref.ObjectRef objectRef) {
        return t0Var.f7618b.e().e(new j0(t0Var, nVar, objectRef));
    }

    public static final s20.g d0(t0 t0Var, f20.n nVar, Ref.ObjectRef objectRef) {
        return t0Var.f7618b.a().g().a(nVar, (p10.q0) objectRef.element);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.a g0(kotlin.reflect.jvm.internal.impl.descriptors.g selectMostSpecificInEachOverridableGroup) {
        kotlin.jvm.internal.g0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    public static final Collection u(t0 t0Var) {
        return t0Var.x(x20.d.f97090o, x20.k.f97116a.c());
    }

    public static final Set v(t0 t0Var) {
        return t0Var.w(x20.d.f97095t, null);
    }

    @m80.k
    public abstract c A();

    @m80.k
    public final e30.r0 B(@m80.k f20.r method, @m80.k b20.k c11) {
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(c11, "c");
        return c11.g().p(method.getReturnType(), d20.b.b(TypeUsage.COMMON, method.D().p(), false, null, 6, null));
    }

    public abstract void C(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> collection, @m80.k n20.f fVar);

    public abstract void D(@m80.k n20.f fVar, @m80.k Collection<p10.q0> collection);

    @m80.k
    public abstract Set<n20.f> E(@m80.k x20.d dVar, @m80.l x00.l<? super n20.f, Boolean> lVar);

    public final s10.k0 F(f20.n nVar) {
        a20.f b12 = a20.f.b1(S(), b20.h.a(this.f7618b, nVar), Modality.FINAL, y10.n0.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f7618b.a().t().a(nVar), V(nVar));
        kotlin.jvm.internal.g0.o(b12, "create(...)");
        return b12;
    }

    @m80.k
    public final d30.i<Collection<p10.h>> L() {
        return this.f7620d;
    }

    @m80.k
    public final b20.k M() {
        return this.f7618b;
    }

    public final Set<n20.f> N() {
        return (Set) d30.m.a(this.f7627k, this, f7617m[2]);
    }

    @m80.k
    public final d30.i<c> O() {
        return this.f7621e;
    }

    @m80.l
    public abstract p10.t0 P();

    public final Set<n20.f> Q() {
        return (Set) d30.m.a(this.f7625i, this, f7617m[0]);
    }

    @m80.l
    public final t0 R() {
        return this.f7619c;
    }

    @m80.k
    public abstract p10.h S();

    public final Set<n20.f> T() {
        return (Set) d30.m.a(this.f7626j, this, f7617m[1]);
    }

    public final e30.r0 U(f20.n nVar) {
        e30.r0 p11 = this.f7618b.g().p(nVar.getType(), d20.b.b(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!n10.j.s0(p11) && !n10.j.v0(p11)) || !V(nVar) || !nVar.C()) {
            return p11;
        }
        e30.r0 n11 = h2.n(p11);
        kotlin.jvm.internal.g0.o(n11, "makeNotNullable(...)");
        return n11;
    }

    public final boolean V(f20.n nVar) {
        return nVar.isFinal() && nVar.j();
    }

    public boolean W(@m80.k a20.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        return true;
    }

    @m80.k
    public abstract a Z(@m80.k f20.r rVar, @m80.k List<? extends c1> list, @m80.k e30.r0 r0Var, @m80.k List<? extends j1> list2);

    @Override // x20.l, x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return !b().contains(name) ? a00.h0.J() : this.f7624h.invoke(name);
    }

    @m80.k
    public final a20.e a0(@m80.k f20.r method) {
        kotlin.jvm.internal.g0.p(method, "method");
        a20.e k12 = a20.e.k1(S(), b20.h.a(this.f7618b, method), method.getName(), this.f7618b.a().t().a(method), this.f7621e.invoke().b(method.getName()) != null && method.g().isEmpty());
        kotlin.jvm.internal.g0.o(k12, "createJavaMethod(...)");
        b20.k i11 = b20.c.i(this.f7618b, k12, method, 0, 4, null);
        List<f20.y> typeParameters = method.getTypeParameters();
        List<? extends c1> arrayList = new ArrayList<>(a00.i0.d0(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            c1 a11 = i11.f().a((f20.y) it.next());
            kotlin.jvm.internal.g0.m(a11);
            arrayList.add(a11);
        }
        b e02 = e0(i11, k12, method.g());
        a Z = Z(method, arrayList, B(method, i11), e02.a());
        e30.r0 c11 = Z.c();
        k12.j1(c11 != null ? q20.g.i(k12, c11, q10.g.A0.b()) : null, P(), a00.h0.J(), Z.e(), Z.f(), Z.d(), Modality.Companion.a(false, method.isAbstract(), !method.isFinal()), y10.n0.d(method.getVisibility()), Z.c() != null ? k1.k(h1.a(a20.e.G, a00.r0.G2(e02.a()))) : l1.z());
        k12.n1(Z.b(), e02.b());
        if (!Z.a().isEmpty()) {
            i11.a().s().a(k12, Z.a());
        }
        return k12;
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> b() {
        return Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, s10.k0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, s10.k0] */
    public final p10.q0 b0(f20.n nVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? F = F(nVar);
        objectRef.element = F;
        F.R0(null, null, null, null);
        ((s10.k0) objectRef.element).X0(U(nVar), a00.h0.J(), P(), null, a00.h0.J());
        p10.h S = S();
        p10.b bVar = S instanceof p10.b ? (p10.b) S : null;
        if (bVar != null) {
            objectRef.element = this.f7618b.a().w().f(bVar, (s10.k0) objectRef.element, this.f7618b);
        }
        T t11 = objectRef.element;
        if (q20.h.K((p10.l1) t11, ((s10.k0) t11).getType())) {
            ((s10.k0) objectRef.element).H0(new i0(this, nVar, objectRef));
        }
        this.f7618b.a().h().e(nVar, (p10.q0) objectRef.element);
        return (p10.q0) objectRef.element;
    }

    @Override // x20.l, x20.k
    @m80.k
    public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return !d().contains(name) ? a00.h0.J() : this.f7628l.invoke(name);
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> d() {
        return T();
    }

    @m80.k
    public final b e0(@m80.k b20.k c11, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m80.k List<? extends f20.b0> jValueParameters) {
        Pair a11;
        n20.f name;
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.reflect.jvm.internal.impl.descriptors.e function = eVar;
        kotlin.jvm.internal.g0.p(function, "function");
        kotlin.jvm.internal.g0.p(jValueParameters, "jValueParameters");
        Iterable<a00.a1> m62 = a00.r0.m6(jValueParameters);
        ArrayList arrayList = new ArrayList(a00.i0.d0(m62, 10));
        boolean z11 = false;
        for (a00.a1 a1Var : m62) {
            int a12 = a1Var.a();
            f20.b0 b0Var = (f20.b0) a1Var.b();
            q10.g a13 = b20.h.a(c11, b0Var);
            d20.a b11 = d20.b.b(TypeUsage.COMMON, false, false, null, 7, null);
            if (b0Var.b()) {
                f20.x type = b0Var.getType();
                f20.f fVar = type instanceof f20.f ? (f20.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
                e30.r0 l11 = c11.g().l(fVar, b11, true);
                a11 = h1.a(l11, c11.d().q().k(l11));
            } else {
                a11 = h1.a(c11.g().p(b0Var.getType(), b11), null);
            }
            e30.r0 r0Var = (e30.r0) a11.component1();
            e30.r0 r0Var2 = (e30.r0) a11.component2();
            if (kotlin.jvm.internal.g0.g(function.getName().b(), "equals") && jValueParameters.size() == 1 && kotlin.jvm.internal.g0.g(c11.d().q().I(), r0Var)) {
                name = n20.f.f("other");
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z11 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(a12);
                    name = n20.f.f(sb2.toString());
                    kotlin.jvm.internal.g0.o(name, "identifier(...)");
                }
            }
            boolean z12 = z11;
            kotlin.jvm.internal.g0.m(name);
            arrayList.add(new s10.u0(function, null, a12, a13, name, r0Var, false, false, false, r0Var2, c11.a().t().a(b0Var)));
            function = eVar;
            z11 = z12;
        }
        return new b(a00.r0.a6(arrayList), z11);
    }

    @Override // x20.l, x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        return this.f7620d.invoke();
    }

    public final void f0(Set<kotlin.reflect.jvm.internal.impl.descriptors.g> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c11 = h20.c0.c((kotlin.reflect.jvm.internal.impl.descriptors.g) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c11, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> b11 = q20.o.b(list2, s0.f7614a);
                set.removeAll(list2);
                set.addAll(b11);
            }
        }
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> g() {
        return N();
    }

    @m80.k
    public String toString() {
        return "Lazy scope for " + S();
    }

    @m80.k
    public abstract Set<n20.f> w(@m80.k x20.d dVar, @m80.l x00.l<? super n20.f, Boolean> lVar);

    @m80.k
    public final List<p10.h> x(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(x20.d.f97078c.c())) {
            for (n20.f fVar : w(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    o30.a.a(linkedHashSet, h(fVar, noLookupLocation));
                }
            }
        }
        if (kindFilter.a(x20.d.f97078c.d()) && !kindFilter.l().contains(c.a.f97075a)) {
            for (n20.f fVar2 : y(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, noLookupLocation));
                }
            }
        }
        if (kindFilter.a(x20.d.f97078c.i()) && !kindFilter.l().contains(c.a.f97075a)) {
            for (n20.f fVar3 : E(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, noLookupLocation));
                }
            }
        }
        return a00.r0.a6(linkedHashSet);
    }

    @m80.k
    public abstract Set<n20.f> y(@m80.k x20.d dVar, @m80.l x00.l<? super n20.f, Boolean> lVar);

    public void z(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> result, @m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(name, "name");
    }

    public t0(@m80.k b20.k c11, @m80.l t0 t0Var) {
        kotlin.jvm.internal.g0.p(c11, "c");
        this.f7618b = c11;
        this.f7619c = t0Var;
        this.f7620d = c11.e().d(new h0(this), a00.h0.J());
        this.f7621e = c11.e().f(new k0(this));
        this.f7622f = c11.e().b(new l0(this));
        this.f7623g = c11.e().h(new m0(this));
        this.f7624h = c11.e().b(new n0(this));
        this.f7625i = c11.e().f(new o0(this));
        this.f7626j = c11.e().f(new p0(this));
        this.f7627k = c11.e().f(new q0(this));
        this.f7628l = c11.e().b(new r0(this));
    }
}
