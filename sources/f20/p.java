package f20;

import a00.r0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {
    public static final boolean a(r rVar) {
        n20.c d11;
        b0 b0Var = (b0) r0.p5(rVar.g());
        x type = b0Var != null ? b0Var.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i m11 = jVar.m();
        return (m11 instanceof g) && (d11 = ((g) m11).d()) != null && g0.g(d11.b(), "java.lang.Object");
    }

    public static final boolean b(r rVar) {
        String b11 = rVar.getName().b();
        int hashCode = b11.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode == -1295482945) {
                if (b11.equals("equals")) {
                    return a(rVar);
                }
                return false;
            }
            if (hashCode != 147696667 || !b11.equals("hashCode")) {
                return false;
            }
        } else if (!b11.equals("toString")) {
            return false;
        }
        return rVar.g().isEmpty();
    }

    public static final boolean c(@m80.k q qVar) {
        g0.p(qVar, "<this>");
        return qVar.D().L() && (qVar instanceof r) && b((r) qVar);
    }
}
