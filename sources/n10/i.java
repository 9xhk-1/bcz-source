package n10;

import a00.h0;
import a00.i0;
import a00.k1;
import a00.l1;
import e30.a2;
import e30.c1;
import e30.r0;
import e30.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import n10.o;
import s20.y;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1#2:302\n1557#3:303\n1628#3,3:304\n230#3,2:307\n1557#3:309\n1628#3,3:310\n1557#3:313\n1628#3,3:314\n1598#3,4:317\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n160#1:303\n160#1:304,3\n195#1:307,2\n200#1:309\n200#1:310,3\n222#1:313\n222#1:314,3\n225#1:317,4\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    public static final int a(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        q10.c i11 = r0Var.getAnnotations().i(o.a.D);
        if (i11 == null) {
            return 0;
        }
        s20.g gVar = (s20.g) l1.K(i11.a(), o.f74019q);
        g0.n(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((s20.n) gVar).b().intValue();
    }

    @w00.k
    @m80.k
    public static final c1 b(@m80.k j builtIns, @m80.k q10.g annotations, @m80.l r0 r0Var, @m80.k List<? extends r0> contextReceiverTypes, @m80.k List<? extends r0> parameterTypes, @m80.l List<n20.f> list, @m80.k r0 returnType, boolean z11) {
        g0.p(builtIns, "builtIns");
        g0.p(annotations, "annotations");
        g0.p(contextReceiverTypes, "contextReceiverTypes");
        g0.p(parameterTypes, "parameterTypes");
        g0.p(returnType, "returnType");
        List<a2> g11 = g(r0Var, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        p10.b f11 = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (r0Var == null ? 0 : 1), z11);
        if (r0Var != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return e30.u0.h(s1.b(annotations), f11, g11);
    }

    @m80.l
    public static final n20.f d(@m80.k r0 r0Var) {
        String b11;
        g0.p(r0Var, "<this>");
        q10.c i11 = r0Var.getAnnotations().i(o.a.E);
        if (i11 == null) {
            return null;
        }
        Object n52 = a00.r0.n5(i11.a().values());
        y yVar = n52 instanceof y ? (y) n52 : null;
        if (yVar != null && (b11 = yVar.b()) != null) {
            if (!n20.f.i(b11)) {
                b11 = null;
            }
            if (b11 != null) {
                return n20.f.f(b11);
            }
        }
        return null;
    }

    @m80.k
    public static final List<r0> e(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p(r0Var);
        int a11 = a(r0Var);
        if (a11 == 0) {
            return h0.J();
        }
        List<a2> subList = r0Var.G0().subList(0, a11);
        ArrayList arrayList = new ArrayList(i0.d0(subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((a2) it.next()).getType());
        }
        return arrayList;
    }

    @m80.k
    public static final p10.b f(@m80.k j builtIns, int i11, boolean z11) {
        g0.p(builtIns, "builtIns");
        p10.b X = z11 ? builtIns.X(i11) : builtIns.C(i11);
        g0.m(X);
        return X;
    }

    @m80.k
    public static final List<a2> g(@m80.l r0 r0Var, @m80.k List<? extends r0> contextReceiverTypes, @m80.k List<? extends r0> parameterTypes, @m80.l List<n20.f> list, @m80.k r0 returnType, @m80.k j builtIns) {
        n20.f fVar;
        j jVar;
        g0.p(contextReceiverTypes, "contextReceiverTypes");
        g0.p(parameterTypes, "parameterTypes");
        g0.p(returnType, "returnType");
        g0.p(builtIns, "builtIns");
        int i11 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (r0Var != null ? 1 : 0) + 1);
        List<? extends r0> list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(j30.e.e((r0) it.next()));
        }
        arrayList.addAll(arrayList2);
        o30.a.a(arrayList, r0Var != null ? j30.e.e(r0Var) : null);
        for (Object obj : parameterTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            r0 r0Var2 = (r0) obj;
            if (list == null || (fVar = list.get(i11)) == null || fVar.g()) {
                fVar = null;
            }
            if (fVar != null) {
                n20.c cVar = o.a.E;
                n20.f fVar2 = o.f74015m;
                String b11 = fVar.b();
                g0.o(b11, "asString(...)");
                Map k11 = k1.k(h1.a(fVar2, new y(b11)));
                jVar = builtIns;
                r0Var2 = j30.e.D(r0Var2, q10.g.A0.a(a00.r0.F4(r0Var2.getAnnotations(), new q10.k(jVar, cVar, k11, false, 8, null))));
            } else {
                jVar = builtIns;
            }
            arrayList.add(j30.e.e(r0Var2));
            i11 = i12;
            builtIns = jVar;
        }
        arrayList.add(j30.e.e(returnType));
        return arrayList;
    }

    @m80.l
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e h(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        if (r11 != null) {
            return j(r11);
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e i(n20.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.f a11 = kotlin.reflect.jvm.internal.impl.builtins.functions.f.f67208c.a();
        n20.c e11 = dVar.l().e();
        g0.o(e11, "parent(...)");
        String b11 = dVar.i().b();
        g0.o(b11, "asString(...)");
        return a11.b(e11, b11);
    }

    @m80.l
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.e j(@m80.k p10.h hVar) {
        g0.p(hVar, "<this>");
        if ((hVar instanceof p10.b) && j.B0(hVar)) {
            return i(u20.e.p(hVar));
        }
        return null;
    }

    @m80.l
    public static final r0 k(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p(r0Var);
        if (!s(r0Var)) {
            return null;
        }
        return r0Var.G0().get(a(r0Var)).getType();
    }

    @m80.k
    public static final r0 l(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p(r0Var);
        r0 type = ((a2) a00.r0.u3(r0Var.G0())).getType();
        g0.o(type, "getType(...)");
        return type;
    }

    @m80.k
    public static final List<a2> m(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p(r0Var);
        return r0Var.G0().subList(a(r0Var) + (n(r0Var) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return p(r0Var) && s(r0Var);
    }

    public static final boolean o(@m80.k p10.h hVar) {
        g0.p(hVar, "<this>");
        kotlin.reflect.jvm.internal.impl.builtins.functions.e j11 = j(hVar);
        return g0.g(j11, e.a.f67204e) || g0.g(j11, e.d.f67207e);
    }

    public static final boolean p(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        return r11 != null && o(r11);
    }

    public static final boolean q(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return g0.g(h(r0Var), e.a.f67204e);
    }

    public static final boolean r(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return g0.g(h(r0Var), e.d.f67207e);
    }

    public static final boolean s(r0 r0Var) {
        return r0Var.getAnnotations().i(o.a.C) != null;
    }

    @m80.k
    public static final q10.g t(@m80.k q10.g gVar, @m80.k j builtIns, int i11) {
        g0.p(gVar, "<this>");
        g0.p(builtIns, "builtIns");
        n20.c cVar = o.a.D;
        return gVar.a0(cVar) ? gVar : q10.g.A0.a(a00.r0.F4(gVar, new q10.k(builtIns, cVar, k1.k(h1.a(o.f74019q, new s20.n(i11))), false, 8, null)));
    }

    @m80.k
    public static final q10.g u(@m80.k q10.g gVar, @m80.k j builtIns) {
        g0.p(gVar, "<this>");
        g0.p(builtIns, "builtIns");
        n20.c cVar = o.a.C;
        return gVar.a0(cVar) ? gVar : q10.g.A0.a(a00.r0.F4(gVar, new q10.k(builtIns, cVar, l1.z(), false, 8, null)));
    }
}
