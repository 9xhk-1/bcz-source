package d80;

import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f47481a;

    /* renamed from: b, reason: collision with root package name */
    public final X509Certificate[] f47482b;

    public a(String str, X509Certificate[] x509CertificateArr) {
        this.f47481a = (String) e80.a.j(str, "Private key type");
        this.f47482b = x509CertificateArr;
    }

    public X509Certificate[] a() {
        return this.f47482b;
    }

    public String b() {
        return this.f47481a;
    }

    public String toString() {
        return this.f47481a + ':' + Arrays.toString(this.f47482b);
    }
}
