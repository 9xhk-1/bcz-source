package sw;

import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    @m80.k
    public static final <PluginConfigT> b<PluginConfigT> b(@m80.k String name, @m80.k x00.a<? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super d<PluginConfigT>, g2> body) {
        g0.p(name, "name");
        g0.p(createConfiguration, "createConfiguration");
        g0.p(body, "body");
        return new e(name, createConfiguration, body);
    }

    @m80.k
    public static final b<g2> c(@m80.k String name, @m80.k x00.l<? super d<g2>, g2> body) {
        g0.p(name, "name");
        g0.p(body, "body");
        return b(name, new x00.a() { // from class: sw.h
            @Override // x00.a
            public final Object invoke() {
                g2 d11;
                d11 = i.d();
                return d11;
            }
        }, body);
    }

    public static final g2 d() {
        return g2.f100423a;
    }
}
