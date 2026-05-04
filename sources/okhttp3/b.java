package okhttp3;

import a00.h0;
import a00.w1;
import androidx.collection.SieveCacheKt;
import da0.j;
import e60.j;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w0;
import l60.e1;
import l60.g1;
import l60.r0;
import l60.w;
import okhttp3.h;
import okhttp3.l;
import okhttp3.n;
import okio.ByteString;
import u30.f0;
import u30.k0;
import w50.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final C0946b f77117g = new C0946b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f77118h = 201105;

    /* renamed from: i, reason: collision with root package name */
    public static final int f77119i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f77120j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f77121k = 2;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w50.d f77122a;

    /* renamed from: b, reason: collision with root package name */
    public int f77123b;

    /* renamed from: c, reason: collision with root package name */
    public int f77124c;

    /* renamed from: d, reason: collision with root package name */
    public int f77125d;

    /* renamed from: e, reason: collision with root package name */
    public int f77126e;

    /* renamed from: f, reason: collision with root package name */
    public int f77127f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends o {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final d.C1282d f77128c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final String f77129d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final String f77130e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final l60.m f77131f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        public static final class C0945a extends w {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f77132b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0945a(g1 g1Var, a aVar) {
                super(g1Var);
                this.f77132b = aVar;
            }

            @Override // l60.w, l60.g1, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f77132b.a0().close();
                super.close();
            }
        }

        public a(@m80.k d.C1282d snapshot, @m80.l String str, @m80.l String str2) {
            g0.p(snapshot, "snapshot");
            this.f77128c = snapshot;
            this.f77129d = str;
            this.f77130e = str2;
            this.f77131f = r0.e(new C0945a(snapshot.e(1), this));
        }

        @Override // okhttp3.o
        @m80.k
        public l60.m V() {
            return this.f77131f;
        }

        @m80.k
        public final d.C1282d a0() {
            return this.f77128c;
        }

        @Override // okhttp3.o
        public long q() {
            String str = this.f77130e;
            if (str != null) {
                return u50.f.j0(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.o
        @m80.l
        public j r() {
            String str = this.f77129d;
            if (str != null) {
                return j.f77447e.d(str);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    /* renamed from: okhttp3.b$b, reason: collision with other inner class name */
    public static final class C0946b {
        public /* synthetic */ C0946b(v vVar) {
            this();
        }

        public final boolean a(@m80.k n nVar) {
            g0.p(nVar, "<this>");
            return d(nVar.k0()).contains("*");
        }

        @w00.o
        @m80.k
        public final String b(@m80.k i url) {
            g0.p(url, "url");
            return ByteString.Companion.l(url.toString()).md5().hex();
        }

        public final int c(@m80.k l60.m source) throws IOException {
            g0.p(source, "source");
            try {
                long s72 = source.s7();
                String L5 = source.L5();
                if (s72 >= 0 && s72 <= SieveCacheKt.NodeLinkMask && L5.length() <= 0) {
                    return (int) s72;
                }
                throw new IOException("expected an int but was \"" + s72 + L5 + '\"');
            } catch (NumberFormatException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        public final Set<String> d(h hVar) {
            int size = hVar.size();
            TreeSet treeSet = null;
            for (int i11 = 0; i11 < size; i11++) {
                if (f0.c2("Vary", hVar.h(i11), true)) {
                    String o11 = hVar.o(i11);
                    if (treeSet == null) {
                        treeSet = new TreeSet(f0.i2(w0.f67050a));
                    }
                    Iterator it = k0.n5(o11, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(k0.b6((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? w1.k() : treeSet;
        }

        public final h e(h hVar, h hVar2) {
            Set<String> d11 = d(hVar2);
            if (d11.isEmpty()) {
                return u50.f.f91847b;
            }
            h.a aVar = new h.a();
            int size = hVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String h11 = hVar.h(i11);
                if (d11.contains(h11)) {
                    aVar.b(h11, hVar.o(i11));
                }
            }
            return aVar.i();
        }

        @m80.k
        public final h f(@m80.k n nVar) {
            g0.p(nVar, "<this>");
            n s02 = nVar.s0();
            g0.m(s02);
            return e(s02.A0().k(), nVar.k0());
        }

        public final boolean g(@m80.k n cachedResponse, @m80.k h cachedRequest, @m80.k l newRequest) {
            g0.p(cachedResponse, "cachedResponse");
            g0.p(cachedRequest, "cachedRequest");
            g0.p(newRequest, "newRequest");
            Set<String> d11 = d(cachedResponse.k0());
            if ((d11 instanceof Collection) && d11.isEmpty()) {
                return true;
            }
            for (String str : d11) {
                if (!g0.g(cachedRequest.p(str), newRequest.j(str))) {
                    return false;
                }
            }
            return true;
        }

        public C0946b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d implements w50.b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final d.b f77146a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final e1 f77147b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final e1 f77148c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f77149d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f77150e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends l60.v {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f77151b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f77152c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar, e1 e1Var) {
                super(e1Var);
                this.f77151b = bVar;
                this.f77152c = dVar;
            }

            @Override // l60.v, l60.e1, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                b bVar = this.f77151b;
                d dVar = this.f77152c;
                synchronized (bVar) {
                    if (dVar.c()) {
                        return;
                    }
                    dVar.d(true);
                    bVar.a0(bVar.w() + 1);
                    super.close();
                    this.f77152c.f77146a.b();
                }
            }
        }

        public d(@m80.k b bVar, d.b editor) {
            g0.p(editor, "editor");
            this.f77150e = bVar;
            this.f77146a = editor;
            e1 f11 = editor.f(1);
            this.f77147b = f11;
            this.f77148c = new a(bVar, this, f11);
        }

        @Override // w50.b
        @m80.k
        public e1 a() {
            return this.f77148c;
        }

        @Override // w50.b
        public void abort() {
            b bVar = this.f77150e;
            synchronized (bVar) {
                if (this.f77149d) {
                    return;
                }
                this.f77149d = true;
                bVar.Z(bVar.r() + 1);
                u50.f.o(this.f77147b);
                try {
                    this.f77146a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean c() {
            return this.f77149d;
        }

        public final void d(boolean z11) {
            this.f77149d = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"})
    public static final class e implements Iterator<String>, y00.d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Iterator<d.C1282d> f77153a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f77154b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f77155c;

        public e(b bVar) {
            this.f77153a = bVar.q().A0();
        }

        @Override // java.util.Iterator
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f77154b;
            g0.m(str);
            this.f77154b = null;
            this.f77155c = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f77154b != null) {
                return true;
            }
            this.f77155c = false;
            while (this.f77153a.hasNext()) {
                try {
                    d.C1282d next = this.f77153a.next();
                    try {
                        continue;
                        this.f77154b = r0.e(next.e(0)).L5();
                        r00.b.a(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th2) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f77155c) {
                throw new IllegalStateException("remove() before next()");
            }
            this.f77153a.remove();
        }
    }

    public b(@m80.k File directory, long j11, @m80.k d60.a fileSystem) {
        g0.p(directory, "directory");
        g0.p(fileSystem, "fileSystem");
        this.f77122a = new w50.d(fileSystem, directory, f77118h, 2, j11, y50.d.f99391i);
    }

    @w00.o
    @m80.k
    public static final String H(@m80.k i iVar) {
        return f77117g.b(iVar);
    }

    public final synchronized int C() {
        return this.f77126e;
    }

    public final void E() throws IOException {
        this.f77122a.f0();
    }

    public final long I() {
        return this.f77122a.c0();
    }

    public final synchronized int L() {
        return this.f77125d;
    }

    @m80.l
    public final w50.b S(@m80.k n response) {
        d.b bVar;
        g0.p(response, "response");
        String m11 = response.A0().m();
        if (a60.f.f2007a.a(response.A0().m())) {
            try {
                U(response.A0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!g0.g(m11, "GET")) {
            return null;
        }
        C0946b c0946b = f77117g;
        if (c0946b.a(response)) {
            return null;
        }
        c cVar = new c(response);
        try {
            bVar = w50.d.I(this.f77122a, c0946b.b(response.A0().q()), 0L, 2, null);
            if (bVar == null) {
                return null;
            }
            try {
                cVar.f(bVar);
                return new d(this, bVar);
            } catch (IOException unused2) {
                c(bVar);
                return null;
            }
        } catch (IOException unused3) {
            bVar = null;
        }
    }

    public final void U(@m80.k l request) throws IOException {
        g0.p(request, "request");
        this.f77122a.v0(f77117g.b(request.q()));
    }

    public final synchronized int V() {
        return this.f77127f;
    }

    public final void Z(int i11) {
        this.f77124c = i11;
    }

    @w00.j(name = "-deprecated_directory")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = j.a.f47542a, imports = {}))
    @m80.k
    public final File a() {
        return this.f77122a.V();
    }

    public final void a0(int i11) {
        this.f77123b = i11;
    }

    public final void c(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final synchronized void c0() {
        this.f77126e++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f77122a.close();
    }

    public final synchronized void d0(@m80.k w50.c cacheStrategy) {
        try {
            g0.p(cacheStrategy, "cacheStrategy");
            this.f77127f++;
            if (cacheStrategy.b() != null) {
                this.f77125d++;
            } else if (cacheStrategy.a() != null) {
                this.f77126e++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e() throws IOException {
        this.f77122a.C();
    }

    @w00.j(name = j.a.f47542a)
    @m80.k
    public final File f() {
        return this.f77122a.V();
    }

    public final void f0(@m80.k n cached, @m80.k n network) {
        d.b bVar;
        g0.p(cached, "cached");
        g0.p(network, "network");
        c cVar = new c(network);
        o L = cached.L();
        g0.n(L, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVar = ((a) L).a0().a();
            if (bVar == null) {
                return;
            }
            try {
                cVar.f(bVar);
                bVar.b();
            } catch (IOException unused) {
                c(bVar);
            }
        } catch (IOException unused2) {
            bVar = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f77122a.flush();
    }

    @m80.k
    public final Iterator<String> h0() throws IOException {
        return new e(this);
    }

    public final synchronized int i0() {
        return this.f77124c;
    }

    public final boolean isClosed() {
        return this.f77122a.isClosed();
    }

    public final void j() throws IOException {
        this.f77122a.L();
    }

    @m80.l
    public final n k(@m80.k l request) {
        g0.p(request, "request");
        try {
            d.C1282d S = this.f77122a.S(f77117g.b(request.q()));
            if (S == null) {
                return null;
            }
            try {
                c cVar = new c(S.e(0));
                n d11 = cVar.d(S);
                if (cVar.b(request, d11)) {
                    return d11;
                }
                o L = d11.L();
                if (L != null) {
                    u50.f.o(L);
                }
                return null;
            } catch (IOException unused) {
                u50.f.o(S);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final synchronized int k0() {
        return this.f77123b;
    }

    @m80.k
    public final w50.d q() {
        return this.f77122a;
    }

    public final int r() {
        return this.f77124c;
    }

    public final long size() throws IOException {
        return this.f77122a.size();
    }

    public final int w() {
        return this.f77123b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@m80.k File directory, long j11) {
        this(directory, j11, d60.a.f47273b);
        g0.p(directory, "directory");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public static final a f77133k = new a(null);

        /* renamed from: l, reason: collision with root package name */
        @m80.k
        public static final String f77134l;

        /* renamed from: m, reason: collision with root package name */
        @m80.k
        public static final String f77135m;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final i f77136a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final h f77137b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f77138c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final Protocol f77139d;

        /* renamed from: e, reason: collision with root package name */
        public final int f77140e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f77141f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final h f77142g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public final g f77143h;

        /* renamed from: i, reason: collision with root package name */
        public final long f77144i;

        /* renamed from: j, reason: collision with root package name */
        public final long f77145j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            public a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            j.a aVar = e60.j.f49490a;
            sb2.append(aVar.g().i());
            sb2.append("-Sent-Millis");
            f77134l = sb2.toString();
            f77135m = aVar.g().i() + "-Received-Millis";
        }

        public c(@m80.k g1 rawSource) throws IOException {
            g0.p(rawSource, "rawSource");
            try {
                l60.m e11 = r0.e(rawSource);
                String L5 = e11.L5();
                i l11 = i.f77284k.l(L5);
                if (l11 == null) {
                    IOException iOException = new IOException("Cache corruption for " + L5);
                    e60.j.f49490a.g().m("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f77136a = l11;
                this.f77138c = e11.L5();
                h.a aVar = new h.a();
                int c11 = b.f77117g.c(e11);
                for (int i11 = 0; i11 < c11; i11++) {
                    aVar.f(e11.L5());
                }
                this.f77137b = aVar.i();
                a60.k b11 = a60.k.f2024d.b(e11.L5());
                this.f77139d = b11.f2029a;
                this.f77140e = b11.f2030b;
                this.f77141f = b11.f2031c;
                h.a aVar2 = new h.a();
                int c12 = b.f77117g.c(e11);
                for (int i12 = 0; i12 < c12; i12++) {
                    aVar2.f(e11.L5());
                }
                String str = f77134l;
                String j11 = aVar2.j(str);
                String str2 = f77135m;
                String j12 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.f77144i = j11 != null ? Long.parseLong(j11) : 0L;
                this.f77145j = j12 != null ? Long.parseLong(j12) : 0L;
                this.f77142g = aVar2.i();
                if (a()) {
                    String L52 = e11.L5();
                    if (L52.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + L52 + '\"');
                    }
                    this.f77143h = g.f77273e.c(!e11.J() ? TlsVersion.Companion.a(e11.L5()) : TlsVersion.SSL_3_0, okhttp3.d.f77182b.b(e11.L5()), c(e11), c(e11));
                } else {
                    this.f77143h = null;
                }
                g2 g2Var = g2.f100423a;
                r00.b.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    r00.b.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        public final boolean a() {
            return g0.g(this.f77136a.X(), "https");
        }

        public final boolean b(@m80.k l request, @m80.k n response) {
            g0.p(request, "request");
            g0.p(response, "response");
            return g0.g(this.f77136a, request.q()) && g0.g(this.f77138c, request.m()) && b.f77117g.g(response, this.f77137b, request);
        }

        public final List<Certificate> c(l60.m mVar) throws IOException {
            int c11 = b.f77117g.c(mVar);
            if (c11 == -1) {
                return h0.J();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c11);
                for (int i11 = 0; i11 < c11; i11++) {
                    String L5 = mVar.L5();
                    l60.k kVar = new l60.k();
                    ByteString h11 = ByteString.Companion.h(L5);
                    if (h11 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    kVar.X3(h11);
                    arrayList.add(certificateFactory.generateCertificate(kVar.R8()));
                }
                return arrayList;
            } catch (CertificateException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        @m80.k
        public final n d(@m80.k d.C1282d snapshot) {
            g0.p(snapshot, "snapshot");
            String d11 = this.f77142g.d("Content-Type");
            String d12 = this.f77142g.d("Content-Length");
            return new n.a().E(new l.a().D(this.f77136a).p(this.f77138c, null).o(this.f77137b).b()).B(this.f77139d).g(this.f77140e).y(this.f77141f).w(this.f77142g).b(new a(snapshot, d11, d12)).u(this.f77143h).F(this.f77144i).C(this.f77145j).c();
        }

        public final void e(l60.l lVar, List<? extends Certificate> list) throws IOException {
            try {
                lVar.Q1(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    ByteString.a aVar = ByteString.Companion;
                    g0.o(bytes, "bytes");
                    lVar.n5(ByteString.a.p(aVar, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e11) {
                throw new IOException(e11.getMessage());
            }
        }

        public final void f(@m80.k d.b editor) throws IOException {
            g0.p(editor, "editor");
            l60.l d11 = r0.d(editor.f(0));
            try {
                d11.n5(this.f77136a.toString()).writeByte(10);
                d11.n5(this.f77138c).writeByte(10);
                d11.Q1(this.f77137b.size()).writeByte(10);
                int size = this.f77137b.size();
                for (int i11 = 0; i11 < size; i11++) {
                    d11.n5(this.f77137b.h(i11)).n5(": ").n5(this.f77137b.o(i11)).writeByte(10);
                }
                d11.n5(new a60.k(this.f77139d, this.f77140e, this.f77141f).toString()).writeByte(10);
                d11.Q1(this.f77142g.size() + 2).writeByte(10);
                int size2 = this.f77142g.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    d11.n5(this.f77142g.h(i12)).n5(": ").n5(this.f77142g.o(i12)).writeByte(10);
                }
                d11.n5(f77134l).n5(": ").Q1(this.f77144i).writeByte(10);
                d11.n5(f77135m).n5(": ").Q1(this.f77145j).writeByte(10);
                if (a()) {
                    d11.writeByte(10);
                    g gVar = this.f77143h;
                    g0.m(gVar);
                    d11.n5(gVar.g().e()).writeByte(10);
                    e(d11, this.f77143h.m());
                    e(d11, this.f77143h.k());
                    d11.n5(this.f77143h.o().javaName()).writeByte(10);
                }
                g2 g2Var = g2.f100423a;
                r00.b.a(d11, null);
            } finally {
            }
        }

        public c(@m80.k n response) {
            g0.p(response, "response");
            this.f77136a = response.A0().q();
            this.f77137b = b.f77117g.f(response);
            this.f77138c = response.A0().m();
            this.f77139d = response.y0();
            this.f77140e = response.Z();
            this.f77141f = response.o0();
            this.f77142g = response.k0();
            this.f77143h = response.c0();
            this.f77144i = response.C0();
            this.f77145j = response.z0();
        }
    }
}
