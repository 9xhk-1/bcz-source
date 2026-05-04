package i10;

import a00.i0;
import a00.l1;
import e30.c1;
import e30.f2;
import e30.r0;
import h10.o;
import h10.p;
import h10.q;
import h10.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.f;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.l;
import o30.b;
import yz.n;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "KClasses")
@u0({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n295#2,2:282\n295#2,2:284\n808#2,11:286\n808#2,11:297\n774#2:308\n865#2,2:309\n774#2:311\n865#2,2:312\n808#2,11:314\n774#2:325\n865#2,2:326\n774#2:328\n865#2,2:329\n774#2:331\n865#2,2:332\n774#2:334\n865#2,2:335\n774#2:337\n865#2,2:338\n774#2:340\n865#2,2:341\n774#2:343\n865#2,2:344\n1611#2,9:346\n1863#2:355\n1864#2:357\n1620#2:358\n1557#2:359\n1628#2,3:360\n669#2,4:363\n1734#2,3:367\n673#2,7:370\n1557#2:377\n1628#2,3:378\n1#3:356\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n*L\n36#1:282,2\n47#1:284,2\n89#1:286,11\n96#1:297,11\n103#1:308\n103#1:309,2\n110#1:311\n110#1:312,2\n119#1:314,11\n126#1:325\n126#1:326,2\n133#1:328\n133#1:329,2\n141#1:331\n141#1:332,2\n148#1:334\n148#1:335,2\n155#1:337\n155#1:338,2\n162#1:340\n162#1:341,2\n169#1:343\n169#1:344,2\n184#1:346,9\n184#1:355\n184#1:357\n184#1:358\n223#1:359\n223#1:360,3\n276#1:363,4\n276#1:367,3\n276#1:370,7\n200#1:377\n200#1:378,3\n184#1:356\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends b.f<r, r> {
        @Override // o30.b.AbstractC0924b, o30.b.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(r current) {
            g0.p(current, "current");
            ((LinkedList) this.f75684a).add(current);
            return true;
        }
    }

    @m80.k
    public static final Collection<h10.c<?>> A(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        return ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).M();
    }

    @m80.k
    public static final r C(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        c1 s11 = ((kotlin.reflect.jvm.internal.f) dVar).a().s();
        g0.o(s11, "getDefaultType(...)");
        return new kotlin.reflect.jvm.internal.r(s11, new d(dVar));
    }

    @m80.k
    public static final Collection<h10.i<?>> E(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<h10.c<?>> q11 = dVar.q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : q11) {
            if (obj instanceof h10.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final Collection<h10.i<?>> G(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> I = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) obj;
            if (W(eVar) && (eVar instanceof h10.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T> Collection<q<T, ?, ?>> I(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> I = ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue().I();
        ArrayList arrayList = new ArrayList();
        for (T t11 : I) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) t11;
            if (W(eVar) && (eVar instanceof q)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final Collection<h10.i<?>> K(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> I = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) obj;
            if (X(eVar) && (eVar instanceof h10.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T> Collection<p<T, ?>> M(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> I = ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue().I();
        ArrayList arrayList = new ArrayList();
        for (T t11 : I) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) t11;
            if (X(eVar) && (eVar instanceof p)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @l
    public static final <T> h10.i<T> O(@m80.k h10.d<T> dVar) {
        T t11;
        g0.p(dVar, "<this>");
        Iterator<T> it = ((kotlin.reflect.jvm.internal.f) dVar).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it.next();
            h10.i iVar = (h10.i) t11;
            g0.n(iVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            kotlin.reflect.jvm.internal.impl.descriptors.e c02 = ((kotlin.reflect.jvm.internal.g) iVar).c0();
            g0.n(c02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((kotlin.reflect.jvm.internal.impl.descriptors.c) c02).n0()) {
                break;
            }
        }
        return (h10.i) t11;
    }

    @m80.k
    public static final Collection<h10.i<?>> Q(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> J = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (obj instanceof h10.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final Collection<o<?>> S(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> J = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) obj;
            if (X(eVar) && (eVar instanceof o)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final List<h10.d<?>> U(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        List<r> c11 = dVar.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            h10.g m11 = ((r) it.next()).m();
            h10.d dVar2 = m11 instanceof h10.d ? (h10.d) m11 : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    public static final boolean W(kotlin.reflect.jvm.internal.e<?> eVar) {
        return eVar.c0().f0() != null;
    }

    public static final boolean X(kotlin.reflect.jvm.internal.e<?> eVar) {
        return !W(eVar);
    }

    @y0(version = "1.1")
    public static final boolean Y(@m80.k h10.d<?> dVar, @m80.k h10.d<?> base) {
        g0.p(dVar, "<this>");
        g0.p(base, "base");
        return g0.g(dVar, base) || o30.b.e(a00.g0.l(dVar), new f(new PropertyReference1() { // from class: i10.h.b
            @Override // h10.p
            public Object get(Object obj) {
                return h.U((h10.d) obj);
            }

            @Override // kotlin.jvm.internal.CallableReference, h10.c
            public String getName() {
                return "superclasses";
            }

            @Override // kotlin.jvm.internal.CallableReference
            public h10.h getOwner() {
                return o0.h(h.class, "kotlin-reflection");
            }

            @Override // kotlin.jvm.internal.CallableReference
            public String getSignature() {
                return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
            }
        }), new g(base)).booleanValue();
    }

    public static final Iterable Z(p pVar, h10.d dVar) {
        return (Iterable) pVar.invoke(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Iterable a(r rVar) {
        h10.g m11 = rVar.m();
        x00.a aVar = null;
        Object[] objArr = 0;
        h10.d dVar = m11 instanceof h10.d ? (h10.d) m11 : null;
        if (dVar == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + rVar);
        }
        List<r> c11 = dVar.c();
        if (rVar.getArguments().isEmpty()) {
            return c11;
        }
        g0.n(rVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        f2 f11 = f2.f(((kotlin.reflect.jvm.internal.r) rVar).D());
        List<r> list = c11;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (r rVar2 : list) {
            g0.n(rVar2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            r0 p11 = f11.p(((kotlin.reflect.jvm.internal.r) rVar2).D(), Variance.INVARIANT);
            if (p11 == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + rVar2 + " (" + rVar + ')');
            }
            arrayList.add(new kotlin.reflect.jvm.internal.r(p11, aVar, 2, objArr == true ? 1 : 0));
        }
        return arrayList;
    }

    public static final Boolean a0(h10.d dVar, h10.d dVar2) {
        return Boolean.valueOf(g0.g(dVar2, dVar));
    }

    public static final Type b(h10.d dVar) {
        return ((kotlin.reflect.jvm.internal.f) dVar).g();
    }

    @y0(version = "1.1")
    public static final boolean b0(@m80.k h10.d<?> dVar, @m80.k h10.d<?> derived) {
        g0.p(dVar, "<this>");
        g0.p(derived, "derived");
        return Y(derived, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @y0(version = "1.1")
    public static final <T> T c0(@m80.k h10.d<T> dVar, @l Object obj) {
        g0.p(dVar, "<this>");
        if (!dVar.B(obj)) {
            return null;
        }
        g0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.safeCast");
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.1")
    @m80.k
    public static final <T> T g(@m80.k h10.d<T> dVar, @l Object obj) {
        g0.p(dVar, "<this>");
        if (dVar.B(obj)) {
            g0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.cast");
            return obj;
        }
        throw new TypeCastException("Value cannot be cast to " + dVar.x());
    }

    @y0(version = "1.1")
    @m80.k
    public static final <T> T h(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Iterator<T> it = dVar.f().iterator();
        T t11 = null;
        boolean z11 = false;
        T t12 = null;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                List<KParameter> parameters = ((h10.i) next).getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator<T> it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        if (!((KParameter) it2.next()).isOptional()) {
                            break;
                        }
                    }
                }
                if (z11) {
                    break;
                }
                z11 = true;
                t12 = next;
            } else if (z11) {
                t11 = t12;
            }
        }
        h10.i iVar = (h10.i) t11;
        if (iVar != null) {
            return (T) iVar.callBy(l1.z());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + dVar);
    }

    @m80.k
    public static final Collection<h10.d<?>> i(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<r> k11 = k(dVar);
        ArrayList arrayList = new ArrayList(i0.d0(k11, 10));
        for (r rVar : k11) {
            h10.g m11 = rVar.m();
            h10.d dVar2 = m11 instanceof h10.d ? (h10.d) m11 : null;
            if (dVar2 == null) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + rVar);
            }
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    @m80.k
    public static final Collection<r> k(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Object c11 = o30.b.c(dVar.c(), e.f60109a, new b.h(), new a());
        g0.o(c11, "dfs(...)");
        return (Collection) c11;
    }

    @l
    public static final h10.d<?> m(@m80.k h10.d<?> dVar) {
        Object obj;
        g0.p(dVar, "<this>");
        Iterator<T> it = dVar.y().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            h10.d dVar2 = (h10.d) obj;
            g0.n(dVar2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            if (((kotlin.reflect.jvm.internal.f) dVar2).a().m0()) {
                break;
            }
        }
        return (h10.d) obj;
    }

    @l
    public static final Object o(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        h10.d<?> m11 = m(dVar);
        if (m11 != null) {
            return m11.z();
        }
        return null;
    }

    @m80.k
    public static final Collection<h10.i<?>> q(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> M = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).M();
        ArrayList arrayList = new ArrayList();
        for (Object obj : M) {
            if (obj instanceof h10.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final Collection<h10.i<?>> s(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> N = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).N();
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) obj;
            if (W(eVar) && (eVar instanceof h10.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T> Collection<q<T, ?, ?>> u(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> N = ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue().N();
        ArrayList arrayList = new ArrayList();
        for (T t11 : N) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) t11;
            if (W(eVar) && (eVar instanceof q)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final Collection<h10.i<?>> w(@m80.k h10.d<?> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> N = ((f.a) ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue()).N();
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) obj;
            if (X(eVar) && (eVar instanceof h10.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T> Collection<p<T, ?>> y(@m80.k h10.d<T> dVar) {
        g0.p(dVar, "<this>");
        Collection<kotlin.reflect.jvm.internal.e<?>> N = ((kotlin.reflect.jvm.internal.f) dVar).f0().getValue().N();
        ArrayList arrayList = new ArrayList();
        for (T t11 : N) {
            kotlin.reflect.jvm.internal.e eVar = (kotlin.reflect.jvm.internal.e) t11;
            if (X(eVar) && (eVar instanceof p)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @y0(version = "1.1")
    public static /* synthetic */ void B(h10.d dVar) {
    }

    @y0(version = "1.1")
    @n(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    public static /* synthetic */ void D(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void F(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void H(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void J(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void L(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void N(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void P(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void R(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void T(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void V(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void j(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void l(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void n(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void p(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void r(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void t(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void v(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void x(h10.d dVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void z(h10.d dVar) {
    }
}
