package k40;

import c40.y1;
import kotlin.DeprecationLevel;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface d<R> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@m80.k d<? super R> dVar, @m80.k j<? super P, ? extends Q> jVar, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar) {
            dVar.c(jVar, null, pVar);
        }

        @o00.i
        @y1
        @yz.n(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @w0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        public static <R> void b(@m80.k d<? super R> dVar, long j11, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar) {
            c.a(dVar, j11, lVar);
        }
    }

    <P, Q> void c(@m80.k j<? super P, ? extends Q> jVar, P p11, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar);

    <P, Q> void d(@m80.k j<? super P, ? extends Q> jVar, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar);

    <Q> void f(@m80.k h<? extends Q> hVar, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar);

    @o00.i
    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @w0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    void i(long j11, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar);

    void j(@m80.k f fVar, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar);
}
