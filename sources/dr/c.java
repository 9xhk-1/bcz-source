package dr;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static String a(String str, String str2) {
        int indexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(",", indexOf);
        int length = indexOf + str2.length() + 1;
        return indexOf2 != -1 ? str.substring(length, indexOf2) : str.substring(length);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate b(android.content.Context r4) {
        /*
            java.lang.String r0 = "X509CertUtil"
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            r2 = 0
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L12 android.content.pm.PackageManager.NameNotFoundException -> L14
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r3)     // Catch: java.lang.Exception -> L12 android.content.pm.PackageManager.NameNotFoundException -> L14
            goto L24
        L12:
            r4 = move-exception
            goto L16
        L14:
            r4 = move-exception
            goto L1e
        L16:
            er.b r1 = er.b.f50106b
            java.lang.String r3 = "PackageInfo with Exception:"
        L1a:
            r1.b(r0, r3, r4)
            goto L23
        L1e:
            er.b r1 = er.b.f50106b
            java.lang.String r3 = "PackageInfo with NameNotFoundException:"
            goto L1a
        L23:
            r4 = r2
        L24:
            if (r4 == 0) goto L48
            android.os.Bundle r4 = r4.metaData
            if (r4 != 0) goto L32
            er.b r4 = er.b.f50106b
            java.lang.String r1 = "failed getCBGRootCA metaData is null"
        L2e:
            r4.a(r0, r1)
            return r2
        L32:
            java.lang.String r1 = "componentverify_ag_cbg_root"
            java.lang.String r4 = r4.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L43
            er.b r4 = er.b.f50106b
            java.lang.String r1 = "failed getCBGRootCA sdkCbgRoot is null"
            goto L2e
        L43:
            java.security.cert.X509Certificate r4 = c(r4)
            return r4
        L48:
            er.b r4 = er.b.f50106b
            java.lang.String r1 = "failed getCBGRootCA packageInfo is null"
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.c.b(android.content.Context):java.security.cert.X509Certificate");
    }

    public static X509Certificate c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d(a.a(str));
    }

    public static X509Certificate d(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
                if (generateCertificate instanceof X509Certificate) {
                    return (X509Certificate) generateCertificate;
                }
            } catch (CertificateException e11) {
                er.b.f50106b.a("X509CertUtil", "Failed to get cert: " + e11.getMessage());
            }
        }
        return null;
    }

    public static boolean e(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        return x509Certificate.getKeyUsage()[5];
    }

    public static boolean f(X509Certificate x509Certificate, String str) {
        return g(x509Certificate, "CN", str);
    }

    public static boolean g(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean h(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list != null && list.size() != 0) {
            if (x509Certificate == null) {
                er.b.f50106b.a("X509CertUtil", "rootCert is null,verify failed ");
                return false;
            }
            try {
                x509Certificate.checkValidity();
                PublicKey publicKey = x509Certificate.getPublicKey();
                for (int size = list.size() - 1; size >= 0; size--) {
                    X509Certificate x509Certificate2 = list.get(size);
                    if (x509Certificate2 != null) {
                        try {
                            x509Certificate2.verify(publicKey);
                            x509Certificate2.checkValidity();
                            publicKey = x509Certificate2.getPublicKey();
                        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e11) {
                            er.b.f50106b.a("X509CertUtil", "verify failed " + e11.getMessage());
                        }
                    }
                    return false;
                }
                return j(list);
            } catch (CertificateExpiredException | CertificateNotYetValidException e12) {
                er.b.f50106b.a("X509CertUtil", "verifyCertChain Exception:" + e12.getMessage());
            }
        }
        return false;
    }

    public static boolean i(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        if (x509Certificate == null || bArr == null || bArr2 == null || bArr2.length == 0) {
            er.b.f50106b.d("X509CertUtil", "checkSignature parameter is null");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e11) {
            er.b.f50106b.b("X509CertUtil", "failed checkSignature,Exception:", e11);
            return false;
        }
    }

    public static boolean j(List<X509Certificate> list) {
        for (int i11 = 1; i11 < list.size(); i11++) {
            if (!e(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public static List<X509Certificate> k(String str) {
        return l(n(str));
    }

    public static List<X509Certificate> l(List<String> list) {
        if (list == null) {
            er.b.f50106b.d("X509CertUtil", "base64 CertChain is null.");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            X509Certificate c11 = c(it.next());
            if (c11 == null) {
                er.b.f50106b.a("X509CertUtil", "Failed to get cert from CertChain");
            } else {
                arrayList.add(c11);
            }
        }
        return arrayList;
    }

    public static boolean m(X509Certificate x509Certificate, String str) {
        return g(x509Certificate, "OU", str);
    }

    public static List<String> n(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
            return arrayList;
        } catch (JSONException e11) {
            er.b.f50106b.a("X509CertUtil", "Failed to getCertChain: " + e11.getMessage());
            return Collections.EMPTY_LIST;
        }
    }
}
