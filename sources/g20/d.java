package g20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1#2:235\n1#2:258\n1#2:281\n774#3:236\n865#3,2:237\n1734#3,3:239\n1755#3,3:242\n1755#3,3:245\n1611#3,9:248\n1863#3:257\n1864#3:259\n1620#3:260\n1734#3,3:261\n1557#3:264\n1628#3,3:265\n1755#3,3:268\n1611#3,9:271\n1863#3:280\n1864#3:282\n1620#3:283\n1863#3,2:284\n3436#3,7:286\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n162#1:258\n188#1:281\n90#1:236\n90#1:237,2\n159#1:239,3\n161#1:242,3\n162#1:245,3\n162#1:248,9\n162#1:257\n162#1:259\n162#1:260\n165#1:261,3\n175#1:264\n175#1:265,3\n183#1:268,3\n188#1:271,9\n188#1:280\n188#1:282\n188#1:283\n201#1:284,2\n215#1:286,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class d<TAnnotation> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final i30.g f52584a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final y10.a0 f52585b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final i30.m f52586c;

        public a(@m80.l i30.g gVar, @m80.l y10.a0 a0Var, @m80.l i30.m mVar) {
            this.f52584a = gVar;
            this.f52585b = a0Var;
            this.f52586c = mVar;
        }

        @m80.l
        public final y10.a0 a() {
            return this.f52585b;
        }

        @m80.l
        public final i30.g b() {
            return this.f52584a;
        }

        @m80.l
        public final i30.m c() {
            return this.f52586c;
        }
    }

    public static final Iterable I(d dVar, i30.o oVar, a it) {
        i30.g b11;
        i30.l A0;
        List<i30.m> h02;
        a aVar;
        i30.g b12;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((dVar.z() && (b12 = it.b()) != null && oVar.n(b12)) || (b11 = it.b()) == null || (A0 = oVar.A0(b11)) == null || (h02 = oVar.h0(A0)) == null) {
            return null;
        }
        List<i30.m> list = h02;
        List<i30.k> j02 = oVar.j0(it.b());
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = j02.iterator();
        ArrayList arrayList = new ArrayList(Math.min(a00.i0.d0(list, 10), a00.i0.d0(j02, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            i30.k kVar = (i30.k) it3.next();
            i30.m mVar = (i30.m) next;
            if (oVar.y(kVar)) {
                aVar = new a(null, it.a(), mVar);
            } else {
                i30.g H = oVar.H(kVar);
                aVar = new a(H, dVar.f(H, it.a()), mVar);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static final h e(f1 f1Var, h[] hVarArr, int i11) {
        Map<Integer, h> b11;
        h hVar;
        return (f1Var == null || (b11 = f1Var.b()) == null || (hVar = b11.get(Integer.valueOf(i11))) == null) ? (i11 < 0 || i11 >= hVarArr.length) ? h.f52608e.a() : hVarArr[i11] : hVar;
    }

    public static final boolean i(d dVar, a aVar, Object extractNullability) {
        kotlin.jvm.internal.g0.p(extractNullability, "$this$extractNullability");
        return dVar.l(extractNullability, aVar.b());
    }

    @m80.k
    public abstract i30.o A();

    public abstract boolean B(@m80.k i30.g gVar);

    public abstract boolean C();

    public abstract boolean D(@m80.k i30.g gVar, @m80.k i30.g gVar2);

    public abstract boolean E(@m80.k i30.m mVar);

    public boolean F(@m80.k i30.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return false;
    }

    public final j G(j jVar, j jVar2) {
        return jVar == null ? jVar2 : (jVar2 != null && ((jVar.d() && !jVar2.d()) || ((jVar.d() || !jVar2.d()) && (jVar.c().compareTo(jVar2.c()) < 0 || jVar.c().compareTo(jVar2.c()) <= 0)))) ? jVar2 : jVar;
    }

    public final List<a> H(i30.g gVar) {
        return j(new a(gVar, f(gVar, r()), null), new c(this, A()));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x00.l<java.lang.Integer, g20.h> d(@m80.k i30.g r10, @m80.k java.lang.Iterable<? extends i30.g> r11, @m80.l g20.f1 r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.util.List r0 = r9.H(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a00.i0.d0(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            i30.g r3 = (i30.g) r3
            java.util.List r3 = r9.H(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.w()
            r3 = 1
            if (r2 != 0) goto L68
            boolean r2 = r9.C()
            if (r2 == 0) goto L63
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4c
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4c
            goto L63
        L4c:
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r11.next()
            i30.g r2 = (i30.g) r2
            boolean r2 = r9.D(r10, r2)
            if (r2 != 0) goto L50
            goto L68
        L63:
            int r10 = r0.size()
            goto L69
        L68:
            r10 = r3
        L69:
            g20.h[] r11 = new g20.h[r10]
            r2 = 0
            r4 = r2
        L6d:
            if (r4 >= r10) goto Lc7
            java.lang.Object r5 = r0.get(r4)
            g20.d$a r5 = (g20.d.a) r5
            g20.h r5 = r9.h(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L82:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La8
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = a00.r0.b3(r8, r4)
            g20.d$a r8 = (g20.d.a) r8
            if (r8 == 0) goto La1
            i30.g r8 = r8.b()
            if (r8 == 0) goto La1
            g20.h r8 = r9.g(r8)
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto L82
            r6.add(r8)
            goto L82
        La8:
            if (r4 != 0) goto Lb2
            boolean r7 = r9.C()
            if (r7 == 0) goto Lb2
            r7 = r3
            goto Lb3
        Lb2:
            r7 = r2
        Lb3:
            if (r4 != 0) goto Lbd
            boolean r8 = r9.s()
            if (r8 == 0) goto Lbd
            r8 = r3
            goto Lbe
        Lbd:
            r8 = r2
        Lbe:
            g20.h r5 = g20.h1.a(r5, r6, r7, r8, r13)
            r11[r4] = r5
            int r4 = r4 + 1
            goto L6d
        Lc7:
            g20.b r10 = new g20.b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.d.d(i30.g, java.lang.Iterable, g20.f1, boolean):x00.l");
    }

    public final y10.a0 f(i30.g gVar, y10.a0 a0Var) {
        return m().d(a0Var, n(gVar));
    }

    public final h g(i30.g gVar) {
        NullabilityQualifier nullabilityQualifier;
        NullabilityQualifier y11 = y(gVar);
        MutabilityQualifier mutabilityQualifier = null;
        if (y11 == null) {
            i30.g v11 = v(gVar);
            nullabilityQualifier = v11 != null ? y(v11) : null;
        } else {
            nullabilityQualifier = y11;
        }
        i30.o A = A();
        o10.a aVar = o10.a.f75522a;
        if (aVar.l(x(A.G0(gVar)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (aVar.k(x(A.z(gVar)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new h(nullabilityQualifier, mutabilityQualifier, A().z0(gVar) || F(gVar), nullabilityQualifier != y11);
    }

    public final h h(a aVar) {
        List J;
        j jVar;
        i30.g b11;
        i30.l A0;
        if (aVar.b() == null) {
            i30.o A = A();
            i30.m c11 = aVar.c();
            if ((c11 != null ? A.p(c11) : null) == TypeVariance.IN) {
                return h.f52608e.a();
            }
        }
        boolean z11 = false;
        boolean z12 = aVar.c() == null;
        i30.g b12 = aVar.b();
        if (b12 == null || (J = n(b12)) == null) {
            J = a00.h0.J();
        }
        i30.o A2 = A();
        i30.g b13 = aVar.b();
        i30.m k11 = (b13 == null || (A0 = A2.A0(b13)) == null) ? null : A2.k(A0);
        boolean z13 = q() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z12) {
            if (z13 || !u() || (b11 = aVar.b()) == null || !B(b11)) {
                J = a00.r0.E4(p(), J);
            } else {
                Iterable<TAnnotation> p11 = p();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : p11) {
                    if (!m().p(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                J = a00.r0.I4(arrayList, J);
            }
        }
        MutabilityQualifier g11 = m().g(J);
        j h11 = m().h(J, new g20.a(this, aVar));
        if (h11 != null) {
            NullabilityQualifier c12 = h11.c();
            if (h11.c() == NullabilityQualifier.NOT_NULL && k11 != null) {
                z11 = true;
            }
            return new h(c12, g11, z11, h11.d());
        }
        AnnotationQualifierApplicabilityType q11 = (z12 || z13) ? q() : AnnotationQualifierApplicabilityType.TYPE_USE;
        y10.a0 a11 = aVar.a();
        y10.t a12 = a11 != null ? a11.a(q11) : null;
        j o11 = k11 != null ? o(k11) : null;
        j t11 = t(o11, a12);
        boolean z14 = (o11 != null ? o11.c() : null) == NullabilityQualifier.NOT_NULL || !(k11 == null || a12 == null || !a12.c());
        i30.m c13 = aVar.c();
        if (c13 == null || (jVar = o(c13)) == null) {
            jVar = null;
        } else if (jVar.c() == NullabilityQualifier.NULLABLE) {
            jVar = j.b(jVar, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        j G = G(jVar, t11);
        NullabilityQualifier c14 = G != null ? G.c() : null;
        if (G != null && G.d()) {
            z11 = true;
        }
        return new h(c14, g11, z14, z11);
    }

    public final <T> List<T> j(T t11, x00.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        k(t11, arrayList, lVar);
        return arrayList;
    }

    public final <T> void k(T t11, List<T> list, x00.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t11);
        Iterable<? extends T> invoke = lVar.invoke(t11);
        if (invoke != null) {
            Iterator<? extends T> it = invoke.iterator();
            while (it.hasNext()) {
                k(it.next(), list, lVar);
            }
        }
    }

    public abstract boolean l(@m80.k TAnnotation tannotation, @m80.l i30.g gVar);

    @m80.k
    public abstract y10.b<TAnnotation> m();

    @m80.k
    public abstract Iterable<TAnnotation> n(@m80.k i30.g gVar);

    public final j o(i30.m mVar) {
        List<i30.g> list;
        NullabilityQualifier nullabilityQualifier;
        i30.o A = A();
        if (!E(mVar)) {
            return null;
        }
        List<i30.g> R = A.R(mVar);
        List<i30.g> list2 = R;
        boolean z11 = list2 instanceof Collection;
        if (!z11 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!A.q((i30.g) it.next())) {
                    if (!z11 || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (y((i30.g) it2.next()) != null) {
                                list = R;
                                break;
                            }
                        }
                    }
                    if (!z11 || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (v((i30.g) it3.next()) != null) {
                                list = new ArrayList<>();
                                Iterator<T> it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    i30.g v11 = v((i30.g) it4.next());
                                    if (v11 != null) {
                                        list.add(v11);
                                    }
                                }
                                List<i30.g> list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator<T> it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        if (!A.t0((i30.g) it5.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                return new j(nullabilityQualifier, list != R);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @m80.k
    public abstract Iterable<TAnnotation> p();

    @m80.k
    public abstract AnnotationQualifierApplicabilityType q();

    @m80.l
    public abstract y10.a0 r();

    public abstract boolean s();

    @m80.l
    public abstract j t(@m80.l j jVar, @m80.l y10.t tVar);

    public abstract boolean u();

    @m80.l
    public abstract i30.g v(@m80.k i30.g gVar);

    public boolean w() {
        return false;
    }

    @m80.l
    public abstract n20.d x(@m80.k i30.g gVar);

    public final NullabilityQualifier y(i30.g gVar) {
        i30.o A = A();
        if (A.B0(A.G0(gVar))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (A.B0(A.z(gVar))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    public abstract boolean z();
}
