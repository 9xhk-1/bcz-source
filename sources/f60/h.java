package f60;

import f60.l;
import f60.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import okhttp3.Protocol;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h implements m {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f51121f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final l.a f51122g;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Class<? super SSLSocket> f51123a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Method f51124b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f51125c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f51126d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f51127e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: f60.h$a$a, reason: collision with other inner class name */
        public static final class C0609a implements l.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f51128a;

            public C0609a(String str) {
                this.f51128a = str;
            }

            @Override // f60.l.a
            public boolean a(@m80.k SSLSocket sslSocket) {
                g0.p(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                g0.o(name, "sslSocket.javaClass.name");
                return f0.J2(name, this.f51128a + '.', false, 2, null);
            }

            @Override // f60.l.a
            @m80.k
            public m b(@m80.k SSLSocket sslSocket) {
                g0.p(sslSocket, "sslSocket");
                return h.f51121f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        public final h b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !g0.g(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            g0.m(cls2);
            return new h(cls2);
        }

        @m80.k
        public final l.a c(@m80.k String packageName) {
            g0.p(packageName, "packageName");
            return new C0609a(packageName);
        }

        @m80.k
        public final l.a d() {
            return h.f51122g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f51121f = aVar;
        f51122g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(@m80.k Class<? super SSLSocket> sslSocketClass) {
        g0.p(sslSocketClass, "sslSocketClass");
        this.f51123a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        g0.o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f51124b = declaredMethod;
        this.f51125c = sslSocketClass.getMethod("setHostname", String.class);
        this.f51126d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f51127e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // f60.m
    public boolean a(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        return this.f51123a.isInstance(sslSocket);
    }

    @Override // f60.m
    @m80.l
    public String b(@m80.k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f51126d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, u30.d.f91599b);
            }
            return null;
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if ((cause instanceof NullPointerException) && g0.g(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e12);
        }
    }

    @Override // f60.m
    public void c(@m80.k SSLSocket sslSocket, @m80.l String str, @m80.k List<? extends Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f51124b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f51125c.invoke(sslSocket, str);
                }
                this.f51127e.invoke(sslSocket, e60.j.f49490a.c(protocols));
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (InvocationTargetException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    @Override // f60.m
    @m80.l
    public X509TrustManager d(@m80.k SSLSocketFactory sSLSocketFactory) {
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // f60.m
    public boolean e(@m80.k SSLSocketFactory sSLSocketFactory) {
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // f60.m
    public boolean isSupported() {
        return e60.b.f49463h.b();
    }
}
