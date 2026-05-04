package com.igexin.c.a.b;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f37134a;

    /* renamed from: b, reason: collision with root package name */
    private int f37135b;

    /* renamed from: c, reason: collision with root package name */
    private int f37136c;

    /* renamed from: d, reason: collision with root package name */
    private int f37137d;

    /* renamed from: e, reason: collision with root package name */
    private int f37138e;

    private b(OutputStream outputStream) {
        this(outputStream, 76);
    }

    public final void a() throws IOException {
        if (this.f37136c > 0) {
            int i11 = this.f37138e;
            if (i11 > 0 && this.f37137d == i11) {
                this.f37134a.write("\r\n".getBytes());
                this.f37137d = 0;
            }
            char charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f37135b << 8) >>> 26);
            char charAt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f37135b << 14) >>> 26);
            char charAt3 = this.f37136c < 2 ? '=' : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f37135b << 20) >>> 26);
            char charAt4 = this.f37136c >= 3 ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f37135b << 26) >>> 26) : '=';
            this.f37134a.write(charAt);
            this.f37134a.write(charAt2);
            this.f37134a.write(charAt3);
            this.f37134a.write(charAt4);
            this.f37137d += 4;
            this.f37136c = 0;
            this.f37135b = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a();
        this.f37134a.close();
    }

    @Override // java.io.OutputStream
    public final void write(int i11) throws IOException {
        int i12 = this.f37136c;
        this.f37135b = ((i11 & 255) << (16 - (i12 * 8))) | this.f37135b;
        int i13 = i12 + 1;
        this.f37136c = i13;
        if (i13 == 3) {
            a();
        }
    }

    public b(OutputStream outputStream, int i11) {
        this.f37135b = 0;
        this.f37136c = 0;
        this.f37137d = 0;
        this.f37134a = outputStream;
        this.f37138e = i11;
    }
}
