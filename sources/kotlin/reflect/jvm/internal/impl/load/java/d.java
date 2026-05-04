package kotlin.reflect.jvm.internal.impl.load.java;

import e30.c1;
import f30.y;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import m80.k;
import m80.l;
import n20.f;
import p10.h;
import p10.q0;
import u20.e;
import w00.j;
import y10.k0;
import y10.l0;
import y10.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "SpecialBuiltinMembers")
@u0({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/SpecialBuiltinMembers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes8.dex */
public final class d {
    public static final boolean d(@k CallableMemberDescriptor callableMemberDescriptor) {
        g0.p(callableMemberDescriptor, "<this>");
        return g(callableMemberDescriptor) != null;
    }

    @l
    public static final String e(@k CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor w11;
        f j11;
        g0.p(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor f11 = f(callableMemberDescriptor);
        if (f11 != null && (w11 = e.w(f11)) != null) {
            if (w11 instanceof q0) {
                return y10.j.f99093a.b(w11);
            }
            if ((w11 instanceof g) && (j11 = a.f67272o.j((g) w11)) != null) {
                return j11.b();
            }
        }
        return null;
    }

    public static final CallableMemberDescriptor f(CallableMemberDescriptor callableMemberDescriptor) {
        if (n10.j.g0(callableMemberDescriptor)) {
            return g(callableMemberDescriptor);
        }
        return null;
    }

    @l
    public static final <T extends CallableMemberDescriptor> T g(@k T t11) {
        g0.p(t11, "<this>");
        if (!SpecialGenericSignatures.f67253a.g().contains(t11.getName()) && !y10.g.f99079a.d().contains(e.w(t11).getName())) {
            return null;
        }
        if ((t11 instanceof q0) || (t11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f)) {
            return (T) e.i(t11, false, k0.f99095a, 1, null);
        }
        if (t11 instanceof g) {
            return (T) e.i(t11, false, l0.f99096a, 1, null);
        }
        return null;
    }

    public static final boolean h(CallableMemberDescriptor it) {
        g0.p(it, "it");
        return y10.j.f99093a.d(e.w(it));
    }

    public static final boolean i(CallableMemberDescriptor it) {
        g0.p(it, "it");
        return a.f67272o.k((g) it);
    }

    @l
    public static final <T extends CallableMemberDescriptor> T j(@k T t11) {
        g0.p(t11, "<this>");
        T t12 = (T) g(t11);
        if (t12 != null) {
            return t12;
        }
        b bVar = b.f67273o;
        f name = t11.getName();
        g0.o(name, "getName(...)");
        if (bVar.n(name)) {
            return (T) e.i(t11, false, m0.f99098a, 1, null);
        }
        return null;
    }

    public static final boolean k(CallableMemberDescriptor it) {
        g0.p(it, "it");
        return n10.j.g0(it) && b.o(it) != null;
    }

    public static final boolean l(@k p10.b bVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a specialCallableDescriptor) {
        g0.p(bVar, "<this>");
        g0.p(specialCallableDescriptor, "specialCallableDescriptor");
        h b11 = specialCallableDescriptor.b();
        g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        c1 s11 = ((p10.b) b11).s();
        g0.o(s11, "getDefaultType(...)");
        for (p10.b s12 = q20.h.s(bVar); s12 != null; s12 = q20.h.s(s12)) {
            if (!(s12 instanceof a20.c) && y.b(s12.s(), s11) != null) {
                return !n10.j.g0(s12);
            }
        }
        return false;
    }

    public static final boolean m(@k CallableMemberDescriptor callableMemberDescriptor) {
        g0.p(callableMemberDescriptor, "<this>");
        return e.w(callableMemberDescriptor).b() instanceof a20.c;
    }

    public static final boolean n(@k CallableMemberDescriptor callableMemberDescriptor) {
        g0.p(callableMemberDescriptor, "<this>");
        return m(callableMemberDescriptor) || n10.j.g0(callableMemberDescriptor);
    }
}
