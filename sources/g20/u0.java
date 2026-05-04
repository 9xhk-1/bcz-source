package g20;

import g20.c1;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder\n*L\n1#1,315:1\n255#1:317\n13#2:316\n261#3:318\n261#3:319\n261#3:320\n261#3:321\n261#3:322\n261#3:323\n261#3:324\n261#3:325\n261#3:326\n261#3:327\n261#3:328\n261#3:329\n261#3:330\n261#3:331\n261#3:332\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n*L\n67#1:317\n56#1:316\n68#1:318\n73#1:319\n78#1:320\n93#1:321\n117#1:322\n134#1:323\n182#1:324\n202#1:325\n208#1:326\n214#1:327\n221#1:328\n226#1:329\n232#1:330\n238#1:331\n245#1:332\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h f52642a = new h(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h f52643b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final h f52644c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<String, v0> f52645d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f52643b = new h(nullabilityQualifier, null, false, false, 8, null);
        f52644c = new h(nullabilityQualifier, null, true, false, 8, null);
        h20.f0 f0Var = h20.f0.f58067a;
        String h11 = f0Var.h("Object");
        String g11 = f0Var.g("Predicate");
        String g12 = f0Var.g("Function");
        String g13 = f0Var.g("Consumer");
        String g14 = f0Var.g("BiFunction");
        String g15 = f0Var.g("BiConsumer");
        String g16 = f0Var.g("UnaryOperator");
        String i11 = f0Var.i("stream/Stream");
        String i12 = f0Var.i("Optional");
        c1 c1Var = new c1();
        c1.a.b(new c1.a(c1Var, f0Var.i("Iterator")), "forEachRemaining", null, new k(g13), 2, null);
        c1.a.b(new c1.a(c1Var, f0Var.h("Iterable")), "spliterator", null, new v(f0Var), 2, null);
        c1.a aVar = new c1.a(c1Var, f0Var.i("Collection"));
        c1.a.b(aVar, "removeIf", null, new g0(g11), 2, null);
        c1.a.b(aVar, "stream", null, new n0(i11), 2, null);
        c1.a.b(aVar, "parallelStream", null, new o0(i11), 2, null);
        c1.a aVar2 = new c1.a(c1Var, f0Var.i("List"));
        c1.a.b(aVar2, "replaceAll", null, new p0(g16), 2, null);
        aVar2.a("addFirst", "2.1", new q0(h11));
        aVar2.a("addLast", "2.1", new r0(h11));
        aVar2.a("removeFirst", "2.1", new s0(h11));
        aVar2.a("removeLast", "2.1", new t0(h11));
        c1.a aVar3 = new c1.a(c1Var, f0Var.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new l(h11));
        aVar3.a("addLast", "2.1", new m(h11));
        aVar3.a("removeFirst", "2.1", new n(h11));
        aVar3.a("removeLast", "2.1", new o(h11));
        c1.a aVar4 = new c1.a(c1Var, f0Var.i("Map"));
        c1.a.b(aVar4, "forEach", null, new p(g15), 2, null);
        c1.a.b(aVar4, "putIfAbsent", null, new q(h11), 2, null);
        c1.a.b(aVar4, "replace", null, new r(h11), 2, null);
        c1.a.b(aVar4, "replace", null, new s(h11), 2, null);
        c1.a.b(aVar4, "replaceAll", null, new t(g14), 2, null);
        c1.a.b(aVar4, "compute", null, new u(h11, g14), 2, null);
        c1.a.b(aVar4, "computeIfAbsent", null, new w(h11, g12), 2, null);
        c1.a.b(aVar4, "computeIfPresent", null, new x(h11, g14), 2, null);
        c1.a.b(aVar4, "merge", null, new y(h11, g14), 2, null);
        c1.a aVar5 = new c1.a(c1Var, i12);
        c1.a.b(aVar5, "empty", null, new z(i12), 2, null);
        c1.a.b(aVar5, "of", null, new a0(h11, i12), 2, null);
        c1.a.b(aVar5, "ofNullable", null, new b0(h11, i12), 2, null);
        c1.a.b(aVar5, ct.d.f46852f, null, new c0(h11), 2, null);
        c1.a.b(aVar5, "ifPresent", null, new d0(g13), 2, null);
        c1.a.b(new c1.a(c1Var, f0Var.h("ref/Reference")), ct.d.f46852f, null, new e0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, g11), "test", null, new f0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, f0Var.g("BiPredicate")), "test", null, new h0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, g13), "accept", null, new i0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, g15), "accept", null, new j0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, g12), "apply", null, new k0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, g14), "apply", null, new l0(h11), 2, null);
        c1.a.b(new c1.a(c1Var, f0Var.g("Supplier")), ct.d.f46852f, null, new m0(h11), 2, null);
        f52645d = c1Var.b();
    }

    public static final g2 A(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b);
        function.d(JvmPrimitiveType.BOOLEAN);
        return g2.f100423a;
    }

    public static final g2 B(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str, hVar);
        function.d(JvmPrimitiveType.BOOLEAN);
        return g2.f100423a;
    }

    public static final g2 C(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 D(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str, hVar);
        return g2.f100423a;
    }

    public static final g2 E(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.c(str, hVar);
        return g2.f100423a;
    }

    public static final g2 F(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str, hVar);
        function.c(str, hVar);
        return g2.f100423a;
    }

    public static final g2 G(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 H(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar, hVar);
        function.d(JvmPrimitiveType.BOOLEAN);
        return g2.f100423a;
    }

    public static final g2 I(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.c(str, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 J(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.c(str, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 a(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 b(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 c(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 d(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 e(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 f(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 g(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 h(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 i(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 j(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52643b);
        return g2.f100423a;
    }

    public static final g2 k(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 l(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str, hVar);
        function.c(str, f52642a);
        return g2.f100423a;
    }

    public static final g2 m(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str, hVar);
        function.c(str, f52642a);
        return g2.f100423a;
    }

    public static final g2 n(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str, hVar);
        function.b(str, hVar);
        function.d(JvmPrimitiveType.BOOLEAN);
        return g2.f100423a;
    }

    public static final g2 o(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar, hVar, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 p(String str, String str2, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        h hVar2 = f52642a;
        function.b(str2, hVar, hVar, hVar2, hVar2);
        function.c(str, hVar2);
        return g2.f100423a;
    }

    public static final g2 q(String str, String str2, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        function.b(str2, hVar, hVar, hVar);
        function.c(str, hVar);
        return g2.f100423a;
    }

    public static final g2 r(String str, String str2, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        h hVar2 = f52644c;
        h hVar3 = f52642a;
        function.b(str2, hVar, hVar, hVar2, hVar3);
        function.c(str, hVar3);
        return g2.f100423a;
    }

    public static final g2 s(String str, String str2, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52643b;
        function.b(str, hVar);
        h hVar2 = f52644c;
        function.b(str, hVar2);
        h hVar3 = f52642a;
        function.b(str2, hVar, hVar2, hVar2, hVar3);
        function.c(str, hVar3);
        return g2.f100423a;
    }

    public static final g2 t(h20.f0 f0Var, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        String i11 = f0Var.i("Spliterator");
        h hVar = f52643b;
        function.c(i11, hVar, hVar);
        return g2.f100423a;
    }

    public static final g2 u(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52643b, f52644c);
        return g2.f100423a;
    }

    @m80.k
    public static final Map<String, v0> u0() {
        return f52645d;
    }

    public static final g2 v(String str, String str2, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        h hVar = f52644c;
        function.b(str, hVar);
        function.c(str2, f52643b, hVar);
        return g2.f100423a;
    }

    public static final g2 w(String str, String str2, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52642a);
        function.c(str2, f52643b, f52644c);
        return g2.f100423a;
    }

    public static final g2 x(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52644c);
        return g2.f100423a;
    }

    public static final g2 y(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.b(str, f52643b, f52644c);
        return g2.f100423a;
    }

    public static final g2 z(String str, c1.a.C0623a function) {
        kotlin.jvm.internal.g0.p(function, "$this$function");
        function.c(str, f52642a);
        return g2.f100423a;
    }
}
