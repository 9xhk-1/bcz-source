package d20;

import a00.v1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import m80.k;
import m80.l;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeAttributes.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final a a(@k TypeUsage typeUsage, boolean z11, boolean z12, @l c1 c1Var) {
        g0.p(typeUsage, "<this>");
        return new a(typeUsage, null, z12, z11, c1Var != null ? v1.f(c1Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(TypeUsage typeUsage, boolean z11, boolean z12, c1 c1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            c1Var = null;
        }
        return a(typeUsage, z11, z12, c1Var);
    }
}
