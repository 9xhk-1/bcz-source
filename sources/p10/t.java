package p10;

import kotlin.jvm.internal.PropertyReference1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
/* loaded from: classes8.dex */
public final class t {
    @m80.l
    public static final b b(@m80.k a0 a0Var, @m80.k n20.b classId) {
        kotlin.jvm.internal.g0.p(a0Var, "<this>");
        kotlin.jvm.internal.g0.p(classId, "classId");
        d c11 = c(a0Var, classId);
        if (c11 instanceof b) {
            return (b) c11;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d A[RETURN] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p10.d c(@m80.k p10.a0 r8, @m80.k n20.b r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p10.t.c(p10.a0, n20.b):p10.d");
    }

    @m80.k
    public static final b d(@m80.k a0 a0Var, @m80.k n20.b classId, @m80.k f0 notFoundClasses) {
        kotlin.jvm.internal.g0.p(a0Var, "<this>");
        kotlin.jvm.internal.g0.p(classId, "classId");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        b b11 = b(a0Var, classId);
        return b11 != null ? b11 : notFoundClasses.d(classId, q30.k0.I3(q30.k0.N1(q30.x.t(classId, new PropertyReference1() { // from class: p10.t.a
            @Override // h10.p
            public Object get(Object obj) {
                return ((n20.b) obj).e();
            }

            @Override // kotlin.jvm.internal.CallableReference, h10.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.CallableReference
            public h10.h getOwner() {
                return kotlin.jvm.internal.o0.d(n20.b.class);
            }

            @Override // kotlin.jvm.internal.CallableReference
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }), s.f78608a)));
    }

    public static final int e(n20.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return 0;
    }

    @m80.l
    public static final b1 f(@m80.k a0 a0Var, @m80.k n20.b classId) {
        kotlin.jvm.internal.g0.p(a0Var, "<this>");
        kotlin.jvm.internal.g0.p(classId, "classId");
        d c11 = c(a0Var, classId);
        if (c11 instanceof b1) {
            return (b1) c11;
        }
        return null;
    }
}
