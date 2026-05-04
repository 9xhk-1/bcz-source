package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38416a = 25;

    /* renamed from: b, reason: collision with root package name */
    public int f38417b;

    /* renamed from: c, reason: collision with root package name */
    public int f38418c;

    /* renamed from: d, reason: collision with root package name */
    public long f38419d;

    /* renamed from: e, reason: collision with root package name */
    public String f38420e;

    /* renamed from: f, reason: collision with root package name */
    public Object f38421f;

    /* renamed from: g, reason: collision with root package name */
    public Object f38422g;

    /* renamed from: h, reason: collision with root package name */
    public String f38423h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f38424i = "UTF-8";

    /* renamed from: j, reason: collision with root package name */
    public String f38425j = "none";

    /* renamed from: k, reason: collision with root package name */
    public String f38426k = "none";

    /* renamed from: l, reason: collision with root package name */
    public String f38427l = "none";

    public b() {
        this.f38438m = 25;
        this.f38439n = (byte) 20;
    }

    private boolean d() {
        return this.f38418c == 128;
    }

    private boolean e() {
        return this.f38418c == 64;
    }

    private boolean f() {
        return this.f38418c == 192;
    }

    private void g() {
        this.f38418c = 128;
    }

    private void h() {
        this.f38418c = 64;
    }

    private void i() {
        this.f38418c = 192;
    }

    @Override // com.igexin.push.d.c.c, com.igexin.c.a.d.a.a
    public final void a() {
        this.f38420e = null;
        this.f38421f = null;
        this.f38422g = null;
        this.f38424i = null;
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        byte[] bArr = null;
        try {
            byte[] bytes = this.f38420e.getBytes(this.f38424i);
            byte[] bytes2 = !"".equals(this.f38421f) ? this.f38418c == 192 ? (byte[]) this.f38421f : ((String) this.f38421f).getBytes(this.f38424i) : null;
            Object obj = this.f38422g;
            byte[] bArr2 = obj != null ? (byte[]) obj : null;
            byte[] bytes3 = this.f38423h.getBytes(this.f38424i);
            int length = bytes2 == null ? 0 : bytes2.length;
            int length2 = bArr2 == null ? 0 : bArr2.length;
            byte[] a11 = com.igexin.c.a.b.g.a(length);
            byte[] a12 = com.igexin.c.a.b.g.a(length2);
            bArr = new byte[bytes.length + 13 + a11.length + length + a12.length + length2 + bytes3.length];
            com.igexin.c.a.b.g.b(this.f38417b, bArr, 0);
            bArr[2] = (byte) (this.f38418c | c.a(this.f38424i));
            com.igexin.c.a.b.g.a(this.f38419d, bArr, 3);
            bArr[11] = (byte) bytes.length;
            int a13 = com.igexin.c.a.b.g.a(bytes, bArr, 12, bytes.length) + 12;
            int a14 = a13 + com.igexin.c.a.b.g.a(a11, bArr, a13, a11.length);
            if (length > 0) {
                a14 += com.igexin.c.a.b.g.a(bytes2, bArr, a14, length);
            }
            int a15 = a14 + com.igexin.c.a.b.g.a(a12, bArr, a14, a12.length);
            if (length2 > 0) {
                a15 += com.igexin.c.a.b.g.a(bArr2, bArr, a15, length2);
            }
            bArr[a15] = (byte) bytes3.length;
            com.igexin.c.a.b.g.a(bytes3, bArr, a15 + 1, bytes3.length);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        if (bArr != null && bArr.length >= com.igexin.push.config.d.O) {
            this.f38439n = (byte) (this.f38439n | 128);
        }
        return bArr;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        int i11;
        int i12;
        this.f38417b = com.igexin.c.a.b.g.b(bArr, 0);
        byte b11 = bArr[2];
        this.f38418c = b11 & com.baicizhan.main.vld.bonding.j.f25378c;
        this.f38424i = c.a(b11);
        this.f38419d = com.igexin.c.a.b.g.d(bArr, 3);
        int i13 = bArr[11] & 255;
        try {
            this.f38420e = new String(bArr, 12, i13, this.f38424i);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        int i14 = i13 + 12;
        int i15 = 0;
        while (true) {
            int i16 = bArr[i14];
            i11 = i15 | (i16 & 127);
            if ((i16 & 128) == 0) {
                break;
            }
            i15 = i11 << 7;
            i14++;
        }
        int i17 = i14 + 1;
        if (i11 > 0) {
            if (this.f38418c == 192) {
                byte[] bArr2 = new byte[i11];
                this.f38421f = bArr2;
                System.arraycopy(bArr, i17, bArr2, 0, i11);
            } else {
                try {
                    this.f38421f = new String(bArr, i17, i11, this.f38424i);
                } catch (Exception e12) {
                    com.igexin.c.a.c.a.a(e12);
                }
            }
        }
        int i18 = i17 + i11;
        int i19 = 0;
        while (true) {
            int i21 = bArr[i18];
            i12 = i19 | (i21 & 127);
            if ((i21 & 128) == 0) {
                break;
            }
            i19 = i12 << 7;
            i18++;
        }
        int i22 = i18 + 1;
        if (i12 > 0) {
            byte[] bArr3 = new byte[i12];
            this.f38422g = bArr3;
            System.arraycopy(bArr, i22, bArr3, 0, i12);
        }
        int i23 = i22 + i12;
        if (bArr.length > i23) {
            try {
                this.f38423h = new String(bArr, i23 + 1, bArr[i23] & 255, this.f38424i);
            } catch (Exception e13) {
                com.igexin.c.a.c.a.a(e13);
            }
        }
    }
}
