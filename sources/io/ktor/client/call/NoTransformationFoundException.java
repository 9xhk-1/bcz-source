package io.ktor.client.call;

import ex.c;
import ex.e;
import h10.d;
import ix.q0;
import ix.y0;
import kotlin.jvm.internal.g0;
import m80.k;
import u30.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {

    @k
    private final String message;

    public NoTransformationFoundException(@k c response, @k d<?> from, @k d<?> to2) {
        g0.p(response, "response");
        g0.p(from, "from");
        g0.p(to2, "to");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        Expected response body of the type '");
        sb2.append(to2);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(e.h(response).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(response.i());
        sb2.append("`\n        Response header `ContentType: ");
        q0 a11 = response.a();
        y0 y0Var = y0.f63006a;
        sb2.append(a11.get(y0Var.C()));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(e.h(response).a().get(y0Var.d()));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = y.v(sb2.toString());
    }

    @Override // java.lang.Throwable
    @k
    public String getMessage() {
        return this.message;
    }
}
