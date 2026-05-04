package c40;

import c40.z0;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
/* loaded from: classes8.dex */
public interface b1 extends z0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.l
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object a(@m80.k b1 b1Var, long j11, @m80.k j00.c<? super yz.g2> cVar) {
            Object a11 = z0.a.a(b1Var, j11, cVar);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : yz.g2.f100423a;
        }

        @m80.k
        public static k1 b(@m80.k b1 b1Var, long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
            return z0.a.b(b1Var, j11, runnable, dVar);
        }
    }

    @m80.k
    String c(long j11);
}
