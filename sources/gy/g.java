package gy;

import ix.e2;
import ix.p1;
import ix.v1;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import qy.n;
import qy.s;
import qy.u;
import u30.k0;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Push.kt\nio/ktor/server/http/PushKt\n+ 2 Text.kt\nio/ktor/util/TextKt\n*L\n1#1,48:1\n37#2,3:49\n*S KotlinDebug\n*F\n+ 1 Push.kt\nio/ktor/server/http/PushKt\n*L\n20#1:49,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g {
    @u
    public static final void b(@k zx.b bVar, @k String pathAndQuery) {
        Pair a11;
        g0.p(bVar, "<this>");
        g0.p(pathAndQuery, "pathAndQuery");
        int J3 = k0.J3(pathAndQuery, "?", 0, false, 6, null);
        if (J3 == -1) {
            a11 = h1.a(pathAndQuery, "");
        } else {
            String substring = pathAndQuery.substring(0, J3);
            g0.o(substring, "substring(...)");
            String substring2 = pathAndQuery.substring(J3 + 1);
            g0.o(substring2, "substring(...)");
            a11 = h1.a(substring, substring2);
        }
        c(bVar, (String) a11.component1(), v1.d((String) a11.component2(), 0, 0, false, 6, null));
    }

    @u
    public static final void c(@k zx.b bVar, @k final String encodedPath, @k final p1 encodedParameters) {
        g0.p(bVar, "<this>");
        g0.p(encodedPath, "encodedPath");
        g0.p(encodedParameters, "encodedParameters");
        d(bVar, new l() { // from class: gy.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = g.e(encodedPath, encodedParameters, (s) obj);
                return e11;
            }
        });
    }

    @u
    public static final void d(@k zx.b bVar, @k l<? super s, g2> block) {
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        qy.a k11 = bVar.k();
        n nVar = new n(bVar);
        block.invoke(nVar);
        k11.i(nVar);
    }

    public static final g2 e(String str, p1 p1Var, s push) {
        g0.p(push, "$this$push");
        e2.x(push.getUrl(), str);
        push.getUrl().e().clear();
        push.getUrl().e().j(p1Var);
        return g2.f100423a;
    }
}
