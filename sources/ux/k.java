package ux;

import a00.n0;
import a00.r0;
import io.ktor.network.tls.TLSException;
import ix.k1;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHostnameUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostnameUtils.kt\nio/ktor/network/tls/HostnameUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1755#2,3:104\n774#2:107\n865#2,2:108\n1557#2:110\n1628#2,3:111\n1755#2,3:114\n774#2:117\n865#2,2:118\n1557#2:120\n1628#2,3:121\n774#2:124\n865#2,2:125\n1557#2:127\n1628#2,3:128\n*S KotlinDebug\n*F\n+ 1 HostnameUtils.kt\nio/ktor/network/tls/HostnameUtilsKt\n*L\n21#1:104,3\n31#1:107\n31#1:108,2\n32#1:110\n32#1:111,3\n35#1:114,3\n95#1:117\n95#1:118,2\n96#1:120\n96#1:121,3\n100#1:124\n100#1:125,2\n101#1:127\n101#1:128,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f92627a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f92628b = 7;

    public static final List<String> a(X509Certificate x509Certificate) {
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subjectAlternativeNames) {
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.g0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj2).intValue() == 2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj3 = ((List) it.next()).get(1);
            kotlin.jvm.internal.g0.n(obj3, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((String) obj3);
        }
        return arrayList2;
    }

    public static final List<String> b(X509Certificate x509Certificate) {
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subjectAlternativeNames) {
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.g0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj2).intValue() == 7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj3 = ((List) it.next()).get(1);
            kotlin.jvm.internal.g0.n(obj3, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((String) obj3);
        }
        return arrayList2;
    }

    public static final boolean c(@m80.k String serverName, @m80.k String certificateHost) {
        kotlin.jvm.internal.g0.p(serverName, "serverName");
        kotlin.jvm.internal.g0.p(certificateHost, "certificateHost");
        if (u30.f0.c2(serverName, certificateHost, true)) {
            return true;
        }
        List c12 = n0.c1(u30.k0.n5(serverName, new char[]{'.'}, false, 0, 6, null));
        List c13 = n0.c1(u30.k0.n5(certificateHost, new char[]{'.'}, false, 0, 6, null));
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (i11 < c12.size() && i12 < c13.size()) {
            String str = (String) c12.get(i11);
            if (i11 == 0 && str.length() == 0) {
                i11++;
            } else {
                String str2 = (String) c13.get(i12);
                if (i12 != 0 || str2.length() != 0) {
                    if (!z11 && u30.f0.c2(str, str2, true)) {
                        i13++;
                        i11++;
                    } else {
                        if (!kotlin.jvm.internal.g0.g(str2, "*")) {
                            return false;
                        }
                        i11++;
                        i12++;
                        z11 = true;
                    }
                }
                i12++;
            }
        }
        return i11 == c12.size() && i12 == c13.size() && (!z11 || i13 >= 2);
    }

    public static final void d(@m80.k String serverName, @m80.k X509Certificate certificate) {
        kotlin.jvm.internal.g0.p(serverName, "serverName");
        kotlin.jvm.internal.g0.p(certificate, "certificate");
        if (k1.a(serverName)) {
            e(serverName, certificate);
            return;
        }
        List<String> a11 = a(certificate);
        if (a11.isEmpty()) {
            return;
        }
        List<String> list = a11;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (c(serverName, (String) it.next())) {
                    return;
                }
            }
        }
        throw new TLSException("No server host: " + serverName + " in the server certificate. Provided in certificate: " + r0.r3(list, null, null, null, 0, null, null, 63, null), null, 2, null);
    }

    public static final void e(@m80.k String ipString, @m80.k X509Certificate certificate) {
        kotlin.jvm.internal.g0.p(ipString, "ipString");
        kotlin.jvm.internal.g0.p(certificate, "certificate");
        Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : subjectAlternativeNames) {
                Object obj2 = ((List) obj).get(0);
                kotlin.jvm.internal.g0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) obj2).intValue() == 7) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj3 = ((List) it.next()).get(1);
                kotlin.jvm.internal.g0.n(obj3, "null cannot be cast to non-null type kotlin.String");
                arrayList2.add((String) obj3);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.g0.g((String) it2.next(), ipString)) {
                        return;
                    }
                }
            }
            throw new TLSException("No server host: " + ipString + " in the server certificate. The certificate was issued for: " + r0.r3(arrayList2, null, null, null, 0, null, null, 63, null) + '.', null, 2, null);
        }
    }
}
