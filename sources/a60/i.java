package a60;

import java.net.Proxy;
import kotlin.jvm.internal.g0;
import okhttp3.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i f2020a = new i();

    @m80.k
    public final String a(@m80.k l request, @m80.k Proxy.Type proxyType) {
        g0.p(request, "request");
        g0.p(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m());
        sb2.append(' ');
        i iVar = f2020a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.q());
        } else {
            sb2.append(iVar.c(request.q()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final boolean b(l lVar, Proxy.Type type) {
        return !lVar.l() && type == Proxy.Type.HTTP;
    }

    @m80.k
    public final String c(@m80.k okhttp3.i url) {
        g0.p(url, "url");
        String x11 = url.x();
        String z11 = url.z();
        if (z11 == null) {
            return x11;
        }
        return x11 + s60.d.f88057a + z11;
    }
}
