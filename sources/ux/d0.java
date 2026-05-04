package ux;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public SecureRandom f92580b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public TrustManager f92581c;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public String f92583e;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<b> f92579a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public List<e> f92582d = a.f92549a.e();

    @m80.k
    public final c0 a() {
        SecureRandom secureRandom = this.f92580b;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        List<b> list = this.f92579a;
        TrustManager trustManager = this.f92581c;
        X509TrustManager x509TrustManager = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
        if (x509TrustManager == null) {
            x509TrustManager = e0.e();
        }
        return new c0(secureRandom, list, x509TrustManager, this.f92582d, this.f92583e);
    }

    @m80.k
    public final List<b> b() {
        return this.f92579a;
    }

    @m80.k
    public final List<e> c() {
        return this.f92582d;
    }

    @m80.l
    public final SecureRandom d() {
        return this.f92580b;
    }

    @m80.l
    public final String e() {
        return this.f92583e;
    }

    @m80.l
    public final TrustManager f() {
        return this.f92581c;
    }

    public final void g(@m80.k List<e> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f92582d = list;
    }

    public final void h(@m80.l SecureRandom secureRandom) {
        this.f92580b = secureRandom;
    }

    public final void i(@m80.l String str) {
        this.f92583e = str;
    }

    public final void j(@m80.l TrustManager trustManager) {
        if (trustManager == null || (trustManager instanceof X509TrustManager)) {
            this.f92581c = trustManager;
            return;
        }
        throw new IllegalStateException(("Failed to set [trustManager]: " + trustManager + ". Only [X509TrustManager] supported.").toString());
    }
}
