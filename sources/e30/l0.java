package e30;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n295#2:175\n1734#2,3:176\n296#2:179\n1557#2:180\n1628#2,3:181\n1557#2:184\n1628#2,3:185\n*S KotlinDebug\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n*L\n50#1:175\n51#1:176,3\n50#1:179\n62#1:180\n62#1:181,3\n65#1:184\n65#1:185,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 {
    @m80.k
    public static final i0 a(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        k2 L0 = r0Var.L0();
        kotlin.jvm.internal.g0.n(L0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (i0) L0;
    }

    public static final boolean b(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        return r0Var.L0() instanceof i0;
    }

    @m80.k
    public static final c1 c(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        k2 L0 = r0Var.L0();
        if (L0 instanceof i0) {
            return ((i0) L0).Q0();
        }
        if (L0 instanceof c1) {
            return (c1) L0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public static final c1 d(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        k2 L0 = r0Var.L0();
        if (L0 instanceof i0) {
            return ((i0) L0).R0();
        }
        if (L0 instanceof c1) {
            return (c1) L0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
