package jy;

import ix.e1;
import ix.y0;
import ix.z1;
import kotlin.jvm.internal.g0;
import u30.e0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements z1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z1 f64748a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f64749b;

    public q(@m80.k z1 local, @m80.l String str) {
        g0.p(local, "local");
        this.f64748a = local;
        this.f64749b = str;
    }

    @Override // ix.z1
    @m80.k
    public String A() {
        return this.f64748a.A();
    }

    @Override // ix.z1
    @m80.k
    public String B() {
        return this.f64748a.B();
    }

    @Override // ix.z1
    public int C() {
        return this.f64748a.C();
    }

    @Override // ix.z1
    public int a() {
        String K5;
        Integer p12;
        String str = this.f64749b;
        return (str == null || (K5 = k0.K5(str, ":", "80")) == null || (p12 = e0.p1(K5)) == null) ? this.f64748a.a() : p12.intValue();
    }

    @Override // ix.z1
    @m80.k
    public String b() {
        String U5;
        String str = this.f64749b;
        return (str == null || (U5 = k0.U5(str, ":", null, 2, null)) == null) ? this.f64748a.b() : U5;
    }

    @Override // ix.z1
    @m80.k
    public String getLocalAddress() {
        return this.f64748a.getLocalAddress();
    }

    @Override // ix.z1
    public int getLocalPort() {
        return this.f64748a.getLocalPort();
    }

    @Override // ix.z1
    @m80.k
    public e1 getMethod() {
        return this.f64748a.getMethod();
    }

    @Override // ix.z1
    @m80.k
    public String getScheme() {
        return this.f64748a.getScheme();
    }

    @Override // ix.z1
    @m80.k
    public String getUri() {
        return this.f64748a.getUri();
    }

    @Override // ix.z1
    @m80.k
    public String getVersion() {
        return this.f64748a.getVersion();
    }

    @Override // ix.z1
    @m80.k
    public String l() {
        return this.f64748a.l();
    }

    @m80.k
    public String toString() {
        return "OriginConnectionPoint(uri=" + getUri() + ", method=" + getMethod() + ", version=" + getVersion() + ", localAddress=" + getLocalAddress() + ", localPort=" + getLocalPort() + ", remoteAddress=" + l() + ", remotePort=" + y() + ')';
    }

    @Override // ix.z1
    public int y() {
        return this.f64748a.y();
    }

    @Override // ix.z1
    @m80.k
    public String z() {
        return this.f64748a.z();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@m80.k zx.b call) {
        this(call.f().h(), py.e.r(call.f(), y0.f63006a.P()));
        g0.p(call, "call");
    }

    @yz.n(message = "Use localHost or serverHost instead")
    public static /* synthetic */ void c() {
    }

    @yz.n(message = "Use localHost or serverHost instead")
    public static /* synthetic */ void d() {
    }
}
