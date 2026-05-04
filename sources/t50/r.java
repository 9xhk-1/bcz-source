package t50;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final okhttp3.a f89704a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Proxy f89705b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final InetSocketAddress f89706c;

    public r(@m80.k okhttp3.a address, @m80.k Proxy proxy, @m80.k InetSocketAddress socketAddress) {
        g0.p(address, "address");
        g0.p(proxy, "proxy");
        g0.p(socketAddress, "socketAddress");
        this.f89704a = address;
        this.f89705b = proxy;
        this.f89706c = socketAddress;
    }

    @w00.j(name = "-deprecated_address")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "address", imports = {}))
    @m80.k
    public final okhttp3.a a() {
        return this.f89704a;
    }

    @w00.j(name = "-deprecated_proxy")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "proxy", imports = {}))
    @m80.k
    public final Proxy b() {
        return this.f89705b;
    }

    @w00.j(name = "-deprecated_socketAddress")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "socketAddress", imports = {}))
    @m80.k
    public final InetSocketAddress c() {
        return this.f89706c;
    }

    @w00.j(name = "address")
    @m80.k
    public final okhttp3.a d() {
        return this.f89704a;
    }

    @w00.j(name = "proxy")
    @m80.k
    public final Proxy e() {
        return this.f89705b;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return g0.g(rVar.f89704a, this.f89704a) && g0.g(rVar.f89705b, this.f89705b) && g0.g(rVar.f89706c, this.f89706c);
    }

    public final boolean f() {
        return this.f89704a.v() != null && this.f89705b.type() == Proxy.Type.HTTP;
    }

    @w00.j(name = "socketAddress")
    @m80.k
    public final InetSocketAddress g() {
        return this.f89706c;
    }

    public int hashCode() {
        return ((((527 + this.f89704a.hashCode()) * 31) + this.f89705b.hashCode()) * 31) + this.f89706c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Route{" + this.f89706c + l50.b.f69928j;
    }
}
