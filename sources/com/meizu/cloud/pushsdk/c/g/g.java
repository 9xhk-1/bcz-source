package com.meizu.cloud.pushsdk.c.g;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f39649a = Logger.getLogger(g.class.getName());

    private g() {
    }

    public static c a(l lVar) {
        if (lVar != null) {
            return new h(lVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static d a(m mVar) {
        if (mVar != null) {
            return new i(mVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static l a(OutputStream outputStream) {
        return a(outputStream, new n());
    }

    private static l a(final OutputStream outputStream, final n nVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (nVar != null) {
            return new l() { // from class: com.meizu.cloud.pushsdk.c.g.g.1
                @Override // com.meizu.cloud.pushsdk.c.g.l
                public void a(b bVar, long j11) throws IOException {
                    o.a(bVar.f39641b, 0L, j11);
                    while (j11 > 0) {
                        n.this.a();
                        j jVar = bVar.f39640a;
                        int min = (int) Math.min(j11, jVar.f39663c - jVar.f39662b);
                        outputStream.write(jVar.f39661a, jVar.f39662b, min);
                        int i11 = jVar.f39662b + min;
                        jVar.f39662b = i11;
                        long j12 = min;
                        j11 -= j12;
                        bVar.f39641b -= j12;
                        if (i11 == jVar.f39663c) {
                            bVar.f39640a = jVar.a();
                            k.a(jVar);
                        }
                    }
                }

                @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
                public void close() throws IOException {
                    outputStream.close();
                }

                @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
                public void flush() throws IOException {
                    outputStream.flush();
                }

                public String toString() {
                    return "sink(" + outputStream + pn.j.f81007d;
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static m a(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static m a(InputStream inputStream) {
        return a(inputStream, new n());
    }

    private static m a(final InputStream inputStream, final n nVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (nVar != null) {
            return new m() { // from class: com.meizu.cloud.pushsdk.c.g.g.2
                @Override // com.meizu.cloud.pushsdk.c.g.m
                public long b(b bVar, long j11) throws IOException {
                    if (j11 < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j11);
                    }
                    if (j11 == 0) {
                        return 0L;
                    }
                    n.this.a();
                    j c11 = bVar.c(1);
                    int read = inputStream.read(c11.f39661a, c11.f39663c, (int) Math.min(j11, 2048 - c11.f39663c));
                    if (read == -1) {
                        return -1L;
                    }
                    c11.f39663c += read;
                    long j12 = read;
                    bVar.f39641b += j12;
                    return j12;
                }

                @Override // com.meizu.cloud.pushsdk.c.g.m, java.lang.AutoCloseable
                public void close() throws IOException {
                    inputStream.close();
                }

                public String toString() {
                    return "source(" + inputStream + pn.j.f81007d;
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }
}
