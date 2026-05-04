package uw;

import ix.f1;
import ix.g1;
import ix.q0;
import ix.t2;
import java.util.Map;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t2 f92429a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g1 f92430b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final bz.b f92431c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final bz.b f92432d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final f1 f92433e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final bz.b f92434f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final q0 f92435g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f92436h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final byte[] f92437i;

    public c(@m80.k t2 url, @m80.k g1 statusCode, @m80.k bz.b requestTime, @m80.k bz.b responseTime, @m80.k f1 version, @m80.k bz.b expires, @m80.k q0 headers, @m80.k Map<String, String> varyKeys, @m80.k byte[] body) {
        g0.p(url, "url");
        g0.p(statusCode, "statusCode");
        g0.p(requestTime, "requestTime");
        g0.p(responseTime, "responseTime");
        g0.p(version, "version");
        g0.p(expires, "expires");
        g0.p(headers, "headers");
        g0.p(varyKeys, "varyKeys");
        g0.p(body, "body");
        this.f92429a = url;
        this.f92430b = statusCode;
        this.f92431c = requestTime;
        this.f92432d = responseTime;
        this.f92433e = version;
        this.f92434f = expires;
        this.f92435g = headers;
        this.f92436h = varyKeys;
        this.f92437i = body;
    }

    @m80.k
    public final c a(@m80.k Map<String, String> varyKeys, @m80.k bz.b expires) {
        g0.p(varyKeys, "varyKeys");
        g0.p(expires, "expires");
        return new c(this.f92429a, this.f92430b, this.f92431c, this.f92432d, this.f92433e, expires, this.f92435g, varyKeys, this.f92437i);
    }

    @m80.k
    public final byte[] b() {
        return this.f92437i;
    }

    @m80.k
    public final bz.b c() {
        return this.f92434f;
    }

    @m80.k
    public final q0 d() {
        return this.f92435g;
    }

    @m80.k
    public final bz.b e() {
        return this.f92431c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f92429a, cVar.f92429a) && g0.g(this.f92436h, cVar.f92436h);
    }

    @m80.k
    public final bz.b f() {
        return this.f92432d;
    }

    @m80.k
    public final g1 g() {
        return this.f92430b;
    }

    @m80.k
    public final t2 h() {
        return this.f92429a;
    }

    public int hashCode() {
        return (this.f92429a.hashCode() * 31) + this.f92436h.hashCode();
    }

    @m80.k
    public final Map<String, String> i() {
        return this.f92436h;
    }

    @m80.k
    public final f1 j() {
        return this.f92433e;
    }
}
