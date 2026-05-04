package yw;

import ix.q0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    @m80.k
    public static final mw.a a(@m80.k mw.a aVar, @m80.k io.ktor.utils.io.g content, @m80.k q0 headers) {
        g0.p(aVar, "<this>");
        g0.p(content, "content");
        g0.p(headers, "headers");
        return new c(aVar.e(), content, aVar, headers);
    }

    @m80.k
    public static final mw.a b(@m80.k mw.a aVar, @m80.k io.ktor.utils.io.g content) {
        g0.p(aVar, "<this>");
        g0.p(content, "content");
        return new c(aVar.e(), content, aVar, (q0) null, 8, (v) null);
    }

    @m80.k
    public static final mw.a c(@m80.k mw.a aVar, @m80.k x00.a<? extends io.ktor.utils.io.g> block) {
        g0.p(aVar, "<this>");
        g0.p(block, "block");
        return new c(aVar.e(), block, aVar, (q0) null, 8, (v) null);
    }
}
