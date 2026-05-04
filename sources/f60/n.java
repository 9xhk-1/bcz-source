package f60;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n extends h {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final a f51139j = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final Class<? super SSLSocketFactory> f51140h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final Class<?> f51141i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        @m80.l
        public final m a(@m80.k String packageName) {
            g0.p(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                g0.n(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                g0.n(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                g0.o(paramsClass, "paramsClass");
                return new n(cls, cls2, paramsClass);
            } catch (Exception e11) {
                e60.j.f49490a.g().m("unable to load android socket classes", 5, e11);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k Class<? super SSLSocket> sslSocketClass, @m80.k Class<? super SSLSocketFactory> sslSocketFactoryClass, @m80.k Class<?> paramClass) {
        super(sslSocketClass);
        g0.p(sslSocketClass, "sslSocketClass");
        g0.p(sslSocketFactoryClass, "sslSocketFactoryClass");
        g0.p(paramClass, "paramClass");
        this.f51140h = sslSocketFactoryClass;
        this.f51141i = paramClass;
    }

    @Override // f60.h, f60.m
    @m80.l
    public X509TrustManager d(@m80.k SSLSocketFactory sslSocketFactory) {
        g0.p(sslSocketFactory, "sslSocketFactory");
        Object U = u50.f.U(sslSocketFactory, this.f51141i, "sslParameters");
        g0.m(U);
        X509TrustManager x509TrustManager = (X509TrustManager) u50.f.U(U, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) u50.f.U(U, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // f60.h, f60.m
    public boolean e(@m80.k SSLSocketFactory sslSocketFactory) {
        g0.p(sslSocketFactory, "sslSocketFactory");
        return this.f51140h.isInstance(sslSocketFactory);
    }
}
