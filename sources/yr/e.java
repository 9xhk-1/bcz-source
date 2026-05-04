package yr;

import android.net.http.SslCertificate;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100279a = "b";

    /* renamed from: b, reason: collision with root package name */
    public static final int f100280b = 5;

    public static X509Certificate a(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException e11) {
            h.c(f100279a, "exception", e11);
            return null;
        }
    }

    public static X509Certificate b(String str) {
        try {
            return (X509Certificate) CertificateFactory.getInstance(wr.k.f96725f).generateCertificate(new ByteArrayInputStream(str.getBytes()));
        } catch (CertificateException e11) {
            h.d(f100279a, "generateX509FromStr: CertificateException" + e11.getMessage());
            return null;
        }
    }

    public static boolean c(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        return x509Certificate.getKeyUsage()[5];
    }

    public static boolean d(X509Certificate x509Certificate, String str) {
        if (str.equals(x509Certificate.getSubjectDN().getName())) {
            return true;
        }
        h.d(f100279a, "verify: subject name is error");
        return false;
    }

    public static boolean e(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            if (j(new X509Certificate[]{x509Certificate, x509Certificate2})) {
                return true;
            }
            h.d(f100279a, "verify: date not right");
            return false;
        } catch (InvalidKeyException e11) {
            h.d(f100279a, "verify: publickey InvalidKeyException " + e11.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e12) {
            h.d(f100279a, "verify: publickey NoSuchAlgorithmException " + e12.getMessage());
            return false;
        } catch (NoSuchProviderException e13) {
            h.d(f100279a, "verify: publickey NoSuchProviderException " + e13.getMessage());
            return false;
        } catch (SignatureException e14) {
            h.d(f100279a, "verify: publickey SignatureException " + e14.getMessage());
            return false;
        } catch (CertificateException e15) {
            h.d(f100279a, "verify: publickey CertificateException " + e15.getMessage());
            return false;
        } catch (Exception e16) {
            h.d(f100279a, "verify: Exception " + e16.getMessage());
            return false;
        }
    }

    public static boolean f(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr) throws NoSuchProviderException, CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Principal principal = null;
        int i11 = 0;
        while (i11 < x509CertificateArr.length) {
            X509Certificate x509Certificate2 = x509CertificateArr[i11];
            Principal issuerDN = x509Certificate2.getIssuerDN();
            Principal subjectDN = x509Certificate2.getSubjectDN();
            if (principal != null) {
                if (!issuerDN.equals(principal)) {
                    h.d(f100279a, "verify: principalIssuer not match");
                    return false;
                }
                x509CertificateArr[i11].verify(x509CertificateArr[i11 - 1].getPublicKey());
            }
            i11++;
            principal = subjectDN;
        }
        return e(x509Certificate, x509CertificateArr[0]) && j(x509CertificateArr) && c(x509Certificate) && h(x509CertificateArr);
    }

    public static boolean g(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr, X509CRL x509crl, String str) throws NoSuchAlgorithmException, CertificateException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return !f(x509Certificate, x509CertificateArr) && !i(x509CertificateArr, x509crl) && d(x509CertificateArr[x509CertificateArr.length - 1], str) && j(x509CertificateArr);
    }

    public static boolean h(X509Certificate[] x509CertificateArr) {
        for (int i11 = 0; i11 < x509CertificateArr.length - 1; i11++) {
            if (!c(x509CertificateArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(X509Certificate[] x509CertificateArr, X509CRL x509crl) {
        ArrayList arrayList = new ArrayList();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            arrayList.add(x509Certificate.getSerialNumber());
        }
        if (x509crl == null) {
            return true;
        }
        try {
            Set<? extends X509CRLEntry> revokedCertificates = x509crl.getRevokedCertificates();
            if (revokedCertificates == null || revokedCertificates.isEmpty()) {
                return true;
            }
            Iterator<? extends X509CRLEntry> it = revokedCertificates.iterator();
            while (it.hasNext()) {
                if (arrayList.contains(it.next().getSerialNumber())) {
                    h.d(f100279a, "verify: certificate revoked");
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            h.d(f100279a, "verify: revoked verify exception : " + e11.getMessage());
            return false;
        }
    }

    public static boolean j(X509Certificate[] x509CertificateArr) {
        Date date = new Date();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            try {
                x509Certificate.checkValidity(date);
            } catch (CertificateExpiredException e11) {
                e = e11;
                h.d(f100279a, "verifyCertificateDate: exception : " + e.getMessage());
                return false;
            } catch (CertificateNotYetValidException e12) {
                e = e12;
                h.d(f100279a, "verifyCertificateDate: exception : " + e.getMessage());
                return false;
            } catch (Exception e13) {
                h.d(f100279a, "verifyCertificateDate : exception : " + e13.getMessage());
                return false;
            }
        }
        return true;
    }
}
