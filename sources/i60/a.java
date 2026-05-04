package i60;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0694a f60205c = new C0694a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f60206d = 9;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f60207b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: i60.a$a, reason: collision with other inner class name */
    public static final class C0694a {
        public /* synthetic */ C0694a(v vVar) {
            this();
        }

        public C0694a() {
        }
    }

    public a(@k e trustRootIndex) {
        g0.p(trustRootIndex, "trustRootIndex");
        this.f60207b = trustRootIndex;
    }

    @Override // i60.c
    @k
    public List<Certificate> a(@k List<? extends Certificate> chain, @k String hostname) throws SSLPeerUnverifiedException {
        g0.p(chain, "chain");
        g0.p(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        g0.o(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z11 = false;
        for (int i11 = 0; i11 < 9; i11++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            g0.n(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a11 = this.f60207b.a(x509Certificate);
            if (a11 == null) {
                Iterator it = arrayDeque.iterator();
                g0.o(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    g0.n(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z11) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !g0.g(x509Certificate, a11)) {
                arrayList.add(a11);
            }
            if (b(a11, a11)) {
                return arrayList;
            }
            z11 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!g0.g(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && g0.g(((a) obj).f60207b, this.f60207b);
    }

    public int hashCode() {
        return this.f60207b.hashCode();
    }
}
