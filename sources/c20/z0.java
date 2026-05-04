package c20;

import a00.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import o30.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaStaticClassScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1485#2:172\n1510#2,3:173\n1513#2,3:183\n1557#2:192\n1628#2,3:193\n381#3,7:176\n77#4:186\n97#4,5:187\n*S KotlinDebug\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n*L\n112#1:172\n112#1:173,3\n112#1:183,3\n168#1:192\n168#1:193,3\n112#1:176,7\n114#1:186\n114#1:187,5\n*E\n"})
/* loaded from: classes8.dex */
public final class z0 extends a1 {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final f20.g f7656n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final a20.c f7657o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(@m80.k b20.k c11, @m80.k f20.g jClass, @m80.k a20.c ownerDescriptor) {
        super(c11);
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        kotlin.jvm.internal.g0.p(ownerDescriptor, "ownerDescriptor");
        this.f7656n = jClass;
        this.f7657o = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(f20.q it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.j();
    }

    public static final Collection o0(n20.f fVar, x20.k it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.c(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    public static final Collection p0(x20.k it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.d();
    }

    public static final Iterable r0(p10.b bVar) {
        Collection<e30.r0> c11 = bVar.o().c();
        kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
        return q30.k0.l0(q30.k0.S1(a00.r0.E1(c11), y0.f7647a));
    }

    public static final p10.b s0(e30.r0 r0Var) {
        p10.d r11 = r0Var.I0().r();
        if (r11 instanceof p10.b) {
            return (p10.b) r11;
        }
        return null;
    }

    @Override // c20.t0
    public void C(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> result, @m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(name, "name");
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> e11 = z10.a.e(name, v0(name, S()), result, S(), M().a().c(), M().a().k().c());
        kotlin.jvm.internal.g0.o(e11, "resolveOverridesForStaticMembers(...)");
        result.addAll(e11);
        if (this.f7656n.J()) {
            if (kotlin.jvm.internal.g0.g(name, n10.o.f74008f)) {
                kotlin.reflect.jvm.internal.impl.descriptors.g g11 = q20.g.g(S());
                kotlin.jvm.internal.g0.o(g11, "createEnumValueOfMethod(...)");
                result.add(g11);
            } else if (kotlin.jvm.internal.g0.g(name, n10.o.f74006d)) {
                kotlin.reflect.jvm.internal.impl.descriptors.g h11 = q20.g.h(S());
                kotlin.jvm.internal.g0.o(h11, "createEnumValuesMethod(...)");
                result.add(h11);
            }
        }
    }

    @Override // c20.a1, c20.t0
    public void D(@m80.k n20.f name, @m80.k Collection<p10.q0> result) {
        n20.f fVar;
        Collection<p10.q0> collection;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(result, "result");
        Set q02 = q0(S(), new LinkedHashSet(), new w0(name));
        if (result.isEmpty()) {
            fVar = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : q02) {
                p10.q0 u02 = u0((p10.q0) obj);
                Object obj2 = linkedHashMap.get(u02);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(u02, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection e11 = z10.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, S(), M().a().c(), M().a().k().c());
                kotlin.jvm.internal.g0.o(e11, "resolveOverridesForStaticMembers(...)");
                a00.m0.s0(arrayList, e11);
            }
            collection.addAll(arrayList);
        } else {
            fVar = name;
            collection = result;
            Collection<? extends p10.q0> e12 = z10.a.e(fVar, q02, collection, S(), M().a().c(), M().a().k().c());
            kotlin.jvm.internal.g0.o(e12, "resolveOverridesForStaticMembers(...)");
            collection.addAll(e12);
        }
        if (this.f7656n.J() && kotlin.jvm.internal.g0.g(fVar, n10.o.f74007e)) {
            o30.a.a(collection, q20.g.f(S()));
        }
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> E(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        Set<n20.f> e62 = a00.r0.e6(O().invoke().e());
        q0(S(), e62, v0.f7641a);
        if (this.f7656n.J()) {
            e62.add(n10.o.f74007e);
        }
        return e62;
    }

    @Override // x20.l, x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return null;
    }

    @Override // c20.t0
    @m80.k
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b A() {
        return new b(this.f7656n, u0.f7638a);
    }

    public final <R> Set<R> q0(p10.b bVar, Set<R> set, x00.l<? super x20.k, ? extends Collection<? extends R>> lVar) {
        o30.b.b(a00.g0.l(bVar), x0.f7645a, new a(bVar, set, lVar));
        return set;
    }

    @Override // c20.t0
    @m80.k
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public a20.c S() {
        return this.f7657o;
    }

    public final p10.q0 u0(p10.q0 q0Var) {
        if (q0Var.getKind().isReal()) {
            return q0Var;
        }
        Collection<? extends p10.q0> e11 = q0Var.e();
        kotlin.jvm.internal.g0.o(e11, "getOverriddenDescriptors(...)");
        Collection<? extends p10.q0> collection = e11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection, 10));
        for (p10.q0 q0Var2 : collection) {
            kotlin.jvm.internal.g0.m(q0Var2);
            arrayList.add(u0(q0Var2));
        }
        return (p10.q0) a00.r0.m5(a00.r0.e2(arrayList));
    }

    public final Set<kotlin.reflect.jvm.internal.impl.descriptors.g> v0(n20.f fVar, p10.b bVar) {
        z0 b11 = a20.h.b(bVar);
        return b11 == null ? w1.k() : a00.r0.f6(b11.a(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> w(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        return w1.k();
    }

    @Override // c20.t0
    @m80.k
    public Set<n20.f> y(@m80.k x20.d kindFilter, @m80.l x00.l<? super n20.f, Boolean> lVar) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        Set<n20.f> e62 = a00.r0.e6(O().invoke().a());
        z0 b11 = a20.h.b(S());
        Set<n20.f> b12 = b11 != null ? b11.b() : null;
        if (b12 == null) {
            b12 = w1.k();
        }
        e62.addAll(b12);
        if (this.f7656n.J()) {
            e62.addAll(a00.h0.Q(n10.o.f74008f, n10.o.f74006d));
        }
        e62.addAll(M().a().w().a(S(), M()));
        return e62;
    }

    @Override // c20.t0
    public void z(@m80.k Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> result, @m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(result, "result");
        kotlin.jvm.internal.g0.p(name, "name");
        M().a().w().b(S(), name, result, M());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends b.AbstractC0924b<p10.b, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p10.b f7658a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set<R> f7659b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<x20.k, Collection<R>> f7660c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p10.b bVar, Set<R> set, x00.l<? super x20.k, ? extends Collection<? extends R>> lVar) {
            this.f7658a = bVar;
            this.f7659b = set;
            this.f7660c = lVar;
        }

        @Override // o30.b.e
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return g2.f100423a;
        }

        @Override // o30.b.AbstractC0924b, o30.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(p10.b current) {
            kotlin.jvm.internal.g0.p(current, "current");
            if (current == this.f7658a) {
                return true;
            }
            x20.k r02 = current.r0();
            kotlin.jvm.internal.g0.o(r02, "getStaticScope(...)");
            if (!(r02 instanceof a1)) {
                return true;
            }
            this.f7659b.addAll((Collection) this.f7660c.invoke(r02));
            return false;
        }

        public void e() {
        }
    }
}
