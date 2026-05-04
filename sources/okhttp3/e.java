package okhttp3;

import a00.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f77251e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final d[] f77252f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final d[] f77253g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final e f77254h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final e f77255i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final e f77256j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final e f77257k;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f77258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77259b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String[] f77260c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String[] f77261d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    static {
        d dVar = d.f77223o1;
        d dVar2 = d.f77226p1;
        d dVar3 = d.f77229q1;
        d dVar4 = d.f77181a1;
        d dVar5 = d.f77193e1;
        d dVar6 = d.f77184b1;
        d dVar7 = d.f77196f1;
        d dVar8 = d.f77214l1;
        d dVar9 = d.f77211k1;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9};
        f77252f = dVarArr;
        d[] dVarArr2 = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, d.L0, d.M0, d.f77207j0, d.f77210k0, d.H, d.L, d.f77212l};
        f77253g = dVarArr2;
        a e11 = new a(true).e((d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f77254h = e11.p(tlsVersion, tlsVersion2).n(true).c();
        f77255i = new a(true).e((d[]) Arrays.copyOf(dVarArr2, dVarArr2.length)).p(tlsVersion, tlsVersion2).n(true).c();
        f77256j = new a(true).e((d[]) Arrays.copyOf(dVarArr2, dVarArr2.length)).p(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).n(true).c();
        f77257k = new a(false).c();
    }

    public e(boolean z11, boolean z12, @m80.l String[] strArr, @m80.l String[] strArr2) {
        this.f77258a = z11;
        this.f77259b = z12;
        this.f77260c = strArr;
        this.f77261d = strArr2;
    }

    @m80.l
    @w00.j(name = "-deprecated_cipherSuites")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cipherSuites", imports = {}))
    public final List<d> a() {
        return g();
    }

    @w00.j(name = "-deprecated_supportsTlsExtensions")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "supportsTlsExtensions", imports = {}))
    public final boolean b() {
        return this.f77259b;
    }

    @m80.l
    @w00.j(name = "-deprecated_tlsVersions")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "tlsVersions", imports = {}))
    public final List<TlsVersion> c() {
        return l();
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z11 = this.f77258a;
        e eVar = (e) obj;
        if (z11 != eVar.f77258a) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f77260c, eVar.f77260c) && Arrays.equals(this.f77261d, eVar.f77261d) && this.f77259b == eVar.f77259b);
    }

    public final void f(@m80.k SSLSocket sslSocket, boolean z11) {
        g0.p(sslSocket, "sslSocket");
        e j11 = j(sslSocket, z11);
        if (j11.l() != null) {
            sslSocket.setEnabledProtocols(j11.f77261d);
        }
        if (j11.g() != null) {
            sslSocket.setEnabledCipherSuites(j11.f77260c);
        }
    }

    @m80.l
    @w00.j(name = "cipherSuites")
    public final List<d> g() {
        String[] strArr = this.f77260c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(d.f77182b.b(str));
        }
        return r0.a6(arrayList);
    }

    public final boolean h(@m80.k SSLSocket socket) {
        g0.p(socket, "socket");
        if (!this.f77258a) {
            return false;
        }
        String[] strArr = this.f77261d;
        if (strArr != null && !u50.f.z(strArr, socket.getEnabledProtocols(), e00.g.q())) {
            return false;
        }
        String[] strArr2 = this.f77260c;
        return strArr2 == null || u50.f.z(strArr2, socket.getEnabledCipherSuites(), d.f77182b.c());
    }

    public int hashCode() {
        if (!this.f77258a) {
            return 17;
        }
        String[] strArr = this.f77260c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f77261d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f77259b ? 1 : 0);
    }

    @w00.j(name = "isTls")
    public final boolean i() {
        return this.f77258a;
    }

    public final e j(SSLSocket sSLSocket, boolean z11) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f77260c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            g0.o(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = u50.f.L(enabledCipherSuites, this.f77260c, d.f77182b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f77261d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            g0.o(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = u50.f.L(enabledProtocols, this.f77261d, e00.g.q());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        g0.o(supportedCipherSuites, "supportedCipherSuites");
        int D = u50.f.D(supportedCipherSuites, "TLS_FALLBACK_SCSV", d.f77182b.c());
        if (z11 && D != -1) {
            g0.o(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[D];
            g0.o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = u50.f.r(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        g0.o(cipherSuitesIntersection, "cipherSuitesIntersection");
        a d11 = aVar.d((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        g0.o(tlsVersionsIntersection, "tlsVersionsIntersection");
        return d11.o((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).c();
    }

    @w00.j(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.f77259b;
    }

    @m80.l
    @w00.j(name = "tlsVersions")
    public final List<TlsVersion> l() {
        String[] strArr = this.f77261d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return r0.a6(arrayList);
    }

    @m80.k
    public String toString() {
        if (!this.f77258a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(g(), "[all enabled]") + ", tlsVersions=" + Objects.toString(l(), "[all enabled]") + ", supportsTlsExtensions=" + this.f77259b + ')';
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f77262a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String[] f77263b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String[] f77264c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f77265d;

        public a(boolean z11) {
            this.f77262a = z11;
        }

        @m80.k
        public final a a() {
            if (!this.f77262a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.f77263b = null;
            return this;
        }

        @m80.k
        public final a b() {
            if (!this.f77262a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.f77264c = null;
            return this;
        }

        @m80.k
        public final e c() {
            return new e(this.f77262a, this.f77265d, this.f77263b, this.f77264c);
        }

        @m80.k
        public final a d(@m80.k String... cipherSuites) {
            g0.p(cipherSuites, "cipherSuites");
            if (!this.f77262a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f77263b = (String[]) cipherSuites.clone();
            return this;
        }

        @m80.k
        public final a e(@m80.k d... cipherSuites) {
            g0.p(cipherSuites, "cipherSuites");
            if (!this.f77262a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (d dVar : cipherSuites) {
                arrayList.add(dVar.e());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @m80.l
        public final String[] f() {
            return this.f77263b;
        }

        public final boolean g() {
            return this.f77265d;
        }

        public final boolean h() {
            return this.f77262a;
        }

        @m80.l
        public final String[] i() {
            return this.f77264c;
        }

        public final void j(@m80.l String[] strArr) {
            this.f77263b = strArr;
        }

        public final void k(boolean z11) {
            this.f77265d = z11;
        }

        public final void l(boolean z11) {
            this.f77262a = z11;
        }

        public final void m(@m80.l String[] strArr) {
            this.f77264c = strArr;
        }

        @yz.n(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @m80.k
        public final a n(boolean z11) {
            if (!this.f77262a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f77265d = z11;
            return this;
        }

        @m80.k
        public final a o(@m80.k String... tlsVersions) {
            g0.p(tlsVersions, "tlsVersions");
            if (!this.f77262a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f77264c = (String[]) tlsVersions.clone();
            return this;
        }

        @m80.k
        public final a p(@m80.k TlsVersion... tlsVersions) {
            g0.p(tlsVersions, "tlsVersions");
            if (!this.f77262a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return o((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(@m80.k e connectionSpec) {
            g0.p(connectionSpec, "connectionSpec");
            this.f77262a = connectionSpec.i();
            this.f77263b = connectionSpec.f77260c;
            this.f77264c = connectionSpec.f77261d;
            this.f77265d = connectionSpec.k();
        }
    }
}
