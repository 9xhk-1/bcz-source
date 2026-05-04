package wr;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96678a = "SSLUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final String f96679b = "TLSv1.3";

    /* renamed from: c, reason: collision with root package name */
    public static final String f96680c = "TLSv1.2";

    /* renamed from: d, reason: collision with root package name */
    public static final String f96681d = "TLS";

    /* renamed from: e, reason: collision with root package name */
    public static final String f96682e = "TLSv1";

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f96683f = {"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f96684g = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f96685h = {"TLS_RSA", pr.a.f81159d, "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    public static String[] a(SSLSocket sSLSocket) {
        return sSLSocket.getEnabledCipherSuites();
    }

    public static String[] b(SSLSocket sSLSocket) {
        return sSLSocket.getEnabledProtocols();
    }

    public static void c(SSLSocket sSLSocket) {
        for (String str : sSLSocket.getEnabledProtocols()) {
            yr.h.e(f96678a, "new enable protocols is : " + str);
        }
        for (String str2 : sSLSocket.getEnabledCipherSuites()) {
            yr.h.e(f96678a, "new cipher suites is : " + str2);
        }
    }

    public static boolean d(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return e(sSLSocket, f96685h);
    }

    public static boolean e(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        for (String str : enabledCipherSuites) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    arrayList.add(str);
                    break;
                }
                if (upperCase.contains(strArr[i11].toUpperCase(Locale.ENGLISH))) {
                    break;
                }
                i11++;
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    public static void f(SSLSocket sSLSocket) {
        if (sSLSocket == null || k(sSLSocket)) {
            return;
        }
        d(sSLSocket);
    }

    public static void g(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            sSLSocket.setEnabledProtocols(new String[]{f96679b, f96680c});
        }
        if (i11 < 29) {
            sSLSocket.setEnabledProtocols(new String[]{f96680c});
        }
    }

    public static boolean h(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket != null && strArr != null) {
            try {
                sSLSocket.setEnabledProtocols(strArr);
                return true;
            } catch (Exception e11) {
                yr.h.d(f96678a, "setEnabledProtocols: exception : " + e11.getMessage());
            }
        }
        return false;
    }

    public static SSLContext i() throws NoSuchAlgorithmException {
        return Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance(f96679b) : SSLContext.getInstance(f96680c);
    }

    public static void j(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        g(sSLSocket);
        f(sSLSocket);
    }

    public static boolean k(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return l(sSLSocket, f96684g);
    }

    public static boolean l(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (asList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }
}
