package t50;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.framework.network.http.HttpRequest;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.g1;
import l60.i1;
import l60.r0;
import l60.v0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
/* loaded from: classes8.dex */
public final class o implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final a f89634i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final v0 f89635j;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l60.m f89636a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f89637b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ByteString f89638c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ByteString f89639d;

    /* renamed from: e, reason: collision with root package name */
    public int f89640e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f89641f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f89642g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public c f89643h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final v0 a() {
            return o.f89635j;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final okhttp3.h f89644a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final l60.m f89645b;

        public b(@m80.k okhttp3.h headers, @m80.k l60.m body) {
            g0.p(headers, "headers");
            g0.p(body, "body");
            this.f89644a = headers;
            this.f89645b = body;
        }

        @w00.j(name = TtmlNode.TAG_BODY)
        @m80.k
        public final l60.m a() {
            return this.f89645b;
        }

        @w00.j(name = "headers")
        @m80.k
        public final okhttp3.h c() {
            return this.f89644a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f89645b.close();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,210:1\n1#2:211\n268#3,26:212\n*S KotlinDebug\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader$PartSource\n*L\n159#1:212,26\n*E\n"})
    public final class c implements g1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final i1 f89646a = new i1();

        public c() {
        }

        @Override // l60.g1
        @m80.k
        public i1 D() {
            return this.f89646a;
        }

        @Override // l60.g1
        public long L3(@m80.k l60.k sink, long j11) {
            long j12;
            g0.p(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
            }
            if (!g0.g(o.this.f89643h, this)) {
                throw new IllegalStateException("closed");
            }
            i1 D = o.this.f89636a.D();
            i1 i1Var = this.f89646a;
            o oVar = o.this;
            long l11 = D.l();
            long a11 = i1.f70437e.a(i1Var.l(), D.l());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            D.k(a11, timeUnit);
            if (!D.h()) {
                if (i1Var.h()) {
                    D.g(i1Var.f());
                }
                try {
                    long k11 = oVar.k(j11);
                    long L3 = k11 == 0 ? -1L : oVar.f89636a.L3(sink, k11);
                    D.k(l11, timeUnit);
                    if (i1Var.h()) {
                        D.c();
                    }
                    return L3;
                } catch (Throwable th2) {
                    D.k(l11, TimeUnit.NANOSECONDS);
                    if (i1Var.h()) {
                        D.c();
                    }
                    throw th2;
                }
            }
            long f11 = D.f();
            if (i1Var.h()) {
                j12 = 0;
                D.g(Math.min(D.f(), i1Var.f()));
            } else {
                j12 = 0;
            }
            try {
                long k12 = oVar.k(j11);
                long L32 = k12 == j12 ? -1L : oVar.f89636a.L3(sink, k12);
                D.k(l11, timeUnit);
                if (i1Var.h()) {
                    D.g(f11);
                }
                return L32;
            } catch (Throwable th3) {
                D.k(l11, TimeUnit.NANOSECONDS);
                if (i1Var.h()) {
                    D.g(f11);
                }
                throw th3;
            }
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (g0.g(o.this.f89643h, this)) {
                o.this.f89643h = null;
            }
        }
    }

    static {
        v0.a aVar = v0.f70499c;
        ByteString.a aVar2 = ByteString.Companion;
        f89635j = aVar.d(aVar2.l("\r\n"), aVar2.l(HttpRequest.f17578o), aVar2.l(" "), aVar2.l("\t"));
    }

    public o(@m80.k l60.m source, @m80.k String boundary) throws IOException {
        g0.p(source, "source");
        g0.p(boundary, "boundary");
        this.f89636a = source;
        this.f89637b = boundary;
        this.f89638c = new l60.k().n5(HttpRequest.f17578o).n5(boundary).q3();
        this.f89639d = new l60.k().n5("\r\n--").n5(boundary).q3();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f89641f) {
            return;
        }
        this.f89641f = true;
        this.f89643h = null;
        this.f89636a.close();
    }

    @w00.j(name = "boundary")
    @m80.k
    public final String j() {
        return this.f89637b;
    }

    public final long k(long j11) {
        this.f89636a.F(this.f89639d.size());
        long b02 = this.f89636a.getBuffer().b0(this.f89639d);
        return b02 == -1 ? Math.min(j11, (this.f89636a.getBuffer().size() - this.f89639d.size()) + 1) : Math.min(j11, b02);
    }

    @m80.l
    public final b q() throws IOException {
        if (this.f89641f) {
            throw new IllegalStateException("closed");
        }
        if (this.f89642g) {
            return null;
        }
        if (this.f89640e == 0 && this.f89636a.J0(0L, this.f89638c)) {
            this.f89636a.skip(this.f89638c.size());
        } else {
            while (true) {
                long k11 = k(8192L);
                if (k11 == 0) {
                    break;
                }
                this.f89636a.skip(k11);
            }
            this.f89636a.skip(this.f89639d.size());
        }
        boolean z11 = false;
        while (true) {
            int X2 = this.f89636a.X2(f89635j);
            if (X2 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (X2 == 0) {
                this.f89640e++;
                okhttp3.h b11 = new b60.a(this.f89636a).b();
                c cVar = new c();
                this.f89643h = cVar;
                return new b(b11, r0.e(cVar));
            }
            if (X2 == 1) {
                if (z11) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f89640e == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.f89642g = true;
                return null;
            }
            if (X2 == 2 || X2 == 3) {
                z11 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(@m80.k okhttp3.o r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.g0.p(r3, r0)
            l60.m r0 = r3.V()
            okhttp3.j r3 = r3.r()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.i(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t50.o.<init>(okhttp3.o):void");
    }
}
