package kotlin.reflect.jvm.internal;

import c30.n0;
import e30.h2;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import k10.q2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.calls.b;
import kotlin.reflect.jvm.internal.p;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes8.dex */
public final class q {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.a<?> b(kotlin.reflect.jvm.internal.p.a<?, ?> r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.q.b(kotlin.reflect.jvm.internal.p$a, boolean):kotlin.reflect.jvm.internal.calls.a");
    }

    public static final kotlin.reflect.jvm.internal.calls.b<Field> c(p.a<?, ?> aVar, boolean z11, Field field) {
        return (g(aVar.d0().c0()) || !Modifier.isStatic(field.getModifiers())) ? z11 ? aVar.a0() ? new b.f.a(field, f(aVar)) : new b.f.c(field) : aVar.a0() ? new b.g.a(field, e(aVar), f(aVar)) : new b.g.c(field, e(aVar)) : d(aVar) ? z11 ? aVar.a0() ? new b.f.C0785b(field) : new b.f.d(field) : aVar.a0() ? new b.g.C0786b(field, e(aVar)) : new b.g.d(field, e(aVar)) : z11 ? new b.f.e(field) : new b.g.e(field, e(aVar));
    }

    public static final boolean d(p.a<?, ?> aVar) {
        return aVar.d0().c0().getAnnotations().a0(q2.l());
    }

    public static final boolean e(p.a<?, ?> aVar) {
        return !h2.l(aVar.d0().c0().getType());
    }

    @m80.l
    public static final Object f(@m80.k p.a<?, ?> aVar) {
        g0.p(aVar, "<this>");
        return aVar.d0().i0();
    }

    public static final boolean g(q0 q0Var) {
        p10.h b11 = q0Var.b();
        g0.o(b11, "getContainingDeclaration(...)");
        if (!q20.h.x(b11)) {
            return false;
        }
        p10.h b12 = b11.b();
        if (q20.h.C(b12) || q20.h.t(b12)) {
            return (q0Var instanceof n0) && m20.i.f(((n0) q0Var).M());
        }
        return true;
    }
}
