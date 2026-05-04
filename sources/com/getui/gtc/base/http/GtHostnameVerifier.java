package com.getui.gtc.base.http;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import zr.m;

/* loaded from: classes6.dex */
public class GtHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final GtHostnameVerifier INSTANCE = new GtHostnameVerifier();
    private static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i11) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i11 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        int size = subjectAltNames.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (str.equalsIgnoreCase(subjectAltNames.get(i11))) {
                return true;
            }
        }
        return false;
    }

    public boolean verify(String str, X509Certificate x509Certificate) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches() ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    public boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith(m.f102856e) && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith(m.f102856e)) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    private boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = getSubjectAltNames(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (verifyHostname(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
