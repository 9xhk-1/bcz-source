package f60;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u50.c
@u0({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n37#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n43#1:75,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends i60.c {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f51113d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final X509TrustManager f51114b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final X509TrustManagerExtensions f51115c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.l
        @u50.c
        public final d a(@m80.k X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            g0.p(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a() {
        }
    }

    public d(@m80.k X509TrustManager trustManager, @m80.k X509TrustManagerExtensions x509TrustManagerExtensions) {
        g0.p(trustManager, "trustManager");
        g0.p(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f51114b = trustManager;
        this.f51115c = x509TrustManagerExtensions;
    }

    @Override // i60.c
    @u50.c
    @m80.k
    public List<Certificate> a(@m80.k List<? extends Certificate> chain, @m80.k String hostname) throws SSLPeerUnverifiedException {
        g0.p(chain, "chain");
        g0.p(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f51115c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            g0.o(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e11) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
            sSLPeerUnverifiedException.initCause(e11);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof d) && ((d) obj).f51114b == this.f51114b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f51114b);
    }
}
