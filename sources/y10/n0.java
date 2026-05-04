package y10;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import p10.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1#2:50\n12574#3,2:51\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n*L\n47#1:51,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n0 {
    @m80.l
    public static final q10.c a(@m80.k b20.k c11, @m80.k f20.c0 wildcardType) {
        q10.c cVar;
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(wildcardType, "wildcardType");
        if (wildcardType.s() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<q10.c> it = new b20.g(c11, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            q10.c cVar2 = cVar;
            for (n20.c cVar3 : x.f()) {
                if (kotlin.jvm.internal.g0.g(cVar2.d(), cVar3)) {
                    break loop0;
                }
            }
        }
        return cVar;
    }

    public static final boolean b(@m80.k CallableMemberDescriptor memberDescriptor) {
        kotlin.jvm.internal.g0.p(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && kotlin.jvm.internal.g0.g(memberDescriptor.P(a20.e.H), Boolean.TRUE);
    }

    public static final boolean c(@m80.k z javaTypeEnhancementState) {
        kotlin.jvm.internal.g0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(x.e()) == ReportLevel.STRICT;
    }

    @m80.k
    public static final p10.p d(@m80.k o1 o1Var) {
        kotlin.jvm.internal.g0.p(o1Var, "<this>");
        p10.p g11 = v.g(o1Var);
        kotlin.jvm.internal.g0.o(g11, "toDescriptorVisibility(...)");
        return g11;
    }
}
