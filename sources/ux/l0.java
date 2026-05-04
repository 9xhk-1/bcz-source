package ux;

import io.ktor.network.tls.TLSHandshakeType;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nio/ktor/network/tls/UtilsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,59:1\n15#2,3:60\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nio/ktor/network/tls/UtilsKt\n*L\n53#1:60,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 {
    @m80.k
    public static final y40.x a() {
        return h.f(jz.h.a());
    }

    public static final void b(@m80.k y40.x plusAssign, @m80.k f0 record) {
        kotlin.jvm.internal.g0.p(plusAssign, "$this$plusAssign");
        kotlin.jvm.internal.g0.p(record, "record");
        if (record.b() == TLSHandshakeType.HelloRequest) {
            throw new IllegalStateException("Check failed.");
        }
        y40.b bVar = new y40.b();
        o.s(bVar, record.b(), (int) jz.j.j(record.a()));
        if (jz.j.j(record.a()) > 0) {
            jz.h.j(bVar, jz.j.f(record.a()));
        }
        h.H(plusAssign, bVar);
    }
}
