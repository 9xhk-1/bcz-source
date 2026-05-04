package tw;

import a00.h0;
import a00.r0;
import ix.h2;
import ix.y0;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import mx.v;
import org.slf4j.Logger;
import ow.u;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Logger f91049a = ez.a.a("io.ktor.client.plugins.HttpCache");

    public static final boolean c(h2 h2Var) {
        return g0.g(h2Var.l(), "http") || g0.g(h2Var.l(), "https");
    }

    @k
    public static final Logger d() {
        return f91049a;
    }

    @k
    public static final l<String, String> e(@k final v content, @k final l<? super String, String> headerExtractor, @k final l<? super String, ? extends List<String>> allHeadersExtractor) {
        g0.p(content, "content");
        g0.p(headerExtractor, "headerExtractor");
        g0.p(allHeadersExtractor, "allHeadersExtractor");
        return new l() { // from class: tw.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                String f11;
                f11 = g.f(v.this, headerExtractor, allHeadersExtractor, (String) obj);
                return f11;
            }
        };
    }

    public static final String f(v vVar, l lVar, l lVar2, String header) {
        String o0Var;
        String l11;
        g0.p(header, "header");
        y0 y0Var = y0.f63006a;
        if (g0.g(header, y0Var.z())) {
            Long a11 = vVar.a();
            return (a11 == null || (l11 = a11.toString()) == null) ? "" : l11;
        }
        if (g0.g(header, y0Var.C())) {
            ix.k b11 = vVar.b();
            return (b11 == null || (o0Var = b11.toString()) == null) ? "" : o0Var;
        }
        if (g0.g(header, y0Var.L0())) {
            String str = vVar.d().get(y0Var.L0());
            if (str != null) {
                return str;
            }
            String str2 = (String) lVar.invoke(y0Var.L0());
            return str2 == null ? u.f() : str2;
        }
        List<String> a12 = vVar.d().a(header);
        if (a12 == null && (a12 = (List) lVar2.invoke(header)) == null) {
            a12 = h0.J();
        }
        return r0.r3(a12, com.alipay.sdk.m.u.i.f11097b, null, null, 0, null, null, 62, null);
    }
}
