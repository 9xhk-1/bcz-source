package t50;

import a00.a0;
import a00.h0;
import a00.i0;
import a00.r0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import okio.ByteString;
import u30.f0;
import u30.k0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f89578c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final d f89579d = new a().b();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Set<c> f89580a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final i60.c f89581b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<c> f89582a = new ArrayList();

        @m80.k
        public final a a(@m80.k String pattern, @m80.k String... pins) {
            g0.p(pattern, "pattern");
            g0.p(pins, "pins");
            for (String str : pins) {
                this.f89582a.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @m80.k
        public final d b() {
            return new d(r0.f6(this.f89582a), null, 2, 0 == true ? 1 : 0);
        }

        @m80.k
        public final List<c> c() {
            return this.f89582a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final String a(@m80.k Certificate certificate) {
            g0.p(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).base64();
        }

        @w00.o
        @m80.k
        public final ByteString b(@m80.k X509Certificate x509Certificate) {
            g0.p(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            g0.o(encoded, "publicKey.encoded");
            return ByteString.a.p(aVar, encoded, 0, 0, 3, null).sha1();
        }

        @w00.o
        @m80.k
        public final ByteString c(@m80.k X509Certificate x509Certificate) {
            g0.p(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            g0.o(encoded, "publicKey.encoded");
            return ByteString.a.p(aVar, encoded, 0, 0, 3, null).sha256();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f89583a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f89584b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final ByteString f89585c;

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
        
            if (u30.k0.J3(r5, "*", 1, false, 4, null) != (-1)) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@m80.k java.lang.String r12, @m80.k java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t50.d.c.<init>(java.lang.String, java.lang.String):void");
        }

        @m80.k
        public final ByteString a() {
            return this.f89585c;
        }

        @m80.k
        public final String b() {
            return this.f89584b;
        }

        @m80.k
        public final String c() {
            return this.f89583a;
        }

        public final boolean d(@m80.k X509Certificate certificate) {
            g0.p(certificate, "certificate");
            String str = this.f89584b;
            if (g0.g(str, "sha256")) {
                return g0.g(this.f89585c, d.f89578c.c(certificate));
            }
            if (g0.g(str, "sha1")) {
                return g0.g(this.f89585c, d.f89578c.b(certificate));
            }
            return false;
        }

        public final boolean e(@m80.k String hostname) {
            g0.p(hostname, "hostname");
            if (f0.J2(this.f89583a, "**.", false, 2, null)) {
                int length = this.f89583a.length() - 3;
                int length2 = hostname.length() - length;
                return f0.u2(hostname, hostname.length() - length, this.f89583a, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!f0.J2(this.f89583a, "*.", false, 2, null)) {
                return g0.g(hostname, this.f89583a);
            }
            int length3 = this.f89583a.length() - 1;
            return f0.u2(hostname, hostname.length() - length3, this.f89583a, 1, length3, false, 16, null) && k0.X3(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return g0.g(this.f89583a, cVar.f89583a) && g0.g(this.f89584b, cVar.f89584b) && g0.g(this.f89585c, cVar.f89585c);
        }

        public int hashCode() {
            return (((this.f89583a.hashCode() * 31) + this.f89584b.hashCode()) * 31) + this.f89585c.hashCode();
        }

        @m80.k
        public String toString() {
            return this.f89584b + '/' + this.f89585c.base64();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"})
    /* renamed from: t50.d$d, reason: collision with other inner class name */
    public static final class C1179d extends Lambda implements x00.a<List<? extends X509Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<Certificate> f89587b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f89588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1179d(List<? extends Certificate> list, String str) {
            super(0);
            this.f89587b = list;
            this.f89588c = str;
        }

        @Override // x00.a
        @m80.k
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> list;
            i60.c e11 = d.this.e();
            if (e11 == null || (list = e11.a(this.f89587b, this.f89588c)) == null) {
                list = this.f89587b;
            }
            List<Certificate> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            for (Certificate certificate : list2) {
                g0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public d(@m80.k Set<c> pins, @m80.l i60.c cVar) {
        g0.p(pins, "pins");
        this.f89580a = pins;
        this.f89581b = cVar;
    }

    @w00.o
    @m80.k
    public static final String g(@m80.k Certificate certificate) {
        return f89578c.a(certificate);
    }

    @w00.o
    @m80.k
    public static final ByteString h(@m80.k X509Certificate x509Certificate) {
        return f89578c.b(x509Certificate);
    }

    @w00.o
    @m80.k
    public static final ByteString i(@m80.k X509Certificate x509Certificate) {
        return f89578c.c(x509Certificate);
    }

    public final void a(@m80.k String hostname, @m80.k List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        g0.p(hostname, "hostname");
        g0.p(peerCertificates, "peerCertificates");
        c(hostname, new C1179d(peerCertificates, hostname));
    }

    @yz.n(message = "replaced with {@link #check(String, List)}.", replaceWith = @w0(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@m80.k String hostname, @m80.k Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        g0.p(hostname, "hostname");
        g0.p(peerCertificates, "peerCertificates");
        a(hostname, a0.dz(peerCertificates));
    }

    public final void c(@m80.k String hostname, @m80.k x00.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        g0.p(hostname, "hostname");
        g0.p(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> d11 = d(hostname);
        if (d11.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (c cVar : d11) {
                String b11 = cVar.b();
                if (g0.g(b11, "sha256")) {
                    if (byteString == null) {
                        byteString = f89578c.c(x509Certificate);
                    }
                    if (g0.g(cVar.a(), byteString)) {
                        return;
                    }
                } else {
                    if (!g0.g(b11, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    }
                    if (byteString2 == null) {
                        byteString2 = f89578c.b(x509Certificate);
                    }
                    if (g0.g(cVar.a(), byteString2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(f89578c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : d11) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    @m80.k
    public final List<c> d(@m80.k String hostname) {
        g0.p(hostname, "hostname");
        Set<c> set = this.f89580a;
        List<c> J = h0.J();
        for (Object obj : set) {
            if (((c) obj).e(hostname)) {
                if (J.isEmpty()) {
                    J = new ArrayList<>();
                }
                g0.n(J, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                x0.g(J).add(obj);
            }
        }
        return J;
    }

    @m80.l
    public final i60.c e() {
        return this.f89581b;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(dVar.f89580a, this.f89580a) && g0.g(dVar.f89581b, this.f89581b);
    }

    @m80.k
    public final Set<c> f() {
        return this.f89580a;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f89580a.hashCode()) * 41;
        i60.c cVar = this.f89581b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @m80.k
    public final d j(@m80.k i60.c certificateChainCleaner) {
        g0.p(certificateChainCleaner, "certificateChainCleaner");
        return g0.g(this.f89581b, certificateChainCleaner) ? this : new d(this.f89580a, certificateChainCleaner);
    }

    public /* synthetic */ d(Set set, i60.c cVar, int i11, v vVar) {
        this(set, (i11 & 2) != 0 ? null : cVar);
    }
}
