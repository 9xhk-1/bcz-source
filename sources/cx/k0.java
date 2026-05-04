package cx;

import a00.l1;
import io.ktor.http.CookieEncoding;
import ix.b1;
import ix.r0;
import ix.y0;
import java.util.Map;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nio/ktor/client/request/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 {
    public static final void a(@m80.k b1 b1Var, @m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        b1Var.a().k(y0.f63006a.d(), contentType.toString());
    }

    public static final void b(@m80.k b1 b1Var, @m80.k String username, @m80.k String password) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(username, "username");
        kotlin.jvm.internal.g0.p(password, "password");
        String t11 = y0.f63006a.t();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(xy.f.e(username + ':' + password));
        h(b1Var, t11, sb2.toString());
    }

    public static final void c(@m80.k b1 b1Var, @m80.k String token) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(token, "token");
        h(b1Var, y0.f63006a.t(), "Bearer " + token);
    }

    public static final void d(@m80.k b1 b1Var, @m80.k String name, @m80.k String value, int i11, @m80.l bz.b bVar, @m80.l String str, @m80.l String str2, boolean z11, boolean z12, @m80.k Map<String, String> extensions) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        String q11 = ix.c0.q(new ix.n(name, value, (CookieEncoding) null, Integer.valueOf(i11), bVar, str, str2, z11, z12, extensions, 4, (kotlin.jvm.internal.v) null));
        r0 a11 = b1Var.a();
        y0 y0Var = y0.f63006a;
        if (!a11.contains(y0Var.D())) {
            b1Var.a().k(y0Var.D(), q11);
            return;
        }
        b1Var.a().d(y0Var.D(), b1Var.a().get(y0Var.D()) + "; " + q11);
    }

    public static /* synthetic */ void e(b1 b1Var, String str, String str2, int i11, bz.b bVar, String str3, String str4, boolean z11, boolean z12, Map map, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            bVar = null;
        }
        if ((i12 & 16) != 0) {
            str3 = null;
        }
        if ((i12 & 32) != 0) {
            str4 = null;
        }
        if ((i12 & 64) != 0) {
            z11 = false;
        }
        if ((i12 & 128) != 0) {
            z12 = false;
        }
        if ((i12 & 256) != 0) {
            map = l1.z();
        }
        d(b1Var, str, str2, i11, bVar, str3, str4, z11, z12, map);
    }

    @m80.k
    public static final String f(@m80.k y yVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        return yVar.j().j();
    }

    public static final int g(@m80.k y yVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        return yVar.j().n();
    }

    public static final void h(@m80.k b1 b1Var, @m80.k String key, @m80.l Object obj) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        if (obj != null) {
            b1Var.a().k(key, obj.toString());
        }
    }

    public static final void i(@m80.k y yVar, @m80.k String key, @m80.l Object obj) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        if (obj != null) {
            yVar.j().k().k(key, obj.toString());
        }
    }

    public static final void j(@m80.k y yVar, @m80.k String value) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        yVar.j().y(value);
    }

    public static final void k(@m80.k y yVar, int i11) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        yVar.j().B(i11);
    }
}
