package c20;

import a00.k1;
import a00.x1;
import c20.t0;
import e30.h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import o30.l;
import p10.c1;
import p10.j1;
import y10.r;
import z10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n1#1,890:1\n1454#2,5:891\n1755#2,2:896\n1755#2,3:898\n1757#2:901\n1611#2,9:902\n1863#2:911\n1864#2:913\n1620#2:914\n1755#2,3:915\n1557#2:918\n1628#2,3:919\n827#2:922\n855#2,2:923\n774#2:925\n865#2,2:926\n1755#2,3:928\n1755#2,3:931\n2632#2,3:935\n774#2:938\n865#2,2:939\n774#2:941\n865#2,2:942\n1557#2:944\n1628#2,3:945\n2632#2,3:948\n295#2,2:951\n1557#2:953\n1628#2,3:954\n1454#2,5:957\n2632#2,3:962\n1368#2:965\n1454#2,2:966\n1557#2:968\n1628#2,3:969\n1456#2,3:972\n1557#2:975\n1628#2,3:976\n3193#2,10:979\n1454#2,5:989\n2632#2,3:994\n774#2:998\n865#2,2:999\n1202#2,2:1001\n1230#2,4:1003\n1#3:912\n1#3:934\n58#4:997\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n*L\n74#1:891,5\n160#1:896,2\n161#1:898,3\n160#1:901\n189#1:902,9\n189#1:911\n189#1:913\n189#1:914\n193#1:915,3\n199#1:918\n199#1:919,3\n202#1:922\n202#1:923,2\n211#1:925\n211#1:926,2\n216#1:928,3\n222#1:931,3\n322#1:935,3\n327#1:938\n327#1:939,2\n354#1:941\n354#1:942,2\n376#1:944\n376#1:945,3\n461#1:948,3\n470#1:951,2\n476#1:953\n476#1:954,3\n489#1:957,5\n495#1:962,3\n649#1:965\n649#1:966,2\n650#1:968\n650#1:969,3\n649#1:972,3\n698#1:975\n698#1:976,3\n749#1:979,10\n879#1:989,5\n95#1:994,3\n811#1:998\n811#1:999,2\n811#1:1001,2\n811#1:1003,4\n189#1:912\n105#1:997\n*E\n"})
/* loaded from: classes8.dex */
public final class z extends t0 {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final p10.b f7648n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final f20.g f7649o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7650p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final d30.i<List<kotlin.reflect.jvm.internal.impl.descriptors.b>> f7651q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final d30.i<Set<n20.f>> f7652r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final d30.i<Set<n20.f>> f7653s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final d30.i<Map<n20.f, f20.n>> f7654t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final d30.h<n20.f, p10.b> f7655u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReference implements x00.l<n20.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> {
        public a(Object obj) {
            super(1, obj);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> invoke(n20.f p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return ((z) this.receiver).q1(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return kotlin.jvm.internal.o0.d(z.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReference implements x00.l<n20.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> invoke(n20.f p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return ((z) this.receiver).r1(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return kotlin.jvm.internal.o0.d(z.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public /* synthetic */ z(b20.k kVar, p10.b bVar, f20.g gVar, boolean z11, z zVar, int i11, kotlin.jvm.internal.v vVar) {
        this(kVar, bVar, gVar, z11, (i11 & 16) != 0 ? null : zVar);
    }

    public static final boolean A0(f20.q it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return !it.j();
    }

    public static final Collection B0(z zVar, n20.f it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return zVar.q1(it);
    }

    public static final Collection C0(z zVar, n20.f it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return zVar.r1(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    public static final List E0(z zVar, b20.k kVar) {
        Collection<f20.k> f11 = zVar.f7649o.f();
        ArrayList arrayList = new ArrayList(f11.size());
        Iterator<f20.k> it = f11.iterator();
        while (it.hasNext()) {
            arrayList.add(zVar.o1(it.next()));
        }
        if (zVar.f7649o.G()) {
            kotlin.reflect.jvm.internal.impl.descriptors.b H0 = zVar.H0();
            String c11 = h20.c0.c(H0, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.g0.g(h20.c0.c((kotlin.reflect.jvm.internal.impl.descriptors.b) it2.next(), false, false, 2, null), c11)) {
                        break;
                    }
                }
            }
            arrayList.add(H0);
            kVar.a().h().c(zVar.f7649o, H0);
        }
        kVar.a().w().d(zVar.S(), arrayList, kVar);
        g20.b1 r11 = kVar.a().r();
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = a00.h0.R(zVar.G0());
        }
        return a00.r0.a6(r11.p(kVar, arrayList2));
    }

    public static /* synthetic */ a20.f M0(z zVar, f20.r rVar, e30.r0 r0Var, Modality modality, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            r0Var = null;
        }
        return zVar.L0(rVar, r0Var, modality);
    }

    public static final Map V0(z zVar) {
        Collection<f20.n> fields = zVar.f7649o.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((f20.n) obj).K()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((f20.n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    public static final Set Z0(b20.k kVar, z zVar) {
        return a00.r0.f6(kVar.a().w().g(zVar.S(), kVar));
    }

    public static final Collection h1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, z zVar, n20.f accessorName) {
        kotlin.jvm.internal.g0.p(accessorName, "accessorName");
        return kotlin.jvm.internal.g0.g(gVar.getName(), accessorName) ? a00.g0.l(gVar) : a00.r0.I4(zVar.q1(accessorName), zVar.r1(accessorName));
    }

    public static final Set i1(z zVar) {
        return a00.r0.f6(zVar.f7649o.u());
    }

    public static final p10.b j1(z zVar, b20.k kVar, n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (zVar.f7652r.invoke().contains(name)) {
            y10.r d11 = kVar.a().d();
            n20.b n11 = u20.e.n(zVar.S());
            kotlin.jvm.internal.g0.m(n11);
            f20.g b11 = d11.b(new r.a(n11.d(name), null, zVar.f7649o, 2, null));
            if (b11 == null) {
                return null;
            }
            n nVar = new n(kVar, zVar.S(), b11, null, 8, null);
            kVar.a().e().a(nVar);
            return nVar;
        }
        if (!zVar.f7653s.invoke().contains(name)) {
            f20.n nVar2 = zVar.f7654t.invoke().get(name);
            if (nVar2 == null) {
                return null;
            }
            return s10.q.G0(kVar.e(), zVar.S(), name, kVar.e().f(new y(zVar)), b20.h.a(kVar, nVar2), kVar.a().t().a(nVar2));
        }
        List<p10.b> j11 = a00.g0.j();
        kVar.a().w().c(zVar.S(), name, j11, kVar);
        List b12 = a00.g0.b(j11);
        int size = b12.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (p10.b) a00.r0.m5(b12);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + b12).toString());
    }

    public static final Set k1(z zVar) {
        return x1.C(zVar.b(), zVar.d());
    }

    @Override // c20.t0
    public void C(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> result, @m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(name, "name");
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g> c12 = c1(name);
        if (!SpecialGenericSignatures.f67253a.k(name) && !kotlin.reflect.jvm.internal.impl.load.java.b.f67273o.n(name)) {
            Set<kotlin.reflect.jvm.internal.impl.descriptors.g> set = c12;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.e) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (g1((kotlin.reflect.jvm.internal.impl.descriptors.g) obj)) {
                    arrayList.add(obj);
                }
            }
            u0(result, name, arrayList, false);
            return;
        }
        o30.l a11 = o30.l.f75704c.a();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> d11 = z10.a.d(name, c12, a00.h0.J(), S(), a30.v.f1864a, M().a().k().c());
        kotlin.jvm.internal.g0.o(d11, "resolveOverridesForNonStaticMembers(...)");
        v0(name, result, d11, result, new a(this));
        v0(name, result, d11, a11, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : c12) {
            if (g1((kotlin.reflect.jvm.internal.impl.descriptors.g) obj2)) {
                arrayList2.add(obj2);
            }
        }
        u0(result, name, a00.r0.I4(arrayList2, a11), true);
    }

    @Override // c20.t0
    public void D(@m80.k n20.f name, @m80.k Collection<p10.q0> result) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(result, "result");
        if (this.f7649o.p()) {
            x0(name, result);
        }
        Set<p10.q0> e12 = e1(name);
        if (e12.isEmpty()) {
            return;
        }
        l.b bVar = o30.l.f75704c;
        o30.l a11 = bVar.a();
        o30.l a12 = bVar.a();
        w0(e12, result, a11, new w(this));
        w0(x1.x(e12, a11), a12, null, new x(this));
        Collection<? extends p10.q0> d11 = z10.a.d(name, x1.C(e12, a12), result, S(), M().a().c(), M().a().k().c());
        kotlin.jvm.internal.g0.o(d11, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(d11);
    }

    public final Collection<e30.r0> D0() {
        if (!this.f7650p) {
            return M().a().k().d().g(S());
        }
        Collection<e30.r0> c11 = S().o().c();
        kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
        return c11;
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> E(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        if (this.f7649o.p()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(O().invoke().e());
        Collection<e30.r0> c11 = S().o().c();
        kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            a00.m0.s0(linkedHashSet, ((e30.r0) it.next()).r().d());
        }
        return linkedHashSet;
    }

    public final List<j1> F0(s10.i iVar) {
        s10.i iVar2;
        Pair pair;
        Collection<f20.r> v11 = this.f7649o.v();
        ArrayList arrayList = new ArrayList(v11.size());
        d20.a b11 = d20.b.b(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : v11) {
            if (kotlin.jvm.internal.g0.g(((f20.r) obj).getName(), y10.e0.f99032c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<f20.r> list2 = (List) pair2.component2();
        list.size();
        f20.r rVar = (f20.r) a00.r0.L2(list);
        if (rVar != null) {
            f20.x returnType = rVar.getReturnType();
            if (returnType instanceof f20.f) {
                f20.f fVar = (f20.f) returnType;
                pair = new Pair(M().g().l(fVar, b11, true), M().g().p(fVar.o(), b11));
            } else {
                pair = new Pair(M().g().p(returnType, b11), null);
            }
            e30.r0 r0Var = (e30.r0) pair.component1();
            e30.r0 r0Var2 = (e30.r0) pair.component2();
            iVar2 = iVar;
            t0(arrayList, iVar2, 0, rVar, r0Var, r0Var2);
        } else {
            iVar2 = iVar;
        }
        int i11 = 0;
        int i12 = rVar == null ? 0 : 1;
        for (f20.r rVar2 : list2) {
            t0(arrayList, iVar2, i11 + i12, rVar2, M().g().p(rVar2.getReturnType(), b11), null);
            i11++;
        }
        return arrayList;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.b G0() {
        boolean p11 = this.f7649o.p();
        if ((this.f7649o.L() || !this.f7649o.H()) && !p11) {
            return null;
        }
        p10.b S = S();
        a20.b o12 = a20.b.o1(S, q10.g.A0.b(), true, M().a().t().a(this.f7649o));
        kotlin.jvm.internal.g0.o(o12, "createJavaConstructor(...)");
        List<j1> F0 = p11 ? F0(o12) : Collections.EMPTY_LIST;
        o12.U0(false);
        o12.l1(F0, a1(S));
        o12.T0(true);
        o12.b1(S.s());
        M().a().h().c(this.f7649o, o12);
        return o12;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.b H0() {
        p10.b S = S();
        a20.b o12 = a20.b.o1(S, q10.g.A0.b(), true, M().a().t().a(this.f7649o));
        kotlin.jvm.internal.g0.o(o12, "createJavaConstructor(...)");
        List<j1> N0 = N0(o12);
        o12.U0(false);
        o12.l1(N0, a1(S));
        o12.T0(false);
        o12.b1(S.s());
        return o12;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g I0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection) {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return gVar;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 : collection2) {
            if (!kotlin.jvm.internal.g0.g(gVar, gVar2) && gVar2.w0() == null && R0(gVar2, aVar)) {
                kotlin.reflect.jvm.internal.impl.descriptors.g build = gVar.n().c().build();
                kotlin.jvm.internal.g0.m(build);
                return build;
            }
        }
        return gVar;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g J0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        Object obj;
        n20.f name = eVar.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f1((kotlin.reflect.jvm.internal.impl.descriptors.g) obj, eVar)) {
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) obj;
        if (gVar == null) {
            return null;
        }
        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> n11 = gVar.n();
        List<j1> g11 = eVar.g();
        kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
        List<j1> list = g11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((j1) it2.next()).getType());
        }
        List<j1> g12 = gVar.g();
        kotlin.jvm.internal.g0.o(g12, "getValueParameters(...)");
        n11.k(a20.h.a(arrayList, g12, eVar));
        n11.t();
        n11.d();
        n11.b(a20.e.H, Boolean.TRUE);
        return n11.build();
    }

    public final a20.f K0(p10.q0 q0Var, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        s10.m0 m0Var = null;
        if (!Q0(q0Var, lVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g X0 = X0(q0Var, lVar);
        kotlin.jvm.internal.g0.m(X0);
        if (q0Var.E()) {
            gVar = Y0(q0Var, lVar);
            kotlin.jvm.internal.g0.m(gVar);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.k();
            X0.k();
        }
        a20.d dVar = new a20.d(S(), X0, gVar, q0Var);
        e30.r0 returnType = X0.getReturnType();
        kotlin.jvm.internal.g0.m(returnType);
        dVar.X0(returnType, a00.h0.J(), P(), null, a00.h0.J());
        s10.l0 k11 = q20.g.k(dVar, X0.getAnnotations(), false, false, false, X0.getSource());
        k11.I0(X0);
        k11.L0(dVar.getType());
        kotlin.jvm.internal.g0.o(k11, "apply(...)");
        if (gVar != null) {
            List<j1> g11 = gVar.g();
            kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
            j1 j1Var = (j1) a00.r0.L2(g11);
            if (j1Var == null) {
                throw new AssertionError("No parameter found for " + gVar);
            }
            m0Var = q20.g.m(dVar, gVar.getAnnotations(), j1Var.getAnnotations(), false, false, false, gVar.getVisibility(), gVar.getSource());
            m0Var.I0(gVar);
        }
        dVar.Q0(k11, m0Var);
        return dVar;
    }

    public final a20.f L0(f20.r rVar, e30.r0 r0Var, Modality modality) {
        a20.f fVar;
        z zVar;
        e30.r0 r0Var2;
        a20.f b12 = a20.f.b1(S(), b20.h.a(M(), rVar), modality, y10.n0.d(rVar.getVisibility()), false, rVar.getName(), M().a().t().a(rVar), false);
        kotlin.jvm.internal.g0.o(b12, "create(...)");
        s10.l0 d11 = q20.g.d(b12, q10.g.A0.b());
        kotlin.jvm.internal.g0.o(d11, "createDefaultGetter(...)");
        b12.Q0(d11, null);
        if (r0Var == null) {
            b20.k i11 = b20.c.i(M(), b12, rVar, 0, 4, null);
            fVar = b12;
            zVar = this;
            r0Var2 = zVar.B(rVar, i11);
        } else {
            fVar = b12;
            zVar = this;
            r0Var2 = r0Var;
        }
        fVar.X0(r0Var2, a00.h0.J(), zVar.P(), null, a00.h0.J());
        d11.L0(r0Var2);
        return fVar;
    }

    public final List<j1> N0(s10.i iVar) {
        Collection<f20.w> E = this.f7649o.E();
        ArrayList arrayList = new ArrayList(E.size());
        d20.a b11 = d20.b.b(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<T> it = E.iterator();
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (!it.hasNext()) {
                return arrayList;
            }
            i11 = i12 + 1;
            f20.w wVar = (f20.w) it.next();
            e30.r0 p11 = M().g().p(wVar.getType(), b11);
            arrayList.add(new s10.u0(iVar, null, i12, q10.g.A0.b(), wVar.getName(), p11, false, false, false, wVar.b() ? M().a().m().q().k(p11) : null, M().a().t().a(wVar)));
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g O0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, n20.f fVar) {
        e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> n11 = gVar.n();
        n11.p(fVar);
        n11.t();
        n11.d();
        kotlin.reflect.jvm.internal.impl.descriptors.g build = n11.build();
        kotlin.jvm.internal.g0.m(build);
        return build;
    }

    @Override // c20.t0
    @m80.l
    public p10.t0 P() {
        return q20.h.l(S());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.g P0(kotlin.reflect.jvm.internal.impl.descriptors.g r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Object r0 = a00.r0.A3(r0)
            p10.j1 r0 = (p10.j1) r0
            r2 = 0
            if (r0 == 0) goto L7d
            e30.r0 r3 = r0.getType()
            e30.u1 r3 = r3.I0()
            p10.d r3 = r3.r()
            if (r3 == 0) goto L35
            n20.d r3 = u20.e.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            n20.c r3 = r3.l()
            goto L36
        L35:
            r3 = r2
        L36:
            n20.c r4 = n10.o.f74024v
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.e$a r2 = r6.n()
            java.util.List r6 = r6.g()
            kotlin.jvm.internal.g0.o(r6, r1)
            r1 = 1
            java.util.List r6 = a00.r0.h2(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.e$a r6 = r2.k(r6)
            e30.r0 r0 = r0.getType()
            java.util.List r0 = r0.G0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            e30.a2 r0 = (e30.a2) r0
            e30.r0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.e$a r6 = r6.j(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.g r6 = (kotlin.reflect.jvm.internal.impl.descriptors.g) r6
            r0 = r6
            s10.o0 r0 = (s10.o0) r0
            if (r0 == 0) goto L7c
            r0.c1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c20.z.P0(kotlin.reflect.jvm.internal.impl.descriptors.g):kotlin.reflect.jvm.internal.impl.descriptors.g");
    }

    public final boolean Q0(p10.q0 q0Var, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        if (d.a(q0Var)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g X0 = X0(q0Var, lVar);
        kotlin.reflect.jvm.internal.impl.descriptors.g Y0 = Y0(q0Var, lVar);
        if (X0 == null) {
            return false;
        }
        if (q0Var.E()) {
            return Y0 != null && Y0.k() == X0.k();
        }
        return true;
    }

    public final boolean R0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result c11 = OverridingUtil.f67634f.F(aVar2, aVar, true).c();
        kotlin.jvm.internal.g0.o(c11, "getResult(...)");
        return c11 == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !kotlin.reflect.jvm.internal.impl.load.java.c.f67274a.a(aVar2, aVar);
    }

    public final boolean S0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f67253a;
        n20.f name = gVar.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        n20.f b11 = aVar.b(name);
        if (b11 == null) {
            return false;
        }
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g> c12 = c1(b11);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c12) {
            if (kotlin.reflect.jvm.internal.impl.load.java.d.d((kotlin.reflect.jvm.internal.impl.descriptors.g) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g O0 = O0(gVar, b11);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (T0((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next(), O0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean T0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (kotlin.reflect.jvm.internal.impl.load.java.a.f67272o.m(gVar)) {
            eVar = eVar.a();
        }
        kotlin.jvm.internal.g0.m(eVar);
        return R0(eVar, gVar);
    }

    public final boolean U0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g P0 = P0(gVar);
        if (P0 == null) {
            return false;
        }
        n20.f name = gVar.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g> c12 = c1(name);
        if ((c12 instanceof Collection) && c12.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 : c12) {
            if (gVar2.isSuspend() && R0(P0, gVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // c20.t0
    public boolean W(@m80.k a20.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        if (this.f7649o.p()) {
            return false;
        }
        return g1(eVar);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g W0(p10.q0 q0Var, String str, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        n20.f f11 = n20.f.f(str);
        kotlin.jvm.internal.g0.o(f11, "identifier(...)");
        Iterator<T> it = lVar.invoke(f11).iterator();
        do {
            gVar = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) it.next();
            if (gVar2.g().size() == 0) {
                f30.e eVar = f30.e.f50430a;
                e30.r0 returnType = gVar2.getReturnType();
                if (returnType == null ? false : eVar.a(returnType, q0Var.getType())) {
                    gVar = gVar2;
                }
            }
        } while (gVar == null);
        return gVar;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g X0(p10.q0 q0Var, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        p10.r0 getter = q0Var.getGetter();
        p10.r0 r0Var = getter != null ? (p10.r0) kotlin.reflect.jvm.internal.impl.load.java.d.g(getter) : null;
        String b11 = r0Var != null ? y10.j.f99093a.b(r0Var) : null;
        if (b11 != null && !kotlin.reflect.jvm.internal.impl.load.java.d.l(S(), r0Var)) {
            return W0(q0Var, b11, lVar);
        }
        String b12 = q0Var.getName().b();
        kotlin.jvm.internal.g0.o(b12, "asString(...)");
        return W0(q0Var, y10.d0.b(b12), lVar);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g Y0(p10.q0 q0Var, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        e30.r0 returnType;
        String b11 = q0Var.getName().b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        n20.f f11 = n20.f.f(y10.d0.e(b11));
        kotlin.jvm.internal.g0.o(f11, "identifier(...)");
        Iterator<T> it = lVar.invoke(f11).iterator();
        do {
            gVar = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) it.next();
            if (gVar2.g().size() == 1 && (returnType = gVar2.getReturnType()) != null && n10.j.C0(returnType)) {
                f30.e eVar = f30.e.f50430a;
                List<j1> g11 = gVar2.g();
                kotlin.jvm.internal.g0.o(g11, "getValueParameters(...)");
                if (eVar.b(((j1) a00.r0.m5(g11)).getType(), q0Var.getType())) {
                    gVar = gVar2;
                }
            }
        } while (gVar == null);
        return gVar;
    }

    @Override // c20.t0
    @m80.k
    public t0.a Z(@m80.k f20.r method, @m80.k List<? extends c1> methodTypeParameters, @m80.k e30.r0 returnType, @m80.k List<? extends j1> valueParameters) {
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.g0.p(returnType, "returnType");
        kotlin.jvm.internal.g0.p(valueParameters, "valueParameters");
        o.b b11 = M().a().s().b(method, S(), returnType, null, valueParameters, methodTypeParameters);
        kotlin.jvm.internal.g0.o(b11, "resolvePropagatedSignature(...)");
        e30.r0 d11 = b11.d();
        kotlin.jvm.internal.g0.o(d11, "getReturnType(...)");
        e30.r0 c11 = b11.c();
        List<j1> f11 = b11.f();
        kotlin.jvm.internal.g0.o(f11, "getValueParameters(...)");
        List<c1> e11 = b11.e();
        kotlin.jvm.internal.g0.o(e11, "getTypeParameters(...)");
        boolean g11 = b11.g();
        List<String> b12 = b11.b();
        kotlin.jvm.internal.g0.o(b12, "getErrors(...)");
        return new t0.a(d11, c11, f11, e11, g11, b12);
    }

    @Override // c20.t0, x20.l, x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        return super.a(name, location);
    }

    public final p10.p a1(p10.b bVar) {
        p10.p visibility = bVar.getVisibility();
        kotlin.jvm.internal.g0.o(visibility, "getVisibility(...)");
        if (!kotlin.jvm.internal.g0.g(visibility, y10.v.f99116b)) {
            return visibility;
        }
        p10.p PROTECTED_AND_PACKAGE = y10.v.f99117c;
        kotlin.jvm.internal.g0.o(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    @m80.k
    public final d30.i<List<kotlin.reflect.jvm.internal.impl.descriptors.b>> b1() {
        return this.f7651q;
    }

    @Override // c20.t0, x20.l, x20.k
    @m80.k
    public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        return super.c(name, location);
    }

    public final Set<kotlin.reflect.jvm.internal.impl.descriptors.g> c1(n20.f fVar) {
        Collection<e30.r0> D0 = D0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = D0.iterator();
        while (it.hasNext()) {
            a00.m0.s0(linkedHashSet, ((e30.r0) it.next()).r().a(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // c20.t0
    @m80.k
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public p10.b S() {
        return this.f7648n;
    }

    @Override // x20.l, x20.n
    public void e(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        w10.a.a(M().a().l(), location, S(), name);
    }

    public final Set<p10.q0> e1(n20.f fVar) {
        Collection<e30.r0> D0 = D0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = D0.iterator();
        while (it.hasNext()) {
            Collection<? extends p10.q0> c11 = ((e30.r0) it.next()).r().c(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(c11, 10));
            Iterator<T> it2 = c11.iterator();
            while (it2.hasNext()) {
                arrayList2.add((p10.q0) it2.next());
            }
            a00.m0.s0(arrayList, arrayList2);
        }
        return a00.r0.f6(arrayList);
    }

    public final boolean f1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        String c11 = h20.c0.c(gVar, false, false, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = eVar.a();
        kotlin.jvm.internal.g0.o(a11, "getOriginal(...)");
        return kotlin.jvm.internal.g0.g(c11, h20.c0.c(a11, false, false, 2, null)) && !R0(gVar, eVar);
    }

    public final boolean g1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        n20.f name = gVar.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        List<n20.f> a11 = y10.j0.a(name);
        if (!(a11 instanceof Collection) || !a11.isEmpty()) {
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                Set<p10.q0> e12 = e1((n20.f) it.next());
                if (!(e12 instanceof Collection) || !e12.isEmpty()) {
                    for (p10.q0 q0Var : e12) {
                        if (Q0(q0Var, new v(gVar, this))) {
                            if (!q0Var.E()) {
                                String b11 = gVar.getName().b();
                                kotlin.jvm.internal.g0.o(b11, "asString(...)");
                                if (!y10.d0.d(b11)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (S0(gVar) || s1(gVar) || U0(gVar)) ? false : true;
    }

    @Override // x20.l, x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        d30.h<n20.f, p10.b> hVar;
        p10.b invoke;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        e(name, location);
        z zVar = (z) R();
        return (zVar == null || (hVar = zVar.f7655u) == null || (invoke = hVar.invoke(name)) == null) ? this.f7655u.invoke(name) : invoke;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g l1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.g J0;
        kotlin.reflect.jvm.internal.impl.descriptors.e l11 = kotlin.reflect.jvm.internal.impl.load.java.b.l(gVar);
        if (l11 != null && (J0 = J0(l11, lVar)) != null) {
            if (!g1(J0)) {
                J0 = null;
            }
            if (J0 != null) {
                return I0(J0, l11, collection);
            }
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g m1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar, n20.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) kotlin.reflect.jvm.internal.impl.load.java.d.g(gVar);
        if (gVar2 == null) {
            return null;
        }
        String e11 = kotlin.reflect.jvm.internal.impl.load.java.d.e(gVar2);
        kotlin.jvm.internal.g0.m(e11);
        n20.f f11 = n20.f.f(e11);
        kotlin.jvm.internal.g0.o(f11, "identifier(...)");
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> it = lVar.invoke(f11).iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.g O0 = O0(it.next(), fVar);
            if (T0(gVar2, O0)) {
                return I0(O0, gVar2, collection);
            }
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.g n1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        if (!gVar.isSuspend()) {
            return null;
        }
        n20.f name = gVar.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.g P0 = P0((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next());
            if (P0 == null || !R0(P0, gVar)) {
                P0 = null;
            }
            if (P0 != null) {
                return P0;
            }
        }
        return null;
    }

    public final a20.b o1(f20.k kVar) {
        p10.b S = S();
        a20.b o12 = a20.b.o1(S, b20.h.a(M(), kVar), false, M().a().t().a(kVar));
        kotlin.jvm.internal.g0.o(o12, "createJavaConstructor(...)");
        b20.k h11 = b20.c.h(M(), o12, kVar, S.t().size());
        t0.b e02 = e0(h11, o12, kVar.g());
        List<c1> t11 = S.t();
        kotlin.jvm.internal.g0.o(t11, "getDeclaredTypeParameters(...)");
        List<c1> list = t11;
        List<f20.y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(a00.i0.d0(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            c1 a11 = h11.f().a((f20.y) it.next());
            kotlin.jvm.internal.g0.m(a11);
            arrayList.add(a11);
        }
        o12.m1(e02.a(), y10.n0.d(kVar.getVisibility()), a00.r0.I4(list, arrayList));
        o12.T0(false);
        o12.U0(e02.b());
        o12.b1(S.s());
        h11.a().h().c(kVar, o12);
        return o12;
    }

    public final a20.e p1(f20.w wVar) {
        a20.e k12 = a20.e.k1(S(), b20.h.a(M(), wVar), wVar.getName(), M().a().t().a(wVar), true);
        kotlin.jvm.internal.g0.o(k12, "createJavaMethod(...)");
        k12.j1(null, P(), a00.h0.J(), a00.h0.J(), a00.h0.J(), M().g().p(wVar.getType(), d20.b.b(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.a(false, false, true), p10.o.f78590e, null);
        k12.n1(false, false);
        M().a().h().a(wVar, k12);
        return k12;
    }

    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> q1(n20.f fVar) {
        Collection<f20.r> f11 = O().invoke().f(fVar);
        ArrayList arrayList = new ArrayList(a00.i0.d0(f11, 10));
        Iterator<T> it = f11.iterator();
        while (it.hasNext()) {
            arrayList.add(a0((f20.r) it.next()));
        }
        return arrayList;
    }

    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> r1(n20.f fVar) {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g> c12 = c1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c12) {
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) obj;
            if (!kotlin.reflect.jvm.internal.impl.load.java.d.d(gVar) && kotlin.reflect.jvm.internal.impl.load.java.b.l(gVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean s1(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        kotlin.reflect.jvm.internal.impl.load.java.b bVar = kotlin.reflect.jvm.internal.impl.load.java.b.f67273o;
        n20.f name = gVar.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        if (!bVar.n(name)) {
            return false;
        }
        n20.f name2 = gVar.getName();
        kotlin.jvm.internal.g0.o(name2, "getName(...)");
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g> c12 = c1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c12.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.e l11 = kotlin.reflect.jvm.internal.impl.load.java.b.l((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next());
            if (l11 != null) {
                arrayList.add(l11);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (f1(gVar, (kotlin.reflect.jvm.internal.impl.descriptors.e) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final void t0(List<j1> list, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, int i11, f20.r rVar, e30.r0 r0Var, e30.r0 r0Var2) {
        q10.g b11 = q10.g.A0.b();
        n20.f name = rVar.getName();
        e30.r0 n11 = h2.n(r0Var);
        kotlin.jvm.internal.g0.o(n11, "makeNotNullable(...)");
        list.add(new s10.u0(cVar, null, i11, b11, name, n11, rVar.N(), false, false, r0Var2 != null ? h2.n(r0Var2) : null, M().a().t().a(rVar)));
    }

    @Override // c20.t0
    @m80.k
    public String toString() {
        return "Lazy Java member scope for " + this.f7649o.d();
    }

    public final void u0(Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> collection, n20.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection2, boolean z11) {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> d11 = z10.a.d(fVar, collection2, collection, S(), M().a().c(), M().a().k().c());
        kotlin.jvm.internal.g0.o(d11, "resolveOverridesForNonStaticMembers(...)");
        if (!z11) {
            collection.addAll(d11);
            return;
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection3 = d11;
        List I4 = a00.r0.I4(collection, collection3);
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection3, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar : collection3) {
            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) kotlin.reflect.jvm.internal.impl.load.java.d.j(gVar);
            if (gVar2 == null) {
                kotlin.jvm.internal.g0.m(gVar);
            } else {
                kotlin.jvm.internal.g0.m(gVar);
                gVar = I0(gVar, gVar2, I4);
            }
            arrayList.add(gVar);
        }
        collection.addAll(arrayList);
    }

    public final void v0(n20.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> collection2, Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> collection3, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar : collection2) {
            o30.a.a(collection3, m1(gVar, lVar, fVar, collection));
            o30.a.a(collection3, l1(gVar, lVar, collection));
            o30.a.a(collection3, n1(gVar, lVar));
        }
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> w(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        return x1.C(this.f7652r.invoke(), this.f7654t.invoke().keySet());
    }

    public final void w0(Set<? extends p10.q0> set, Collection<p10.q0> collection, Set<p10.q0> set2, x00.l<? super n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> lVar) {
        for (p10.q0 q0Var : set) {
            a20.f K0 = K0(q0Var, lVar);
            if (K0 != null) {
                collection.add(K0);
                if (set2 != null) {
                    set2.add(q0Var);
                    return;
                }
                return;
            }
        }
    }

    public final void x0(n20.f fVar, Collection<p10.q0> collection) {
        f20.r rVar = (f20.r) a00.r0.n5(O().invoke().f(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(M0(this, rVar, null, Modality.FINAL, 2, null));
    }

    @Override // c20.t0
    @m80.k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<n20.f> y(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        Collection<e30.r0> c11 = S().o().c();
        kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
        LinkedHashSet<n20.f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            a00.m0.s0(linkedHashSet, ((e30.r0) it.next()).r().b());
        }
        linkedHashSet.addAll(O().invoke().a());
        linkedHashSet.addAll(O().invoke().c());
        linkedHashSet.addAll(w(kindFilter, lVar));
        linkedHashSet.addAll(M().a().w().e(S(), M()));
        return linkedHashSet;
    }

    @Override // c20.t0
    public void z(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> result, @m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(name, "name");
        if (this.f7649o.G() && O().invoke().b(name) != null) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> collection = result;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.g) it.next()).g().isEmpty()) {
                        break;
                    }
                }
            }
            f20.w b11 = O().invoke().b(name);
            kotlin.jvm.internal.g0.m(b11);
            result.add(p1(b11));
        }
        M().a().w().h(S(), name, result, M());
    }

    @Override // c20.t0
    @m80.k
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public c20.b A() {
        return new c20.b(this.f7649o, u.f7637a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@m80.k b20.k c11, @m80.k p10.b ownerDescriptor, @m80.k f20.g jClass, boolean z11, @m80.l z zVar) {
        super(c11, zVar);
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(ownerDescriptor, "ownerDescriptor");
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        this.f7648n = ownerDescriptor;
        this.f7649o = jClass;
        this.f7650p = z11;
        this.f7651q = c11.e().f(new p(this, c11));
        this.f7652r = c11.e().f(new q(this));
        this.f7653s = c11.e().f(new r(c11, this));
        this.f7654t = c11.e().f(new s(this));
        this.f7655u = c11.e().h(new t(this, c11));
    }
}
