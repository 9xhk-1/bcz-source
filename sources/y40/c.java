package y40;

import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    @v0
    public static final /* synthetic */ <T> T a(b bVar, long j11, x00.p<? super t, ? super Long, ? extends T> lambda) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(lambda, "lambda");
        if (bVar.k() == null) {
            return lambda.invoke(null, -1L);
        }
        if (bVar.r() - j11 < j11) {
            t E = bVar.E();
            long r11 = bVar.r();
            while (E != null && r11 > j11) {
                r11 -= E.d() - E.h();
                if (r11 <= j11) {
                    break;
                }
                E = E.j();
            }
            return lambda.invoke(E, Long.valueOf(r11));
        }
        t k11 = bVar.k();
        long j12 = 0;
        while (k11 != null) {
            long d11 = (k11.d() - k11.h()) + j12;
            if (d11 > j11) {
                break;
            }
            k11 = k11.f();
            j12 = d11;
        }
        return lambda.invoke(k11, Long.valueOf(j12));
    }
}
