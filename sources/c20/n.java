package c20;

import a00.d1;
import a00.w1;
import e30.c2;
import e30.r1;
import e30.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.c1;
import p10.f0;
import p10.g1;
import p10.h1;
import p10.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1755#2,3:323\n1755#2,3:326\n1053#2:334\n1557#2:336\n1628#2,3:337\n1148#3:329\n1317#3:330\n1318#3:332\n1149#3:333\n1#4:331\n1#4:335\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n185#1:323,3\n188#1:326,3\n202#1:334\n151#1:336\n151#1:337,3\n200#1:329\n200#1:330\n200#1:332\n200#1:333\n200#1:331\n*E\n"})
/* loaded from: classes8.dex */
public final class n extends s10.j implements a20.c {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final b20.k f7584j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final f20.g f7585k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final p10.b f7586l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final b20.k f7587m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final yz.c0 f7588n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final ClassKind f7589o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final Modality f7590p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final o1 f7591q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7592r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final b f7593s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final z f7594t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final p10.w0<z> f7595u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final x20.g f7596v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final z0 f7597w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final q10.g f7598x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final d30.i<List<c1>> f7599y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final a f7583z = new a(null);

    @m80.k
    public static final Set<String> A = w1.u("equals", "hashCode", "getClass", "wait", q9.h.f81943g, "notifyAll", "toString");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1557#2:323\n1628#2,3:324\n1557#2:327\n1628#2,3:328\n1557#2:331\n1628#2,3:332\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n*L\n254#1:323\n254#1:324,3\n280#1:327\n280#1:328,3\n285#1:331\n285#1:332,3\n*E\n"})
    public final class b extends e30.b {

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final d30.i<List<c1>> f7600d;

        public b() {
            super(n.this.f7587m.e());
            this.f7600d = n.this.f7587m.e().f(new o(n.this));
        }

        public static final List N(n nVar) {
            return g1.g(nVar);
        }

        @Override // e30.b, e30.u, e30.u1
        @m80.k
        /* renamed from: J */
        public p10.b r() {
            return n.this;
        }

        public final e30.r0 L() {
            n20.c cVar;
            ArrayList arrayList;
            n20.c M = M();
            if (M == null || M.d() || !M.i(n10.o.f74028z)) {
                M = null;
            }
            if (M == null) {
                cVar = y10.o.f99100a.b(u20.e.o(n.this));
                if (cVar == null) {
                    return null;
                }
            } else {
                cVar = M;
            }
            p10.b B = u20.e.B(n.this.f7587m.d(), cVar, NoLookupLocation.FROM_JAVA_LOADER);
            if (B == null) {
                return null;
            }
            int size = B.o().getParameters().size();
            List<c1> parameters = n.this.o().getParameters();
            kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List<c1> list = parameters;
                arrayList = new ArrayList(a00.i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c2(Variance.INVARIANT, ((c1) it.next()).s()));
                }
            } else {
                if (size2 != 1 || size <= 1 || M != null) {
                    return null;
                }
                c2 c2Var = new c2(Variance.INVARIANT, ((c1) a00.r0.m5(parameters)).s());
                g10.l lVar = new g10.l(1, size);
                ArrayList arrayList2 = new ArrayList(a00.i0.d0(lVar, 10));
                Iterator<Integer> it2 = lVar.iterator();
                while (it2.hasNext()) {
                    ((d1) it2).nextInt();
                    arrayList2.add(c2Var);
                }
                arrayList = arrayList2;
            }
            return e30.u0.h(r1.f48652b.j(), B, arrayList);
        }

        public final n20.c M() {
            String b11;
            q10.g annotations = n.this.getAnnotations();
            n20.c PURELY_IMPLEMENTS_ANNOTATION = y10.e0.f99047r;
            kotlin.jvm.internal.g0.o(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            q10.c i11 = annotations.i(PURELY_IMPLEMENTS_ANNOTATION);
            if (i11 == null) {
                return null;
            }
            Object n52 = a00.r0.n5(i11.a().values());
            s20.y yVar = n52 instanceof s20.y ? (s20.y) n52 : null;
            if (yVar == null || (b11 = yVar.b()) == null || !n20.e.e(b11)) {
                return null;
            }
            return new n20.c(b11);
        }

        @Override // e30.u1
        @m80.k
        public List<c1> getParameters() {
            return this.f7600d.invoke();
        }

        @Override // e30.o
        @m80.k
        public Collection<e30.r0> p() {
            Collection<f20.j> c11 = n.this.N0().c();
            ArrayList arrayList = new ArrayList(c11.size());
            ArrayList<f20.x> arrayList2 = new ArrayList(0);
            e30.r0 L = L();
            Iterator<f20.j> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f20.j next = it.next();
                e30.r0 q11 = n.this.f7587m.a().r().q(n.this.f7587m.g().p(next, d20.b.b(TypeUsage.SUPERTYPE, false, false, null, 7, null)), n.this.f7587m);
                if (q11.I0().r() instanceof f0.b) {
                    arrayList2.add(next);
                }
                if (!kotlin.jvm.internal.g0.g(q11.I0(), L != null ? L.I0() : null) && !n10.j.b0(q11)) {
                    arrayList.add(q11);
                }
            }
            p10.b bVar = n.this.f7586l;
            o30.a.a(arrayList, bVar != null ? o10.t.a(bVar, n.this).c().p(bVar.s(), Variance.INVARIANT) : null);
            o30.a.a(arrayList, L);
            if (!arrayList2.isEmpty()) {
                a30.v c12 = n.this.f7587m.a().c();
                p10.b r11 = r();
                ArrayList arrayList3 = new ArrayList(a00.i0.d0(arrayList2, 10));
                for (f20.x xVar : arrayList2) {
                    kotlin.jvm.internal.g0.n(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((f20.j) xVar).y());
                }
                c12.b(r11, arrayList3);
            }
            return !arrayList.isEmpty() ? a00.r0.a6(arrayList) : a00.g0.l(n.this.f7587m.d().q().i());
        }

        @Override // e30.u1
        public boolean s() {
            return true;
        }

        @m80.k
        public String toString() {
            String b11 = n.this.getName().b();
            kotlin.jvm.internal.g0.o(b11, "asString(...)");
            return b11;
        }

        @Override // e30.o
        @m80.k
        public p10.a1 w() {
            return n.this.f7587m.a().v();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n1#1,102:1\n202#2:103\n*E\n"})
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(u20.e.o((p10.b) t11).b(), u20.e.o((p10.b) t12).b());
        }
    }

    public /* synthetic */ n(b20.k kVar, p10.h hVar, f20.g gVar, p10.b bVar, int i11, kotlin.jvm.internal.v vVar) {
        this(kVar, hVar, gVar, (i11 & 8) != 0 ? null : bVar);
    }

    public static final List L0(n nVar) {
        List<f20.y> typeParameters = nVar.f7585k.getTypeParameters();
        ArrayList arrayList = new ArrayList(a00.i0.d0(typeParameters, 10));
        for (f20.y yVar : typeParameters) {
            c1 a11 = nVar.f7587m.f().a(yVar);
            if (a11 == null) {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + nVar.f7585k + ", so it must be resolved");
            }
            arrayList.add(a11);
        }
        return arrayList;
    }

    public static final List R0(n nVar) {
        n20.b n11 = u20.e.n(nVar);
        if (n11 != null) {
            return nVar.f7584j.a().f().a(n11);
        }
        return null;
    }

    public static final z S0(n nVar, f30.g it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new z(nVar.f7587m, nVar, nVar.f7585k, nVar.f7586l != null, nVar.f7594t);
    }

    @Override // p10.b
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.b B() {
        return null;
    }

    @Override // s10.a, p10.b
    @m80.k
    public x20.k I() {
        return this.f7596v;
    }

    @m80.k
    public final n K0(@m80.k z10.j javaResolverCache, @m80.l p10.b bVar) {
        kotlin.jvm.internal.g0.p(javaResolverCache, "javaResolverCache");
        b20.k kVar = this.f7587m;
        b20.k m11 = b20.c.m(kVar, kVar.a().x(javaResolverCache));
        p10.h b11 = b();
        kotlin.jvm.internal.g0.o(b11, "getContainingDeclaration(...)");
        return new n(m11, b11, this.f7585k, bVar);
    }

    @Override // p10.b
    @m80.k
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
        return this.f7594t.b1().invoke();
    }

    @m80.k
    public final f20.g N0() {
        return this.f7585k;
    }

    @m80.l
    public final List<f20.a> O0() {
        return (List) this.f7588n.getValue();
    }

    @Override // s10.a, p10.b
    @m80.k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public z J() {
        x20.k J = super.J();
        kotlin.jvm.internal.g0.n(J, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (z) J;
    }

    @Override // s10.z
    @m80.k
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public z V(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f7595u.c(kotlinTypeRefiner);
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        return this.f7598x;
    }

    @Override // p10.b
    @m80.k
    public ClassKind getKind() {
        return this.f7589o;
    }

    @Override // p10.b, p10.x, p10.l
    @m80.k
    public p10.p getVisibility() {
        if (!kotlin.jvm.internal.g0.g(this.f7591q, p10.o.f78586a) || this.f7585k.n() != null) {
            return y10.n0.d(this.f7591q);
        }
        p10.p pVar = y10.v.f99115a;
        kotlin.jvm.internal.g0.m(pVar);
        return pVar;
    }

    @Override // p10.e
    public boolean i() {
        return this.f7592r;
    }

    @Override // p10.b
    @m80.l
    public h1<e30.c1> i0() {
        return null;
    }

    @Override // p10.b
    public boolean isInline() {
        return false;
    }

    @Override // p10.b, p10.x
    @m80.k
    public Modality k() {
        return this.f7590p;
    }

    @Override // p10.x
    public boolean k0() {
        return false;
    }

    @Override // p10.b
    public boolean m0() {
        return false;
    }

    @Override // p10.d
    @m80.k
    public u1 o() {
        return this.f7593s;
    }

    @Override // p10.b
    @m80.k
    public Collection<p10.b> p() {
        if (this.f7590p != Modality.SEALED) {
            return a00.h0.J();
        }
        d20.a b11 = d20.b.b(TypeUsage.COMMON, false, false, null, 7, null);
        q30.m<f20.j> w11 = this.f7585k.w();
        ArrayList arrayList = new ArrayList();
        Iterator<f20.j> it = w11.iterator();
        while (it.hasNext()) {
            p10.d r11 = this.f7587m.g().p(it.next(), b11).I0().r();
            p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return a00.r0.z5(arrayList, new c());
    }

    @Override // p10.x
    public boolean q0() {
        return false;
    }

    @Override // p10.b
    @m80.k
    public x20.k r0() {
        return this.f7597w;
    }

    @Override // p10.b
    @m80.l
    public p10.b s0() {
        return null;
    }

    @Override // p10.b, p10.e
    @m80.k
    public List<c1> t() {
        return this.f7599y.invoke();
    }

    @m80.k
    public String toString() {
        return "Lazy Java class " + u20.e.p(this);
    }

    @Override // p10.b
    public boolean u() {
        return false;
    }

    @Override // p10.b
    public boolean v() {
        return false;
    }

    @Override // p10.b
    public boolean w() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k b20.k outerContext, @m80.k p10.h containingDeclaration, @m80.k f20.g jClass, @m80.l p10.b bVar) {
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        Modality modality;
        kotlin.jvm.internal.g0.p(outerContext, "outerContext");
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        this.f7584j = outerContext;
        this.f7585k = jClass;
        this.f7586l = bVar;
        b20.k f11 = b20.c.f(outerContext, this, jClass, 0, 4, null);
        this.f7587m = f11;
        f11.a().h().b(jClass, this);
        jClass.B();
        this.f7588n = yz.e0.c(new k(this));
        this.f7589o = jClass.p() ? ClassKind.ANNOTATION_CLASS : jClass.L() ? ClassKind.INTERFACE : jClass.J() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        if (jClass.p() || jClass.J()) {
            modality = Modality.FINAL;
        } else {
            modality = Modality.Companion.a(jClass.k(), jClass.k() || jClass.isAbstract() || jClass.L(), !jClass.isFinal());
        }
        this.f7590p = modality;
        this.f7591q = jClass.getVisibility();
        this.f7592r = (jClass.n() == null || jClass.j()) ? false : true;
        this.f7593s = new b();
        z zVar = new z(f11, this, jClass, bVar != null, null, 16, null);
        this.f7594t = zVar;
        this.f7595u = p10.w0.f78616e.a(this, f11.e(), f11.a().k().d(), new l(this));
        this.f7596v = new x20.g(zVar);
        this.f7597w = new z0(f11, jClass, this);
        this.f7598x = b20.h.a(f11, jClass);
        this.f7599y = f11.e().f(new m(this));
    }
}
