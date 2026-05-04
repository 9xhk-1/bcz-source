package vx;

import io.ktor.network.tls.certificates.KeyType;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.security.auth.x500.X500Principal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import yz.g2;
import yz.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCertificates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Certificates.kt\nio/ktor/network/tls/certificates/CertificatesKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,571:1\n15#2,3:572\n15#2,3:592\n15#2,3:595\n15#2,3:598\n15#2,3:601\n15#2,3:604\n15#2,3:607\n15#2,3:610\n15#2,3:613\n15#2,3:616\n1863#3,2:575\n12#4,14:577\n1#5:591\n*S KotlinDebug\n*F\n+ 1 Certificates.kt\nio/ktor/network/tls/certificates/CertificatesKt\n*L\n97#1:572,3\n321#1:592,3\n344#1:595,3\n366#1:598,3\n374#1:601,3\n405#1:604,3\n419#1:607,3\n435#1:610,3\n459#1:613,3\n229#1:616,3\n185#1:575,2\n190#1:577,14\n*E\n"})
/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final X500Principal f94384a = new X500Principal("CN=localhost, OU=Kotlin, O=JetBrains, C=RU");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final X500Principal f94385b = new X500Principal("CN=localhostCA, OU=Kotlin, O=JetBrains, C=RU");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94386a;

        static {
            int[] iArr = new int[KeyType.values().length];
            try {
                iArr[KeyType.CA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyType.Server.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyType.Client.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94386a = iArr;
        }
    }

    public static final g2 A(y40.x writeDerOctetString) {
        kotlin.jvm.internal.g0.p(writeDerOctetString, "$this$writeDerOctetString");
        x0(writeDerOctetString, new x00.l() { // from class: vx.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B;
                B = m0.B((y40.x) obj);
                return B;
            }
        });
        return g2.f100423a;
    }

    public static final void A0(y40.x xVar, String str, int i11) {
        y40.b bVar = new y40.b();
        jz.s.p(bVar, str, 0, 0, null, 14, null);
        y0(xVar, 0, i11, true);
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final g2 B(y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        p0(writeDerSequence, true);
        return g2.f100423a;
    }

    public static /* synthetic */ void B0(y40.x xVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 12;
        }
        A0(xVar, str, i11);
    }

    public static final void C(y40.x xVar) {
        x0(xVar, new x00.l() { // from class: vx.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 D;
                D = m0.D((y40.x) obj);
                return D;
            }
        });
    }

    public static final void C0(y40.x xVar, int i11) {
        y0(xVar, 2, 0, false);
        y40.b bVar = new y40.b();
        h0(bVar, i11);
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final g2 D(y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.c());
        return g2.f100423a;
    }

    public static /* synthetic */ void D0(y40.x xVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 2;
        }
        C0(xVar, i11);
    }

    public static final int E(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = 1;
        int i13 = 127;
        while ((i11 & i13) != i11) {
            i13 |= i13 << 7;
            i12++;
        }
        return i12;
    }

    public static final void E0(y40.x xVar, X500Principal x500Principal) {
        byte[] encoded = x500Principal.getEncoded();
        kotlin.jvm.internal.g0.o(encoded, "getEncoded(...)");
        jz.h.i(xVar, encoded, 0, 0, 6, null);
    }

    public static final void F(y40.x xVar, final x00.l<? super y40.x, g2> lVar) {
        x0(xVar, new x00.l() { // from class: vx.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 G;
                G = m0.G(x00.l.this, (y40.x) obj);
                return G;
            }
        });
    }

    public static final void F0(y40.x xVar, int i11, x00.l<? super y40.x, g2> lVar) {
        xVar.u((byte) (i11 | 128));
        y40.b bVar = new y40.b();
        lVar.invoke(bVar);
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final g2 G(final x00.l lVar, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.i());
        w0(writeDerSequence, new x00.l() { // from class: vx.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = m0.H(x00.l.this, (y40.x) obj);
                return H;
            }
        });
        return g2.f100423a;
    }

    public static final void G0(y40.x xVar, final String str, final X500Principal x500Principal, final X500Principal x500Principal2, final PublicKey publicKey, final Instant instant, final Instant instant2, final List<String> list, final List<? extends InetAddress> list2, final KeyType keyType) {
        final BigInteger bigInteger = new BigInteger(64, new SecureRandom());
        x0(xVar, new x00.l() { // from class: vx.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 I0;
                I0 = m0.I0(bigInteger, str, x500Principal, x500Principal2, publicKey, instant, instant2, keyType, list, list2, (y40.x) obj);
                return I0;
            }
        });
    }

    public static final g2 H(x00.l lVar, y40.x writeDerOctetString) {
        kotlin.jvm.internal.g0.p(writeDerOctetString, "$this$writeDerOctetString");
        lVar.invoke(writeDerOctetString);
        return g2.f100423a;
    }

    @m80.k
    public static final KeyStore I(@m80.l File file, @m80.k final String algorithm, @m80.k final String keyAlias, @m80.k final String keyPassword, @m80.k String jksPassword, final int i11, @m80.k final KeyType keyType) {
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        kotlin.jvm.internal.g0.p(keyAlias, "keyAlias");
        kotlin.jvm.internal.g0.p(keyPassword, "keyPassword");
        kotlin.jvm.internal.g0.p(jksPassword, "jksPassword");
        kotlin.jvm.internal.g0.p(keyType, "keyType");
        KeyStore a11 = vx.a.a(new x00.l() { // from class: vx.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 M;
                M = m0.M(keyAlias, algorithm, keyPassword, i11, keyType, (n0) obj);
                return M;
            }
        });
        a11.setCertificateEntry(keyAlias + "Cert", a11.getCertificate(keyAlias));
        if (file != null) {
            vx.a.b(a11, file, jksPassword);
        }
        return a11;
    }

    public static final g2 I0(BigInteger bigInteger, String str, X500Principal x500Principal, X500Principal x500Principal2, PublicKey publicKey, final Instant instant, final Instant instant2, final KeyType keyType, final List list, final List list2, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        C0(writeDerSequence, 2);
        i0(writeDerSequence, bigInteger);
        f0(writeDerSequence, str);
        E0(writeDerSequence, x500Principal);
        x0(writeDerSequence, new x00.l() { // from class: vx.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J0;
                J0 = m0.J0(instant, instant2, (y40.x) obj);
                return J0;
            }
        });
        E0(writeDerSequence, x500Principal2);
        byte[] encoded = publicKey.getEncoded();
        kotlin.jvm.internal.g0.o(encoded, "getEncoded(...)");
        jz.h.i(writeDerSequence, encoded, 0, 0, 6, null);
        writeDerSequence.u((byte) -93);
        y40.b bVar = new y40.b();
        x0(bVar, new x00.l() { // from class: vx.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K0;
                K0 = m0.K0(KeyType.this, list, list2, (y40.x) obj);
                return K0;
            }
        });
        s0(writeDerSequence, (int) jz.j.j(bVar));
        jz.h.j(writeDerSequence, bVar);
        return g2.f100423a;
    }

    @m80.k
    public static final KeyStore J(@m80.k KeyStore keyStore, @m80.l File file, @m80.k final String algorithm, @m80.k final String keyAlias, @m80.k final String keyPassword, @m80.k String jksPassword, final int i11, @m80.k String caKeyAlias, @m80.k String caPassword, @m80.k final KeyType keyType) {
        kotlin.jvm.internal.g0.p(keyStore, "<this>");
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        kotlin.jvm.internal.g0.p(keyAlias, "keyAlias");
        kotlin.jvm.internal.g0.p(keyPassword, "keyPassword");
        kotlin.jvm.internal.g0.p(jksPassword, "jksPassword");
        kotlin.jvm.internal.g0.p(caKeyAlias, "caKeyAlias");
        kotlin.jvm.internal.g0.p(caPassword, "caPassword");
        kotlin.jvm.internal.g0.p(keyType, "keyType");
        final Certificate certificate = keyStore.getCertificate(caKeyAlias);
        PublicKey publicKey = certificate.getPublicKey();
        char[] charArray = caPassword.toCharArray();
        kotlin.jvm.internal.g0.o(charArray, "toCharArray(...)");
        Key key = keyStore.getKey(caKeyAlias, charArray);
        kotlin.jvm.internal.g0.n(key, "null cannot be cast to non-null type java.security.PrivateKey");
        final KeyPair keyPair = new KeyPair(publicKey, (PrivateKey) key);
        KeyStore a11 = vx.a.a(new x00.l() { // from class: vx.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O;
                O = m0.O(keyAlias, algorithm, keyPassword, i11, keyType, keyPair, certificate, (n0) obj);
                return O;
            }
        });
        if (file != null) {
            vx.a.b(a11, file, jksPassword);
        }
        return a11;
    }

    public static final g2 J0(Instant instant, Instant instant2, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        z0(writeDerSequence, instant);
        q0(writeDerSequence, instant2);
        return g2.f100423a;
    }

    public static /* synthetic */ KeyStore K(File file, String str, String str2, String str3, String str4, int i11, KeyType keyType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            file = null;
        }
        if ((i12 & 2) != 0) {
            str = "SHA1withRSA";
        }
        if ((i12 & 4) != 0) {
            str2 = "mykey";
        }
        if ((i12 & 8) != 0) {
            str3 = "changeit";
        }
        if ((i12 & 16) != 0) {
            str4 = str3;
        }
        if ((i12 & 32) != 0) {
            i11 = 1024;
        }
        if ((i12 & 64) != 0) {
            keyType = KeyType.Server;
        }
        KeyType keyType2 = keyType;
        int i13 = i11;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        return I(file, str, str7, str6, str5, i13, keyType2);
    }

    public static final g2 K0(KeyType keyType, List list, List list2, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        int i11 = a.f94386a[keyType.ordinal()];
        if (i11 == 1) {
            y(writeDerSequence);
        } else if (i11 == 2) {
            F(writeDerSequence, new x00.l() { // from class: vx.k0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 L0;
                    L0 = m0.L0((y40.x) obj);
                    return L0;
                }
            });
            W(writeDerSequence, list, list2);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            F(writeDerSequence, new x00.l() { // from class: vx.l0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 M0;
                    M0 = m0.M0((y40.x) obj);
                    return M0;
                }
            });
        }
        return g2.f100423a;
    }

    public static /* synthetic */ KeyStore L(KeyStore keyStore, File file, String str, String str2, String str3, String str4, int i11, String str5, String str6, KeyType keyType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            file = null;
        }
        if ((i12 & 2) != 0) {
            str = "SHA1withRSA";
        }
        if ((i12 & 4) != 0) {
            str2 = "mykey";
        }
        if ((i12 & 8) != 0) {
            str3 = "changeit";
        }
        if ((i12 & 16) != 0) {
            str4 = str3;
        }
        if ((i12 & 32) != 0) {
            i11 = 1024;
        }
        if ((i12 & 64) != 0) {
            str5 = "mykey";
        }
        if ((i12 & 128) != 0) {
            str6 = "changeit";
        }
        if ((i12 & 256) != 0) {
            keyType = KeyType.Server;
        }
        String str7 = str6;
        KeyType keyType2 = keyType;
        int i13 = i11;
        String str8 = str5;
        String str9 = str4;
        String str10 = str2;
        return J(keyStore, file, str, str10, str3, str9, i13, str8, str7, keyType2);
    }

    public static final g2 L0(y40.x extKeyUsage) {
        kotlin.jvm.internal.g0.p(extKeyUsage, "$this$extKeyUsage");
        U(extKeyUsage);
        return g2.f100423a;
    }

    public static final g2 M(String str, final String str2, final String str3, final int i11, final KeyType keyType, n0 buildKeyStore) {
        kotlin.jvm.internal.g0.p(buildKeyStore, "$this$buildKeyStore");
        buildKeyStore.b(str, new x00.l() { // from class: vx.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 N;
                N = m0.N(str2, str3, i11, keyType, (b) obj);
                return N;
            }
        });
        return g2.f100423a;
    }

    public static final g2 M0(y40.x extKeyUsage) {
        kotlin.jvm.internal.g0.p(extKeyUsage, "$this$extKeyUsage");
        C(extKeyUsage);
        return g2.f100423a;
    }

    public static final g2 N(String str, String str2, int i11, KeyType keyType, b certificate) {
        kotlin.jvm.internal.g0.p(certificate, "$this$certificate");
        List o52 = u30.k0.o5(str, new String[]{"with"}, false, 0, 6, null);
        String str3 = (String) o52.get(0);
        String str4 = (String) o52.get(1);
        certificate.m(HashAlgorithm.valueOf(str3));
        certificate.r(SignatureAlgorithm.valueOf(str4));
        certificate.q(str2);
        certificate.o(i11);
        certificate.p(keyType);
        certificate.s(keyType == KeyType.CA ? f94385b : f94384a);
        certificate.l(a00.h0.Q("127.0.0.1", "localhost"));
        return g2.f100423a;
    }

    public static final g2 O(String str, final String str2, final String str3, final int i11, final KeyType keyType, final KeyPair keyPair, final Certificate certificate, n0 buildKeyStore) {
        kotlin.jvm.internal.g0.p(buildKeyStore, "$this$buildKeyStore");
        buildKeyStore.b(str, new x00.l() { // from class: vx.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = m0.P(str2, str3, i11, keyType, keyPair, certificate, (b) obj);
                return P;
            }
        });
        return g2.f100423a;
    }

    public static final g2 P(String str, String str2, int i11, KeyType keyType, KeyPair keyPair, Certificate certificate, b certificate2) {
        kotlin.jvm.internal.g0.p(certificate2, "$this$certificate");
        List o52 = u30.k0.o5(str, new String[]{"with"}, false, 0, 6, null);
        String str3 = (String) o52.get(0);
        String str4 = (String) o52.get(1);
        certificate2.m(HashAlgorithm.valueOf(str3));
        certificate2.r(SignatureAlgorithm.valueOf(str4));
        certificate2.q(str2);
        certificate2.o(i11);
        certificate2.p(keyType);
        certificate2.s(f94384a);
        certificate2.l(a00.h0.Q("127.0.0.1", "localhost"));
        kotlin.jvm.internal.g0.m(certificate);
        certificate2.t(keyPair, certificate, f94385b);
        return g2.f100423a;
    }

    @m80.k
    public static final X509Certificate Q(@m80.k X500Principal subject, @m80.k X500Principal issuer, @m80.k PublicKey publicKey, @m80.k KeyPair signerKeyPair, @m80.k String algorithm, long j11, @m80.k KeyType keyType, @m80.k List<String> domains, @m80.k List<? extends InetAddress> ipAddresses) {
        Instant now;
        Duration ofSeconds;
        Instant plus;
        kotlin.jvm.internal.g0.p(subject, "subject");
        kotlin.jvm.internal.g0.p(issuer, "issuer");
        kotlin.jvm.internal.g0.p(publicKey, "publicKey");
        kotlin.jvm.internal.g0.p(signerKeyPair, "signerKeyPair");
        kotlin.jvm.internal.g0.p(algorithm, "algorithm");
        kotlin.jvm.internal.g0.p(keyType, "keyType");
        kotlin.jvm.internal.g0.p(domains, "domains");
        kotlin.jvm.internal.g0.p(ipAddresses, "ipAddresses");
        now = Instant.now();
        y40.b bVar = new y40.b();
        kotlin.jvm.internal.g0.m(now);
        ofSeconds = Duration.ofSeconds(kotlin.time.e.A(j11), kotlin.time.e.E(j11));
        kotlin.jvm.internal.g0.o(ofSeconds, "toComponents-impl(...)");
        plus = now.plus(m.a(ofSeconds));
        kotlin.jvm.internal.g0.o(plus, "plus(...)");
        j0(bVar, issuer, subject, publicKey, algorithm, now, plus, domains, ipAddresses, signerKeyPair, keyType);
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(y40.g0.c(bVar)));
        generateCertificate.verify(signerKeyPair.getPublic());
        kotlin.jvm.internal.g0.n(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return (X509Certificate) generateCertificate;
    }

    public static /* synthetic */ X509Certificate R(X500Principal x500Principal, X500Principal x500Principal2, PublicKey publicKey, KeyPair keyPair, String str, long j11, KeyType keyType, List list, List list2, int i11, Object obj) {
        long j12;
        if ((i11 & 32) != 0) {
            e.a aVar = kotlin.time.e.f67757b;
            j12 = kotlin.time.f.w(3, DurationUnit.DAYS);
        } else {
            j12 = j11;
        }
        return Q(x500Principal, x500Principal2, publicKey, keyPair, str, j12, (i11 & 64) != 0 ? KeyType.Server : keyType, (i11 & 128) != 0 ? a00.h0.Q("127.0.0.1", "localhost") : list, (i11 & 256) != 0 ? a00.g0.l(InetAddress.getByName("127.0.0.1")) : list2);
    }

    @m80.k
    public static final X500Principal S() {
        return f94384a;
    }

    @m80.k
    public static final List<TrustManager> T(@m80.k KeyStore keyStore) {
        kotlin.jvm.internal.g0.p(keyStore, "<this>");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.g0.o(trustManagers, "getTrustManagers(...)");
        return a00.a0.dz(trustManagers);
    }

    public static final void U(y40.x xVar) {
        x0(xVar, new x00.l() { // from class: vx.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 V;
                V = m0.V((y40.x) obj);
                return V;
            }
        });
    }

    public static final g2 V(y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.s());
        return g2.f100423a;
    }

    public static final void W(y40.x xVar, final List<String> list, final List<? extends InetAddress> list2) {
        x0(xVar, new x00.l() { // from class: vx.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 X;
                X = m0.X(list, list2, (y40.x) obj);
                return X;
            }
        });
    }

    public static final g2 X(final List list, final List list2, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.t());
        w0(writeDerSequence, new x00.l() { // from class: vx.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Y;
                Y = m0.Y(list, list2, (y40.x) obj);
                return Y;
            }
        });
        return g2.f100423a;
    }

    public static final g2 Y(final List list, final List list2, y40.x writeDerOctetString) {
        kotlin.jvm.internal.g0.p(writeDerOctetString, "$this$writeDerOctetString");
        x0(writeDerOctetString, new x00.l() { // from class: vx.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Z;
                Z = m0.Z(list, list2, (y40.x) obj);
                return Z;
            }
        });
        return g2.f100423a;
    }

    public static final g2 Z(List list, List list2, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            F0(writeDerSequence, 2, new x00.l() { // from class: vx.t
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 a02;
                    a02 = m0.a0(str, (y40.x) obj);
                    return a02;
                }
            });
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            final InetAddress inetAddress = (InetAddress) it2.next();
            F0(writeDerSequence, 7, new x00.l() { // from class: vx.u
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b02;
                    b02 = m0.b0(inetAddress, (y40.x) obj);
                    return b02;
                }
            });
        }
        return g2.f100423a;
    }

    public static final g2 a0(String str, y40.x writeX509Extension) {
        kotlin.jvm.internal.g0.p(writeX509Extension, "$this$writeX509Extension");
        jz.h.i(writeX509Extension, jz.s.m(str, null, 1, null), 0, 0, 6, null);
        return g2.f100423a;
    }

    public static final g2 b0(InetAddress inetAddress, y40.x writeX509Extension) {
        kotlin.jvm.internal.g0.p(writeX509Extension, "$this$writeX509Extension");
        byte[] address = inetAddress.getAddress();
        kotlin.jvm.internal.g0.o(address, "getAddress(...)");
        jz.h.i(writeX509Extension, address, 0, 0, 6, null);
        return g2.f100423a;
    }

    public static final byte c0(boolean z11) {
        return z11 ? o1.i((byte) 255) : o1.i((byte) 0);
    }

    @m80.k
    public static final KeyStore d0(@m80.k KeyStore keyStore, @m80.l File file, @m80.k char[] password, @m80.k String keyStoreType) {
        File parentFile;
        kotlin.jvm.internal.g0.p(keyStore, "<this>");
        kotlin.jvm.internal.g0.p(password, "password");
        kotlin.jvm.internal.g0.p(keyStoreType, "keyStoreType");
        KeyStore keyStore2 = KeyStore.getInstance(keyStoreType);
        kotlin.jvm.internal.g0.m(keyStore2);
        keyStore2.load(null, null);
        Enumeration<String> aliases = keyStore.aliases();
        kotlin.jvm.internal.g0.o(aliases, "aliases(...)");
        ArrayList<String> list = Collections.list(aliases);
        kotlin.jvm.internal.g0.o(list, "list(...)");
        for (String str : list) {
            Certificate certificate = keyStore.getCertificate(str);
            kotlin.jvm.internal.g0.o(certificate, "getCertificate(...)");
            keyStore2.setCertificateEntry(str, certificate);
        }
        if (file != null && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (file == null) {
            return keyStore2;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            keyStore2.store(fileOutputStream, password);
            g2 g2Var = g2.f100423a;
            fileOutputStream.close();
            return keyStore2;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                yz.r.a(th2, th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ KeyStore e0(KeyStore keyStore, File file, char[] cArr, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = null;
        }
        if ((i11 & 2) != 0) {
            cArr = "changeit".toCharArray();
            kotlin.jvm.internal.g0.o(cArr, "toCharArray(...)");
        }
        if ((i11 & 4) != 0) {
            str = "JKS";
        }
        return d0(keyStore, file, cArr, str);
    }

    public static final void f0(y40.x xVar, final String str) {
        x0(xVar, new x00.l() { // from class: vx.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g02;
                g02 = m0.g0(str, (y40.x) obj);
                return g02;
            }
        });
    }

    public static final g2 g0(String str, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.a(str));
        t0(writeDerSequence);
        return g2.f100423a;
    }

    public static final void h0(y40.x xVar, int i11) {
        boolean z11 = true;
        y0(xVar, 0, 2, true);
        y40.b bVar = new y40.b();
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = (i11 >>> ((3 - i12) * 8)) & 255;
            if (i13 != 0 || !z11) {
                bVar.u((byte) i13);
                z11 = false;
            }
        }
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final void i0(y40.x xVar, BigInteger bigInteger) {
        y0(xVar, 0, 2, true);
        byte[] byteArray = bigInteger.toByteArray();
        s0(xVar, byteArray.length);
        kotlin.jvm.internal.g0.m(byteArray);
        jz.h.i(xVar, byteArray, 0, 0, 6, null);
    }

    public static final void j0(y40.x xVar, X500Principal x500Principal, X500Principal x500Principal2, PublicKey publicKey, final String str, Instant instant, Instant instant2, List<String> list, List<? extends InetAddress> list2, KeyPair keyPair, KeyType keyType) {
        int compareTo;
        compareTo = instant.compareTo(instant2);
        if (compareTo >= 0) {
            throw new IllegalArgumentException("validFrom must be before validUntil");
        }
        y40.b bVar = new y40.b();
        G0(bVar, str, x500Principal, x500Principal2, publicKey, instant, instant2, list, list2, keyType);
        final byte[] c11 = y40.g0.c(bVar);
        Signature signature = Signature.getInstance(str);
        signature.initSign(keyPair.getPrivate());
        signature.update(c11);
        final byte[] sign = signature.sign();
        x0(xVar, new x00.l() { // from class: vx.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l02;
                l02 = m0.l0(c11, sign, str, (y40.x) obj);
                return l02;
            }
        });
    }

    public static final g2 l0(byte[] bArr, byte[] bArr2, final String str, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        jz.h.i(writeDerSequence, bArr, 0, 0, 6, null);
        x0(writeDerSequence, new x00.l() { // from class: vx.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m02;
                m02 = m0.m0(str, (y40.x) obj);
                return m02;
            }
        });
        kotlin.jvm.internal.g0.m(bArr2);
        o0(writeDerSequence, bArr2, 0, 2, null);
        return g2.f100423a;
    }

    public static final g2 m0(String str, y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.a(str));
        t0(writeDerSequence);
        return g2.f100423a;
    }

    public static final void n0(y40.x xVar, byte[] bArr, int i11) {
        if (i11 < 0 || i11 >= 8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        y0(xVar, 0, 3, true);
        s0(xVar, bArr.length + 1);
        xVar.u((byte) i11);
        jz.h.i(xVar, bArr, 0, 0, 6, null);
    }

    public static /* synthetic */ void o0(y40.x xVar, byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        n0(xVar, bArr, i11);
    }

    public static final void p0(y40.x xVar, boolean z11) {
        y0(xVar, 0, 1, true);
        s0(xVar, 1);
        y40.b0.k(xVar, c0(z11));
    }

    public static final void q0(y40.x xVar, Instant instant) {
        DateTimeFormatter ofPattern;
        ZoneOffset zoneOffset;
        ZonedDateTime atZone;
        String format;
        ofPattern = DateTimeFormatter.ofPattern("yyyyMMddHHmmss'Z'");
        zoneOffset = ZoneOffset.UTC;
        atZone = instant.atZone(g.a(zoneOffset));
        format = ofPattern.format(i.a(atZone));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        A0(xVar, format, 24);
    }

    public static final void r0(y40.x xVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int E = E(i11);
        for (int i12 = 0; i12 < E; i12++) {
            int i13 = (i11 >> (((E - i12) - 1) * 7)) & 127;
            if (i12 == E - 1) {
                xVar.u((byte) i13);
            } else {
                xVar.u((byte) (i13 | 128));
            }
        }
    }

    public static final void s0(y40.x xVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 <= 127) {
            xVar.u((byte) i11);
            return;
        }
        if (i11 <= 255) {
            xVar.u((byte) -127);
            xVar.u((byte) i11);
            return;
        }
        if (i11 <= 65535) {
            xVar.u(ws.c.f96765j);
            xVar.u((byte) (i11 >>> 8));
            xVar.u((byte) i11);
        } else {
            if (i11 <= 16777215) {
                xVar.u((byte) -125);
                xVar.u((byte) (i11 >>> 16));
                xVar.u((byte) (255 & (i11 >>> 8)));
                xVar.u((byte) i11);
                return;
            }
            xVar.u((byte) -124);
            xVar.u((byte) (i11 >>> 24));
            xVar.u((byte) ((i11 >>> 16) & 255));
            xVar.u((byte) (255 & (i11 >>> 8)));
            xVar.u((byte) i11);
        }
    }

    public static final void t0(y40.x xVar) {
        xVar.writeShort((short) 1280);
    }

    public static final void u0(y40.x xVar, ux.m mVar) {
        v0(xVar, mVar.w());
    }

    public static final void v0(y40.x xVar, int[] iArr) {
        int i11;
        int i12 = 2;
        if (iArr.length < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = iArr[0];
        if (i13 < 0 || i13 >= 3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 != 2 && ((i11 = iArr[1]) < 0 || i11 >= 40)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        y40.b bVar = new y40.b();
        r0(bVar, (iArr[0] * 40) + iArr[1]);
        int Me = a00.a0.Me(iArr);
        if (2 <= Me) {
            while (true) {
                r0(bVar, iArr[i12]);
                if (i12 == Me) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        y0(xVar, 0, 6, true);
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final void w0(y40.x xVar, x00.l<? super y40.x, g2> lVar) {
        y40.b bVar = new y40.b();
        lVar.invoke(bVar);
        y0(xVar, 0, 4, true);
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final void x0(y40.x xVar, x00.l<? super y40.x, g2> lVar) {
        y40.b bVar = new y40.b();
        lVar.invoke(bVar);
        y0(xVar, 0, 16, false);
        s0(xVar, (int) jz.j.j(bVar));
        jz.h.j(xVar, bVar);
    }

    public static final void y(y40.x xVar) {
        x0(xVar, new x00.l() { // from class: vx.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z11;
                z11 = m0.z((y40.x) obj);
                return z11;
            }
        });
    }

    public static final void y0(y40.x xVar, int i11, int i12, boolean z11) {
        if (i11 < 0 || i11 >= 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 >= 0 && i12 < 31) {
            xVar.u((byte) ((i11 << 6) | i12 | (z11 ? 0 : 32)));
        } else {
            xVar.u((byte) ((i11 << 6) | 31 | (z11 ? 0 : 32)));
            r0(xVar, i12);
        }
    }

    public static final g2 z(y40.x writeDerSequence) {
        kotlin.jvm.internal.g0.p(writeDerSequence, "$this$writeDerSequence");
        u0(writeDerSequence, ux.m.f92658c.b());
        p0(writeDerSequence, true);
        w0(writeDerSequence, new x00.l() { // from class: vx.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A;
                A = m0.A((y40.x) obj);
                return A;
            }
        });
        return g2.f100423a;
    }

    public static final void z0(y40.x xVar, Instant instant) {
        DateTimeFormatter ofPattern;
        ZoneOffset zoneOffset;
        ZonedDateTime atZone;
        String format;
        ofPattern = DateTimeFormatter.ofPattern("yyMMddHHmmss'Z'");
        zoneOffset = ZoneOffset.UTC;
        atZone = instant.atZone(g.a(zoneOffset));
        format = ofPattern.format(i.a(atZone));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        A0(xVar, format, 23);
    }
}
