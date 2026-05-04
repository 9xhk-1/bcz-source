package g20;

import e30.a2;
import e30.h2;
import e30.k2;
import e30.r1;
import e30.s1;
import e30.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3436#3,7:264\n1734#3,3:271\n3436#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b20.e f52598a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final e30.r0 f52599a;

        /* renamed from: b, reason: collision with root package name */
        public final int f52600b;

        public a(@m80.l e30.r0 r0Var, int i11) {
            this.f52599a = r0Var;
            this.f52600b = i11;
        }

        public final int a() {
            return this.f52600b;
        }

        @m80.l
        public final e30.r0 b() {
            return this.f52599a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final e30.c1 f52601a;

        /* renamed from: b, reason: collision with root package name */
        public final int f52602b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f52603c;

        public b(@m80.l e30.c1 c1Var, int i11, boolean z11) {
            this.f52601a = c1Var;
            this.f52602b = i11;
            this.f52603c = z11;
        }

        public final boolean a() {
            return this.f52603c;
        }

        public final int b() {
            return this.f52602b;
        }

        @m80.l
        public final e30.c1 c() {
            return this.f52601a;
        }
    }

    public g(@m80.k b20.e javaResolverSettings) {
        kotlin.jvm.internal.g0.p(javaResolverSettings, "javaResolverSettings");
        this.f52598a = javaResolverSettings;
    }

    public static /* synthetic */ b c(g gVar, e30.c1 c1Var, x00.l lVar, int i11, TypeComponentPosition typeComponentPosition, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            z12 = false;
        }
        return gVar.b(c1Var, lVar, i11, typeComponentPosition, z11, z12);
    }

    @m80.l
    public final e30.r0 a(@m80.k e30.r0 r0Var, @m80.k x00.l<? super Integer, h> qualifiers, boolean z11) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(qualifiers, "qualifiers");
        return d(r0Var.L0(), qualifiers, 0, z11).b();
    }

    public final b b(e30.c1 c1Var, x00.l<? super Integer, h> lVar, int i11, TypeComponentPosition typeComponentPosition, boolean z11, boolean z12) {
        p10.d f11;
        Boolean h11;
        u1 I0;
        f fVar;
        q10.g e11;
        Boolean bool;
        a aVar;
        a2 s11;
        x00.l<? super Integer, h> lVar2 = lVar;
        boolean a11 = e1.a(typeComponentPosition);
        boolean z13 = (z12 && z11) ? false : true;
        e30.r0 r0Var = null;
        if (!a11 && c1Var.G0().isEmpty()) {
            return new b(null, 1, false);
        }
        p10.d r11 = c1Var.I0().r();
        if (r11 == null) {
            return new b(null, 1, false);
        }
        h invoke = lVar2.invoke(Integer.valueOf(i11));
        f11 = g1.f(r11, invoke, typeComponentPosition);
        h11 = g1.h(invoke, typeComponentPosition);
        if (f11 == null || (I0 = f11.o()) == null) {
            I0 = c1Var.I0();
        }
        u1 u1Var = I0;
        int i12 = i11 + 1;
        List<a2> G0 = c1Var.G0();
        List<p10.c1> parameters = u1Var.getParameters();
        kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
        List<p10.c1> list = parameters;
        Iterator<T> it = G0.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(a00.i0.d0(G0, 10), a00.i0.d0(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            p10.c1 c1Var2 = (p10.c1) it2.next();
            a2 a2Var = (a2) next;
            if (z13) {
                bool = h11;
                if (!a2Var.a()) {
                    aVar = d(a2Var.getType().L0(), lVar2, i12, z12);
                } else if (lVar2.invoke(Integer.valueOf(i12)).f() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    k2 L0 = a2Var.getType().L0();
                    aVar = new a(e30.u0.e(e30.l0.c(L0).M0(false), e30.l0.d(L0).M0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = h11;
                aVar = new a(r0Var, 0);
            }
            i12 += aVar.a();
            if (aVar.b() != null) {
                e30.r0 b11 = aVar.b();
                Variance b12 = a2Var.b();
                kotlin.jvm.internal.g0.o(b12, "getProjectionKind(...)");
                s11 = j30.e.l(b11, b12, c1Var2);
            } else if (f11 == null || a2Var.a()) {
                s11 = f11 != null ? h2.s(c1Var2) : null;
            } else {
                e30.r0 type = a2Var.getType();
                kotlin.jvm.internal.g0.o(type, "getType(...)");
                Variance b13 = a2Var.b();
                kotlin.jvm.internal.g0.o(b13, "getProjectionKind(...)");
                s11 = j30.e.l(type, b13, c1Var2);
            }
            arrayList.add(s11);
            lVar2 = lVar;
            h11 = bool;
            r0Var = null;
        }
        Boolean bool2 = h11;
        int i13 = i12 - i11;
        if (f11 == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((a2) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i13, false);
        }
        q10.g annotations = c1Var.getAnnotations();
        fVar = g1.f52606b;
        if (f11 == null) {
            fVar = null;
        }
        e11 = g1.e(a00.h0.S(annotations, fVar, bool2 != null ? g1.g() : null));
        r1 b14 = s1.b(e11);
        List<a2> G02 = c1Var.G0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = G02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(a00.i0.d0(arrayList, 10), a00.i0.d0(G02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            a2 a2Var2 = (a2) it5.next();
            a2 a2Var3 = (a2) next2;
            if (a2Var3 != null) {
                a2Var2 = a2Var3;
            }
            arrayList2.add(a2Var2);
        }
        e30.c1 m11 = e30.u0.m(b14, u1Var, arrayList2, bool2 != null ? bool2.booleanValue() : c1Var.J0(), null, 16, null);
        if (invoke.d()) {
            m11 = e(m11);
        }
        return new b(m11, i13, bool2 != null && invoke.g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g20.g.a d(e30.k2 r21, x00.l<? super java.lang.Integer, g20.h> r22, int r23, boolean r24) {
        /*
            r20 = this;
            r0 = r21
            boolean r1 = e30.v0.a(r0)
            r2 = 0
            if (r1 == 0) goto L10
            g20.g$a r0 = new g20.g$a
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L10:
            boolean r1 = r0 instanceof e30.i0
            if (r1 == 0) goto Lb2
            boolean r8 = r0 instanceof e30.b1
            r1 = r0
            e30.i0 r1 = (e30.i0) r1
            e30.c1 r4 = r1.Q0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            g20.g$b r10 = r3.b(r4, r5, r6, r7, r8, r9)
            e30.c1 r4 = r1.R0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER
            g20.g$b r4 = r3.b(r4, r5, r6, r7, r8, r9)
            r10.b()
            r4.b()
            e30.c1 r3 = r10.c()
            if (r3 != 0) goto L48
            e30.c1 r3 = r4.c()
            if (r3 != 0) goto L48
            goto La8
        L48:
            boolean r2 = r10.a()
            if (r2 != 0) goto L8a
            boolean r2 = r4.a()
            if (r2 == 0) goto L55
            goto L8a
        L55:
            if (r8 == 0) goto L71
            d20.j r2 = new d20.j
            e30.c1 r0 = r10.c()
            if (r0 != 0) goto L63
            e30.c1 r0 = r1.Q0()
        L63:
            e30.c1 r3 = r4.c()
            if (r3 != 0) goto L6d
            e30.c1 r3 = r1.R0()
        L6d:
            r2.<init>(r0, r3)
            goto La8
        L71:
            e30.c1 r0 = r10.c()
            if (r0 != 0) goto L7b
            e30.c1 r0 = r1.Q0()
        L7b:
            e30.c1 r2 = r4.c()
            if (r2 != 0) goto L85
            e30.c1 r2 = r1.R0()
        L85:
            e30.k2 r2 = e30.u0.e(r0, r2)
            goto La8
        L8a:
            e30.c1 r1 = r4.c()
            if (r1 == 0) goto L9d
            e30.c1 r2 = r10.c()
            if (r2 != 0) goto L97
            r2 = r1
        L97:
            e30.k2 r1 = e30.u0.e(r2, r1)
            if (r1 != 0) goto La4
        L9d:
            e30.c1 r1 = r10.c()
            kotlin.jvm.internal.g0.m(r1)
        La4:
            e30.k2 r2 = e30.j2.d(r0, r1)
        La8:
            g20.g$a r0 = new g20.g$a
            int r1 = r10.b()
            r0.<init>(r2, r1)
            return r0
        Lb2:
            boolean r1 = r0 instanceof e30.c1
            if (r1 == 0) goto Lea
            r12 = r0
            e30.c1 r12 = (e30.c1) r12
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r15 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE
            r18 = 8
            r19 = 0
            r16 = 0
            r11 = r20
            r13 = r22
            r14 = r23
            r17 = r24
            g20.g$b r1 = c(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g20.g$a r2 = new g20.g$a
            boolean r3 = r1.a()
            if (r3 == 0) goto Lde
            e30.c1 r3 = r1.c()
            e30.k2 r0 = e30.j2.d(r0, r3)
            goto Le2
        Lde:
            e30.c1 r0 = r1.c()
        Le2:
            int r1 = r1.b()
            r2.<init>(r0, r1)
            return r2
        Lea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.g.d(e30.k2, x00.l, int, boolean):g20.g$a");
    }

    public final e30.c1 e(e30.c1 c1Var) {
        return this.f52598a.a() ? e30.g1.h(c1Var, true) : new i(c1Var);
    }
}
