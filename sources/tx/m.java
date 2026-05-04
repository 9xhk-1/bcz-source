package tx;

import tx.m;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface m<T extends m<? extends T, Options>, Options extends p0> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.k
        public static <T extends m<? extends T, Options>, Options extends p0> T a(@m80.k m<? extends T, Options> mVar, @m80.k x00.l<? super Options, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            p0 b11 = mVar.getOptions().b();
            kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type Options of io.ktor.network.sockets.Configurable");
            block.invoke(b11);
            mVar.a(b11);
            kotlin.jvm.internal.g0.n(mVar, "null cannot be cast to non-null type T of io.ktor.network.sockets.Configurable");
            return mVar;
        }
    }

    void a(@m80.k Options options);

    @m80.k
    T b(@m80.k x00.l<? super Options, g2> lVar);

    @m80.k
    Options getOptions();
}
