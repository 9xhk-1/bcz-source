package p10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l0 {
    public static final void a(@m80.k h0 h0Var, @m80.k n20.c fqName, @m80.k Collection<g0> packageFragments) {
        kotlin.jvm.internal.g0.p(h0Var, "<this>");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(packageFragments, "packageFragments");
        if (h0Var instanceof m0) {
            ((m0) h0Var).c(fqName, packageFragments);
        } else {
            packageFragments.addAll(h0Var.b(fqName));
        }
    }

    public static final boolean b(@m80.k h0 h0Var, @m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(h0Var, "<this>");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return h0Var instanceof m0 ? ((m0) h0Var).a(fqName) : c(h0Var, fqName).isEmpty();
    }

    @m80.k
    public static final List<g0> c(@m80.k h0 h0Var, @m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(h0Var, "<this>");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(h0Var, fqName, arrayList);
        return arrayList;
    }
}
