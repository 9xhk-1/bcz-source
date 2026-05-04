package vx;

import androidx.autofill.HintConstants;
import io.ktor.network.tls.certificates.KeyType;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import java.net.InetAddress;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public String f94343c;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public a f94350j;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public HashAlgorithm f94341a = HashAlgorithm.SHA1;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public SignatureAlgorithm f94342b = SignatureAlgorithm.RSA;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public X500Principal f94344d = m0.S();

    /* renamed from: e, reason: collision with root package name */
    public long f94345e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f94346f = 1024;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public KeyType f94347g = KeyType.Server;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public List<String> f94348h = a00.g0.l("localhost");

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public List<? extends InetAddress> f94349i = a00.g0.l(InetAddress.getByName("127.0.0.1"));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final X500Principal f94351a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final KeyPair f94352b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Certificate f94353c;

        public a(@m80.k X500Principal name, @m80.k KeyPair keyPair, @m80.k Certificate keyCertificate) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(keyPair, "keyPair");
            kotlin.jvm.internal.g0.p(keyCertificate, "keyCertificate");
            this.f94351a = name;
            this.f94352b = keyPair;
            this.f94353c = keyCertificate;
        }

        public static /* synthetic */ a e(a aVar, X500Principal x500Principal, KeyPair keyPair, Certificate certificate, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                x500Principal = aVar.f94351a;
            }
            if ((i11 & 2) != 0) {
                keyPair = aVar.f94352b;
            }
            if ((i11 & 4) != 0) {
                certificate = aVar.f94353c;
            }
            return aVar.d(x500Principal, keyPair, certificate);
        }

        @m80.k
        public final X500Principal a() {
            return this.f94351a;
        }

        @m80.k
        public final KeyPair b() {
            return this.f94352b;
        }

        @m80.k
        public final Certificate c() {
            return this.f94353c;
        }

        @m80.k
        public final a d(@m80.k X500Principal name, @m80.k KeyPair keyPair, @m80.k Certificate keyCertificate) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(keyPair, "keyPair");
            kotlin.jvm.internal.g0.p(keyCertificate, "keyCertificate");
            return new a(name, keyPair, keyCertificate);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f94351a, aVar.f94351a) && kotlin.jvm.internal.g0.g(this.f94352b, aVar.f94352b) && kotlin.jvm.internal.g0.g(this.f94353c, aVar.f94353c);
        }

        @m80.k
        public final Certificate f() {
            return this.f94353c;
        }

        @m80.k
        public final KeyPair g() {
            return this.f94352b;
        }

        @m80.k
        public final X500Principal h() {
            return this.f94351a;
        }

        public int hashCode() {
            return (((this.f94351a.hashCode() * 31) + this.f94352b.hashCode()) * 31) + this.f94353c.hashCode();
        }

        @m80.k
        public String toString() {
            return "CertificateIssuer(name=" + this.f94351a + ", keyPair=" + this.f94352b + ", keyCertificate=" + this.f94353c + ')';
        }
    }

    @m80.k
    public final c a() {
        X500Principal x500Principal;
        KeyPair g11;
        io.ktor.network.tls.extensions.a aVar = new io.ktor.network.tls.extensions.a(this.f94341a, this.f94342b, null, 4, null);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ux.n.a(aVar.g()));
        keyPairGenerator.initialize(this.f94346f);
        KeyPair genKeyPair = keyPairGenerator.genKeyPair();
        kotlin.jvm.internal.g0.m(genKeyPair);
        a aVar2 = this.f94350j;
        if (aVar2 == null || (x500Principal = aVar2.h()) == null) {
            x500Principal = this.f94344d;
        }
        X500Principal x500Principal2 = x500Principal;
        X500Principal x500Principal3 = this.f94344d;
        PublicKey publicKey = genKeyPair.getPublic();
        kotlin.jvm.internal.g0.o(publicKey, "getPublic(...)");
        a aVar3 = this.f94350j;
        KeyPair keyPair = (aVar3 == null || (g11 = aVar3.g()) == null) ? genKeyPair : g11;
        String g12 = aVar.g();
        e.a aVar4 = kotlin.time.e.f67757b;
        X509Certificate Q = m0.Q(x500Principal3, x500Principal2, publicKey, keyPair, g12, kotlin.time.f.x(this.f94345e, DurationUnit.DAYS), this.f94347g, this.f94348h, this.f94349i);
        String h11 = h();
        a aVar5 = this.f94350j;
        return new c(Q, genKeyPair, h11, aVar5 != null ? aVar5.f() : null);
    }

    public final long b() {
        return this.f94345e;
    }

    @m80.k
    public final List<String> c() {
        return this.f94348h;
    }

    @m80.k
    public final HashAlgorithm d() {
        return this.f94341a;
    }

    @m80.k
    public final List<InetAddress> e() {
        return this.f94349i;
    }

    public final int f() {
        return this.f94346f;
    }

    @m80.k
    public final KeyType g() {
        return this.f94347g;
    }

    @m80.k
    public final String h() {
        String str = this.f94343c;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.g0.S(HintConstants.AUTOFILL_HINT_PASSWORD);
        return null;
    }

    @m80.k
    public final SignatureAlgorithm i() {
        return this.f94342b;
    }

    @m80.k
    public final X500Principal j() {
        return this.f94344d;
    }

    public final void k(long j11) {
        this.f94345e = j11;
    }

    public final void l(@m80.k List<String> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f94348h = list;
    }

    public final void m(@m80.k HashAlgorithm hashAlgorithm) {
        kotlin.jvm.internal.g0.p(hashAlgorithm, "<set-?>");
        this.f94341a = hashAlgorithm;
    }

    public final void n(@m80.k List<? extends InetAddress> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f94349i = list;
    }

    public final void o(int i11) {
        this.f94346f = i11;
    }

    public final void p(@m80.k KeyType keyType) {
        kotlin.jvm.internal.g0.p(keyType, "<set-?>");
        this.f94347g = keyType;
    }

    public final void q(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f94343c = str;
    }

    public final void r(@m80.k SignatureAlgorithm signatureAlgorithm) {
        kotlin.jvm.internal.g0.p(signatureAlgorithm, "<set-?>");
        this.f94342b = signatureAlgorithm;
    }

    public final void s(@m80.k X500Principal x500Principal) {
        kotlin.jvm.internal.g0.p(x500Principal, "<set-?>");
        this.f94344d = x500Principal;
    }

    public final void t(@m80.k KeyPair issuerKeyPair, @m80.k Certificate issuerKeyCertificate, @m80.k X500Principal issuerName) {
        kotlin.jvm.internal.g0.p(issuerKeyPair, "issuerKeyPair");
        kotlin.jvm.internal.g0.p(issuerKeyCertificate, "issuerKeyCertificate");
        kotlin.jvm.internal.g0.p(issuerName, "issuerName");
        this.f94350j = new a(issuerName, issuerKeyPair, issuerKeyCertificate);
    }

    public final void u(@m80.k KeyPair issuerKeyPair, @m80.k X509Certificate issuerKeyCertificate) {
        kotlin.jvm.internal.g0.p(issuerKeyPair, "issuerKeyPair");
        kotlin.jvm.internal.g0.p(issuerKeyCertificate, "issuerKeyCertificate");
        X500Principal subjectX500Principal = issuerKeyCertificate.getSubjectX500Principal();
        kotlin.jvm.internal.g0.o(subjectX500Principal, "getSubjectX500Principal(...)");
        this.f94350j = new a(subjectX500Principal, issuerKeyPair, issuerKeyCertificate);
    }
}
