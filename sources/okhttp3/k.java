package okhttp3;

import androidx.media3.extractor.text.ttml.TtmlNode;
import ix.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kx.a0;
import okhttp3.h;
import okhttp3.j;
import okhttp3.m;
import okio.ByteString;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k extends m {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f77456g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final j f77457h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final j f77458i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final j f77459j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final j f77460k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final j f77461l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final byte[] f77462m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final byte[] f77463n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final byte[] f77464o;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ByteString f77465b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final j f77466c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<c> f77467d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j f77468e;

    /* renamed from: f, reason: collision with root package name */
    public long f77469f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ByteString f77470a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public j f77471b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<c> f77472c;

        /* JADX WARN: Multi-variable type inference failed */
        @w00.k
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @m80.k
        public final a a(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            d(c.f77473c.c(name, value));
            return this;
        }

        @m80.k
        public final a b(@m80.k String name, @m80.l String str, @m80.k m body) {
            g0.p(name, "name");
            g0.p(body, "body");
            d(c.f77473c.d(name, str, body));
            return this;
        }

        @m80.k
        public final a c(@m80.l h hVar, @m80.k m body) {
            g0.p(body, "body");
            d(c.f77473c.a(hVar, body));
            return this;
        }

        @m80.k
        public final a d(@m80.k c part) {
            g0.p(part, "part");
            this.f77472c.add(part);
            return this;
        }

        @m80.k
        public final a e(@m80.k m body) {
            g0.p(body, "body");
            d(c.f77473c.b(body));
            return this;
        }

        @m80.k
        public final k f() {
            if (this.f77472c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new k(this.f77470a, this.f77471b, u50.f.h0(this.f77472c));
        }

        @m80.k
        public final a g(@m80.k j type) {
            g0.p(type, "type");
            if (g0.g(type.l(), "multipart")) {
                this.f77471b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        @w00.k
        public a(@m80.k String boundary) {
            g0.p(boundary, "boundary");
            this.f77470a = ByteString.Companion.l(boundary);
            this.f77471b = k.f77457h;
            this.f77472c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.v r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.g0.o(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.k.a.<init>(java.lang.String, int, kotlin.jvm.internal.v):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public final void a(@m80.k StringBuilder sb2, @m80.k String key) {
            g0.p(sb2, "<this>");
            g0.p(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = key.charAt(i11);
                if (charAt == '\n') {
                    sb2.append("%0A");
                } else if (charAt == '\r') {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
            }
            sb2.append('\"');
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final a f77473c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final h f77474a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final m f77475b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            @w00.o
            @m80.k
            public final c a(@m80.l h hVar, @m80.k m body) {
                g0.p(body, "body");
                v vVar = null;
                if ((hVar != null ? hVar.d("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((hVar != null ? hVar.d("Content-Length") : null) == null) {
                    return new c(hVar, body, vVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            @w00.o
            @m80.k
            public final c b(@m80.k m body) {
                g0.p(body, "body");
                return a(null, body);
            }

            @w00.o
            @m80.k
            public final c c(@m80.k String name, @m80.k String value) {
                g0.p(name, "name");
                g0.p(value, "value");
                return d(name, null, m.a.o(m.f77487a, value, null, 1, null));
            }

            @w00.o
            @m80.k
            public final c d(@m80.k String name, @m80.l String str, @m80.k m body) {
                g0.p(name, "name");
                g0.p(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = k.f77456g;
                bVar.a(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str);
                }
                String sb3 = sb2.toString();
                g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
                return a(new h.a().h("Content-Disposition", sb3).i(), body);
            }

            public a() {
            }
        }

        public /* synthetic */ c(h hVar, m mVar, v vVar) {
            this(hVar, mVar);
        }

        @w00.o
        @m80.k
        public static final c d(@m80.l h hVar, @m80.k m mVar) {
            return f77473c.a(hVar, mVar);
        }

        @w00.o
        @m80.k
        public static final c e(@m80.k m mVar) {
            return f77473c.b(mVar);
        }

        @w00.o
        @m80.k
        public static final c f(@m80.k String str, @m80.k String str2) {
            return f77473c.c(str, str2);
        }

        @w00.o
        @m80.k
        public static final c g(@m80.k String str, @m80.l String str2, @m80.k m mVar) {
            return f77473c.d(str, str2, mVar);
        }

        @w00.j(name = "-deprecated_body")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = TtmlNode.TAG_BODY, imports = {}))
        @m80.k
        public final m a() {
            return this.f77475b;
        }

        @m80.l
        @w00.j(name = "-deprecated_headers")
        @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "headers", imports = {}))
        public final h b() {
            return this.f77474a;
        }

        @w00.j(name = TtmlNode.TAG_BODY)
        @m80.k
        public final m c() {
            return this.f77475b;
        }

        @m80.l
        @w00.j(name = "headers")
        public final h h() {
            return this.f77474a;
        }

        public c(h hVar, m mVar) {
            this.f77474a = hVar;
            this.f77475b = mVar;
        }
    }

    static {
        j.a aVar = j.f77447e;
        f77457h = aVar.c("multipart/mixed");
        f77458i = aVar.c("multipart/alternative");
        f77459j = aVar.c("multipart/digest");
        f77460k = aVar.c("multipart/parallel");
        f77461l = aVar.c("multipart/form-data");
        f77462m = new byte[]{58, 32};
        f77463n = new byte[]{13, 10};
        f77464o = new byte[]{a0.f68904b, a0.f68904b};
    }

    public k(@m80.k ByteString boundaryByteString, @m80.k j type, @m80.k List<c> parts) {
        g0.p(boundaryByteString, "boundaryByteString");
        g0.p(type, "type");
        g0.p(parts, "parts");
        this.f77465b = boundaryByteString;
        this.f77466c = type;
        this.f77467d = parts;
        this.f77468e = j.f77447e.c(type + "; boundary=" + w());
        this.f77469f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long B(l60.l lVar, boolean z11) throws IOException {
        l60.k kVar;
        if (z11) {
            lVar = new l60.k();
            kVar = lVar;
        } else {
            kVar = 0;
        }
        int size = this.f77467d.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f77467d.get(i11);
            h h11 = cVar.h();
            m c11 = cVar.c();
            g0.m(lVar);
            lVar.write(f77464o);
            lVar.X3(this.f77465b);
            lVar.write(f77463n);
            if (h11 != null) {
                int size2 = h11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    lVar.n5(h11.h(i12)).write(f77462m).n5(h11.o(i12)).write(f77463n);
                }
            }
            j b11 = c11.b();
            if (b11 != null) {
                lVar.n5("Content-Type: ").n5(b11.toString()).write(f77463n);
            }
            long a11 = c11.a();
            if (a11 != -1) {
                lVar.n5("Content-Length: ").Q1(a11).write(f77463n);
            } else if (z11) {
                g0.m(kVar);
                kVar.e();
                return -1L;
            }
            byte[] bArr = f77463n;
            lVar.write(bArr);
            if (z11) {
                j11 += a11;
            } else {
                c11.r(lVar);
            }
            lVar.write(bArr);
        }
        g0.m(lVar);
        byte[] bArr2 = f77464o;
        lVar.write(bArr2);
        lVar.X3(this.f77465b);
        lVar.write(bArr2);
        lVar.write(f77463n);
        if (!z11) {
            return j11;
        }
        g0.m(kVar);
        long size3 = j11 + kVar.size();
        kVar.e();
        return size3;
    }

    @w00.j(name = "type")
    @m80.k
    public final j A() {
        return this.f77466c;
    }

    @Override // okhttp3.m
    public long a() throws IOException {
        long j11 = this.f77469f;
        if (j11 != -1) {
            return j11;
        }
        long B = B(null, true);
        this.f77469f = B;
        return B;
    }

    @Override // okhttp3.m
    @m80.k
    public j b() {
        return this.f77468e;
    }

    @Override // okhttp3.m
    public void r(@m80.k l60.l sink) throws IOException {
        g0.p(sink, "sink");
        B(sink, false);
    }

    @w00.j(name = "-deprecated_boundary")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "boundary", imports = {}))
    @m80.k
    public final String s() {
        return w();
    }

    @w00.j(name = "-deprecated_parts")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "parts", imports = {}))
    @m80.k
    public final List<c> t() {
        return this.f77467d;
    }

    @w00.j(name = "-deprecated_size")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = g.b.f62794h, imports = {}))
    public final int u() {
        return z();
    }

    @w00.j(name = "-deprecated_type")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "type", imports = {}))
    @m80.k
    public final j v() {
        return this.f77466c;
    }

    @w00.j(name = "boundary")
    @m80.k
    public final String w() {
        return this.f77465b.utf8();
    }

    @m80.k
    public final c x(int i11) {
        return this.f77467d.get(i11);
    }

    @w00.j(name = "parts")
    @m80.k
    public final List<c> y() {
        return this.f77467d;
    }

    @w00.j(name = g.b.f62794h)
    public final int z() {
        return this.f77467d.size();
    }
}
