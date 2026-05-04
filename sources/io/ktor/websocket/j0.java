package io.ktor.websocket;

import c40.r0;
import java.util.List;
import kotlin.DeprecationLevel;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface j0 extends r0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.l
        public static Object a(@m80.k j0 j0Var, @m80.k d dVar, @m80.k j00.c<? super g2> cVar) {
            Object b11 = j0Var.q().b(dVar, cVar);
            return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
        }
    }

    @m80.k
    List<z<?>> A0();

    void E0(long j11);

    boolean Q0();

    @m80.l
    Object U(@m80.k d dVar, @m80.k j00.c<? super g2> cVar);

    long d0();

    @m80.l
    Object g(@m80.k j00.c<? super g2> cVar);

    void i0(boolean z11);

    @m80.k
    e40.k0<d> j();

    @m80.k
    e40.l0<d> q();

    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    void s0();
}
