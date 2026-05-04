package e30;

import e30.q1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: classes8.dex */
public final class s1 {
    @m80.k
    public static final r1 a(@m80.k r1 r1Var, @m80.k q10.g newAnnotations) {
        r1 m11;
        kotlin.jvm.internal.g0.p(r1Var, "<this>");
        kotlin.jvm.internal.g0.p(newAnnotations, "newAnnotations");
        if (s.a(r1Var) == newAnnotations) {
            return r1Var;
        }
        r b11 = s.b(r1Var);
        if (b11 != null && (m11 = r1Var.m(b11)) != null) {
            r1Var = m11;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? r1Var.l(new r(newAnnotations)) : r1Var;
    }

    @m80.k
    public static final r1 b(@m80.k q10.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return q1.a.a(w.f48677a, gVar, null, null, 6, null);
    }
}
