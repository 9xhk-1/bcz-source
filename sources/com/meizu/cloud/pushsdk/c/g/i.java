package com.meizu.cloud.pushsdk.c.g;

import androidx.annotation.NonNull;
import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    private final b f39657a;

    /* renamed from: b, reason: collision with root package name */
    private final m f39658b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39659c;

    public i(m mVar) {
        this(mVar, new b());
    }

    @Override // com.meizu.cloud.pushsdk.c.g.m
    public long b(b bVar, long j11) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j11);
        }
        if (this.f39659c) {
            throw new IllegalStateException("closed");
        }
        b bVar2 = this.f39657a;
        if (bVar2.f39641b == 0 && this.f39658b.b(bVar2, 2048L) == -1) {
            return -1L;
        }
        return this.f39657a.b(bVar, Math.min(j11, this.f39657a.f39641b));
    }

    @Override // com.meizu.cloud.pushsdk.c.g.m, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f39659c) {
            return;
        }
        this.f39659c = true;
        this.f39658b.close();
        this.f39657a.j();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public InputStream d() {
        return new InputStream() { // from class: com.meizu.cloud.pushsdk.c.g.i.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                if (i.this.f39659c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(i.this.f39657a.f39641b, SieveCacheKt.NodeLinkMask);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                i.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (i.this.f39659c) {
                    throw new IOException("closed");
                }
                if (i.this.f39657a.f39641b == 0 && i.this.f39658b.b(i.this.f39657a, 2048L) == -1) {
                    return -1;
                }
                return i.this.f39657a.f() & 255;
            }

            public String toString() {
                return i.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
                if (i.this.f39659c) {
                    throw new IOException("closed");
                }
                o.a(bArr.length, i11, i12);
                if (i.this.f39657a.f39641b == 0 && i.this.f39658b.b(i.this.f39657a, 2048L) == -1) {
                    return -1;
                }
                return i.this.f39657a.a(bArr, i11, i12);
            }
        };
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public String h() throws IOException {
        this.f39657a.a(this.f39658b);
        return this.f39657a.h();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public byte[] i() throws IOException {
        this.f39657a.a(this.f39658b);
        return this.f39657a.i();
    }

    public String toString() {
        return "buffer(" + this.f39658b + pn.j.f81007d;
    }

    public i(m mVar, b bVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f39657a = bVar;
        this.f39658b = mVar;
    }
}
