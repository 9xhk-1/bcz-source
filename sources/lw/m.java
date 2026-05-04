package lw;

import a00.r0;
import io.ktor.utils.io.c0;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<k> f71642a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ow.l<?> f71643b;

    static {
        ow.l<?> a11;
        ServiceLoader load = ServiceLoader.load(k.class, k.class.getClassLoader());
        g0.o(load, "load(...)");
        List<k> a62 = r0.a6(load);
        f71642a = a62;
        k kVar = (k) r0.L2(a62);
        if (kVar == null || (a11 = kVar.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f71643b = a11;
    }

    @c0
    @m80.k
    public static final c b(@m80.k x00.l<? super j<?>, g2> block) {
        g0.p(block, "block");
        return p.d(f71643b, block);
    }

    public static /* synthetic */ c c(x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: lw.l
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 d11;
                    d11 = m.d((j) obj2);
                    return d11;
                }
            };
        }
        return b(lVar);
    }

    public static final g2 d(j jVar) {
        g0.p(jVar, "<this>");
        return g2.f100423a;
    }
}
