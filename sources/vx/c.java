package vx;

import java.security.KeyPair;
import java.security.cert.Certificate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Certificate f94354a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final KeyPair f94355b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f94356c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Certificate f94357d;

    public c(@m80.k Certificate certificate, @m80.k KeyPair keys, @m80.k String password, @m80.l Certificate certificate2) {
        kotlin.jvm.internal.g0.p(certificate, "certificate");
        kotlin.jvm.internal.g0.p(keys, "keys");
        kotlin.jvm.internal.g0.p(password, "password");
        this.f94354a = certificate;
        this.f94355b = keys;
        this.f94356c = password;
        this.f94357d = certificate2;
    }

    public static /* synthetic */ c f(c cVar, Certificate certificate, KeyPair keyPair, String str, Certificate certificate2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            certificate = cVar.f94354a;
        }
        if ((i11 & 2) != 0) {
            keyPair = cVar.f94355b;
        }
        if ((i11 & 4) != 0) {
            str = cVar.f94356c;
        }
        if ((i11 & 8) != 0) {
            certificate2 = cVar.f94357d;
        }
        return cVar.e(certificate, keyPair, str, certificate2);
    }

    @m80.k
    public final Certificate a() {
        return this.f94354a;
    }

    @m80.k
    public final KeyPair b() {
        return this.f94355b;
    }

    @m80.k
    public final String c() {
        return this.f94356c;
    }

    @m80.l
    public final Certificate d() {
        return this.f94357d;
    }

    @m80.k
    public final c e(@m80.k Certificate certificate, @m80.k KeyPair keys, @m80.k String password, @m80.l Certificate certificate2) {
        kotlin.jvm.internal.g0.p(certificate, "certificate");
        kotlin.jvm.internal.g0.p(keys, "keys");
        kotlin.jvm.internal.g0.p(password, "password");
        return new c(certificate, keys, password, certificate2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.g0.g(this.f94354a, cVar.f94354a) && kotlin.jvm.internal.g0.g(this.f94355b, cVar.f94355b) && kotlin.jvm.internal.g0.g(this.f94356c, cVar.f94356c) && kotlin.jvm.internal.g0.g(this.f94357d, cVar.f94357d);
    }

    @m80.k
    public final Certificate g() {
        return this.f94354a;
    }

    @m80.l
    public final Certificate h() {
        return this.f94357d;
    }

    public int hashCode() {
        int hashCode = ((((this.f94354a.hashCode() * 31) + this.f94355b.hashCode()) * 31) + this.f94356c.hashCode()) * 31;
        Certificate certificate = this.f94357d;
        return hashCode + (certificate == null ? 0 : certificate.hashCode());
    }

    @m80.k
    public final KeyPair i() {
        return this.f94355b;
    }

    @m80.k
    public final String j() {
        return this.f94356c;
    }

    @m80.k
    public String toString() {
        return "CertificateInfo(certificate=" + this.f94354a + ", keys=" + this.f94355b + ", password=" + this.f94356c + ", issuerCertificate=" + this.f94357d + ')';
    }
}
