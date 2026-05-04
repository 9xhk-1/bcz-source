package ux;

import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final byte[] f92563a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final io.ktor.network.tls.extensions.a[] f92564b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<X500Principal> f92565c;

    public c(@m80.k byte[] types, @m80.k io.ktor.network.tls.extensions.a[] hashAndSign, @m80.k Set<X500Principal> authorities) {
        kotlin.jvm.internal.g0.p(types, "types");
        kotlin.jvm.internal.g0.p(hashAndSign, "hashAndSign");
        kotlin.jvm.internal.g0.p(authorities, "authorities");
        this.f92563a = types;
        this.f92564b = hashAndSign;
        this.f92565c = authorities;
    }

    @m80.k
    public final Set<X500Principal> a() {
        return this.f92565c;
    }

    @m80.k
    public final io.ktor.network.tls.extensions.a[] b() {
        return this.f92564b;
    }

    @m80.k
    public final byte[] c() {
        return this.f92563a;
    }
}
