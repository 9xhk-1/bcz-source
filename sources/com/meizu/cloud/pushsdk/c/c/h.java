package com.meizu.cloud.pushsdk.c.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kx.a0;

/* loaded from: classes7.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public static final g f39572a = g.a("multipart/mixed");

    /* renamed from: b, reason: collision with root package name */
    public static final g f39573b = g.a("multipart/alternative");

    /* renamed from: c, reason: collision with root package name */
    public static final g f39574c = g.a("multipart/digest");

    /* renamed from: d, reason: collision with root package name */
    public static final g f39575d = g.a("multipart/parallel");

    /* renamed from: e, reason: collision with root package name */
    public static final g f39576e = g.a("multipart/form-data");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f39577f = {58, 32};

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f39578g = {13, 10};

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f39579h = {a0.f68904b, a0.f68904b};

    /* renamed from: i, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.c.g.e f39580i;

    /* renamed from: j, reason: collision with root package name */
    private final g f39581j;

    /* renamed from: k, reason: collision with root package name */
    private final g f39582k;

    /* renamed from: l, reason: collision with root package name */
    private final List<b> f39583l;

    /* renamed from: m, reason: collision with root package name */
    private long f39584m = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.meizu.cloud.pushsdk.c.g.e f39585a;

        /* renamed from: b, reason: collision with root package name */
        private g f39586b;

        /* renamed from: c, reason: collision with root package name */
        private final List<b> f39587c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a a(c cVar, j jVar) {
            return a(b.a(cVar, jVar));
        }

        public a(String str) {
            this.f39586b = h.f39572a;
            this.f39587c = new ArrayList();
            this.f39585a = com.meizu.cloud.pushsdk.c.g.e.a(str);
        }

        public a a(g gVar) {
            if (gVar == null) {
                throw new NullPointerException("type == null");
            }
            if ("multipart".equals(gVar.a())) {
                this.f39586b = gVar;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + gVar);
        }

        public a a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.f39587c.add(bVar);
            return this;
        }

        public h a() {
            if (this.f39587c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new h(this.f39585a, this.f39586b, this.f39587c);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f39588a;

        /* renamed from: b, reason: collision with root package name */
        private final j f39589b;

        private b(c cVar, j jVar) {
            this.f39588a = cVar;
            this.f39589b = jVar;
        }

        public static b a(c cVar, j jVar) {
            if (jVar == null) {
                throw new NullPointerException("body == null");
            }
            if (cVar != null && cVar.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (cVar == null || cVar.a("Content-Length") == null) {
                return new b(cVar, jVar);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    public h(com.meizu.cloud.pushsdk.c.g.e eVar, g gVar, List<b> list) {
        this.f39580i = eVar;
        this.f39581j = gVar;
        this.f39582k = g.a(gVar + "; boundary=" + eVar.a());
        this.f39583l = m.a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long a(com.meizu.cloud.pushsdk.c.g.c cVar, boolean z11) throws IOException {
        com.meizu.cloud.pushsdk.c.g.b bVar;
        if (z11) {
            cVar = new com.meizu.cloud.pushsdk.c.g.b();
            bVar = cVar;
        } else {
            bVar = 0;
        }
        int size = this.f39583l.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            b bVar2 = this.f39583l.get(i11);
            c cVar2 = bVar2.f39588a;
            j jVar = bVar2.f39589b;
            cVar.c(f39579h);
            cVar.b(this.f39580i);
            cVar.c(f39578g);
            if (cVar2 != null) {
                int a11 = cVar2.a();
                for (int i12 = 0; i12 < a11; i12++) {
                    cVar.b(cVar2.a(i12)).c(f39577f).b(cVar2.b(i12)).c(f39578g);
                }
            }
            g a12 = jVar.a();
            if (a12 != null) {
                cVar.b("Content-Type: ").b(a12.toString()).c(f39578g);
            }
            long b11 = jVar.b();
            if (b11 != -1) {
                cVar.b("Content-Length: ").e(b11).c(f39578g);
            } else if (z11) {
                bVar.j();
                return -1L;
            }
            byte[] bArr = f39578g;
            cVar.c(bArr);
            if (z11) {
                j11 += b11;
            } else {
                jVar.a(cVar);
            }
            cVar.c(bArr);
        }
        byte[] bArr2 = f39579h;
        cVar.c(bArr2);
        cVar.b(this.f39580i);
        cVar.c(bArr2);
        cVar.c(f39578g);
        if (!z11) {
            return j11;
        }
        long a13 = j11 + bVar.a();
        bVar.j();
        return a13;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public long b() throws IOException {
        long j11 = this.f39584m;
        if (j11 != -1) {
            return j11;
        }
        long a11 = a((com.meizu.cloud.pushsdk.c.g.c) null, true);
        this.f39584m = a11;
        return a11;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public g a() {
        return this.f39582k;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException {
        a(cVar, false);
    }
}
