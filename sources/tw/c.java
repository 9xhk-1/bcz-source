package tw;

import ix.q0;
import ix.r0;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpCacheEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntry\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,142:1\n23#2:143\n*S KotlinDebug\n*F\n+ 1 HttpCacheEntry.kt\nio/ktor/client/plugins/cache/HttpCacheEntry\n*L\n31#1:143\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final bz.b f91037a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, String> f91038b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ex.c f91039c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final byte[] f91040d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final q0 f91041e;

    public c(@k bz.b expires, @k Map<String, String> varyKeys, @k ex.c response, @k byte[] body) {
        g0.p(expires, "expires");
        g0.p(varyKeys, "varyKeys");
        g0.p(response, "response");
        g0.p(body, "body");
        this.f91037a = expires;
        this.f91038b = varyKeys;
        this.f91039c = response;
        this.f91040d = body;
        q0.a aVar = q0.f62976a;
        r0 r0Var = new r0(0, 1, null);
        r0Var.j(response.a());
        this.f91041e = r0Var.build();
    }

    @k
    public final byte[] a() {
        return this.f91040d;
    }

    @k
    public final bz.b b() {
        return this.f91037a;
    }

    @k
    public final ex.c c() {
        return this.f91039c;
    }

    @k
    public final q0 d() {
        return this.f91041e;
    }

    @k
    public final Map<String, String> e() {
        return this.f91038b;
    }

    public boolean equals(@l Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return g0.g(this.f91038b, ((c) obj).f91038b);
    }

    @k
    public final ex.c f() {
        return new mw.d(this.f91039c.c().e(), this.f91039c.c().h(), this.f91039c, this.f91040d).i();
    }

    public int hashCode() {
        return this.f91038b.hashCode();
    }
}
