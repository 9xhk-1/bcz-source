package g7;

import k3.x0;
import k3.y1;
import kotlin.jvm.internal.g0;
import z8.j0;
import z8.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {
    @m80.k
    public static final k3.b a(@m80.k y0 y0Var) {
        g0.p(y0Var, "<this>");
        return new k3.b(y0Var.f102282b, y0Var.f102281a);
    }

    @m80.k
    public static final x0 b(@m80.k j0 j0Var) {
        g0.p(j0Var, "<this>");
        Integer num = j0Var.f101650f;
        if (num != null && num.intValue() == 1) {
            int i11 = j0Var.f101645a;
            String str = j0Var.f101647c;
            y1 c11 = c(j0Var.f101648d);
            String str2 = j0Var.f101649e;
            g0.m(str2);
            return new x0.a(i11, str, c11, str2);
        }
        int i12 = j0Var.f101645a;
        String str3 = j0Var.f101647c;
        String str4 = j0Var.f101646b;
        y1 c12 = c(j0Var.f101648d);
        String str5 = j0Var.f101649e;
        g0.m(str5);
        return new x0.b(i12, str3, str4, c12, str5);
    }

    @m80.k
    public static final y1 c(int i11) {
        return i11 != 1 ? i11 != 2 ? new y1.b(0, 1, null) : new y1.c(0, 1, null) : new y1.a(0, 1, null);
    }
}
