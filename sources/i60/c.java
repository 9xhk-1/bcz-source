package i60;

import e60.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f60209a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final c a(@k X509TrustManager trustManager) {
            g0.p(trustManager, "trustManager");
            return j.f49490a.g().d(trustManager);
        }

        @k
        public final c b(@k X509Certificate... caCerts) {
            g0.p(caCerts, "caCerts");
            return new i60.a(new b((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }

        public a() {
        }
    }

    @k
    public abstract List<Certificate> a(@k List<? extends Certificate> list, @k String str) throws SSLPeerUnverifiedException;
}
