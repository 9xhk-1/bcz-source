package ty;

import ix.b2;
import ix.e2;
import ix.h2;
import ix.z1;
import jy.s;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l<b2, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f91235a = new a();

        public final void a(b2 b2Var) {
            g0.p(b2Var, "<this>");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(b2 b2Var) {
            a(b2Var);
            return g2.f100423a;
        }
    }

    @k
    public static final b2 a(@k b2.a aVar, @k zx.b call) {
        g0.p(aVar, "<this>");
        g0.p(call, "call");
        z1 f11 = s.f(call.f());
        b2 b2Var = new b2(null, null, 0, null, null, null, null, null, false, 511, null);
        h2 h2Var = h2.f62830c.b().get(f11.getScheme());
        if (h2Var == null) {
            h2Var = new h2(f11.getScheme(), 0);
        }
        b2Var.C(h2Var);
        b2Var.y(f11.A());
        b2Var.B(f11.C());
        e2.x(b2Var, py.e.w(call.f()));
        b2Var.k().j(call.f().m());
        return b2Var;
    }

    @k
    public static final String b(@k l<? super b2, g2> block) {
        g0.p(block, "block");
        b2 b2Var = new b2(null, null, 0, null, null, null, null, null, false, 511, null);
        block.invoke(b2Var);
        return b2Var.c();
    }

    @k
    public static final String c(@k zx.b bVar, @k l<? super b2, g2> block) {
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        b2 a11 = a(b2.f62712k, bVar);
        block.invoke(a11);
        return a11.c();
    }

    public static /* synthetic */ String d(zx.b bVar, l block, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            block = a.f91235a;
        }
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        b2 a11 = a(b2.f62712k, bVar);
        block.invoke(a11);
        return a11.c();
    }
}
