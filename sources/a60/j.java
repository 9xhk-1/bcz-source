package a60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import okhttp3.l;
import okhttp3.m;
import t50.n;
import t50.q;
import t50.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements n {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f2021c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f2022d = 20;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q f2023a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public j(@m80.k q client) {
        g0.p(client, "client");
        this.f2023a = client;
    }

    public final l a(okhttp3.n nVar, String str) {
        String h02;
        okhttp3.i W;
        if (!this.f2023a.b0() || (h02 = okhttp3.n.h0(nVar, "Location", null, 2, null)) == null || (W = nVar.A0().q().W(h02)) == null) {
            return null;
        }
        if (!g0.g(W.X(), nVar.A0().q().X()) && !this.f2023a.c0()) {
            return null;
        }
        l.a n11 = nVar.A0().n();
        if (f.b(str)) {
            int Z = nVar.Z();
            f fVar = f.f2007a;
            boolean z11 = fVar.d(str) || Z == 308 || Z == 307;
            if (!fVar.c(str) || Z == 308 || Z == 307) {
                n11.p(str, z11 ? nVar.A0().f() : null);
            } else {
                n11.p("GET", null);
            }
            if (!z11) {
                n11.t("Transfer-Encoding");
                n11.t("Content-Length");
                n11.t("Content-Type");
            }
        }
        if (!u50.f.l(nVar.A0().q(), W)) {
            n11.t("Authorization");
        }
        return n11.D(W).b();
    }

    public final l b(okhttp3.n nVar, z50.c cVar) throws IOException {
        z50.f h11;
        r b11 = (cVar == null || (h11 = cVar.h()) == null) ? null : h11.b();
        int Z = nVar.Z();
        String m11 = nVar.A0().m();
        if (Z != 307 && Z != 308) {
            if (Z == 401) {
                return this.f2023a.M().a(b11, nVar);
            }
            if (Z == 421) {
                m f11 = nVar.A0().f();
                if ((f11 != null && f11.q()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().D();
                return nVar.A0();
            }
            if (Z == 503) {
                okhttp3.n x02 = nVar.x0();
                if ((x02 == null || x02.Z() != 503) && f(nVar, Integer.MAX_VALUE) == 0) {
                    return nVar.A0();
                }
                return null;
            }
            if (Z == 407) {
                g0.m(b11);
                if (b11.e().type() == Proxy.Type.HTTP) {
                    return this.f2023a.p0().a(b11, nVar);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (Z == 408) {
                if (!this.f2023a.s0()) {
                    return null;
                }
                m f12 = nVar.A0().f();
                if (f12 != null && f12.q()) {
                    return null;
                }
                okhttp3.n x03 = nVar.x0();
                if ((x03 == null || x03.Z() != 408) && f(nVar, 0) <= 0) {
                    return nVar.A0();
                }
                return null;
            }
            switch (Z) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(nVar, m11);
    }

    public final boolean c(IOException iOException, boolean z11) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z11 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean d(IOException iOException, z50.e eVar, l lVar, boolean z11) {
        if (this.f2023a.s0()) {
            return !(z11 && e(iOException, lVar)) && c(iOException, z11) && eVar.y();
        }
        return false;
    }

    public final boolean e(IOException iOException, l lVar) {
        m f11 = lVar.f();
        return (f11 != null && f11.q()) || (iOException instanceof FileNotFoundException);
    }

    public final int f(okhttp3.n nVar, int i11) {
        String h02 = okhttp3.n.h0(nVar, "Retry-After", null, 2, null);
        if (h02 == null) {
            return i11;
        }
        if (!new Regex("\\d+").matches(h02)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(h02);
        g0.o(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.v0().A(r7.v0().b(null).c()).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r0 = r1.p();
        r6 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r0 = r6.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r0.q() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r0 = r7.L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        u50.f.o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8 > 20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r0.m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        r1.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r7;
     */
    @Override // t50.n
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.n intercept(@m80.k t50.n.a r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r11, r0)
            a60.g r11 = (a60.g) r11
            okhttp3.l r0 = r11.n()
            z50.e r1 = r11.j()
            java.util.List r2 = a00.h0.J()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.h(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Ld3
            okhttp3.n r0 = r11.c(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 okhttp3.internal.connection.RouteException -> Lb4
            if (r7 == 0) goto L40
            okhttp3.n$a r0 = r0.v0()     // Catch: java.lang.Throwable -> L42
            okhttp3.n$a r6 = r7.v0()     // Catch: java.lang.Throwable -> L42
            okhttp3.n$a r6 = r6.b(r4)     // Catch: java.lang.Throwable -> L42
            okhttp3.n r6 = r6.c()     // Catch: java.lang.Throwable -> L42
            okhttp3.n$a r0 = r0.A(r6)     // Catch: java.lang.Throwable -> L42
            okhttp3.n r0 = r0.c()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ldb
        L45:
            z50.c r0 = r1.p()     // Catch: java.lang.Throwable -> L42
            okhttp3.l r6 = r10.b(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.m()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.B()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.i(r3)
            return r7
        L5e:
            okhttp3.m r0 = r6.f()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.q()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.i(r3)
            return r7
        L6e:
            okhttp3.o r0 = r7.L()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            u50.f.o(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.i(r5)
            r0 = r6
            goto L18
        L82:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L42
            r0.append(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L99:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L42
            r9 = r9 ^ r5
            boolean r9 = r10.d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Laf
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = a00.r0.J4(r2, r6)     // Catch: java.lang.Throwable -> L42
        La9:
            r1.i(r5)
            r6 = r3
            goto L19
        Laf:
            java.lang.Throwable r11 = u50.f.o0(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lb4:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = a00.r0.J4(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La9
        Lca:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = u50.f.o0(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld3:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ldb:
            r1.i(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.j.intercept(t50.n$a):okhttp3.n");
    }
}
