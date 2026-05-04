package ux;

import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final SecureRandom f92566a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<b> f92567b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final X509TrustManager f92568c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<e> f92569d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f92570e;

    public c0(@m80.k SecureRandom random, @m80.k List<b> certificates, @m80.k X509TrustManager trustManager, @m80.k List<e> cipherSuites, @m80.l String str) {
        kotlin.jvm.internal.g0.p(random, "random");
        kotlin.jvm.internal.g0.p(certificates, "certificates");
        kotlin.jvm.internal.g0.p(trustManager, "trustManager");
        kotlin.jvm.internal.g0.p(cipherSuites, "cipherSuites");
        this.f92566a = random;
        this.f92567b = certificates;
        this.f92568c = trustManager;
        this.f92569d = cipherSuites;
        this.f92570e = str;
    }

    @m80.k
    public final List<b> a() {
        return this.f92567b;
    }

    @m80.k
    public final List<e> b() {
        return this.f92569d;
    }

    @m80.k
    public final SecureRandom c() {
        return this.f92566a;
    }

    @m80.l
    public final String d() {
        return this.f92570e;
    }

    @m80.k
    public final X509TrustManager e() {
        return this.f92568c;
    }
}
