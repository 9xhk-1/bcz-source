package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class k extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38481a = 5;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38482b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38483c;

    /* renamed from: d, reason: collision with root package name */
    public String f38484d;

    /* renamed from: e, reason: collision with root package name */
    public String f38485e;

    /* renamed from: f, reason: collision with root package name */
    public long f38486f;

    public k() {
        this.f38438m = 5;
    }

    @Override // com.igexin.push.d.c.c, com.igexin.c.a.d.a.a
    public final void a() {
        this.f38485e = null;
        this.f38484d = null;
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        int i11;
        int i12;
        byte b11 = this.f38482b ? (byte) 64 : (byte) 0;
        int i13 = 1;
        byte[] bArr = null;
        if (this.f38483c) {
            byte b12 = (byte) (b11 | 128);
            try {
                bArr = this.f38485e.getBytes(this.f38484d);
                i11 = bArr.length;
                i12 = i11 + 3;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                i12 = 3;
                i11 = 0;
            }
            b11 = (byte) (b12 | c.a(this.f38484d));
        } else {
            i11 = 0;
            i12 = 1;
        }
        byte[] bArr2 = new byte[i12 + 8];
        bArr2[0] = b11;
        if (this.f38483c) {
            i13 = com.igexin.c.a.b.g.b(i11, bArr2, 1);
            if (bArr != null) {
                i13 = com.igexin.c.a.b.g.a(bArr, bArr2, 2, i11) + 2;
            }
        }
        com.igexin.c.a.b.g.a(this.f38486f, bArr2, i13);
        return bArr2;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        byte b11 = bArr[0];
        int i11 = 1;
        this.f38482b = (b11 & 64) != 0;
        boolean z11 = (b11 & 128) != 0;
        this.f38483c = z11;
        if (z11) {
            this.f38484d = c.a(b11);
            int b12 = com.igexin.c.a.b.g.b(bArr, 1);
            i11 = b12 + 3;
            try {
                this.f38485e = new String(bArr, 3, b12, this.f38484d);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
        if (bArr.length > i11) {
            this.f38486f = com.igexin.c.a.b.g.d(bArr, i11);
            com.igexin.c.a.c.a.a("LoginResult|session = " + this.f38486f, new Object[0]);
        }
    }
}
