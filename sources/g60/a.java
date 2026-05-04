package g60;

import a00.g0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes8.dex */
public final class a extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f53092a = new a();

    @Override // java.net.ProxySelector
    @k
    public List<Proxy> select(@l URI uri) {
        if (uri != null) {
            return g0.l(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@l URI uri, @l SocketAddress socketAddress, @l IOException iOException) {
    }
}
