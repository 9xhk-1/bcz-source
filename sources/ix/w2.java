package ix;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w2 {
    @m80.k
    public static final String a(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        String str = b(t2Var) + l2.n(t2Var);
        kotlin.jvm.internal.g0.o(str, "toString(...)");
        return str;
    }

    @m80.k
    public static final String b(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        l2.j(sb2, t2Var.s(), t2Var.o());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public static final String c(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t2Var.A().l());
        sb2.append("://");
        sb2.append(b(t2Var));
        if (t2Var.E() == 0 || t2Var.E() == t2Var.A().k()) {
            sb2.append(t2Var.u());
        } else {
            sb2.append(l2.m(t2Var));
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }
}
