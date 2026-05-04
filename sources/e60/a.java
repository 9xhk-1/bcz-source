package e60;

import a00.h0;
import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import f60.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u50.c
@u0({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a extends j {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C0594a f49460g = new C0594a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f49461h;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<m> f49462f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: e60.a$a, reason: collision with other inner class name */
    public static final class C0594a {
        public /* synthetic */ C0594a(v vVar) {
            this();
        }

        @l
        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f49461h;
        }

        public C0594a() {
        }
    }

    static {
        f49461h = j.f49490a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List S = h0.S(f60.c.f51112a.a(), new f60.l(f60.h.f51121f.d()), new f60.l(f60.k.f51135a.a()), new f60.l(f60.i.f51129a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : S) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f49462f = arrayList;
    }

    @Override // e60.j
    @k
    public i60.c d(@k X509TrustManager trustManager) {
        g0.p(trustManager, "trustManager");
        f60.d a11 = f60.d.f51113d.a(trustManager);
        return a11 != null ? a11 : super.d(trustManager);
    }

    @Override // e60.j
    public void f(@k SSLSocket sslSocket, @l String str, @k List<? extends Protocol> protocols) {
        Object obj;
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        Iterator<T> it = this.f49462f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.c(sslSocket, str, protocols);
        }
    }

    @Override // e60.j
    @l
    public String j(@k SSLSocket sslSocket) {
        Object obj;
        g0.p(sslSocket, "sslSocket");
        Iterator<T> it = this.f49462f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // e60.j
    @SuppressLint({"NewApi"})
    public boolean l(@k String hostname) {
        g0.p(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // e60.j
    @l
    public X509TrustManager s(@k SSLSocketFactory sslSocketFactory) {
        Object obj;
        g0.p(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f49462f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).e(sslSocketFactory)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.d(sslSocketFactory);
        }
        return null;
    }
}
