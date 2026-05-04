package e60;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends j {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final b f49476k = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Method f49477f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Method f49478g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Method f49479h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Class<?> f49480i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Class<?> f49481j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f49482a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f49483b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f49484c;

        public a(@k List<String> protocols) {
            g0.p(protocols, "protocols");
            this.f49482a = protocols;
        }

        @l
        public final String a() {
            return this.f49484c;
        }

        public final boolean b() {
            return this.f49483b;
        }

        public final void c(@l String str) {
            this.f49484c = str;
        }

        public final void d(boolean z11) {
            this.f49483b = z11;
        }

        @Override // java.lang.reflect.InvocationHandler
        @l
        public Object invoke(@k Object proxy, @k Method method, @l Object[] objArr) throws Throwable {
            g0.p(proxy, "proxy");
            g0.p(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (g0.g(name, "supports") && g0.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (g0.g(name, "unsupported") && g0.g(Void.TYPE, returnType)) {
                this.f49483b = true;
                return null;
            }
            if (g0.g(name, "protocols") && objArr.length == 0) {
                return this.f49482a;
            }
            if ((g0.g(name, "selectProtocol") || g0.g(name, "select")) && g0.g(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i11 = 0;
                        while (true) {
                            Object obj2 = list.get(i11);
                            g0.n(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f49482a.contains(str)) {
                                if (i11 == size) {
                                    break;
                                }
                                i11++;
                            } else {
                                this.f49484c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f49482a.get(0);
                    this.f49484c = str2;
                    return str2;
                }
            }
            if ((!g0.g(name, "protocolSelected") && !g0.g(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            g0.n(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f49484c = (String) obj3;
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @l
        public final j a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                g0.o(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod(ct.d.f46852f, SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                g0.o(putMethod, "putMethod");
                g0.o(getMethod, "getMethod");
                g0.o(removeMethod, "removeMethod");
                g0.o(clientProviderClass, "clientProviderClass");
                g0.o(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public b() {
        }
    }

    public e(@k Method putMethod, @k Method getMethod, @k Method removeMethod, @k Class<?> clientProviderClass, @k Class<?> serverProviderClass) {
        g0.p(putMethod, "putMethod");
        g0.p(getMethod, "getMethod");
        g0.p(removeMethod, "removeMethod");
        g0.p(clientProviderClass, "clientProviderClass");
        g0.p(serverProviderClass, "serverProviderClass");
        this.f49477f = putMethod;
        this.f49478g = getMethod;
        this.f49479h = removeMethod;
        this.f49480i = clientProviderClass;
        this.f49481j = serverProviderClass;
    }

    @Override // e60.j
    public void c(@k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        try {
            this.f49479h.invoke(null, sslSocket);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError("failed to remove ALPN", e12);
        }
    }

    @Override // e60.j
    public void f(@k SSLSocket sslSocket, @l String str, @k List<? extends Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        try {
            this.f49477f.invoke(null, sslSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f49480i, this.f49481j}, new a(j.f49490a.b(protocols))));
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError("failed to set ALPN", e12);
        }
    }

    @Override // e60.j
    @l
    public String j(@k SSLSocket sslSocket) {
        g0.p(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f49478g.invoke(null, sslSocket));
            g0.n(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError("failed to get ALPN selected protocol", e12);
        }
    }
}
