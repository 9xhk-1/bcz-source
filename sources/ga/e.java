package ga;

import a00.h0;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.conscrypt.Conscrypt;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f53520b = "TlsSupport";

    /* renamed from: c, reason: collision with root package name */
    @l
    public static b f53521c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f53519a = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final int f53522d = 8;

    public final void a(@k Application app2) {
        g0.p(app2, "app");
        try {
            Security.insertProviderAt(Conscrypt.newProvider(), 1);
            SSLContext sSLContext = SSLContext.getInstance("TLS", "Conscrypt");
            X509TrustManager defaultX509TrustManager = Conscrypt.getDefaultX509TrustManager();
            g0.o(defaultX509TrustManager, "getDefaultX509TrustManager(...)");
            sSLContext.init(null, new TrustManager[]{new a(defaultX509TrustManager)}, null);
            f53521c = new b(sSLContext.getSocketFactory());
        } catch (Exception e11) {
            qb.c.c(f53520b, "", e11);
        }
    }

    @k
    public final q.a b(@k q.a builder) {
        g0.p(builder, "builder");
        b bVar = f53521c;
        if (bVar != null) {
            builder.n(h0.Q(okhttp3.e.f77257k, okhttp3.e.f77255i));
            X509TrustManager defaultX509TrustManager = Conscrypt.getDefaultX509TrustManager();
            g0.o(defaultX509TrustManager, "getDefaultX509TrustManager(...)");
            builder.Q0(bVar, new a(defaultX509TrustManager));
        }
        return builder;
    }
}
