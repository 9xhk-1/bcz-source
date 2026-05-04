package cx;

import ix.g1;
import ix.k;
import ix.q0;
import ix.y0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.b0
@u0({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/SSEClientResponseAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 implements i0 {
    @Override // cx.i0
    @m80.l
    public Object a(@m80.k z data, @m80.k g1 status, @m80.k q0 headers, @m80.k io.ktor.utils.io.g responseBody, @m80.k mx.v outgoingContent, @m80.k kotlin.coroutines.d callContext) {
        kotlin.jvm.internal.g0.p(data, "data");
        kotlin.jvm.internal.g0.p(status, "status");
        kotlin.jvm.internal.g0.p(headers, "headers");
        kotlin.jvm.internal.g0.p(responseBody, "responseBody");
        kotlin.jvm.internal.g0.p(outgoingContent, "outgoingContent");
        kotlin.jvm.internal.g0.p(callContext, "callContext");
        String str = headers.get(y0.f63006a.C());
        ix.k b11 = str != null ? ix.k.f62843f.b(str) : null;
        if (d0.j(data) && kotlin.jvm.internal.g0.g(status, g1.f62797c.C())) {
            if (kotlin.jvm.internal.g0.g(b11 != null ? b11.k() : null, k.h.f62902a.d())) {
                return new zw.q((zw.t) outgoingContent, responseBody, callContext);
            }
        }
        return null;
    }
}
