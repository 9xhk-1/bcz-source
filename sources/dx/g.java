package dx;

import kotlin.jvm.internal.g0;
import kotlin.random.Random;
import u30.r0;
import y40.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final byte[] f48215a = jz.s.m("\r\n", null, 1, null);

    public static final Object d(c0 c0Var, io.ktor.utils.io.m mVar, j00.c<? super g2> cVar) {
        Object w11 = io.ktor.utils.io.q.w(mVar, c0Var, cVar);
        return w11 == kotlin.coroutines.intrinsics.b.l() ? w11 : g2.f100423a;
    }

    public static final String e() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 32; i11++) {
            String num = Integer.toString(Random.Default.nextInt(), kotlin.text.a.a(16));
            g0.o(num, "toString(...)");
            sb2.append(num);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return r0.A9(sb3, 70);
    }
}
