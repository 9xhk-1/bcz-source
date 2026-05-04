package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38441a = 6;

    /* renamed from: b, reason: collision with root package name */
    String f38442b;

    /* renamed from: c, reason: collision with root package name */
    String f38443c;

    /* renamed from: d, reason: collision with root package name */
    String f38444d;

    /* renamed from: e, reason: collision with root package name */
    String f38445e;

    public d() {
        this.f38438m = 6;
        this.f38439n = (byte) 20;
        this.f38442b = "";
        this.f38443c = "";
        this.f38444d = "";
        this.f38445e = "";
    }

    private String d() {
        return this.f38444d;
    }

    @Override // com.igexin.push.d.c.c, com.igexin.c.a.d.a.a
    public final void a() {
        this.f38442b = null;
        this.f38443c = null;
        this.f38444d = null;
        this.f38445e = null;
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        byte[] bytes = this.f38443c.getBytes();
        byte[] bytes2 = this.f38442b.getBytes();
        byte[] bytes3 = this.f38444d.getBytes();
        byte[] bytes4 = this.f38445e.getBytes();
        byte[] bArr = new byte[bytes.length + bytes2.length + bytes3.length + bytes4.length + 4];
        bArr[0] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        int length = bytes.length;
        int i11 = length + 1;
        int i12 = length + 2;
        bArr[i11] = (byte) bytes2.length;
        System.arraycopy(bytes2, 0, bArr, i12, bytes2.length);
        int length2 = i12 + bytes2.length;
        int i13 = length2 + 1;
        bArr[length2] = (byte) bytes3.length;
        System.arraycopy(bytes3, 0, bArr, i13, bytes3.length);
        int length3 = i13 + bytes3.length;
        bArr[length3] = (byte) bytes4.length;
        System.arraycopy(bytes4, 0, bArr, length3 + 1, bytes4.length);
        return bArr;
    }

    public d(String str, String str2, String str3, String str4) {
        this.f38438m = 6;
        this.f38439n = (byte) 20;
        this.f38442b = str == null ? "" : str;
        this.f38443c = str2 == null ? "" : str2;
        this.f38444d = str3 == null ? "" : str3;
        this.f38445e = str4 == null ? "" : str4;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        try {
            int i11 = bArr[0] & 255;
            this.f38442b = new String(bArr, 1, i11, "utf-8");
            int i12 = bArr[i11 + 1] & 255;
            int i13 = i11 + 2;
            this.f38443c = new String(bArr, i13, i12, "utf-8");
            int i14 = i13 + i12;
            int i15 = bArr[i14] & 255;
            int i16 = i14 + 1;
            this.f38444d = new String(bArr, i16, i15, "utf-8");
            int i17 = i16 + i15;
            this.f38445e = new String(bArr, i17 + 1, bArr[i17] & 255, "utf-8");
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }
}
