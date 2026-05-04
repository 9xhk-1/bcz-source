package c20;

import a00.l1;
import e30.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p10.j1;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1557#2:125\n1628#2,3:126\n1611#2,9:130\n1863#2:139\n1864#2:141\n1620#2:142\n1#3:129\n1#3:140\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n62#1:130,9\n62#1:139\n62#1:141\n62#1:142\n62#1:140\n*E\n"})
/* loaded from: classes8.dex */
public final class j implements a20.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f7565i = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(j.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(j.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b20.k f7566a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f20.a f7567b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.j f7568c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.i f7569d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final e20.a f7570e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final d30.i f7571f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7572g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7573h;

    public j(@m80.k b20.k c11, @m80.k f20.a javaAnnotation, boolean z11) {
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(javaAnnotation, "javaAnnotation");
        this.f7566a = c11;
        this.f7567b = javaAnnotation;
        this.f7568c = c11.e().e(new g(this));
        this.f7569d = c11.e().f(new h(this));
        this.f7570e = c11.a().t().a(javaAnnotation);
        this.f7571f = c11.e().f(new i(this));
        this.f7572g = javaAnnotation.h();
        this.f7573h = javaAnnotation.z() || z11;
    }

    public static final Map f(j jVar) {
        Collection<f20.b> arguments = jVar.f7567b.getArguments();
        ArrayList arrayList = new ArrayList();
        for (f20.b bVar : arguments) {
            n20.f name = bVar.getName();
            if (name == null) {
                name = y10.e0.f99032c;
            }
            s20.g<?> m11 = jVar.m(bVar);
            Pair a11 = m11 != null ? h1.a(name, m11) : null;
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return l1.B0(arrayList);
    }

    public static final n20.c i(j jVar) {
        n20.b a11 = jVar.f7567b.a();
        if (a11 != null) {
            return a11.a();
        }
        return null;
    }

    public static final c1 r(j jVar) {
        n20.c d11 = jVar.d();
        if (d11 == null) {
            return g30.i.d(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, jVar.f7567b.toString());
        }
        p10.b f11 = o10.b.f(o10.b.f75542a, d11, jVar.f7566a.d().q(), null, 4, null);
        if (f11 == null) {
            f20.g l11 = jVar.f7567b.l();
            f11 = l11 != null ? jVar.f7566a.a().n().a(l11) : null;
            if (f11 == null) {
                f11 = jVar.g(d11);
            }
        }
        return f11.s();
    }

    @Override // q10.c
    @m80.k
    public Map<n20.f, s20.g<?>> a() {
        return (Map) d30.m.a(this.f7571f, this, f7565i[2]);
    }

    @Override // q10.c
    @m80.l
    public n20.c d() {
        return (n20.c) d30.m.b(this.f7568c, this, f7565i[0]);
    }

    public final p10.b g(n20.c cVar) {
        return p10.t.d(this.f7566a.d(), n20.b.f74280d.c(cVar), this.f7566a.a().b().f().r());
    }

    @Override // a20.g
    public boolean h() {
        return this.f7572g;
    }

    @Override // q10.c
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e20.a getSource() {
        return this.f7570e;
    }

    @Override // q10.c
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c1 getType() {
        return (c1) d30.m.a(this.f7569d, this, f7565i[1]);
    }

    public final boolean l() {
        return this.f7573h;
    }

    public final s20.g<?> m(f20.b bVar) {
        if (bVar instanceof f20.o) {
            return s20.i.f(s20.i.f87444a, ((f20.o) bVar).getValue(), null, 2, null);
        }
        if (bVar instanceof f20.m) {
            f20.m mVar = (f20.m) bVar;
            return p(mVar.c(), mVar.d());
        }
        if (!(bVar instanceof f20.e)) {
            if (bVar instanceof f20.c) {
                return n(((f20.c) bVar).b());
            }
            if (bVar instanceof f20.h) {
                return q(((f20.h) bVar).a());
            }
            return null;
        }
        f20.e eVar = (f20.e) bVar;
        n20.f name = eVar.getName();
        if (name == null) {
            name = y10.e0.f99032c;
        }
        kotlin.jvm.internal.g0.m(name);
        return o(name, eVar.getElements());
    }

    public final s20.g<?> n(f20.a aVar) {
        return new s20.a(new j(this.f7566a, aVar, false, 4, null));
    }

    public final s20.g<?> o(n20.f fVar, List<? extends f20.b> list) {
        e30.r0 l11;
        if (e30.v0.a(getType())) {
            return null;
        }
        p10.b l12 = u20.e.l(this);
        kotlin.jvm.internal.g0.m(l12);
        j1 b11 = z10.a.b(fVar, l12);
        if (b11 == null || (l11 = b11.getType()) == null) {
            l11 = this.f7566a.a().m().q().l(Variance.INVARIANT, g30.i.d(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            kotlin.jvm.internal.g0.o(l11, "getArrayType(...)");
        }
        List<? extends f20.b> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            s20.g<?> m11 = m((f20.b) it.next());
            if (m11 == null) {
                m11 = new s20.v();
            }
            arrayList.add(m11);
        }
        return s20.i.f87444a.b(arrayList, l11);
    }

    public final s20.g<?> p(n20.b bVar, n20.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new s20.k(bVar, fVar);
    }

    public final s20.g<?> q(f20.x xVar) {
        return s20.t.f87465b.a(this.f7566a.g().p(xVar, d20.b.b(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    @m80.k
    public String toString() {
        return p20.m.S(p20.m.f78747h, this, null, 2, null);
    }

    public /* synthetic */ j(b20.k kVar, f20.a aVar, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(kVar, aVar, (i11 & 4) != 0 ? false : z11);
    }
}
