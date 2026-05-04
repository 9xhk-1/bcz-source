package e30;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeWithEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1557#2:170\n1628#2,3:171\n1734#2,3:174\n*S KotlinDebug\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n*L\n97#1:170\n97#1:171,3\n112#1:174,3\n*E\n"})
/* loaded from: classes8.dex */
public final class j2 {
    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public static final r0 a(@m80.k r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        if (r0Var instanceof i2) {
            return ((i2) r0Var).p0();
        }
        return null;
    }

    @m80.k
    public static final k2 b(@m80.k k2 k2Var, @m80.k r0 origin) {
        kotlin.jvm.internal.g0.p(k2Var, "<this>");
        kotlin.jvm.internal.g0.p(origin, "origin");
        return d(k2Var, a(origin));
    }

    @m80.k
    public static final k2 c(@m80.k k2 k2Var, @m80.k r0 origin, @m80.k x00.l<? super r0, ? extends r0> transform) {
        kotlin.jvm.internal.g0.p(k2Var, "<this>");
        kotlin.jvm.internal.g0.p(origin, "origin");
        kotlin.jvm.internal.g0.p(transform, "transform");
        r0 a11 = a(origin);
        return d(k2Var, a11 != null ? transform.invoke(a11) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final k2 d(@m80.k k2 k2Var, @m80.l r0 r0Var) {
        kotlin.jvm.internal.g0.p(k2Var, "<this>");
        if (k2Var instanceof i2) {
            return d(((i2) k2Var).V(), r0Var);
        }
        if (r0Var == null || kotlin.jvm.internal.g0.g(r0Var, k2Var)) {
            return k2Var;
        }
        if (k2Var instanceof c1) {
            return new f1((c1) k2Var, r0Var);
        }
        if (k2Var instanceof i0) {
            return new k0((i0) k2Var, r0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
