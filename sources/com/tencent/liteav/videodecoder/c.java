package com.tencent.liteav.videodecoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class c {

    /* renamed from: b, reason: collision with root package name */
    int f44248b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f44249c;

    /* renamed from: d, reason: collision with root package name */
    private int f44250d;

    /* renamed from: e, reason: collision with root package name */
    private int f44251e;

    /* renamed from: f, reason: collision with root package name */
    private final OutputStream f44252f;

    /* renamed from: h, reason: collision with root package name */
    private int f44254h;

    /* renamed from: a, reason: collision with root package name */
    protected a f44247a = new a(50);

    /* renamed from: g, reason: collision with root package name */
    private int[] f44253g = new int[8];

    public c(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f44249c = inputStream;
        this.f44252f = outputStream;
        this.f44250d = inputStream.read();
        this.f44251e = inputStream.read();
    }

    private void a(String str, String str2) {
    }

    private void d() throws IOException {
        this.f44250d = this.f44251e;
        this.f44251e = this.f44249c.read();
        this.f44248b = 0;
    }

    private int e() throws IOException {
        int i11 = 0;
        while (b(true) == 0) {
            i11++;
        }
        if (i11 <= 0) {
            return 0;
        }
        return (int) (((1 << i11) - 1) + a(i11));
    }

    private void f() throws IOException {
        int i11 = 0;
        while (b(true) == 0) {
            i11++;
        }
        if (i11 > 0) {
            b(i11);
        }
    }

    private void g() throws IOException {
        int[] iArr = this.f44253g;
        this.f44252f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public int b(boolean z11) throws IOException {
        if (this.f44248b == 8) {
            d();
            if (this.f44250d == -1) {
                return -1;
            }
        }
        int i11 = this.f44250d;
        int i12 = this.f44248b;
        int i13 = (i11 >> (7 - i12)) & 1;
        this.f44248b = i12 + 1;
        if (z11 && this.f44252f != null) {
            d(i13);
        }
        return i13;
    }

    public int c(boolean z11) throws IOException {
        int i11 = 0;
        while (b(z11) == 0) {
            i11++;
        }
        if (i11 <= 0) {
            return 0;
        }
        return (int) (((1 << i11) - 1) + a(i11, z11));
    }

    public boolean a(boolean z11) throws IOException {
        return b(z11) == 1;
    }

    public long a(int i11, boolean z11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 1) | b(z11);
        }
        return j11;
    }

    public int c(String str) throws IOException {
        int e11 = e();
        int i11 = ((e11 >> 1) + (e11 & 1)) * ((r1 << 1) - 1);
        a(str, String.valueOf(i11));
        return i11;
    }

    public boolean e(String str) throws IOException {
        boolean a11 = a(false);
        a(str, a11 ? "1" : "0");
        return a11;
    }

    public boolean d(String str) throws IOException {
        boolean a11 = a(true);
        a(str, a11 ? "1" : "0");
        return a11;
    }

    public long a(int i11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 1) | b(true);
        }
        return j11;
    }

    public void c(int i11) throws IOException {
        int[] iArr = new int[i11];
        int i12 = 8;
        int i13 = 8;
        for (int i14 = 0; i14 < i11; i14++) {
            if (i12 != 0) {
                i12 = ((c("deltaScale") + i13) + 256) % 256;
            }
            if (i12 != 0) {
                i13 = i12;
            }
            iArr[i14] = i13;
        }
    }

    public void e(int i11) throws IOException {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= 15) {
                break;
            }
            int i15 = (1 << i13) + i14;
            if (i11 < i15) {
                i12 = i13;
                break;
            } else {
                i13++;
                i14 = i15;
            }
        }
        a(0L, i12);
        d(1);
        a(i11 - i14, i12);
    }

    public void d(int i11) throws IOException {
        if (this.f44254h == 8) {
            this.f44254h = 0;
            g();
        }
        int[] iArr = this.f44253g;
        int i12 = this.f44254h;
        this.f44254h = i12 + 1;
        iArr[i12] = i11;
    }

    public long a(int i11, String str) throws IOException {
        long a11 = a(i11);
        a(str, String.valueOf(a11));
        return a11;
    }

    public void b(int i11) throws IOException {
        if (i11 > 64) {
            throw new IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            b(true);
        }
    }

    public int a(String str) throws IOException {
        int e11 = e();
        a(str, String.valueOf(e11));
        return e11;
    }

    public void c(int i11, String str) throws IOException {
        e(i11);
    }

    public void b(int i11, String str) throws IOException {
        b(i11);
        a(str, "skip NBits");
    }

    public void c() throws IOException {
        d(1);
        b();
        a();
    }

    public void a() throws IOException {
        for (int i11 = this.f44254h; i11 < 8; i11++) {
            this.f44253g[i11] = 0;
        }
        this.f44254h = 0;
        g();
    }

    public void b(String str) throws IOException {
        f();
        a(str, "skip UE");
    }

    public void b() throws IOException {
        a(0L, 8 - this.f44254h);
    }

    public void a(long j11, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            d(((int) (j11 >> ((i11 - i12) - 1))) & 1);
        }
    }

    public void a(boolean z11, String str) throws IOException {
        d(z11 ? 1 : 0);
    }
}
