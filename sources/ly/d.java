package ly;

import ix.m0;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import org.slf4j.Logger;
import x00.l;
import yz.g2;
import zx.b0;
import zx.r0;
import zx.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Logger f71682a = ez.a.a("io.ktor.server.plugins.contentnegotiation.ContentNegotiation");

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final r0<ly.a> f71683b = b0.o("ContentNegotiation", a.f71684a, new l() { // from class: ly.c
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 b11;
            b11 = d.b((s0) obj);
            return b11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<ly.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f71684a = new a();

        public a() {
            super(0, ly.a.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ly.a invoke() {
            return new ly.a();
        }
    }

    public static final g2 b(s0 createRouteScopedPlugin) {
        g0.p(createRouteScopedPlugin, "$this$createRouteScopedPlugin");
        i.c(createRouteScopedPlugin);
        j.c(createRouteScopedPlugin);
        return g2.f100423a;
    }

    @k
    public static final r0<ly.a> c() {
        return f71683b;
    }

    @k
    public static final Logger d() {
        return f71682a;
    }

    @k
    public static final Charset e(@k zx.b bVar, @k Charset defaultCharset) {
        g0.p(bVar, "<this>");
        g0.p(defaultCharset, "defaultCharset");
        Iterator<m0> it = py.e.c(bVar.f()).iterator();
        while (it.hasNext()) {
            String a11 = it.next().a();
            if (g0.g(a11, "*")) {
                break;
            }
            u30.d dVar = u30.d.f91598a;
            if (iz.a.m(dVar, a11)) {
                return iz.a.i(dVar, a11);
            }
        }
        return defaultCharset;
    }

    public static /* synthetic */ Charset f(zx.b bVar, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return e(bVar, charset);
    }
}
