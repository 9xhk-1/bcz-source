package ow;

import ix.t2;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p f78461a = new p();

    @m80.k
    public final Proxy a(@m80.k t2 url) {
        g0.p(url, "url");
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(url.u(), url.z()));
    }

    @m80.k
    public final Proxy b(@m80.k String host, int i11) {
        g0.p(host, "host");
        return new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(host, i11));
    }
}
