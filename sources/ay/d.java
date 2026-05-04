package ay;

import io.ktor.util.debug.plugins.PluginTraceElement;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    @l
    public static final Object c(@k final String str, @k final String str2, @k j00.c<? super g2> cVar) {
        Object c11 = cz.a.c(dz.b.f48247b, new x00.l() { // from class: ay.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = d.d(str, str2, (dz.b) obj);
                return d11;
            }
        }, cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }

    public static final g2 d(String str, String str2, dz.b trace) {
        g0.p(trace, "trace");
        trace.H().add(new PluginTraceElement(str, str2, PluginTraceElement.PluginEvent.FINISHED));
        return g2.f100423a;
    }

    @l
    public static final Object e(@k final String str, @k final String str2, @k j00.c<? super g2> cVar) {
        Object c11 = cz.a.c(dz.b.f48247b, new x00.l() { // from class: ay.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = d.f(str, str2, (dz.b) obj);
                return f11;
            }
        }, cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }

    public static final g2 f(String str, String str2, dz.b trace) {
        g0.p(trace, "trace");
        trace.H().add(new PluginTraceElement(str, str2, PluginTraceElement.PluginEvent.STARTED));
        return g2.f100423a;
    }
}
