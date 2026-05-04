package io.ktor.utils.io;

import c40.l2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {
    public static final void b(@m80.k final b bVar, @m80.k l2 job) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(job, "job");
        job.z0(new x00.l() { // from class: io.ktor.utils.io.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = f.d(b.this, (Throwable) obj);
                return d11;
            }
        });
    }

    public static final void c(@m80.k b bVar, @m80.k s job) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(job, "job");
        b(bVar, job.a());
    }

    public static final g2 d(b bVar, Throwable th2) {
        if (th2 != null) {
            bVar.a(th2);
        }
        return g2.f100423a;
    }
}
