package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f45328a;

    /* renamed from: a, reason: collision with other field name */
    private final OutputStream f189a;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f190a;

    /* renamed from: b, reason: collision with root package name */
    private int f45329b;

    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f189a = outputStream;
        this.f190a = bArr;
        this.f45329b = 0;
        this.f45328a = bArr.length;
    }

    public static int b(int i11) {
        return d(i11);
    }

    public static int c(int i11) {
        return d(f.a(i11, 0));
    }

    public static int d(int i11) {
        if ((i11 & com.alipay.sdk.m.n.a.f10855g) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public int a() {
        if (this.f189a == null) {
            return this.f45328a - this.f45329b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    private c(byte[] bArr, int i11, int i12) {
        this.f189a = null;
        this.f190a = bArr;
        this.f45329b = i11;
        this.f45328a = i11 + i12;
    }

    public static int a(int i11) {
        if (i11 >= 0) {
            return d(i11);
        }
        return 10;
    }

    public static int b(int i11, int i12) {
        return c(i11) + b(i12);
    }

    public static int c(long j11) {
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (((-16384) & j11) == 0) {
            return 2;
        }
        if ((CoroutineScheduler.f68464x & j11) == 0) {
            return 3;
        }
        if (((-268435456) & j11) == 0) {
            return 4;
        }
        if (((-34359738368L) & j11) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j11) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j11) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j11) == 0) {
            return 8;
        }
        return (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m5788d(int i11) {
        while ((i11 & com.alipay.sdk.m.n.a.f10855g) != 0) {
            m5786c((i11 & 127) | 128);
            i11 >>>= 7;
        }
        m5786c(i11);
    }

    public static int a(int i11, int i12) {
        return c(i11) + a(i12);
    }

    public static int b(int i11, long j11) {
        return c(i11) + b(j11);
    }

    private void c() {
        OutputStream outputStream = this.f189a;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f190a, 0, this.f45329b);
        this.f45329b = 0;
    }

    public static int a(int i11, long j11) {
        return c(i11) + a(j11);
    }

    public static int b(long j11) {
        return c(j11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m5786c(int i11) {
        a((byte) i11);
    }

    public static int a(int i11, com.xiaomi.push.a aVar) {
        return c(i11) + a(aVar);
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void c(int i11, int i12) {
        m5788d(f.a(i11, i12));
    }

    public static int a(int i11, e eVar) {
        return c(i11) + a(eVar);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5782b(int i11) {
        m5788d(i11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m5787c(long j11) {
        while (((-128) & j11) != 0) {
            m5786c((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        m5786c((int) j11);
    }

    public static int a(int i11, String str) {
        return c(i11) + a(str);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5783b(int i11, int i12) {
        c(i11, 0);
        m5782b(i12);
    }

    public static int a(int i11, boolean z11) {
        return c(i11) + a(z11);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5784b(int i11, long j11) {
        c(i11, 0);
        m5785b(j11);
    }

    public static int a(long j11) {
        return c(j11);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5785b(long j11) {
        m5787c(j11);
    }

    public static int a(com.xiaomi.push.a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int a(e eVar) {
        int b11 = eVar.b();
        return d(b11) + b11;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(boolean z11) {
        return 1;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i11) {
        return new c(outputStream, new byte[i11]);
    }

    public static c a(byte[] bArr, int i11, int i12) {
        return new c(bArr, i11, i12);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5768a() {
        if (this.f189a != null) {
            c();
        }
    }

    public void a(byte b11) {
        if (this.f45329b == this.f45328a) {
            c();
        }
        byte[] bArr = this.f190a;
        int i11 = this.f45329b;
        this.f45329b = i11 + 1;
        bArr[i11] = b11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5769a(int i11) {
        if (i11 >= 0) {
            m5788d(i11);
        } else {
            m5787c(i11);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5770a(int i11, int i12) {
        c(i11, 0);
        m5769a(i12);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5771a(int i11, long j11) {
        c(i11, 0);
        m5776a(j11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5772a(int i11, com.xiaomi.push.a aVar) {
        c(i11, 2);
        m5777a(aVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5773a(int i11, e eVar) {
        c(i11, 2);
        m5778a(eVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5774a(int i11, String str) {
        c(i11, 2);
        m5779a(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5775a(int i11, boolean z11) {
        c(i11, 0);
        m5780a(z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5776a(long j11) {
        m5787c(j11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5777a(com.xiaomi.push.a aVar) {
        byte[] m5712a = aVar.m5712a();
        m5788d(m5712a.length);
        a(m5712a);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5778a(e eVar) {
        m5788d(eVar.a());
        eVar.a(this);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5779a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m5788d(bytes.length);
        a(bytes);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5780a(boolean z11) {
        m5786c(z11 ? 1 : 0);
    }

    public void a(byte[] bArr) {
        m5781a(bArr, 0, bArr.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5781a(byte[] bArr, int i11, int i12) {
        int i13 = this.f45328a;
        int i14 = this.f45329b;
        if (i13 - i14 >= i12) {
            System.arraycopy(bArr, i11, this.f190a, i14, i12);
            this.f45329b += i12;
            return;
        }
        int i15 = i13 - i14;
        System.arraycopy(bArr, i11, this.f190a, i14, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f45329b = this.f45328a;
        c();
        if (i17 > this.f45328a) {
            this.f189a.write(bArr, i16, i17);
        } else {
            System.arraycopy(bArr, i16, this.f190a, 0, i17);
            this.f45329b = i17;
        }
    }
}
