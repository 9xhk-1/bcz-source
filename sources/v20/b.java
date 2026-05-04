package v20;

import e30.r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m80.k;
import n10.o;
import p10.c1;
import p10.h;
import p10.j1;
import q20.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ninlineClassManglingRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1755#2,3:54\n1755#2,3:57\n1#3:60\n*S KotlinDebug\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n*L\n21#1:54,3\n27#1:57,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    public static final boolean a(p10.b bVar) {
        return g0.g(u20.e.o(bVar), o.f74025w);
    }

    public static final boolean b(r0 r0Var, boolean z11) {
        p10.d r11 = r0Var.I0().r();
        c1 c1Var = r11 instanceof c1 ? (c1) r11 : null;
        if (c1Var == null) {
            return false;
        }
        return (z11 || !i.d(c1Var)) && e(j30.e.p(c1Var));
    }

    public static final boolean c(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        p10.d r11 = r0Var.I0().r();
        return r11 != null && ((i.b(r11) && d(r11)) || i.i(r0Var));
    }

    public static final boolean d(@k h hVar) {
        g0.p(hVar, "<this>");
        return i.g(hVar) && !a((p10.b) hVar);
    }

    public static final boolean e(r0 r0Var) {
        return c(r0Var) || b(r0Var, true);
    }

    public static final boolean f(@k CallableMemberDescriptor descriptor) {
        g0.p(descriptor, "descriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.b ? (kotlin.reflect.jvm.internal.impl.descriptors.b) descriptor : null;
        if (bVar == null || p10.o.g(bVar.getVisibility())) {
            return false;
        }
        p10.b L = bVar.L();
        g0.o(L, "getConstructedClass(...)");
        if (i.g(L) || q20.h.G(bVar.L())) {
            return false;
        }
        List<j1> g11 = bVar.g();
        g0.o(g11, "getValueParameters(...)");
        List<j1> list = g11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            r0 type = ((j1) it.next()).getType();
            g0.o(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
