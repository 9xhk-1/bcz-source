package yw;

import ix.q0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends mw.a {
    public /* synthetic */ c(lw.c cVar, x00.a aVar, mw.a aVar2, q0 q0Var, int i11, v vVar) {
        this(cVar, (x00.a<? extends io.ktor.utils.io.g>) aVar, aVar2, (i11 & 8) != 0 ? aVar2.i().a() : q0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k lw.c client, @m80.k x00.a<? extends io.ktor.utils.io.g> block, @m80.k mw.a originCall, @m80.k q0 responseHeaders) {
        super(client);
        g0.p(client, "client");
        g0.p(block, "block");
        g0.p(originCall, "originCall");
        g0.p(responseHeaders, "responseHeaders");
        n(new e(this, originCall.h()));
        p(new g(this, block, originCall.i(), responseHeaders));
    }

    public /* synthetic */ c(lw.c cVar, io.ktor.utils.io.g gVar, mw.a aVar, q0 q0Var, int i11, v vVar) {
        this(cVar, gVar, aVar, (i11 & 8) != 0 ? aVar.i().a() : q0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@m80.k lw.c client, @m80.k final io.ktor.utils.io.g content, @m80.k mw.a originCall, @m80.k q0 responseHeaders) {
        this(client, (x00.a<? extends io.ktor.utils.io.g>) new x00.a() { // from class: yw.b
            @Override // x00.a
            public final Object invoke() {
                io.ktor.utils.io.g t11;
                t11 = c.t(io.ktor.utils.io.g.this);
                return t11;
            }
        }, originCall, responseHeaders);
        g0.p(client, "client");
        g0.p(content, "content");
        g0.p(originCall, "originCall");
        g0.p(responseHeaders, "responseHeaders");
    }

    public static final io.ktor.utils.io.g t(io.ktor.utils.io.g gVar) {
        return gVar;
    }
}
