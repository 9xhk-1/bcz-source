package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38465a = 96;

    /* renamed from: b, reason: collision with root package name */
    public String f38466b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f38467c;

    /* renamed from: d, reason: collision with root package name */
    private byte f38468d;

    /* renamed from: e, reason: collision with root package name */
    private String f38469e;

    public g() {
        this.f38438m = 96;
        this.f38439n = (byte) 4;
        this.f38440o = (byte) (this.f38440o | 16);
    }

    private static String a(byte[] bArr, int i11, int i12) {
        try {
            return new String(bArr, i11, i12, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        byte[] bytes = this.f38466b.getBytes();
        byte[] b11 = com.igexin.push.g.g.b(com.igexin.c.a.b.g.b((int) (System.currentTimeMillis() / 1000)));
        byte[] b12 = com.igexin.push.g.g.b();
        byte[] bArr = new byte[bytes.length + 4 + b12.length + 1 + b11.length];
        bArr[0] = 0;
        bArr[1] = (byte) bytes.length;
        int a11 = com.igexin.c.a.b.g.a(bytes, bArr, 2, bytes.length) + 2;
        int b13 = a11 + com.igexin.c.a.b.g.b((short) b12.length, bArr, a11);
        int a12 = b13 + com.igexin.c.a.b.g.a(b12, bArr, b13, b12.length);
        bArr[a12] = (byte) b11.length;
        com.igexin.c.a.b.g.a(b11, bArr, a12 + 1, b11.length);
        return bArr;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        try {
            this.f38468d = bArr[0];
            int i11 = bArr[1] & 255;
            this.f38466b = a(bArr, 2, i11);
            int i12 = i11 + 2;
            int i13 = i11 + 3;
            int i14 = bArr[i12] & 255;
            byte[] bArr2 = new byte[i14];
            this.f38467c = bArr2;
            System.arraycopy(bArr, i13, bArr2, 0, i14);
            int i15 = i13 + i14;
            this.f38469e = a(bArr, i15 + 1, bArr[i15] & 255);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }
}
