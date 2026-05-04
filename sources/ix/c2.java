package ix;

import ix.b2;
import ix.t2;
import java.net.URI;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c2 {
    @m80.k
    public static final String a(@m80.k b2.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return "http://localhost";
    }

    @m80.k
    public static final t2 b(@m80.k t2.a aVar, @m80.k String fullUrl) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(fullUrl, "fullUrl");
        b2 b2Var = new b2(null, null, 0, null, null, null, null, null, false, 511, null);
        j2.b(b2Var, new URI(fullUrl));
        return b2Var.b();
    }
}
