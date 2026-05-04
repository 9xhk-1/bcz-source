package xr;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import u30.u0;
import yr.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f98308a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f98309b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", com.alipay.sdk.m.k.b.f10651k, "or", "org"};
        f98309b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z11) throws SSLException {
        String[] d11 = d(x509Certificate);
        String[] f11 = f(x509Certificate);
        h.b("", "cn is : " + Arrays.toString(d11));
        h.b("", "san is : " + Arrays.toString(f11));
        b(str, d11, f11, z11);
    }

    public static final void b(String str, String[] strArr, String[] strArr2, boolean z11) throws SSLException {
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append(u0.f91710f);
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(46, 2) == -1 || !c(lowerCase2) || g(str)) {
                z12 = lowerCase.equals(lowerCase2);
            } else {
                boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                z12 = (endsWith && z11) ? e(lowerCase) == e(lowerCase2) : endsWith;
            }
            if (z12) {
                break;
            }
        }
        if (z12) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length >= 7 && length <= 9) {
            int i11 = length - 3;
            if (str.charAt(i11) == '.') {
                return Arrays.binarySearch(f98309b, str.substring(2, i11)) < 0;
            }
        }
        return true;
    }

    public static String[] d(X509Certificate x509Certificate) {
        List<String> e11 = new c(x509Certificate.getSubjectX500Principal()).e(AdvanceSetting.CLEAR_NOTIFICATION);
        if (e11.isEmpty()) {
            return null;
        }
        String[] strArr = new String[e11.size()];
        e11.toArray(strArr);
        return strArr;
    }

    public static int e(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '.') {
                i11++;
            }
        }
        return i11;
    }

    public static String[] f(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e11) {
            h.c("", "Error parsing certificate.", e11);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public static boolean g(String str) {
        return f98308a.matcher(str).matches();
    }
}
