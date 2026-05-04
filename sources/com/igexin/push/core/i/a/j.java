package com.igexin.push.core.i.a;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    static final int f38265a = 2;

    /* renamed from: b, reason: collision with root package name */
    static final int f38266b = 10;

    /* renamed from: e, reason: collision with root package name */
    private static final String f38267e = "GifHeaderParser";

    /* renamed from: f, reason: collision with root package name */
    private static final int f38268f = 255;

    /* renamed from: g, reason: collision with root package name */
    private static final int f38269g = 44;

    /* renamed from: h, reason: collision with root package name */
    private static final int f38270h = 33;

    /* renamed from: i, reason: collision with root package name */
    private static final int f38271i = 59;

    /* renamed from: j, reason: collision with root package name */
    private static final int f38272j = 249;

    /* renamed from: k, reason: collision with root package name */
    private static final int f38273k = 255;

    /* renamed from: l, reason: collision with root package name */
    private static final int f38274l = 254;

    /* renamed from: m, reason: collision with root package name */
    private static final int f38275m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f38276n = 28;

    /* renamed from: o, reason: collision with root package name */
    private static final int f38277o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f38278p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f38279q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final int f38280r = 64;

    /* renamed from: s, reason: collision with root package name */
    private static final int f38281s = 7;

    /* renamed from: t, reason: collision with root package name */
    private static final int f38282t = 128;

    /* renamed from: u, reason: collision with root package name */
    private static final int f38283u = 7;

    /* renamed from: v, reason: collision with root package name */
    private static final int f38284v = 256;

    /* renamed from: c, reason: collision with root package name */
    ByteBuffer f38285c;

    /* renamed from: d, reason: collision with root package name */
    i f38286d;

    /* renamed from: w, reason: collision with root package name */
    private final byte[] f38287w = new byte[256];

    /* renamed from: x, reason: collision with root package name */
    private int f38288x = 0;

    private void c() {
        this.f38285c = null;
        Arrays.fill(this.f38287w, (byte) 0);
        this.f38286d = new i();
        this.f38288x = 0;
    }

    private boolean d() {
        i();
        if (!p()) {
            a(2);
        }
        return this.f38286d.f38254e > 1;
    }

    private void e() {
        a(Integer.MAX_VALUE);
    }

    private void f() {
        n();
        int n11 = n();
        g gVar = this.f38286d.f38255f;
        int i11 = (n11 & 28) >> 2;
        gVar.f38223k = i11;
        if (i11 == 0) {
            gVar.f38223k = 1;
        }
        gVar.f38222j = (n11 & 1) != 0;
        short s11 = this.f38285c.getShort();
        if (s11 < 2) {
            s11 = 10;
        }
        g gVar2 = this.f38286d.f38255f;
        gVar2.f38225m = s11 * 10;
        gVar2.f38224l = n();
        n();
    }

    private void g() {
        this.f38286d.f38255f.f38217e = this.f38285c.getShort();
        this.f38286d.f38255f.f38218f = this.f38285c.getShort();
        this.f38286d.f38255f.f38219g = this.f38285c.getShort();
        this.f38286d.f38255f.f38220h = this.f38285c.getShort();
        int n11 = n();
        boolean z11 = (n11 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (n11 & 7) + 1);
        g gVar = this.f38286d.f38255f;
        gVar.f38221i = (n11 & 64) != 0;
        if (z11) {
            gVar.f38227o = b(pow);
        } else {
            gVar.f38227o = null;
        }
        this.f38286d.f38255f.f38226n = this.f38285c.position();
        k();
        if (p()) {
            return;
        }
        i iVar = this.f38286d;
        iVar.f38254e++;
        iVar.f38256g.add(iVar.f38255f);
    }

    private void h() {
        do {
            m();
            byte[] bArr = this.f38287w;
            if (bArr[0] == 1) {
                this.f38286d.f38264o = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f38288x <= 0) {
                return;
            }
        } while (!p());
    }

    private void i() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) n());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f38286d.f38253d = 1;
            return;
        }
        j();
        if (!this.f38286d.f38259j || p()) {
            return;
        }
        i iVar = this.f38286d;
        iVar.f38252c = b(iVar.f38260k);
        i iVar2 = this.f38286d;
        iVar2.f38263n = iVar2.f38252c[iVar2.f38261l];
    }

    private void j() {
        this.f38286d.f38257h = this.f38285c.getShort();
        this.f38286d.f38258i = this.f38285c.getShort();
        int n11 = n();
        i iVar = this.f38286d;
        iVar.f38259j = (n11 & 128) != 0;
        iVar.f38260k = (int) Math.pow(2.0d, (n11 & 7) + 1);
        this.f38286d.f38261l = n();
        this.f38286d.f38262m = n();
    }

    private void k() {
        n();
        l();
    }

    private void l() {
        int n11;
        do {
            n11 = n();
            this.f38285c.position(Math.min(this.f38285c.position() + n11, this.f38285c.limit()));
        } while (n11 > 0);
    }

    private void m() {
        int n11 = n();
        this.f38288x = n11;
        if (n11 <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                i12 = this.f38288x;
                if (i11 >= i12) {
                    return;
                }
                i12 -= i11;
                this.f38285c.get(this.f38287w, i11, i12);
                i11 += i12;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.b("GifHeaderParser", "Error Reading Block n: " + i11 + " count: " + i12 + " blockSize: " + this.f38288x + e11.getMessage());
                this.f38286d.f38253d = 1;
                return;
            }
        }
    }

    private int n() {
        try {
            return this.f38285c.get() & 255;
        } catch (Exception unused) {
            this.f38286d.f38253d = 1;
            return 0;
        }
    }

    private int o() {
        return this.f38285c.getShort();
    }

    private boolean p() {
        return this.f38286d.f38253d != 0;
    }

    public final j a(ByteBuffer byteBuffer) {
        c();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f38285c = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f38285c.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final i b() {
        if (this.f38285c == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (p()) {
            return this.f38286d;
        }
        i();
        if (!p()) {
            e();
            i iVar = this.f38286d;
            if (iVar.f38254e < 0) {
                iVar.f38253d = 1;
            }
        }
        return this.f38286d;
    }

    private j a(byte[] bArr) {
        if (bArr != null) {
            a(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f38285c = null;
        this.f38286d.f38253d = 2;
        return this;
    }

    private int[] b(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f38285c.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException e11) {
            com.igexin.c.a.c.a.b("GifHeaderParser", "Format Error Reading Color Table " + e11.getMessage());
            this.f38286d.f38253d = 1;
            return iArr;
        }
    }

    public final void a() {
        this.f38285c = null;
        this.f38286d = null;
    }

    private void a(int i11) {
        boolean z11 = false;
        while (!z11 && !p() && this.f38286d.f38254e <= i11) {
            int n11 = n();
            if (n11 == 33) {
                int n12 = n();
                if (n12 != 1) {
                    if (n12 == 249) {
                        this.f38286d.f38255f = new g();
                        f();
                    } else if (n12 != 254 && n12 == 255) {
                        m();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 0; i12 < 11; i12++) {
                            sb2.append((char) this.f38287w[i12]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            h();
                        }
                    }
                }
                l();
            } else if (n11 == 44) {
                i iVar = this.f38286d;
                if (iVar.f38255f == null) {
                    iVar.f38255f = new g();
                }
                g();
            } else if (n11 != 59) {
                this.f38286d.f38253d = 1;
            } else {
                z11 = true;
            }
        }
    }
}
