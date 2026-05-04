package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f45280a;

    /* renamed from: a, reason: collision with other field name */
    private final InputStream f161a;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f162a;

    /* renamed from: b, reason: collision with root package name */
    private int f45281b;

    /* renamed from: c, reason: collision with root package name */
    private int f45282c;

    /* renamed from: d, reason: collision with root package name */
    private int f45283d;

    /* renamed from: e, reason: collision with root package name */
    private int f45284e;

    /* renamed from: f, reason: collision with root package name */
    private int f45285f;

    /* renamed from: g, reason: collision with root package name */
    private int f45286g;

    /* renamed from: h, reason: collision with root package name */
    private int f45287h;

    /* renamed from: i, reason: collision with root package name */
    private int f45288i;

    private b(InputStream inputStream) {
        this.f45285f = Integer.MAX_VALUE;
        this.f45287h = 64;
        this.f45288i = 67108864;
        this.f162a = new byte[4096];
        this.f45280a = 0;
        this.f45282c = 0;
        this.f161a = inputStream;
    }

    public byte a() {
        if (this.f45282c == this.f45280a) {
            a(true);
        }
        byte[] bArr = this.f162a;
        int i11 = this.f45282c;
        this.f45282c = i11 + 1;
        return bArr[i11];
    }

    /* renamed from: b, reason: collision with other method in class */
    public int m5736b() {
        return d();
    }

    public int c() {
        return d();
    }

    public int d() {
        int i11;
        byte a11 = a();
        if (a11 >= 0) {
            return a11;
        }
        int i12 = a11 & Byte.MAX_VALUE;
        byte a12 = a();
        if (a12 >= 0) {
            i11 = a12 << 7;
        } else {
            i12 |= (a12 & Byte.MAX_VALUE) << 7;
            byte a13 = a();
            if (a13 >= 0) {
                i11 = a13 << 14;
            } else {
                i12 |= (a13 & Byte.MAX_VALUE) << 14;
                byte a14 = a();
                if (a14 < 0) {
                    int i13 = i12 | ((a14 & Byte.MAX_VALUE) << 21);
                    byte a15 = a();
                    int i14 = i13 | (a15 << 28);
                    if (a15 < 0) {
                        for (int i15 = 0; i15 < 5; i15++) {
                            if (a() < 0) {
                            }
                        }
                        throw d.c();
                    }
                    return i14;
                }
                i11 = a14 << ho.c.f59560y;
            }
        }
        return i12 | i11;
    }

    public int e() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    private b(byte[] bArr, int i11, int i12) {
        this.f45285f = Integer.MAX_VALUE;
        this.f45287h = 64;
        this.f45288i = 67108864;
        this.f162a = bArr;
        this.f45280a = i12 + i11;
        this.f45282c = i11;
        this.f161a = null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m5727a() {
        if (m5738b()) {
            this.f45283d = 0;
            return 0;
        }
        int d11 = d();
        this.f45283d = d11;
        if (d11 != 0) {
            return d11;
        }
        throw d.d();
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m5737b() {
        return m5739c();
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m5739c() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((a() & 128) == 0) {
                return j11;
            }
        }
        throw d.c();
    }

    /* renamed from: d, reason: collision with other method in class */
    public long m5740d() {
        return ((a() & 255) << 8) | (a() & 255) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
    }

    private void b() {
        int i11 = this.f45280a + this.f45281b;
        this.f45280a = i11;
        int i12 = this.f45284e + i11;
        int i13 = this.f45285f;
        if (i12 <= i13) {
            this.f45281b = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f45281b = i14;
        this.f45280a = i11 - i14;
    }

    public int a(int i11) {
        if (i11 < 0) {
            throw d.b();
        }
        int i12 = i11 + this.f45284e + this.f45282c;
        int i13 = this.f45285f;
        if (i12 > i13) {
            throw d.a();
        }
        this.f45285f = i12;
        b();
        return i13;
    }

    public void c(int i11) {
        if (i11 < 0) {
            throw d.b();
        }
        int i12 = this.f45284e;
        int i13 = this.f45282c;
        int i14 = i12 + i13 + i11;
        int i15 = this.f45285f;
        if (i14 > i15) {
            c((i15 - i12) - i13);
            throw d.a();
        }
        int i16 = this.f45280a;
        if (i11 <= i16 - i13) {
            this.f45282c = i13 + i11;
            return;
        }
        int i17 = i16 - i13;
        this.f45284e = i12 + i16;
        this.f45282c = 0;
        this.f45280a = 0;
        while (i17 < i11) {
            InputStream inputStream = this.f161a;
            int skip = inputStream == null ? -1 : (int) inputStream.skip(i11 - i17);
            if (skip <= 0) {
                throw d.a();
            }
            i17 += skip;
            this.f45284e += skip;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m5728a() {
        return m5739c();
    }

    public void b(int i11) {
        this.f45285f = i11;
        b();
    }

    /* renamed from: a, reason: collision with other method in class */
    public a m5729a() {
        int d11 = d();
        int i11 = this.f45280a;
        int i12 = this.f45282c;
        if (d11 > i11 - i12 || d11 <= 0) {
            return a.a(m5735a(d11));
        }
        a a11 = a.a(this.f162a, i12, d11);
        this.f45282c += d11;
        return a11;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m5738b() {
        return this.f45282c == this.f45280a && !a(false);
    }

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i11, int i12) {
        return new b(bArr, i11, i12);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5730a() {
        int d11 = d();
        int i11 = this.f45280a;
        int i12 = this.f45282c;
        if (d11 > i11 - i12 || d11 <= 0) {
            return new String(m5735a(d11), "UTF-8");
        }
        String str = new String(this.f162a, i12, d11, "UTF-8");
        this.f45282c += d11;
        return str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5731a() {
        int m5727a;
        do {
            m5727a = m5727a();
            if (m5727a == 0) {
                return;
            }
        } while (m5734a(m5727a));
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5732a(int i11) {
        if (this.f45283d != i11) {
            throw d.e();
        }
    }

    public void a(e eVar) {
        int d11 = d();
        if (this.f45286g >= this.f45287h) {
            throw d.g();
        }
        int a11 = a(d11);
        this.f45286g++;
        eVar.a(this);
        m5732a(0);
        this.f45286g--;
        b(a11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5733a() {
        return d() != 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5734a(int i11) {
        int a11 = f.a(i11);
        if (a11 == 0) {
            m5736b();
            return true;
        }
        if (a11 == 1) {
            m5740d();
            return true;
        }
        if (a11 == 2) {
            c(d());
            return true;
        }
        if (a11 == 3) {
            m5731a();
            m5732a(f.a(f.b(i11), 4));
            return true;
        }
        if (a11 == 4) {
            return false;
        }
        if (a11 != 5) {
            throw d.f();
        }
        e();
        return true;
    }

    private boolean a(boolean z11) {
        int i11 = this.f45282c;
        int i12 = this.f45280a;
        if (i11 < i12) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i13 = this.f45284e;
        if (i13 + i12 == this.f45285f) {
            if (z11) {
                throw d.a();
            }
            return false;
        }
        this.f45284e = i13 + i12;
        this.f45282c = 0;
        InputStream inputStream = this.f161a;
        int read = inputStream == null ? -1 : inputStream.read(this.f162a);
        this.f45280a = read;
        if (read == 0 || read < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f45280a + "\nThe InputStream implementation is buggy.");
        }
        if (read == -1) {
            this.f45280a = 0;
            if (z11) {
                throw d.a();
            }
            return false;
        }
        b();
        int i14 = this.f45284e + this.f45280a + this.f45281b;
        if (i14 > this.f45288i || i14 < 0) {
            throw d.h();
        }
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m5735a(int i11) {
        if (i11 < 0) {
            throw d.b();
        }
        int i12 = this.f45284e;
        int i13 = this.f45282c;
        int i14 = i12 + i13 + i11;
        int i15 = this.f45285f;
        if (i14 > i15) {
            c((i15 - i12) - i13);
            throw d.a();
        }
        int i16 = this.f45280a;
        if (i11 <= i16 - i13) {
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f162a, i13, bArr, 0, i11);
            this.f45282c += i11;
            return bArr;
        }
        if (i11 >= 4096) {
            this.f45284e = i12 + i16;
            this.f45282c = 0;
            this.f45280a = 0;
            int i17 = i16 - i13;
            int i18 = i11 - i17;
            Vector vector = new Vector();
            while (i18 > 0) {
                int min = Math.min(i18, 4096);
                byte[] bArr2 = new byte[min];
                int i19 = 0;
                while (i19 < min) {
                    InputStream inputStream = this.f161a;
                    int read = inputStream == null ? -1 : inputStream.read(bArr2, i19, min - i19);
                    if (read == -1) {
                        throw d.a();
                    }
                    this.f45284e += read;
                    i19 += read;
                }
                i18 -= min;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i11];
            System.arraycopy(this.f162a, i13, bArr3, 0, i17);
            for (int i21 = 0; i21 < vector.size(); i21++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i21);
                System.arraycopy(bArr4, 0, bArr3, i17, bArr4.length);
                i17 += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i11];
        int i22 = i16 - i13;
        System.arraycopy(this.f162a, i13, bArr5, 0, i22);
        this.f45282c = this.f45280a;
        while (true) {
            a(true);
            int i23 = i11 - i22;
            int i24 = this.f45280a;
            if (i23 <= i24) {
                System.arraycopy(this.f162a, 0, bArr5, i22, i23);
                this.f45282c = i23;
                return bArr5;
            }
            System.arraycopy(this.f162a, 0, bArr5, i22, i24);
            int i25 = this.f45280a;
            i22 += i25;
            this.f45282c = i25;
        }
    }
}
