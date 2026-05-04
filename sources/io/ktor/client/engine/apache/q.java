package io.ktor.client.engine.apache;

import cx.z;
import kotlin.jvm.internal.u0;
import org.apache.http.client.config.RequestConfig;
import rw.c1;
import rw.d1;
import rw.f1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApacheRequestProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApacheRequestProducer.kt\nio/ktor/client/engine/apache/ApacheRequestProducerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes8.dex */
public final class q {
    public static final RequestConfig.Builder b(RequestConfig.Builder builder, z zVar) {
        d1 d1Var = (d1) zVar.c(c1.f84603a);
        if (d1Var != null) {
            Long c11 = d1Var.c();
            if (c11 != null) {
                builder.setConnectTimeout(f1.l(c11.longValue()));
            }
            Long e11 = d1Var.e();
            if (e11 != null) {
                builder.setSocketTimeout(f1.l(e11.longValue()));
            }
        }
        return builder;
    }
}
