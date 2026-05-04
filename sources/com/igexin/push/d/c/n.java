package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public class n extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38495a = 26;

    /* renamed from: j, reason: collision with root package name */
    private static final String f38496j = "com.igexin.push.d.c.n";

    /* renamed from: b, reason: collision with root package name */
    public int f38497b;

    /* renamed from: c, reason: collision with root package name */
    public int f38498c;

    /* renamed from: d, reason: collision with root package name */
    public long f38499d;

    /* renamed from: e, reason: collision with root package name */
    public String f38500e;

    /* renamed from: f, reason: collision with root package name */
    public Object f38501f;

    /* renamed from: g, reason: collision with root package name */
    public Object f38502g;

    /* renamed from: h, reason: collision with root package name */
    public String f38503h;

    /* renamed from: i, reason: collision with root package name */
    public String f38504i = "UTF-8";

    public n() {
        this.f38438m = 26;
    }

    private boolean e() {
        return this.f38498c == 64;
    }

    private boolean f() {
        return this.f38498c == 192;
    }

    private void g() {
        this.f38498c = 128;
    }

    private void h() {
        this.f38498c = 64;
    }

    private void i() {
        this.f38498c = 192;
    }

    @Override // com.igexin.push.d.c.c, com.igexin.c.a.d.a.a
    public final void a() {
        this.f38500e = null;
        this.f38502g = null;
        this.f38501f = null;
        this.f38504i = null;
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        byte[] bArr = null;
        try {
            byte[] bytes = this.f38500e.getBytes(this.f38504i);
            byte[] bytes2 = this.f38503h.getBytes(this.f38504i);
            byte[] bytes3 = !"".equals(this.f38501f) ? this.f38498c == 192 ? (byte[]) this.f38501f : ((String) this.f38501f).getBytes(this.f38504i) : null;
            Object obj = this.f38502g;
            byte[] bArr2 = obj != null ? (byte[]) obj : null;
            int length = bytes3 == null ? 0 : bytes3.length;
            int length2 = bArr2 == null ? 0 : bArr2.length;
            byte[] a11 = com.igexin.c.a.b.g.a(length);
            byte[] a12 = com.igexin.c.a.b.g.a(length2);
            bArr = new byte[bytes.length + 13 + a11.length + length + a12.length + length2 + bytes2.length];
            com.igexin.c.a.b.g.b(this.f38497b, bArr, 0);
            bArr[2] = (byte) (this.f38498c | c.a(this.f38504i));
            com.igexin.c.a.b.g.a(this.f38499d, bArr, 3);
            bArr[11] = (byte) bytes.length;
            int a13 = com.igexin.c.a.b.g.a(bytes, bArr, 12, bytes.length) + 12;
            int a14 = a13 + com.igexin.c.a.b.g.a(a11, bArr, a13, a11.length);
            if (length > 0) {
                a14 += com.igexin.c.a.b.g.a(bytes3, bArr, a14, length);
            }
            int a15 = a14 + com.igexin.c.a.b.g.a(a12, bArr, a14, a12.length);
            if (length2 > 0) {
                a15 += com.igexin.c.a.b.g.a(bArr2, bArr, a15, length2);
            }
            bArr[a15] = (byte) bytes2.length;
            com.igexin.c.a.b.g.a(bytes2, bArr, a15 + 1, bytes2.length);
            return bArr;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return bArr;
        }
    }

    public final boolean d() {
        return this.f38498c == 128;
    }

    public String toString() {
        return "{\"msgID\":" + this.f38497b + ", \"msgType\":" + this.f38498c + ", \"msgDate\":" + this.f38499d + ", \"msgAddress\":\"" + this.f38500e + "\", \"msgContent\":" + this.f38501f + ", \"msgExtra\":" + this.f38502g + ", \"msgCID\":\"" + this.f38503h + "\", \"charset\":\"" + this.f38504i + "\", \"command\":" + this.f38438m + ", \"property\":" + ((int) this.f38439n) + ", \"expandProperty\":" + ((int) this.f38440o) + ", \"tag\":\"" + this.f37208y + '\"' + l50.b.f69928j;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        int i11;
        int i12;
        this.f38497b = com.igexin.c.a.b.g.b(bArr, 0);
        byte b11 = bArr[2];
        this.f38498c = b11 & com.baicizhan.main.vld.bonding.j.f25378c;
        this.f38504i = c.a(b11);
        this.f38499d = com.igexin.c.a.b.g.d(bArr, 3);
        int i13 = bArr[11] & 255;
        try {
            this.f38500e = new String(bArr, 12, i13, this.f38504i);
        } catch (Exception e11) {
            this.f38500e = "";
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
            if (this.f38498c == 192) {
                byte[] bArr2 = new byte[i11];
                this.f38501f = bArr2;
                System.arraycopy(bArr, i17, bArr2, 0, i11);
            } else {
                try {
                    this.f38501f = new String(bArr, i17, i11, this.f38504i);
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
            this.f38502g = bArr3;
            System.arraycopy(bArr, i22, bArr3, 0, i12);
        }
        int i23 = i22 + i12;
        if (bArr.length > i23) {
            try {
                this.f38503h = new String(bArr, i23 + 1, bArr[i23] & 255, this.f38504i);
            } catch (Exception e13) {
                com.igexin.c.a.c.a.a(e13);
            }
        }
    }
}
