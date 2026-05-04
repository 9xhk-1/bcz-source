package q20;

import e30.c1;
import e30.f2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.b0;
import p10.h1;
import p10.l1;
import p10.q0;
import p10.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ninlineClassesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1557#2:101\n1628#2,3:102\n1557#2:106\n1628#2,3:107\n1755#2,3:110\n1#3:105\n*S KotlinDebug\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n*L\n39#1:101\n39#1:102,3\n56#1:106\n56#1:107,3\n67#1:110,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n20.c f81471a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final n20.b f81472b;

    static {
        n20.c cVar = new n20.c("kotlin.jvm.JvmInline");
        f81471a = cVar;
        f81472b = n20.b.f74280d.c(cVar);
    }

    public static final boolean a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        g0.p(aVar, "<this>");
        if (!(aVar instanceof r0)) {
            return false;
        }
        q0 j02 = ((r0) aVar).j0();
        g0.o(j02, "getCorrespondingProperty(...)");
        return f(j02);
    }

    public static final boolean b(@m80.k p10.h hVar) {
        g0.p(hVar, "<this>");
        return (hVar instanceof p10.b) && (((p10.b) hVar).i0() instanceof p10.u);
    }

    public static final boolean c(@m80.k e30.r0 r0Var) {
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        if (r11 != null) {
            return b(r11);
        }
        return false;
    }

    public static final boolean d(@m80.k p10.h hVar) {
        g0.p(hVar, "<this>");
        return (hVar instanceof p10.b) && (((p10.b) hVar).i0() instanceof b0);
    }

    public static final boolean e(@m80.k l1 l1Var) {
        p10.u<c1> q11;
        g0.p(l1Var, "<this>");
        if (l1Var.f0() != null) {
            return false;
        }
        p10.h b11 = l1Var.b();
        n20.f fVar = null;
        p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
        if (bVar != null && (q11 = u20.e.q(bVar)) != null) {
            fVar = q11.c();
        }
        return g0.g(fVar, l1Var.getName());
    }

    public static final boolean f(@m80.k l1 l1Var) {
        h1<c1> i02;
        g0.p(l1Var, "<this>");
        if (l1Var.f0() != null) {
            return false;
        }
        p10.h b11 = l1Var.b();
        p10.b bVar = b11 instanceof p10.b ? (p10.b) b11 : null;
        if (bVar == null || (i02 = bVar.i0()) == null) {
            return false;
        }
        n20.f name = l1Var.getName();
        g0.o(name, "getName(...)");
        return i02.a(name);
    }

    public static final boolean g(@m80.k p10.h hVar) {
        g0.p(hVar, "<this>");
        return b(hVar) || d(hVar);
    }

    public static final boolean h(@m80.k e30.r0 r0Var) {
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        if (r11 != null) {
            return g(r11);
        }
        return false;
    }

    public static final boolean i(@m80.k e30.r0 r0Var) {
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        return (r11 == null || !d(r11) || f30.u.f50458a.t0(r0Var)) ? false : true;
    }

    @m80.l
    public static final e30.r0 j(@m80.k e30.r0 r0Var) {
        g0.p(r0Var, "<this>");
        e30.r0 k11 = k(r0Var);
        if (k11 != null) {
            return f2.f(r0Var).p(k11, Variance.INVARIANT);
        }
        return null;
    }

    @m80.l
    public static final e30.r0 k(@m80.k e30.r0 r0Var) {
        p10.u<c1> q11;
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
        if (bVar == null || (q11 = u20.e.q(bVar)) == null) {
            return null;
        }
        return q11.d();
    }
}
