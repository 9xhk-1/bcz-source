package f30;

import e30.a2;
import e30.h2;
import e30.r0;
import e30.u1;
import e30.v1;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1755#2,3:109\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n*L\n51#1:109,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d0 {
    public static final r0 a(r0 r0Var) {
        return k30.d.c(r0Var).d();
    }

    public static final String b(u1 u1Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + u1Var, sb2);
        c("hashCode: " + u1Var.hashCode(), sb2);
        c("javaClass: " + u1Var.getClass().getCanonicalName(), sb2);
        for (p10.h r11 = u1Var.r(); r11 != null; r11 = r11.b()) {
            c("fqName: " + p20.m.f78747h.Q(r11), sb2);
            c("javaClass: " + r11.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final StringBuilder c(String str, StringBuilder sb2) {
        g0.p(str, "<this>");
        sb2.append(str);
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        return sb2;
    }

    @m80.l
    public static final r0 d(@m80.k r0 subtype, @m80.k r0 supertype, @m80.k z typeCheckingProcedureCallbacks) {
        g0.p(subtype, "subtype");
        g0.p(supertype, "supertype");
        g0.p(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new w(subtype, null));
        u1 I0 = supertype.I0();
        while (!arrayDeque.isEmpty()) {
            w wVar = (w) arrayDeque.poll();
            r0 b11 = wVar.b();
            u1 I02 = b11.I0();
            if (typeCheckingProcedureCallbacks.a(I02, I0)) {
                boolean J0 = b11.J0();
                for (w a11 = wVar.a(); a11 != null; a11 = a11.a()) {
                    r0 b12 = a11.b();
                    List<a2> G0 = b12.G0();
                    if (!(G0 instanceof Collection) || !G0.isEmpty()) {
                        Iterator<T> it = G0.iterator();
                        while (it.hasNext()) {
                            Variance b13 = ((a2) it.next()).b();
                            Variance variance = Variance.INVARIANT;
                            if (b13 != variance) {
                                r0 n11 = r20.e.h(v1.f48674c.a(b12), false, 1, null).c().n(b11, variance);
                                g0.o(n11, "safeSubstitute(...)");
                                b11 = a(n11);
                                break;
                            }
                        }
                    }
                    b11 = v1.f48674c.a(b12).c().n(b11, Variance.INVARIANT);
                    g0.m(b11);
                    J0 = J0 || b12.J0();
                }
                u1 I03 = b11.I0();
                if (typeCheckingProcedureCallbacks.a(I03, I0)) {
                    return h2.p(b11, J0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(I03) + ", \n\nsupertype: " + b(I0) + " \n" + typeCheckingProcedureCallbacks.a(I03, I0));
            }
            for (r0 r0Var : I02.c()) {
                g0.m(r0Var);
                arrayDeque.add(new w(r0Var, wVar));
            }
        }
        return null;
    }
}
