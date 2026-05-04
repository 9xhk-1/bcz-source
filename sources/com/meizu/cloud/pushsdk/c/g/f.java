package com.meizu.cloud.pushsdk.c.g;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class f implements l {

    /* renamed from: a, reason: collision with root package name */
    private final l f39648a;

    public f(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f39648a = lVar;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l
    public void a(b bVar, long j11) throws IOException {
        this.f39648a.a(bVar, j11);
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
    public void close() throws IOException {
        this.f39648a.close();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
    public void flush() throws IOException {
        this.f39648a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + pn.j.f81006c + this.f39648a.toString() + pn.j.f81007d;
    }
}
