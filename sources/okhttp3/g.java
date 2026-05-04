package okhttp3;

import a00.h0;
import a00.i0;
import a00.r0;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.c0;
import yz.e0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f77273e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final TlsVersion f77274a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d f77275b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Certificate> f77276c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f77277d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: okhttp3.g$a$a, reason: collision with other inner class name */
        public static final class C0947a extends Lambda implements x00.a<List<? extends Certificate>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f77278a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0947a(List<? extends Certificate> list) {
                super(0);
                this.f77278a = list;
            }

            @Override // x00.a
            @m80.k
            public final List<? extends Certificate> invoke() {
                return this.f77278a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends Lambda implements x00.a<List<? extends Certificate>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f77279a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(List<? extends Certificate> list) {
                super(0);
                this.f77279a = list;
            }

            @Override // x00.a
            @m80.k
            public final List<? extends Certificate> invoke() {
                return this.f77279a;
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        @w00.j(name = "-deprecated_get")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @w0(expression = "sslSession.handshake()", imports = {}))
        @m80.k
        public final g a(@m80.k SSLSession sslSession) throws IOException {
            g0.p(sslSession, "sslSession");
            return b(sslSession);
        }

        @w00.j(name = ct.d.f46852f)
        @w00.o
        @m80.k
        public final g b(@m80.k SSLSession sSLSession) throws IOException {
            List<Certificate> J;
            g0.p(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (g0.g(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : g0.g(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            d b11 = d.f77182b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (g0.g("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion a11 = TlsVersion.Companion.a(protocol);
            try {
                J = d(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                J = h0.J();
            }
            return new g(a11, b11, d(sSLSession.getLocalCertificates()), new b(J));
        }

        @w00.o
        @m80.k
        public final g c(@m80.k TlsVersion tlsVersion, @m80.k d cipherSuite, @m80.k List<? extends Certificate> peerCertificates, @m80.k List<? extends Certificate> localCertificates) {
            g0.p(tlsVersion, "tlsVersion");
            g0.p(cipherSuite, "cipherSuite");
            g0.p(peerCertificates, "peerCertificates");
            g0.p(localCertificates, "localCertificates");
            return new g(tlsVersion, cipherSuite, u50.f.h0(localCertificates), new C0947a(u50.f.h0(peerCertificates)));
        }

        public final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? u50.f.C(Arrays.copyOf(certificateArr, certificateArr.length)) : h0.J();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<List<? extends Certificate>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<List<Certificate>> f77280a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f77280a = aVar;
        }

        @Override // x00.a
        @m80.k
        public final List<? extends Certificate> invoke() {
            try {
                return this.f77280a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return h0.J();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k TlsVersion tlsVersion, @m80.k d cipherSuite, @m80.k List<? extends Certificate> localCertificates, @m80.k x00.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        g0.p(tlsVersion, "tlsVersion");
        g0.p(cipherSuite, "cipherSuite");
        g0.p(localCertificates, "localCertificates");
        g0.p(peerCertificatesFn, "peerCertificatesFn");
        this.f77274a = tlsVersion;
        this.f77275b = cipherSuite;
        this.f77276c = localCertificates;
        this.f77277d = e0.c(new b(peerCertificatesFn));
    }

    @w00.j(name = ct.d.f46852f)
    @w00.o
    @m80.k
    public static final g h(@m80.k SSLSession sSLSession) throws IOException {
        return f77273e.b(sSLSession);
    }

    @w00.o
    @m80.k
    public static final g i(@m80.k TlsVersion tlsVersion, @m80.k d dVar, @m80.k List<? extends Certificate> list, @m80.k List<? extends Certificate> list2) {
        return f77273e.c(tlsVersion, dVar, list, list2);
    }

    @w00.j(name = "-deprecated_cipherSuite")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cipherSuite", imports = {}))
    @m80.k
    public final d a() {
        return this.f77275b;
    }

    @w00.j(name = "-deprecated_localCertificates")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "localCertificates", imports = {}))
    @m80.k
    public final List<Certificate> b() {
        return this.f77276c;
    }

    @m80.l
    @w00.j(name = "-deprecated_localPrincipal")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "localPrincipal", imports = {}))
    public final Principal c() {
        return l();
    }

    @w00.j(name = "-deprecated_peerCertificates")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "peerCertificates", imports = {}))
    @m80.k
    public final List<Certificate> d() {
        return m();
    }

    @m80.l
    @w00.j(name = "-deprecated_peerPrincipal")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "peerPrincipal", imports = {}))
    public final Principal e() {
        return n();
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f77274a == this.f77274a && g0.g(gVar.f77275b, this.f77275b) && g0.g(gVar.m(), m()) && g0.g(gVar.f77276c, this.f77276c);
    }

    @w00.j(name = "-deprecated_tlsVersion")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "tlsVersion", imports = {}))
    @m80.k
    public final TlsVersion f() {
        return this.f77274a;
    }

    @w00.j(name = "cipherSuite")
    @m80.k
    public final d g() {
        return this.f77275b;
    }

    public int hashCode() {
        return ((((((527 + this.f77274a.hashCode()) * 31) + this.f77275b.hashCode()) * 31) + m().hashCode()) * 31) + this.f77276c.hashCode();
    }

    public final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        g0.o(type, "type");
        return type;
    }

    @w00.j(name = "localCertificates")
    @m80.k
    public final List<Certificate> k() {
        return this.f77276c;
    }

    @m80.l
    @w00.j(name = "localPrincipal")
    public final Principal l() {
        Object L2 = r0.L2(this.f77276c);
        X509Certificate x509Certificate = L2 instanceof X509Certificate ? (X509Certificate) L2 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @w00.j(name = "peerCertificates")
    @m80.k
    public final List<Certificate> m() {
        return (List) this.f77277d.getValue();
    }

    @m80.l
    @w00.j(name = "peerPrincipal")
    public final Principal n() {
        Object L2 = r0.L2(m());
        X509Certificate x509Certificate = L2 instanceof X509Certificate ? (X509Certificate) L2 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @w00.j(name = "tlsVersion")
    @m80.k
    public final TlsVersion o() {
        return this.f77274a;
    }

    @m80.k
    public String toString() {
        List<Certificate> m11 = m();
        ArrayList arrayList = new ArrayList(i0.d0(m11, 10));
        Iterator<T> it = m11.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f77274a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f77275b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f77276c;
        ArrayList arrayList2 = new ArrayList(i0.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }
}
