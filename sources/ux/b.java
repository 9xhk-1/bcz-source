package ux;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final X509Certificate[] f92558a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final PrivateKey f92559b;

    public b(@m80.k X509Certificate[] certificateChain, @m80.k PrivateKey key) {
        kotlin.jvm.internal.g0.p(certificateChain, "certificateChain");
        kotlin.jvm.internal.g0.p(key, "key");
        this.f92558a = certificateChain;
        this.f92559b = key;
    }

    @m80.k
    public final X509Certificate[] a() {
        return this.f92558a;
    }

    @m80.k
    public final PrivateKey b() {
        return this.f92559b;
    }
}
