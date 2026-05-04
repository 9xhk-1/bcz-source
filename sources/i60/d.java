package i60;

import a00.h0;
import a00.r0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.k1;
import m80.k;
import u30.f0;
import u30.k0;
import u50.f;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f60210a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final int f60211b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f60212c = 7;

    @k
    public final List<String> a(@k X509Certificate certificate) {
        g0.p(certificate, "certificate");
        return r0.I4(c(certificate, 7), c(certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        g0.o(US, "US");
        String lowerCase = str.toLowerCase(US);
        g0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> c(X509Certificate x509Certificate, int i11) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return h0.J();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && g0.g(list.get(0), Integer.valueOf(i11)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return h0.J();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) k1.l(str, 0, 0, 3, null));
    }

    public final boolean e(@k String host, @k X509Certificate certificate) {
        g0.p(host, "host");
        g0.p(certificate, "certificate");
        return f.k(host) ? h(host, certificate) : g(host, certificate);
    }

    public final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !f0.J2(str, ".", false, 2, null) && !f0.b2(str, m.f102856e, false, 2, null) && str2 != null && str2.length() != 0 && !f0.J2(str2, ".", false, 2, null) && !f0.b2(str2, m.f102856e, false, 2, null)) {
            if (!f0.b2(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!f0.b2(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String b11 = b(str2);
            if (!k0.n3(b11, "*", false, 2, null)) {
                return g0.g(str3, b11);
            }
            if (!f0.J2(b11, "*.", false, 2, null) || k0.I3(b11, '*', 1, false, 4, null) != -1 || str3.length() < b11.length() || g0.g("*.", b11)) {
                return false;
            }
            String substring = b11.substring(1);
            g0.o(substring, "this as java.lang.String).substring(startIndex)");
            if (!f0.b2(str3, substring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || k0.X3(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String b11 = b(str);
        List<String> c11 = c(x509Certificate, 2);
        if ((c11 instanceof Collection) && c11.isEmpty()) {
            return false;
        }
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            if (f60210a.f(b11, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String e11 = u50.a.e(str);
        List<String> c11 = c(x509Certificate, 7);
        if ((c11 instanceof Collection) && c11.isEmpty()) {
            return false;
        }
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            if (g0.g(e11, u50.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@k String host, @k SSLSession session) {
        g0.p(host, "host");
        g0.p(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            g0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
