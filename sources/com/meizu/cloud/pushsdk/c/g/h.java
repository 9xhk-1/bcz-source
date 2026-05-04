package com.meizu.cloud.pushsdk.c.g;

import java.io.IOException;

/* loaded from: classes7.dex */
final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private final b f39654a;

    /* renamed from: b, reason: collision with root package name */
    private final l f39655b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39656c;

    public h(l lVar) {
        this(lVar, new b());
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public long a(m mVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j11 = 0;
        while (true) {
            long b11 = mVar.b(this.f39654a, 2048L);
            if (b11 == -1) {
                return j11;
            }
            j11 += b11;
            a();
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public b b() {
        return this.f39654a;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public c c(byte[] bArr) throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        this.f39654a.c(bArr);
        return a();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
    public void close() {
        if (this.f39656c) {
            return;
        }
        try {
            b bVar = this.f39654a;
            long j11 = bVar.f39641b;
            if (j11 > 0) {
                this.f39655b.a(bVar, j11);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f39655b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f39656c = true;
        if (th != null) {
            o.a(th);
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public c e(long j11) throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        this.f39654a.e(j11);
        return a();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
    public void flush() throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        b bVar = this.f39654a;
        long j11 = bVar.f39641b;
        if (j11 > 0) {
            this.f39655b.a(bVar, j11);
        }
        this.f39655b.flush();
    }

    public String toString() {
        return "buffer(" + this.f39655b + pn.j.f81007d;
    }

    public h(l lVar, b bVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.f39654a = bVar;
        this.f39655b = lVar;
    }

    public c a() throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        long e11 = this.f39654a.e();
        if (e11 > 0) {
            this.f39655b.a(this.f39654a, e11);
        }
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public c b(e eVar) throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        this.f39654a.b(eVar);
        return a();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public c c(byte[] bArr, int i11, int i12) throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        this.f39654a.c(bArr, i11, i12);
        return a();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l
    public void a(b bVar, long j11) throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        this.f39654a.a(bVar, j11);
        a();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public c b(String str) throws IOException {
        if (this.f39656c) {
            throw new IllegalStateException("closed");
        }
        this.f39654a.b(str);
        return a();
    }
}
