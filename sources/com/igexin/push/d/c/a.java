package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f38406a;

    /* renamed from: b, reason: collision with root package name */
    public byte f38407b;

    /* renamed from: c, reason: collision with root package name */
    public byte f38408c;

    /* renamed from: d, reason: collision with root package name */
    public byte f38409d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f38410e;

    /* renamed from: f, reason: collision with root package name */
    public int f38411f;

    /* renamed from: g, reason: collision with root package name */
    public byte f38412g;

    public final void a(byte[] bArr) {
        int length;
        if (bArr == null) {
            length = 0;
        } else {
            this.f38410e = bArr;
            length = bArr.length;
        }
        this.f38406a = length;
    }

    private byte[] a() {
        if (this.f38410e == null) {
            return null;
        }
        byte[] bArr = new byte[this.f38406a + 11];
        com.igexin.c.a.b.g.a(com.igexin.push.g.g.e(), bArr, 0);
        com.igexin.c.a.b.g.a((int) (System.currentTimeMillis() / 1000), bArr, 4);
        com.igexin.c.a.b.g.b(this.f38406a, bArr, 8);
        bArr[10] = this.f38407b;
        byte[] bArr2 = this.f38410e;
        com.igexin.c.a.b.g.a(bArr2, bArr, 11, bArr2.length);
        return bArr;
    }
}
